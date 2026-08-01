package androidx.compose.runtime;

import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.compose.runtime.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0537m {
    /* JADX INFO: renamed from: a */
    public static final int m1914a(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int iM2154M = interfaceC0572r.m2154M();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return iM2154M;
    }

    /* JADX INFO: renamed from: b */
    public static final long m1915b(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-168259424, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long jMo2143B = interfaceC0572r.mo2143B();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return jMo2143B;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0520j3 m1916c(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        InterfaceC0520j3 interfaceC0520j3Mo2166b = interfaceC0572r.mo2166b();
        if (interfaceC0520j3Mo2166b == null) {
            C10010p0.m38820a("no recompose scope found");
            return null;
        }
        interfaceC0572r.mo2150I(interfaceC0520j3Mo2166b);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0520j3Mo2166b;
    }

    /* JADX INFO: renamed from: d */
    public static final void m1917d() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC0482e0 m1918e(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        AbstractC0482e0 abstractC0482e0Mo2155N = interfaceC0572r.mo2155N();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return abstractC0482e0Mo2155N;
    }
}
