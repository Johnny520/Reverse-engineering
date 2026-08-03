#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

@interface WCLGCodeLibraryViewController : NSObject
+ (id)dateFormatter;
- (id)initWithApplyHandler:(id)arg0 onChange:(id)arg1;
- (void)viewDidLoad;
- (void)viewWillAppear:(id)arg0;
- (void)viewWillDisappear:(id)arg0;
- (void)reloadEntries;
- (void)notifyChange;
- (void)toggleEditingTapped;
- (void)setEditing:(id)arg0 animated:(id)arg1;
- (void)updateToolbarState;
- (void)selectAllTapped;
- (void)deleteSelectedTapped;
- (void)clearAllTapped;
- (void)closeTapped;
- (void)applyEntryAtRow:(id)arg0;
- (void)presentRenameForRow:(id)arg0;
- (void)deleteEntryAtRow:(id)arg0;
- (void)addTapped;
- (void)saveCurrentInUse;
- (void)importFromFiles;
- (void)documentPicker:(id)arg0 didPickDocumentsAtURLs:(id)arg1;
- (NSInteger)tableView:(id)arg0 numberOfRowsInSection:(id)arg1;
- (id)tableView:(id)arg0 cellForRowAtIndexPath:(id)arg1;
- (void)tableView:(id)arg0 didSelectRowAtIndexPath:(id)arg1;
- (void)tableView:(id)arg0 didDeselectRowAtIndexPath:(id)arg1;
- (NSInteger)tableView:(id)arg0 editingStyleForRowAtIndexPath:(id)arg1;
- (BOOL)tableView:(id)arg0 canEditRowAtIndexPath:(id)arg1;
- (BOOL)tableView:(id)arg0 canMoveRowAtIndexPath:(id)arg1;
- (void)tableView:(id)arg0 moveRowAtIndexPath:(id)arg1 toIndexPath:(id)arg2;
- (id)tableView:(id)arg0 contextMenuConfigurationForRowAtIndexPath:(id)arg1 point:(id)arg2;
- (id)tableView:(id)arg0 titleForFooterInSection:(id)arg1;
- (id)onApply;
- (void)setOnApply:(id)arg0;
- (id)onChange;
- (void)setOnChange:(id)arg0;
- (id)entries;
- (void)setEntries:(id)arg0;
- (id)activeEntryId;
- (void)setActiveEntryId:(id)arg0;
- (id)addButton;
- (void)setAddButton:(id)arg0;
- (id)selectButton;
- (void)setSelectButton:(id)arg0;
- (id)selectAllButton;
- (void)setSelectAllButton:(id)arg0;
- (id)clearAllButton;
- (void)setClearAllButton:(id)arg0;
- (id)deleteButton;
- (void)setDeleteButton:(id)arg0;
- (id)emptyLabel;
- (void)setEmptyLabel:(id)arg0;
- (void).cxx_destruct;
@end
