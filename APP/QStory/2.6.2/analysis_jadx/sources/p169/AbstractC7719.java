package p169;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2246;
import bsh.C2632;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p075.C6957;
import p075.C6960;
import p155.C7606;
import p301.C8613;
import p301.C8614;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7719 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7720 f20969;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AccessibilityManager f20972;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Chip f20973;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Rect f20964 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C6957 f20963 = new C6957(8);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C6960 f20965 = new C6960(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Rect f20971 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Rect f20970 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Rect f20974 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int[] f20975 = new int[2];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f20968 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f20967 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f20966 = Integer.MIN_VALUE;

    public AbstractC7719(Chip chip) {
        this.f20973 = chip;
        this.f20972 = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3581(View view, C7606 c7606) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
        this.f6546.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C8614) this).f24149;
        C8613 c8613 = chip.f10224;
        accessibilityNodeInfo.setCheckable(c8613 != null && c8613.f24135);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c7606.m12814(chip.getAccessibilityClassName());
        c7606.m12807(chip.getText());
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C5851 mo3566(View view) {
        if (this.f20969 == null) {
            this.f20969 = new C7720(this);
        }
        return this.f20969;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7606 m13005(int i) {
        if (i != -1) {
            return m13011(i);
        }
        Chip chip = this.f20973;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C7606 c7606 = new C7606(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo13012(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            C2632.m5294("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c7606.f20635.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c7606;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13006(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p169.AbstractC7719.m13006(int, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m13007(int i) {
        int i2;
        Chip chip = this.f20973;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f20967) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m13013(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f20967 = i;
        mo13010(i, true);
        m13008(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13008(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f20972.isEnabled() || (parent = (view = this.f20973).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C7606 c7606M13005 = m13005(i);
            accessibilityEventObtain.getText().add(c7606M13005.m12810());
            AccessibilityNodeInfo accessibilityNodeInfo = c7606M13005.f20635;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                C2632.m5294("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract void mo13009(int i, C7606 c7606);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract void mo13010(int i, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7606 m13011(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C7606 c7606 = new C7606(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c7606.m12814("android.view.View");
        Rect rect = f20964;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        c7606.m12813(rect);
        c7606.f20634 = -1;
        Chip chip = this.f20973;
        accessibilityNodeInfoObtain.setParent(chip);
        mo13009(i, c7606);
        if (c7606.m12810() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            C2632.m5294("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.f20970;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f20971;
        c7606.m12802(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            C2632.m5294("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            C2632.m5294("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            C2632.m5294("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c7606.f20633 = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f20968 == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c7606.m12806(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c7606.m12806(64);
        }
        boolean z = this.f20967 == i;
        if (z) {
            c7606.m12806(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c7606.m12806(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f20975;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (c7606.f20634 != -1) {
                C7606 c76062 = new C7606(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i2 = c7606.f20634; i2 != -1; i2 = c76062.f20634) {
                    c76062.f20634 = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c76062.f20635;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo13009(i2, c76062);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            c7606.m12813(rect4);
            c7606.m12802(rect3);
        }
        Rect rect6 = this.f20974;
        if (chip.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect6)) {
                c7606.m12813(rect3);
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
                            c7606.f20635.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c7606;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo13012(ArrayList arrayList);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m13013(int i) {
        if (this.f20967 != i) {
            return false;
        }
        this.f20967 = Integer.MIN_VALUE;
        mo13010(i, false);
        m13008(i, 8);
        return true;
    }
}
