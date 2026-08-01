package p303v;

import androidx.compose.foundation.lazy.layout.C0419s;
import androidx.compose.foundation.lazy.layout.InterfaceC0391k0;
import java.util.List;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p121i3.C3185o;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p165l1.InterfaceC4499e;
import p215oc.C5706c;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: v.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8694f0 implements InterfaceC8709n, InterfaceC0391k0 {

    /* JADX INFO: renamed from: a */
    public final int f28861a;

    /* JADX INFO: renamed from: b */
    public final List f28862b;

    /* JADX INFO: renamed from: c */
    public final boolean f28863c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4499e.b f28864d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4499e.c f28865e;

    /* JADX INFO: renamed from: f */
    public final EnumC3191u f28866f;

    /* JADX INFO: renamed from: g */
    public final boolean f28867g;

    /* JADX INFO: renamed from: h */
    public final int f28868h;

    /* JADX INFO: renamed from: i */
    public final int f28869i;

    /* JADX INFO: renamed from: j */
    public final int f28870j;

    /* JADX INFO: renamed from: k */
    public final long f28871k;

    /* JADX INFO: renamed from: l */
    public final Object f28872l;

    /* JADX INFO: renamed from: m */
    public final Object f28873m;

    /* JADX INFO: renamed from: n */
    public final C0419s f28874n;

    /* JADX INFO: renamed from: o */
    public final long f28875o;

    /* JADX INFO: renamed from: p */
    public int f28876p;

    /* JADX INFO: renamed from: q */
    public final int f28877q;

    /* JADX INFO: renamed from: r */
    public final int f28878r;

    /* JADX INFO: renamed from: s */
    public final int f28879s;

    /* JADX INFO: renamed from: t */
    public final int f28880t;

    /* JADX INFO: renamed from: u */
    public final int f28881u;

    /* JADX INFO: renamed from: v */
    public boolean f28882v;

    /* JADX INFO: renamed from: w */
    public int f28883w;

    /* JADX INFO: renamed from: x */
    public int f28884x;

    /* JADX INFO: renamed from: y */
    public int f28885y;

    /* JADX INFO: renamed from: z */
    public final int[] f28886z;

    public C8694f0(int i10, List list, boolean z10, InterfaceC4499e.b bVar, InterfaceC4499e.c cVar, EnumC3191u enumC3191u, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, C0419s c0419s, long j11) {
        this.f28861a = i10;
        this.f28862b = list;
        this.f28863c = z10;
        this.f28864d = bVar;
        this.f28865e = cVar;
        this.f28866f = enumC3191u;
        this.f28867g = z11;
        this.f28868h = i11;
        this.f28869i = i12;
        this.f28870j = i13;
        this.f28871k = j10;
        this.f28872l = obj;
        this.f28873m = obj2;
        this.f28874n = c0419s;
        this.f28875o = j11;
        this.f28879s = 1;
        this.f28883w = Integer.MIN_VALUE;
        int size = list.size();
        int iM13259G0 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) list.get(i14);
            iM13259G0 += mo1246i() ? abstractC3545l1.m13259G0() : abstractC3545l1.m13264M0();
            iMax = Math.max(iMax, !mo1246i() ? abstractC3545l1.m13259G0() : abstractC3545l1.m13264M0());
        }
        this.f28877q = iM13259G0;
        this.f28880t = AbstractC2368o.m8578e(mo33408a() + this.f28870j, 0);
        this.f28881u = iMax;
        this.f28886z = new int[this.f28862b.size() * 2];
    }

    @Override // p303v.InterfaceC8709n
    /* JADX INFO: renamed from: a */
    public int mo33408a() {
        return this.f28877q;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: b */
    public int mo1239b() {
        return this.f28862b.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: c */
    public void mo1240c(boolean z10) {
        this.f28882v = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: d */
    public int mo1241d() {
        return this.f28880t;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: e */
    public boolean mo1242e() {
        return this.f28882v;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: f */
    public int mo1243f() {
        return this.f28879s;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: g */
    public Object mo1244g(int i10) {
        return ((AbstractC3545l1) this.f28862b.get(i10)).mo13149o();
    }

    @Override // p303v.InterfaceC8709n, androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    public int getIndex() {
        return this.f28861a;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    public Object getKey() {
        return this.f28872l;
    }

    @Override // p303v.InterfaceC8709n
    public int getOffset() {
        return this.f28876p;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: h */
    public long mo1245h() {
        return this.f28875o;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: i */
    public boolean mo1246i() {
        return this.f28863c;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: j */
    public long mo1247j(int i10) {
        if (i10 == 0 && mo1239b() == 0) {
            if (mo1246i()) {
                return C3185o.m12044d((4294967295L & ((long) getOffset())) | (((long) 0) << 32));
            }
            return C3185o.m12044d((4294967295L & ((long) 0)) | (((long) getOffset()) << 32));
        }
        int[] iArr = this.f28886z;
        int i11 = i10 * 2;
        int i12 = iArr[i11];
        return C3185o.m12044d((4294967295L & ((long) iArr[i11 + 1])) | (((long) i12) << 32));
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: k */
    public int mo1248k() {
        return this.f28878r;
    }

    /* JADX INFO: renamed from: l */
    public final void m33409l(int i10, boolean z10) {
        if (mo1242e()) {
            return;
        }
        this.f28876p = getOffset() + i10;
        int length = this.f28886z.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 & 1;
            if ((mo1246i() && i12 != 0) || (!mo1246i() && i12 == 0)) {
                int[] iArr = this.f28886z;
                iArr[i11] = iArr[i11] + i10;
            }
        }
        if (z10) {
            int iMo1239b = mo1239b();
            for (int i13 = 0; i13 < iMo1239b; i13++) {
                this.f28874n.m1360d(getKey(), i13);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m33410m() {
        return this.f28881u;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: n */
    public void mo1249n(int i10, int i11, int i12, int i13) {
        m33414r(i10, i12, i13);
    }

    /* JADX INFO: renamed from: o */
    public final int m33411o(long j10) {
        return mo1246i() ? C3185o.m12050j(j10) : C3185o.m12049i(j10);
    }

    /* JADX INFO: renamed from: p */
    public final int m33412p(AbstractC3545l1 abstractC3545l1) {
        return mo1246i() ? abstractC3545l1.m13259G0() : abstractC3545l1.m13264M0();
    }

    /* JADX INFO: renamed from: q */
    public final void m33413q(AbstractC3545l1.a aVar, boolean z10) {
        AbstractC3545l1.a aVar2;
        long jM12049i;
        int i10 = 0;
        if (!(this.f28883w != Integer.MIN_VALUE)) {
            AbstractC6635e.m26318a("position() should be called first");
        }
        int iMo1239b = mo1239b();
        while (i10 < iMo1239b) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) this.f28862b.get(i10);
            m33412p(abstractC3545l1);
            long jMo1247j = mo1247j(i10);
            this.f28874n.m1360d(getKey(), i10);
            if (this.f28867g) {
                if (mo1246i()) {
                    jM12049i = (((long) ((this.f28883w - C3185o.m12050j(jMo1247j)) - m33412p(abstractC3545l1))) & 4294967295L) | (((long) C3185o.m12049i(jMo1247j)) << 32);
                } else {
                    jM12049i = (((long) ((this.f28883w - C3185o.m12049i(jMo1247j)) - m33412p(abstractC3545l1))) << 32) | (4294967295L & ((long) C3185o.m12050j(jMo1247j)));
                }
                jMo1247j = C3185o.m12044d(jM12049i);
            }
            long jM12053m = C3185o.m12053m(jMo1247j, this.f28871k);
            if (mo1246i()) {
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

    /* JADX INFO: renamed from: r */
    public final void m33414r(int i10, int i11, int i12) {
        int iM13264M0;
        this.f28876p = i10;
        this.f28883w = mo1246i() ? i12 : i11;
        List list = this.f28862b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) list.get(i13);
            int i14 = i13 * 2;
            boolean zMo1246i = mo1246i();
            int[] iArr = this.f28886z;
            if (zMo1246i) {
                InterfaceC4499e.b bVar = this.f28864d;
                if (bVar == null) {
                    AbstractC6635e.m26319b("null horizontalAlignment when isVertical == true");
                    C5706c.m23089a();
                    return;
                } else {
                    iArr[i14] = bVar.mo17427a(abstractC3545l1.m13264M0(), i11, this.f28866f);
                    this.f28886z[i14 + 1] = i10;
                    iM13264M0 = abstractC3545l1.m13259G0();
                }
            } else {
                iArr[i14] = i10;
                int i15 = i14 + 1;
                InterfaceC4499e.c cVar = this.f28865e;
                if (cVar == null) {
                    AbstractC6635e.m26319b("null verticalAlignment when isVertical == false");
                    C5706c.m23089a();
                    return;
                } else {
                    iArr[i15] = cVar.mo17428a(abstractC3545l1.m13259G0(), i12);
                    iM13264M0 = abstractC3545l1.m13264M0();
                }
            }
            i10 += iM13264M0;
        }
        this.f28884x = -this.f28868h;
        this.f28885y = this.f28883w + this.f28869i;
    }

    /* JADX INFO: renamed from: s */
    public final void m33415s(int i10) {
        this.f28883w = i10;
        this.f28885y = i10 + this.f28869i;
    }

    public /* synthetic */ C8694f0(int i10, List list, boolean z10, InterfaceC4499e.b bVar, InterfaceC4499e.c cVar, EnumC3191u enumC3191u, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, C0419s c0419s, long j11, AbstractC1043k abstractC1043k) {
        this(i10, list, z10, bVar, cVar, enumC3191u, z11, i11, i12, i13, j10, obj, obj2, c0419s, j11);
    }
}
