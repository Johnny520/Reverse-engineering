package p316w;

import androidx.compose.foundation.lazy.layout.InterfaceC0406o;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;

/* JADX INFO: renamed from: w.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8943e {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0406o m34366a(C8939c1 c8939c1, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(2004349821, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:24)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC0572r.mo2162U(c8939c1)) || (i10 & 6) == 4;
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (z10 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new C8946f(c8939c1);
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C8946f c8946f = (C8946f) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c8946f;
    }
}
