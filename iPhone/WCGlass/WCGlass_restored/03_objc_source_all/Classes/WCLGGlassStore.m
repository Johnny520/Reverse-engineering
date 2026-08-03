#import "WCLGGlassStore.h"

/*
 * 这是依据 Objective-C runtime 元数据恢复的可读接口骨架。
 * 每个方法均保留原始 IMP 地址；精确指令位于 04_exact_arm64_assembly。
 */

@implementation WCLGGlassStore

+ (id)shared
{
    // 原始 IMP: 0x2EE5A4; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void *)apiPubKey
{
    // 原始 IMP: 0x2EE608; ObjC type encoding: ^{__SecKey=}16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void *)signPubKey
{
    // 原始 IMP: 0x2F01A0; ObjC type encoding: ^{__SecKey=}16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (id)currentWXID
{
    // 原始 IMP: 0x2F1934; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (id)buildRequest:(id)arg0 requestKey:(id)arg1 nonce:(id)arg2
{
    // 原始 IMP: 0x2F198C; ObjC type encoding: @40@0:8@16^@24^@32
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (id)decryptResponse:(id)arg0 requestKey:(id)arg1 nonce:(id)arg2
{
    // 原始 IMP: 0x2F3140; ObjC type encoding: @40@0:8@16@24@32
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)postPath:(id)arg0 payload:(id)arg1 completion:(id)arg2
{
    // 原始 IMP: 0x2F45B4; ObjC type encoding: v40@0:8@16@24@?32
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (id)themeFromDict:(id)arg0
{
    // 原始 IMP: 0x2F52D8; ObjC type encoding: @24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)fetchCatalogWithCompletion:(id)arg0
{
    // 原始 IMP: 0x2F63FC; ObjC type encoding: v24@0:8@?16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)fetchCardPreviewHTMLForTheme:(id)arg0 completion:(id)arg1
{
    // 原始 IMP: 0x2F706C; ObjC type encoding: v32@0:8@16@?24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)downloadAndImportTheme:(id)arg0 completion:(id)arg1
{
    // 原始 IMP: 0x2F9210; ObjC type encoding: v32@0:8@16@?24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)downloadAndImportTheme:(id)arg0 progress:(id)arg1 completion:(id)arg2
{
    // 原始 IMP: 0x2F9224; ObjC type encoding: v40@0:8@16@?24@?32
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void *)glassSignKey
{
    // 原始 IMP: 0x2FA730; ObjC type encoding: ^{__SecKey=}16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (id)glassMasterKey
{
    // 原始 IMP: 0x2FA73C; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

- (void)revokeTheme:(id)arg0 completion:(id)arg1
{
    // 原始 IMP: 0x2FA94C; ObjC type encoding: v32@0:8q16@?24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)setApiPubKey:(id)arg0
{
    // 原始 IMP: 0x2FAEC0; ObjC type encoding: v24@0:8^{__SecKey=}16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

- (void)setSignPubKey:(id)arg0
{
    // 原始 IMP: 0x2FAEC8; ObjC type encoding: v24@0:8^{__SecKey=}16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

@end
