package p000;

import com.dokar.quickjs.QuickJs;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 extends AbstractC0602q2 implements d20 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ QuickJs f13304i;

    /* JADX WARN: Illegal instructions before constructor call */
    public y42(QuickJs quickJs) {
        gd3 gd3Var = gd3.f3439q;
        this.f13304i = quickJs;
        super(gd3Var);
    }

    @Override // p000.d20
    /* JADX INFO: renamed from: p */
    public final void mo490p(a20 a20Var, Throwable th) {
        QuickJs quickJs = this.f13304i;
        if (quickJs.evalException == null) {
            quickJs.evalException = th;
        }
    }
}
