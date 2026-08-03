package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: cA */
/* JADX INFO: loaded from: classes.dex */
public final class C1251cA implements InterfaceC0159Dn, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0884Ui f4248a;

    /* JADX INFO: renamed from: b */
    public volatile Object f4249b = C1456gf.f5166j;

    /* JADX INFO: renamed from: c */
    public final Object f4250c = this;

    public C1251cA(InterfaceC0884Ui interfaceC0884Ui) {
        this.f4248a = interfaceC0884Ui;
    }

    @Override // p000.InterfaceC0159Dn
    public final Object getValue() {
        Object objMo6a;
        Object obj = this.f4249b;
        C1456gf c1456gf = C1456gf.f5166j;
        if (obj != c1456gf) {
            return obj;
        }
        synchronized (this.f4250c) {
            objMo6a = this.f4249b;
            if (objMo6a == c1456gf) {
                objMo6a = this.f4248a.mo6a();
                this.f4249b = objMo6a;
                this.f4248a = null;
            }
        }
        return objMo6a;
    }

    public final String toString() {
        return this.f4249b != C1456gf.f5166j ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
