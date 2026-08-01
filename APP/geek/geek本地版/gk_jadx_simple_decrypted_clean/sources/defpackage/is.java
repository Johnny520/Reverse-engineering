package defpackage;

import io.fastkv.MPFastKV;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class is implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MPFastKV b;

    public /* synthetic */ is(MPFastKV r1, int r2) {
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
        MPFastKV.d(this.b);
        return;
    L6:
        MPFastKV.e(this.b);
    }
}
