#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGGlassUI : NSObject
+ (id)cardColor;
+ (id)cardBorderColor;
+ (id)accentColor;
+ (id)themePlaceholderImageForType:(id)arg0;
+ (void)showToast:(id)arg0 inView:(id)arg1;
+ (id)imageCache;
+ (id)imageCacheQueue;
+ (id)imageInflightRequests;
+ (id)normalizedImageURLString:(id)arg0;
+ (id)themeIconCacheDirectory;
+ (id)themeIconCachePathForURL:(id)arg0;
+ (NSUInteger)memoryCostForImage:(id)arg0 fallback:(id)arg1;
+ (id)decodedImageFromData:(id)arg0;
+ (id)themeIconImageFromDiskForURL:(id)arg0;
+ (void)trimThemeIconDiskCacheIfNeeded;
+ (BOOL)registerImageRequestForKey:(id)arg0 completion:(id)arg1;
+ (void)finishImageRequestForKey:(id)arg0 image:(id)arg1;
+ (void)requestImageAtURLString:(id)arg0 persistToDisk:(id)arg1 completion:(id)arg2;
+ (void)prewarmThemeIconCacheForURLs:(id)arg0 completion:(id)arg1;
+ (void)loadImage:(id)arg0 into:(id)arg1;
+ (void)loadImage:(id)arg0 themeType:(id)arg1 into:(id)arg2;
@end
