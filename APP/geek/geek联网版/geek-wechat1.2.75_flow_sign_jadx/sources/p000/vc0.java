package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class vc0 extends tc0 {
    public vc0(bd0 bd0Var, WindowInsets windowInsets) {
        super(bd0Var, windowInsets);
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: a */
    public bd0 mo2562a() {
        return bd0.m515g(null, this.f4305c.consumeDisplayCutout());
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: e */
    public C0018ah mo2563e() {
        DisplayCutout displayCutout = this.f4305c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0018ah(displayCutout);
    }

    @Override // p000.sc0, p000.yc0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc0)) {
            return false;
        }
        vc0 vc0Var = (vc0) obj;
        return Objects.equals(this.f4305c, vc0Var.f4305c) && Objects.equals(this.f4309g, vc0Var.f4309g);
    }

    @Override // p000.yc0
    public int hashCode() {
        return this.f4305c.hashCode();
    }
}
