package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class qc0 extends oc0 {
    public qc0(wc0 r1, WindowInsets r2) {
        super(r1, r2);
    }

    @Override // defpackage.tc0
    public wc0 a() {
        return wc0.g(null, pc0.b(this.c));
    }

    @Override // defpackage.tc0
    public yg e() {
        DisplayCutout r0 = pc0.a(this.c);
        if (r0 != null) goto L7;
        return null;
    L7:
        return new yg(r0);
    }

    @Override // defpackage.nc0, defpackage.tc0
    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof qc0) == true) goto L8;
        return false;
    L8:
        qc0 r52 = (qc0) r5;
        if (Objects.equals(this.c, r52.c) == true) goto L11;
    L13:
        return false;
    L11:
        if (Objects.equals(this.g, r52.g) == false) goto L13;
        return true;
    }

    @Override // defpackage.tc0
    public int hashCode() {
        return this.c.hashCode();
    }
}
