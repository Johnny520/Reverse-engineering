package p000;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class e60 extends AbstractC0498mu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0387ju f1518a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g60 f1519b;

    public e60(g60 g60Var, AbstractC0387ju abstractC0387ju) {
        this.f1519b = g60Var;
        this.f1518a = abstractC0387ju;
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: w */
    public final void mo968w(int i) {
        this.f1519b.f1894m = true;
        this.f1518a.mo1073r(i);
    }

    @Override // p000.AbstractC0498mu
    /* JADX INFO: renamed from: x */
    public final void mo969x(Typeface typeface) {
        g60 g60Var = this.f1519b;
        g60Var.f1895n = Typeface.create(typeface, g60Var.f1884c);
        g60Var.f1894m = true;
        this.f1518a.mo1074s(g60Var.f1895n, false);
    }
}
