package p267s1;

import java.util.ArrayList;
import p057e1.C0807b;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: s1.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3916v {

    /* JADX INFO: renamed from: a */
    public final long f12854a;

    /* JADX INFO: renamed from: b */
    public final long f12855b;

    /* JADX INFO: renamed from: c */
    public final long f12856c;

    /* JADX INFO: renamed from: d */
    public final long f12857d;

    /* JADX INFO: renamed from: e */
    public final boolean f12858e;

    /* JADX INFO: renamed from: f */
    public final float f12859f;

    /* JADX INFO: renamed from: g */
    public final int f12860g;

    /* JADX INFO: renamed from: h */
    public final boolean f12861h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f12862i;

    /* JADX INFO: renamed from: j */
    public final long f12863j;

    /* JADX INFO: renamed from: k */
    public final float f12864k;

    /* JADX INFO: renamed from: l */
    public final long f12865l;

    /* JADX INFO: renamed from: m */
    public final long f12866m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3916v(long j3, long j4, long j5, long j10, boolean z9, float f3, int i9, boolean z10, ArrayList arrayList, long j11, float f10, long j12, long j13) {
        this.f12854a = j3;
        this.f12855b = j4;
        this.f12856c = j5;
        this.f12857d = j10;
        this.f12858e = z9;
        this.f12859f = f3;
        this.f12860g = i9;
        this.f12861h = z10;
        this.f12862i = arrayList;
        this.f12863j = j11;
        this.f12864k = f10;
        this.f12865l = j12;
        this.f12866m = j13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3916v)) {
            return false;
        }
        C3916v c3916v = (C3916v) obj;
        return AbstractC3913s.m8112e(this.f12854a, c3916v.f12854a) && this.f12855b == c3916v.f12855b && C0807b.m2039b(this.f12856c, c3916v.f12856c) && C0807b.m2039b(this.f12857d, c3916v.f12857d) && this.f12858e == c3916v.f12858e && Float.compare(this.f12859f, c3916v.f12859f) == 0 && this.f12860g == c3916v.f12860g && this.f12861h == c3916v.f12861h && this.f12862i.equals(c3916v.f12862i) && C0807b.m2039b(this.f12863j, c3916v.f12863j) && Float.compare(this.f12864k, c3916v.f12864k) == 0 && C0807b.m2039b(this.f12865l, c3916v.f12865l) && C0807b.m2039b(this.f12866m, c3916v.f12866m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f12866m) + AbstractC0921a.m2243f(AbstractC0921a.m2241d(this.f12864k, AbstractC0921a.m2243f((this.f12862i.hashCode() + AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f12860g, AbstractC0921a.m2241d(this.f12859f, AbstractC0921a.m2245h(AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f(Long.hashCode(this.f12854a) * 31, 31, this.f12855b), 31, this.f12856c), 31, this.f12857d), 31, this.f12858e), 31), 31), 31, this.f12861h)) * 31, 31, this.f12863j), 31), 31, this.f12865l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC3913s.m8117j(this.f12854a)) + ", uptime=" + this.f12855b + ", positionOnScreen=" + ((Object) C0807b.m2044g(this.f12856c)) + ", position=" + ((Object) C0807b.m2044g(this.f12857d)) + ", down=" + this.f12858e + ", pressure=" + this.f12859f + ", type=" + ((Object) C3890d0.m8079a(this.f12860g)) + ", activeHover=" + this.f12861h + ", historical=" + this.f12862i + ", scrollDelta=" + ((Object) C0807b.m2044g(this.f12863j)) + ", scaleGestureFactor=" + this.f12864k + ", panGestureOffset=" + ((Object) C0807b.m2044g(this.f12865l)) + ", originalEventPosition=" + ((Object) C0807b.m2044g(this.f12866m)) + ')';
    }
}
