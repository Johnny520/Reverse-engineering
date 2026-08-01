package androidx.compose.foundation.lazy.layout;

import p165l1.InterfaceC4507m;
import p219p.EnumC5898w0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0394l {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m1269b(InterfaceC4507m interfaceC4507m, InterfaceC0406o interfaceC0406o, C0386j c0386j, boolean z10, EnumC5898w0 enumC5898w0) {
        return interfaceC4507m.mo17445i(new C0390k(interfaceC0406o, c0386j, z10, enumC5898w0));
    }

    /* JADX INFO: renamed from: c */
    public static final Void m1270c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
