package p332wb;

import gg.AbstractC1416l;

/* JADX INFO: renamed from: wb.o5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5165o5 extends AbstractC5231q5 {

    /* JADX INFO: renamed from: a */
    public final EnumC5033k5 f19315a;

    /* JADX INFO: renamed from: b */
    public final C5330t5 f19316b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5165o5(EnumC5033k5 enumC5033k5, C5330t5 c5330t5) {
        enumC5033k5.getClass();
        this.f19315a = enumC5033k5;
        this.f19316b = c5330t5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5165o5)) {
            return false;
        }
        C5165o5 c5165o5 = (C5165o5) obj;
        return this.f19315a == c5165o5.f19315a && AbstractC1416l.m3825a(this.f19316b, c5165o5.f19316b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f19315a.hashCode() * 31;
        C5330t5 c5330t5 = this.f19316b;
        return iHashCode + (c5330t5 == null ? 0 : c5330t5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Contacts(filter=" + this.f19315a + ", label=" + this.f19316b + ")";
    }
}
