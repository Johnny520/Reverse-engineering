#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomeStripSwipeTarget : NSObject
+ (id)shared;
- (void)handleSwipe:(id)arg0;
- (BOOL)gestureRecognizer:(id)arg0 shouldRecognizeSimultaneouslyWithGestureRecognizer:(id)arg1;
- (BOOL)gestureRecognizer:(id)arg0 shouldReceiveTouch:(id)arg1;
@end
