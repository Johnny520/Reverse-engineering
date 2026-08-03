package ua;

import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ua.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4293d {

    /* JADX INFO: renamed from: a */
    public final String f14269a;

    /* JADX INFO: renamed from: b */
    public final String f14270b;

    /* JADX INFO: renamed from: c */
    public final String f14271c;

    /* JADX INFO: renamed from: d */
    public final String f14272d;

    /* JADX INFO: renamed from: e */
    public final int f14273e;

    /* JADX INFO: renamed from: f */
    public final int f14274f;

    /* JADX INFO: renamed from: g */
    public final double f14275g;

    /* JADX INFO: renamed from: h */
    public final String f14276h;

    /* JADX INFO: renamed from: i */
    public final String f14277i;

    /* JADX INFO: renamed from: j */
    public final String f14278j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4293d(String str, String str2, String str3, String str4, int i9, int i10, double d10, String str5, String str6, String str7) {
        this.f14269a = str;
        this.f14270b = str2;
        this.f14271c = str3;
        this.f14272d = str4;
        this.f14273e = i9;
        this.f14274f = i10;
        this.f14275g = d10;
        this.f14276h = str5;
        this.f14277i = str6;
        this.f14278j = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4293d)) {
            return false;
        }
        C4293d c4293d = (C4293d) obj;
        return this.f14269a.equals(c4293d.f14269a) && this.f14270b.equals(c4293d.f14270b) && this.f14271c.equals(c4293d.f14271c) && this.f14272d.equals(c4293d.f14272d) && this.f14273e == c4293d.f14273e && this.f14274f == c4293d.f14274f && Double.compare(this.f14275g, c4293d.f14275g) == 0 && this.f14276h.equals(c4293d.f14276h) && this.f14277i.equals(c4293d.f14277i) && this.f14278j.equals(c4293d.f14278j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14278j.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g((Double.hashCode(this.f14275g) + AbstractC0921a.m2242e(this.f14274f, AbstractC0921a.m2242e(this.f14273e, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f14269a.hashCode() * 31, 31, this.f14270b), 31, this.f14271c), 31, this.f14272d), 31), 31)) * 31, 31, this.f14276h), 31, this.f14277i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("TransferMessageInfo(transactionId=", this.f14269a, ", transId=", this.f14270b, ", payerUsername=");
        AbstractC2091b.m5173t(sbM1027p, this.f14271c, ", receiverUsername=", this.f14272d, ", invalidTime=");
        AbstractC4855en.m9272p(sbM1027p, this.f14273e, ", totalFee=", this.f14274f, ", amount=");
        sbM1027p.append(this.f14275g);
        sbM1027p.append(", paySubtype=");
        sbM1027p.append(this.f14276h);
        AbstractC2091b.m5173t(sbM1027p, ", transferAttach=", this.f14277i, ", rawXml=", this.f14278j);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
