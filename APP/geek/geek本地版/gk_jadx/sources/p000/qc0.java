package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class qc0 extends oc0 {
    public qc0(wc0 wc0Var, WindowInsets windowInsets) {
        super(wc0Var, windowInsets);
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: a */
    public wc0 mo2169a() {
        return wc0.m2563g(null, this.f3390c.consumeDisplayCutout());
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: e */
    public C0929yg mo2170e() {
        DisplayCutout displayCutout = this.f3390c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0929yg(displayCutout);
    }

    @Override // p000.nc0, p000.tc0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0)) {
            return false;
        }
        qc0 qc0Var = (qc0) obj;
        return Objects.equals(this.f3390c, qc0Var.f3390c) && Objects.equals(this.f3394g, qc0Var.f3394g);
    }

    @Override // p000.tc0
    public int hashCode() {
        return this.f3390c.hashCode();
    }
}
