package p316w;

import androidx.compose.foundation.lazy.layout.C0419s;
import androidx.compose.foundation.lazy.layout.InterfaceC0391k0;
import java.util.List;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p135j2.AbstractC3545l1;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: w.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8959j0 implements InterfaceC8964m, InterfaceC0391k0 {

    /* JADX INFO: renamed from: a */
    public final int f29698a;

    /* JADX INFO: renamed from: b */
    public final Object f29699b;

    /* JADX INFO: renamed from: c */
    public final boolean f29700c;

    /* JADX INFO: renamed from: d */
    public final int f29701d;

    /* JADX INFO: renamed from: e */
    public final boolean f29702e;

    /* JADX INFO: renamed from: f */
    public final EnumC3191u f29703f;

    /* JADX INFO: renamed from: g */
    public final int f29704g;

    /* JADX INFO: renamed from: h */
    public final int f29705h;

    /* JADX INFO: renamed from: i */
    public final List f29706i;

    /* JADX INFO: renamed from: j */
    public final long f29707j;

    /* JADX INFO: renamed from: k */
    public final Object f29708k;

    /* JADX INFO: renamed from: l */
    public final C0419s f29709l;

    /* JADX INFO: renamed from: m */
    public final long f29710m;

    /* JADX INFO: renamed from: n */
    public final int f29711n;

    /* JADX INFO: renamed from: o */
    public final int f29712o;

    /* JADX INFO: renamed from: p */
    public final int f29713p;

    /* JADX INFO: renamed from: q */
    public final int f29714q;

    /* JADX INFO: renamed from: r */
    public int f29715r;

    /* JADX INFO: renamed from: s */
    public int f29716s;

    /* JADX INFO: renamed from: t */
    public int f29717t;

    /* JADX INFO: renamed from: u */
    public final long f29718u;

    /* JADX INFO: renamed from: v */
    public long f29719v;

    /* JADX INFO: renamed from: w */
    public int f29720w;

    /* JADX INFO: renamed from: x */
    public int f29721x;

    /* JADX INFO: renamed from: y */
    public boolean f29722y;

    public C8959j0(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, EnumC3191u enumC3191u, int i13, int i14, List list, long j10, Object obj2, C0419s c0419s, long j11, int i15, int i16) {
        this.f29698a = i10;
        this.f29699b = obj;
        this.f29700c = z10;
        this.f29701d = i11;
        this.f29702e = z11;
        this.f29703f = enumC3191u;
        this.f29704g = i13;
        this.f29705h = i14;
        this.f29706i = list;
        this.f29707j = j10;
        this.f29708k = obj2;
        this.f29709l = c0419s;
        this.f29710m = j11;
        this.f29711n = i15;
        this.f29712o = i16;
        this.f29715r = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) list.get(i17);
            iMax = Math.max(iMax, mo1246i() ? abstractC3545l1.m13259G0() : abstractC3545l1.m13264M0());
        }
        this.f29713p = iMax;
        this.f29714q = AbstractC2368o.m8578e(i12 + iMax, 0);
        boolean zMo1246i = mo1246i();
        int i18 = this.f29701d;
        this.f29718u = zMo1246i ? C3189s.m12082c((((long) i18) << 32) | (((long) iMax) & 4294967295L)) : C3189s.m12082c((((long) i18) & 4294967295L) | (((long) iMax) << 32));
        this.f29719v = C3185o.f8471b.m12058b();
        this.f29720w = -1;
        this.f29721x = -1;
    }

    /* JADX INFO: renamed from: p */
    private final int m34401p(long j10) {
        return mo1246i() ? C3185o.m12050j(j10) : C3185o.m12049i(j10);
    }

    /* JADX INFO: renamed from: r */
    private final int m34402r(AbstractC3545l1 abstractC3545l1) {
        return mo1246i() ? abstractC3545l1.m13259G0() : abstractC3545l1.m13264M0();
    }

    @Override // p316w.InterfaceC8964m
    /* JADX INFO: renamed from: a */
    public long mo34403a() {
        return this.f29718u;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: b */
    public int mo1239b() {
        return this.f29706i.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: c */
    public void mo1240c(boolean z10) {
        this.f29722y = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: d */
    public int mo1241d() {
        return this.f29714q;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: e */
    public boolean mo1242e() {
        return this.f29722y;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: f */
    public int mo1243f() {
        return this.f29712o;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: g */
    public Object mo1244g(int i10) {
        return ((AbstractC3545l1) this.f29706i.get(i10)).mo13149o();
    }

    @Override // p316w.InterfaceC8964m, androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    public int getIndex() {
        return this.f29698a;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    public Object getKey() {
        return this.f29699b;
    }

    @Override // p316w.InterfaceC8964m
    public int getRow() {
        return this.f29720w;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: h */
    public long mo1245h() {
        return this.f29710m;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: i */
    public boolean mo1246i() {
        return this.f29700c;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: j */
    public long mo1247j(int i10) {
        return mo34404l();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: k */
    public int mo1248k() {
        return this.f29711n;
    }

    @Override // p316w.InterfaceC8964m
    /* JADX INFO: renamed from: l */
    public long mo34404l() {
        return this.f29719v;
    }

    @Override // p316w.InterfaceC8964m
    /* JADX INFO: renamed from: m */
    public int mo34405m() {
        return this.f29721x;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0391k0
    /* JADX INFO: renamed from: n */
    public void mo1249n(int i10, int i11, int i12, int i13) {
        m34409t(i10, i11, i12, i13, -1, -1);
    }

    /* JADX INFO: renamed from: o */
    public final void m34406o(int i10, boolean z10) {
        if (mo1242e()) {
            return;
        }
        long jMo34404l = mo34404l();
        int iM12049i = mo1246i() ? C3185o.m12049i(jMo34404l) : C3185o.m12049i(jMo34404l) + i10;
        boolean zMo1246i = mo1246i();
        int iM12050j = C3185o.m12050j(jMo34404l);
        if (zMo1246i) {
            iM12050j += i10;
        }
        this.f29719v = C3185o.m12044d((((long) iM12049i) << 32) | (((long) iM12050j) & 4294967295L));
        if (z10) {
            int iMo1239b = mo1239b();
            for (int i11 = 0; i11 < iMo1239b; i11++) {
                this.f29709l.m1360d(getKey(), i11);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m34407q() {
        return this.f29713p;
    }

    /* JADX INFO: renamed from: s */
    public final void m34408s(AbstractC3545l1.a aVar, boolean z10) {
        AbstractC3545l1.a aVar2;
        int i10 = 0;
        if (!(this.f29715r != Integer.MIN_VALUE)) {
            AbstractC6635e.m26318a("position() should be called first");
        }
        int iMo1239b = mo1239b();
        while (i10 < iMo1239b) {
            AbstractC3545l1 abstractC3545l1 = (AbstractC3545l1) this.f29706i.get(i10);
            m34402r(abstractC3545l1);
            long jMo34404l = mo34404l();
            this.f29709l.m1360d(getKey(), i10);
            if (this.f29702e) {
                jMo34404l = C3185o.m12044d((((long) (mo1246i() ? C3185o.m12049i(jMo34404l) : (this.f29715r - C3185o.m12049i(jMo34404l)) - m34402r(abstractC3545l1))) << 32) | (((long) (mo1246i() ? (this.f29715r - C3185o.m12050j(jMo34404l)) - m34402r(abstractC3545l1) : C3185o.m12050j(jMo34404l))) & 4294967295L));
            }
            long jM12053m = C3185o.m12053m(jMo34404l, this.f29707j);
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

    /* JADX INFO: renamed from: t */
    public final void m34409t(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f29715r = mo1246i() ? i13 : i12;
        if (!mo1246i()) {
            i12 = i13;
        }
        if (mo1246i() && this.f29703f == EnumC3191u.f8485r) {
            i11 = (i12 - i11) - this.f29701d;
        }
        this.f29719v = mo1246i() ? C3185o.m12044d((((long) i11) << 32) | (4294967295L & ((long) i10))) : C3185o.m12044d((((long) i11) & 4294967295L) | (((long) i10) << 32));
        this.f29720w = i14;
        this.f29721x = i15;
        this.f29716s = -this.f29704g;
        this.f29717t = this.f29715r + this.f29705h;
    }

    /* JADX INFO: renamed from: u */
    public final void m34410u(int i10) {
        this.f29715r = i10;
        this.f29717t = i10 + this.f29705h;
    }

    public /* synthetic */ C8959j0(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, EnumC3191u enumC3191u, int i13, int i14, List list, long j10, Object obj2, C0419s c0419s, long j11, int i15, int i16, AbstractC1043k abstractC1043k) {
        this(i10, obj, z10, i11, i12, z11, enumC3191u, i13, i14, list, j10, obj2, c0419s, j11, i15, i16);
    }
}
