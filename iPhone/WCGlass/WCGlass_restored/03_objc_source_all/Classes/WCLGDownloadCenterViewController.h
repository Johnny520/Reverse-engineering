#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGDownloadCenterViewController : NSObject
- (void)viewDidLoad;
- (void)viewDidLayoutSubviews;
- (void)segChanged;
- (void)openRedeemCenter;
- (void)reload;
- (id)current;
- (void)updateEmpty;
- (NSInteger)tableView:(id)arg0 numberOfRowsInSection:(id)arg1;
- (id)tableView:(id)arg0 cellForRowAtIndexPath:(id)arg1;
- (void)tableView:(id)arg0 didSelectRowAtIndexPath:(id)arg1;
- (void)showDetail:(id)arg0;
- (void)dismissSelf;
- (void)toast:(id)arg0;
- (id)seg;
- (void)setSeg:(id)arg0;
- (id)segBar;
- (void)setSegBar:(id)arg0;
- (id)bg;
- (void)setBg:(id)arg0;
- (id)tableView;
- (void)setTableView:(id)arg0;
- (id)spinner;
- (void)setSpinner:(id)arg0;
- (id)emptyLabel;
- (void)setEmptyLabel:(id)arg0;
- (id)bubbles;
- (void)setBubbles:(id)arg0;
- (id)cards;
- (void)setCards:(id)arg0;
- (NSUInteger)reloadGeneration;
- (void)setReloadGeneration:(id)arg0;
- (void).cxx_destruct;
@end
