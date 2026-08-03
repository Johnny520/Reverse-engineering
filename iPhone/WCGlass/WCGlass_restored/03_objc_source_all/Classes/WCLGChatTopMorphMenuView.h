#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGChatTopMorphMenuView : NSObject
- (id)initWithFrame:(id)arg0;
- (void)layoutSubviews;
- (void)reloadRows;
- (void)handleMenuTap:(id)arg0;
- (void)setHighlightedIndex:(id)arg0;
- (NSInteger)indexForPoint:(id)arg0;
- (id)controller;
- (void)setController:(id)arg0;
- (BOOL)isGroup;
- (void)setIsGroup:(id)arg0;
- (NSInteger)highlightedIndex;
- (id)selectionHandler;
- (void)setSelectionHandler:(id)arg0;
- (id)effectView;
- (void)setEffectView:(id)arg0;
- (id)rowViews;
- (void)setRowViews:(id)arg0;
- (void).cxx_destruct;
@end
