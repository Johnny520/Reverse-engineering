package p050c0;

import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: c0.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0700u1 {

    /* JADX INFO: renamed from: a */
    public final long f2203a;

    /* JADX INFO: renamed from: b */
    public final int f2204b;

    /* JADX INFO: renamed from: c */
    public final String f2205c;

    public C0700u1(long j2, int i2, String str) {
        this.f2203a = j2;
        this.f2204b = i2;
        this.f2205c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0700u1)) {
            return false;
        }
        C0700u1 c0700u1 = (C0700u1) obj;
        c0700u1.getClass();
        return "message".equals("message") && this.f2203a == c0700u1.f2203a && this.f2204b == c0700u1.f2204b && AbstractC0307g.m699a(this.f2205c, c0700u1.f2205c);
    }

    public final int hashCode() {
        return this.f2205c.hashCode() + AbstractC0324d.m718a(this.f2204b, (Long.hashCode(this.f2203a) - 462094119) * 31, 31);
    }

    public final String toString() {
        return "RevokeUpdate(table=message, msgId=" + this.f2203a + ", type=" + this.f2204b + ", content=" + this.f2205c + ")";
    }
}
