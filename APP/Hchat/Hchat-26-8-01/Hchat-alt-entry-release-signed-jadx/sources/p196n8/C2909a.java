package p196n8;

import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: n8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2909a {

    /* JADX INFO: renamed from: a */
    public final String f9389a;

    /* JADX INFO: renamed from: b */
    public final String f9390b;

    /* JADX INFO: renamed from: c */
    public final int f9391c;

    /* JADX INFO: renamed from: d */
    public final String f9392d;

    /* JADX INFO: renamed from: e */
    public final int f9393e;

    /* JADX INFO: renamed from: g */
    public final int f9395g;

    /* JADX INFO: renamed from: h */
    public final String f9396h;

    /* JADX INFO: renamed from: i */
    public final long f9397i;

    /* JADX INFO: renamed from: k */
    public final String f9399k;

    /* JADX INFO: renamed from: f */
    public final String f9394f = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX INFO: renamed from: j */
    public final String f9398j = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX INFO: renamed from: l */
    public final String f9400l = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2909a(String str, String str2, int i9, String str3, int i10, int i11, String str4, long j3, String str5) {
        this.f9389a = str;
        this.f9390b = str2;
        this.f9391c = i9;
        this.f9392d = str3;
        this.f9393e = i10;
        this.f9395g = i11;
        this.f9396h = str4;
        this.f9397i = j3;
        this.f9399k = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2909a)) {
            return false;
        }
        C2909a c2909a = (C2909a) obj;
        return this.f9389a.equals(c2909a.f9389a) && this.f9390b.equals(c2909a.f9390b) && this.f9391c == c2909a.f9391c && this.f9392d.equals(c2909a.f9392d) && this.f9393e == c2909a.f9393e && this.f9394f.equals(c2909a.f9394f) && this.f9395g == c2909a.f9395g && this.f9396h.equals(c2909a.f9396h) && this.f9397i == c2909a.f9397i && this.f9398j.equals(c2909a.f9398j) && this.f9399k.equals(c2909a.f9399k) && this.f9400l.equals(c2909a.f9400l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f9395g, AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f9393e, AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f9391c, AbstractC0921a.m2244g(this.f9389a.hashCode() * 31, 31, this.f9390b), 31), 31, this.f9392d), 31), 31, this.f9394f), 31), 31, this.f9396h), 31, this.f9397i), 31, this.f9398j), 31, this.f9399k), 31, this.f9400l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("TransferOperationParams(transactionId=", this.f9389a, ", transId=", this.f9390b, ", totalFee=");
        sbM1027p.append(this.f9391c);
        sbM1027p.append(", username=");
        sbM1027p.append(this.f9392d);
        sbM1027p.append(", invalidTime=");
        sbM1027p.append(this.f9393e);
        sbM1027p.append(", groupUsername=");
        sbM1027p.append(this.f9394f);
        sbM1027p.append(", recvAccountType=");
        sbM1027p.append(this.f9395g);
        sbM1027p.append(", bindSerial=");
        sbM1027p.append(this.f9396h);
        sbM1027p.append(", subRecvChannelId=");
        sbM1027p.append(this.f9397i);
        sbM1027p.append(", leftButtonContinue=");
        sbM1027p.append(this.f9398j);
        AbstractC2091b.m5173t(sbM1027p, ", transferAttach=", this.f9399k, ", displayName=", this.f9400l);
        sbM1027p.append(", subTitleClicked=null)");
        return sbM1027p.toString();
    }
}
