package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 extends ContextWrapper {

    /* JADX INFO: renamed from: k */
    public static final to0 f12098k;

    /* JADX INFO: renamed from: a */
    public final td1 f12099a;

    /* JADX INFO: renamed from: b */
    public final af0 f12100b;

    /* JADX INFO: renamed from: c */
    public final C0953z8 f12101c;

    /* JADX INFO: renamed from: d */
    public final C0160eb f12102d;

    /* JADX INFO: renamed from: e */
    public final List f12103e;

    /* JADX INFO: renamed from: f */
    public final C0276hg f12104f;

    /* JADX INFO: renamed from: g */
    public final bf0 f12105g;

    /* JADX INFO: renamed from: h */
    public final C0485n4 f12106h;

    /* JADX INFO: renamed from: i */
    public final int f12107i;

    /* JADX INFO: renamed from: j */
    public z82 f12108j;

    static {
        to0 to0Var = new to0();
        to0Var.f10863h = rn1.f9649a;
        f12098k = to0Var;
    }

    public vp0(Context context, td1 td1Var, er2 er2Var, C0953z8 c0953z8, C0160eb c0160eb, C0276hg c0276hg, List list, bf0 bf0Var, C0485n4 c0485n4) {
        super(context.getApplicationContext());
        this.f12099a = td1Var;
        this.f12101c = c0953z8;
        this.f12102d = c0160eb;
        this.f12103e = list;
        this.f12104f = c0276hg;
        this.f12105g = bf0Var;
        this.f12106h = c0485n4;
        this.f12107i = 4;
        this.f12100b = new af0(er2Var);
    }

    /* JADX INFO: renamed from: a */
    public final v72 m5748a() {
        return (v72) this.f12100b.get();
    }
}
