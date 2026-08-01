package p185;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.C1129;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3079;
import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p091.C7787;
import p091.C7790;
import p171.C8436;
import p317.C9434;
import p317.C9435;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8549 extends C3079 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C8550 f21309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AccessibilityManager f21312;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Chip f21313;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final Rect f21304 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C7787 f21303 = new C7787(8);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C7790 f21305 = new C7790(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Rect f21311 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Rect f21310 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Rect f21314 = new Rect();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int[] f21315 = new int[2];

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f21308 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f21307 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f21306 = Integer.MIN_VALUE;

    public AbstractC8549(Chip chip) {
        this.f21313 = chip;
        this.f21312 = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4151(View view, C8436 c8436) {
        AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
        this.f6892.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C9435) this).f24485;
        C9434 c9434 = chip.f10574;
        accessibilityNodeInfo.setCheckable(c9434 != null && c9434.f24471);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c8436.m13402(chip.getAccessibilityClassName());
        c8436.m13395(chip.getText());
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6686 mo4136(View view) {
        if (this.f21309 == null) {
            this.f21309 = new C8550(this);
        }
        return this.f21309;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C8436 m13594(int i) {
        if (i != -1) {
            return m13600(i);
        }
        Chip chip = this.f21313;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C8436 c8436 = new C8436(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo13601(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            C3466.m5899("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c8436.f20975.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c8436;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m13595(int i, Rect rect) {
        int i2;
        Object obj;
        C8436 c8436;
        ArrayList arrayList = new ArrayList();
        mo13601(arrayList);
        C1129 c1129 = new C1129(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            c1129.m1418(((Integer) arrayList.get(i3)).intValue(), m13600(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.f21307;
        int i5 = Integer.MIN_VALUE;
        C8436 c84362 = i4 == Integer.MIN_VALUE ? null : (C8436) c1129.m1419(i4);
        C7787 c7787 = f21303;
        C7790 c7790 = f21305;
        Chip chip = this.f21313;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = chip.getLayoutDirection() == 1;
            c7790.getClass();
            int i7 = c1129.f1336;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((C8436) c1129.m1417(i8));
            }
            Collections.sort(arrayList2, new C8548(z, c7787));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (c84362 != null) {
                    size = arrayList2.indexOf(c84362);
                }
                int i9 = size - 1;
                obj = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    C6755.m11869("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c84362 == null ? -1 : arrayList2.lastIndexOf(c84362)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            c8436 = (C8436) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                C6755.m11869("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.f21307;
            if (i10 != Integer.MIN_VALUE) {
                m13594(i10).m13390(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            c7790.getClass();
            int i11 = c1129.f1336;
            Rect rect4 = new Rect();
            c8436 = null;
            for (int i12 = 0; i12 < i11; i12++) {
                C8436 c84363 = (C8436) c1129.m1417(i12);
                if (c84363 != c84362) {
                    c7787.getClass();
                    c84363.m13390(rect4);
                    if (AbstractC3888.m7258(i, rect2, rect4)) {
                        if (AbstractC3888.m7258(i, rect2, rect3) && !AbstractC3888.m7262(i, rect2, rect4, rect3)) {
                            if (!AbstractC3888.m7262(i, rect2, rect3, rect4)) {
                                int iM7243 = AbstractC3888.m7243(i, rect2, rect4);
                                int iM7246 = AbstractC3888.m7246(i, rect2, rect4);
                                int i13 = (iM7246 * iM7246) + (iM7243 * 13 * iM7243);
                                int iM72432 = AbstractC3888.m7243(i, rect2, rect3);
                                int iM72462 = AbstractC3888.m7246(i, rect2, rect3);
                                if (i13 < (iM72462 * iM72462) + (iM72432 * 13 * iM72432)) {
                                    rect3.set(rect4);
                                    c8436 = c84363;
                                }
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        C8436 c84364 = c8436;
        if (c84364 != null) {
            int i14 = c1129.f1336;
            int i15 = i2;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (c1129.f1335[i15] == c84364) {
                    i6 = i15;
                    break;
                }
                i15++;
            }
            i5 = c1129.f1337[i6];
        }
        return m13596(i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m13596(int i) {
        int i2;
        Chip chip = this.f21313;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.f21307) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m13602(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f21307 = i;
        mo13599(i, true);
        m13597(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13597(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f21312.isEnabled() || (parent = (view = this.f21313).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C8436 c8436M13594 = m13594(i);
            accessibilityEventObtain.getText().add(c8436M13594.m13398());
            AccessibilityNodeInfo accessibilityNodeInfo = c8436M13594.f20975;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                C3466.m5899("Callbacks must add text or a content description in populateEventForVirtualViewId()");
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
    public abstract void mo13598(int i, C8436 c8436);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract void mo13599(int i, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8436 m13600(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C8436 c8436 = new C8436(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c8436.m13402("android.view.View");
        Rect rect = f21304;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        c8436.m13401(rect);
        c8436.f20974 = -1;
        Chip chip = this.f21313;
        accessibilityNodeInfoObtain.setParent(chip);
        mo13598(i, c8436);
        if (c8436.m13398() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            C3466.m5899("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.f21310;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f21311;
        c8436.m13390(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            C3466.m5899("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            C3466.m5899("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            C3466.m5899("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c8436.f20973 = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f21308 == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c8436.m13394(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c8436.m13394(64);
        }
        boolean z = this.f21307 == i;
        if (z) {
            c8436.m13394(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c8436.m13394(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f21315;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (c8436.f20974 != -1) {
                C8436 c84362 = new C8436(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i2 = c8436.f20974; i2 != -1; i2 = c84362.f20974) {
                    c84362.f20974 = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c84362.f20975;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo13598(i2, c84362);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            c8436.m13401(rect4);
            c8436.m13390(rect3);
        }
        Rect rect6 = this.f21314;
        if (chip.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect6)) {
                c8436.m13401(rect3);
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
                            c8436.f20975.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c8436;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract void mo13601(ArrayList arrayList);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m13602(int i) {
        if (this.f21307 != i) {
            return false;
        }
        this.f21307 = Integer.MIN_VALUE;
        mo13599(i, false);
        m13597(i, 8);
        return true;
    }
}
