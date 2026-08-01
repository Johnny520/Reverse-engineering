package p058L;

import p011B4.AbstractC0231b;
import p211o0.C2762u;

/* JADX INFO: renamed from: L.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0931d0 {

    /* JADX INFO: renamed from: a */
    public final long f2922a;

    /* JADX INFO: renamed from: b */
    public final long f2923b;

    public C0931d0(long j5, long j6) {
        this.f2922a = j5;
        this.f2923b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0931d0)) {
            return false;
        }
        C0931d0 c0931d0 = (C0931d0) obj;
        return C2762u.m4921c(this.f2922a, c0931d0.f2922a) && C2762u.m4921c(this.f2923b, c0931d0.f2923b);
    }

    public final int hashCode() {
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f2923b) + (Long.hashCode(this.f2922a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC0231b.m406q(this.f2922a, sb, ", selectionBackgroundColor=");
        sb.append((Object) C2762u.m4927i(this.f2923b));
        sb.append(')');
        return sb.toString();
    }
}
