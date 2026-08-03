#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomeSwipeBlockerDelegate : NSObject
- (BOOL)gestureRecognizer:(id)arg0 shouldReceiveTouch:(id)arg1;
- (BOOL)gestureRecognizerShouldBegin:(id)arg0;
- (BOOL)gestureRecognizer:(id)arg0 shouldRecognizeSimultaneouslyWithGestureRecognizer:(id)arg1;
@end
