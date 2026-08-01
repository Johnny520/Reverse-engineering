package p004a3;

import androidx.compose.runtime.InterfaceC0564p5;
import p004a3.AbstractC0042h;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p376zd.C10010p0;

/* JADX INFO: renamed from: a3.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0047k implements AbstractC0042h.b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0060x f85a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0061y f86b;

    /* JADX INFO: renamed from: c */
    public final C0043h0 f87c;

    /* JADX INFO: renamed from: d */
    public final C0050n f88d;

    /* JADX INFO: renamed from: e */
    public final C0059w f89e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0184l f90f;

    public /* synthetic */ C0047k(InterfaceC0060x interfaceC0060x, InterfaceC0061y interfaceC0061y, C0043h0 c0043h0, C0050n c0050n, C0059w c0059w, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC0060x, (i10 & 2) != 0 ? InterfaceC0061y.f135a.m218a() : interfaceC0061y, (i10 & 4) != 0 ? AbstractC0048l.m164b() : c0043h0, (i10 & 8) != 0 ? new C0050n(AbstractC0048l.m163a(), null, 2, null) : c0050n, (i10 & 16) != 0 ? new C0059w() : c0059w);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0045i0 m160c(C0047k c0047k, C0039f0 c0039f0, InterfaceC0184l interfaceC0184l) {
        InterfaceC0045i0 interfaceC0045i0M166a = c0047k.f88d.m166a(c0039f0, c0047k.f85a, interfaceC0184l, c0047k.f90f);
        if (interfaceC0045i0M166a != null) {
            return interfaceC0045i0M166a;
        }
        InterfaceC0045i0 interfaceC0045i0M214a = c0047k.f89e.m214a(c0039f0, c0047k.f85a, interfaceC0184l, c0047k.f90f);
        if (interfaceC0045i0M214a != null) {
            return interfaceC0045i0M214a;
        }
        C10010p0.m38820a("Could not load font");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Object m161d(C0047k c0047k, C0039f0 c0039f0) {
        return c0047k.m162e(C0039f0.m144b(c0039f0, null, null, 0, 0, null, 30, null)).getValue();
    }

    @Override // p004a3.AbstractC0042h.b
    /* JADX INFO: renamed from: a */
    public InterfaceC0564p5 mo156a(AbstractC0042h abstractC0042h, C0054r c0054r, int i10, int i11) {
        return m162e(new C0039f0(this.f86b.m217d(abstractC0042h), this.f86b.mo131b(c0054r), this.f86b.m215a(i10), this.f86b.m216c(i11), this.f85a.mo129a(), null));
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0564p5 m162e(final C0039f0 c0039f0) {
        return this.f87c.m158b(c0039f0, new InterfaceC0184l() { // from class: a3.j
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C0047k.m160c(this.f83q, c0039f0, (InterfaceC0184l) obj);
            }
        });
    }

    public C0047k(InterfaceC0060x interfaceC0060x, InterfaceC0061y interfaceC0061y, C0043h0 c0043h0, C0050n c0050n, C0059w c0059w) {
        this.f85a = interfaceC0060x;
        this.f86b = interfaceC0061y;
        this.f87c = c0043h0;
        this.f88d = c0050n;
        this.f89e = c0059w;
        this.f90f = new InterfaceC0184l() { // from class: a3.i
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C0047k.m161d(this.f80q, (C0039f0) obj);
            }
        };
    }
}
