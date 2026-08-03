package p257r7;

import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: r7.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3725o extends AbstractC3729s {

    /* JADX INFO: renamed from: t */
    public C3724n f12097t;

    /* JADX INFO: renamed from: u */
    public C3725o f12098u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // p257r7.AbstractC3729s, java.lang.Comparable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC3729s abstractC3729s) {
        if (!(abstractC3729s instanceof C3725o)) {
            return -1;
        }
        if (abstractC3729s != this) {
            C3725o c3725o = (C3725o) abstractC3729s;
            C3724n c3724n = this.f12097t;
            int i9 = c3724n == null ? 0 : c3724n.f12083n;
            C3724n c3724n2 = c3725o.f12097t;
            int i10 = c3724n2 == null ? 0 : c3724n2.f12083n;
            int iM10741d = AbstractC5999a.m10741d(i9 == 0, i10 == 0);
            if (iM10741d != 0) {
                return iM10741d;
            }
            int iM10742e = AbstractC5999a.m10742e(i9, i10);
            if (iM10742e != 0) {
                return iM10742e;
            }
            C3731u c3731u = c3725o.f12106q;
            boolean z9 = (c3731u == null || c3731u.f12110m.f9926k.size() == 0) ? false : true;
            C3731u c3731u2 = this.f12106q;
            int iM10741d2 = AbstractC5999a.m10741d(z9, (c3731u2 == null || c3731u2.f12110m.f9926k.size() == 0) ? false : true);
            if (iM10741d2 != 0) {
                return iM10741d2;
            }
            int iM10740c = AbstractC5999a.m10740c(m7744Y(), abstractC3729s.m7744Y());
            if (iM10740c != 0) {
                return iM10740c;
            }
            C3725o c3725o2 = c3725o.f12098u;
            if (c3725o2 != null && c3725o2.f7658h == null) {
                c3725o.f12098u = null;
                c3725o2 = null;
            }
            boolean z10 = c3725o2 != null;
            C3725o c3725o3 = this.f12098u;
            if (c3725o3 != null && c3725o3.f7658h == null) {
                this.f12098u = null;
                c3725o3 = null;
            }
            int iM10741d3 = AbstractC5999a.m10741d(z10, c3725o3 != null);
            if (iM10741d3 != 0) {
                return iM10741d3;
            }
            int iM10739b = AbstractC5999a.m10739b(c3725o.mo7737X(), mo7737X());
            if (iM10739b != 0) {
                return iM10739b;
            }
            C3725o c3725o4 = this.f12098u;
            if (c3725o4 != null && c3725o4.f7658h == null) {
                this.f12098u = null;
                c3725o4 = null;
            }
            String strM7744Y = c3725o4 != null ? c3725o4.m7744Y() : null;
            C3725o c3725o5 = c3725o.f12098u;
            if (c3725o5 != null && c3725o5.f7658h == null) {
                c3725o.f12098u = null;
                c3725o5 = null;
            }
            int iM10740c2 = AbstractC5999a.m10740c(strM7744Y, c3725o5 != null ? c3725o5.m7744Y() : null);
            if (iM10740c2 != 0) {
                return iM10740c2;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.AbstractC3729s
    /* JADX INFO: renamed from: X */
    public final int mo7737X() {
        int iM10747j = AbstractC5999a.m10747j(this.f12105p);
        C3724n c3724n = this.f12097t;
        return (c3724n == null || !c3724n.m7735O()) ? iM10747j : iM10747j + 1;
    }

    @Override // p257r7.AbstractC3729s
    /* JADX INFO: renamed from: W */
    public final void mo7736W() {
    }
}
