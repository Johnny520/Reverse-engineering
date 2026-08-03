package p006D;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
import p002B.AbstractC0053c;

/* JADX INFO: renamed from: D.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C0112l0 extends C0110k0 {
    public C0112l0(C0122q0 r1, WindowInsets r2) {
        super(r1, r2);
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: a */
    public C0122q0 mo407a() {
        return C0122q0.m429d(null, AbstractC0053c.m182m(this.f288c));
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: e */
    public C0109k mo408e() {
        DisplayCutout r02 = AbstractC0053c.m181l(this.f288c);
        if (r02 != null) goto L6;
        return null;
    L6:
        return new C0109k(r02);
    }

    @Override // p006D.AbstractC0108j0, p006D.C0118o0
    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0112l0) == true) goto L8;
        return false;
    L8:
        C0112l0 r52 = (C0112l0) r5;
        WindowInsets r1 = r52.f288c;
        if (Objects.equals(this.f288c, r1) == false) goto L14;
        if (Objects.equals(this.f292g, r52.f292g) == false) goto L14;
        return true;
    L14:
        return false;
    }

    @Override // p006D.C0118o0
    public int hashCode() {
        return this.f288c.hashCode();
    }
}
