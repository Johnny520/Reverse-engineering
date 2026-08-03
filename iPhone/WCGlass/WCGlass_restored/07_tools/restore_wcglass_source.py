from pathlib import Path
import re
import shutil

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM

from wcglass_unpack import parse_fat


ROOT = Path('WCGlass_restored')
SRC = ROOT / '03_objc_source_all'
ASM = ROOT / '04_exact_arm64_assembly'
CLEAN = ROOT / '05_clean_reconstruction'
META = ROOT / '06_metadata'


def objc_return(types):
    if not types:
        return 'id'
    return {
        'v': 'void', '@': 'id', 'B': 'BOOL', 'c': 'BOOL',
        'q': 'NSInteger', 'Q': 'NSUInteger', 'i': 'int', 'I': 'unsigned int',
        's': 'short', 'S': 'unsigned short', 'l': 'long', 'L': 'unsigned long',
        'f': 'float', 'd': 'double', '#': 'Class', ':': 'SEL', '^': 'void *',
    }.get(types[0], 'id')


def method_decl(kind, method):
    name = method['name'] or ('sub_%X' % method['imp'])
    ret = objc_return(method['types'])
    if ':' not in name:
        return f"{kind} ({ret}){name}"
    parts = name.split(':')[:-1]
    chunks = []
    for index, part in enumerate(parts):
        prefix = part if index == 0 else ' ' + part
        chunks.append(f"{prefix}:(id)arg{index}")
    return f"{kind} ({ret})" + ''.join(chunks)


def default_return(ret):
    if ret == 'void':
        return ''
    if ret in ('float', 'double'):
        return '    return 0.0;\n'
    if ret in ('BOOL', 'NSInteger', 'NSUInteger', 'int', 'unsigned int', 'short',
               'unsigned short', 'long', 'unsigned long'):
        return '    return 0;\n'
    return '    return nil;\n'


def clean_name(value):
    return re.sub(r'[^A-Za-z0-9_.$-]', '_', value or 'Unknown')


def generate_objc_tree(image):
    classes_dir = SRC / 'Classes'
    classes_dir.mkdir(parents=True, exist_ok=True)
    index = ['# WCGlass Objective-C 类索引', '', f'共恢复 `{len(image.classes)}` 个实现类。', '']
    method_total = 0
    for cls in image.classes:
        cname = clean_name(cls['name'])
        methods = cls['methods']
        class_methods = cls['class_methods']
        method_total += len(methods) + len(class_methods)
        h = [
            '#import <Foundation/Foundation.h>',
            '#import <UIKit/UIKit.h>', '',
            f'@interface {cname} : NSObject',
        ]
        for m in class_methods:
            h.append(method_decl('+', m) + ';')
        for m in methods:
            h.append(method_decl('-', m) + ';')
        h.extend(['@end', ''])

        impl = [
            f'#import "{cname}.h"', '',
            '/*',
            ' * 这是依据 Objective-C runtime 元数据恢复的可读接口骨架。',
            ' * 每个方法均保留原始 IMP 地址；精确指令位于 04_exact_arm64_assembly。',
            ' */', '',
            f'@implementation {cname}', '',
        ]
        for kind, group in (('+', class_methods), ('-', methods)):
            for m in group:
                decl = method_decl(kind, m)
                ret = objc_return(m['types'])
                impl.extend([
                    decl, '{',
                    f"    // 原始 IMP: 0x{m['imp']:X}; ObjC type encoding: {m['types']}",
                    '    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。',
                ])
                body = default_return(ret)
                if body:
                    impl.append(body.rstrip())
                impl.extend(['}', ''])
        impl.extend(['@end', ''])
        (classes_dir / f'{cname}.h').write_text('\n'.join(h), encoding='utf-8')
        (classes_dir / f'{cname}.m').write_text('\n'.join(impl), encoding='utf-8')
        index.append(f"- `{cname}`：实例方法 {len(methods)} 个，类方法 {len(class_methods)} 个，类地址 `0x{cls['address']:X}`")

    (SRC / 'ClassIndex.md').write_text('\n'.join(index) + '\n', encoding='utf-8')
    (SRC / 'WCGlassRecovered.h').write_text(
        '\n'.join(f'#import "Classes/{clean_name(c["name"])}.h"' for c in image.classes) + '\n',
        encoding='utf-8')
    (SRC / 'README.md').write_text(f'''# Objective-C 可读源代码骨架

- 实现类：{len(image.classes)} 个
- 已恢复方法：{method_total} 个
- 来源：`WCGlass.dylib` 的 Objective-C runtime 元数据
- 每个方法保留原始 IMP 地址与类型编码。
- 精确行为对应 `../04_exact_arm64_assembly/Classes/*.s`。
- 加密与主题商店核心逻辑的人工清理版位于 `../05_clean_reconstruction/`。
''', encoding='utf-8')
    return method_total


