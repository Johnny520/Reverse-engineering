package yyds;

/* JADX INFO: renamed from: yyds.ᛶᲈᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1468 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Class f6980;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Class f6981;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Class f6982;

    public C1468(Class cls, Class cls2, Class cls3) {
        this.f6980 = cls;
        this.f6981 = cls2;
        this.f6982 = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1468.class != obj.getClass()) {
            return false;
        }
        C1468 c1468 = (C1468) obj;
        return this.f6980.equals(c1468.f6980) && this.f6981.equals(c1468.f6981) && AbstractC0181.m757(this.f6982, c1468.f6982);
    }

    public final int hashCode() {
        int iHashCode = (this.f6981.hashCode() + (this.f6980.hashCode() * 31)) * 31;
        Class cls = this.f6982;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f6980 + ", second=" + this.f6981 + '}';
    }
}
