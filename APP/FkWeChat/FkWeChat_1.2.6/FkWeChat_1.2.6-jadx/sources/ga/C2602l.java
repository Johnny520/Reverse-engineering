package ga;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: ga.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2602l {

    /* JADX INFO: renamed from: a */
    public final EnumC2599k f6904a;

    /* JADX INFO: renamed from: b */
    public final boolean f6905b;

    public C2602l(EnumC2599k enumC2599k, boolean z10) {
        enumC2599k.getClass();
        this.f6904a = enumC2599k;
        this.f6905b = z10;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2602l m9267b(C2602l c2602l, EnumC2599k enumC2599k, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC2599k = c2602l.f6904a;
        }
        if ((i10 & 2) != 0) {
            z10 = c2602l.f6905b;
        }
        return c2602l.m9268a(enumC2599k, z10);
    }

    /* JADX INFO: renamed from: a */
    public final C2602l m9268a(EnumC2599k enumC2599k, boolean z10) {
        enumC2599k.getClass();
        return new C2602l(enumC2599k, z10);
    }

    /* JADX INFO: renamed from: c */
    public final EnumC2599k m9269c() {
        return this.f6904a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9270d() {
        return this.f6905b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2602l)) {
            return false;
        }
        C2602l c2602l = (C2602l) obj;
        return this.f6904a == c2602l.f6904a && this.f6905b == c2602l.f6905b;
    }

    public int hashCode() {
        return (this.f6904a.hashCode() * 31) + Boolean.hashCode(this.f6905b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f6904a + ", isForWarningOnly=" + this.f6905b + ')';
    }

    public /* synthetic */ C2602l(EnumC2599k enumC2599k, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(enumC2599k, (i10 & 2) != 0 ? false : z10);
    }
}
