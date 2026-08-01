package p203n;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: n.V */
/* JADX INFO: loaded from: classes.dex */
public final class C2638V implements InterfaceC2637U {

    /* JADX INFO: renamed from: a */
    public final Object f8384a;

    /* JADX INFO: renamed from: b */
    public final Object f8385b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2638V(Object obj, Object obj2) {
        this.f8384a = obj;
        this.f8385b = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2637U
    /* JADX INFO: renamed from: a */
    public final Object mo4476a() {
        return this.f8384a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203n.InterfaceC2637U
    /* JADX INFO: renamed from: c */
    public final Object mo4477c() {
        return this.f8385b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC2637U)) {
            return false;
        }
        InterfaceC2637U interfaceC2637U = (InterfaceC2637U) obj;
        return AbstractC1665j.m2981a(this.f8384a, interfaceC2637U.mo4476a()) && AbstractC1665j.m2981a(this.f8385b, interfaceC2637U.mo4477c());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f8384a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f8385b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
