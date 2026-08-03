package p116i;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: i.s1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1789s1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1781q f5966a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1796v f5967b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1789s1(AbstractC1781q abstractC1781q, InterfaceC1796v interfaceC1796v) {
        this.f5966a = abstractC1781q;
        this.f5967b = interfaceC1796v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1789s1)) {
            return false;
        }
        C1789s1 c1789s1 = (C1789s1) obj;
        return AbstractC1416l.m3825a(this.f5966a, c1789s1.f5966a) && AbstractC1416l.m3825a(this.f5967b, c1789s1.f5967b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f5967b.hashCode() + (this.f5966a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f5966a + ", easing=" + this.f5967b + ", arcMode=ArcMode(value=0))";
    }
}
