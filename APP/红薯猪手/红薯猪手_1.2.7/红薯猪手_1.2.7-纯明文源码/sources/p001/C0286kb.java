package p001;

import java.io.Serializable;

/* JADX INFO: renamed from: ۟.kb */
/* JADX INFO: loaded from: classes.dex */
public final class C0286kb<T> implements Serializable {

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC0208f3<? extends T> f917;

    /* JADX INFO: renamed from: ۥ۟ */
    public volatile Object f918 = C0272jb.f1532;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Object f1635 = this;

    public C0286kb(InterfaceC0208f3 interfaceC0208f3) {
        this.f917 = interfaceC0208f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f918 != C0272jb.f1532 ? String.valueOf(m886()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: renamed from: ۥ */
    public final T m886() {
        T tMo7;
        T t = (T) this.f918;
        C0272jb c0272jb = C0272jb.f1532;
        if (t != c0272jb) {
            return t;
        }
        synchronized (this.f1635) {
            tMo7 = (T) this.f918;
            if (tMo7 == c0272jb) {
                InterfaceC0208f3<? extends T> interfaceC0208f3 = this.f917;
                C0237h4.m865(interfaceC0208f3);
                tMo7 = interfaceC0208f3.mo7();
                this.f918 = tMo7;
                this.f917 = null;
            }
        }
        return tMo7;
    }
}
