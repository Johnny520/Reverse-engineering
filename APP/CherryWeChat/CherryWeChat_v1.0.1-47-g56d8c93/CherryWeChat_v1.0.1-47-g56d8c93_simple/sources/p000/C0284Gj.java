package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: Gj */
/* JADX INFO: loaded from: classes.dex */
public final class C0284Gj implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f924a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f925b;

    public /* synthetic */ C0284Gj(int r1, Object r2) {
        this.f924a = r1;
        this.f925b = r2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r4) {
        switch(this.f924a) {
            case 0: goto L19;
            default: goto L5;
        };
    L19:
        C0327Hj r0 = (C0327Hj) this.f925b;
        int r1 = r4.what;
        if (r1 != 1) goto L23;
        r0.m713b((C0198Ej) r4.obj);
        return true;
    L23:
        if (r1 != 2) goto L25;
        C0198Ej r42 = (C0198Ej) r4.obj;
        r0.f1116d.m2831l(r42);
    L25:
        return false;
    L5:
        if (r4.what == 0) goto L8;
        return false;
    L8:
        C0774S0 r02 = (C0774S0) this.f925b;
        if (r4.obj != null) goto L18;
        monitor-enter(r02.f2448a);
        throw null;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    L18:
        throw new ClassCastException();
    }
}
