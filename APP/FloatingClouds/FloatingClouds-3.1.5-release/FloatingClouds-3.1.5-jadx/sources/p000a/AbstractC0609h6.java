package p000a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.C1281a;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p000a.C0171J6;

/* JADX INFO: renamed from: a.h6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0609h6 extends C0038C {

    /* JADX INFO: renamed from: n */
    public static final Rect f2242n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    public static final a f2243o = new a();

    /* JADX INFO: renamed from: p */
    public static final b f2244p = new b();

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f2249h;

    /* JADX INFO: renamed from: i */
    public final Chip f2250i;

    /* JADX INFO: renamed from: j */
    public c f2251j;

    /* JADX INFO: renamed from: d */
    public final Rect f2245d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f2246e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f2247f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f2248g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f2252k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f2253l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f2254m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a.h6$a */
    public class a {
    }

    /* JADX INFO: renamed from: a.h6$b */
    public class b {
    }

    /* JADX INFO: renamed from: a.h6$c */
    public class c extends C0164J {
        public c() {
        }

        @Override // p000a.C0164J
        /* JADX INFO: renamed from: a */
        public final C0146I mo453a(int i) {
            return new C0146I(AccessibilityNodeInfo.obtain(AbstractC0609h6.this.m1450n(i).f505a));
        }

        @Override // p000a.C0164J
        /* JADX INFO: renamed from: b */
        public final C0146I mo454b(int i) {
            AbstractC0609h6 abstractC0609h6 = AbstractC0609h6.this;
            int i2 = i == 2 ? abstractC0609h6.f2252k : abstractC0609h6.f2253l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo453a(i2);
        }

        @Override // p000a.C0164J
        /* JADX INFO: renamed from: c */
        public final boolean mo455c(int i, int i2, Bundle bundle) {
            int i3;
            AbstractC0609h6 abstractC0609h6 = AbstractC0609h6.this;
            Chip chip = abstractC0609h6.f2250i;
            if (i == -1) {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                return chip.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 1) {
                return abstractC0609h6.m1452p(i);
            }
            if (i2 == 2) {
                return abstractC0609h6.m1446j(i);
            }
            boolean z = false;
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = abstractC0609h6.f2249h;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC0609h6.f2252k) == i) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    abstractC0609h6.f2252k = Integer.MIN_VALUE;
                    abstractC0609h6.f2250i.invalidate();
                    abstractC0609h6.m1453q(i3, 65536);
                }
                abstractC0609h6.f2252k = i;
                chip.invalidate();
                abstractC0609h6.m1453q(i, 32768);
                return true;
            }
            if (i2 == 128) {
                if (abstractC0609h6.f2252k != i) {
                    return false;
                }
                abstractC0609h6.f2252k = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC0609h6.m1453q(i, 65536);
                return true;
            }
            Chip.C1280b c1280b = (Chip.C1280b) abstractC0609h6;
            if (i2 == 16) {
                Chip chip2 = Chip.this;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i == 1) {
                    chip2.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip2.f5599h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip2);
                        z = true;
                    }
                    if (chip2.f5610s) {
                        chip2.f5609r.m1453q(1, 1);
                    }
                }
            }
            return z;
        }
    }

    public AbstractC0609h6(Chip chip) {
        this.f2250i = chip;
        this.f2249h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: b */
    public final C0164J mo113b(View view) {
        if (this.f2251j == null) {
            this.f2251j = new c();
        }
        return this.f2251j;
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: d */
    public final void mo115d(View view, C0146I c0146i) {
        View.AccessibilityDelegate accessibilityDelegate = this.f137a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        C1281a c1281a = chip.f5596e;
        accessibilityNodeInfo.setCheckable(c1281a != null && c1281a.f5641R);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0146i.m382h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1446j(int i) {
        if (this.f2253l != i) {
            return false;
        }
        this.f2253l = Integer.MIN_VALUE;
        Chip.C1280b c1280b = (Chip.C1280b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.f5604m = false;
            chip.refreshDrawableState();
        }
        m1453q(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C0146I m1447k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0146I c0146i = new C0146I(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c0146i.m382h("android.view.View");
        Rect rect = f2242n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f2250i;
        accessibilityNodeInfoObtain.setParent(chip);
        mo1451o(i, c0146i);
        if (c0146i.m381g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2246e;
        c0146i.m380f(rect2);
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
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c0146i.f506b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f2252k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0146i.m376a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0146i.m376a(64);
        }
        boolean z = this.f2253l == i;
        if (z) {
            c0146i.m376a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0146i.m376a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f2248g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f2245d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0146i.m380f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f2247f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoObtain.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c0146i;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo1448l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1449m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        C0146I c0146i;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList = new ArrayList();
        mo1448l(arrayList);
        C0750oe c0750oe = new C0750oe();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            c0750oe.m1767c(((Integer) arrayList.get(i7)).intValue(), m1447k(((Integer) arrayList.get(i7)).intValue()));
        }
        int i8 = this.f2253l;
        int i9 = Integer.MIN_VALUE;
        C0146I c0146i2 = i8 == Integer.MIN_VALUE ? null : (C0146I) c0750oe.m1766b(i8, null);
        a aVar = f2243o;
        b bVar = f2244p;
        Chip chip = this.f2250i;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            boolean z = chip.getLayoutDirection() == 1;
            bVar.getClass();
            int i10 = c0750oe.f2958c;
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList2.add((C0146I) c0750oe.f2957b[i11]);
            }
            Collections.sort(arrayList2, new C0171J6.a(z, aVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (c0146i2 != null) {
                    size = arrayList2.indexOf(c0146i2);
                }
                int i12 = size - 1;
                if (i12 >= 0) {
                    obj = arrayList2.get(i12);
                    obj2 = obj;
                }
                obj2 = null;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0146i2 == null ? -1 : arrayList2.lastIndexOf(c0146i2)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                    obj2 = obj;
                }
                obj2 = null;
            }
            c0146i = (C0146I) obj2;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f2253l;
            if (i13 != Integer.MIN_VALUE) {
                m1450n(i13).m380f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i3 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i3 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                    i3 = -1;
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                    i3 = -1;
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i2 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i2 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i2 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                bVar.getClass();
                i5 = c0750oe.f2958c;
                Rect rect4 = new Rect();
                c0146i = null;
                for (i6 = i2; i6 < i5; i6++) {
                    C0146I c0146i3 = (C0146I) c0750oe.f2957b[i6];
                    if (c0146i3 != c0146i2) {
                        aVar.getClass();
                        c0146i3.m380f(rect4);
                        if (C0171J6.m460c(i, rect2, rect4)) {
                            if (C0171J6.m460c(i, rect2, rect3) && !C0171J6.m458a(i, rect2, rect4, rect3)) {
                                if (!C0171J6.m458a(i, rect2, rect3, rect4)) {
                                    int iM461d = C0171J6.m461d(i, rect2, rect4);
                                    int iM462e = C0171J6.m462e(i, rect2, rect4);
                                    int i14 = (iM462e * iM462e) + (iM461d * 13 * iM461d);
                                    int iM461d2 = C0171J6.m461d(i, rect2, rect3);
                                    int iM462e2 = C0171J6.m462e(i, rect2, rect3);
                                    if (i14 < (iM462e2 * iM462e2) + (iM461d2 * 13 * iM461d2)) {
                                        rect3.set(rect4);
                                        c0146i = c0146i3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i3 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            bVar.getClass();
            i5 = c0750oe.f2958c;
            Rect rect42 = new Rect();
            c0146i = null;
            while (i6 < i5) {
            }
        }
        C0146I c0146i4 = c0146i;
        if (c0146i4 != null) {
            int i15 = i2;
            while (true) {
                if (i15 >= c0750oe.f2958c) {
                    i4 = i3;
                    break;
                }
                if (c0750oe.f2957b[i15] == c0146i4) {
                    i4 = i15;
                    break;
                }
                i15++;
            }
            i9 = c0750oe.f2956a[i4];
        }
        return m1452p(i9);
    }

    /* JADX INFO: renamed from: n */
    public final C0146I m1450n(int i) {
        if (i != -1) {
            return m1447k(i);
        }
        Chip chip = this.f2250i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C0146I c0146i = new C0146I(accessibilityNodeInfoObtain);
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo1448l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0146i.f505a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0146i;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo1451o(int i, C0146I c0146i);

    /* JADX INFO: renamed from: p */
    public final boolean m1452p(int i) {
        int i2;
        Chip chip = this.f2250i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f2253l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m1446j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f2253l = i;
        Chip.C1280b c1280b = (Chip.C1280b) this;
        if (i == 1) {
            Chip chip2 = Chip.this;
            chip2.f5604m = true;
            chip2.refreshDrawableState();
        }
        m1453q(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m1453q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f2249h.isEnabled() || (parent = (view = this.f2250i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C0146I c0146iM1450n = m1450n(i);
            accessibilityEventObtain.getText().add(c0146iM1450n.m381g());
            AccessibilityNodeInfo accessibilityNodeInfo = c0146iM1450n.f505a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
