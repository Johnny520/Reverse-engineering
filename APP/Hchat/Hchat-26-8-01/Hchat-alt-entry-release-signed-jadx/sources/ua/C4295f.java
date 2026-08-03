package ua;

import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: ua.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4295f {

    /* JADX INFO: renamed from: a */
    public final String f14280a;

    /* JADX INFO: renamed from: b */
    public final String f14281b;

    /* JADX INFO: renamed from: c */
    public final int f14282c;

    /* JADX INFO: renamed from: d */
    public final long f14283d;

    /* JADX INFO: renamed from: e */
    public final String f14284e;

    /* JADX INFO: renamed from: f */
    public final boolean f14285f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4295f(int i9, long j3, String str, String str2, String str3, boolean z9) {
        str2.getClass();
        this.f14280a = str;
        this.f14281b = str2;
        this.f14282c = i9;
        this.f14283d = j3;
        this.f14284e = str3;
        this.f14285f = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4295f)) {
            return false;
        }
        C4295f c4295f = (C4295f) obj;
        return this.f14280a.equals(c4295f.f14280a) && AbstractC1416l.m3825a(this.f14281b, c4295f.f14281b) && this.f14282c == c4295f.f14282c && this.f14283d == c4295f.f14283d && this.f14284e.equals(c4295f.f14284e) && this.f14285f == c4295f.f14285f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f14285f) + AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2242e(this.f14282c, AbstractC0921a.m2244g(this.f14280a.hashCode() * 31, 31, this.f14281b), 31), 31, this.f14283d), 31, this.f14284e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("TransferReceiveAccount(key=", this.f14280a, ", name=", this.f14281b, ", accountType=");
        sbM1027p.append(this.f14282c);
        sbM1027p.append(", subChannelId=");
        sbM1027p.append(this.f14283d);
        sbM1027p.append(", bindSerial=");
        sbM1027p.append(this.f14284e);
        sbM1027p.append(", available=");
        sbM1027p.append(this.f14285f);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
