package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class is implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io.fastkv.MPFastKV b;

    public /* synthetic */ is(io.fastkv.MPFastKV r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            io.fastkv.MPFastKV r0 = r1.b
            io.fastkv.MPFastKV.d(r0)
            return
        Lb:
            io.fastkv.MPFastKV r0 = r1.b
            io.fastkv.MPFastKV.e(r0)
            return
    }
}
