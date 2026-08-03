#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGGetButton : NSObject
- (id)initWithFrame:(id)arg0;
- (void)setIdleTitle:(id)arg0 icon:(id)arg1;
- (void)setDownloading:(id)arg0;
- (void)setProgress:(id)arg0;
- (void)layoutSubviews;
- (void)tapped;
- (id)onTap;
- (void)setOnTap:(id)arg0;
- (id)pill;
- (void)setPill:(id)arg0;
- (id)pillIcon;
- (void)setPillIcon:(id)arg0;
- (id)pillLabel;
- (void)setPillLabel:(id)arg0;
- (id)track;
- (void)setTrack:(id)arg0;
- (id)ring;
- (void)setRing:(id)arg0;
- (id)stopSquare;
- (void)setStopSquare:(id)arg0;
- (BOOL)downloading;
- (void).cxx_destruct;
@end
