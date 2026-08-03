#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGFuncCardPanelView : NSObject
+ (id)metricDefinitions;
- (id)initForWindow:(id)arg0;
- (id)primaryTextColor;
- (id)secondaryTextColor;
- (id)separatorColor;
- (void)buildBlurBackground;
- (id)contentHost;
- (void)buildHeader;
- (void)buildScrollContent:(id)arg0;
- (id)makeRowAtIndex:(id)arg0 title:(id)arg1 lastRow:(id)arg2;
- (id)makeColorRowAtIndex:(id)arg0 title:(id)arg1 swatchOut:(id)arg2;
- (id)makeDisclosureRowAtIndex:(id)arg0 title:(id)arg1;
- (void)placeAccessoryControl:(id)arg0 inRow:(id)arg1;
- (void)addStepperForMetric:(id)arg0 index:(id)arg1 inRow:(id)arg2;
- (void)closeTapped;
- (void)enableSwitchChanged:(id)arg0;
- (void)swipeFollowSwitchChanged:(id)arg0;
- (void)appearanceControlChanged:(id)arg0;
- (void)stepperChanged:(id)arg0;
- (void)bgColorTapped;
- (void)borderColorTapped;
- (void)codeLibraryTapped;
- (void)presentColorPickerKey:(id)arg0 title:(id)arg1;
- (void)dismissTopModal;
- (void)refreshColorSwatches;
- (void)handlePan:(id)arg0;
- (id)clampedCenter:(id)arg0 inBounds:(id)arg1;
- (BOOL)gestureRecognizer:(id)arg0 shouldReceiveTouch:(id)arg1;
- (id)panelBG;
- (void)setPanelBG:(id)arg0;
- (id)scrollView;
- (void)setScrollView:(id)arg0;
- (id)enableSwitch;
- (void)setEnableSwitch:(id)arg0;
- (id)swipeFollowSwitch;
- (void)setSwipeFollowSwitch:(id)arg0;
- (id)appearanceControl;
- (void)setAppearanceControl:(id)arg0;
- (id)bgSwatch;
- (void)setBgSwatch:(id)arg0;
- (id)borderSwatch;
- (void)setBorderSwatch:(id)arg0;
- (id)valueLabels;
- (void)setValueLabels:(id)arg0;
- (id)metrics;
- (void)setMetrics:(id)arg0;
- (id)dragStartCenter;
- (void)setDragStartCenter:(id)arg0;
- (BOOL)darkMode;
- (void)setDarkMode:(id)arg0;
- (void).cxx_destruct;
@end
