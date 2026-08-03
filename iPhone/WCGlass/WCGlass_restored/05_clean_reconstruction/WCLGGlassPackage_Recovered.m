#import <Foundation/Foundation.h>
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
