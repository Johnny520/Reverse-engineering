package p175m0;

import java.util.ArrayList;
import p077f8.AbstractC1089i;
import p117i0.AbstractC1855m;
import p117i0.C1836h0;
import p117i0.C1856m0;
import p159l0.C2425g;

/* JADX INFO: renamed from: m0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2684b {

    /* JADX INFO: renamed from: a */
    public final C1836h0 f8741a;

    /* JADX INFO: renamed from: b */
    public C2682a f8742b;

    /* JADX INFO: renamed from: c */
    public boolean f8743c;

    /* JADX INFO: renamed from: f */
    public int f8746f;

    /* JADX INFO: renamed from: g */
    public int f8747g;

    /* JADX INFO: renamed from: l */
    public int f8752l;

    /* JADX INFO: renamed from: d */
    public final C1856m0 f8744d = new C1856m0();

    /* JADX INFO: renamed from: e */
    public boolean f8745e = true;

    /* JADX INFO: renamed from: h */
    public final ArrayList f8748h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f8749i = -1;

    /* JADX INFO: renamed from: j */
    public int f8750j = -1;

    /* JADX INFO: renamed from: k */
    public int f8751k = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2684b(C1836h0 c1836h0, C2682a c2682a) {
        this.f8741a = c1836h0;
        this.f8742b = c2682a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6127a() {
        m6129c();
        ArrayList arrayList = this.f8748h;
        if (arrayList.isEmpty()) {
            this.f8747g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6128b() {
        int i9 = this.f8747g;
        if (i9 > 0) {
            C2705l0 c2705l0 = this.f8742b.f8739j;
            c2705l0.m6136U(C2697h0.f8766c);
            c2705l0.f8776e[c2705l0.f8777f - c2705l0.f8774c[c2705l0.f8775d - 1].f8770a] = i9;
            this.f8747g = 0;
        }
        ArrayList arrayList = this.f8748h;
        if (arrayList.isEmpty()) {
            return;
        }
        C2682a c2682a = this.f8742b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = arrayList.get(i10);
        }
        c2682a.getClass();
        if (size != 0) {
            C2705l0 c2705l02 = c2682a.f8739j;
            c2705l02.m6136U(C2702k.f8772c);
            AbstractC1089i.m2727F0(c2705l02, 0, objArr);
        }
        arrayList.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6129c() {
        int i9 = this.f8752l;
        if (i9 > 0) {
            int i10 = this.f8749i;
            if (i10 >= 0) {
                m6128b();
                C2705l0 c2705l0 = this.f8742b.f8739j;
                c2705l0.m6136U(C2719z.f8797c);
                int i11 = c2705l0.f8777f - c2705l0.f8774c[c2705l0.f8775d - 1].f8770a;
                int[] iArr = c2705l0.f8776e;
                iArr[i11] = i10;
                iArr[i11 + 1] = i9;
                this.f8749i = -1;
            } else {
                int i12 = this.f8751k;
                int i13 = this.f8750j;
                m6128b();
                C2705l0 c2705l02 = this.f8742b.f8739j;
                c2705l02.m6136U(C2715v.f8793c);
                int i14 = c2705l02.f8777f - c2705l02.f8774c[c2705l02.f8775d - 1].f8770a;
                int[] iArr2 = c2705l02.f8776e;
                iArr2[i14 + 1] = i12;
                iArr2[i14] = i13;
                iArr2[i14 + 2] = i9;
                this.f8750j = -1;
                this.f8751k = -1;
            }
            this.f8752l = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m6130d(boolean z9) {
        C2425g c2425g = this.f8741a.f6082G;
        int i9 = z9 ? c2425g.f7943i : c2425g.f7941g;
        int i10 = i9 - this.f8746f;
        if (i10 < 0) {
            AbstractC1855m.m4573a("Tried to seek backward");
        }
        if (i10 > 0) {
            C2705l0 c2705l0 = this.f8742b.f8739j;
            c2705l0.m6136U(C2688d.f8757c);
            c2705l0.f8776e[c2705l0.f8777f - c2705l0.f8774c[c2705l0.f8775d - 1].f8770a] = i10;
            this.f8746f = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6131e(int i9, int i10) {
        if (i10 > 0) {
            if (!(i9 >= 0)) {
                AbstractC1855m.m4573a("Invalid remove index " + i9);
            }
            if (this.f8749i == i9) {
                this.f8752l += i10;
                return;
            }
            m6129c();
            this.f8749i = i9;
            this.f8752l = i10;
        }
    }
}
