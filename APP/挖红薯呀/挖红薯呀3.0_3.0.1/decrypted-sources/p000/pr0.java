package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pr0 {

    /* JADX INFO: renamed from: a */
    public final long f4948a;

    /* JADX INFO: renamed from: b */
    public final long f4949b;

    /* JADX INFO: renamed from: c */
    public final long f4950c;

    /* JADX INFO: renamed from: d */
    public final long f4951d;

    /* JADX INFO: renamed from: e */
    public final boolean f4952e;

    /* JADX INFO: renamed from: f */
    public final float f4953f;

    /* JADX INFO: renamed from: g */
    public final int f4954g;

    /* JADX INFO: renamed from: h */
    public final boolean f4955h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f4956i;

    /* JADX INFO: renamed from: j */
    public final long f4957j;

    /* JADX INFO: renamed from: k */
    public final long f4958k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pr0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.f4948a = j;
        this.f4949b = j2;
        this.f4950c = j3;
        this.f4951d = j4;
        this.f4952e = z;
        this.f4953f = f;
        this.f4954g = i;
        this.f4955h = z2;
        this.f4956i = arrayList;
        this.f4957j = j5;
        this.f4958k = j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr0)) {
            return false;
        }
        pr0 pr0Var = (pr0) obj;
        return z60.m5449s(this.f4948a, pr0Var.f4948a) && this.f4949b == pr0Var.f4949b && ok0.m2931b(this.f4950c, pr0Var.f4950c) && ok0.m2931b(this.f4951d, pr0Var.f4951d) && this.f4952e == pr0Var.f4952e && Float.compare(this.f4953f, pr0Var.f4953f) == 0 && this.f4954g == pr0Var.f4954g && this.f4955h == pr0Var.f4955h && this.f4956i.equals(pr0Var.f4956i) && ok0.m2931b(this.f4957j, pr0Var.f4957j) && ok0.m2931b(this.f4958k, pr0Var.f4958k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f4958k) + AbstractC0748t1.m4146d(this.f4957j, (this.f4956i.hashCode() + AbstractC0748t1.m4145c(AbstractC0748t1.m4144b(this.f4954g, AbstractC0748t1.m4143a(this.f4953f, AbstractC0748t1.m4145c(AbstractC0748t1.m4146d(this.f4951d, AbstractC0748t1.m4146d(this.f4950c, AbstractC0748t1.m4146d(this.f4949b, Long.hashCode(this.f4948a) * 31, 31), 31), 31), 31, this.f4952e), 31), 31), 31, this.f4955h)) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) z60.m5428O(this.f4948a)) + ", uptime=" + this.f4949b + ", positionOnScreen=" + ((Object) ok0.m2936g(this.f4950c)) + ", position=" + ((Object) ok0.m2936g(this.f4951d)) + ", down=" + this.f4952e + ", pressure=" + this.f4953f + ", type=" + ((Object) tr0.m4224a(this.f4954g)) + ", activeHover=" + this.f4955h + ", historical=" + this.f4956i + ", scrollDelta=" + ((Object) ok0.m2936g(this.f4957j)) + ", originalEventPosition=" + ((Object) ok0.m2936g(this.f4958k)) + ')';
    }
}
