package p057e1;

import java.util.concurrent.atomic.AtomicReference;
import p172l8.C4700i0;

/* JADX INFO: renamed from: e1.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1993u {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f5538a = new AtomicReference(AbstractC1994v.f5541a);

    /* JADX INFO: renamed from: b */
    public final Object f5539b = new Object();

    /* JADX INFO: renamed from: c */
    public Object f5540c;

    /* JADX INFO: renamed from: a */
    public final Object m7197a() {
        long jM7206a = AbstractC1998z.m7206a();
        return jM7206a == AbstractC1997y.m7205a() ? this.f5540c : ((C1996x) this.f5538a.get()).m7202b(jM7206a);
    }

    /* JADX INFO: renamed from: b */
    public final void m7198b(Object obj) {
        long jM7206a = AbstractC1998z.m7206a();
        if (jM7206a == AbstractC1997y.m7205a()) {
            this.f5540c = obj;
            return;
        }
        synchronized (this.f5539b) {
            C1996x c1996x = (C1996x) this.f5538a.get();
            if (c1996x.m7204d(jM7206a, obj)) {
                return;
            }
            this.f5538a.set(c1996x.m7203c(jM7206a, obj));
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }
}