def generate_exact_assembly(image):
    classes_dir = ASM / 'Classes'
    classes_dir.mkdir(parents=True, exist_ok=True)
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    for cls in image.classes:
        cname = clean_name(cls['name'])
        lines = [f'// Exact ARM64 listing for {cname}', '']
        for kind, group in (('+', cls['class_methods']), ('-', cls['methods'])):
            for m in group:
                start, end = image.function_bounds(m['imp'])
                lines.append(f"// {kind}[{cname} {m['name']}] IMP=0x{m['imp']:X} bounds=0x{start:X}-0x{end:X}")
                lines.append(f'loc_{start:X}:')
                for ins in md.disasm(image.data[start:end], start):
                    suffix = ''
                    if ins.mnemonic in ('bl', 'b'):
                        try:
                            target = int(ins.op_str.lstrip('#'), 0)
                            sym = image.stub_names.get(target)
                            if sym:
                                suffix = f' // {sym}'
                        except Exception:
                            pass
                    lines.append(f'    {ins.mnemonic:<8} {ins.op_str}{suffix}')
                lines.append('')
        (classes_dir / f'{cname}.s').write_text('\n'.join(lines), encoding='utf-8')

    # Cover every discovered internal function, including C helpers and hook trampolines.
    lines = ['// WCGlass.dylib complete ARM64 function listing', '']
    starts = image.function_starts
    for i, start in enumerate(starts):
        end = starts[i + 1] if i + 1 < len(starts) else min(start + 0x1000, image.size)
        if start >= image.size or end <= start:
            continue
        lines.append(f'// function 0x{start:X}-0x{end:X}')
        lines.append(f'sub_{start:X}:')
        for ins in md.disasm(image.data[start:end], start):
            suffix = ''
            if ins.mnemonic in ('bl', 'b'):
                try:
                    target = int(ins.op_str.lstrip('#'), 0)
                    sym = image.stub_names.get(target)
                    if sym:
                        suffix = f' // {sym}'
                except Exception:
                    pass
            lines.append(f'    {ins.mnemonic:<8} {ins.op_str}{suffix}')
        lines.append('')
    (ASM / 'AllFunctions_arm64.s').write_text('\n'.join(lines), encoding='utf-8')
    (ASM / 'README.md').write_text(f'''# ARM64 精确代码

- `AllFunctions_arm64.s`：覆盖 LC_FUNCTION_STARTS 中的 {len(starts)} 个函数。
- `Classes/`：按 Objective-C 类和选择器分组的精确 ARM64 指令。
- 导入调用已尽量标注为 `_objc_msgSend`、`_CCCrypt`、`_CCHmac` 等真实符号。
''', encoding='utf-8')


