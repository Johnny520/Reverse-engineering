package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io extends defpackage.cq implements defpackage.sm {
    public final /* synthetic */ defpackage.jo b;
    public final /* synthetic */ defpackage.h1 c;

    public io(defpackage.jo r1, defpackage.h1 r2) {
            r0 = this;
            r0.b = r1
            r0.c = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.sm
    public final java.lang.Object f(java.lang.Object r2) {
            r1 = this;
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            jo r2 = r1.b
            android.os.Handler r2 = r2.c
            h1 r0 = r1.c
            r2.removeCallbacks(r0)
            vh r2 = defpackage.vh.n
            return r2
    }
}
