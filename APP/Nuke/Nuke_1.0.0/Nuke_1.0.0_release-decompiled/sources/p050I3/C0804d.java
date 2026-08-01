package p050I3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0804d {

    /* JADX INFO: renamed from: a */
    public final String f2587a;

    /* JADX INFO: renamed from: b */
    public final String f2588b;

    /* JADX INFO: renamed from: c */
    public final String f2589c;

    /* JADX INFO: renamed from: d */
    public final String f2590d;

    public C0804d(String str, String str2, String str3, String str4) {
        AbstractC1665j.m2985e(str, "iv");
        AbstractC1665j.m2985e(str2, "payload");
        AbstractC1665j.m2985e(str3, "tag");
        AbstractC1665j.m2985e(str4, "kid");
        this.f2587a = str;
        this.f2588b = str2;
        this.f2589c = str3;
        this.f2590d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0804d)) {
            return false;
        }
        C0804d c0804d = (C0804d) obj;
        return AbstractC1665j.m2981a(this.f2587a, c0804d.f2587a) && AbstractC1665j.m2981a(this.f2588b, c0804d.f2588b) && AbstractC1665j.m2981a(this.f2589c, c0804d.f2589c) && AbstractC1665j.m2981a(this.f2590d, c0804d.f2590d);
    }

    public final int hashCode() {
        return this.f2590d.hashCode() + AbstractC0231b.m394e(AbstractC0231b.m394e(this.f2587a.hashCode() * 31, 31, this.f2588b), 31, this.f2589c);
    }

    public final String toString() {
        StringBuilder sbM405p = AbstractC0231b.m405p("NativeEnvelope(iv=", this.f2587a, ", payload=", this.f2588b, ", tag=");
        sbM405p.append(this.f2589c);
        sbM405p.append(", kid=");
        sbM405p.append(this.f2590d);
        sbM405p.append(")");
        return sbM405p.toString();
    }
}
