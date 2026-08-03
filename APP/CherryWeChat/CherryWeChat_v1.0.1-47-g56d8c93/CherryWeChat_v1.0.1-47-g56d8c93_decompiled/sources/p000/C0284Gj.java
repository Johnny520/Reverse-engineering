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

    public /* synthetic */ C0284Gj(int i, Object obj) {
        this.f924a = i;
        this.f925b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f924a) {
            case 0:
                C0327Hj c0327Hj = (C0327Hj) this.f925b;
                int i = message.what;
                if (i == 1) {
                    c0327Hj.m713b((C0198Ej) message.obj);
                    return true;
                }
                if (i == 2) {
                    c0327Hj.f1116d.m2831l((C0198Ej) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                C0774S0 c0774s0 = (C0774S0) this.f925b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (c0774s0.f2448a) {
                    throw null;
                }
        }
    }
}
