package p100h0;

import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p119i2.C1935k0;
import p175m0.C2705l0;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: h0.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1548s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5160a = 2;

    /* JADX INFO: renamed from: b */
    public int f5161b;

    /* JADX INFO: renamed from: c */
    public int f5162c;

    /* JADX INFO: renamed from: d */
    public int f5163d;

    /* JADX INFO: renamed from: e */
    public Object f5164e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1548s(int i9, int i10, int i11, C1935k0 c1935k0) {
        this.f5161b = i9;
        this.f5162c = i10;
        this.f5163d = i11;
        this.f5164e = c1935k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C1552u m4046a(int i9) {
        return new C1552u(AbstractC0018a.m261y((C1935k0) this.f5164e, i9), i9, 1L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m4047b() {
        return this.f5163d - this.f5162c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int m4048c(int i9) {
        return ((C2705l0) this.f5164e).f8776e[this.f5162c + i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public Object m4049d(int i9) {
        return ((C2705l0) this.f5164e).f8778g[this.f5163d + i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f5160a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
                int i9 = this.f5161b;
                sb2.append(i9);
                sb2.append('-');
                C1935k0 c1935k0 = (C1935k0) this.f5164e;
                sb2.append(AbstractC0018a.m261y(c1935k0, i9));
                sb2.append(',');
                int i10 = this.f5162c;
                sb2.append(i10);
                sb2.append('-');
                sb2.append(AbstractC0018a.m261y(c1935k0, i10));
                sb2.append("), prevOffset=");
                return AbstractC3199a.m6841n(sb2, this.f5163d, ')');
            case 1:
            default:
                return super.toString();
            case 2:
                return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public C1548s(C2705l0 c2705l0) {
        this.f5164e = c2705l0;
    }

    public /* synthetic */ C1548s() {
    }
}
