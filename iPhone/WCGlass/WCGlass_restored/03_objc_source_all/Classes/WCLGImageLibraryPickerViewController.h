#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGImageLibraryPickerViewController : NSObject
- (id)initWithCategory:(id)arg0 title:(id)arg1 onPick:(id)arg2;
- (void)viewDidLoad;
- (void)closeTapped;
- (NSInteger)collectionView:(id)arg0 numberOfItemsInSection:(id)arg1;
- (id)collectionView:(id)arg0 layout:(id)arg1 sizeForItemAtIndexPath:(id)arg2;
- (id)collectionView:(id)arg0 cellForItemAtIndexPath:(id)arg1;
- (void)collectionView:(id)arg0 didSelectItemAtIndexPath:(id)arg1;
- (id)category;
- (void)setCategory:(id)arg0;
- (id)onPick;
- (void)setOnPick:(id)arg0;
- (id)items;
- (void)setItems:(id)arg0;
- (id)collectionView;
- (void)setCollectionView:(id)arg0;
- (id)emptyLabel;
- (void)setEmptyLabel:(id)arg0;
- (void).cxx_destruct;
@end
