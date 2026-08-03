package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class BottomMenu extends com.kongzue.dialogx.dialogs.BottomDialog {
    public static final int ITEM_CLICK_DELAY = 100;
    protected boolean autoTintIconInLightOrDarkMode;
    protected java.util.List<java.lang.Integer> iconResIds;
    protected com.kongzue.dialogx.util.ItemDivider itemDivider;
    private long lastClickTime;
    protected com.kongzue.dialogx.util.views.DialogListView listView;
    protected com.kongzue.dialogx.dialogs.BottomMenu me;
    protected com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.BottomMenu> menuItemTextInfoInterceptor;
    protected java.util.List<java.lang.CharSequence> menuList;
    protected android.widget.BaseAdapter menuListAdapter;
    protected com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.BottomMenu> menuMenuItemLayoutRefreshCallback;
    protected java.util.Map<java.lang.Integer, java.lang.Boolean> menuUsability;
    protected com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.BottomMenu> onIconChangeCallBack;
    protected com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> onMenuItemClickListener;
    private int[] resultArray;
    protected com.kongzue.dialogx.interfaces.SELECT_MODE selectMode;
    private java.lang.CharSequence[] selectTextArray;
    protected int selectionIndex;
    protected java.util.ArrayList<java.lang.Integer> selectionItems;
    protected boolean showSelectedBackgroundTips;
    private float touchDownY;





    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.BottomMenu$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE = null;

        static {
                com.kongzue.dialogx.interfaces.SELECT_MODE[] r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.dialogs.BottomMenu.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE = r0
                com.kongzue.dialogx.interfaces.SELECT_MODE r1 = com.kongzue.dialogx.interfaces.SELECT_MODE.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.dialogs.BottomMenu.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.interfaces.SELECT_MODE r1 = com.kongzue.dialogx.interfaces.SELECT_MODE.SINGLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.dialogs.BottomMenu.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.interfaces.SELECT_MODE r1 = com.kongzue.dialogx.interfaces.SELECT_MODE.MULTIPLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public BottomMenu() {
            r2 = this;
            r2.<init>()
            r2.me = r2
            r0 = -1
            r2.selectionIndex = r0
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.NONE
            r2.selectMode = r0
            r0 = 0
            r2.showSelectedBackgroundTips = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.menuUsability = r0
            r0 = 1
            r2.autoTintIconInLightOrDarkMode = r0
            r0 = 0
            r2.lastClickTime = r0
            return
    }

    public static /* synthetic */ float access$000(com.kongzue.dialogx.dialogs.BottomMenu r0) {
            float r0 = r0.touchDownY
            return r0
    }

    public static /* synthetic */ float access$002(com.kongzue.dialogx.dialogs.BottomMenu r0, float r1) {
            r0.touchDownY = r1
            return r1
    }

    public static /* synthetic */ void access$100(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ void access$200(com.kongzue.dialogx.dialogs.BottomMenu r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ long access$300(com.kongzue.dialogx.dialogs.BottomMenu r2) {
            long r0 = r2.lastClickTime
            return r0
    }

    public static /* synthetic */ long access$302(com.kongzue.dialogx.dialogs.BottomMenu r0, long r1) {
            r0.lastClickTime = r1
            return r1
    }

    public static /* synthetic */ void access$400(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ void access$500(java.lang.Object r0) {
            com.kongzue.dialogx.interfaces.BaseDialog.log(r0)
            return
    }

    public static /* synthetic */ int[] access$600(com.kongzue.dialogx.dialogs.BottomMenu r0) {
            int[] r0 = r0.resultArray
            return r0
    }

    public static /* synthetic */ int[] access$602(com.kongzue.dialogx.dialogs.BottomMenu r0, int[] r1) {
            r0.resultArray = r1
            return r1
    }

    public static /* synthetic */ java.lang.CharSequence[] access$700(com.kongzue.dialogx.dialogs.BottomMenu r0) {
            java.lang.CharSequence[] r0 = r0.selectTextArray
            return r0
    }

    public static /* synthetic */ java.lang.CharSequence[] access$702(com.kongzue.dialogx.dialogs.BottomMenu r0, java.lang.CharSequence[] r1) {
            r0.selectTextArray = r1
            return r1
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu build() {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setStyle(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCustomView(r1)
            return r1
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

    private boolean isSameSize(int r3) {
            r2 = this;
            java.util.List<java.lang.CharSequence> r0 = r2.menuList
            r1 = 1
            if (r0 == 0) goto L16
            int r0 = r0.size()
            if (r0 != 0) goto Lc
            goto L16
        Lc:
            java.util.List<java.lang.CharSequence> r0 = r2.menuList
            int r0 = r0.size()
            if (r0 != r3) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, int r2, java.util.List<java.lang.CharSequence> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, int r2, java.util.List<java.lang.CharSequence> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setOnMenuItemClickListener(r4)
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, int r2, java.lang.CharSequence[] r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, int r2, java.lang.CharSequence[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, int r2, java.lang.String[] r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, int r2, java.lang.String[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, java.util.List<java.lang.CharSequence> r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, java.util.List<java.lang.CharSequence> r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setOnMenuItemClickListener(r3)
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, java.lang.CharSequence[] r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, java.lang.CharSequence[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, java.lang.String[] r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(int r1, java.lang.String[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.CharSequence> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.CharSequence> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence[] r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.String[] r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.String[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.util.List<java.lang.CharSequence> r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.util.List<java.lang.CharSequence> r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence[] r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.CharSequence[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.String[] r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence r1, java.lang.String[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.CharSequence> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.CharSequence> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String r1, java.lang.String r2, java.lang.CharSequence[] r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String r1, java.lang.String r2, java.lang.CharSequence[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String r1, java.lang.String r2, java.lang.String[] r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String r1, java.lang.String r2, java.lang.String[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.util.List<java.lang.CharSequence> r1) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.util.List<java.lang.CharSequence> r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence[] r1) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.CharSequence[] r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String... r1) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu show(java.lang.String[] r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(int r1, int r2, java.util.List<java.lang.String> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuStringList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(int r1, int r2, java.util.List<java.lang.String> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuStringList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.String> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.String> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r4) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(java.util.List<java.lang.String> r1) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuStringList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.BottomMenu showStringList(java.util.List<java.lang.String> r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            com.kongzue.dialogx.dialogs.BottomMenu r0 = new com.kongzue.dialogx.dialogs.BottomMenu
            r0.<init>()
            r0.setMenuStringList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog appendMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.appendMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu appendMessage(java.lang.CharSequence r4) {
            r3 = this;
            java.lang.CharSequence r0 = r3.message
            r1 = 2
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.CharSequence r4 = android.text.TextUtils.concat(r1)
            r3.message = r4
            r3.refreshUI()
            return r3
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.bindDismissWithLifecycleOwner(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog bringToFront() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r0 = r1.bringToFront()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    public void callDialogDismissPrivate() {
            r0 = this;
            r0.dismiss()
            return
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog cleanAction(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.cleanAction(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog cleanAllAction() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r0 = r1.cleanAllAction()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
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

    public com.kongzue.dialogx.dialogs.BottomMenu disableMenu(int... r6) {
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

    public com.kongzue.dialogx.dialogs.BottomMenu disableMenu(java.lang.CharSequence... r6) {
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

    public com.kongzue.dialogx.dialogs.BottomMenu disableMenu(java.lang.String... r6) {
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

    public com.kongzue.dialogx.dialogs.BottomMenu enableMenu(int... r6) {
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

    public com.kongzue.dialogx.dialogs.BottomMenu enableMenu(java.lang.CharSequence... r6) {
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

    public com.kongzue.dialogx.dialogs.BottomMenu enableMenu(java.lang.String... r6) {
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

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public float getBottomDialogMaxHeight() {
            r1 = this;
            float r0 = r1.bottomDialogMaxHeight
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> getBottomMenuCancelButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.cancelButtonClickListener
            com.kongzue.dialogx.interfaces.OnMenuButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnMenuButtonClickListener) r0
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public java.lang.CharSequence getCancelButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.cancelText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.util.TextInfo getCancelTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.cancelTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomDialog.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.dialogXAnimImpl
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public long getEnterAnimDuration() {
            r2 = this;
            long r0 = r2.enterAnimDuration
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public long getExitAnimDuration() {
            r2 = this;
            long r0 = r2.exitAnimDuration
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

    public com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.BottomMenu> getMenuItemTextInfoInterceptor() {
            r1 = this;
            com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.BottomMenu> r0 = r1.menuItemTextInfoInterceptor
            return r0
    }

    public java.util.List<java.lang.CharSequence> getMenuList() {
            r1 = this;
            java.util.List<java.lang.CharSequence> r0 = r1.menuList
            return r0
    }

    public android.widget.BaseAdapter getMenuListAdapter() {
            r1 = this;
            android.widget.BaseAdapter r0 = r1.menuListAdapter
            return r0
    }

    public com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.BottomMenu> getMenuMenuItemLayoutRefreshCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.BottomMenu> r0 = r1.menuMenuItemLayoutRefreshCallback
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

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public java.lang.CharSequence getMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.message
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.util.TextInfo getMessageTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.messageTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public java.lang.CharSequence getOkButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.okText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.util.TextInfo getOkTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.okTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.BottomDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBackPressedListener
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.BottomDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.BottomMenu> getOnIconChangeCallBack() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.BottomMenu> r0 = r1.onIconChangeCallBack
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> getOnMenuItemClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r0 = r1.onMenuItemClickListener
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public java.lang.CharSequence getOtherButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.otherText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.util.TextInfo getOtherTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.otherTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public float getRadius() {
            r1 = this;
            float r0 = r1.backgroundRadius
            return r0
    }

    public com.kongzue.dialogx.interfaces.SELECT_MODE getSelectMode() {
            r1 = this;
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = r1.selectMode
            return r0
    }

    public java.lang.CharSequence[] getSelectTextArray() {
            r1 = this;
            java.lang.CharSequence[] r0 = r1.selectTextArray
            return r0
    }

    public int getSelection() {
            r1 = this;
            int r0 = r1.selectionIndex
            return r0
    }

    public int getSelectionIndex() {
            r1 = this;
            int r0 = r1.selectionIndex
            return r0
    }

    public int[] getSelectionIndexArray() {
            r1 = this;
            int[] r0 = r1.resultArray
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getSelectionList() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.selectionItems
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.title
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.util.TextInfo getTitleTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.titleTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public boolean isAllowInterceptTouch() {
            r1 = this;
            boolean r0 = super.isAllowInterceptTouch()
            return r0
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
            r1 = this;
            boolean r0 = r1.autoTintIconInLightOrDarkMode
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public boolean isBkgInterceptTouch() {
            r1 = this;
            boolean r0 = r1.bkgInterceptTouch
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public boolean isCancelable() {
            r4 = this;
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = r4.privateCancelable
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r3) goto Lb
            r1 = r2
        Lb:
            return r1
        Lc:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.BottomDialog.overrideCancelable
            if (r0 == 0) goto L16
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r3 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            if (r0 != r3) goto L15
            r1 = r2
        L15:
            return r1
        L16:
            boolean r0 = r4.cancelable
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

    public boolean isShowSelectedBackgroundTips() {
            r1 = this;
            boolean r0 = r1.showSelectedBackgroundTips
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    public void onDialogShow() {
            r8 = this;
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r8.getDialogImpl()
            if (r0 == 0) goto Lfd
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r8.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            if (r0 == 0) goto Lfd
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r8.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            r1 = 0
            r0.setVisibility(r1)
            boolean r0 = r8.isAllowInterceptTouch()
            r2 = 1
            if (r0 != 0) goto L39
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r8.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.bkg
            float r3 = r8.bottomDialogMaxHeight
            int r3 = (int) r3
            r0.setMaxHeight(r3)
            float r0 = r8.bottomDialogMaxHeight
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L39
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r8.dialogImpl
            com.kongzue.dialogx.interfaces.ScrollController r0 = r0.scrollView
            r0.lockScroll(r2)
        L39:
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            if (r0 == 0) goto L5e
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            boolean r3 = r8.isLightTheme()
            int r0 = r0.overrideMenuDividerDrawableRes(r3)
            com.kongzue.dialogx.interfaces.DialogXStyle r3 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r3 = r3.overrideBottomDialogRes()
            boolean r4 = r8.isLightTheme()
            int r3 = r3.overrideMenuDividerHeight(r4)
            goto L60
        L5e:
            r0 = r1
            r3 = r2
        L60:
            if (r0 != 0) goto L6d
            boolean r0 = r8.isLightTheme()
            if (r0 == 0) goto L6b
            int r0 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider
            goto L6d
        L6b:
            int r0 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider_night
        L6d:
            boolean r4 = r8.isLightTheme()
            if (r4 != 0) goto L85
            com.kongzue.dialogx.util.views.DialogListView r4 = new com.kongzue.dialogx.util.views.DialogListView
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r5 = r8.getDialogImpl()
            android.app.Activity r6 = r8.getOwnActivity()
            int r7 = com.kongzue.dialogx.R.style.DialogXCompatThemeDark
            r4.<init>(r5, r6, r7)
            r8.listView = r4
            goto L94
        L85:
            com.kongzue.dialogx.util.views.DialogListView r4 = new com.kongzue.dialogx.util.views.DialogListView
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r5 = r8.getDialogImpl()
            android.app.Activity r6 = r8.getOwnActivity()
            r4.<init>(r5, r6)
            r8.listView = r4
        L94:
            com.kongzue.dialogx.util.views.DialogListView r4 = r8.listView
            java.lang.String r5 = "ScrollController"
            r4.setTag(r5)
            com.kongzue.dialogx.util.views.DialogListView r4 = r8.listView
            r5 = 2
            r4.setOverScrollMode(r5)
            com.kongzue.dialogx.util.views.DialogListView r4 = r8.listView
            android.content.res.Resources r5 = r8.getResources()
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r4.setDivider(r0)
            com.kongzue.dialogx.util.views.DialogListView r0 = r8.listView
            r0.setDividerHeight(r3)
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r8.getDialogImpl()
            com.kongzue.dialogx.util.views.DialogListView r3 = r8.listView
            r0.scrollView = r3
            com.kongzue.dialogx.dialogs.BottomMenu$1 r0 = new com.kongzue.dialogx.dialogs.BottomMenu$1
            r0.<init>(r8)
            r3.setBottomMenuListViewTouchEvent(r0)
            com.kongzue.dialogx.util.views.DialogListView r0 = r8.listView
            com.kongzue.dialogx.dialogs.BottomMenu$2 r3 = new com.kongzue.dialogx.dialogs.BottomMenu$2
            r3.<init>(r8)
            r0.setOnItemClickListener(r3)
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            if (r0 == 0) goto Le8
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            int r0 = r0.overrideMenuItemLayout(r2, r1, r1, r1)
            if (r0 == 0) goto Le8
            com.kongzue.dialogx.util.views.DialogListView r0 = r8.listView
            int r1 = com.kongzue.dialogx.R.color.empty
            r0.setSelector(r1)
        Le8:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r1 = r8.getDialogImpl()
            android.view.ViewGroup r1 = r1.boxList
            com.kongzue.dialogx.util.views.DialogListView r2 = r8.listView
            r1.addView(r2, r0)
            r8.refreshUI()
        Lfd:
            return
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.onDismiss(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.onShow(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
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

    public void preRefreshUI() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.BottomMenu$4 r0 = new com.kongzue.dialogx.dialogs.BottomMenu$4
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r4 = this;
            com.kongzue.dialogx.dialogs.BottomDialog$DialogImpl r0 = r4.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            if (r0 == 0) goto L41
            android.widget.BaseAdapter r0 = r4.menuListAdapter
            if (r0 != 0) goto L1e
            com.kongzue.dialogx.util.BottomMenuArrayAdapter r0 = new com.kongzue.dialogx.util.BottomMenuArrayAdapter
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r4.me
            android.app.Activity r2 = r4.getOwnActivity()
            java.util.List<java.lang.CharSequence> r3 = r4.menuList
            r0.<init>(r1, r2, r3)
            r4.menuListAdapter = r0
        L1e:
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            android.widget.ListAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L2e
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            android.widget.BaseAdapter r1 = r4.menuListAdapter
            r0.setAdapter(r1)
            goto L41
        L2e:
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            android.widget.ListAdapter r0 = r0.getAdapter()
            android.widget.BaseAdapter r1 = r4.menuListAdapter
            if (r0 == r1) goto L3e
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            r0.setAdapter(r1)
            goto L41
        L3e:
            r1.notifyDataSetChanged()
        L41:
            boolean r0 = r4.showSelectedBackgroundTips
            if (r0 == 0) goto L51
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            if (r0 == 0) goto L51
            com.kongzue.dialogx.dialogs.BottomMenu$3 r1 = new com.kongzue.dialogx.dialogs.BottomMenu$3
            r1.<init>(r4)
            r0.post(r1)
        L51:
            com.kongzue.dialogx.util.ItemDivider r0 = r4.itemDivider
            if (r0 == 0) goto L71
            com.kongzue.dialogx.util.views.DialogListView r1 = r4.listView
            android.app.Activity r2 = r4.getOwnActivity()
            boolean r3 = r4.isLightTheme()
            android.graphics.drawable.Drawable r0 = r0.createDividerDrawable(r2, r3)
            r1.setDivider(r0)
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            com.kongzue.dialogx.util.ItemDivider r1 = r4.itemDivider
            int r1 = r1.getWidth()
            r0.setDividerHeight(r1)
        L71:
            super.refreshUI()
            return
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r0 = r1.removeCustomView()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r0 = r1.onBindView
            r0.clean()
            r1.preRefreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setActionRunnable(int r1, com.kongzue.dialogx.interfaces.DialogXRunnable r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setActionRunnable(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.BottomDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setAllowInterceptTouch(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setAllowInterceptTouch(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setAllowInterceptTouch(boolean r1) {
            r0 = this;
            r0.allowInterceptTouch = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setAutoTintIconInLightOrDarkMode(boolean r1) {
            r0 = this;
            r0.autoTintIconInLightOrDarkMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setBackgroundColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setBackgroundColorRes(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setBkgInterceptTouch(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setBottomDialogMaxHeight(float r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setBottomDialogMaxHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setBottomDialogMaxHeight(float r1) {
            r0 = this;
            r0.bottomDialogMaxHeight = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCancelButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCancelButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCancelButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCancelButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCancelButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.cancelText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            r0 = this;
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setCancelButtonClickListener(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCancelTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.cancelTextInfo = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCancelable(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCancelable(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setCancelable(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.TRUE
            goto L7
        L5:
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r1 = com.kongzue.dialogx.interfaces.BaseDialog.BOOLEAN.FALSE
        L7:
            r0.privateCancelable = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCustomDialogLayoutResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCustomDialogLayoutResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCustomDialogLayoutResId(int r1, boolean r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCustomDialogLayoutResId(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setCustomView(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setData(java.lang.String r2, java.lang.Object r3) {
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

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setDialogImplMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setDialogLifecycleCallback(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.BottomMenu r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setDialogXAnimImpl(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setEnterAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setEnterAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setExitAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setExitAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setHapticFeedbackEnabled(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            r0.isHapticFeedbackEnabled = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setIconResIds(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.iconResIds = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setIconResIds(int... r5) {
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

    public com.kongzue.dialogx.dialogs.BottomMenu setItemDivider(com.kongzue.dialogx.util.ItemDivider r1) {
            r0 = this;
            r0.itemDivider = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMaskColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMaxHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMaxHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMaxWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMaxWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuItemTextInfoInterceptor(com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.menuItemTextInfoInterceptor = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuList(java.util.List<java.lang.CharSequence> r1) {
            r0 = this;
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuList(java.lang.CharSequence[] r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuList(java.lang.String[] r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            r2 = 0
            r1.menuListAdapter = r2
            r1.preRefreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuListAdapter(android.widget.BaseAdapter r1) {
            r0 = this;
            r0.menuListAdapter = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuMenuItemLayoutRefreshCallback(com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.menuMenuItemLayoutRefreshCallback = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuStringList(java.util.List<java.lang.String> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.menuList = r0
            r0.addAll(r2)
            r2 = 0
            r1.menuListAdapter = r2
            r1.preRefreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenuTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.menuTextInfo = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenus(int... r1) {
            r0 = this;
            java.lang.String[] r1 = r0.getTextArray(r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenus(java.lang.CharSequence... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMenus(java.lang.String... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMessage(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMessageTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMinHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMinHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setMinWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setMinWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setMultiSelection() {
            r1 = this;
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.MULTIPLE
            r1.selectMode = r0
            r0 = -1
            r1.selectionIndex = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.selectionItems = r0
            r0 = 0
            r1.menuListAdapter = r0
            r1.preRefreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setNoSelect() {
            r1 = this;
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.NONE
            r1.selectMode = r0
            r0 = -1
            r1.selectionIndex = r0
            r0 = 0
            r1.selectionItems = r0
            r1.menuListAdapter = r0
            r1.preRefreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOkButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOkButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOkButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOkButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOkButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOkButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOkButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOkButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(int r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.okText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            r0 = this;
            r0.okText = r1
            r0.okButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOkTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.okTextInfo = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOnBackPressedListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOnBackgroundMaskClickListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOnIconChangeCallBack(com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.onIconChangeCallBack = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOnMenuItemClickListener(com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.onMenuItemClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOtherButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOtherButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOtherButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOtherButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOtherButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.otherText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.BottomDialog> r2) {
            r0 = this;
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.BottomMenu> r2) {
            r0 = this;
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setOtherTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.otherTextInfo = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setRadius(float r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setRadius(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setRootPadding(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setRootPadding(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setRootPadding(r1, r2, r3, r4)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setScrollableWhenContentLargeThanVisibleRange(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setScrollableWhenContentLargeThanVisibleRange(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setScrollableWhenContentLargeThanVisibleRange(boolean r1) {
            r0 = this;
            r0.scrollableWhenContentLargeThanVisibleRange = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setSelection(int r2) {
            r1 = this;
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.SINGLE
            r1.selectMode = r0
            r1.selectionIndex = r2
            r2 = 0
            r1.selectionItems = r2
            r1.menuListAdapter = r2
            r1.preRefreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setSelection(java.util.List<java.lang.Integer> r2) {
            r1 = this;
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.MULTIPLE
            r1.selectMode = r0
            r0 = -1
            r1.selectionIndex = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.selectionItems = r0
            r2 = 0
            r1.menuListAdapter = r2
            r1.preRefreshUI()
            return r1
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setSelection(int[] r5) {
            r4 = this;
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.MULTIPLE
            r4.selectMode = r0
            r0 = -1
            r4.selectionIndex = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.selectionItems = r0
            if (r5 == 0) goto L22
            int r0 = r5.length
            r1 = 0
        L12:
            if (r1 >= r0) goto L22
            r2 = r5[r1]
            java.util.ArrayList<java.lang.Integer> r3 = r4.selectionItems
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto L12
        L22:
            r5 = 0
            r4.menuListAdapter = r5
            r4.preRefreshUI()
            return r4
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setShowSelectedBackgroundTips(boolean r1) {
            r0 = this;
            r0.showSelectedBackgroundTips = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.BottomMenu setSingleSelection() {
            r1 = this;
            com.kongzue.dialogx.interfaces.SELECT_MODE r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.SINGLE
            r1.selectMode = r0
            r0 = -1
            r1.selectionIndex = r0
            r0 = 0
            r1.selectionItems = r0
            r1.menuListAdapter = r0
            r1.preRefreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setStyle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setTheme(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setThisOrderIndex(int r2) {
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

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setTitle(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setTitle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setTitle(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setTitle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setTitle(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.title = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setTitleIcon(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setTitleIcon(android.graphics.Bitmap r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setTitleIcon(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.titleIcon = r2
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setTitleIcon(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.titleIcon = r0
            r2.refreshUI()
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.titleIcon = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.BottomMenu r1 = r0.setTitleTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog
    public com.kongzue.dialogx.dialogs.BottomMenu setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.titleTextInfo = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.BottomDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
