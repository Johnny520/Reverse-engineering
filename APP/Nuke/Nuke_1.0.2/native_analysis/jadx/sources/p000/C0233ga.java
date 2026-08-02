package p000;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ga */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0233ga implements j20 {

    /* JADX INFO: renamed from: h */
    public final View f3371h;

    /* JADX INFO: renamed from: i */
    public final o03 f3372i;

    /* JADX INFO: renamed from: j */
    public final j20 f3373j;

    /* JADX INFO: renamed from: k */
    public final AtomicReference f3374k = new AtomicReference(null);

    public C0233ga(View view, o03 o03Var, j20 j20Var) {
        this.f3371h = view;
        this.f3372i = o03Var;
        this.f3373j = j20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1815a(u91 u91Var, u00 u00Var) {
        C0123da c0123da;
        if (u00Var instanceof C0123da) {
            c0123da = (C0123da) u00Var;
            int i = c0123da.f1942m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0123da.f1942m = i - Integer.MIN_VALUE;
            } else {
                c0123da = new C0123da(this, u00Var);
            }
        }
        Object obj = c0123da.f1940k;
        int i2 = c0123da.f1942m;
        if (i2 == 0) {
            fg1.m1627T(obj);
            C0196fa c0196fa = new C0196fa(0, u91Var, this);
            t00 t00Var = null;
            C0003a2 c0003a2 = new C0003a2(this, t00Var, 4);
            c0123da.f1942m = 1;
            if (AbstractC0731te.m5238u(new C0379k9(c0196fa, this.f3374k, c0003a2, t00Var, 8), c0123da) == k20.f5323h) {
                return;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            fg1.m1627T(obj);
        }
        C0676s.m4644b();
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public final a20 mo705g() {
        return this.f3373j.mo705g();
    }
}
