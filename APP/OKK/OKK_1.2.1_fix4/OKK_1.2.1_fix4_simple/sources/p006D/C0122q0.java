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
    public static final C0122q0 f308b = null;

    /* JADX INFO: renamed from: a */
    public final C0118o0 f309a;

    static {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        f308b = C0116n0.f303q;
        return;
    L5:
        f308b = C0118o0.f304b;
    }

    public C0122q0(WindowInsets r3) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 30) goto L6;
        this.f309a = new C0116n0(this, r3);
        return;
    L6:
        if (r02 < 29) goto L9;
        this.f309a = new C0114m0(this, r3);
        return;
    L9:
        if (r02 < 28) goto L11;
        this.f309a = new C0112l0(this, r3);
        return;
    L11:
        this.f309a = new C0110k0(this, r3);
    }

    /* JADX INFO: renamed from: b */
    public static C1102c m428b(C1102c r5, int r6, int r7, int r8, int r9) {
        int r02 = Math.max(0, r5.f4249a - r6);
        int r2 = Math.max(0, r5.f4250b - r7);
        int r3 = Math.max(0, r5.f4251c - r8);
        int r1 = Math.max(0, r5.f4252d - r9);
        if (r02 != r6) goto L9;
        if (r2 != r7) goto L9;
        if (r3 != r8) goto L9;
        if (r1 != r9) goto L9;
        return r5;
    L9:
        return C1102c.m2598b(r02, r2, r3, r1);
    }

    /* JADX INFO: renamed from: d */
    public static C0122q0 m429d(View r2, WindowInsets r3) {
        r3.getClass();
        C0122q0 r02 = new C0122q0(r3);
        if (r2 != null) goto L5;
    L7:
        return r02;
    L5:
        if (r2.isAttachedToWindow() == false) goto L7;
        Field r32 = AbstractC0080Q.f219a;
        C0122q0 r33 = AbstractC0071H.m237a(r2);
        C0118o0 r1 = r02.f309a;
        r1.mo386p(r33);
        r1.mo380d(r2.getRootView());
        goto L7
    }

    /* JADX INFO: renamed from: a */
    public final int m430a() {
        return this.f309a.mo382j().f4250b;
    }

    /* JADX INFO: renamed from: c */
    public final WindowInsets m431c() {
        C0118o0 r02 = this.f309a;
        if ((r02 instanceof AbstractC0108j0) == true) goto L7;
        return null;
    L7:
        return ((AbstractC0108j0) r02).f288c;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C0122q0) == true) goto L9;
        return false;
    L9:
        C0118o0 r22 = ((C0122q0) r2).f309a;
        return Objects.equals(this.f309a, r22);
    }

    public final int hashCode() {
        C0118o0 r02 = this.f309a;
        if (r02 != null) goto L6;
        return 0;
    L6:
        return r02.hashCode();
    }

    public C0122q0() {
        this.f309a = new C0118o0(this);
    }
}
