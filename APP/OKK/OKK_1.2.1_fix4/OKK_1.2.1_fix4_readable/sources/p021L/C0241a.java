package p021L;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;
import p008E.C0156j;
import p008E.C0158l;
import p074o0.C1028d;

/* JADX INFO: renamed from: L.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0241a extends C0158l {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0242b f483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241a(AbstractC0242b abstractC0242b) {
        super(0);
        this.f483c = abstractC0242b;
    }

    @Override // p008E.C0158l
    /* JADX INFO: renamed from: a */
    public final C0156j mo512a(int i2) {
        return new C0156j(AccessibilityNodeInfo.obtain(this.f483c.m665n(i2).f357a));
    }

    @Override // p008E.C0158l
    /* JADX INFO: renamed from: b */
    public final C0156j mo513b(int i2) {
        AbstractC0242b abstractC0242b = this.f483c;
        int i3 = i2 == 2 ? abstractC0242b.f494k : abstractC0242b.f495l;
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        return mo512a(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    @Override // p008E.C0158l
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo514c(int i2, int i3, Bundle bundle) {
        int i4;
        AbstractC0242b abstractC0242b = this.f483c;
        View view = abstractC0242b.f492i;
        if (i2 == -1) {
            Field field = AbstractC0080Q.f219a;
            return view.performAccessibilityAction(i3, bundle);
        }
        boolean z2 = true;
        if (i3 == 1) {
            return abstractC0242b.m667p(i2);
        }
        if (i3 == 2) {
            return abstractC0242b.m661j(i2);
        }
        boolean z3 = false;
        if (i3 == 64) {
            AccessibilityManager accessibilityManager = abstractC0242b.f491h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = abstractC0242b.f494k) != i2) {
                if (i4 != Integer.MIN_VALUE) {
                    abstractC0242b.f494k = Integer.MIN_VALUE;
                    abstractC0242b.f492i.invalidate();
                    abstractC0242b.m668q(i4, 65536);
                }
                abstractC0242b.f494k = i2;
                view.invalidate();
                abstractC0242b.m668q(i2, 32768);
            }
        } else {
            if (i3 != 128) {
                C1028d c1028d = (C1028d) abstractC0242b;
                if (i3 != 16) {
                    return false;
                }
                Chip chip = c1028d.f3776q;
                if (i2 == 0) {
                    return chip.performClick();
                }
                if (i2 != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f2373h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z3 = true;
                }
                if (!chip.f2384s) {
                    return z3;
                }
                chip.f2383r.m668q(1, 1);
                return z3;
            }
            if (abstractC0242b.f494k == i2) {
                abstractC0242b.f494k = Integer.MIN_VALUE;
                view.invalidate();
                abstractC0242b.m668q(i2, 65536);
            } else {
                z2 = false;
            }
        }
        return z2;
    }
}
