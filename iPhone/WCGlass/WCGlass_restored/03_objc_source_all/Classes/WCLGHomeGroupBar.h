#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGHomeGroupBar : NSObject
+ (double)preferredHeight;
- (id)initWithFrame:(id)arg0;
- (void)dealloc;
- (void)handleGroupsChanged;
- (void)reloadGroups;
- (void)reloadGroupsIfNeeded;
- (void)setSelectedDisplayIndex:(id)arg0 animated:(id)arg1;
- (void)refreshBadgesWithTable:(id)arg0;
- (void)layoutSubviews;
- (void)scrollSelectedPillToVisibleIfNeededAnimated:(id)arg0;
- (void)traitCollectionDidChange:(id)arg0;
- (id)delegate;
- (void)setDelegate:(id)arg0;
- (id)pills;
- (void)setPills:(id)arg0;
- (id)scroll;
- (void)setScroll:(id)arg0;
- (NSInteger)lastScrolledExpandedIndex;
- (void)setLastScrolledExpandedIndex:(id)arg0;
- (id)wclgStructureToken;
- (void)setWclgStructureToken:(id)arg0;
- (void).cxx_destruct;
@end
