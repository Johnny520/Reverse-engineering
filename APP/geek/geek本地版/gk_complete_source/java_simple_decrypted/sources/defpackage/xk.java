package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class xk implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ y1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ xk(String r1, Context r2, y1 r3, int r4, int r5) {
        this.a = r5;
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.a) {
            case 0: goto L8;
            default: goto L10;
        };
    L8:
        y1 r0 = this.d;
        int r1 = this.e;
        return al.a(this.b, this.c, r0, r1);
    L10:
        return al.a(this.b, this.c, this.d, this.e);
    L7:
        return new zk(-3);
    }
}
