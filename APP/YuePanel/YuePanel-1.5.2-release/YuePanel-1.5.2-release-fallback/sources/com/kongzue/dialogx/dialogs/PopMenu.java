package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class PopMenu extends com.kongzue.dialogx.interfaces.BaseDialog {
    public static long overrideEnterDuration = -1;
    public static long overrideExitDuration = -1;
    protected int alignGravity;
    protected boolean autoTintIconInLightOrDarkMode;
    protected float backgroundRadius;
    private android.view.ViewTreeObserver.OnDrawListener baseViewDrawListener;
    protected com.kongzue.dialogx.util.DialogXViewLoc baseViewLoc;
    protected java.lang.ref.WeakReference<android.view.View> baseViewWeakReference;
    protected boolean bkgInterceptTouch;
    private boolean closing;
    protected com.kongzue.dialogx.dialogs.PopMenu.DialogImpl dialogImpl;
    protected com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopMenu> dialogLifecycleCallback;
    protected com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopMenu> dialogXAnimImpl;
    protected int height;
    protected boolean hideWithExitAnim;
    protected java.util.List<java.lang.Integer> iconResIds;
    protected boolean isEnterAnimRunning;
    protected com.kongzue.dialogx.util.ItemDivider itemDivider;
    public int lastHash;
    protected com.kongzue.dialogx.dialogs.PopMenu me;
    protected java.util.List<java.lang.CharSequence> menuList;
    protected com.kongzue.dialogx.util.PopMenuArrayAdapter menuListAdapter;
    protected com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.PopMenu> menuMenuItemLayoutRefreshCallback;
    protected com.kongzue.dialogx.util.TextInfo menuTextInfo;
    protected java.util.Map<java.lang.Integer, java.lang.Boolean> menuUsability;
    public boolean notCheckHash;
    protected boolean offScreen;
    protected com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.PopMenu> onBackPressedListener;
    protected com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.PopMenu> onBackgroundMaskClickListener;
    protected com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> onBindView;
    protected com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.PopMenu> onIconChangeCallBack;
    protected com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.PopMenu> onMenuItemClickListener;
    protected boolean overlayBaseView;
    protected int pressedIndex;
    private int selectIndex;
    protected int selectItemYDeviation;
    private android.view.ViewTreeObserver viewTreeObserver;
    protected int width;








    public class DialogImpl implements com.kongzue.dialogx.interfaces.DialogConvertViewInterface {
        private java.util.List<android.view.View> blurViews;
        public com.kongzue.dialogx.util.views.MaxRelativeLayout boxBody;
        public android.widget.RelativeLayout boxCustom;
        public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout boxRoot;
        public com.kongzue.dialogx.util.views.PopMenuListView listMenu;
        final /* synthetic */ com.kongzue.dialogx.dialogs.PopMenu this$0;









        public DialogImpl(com.kongzue.dialogx.dialogs.PopMenu r3, android.view.View r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                if (r4 != 0) goto L8
                return
            L8:
                com.kongzue.dialogx.dialogs.PopMenu.access$400(r3, r4)
                int r0 = com.kongzue.dialogx.R.id.box_root
                android.view.View r0 = r4.findViewById(r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r0
                r2.boxRoot = r0
                int r0 = com.kongzue.dialogx.R.id.box_body
                android.view.View r0 = r4.findViewById(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
                r2.boxBody = r0
                int r0 = com.kongzue.dialogx.R.id.box_custom
                android.view.View r0 = r4.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                r2.boxCustom = r0
                int r0 = com.kongzue.dialogx.R.id.listMenu
                android.view.View r0 = r4.findViewById(r0)
                com.kongzue.dialogx.util.views.PopMenuListView r0 = (com.kongzue.dialogx.util.views.PopMenuListView) r0
                r2.listMenu = r0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r2.boxBody
                r1 = 4
                r0.setVisibility(r1)
                java.util.List r3 = com.kongzue.dialogx.dialogs.PopMenu.access$500(r3, r4)
                r2.blurViews = r3
                com.kongzue.dialogx.util.views.MaxRelativeLayout r3 = r2.boxBody
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                r3.setX(r4)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r3 = r2.boxBody
                r3.setY(r4)
                r2.init()
                return
        }

        public static /* synthetic */ java.util.List access$2100(com.kongzue.dialogx.dialogs.PopMenu.DialogImpl r0) {
                java.util.List<android.view.View> r0 = r0.blurViews
                return r0
        }

        public static /* synthetic */ boolean access$4600(com.kongzue.dialogx.dialogs.PopMenu.DialogImpl r0) {
                boolean r0 = r0.isUseBlurBackground()
                return r0
        }

        private boolean isUseBlurBackground() {
                r1 = this;
                com.kongzue.dialogx.dialogs.PopMenu r0 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.PopMenu.access$4700(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r0 = r0.popMenuSettings()
                if (r0 == 0) goto L32
                com.kongzue.dialogx.dialogs.PopMenu r0 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.PopMenu.access$4800(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r0 = r0.popMenuSettings()
                com.kongzue.dialogx.interfaces.DialogXStyle$BlurBackgroundSetting r0 = r0.blurBackgroundSettings()
                if (r0 == 0) goto L32
                com.kongzue.dialogx.dialogs.PopMenu r0 = r1.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.PopMenu.access$4900(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r0 = r0.popMenuSettings()
                com.kongzue.dialogx.interfaces.DialogXStyle$BlurBackgroundSetting r0 = r0.blurBackgroundSettings()
                boolean r0 = r0.blurBackground()
                if (r0 == 0) goto L32
                r0 = 1
                goto L33
            L32:
                r0 = 0
            L33:
                return r0
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void doDismiss(android.view.View r2) {
                r1 = this;
                com.kongzue.dialogx.dialogs.PopMenu r0 = r1.this$0
                boolean r0 = r0.preDismiss(r0)
                if (r0 == 0) goto L9
                return
            L9:
                if (r2 == 0) goto Lf
                r0 = 0
                r2.setEnabled(r0)
            Lf:
                com.kongzue.dialogx.dialogs.PopMenu r2 = r1.this$0
                boolean r2 = com.kongzue.dialogx.dialogs.PopMenu.access$4000(r2)
                if (r2 != 0) goto L2b
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r1.boxRoot
                if (r2 == 0) goto L2b
                com.kongzue.dialogx.dialogs.PopMenu r2 = r1.this$0
                r0 = 1
                com.kongzue.dialogx.dialogs.PopMenu.access$4102(r2, r0)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r1.boxRoot
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$7 r0 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$7
                r0.<init>(r1)
                r2.post(r0)
            L2b:
                return
        }

        public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopMenu> getDialogXAnimImpl() {
                r2 = this;
                com.kongzue.dialogx.dialogs.PopMenu r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopMenu> r1 = r0.dialogXAnimImpl
                if (r1 != 0) goto Ld
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$8 r1 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$8
                r1.<init>(r2)
                r0.dialogXAnimImpl = r1
            Ld:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r2.this$0
                com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopMenu> r0 = r0.dialogXAnimImpl
                return r0
        }

        public long getEnterAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.boxBody
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r6.boxBody
                android.view.animation.Animation r7 = r7.getAnimation()
            L10:
                r0 = 0
                if (r7 == 0) goto L22
                long r2 = r7.getDuration()
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L1d
                goto L22
            L1d:
                long r2 = r7.getDuration()
                goto L24
            L22:
                r2 = 150(0x96, double:7.4E-322)
            L24:
                long r4 = com.kongzue.dialogx.dialogs.PopMenu.overrideEnterDuration
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L2b
                r2 = r4
            L2b:
                com.kongzue.dialogx.dialogs.PopMenu r7 = r6.this$0
                long r4 = com.kongzue.dialogx.dialogs.PopMenu.access$5200(r7)
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L3b
                com.kongzue.dialogx.dialogs.PopMenu r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.PopMenu.access$5300(r7)
            L3b:
                return r2
        }

        public long getExitAnimationDuration(@Yue.InterfaceC4544 android.view.animation.Animation r7) {
                r6 = this;
                if (r7 != 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.boxBody
                android.view.animation.Animation r0 = r0.getAnimation()
                if (r0 == 0) goto L10
                com.kongzue.dialogx.util.views.MaxRelativeLayout r7 = r6.boxBody
                android.view.animation.Animation r7 = r7.getAnimation()
            L10:
                r0 = 0
                if (r7 == 0) goto L22
                long r2 = r7.getDuration()
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L1d
                goto L22
            L1d:
                long r2 = r7.getDuration()
                goto L24
            L22:
                r2 = 150(0x96, double:7.4E-322)
            L24:
                long r4 = com.kongzue.dialogx.dialogs.PopMenu.overrideExitDuration
                int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r7 < 0) goto L2b
                r2 = r4
            L2b:
                com.kongzue.dialogx.dialogs.PopMenu r7 = r6.this$0
                long r0 = com.kongzue.dialogx.dialogs.PopMenu.access$5000(r7)
                r4 = -1
                int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r7 == 0) goto L3d
                com.kongzue.dialogx.dialogs.PopMenu r7 = r6.this$0
                long r2 = com.kongzue.dialogx.dialogs.PopMenu.access$5100(r7)
            L3d:
                return r2
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void init() {
                r6 = this;
                com.kongzue.dialogx.dialogs.PopMenu r0 = r6.this$0
                r1 = 0
                com.kongzue.dialogx.dialogs.PopMenu.access$602(r0, r1)
                com.kongzue.dialogx.dialogs.PopMenu r0 = r6.this$0
                com.kongzue.dialogx.util.PopMenuArrayAdapter r2 = r0.menuListAdapter
                if (r2 != 0) goto L1f
                com.kongzue.dialogx.util.PopMenuArrayAdapter r2 = new com.kongzue.dialogx.util.PopMenuArrayAdapter
                com.kongzue.dialogx.dialogs.PopMenu r3 = r6.this$0
                com.kongzue.dialogx.dialogs.PopMenu r4 = r3.me
                android.app.Activity r3 = r3.getOwnActivity()
                com.kongzue.dialogx.dialogs.PopMenu r5 = r6.this$0
                java.util.List<java.lang.CharSequence> r5 = r5.menuList
                r2.<init>(r4, r3, r5)
                r0.menuListAdapter = r2
            L1f:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r6.boxRoot
                com.kongzue.dialogx.dialogs.PopMenu r2 = r6.this$0
                com.kongzue.dialogx.dialogs.PopMenu r2 = r2.me
                r0.setParentDialog(r2)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r6.boxRoot
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$1 r2 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$1
                r2.<init>(r6)
                r0.setOnLifecycleCallBack(r2)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r6.boxRoot
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$2 r2 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$2
                r2.<init>(r6)
                r0.setOnBackPressedListener(r2)
                com.kongzue.dialogx.util.views.PopMenuListView r0 = r6.listMenu
                com.kongzue.dialogx.dialogs.PopMenu r2 = r6.this$0
                android.widget.FrameLayout r2 = r2.getRootFrameLayout()
                if (r2 != 0) goto L50
                com.kongzue.dialogx.dialogs.PopMenu r2 = r6.this$0
                r3 = 1140457472(0x43fa0000, float:500.0)
                int r2 = r2.dip2px(r3)
            L4e:
                float r2 = (float) r2
                goto L64
            L50:
                com.kongzue.dialogx.dialogs.PopMenu r2 = r6.this$0
                android.widget.FrameLayout r2 = r2.getRootFrameLayout()
                int r2 = r2.getMeasuredHeight()
                com.kongzue.dialogx.dialogs.PopMenu r3 = r6.this$0
                r4 = 1125515264(0x43160000, float:150.0)
                int r3 = r3.dip2px(r4)
                int r2 = r2 - r3
                goto L4e
            L64:
                r0.setMaxHeight(r2)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.boxBody
                r2 = 4
                r0.setVisibility(r2)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r6.boxBody
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$3 r2 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$3
                r2.<init>(r6)
                r0.post(r2)
                com.kongzue.dialogx.dialogs.PopMenu r0 = r6.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.PopMenu.access$2400(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r0 = r0.popMenuSettings()
                if (r0 == 0) goto Lac
                com.kongzue.dialogx.dialogs.PopMenu r0 = r6.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r0 = com.kongzue.dialogx.dialogs.PopMenu.access$2500(r0)
                com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r0 = r0.popMenuSettings()
                com.kongzue.dialogx.dialogs.PopMenu r2 = r6.this$0
                boolean r2 = r2.isLightTheme()
                int r0 = r0.overrideMenuDividerDrawableRes(r2)
                com.kongzue.dialogx.dialogs.PopMenu r2 = r6.this$0
                com.kongzue.dialogx.interfaces.DialogXStyle r2 = com.kongzue.dialogx.dialogs.PopMenu.access$2600(r2)
                com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r2 = r2.popMenuSettings()
                com.kongzue.dialogx.dialogs.PopMenu r3 = r6.this$0
                boolean r3 = r3.isLightTheme()
                int r2 = r2.overrideMenuDividerHeight(r3)
                goto Lae
            Lac:
                r0 = r1
                r2 = r0
            Lae:
                if (r0 != 0) goto Lbd
                com.kongzue.dialogx.dialogs.PopMenu r0 = r6.this$0
                boolean r0 = r0.isLightTheme()
                if (r0 == 0) goto Lbb
                int r0 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider
                goto Lbd
            Lbb:
                int r0 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider_night
            Lbd:
                com.kongzue.dialogx.util.views.PopMenuListView r3 = r6.listMenu
                r4 = 2
                r3.setOverScrollMode(r4)
                com.kongzue.dialogx.util.views.PopMenuListView r3 = r6.listMenu
                r3.setVerticalScrollBarEnabled(r1)
                com.kongzue.dialogx.util.views.PopMenuListView r1 = r6.listMenu
                com.kongzue.dialogx.dialogs.PopMenu r3 = r6.this$0
                android.content.res.Resources r3 = r3.getResources()
                android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
                r1.setDivider(r0)
                com.kongzue.dialogx.util.views.PopMenuListView r0 = r6.listMenu
                r0.setDividerHeight(r2)
                com.kongzue.dialogx.util.views.PopMenuListView r0 = r6.listMenu
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$4 r1 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$4
                r1.<init>(r6)
                r0.setOnItemClickListener(r1)
                com.kongzue.dialogx.dialogs.PopMenu r0 = r6.this$0
                com.kongzue.dialogx.dialogs.PopMenu.access$2900(r0)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.DialogConvertViewInterface
        public void refreshView() {
                r8 = this;
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                if (r0 == 0) goto L1c3
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                android.app.Activity r0 = r0.getOwnActivity()
                if (r0 != 0) goto Le
                goto L1c3
            Le:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                boolean r1 = r1.isEnableImmersiveMode()
                r0.setAutoUnsafePlacePadding(r1)
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                int[] r1 = com.kongzue.dialogx.dialogs.PopMenu.access$3000(r1)
                r2 = 0
                r1 = r1[r2]
                com.kongzue.dialogx.dialogs.PopMenu r3 = r8.this$0
                int[] r3 = com.kongzue.dialogx.dialogs.PopMenu.access$3100(r3)
                r4 = 1
                r3 = r3[r4]
                com.kongzue.dialogx.dialogs.PopMenu r5 = r8.this$0
                int[] r5 = com.kongzue.dialogx.dialogs.PopMenu.access$3200(r5)
                r6 = 2
                r5 = r5[r6]
                com.kongzue.dialogx.dialogs.PopMenu r6 = r8.this$0
                int[] r6 = com.kongzue.dialogx.dialogs.PopMenu.access$3300(r6)
                r7 = 3
                r6 = r6[r7]
                r0.setRootPadding(r1, r3, r5, r6)
                com.kongzue.dialogx.util.views.PopMenuListView r0 = r8.listMenu
                android.widget.ListAdapter r0 = r0.getAdapter()
                if (r0 != 0) goto L54
                com.kongzue.dialogx.util.views.PopMenuListView r0 = r8.listMenu
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                com.kongzue.dialogx.util.PopMenuArrayAdapter r1 = r1.menuListAdapter
                r0.setAdapter(r1)
                goto L84
            L54:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                com.kongzue.dialogx.util.PopMenuArrayAdapter r0 = r0.menuListAdapter
                java.util.List r0 = r0.getMenuList()
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                java.util.List<java.lang.CharSequence> r3 = r1.menuList
                if (r0 == r3) goto L7f
                com.kongzue.dialogx.util.PopMenuArrayAdapter r0 = new com.kongzue.dialogx.util.PopMenuArrayAdapter
                com.kongzue.dialogx.dialogs.PopMenu r3 = r8.this$0
                com.kongzue.dialogx.dialogs.PopMenu r5 = r3.me
                android.app.Activity r3 = r3.getOwnActivity()
                com.kongzue.dialogx.dialogs.PopMenu r6 = r8.this$0
                java.util.List<java.lang.CharSequence> r6 = r6.menuList
                r0.<init>(r5, r3, r6)
                r1.menuListAdapter = r0
                com.kongzue.dialogx.util.views.PopMenuListView r0 = r8.listMenu
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                com.kongzue.dialogx.util.PopMenuArrayAdapter r1 = r1.menuListAdapter
                r0.setAdapter(r1)
                goto L84
            L7f:
                com.kongzue.dialogx.util.PopMenuArrayAdapter r0 = r1.menuListAdapter
                r0.notifyDataSetChanged()
            L84:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                boolean r1 = r0.bkgInterceptTouch
                if (r1 == 0) goto La2
                boolean r0 = r0.isCancelable()
                if (r0 == 0) goto L9b
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$5 r1 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$5
                r1.<init>(r8)
                r0.setOnClickListener(r1)
                goto La7
            L9b:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                r1 = 0
                r0.setOnClickListener(r1)
                goto La7
            La2:
                com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r8.boxRoot
                r0.setClickable(r2)
            La7:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.PopMenu.access$3400(r0)
                if (r0 == 0) goto Lbe
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r8.boxBody
                java.lang.Integer r3 = com.kongzue.dialogx.dialogs.PopMenu.access$3500(r0)
                int r3 = r3.intValue()
                r0.tintColor(r1, r3)
            Lbe:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                float r0 = r0.backgroundRadius
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L114
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.boxBody
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
                if (r0 == 0) goto Le3
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.boxBody
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                if (r0 == 0) goto Le3
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                float r1 = r1.backgroundRadius
                r0.setCornerRadius(r1)
            Le3:
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.boxBody
                com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$6 r1 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl$6
                r1.<init>(r8)
                r0.setOutlineProvider(r1)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.boxBody
                r0.setClipToOutline(r4)
                java.util.List<android.view.View> r0 = r8.blurViews
                if (r0 == 0) goto L114
                java.util.Iterator r0 = r0.iterator()
            Lfa:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L114
                java.lang.Object r1 = r0.next()
                android.view.View r1 = (android.view.View) r1
                com.kongzue.dialogx.interfaces.BlurViewType r1 = (com.kongzue.dialogx.interfaces.BlurViewType) r1
                com.kongzue.dialogx.dialogs.PopMenu r3 = r8.this$0
                float r3 = r3.backgroundRadius
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r1.setRadiusPx(r3)
                goto Lfa
            L114:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r0 = r0.onBindView
                if (r0 == 0) goto L131
                android.view.View r0 = r0.getCustomView()
                if (r0 == 0) goto L131
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r1 = r0.onBindView
                android.widget.RelativeLayout r3 = r8.boxCustom
                com.kongzue.dialogx.dialogs.PopMenu r0 = r0.me
                r1.bindParent(r3, r0)
                android.widget.RelativeLayout r0 = r8.boxCustom
                r0.setVisibility(r2)
                goto L138
            L131:
                android.widget.RelativeLayout r0 = r8.boxCustom
                r1 = 8
                r0.setVisibility(r1)
            L138:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                int r0 = r0.width
                r1 = -1
                if (r0 == r1) goto L14d
                com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r8.boxBody
                r2.setMaxWidth(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.boxBody
                com.kongzue.dialogx.dialogs.PopMenu r2 = r8.this$0
                int r2 = r2.width
                r0.setMinimumWidth(r2)
            L14d:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                int r0 = r0.height
                if (r0 == r1) goto L161
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r8.boxBody
                r1.setMaxHeight(r0)
                com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r8.boxBody
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                int r1 = r1.height
                r0.setMinimumHeight(r1)
            L161:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                java.lang.Integer r0 = com.kongzue.dialogx.dialogs.PopMenu.access$3600(r0)
                if (r0 == 0) goto L198
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r8.boxBody
                java.lang.Integer r2 = com.kongzue.dialogx.dialogs.PopMenu.access$3700(r0)
                int r2 = r2.intValue()
                r0.tintColor(r1, r2)
                java.util.List<android.view.View> r0 = r8.blurViews
                if (r0 == 0) goto L198
                java.util.Iterator r0 = r0.iterator()
            L180:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L198
                java.lang.Object r1 = r0.next()
                android.view.View r1 = (android.view.View) r1
                com.kongzue.dialogx.interfaces.BlurViewType r1 = (com.kongzue.dialogx.interfaces.BlurViewType) r1
                com.kongzue.dialogx.dialogs.PopMenu r2 = r8.this$0
                java.lang.Integer r2 = com.kongzue.dialogx.dialogs.PopMenu.access$3800(r2)
                r1.setOverlayColor(r2)
                goto L180
            L198:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                com.kongzue.dialogx.util.ItemDivider r1 = r0.itemDivider
                if (r1 == 0) goto L1be
                com.kongzue.dialogx.util.views.PopMenuListView r2 = r8.listMenu
                android.app.Activity r0 = r0.getOwnActivity()
                com.kongzue.dialogx.dialogs.PopMenu r3 = r8.this$0
                boolean r3 = r3.isLightTheme()
                android.graphics.drawable.Drawable r0 = r1.createDividerDrawable(r0, r3)
                r2.setDivider(r0)
                com.kongzue.dialogx.util.views.PopMenuListView r0 = r8.listMenu
                com.kongzue.dialogx.dialogs.PopMenu r1 = r8.this$0
                com.kongzue.dialogx.util.ItemDivider r1 = r1.itemDivider
                int r1 = r1.getWidth()
                r0.setDividerHeight(r1)
            L1be:
                com.kongzue.dialogx.dialogs.PopMenu r0 = r8.this$0
                com.kongzue.dialogx.dialogs.PopMenu.access$3900(r0)
            L1c3:
                return
        }
    }

    static {
            return
    }

    public PopMenu() {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            return
    }

    public PopMenu(android.view.View r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            r3.baseView(r4)
            r3.onBindView = r5
            return
    }

    public PopMenu(android.view.View r4, java.util.List<java.lang.CharSequence> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.menuList = r0
            r0.addAll(r5)
            r3.baseView(r4)
            return
    }

    public PopMenu(android.view.View r4, java.util.List<java.lang.CharSequence> r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            r3.baseView(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.menuList = r4
            r4.addAll(r5)
            r3.onBindView = r6
            return
    }

    public PopMenu(android.view.View r4, java.lang.CharSequence[] r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.menuList = r0
            java.util.List r5 = java.util.Arrays.asList(r5)
            r0.addAll(r5)
            r3.baseView(r4)
            return
    }

    public PopMenu(android.view.View r4, java.lang.CharSequence[] r5, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r6) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            r3.baseView(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.menuList = r4
            java.util.List r5 = java.util.Arrays.asList(r5)
            r4.addAll(r5)
            r3.onBindView = r6
            return
    }

    public PopMenu(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            r3.onBindView = r4
            return
    }

    public PopMenu(java.util.List<java.lang.CharSequence> r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.menuList = r0
            r0.addAll(r4)
            return
    }

    public PopMenu(java.util.List<java.lang.CharSequence> r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.menuList = r0
            r0.addAll(r4)
            r3.onBindView = r5
            return
    }

    public PopMenu(java.lang.CharSequence... r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.menuList = r0
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.addAll(r4)
            return
    }

    public PopMenu(java.lang.CharSequence[] r4, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r5) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.menuList = r0
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.addAll(r4)
            r3.onBindView = r5
            return
    }

    public PopMenu(java.lang.String... r4) {
            r3 = this;
            r3.<init>()
            r3.me = r3
            r0 = 1
            r3.bkgInterceptTouch = r0
            r3.autoTintIconInLightOrDarkMode = r0
            r3.overlayBaseView = r0
            r0 = -1
            r3.width = r0
            r3.height = r0
            r1 = 0
            r3.offScreen = r1
            int r2 = com.kongzue.dialogx.DialogX.defaultPopMenuBackgroundRadius
            float r2 = (float) r2
            r3.backgroundRadius = r2
            r3.pressedIndex = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3.menuUsability = r2
            r3.alignGravity = r0
            com.kongzue.dialogx.util.DialogXViewLoc r2 = new com.kongzue.dialogx.util.DialogXViewLoc
            r2.<init>()
            r3.baseViewLoc = r2
            r3.notCheckHash = r1
            r3.lastHash = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.menuList = r0
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.addAll(r4)
            return
    }

    public static /* synthetic */ void access$000(com.kongzue.dialogx.dialogs.PopMenu r0) {
            r0.refreshMenuLoc()
            return
    }

    public static /* synthetic */ android.view.ViewTreeObserver access$100(com.kongzue.dialogx.dialogs.PopMenu r0) {
            android.view.ViewTreeObserver r0 = r0.viewTreeObserver
            return r0
    }

    public static /* synthetic */ void access$1000(com.kongzue.dialogx.dialogs.PopMenu r0) {
            r0.onDialogShow()
            return
    }

    public static /* synthetic */ android.view.ViewTreeObserver access$102(com.kongzue.dialogx.dialogs.PopMenu r0, android.view.ViewTreeObserver r1) {
            r0.viewTreeObserver = r1
            return r1
    }

    public static /* synthetic */ boolean access$1102(com.kongzue.dialogx.dialogs.PopMenu r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ void access$1200(com.kongzue.dialogx.dialogs.PopMenu r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ void access$1300(com.kongzue.dialogx.dialogs.PopMenu r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1400(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1500(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1600(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1700(com.kongzue.dialogx.dialogs.PopMenu r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getIntStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$1800(com.kongzue.dialogx.dialogs.PopMenu r0, java.lang.Integer r1) {
            java.lang.Integer r0 = r0.getColorNullable(r1)
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$1900(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ void access$200(com.kongzue.dialogx.dialogs.PopMenu r0, android.view.ViewTreeObserver r1, android.view.ViewTreeObserver.OnDrawListener r2) {
            r0.removeDrawListener(r1, r2)
            return
    }

    public static /* synthetic */ java.lang.Float access$2000(com.kongzue.dialogx.dialogs.PopMenu r0, java.lang.Float r1) {
            java.lang.Float r0 = r0.getFloatStyleAttr(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2200(com.kongzue.dialogx.dialogs.PopMenu r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$2300(com.kongzue.dialogx.dialogs.PopMenu r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$2400(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$2500(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$2600(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ void access$2700(com.kongzue.dialogx.dialogs.PopMenu r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ int access$2802(com.kongzue.dialogx.dialogs.PopMenu r0, int r1) {
            r0.selectIndex = r1
            return r1
    }

    public static /* synthetic */ void access$2900(com.kongzue.dialogx.dialogs.PopMenu r0) {
            r0.onDialogInit()
            return
    }

    public static /* synthetic */ android.view.ViewTreeObserver.OnDrawListener access$300(com.kongzue.dialogx.dialogs.PopMenu r0) {
            android.view.ViewTreeObserver$OnDrawListener r0 = r0.baseViewDrawListener
            return r0
    }

    public static /* synthetic */ int[] access$3000(com.kongzue.dialogx.dialogs.PopMenu r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ android.view.ViewTreeObserver.OnDrawListener access$302(com.kongzue.dialogx.dialogs.PopMenu r0, android.view.ViewTreeObserver.OnDrawListener r1) {
            r0.baseViewDrawListener = r1
            return r1
    }

    public static /* synthetic */ int[] access$3100(com.kongzue.dialogx.dialogs.PopMenu r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3200(com.kongzue.dialogx.dialogs.PopMenu r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ int[] access$3300(com.kongzue.dialogx.dialogs.PopMenu r0) {
            int[] r0 = r0.screenPaddings
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3400(com.kongzue.dialogx.dialogs.PopMenu r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3500(com.kongzue.dialogx.dialogs.PopMenu r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3600(com.kongzue.dialogx.dialogs.PopMenu r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3700(com.kongzue.dialogx.dialogs.PopMenu r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ java.lang.Integer access$3800(com.kongzue.dialogx.dialogs.PopMenu r0) {
            java.lang.Integer r0 = r0.backgroundColor
            return r0
    }

    public static /* synthetic */ void access$3900(com.kongzue.dialogx.dialogs.PopMenu r0) {
            r0.onDialogRefreshUI()
            return
    }

    public static /* synthetic */ void access$400(com.kongzue.dialogx.dialogs.PopMenu r0, android.view.View r1) {
            r0.setDialogView(r1)
            return
    }

    public static /* synthetic */ boolean access$4000(com.kongzue.dialogx.dialogs.PopMenu r0) {
            boolean r0 = r0.dismissAnimFlag
            return r0
    }

    public static /* synthetic */ boolean access$4102(com.kongzue.dialogx.dialogs.PopMenu r0, boolean r1) {
            r0.dismissAnimFlag = r1
            return r1
    }

    public static /* synthetic */ void access$4200(android.view.View r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            return
    }

    public static /* synthetic */ void access$4300(java.lang.Runnable r0, long r1) {
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
            return
    }

    public static /* synthetic */ int access$4400(com.kongzue.dialogx.dialogs.PopMenu r0) {
            int r0 = r0.getBodyRealHeight()
            return r0
    }

    public static /* synthetic */ boolean access$4500(com.kongzue.dialogx.dialogs.PopMenu r0) {
            boolean r0 = r0.isShow
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$4700(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$4800(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ com.kongzue.dialogx.interfaces.DialogXStyle access$4900(com.kongzue.dialogx.dialogs.PopMenu r0) {
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r0.style
            return r0
    }

    public static /* synthetic */ java.util.List access$500(com.kongzue.dialogx.dialogs.PopMenu r0, android.view.View r1) {
            java.util.List r0 = r0.findAllBlurView(r1)
            return r0
    }

    public static /* synthetic */ long access$5000(com.kongzue.dialogx.dialogs.PopMenu r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$5100(com.kongzue.dialogx.dialogs.PopMenu r2) {
            long r0 = r2.exitAnimDuration
            return r0
    }

    public static /* synthetic */ long access$5200(com.kongzue.dialogx.dialogs.PopMenu r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ long access$5300(com.kongzue.dialogx.dialogs.PopMenu r2) {
            long r0 = r2.enterAnimDuration
            return r0
    }

    public static /* synthetic */ boolean access$600(com.kongzue.dialogx.dialogs.PopMenu r0) {
            boolean r0 = r0.closing
            return r0
    }

    public static /* synthetic */ boolean access$602(com.kongzue.dialogx.dialogs.PopMenu r0, boolean r1) {
            r0.closing = r1
            return r1
    }

    public static /* synthetic */ boolean access$702(com.kongzue.dialogx.dialogs.PopMenu r0, boolean r1) {
            r0.isShow = r1
            return r1
    }

    public static /* synthetic */ boolean access$802(com.kongzue.dialogx.dialogs.PopMenu r0, boolean r1) {
            r0.preShow = r1
            return r1
    }

    public static /* synthetic */ void access$900(com.kongzue.dialogx.dialogs.PopMenu r0, androidx.lifecycle.Lifecycle.State r1) {
            r0.setLifecycleState(r1)
            return
    }

    public static com.kongzue.dialogx.dialogs.PopMenu build() {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopMenu r1 = r0.setStyle(r1)
            return r1
    }

    private int getBodyRealHeight() {
            r3 = this;
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxBody
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxBody
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getHeight()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.boxBody
            r2.measure(r0, r1)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxBody
            int r0 = r0.getMeasuredHeight()
            return r0
    }

    private java.lang.String[] getTextArray(int[] r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L5
            r1 = r0
            goto L6
        L5:
            int r1 = r5.length
        L6:
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r0
        L9:
            if (r5 != 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            int r3 = r5.length
        Le:
            if (r2 >= r3) goto L1b
            r3 = r5[r2]
            java.lang.String r3 = r4.getString(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L1b:
            return r1
    }

    private void refreshMenuLoc() {
            r3 = this;
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L96
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r0.boxRoot
            if (r0 == 0) goto L96
            android.view.View r0 = r3.baseView()
            if (r0 != 0) goto L16
            goto L96
        L16:
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxBody
            r1 = 0
            r0.setTag(r1)
            com.kongzue.dialogx.util.DialogXViewLoc r0 = r3.getMenuLoc()
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxBody
            r1.setTag(r0)
            boolean r1 = r3.isEnterAnimRunning
            if (r1 != 0) goto L6f
            float r1 = r0.getX()
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.boxBody
            float r2 = r2.getX()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L50
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxBody
            float r2 = r0.getX()
            r1.setX(r2)
        L50:
            float r1 = r0.getY()
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.boxBody
            float r2 = r2.getY()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L6f
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxBody
            float r2 = r0.getY()
            r1.setY(r2)
        L6f:
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxBody
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r2 = r0.getW()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L96
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            float r0 = r0.getW()
            int r0 = (int) r0
            r2 = -2
            r1.<init>(r0, r2)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxBody
            r0.setLayoutParams(r1)
        L96:
            return
    }

    private void removeDrawListener(android.view.ViewTreeObserver r2, android.view.ViewTreeObserver.OnDrawListener r3) {
            r1 = this;
            if (r2 == 0) goto Le
            if (r3 == 0) goto Le
            boolean r0 = r2.isAlive()
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r2.removeOnDrawListener(r3)     // Catch: java.lang.Exception -> Le
        Le:
            return
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(android.view.View r1, java.util.List<java.lang.CharSequence> r2) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(android.view.View r1, java.util.List<java.lang.CharSequence> r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r3) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(android.view.View r1, java.lang.CharSequence[] r2) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(android.view.View r1, java.lang.CharSequence[] r2, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r3) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1, r2, r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(java.util.List<java.lang.CharSequence> r1) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(java.util.List<java.lang.CharSequence> r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r2) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(java.lang.CharSequence... r1) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(java.lang.CharSequence[] r1, com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r2) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1, r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.PopMenu show(java.lang.String... r1) {
            com.kongzue.dialogx.dialogs.PopMenu r0 = new com.kongzue.dialogx.dialogs.PopMenu
            r0.<init>(r1)
            r0.show()
            return r0
    }

    public android.view.View baseView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.baseViewWeakReference
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        Lc:
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu baseView(android.view.View r2) {
            r1 = this;
            if (r2 != 0) goto Ld
            java.lang.ref.WeakReference<android.view.View> r0 = r1.baseViewWeakReference
            if (r0 == 0) goto Ld
            r0.clear()
            r2 = 0
            r1.baseViewWeakReference = r2
            goto L14
        Ld:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.baseViewWeakReference = r0
        L14:
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
            r0 = this;
            r0.dismiss()
            return
    }

    public com.kongzue.dialogx.dialogs.PopMenu cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public java.lang.String dialogKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r2.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu disableAllMenu() {
            r4 = this;
            java.util.List<java.lang.CharSequence> r0 = r4.menuList
            if (r0 == 0) goto L21
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            r0 = 0
        Lb:
            java.util.List<java.lang.CharSequence> r1 = r4.menuList
            int r1 = r1.size()
            if (r0 >= r1) goto L3e
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = r4.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto Lb
        L21:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DialogX: "
            r0.append(r1)
            java.lang.String r1 = r4.dialogKey()
            r0.append(r1)
            java.lang.String r1 = " .disableAllMenu()执行失败，请先初始化菜单项 menuList"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.kongzue.dialogx.interfaces.BaseDialog.error(r0)
        L3e:
            return r4
    }

    public com.kongzue.dialogx.dialogs.PopMenu disableMenu(int... r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L14
            r2 = r6[r1]
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r5.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto L2
        L14:
            return r5
    }

    public com.kongzue.dialogx.dialogs.PopMenu disableMenu(java.lang.CharSequence... r6) {
            r5 = this;
            java.util.List<java.lang.CharSequence> r0 = r5.menuList
            if (r0 == 0) goto L24
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            int r0 = r6.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L49
            r2 = r6[r1]
            java.util.List<java.lang.CharSequence> r3 = r5.menuList
            int r2 = r3.indexOf(r2)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r5.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto Lc
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DialogX: "
            r0.append(r1)
            java.lang.String r1 = r5.dialogKey()
            r0.append(r1)
            java.lang.String r1 = " .disableMenu("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")执行失败，请先初始化菜单项 menuList"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.kongzue.dialogx.interfaces.BaseDialog.error(r6)
        L49:
            return r5
    }

    public com.kongzue.dialogx.dialogs.PopMenu disableMenu(java.lang.String... r6) {
            r5 = this;
            java.util.List<java.lang.CharSequence> r0 = r5.menuList
            if (r0 == 0) goto L24
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            int r0 = r6.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L49
            r2 = r6[r1]
            java.util.List<java.lang.CharSequence> r3 = r5.menuList
            int r2 = r3.indexOf(r2)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r5.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto Lc
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DialogX: "
            r0.append(r1)
            java.lang.String r1 = r5.dialogKey()
            r0.append(r1)
            java.lang.String r1 = " .disableMenu("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")执行失败，请先初始化菜单项 menuList"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.kongzue.dialogx.interfaces.BaseDialog.error(r6)
        L49:
            return r5
    }

    public void dismiss() {
            r1 = this;
            r0 = 1
            r1.closing = r0
            com.kongzue.dialogx.dialogs.PopMenu$3 r0 = new com.kongzue.dialogx.dialogs.PopMenu$3
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.PopMenu enableAllMenu() {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r1.menuUsability
            r0.clear()
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu enableMenu(int... r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L14
            r2 = r6[r1]
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r5.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto L2
        L14:
            return r5
    }

    public com.kongzue.dialogx.dialogs.PopMenu enableMenu(java.lang.CharSequence... r6) {
            r5 = this;
            java.util.List<java.lang.CharSequence> r0 = r5.menuList
            if (r0 == 0) goto L24
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            int r0 = r6.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L49
            r2 = r6[r1]
            java.util.List<java.lang.CharSequence> r3 = r5.menuList
            int r2 = r3.indexOf(r2)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r5.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto Lc
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DialogX: "
            r0.append(r1)
            java.lang.String r1 = r5.dialogKey()
            r0.append(r1)
            java.lang.String r1 = " .enableMenu("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")执行失败，请先初始化菜单项 menuList"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.kongzue.dialogx.interfaces.BaseDialog.error(r6)
        L49:
            return r5
    }

    public com.kongzue.dialogx.dialogs.PopMenu enableMenu(java.lang.String... r6) {
            r5 = this;
            java.util.List<java.lang.CharSequence> r0 = r5.menuList
            if (r0 == 0) goto L24
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            int r0 = r6.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L49
            r2 = r6[r1]
            java.util.List<java.lang.CharSequence> r3 = r5.menuList
            int r2 = r3.indexOf(r2)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = r5.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.put(r2, r4)
            int r1 = r1 + 1
            goto Lc
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DialogX: "
            r0.append(r1)
            java.lang.String r1 = r5.dialogKey()
            r0.append(r1)
            java.lang.String r1 = " .enableMenu("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")执行失败，请先初始化菜单项 menuList"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.kongzue.dialogx.interfaces.BaseDialog.error(r6)
        L49:
            return r5
    }

    public int getAlignGravity() {
            r1 = this;
            int r0 = r1.alignGravity
            return r0
    }

    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    public android.view.View getBaseView() {
            r1 = this;
            android.view.View r0 = r1.baseView()
            return r0
    }

    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopMenu> getDialogLifecycleCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.dialogLifecycleCallback
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.PopMenu$5 r0 = new com.kongzue.dialogx.dialogs.PopMenu$5
            r0.<init>(r1)
        L9:
            return r0
    }

    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopMenu> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.dialogXAnimImpl
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public int getIconResIds(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.iconResIds
            if (r0 == 0) goto L19
            if (r2 < 0) goto L19
            int r0 = r0.size()
            if (r2 >= r0) goto L19
            java.util.List<java.lang.Integer> r0 = r1.iconResIds
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L19:
            r2 = 0
            return r2
    }

    public java.util.List<java.lang.Integer> getIconResIds() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.iconResIds
            return r0
    }

    public com.kongzue.dialogx.util.ItemDivider getItemDivider() {
            r1 = this;
            com.kongzue.dialogx.util.ItemDivider r0 = r1.itemDivider
            return r0
    }

    public java.util.List<java.lang.CharSequence> getMenuList() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.menuList
            return r0
    }

    public com.kongzue.dialogx.util.DialogXViewLoc getMenuLoc() {
            r14 = this;
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r14.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxBody
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r0 instanceof com.kongzue.dialogx.util.DialogXViewLoc
            if (r0 == 0) goto L1b
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r14.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxBody
            java.lang.Object r0 = r0.getTag()
            com.kongzue.dialogx.util.DialogXViewLoc r0 = (com.kongzue.dialogx.util.DialogXViewLoc) r0
            return r0
        L1b:
            com.kongzue.dialogx.util.DialogXViewLoc r0 = new com.kongzue.dialogx.util.DialogXViewLoc
            r0.<init>()
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r14.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxBody
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r2 = r14.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r2.boxRoot
            com.kongzue.dialogx.util.DialogXViewLoc r3 = r14.baseViewLoc
            float r3 = r3.getX()
            int r3 = (int) r3
            com.kongzue.dialogx.util.DialogXViewLoc r4 = r14.baseViewLoc
            float r4 = r4.getY()
            int r4 = (int) r4
            int r5 = r14.alignGravity
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L272
            r5 = 16
            boolean r5 = r14.isAlignGravity(r5)
            if (r5 == 0) goto L5f
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 / 2
            int r5 = r5 + r4
            int r8 = r1.getHeight()
            int r8 = r8 / 2
            int r5 = r5 - r8
            int r5 = java.lang.Math.max(r7, r5)
            goto L60
        L5f:
            r5 = r7
        L60:
            r8 = 1
            boolean r8 = r14.isAlignGravity(r8)
            if (r8 == 0) goto L86
            int r8 = r14.getWidth()
            if (r8 <= 0) goto L7f
            android.view.View r8 = r14.baseView()
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 / 2
            int r9 = r14.getWidth()
            int r9 = r9 / 2
            int r8 = r8 - r9
            goto L80
        L7f:
            r8 = r7
        L80:
            int r8 = r8 + r3
            int r8 = java.lang.Math.max(r7, r8)
            goto L87
        L86:
            r8 = r7
        L87:
            r9 = 17
            boolean r9 = r14.isAlignGravity(r9)
            if (r9 == 0) goto Lc3
            int r5 = r14.getWidth()
            if (r5 <= 0) goto La7
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 / 2
            int r8 = r14.getWidth()
            int r8 = r8 / 2
            int r5 = r5 - r8
            goto La8
        La7:
            r5 = r7
        La8:
            int r5 = r5 + r3
            int r8 = java.lang.Math.max(r7, r5)
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 / 2
            int r5 = r5 + r4
            int r9 = r1.getHeight()
            int r9 = r9 / 2
            int r5 = r5 - r9
            int r5 = java.lang.Math.max(r7, r5)
        Lc3:
            boolean r9 = r14.overlayBaseView
            r10 = 80
            r11 = 5
            r12 = 3
            r13 = 48
            if (r9 == 0) goto L17b
            boolean r9 = r14.isAlignGravity(r13)
            if (r9 == 0) goto L101
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r4
            int r9 = r1.getHeight()
            int r5 = r5 - r9
            if (r8 != 0) goto L101
            int r8 = r14.getWidth()
            if (r8 <= 0) goto Lfb
            android.view.View r8 = r14.baseView()
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 / 2
            int r9 = r14.getWidth()
            int r9 = r9 / 2
            int r8 = r8 - r9
            goto Lfc
        Lfb:
            r8 = r7
        Lfc:
            int r8 = r8 + r3
            int r8 = java.lang.Math.max(r7, r8)
        L101:
            boolean r9 = r14.isAlignGravity(r12)
            if (r9 == 0) goto L131
            android.view.View r8 = r14.baseView()
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r3
            int r9 = r1.getWidth()
            int r8 = r8 - r9
            int r8 = java.lang.Math.max(r7, r8)
            if (r5 != 0) goto L131
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 / 2
            int r5 = r5 + r4
            int r9 = r1.getHeight()
            int r9 = r9 / 2
            int r5 = r5 - r9
            int r5 = java.lang.Math.max(r7, r5)
        L131:
            boolean r9 = r14.isAlignGravity(r11)
            if (r9 == 0) goto L150
            if (r5 != 0) goto L14f
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 / 2
            int r5 = r5 + r4
            int r8 = r1.getHeight()
            int r8 = r8 / 2
            int r5 = r5 - r8
            int r5 = java.lang.Math.max(r7, r5)
        L14f:
            r8 = r3
        L150:
            boolean r9 = r14.isAlignGravity(r10)
            if (r9 == 0) goto L178
            if (r8 != 0) goto L231
            int r5 = r14.getWidth()
            if (r5 <= 0) goto L170
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 / 2
            int r8 = r14.getWidth()
            int r8 = r8 / 2
            int r5 = r5 - r8
            goto L171
        L170:
            r5 = r7
        L171:
            int r3 = r3 + r5
            int r8 = java.lang.Math.max(r7, r3)
            goto L231
        L178:
            r4 = r5
            goto L231
        L17b:
            boolean r9 = r14.isAlignGravity(r13)
            if (r9 == 0) goto L1ab
            int r5 = r1.getHeight()
            int r5 = r4 - r5
            int r5 = java.lang.Math.max(r7, r5)
            if (r8 != 0) goto L1ab
            int r8 = r14.getWidth()
            if (r8 <= 0) goto L1a5
            android.view.View r8 = r14.baseView()
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 / 2
            int r9 = r14.getWidth()
            int r9 = r9 / 2
            int r8 = r8 - r9
            goto L1a6
        L1a5:
            r8 = r7
        L1a6:
            int r8 = r8 + r3
            int r8 = java.lang.Math.max(r7, r8)
        L1ab:
            boolean r9 = r14.isAlignGravity(r12)
            if (r9 == 0) goto L1d3
            int r8 = r1.getWidth()
            int r8 = r3 - r8
            int r8 = java.lang.Math.max(r7, r8)
            if (r5 != 0) goto L1d3
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 / 2
            int r5 = r5 + r4
            int r9 = r1.getHeight()
            int r9 = r9 / 2
            int r5 = r5 - r9
            int r5 = java.lang.Math.max(r7, r5)
        L1d3:
            boolean r9 = r14.isAlignGravity(r11)
            if (r9 == 0) goto L1fe
            android.view.View r8 = r14.baseView()
            int r8 = r8.getWidth()
            int r8 = r8 + r3
            int r8 = java.lang.Math.max(r7, r8)
            if (r5 != 0) goto L1fe
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 / 2
            int r5 = r5 + r4
            int r9 = r1.getHeight()
            int r9 = r9 / 2
            int r5 = r5 - r9
            int r5 = java.lang.Math.max(r7, r5)
        L1fe:
            boolean r9 = r14.isAlignGravity(r10)
            if (r9 == 0) goto L178
            android.view.View r5 = r14.baseView()
            int r5 = r5.getHeight()
            int r4 = r4 + r5
            int r4 = java.lang.Math.max(r7, r4)
            if (r8 != 0) goto L231
            int r5 = r14.getWidth()
            if (r5 <= 0) goto L22b
            android.view.View r5 = r14.baseView()
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 / 2
            int r8 = r14.getWidth()
            int r8 = r8 / 2
            int r5 = r5 - r8
            goto L22c
        L22b:
            r5 = r7
        L22c:
            int r3 = r3 + r5
            int r8 = java.lang.Math.max(r7, r3)
        L231:
            boolean r3 = r14.offScreen
            if (r3 != 0) goto L268
            if (r8 >= 0) goto L238
            r8 = r7
        L238:
            int r3 = r1.getWidth()
            int r3 = r3 + r8
            int r5 = r2.getUseAreaWidth()
            if (r3 <= r5) goto L24d
            int r3 = r2.getUseAreaWidth()
            int r5 = r1.getWidth()
            int r3 = r3 - r5
            r8 = r3
        L24d:
            if (r4 >= 0) goto L250
            goto L251
        L250:
            r7 = r4
        L251:
            int r3 = r1.getHeight()
            int r3 = r3 + r7
            int r4 = r2.getUseAreaHeight()
            if (r3 <= r4) goto L267
            int r2 = r2.getUseAreaHeight()
            int r1 = r1.getHeight()
            int r4 = r2 - r1
            goto L268
        L267:
            r4 = r7
        L268:
            float r1 = (float) r8
            com.kongzue.dialogx.util.DialogXViewLoc r1 = r0.setX(r1)
            float r2 = (float) r4
            r1.setY(r2)
            goto L2d6
        L272:
            int r3 = r14.height
            if (r3 != r6) goto L27e
            android.view.View r3 = r14.baseView()
            int r3 = r3.getHeight()
        L27e:
            com.kongzue.dialogx.util.DialogXViewLoc r4 = r14.baseViewLoc
            float r4 = r4.getX()
            int r4 = (int) r4
            com.kongzue.dialogx.util.DialogXViewLoc r5 = r14.baseViewLoc
            float r5 = r5.getY()
            boolean r8 = r14.overlayBaseView
            if (r8 == 0) goto L290
            r3 = r7
        L290:
            float r3 = (float) r3
            float r5 = r5 + r3
            int r3 = r14.selectItemYDeviation
            float r3 = (float) r3
            float r5 = r5 + r3
            int r3 = (int) r5
            boolean r5 = r14.offScreen
            if (r5 != 0) goto L2cd
            if (r4 >= 0) goto L29e
            r4 = r7
        L29e:
            int r5 = r1.getWidth()
            int r5 = r5 + r4
            int r8 = r2.getUseAreaWidth()
            if (r5 <= r8) goto L2b2
            int r4 = r2.getUseAreaWidth()
            int r5 = r1.getWidth()
            int r4 = r4 - r5
        L2b2:
            if (r3 >= 0) goto L2b5
            goto L2b6
        L2b5:
            r7 = r3
        L2b6:
            int r3 = r1.getHeight()
            int r3 = r3 + r7
            int r5 = r2.getUseAreaHeight()
            if (r3 <= r5) goto L2cc
            int r2 = r2.getUseAreaHeight()
            int r1 = r1.getHeight()
            int r3 = r2 - r1
            goto L2cd
        L2cc:
            r3 = r7
        L2cd:
            float r1 = (float) r4
            com.kongzue.dialogx.util.DialogXViewLoc r1 = r0.setX(r1)
            float r2 = (float) r3
            r1.setY(r2)
        L2d6:
            int r1 = r14.width
            if (r1 != r6) goto L2e2
            android.view.View r1 = r14.baseView()
            int r1 = r1.getWidth()
        L2e2:
            int r2 = r14.height
            if (r2 != r6) goto L2ee
            android.view.View r2 = r14.baseView()
            int r2 = r2.getHeight()
        L2ee:
            float r1 = (float) r1
            com.kongzue.dialogx.util.DialogXViewLoc r1 = r0.setW(r1)
            float r2 = (float) r2
            r1.setH(r2)
            return r0
    }

    public com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.PopMenu> getMenuMenuItemLayoutRefreshCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.menuMenuItemLayoutRefreshCallback
            return r0
    }

    public com.kongzue.dialogx.util.TextInfo getMenuTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.menuTextInfo
            if (r0 != 0) goto L6
            com.kongzue.dialogx.util.TextInfo r0 = com.kongzue.dialogx.DialogX.menuTextInfo
        L6:
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.PopMenu> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.onBackPressedListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.PopMenu> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.PopMenu> getOnIconChangeCallBack() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.onIconChangeCallBack
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.PopMenu> getOnMenuItemClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.onMenuItemClickListener
            if (r0 != 0) goto L9
            com.kongzue.dialogx.dialogs.PopMenu$6 r0 = new com.kongzue.dialogx.dialogs.PopMenu$6
            r0.<init>(r1)
        L9:
            return r0
    }

    public int getPressedIndex() {
            r1 = this;
            int r0 = r1.pressedIndex
            return r0
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.backgroundRadius
            return r0
    }

    public int getSelectIndex() {
            r1 = this;
            int r0 = r1.selectIndex
            return r0
    }

    public java.lang.CharSequence getSelectMenuText() {
            r2 = this;
            java.util.List<java.lang.CharSequence> r0 = r2.menuList
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            int r1 = r2.selectIndex
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public void hide() {
            r2 = this;
            r0 = 1
            r2.isHide = r0
            r0 = 0
            r2.hideWithExitAnim = r0
            android.view.View r0 = r2.getDialogView()
            if (r0 == 0) goto L15
            android.view.View r0 = r2.getDialogView()
            r1 = 8
            r0.setVisibility(r1)
        L15:
            return
    }

    public void hideWithExitAnim() {
            r3 = this;
            r0 = 1
            r3.hideWithExitAnim = r0
            r3.isHide = r0
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L2f
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.PopMenu r1 = r3.me
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.boxBody
            r0.doExitAnim(r1, r2)
            com.kongzue.dialogx.dialogs.PopMenu$7 r0 = new com.kongzue.dialogx.dialogs.PopMenu$7
            r0.<init>(r3)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r3.getDialogImpl()
            r2 = 0
            long r1 = r1.getExitAnimationDuration(r2)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMainDelay(r0, r1)
        L2f:
            return
    }

    public boolean isAlignGravity(int r2) {
            r1 = this;
            int r0 = r1.alignGravity
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
            r1 = this;
            boolean r0 = r1.autoTintIconInLightOrDarkMode
            return r0
    }

    public boolean isBkgInterceptTouch() {
            r1 = this;
            boolean r0 = r1.bkgInterceptTouch
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean isMenuItemEnable(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = r1.menuUsability
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L10
            r2 = 1
            return r2
        L10:
            boolean r2 = r2.booleanValue()
            return r2
    }

    public boolean isOffScreen() {
            r1 = this;
            boolean r0 = r1.offScreen
            return r0
    }

    public boolean isOverlayBaseView() {
            r1 = this;
            boolean r0 = r1.overlayBaseView
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    public void onDismiss(com.kongzue.dialogx.dialogs.PopMenu r1) {
            r0 = this;
            return
    }

    public com.kongzue.dialogx.dialogs.PopMenu onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.onShowRunnable = r1
            boolean r1 = r0.isShow()
            if (r1 == 0) goto Lf
            com.kongzue.dialogx.interfaces.DialogXRunnable r1 = r0.onShowRunnable
            if (r1 == 0) goto Lf
            r1.run(r0)
        Lf:
            return r0
    }

    public void onShow(com.kongzue.dialogx.dialogs.PopMenu r1) {
            r0 = this;
            return
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.PopMenu$4 r0 = new com.kongzue.dialogx.dialogs.PopMenu$4
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    public com.kongzue.dialogx.dialogs.PopMenu removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r0 = r1.onBindView
            r0.clean()
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void restartDialog() {
            r2 = this;
            android.view.View r0 = r2.getDialogView()
            if (r0 == 0) goto L32
            android.view.ViewTreeObserver$OnDrawListener r0 = r2.baseViewDrawListener
            if (r0 == 0) goto L28
            android.view.ViewTreeObserver r1 = r2.viewTreeObserver
            if (r1 == 0) goto L12
            r2.removeDrawListener(r1, r0)
            goto L25
        L12:
            android.view.View r0 = r2.baseView()
            if (r0 == 0) goto L25
            android.view.View r0 = r2.baseView()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnDrawListener r1 = r2.baseViewDrawListener
            r2.removeDrawListener(r0, r1)
        L25:
            r0 = 0
            r2.baseViewDrawListener = r0
        L28:
            android.view.View r0 = r2.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.dismiss(r0)
            r0 = 0
            r2.isShow = r0
        L32:
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r2.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            if (r0 == 0) goto L43
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r2.getDialogImpl()
            android.widget.RelativeLayout r0 = r0.boxCustom
            r0.removeAllViews()
        L43:
            r2.show()
            return
    }

    public com.kongzue.dialogx.dialogs.PopMenu setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.PopMenu> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setAlignGravity(int r1) {
            r0 = this;
            r0.alignGravity = r1
            r0.refreshMenuLoc()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setAutoTintIconInLightOrDarkMode(boolean r1) {
            r0 = this;
            r0.autoTintIconInLightOrDarkMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setBaseView(android.view.View r1) {
            r0 = this;
            r0.baseView(r1)
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    public com.kongzue.dialogx.dialogs.PopMenu setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopMenu setData(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.data = r0
        Lb:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.data
            r0.put(r2, r3)
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.PopMenu r1 = r0.setData(r1, r2)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.PopMenu> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.PopMenu r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopMenu setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.PopMenu r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            r0.isHapticFeedbackEnabled = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setHeight(int r1) {
            r0 = this;
            r0.height = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setIconResIds(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.iconResIds = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setIconResIds(int... r5) {
            r4 = this;
            java.util.List<java.lang.Integer> r0 = r4.iconResIds
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.iconResIds = r0
        Lb:
            int r0 = r5.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            r2 = r5[r1]
            java.util.List<java.lang.Integer> r3 = r4.iconResIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto Ld
        L1d:
            r4.refreshUI()
            return r4
    }

    public com.kongzue.dialogx.dialogs.PopMenu setItemDivider(com.kongzue.dialogx.util.ItemDivider r1) {
            r0 = this;
            r0.itemDivider = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenuList(java.util.List<java.lang.CharSequence> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
            r0.addAll(r2)
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenuList(java.lang.CharSequence[] r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenuList(java.lang.String[] r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenuMenuItemLayoutRefreshCallback(com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.menuMenuItemLayoutRefreshCallback = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenuTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.menuTextInfo = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenus(int... r1) {
            r0 = this;
            java.lang.String[] r1 = r0.getTextArray(r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenus(java.lang.CharSequence... r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setMenus(java.lang.String... r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            r1.refreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setOffScreen(boolean r1) {
            r0 = this;
            r0.offScreen = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setOnIconChangeCallBack(com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.onIconChangeCallBack = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setOnMenuItemClickListener(com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.PopMenu> r1) {
            r0 = this;
            r0.onMenuItemClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setOverlayBaseView(boolean r1) {
            r0 = this;
            r0.overlayBaseView = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setPressedIndex(int r1) {
            r0 = this;
            r0.pressedIndex = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.PopMenu setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopMenu setThisOrderIndex(int r2) {
            r1 = this;
            r1.thisOrderIndex = r2
            android.view.View r0 = r1.getDialogView()
            if (r0 == 0) goto L10
            android.view.View r0 = r1.getDialogView()
            float r2 = (float) r2
            r0.setTranslationZ(r2)
        L10:
            return r1
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.PopMenu r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    public com.kongzue.dialogx.dialogs.PopMenu setWidth(int r1) {
            r0 = this;
            r0.width = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.PopMenu show() {
            r3 = this;
            boolean r0 = r3.isHide
            if (r0 == 0) goto L54
            android.view.View r0 = r3.getDialogView()
            if (r0 == 0) goto L54
            boolean r0 = r3.isShow
            if (r0 == 0) goto L54
            boolean r0 = r3.hideWithExitAnim
            r1 = 0
            if (r0 == 0) goto L4c
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            if (r0 == 0) goto L4c
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.boxBody
            r0.clearAnimation()
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r0.boxRoot
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.alpha(r1)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r0 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r0 = r0.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.PopMenu r1 = r3.me
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r2 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r2.boxBody
            r0.doShowAnim(r1, r2)
            goto L53
        L4c:
            android.view.View r0 = r3.getDialogView()
            r0.setVisibility(r1)
        L53:
            return r3
        L54:
            super.beforeShow()
            android.view.View r0 = r3.getDialogView()
            if (r0 != 0) goto Lbc
            boolean r0 = r3.isLightTheme()
            if (r0 == 0) goto L66
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popmenu_material
            goto L68
        L66:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popmenu_material_dark
        L68:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r3.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            if (r1 == 0) goto L94
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r3.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            boolean r2 = r3.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto L94
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r3.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r0 = r0.popMenuSettings()
            boolean r1 = r3.isLightTheme()
            int r0 = r0.layout(r1)
        L94:
            boolean r1 = r3.isLightTheme()
            int r1 = r3.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto La6
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
        La6:
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto Lb8
            com.kongzue.dialogx.dialogs.PopMenu r1 = r3.me
            r0.setTag(r1)
        Lb8:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
            goto Lc3
        Lbc:
            android.view.View r0 = r3.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r0)
        Lc3:
            android.view.View r0 = r3.baseView()
            if (r0 == 0) goto Ldd
            android.view.View r0 = r3.baseView()
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r3.viewTreeObserver = r0
            com.kongzue.dialogx.dialogs.PopMenu$1 r1 = new com.kongzue.dialogx.dialogs.PopMenu$1
            r1.<init>(r3)
            r3.baseViewDrawListener = r1
            r0.addOnDrawListener(r1)
        Ldd:
            return r3
    }

    public com.kongzue.dialogx.dialogs.PopMenu show(android.app.Activity r4) {
            r3 = this;
            boolean r0 = r3.isHide
            if (r0 == 0) goto L54
            android.view.View r0 = r3.getDialogView()
            if (r0 == 0) goto L54
            boolean r0 = r3.isShow
            if (r0 == 0) goto L54
            boolean r4 = r3.hideWithExitAnim
            r0 = 0
            if (r4 == 0) goto L4c
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r4 = r3.getDialogImpl()
            if (r4 == 0) goto L4c
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r4 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r4 = r4.boxBody
            r4.clearAnimation()
            android.view.View r4 = r3.getDialogView()
            r4.setVisibility(r0)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r4 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r4 = r4.boxRoot
            android.view.ViewPropertyAnimator r4 = r4.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.alpha(r0)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r4 = r3.getDialogImpl()
            com.kongzue.dialogx.interfaces.DialogXAnimInterface r4 = r4.getDialogXAnimImpl()
            com.kongzue.dialogx.dialogs.PopMenu r0 = r3.me
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = r3.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r1.boxBody
            r4.doShowAnim(r0, r1)
            goto L53
        L4c:
            android.view.View r4 = r3.getDialogView()
            r4.setVisibility(r0)
        L53:
            return r3
        L54:
            super.beforeShow()
            android.view.View r0 = r3.getDialogView()
            if (r0 != 0) goto Lbc
            boolean r0 = r3.isLightTheme()
            if (r0 == 0) goto L66
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popmenu_material
            goto L68
        L66:
            int r0 = com.kongzue.dialogx.R.layout.layout_dialogx_popmenu_material_dark
        L68:
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r3.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            if (r1 == 0) goto L94
            com.kongzue.dialogx.interfaces.DialogXStyle r1 = r3.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r1 = r1.popMenuSettings()
            boolean r2 = r3.isLightTheme()
            int r1 = r1.layout(r2)
            if (r1 == 0) goto L94
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r3.getStyle()
            com.kongzue.dialogx.interfaces.DialogXStyle$PopMenuSettings r0 = r0.popMenuSettings()
            boolean r1 = r3.isLightTheme()
            int r0 = r0.layout(r1)
        L94:
            boolean r1 = r3.isLightTheme()
            int r1 = r3.getCustomDialogLayoutResId(r1)
            if (r1 == 0) goto La6
            boolean r0 = r3.isLightTheme()
            int r0 = r3.getCustomDialogLayoutResId(r0)
        La6:
            android.view.View r0 = r3.createView(r0)
            com.kongzue.dialogx.dialogs.PopMenu$DialogImpl r1 = new com.kongzue.dialogx.dialogs.PopMenu$DialogImpl
            r1.<init>(r3, r0)
            r3.dialogImpl = r1
            if (r0 == 0) goto Lb8
            com.kongzue.dialogx.dialogs.PopMenu r1 = r3.me
            r0.setTag(r1)
        Lb8:
            com.kongzue.dialogx.interfaces.BaseDialog.show(r4, r0)
            goto Lc3
        Lbc:
            android.view.View r0 = r3.getDialogView()
            com.kongzue.dialogx.interfaces.BaseDialog.show(r4, r0)
        Lc3:
            android.view.View r4 = r3.baseView()
            if (r4 == 0) goto Ldd
            android.view.View r4 = r3.baseView()
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
            r3.viewTreeObserver = r4
            com.kongzue.dialogx.dialogs.PopMenu$2 r0 = new com.kongzue.dialogx.dialogs.PopMenu$2
            r0.<init>(r3)
            r3.baseViewDrawListener = r0
            r4.addOnDrawListener(r0)
        Ldd:
            return r3
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog show() {
            r1 = this;
            com.kongzue.dialogx.dialogs.PopMenu r0 = r1.show()
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            return
    }
}
