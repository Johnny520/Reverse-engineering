package p169;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2246;
import bsh.C2633;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p075.C6958;
import p075.C6961;
import p155.C7607;
import p301.C8605;
import p301.C8606;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7720 extends C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C7721 f20964;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AccessibilityManager f20967;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Chip f20968;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Rect f20959 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C6958 f20958 = new C6958(8);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C6961 f20960 = new C6961(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Rect f20966 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Rect f20965 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Rect f20969 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int[] f20970 = new int[2];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f20963 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f20962 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f20961 = Integer.MIN_VALUE;

    public AbstractC7720(Chip chip) {
        this.f20968 = chip;
        this.f20967 = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3591(View view, C7607 c7607) {
        AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
        this.f6547.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C8606) this).f24140;
        C8605 c8605 = chip.f10229;
        accessibilityNodeInfo.setCheckable(c8605 != null && c8605.f24126);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c7607.m12843(chip.getAccessibilityClassName());
        c7607.m12836(chip.getText());
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C5856 mo3576(View view) {
        if (this.f20964 == null) {
            this.f20964 = new C7721(this);
        }
        return this.f20964;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7607 m13035(int i) {
        if (i != -1) {
            return m13041(i);
        }
        Chip chip = this.f20968;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C7607 c7607 = new C7607(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo13042(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            C2633.m5339("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c7607.f20630.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c7607;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13036(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p169.AbstractC7720.m13036(int, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m13037(int i) {
        int i2;
        Chip chip = this.f20968;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f20962) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m13043(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f20962 = i;
        mo13040(i, true);
        m13038(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13038(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f20967.isEnabled() || (parent = (view = this.f20968).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C7607 c7607M13035 = m13035(i);
            accessibilityEventObtain.getText().add(c7607M13035.m12839());
            AccessibilityNodeInfo accessibilityNodeInfo = c7607M13035.f20630;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                C2633.m5339("Callbacks must add text or a content description in populateEventForVirtualViewId()");
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
    public abstract void mo13039(int i, C7607 c7607);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract void mo13040(int i, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7607 m13041(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C7607 c7607 = new C7607(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c7607.m12843("android.view.View");
        Rect rect = f20959;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        c7607.m12842(rect);
        c7607.f20629 = -1;
        Chip chip = this.f20968;
        accessibilityNodeInfoObtain.setParent(chip);
        mo13039(i, c7607);
        if (c7607.m12839() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            C2633.m5339("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.f20965;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f20966;
        c7607.m12831(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            C2633.m5339("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            C2633.m5339("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            C2633.m5339("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c7607.f20628 = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f20963 == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c7607.m12835(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c7607.m12835(64);
        }
        boolean z = this.f20962 == i;
        if (z) {
            c7607.m12835(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c7607.m12835(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f20970;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (c7607.f20629 != -1) {
                C7607 c76072 = new C7607(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i2 = c7607.f20629; i2 != -1; i2 = c76072.f20629) {
                    c76072.f20629 = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c76072.f20630;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo13039(i2, c76072);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            c7607.m12842(rect4);
            c7607.m12831(rect3);
        }
        Rect rect6 = this.f20969;
        if (chip.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect6)) {
                c7607.m12842(rect3);
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
                            c7607.f20630.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c7607;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo13042(ArrayList arrayList);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m13043(int i) {
        if (this.f20962 != i) {
            return false;
        }
        this.f20962 = Integer.MIN_VALUE;
        mo13040(i, false);
        m13038(i, 8);
        return true;
    }
}
