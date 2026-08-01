package p264x3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: x3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3453e {

    /* JADX INFO: renamed from: a */
    public final String f10774a;

    /* JADX INFO: renamed from: b */
    public final String f10775b;

    /* JADX INFO: renamed from: c */
    public final String f10776c;

    /* JADX INFO: renamed from: d */
    public final String f10777d;

    /* JADX INFO: renamed from: e */
    public final String f10778e;

    public C3453e(String str, String str2, String str3, String str4, String str5) {
        this.f10774a = str;
        this.f10775b = str2;
        this.f10776c = str3;
        this.f10777d = str4;
        this.f10778e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3453e)) {
            return false;
        }
        C3453e c3453e = (C3453e) obj;
        return AbstractC1665j.m2981a(this.f10774a, c3453e.f10774a) && AbstractC1665j.m2981a(this.f10775b, c3453e.f10775b) && AbstractC1665j.m2981a(this.f10776c, c3453e.f10776c) && AbstractC1665j.m2981a(this.f10777d, c3453e.f10777d) && AbstractC1665j.m2981a(this.f10778e, c3453e.f10778e);
    }

    public final int hashCode() {
        return this.f10778e.hashCode() + AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m394e(this.f10774a.hashCode() * 31, 31, this.f10775b), 31, this.f10776c), 31, this.f10777d);
    }

    public final String toString() {
        StringBuilder sbM405p = AbstractC0231b.m405p("OpenSourceProject(name=", this.f10774a, ", badge=", this.f10775b, ", version=");
        AbstractC3202a.m5468c(sbM405p, this.f10776c, ", references=", this.f10777d, ", summary=");
        return AbstractC0231b.m403n(sbM405p, this.f10778e, ")");
    }
}
