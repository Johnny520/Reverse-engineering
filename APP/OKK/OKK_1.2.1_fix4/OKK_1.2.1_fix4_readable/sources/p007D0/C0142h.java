package p007D0;

import java.io.Serializable;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: D0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0142h implements InterfaceC0136b, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0275a f331a;

    /* JADX INFO: renamed from: b */
    public volatile Object f332b;

    /* JADX INFO: renamed from: c */
    public final Object f333c;

    public C0142h(InterfaceC0275a interfaceC0275a) {
        AbstractC0307g.m703e(interfaceC0275a, "initializer");
        this.f331a = interfaceC0275a;
        this.f332b = C0145k.f338a;
        this.f333c = this;
    }

    /* JADX INFO: renamed from: a */
    public final Object m466a() {
        Object objInvoke;
        Object obj = this.f332b;
        C0145k c0145k = C0145k.f338a;
        if (obj != c0145k) {
            return obj;
        }
        synchronized (this.f333c) {
            objInvoke = this.f332b;
            if (objInvoke == c0145k) {
                InterfaceC0275a interfaceC0275a = this.f331a;
                AbstractC0307g.m700b(interfaceC0275a);
                objInvoke = interfaceC0275a.invoke();
                this.f332b = objInvoke;
                this.f331a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f332b != C0145k.f338a ? String.valueOf(m466a()) : "Lazy value not initialized yet.";
    }
}
