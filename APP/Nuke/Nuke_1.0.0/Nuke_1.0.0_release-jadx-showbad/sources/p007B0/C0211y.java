package p007B0;

import java.util.ArrayList;
import p011B4.AbstractC0231b;
import p204n0.C2683b;

/* JADX INFO: renamed from: B0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0211y {

    /* JADX INFO: renamed from: a */
    public final long f729a;

    /* JADX INFO: renamed from: b */
    public final long f730b;

    /* JADX INFO: renamed from: c */
    public final long f731c;

    /* JADX INFO: renamed from: d */
    public final long f732d;

    /* JADX INFO: renamed from: e */
    public final boolean f733e;

    /* JADX INFO: renamed from: f */
    public final float f734f;

    /* JADX INFO: renamed from: g */
    public final int f735g;

    /* JADX INFO: renamed from: h */
    public final boolean f736h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f737i;

    /* JADX INFO: renamed from: j */
    public final long f738j;

    /* JADX INFO: renamed from: k */
    public final long f739k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0211y(long j5, long j6, long j7, long j8, boolean z5, float f2, int i5, boolean z6, ArrayList arrayList, long j9, long j10) {
        this.f729a = j5;
        this.f730b = j6;
        this.f731c = j7;
        this.f732d = j8;
        this.f733e = z5;
        this.f734f = f2;
        this.f735g = i5;
        this.f736h = z6;
        this.f737i = arrayList;
        this.f738j = j9;
        this.f739k = j10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0211y)) {
            return false;
        }
        C0211y c0211y = (C0211y) obj;
        return AbstractC0208v.m315e(this.f729a, c0211y.f729a) && this.f730b == c0211y.f730b && C2683b.m4644b(this.f731c, c0211y.f731c) && C2683b.m4644b(this.f732d, c0211y.f732d) && this.f733e == c0211y.f733e && Float.compare(this.f734f, c0211y.f734f) == 0 && this.f735g == c0211y.f735g && this.f736h == c0211y.f736h && this.f737i.equals(c0211y.f737i) && C2683b.m4644b(this.f738j, c0211y.f738j) && C2683b.m4644b(this.f739k, c0211y.f739k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f739k) + AbstractC0231b.m392c((this.f737i.hashCode() + AbstractC0231b.m395f(AbstractC0231b.m391b(this.f735g, AbstractC0231b.m390a(this.f734f, AbstractC0231b.m395f(AbstractC0231b.m392c(AbstractC0231b.m392c(AbstractC0231b.m392c(Long.hashCode(this.f729a) * 31, 31, this.f730b), 31, this.f731c), 31, this.f732d), 31, this.f733e), 31), 31), 31, this.f736h)) * 31, 31, this.f738j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC0208v.m319i(this.f729a)) + ", uptime=" + this.f730b + ", positionOnScreen=" + ((Object) C2683b.m4649g(this.f731c)) + ", position=" + ((Object) C2683b.m4649g(this.f732d)) + ", down=" + this.f733e + ", pressure=" + this.f734f + ", type=" + ((Object) AbstractC0177J.m262a(this.f735g)) + ", activeHover=" + this.f736h + ", historical=" + this.f737i + ", scrollDelta=" + ((Object) C2683b.m4649g(this.f738j)) + ", originalEventPosition=" + ((Object) C2683b.m4649g(this.f739k)) + ')';
    }
}
