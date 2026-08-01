package p316w;

import java.util.List;
import p080f9.AbstractC2368o;
import p121i3.C3173c;
import p172l8.C4700i0;
import p316w.C8987x0;

/* JADX INFO: renamed from: w.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8965m0 {

    /* JADX INFO: renamed from: a */
    public final boolean f29741a;

    /* JADX INFO: renamed from: b */
    public final C8979t0 f29742b;

    /* JADX INFO: renamed from: c */
    public final int f29743c;

    /* JADX INFO: renamed from: d */
    public final int f29744d;

    /* JADX INFO: renamed from: e */
    public final AbstractC8961k0 f29745e;

    /* JADX INFO: renamed from: f */
    public final C8987x0 f29746f;

    public AbstractC8965m0(boolean z10, C8979t0 c8979t0, int i10, int i11, AbstractC8961k0 abstractC8961k0, C8987x0 c8987x0) {
        this.f29741a = z10;
        this.f29742b = c8979t0;
        this.f29743c = i10;
        this.f29744d = i11;
        this.f29745e = abstractC8961k0;
        this.f29746f = c8987x0;
    }

    /* JADX INFO: renamed from: a */
    public final long m34427a(int i10, int i11) {
        int i12;
        C8979t0 c8979t0 = this.f29742b;
        if (i11 == 1) {
            i12 = c8979t0.m34455b()[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            i12 = (c8979t0.m34454a()[i13] + this.f29742b.m34455b()[i13]) - this.f29742b.m34454a()[i10];
        }
        int iM8578e = AbstractC2368o.m8578e(i12, 0);
        return this.f29741a ? C3173c.f8451b.m11983e(iM8578e) : C3173c.f8451b.m11982d(iM8578e);
    }

    /* JADX INFO: renamed from: b */
    public abstract C8963l0 mo34304b(int i10, C8959j0[] c8959j0Arr, List list, int i11);

    /* JADX INFO: renamed from: c */
    public final C8963l0 m34428c(int i10) {
        C8987x0.c cVarM34460d = this.f29746f.m34460d(i10);
        int size = cVarM34460d.m34472b().size();
        int i11 = (size == 0 || cVarM34460d.m34471a() + size == this.f29743c) ? 0 : this.f29744d;
        C8959j0[] c8959j0Arr = new C8959j0[size];
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int iM34318d = C8937c.m34318d(((C8937c) cVarM34460d.m34472b().get(i13)).m34321g());
            C8959j0 c8959j0M34412e = this.f29745e.m34412e(cVarM34460d.m34471a() + i13, m34427a(i12, iM34318d), i12, iM34318d, i11);
            i12 += iM34318d;
            C4700i0 c4700i0 = C4700i0.f13910a;
            c8959j0Arr[i13] = c8959j0M34412e;
        }
        return mo34304b(i10, c8959j0Arr, cVarM34460d.m34472b(), i11);
    }

    /* JADX INFO: renamed from: d */
    public final int m34429d(int i10) {
        C8987x0 c8987x0 = this.f29746f;
        return c8987x0.m34466j(i10, c8987x0.m34462f());
    }
}
