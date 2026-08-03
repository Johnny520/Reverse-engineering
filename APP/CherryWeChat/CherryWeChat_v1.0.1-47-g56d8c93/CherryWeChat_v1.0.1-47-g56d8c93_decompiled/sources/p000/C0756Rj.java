package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: renamed from: Rj */
/* JADX INFO: loaded from: classes.dex */
public final class C0756Rj extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    public static final C2806zj f2395k;

    /* JADX INFO: renamed from: a */
    public final C2812zp f2396a;

    /* JADX INFO: renamed from: b */
    public final C0061Bb f2397b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f2398c;

    /* JADX INFO: renamed from: d */
    public final C0668Pg f2399d;

    /* JADX INFO: renamed from: e */
    public final List f2400e;

    /* JADX INFO: renamed from: f */
    public final C0521M4 f2401f;

    /* JADX INFO: renamed from: g */
    public final C1264cg f2402g;

    /* JADX INFO: renamed from: h */
    public final C0132D2 f2403h;

    /* JADX INFO: renamed from: i */
    public final int f2404i;

    /* JADX INFO: renamed from: j */
    public C2252mw f2405j;

    static {
        C2806zj c2806zj = new C2806zj();
        c2806zj.f9518a = C0808Ss.f2552a;
        f2395k = c2806zj;
    }

    public C0756Rj(Context context, C2812zp c2812zp, C2692wy c2692wy, C0668Pg c0668Pg, C0668Pg c0668Pg2, C0521M4 c0521m4, List list, C1264cg c1264cg, C0132D2 c0132d2) {
        super(context.getApplicationContext());
        this.f2396a = c2812zp;
        this.f2398c = c0668Pg;
        this.f2399d = c0668Pg2;
        this.f2400e = list;
        this.f2401f = c0521m4;
        this.f2402g = c1264cg;
        this.f2403h = c0132d2;
        this.f2404i = 4;
        this.f2397b = new C0061Bb(c2692wy);
    }

    /* JADX INFO: renamed from: a */
    public final C0683Pv m1544a() {
        return (C0683Pv) this.f2397b.get();
    }
}
