package p172l8;

import java.io.Serializable;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l8.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4715v implements InterfaceC4705l, Serializable {

    /* JADX INFO: renamed from: q */
    public InterfaceC0173a f13936q;

    /* JADX INFO: renamed from: r */
    public volatile Object f13937r;

    /* JADX INFO: renamed from: s */
    public final Object f13938s;

    public C4715v(InterfaceC0173a interfaceC0173a, Object obj) {
        interfaceC0173a.getClass();
        this.f13936q = interfaceC0173a;
        this.f13937r = C4692e0.f13903a;
        this.f13938s = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C4697h(getValue());
    }

    @Override // p172l8.InterfaceC4705l
    /* JADX INFO: renamed from: a */
    public boolean mo18779a() {
        return this.f13937r != C4692e0.f13903a;
    }

    @Override // p172l8.InterfaceC4705l
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f13937r;
        C4692e0 c4692e0 = C4692e0.f13903a;
        if (obj != c4692e0) {
            return obj;
        }
        synchronized (this.f13938s) {
            objInvoke = this.f13937r;
            if (objInvoke == c4692e0) {
                InterfaceC0173a interfaceC0173a = this.f13936q;
                interfaceC0173a.getClass();
                objInvoke = interfaceC0173a.invoke();
                this.f13937r = objInvoke;
                this.f13936q = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return mo18779a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C4715v(InterfaceC0173a interfaceC0173a, Object obj, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC0173a, (i10 & 2) != 0 ? null : obj);
    }
}
