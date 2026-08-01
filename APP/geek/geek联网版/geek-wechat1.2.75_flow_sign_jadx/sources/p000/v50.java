package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class v50 implements Serializable {

    /* JADX INFO: renamed from: a */
    public C0047ax f4903a;

    /* JADX INFO: renamed from: b */
    public volatile Object f4904b = C0893xh.f5257m;

    /* JADX INFO: renamed from: c */
    public final Object f4905c = this;

    public v50(C0047ax c0047ax) {
        this.f4903a = c0047ax;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2543a() {
        Object objMo474a;
        Object obj = this.f4904b;
        C0893xh c0893xh = C0893xh.f5257m;
        if (obj != c0893xh) {
            return obj;
        }
        synchronized (this.f4905c) {
            objMo474a = this.f4904b;
            if (objMo474a == c0893xh) {
                C0047ax c0047ax = this.f4903a;
                AbstractC0493mp.m1854d(c0047ax);
                objMo474a = c0047ax.mo474a();
                this.f4904b = objMo474a;
                this.f4903a = null;
            }
        }
        return objMo474a;
    }

    public final String toString() {
        return this.f4904b != C0893xh.f5257m ? String.valueOf(m2543a()) : "Lazy value not initialized yet.";
    }
}
