package p274t;

import p024b9.AbstractC1043k;
import p117i.C3069l;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p274t.AbstractC7910v0;

/* JADX INFO: renamed from: t.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7870n0 {

    /* JADX INFO: renamed from: a */
    public final int f26220a;

    /* JADX INFO: renamed from: b */
    public final C7925y0 f26221b;

    /* JADX INFO: renamed from: c */
    public final long f26222c;

    /* JADX INFO: renamed from: d */
    public final int f26223d;

    /* JADX INFO: renamed from: e */
    public final int f26224e;

    /* JADX INFO: renamed from: f */
    public final int f26225f;

    /* JADX INFO: renamed from: t.n0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final boolean f26230a;

        /* JADX INFO: renamed from: b */
        public final boolean f26231b;

        public b(boolean z10, boolean z11) {
            this.f26230a = z10;
            this.f26231b = z11;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m30438a() {
            return this.f26231b;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m30439b() {
            return this.f26230a;
        }
    }

    public C7870n0(int i10, C7925y0 c7925y0, long j10, int i11, int i12, int i13) {
        this.f26220a = i10;
        this.f26221b = c7925y0;
        this.f26222c = j10;
        this.f26223d = i11;
        this.f26224e = i12;
        this.f26225f = i13;
    }

    /* JADX INFO: renamed from: a */
    public final a m30431a(b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a aVarM30602c;
        if (!bVar.m30438a() || (aVarM30602c = this.f26221b.m30602c(z10, i10, i11)) == null) {
            return null;
        }
        aVarM30602c.m30437e(i10 >= 0 && (i13 == 0 || (i12 - C3069l.m11394e(aVarM30602c.m30434b()) >= 0 && i13 < this.f26220a)));
        return aVarM30602c;
    }

    /* JADX INFO: renamed from: b */
    public final b m30432b(boolean z10, int i10, long j10, C3069l c3069l, int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = i12 + i13;
        if (c3069l == null) {
            return new b(true, true);
        }
        if (this.f26221b.m30606g() != AbstractC7910v0.a.f26365q && (i11 >= this.f26223d || C3069l.m11395f(j10) - C3069l.m11395f(c3069l.m11398i()) < 0)) {
            return new b(true, true);
        }
        if (i10 != 0 && (i10 >= this.f26220a || C3069l.m11394e(j10) - C3069l.m11394e(c3069l.m11398i()) < 0)) {
            return z11 ? new b(true, true) : new b(true, m30432b(z10, 0, C3069l.m11391b(C3173c.m11973l(this.f26222c), (C3069l.m11395f(j10) - this.f26225f) - i13), C3069l.m11390a(C3069l.m11391b(C3069l.m11394e(c3069l.m11398i()) - this.f26224e, C3069l.m11395f(c3069l.m11398i()))), i11 + 1, i14, 0, true, false).m30438a());
        }
        int iMax = i12 + Math.max(i13, C3069l.m11395f(c3069l.m11398i()));
        C3069l c3069lM30603d = z12 ? null : this.f26221b.m30603d(z10, i11, iMax);
        if (c3069lM30603d != null) {
            c3069lM30603d.m11398i();
            if (i10 + 1 >= this.f26220a || ((C3069l.m11394e(j10) - C3069l.m11394e(c3069l.m11398i())) - this.f26224e) - C3069l.m11394e(c3069lM30603d.m11398i()) < 0) {
                if (z12) {
                    return new b(true, true);
                }
                b bVarM30432b = m30432b(false, 0, C3069l.m11391b(C3173c.m11973l(this.f26222c), (C3069l.m11395f(j10) - this.f26225f) - Math.max(i13, C3069l.m11395f(c3069l.m11398i()))), c3069lM30603d, i11 + 1, iMax, 0, true, true);
                return new b(bVarM30432b.m30438a(), bVarM30432b.m30438a());
            }
        }
        return new b(false, false);
    }

    /* JADX INFO: renamed from: t.n0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC3552n0 f26226a;

        /* JADX INFO: renamed from: b */
        public final AbstractC3545l1 f26227b;

        /* JADX INFO: renamed from: c */
        public final long f26228c;

        /* JADX INFO: renamed from: d */
        public boolean f26229d;

        public /* synthetic */ a(InterfaceC3552n0 interfaceC3552n0, AbstractC3545l1 abstractC3545l1, long j10, boolean z10, int i10, AbstractC1043k abstractC1043k) {
            this(interfaceC3552n0, abstractC3545l1, j10, (i10 & 8) != 0 ? true : z10, null);
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC3552n0 m30433a() {
            return this.f26226a;
        }

        /* JADX INFO: renamed from: b */
        public final long m30434b() {
            return this.f26228c;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m30435c() {
            return this.f26229d;
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC3545l1 m30436d() {
            return this.f26227b;
        }

        /* JADX INFO: renamed from: e */
        public final void m30437e(boolean z10) {
            this.f26229d = z10;
        }

        public a(InterfaceC3552n0 interfaceC3552n0, AbstractC3545l1 abstractC3545l1, long j10, boolean z10) {
            this.f26226a = interfaceC3552n0;
            this.f26227b = abstractC3545l1;
            this.f26228c = j10;
            this.f26229d = z10;
        }

        public /* synthetic */ a(InterfaceC3552n0 interfaceC3552n0, AbstractC3545l1 abstractC3545l1, long j10, boolean z10, AbstractC1043k abstractC1043k) {
            this(interfaceC3552n0, abstractC3545l1, j10, z10);
        }
    }

    public /* synthetic */ C7870n0(int i10, C7925y0 c7925y0, long j10, int i11, int i12, int i13, AbstractC1043k abstractC1043k) {
        this(i10, c7925y0, j10, i11, i12, i13);
    }
}
