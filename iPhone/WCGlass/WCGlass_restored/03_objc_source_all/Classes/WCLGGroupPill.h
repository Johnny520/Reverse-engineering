#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGGroupPill : NSObject
+ (id)pillConfigurationExpanded:(id)arg0;
- (id)initWithFrame:(id)arg0;
- (void)applyBadgeText;
- (void)applyMemberText;
- (void)applyVisualStateExpanded:(id)arg0 newButton:(id)arg1 title:(id)arg2;
- (void)setPillExpanded:(id)arg0;
- (void)configureWithTitle:(id)arg0 memberCount:(id)arg1 badgeCount:(id)arg2 expanded:(id)arg3 newButton:(id)arg4 textColor:(id)arg5;
- (void)refreshBadgeCount:(id)arg0 memberCount:(id)arg1;
- (void)layoutSubviews;
- (void)handleTap;
- (void)handleLongPress:(id)arg0;
- (NSInteger)displayIndex;
- (void)setDisplayIndex:(id)arg0;
- (id)onTap;
- (void)setOnTap:(id)arg0;
- (id)onLongPress;
- (void)setOnLongPress:(id)arg0;
- (id)badge;
- (void)setBadge:(id)arg0;
- (NSInteger)badgeCount;
- (void)setBadgeCount:(id)arg0;
- (id)countLabel;
- (void)setCountLabel:(id)arg0;
- (NSInteger)memberCount;
- (void)setMemberCount:(id)arg0;
- (BOOL)wclgExpanded;
- (void)setWclgExpanded:(id)arg0;
- (BOOL)wclgNewButton;
- (void)setWclgNewButton:(id)arg0;
- (id)wclgTitle;
- (void)setWclgTitle:(id)arg0;
- (void).cxx_destruct;
@end
