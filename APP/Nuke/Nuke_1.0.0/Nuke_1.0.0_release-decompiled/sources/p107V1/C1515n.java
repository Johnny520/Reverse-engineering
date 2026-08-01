package p107V1;

import java.util.ArrayDeque;
import p195l2.C2507k;

/* JADX INFO: renamed from: V1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1515n extends C2507k {
    @Override // p195l2.C2507k
    /* JADX INFO: renamed from: c */
    public final void mo2720c(Object obj, Object obj2) {
        C1516o c1516o = (C1516o) obj;
        c1516o.getClass();
        ArrayDeque arrayDeque = C1516o.f5267b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c1516o);
        }
    }
}
