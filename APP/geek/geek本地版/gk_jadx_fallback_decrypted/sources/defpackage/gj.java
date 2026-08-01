package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gj extends defpackage.hj {
    public final defpackage.i8 c;
    public final /* synthetic */ defpackage.jj d;

    public gj(defpackage.jj r1, long r2, defpackage.i8 r4) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.a = r2
            r1 = -1
            r0.b = r1
            r0.c = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            i8 r0 = r2.c
            jj r1 = r2.d
            r0.s(r1)
            return
    }

    @Override // defpackage.hj
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            i8 r1 = r2.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
