package p050c0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.J0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0598J0 {

    /* JADX INFO: renamed from: a */
    public final boolean f1828a;

    /* JADX INFO: renamed from: b */
    public final boolean f1829b;

    /* JADX INFO: renamed from: c */
    public final String f1830c;

    public /* synthetic */ C0598J0() {
        this("今日已发${totalMsg}条", true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0598J0)) {
            return false;
        }
        C0598J0 c0598j0 = (C0598J0) obj;
        return this.f1828a == c0598j0.f1828a && this.f1829b == c0598j0.f1829b && AbstractC0307g.m699a(this.f1830c, c0598j0.f1830c);
    }

    public final int hashCode() {
        return this.f1830c.hashCode() + ((Boolean.hashCode(this.f1829b) + (Boolean.hashCode(this.f1828a) * 31)) * 31);
    }

    public final String toString() {
        return "InputStatsOptions(enabled=" + this.f1828a + ", countSend=" + this.f1829b + ", template=" + this.f1830c + ")";
    }

    public C0598J0(String str, boolean z2, boolean z3) {
        AbstractC0307g.m703e(str, "template");
        this.f1828a = z2;
        this.f1829b = z3;
        this.f1830c = str;
    }
}
