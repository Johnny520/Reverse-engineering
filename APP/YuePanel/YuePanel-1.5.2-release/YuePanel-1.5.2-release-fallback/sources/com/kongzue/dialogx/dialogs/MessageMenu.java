package com.kongzue.dialogx.dialogs;

/* JADX INFO: loaded from: classes2.dex */
public class MessageMenu extends com.kongzue.dialogx.dialogs.MessageDialog {
    public static final int ITEM_CLICK_DELAY = 100;
    protected boolean allowInterceptTouch;
    protected boolean autoTintIconInLightOrDarkMode;
    protected java.util.List<java.lang.Integer> iconResIds;
    protected com.kongzue.dialogx.util.ItemDivider itemDivider;
    private long lastClickTime;
    protected com.kongzue.dialogx.util.views.DialogListView listView;
    protected com.kongzue.dialogx.dialogs.MessageMenu me;
    protected com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.MessageMenu> menuItemTextInfoInterceptor;
    protected java.util.List<java.lang.CharSequence> menuList;
    protected android.widget.BaseAdapter menuListAdapter;
    protected com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.MessageMenu> menuMenuItemLayoutRefreshCallback;
    protected com.kongzue.dialogx.util.TextInfo menuTextInfo;
    protected java.util.Map<java.lang.Integer, java.lang.Boolean> menuUsability;
    protected com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.MessageMenu> onIconChangeCallBack;
    protected com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> onMenuItemClickListener;
    private int[] resultArray;
    protected com.kongzue.dialogx.interfaces.SELECT_MODE selectMode;
    private java.lang.CharSequence[] selectTextArray;
    protected int selectionIndex;
    protected java.util.ArrayList<java.lang.Integer> selectionItems;
    protected boolean showSelectedBackgroundTips;
    private float touchDownY;





    /* JADX INFO: renamed from: com.kongzue.dialogx.dialogs.MessageMenu$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE = null;

        static {
                com.kongzue.dialogx.interfaces.SELECT_MODE[] r0 = com.kongzue.dialogx.interfaces.SELECT_MODE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.kongzue.dialogx.dialogs.MessageMenu.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE = r0
                com.kongzue.dialogx.interfaces.SELECT_MODE r1 = com.kongzue.dialogx.interfaces.SELECT_MODE.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.kongzue.dialogx.dialogs.MessageMenu.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE     // Catch: java.lang.NoSuchFieldError -> L1d
                com.kongzue.dialogx.interfaces.SELECT_MODE r1 = com.kongzue.dialogx.interfaces.SELECT_MODE.SINGLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.kongzue.dialogx.dialogs.MessageMenu.AnonymousClass5.$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE     // Catch: java.lang.NoSuchFieldError -> L28
                com.kongzue.dialogx.interfaces.SELECT_MODE r1 = com.kongzue.dialogx.interfaces.SELECT_MODE.MULTIPLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public MessageMenu() {
            r2 = this;
            r2.<init>()
            r2.me = r2
            r0 = 1
            r2.allowInterceptTouch = r0
            r1 = -1
            r2.selectionIndex = r1
            com.kongzue.dialogx.interfaces.SELECT_MODE r1 = com.kongzue.dialogx.interfaces.SELECT_MODE.NONE
            r2.selectMode = r1
            r1 = 0
            r2.showSelectedBackgroundTips = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.menuUsability = r1
            r2.autoTintIconInLightOrDarkMode = r0
            r0 = 0
            r2.lastClickTime = r0
            return
    }

    public static /* synthetic */ float access$000(com.kongzue.dialogx.dialogs.MessageMenu r0) {
            float r0 = r0.touchDownY
            return r0
    }

    public static /* synthetic */ float access$002(com.kongzue.dialogx.dialogs.MessageMenu r0, float r1) {
            r0.touchDownY = r1
            return r1
    }

    public static /* synthetic */ void access$100(com.kongzue.dialogx.dialogs.MessageMenu r0, android.view.View r1) {
            r0.haptic(r1)
            return
    }

    public static /* synthetic */ long access$200(com.kongzue.dialogx.dialogs.MessageMenu r2) {
            long r0 = r2.lastClickTime
            return r0
    }

