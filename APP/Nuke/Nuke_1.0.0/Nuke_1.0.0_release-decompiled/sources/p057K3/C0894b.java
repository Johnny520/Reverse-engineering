package p057K3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: K3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0894b {

    /* JADX INFO: renamed from: a */
    public final String f2784a;

    /* JADX INFO: renamed from: b */
    public final String f2785b;

    public C0894b(String str, String str2) {
        AbstractC1665j.m2985e(str, "userId");
        this.f2784a = str;
        this.f2785b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0894b)) {
            return false;
        }
        C0894b c0894b = (C0894b) obj;
        return AbstractC1665j.m2981a(this.f2784a, c0894b.f2784a) && AbstractC1665j.m2981a(this.f2785b, c0894b.f2785b);
    }

    public final int hashCode() {
        return this.f2785b.hashCode() + (this.f2784a.hashCode() * 31);
    }

    public final String toString() {
        return "ClientCredentials(userId=" + this.f2784a + ", platform=" + this.f2785b + ")";
    }
}
