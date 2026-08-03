package p116i;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: i.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1755h0 {

    /* JADX INFO: renamed from: a */
    public final Float f5864a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1796v f5865b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1755h0(Float f3, InterfaceC1796v interfaceC1796v) {
        this.f5864a = f3;
        this.f5865b = interfaceC1796v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1755h0)) {
            return false;
        }
        C1755h0 c1755h0 = (C1755h0) obj;
        return c1755h0.f5864a.equals(this.f5864a) && AbstractC1416l.m3825a(c1755h0.f5865b, this.f5865b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5865b.hashCode() + AbstractC0921a.m2242e(0, this.f5864a.hashCode() * 31, 31);
    }
}
