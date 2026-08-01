package p221q;

import p011B4.AbstractC0231b;
import p211o0.C2762u;

/* JADX INFO: renamed from: q.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2895c {

    /* JADX INFO: renamed from: a */
    public final long f9150a;

    /* JADX INFO: renamed from: b */
    public final long f9151b;

    /* JADX INFO: renamed from: c */
    public final long f9152c;

    /* JADX INFO: renamed from: d */
    public final long f9153d;

    /* JADX INFO: renamed from: e */
    public final long f9154e;

    public C2895c(long j5, long j6, long j7, long j8, long j9) {
        this.f9150a = j5;
        this.f9151b = j6;
        this.f9152c = j7;
        this.f9153d = j8;
        this.f9154e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2895c)) {
            return false;
        }
        C2895c c2895c = (C2895c) obj;
        return C2762u.m4921c(this.f9150a, c2895c.f9150a) && C2762u.m4921c(this.f9151b, c2895c.f9151b) && C2762u.m4921c(this.f9152c, c2895c.f9152c) && C2762u.m4921c(this.f9153d, c2895c.f9153d) && C2762u.m4921c(this.f9154e, c2895c.f9154e);
    }

    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f9154e) + AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(Long.hashCode(this.f9150a) * 31, 31, this.f9151b), 31, this.f9152c), 31, this.f9153d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC0231b.m406q(this.f9150a, sb, ", textColor=");
        AbstractC0231b.m406q(this.f9151b, sb, ", iconColor=");
        AbstractC0231b.m406q(this.f9152c, sb, ", disabledTextColor=");
        AbstractC0231b.m406q(this.f9153d, sb, ", disabledIconColor=");
        sb.append((Object) C2762u.m4927i(this.f9154e));
        sb.append(')');
        return sb.toString();
    }
}
