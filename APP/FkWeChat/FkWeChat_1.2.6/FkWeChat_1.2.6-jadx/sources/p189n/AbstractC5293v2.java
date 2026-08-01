package p189n;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p102h1.AbstractC2825f;
import p102h1.InterfaceC2843x;
import p165l1.InterfaceC4507m;
import p219p.EnumC5898w0;
import p219p.InterfaceC5859j0;

/* JADX INFO: renamed from: n.v2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5293v2 {
    /* JADX INFO: renamed from: a */
    public static C5221g3 m21595a(int i10) {
        return new C5221g3(i10);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m21596b(InterfaceC4507m interfaceC4507m, C5221g3 c5221g3, boolean z10, InterfaceC5859j0 interfaceC5859j0, boolean z11) {
        return m21600f(interfaceC4507m, c5221g3, z11, interfaceC5859j0, z10, false, true, null, 64, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC4507m m21597c(InterfaceC4507m interfaceC4507m, C5221g3 c5221g3, boolean z10, InterfaceC5859j0 interfaceC5859j0, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC5859j0 = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return m21596b(interfaceC4507m, c5221g3, z10, interfaceC5859j0, z11);
    }

    /* JADX INFO: renamed from: d */
    public static final C5221g3 m21598d(final int i10, InterfaceC0572r interfaceC0572r, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:68)");
        }
        Object[] objArr = new Object[0];
        InterfaceC2843x interfaceC2843xM21419a = C5221g3.f16035i.m21419a();
        if ((((i11 & 14) ^ 6) <= 4 || !interfaceC0572r.mo2172h(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (z10 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new InterfaceC0173a() { // from class: n.u2
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return AbstractC5293v2.m21595a(i10);
                }
            };
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C5221g3 c5221g3 = (C5221g3) AbstractC2825f.m10052k(objArr, interfaceC2843xM21419a, (InterfaceC0173a) objMo2170f, interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c5221g3;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC4507m m21599e(InterfaceC4507m interfaceC4507m, C5221g3 c5221g3, boolean z10, InterfaceC5859j0 interfaceC5859j0, boolean z11, boolean z12, boolean z13, InterfaceC5225h2 interfaceC5225h2) {
        return AbstractC5231i3.m21434a(interfaceC4507m, c5221g3, z12 ? EnumC5898w0.f18786q : EnumC5898w0.f18787r, z11, z10, interfaceC5859j0, c5221g3.m21413m(), z13, interfaceC5225h2, (256 & 256) != 0 ? null : null).mo17445i(new C5246l3(c5221g3, z10, z12));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ InterfaceC4507m m21600f(InterfaceC4507m interfaceC4507m, C5221g3 c5221g3, boolean z10, InterfaceC5859j0 interfaceC5859j0, boolean z11, boolean z12, boolean z13, InterfaceC5225h2 interfaceC5225h2, int i10, Object obj) {
        return m21599e(interfaceC4507m, c5221g3, z10, interfaceC5859j0, z11, z12, z13, (i10 & 64) != 0 ? null : interfaceC5225h2);
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC4507m m21601g(InterfaceC4507m interfaceC4507m, C5221g3 c5221g3, boolean z10, InterfaceC5859j0 interfaceC5859j0, boolean z11) {
        return m21600f(interfaceC4507m, c5221g3, z11, interfaceC5859j0, z10, true, true, null, 64, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InterfaceC4507m m21602h(InterfaceC4507m interfaceC4507m, C5221g3 c5221g3, boolean z10, InterfaceC5859j0 interfaceC5859j0, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            interfaceC5859j0 = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return m21601g(interfaceC4507m, c5221g3, z10, interfaceC5859j0, z11);
    }
}
