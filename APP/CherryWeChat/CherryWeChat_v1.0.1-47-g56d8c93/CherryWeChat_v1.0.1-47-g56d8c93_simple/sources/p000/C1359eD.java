package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: eD */
/* JADX INFO: loaded from: classes.dex */
public final class C1359eD implements InterfaceC0159Dn, Serializable {

    /* JADX INFO: renamed from: a */
    public InterfaceC0884Ui f4861a;

    /* JADX INFO: renamed from: b */
    public Object f4862b;

    @Override // p000.InterfaceC0159Dn
    public final Object getValue() {
        if (this.f4862b != C1456gf.f5166j) goto L6;
        this.f4862b = this.f4861a.mo6a();
        this.f4861a = null;
    L6:
        return this.f4862b;
    }

    public final String toString() {
        if (this.f4862b != C1456gf.f5166j) goto L5;
        return "Lazy value not initialized yet.";
    L5:
        return String.valueOf(getValue());
    }
}
