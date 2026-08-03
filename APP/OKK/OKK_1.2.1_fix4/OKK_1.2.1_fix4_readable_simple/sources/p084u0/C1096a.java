package p084u0;

import android.graphics.Typeface;
import com.abc.core.runtime.AbstractC0805P;
import p006D.C0095d;
import p081s0.C1068b;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1096a extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final Typeface f4224b;

    /* JADX INFO: renamed from: c */
    public final C0095d f4225c;

    /* JADX INFO: renamed from: d */
    public boolean f4226d;

    public C1096a(C0095d r1, Typeface r2) {
        this.f4224b = r2;
        this.f4225c = r1;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: M */
    public final void mo2059M(int r2) {
        if (this.f4226d == true) goto L8;
        C1068b r22 = (C1068b) this.f4225c.f251b;
        if (r22.m2546j(this.f4224b) == false) goto L9;
        r22.m2544h(false);
        return;
    L9:
        return;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: N */
    public final void mo2060N(Typeface r1, boolean r2) {
        if (this.f4226d == true) goto L8;
        C1068b r22 = (C1068b) this.f4225c.f251b;
        if (r22.m2546j(r1) == false) goto L9;
        r22.m2544h(false);
        return;
    L9:
        return;
    }
}
