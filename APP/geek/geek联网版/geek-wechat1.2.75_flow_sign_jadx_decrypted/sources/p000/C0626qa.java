package p000;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: qa */
/* JADX INFO: loaded from: classes.dex */
public final class C0626qa extends C0875x {

    /* JADX INFO: renamed from: o */
    public static final Rect f3875o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: p */
    public static final C0893xh f3876p = new C0893xh(22);

    /* JADX INFO: renamed from: q */
    public static final C0893xh f3877q = new C0893xh(23);

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f3882h;

    /* JADX INFO: renamed from: i */
    public final Chip f3883i;

    /* JADX INFO: renamed from: j */
    public C0561oj f3884j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Chip f3888n;

    /* JADX INFO: renamed from: d */
    public final Rect f3878d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f3879e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f3880f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f3881g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f3885k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f3886l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f3887m = Integer.MIN_VALUE;

    public C0626qa(Chip chip, Chip chip2) {
        this.f3888n = chip;
        this.f3883i = chip2;
        this.f3882h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = oa0.f3426a;
        if (x90.m2655c(chip2) == 0) {
            x90.m2671s(chip2, 1);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: b */
    public final C0431l0 mo1554b(View view) {
        if (this.f3884j == null) {
            this.f3884j = new C0561oj(this);
        }
        return this.f3884j;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo760d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
        this.f5147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f3888n;
        C0700sa c0700sa = chip.f1026e;
        accessibilityNodeInfo.setCheckable(c0700sa != null && c0700sa.f4248Q);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2132j(int i) {
        if (this.f3886l != i) {
            return false;
        }
        this.f3886l = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.f3888n;
            chip.f1034m = false;
            chip.refreshDrawableState();
        }
        m2138p(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C0357j0 m2133k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0357j0 c0357j0 = new C0357j0(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f3875o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f3883i;
        accessibilityNodeInfoObtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
        if (i == 1) {
            Chip chip2 = this.f3888n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip2.getCloseIconTouchBoundsInt());
            c0357j0.m1548b(C0281h0.f2068e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1023w);
        }
        if (c0357j0.m1551e() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f3879e;
        c0357j0.m1550d(rect2);
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
        c0357j0.f2620b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f3885k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0357j0.m1547a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0357j0.m1547a(64);
        }
        boolean z = this.f3886l == i;
        if (z) {
            c0357j0.m1547a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0357j0.m1547a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f3881g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f3878d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0357j0.m1550d(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f3880f;
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
        return c0357j0;
    }

    /* JADX INFO: renamed from: l */
    public final void m2134l(ArrayList arrayList) {
        C0700sa c0700sa;
        arrayList.add(0);
        Rect rect = Chip.f1023w;
        Chip chip = this.f3888n;
        if (!chip.m709c() || (c0700sa = chip.f1026e) == null || !c0700sa.f4242K || chip.f1029h == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2135m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0626qa.m2135m(int, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: n */
    public final C0357j0 m2136n(int i) {
        if (i != -1) {
            return m2133k(i);
        }
        Chip chip = this.f3883i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C0357j0 c0357j0 = new C0357j0(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = oa0.f3426a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        m2134l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0357j0.f2619a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0357j0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2137o(int i) {
        int i2;
        Chip chip = this.f3883i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f3886l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m2132j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f3886l = i;
        if (i == 1) {
            Chip chip2 = this.f3888n;
            chip2.f1034m = true;
            chip2.refreshDrawableState();
        }
        m2138p(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m2138p(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f3882h.isEnabled() || (parent = (view = this.f3883i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C0357j0 c0357j0M2136n = m2136n(i);
            accessibilityEventObtain.getText().add(c0357j0M2136n.m1551e());
            AccessibilityNodeInfo accessibilityNodeInfo = c0357j0M2136n.f2619a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            AbstractC0505n0.m1908a(accessibilityEventObtain, view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
