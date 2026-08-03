#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomePinnedPanelView : NSObject
+ (id)rowDefinitions;
- (id)initForWindow:(id)arg0;
- (id)primaryTextColor;
- (id)secondaryTextColor;
- (id)separatorColor;
- (void)buildBackground;
- (void)buildHeader;
- (void)buildScrollContent:(id)arg0;
- (id)makePlainRowAtIndex:(id)arg0 title:(id)arg1 lastRow:(id)arg2;
- (id)makeTappableRowAtIndex:(id)arg0 title:(id)arg1 lastRow:(id)arg2;
- (void)addLabel:(id)arg0 separator:(id)arg1 toRow:(id)arg2 interactive:(id)arg3;
- (void)placeAccessory:(id)arg0 inRow:(id)arg1;
- (BOOL)switchOnFor:(id)arg0;
- (void)addSwitchToRow:(id)arg0 def:(id)arg1 index:(id)arg2;
- (void)addSegmentToRow:(id)arg0 def:(id)arg1 index:(id)arg2;
- (void)addStepperToRow:(id)arg0 def:(id)arg1 index:(id)arg2;
- (void)addColorAccessoryToRow:(id)arg0 index:(id)arg1;
- (void)addActionAccessoryToRow:(id)arg0;
- (void)refreshBadgeSwatch;
- (void)closeTapped;
- (void)switchChanged:(id)arg0;
- (void)segmentChanged:(id)arg0;
- (void)stepperChanged:(id)arg0;
- (void)rowTapped:(id)arg0;
- (void)badgeColorTapped;
- (void)dismissTopModal;
- (void)handlePan:(id)arg0;
- (id)clampedCenter:(id)arg0 inBounds:(id)arg1;
- (BOOL)gestureRecognizer:(id)arg0 shouldReceiveTouch:(id)arg1;
- (id)panelBG;
- (void)setPanelBG:(id)arg0;
- (id)scrollView;
- (void)setScrollView:(id)arg0;
- (id)rows;
- (void)setRows:(id)arg0;
- (id)valueLabels;
- (void)setValueLabels:(id)arg0;
- (id)badgeSwatch;
- (void)setBadgeSwatch:(id)arg0;
- (id)dragStartCenter;
- (void)setDragStartCenter:(id)arg0;
- (BOOL)darkMode;
- (void)setDarkMode:(id)arg0;
- (void).cxx_destruct;
@end
