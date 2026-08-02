package p000;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u42 extends u00 {

    /* JADX INFO: renamed from: k */
    public in0 f11098k;

    /* JADX INFO: renamed from: l */
    public il1 f11099l;

    /* JADX INFO: renamed from: m */
    public il1 f11100m;

    /* JADX INFO: renamed from: n */
    public int f11101n;

    /* JADX INFO: renamed from: o */
    public int f11102o;

    /* JADX INFO: renamed from: p */
    public int f11103p;

    /* JADX INFO: renamed from: q */
    public /* synthetic */ Object f11104q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ QuickJs f11105r;

    /* JADX INFO: renamed from: s */
    public int f11106s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u42(QuickJs quickJs, t00 t00Var) {
        super(t00Var);
        this.f11105r = quickJs;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        this.f11104q = obj;
        this.f11106s |= Integer.MIN_VALUE;
        return this.f11105r.evalAndAwait(null, this);
    }
}
