package p108V3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: V3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1548a {

    /* JADX INFO: renamed from: a */
    public final String f5385a;

    /* JADX INFO: renamed from: b */
    public final String f5386b;

    /* JADX INFO: renamed from: c */
    public final String f5387c;

    public C1548a(String str, String str2, String str3) {
        AbstractC1665j.m2985e(str, "name");
        this.f5385a = str;
        this.f5386b = str2;
        this.f5387c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1548a)) {
            return false;
        }
        C1548a c1548a = (C1548a) obj;
        return AbstractC1665j.m2981a(this.f5385a, c1548a.f5385a) && AbstractC1665j.m2981a(this.f5386b, c1548a.f5386b) && AbstractC1665j.m2981a(this.f5387c, c1548a.f5387c);
    }

    public final int hashCode() {
        return this.f5387c.hashCode() + AbstractC0231b.m394e(this.f5385a.hashCode() * 31, 31, this.f5386b);
    }

    public final String toString() {
        return AbstractC0231b.m403n(AbstractC0231b.m405p("AboutDeveloper(name=", this.f5385a, ", description=", this.f5386b, ", githubUsername="), this.f5387c, ")");
    }
}
