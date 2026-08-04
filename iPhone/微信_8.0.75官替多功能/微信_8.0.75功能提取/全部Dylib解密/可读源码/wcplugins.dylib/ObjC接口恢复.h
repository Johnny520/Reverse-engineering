// 自动恢复的 Objective-C 接口骨架
#import <Foundation/Foundation.h>

@interface WCPluginModel : NSObject
- (id).cxx_destruct;
- (id)controller;
- (id)isController;
- (id)key;
- (id)setController:(id)arg0;
- (id)setIsController:(id)arg0;
- (id)setKey:(id)arg0;
- (id)setTitle:(id)arg0;
- (id)setVersion:(id)arg0;
- (id)title;
- (id)version;
@end

@interface WCPluginsMgr : NSObject
+ (id)sharedInstance;
- (id).cxx_destruct;
- (id)plugins;
- (id)registerControllerWithTitle:(id)arg0 version:(id)arg1 controller:(id)arg2;
- (id)registerSwitchWithTitle:(id)arg0 key:(id)arg1;
- (id)setPlugins:(id)arg0;
@end

@interface WCPluginsViewController : NSObject
- (id).cxx_destruct;
- (id)addNormalCellForSel:(id)arg0 title:(id)arg1 rightValue:(id)arg2 userInfo:(id)arg3;
- (id)addSwitchCellForSel:(id)arg0 title:(id)arg1 on:(id)arg2 userInfo:(id)arg3;
- (id)dataSource;
- (id)getHeaderView;
- (id)getSwitchKeyValue:(id)arg0;
- (id)initData;
- (id)initNavHeaderIfNeed;
- (id)initTableView;
- (id)initWithNibName:(id)arg0 bundle:(id)arg1;
- (id)navHeaderView;
- (id)pushPluginController:(id)arg0;
- (id)reloadTableData;
- (id)setDataSource:(id)arg0;
- (id)setNavHeaderView:(id)arg0;
- (id)setTableViewManager:(id)arg0;
- (id)shouldAutorotate;
- (id)switchChanged:(id)arg0;
- (id)tableViewManager;
- (id)viewDidLoad;
- (id)viewWillLayoutSubviews;
@end

// 未可靠归属到具体类的 selector：
// .cxx_destruct
// PushViewController:animated:
// T@"NSMutableArray",&,N,V_dataSource
// T@"NSMutableArray",&,N,V_plugins
// T@"NSString",&,N,V_controller
// T@"NSString",&,N,V_key
// T@"NSString",&,N,V_title
// T@"NSString",&,N,V_version
// T@"UIView",&,N,V_navHeaderView
// T@"WCTableViewManager",&,N,V_tableViewManager
// TB,N,V_isController
// _controller
// _dataSource
// _isController
// _key
// _navHeaderView
// _plugins
// _tableViewManager
// _title
// _version
// addCell:
// addFunctionSection
// addNormalCellForSel:title:rightValue:userInfo:
// addObject:
// addSection:
// addSubview:
// addSwitchCellForSel:title:on:userInfo:
// alloc
// array
// arrayWithArray:
// backgroundColor
// boldSystemFontOfSize:
// boolForKey:
// bounds
// cellInfo
// controller
// dataSource
// enumerateObjectsUsingBlock:
// frame
// getCurrentNavigationController
// getHeaderView
// getSectionAt:
// getSuperContainerView
// getSwitchKeyValue:
// getTableView
// imageNamed:
// init
// initData
// initNavHeaderIfNeed
// initTableView
// initWithFrame:
// initWithFrame:style:
// initWithImage:
// initWithNibName:bundle:
// isController
// isOn
// key
// labelColor
// labelSubColor
// mainScreen
// navHeaderView
// navigationBarHeight
// new
// normalCellForSel:target:leftImage:title:WithDisclosureIndicator:
// normalCellForSel:target:leftImage:title:pathKey:
// normalCellForSel:target:title:rightValue:
// normalCellForSel:target:title:rightValue:WithDisclosureIndicator:
// normalStatusBarHeight
// plugins
// pushPluginController
// pushPluginController:
// registerControllerWithTitle:version:controller:
// registerSwitchWithTitle:key:
// reloadData
// reloadTableData
// respondsToSelector:
// sectionWithHeader:Footer:
// setAutomaticallyAdjustsScrollViewInsets:
// setBackgroundColor:
// setBool:forKey:
// setContentInsetAdjustmentBehavior:
// setController:
// setDataSource:
// setFont:
// setFrame:
// setHidesBottomBarWhenPushed:
// setIsController:
// setKey:
// setNavHeaderView:
// setNumberOfLines:
// setPlugins:
// setTableHeaderView:
// setTableViewManager:
// setText:
// setTextAlignment:
// setTextColor:
// setTitle:
// setUserInfo:
// setVersion:
// sharedInstance
// shouldAutorotate
// standardUserDefaults
// switchCellForSel:target:title:on:
// switchChanged:
// synchronize
// systemFontOfSize:
// tableViewManager
// title
// userInfo
// valueForKey:
// version
// view
// viewDidLoad
// viewWillLayoutSubviews
