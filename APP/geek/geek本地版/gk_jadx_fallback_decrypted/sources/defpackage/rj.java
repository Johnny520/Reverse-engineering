package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io.fastkv.FastKV b;
    public final /* synthetic */ java.lang.String c;

    public /* synthetic */ rj(io.fastkv.FastKV r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            io.fastkv.FastKV r0 = r2.b
            java.lang.String r1 = r2.c
            io.fastkv.FastKV.g(r0, r1)
            return
        Ld:
            io.fastkv.FastKV r0 = r2.b
            java.lang.String r1 = r2.c
            io.fastkv.FastKV.d(r0, r1)
            return
        L15:
            io.fastkv.FastKV r0 = r2.b
            java.lang.String r1 = r2.c
            io.fastkv.FastKV.e(r0, r1)
            return
    }
}
