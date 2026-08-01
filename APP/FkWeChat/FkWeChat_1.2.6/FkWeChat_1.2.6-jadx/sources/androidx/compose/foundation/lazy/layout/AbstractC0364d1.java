package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p165l1.InterfaceC4507m;
import p219p.EnumC5898w0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0364d1 {
    /* JADX INFO: renamed from: a */
    public static final float m1156a(int i10, int i11, boolean z10) {
        return z10 ? m1157b(i10, i11) + 100 : m1157b(i10, i11);
    }

    /* JADX INFO: renamed from: b */
    public static final float m1157b(int i10, int i11) {
        return i11 + (i10 * 500);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4507m m1158c(InterfaceC4507m interfaceC4507m, InterfaceC0173a interfaceC0173a, InterfaceC0360c1 interfaceC0360c1, EnumC5898w0 enumC5898w0, boolean z10, boolean z11, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        InterfaceC4507m interfaceC4507mMo17445i = interfaceC4507m.mo17445i(new C0368e1(interfaceC0173a, interfaceC0360c1, enumC5898w0, z10, z11));
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC4507mMo17445i;
    }
}
