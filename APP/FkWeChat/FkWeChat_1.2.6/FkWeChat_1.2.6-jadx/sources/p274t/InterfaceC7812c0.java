package p274t;

import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p215oc.C5725t;

/* JADX INFO: renamed from: t.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7812c0 {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC4507m m30254c(InterfaceC7812c0 interfaceC7812c0, InterfaceC4507m interfaceC4507m, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: weight");
            return null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return interfaceC7812c0.mo30255a(interfaceC4507m, f10, z10);
    }

    /* JADX INFO: renamed from: a */
    InterfaceC4507m mo30255a(InterfaceC4507m interfaceC4507m, float f10, boolean z10);

    /* JADX INFO: renamed from: b */
    InterfaceC4507m mo30256b(InterfaceC4507m interfaceC4507m, InterfaceC4499e.b bVar);
}
