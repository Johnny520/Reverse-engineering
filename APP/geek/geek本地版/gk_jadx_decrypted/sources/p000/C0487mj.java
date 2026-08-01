package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mj */
/* JADX INFO: loaded from: classes.dex */
public final class C0487mj extends C0431l0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0328ia f3220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0487mj(C0328ia c0328ia) {
        super(0);
        this.f3220c = c0328ia;
    }

    @Override // p000.C0431l0
    /* JADX INFO: renamed from: t */
    public final C0357j0 mo1733t(int i) {
        return new C0357j0(AccessibilityNodeInfo.obtain(this.f3220c.m1421n(i).f2513a));
    }

    @Override // p000.C0431l0
    /* JADX INFO: renamed from: u */
    public final C0357j0 mo1734u(int i) {
        C0328ia c0328ia = this.f3220c;
        int i2 = i == 2 ? c0328ia.f2397k : c0328ia.f2398l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1733t(i2);
    }

    @Override // p000.C0431l0
    /* JADX INFO: renamed from: w */
    public final boolean mo1736w(int i, int i2, Bundle bundle) {
        int i3;
        C0328ia c0328ia = this.f3220c;
        Chip chip = c0328ia.f2395i;
        if (i == -1) {
            WeakHashMap weakHashMap = ja0.f2600a;
            return s90.m2318j(chip, i2, bundle);
        }
        if (i2 == 1) {
            return c0328ia.m1422o(i);
        }
        if (i2 == 2) {
            return c0328ia.m1417j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = c0328ia.f2394h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = c0328ia.f2397k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                c0328ia.f2397k = Integer.MIN_VALUE;
                chip.invalidate();
                c0328ia.m1423p(i3, 65536);
            }
            c0328ia.f2397k = i;
            chip.invalidate();
            c0328ia.m1423p(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (c0328ia.f2397k != i) {
                return false;
            }
            c0328ia.f2397k = Integer.MIN_VALUE;
            chip.invalidate();
            c0328ia.m1423p(i, 65536);
            return true;
        }
        Chip chip2 = c0328ia.f2400n;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f1104h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f1115s) {
                    chip2.f1114r.m1423p(1, 1);
                }
            }
        }
        return z;
    }
}
