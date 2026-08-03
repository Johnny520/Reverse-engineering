package p227p4;

import bsh.C0353j;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p295u4.C4266p;
import p295u4.C4270t;
import p311v4.AbstractC4446a;

/* JADX INFO: renamed from: p4.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3313r extends AbstractC3307l {

    /* JADX INFO: renamed from: f */
    public final AbstractC4446a[] f10673f;

    /* JADX INFO: renamed from: g */
    public final int[] f10674g;

    /* JADX INFO: renamed from: h */
    public int f10675h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3313r(C3305j c3305j, C4270t c4270t, C4266p c4266p, AbstractC4446a[] abstractC4446aArr) {
        super(c3305j, c4270t, c4266p);
        this.f10673f = abstractC4446aArr;
        this.f10674g = new int[abstractC4446aArr.length];
        int i9 = 0;
        while (true) {
            int[] iArr = this.f10674g;
            if (i9 >= iArr.length) {
                this.f10675h = -1;
                return;
            } else {
                if (abstractC4446aArr[i9] == null) {
                    C0353j.m1305c("constants[i] == null");
                    throw null;
                }
                iArr[i9] = -1;
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: a */
    public final String mo6968a() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            AbstractC4446a[] abstractC4446aArr = this.f10673f;
            if (i9 >= abstractC4446aArr.length) {
                return sb2.toString();
            }
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(abstractC4446aArr[i9].mo4901a());
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: c */
    public final String mo6983c() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            AbstractC4446a[] abstractC4446aArr = this.f10673f;
            if (i9 >= abstractC4446aArr.length) {
                return sb2.toString();
            }
            if (this.f10674g[i9] == -1) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (i9 > 0) {
                sb2.append(", ");
            }
            sb2.append(abstractC4446aArr[i9].mo8898j());
            sb2.append('@');
            int iM6998m = m6998m(i9);
            if (iM6998m < 65536) {
                sb2.append(AbstractC0000a.m46X0(iM6998m));
            } else {
                sb2.append(AbstractC0000a.m48Y0(iM6998m));
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: d */
    public final String mo6984d() {
        return mo6968a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3307l, p227p4.AbstractC3303h
    /* JADX INFO: renamed from: i */
    public final AbstractC3303h mo6975i(C3305j c3305j) {
        return new C3313r(c3305j, this.f10489c, this.f10490d, this.f10673f, this.f10674g, this.f10675h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p227p4.AbstractC3303h
    /* JADX INFO: renamed from: k */
    public final AbstractC3303h mo6971k(C4266p c4266p) {
        return new C3313r(this.f10488b, this.f10489c, c4266p, this.f10673f, this.f10674g, this.f10675h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m6998m(int i9) {
        int i10 = this.f10674g[i9];
        if (i10 != -1) {
            return i10;
        }
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "index not yet set for constant ", " value = ");
        sbM2257t.append(this.f10673f[i9]);
        throw new IllegalStateException(sbM2257t.toString());
    }

    public C3313r(C3305j c3305j, C4270t c4270t, C4266p c4266p, AbstractC4446a[] abstractC4446aArr, int[] iArr, int i9) {
        super(c3305j, c4270t, c4266p);
        this.f10673f = abstractC4446aArr;
        this.f10674g = iArr;
        this.f10675h = i9;
    }
}
