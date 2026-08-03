package p078f9;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: f9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1097h {

    /* JADX INFO: renamed from: a */
    public final long f3529a;

    /* JADX INFO: renamed from: b */
    public final String f3530b;

    /* JADX INFO: renamed from: c */
    public final boolean f3531c;

    /* JADX INFO: renamed from: d */
    public final boolean f3532d;

    /* JADX INFO: renamed from: e */
    public final String f3533e;

    /* JADX INFO: renamed from: f */
    public final String f3534f;

    /* JADX INFO: renamed from: g */
    public final String f3535g;

    /* JADX INFO: renamed from: h */
    public final boolean f3536h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1097h(long j3, String str, String str2, String str3, String str4, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f3529a = j3;
        this.f3530b = str;
        this.f3531c = z9;
        this.f3532d = z10;
        this.f3533e = str2;
        this.f3534f = str3;
        this.f3535g = str4;
        this.f3536h = z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1097h)) {
            return false;
        }
        C1097h c1097h = (C1097h) obj;
        return this.f3529a == c1097h.f3529a && AbstractC1416l.m3825a(this.f3530b, c1097h.f3530b) && this.f3531c == c1097h.f3531c && this.f3532d == c1097h.f3532d && AbstractC1416l.m3825a(this.f3533e, c1097h.f3533e) && AbstractC1416l.m3825a(this.f3534f, c1097h.f3534f) && this.f3535g.equals(c1097h.f3535g) && this.f3536h == c1097h.f3536h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3536h) + AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2244g(Long.hashCode(this.f3529a) * 31, 31, this.f3530b), 31, this.f3531c), 31, this.f3532d), 31, this.f3533e), 31, this.f3534f), 31, this.f3535g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditableChatMessage(msgId=");
        sb2.append(this.f3529a);
        sb2.append(", talker=");
        sb2.append(this.f3530b);
        sb2.append(", isQuote=");
        sb2.append(this.f3531c);
        sb2.append(", isTransfer=");
        sb2.append(this.f3532d);
        AbstractC2091b.m5173t(sb2, ", displayText=", this.f3533e, ", replyText=", this.f3534f);
        sb2.append(", quotedText=");
        sb2.append(this.f3535g);
        sb2.append(", hasBackup=");
        sb2.append(this.f3536h);
        sb2.append(")");
        return sb2.toString();
    }
}
