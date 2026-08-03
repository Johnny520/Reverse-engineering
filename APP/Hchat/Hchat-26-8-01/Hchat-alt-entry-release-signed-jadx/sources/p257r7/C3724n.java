package p257r7;

import okio.C3193a;
import p363y7.AbstractC5999a;
import p363y7.C6000b;

/* JADX INFO: renamed from: r7.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3724n extends C3716f implements Comparable {

    /* JADX INFO: renamed from: q */
    public static final C3193a f12094q = new C3193a(12);

    /* JADX INFO: renamed from: o */
    public Object f12095o;

    /* JADX INFO: renamed from: p */
    public C3725o f12096p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final C3725o m7734N() {
        C3725o c3725o = this.f12096p;
        if (c3725o == null || c3725o.f7658h == null) {
            return null;
        }
        return c3725o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final boolean m7735O() {
        Object obj = this.f12095o;
        return !(obj == null ? true : obj.getClass() == C6000b.class ? ((C6000b) obj).isEmpty() : false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3724n c3724n = (C3724n) obj;
        if (c3724n == null) {
            return -1;
        }
        if (c3724n != this) {
            C3725o c3725oM7734N = m7734N();
            C3725o c3725oM7734N2 = c3724n.m7734N();
            int iM10741d = AbstractC5999a.m10741d(c3725oM7734N == null, c3725oM7734N2 == null);
            if (iM10741d != 0) {
                return iM10741d;
            }
            if (c3725oM7734N != null && c3725oM7734N2 != null) {
                return AbstractC5999a.m10739b(c3725oM7734N.f7657g, c3725oM7734N2.f7657g);
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.C3716f
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("USED-BY=");
        sb2.append(AbstractC5999a.m10747j(this.f12095o));
        sb2.append('{');
        C3725o c3725oM7734N = m7734N();
        String strM7746Q = null;
        if (c3725oM7734N != null && (str = c3725oM7734N.f12101m) != null) {
            C3731u c3731u = c3725oM7734N.f12106q;
            strM7746Q = c3731u == null ? str : c3731u.m7746Q(str, false);
        }
        if (strM7746Q != null) {
            sb2.append(strM7746Q);
        } else {
            sb2.append(this.f7657g);
        }
        sb2.append(':');
        sb2.append(AbstractC5999a.m10748k(this.f12083n, 8));
        sb2.append('}');
        return sb2.toString();
    }
}
