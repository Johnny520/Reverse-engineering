package p006D;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: D.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C0112l0 extends C0110k0 {
    public C0112l0(C0122q0 c0122q0, WindowInsets windowInsets) {
        super(c0122q0, windowInsets);
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: a */
    public C0122q0 mo407a() {
        return C0122q0.m429d(null, this.f288c.consumeDisplayCutout());
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: e */
    public C0109k mo408e() {
        DisplayCutout displayCutout = this.f288c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0109k(displayCutout);
    }

    @Override // p006D.AbstractC0108j0, p006D.C0118o0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0112l0)) {
            return false;
        }
        C0112l0 c0112l0 = (C0112l0) obj;
        return Objects.equals(this.f288c, c0112l0.f288c) && Objects.equals(this.f292g, c0112l0.f292g);
    }

    @Override // p006D.C0118o0
    public int hashCode() {
        return this.f288c.hashCode();
    }
}
