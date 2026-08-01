package p332x;

import java.util.List;
import p024b9.AbstractC1043k;
import p121i3.C3185o;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p165l1.InterfaceC4499e;
import p215oc.C5706c;
import p219p.EnumC5898w0;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: x.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9267m implements InterfaceC9269n {

    /* JADX INFO: renamed from: a */
    public final int f31676a;

    /* JADX INFO: renamed from: b */
    public final int f31677b;

    /* JADX INFO: renamed from: c */
    public final List f31678c;

    /* JADX INFO: renamed from: d */
    public final long f31679d;

    /* JADX INFO: renamed from: e */
    public final Object f31680e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4499e.b f31681f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4499e.c f31682g;

    /* JADX INFO: renamed from: h */
    public final EnumC3191u f31683h;

    /* JADX INFO: renamed from: i */
    public final boolean f31684i;

    /* JADX INFO: renamed from: j */
    public final boolean f31685j;

    /* JADX INFO: renamed from: k */
    public final int f31686k;

    /* JADX INFO: renamed from: l */
    public final int[] f31687l;

    /* JADX INFO: renamed from: m */
    public int f31688m;

    /* JADX INFO: renamed from: n */
    public int f31689n;

    public C9267m(int i10, int i11, List list, long j10, Object obj, EnumC5898w0 enumC5898w0, InterfaceC4499e.b bVar, InterfaceC4499e.c cVar, EnumC3191u enumC3191u, boolean z10) {
        this.f31676a = i10;
        this.f31677b = i11;
        this.f31678c = list;
        this.f31679d = j10;
        this.f31680e = obj;
        this.f31681f = bVar;
        this.f31682g = cVar;
        this.f31683h = enumC3191u;
        this.f31684i = z10;
        this.f31685j = enumC5898w0 == EnumC5898w0.f18786q;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) list.get(i12);
            iMax = Math.max(iMax, !this.f31685j ? abstractC3545l1.m13259G0() : abstractC3545l1.m13264M0());
        }
        this.f31686k = iMax;
        this.f31687l = new int[this.f31678c.size() * 2];
        this.f31689n = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final void m36077a(int i10) {
        this.f31688m = getOffset() + i10;
        int length = this.f31687l.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f31685j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                int[] iArr = this.f31687l;
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m36078b() {
        return this.f31686k;
    }

    /* JADX INFO: renamed from: c */
    public Object m36079c() {
        return this.f31680e;
    }

    /* JADX INFO: renamed from: d */
    public final int m36080d(AbstractC3545l1 abstractC3545l1) {
        return this.f31685j ? abstractC3545l1.m13259G0() : abstractC3545l1.m13264M0();
    }

    /* JADX INFO: renamed from: e */
    public final long m36081e(int i10) {
        int[] iArr = this.f31687l;
        int i11 = i10 * 2;
        return C3185o.m12044d((((long) iArr[i11]) << 32) | (((long) iArr[i11 + 1]) & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public final int m36082f() {
        return this.f31677b;
    }

    /* JADX INFO: renamed from: g */
    public final void m36083g(AbstractC3545l1.a aVar) {
        AbstractC3545l1.a aVar2;
        int i10 = 0;
        if (!(this.f31689n != Integer.MIN_VALUE)) {
            AbstractC6635e.m26318a("position() should be called first");
        }
        int size = this.f31678c.size();
        while (i10 < size) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) this.f31678c.get(i10);
            long jM36081e = m36081e(i10);
            if (this.f31684i) {
                jM36081e = C3185o.m12044d((((long) (this.f31685j ? C3185o.m12049i(jM36081e) : (this.f31689n - C3185o.m12049i(jM36081e)) - m36080d(abstractC3545l1))) << 32) | (((long) (this.f31685j ? (this.f31689n - C3185o.m12050j(jM36081e)) - m36080d(abstractC3545l1) : C3185o.m12050j(jM36081e))) & 4294967295L));
            }
            long jM12053m = C3185o.m12053m(jM36081e, this.f31679d);
            if (this.f31685j) {
                aVar2 = aVar;
                AbstractC3545l1.a.m13278j0(aVar2, abstractC3545l1, jM12053m, 0.0f, null, 6, null);
            } else {
                aVar2 = aVar;
                AbstractC3545l1.a.m13273Z(aVar2, abstractC3545l1, jM12053m, 0.0f, null, 6, null);
            }
            i10++;
            aVar = aVar2;
        }
    }

    @Override // p332x.InterfaceC9269n
    public int getIndex() {
        return this.f31676a;
    }

    @Override // p332x.InterfaceC9269n
    public int getOffset() {
        return this.f31688m;
    }

    /* JADX INFO: renamed from: h */
    public final void m36084h(int i10, int i11, int i12) {
        int iM13264M0;
        this.f31688m = i10;
        this.f31689n = this.f31685j ? i12 : i11;
        List list = this.f31678c;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) list.get(i13);
            int i14 = i13 * 2;
            boolean z10 = this.f31685j;
            int[] iArr = this.f31687l;
            if (z10) {
                InterfaceC4499e.b bVar = this.f31681f;
                if (bVar == null) {
                    AbstractC6635e.m26319b("null horizontalAlignment");
                    C5706c.m23089a();
                    return;
                } else {
                    iArr[i14] = bVar.mo17427a(abstractC3545l1.m13264M0(), i11, this.f31683h);
                    this.f31687l[i14 + 1] = i10;
                    iM13264M0 = abstractC3545l1.m13259G0();
                }
            } else {
                iArr[i14] = i10;
                int i15 = i14 + 1;
                InterfaceC4499e.c cVar = this.f31682g;
                if (cVar == null) {
                    AbstractC6635e.m26319b("null verticalAlignment");
                    C5706c.m23089a();
                    return;
                } else {
                    iArr[i15] = cVar.mo17428a(abstractC3545l1.m13259G0(), i12);
                    iM13264M0 = abstractC3545l1.m13264M0();
                }
            }
            i10 += iM13264M0;
        }
    }

    public /* synthetic */ C9267m(int i10, int i11, List list, long j10, Object obj, EnumC5898w0 enumC5898w0, InterfaceC4499e.b bVar, InterfaceC4499e.c cVar, EnumC3191u enumC3191u, boolean z10, AbstractC1043k abstractC1043k) {
        this(i10, i11, list, j10, obj, enumC5898w0, bVar, cVar, enumC3191u, z10);
    }
}
