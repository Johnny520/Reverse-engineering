package p255r4;

import java.util.ArrayList;
import p282t4.C4115b;
import p282t4.C4116c;
import p311v4.C4476y;
import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: r4.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3684m0 implements InterfaceC6097k, Comparable {

    /* JADX INFO: renamed from: g */
    public final C4476y f11971g;

    /* JADX INFO: renamed from: h */
    public final C3702v0 f11972h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3684m0(C4476y c4476y, C4116c c4116c, C3689p c3689p) {
        this.f11971g = c4476y;
        int length = c4116c.f24601h.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i9 = 0; i9 < length; i9++) {
            C3661b c3661b = new C3661b((C4115b) c4116c.m10840l(i9), c3689p);
            C3663c c3663c = new C3663c(4, 4);
            c3663c.f11900k = c3661b;
            arrayList.add(c3663c);
        }
        this.f11972h = new C3702v0(EnumC3662b0.f11891u, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11971g.mo4901a());
        sb2.append(": ");
        boolean z9 = true;
        for (C3663c c3663c : this.f11972h.f12036l) {
            if (z9) {
                z9 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(c3663c.mo7642l());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11971g.compareTo(((C3684m0) obj).f11971g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3684m0)) {
            return false;
        }
        return this.f11971g.equals(((C3684m0) obj).f11971g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11971g.hashCode();
    }
}