def generate_clean_crypto():
    CLEAN.mkdir(parents=True, exist_ok=True)
    (CLEAN / 'WCLGCryptoRecovered.h').write_text(r'''#import <Foundation/Foundation.h>
#import <Security/Security.h>

NS_ASSUME_NONNULL_BEGIN
NSData * _Nullable WCLGAES256CBC(NSData *data, NSData *key, NSData *iv, BOOL decrypt);
NSData *WCLGHMACSHA256(NSData *data, NSData *key);
NSData *WCLGSHA256(NSData *data);
BOOL WCLGVerifyRSAPSSSHA256(SecKeyRef publicKey, NSData *message, NSData *signature, NSError **error);
NSData * _Nullable WCLGEncryptRSAOAEP_SHA256(SecKeyRef publicKey, NSData *data, NSError **error);
NS_ASSUME_NONNULL_END
''', encoding='utf-8')
    (CLEAN / 'WCLGCryptoRecovered.m').write_text(r'''#import "WCLGCryptoRecovered.h"
#import <CommonCrypto/CommonCrypto.h>

NSData *WCLGAES256CBC(NSData *data, NSData *key, NSData *iv, BOOL decrypt) {
    if(data.length == 0 || key.length != kCCKeySizeAES256 || iv.length != kCCBlockSizeAES128) {
        return nil;
    }
    NSMutableData *output = [NSMutableData dataWithLength:data.length + kCCBlockSizeAES128];
    size_t moved = 0;
    CCCryptorStatus status = CCCrypt(decrypt ? kCCDecrypt : kCCEncrypt,
                                     kCCAlgorithmAES,
                                     kCCOptionPKCS7Padding,
                                     key.bytes, key.length,
                                     iv.bytes,
                                     data.bytes, data.length,
                                     output.mutableBytes, output.length,
                                     &moved);
    if(status != kCCSuccess) return nil;
    output.length = moved;
    return output;
}

NSData *WCLGHMACSHA256(NSData *data, NSData *key) {
    unsigned char digest[CC_SHA256_DIGEST_LENGTH] = {0};
    CCHmac(kCCHmacAlgSHA256, key.bytes, key.length, data.bytes, data.length, digest);
    return [NSData dataWithBytes:digest length:sizeof(digest)];
}

NSData *WCLGSHA256(NSData *data) {
    unsigned char digest[CC_SHA256_DIGEST_LENGTH] = {0};
    CC_SHA256(data.bytes, (CC_LONG)data.length, digest);
    return [NSData dataWithBytes:digest length:sizeof(digest)];
}

BOOL WCLGVerifyRSAPSSSHA256(SecKeyRef publicKey, NSData *message, NSData *signature, NSError **error) {
    if(!publicKey || !message || !signature) return NO;
    return SecKeyVerifySignature(publicKey,
                                 kSecKeyAlgorithmRSASignatureMessagePSSSHA256,
                                 (__bridge CFDataRef)message,
                                 (__bridge CFDataRef)signature,
                                 (CFErrorRef *)error);
}

NSData *WCLGEncryptRSAOAEP_SHA256(SecKeyRef publicKey, NSData *data, NSError **error) {
    if(!publicKey || !data) return nil;
    CFDataRef result = SecKeyCreateEncryptedData(publicKey,
                                                 kSecKeyAlgorithmRSAEncryptionOAEPSHA256,
                                                 (__bridge CFDataRef)data,
                                                 (CFErrorRef *)error);
    return CFBridgingRelease(result);
}
''', encoding='utf-8')

    (CLEAN / 'WCLGGlassPackage_Recovered.m').write_text(r'''#import <Foundation/Foundation.h>
#import <Security/Security.h>
#import "WCLGCryptoRecovered.h"

/*
 * 对 WCLGGlassPackage 核心流程的去混淆重建。
 * 原始入口：0x2E4DD8、0x2E5ECC、0x2E727C。
 */
@interface WCLGGlassPackageRecovered : NSObject
+ (NSData *)decryptContainer:(NSData *)container
                     themeId:(NSInteger)themeId
                        wxid:(NSString *)wxid
                     signKey:(SecKeyRef)signKey
                 glassMaster:(NSData *)glassMaster
                       error:(NSError **)error;
@end

@implementation WCLGGlassPackageRecovered
+ (NSData *)decryptContainer:(NSData *)container
                     themeId:(NSInteger)themeId
                        wxid:(NSString *)wxid
                     signKey:(SecKeyRef)signKey
                 glassMaster:(NSData *)glassMaster
                       error:(NSError **)error {
    if(container.length < 6 || wxid.length == 0 || glassMaster.length == 0 || !signKey) return nil;

    // 原实现：读取容器头、按头部长度切出 JSON 元数据和密文区。
    const uint8_t *bytes = container.bytes;
    uint32_t metadataLength = CFSwapInt32BigToHost(*(const uint32_t *)(bytes + 2));
    if((NSUInteger)metadataLength + 6 > container.length) return nil;
    NSData *metadataData = [container subdataWithRange:NSMakeRange(6, metadataLength)];
    NSDictionary *metadata = [NSJSONSerialization JSONObjectWithData:metadataData options:0 error:error];
    if(![metadata isKindOfClass:NSDictionary.class]) return nil;

    NSData *signature = [[NSData alloc] initWithBase64EncodedString:metadata[@"signature"] options:0];
    if(!WCLGVerifyRSAPSSSHA256(signKey, WCLGSHA256(metadataData), signature, error)) return nil;

    // 原实现把主题号、微信标识和 glassMaster 纳入 SHA-256 派生材料。
    NSMutableData *material = [NSMutableData dataWithData:glassMaster];
    [material appendData:[wxid dataUsingEncoding:NSUTF8StringEncoding]];
    NSString *themeText = [NSString stringWithFormat:@"%ld", (long)themeId];
    [material appendData:[themeText dataUsingEncoding:NSUTF8StringEncoding]];
    NSData *key = WCLGSHA256(material);                 // 32-byte AES key
    NSData *iv = [[NSData alloc] initWithBase64EncodedString:metadata[@"iv"] options:0];
    NSData *ciphertext = [container subdataWithRange:NSMakeRange(6 + metadataLength,
                                                                  container.length - 6 - metadataLength)];
    return WCLGAES256CBC(ciphertext, key, iv, YES);
}
@end
''', encoding='utf-8')

    (CLEAN / 'WCLGGlassStore_Recovered.m').write_text(r'''#import <Foundation/Foundation.h>
#import <Security/Security.h>
#import "WCLGCryptoRecovered.h"

/* 原始入口：buildRequest=0x2F198C，decryptResponse=0x2F3140。 */
NSDictionary *WCLGBuildEncryptedRequest(NSDictionary *payload, SecKeyRef apiPublicKey,
                                        NSData **requestKeyOut, NSData **nonceOut, NSError **error) {
    NSData *json = [NSJSONSerialization dataWithJSONObject:payload options:0 error:error];
    if(!json) return nil;
    NSMutableData *key = [NSMutableData dataWithLength:32];
    NSMutableData *nonce = [NSMutableData dataWithLength:16];
    SecRandomCopyBytes(kSecRandomDefault, key.length, key.mutableBytes);
    SecRandomCopyBytes(kSecRandomDefault, nonce.length, nonce.mutableBytes);
    NSData *ciphertext = WCLGAES256CBC(json, key, nonce, NO);
    NSData *wrappedKey = WCLGEncryptRSAOAEP_SHA256(apiPublicKey, key, error);
    NSData *mac = WCLGHMACSHA256(ciphertext, key);
    if(!ciphertext || !wrappedKey) return nil;
    if(requestKeyOut) *requestKeyOut = key;
    if(nonceOut) *nonceOut = nonce;
    return @{ @"data": [ciphertext base64EncodedStringWithOptions:0],
              @"key": [wrappedKey base64EncodedStringWithOptions:0],
              @"nonce": [nonce base64EncodedStringWithOptions:0],
              @"mac": [mac base64EncodedStringWithOptions:0] };
}

NSDictionary *WCLGDecryptEncryptedResponse(NSDictionary *response, NSData *requestKey,
                                           NSData *nonce, SecKeyRef signatureKey, NSError **error) {
    NSData *ciphertext = [[NSData alloc] initWithBase64EncodedString:response[@"data"] options:0];
    NSData *signature = [[NSData alloc] initWithBase64EncodedString:response[@"signature"] options:0];
    if(!WCLGVerifyRSAPSSSHA256(signatureKey, ciphertext, signature, error)) return nil;
    NSData *plain = WCLGAES256CBC(ciphertext, requestKey, nonce, YES);
    if(!plain) return nil;
    id object = [NSJSONSerialization JSONObjectWithData:plain options:0 error:error];
    return [object isKindOfClass:NSDictionary.class] ? object : nil;
}
''', encoding='utf-8')

    (CLEAN / 'README.md').write_text('''# 人工清理后的核心源代码

本目录把反汇编中确认的算法和关键业务入口重写成可直接阅读的 Objective-C：

- `WCLGCryptoRecovered.*`：AES-256-CBC、HMAC-SHA256、SHA-256、RSA OAEP/PSS。
- `WCLGGlassPackage_Recovered.m`：主题容器解析、验签、密钥派生和解密。
- `WCLGGlassStore_Recovered.m`：请求加密、响应验签与解密。

其中密码算法参数来自真实调用参数；容器字段命名是依据选择器、字符串和调用顺序恢复的语义名称。
''', encoding='utf-8')


def copy_metadata():
    META.mkdir(parents=True, exist_ok=True)
    for name in ('WCGlass_report.txt', 'WCGlass_symbols.txt', 'WCGlass_objc_interfaces.h',
                 'WCGlass_objc_strings.txt', 'WCGlass_sensitive_hits.txt',
                 'WCGlass_crypto_disassembly_arm64.txt', 'WCGlass_crypto_helpers_arm64.txt'):
        src = Path('WCGlass_output') / name
        if src.exists():
            shutil.copy2(src, META / name)


def main():
    data = Path('WCGlass.dylib').read_bytes()
    image = next(x for x in parse_fat(data) if x.arch == 'arm64')
    ROOT.mkdir(exist_ok=True)
    method_total = generate_objc_tree(image)
    generate_exact_assembly(image)
    generate_clean_crypto()
    copy_metadata()
    print('classes', len(image.classes), 'methods', method_total, 'functions', len(image.function_starts))


if __name__ == '__main__':
    main()
