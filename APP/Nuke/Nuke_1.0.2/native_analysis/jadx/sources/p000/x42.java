package p000;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x42 extends u00 {

    /* JADX INFO: renamed from: k */
    public il1 f12807k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f12808l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ QuickJs f12809m;

    /* JADX INFO: renamed from: n */
    public int f12810n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x42(QuickJs quickJs, t00 t00Var) {
        super(t00Var);
        this.f12809m = quickJs;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        this.f12808l = obj;
        this.f12810n |= Integer.MIN_VALUE;
        return this.f12809m.loadModules(this);
    }
}
