package p303v;

import p165l1.InterfaceC4507m;
import p215oc.C5725t;

/* JADX INFO: renamed from: v.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8691e {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC4507m m33383c(InterfaceC8691e interfaceC8691e, InterfaceC4507m interfaceC4507m, float f10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
            return null;
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return interfaceC8691e.mo33386b(interfaceC4507m, f10);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ InterfaceC4507m m33384d(InterfaceC8691e interfaceC8691e, InterfaceC4507m interfaceC4507m, float f10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
            return null;
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return interfaceC8691e.mo33385a(interfaceC4507m, f10);
    }

    /* JADX INFO: renamed from: a */
    InterfaceC4507m mo33385a(InterfaceC4507m interfaceC4507m, float f10);

    /* JADX INFO: renamed from: b */
    InterfaceC4507m mo33386b(InterfaceC4507m interfaceC4507m, float f10);
}
