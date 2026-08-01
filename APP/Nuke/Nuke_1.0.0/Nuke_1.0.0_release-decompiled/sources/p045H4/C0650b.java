package p045H4;

import p011B4.AbstractC0231b;
import p211o0.C2762u;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: H4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0650b {

    /* JADX INFO: renamed from: a */
    public final boolean f2060a;

    /* JADX INFO: renamed from: b */
    public final long f2061b;

    /* JADX INFO: renamed from: c */
    public final long f2062c;

    /* JADX INFO: renamed from: d */
    public final long f2063d;

    /* JADX INFO: renamed from: e */
    public final long f2064e;

    /* JADX INFO: renamed from: f */
    public final long f2065f;

    /* JADX INFO: renamed from: g */
    public final long f2066g;

    public C0650b(boolean z5, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f2060a = z5;
        this.f2061b = j5;
        this.f2062c = j6;
        this.f2063d = j7;
        this.f2064e = j8;
        this.f2065f = j9;
        this.f2066g = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0650b)) {
            return false;
        }
        C0650b c0650b = (C0650b) obj;
        return this.f2060a == c0650b.f2060a && C2762u.m4921c(this.f2061b, c0650b.f2061b) && C2762u.m4921c(this.f2062c, c0650b.f2062c) && C2762u.m4921c(this.f2063d, c0650b.f2063d) && C2762u.m4921c(this.f2064e, c0650b.f2064e) && C2762u.m4921c(this.f2065f, c0650b.f2065f) && C2762u.m4921c(this.f2066g, c0650b.f2066g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2060a) * 31;
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f2066g) + AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(iHashCode, 31, this.f2061b), 31, this.f2062c), 31, this.f2063d), 31, this.f2064e), 31, this.f2065f);
    }

    public final String toString() {
        String strM4927i = C2762u.m4927i(this.f2061b);
        String strM4927i2 = C2762u.m4927i(this.f2062c);
        String strM4927i3 = C2762u.m4927i(this.f2063d);
        String strM4927i4 = C2762u.m4927i(this.f2064e);
        String strM4927i5 = C2762u.m4927i(this.f2065f);
        String strM4927i6 = C2762u.m4927i(this.f2066g);
        StringBuilder sb = new StringBuilder("NukeColors(isLight=");
        sb.append(this.f2060a);
        sb.append(", background=");
        sb.append(strM4927i);
        sb.append(", surface=");
        AbstractC3202a.m5468c(sb, strM4927i2, ", border=", strM4927i3, ", textPrimary=");
        AbstractC3202a.m5468c(sb, strM4927i4, ", textSecondary=", strM4927i5, ", accent=");
        return AbstractC0231b.m403n(sb, strM4927i6, ")");
    }
}
