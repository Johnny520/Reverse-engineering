package p056K2;

import java.io.Serializable;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: K2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0887m implements InterfaceC0879e, Serializable {

    /* JADX INFO: renamed from: d */
    public InterfaceC1599a f2775d;

    /* JADX INFO: renamed from: e */
    public volatile Object f2776e;

    /* JADX INFO: renamed from: f */
    public final Object f2777f;

    public C0887m(InterfaceC1599a interfaceC1599a) {
        AbstractC1665j.m2985e(interfaceC1599a, "initializer");
        this.f2775d = interfaceC1599a;
        this.f2776e = C0890p.f2779a;
        this.f2777f = this;
    }

    @Override // p056K2.InterfaceC0879e
    public final Object getValue() {
        Object objMo6a;
        Object obj = this.f2776e;
        C0890p c0890p = C0890p.f2779a;
        if (obj != c0890p) {
            return obj;
        }
        synchronized (this.f2777f) {
            objMo6a = this.f2776e;
            if (objMo6a == c0890p) {
                InterfaceC1599a interfaceC1599a = this.f2775d;
                AbstractC1665j.m2982b(interfaceC1599a);
                objMo6a = interfaceC1599a.mo6a();
                this.f2776e = objMo6a;
                this.f2775d = null;
            }
        }
        return objMo6a;
    }

    public final String toString() {
        return this.f2776e != C0890p.f2779a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
