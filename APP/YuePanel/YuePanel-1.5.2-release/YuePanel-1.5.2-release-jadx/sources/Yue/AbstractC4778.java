package Yue;

import Yue.C5040;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4778 extends C3024 {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final C5040.InterfaceC0619<C3055> NODE_ADAPTER = new C0487();
    private static final C5040.InterfaceC0620<C7533<C3055>, C3055> SPARSE_VALUES_ADAPTER = new C0488();
    private final View mHost;
    private final AccessibilityManager mManager;
    private C4779 mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ$ۥ */
    public class C0487 implements C5040.InterfaceC0619<C3055> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;Landroid/graphics/Rect;)V */
        @Override // Yue.C5040.InterfaceC0619
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void mo1681(C3055 c3055, Rect rect) {
            c3055.m5967(rect);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ$ۥ۟ */
    public class C0488 implements C5040.InterfaceC0620<C7533<C3055>, C3055> {
        /* JADX DEBUG: Method merged with bridge method: ۥ(Ljava/lang/Object;I)Ljava/lang/Object; */
        @Override // Yue.C5040.InterfaceC0620
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C3055 mo1683(C7533<C3055> c7533, int i) {
            return c7533.m23580(i);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟(Ljava/lang/Object;)I */
        @Override // Yue.C5040.InterfaceC0620
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo1684(C7533<C3055> c7533) {
            return c7533.m23579();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۥۥ$ۥ۟۟, reason: contains not printable characters */
    public class C4779 extends C3067 {
        public C4779() {
        }

        @Override // Yue.C3067
        /* JADX INFO: renamed from: ۥ۟ */
        public C3055 mo144(int i) {
            return C3055.m5947(AbstractC4778.this.obtainAccessibilityNodeInfo(i));
        }

        @Override // Yue.C3067
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public C3055 mo6162(int i) {
            int i2 = i == 2 ? AbstractC4778.this.mAccessibilityFocusedVirtualViewId : AbstractC4778.this.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo144(i2);
        }

        @Override // Yue.C3067
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo6164(int i, int i2, Bundle bundle) {
            return AbstractC4778.this.performAction(i, i2, bundle);
        }
    }

    public AbstractC4778(@InterfaceC6391 View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C8273.m27351(view) == 0) {
            C8273.m27457(view, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Rect m14435(@InterfaceC6391 View view, int i, @InterfaceC6391 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m14436(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@InterfaceC6391 MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            m14451(virtualViewAt);
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        m14451(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(@InterfaceC6391 KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return m14447(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return m14447(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iM14436 = m14436(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && m14447(iM14436, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        m14438();
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // Yue.C3024
    public C3067 getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C4779();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    @InterfaceC6391
    public C3055 obtainAccessibilityNodeInfo(int i) {
        return i == -1 ? m14443() : m14442(i);
    }

    public final void onFocusChanged(boolean z, int i, @InterfaceC6490 Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            m14447(i, rect);
        }
    }

    @Override // Yue.C3024
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // Yue.C3024
    public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
        super.onInitializeAccessibilityNodeInfo(view, c3055);
        onPopulateNodeForHost(c3055);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, @InterfaceC6490 Bundle bundle);

    public void onPopulateEventForHost(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@InterfaceC6391 C3055 c3055) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, @InterfaceC6391 C3055 c3055);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return i != -1 ? m14448(i, i2, bundle) : m14449(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, m14439(i, i2));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m14437(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m14438() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final AccessibilityEvent m14439(int i, int i2) {
        return i != -1 ? m14440(i, i2) : m14441(i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final AccessibilityEvent m14440(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C3055 c3055ObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c3055ObtainAccessibilityNodeInfo.m6000());
        accessibilityEventObtain.setContentDescription(c3055ObtainAccessibilityNodeInfo.m5977());
        accessibilityEventObtain.setScrollable(c3055ObtainAccessibilityNodeInfo.m6033());
        accessibilityEventObtain.setPassword(c3055ObtainAccessibilityNodeInfo.m6031());
        accessibilityEventObtain.setEnabled(c3055ObtainAccessibilityNodeInfo.m6023());
        accessibilityEventObtain.setChecked(c3055ObtainAccessibilityNodeInfo.m6017());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c3055ObtainAccessibilityNodeInfo.m5973());
        C3068.m6171(accessibilityEventObtain, this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final AccessibilityEvent m14441(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C3055 m14442(int i) {
        C3055 c3055M5946 = C3055.m5946();
        c3055M5946.m6068(true);
        c3055M5946.m6070(true);
        c3055M5946.m6057(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        c3055M5946.m6051(rect);
        c3055M5946.m6052(rect);
        c3055M5946.m6089(this.mHost);
        onPopulateNodeForVirtualView(i, c3055M5946);
        if (c3055M5946.m6000() == null && c3055M5946.m5977() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c3055M5946.m5967(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM5964 = c3055M5946.m5964();
        if ((iM5964 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM5964 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c3055M5946.m6087(this.mHost.getContext().getPackageName());
        c3055M5946.m6101(this.mHost, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            c3055M5946.m6048(true);
            c3055M5946.m118(128);
        } else {
            c3055M5946.m6048(false);
            c3055M5946.m118(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            c3055M5946.m118(2);
        } else if (c3055M5946.m6024()) {
            c3055M5946.m118(1);
        }
        c3055M5946.m6071(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c3055M5946.m5968(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c3055M5946.m5967(this.mTempScreenRect);
            if (c3055M5946.f45 != -1) {
                C3055 c3055M59462 = C3055.m5946();
                for (int i2 = c3055M5946.f45; i2 != -1; i2 = c3055M59462.f45) {
                    c3055M59462.m6090(this.mHost, -1);
                    c3055M59462.m6051(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i2, c3055M59462);
                    c3055M59462.m5967(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                c3055M59462.m6041();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c3055M5946.m6052(this.mTempScreenRect);
                if (m14446(this.mTempScreenRect)) {
                    c3055M5946.m6115(true);
                }
            }
        }
        return c3055M5946;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C3055 m14443() {
        C3055 c3055M5948 = C3055.m5948(this.mHost);
        C8273.m27418(this.mHost, c3055M5948);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c3055M5948.m5972() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c3055M5948.m5953(this.mHost, ((Integer) arrayList.get(i)).intValue());
        }
        return c3055M5948;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C7533<C3055> m14444() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        C7533<C3055> c7533 = new C7533<>();
        for (int i = 0; i < arrayList.size(); i++) {
            c7533.m23569(arrayList.get(i).intValue(), m14442(arrayList.get(i).intValue()));
        }
        return c7533;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m14445(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m5967(rect);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final boolean m14446(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m14447(int i, @InterfaceC6490 Rect rect) {
        C3055 c3055;
        C7533<C3055> c7533M14444 = m14444();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        C3055 c3055M23563 = i2 == Integer.MIN_VALUE ? null : c7533M14444.m23563(i2);
        if (i == 1 || i == 2) {
            c3055 = (C3055) C5040.m15536(c7533M14444, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c3055M23563, i, C8273.m27356(this.mHost) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.mKeyboardFocusedVirtualViewId;
            if (i3 != Integer.MIN_VALUE) {
                m14445(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m14435(this.mHost, i, rect2);
            }
            c3055 = (C3055) C5040.m15535(c7533M14444, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c3055M23563, rect2, i);
        }
        return requestKeyboardFocusForVirtualView(c3055 != null ? c7533M14444.m23568(c7533M14444.m23566(c3055)) : Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m14448(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? onPerformActionForVirtualView(i, i2, bundle) : m14437(i) : m14450(i) : clearKeyboardFocusForVirtualView(i) : requestKeyboardFocusForVirtualView(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m14449(int i, Bundle bundle) {
        return C8273.m27421(this.mHost, i, bundle);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m14450(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m14437(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m14451(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM14439 = m14439(i, 2048);
        C3025.m5936(accessibilityEventM14439, i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventM14439);
    }
}
