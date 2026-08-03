#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGEdgeEffectView : NSObject
- (id)initWithFrame:(id)arg0;
- (void)updateWithContentColor:(id)arg0 blur:(id)arg1 alpha:(id)arg2 rect:(id)arg3 edge:(id)arg4 edgeSize:(id)arg5 blurRadius:(id)arg6;
- (BOOL)isBlurEnabled;
- (void)setBlurEnabled:(id)arg0;
- (id)contentView;
- (void)setContentView:(id)arg0;
- (id)contentMaskView;
- (void)setContentMaskView:(id)arg0;
- (id)blurHostView;
- (void)setBlurHostView:(id)arg0;
- (id)fallbackBlurView;
- (void)setFallbackBlurView:(id)arg0;
- (id)lastContentColor;
- (void)setLastContentColor:(id)arg0;
- (BOOL)lastBlur;
- (void)setLastBlur:(id)arg0;
- (double)lastAlpha;
- (void)setLastAlpha:(id)arg0;
- (id)lastRect;
- (void)setLastRect:(id)arg0;
- (NSInteger)lastEdge;
- (void)setLastEdge:(id)arg0;
- (double)lastEdgeSize;
- (void)setLastEdgeSize:(id)arg0;
- (double)lastBlurRadius;
- (void)setLastBlurRadius:(id)arg0;
- (void).cxx_destruct;
@end
