package p000;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t42 extends u00 {

    /* JADX INFO: renamed from: k */
    public il1 f10555k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f10556l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ QuickJs f10557m;

    /* JADX INFO: renamed from: n */
    public int f10558n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t42(QuickJs quickJs, t00 t00Var) {
        super(t00Var);
        this.f10557m = quickJs;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        this.f10556l = obj;
        this.f10558n |= Integer.MIN_VALUE;
        return this.f10557m.awaitAsyncJobs(this);
    }
}
