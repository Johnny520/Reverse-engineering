package p150k5;

import p180m5.C2781b;
import p193n5.C2894a;
import p193n5.C2895b;
import p193n5.C2896c;
import p193n5.C2897d;
import p193n5.C2898e;

/* JADX INFO: renamed from: k5.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2265p extends AbstractC2269t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7523g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2270u f7524h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2265p(C2270u c2270u, int i9) {
        this.f7523g = i9;
        this.f7524h = c2270u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m5519b(int i9) {
        int iM583N;
        int i10;
        switch (this.f7523g) {
            case 0:
                C2270u c2270u = this.f7524h;
                int i11 = c2270u.f7544n;
                if (i9 < 0 || i9 >= i11) {
                    throw new IndexOutOfBoundsException(String.format("Invalid class index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(i11)));
                }
                iM583N = c2270u.f7545o;
                i10 = i9 * 32;
                return i10 + iM583N;
            case 1:
                C2781b c2781bM5525b = this.f7524h.m5525b(7);
                if (i9 < 0 || i9 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid callsite index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(size())));
                }
                iM583N = c2781bM5525b.f9021a.f7532b.m583N(c2781bM5525b.f9022b + 8);
                i10 = i9 * 4;
                return i10 + iM583N;
            case 2:
                C2781b c2781bM5525b2 = this.f7524h.m5525b(8);
                if (i9 < 0 || i9 >= size()) {
                    throw new IndexOutOfBoundsException(String.format("Invalid method handle index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(size())));
                }
                iM583N = c2781bM5525b2.f9021a.f7532b.m583N(c2781bM5525b2.f9022b + 8);
                i10 = i9 * 8;
                return i10 + iM583N;
            case 3:
                C2270u c2270u2 = this.f7524h;
                int i12 = c2270u2.f7540j;
                if (i9 < 0 || i9 >= i12) {
                    throw new IndexOutOfBoundsException(String.format("Invalid field index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(i12)));
                }
                iM583N = c2270u2.f7541k;
                break;
            case 4:
                C2270u c2270u3 = this.f7524h;
                int i13 = c2270u3.f7542l;
                if (i9 < 0 || i9 >= i13) {
                    throw new IndexOutOfBoundsException(String.format("Invalid method index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(i13)));
                }
                iM583N = c2270u3.f7543m;
                break;
            default:
                C2270u c2270u4 = this.f7524h;
                int i14 = c2270u4.f7538h;
                if (i9 < 0 || i9 >= i14) {
                    throw new IndexOutOfBoundsException(String.format("Invalid proto index %d, not in [0, %d)", Integer.valueOf(i9), Integer.valueOf(i14)));
                }
                iM583N = c2270u4.f7539i;
                i10 = i9 * 12;
                return i10 + iM583N;
        }
        i10 = i9 * 8;
        return i10 + iM583N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    @Override // p150k5.AbstractC2269t, java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(int i9) {
        int i10;
        switch (this.f7523g) {
            case 0:
                int iM5519b = m5519b(i9);
                C2270u c2270u = this.f7524h;
                int i11 = c2270u.f7547q;
                if (i11 == 0) {
                    i10 = 0;
                } else {
                    int iM579J = c2270u.f7531a.m579J((i9 * 4) + i11 + 4);
                    if (iM579J != 0) {
                        i10 = iM579J + i11;
                    }
                }
                return new C2264o(c2270u, iM5519b, i10);
            case 1:
                return new C2894a(this.f7524h, i9);
            case 2:
                return new C2896c(this.f7524h, i9);
            case 3:
                return new C2895b(this.f7524h, i9);
            case 4:
                return new C2898e(this.f7524h, i9);
            default:
                return new C2897d(this.f7524h, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f7523g) {
            case 0:
                return this.f7524h.f7544n;
            case 1:
                C2781b c2781bM5525b = this.f7524h.m5525b(7);
                if (c2781bM5525b == null) {
                    return 0;
                }
                return c2781bM5525b.f9021a.f7532b.m583N(c2781bM5525b.f9022b + 4);
            case 2:
                C2781b c2781bM5525b2 = this.f7524h.m5525b(8);
                if (c2781bM5525b2 == null) {
                    return 0;
                }
                return c2781bM5525b2.f9021a.f7532b.m583N(c2781bM5525b2.f9022b + 4);
            case 3:
                return this.f7524h.f7540j;
            case 4:
                return this.f7524h.f7542l;
            default:
                return this.f7524h.f7538h;
        }
    }
}
