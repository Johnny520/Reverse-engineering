package p000;

import android.content.Context;

/* JADX INFO: renamed from: ag */
/* JADX INFO: loaded from: classes.dex */
public final class C0017ag extends AbstractC0545o3 {

    /* JADX INFO: renamed from: c */
    public boolean f138c;

    /* JADX INFO: renamed from: d */
    public boolean f139d;

    /* JADX INFO: renamed from: e */
    public C0138d4 f140e;

    /* JADX INFO: renamed from: j */
    public final C0138d4 m94j(Context context) {
        if (this.f139d) {
            return this.f140e;
        }
        g40 g40Var = (g40) this.f3479a;
        C0138d4 c0138d4M1158A = AbstractC0222ff.m1158A(context, g40Var.f2016c, g40Var.f2014a == 2, this.f138c);
        this.f140e = c0138d4M1158A;
        this.f139d = true;
        return c0138d4M1158A;
    }
}
