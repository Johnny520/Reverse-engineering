#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGGlassBackgroundView : NSObject
- (id)initWithFrame:(id)arg0;
- (BOOL)isDark;
- (id)colorsA;
- (id)colorsB;
- (void)updateColors;
- (void)layoutSubviews;
- (void)traitCollectionDidChange:(id)arg0;
- (void)startAnimations;
- (id)gradA;
- (void)setGradA:(id)arg0;
- (id)gradB;
- (void)setGradB:(id)arg0;
- (void).cxx_destruct;
@end
