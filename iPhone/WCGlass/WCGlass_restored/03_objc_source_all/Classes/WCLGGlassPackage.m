#import "WCLGGlassPackage.h"

/*
 * 这是依据 Objective-C runtime 元数据恢复的可读接口骨架。
 * 每个方法均保留原始 IMP 地址；精确指令位于 04_exact_arm64_assembly。
 */

@implementation WCLGGlassPackage

+ (id)supportDir
{
    // 原始 IMP: 0x2E2628; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)vaultDir
{
    // 原始 IMP: 0x2E282C; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)vaultPathForTheme:(id)arg0
{
    // 原始 IMP: 0x2E2990; ObjC type encoding: @24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)indexPath
{
    // 原始 IMP: 0x2E2AE4; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (void)performConfidentialityMigrationIfNeeded
{
    // 原始 IMP: 0x2E2C50; ObjC type encoding: v16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

+ (id)loadIndex
{
    // 原始 IMP: 0x2E4C10; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (void)saveIndex:(id)arg0
{
    // 原始 IMP: 0x2E4D54; ObjC type encoding: v24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

+ (id)decryptContainer:(id)arg0 themeId:(id)arg1 wxid:(id)arg2 signKey:(id)arg3 glassMaster:(id)arg4 error:(id)arg5
{
    // 原始 IMP: 0x2E4DD8; ObjC type encoding: @64@0:8@16q24@32^{__SecKey=}40@48^@56
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (BOOL)importGlassData:(id)arg0 wxid:(id)arg1 signKey:(id)arg2 glassMaster:(id)arg3 iconURL:(id)arg4 error:(id)arg5
{
    // 原始 IMP: 0x2E5ECC; ObjC type encoding: B64@0:8@16@24^{__SecKey=}32@40@48^@56
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return 0;
}

+ (void)invalidateMemoryCacheForTheme:(id)arg0
{
    // 原始 IMP: 0x2E7228; ObjC type encoding: v24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
}

+ (id)decryptedPayloadForTheme:(id)arg0 error:(id)arg1
{
    // 原始 IMP: 0x2E727C; ObjC type encoding: @32@0:8q16^@24
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)filesForTheme:(id)arg0
{
    // 原始 IMP: 0x2E75A4; ObjC type encoding: @24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)manifestForTheme:(id)arg0
{
    // 原始 IMP: 0x2E7A30; ObjC type encoding: @24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)cardHTMLForTheme:(id)arg0
{
    // 原始 IMP: 0x2E7AA0; ObjC type encoding: @24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)installedVersionMap
{
    // 原始 IMP: 0x2E7E40; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)installedItems
{
    // 原始 IMP: 0x2E8160; ObjC type encoding: @16@0:8
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)nameForTheme:(id)arg0
{
    // 原始 IMP: 0x2E8B9C; ObjC type encoding: @24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (id)typeForTheme:(id)arg0
{
    // 原始 IMP: 0x2E8DB4; ObjC type encoding: @24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return nil;
}

+ (NSInteger)activeInstalledThemeIdForType:(id)arg0
{
    // 原始 IMP: 0x2E8F30; ObjC type encoding: q24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return 0;
}

+ (BOOL)applyInstalled:(id)arg0
{
    // 原始 IMP: 0x2E9610; ObjC type encoding: B24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return 0;
}

+ (BOOL)deactivateInstalledThemeForType:(id)arg0
{
    // 原始 IMP: 0x2EA4FC; ObjC type encoding: B24@0:8@16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return 0;
}

+ (BOOL)removeInstalled:(id)arg0
{
    // 原始 IMP: 0x2EA9F8; ObjC type encoding: B24@0:8q16
    // 已去除符号名混淆；完整控制流参见同名类的 .s 文件。
    return 0;
}

@end
