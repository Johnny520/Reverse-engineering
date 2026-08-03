package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Qg */
/* JADX INFO: loaded from: classes.dex */
public final class C0711Qg extends C0132D2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2223m9 f2285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0711Qg(C2223m9 c2223m9) {
        super(2);
        this.f2285e = c2223m9;
    }

    @Override // p000.C0132D2
    /* JADX INFO: renamed from: u */
    public final C1118a0 mo246u(int i) {
        return new C1118a0(AccessibilityNodeInfo.obtain(this.f2285e.m4478n(i).f3530a));
    }

    @Override // p000.C0132D2
    /* JADX INFO: renamed from: v */
    public final C1118a0 mo247v(int i) {
        C2223m9 c2223m9 = this.f2285e;
        int i2 = i == 2 ? c2223m9.f7732k : c2223m9.f7733l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo246u(i2);
    }

    @Override // p000.C0132D2
    /* JADX INFO: renamed from: x */
    public final boolean mo249x(int i, int i2, Bundle bundle) {
        int i3;
        C2223m9 c2223m9 = this.f2285e;
        Chip chip = c2223m9.f7730i;
        if (i == -1) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return c2223m9.m4480p(i);
        }
        if (i2 == 2) {
            return c2223m9.m4474j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = c2223m9.f7729h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = c2223m9.f7732k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                c2223m9.f7732k = Integer.MIN_VALUE;
                chip.invalidate();
                c2223m9.m4481q(i3, 65536);
            }
            c2223m9.f7732k = i;
            chip.invalidate();
            c2223m9.m4481q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (c2223m9.f7732k != i) {
                return false;
            }
            c2223m9.f7732k = Integer.MIN_VALUE;
            chip.invalidate();
            c2223m9.m4481q(i, 65536);
            return true;
        }
        Chip chip2 = c2223m9.f7735n;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f4514h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f4525s) {
                    chip2.f4524r.m4481q(1, 1);
                }
            }
        }
        return z;
    }
}
