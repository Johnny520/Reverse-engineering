package p084u0;

import android.graphics.Typeface;
import p006D.C0095d;
import p056f0.AbstractC0805P;
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

    public C1096a(C0095d c0095d, Typeface typeface) {
        this.f4224b = typeface;
        this.f4225c = c0095d;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: M */
    public final void mo2059M(int i2) {
        if (this.f4226d) {
            return;
        }
        C1068b c1068b = (C1068b) this.f4225c.f251b;
        if (c1068b.m2546j(this.f4224b)) {
            c1068b.m2544h(false);
        }
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: N */
    public final void mo2060N(Typeface typeface, boolean z2) {
        if (this.f4226d) {
            return;
        }
        C1068b c1068b = (C1068b) this.f4225c.f251b;
        if (c1068b.m2546j(typeface)) {
            c1068b.m2544h(false);
        }
    }
}
