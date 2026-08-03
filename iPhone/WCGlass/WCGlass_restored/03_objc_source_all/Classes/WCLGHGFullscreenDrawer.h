#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHGFullscreenDrawer : NSObject
- (id)initWithController:(id)arg0 fromLeft:(id)arg1 anchorY:(id)arg2;
- (void)buildPillsWithFontSize:(id)arg0;
- (void)handleBackdrop;
- (void)handlePill:(id)arg0;
- (NSInteger)pillIndexAtWindowPoint:(id)arg0;
- (void)setHighlightedIndex:(id)arg0;
- (void)commitSelection:(id)arg0;
- (void)presentInWindow:(id)arg0;
- (void)dismissAnimated:(id)arg0;
- (id)controller;
- (void)setController:(id)arg0;
- (id)backdrop;
- (void)setBackdrop:(id)arg0;
- (id)column;
- (void)setColumn:(id)arg0;
- (BOOL)fromLeft;
- (void)setFromLeft:(id)arg0;
- (double)columnWidth;
- (void)setColumnWidth:(id)arg0;
- (double)anchorY;
- (void)setAnchorY:(id)arg0;
- (id)pills;
- (void)setPills:(id)arg0;
- (NSInteger)highlightedIndex;
- (id)lockedScroll;
- (void)setLockedScroll:(id)arg0;
- (id)hapticGenerator;
- (void)setHapticGenerator:(id)arg0;
- (void).cxx_destruct;
@end
