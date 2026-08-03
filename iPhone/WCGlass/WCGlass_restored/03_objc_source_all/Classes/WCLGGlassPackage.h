#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGGlassPackage : NSObject
+ (id)supportDir;
+ (id)vaultDir;
+ (id)vaultPathForTheme:(id)arg0;
+ (id)indexPath;
+ (void)performConfidentialityMigrationIfNeeded;
+ (id)loadIndex;
+ (void)saveIndex:(id)arg0;
+ (id)decryptContainer:(id)arg0 themeId:(id)arg1 wxid:(id)arg2 signKey:(id)arg3 glassMaster:(id)arg4 error:(id)arg5;
+ (BOOL)importGlassData:(id)arg0 wxid:(id)arg1 signKey:(id)arg2 glassMaster:(id)arg3 iconURL:(id)arg4 error:(id)arg5;
+ (void)invalidateMemoryCacheForTheme:(id)arg0;
+ (id)decryptedPayloadForTheme:(id)arg0 error:(id)arg1;
+ (id)filesForTheme:(id)arg0;
+ (id)manifestForTheme:(id)arg0;
+ (id)cardHTMLForTheme:(id)arg0;
+ (id)installedVersionMap;
+ (id)installedItems;
+ (id)nameForTheme:(id)arg0;
+ (id)typeForTheme:(id)arg0;
+ (NSInteger)activeInstalledThemeIdForType:(id)arg0;
+ (BOOL)applyInstalled:(id)arg0;
+ (BOOL)deactivateInstalledThemeForType:(id)arg0;
+ (BOOL)removeInstalled:(id)arg0;
@end
