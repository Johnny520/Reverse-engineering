package p036c9;

import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: c9.s1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0486s1 {

    /* JADX INFO: renamed from: a */
    public final String f1451a;

    /* JADX INFO: renamed from: b */
    public final int f1452b;

    /* JADX INFO: renamed from: c */
    public final int f1453c;

    /* JADX INFO: renamed from: d */
    public final int f1454d;

    /* JADX INFO: renamed from: e */
    public final long f1455e;

    /* JADX INFO: renamed from: f */
    public final String f1456f;

    /* JADX INFO: renamed from: g */
    public final int f1457g;

    /* JADX INFO: renamed from: h */
    public final long f1458h;

    /* JADX INFO: renamed from: i */
    public final String f1459i;

    /* JADX INFO: renamed from: j */
    public final String f1460j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0486s1(String str, int i9, int i10, int i11, long j3, String str2, int i12, long j4, String str3, String str4) {
        this.f1451a = str;
        this.f1452b = i9;
        this.f1453c = i10;
        this.f1454d = i11;
        this.f1455e = j3;
        this.f1456f = str2;
        this.f1457g = i12;
        this.f1458h = j4;
        this.f1459i = str3;
        this.f1460j = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0486s1)) {
            return false;
        }
        C0486s1 c0486s1 = (C0486s1) obj;
        return this.f1451a.equals(c0486s1.f1451a) && this.f1452b == c0486s1.f1452b && this.f1453c == c0486s1.f1453c && this.f1454d == c0486s1.f1454d && this.f1455e == c0486s1.f1455e && this.f1456f.equals(c0486s1.f1456f) && this.f1457g == c0486s1.f1457g && this.f1458h == c0486s1.f1458h && this.f1459i.equals(c0486s1.f1459i) && this.f1460j.equals(c0486s1.f1460j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1460j.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2242e(this.f1457g, AbstractC0921a.m2244g(AbstractC0921a.m2243f(AbstractC0921a.m2242e(this.f1454d, AbstractC0921a.m2242e(this.f1453c, AbstractC0921a.m2242e(this.f1452b, this.f1451a.hashCode() * 31, 31), 31), 31), 31, this.f1455e), 31, this.f1456f), 31), 31, this.f1458h), 31, this.f1459i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2258u = AbstractC0921a.m2258u(this.f1452b, "ConversationRecord(username=", this.f1451a, ", unreadCount=", ", status=");
        AbstractC4855en.m9272p(sbM2258u, this.f1453c, ", isSend=", this.f1454d, ", conversationTime=");
        sbM2258u.append(this.f1455e);
        sbM2258u.append(", content=");
        sbM2258u.append(this.f1456f);
        sbM2258u.append(", messageType=");
        sbM2258u.append(this.f1457g);
        sbM2258u.append(", flag=");
        sbM2258u.append(this.f1458h);
        sbM2258u.append(", digest=");
        sbM2258u.append(this.f1459i);
        sbM2258u.append(", digestUser=");
        sbM2258u.append(this.f1460j);
        sbM2258u.append(")");
        return sbM2258u.toString();
    }
}
