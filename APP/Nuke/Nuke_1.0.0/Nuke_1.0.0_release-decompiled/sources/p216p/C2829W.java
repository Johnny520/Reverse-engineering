package p216p;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p211o0.AbstractC2767z;
import p211o0.C2762u;
import p244u.AbstractC3261c;
import p244u.C3251U;

/* JADX INFO: renamed from: p.W */
/* JADX INFO: loaded from: classes.dex */
public final class C2829W {

    /* JADX INFO: renamed from: a */
    public final long f8907a;

    /* JADX INFO: renamed from: b */
    public final C3251U f8908b;

    public C2829W() {
        long jM4934d = AbstractC2767z.m4934d(4284900966L);
        C3251U c3251uM5514a = AbstractC3261c.m5514a(0.0f, 3);
        this.f8907a = jM4934d;
        this.f8908b = c3251uM5514a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2829W.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C2829W c2829w = (C2829W) obj;
        return C2762u.m4921c(this.f8907a, c2829w.f8907a) && AbstractC1665j.m2981a(this.f8908b, c2829w.f8908b);
    }

    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return this.f8908b.hashCode() + (Long.hashCode(this.f8907a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0231b.m406q(this.f8907a, sb, ", drawPadding=");
        sb.append(this.f8908b);
        sb.append(')');
        return sb.toString();
    }
}
