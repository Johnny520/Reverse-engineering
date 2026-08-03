package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2316 extends Yue.C0104 {
    private static final java.lang.String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final android.graphics.Rect INVALID_PARENT_BOUNDS = null;
    private static final Yue.C2710.InterfaceC2711<Yue.C0140> NODE_ADAPTER = null;
    private static final Yue.C2710.InterfaceC2712<Yue.C5868<Yue.C0140>, Yue.C0140> SPARSE_VALUES_ADAPTER = null;
    int mAccessibilityFocusedVirtualViewId;
    private final android.view.View mHost;
    private int mHoveredVirtualViewId;
    int mKeyboardFocusedVirtualViewId;
    private final android.view.accessibility.AccessibilityManager mManager;
    private Yue.AbstractC2316.C2319 mNodeProvider;
    private final int[] mTempGlobalRect;
    private final android.graphics.Rect mTempParentRect;
    private final android.graphics.Rect mTempScreenRect;
    private final android.graphics.Rect mTempVisibleRect;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ$ۥ, reason: contains not printable characters */
    public class C2317 implements Yue.C2710.InterfaceC2711<Yue.C0140> {
        public C2317() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C2710.InterfaceC2711
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ void mo10681(Yue.C0140 r1, android.graphics.Rect r2) {
                r0 = this;
                Yue.ۥ۟۟ۥۧ r1 = (Yue.C0140) r1
                r0.m10682(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m10682(Yue.C0140 r1, android.graphics.Rect r2) {
                r0 = this;
                r1.m643(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ$ۥ۟, reason: contains not printable characters */
    public class C2318 implements Yue.C2710.InterfaceC2712<Yue.C5868<Yue.C0140>, Yue.C0140> {
        public C2318() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C2710.InterfaceC2712
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ Yue.C0140 mo10683(Yue.C5868<Yue.C0140> r1, int r2) {
                r0 = this;
                Yue.ۥۢ۟ۦ۠ r1 = (Yue.C5868) r1
                Yue.ۥ۟۟ۥۧ r1 = r0.m10685(r1, r2)
                return r1
        }

        @Override // Yue.C2710.InterfaceC2712
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ int mo10684(Yue.C5868<Yue.C0140> r1) {
                r0 = this;
                Yue.ۥۢ۟ۦ۠ r1 = (Yue.C5868) r1
                int r1 = r0.m10686(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C0140 m10685(Yue.C5868<Yue.C0140> r1, int r2) {
                r0 = this;
                java.lang.Object r1 = r1.m21831(r2)
                Yue.ۥ۟۟ۥۧ r1 = (Yue.C0140) r1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m10686(Yue.C5868<Yue.C0140> r1) {
                r0 = this;
                int r1 = r1.m21830()
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ$ۥ۟۟, reason: contains not printable characters */
    public class C2319 extends Yue.C0155 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC2316 f7576;

        public C2319(Yue.AbstractC2316 r1) {
                r0 = this;
                r0.f7576 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C0155
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.C0140 mo861(int r2) {
                r1 = this;
                Yue.ۥ۠ۡۥۥ r0 = r1.f7576
                Yue.ۥ۟۟ۥۧ r2 = r0.obtainAccessibilityNodeInfo(r2)
                Yue.ۥ۟۟ۥۧ r2 = Yue.C0140.m621(r2)
                return r2
        }

        @Override // Yue.C0155
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public Yue.C0140 mo863(int r2) {
                r1 = this;
                r0 = 2
                if (r2 != r0) goto L8
                Yue.ۥ۠ۡۥۥ r2 = r1.f7576
                int r2 = r2.mAccessibilityFocusedVirtualViewId
                goto Lc
            L8:
                Yue.ۥ۠ۡۥۥ r2 = r1.f7576
                int r2 = r2.mKeyboardFocusedVirtualViewId
            Lc:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != r0) goto L12
                r2 = 0
                return r2
            L12:
                Yue.ۥ۟۟ۥۧ r2 = r1.mo861(r2)
                return r2
        }

        @Override // Yue.C0155
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo865(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                Yue.ۥ۠ۡۥۥ r0 = r1.f7576
                boolean r2 = r0.performAction(r2, r3, r4)
                return r2
        }
    }

    static {
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.<init>(r1, r1, r2, r2)
            Yue.AbstractC2316.INVALID_PARENT_BOUNDS = r0
            Yue.ۥ۠ۡۥۥ$ۥ r0 = new Yue.ۥ۠ۡۥۥ$ۥ
            r0.<init>()
            Yue.AbstractC2316.NODE_ADAPTER = r0
            Yue.ۥ۠ۡۥۥ$ۥ۟ r0 = new Yue.ۥ۠ۡۥۥ$ۥ۟
            r0.<init>()
            Yue.AbstractC2316.SPARSE_VALUES_ADAPTER = r0
            return
    }

    public AbstractC2316(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempScreenRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempParentRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempVisibleRect = r0
            r0 = 2
            int[] r0 = new int[r0]
            r2.mTempGlobalRect = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mAccessibilityFocusedVirtualViewId = r0
            r2.mKeyboardFocusedVirtualViewId = r0
            r2.mHoveredVirtualViewId = r0
            if (r3 == 0) goto L45
            r2.mHost = r3
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r2.mManager = r0
            r0 = 1
            r3.setFocusable(r0)
            int r1 = Yue.C6794.m26135(r3)
            if (r1 != 0) goto L44
            Yue.C6794.m26241(r3, r0)
        L44:
            return
        L45:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "View may not be null"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static android.graphics.Rect m10664(@Yue.InterfaceC4410 android.view.View r4, int r5, @Yue.InterfaceC4410 android.graphics.Rect r6) {
            int r0 = r4.getWidth()
            int r4 = r4.getHeight()
            r1 = 17
            r2 = 0
            if (r5 == r1) goto L2e
            r1 = 33
            if (r5 == r1) goto L2a
            r1 = 66
            r3 = -1
            if (r5 == r1) goto L26
            r4 = 130(0x82, float:1.82E-43)
            if (r5 != r4) goto L1e
            r6.set(r2, r3, r0, r3)
            goto L31
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r4.<init>(r5)
            throw r4
        L26:
            r6.set(r3, r2, r3, r4)
            goto L31
        L2a:
            r6.set(r2, r4, r0, r4)
            goto L31
        L2e:
            r6.set(r0, r2, r0, r4)
        L31:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m10665(int r1) {
            r0 = 19
            if (r1 == r0) goto L15
            r0 = 21
            if (r1 == r0) goto L12
            r0 = 22
            if (r1 == r0) goto Lf
            r1 = 130(0x82, float:1.82E-43)
            return r1
        Lf:
            r1 = 66
            return r1
        L12:
            r1 = 17
            return r1
        L15:
            r1 = 33
            return r1
    }

    public final boolean clearKeyboardFocusForVirtualView(int r3) {
            r2 = this;
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r1 = 0
            if (r0 == r3) goto L6
            return r1
        L6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mKeyboardFocusedVirtualViewId = r0
            r2.onVirtualViewKeyboardFocusChanged(r3, r1)
            r0 = 8
            r2.sendEventForVirtualView(r3, r0)
            r3 = 1
            return r3
    }

    public final boolean dispatchHoverEvent(@Yue.InterfaceC4410 android.view.MotionEvent r6) {
            r5 = this;
            android.view.accessibility.AccessibilityManager r0 = r5.mManager
            boolean r0 = r0.isEnabled()
            r1 = 0
            if (r0 == 0) goto L40
            android.view.accessibility.AccessibilityManager r0 = r5.mManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L12
            goto L40
        L12:
            int r0 = r6.getAction()
            r2 = 7
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L2e
            r2 = 9
            if (r0 == r2) goto L2e
            r6 = 10
            if (r0 == r6) goto L25
            return r1
        L25:
            int r6 = r5.mHoveredVirtualViewId
            if (r6 == r4) goto L2d
            r5.m10680(r4)
            return r3
        L2d:
            return r1
        L2e:
            float r0 = r6.getX()
            float r6 = r6.getY()
            int r6 = r5.getVirtualViewAt(r0, r6)
            r5.m10680(r6)
            if (r6 == r4) goto L40
            r1 = r3
        L40:
            return r1
    }

    public final boolean dispatchKeyEvent(@Yue.InterfaceC4410 android.view.KeyEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5e
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L48
            r3 = 66
            if (r0 == r3) goto L37
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L37;
                default: goto L18;
            }
        L18:
            goto L5e
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5e
            int r0 = m10665(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = r1
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.m10676(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = r2
            goto L29
        L35:
            r1 = r3
            goto L5e
        L37:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5e
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5e
            r6.m10667()
            r1 = r2
            goto L5e
        L48:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L54
            r7 = 2
            boolean r1 = r6.m10676(r7, r4)
            goto L5e
        L54:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5e
            boolean r1 = r6.m10676(r2, r4)
        L5e:
            return r1
    }

    public final int getAccessibilityFocusedVirtualViewId() {
            r1 = this;
            int r0 = r1.mAccessibilityFocusedVirtualViewId
            return r0
    }

    @Override // Yue.C0104
    public Yue.C0155 getAccessibilityNodeProvider(android.view.View r1) {
            r0 = this;
            Yue.ۥ۠ۡۥۥ$ۥ۟۟ r1 = r0.mNodeProvider
            if (r1 != 0) goto Lb
            Yue.ۥ۠ۡۥۥ$ۥ۟۟ r1 = new Yue.ۥ۠ۡۥۥ$ۥ۟۟
            r1.<init>(r0)
            r0.mNodeProvider = r1
        Lb:
            Yue.ۥ۠ۡۥۥ$ۥ۟۟ r1 = r0.mNodeProvider
            return r1
    }

    @java.lang.Deprecated
    public int getFocusedVirtualView() {
            r1 = this;
            int r0 = r1.getAccessibilityFocusedVirtualViewId()
            return r0
    }

    public final int getKeyboardFocusedVirtualViewId() {
            r1 = this;
            int r0 = r1.mKeyboardFocusedVirtualViewId
            return r0
    }

    public abstract int getVirtualViewAt(float r1, float r2);

    public abstract void getVisibleVirtualViews(java.util.List<java.lang.Integer> r1);

    public final void invalidateRoot() {
            r2 = this;
            r0 = -1
            r1 = 1
            r2.invalidateVirtualView(r0, r1)
            return
    }

    public final void invalidateVirtualView(int r2) {
            r1 = this;
            r0 = 0
            r1.invalidateVirtualView(r2, r0)
            return
    }

    public final void invalidateVirtualView(int r3, int r4) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L22
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L22
            android.view.View r0 = r2.mHost
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L22
            r1 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r3 = r2.m10668(r3, r1)
            Yue.C0106.m581(r3, r4)
            android.view.View r4 = r2.mHost
            r0.requestSendAccessibilityEvent(r4, r3)
        L22:
            return
    }

    @Yue.InterfaceC4410
    public Yue.C0140 obtainAccessibilityNodeInfo(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L8
            Yue.ۥ۟۟ۥۧ r2 = r1.m10672()
            return r2
        L8:
            Yue.ۥ۟۟ۥۧ r2 = r1.m10671(r2)
            return r2
    }

    public final void onFocusChanged(boolean r3, int r4, @Yue.InterfaceC4544 android.graphics.Rect r5) {
            r2 = this;
            int r0 = r2.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L9
            r2.clearKeyboardFocusForVirtualView(r0)
        L9:
            if (r3 == 0) goto Le
            r2.m10676(r4, r5)
        Le:
            return
    }

    @Override // Yue.C0104
    public void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            super.onInitializeAccessibilityEvent(r1, r2)
            r0.onPopulateEventForHost(r2)
            return
    }

    @Override // Yue.C0104
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, Yue.C0140 r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            r0.onPopulateNodeForHost(r2)
            return
    }

    public abstract boolean onPerformActionForVirtualView(int r1, int r2, @Yue.InterfaceC4544 android.os.Bundle r3);

    public void onPopulateEventForHost(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            return
    }

    public void onPopulateEventForVirtualView(int r1, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r2) {
            r0 = this;
            return
    }

    public void onPopulateNodeForHost(@Yue.InterfaceC4410 Yue.C0140 r1) {
            r0 = this;
            return
    }

    public abstract void onPopulateNodeForVirtualView(int r1, @Yue.InterfaceC4410 Yue.C0140 r2);

    public void onVirtualViewKeyboardFocusChanged(int r1, boolean r2) {
            r0 = this;
            return
    }

    public boolean performAction(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            boolean r2 = r1.m10677(r2, r3, r4)
            return r2
        L8:
            boolean r2 = r1.m10678(r3, r4)
            return r2
    }

    public final boolean requestKeyboardFocusForVirtualView(int r4) {
            r3 = this;
            android.view.View r0 = r3.mHost
            boolean r0 = r0.isFocused()
            r1 = 0
            if (r0 != 0) goto L12
            android.view.View r0 = r3.mHost
            boolean r0 = r0.requestFocus()
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r3.mKeyboardFocusedVirtualViewId
            if (r0 != r4) goto L17
            return r1
        L17:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L1e
            r3.clearKeyboardFocusForVirtualView(r0)
        L1e:
            if (r4 != r2) goto L21
            return r1
        L21:
            r3.mKeyboardFocusedVirtualViewId = r4
            r0 = 1
            r3.onVirtualViewKeyboardFocusChanged(r4, r0)
            r1 = 8
            r3.sendEventForVirtualView(r4, r1)
            return r0
    }

    public final boolean sendEventForVirtualView(int r3, int r4) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            if (r3 == r0) goto L22
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto Le
            goto L22
        Le:
            android.view.View r0 = r2.mHost
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L17
            return r1
        L17:
            android.view.accessibility.AccessibilityEvent r3 = r2.m10668(r3, r4)
            android.view.View r4 = r2.mHost
            boolean r3 = r0.requestSendAccessibilityEvent(r4, r3)
            return r3
        L22:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m10666(int r2) {
            r1 = this;
            int r0 = r1.mAccessibilityFocusedVirtualViewId
            if (r0 != r2) goto L14
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.mAccessibilityFocusedVirtualViewId = r0
            android.view.View r0 = r1.mHost
            r0.invalidate()
            r0 = 65536(0x10000, float:9.1835E-41)
            r1.sendEventForVirtualView(r2, r0)
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m10667() {
            r3 = this;
            int r0 = r3.mKeyboardFocusedVirtualViewId
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L11
            r1 = 16
            r2 = 0
            boolean r0 = r3.onPerformActionForVirtualView(r0, r1, r2)
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.view.accessibility.AccessibilityEvent m10668(int r2, int r3) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            android.view.accessibility.AccessibilityEvent r2 = r1.m10669(r2, r3)
            return r2
        L8:
            android.view.accessibility.AccessibilityEvent r2 = r1.m10670(r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final android.view.accessibility.AccessibilityEvent m10669(int r4, int r5) {
            r3 = this;
            android.view.accessibility.AccessibilityEvent r5 = android.view.accessibility.AccessibilityEvent.obtain(r5)
            Yue.ۥ۟۟ۥۧ r0 = r3.obtainAccessibilityNodeInfo(r4)
            java.util.List r1 = r5.getText()
            java.lang.CharSequence r2 = r0.m676()
            r1.add(r2)
            java.lang.CharSequence r1 = r0.m653()
            r5.setContentDescription(r1)
            boolean r1 = r0.m709()
            r5.setScrollable(r1)
            boolean r1 = r0.m707()
            r5.setPassword(r1)
            boolean r1 = r0.m699()
            r5.setEnabled(r1)
            boolean r1 = r0.m693()
            r5.setChecked(r1)
            r3.onPopulateEventForVirtualView(r4, r5)
            java.util.List r1 = r5.getText()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L52
            java.lang.CharSequence r1 = r5.getContentDescription()
            if (r1 == 0) goto L4a
            goto L52
        L4a:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Callbacks must add text or a content description in populateEventForVirtualViewId()"
            r4.<init>(r5)
            throw r4
        L52:
            java.lang.CharSequence r0 = r0.m649()
            r5.setClassName(r0)
            android.view.View r0 = r3.mHost
            Yue.C0158.m872(r5, r0, r4)
            android.view.View r4 = r3.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.String r4 = r4.getPackageName()
            r5.setPackageName(r4)
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final android.view.accessibility.AccessibilityEvent m10670(int r2) {
            r1 = this;
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            android.view.View r0 = r1.mHost
            r0.onInitializeAccessibilityEvent(r2)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Yue.C0140 m10671(int r8) {
            r7 = this;
            Yue.ۥ۟۟ۥۧ r0 = Yue.C0140.m620()
            r1 = 1
            r0.m744(r1)
            r0.m746(r1)
            java.lang.String r2 = "android.view.View"
            r0.m733(r2)
            android.graphics.Rect r2 = Yue.AbstractC2316.INVALID_PARENT_BOUNDS
            r0.m727(r2)
            r0.m728(r2)
            android.view.View r3 = r7.mHost
            r0.m765(r3)
            r7.onPopulateNodeForVirtualView(r8, r0)
            java.lang.CharSequence r3 = r0.m676()
            if (r3 != 0) goto L35
            java.lang.CharSequence r3 = r0.m653()
            if (r3 == 0) goto L2d
            goto L35
        L2d:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must add text or a content description in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
        L35:
            android.graphics.Rect r3 = r7.mTempParentRect
            r0.m643(r3)
            android.graphics.Rect r3 = r7.mTempParentRect
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L143
            int r3 = r0.m640()
            r4 = r3 & 64
            if (r4 != 0) goto L13b
            r4 = 128(0x80, float:1.8E-43)
            r3 = r3 & r4
            if (r3 != 0) goto L133
            android.view.View r3 = r7.mHost
            android.content.Context r3 = r3.getContext()
            java.lang.String r3 = r3.getPackageName()
            r0.m763(r3)
            android.view.View r3 = r7.mHost
            r0.m777(r3, r8)
            int r3 = r7.mAccessibilityFocusedVirtualViewId
            r5 = 0
            if (r3 != r8) goto L6d
            r0.m724(r1)
            r0.m626(r4)
            goto L75
        L6d:
            r0.m724(r5)
            r3 = 64
            r0.m626(r3)
        L75:
            int r3 = r7.mKeyboardFocusedVirtualViewId
            if (r3 != r8) goto L7b
            r8 = r1
            goto L7c
        L7b:
            r8 = r5
        L7c:
            if (r8 == 0) goto L83
            r3 = 2
            r0.m626(r3)
            goto L8c
        L83:
            boolean r3 = r0.m700()
            if (r3 == 0) goto L8c
            r0.m626(r1)
        L8c:
            r0.m747(r8)
            android.view.View r8 = r7.mHost
            int[] r3 = r7.mTempGlobalRect
            r8.getLocationOnScreen(r3)
            android.graphics.Rect r8 = r7.mTempScreenRect
            r0.m644(r8)
            android.graphics.Rect r8 = r7.mTempScreenRect
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto Lf3
            android.graphics.Rect r8 = r7.mTempScreenRect
            r0.m643(r8)
            int r8 = r0.f313
            r2 = -1
            if (r8 == r2) goto Ld8
            Yue.ۥ۟۟ۥۧ r8 = Yue.C0140.m620()
            int r3 = r0.f313
        Lb3:
            if (r3 == r2) goto Ld5
            android.view.View r4 = r7.mHost
            r8.m766(r4, r2)
            android.graphics.Rect r4 = Yue.AbstractC2316.INVALID_PARENT_BOUNDS
            r8.m727(r4)
            r7.onPopulateNodeForVirtualView(r3, r8)
            android.graphics.Rect r3 = r7.mTempParentRect
            r8.m643(r3)
            android.graphics.Rect r3 = r7.mTempScreenRect
            android.graphics.Rect r4 = r7.mTempParentRect
            int r6 = r4.left
            int r4 = r4.top
            r3.offset(r6, r4)
            int r3 = r8.f313
            goto Lb3
        Ld5:
            r8.m717()
        Ld8:
            android.graphics.Rect r8 = r7.mTempScreenRect
            int[] r2 = r7.mTempGlobalRect
            r2 = r2[r5]
            android.view.View r3 = r7.mHost
            int r3 = r3.getScrollX()
            int r2 = r2 - r3
            int[] r3 = r7.mTempGlobalRect
            r3 = r3[r1]
            android.view.View r4 = r7.mHost
            int r4 = r4.getScrollY()
            int r3 = r3 - r4
            r8.offset(r2, r3)
        Lf3:
            android.view.View r8 = r7.mHost
            android.graphics.Rect r2 = r7.mTempVisibleRect
            boolean r8 = r8.getLocalVisibleRect(r2)
            if (r8 == 0) goto L132
            android.graphics.Rect r8 = r7.mTempVisibleRect
            int[] r2 = r7.mTempGlobalRect
            r2 = r2[r5]
            android.view.View r3 = r7.mHost
            int r3 = r3.getScrollX()
            int r2 = r2 - r3
            int[] r3 = r7.mTempGlobalRect
            r3 = r3[r1]
            android.view.View r4 = r7.mHost
            int r4 = r4.getScrollY()
            int r3 = r3 - r4
            r8.offset(r2, r3)
            android.graphics.Rect r8 = r7.mTempScreenRect
            android.graphics.Rect r2 = r7.mTempVisibleRect
            boolean r8 = r8.intersect(r2)
            if (r8 == 0) goto L132
            android.graphics.Rect r8 = r7.mTempScreenRect
            r0.m728(r8)
            android.graphics.Rect r8 = r7.mTempScreenRect
            boolean r8 = r7.m10675(r8)
            if (r8 == 0) goto L132
            r0.m791(r1)
        L132:
            return r0
        L133:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
        L13b:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
        L143:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Callbacks must set parent bounds in populateNodeForVirtualViewId()"
            r8.<init>(r0)
            throw r8
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.C0140 m10672() {
            r6 = this;
            android.view.View r0 = r6.mHost
            Yue.ۥ۟۟ۥۧ r0 = Yue.C0140.m622(r0)
            android.view.View r1 = r6.mHost
            Yue.C6794.m26202(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.getVisibleVirtualViews(r1)
            int r2 = r0.m648()
            if (r2 <= 0) goto L28
            int r2 = r1.size()
            if (r2 > 0) goto L20
            goto L28
        L20:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Views cannot have both real and virtual children"
            r0.<init>(r1)
            throw r0
        L28:
            int r2 = r1.size()
            r3 = 0
        L2d:
            if (r3 >= r2) goto L41
            android.view.View r4 = r6.mHost
            java.lang.Object r5 = r1.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.m629(r4, r5)
            int r3 = r3 + 1
            goto L2d
        L41:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Yue.C5868<Yue.C0140> m10673() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.getVisibleVirtualViews(r0)
            Yue.ۥۢ۟ۦ۠ r1 = new Yue.ۥۢ۟ۦ۠
            r1.<init>()
            r2 = 0
        Le:
            int r3 = r0.size()
            if (r2 >= r3) goto L32
            java.lang.Object r3 = r0.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            Yue.ۥ۟۟ۥۧ r3 = r5.m10671(r3)
            java.lang.Object r4 = r0.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.m21820(r4, r3)
            int r2 = r2 + 1
            goto Le
        L32:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m10674(int r1, android.graphics.Rect r2) {
            r0 = this;
            Yue.ۥ۟۟ۥۧ r1 = r0.obtainAccessibilityNodeInfo(r1)
            r1.m643(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m10675(android.graphics.Rect r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L38
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto La
            goto L38
        La:
            android.view.View r4 = r3.mHost
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L13
            return r0
        L13:
            android.view.View r4 = r3.mHost
            android.view.ViewParent r4 = r4.getParent()
        L19:
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L35
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L34
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L2f
            goto L34
        L2f:
            android.view.ViewParent r4 = r4.getParent()
            goto L19
        L34:
            return r0
        L35:
            if (r4 == 0) goto L38
            r0 = 1
        L38:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m10676(int r10, @Yue.InterfaceC4544 android.graphics.Rect r11) {
            r9 = this;
            Yue.ۥۢ۟ۦ۠ r7 = r9.m10673()
            int r0 = r9.mKeyboardFocusedVirtualViewId
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r8) goto Ld
            r0 = 0
        Lb:
            r3 = r0
            goto L14
        Ld:
            java.lang.Object r0 = r7.m21814(r0)
            Yue.ۥ۟۟ۥۧ r0 = (Yue.C0140) r0
            goto Lb
        L14:
            r0 = 1
            if (r10 == r0) goto L58
            r1 = 2
            if (r10 == r1) goto L58
            r0 = 17
            if (r10 == r0) goto L33
            r0 = 33
            if (r10 == r0) goto L33
            r0 = 66
            if (r10 == r0) goto L33
            r0 = 130(0x82, float:1.82E-43)
            if (r10 != r0) goto L2b
            goto L33
        L2b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r10.<init>(r11)
            throw r10
        L33:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            int r0 = r9.mKeyboardFocusedVirtualViewId
            if (r0 == r8) goto L40
            r9.m10674(r0, r4)
            goto L4b
        L40:
            if (r11 == 0) goto L46
            r4.set(r11)
            goto L4b
        L46:
            android.view.View r11 = r9.mHost
            m10664(r11, r10, r4)
        L4b:
            Yue.ۥ۠ۢۥۤ$ۥ۟<Yue.ۥۢ۟ۦ۠<Yue.ۥ۟۟ۥۧ>, Yue.ۥ۟۟ۥۧ> r1 = Yue.AbstractC2316.SPARSE_VALUES_ADAPTER
            Yue.ۥ۠ۢۥۤ$ۥ<Yue.ۥ۟۟ۥۧ> r2 = Yue.AbstractC2316.NODE_ADAPTER
            r0 = r7
            r5 = r10
            java.lang.Object r10 = Yue.C2710.m11937(r0, r1, r2, r3, r4, r5)
            Yue.ۥ۟۟ۥۧ r10 = (Yue.C0140) r10
            goto L71
        L58:
            android.view.View r11 = r9.mHost
            int r11 = Yue.C6794.m26140(r11)
            if (r11 != r0) goto L62
            r5 = r0
            goto L64
        L62:
            r11 = 0
            r5 = r11
        L64:
            Yue.ۥ۠ۢۥۤ$ۥ۟<Yue.ۥۢ۟ۦ۠<Yue.ۥ۟۟ۥۧ>, Yue.ۥ۟۟ۥۧ> r1 = Yue.AbstractC2316.SPARSE_VALUES_ADAPTER
            Yue.ۥ۠ۢۥۤ$ۥ<Yue.ۥ۟۟ۥۧ> r2 = Yue.AbstractC2316.NODE_ADAPTER
            r6 = 0
            r0 = r7
            r4 = r10
            java.lang.Object r10 = Yue.C2710.m11938(r0, r1, r2, r3, r4, r5, r6)
            Yue.ۥ۟۟ۥۧ r10 = (Yue.C0140) r10
        L71:
            if (r10 != 0) goto L74
            goto L7c
        L74:
            int r10 = r7.m21817(r10)
            int r8 = r7.m21819(r10)
        L7c:
            boolean r10 = r9.requestKeyboardFocusForVirtualView(r8)
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m10677(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L22
            r0 = 2
            if (r3 == r0) goto L1d
            r0 = 64
            if (r3 == r0) goto L18
            r0 = 128(0x80, float:1.8E-43)
            if (r3 == r0) goto L13
            boolean r2 = r1.onPerformActionForVirtualView(r2, r3, r4)
            return r2
        L13:
            boolean r2 = r1.m10666(r2)
            return r2
        L18:
            boolean r2 = r1.m10679(r2)
            return r2
        L1d:
            boolean r2 = r1.clearKeyboardFocusForVirtualView(r2)
            return r2
        L22:
            boolean r2 = r1.requestKeyboardFocusForVirtualView(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m10678(int r2, android.os.Bundle r3) {
            r1 = this;
            android.view.View r0 = r1.mHost
            boolean r2 = Yue.C6794.m26205(r0, r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m10679(int r3) {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isEnabled()
            r1 = 0
            if (r0 == 0) goto L2c
            android.view.accessibility.AccessibilityManager r0 = r2.mManager
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 != 0) goto L12
            goto L2c
        L12:
            int r0 = r2.mAccessibilityFocusedVirtualViewId
            if (r0 == r3) goto L2c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1d
            r2.m10666(r0)
        L1d:
            r2.mAccessibilityFocusedVirtualViewId = r3
            android.view.View r0 = r2.mHost
            r0.invalidate()
            r0 = 32768(0x8000, float:4.5918E-41)
            r2.sendEventForVirtualView(r3, r0)
            r3 = 1
            return r3
        L2c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m10680(int r3) {
            r2 = this;
            int r0 = r2.mHoveredVirtualViewId
            if (r0 != r3) goto L5
            return
        L5:
            r2.mHoveredVirtualViewId = r3
            r1 = 128(0x80, float:1.8E-43)
            r2.sendEventForVirtualView(r3, r1)
            r3 = 256(0x100, float:3.59E-43)
            r2.sendEventForVirtualView(r0, r3)
            return
    }
}
