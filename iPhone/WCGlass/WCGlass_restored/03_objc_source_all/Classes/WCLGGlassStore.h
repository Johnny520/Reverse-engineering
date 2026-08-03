#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGGlassStore : NSObject
+ (id)shared;
- (void *)apiPubKey;
- (void *)signPubKey;
- (id)currentWXID;
- (id)buildRequest:(id)arg0 requestKey:(id)arg1 nonce:(id)arg2;
- (id)decryptResponse:(id)arg0 requestKey:(id)arg1 nonce:(id)arg2;
- (void)postPath:(id)arg0 payload:(id)arg1 completion:(id)arg2;
- (id)themeFromDict:(id)arg0;
- (void)fetchCatalogWithCompletion:(id)arg0;
- (void)fetchCardPreviewHTMLForTheme:(id)arg0 completion:(id)arg1;
- (void)downloadAndImportTheme:(id)arg0 completion:(id)arg1;
- (void)downloadAndImportTheme:(id)arg0 progress:(id)arg1 completion:(id)arg2;
- (void *)glassSignKey;
- (id)glassMasterKey;
- (void)revokeTheme:(id)arg0 completion:(id)arg1;
- (void)setApiPubKey:(id)arg0;
- (void)setSignPubKey:(id)arg0;
@end
