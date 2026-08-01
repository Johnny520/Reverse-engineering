package defpackage;

import io.fastkv.FastKV;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FastKV b;

    public /* synthetic */ sj(FastKV r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        FastKV.f(this.b);
        return;
    L6:
        FastKV.c(this.b);
    }
}
