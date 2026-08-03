package p233pd;

import java.util.List;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p246qd.AbstractC3508l;
import p302ud.C4305a;
import p302ud.C4320p;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: pd.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3408s extends AbstractC3409t {

    /* JADX INFO: renamed from: o */
    public final int f11013o;

    /* JADX INFO: renamed from: p */
    public final boolean f11014p;

    /* JADX INFO: renamed from: q */
    public C3407r f11015q;

    /* JADX INFO: renamed from: r */
    public int f11016r;

    /* JADX INFO: renamed from: s */
    public Object[] f11017s;

    /* JADX INFO: renamed from: t */
    public C4305a[] f11018t;

    /* JADX INFO: renamed from: u */
    public C4305a f11019u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3408s(AbstractC3508l abstractC3508l, int i9, boolean z9) {
        super(EnumC3400k.f10993w, 1);
        mo7178I(abstractC3508l);
        this.f11013o = i9;
        this.f11014p = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: O */
    public final C4320p mo7167O() {
        C3408s c3408s = new C3408s(mo7179S(0), this.f11013o, this.f11014p);
        c3408s.f11015q = this.f11015q;
        c3408s.f11016r = this.f11016r;
        c3408s.f11018t = this.f11018t;
        c3408s.f11019u = this.f11019u;
        m8681P(c3408s);
        return c3408s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    /* JADX INFO: renamed from: Y */
    public final boolean mo7168Y(C4320p c4320p) {
        if (this == c4320p) {
            return true;
        }
        if (!(c4320p instanceof C3408s) || !super.mo7168Y(c4320p)) {
            return false;
        }
        C3408s c3408s = (C3408s) c4320p;
        return this.f11013o == c3408s.f11013o && this.f11014p == c3408s.f11014p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3409t
    /* JADX INFO: renamed from: i0 */
    public final void mo7174i0(C4305a c4305a) {
        C3407r c3407r = this.f11015q;
        if (c3407r == null) {
            C0086a.m452k("Switch data not yet attached");
            return;
        }
        List list = c4305a.f14353n;
        int[] iArr = c3407r.f11012q;
        int length = iArr.length;
        this.f11018t = new C4305a[length];
        for (int i9 = 0; i9 < length; i9++) {
            this.f11018t[i9] = AbstractC0000a.m37T(iArr[i9], list);
        }
        this.f11019u = AbstractC0000a.m37T(this.f11016r, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p233pd.AbstractC3409t
    /* JADX INFO: renamed from: j0 */
    public final void mo7175j0(C4305a c4305a, C4305a c4305a2) {
        C4305a[] c4305aArr = this.f11018t;
        if (c4305aArr == null) {
            return;
        }
        int length = c4305aArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            C4305a[] c4305aArr2 = this.f11018t;
            if (c4305aArr2[i9] == c4305a) {
                c4305aArr2[i9] = c4305a2;
            }
        }
        if (this.f11019u == c4305a) {
            this.f11019u = c4305a2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final Object m7187k0(int i9) {
        Object[] objArr = this.f11017s;
        return objArr != null ? objArr[i9] : Integer.valueOf(m7188l0().f11011p[i9]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final C3407r m7188l0() {
        C3407r c3407r = this.f11015q;
        if (c3407r != null) {
            return c3407r;
        }
        C0086a.m452k("Switch data not yet attached");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final void m7189m0(int i9, Object obj) {
        if (this.f11017s == null) {
            int[] iArr = m7188l0().f11011p;
            int length = iArr.length;
            Object[] objArr = new Object[length];
            for (int i10 = 0; i10 < length; i10++) {
                objArr[i10] = Integer.valueOf(iArr[i10]);
            }
            this.f11017s = objArr;
        }
        this.f11017s[i9] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.C4320p
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m8692k());
        C3407r c3407r = this.f11015q;
        if (c3407r == null) {
            sb2.append("no payload");
        } else {
            int i9 = c3407r.f11010o;
            int[] iArr = c3407r.f11011p;
            int i10 = 0;
            if (this.f11018t != null) {
                while (i10 < i9) {
                    sb2.append("\n case ");
                    sb2.append(iArr[i10]);
                    sb2.append(": goto ");
                    sb2.append(this.f11018t[i10]);
                    i10++;
                }
                if (this.f11016r != -1) {
                    sb2.append("\n default: goto ");
                    sb2.append(this.f11019u);
                }
            } else {
                int[] iArr2 = c3407r.f11012q;
                while (i10 < i9) {
                    sb2.append("\n case ");
                    sb2.append(iArr[i10]);
                    sb2.append(": goto ");
                    sb2.append(AbstractC5792m.m10487d(iArr2[i10]));
                    i10++;
                }
                if (this.f11016r != -1) {
                    sb2.append("\n default: goto ");
                    sb2.append(AbstractC5792m.m10487d(this.f11016r));
                }
            }
        }
        m8677K(sb2);
        return sb2.toString();
    }
}
