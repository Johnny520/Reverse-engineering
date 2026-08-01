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

/* JADX INFO: renamed from: ia */
/* JADX INFO: loaded from: classes.dex */
public final class C0328ia extends C0875x {

    /* JADX INFO: renamed from: o */
    public static final Rect f2387o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: p */
    public static final C0819vh f2388p = new C0819vh(20);

    /* JADX INFO: renamed from: q */
    public static final C0819vh f2389q = new C0819vh(21);

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f2394h;

    /* JADX INFO: renamed from: i */
    public final Chip f2395i;

    /* JADX INFO: renamed from: j */
    public C0487mj f2396j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Chip f2400n;

    /* JADX INFO: renamed from: d */
    public final Rect f2390d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f2391e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f2392f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f2393g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f2397k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f2398l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f2399m = Integer.MIN_VALUE;

    public C0328ia(Chip chip, Chip chip2) {
        this.f2400n = chip;
        this.f2395i = chip2;
        this.f2394h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = ja0.f2600a;
        if (s90.m2311c(chip2) == 0) {
            s90.m2327s(chip2, 1);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: b */
    public final C0431l0 mo616b(View view) {
        if (this.f2396j == null) {
            this.f2396j = new C0487mj(this);
        }
        return this.f2396j;
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo66d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
        this.f5076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f2400n;
        C0404ka c0404ka = chip.f1101e;
        accessibilityNodeInfo.setCheckable(c0404ka != null && c0404ka.f2769Q);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1417j(int i) {
        if (this.f2398l != i) {
            return false;
        }
        this.f2398l = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.f2400n;
            chip.f1109m = false;
            chip.refreshDrawableState();
        }
        m1423p(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C0357j0 m1418k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0357j0 c0357j0 = new C0357j0(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoObtain.setClassName("android.view.View");
        Rect rect = f2387o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f2395i;
        accessibilityNodeInfoObtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
        if (i == 1) {
            Chip chip2 = this.f2400n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip2.getCloseIconTouchBoundsInt());
            c0357j0.m1534b(C0281h0.f2180e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f1098w);
        }
        if (c0357j0.m1537e() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2391e;
        c0357j0.m1536d(rect2);
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
        c0357j0.f2514b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f2397k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0357j0.m1533a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0357j0.m1533a(64);
        }
        boolean z = this.f2398l == i;
        if (z) {
            c0357j0.m1533a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0357j0.m1533a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f2393g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f2390d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c0357j0.m1536d(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f2392f;
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
    public final void m1419l(ArrayList arrayList) {
        C0404ka c0404ka;
        arrayList.add(0);
        Rect rect = Chip.f1098w;
        Chip chip = this.f2400n;
        if (!chip.m751c() || (c0404ka = chip.f1101e) == null || !c0404ka.f2763K || chip.f1104h == null) {
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
    public final boolean m1420m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0328ia.m1420m(int, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: n */
    public final C0357j0 m1421n(int i) {
        if (i != -1) {
            return m1418k(i);
        }
        Chip chip = this.f2395i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C0357j0 c0357j0 = new C0357j0(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = ja0.f2600a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        m1419l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0357j0.f2513a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0357j0;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1422o(int i) {
        int i2;
        Chip chip = this.f2395i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f2398l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m1417j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f2398l = i;
        if (i == 1) {
            Chip chip2 = this.f2400n;
            chip2.f1109m = true;
            chip2.refreshDrawableState();
        }
        m1423p(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m1423p(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f2394h.isEnabled() || (parent = (view = this.f2395i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C0357j0 c0357j0M1421n = m1421n(i);
            accessibilityEventObtain.getText().add(c0357j0M1421n.m1537e());
            AccessibilityNodeInfo accessibilityNodeInfo = c0357j0M1421n.f2513a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            AbstractC0505n0.m1879a(accessibilityEventObtain, view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
