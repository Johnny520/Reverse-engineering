package p056K2;

import java.io.Serializable;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: K2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0892r implements InterfaceC0879e, Serializable {

    /* JADX INFO: renamed from: d */
    public InterfaceC1599a f2781d;

    /* JADX INFO: renamed from: e */
    public Object f2782e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p056K2.InterfaceC0879e
    public final Object getValue() {
        if (this.f2782e == C0890p.f2779a) {
            InterfaceC1599a interfaceC1599a = this.f2781d;
            AbstractC1665j.m2982b(interfaceC1599a);
            this.f2782e = interfaceC1599a.mo6a();
            this.f2781d = null;
        }
        return this.f2782e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2782e != C0890p.f2779a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
