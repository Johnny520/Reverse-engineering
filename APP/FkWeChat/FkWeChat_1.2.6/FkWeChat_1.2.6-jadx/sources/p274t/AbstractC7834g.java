package p274t;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p055e.AbstractC1960a;
import p121i3.C3173c;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4836e2;
import p179m2.AbstractC4846g2;

/* JADX INFO: renamed from: t.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7834g {

    /* JADX INFO: renamed from: t.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ float f26134r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ boolean f26135s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, boolean z10) {
            super(1);
            this.f26134r = f10;
            this.f26135s = z10;
        }

        /* JADX INFO: renamed from: a */
        public final void m30360a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m30360a(null);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m30357a(InterfaceC4507m interfaceC4507m, float f10, boolean z10) {
        return interfaceC4507m.mo17445i(new C7829f(f10, z10, AbstractC4836e2.m19334b() ? new a(f10, z10) : AbstractC4836e2.m19333a()));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m30358b(InterfaceC4507m interfaceC4507m, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m30357a(interfaceC4507m, f10, z10);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m30359c(long j10, int i10, int i11) {
        int iM11975n = C3173c.m11975n(j10);
        if (i10 > C3173c.m11973l(j10) || iM11975n > i10) {
            return false;
        }
        return i11 <= C3173c.m11972k(j10) && C3173c.m11974m(j10) <= i11;
    }
}
