package p000a;

import java.io.Serializable;

/* JADX INFO: renamed from: a.Me */
/* JADX INFO: loaded from: classes.dex */
public final class C0233Me<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0819s7<? extends T> f774a;

    /* JADX INFO: renamed from: b */
    public volatile Object f775b = C0889w1.f3487o;

    /* JADX INFO: renamed from: c */
    public final Object f776c = this;

    public C0233Me(InterfaceC0819s7 interfaceC0819s7) {
        this.f774a = interfaceC0819s7;
    }

    /* JADX INFO: renamed from: a */
    public final T m625a() {
        T tMo31a;
        T t = (T) this.f775b;
        C0889w1 c0889w1 = C0889w1.f3487o;
        if (t != c0889w1) {
            return t;
        }
        synchronized (this.f776c) {
            tMo31a = (T) this.f775b;
            if (tMo31a == c0889w1) {
                InterfaceC0819s7<? extends T> interfaceC0819s7 = this.f774a;
                C0631i9.m1479b(interfaceC0819s7);
                tMo31a = interfaceC0819s7.mo31a();
                this.f775b = tMo31a;
                this.f774a = null;
            }
        }
        return tMo31a;
    }

    public final String toString() {
        return this.f775b != C0889w1.f3487o ? String.valueOf(m625a()) : "Lazy value not initialized yet.";
    }
}
