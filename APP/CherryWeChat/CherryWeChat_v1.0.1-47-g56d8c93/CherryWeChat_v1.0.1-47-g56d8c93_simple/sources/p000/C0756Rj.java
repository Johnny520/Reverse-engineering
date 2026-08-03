package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: renamed from: Rj */
/* JADX INFO: loaded from: classes.dex */
public final class C0756Rj extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    public static final C2806zj f2395k = null;

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
        C2806zj r0 = new C2806zj();
        r0.f9518a = C0808Ss.f2552a;
        f2395k = r0;
    }

    public C0756Rj(Context r1, C2812zp r2, C2692wy r3, C0668Pg r4, C0668Pg r5, C0521M4 r6, List r7, C1264cg r8, C0132D2 r9) {
        super(r1.getApplicationContext());
        this.f2396a = r2;
        this.f2398c = r4;
        this.f2399d = r5;
        this.f2400e = r7;
        this.f2401f = r6;
        this.f2402g = r8;
        this.f2403h = r9;
        this.f2404i = 4;
        this.f2397b = new C0061Bb(r3);
    }

    /* JADX INFO: renamed from: a */
    public final C0683Pv m1544a() {
        return (C0683Pv) this.f2397b.get();
    }
}
