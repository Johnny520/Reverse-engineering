package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: oj */
/* JADX INFO: loaded from: classes.dex */
public final class C0561oj extends C0431l0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0626qa f3465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0561oj(C0626qa c0626qa) {
        super(0);
        this.f3465c = c0626qa;
    }

    @Override // p000.C0431l0
    /* JADX INFO: renamed from: t */
    public final C0357j0 mo1723t(int i) {
        return new C0357j0(AccessibilityNodeInfo.obtain(this.f3465c.m2136n(i).f2619a));
    }

    @Override // p000.C0431l0
    /* JADX INFO: renamed from: u */
    public final C0357j0 mo1724u(int i) {
        C0626qa c0626qa = this.f3465c;
        int i2 = i == 2 ? c0626qa.f3885k : c0626qa.f3886l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1723t(i2);
    }

    @Override // p000.C0431l0
    /* JADX INFO: renamed from: w */
    public final boolean mo1726w(int i, int i2, Bundle bundle) {
        int i3;
        C0626qa c0626qa = this.f3465c;
        Chip chip = c0626qa.f3883i;
        if (i == -1) {
            WeakHashMap weakHashMap = oa0.f3426a;
            return x90.m2662j(chip, i2, bundle);
        }
        if (i2 == 1) {
            return c0626qa.m2137o(i);
        }
        if (i2 == 2) {
            return c0626qa.m2132j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = c0626qa.f3882h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = c0626qa.f3885k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                c0626qa.f3885k = Integer.MIN_VALUE;
                chip.invalidate();
                c0626qa.m2138p(i3, 65536);
            }
            c0626qa.f3885k = i;
            chip.invalidate();
            c0626qa.m2138p(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (c0626qa.f3885k != i) {
                return false;
            }
            c0626qa.f3885k = Integer.MIN_VALUE;
            chip.invalidate();
            c0626qa.m2138p(i, 65536);
            return true;
        }
        Chip chip2 = c0626qa.f3888n;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f1029h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.f1040s) {
                    chip2.f1039r.m2138p(1, 1);
                }
            }
        }
        return z;
    }
}
