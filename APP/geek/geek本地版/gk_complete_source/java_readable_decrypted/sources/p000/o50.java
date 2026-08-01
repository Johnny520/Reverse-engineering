package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class o50 implements Serializable {

    /* JADX INFO: renamed from: a */
    public C0723sw f3496a;

    /* JADX INFO: renamed from: b */
    public volatile Object f3497b = C0819vh.f4854m;

    /* JADX INFO: renamed from: c */
    public final Object f3498c = this;

    public o50(C0723sw c0723sw) {
        this.f3496a = c0723sw;
    }

    /* JADX INFO: renamed from: a */
    public final Object m2000a() {
        Object objMo10a;
        Object obj = this.f3497b;
        C0819vh c0819vh = C0819vh.f4854m;
        if (obj != c0819vh) {
            return obj;
        }
        synchronized (this.f3498c) {
            objMo10a = this.f3497b;
            if (objMo10a == c0819vh) {
                C0723sw c0723sw = this.f3496a;
                AbstractC0346ip.m1500l(c0723sw);
                objMo10a = c0723sw.mo10a();
                this.f3497b = objMo10a;
                this.f3496a = null;
            }
        }
        return objMo10a;
    }

    public final String toString() {
        return this.f3497b != C0819vh.f4854m ? String.valueOf(m2000a()) : "Lazy value not initialized yet.";
    }
}
