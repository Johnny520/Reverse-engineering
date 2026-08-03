package p000;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2223m9 extends C0645P {

    /* JADX INFO: renamed from: o */
    public static final Rect f7722o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: p */
    public static final C0668Pg f7723p = new C0668Pg(0);

    /* JADX INFO: renamed from: q */
    public static final C0668Pg f7724q = new C0668Pg(1);

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f7729h;

    /* JADX INFO: renamed from: i */
    public final Chip f7730i;

    /* JADX INFO: renamed from: j */
    public C0711Qg f7731j;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Chip f7735n;

    /* JADX INFO: renamed from: d */
    public final Rect f7725d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f7726e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f7727f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f7728g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f7732k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f7733l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f7734m = Integer.MIN_VALUE;

    public C2223m9(Chip chip, Chip chip2) {
        this.f7735n = chip;
        this.f7730i = chip2;
        this.f7729h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: b */
    public final C0132D2 mo317b(View view) {
        if (this.f7731j == null) {
            this.f7731j = new C0711Qg(this);
        }
        return this.f7731j;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View view, C1118a0 c1118a0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
        this.f2082a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f7735n;
        C2309o9 c2309o9 = chip.f4511e;
        accessibilityNodeInfo.setCheckable(c2309o9 != null && c2309o9.f8125Z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1118a0.m2046h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4474j(int i) {
        if (this.f7733l != i) {
            return false;
        }
        this.f7733l = Integer.MIN_VALUE;
        m4479o(i, false);
        m4481q(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C1118a0 m4475k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C1118a0 c1118a0 = new C1118a0(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c1118a0.m2046h("android.view.View");
        Rect rect = f7722o;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f7730i;
        accessibilityNodeInfoObtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = c1118a0.f3530a;
        if (i == 1) {
            Chip chip2 = this.f7735n;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip2.getCloseIconTouchBoundsInt());
            c1118a0.m2041b(C0902V.f2802e);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            c1118a0.m2046h(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f4508w);
        }
        if (c1118a0.m2045g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f7726e;
        c1118a0.m2044f(rect2);
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
        c1118a0.f3531b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f7732k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c1118a0.m2040a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c1118a0.m2040a(64);
        }
        boolean z = this.f7733l == i;
        if (z) {
            c1118a0.m2040a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c1118a0.m2040a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f7728g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f7725d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c1118a0.m2044f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f7727f;
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
                            c1118a0.f3530a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c1118a0;
    }

    /* JADX INFO: renamed from: l */
    public final void m4476l(ArrayList arrayList) {
        C2309o9 c2309o9;
        arrayList.add(0);
        Rect rect = Chip.f4508w;
        Chip chip = this.f7735n;
        if (!chip.m2462c() || (c2309o9 = chip.f4511e) == null || !c2309o9.f8119T || chip.f4514h == null) {
            return;
        }
        arrayList.add(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4477m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        C1118a0 c1118a0;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        m4476l(arrayList);
        C0471Ky c0471Ky = new C0471Ky();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            c0471Ky.m920c(((Integer) arrayList.get(i9)).intValue(), m4475k(((Integer) arrayList.get(i9)).intValue()));
        }
        int i10 = this.f7733l;
        C1118a0 c1118a02 = i10 == Integer.MIN_VALUE ? null : (C1118a0) c0471Ky.m919b(i10);
        C0668Pg c0668Pg = f7723p;
        C0668Pg c0668Pg2 = f7724q;
        Chip chip = this.f7730i;
        if (i == 1 || i == 2) {
            i2 = -1;
            i3 = 0;
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            boolean z = chip.getLayoutDirection() == 1;
            c0668Pg2.getClass();
            int i11 = c0471Ky.f1531c;
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList2.add((C1118a0) c0471Ky.f1530b[i12]);
            }
            Collections.sort(arrayList2, new C0411Jh(z, c0668Pg));
            if (i == 1) {
                int size = arrayList2.size();
                if (c1118a02 != null) {
                    size = arrayList2.indexOf(c1118a02);
                }
                int i13 = size - 1;
                if (i13 >= 0) {
                    obj = arrayList2.get(i13);
                }
                c1118a0 = (C1118a0) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c1118a02 == null ? -1 : arrayList2.lastIndexOf(c1118a02)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                c1118a0 = (C1118a0) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i14 = this.f7733l;
            if (i14 != Integer.MIN_VALUE) {
                m4478n(i14).m2044f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i6 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i6 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    i6 = -1;
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i6 = -1;
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i3 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i3 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i3 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i3 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                c0668Pg2.getClass();
                i7 = c0471Ky.f1531c;
                Rect rect4 = new Rect();
                c1118a0 = null;
                for (i8 = i3; i8 < i7; i8++) {
                    C1118a0 c1118a03 = (C1118a0) c0471Ky.f1530b[i8];
                    if (c1118a03 != c1118a02) {
                        c0668Pg.getClass();
                        c1118a03.m2044f(rect4);
                        if (AbstractC0714Qj.m1502x(i, rect2, rect4)) {
                            if (AbstractC0714Qj.m1502x(i, rect2, rect3) && !AbstractC0714Qj.m1480b(i, rect2, rect4, rect3)) {
                                if (!AbstractC0714Qj.m1480b(i, rect2, rect3, rect4)) {
                                    int iM1504z = AbstractC0714Qj.m1504z(i, rect2, rect4);
                                    int iM1470A = AbstractC0714Qj.m1470A(i, rect2, rect4);
                                    int i15 = (iM1470A * iM1470A) + (iM1504z * 13 * iM1504z);
                                    int iM1504z2 = AbstractC0714Qj.m1504z(i, rect2, rect3);
                                    int iM1470A2 = AbstractC0714Qj.m1470A(i, rect2, rect3);
                                    if (i15 < (iM1470A2 * iM1470A2) + (iM1504z2 * 13 * iM1504z2)) {
                                        rect3.set(rect4);
                                        c1118a0 = c1118a03;
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i6;
            }
            i6 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            c0668Pg2.getClass();
            i7 = c0471Ky.f1531c;
            Rect rect42 = new Rect();
            c1118a0 = null;
            while (i8 < i7) {
            }
            i2 = i6;
        }
        C1118a0 c1118a04 = c1118a0;
        if (c1118a04 == null) {
            i5 = Integer.MIN_VALUE;
        } else {
            int i16 = c0471Ky.f1531c;
            int i17 = i3;
            while (true) {
                if (i17 >= i16) {
                    i4 = i2;
                    break;
                }
                if (c0471Ky.f1530b[i17] == c1118a04) {
                    i4 = i17;
                    break;
                }
                i17++;
            }
            i5 = c0471Ky.f1529a[i4];
        }
        return m4480p(i5);
    }

    /* JADX INFO: renamed from: n */
    public final C1118a0 m4478n(int i) {
        if (i != -1) {
            return m4475k(i);
        }
        Chip chip = this.f7730i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C1118a0 c1118a0 = new C1118a0(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        m4476l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c1118a0.f3530a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c1118a0;
    }

    /* JADX INFO: renamed from: o */
    public final void m4479o(int i, boolean z) {
        Chip chip = this.f7735n;
        if (i == 1) {
            chip.f4519m = z;
        }
        C2309o9 c2309o9 = chip.f4511e;
        boolean z2 = chip.f4519m;
        boolean zM4705R = false;
        if (c2309o9.f8120U != null) {
            zM4705R = c2309o9.m4705R(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : C2309o9.f8090O0);
        }
        if (zM4705R) {
            chip.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4480p(int i) {
        int i2;
        Chip chip = this.f7730i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f7733l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m4474j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f7733l = i;
        m4479o(i, true);
        m4481q(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m4481q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f7729h.isEnabled() || (parent = (view = this.f7730i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C1118a0 c1118a0M4478n = m4478n(i);
            accessibilityEventObtain.getText().add(c1118a0M4478n.m2045g());
            AccessibilityNodeInfo accessibilityNodeInfo = c1118a0M4478n.f3530a;
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
