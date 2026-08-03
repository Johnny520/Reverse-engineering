package p006D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
import p085v.C1102c;

/* JADX INFO: renamed from: D.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0122q0 {

    /* JADX INFO: renamed from: b */
    public static final C0122q0 f308b;

    /* JADX INFO: renamed from: a */
    public final C0118o0 f309a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f308b = C0116n0.f303q;
        } else {
            f308b = C0118o0.f304b;
        }
    }

    public C0122q0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f309a = new C0116n0(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f309a = new C0114m0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f309a = new C0112l0(this, windowInsets);
        } else {
            this.f309a = new C0110k0(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1102c m428b(C1102c c1102c, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c1102c.f4249a - i2);
        int iMax2 = Math.max(0, c1102c.f4250b - i3);
        int iMax3 = Math.max(0, c1102c.f4251c - i4);
        int iMax4 = Math.max(0, c1102c.f4252d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c1102c : C1102c.m2598b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: d */
    public static C0122q0 m429d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0122q0 c0122q0 = new C0122q0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = AbstractC0080Q.f219a;
            C0122q0 c0122q0M237a = AbstractC0071H.m237a(view);
            C0118o0 c0118o0 = c0122q0.f309a;
            c0118o0.mo386p(c0122q0M237a);
            c0118o0.mo380d(view.getRootView());
        }
        return c0122q0;
    }

    /* JADX INFO: renamed from: a */
    public final int m430a() {
        return this.f309a.mo382j().f4250b;
    }

    /* JADX INFO: renamed from: c */
    public final WindowInsets m431c() {
        C0118o0 c0118o0 = this.f309a;
        if (c0118o0 instanceof AbstractC0108j0) {
            return ((AbstractC0108j0) c0118o0).f288c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0122q0)) {
            return false;
        }
        return Objects.equals(this.f309a, ((C0122q0) obj).f309a);
    }

    public final int hashCode() {
        C0118o0 c0118o0 = this.f309a;
        if (c0118o0 == null) {
            return 0;
        }
        return c0118o0.hashCode();
    }

    public C0122q0() {
        this.f309a = new C0118o0(this);
    }
}
