package p107V1;

import java.util.ArrayDeque;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: V1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1516o {

    /* JADX INFO: renamed from: b */
    public static final ArrayDeque f5267b;

    /* JADX INFO: renamed from: a */
    public Object f5268a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        char[] cArr = AbstractC2511o.f8029a;
        f5267b = new ArrayDeque(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1516o m2787a(Object obj) {
        C1516o c1516o;
        ArrayDeque arrayDeque = f5267b;
        synchronized (arrayDeque) {
            c1516o = (C1516o) arrayDeque.poll();
        }
        if (c1516o == null) {
            c1516o = new C1516o();
        }
        c1516o.f5268a = obj;
        return c1516o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1516o) && this.f5268a.equals(((C1516o) obj).f5268a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5268a.hashCode();
    }
}
