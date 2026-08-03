package p150k5;

import androidx.lifecycle.C0119x;
import java.util.List;
import p005a5.C0016a;

/* JADX INFO: renamed from: k5.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2254f0 {

    /* JADX INFO: renamed from: a */
    public final C2270u f7470a;

    /* JADX INFO: renamed from: b */
    public final int f7471b;

    /* JADX INFO: renamed from: c */
    public final int f7472c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2254f0(C2270u c2270u, int i9, int i10) {
        this.f7470a = c2270u;
        this.f7471b = i9;
        this.f7472c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m5500a() {
        return this.f7470a.f7532b.m585P(this.f7471b + 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final List m5501b() {
        C2270u c2270u = this.f7470a;
        C0119x c0119x = c2270u.f7532b;
        C0016a c0016a = new C0016a(c0119x.m585P(this.f7471b + 6) + this.f7472c, 5, c0119x);
        int iM209m = c0016a.m209m();
        if (iM209m > 0) {
            return new C2250d0(this, c0119x, c0016a.f55h, iM209m, 0);
        }
        int i9 = (iM209m * (-1)) + 1;
        return new C2252e0(this, c2270u.f7532b, c0016a.f55h, i9, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m5502c() {
        return this.f7470a.f7532b.m583N(this.f7471b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2254f0)) {
            return false;
        }
        C2254f0 c2254f0 = (C2254f0) obj;
        return m5502c() == c2254f0.m5502c() && m5500a() == c2254f0.m5500a() && m5501b().equals(c2254f0.m5501b());
    }
}
