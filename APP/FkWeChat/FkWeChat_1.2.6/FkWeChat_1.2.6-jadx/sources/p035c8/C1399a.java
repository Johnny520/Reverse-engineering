package p035c8;

import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;

/* JADX INFO: renamed from: c8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1399a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2549c f4165a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2560n f4166b;

    public C1399a(InterfaceC2549c interfaceC2549c, InterfaceC2560n interfaceC2560n) {
        interfaceC2549c.getClass();
        this.f4165a = interfaceC2549c;
        this.f4166b = interfaceC2560n;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2560n m5481a() {
        return this.f4166b;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2549c m5482b() {
        return this.f4165a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1399a)) {
            return false;
        }
        InterfaceC2560n interfaceC2560n = this.f4166b;
        if (interfaceC2560n == null) {
            C1399a c1399a = (C1399a) obj;
            if (c1399a.f4166b == null) {
                return AbstractC1061t.m3842c(this.f4165a, c1399a.f4165a);
            }
        }
        return AbstractC1061t.m3842c(interfaceC2560n, ((C1399a) obj).f4166b);
    }

    public int hashCode() {
        InterfaceC2560n interfaceC2560n = this.f4166b;
        return interfaceC2560n != null ? interfaceC2560n.hashCode() : this.f4165a.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TypeInfo(");
        Object obj = this.f4166b;
        if (obj == null) {
            obj = this.f4165a;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
