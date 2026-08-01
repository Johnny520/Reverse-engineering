package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t70 extends defpackage.s70 {
    public final /* synthetic */ defpackage.n6 a;
    public final /* synthetic */ defpackage.u70 b;

    public t70(defpackage.u70 r1, defpackage.n6 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // defpackage.q70
    public final void e(defpackage.r70 r4) {
            r3 = this;
            u70 r0 = r3.b
            android.view.ViewGroup r0 = r0.b
            r1 = 0
            n6 r2 = r3.a
            java.lang.Object r0 = r2.getOrDefault(r0, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r4)
            r4.u(r3)
            return
    }
}