    public static /* synthetic */ long access$202(com.kongzue.dialogx.dialogs.MessageMenu r0, long r1) {
            r0.lastClickTime = r1
            return r1
    }

    public static /* synthetic */ void access$300(com.kongzue.dialogx.dialogs.MessageMenu r0) {
            r0.syncMultiSelectResult()
            return
    }

    public static /* synthetic */ java.lang.CharSequence[] access$400(com.kongzue.dialogx.dialogs.MessageMenu r0) {
            java.lang.CharSequence[] r0 = r0.selectTextArray
            return r0
    }

    public static /* synthetic */ int[] access$500(com.kongzue.dialogx.dialogs.MessageMenu r0) {
            int[] r0 = r0.resultArray
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu build() {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu build(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setStyle(r1)
            return r1
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu build(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCustomView(r1)
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

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, int r2, java.util.List<java.lang.CharSequence> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, int r2, java.util.List<java.lang.CharSequence> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
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

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, int r2, java.lang.CharSequence[] r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, int r2, java.lang.CharSequence[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
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

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, int r2, java.lang.String[] r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, int r2, java.lang.String[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
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

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, java.util.List<java.lang.CharSequence> r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, java.util.List<java.lang.CharSequence> r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setOnMenuItemClickListener(r3)
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, java.lang.CharSequence[] r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, java.lang.CharSequence[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, java.lang.String[] r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(int r1, java.lang.String[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.CharSequence> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.CharSequence> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence[] r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.CharSequence[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.String[] r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence r2, java.lang.String[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.util.List<java.lang.CharSequence> r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.util.List<java.lang.CharSequence> r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence[] r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.CharSequence[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.String[] r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence r1, java.lang.String[] r2, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.setMenuList(r2)
            r0.setOnMenuItemClickListener(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.CharSequence> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.CharSequence> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String r1, java.lang.String r2, java.lang.CharSequence[] r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String r1, java.lang.String r2, java.lang.CharSequence[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String r1, java.lang.String r2, java.lang.String[] r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String r1, java.lang.String r2, java.lang.String[] r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.util.List<java.lang.CharSequence> r1) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.util.List<java.lang.CharSequence> r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence[] r1) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.CharSequence[] r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String... r1) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu show(java.lang.String[] r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(int r1, int r2, java.util.List<java.lang.String> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            java.lang.String r1 = r0.getString(r2)
            r0.message = r1
            r0.setMenuStringList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(int r1, int r2, java.util.List<java.lang.String> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
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

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.String> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(java.lang.CharSequence r1, java.lang.CharSequence r2, java.util.List<java.lang.String> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(java.lang.String r1, java.lang.String r2, java.util.List<java.lang.String> r3, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r4) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.title = r1
            r0.message = r2
            r0.setMenuStringList(r3)
            r0.setOnMenuItemClickListener(r4)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(java.util.List<java.lang.String> r1) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuStringList(r1)
            r0.show()
            return r0
    }

    public static com.kongzue.dialogx.dialogs.MessageMenu showStringList(java.util.List<java.lang.String> r1, com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            com.kongzue.dialogx.dialogs.MessageMenu r0 = new com.kongzue.dialogx.dialogs.MessageMenu
            r0.<init>()
            r0.setMenuStringList(r1)
            r0.setOnMenuItemClickListener(r2)
            r0.show()
            return r0
    }

    private void syncMultiSelectResult() {
            r4 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r4.selectionItems
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r4.resultArray = r0
            java.util.ArrayList<java.lang.Integer> r0 = r4.selectionItems
            int r0 = r0.size()
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            r4.selectTextArray = r0
            r0 = 0
        L15:
            java.util.ArrayList<java.lang.Integer> r1 = r4.selectionItems
            int r1 = r1.size()
            if (r0 >= r1) goto L40
            int[] r1 = r4.resultArray
            java.util.ArrayList<java.lang.Integer> r2 = r4.selectionItems
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1[r0] = r2
            java.lang.CharSequence[] r1 = r4.selectTextArray
            java.util.List<java.lang.CharSequence> r2 = r4.menuList
            int[] r3 = r4.resultArray
            r3 = r3[r0]
            java.lang.Object r2 = r2.get(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L15
        L40:
            return
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog appendMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.appendMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu appendMessage(java.lang.CharSequence r4) {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.bindDismissWithLifecycleOwner(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu bindDismissWithLifecycleOwner(androidx.lifecycle.LifecycleOwner r1) {
            r0 = this;
            super.bindDismissWithLifecycleOwnerPrivate(r1)
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog bringToFront() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r1.bringToFront()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu bringToFront() {
            r1 = this;
            int r0 = r1.getHighestOrderIndex()
            r1.setThisOrderIndex(r0)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void callDialogDismiss() {
            r0 = this;
            r0.dismiss()
            return
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog cleanAction(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.cleanAction(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu cleanAction(int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog cleanAllAction() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r1.cleanAllAction()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu cleanAllAction() {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            r0.clear()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
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

    public com.kongzue.dialogx.dialogs.MessageMenu disableMenu(int... r6) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu disableMenu(java.lang.CharSequence... r6) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu disableMenu(java.lang.String... r6) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu enableMenu(int... r6) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu enableMenu(java.lang.CharSequence... r6) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu enableMenu(java.lang.String... r6) {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public int getBackgroundColor() {
            r1 = this;
            java.lang.Integer r0 = r1.backgroundColor
            int r0 = r0.intValue()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getCancelButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.cancelText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getCancelTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.cancelTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public android.view.View getCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBindView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageDialog.DialogImpl getDialogImpl() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.dialogImpl
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> getDialogXAnimImpl() {
            r1 = this;
            com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.dialogXAnimImpl
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public long getEnterAnimDuration() {
            r2 = this;
            long r0 = r2.enterAnimDuration
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
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

    public com.kongzue.dialogx.util.ItemDivider getItemDivider() {
            r1 = this;
            com.kongzue.dialogx.util.ItemDivider r0 = r1.itemDivider
            return r0
    }

    public com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.MessageMenu> getMenuItemTextInfoInterceptor() {
            r1 = this;
            com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.MessageMenu> r0 = r1.menuItemTextInfoInterceptor
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

    public com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.MessageMenu> getMenuMenuItemLayoutRefreshCallback() {
            r1 = this;
            com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.MessageMenu> r0 = r1.menuMenuItemLayoutRefreshCallback
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.message
            return r0
    }

    public float getMessageDialogMaxHeight() {
            r1 = this;
            int r0 = r1.maxHeight
            float r0 = (float) r0
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> getMessageMenuCancelButtonClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.BaseOnDialogClickCallback r0 = r1.cancelButtonClickListener
            com.kongzue.dialogx.interfaces.OnMenuButtonClickListener r0 = (com.kongzue.dialogx.interfaces.OnMenuButtonClickListener) r0
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getMessageTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.messageTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getOkButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.okText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getOkTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.okTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> getOnBackPressedListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBackPressedListener
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> getOnBackgroundMaskClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBackgroundMaskClickListener
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.MessageMenu> getOnIconChangeCallBack() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.MessageMenu> r0 = r1.onIconChangeCallBack
            return r0
    }

    public com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> getOnMenuItemClickListener() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r0 = r1.onMenuItemClickListener
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getOtherButton() {
            r1 = this;
            java.lang.CharSequence r0 = r1.otherText
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getOtherTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.otherTextInfo
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
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
            r1.syncMultiSelectResult()
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
            r1.syncMultiSelectResult()
            int[] r0 = r1.resultArray
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getSelectionList() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.selectionItems
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.title
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.util.TextInfo getTitleTextInfo() {
            r1 = this;
            com.kongzue.dialogx.util.TextInfo r0 = r1.titleTextInfo
            return r0
    }

    public boolean isAllowInterceptTouch() {
            r2 = this;
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r2.allowInterceptTouch
            if (r0 == 0) goto L1b
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r2.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            boolean r0 = r0.touchSlide()
            if (r0 == 0) goto L1b
            r1 = 1
        L1b:
            return r1
    }

    public boolean isAutoTintIconInLightOrDarkMode() {
            r1 = this;
            boolean r0 = r1.autoTintIconInLightOrDarkMode
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public boolean isBkgInterceptTouch() {
            r1 = this;
            boolean r0 = r1.bkgInterceptTouch
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
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
            com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN r0 = com.kongzue.dialogx.dialogs.MessageDialog.overrideCancelable
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
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r8.getDialogImpl()
            if (r0 == 0) goto Lec
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r8.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            if (r0 == 0) goto Lec
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r8.getDialogImpl()
            android.view.ViewGroup r0 = r0.boxList
            r1 = 0
            r0.setVisibility(r1)
            boolean r0 = r8.isAllowInterceptTouch()
            r2 = 1
            if (r0 != 0) goto L35
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r8.getDialogImpl()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.bkg
            int r3 = r8.maxHeight
            r0.setMaxHeight(r3)
            int r0 = r8.maxHeight
            if (r0 == 0) goto L35
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r8.dialogImpl
            com.kongzue.dialogx.interfaces.ScrollController r0 = r0.scrollView
            r0.lockScroll(r2)
        L35:
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            if (r0 == 0) goto L5a
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            boolean r3 = r8.isLightTheme()
            int r0 = r0.overrideMenuDividerDrawableRes(r3)
            com.kongzue.dialogx.interfaces.DialogXStyle r3 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r3 = r3.overrideBottomDialogRes()
            boolean r4 = r8.isLightTheme()
            int r3 = r3.overrideMenuDividerHeight(r4)
            goto L5c
        L5a:
            r0 = r1
            r3 = r2
        L5c:
            if (r0 != 0) goto L69
            boolean r0 = r8.isLightTheme()
            if (r0 == 0) goto L67
            int r0 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider
            goto L69
        L67:
            int r0 = com.kongzue.dialogx.R.drawable.rect_dialogx_material_menu_split_divider_night
        L69:
            boolean r4 = r8.isLightTheme()
            if (r4 != 0) goto L81
            com.kongzue.dialogx.util.views.DialogListView r4 = new com.kongzue.dialogx.util.views.DialogListView
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r5 = r8.getDialogImpl()
            android.app.Activity r6 = r8.getOwnActivity()
            int r7 = com.kongzue.dialogx.R.style.DialogXCompatThemeDark
            r4.<init>(r5, r6, r7)
            r8.listView = r4
            goto L90
        L81:
            com.kongzue.dialogx.util.views.DialogListView r4 = new com.kongzue.dialogx.util.views.DialogListView
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r5 = r8.getDialogImpl()
            android.app.Activity r6 = r8.getOwnActivity()
            r4.<init>(r5, r6)
            r8.listView = r4
        L90:
            com.kongzue.dialogx.util.views.DialogListView r4 = r8.listView
            r5 = 2
            r4.setOverScrollMode(r5)
            com.kongzue.dialogx.util.views.DialogListView r4 = r8.listView
            android.content.res.Resources r5 = r8.getResources()
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            r4.setDivider(r0)
            com.kongzue.dialogx.util.views.DialogListView r0 = r8.listView
            r0.setDividerHeight(r3)
            com.kongzue.dialogx.util.views.DialogListView r0 = r8.listView
            com.kongzue.dialogx.dialogs.MessageMenu$1 r3 = new com.kongzue.dialogx.dialogs.MessageMenu$1
            r3.<init>(r8)
            r0.setBottomMenuListViewTouchEvent(r3)
            com.kongzue.dialogx.util.views.DialogListView r0 = r8.listView
            com.kongzue.dialogx.dialogs.MessageMenu$2 r3 = new com.kongzue.dialogx.dialogs.MessageMenu$2
            r3.<init>(r8)
            r0.setOnItemClickListener(r3)
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            if (r0 == 0) goto Ld7
            com.kongzue.dialogx.interfaces.DialogXStyle r0 = r8.style
            com.kongzue.dialogx.interfaces.DialogXStyle$BottomDialogRes r0 = r0.overrideBottomDialogRes()
            int r0 = r0.overrideMenuItemLayout(r2, r1, r1, r1)
            if (r0 == 0) goto Ld7
            com.kongzue.dialogx.util.views.DialogListView r0 = r8.listView
            int r1 = com.kongzue.dialogx.R.color.empty
            r0.setSelector(r1)
        Ld7:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r1 = r8.getDialogImpl()
            android.view.ViewGroup r1 = r1.boxList
            com.kongzue.dialogx.util.views.DialogListView r2 = r8.listView
            r1.addView(r2, r0)
            r8.refreshUI()
        Lec:
            return
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.onDismiss(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu onDismiss(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onDismissRunnable = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog onShow(com.kongzue.dialogx.interfaces.DialogXRunnable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.onShow(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu onShow(com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
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
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r1.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.dialogs.MessageMenu$4 r0 = new com.kongzue.dialogx.dialogs.MessageMenu$4
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.BaseDialog.runOnMain(r0)
            return
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void refreshUI() {
            r4 = this;
            com.kongzue.dialogx.dialogs.MessageDialog$DialogImpl r0 = r4.getDialogImpl()
            if (r0 != 0) goto L7
            return
        L7:
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            if (r0 == 0) goto L41
            android.widget.BaseAdapter r0 = r4.menuListAdapter
            if (r0 != 0) goto L1e
            com.kongzue.dialogx.util.MessageMenuArrayAdapter r0 = new com.kongzue.dialogx.util.MessageMenuArrayAdapter
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r4.me
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
            com.kongzue.dialogx.dialogs.MessageMenu$3 r1 = new com.kongzue.dialogx.dialogs.MessageMenu$3
            r1.<init>(r4)
            r0.post(r1)
        L51:
            com.kongzue.dialogx.util.ItemDivider r0 = r4.itemDivider
            if (r0 == 0) goto L73
            com.kongzue.dialogx.util.views.DialogListView r1 = r4.listView
            if (r1 == 0) goto L73
            android.app.Activity r2 = r4.getOwnActivity()
            boolean r3 = r4.isLightTheme()
            android.graphics.drawable.Drawable r0 = r0.createDividerDrawable(r2, r3)
            r1.setDivider(r0)
            com.kongzue.dialogx.util.views.DialogListView r0 = r4.listView
            com.kongzue.dialogx.util.ItemDivider r1 = r4.itemDivider
            int r1 = r1.getWidth()
            r0.setDividerHeight(r1)
        L73:
            super.refreshUI()
            return
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r1.removeCustomView()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu removeCustomView() {
            r1 = this;
            com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r0 = r1.onBindView
            r0.clean()
            r1.preRefreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setActionRunnable(int r1, com.kongzue.dialogx.interfaces.DialogXRunnable r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setActionRunnable(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setActionRunnable(int r2, com.kongzue.dialogx.interfaces.DialogXRunnable<com.kongzue.dialogx.dialogs.MessageDialog> r3) {
            r1 = this;
            java.util.Map<java.lang.Integer, com.kongzue.dialogx.interfaces.DialogXRunnable> r0 = r1.dialogActionRunnableMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r2, r3)
            return r1
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setAllowInterceptTouch(boolean r1) {
            r0 = this;
            r0.allowInterceptTouch = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setAutoTintIconInLightOrDarkMode(boolean r1) {
            r0 = this;
            r0.autoTintIconInLightOrDarkMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setBackgroundColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setBackgroundColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setBackgroundColorRes(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setBackgroundColorRes(@Yue.InterfaceC1241 int r1) {
            r0 = this;
            int r1 = r0.getColor(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.backgroundColor = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setBkgInterceptTouch(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setBkgInterceptTouch(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setBkgInterceptTouch(boolean r1) {
            r0 = this;
            r0.bkgInterceptTouch = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCancelButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCancelButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCancelButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCancelButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCancelButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(int r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.cancelText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            r0 = this;
            r0.cancelText = r1
            r0.cancelButtonClickListener = r2
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setCancelButtonClickListener(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.cancelButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCancelTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setCancelTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.cancelTextInfo = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCancelable(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCancelable(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setCancelable(boolean r1) {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCustomDialogLayoutResId(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCustomDialogLayoutResId(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCustomDialogLayoutResId(int r1, boolean r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCustomDialogLayoutResId(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setCustomDialogLayoutResId(int r3) {
            r2 = this;
            int[] r0 = r2.customDialogLayoutResId
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r3
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setCustomDialogLayoutResId(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.customDialogLayoutResId
            r3 = r3 ^ 1
            r0[r3] = r2
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setCustomView(com.kongzue.dialogx.interfaces.OnBindView r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setCustomView(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setCustomView(com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBindView = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setData(java.lang.String r2, java.lang.Object r3) {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setData(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setData(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setDialogImplMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setDialogImplMode(com.kongzue.dialogx.DialogX.IMPL_MODE r1) {
            r0 = this;
            r0.dialogImplMode = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setDialogLifecycleCallback(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setDialogLifecycleCallback(com.kongzue.dialogx.interfaces.DialogLifecycleCallback<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r1 = this;
            r1.dialogLifecycleCallback = r2
            boolean r0 = r1.isShow
            if (r0 == 0) goto Lb
            com.kongzue.dialogx.dialogs.MessageMenu r0 = r1.me
            r2.onShow(r0)
        Lb:
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setDialogXAnimImpl(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setDialogXAnimImpl(com.kongzue.dialogx.interfaces.DialogXAnimInterface<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.dialogXAnimImpl = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setEnableImmersiveMode(boolean r1) {
            r0 = this;
            r0.enableImmersiveMode = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setEnableImmersiveMode(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setEnableImmersiveMode(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setEnterAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setEnterAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setEnterAnimDuration(long r1) {
            r0 = this;
            r0.enterAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setExitAnimDuration(long r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setExitAnimDuration(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setExitAnimDuration(long r1) {
            r0 = this;
            r0.exitAnimDuration = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setHapticFeedbackEnabled(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setHapticFeedbackEnabled(boolean r1) {
            r0 = this;
            r0.isHapticFeedbackEnabled = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setIconResIds(java.util.List<java.lang.Integer> r1) {
            r0 = this;
            r0.iconResIds = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setIconResIds(int... r5) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu setItemDivider(com.kongzue.dialogx.util.ItemDivider r1) {
            r0 = this;
            r0.itemDivider = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMaskColor(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMaskColor(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.maskColor = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMaxHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMaxHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMaxHeight(int r1) {
            r0 = this;
            r0.maxHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMaxWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMaxWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMaxWidth(int r1) {
            r0 = this;
            r0.maxWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuItemTextInfoInterceptor(com.kongzue.dialogx.interfaces.MenuItemTextInfoInterceptor<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.menuItemTextInfoInterceptor = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuList(java.util.List<java.lang.CharSequence> r1) {
            r0 = this;
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuList(java.lang.CharSequence[] r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuList(java.lang.String[] r2) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuListAdapter(android.widget.BaseAdapter r1) {
            r0 = this;
            r0.menuListAdapter = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuMenuItemLayoutRefreshCallback(com.kongzue.dialogx.interfaces.MenuItemLayoutRefreshCallback<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.menuMenuItemLayoutRefreshCallback = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuStringList(java.util.List<java.lang.String> r2) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu setMenuTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.menuTextInfo = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenus(java.lang.CharSequence... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMenus(java.lang.String... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.menuList = r1
            r1 = 0
            r0.menuListAdapter = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMessage(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMessage(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMessage(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMessage(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.message = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMessage(java.lang.CharSequence r1) {
            r0 = this;
            r0.message = r1
            r0.preRefreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMessageDialogMaxHeight(float r1) {
            r0 = this;
            int r1 = (int) r1
            r0.maxHeight = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMessageTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMessageTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.messageTextInfo = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMinHeight(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMinHeight(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMinHeight(int r1) {
            r0 = this;
            r0.minHeight = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setMinWidth(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setMinWidth(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setMinWidth(int r1) {
            r0 = this;
            r0.minWidth = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setMultiSelection() {
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

    public com.kongzue.dialogx.dialogs.MessageMenu setNoSelect() {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOkButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOkButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOkButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOkButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOkButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.okButtonClickListener = r2
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(int r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.okText = r1
            r0.okButtonClickListener = r2
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.okButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.okText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            r0.okText = r1
            r0.okButtonClickListener = r2
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOkButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            r0 = this;
            r0.okText = r1
            r0.okButtonClickListener = r2
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOkTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOkTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.okTextInfo = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOnBackPressedListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOnBackPressedListener(com.kongzue.dialogx.interfaces.OnBackPressedListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBackPressedListener = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOnBackgroundMaskClickListener(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOnBackgroundMaskClickListener(com.kongzue.dialogx.interfaces.OnBackgroundMaskClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.onBackgroundMaskClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOnIconChangeCallBack(com.kongzue.dialogx.interfaces.OnIconChangeCallBack<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.onIconChangeCallBack = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOnMenuItemClickListener(com.kongzue.dialogx.interfaces.OnMenuItemClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.onMenuItemClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOtherButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOtherButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOtherButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOtherButton(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener r2) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOtherButton(r1, r2)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(int r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r1) {
            r0 = this;
            r0.otherButtonClickListener = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(java.lang.CharSequence r1) {
            r0 = this;
            r0.otherText = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    @java.lang.Deprecated
    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnDialogButtonClickListener<com.kongzue.dialogx.dialogs.MessageDialog> r2) {
            r0 = this;
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setOtherButton(java.lang.CharSequence r1, com.kongzue.dialogx.interfaces.OnMenuButtonClickListener<com.kongzue.dialogx.dialogs.MessageMenu> r2) {
            r0 = this;
            r0.otherText = r1
            r0.otherButtonClickListener = r2
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setOtherTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setOtherTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.otherTextInfo = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setRadius(float r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setRadius(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setRadius(float r1) {
            r0 = this;
            r0.backgroundRadius = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setRootPadding(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setRootPadding(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setRootPadding(r1, r2, r3, r4)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setRootPadding(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1, r1, r1}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setRootPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            int[] r1 = new int[]{r1, r2, r3, r4}
            r0.screenPaddings = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setSelection(int r2) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu setSelection(java.util.List<java.lang.Integer> r2) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu setSelection(int[] r5) {
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

    public com.kongzue.dialogx.dialogs.MessageMenu setShowSelectedBackgroundTips(boolean r1) {
            r0 = this;
            r0.showSelectedBackgroundTips = r1
            r0.refreshUI()
            return r0
    }

    public com.kongzue.dialogx.dialogs.MessageMenu setSingleSelection() {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setStyle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setStyle(com.kongzue.dialogx.interfaces.DialogXStyle r1) {
            r0 = this;
            r0.style = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setTheme(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setTheme(com.kongzue.dialogx.DialogX.THEME r1) {
            r0 = this;
            r0.theme = r1
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setThisOrderIndex(int r2) {
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

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.interfaces.BaseDialog setThisOrderIndex(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setThisOrderIndex(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitle(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setTitle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitle(java.lang.CharSequence r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setTitle(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setTitle(int r1) {
            r0 = this;
            java.lang.String r1 = r0.getString(r1)
            r0.title = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.title = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(int r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(android.graphics.Bitmap r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setTitleIcon(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setTitleIcon(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r1.titleIcon = r2
            r1.refreshUI()
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setTitleIcon(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r2.getResources()
            r0.<init>(r1, r3)
            r2.titleIcon = r0
            r2.refreshUI()
            return r2
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setTitleIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.titleIcon = r1
            r0.refreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public /* bridge */ /* synthetic */ com.kongzue.dialogx.dialogs.MessageDialog setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            com.kongzue.dialogx.dialogs.MessageMenu r1 = r0.setTitleTextInfo(r1)
            return r1
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog
    public com.kongzue.dialogx.dialogs.MessageMenu setTitleTextInfo(com.kongzue.dialogx.util.TextInfo r1) {
            r0 = this;
            r0.titleTextInfo = r1
            r0.preRefreshUI()
            return r0
    }

    @Override // com.kongzue.dialogx.dialogs.MessageDialog, com.kongzue.dialogx.interfaces.BaseDialog
    public void shutdown() {
            r0 = this;
            r0.dismiss()
            return
    }
}
