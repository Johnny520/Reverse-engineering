package defpackage;

import io.fastkv.FastKV;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FastKV b;
    public final /* synthetic */ String c;

    public /* synthetic */ rj(FastKV r1, String r2, int r3) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        FastKV.g(this.b, this.c);
        return;
    L6:
        FastKV.d(this.b, this.c);
        return;
    L8:
        FastKV.e(this.b, this.c);
    }
}
