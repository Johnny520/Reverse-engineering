package p021L;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;
import p006D.C0091b;
import p008E.C0156j;
import p008E.C0158l;
import p063j.C0967l;
import p074o0.C1028d;
import p089x0.C1121e;

/* JADX INFO: renamed from: L.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242b extends C0091b {

    /* JADX INFO: renamed from: n */
    public static final Rect f484n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    public static final C1121e f485o = new C1121e(1);

    /* JADX INFO: renamed from: p */
    public static final C1121e f486p = new C1121e(2);

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f491h;

    /* JADX INFO: renamed from: i */
    public final View f492i;

    /* JADX INFO: renamed from: j */
    public C0241a f493j;

    /* JADX INFO: renamed from: d */
    public final Rect f487d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f488e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f489f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f490g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f494k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f495l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f496m = Integer.MIN_VALUE;

    public AbstractC0242b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f492i = view;
        this.f491h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        Field field = AbstractC0080Q.f219a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: b */
    public final C0158l mo314b(View view) {
        if (this.f493j == null) {
            this.f493j = new C0241a(this);
        }
        return this.f493j;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View view, C0156j c0156j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f243a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C1028d) this).f3776q;
        accessibilityNodeInfo.setCheckable(chip.m1871d());
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m661j(int i2) {
        if (this.f495l != i2) {
            return false;
        }
        this.f495l = Integer.MIN_VALUE;
        C1028d c1028d = (C1028d) this;
        if (i2 == 1) {
            Chip chip = c1028d.f3776q;
            chip.f2378m = false;
            chip.refreshDrawableState();
        }
        m668q(i2, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C0156j m662k(int i2) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0156j c0156j = new C0156j(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f484n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        c0156j.f358b = -1;
        View view = this.f492i;
        accessibilityNodeInfoObtain.setParent(view);
        mo666o(i2, c0156j);
        if (c0156j.m510g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f488e;
        c0156j.m509f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        c0156j.f359c = i2;
        accessibilityNodeInfoObtain.setSource(view, i2);
        if (this.f494k == i2) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0156j.m505a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0156j.m505a(64);
        }
        boolean z2 = this.f495l == i2;
        if (z2) {
            c0156j.m505a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0156j.m505a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z2);
        int[] iArr = this.f490g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f487d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0156j.m509f(rect3);
            if (c0156j.f358b != -1) {
                C0156j c0156j2 = new C0156j(AccessibilityNodeInfo.obtain());
                for (int i3 = c0156j.f358b; i3 != -1; i3 = c0156j2.f358b) {
                    c0156j2.f358b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c0156j2.f357a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo666o(i3, c0156j2);
                    c0156j2.m509f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f489f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                c0156j.f357a.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0156j;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo663l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m664m(int i2, Rect rect) {
        int i3;
        int i4;
        Object obj;
        C0156j c0156j;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = new ArrayList();
        mo663l(arrayList);
        C0967l c0967l = new C0967l();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c0967l.m2328d(((Integer) arrayList.get(i8)).intValue(), m662k(((Integer) arrayList.get(i8)).intValue()));
        }
        int i9 = this.f495l;
        int i10 = Integer.MIN_VALUE;
        C0156j c0156j2 = i9 == Integer.MIN_VALUE ? null : (C0156j) c0967l.m2327c(i9, null);
        C1121e c1121e = f485o;
        C1121e c1121e2 = f486p;
        View view = this.f492i;
        if (i2 == 1 || i2 == 2) {
            i3 = 0;
            i4 = -1;
            Field field = AbstractC0080Q.f219a;
            boolean z2 = view.getLayoutDirection() == 1;
            c1121e2.getClass();
            int i11 = c0967l.f3436c;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList2.add((C0156j) c0967l.f3435b[i12]);
            }
            Collections.sort(arrayList2, new C0243c(z2, c1121e));
            if (i2 == 1) {
                int size = arrayList2.size();
                if (c0156j2 != null) {
                    size = arrayList2.indexOf(c0156j2);
                }
                int i13 = size - 1;
                if (i13 >= 0) {
                    obj = arrayList2.get(i13);
                }
                c0156j = (C0156j) obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0156j2 == null ? -1 : arrayList2.lastIndexOf(c0156j2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                c0156j = (C0156j) obj;
            }
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i14 = this.f495l;
            if (i14 != Integer.MIN_VALUE) {
                m665n(i14).m509f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i2 == 17) {
                    i4 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i2 == 33) {
                    i4 = -1;
                    rect2.set(0, height, width, height);
                } else if (i2 == 66) {
                    rect2.set(-1, 0, -1, height);
                    i4 = -1;
                } else {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i4 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i2 != 17) {
                    i3 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i2 == 33) {
                    i3 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i2 == 66) {
                    i3 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i3 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                c1121e2.getClass();
                i6 = c0967l.f3436c;
                Rect rect4 = new Rect();
                c0156j = null;
                for (i7 = i3; i7 < i6; i7++) {
                    C0156j c0156j3 = (C0156j) c0967l.f3435b[i7];
                    if (c0156j3 != c0156j2) {
                        c1121e.getClass();
                        c0156j3.m509f(rect4);
                        if (AbstractC0040p.m79B(i2, rect2, rect4)) {
                            if (AbstractC0040p.m79B(i2, rect2, rect3) && !AbstractC0040p.m100d(i2, rect2, rect4, rect3)) {
                                if (!AbstractC0040p.m100d(i2, rect2, rect3, rect4)) {
                                    int iM83G = AbstractC0040p.m83G(i2, rect2, rect4);
                                    int iM84H = AbstractC0040p.m84H(i2, rect2, rect4);
                                    int i15 = (iM84H * iM84H) + (iM83G * 13 * iM83G);
                                    int iM83G2 = AbstractC0040p.m83G(i2, rect2, rect3);
                                    int iM84H2 = AbstractC0040p.m84H(i2, rect2, rect3);
                                    if (i15 < (iM84H2 * iM84H2) + (iM83G2 * 13 * iM83G2)) {
                                        rect3.set(rect4);
                                        c0156j = c0156j3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i4 = -1;
            Rect rect32 = new Rect(rect2);
            if (i2 != 17) {
            }
            c1121e2.getClass();
            i6 = c0967l.f3436c;
            Rect rect42 = new Rect();
            c0156j = null;
            while (i7 < i6) {
            }
        }
        C0156j c0156j4 = c0156j;
        if (c0156j4 != null) {
            int i16 = i3;
            while (true) {
                if (i16 >= c0967l.f3436c) {
                    i5 = i4;
                    break;
                }
                if (c0967l.f3435b[i16] == c0156j4) {
                    i5 = i16;
                    break;
                }
                i16++;
            }
            i10 = c0967l.f3434a[i5];
        }
        return m667p(i10);
    }

    /* JADX INFO: renamed from: n */
    public final C0156j m665n(int i2) {
        if (i2 != -1) {
            return m662k(i2);
        }
        View view = this.f492i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C0156j c0156j = new C0156j(accessibilityNodeInfoObtain);
        Field field = AbstractC0080Q.f219a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo663l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            c0156j.f357a.addChild(view, ((Integer) arrayList.get(i3)).intValue());
        }
        return c0156j;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo666o(int i2, C0156j c0156j);

    /* JADX INFO: renamed from: p */
    public final boolean m667p(int i2) {
        int i3;
        View view = this.f492i;
        if ((!view.isFocused() && !view.requestFocus()) || (i3 = this.f495l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            m661j(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f495l = i2;
        C1028d c1028d = (C1028d) this;
        if (i2 == 1) {
            Chip chip = c1028d.f3776q;
            chip.f2378m = true;
            chip.refreshDrawableState();
        }
        m668q(i2, 8);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m668q(int i2, int i3) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i2 == Integer.MIN_VALUE || !this.f491h.isEnabled() || (parent = (view = this.f492i).getParent()) == null) {
            return;
        }
        if (i2 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            C0156j c0156jM665n = m665n(i2);
            accessibilityEventObtain.getText().add(c0156jM665n.m510g());
            AccessibilityNodeInfo accessibilityNodeInfo = c0156jM665n.f357a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i2);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i3);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
