package androidx.compose.runtime;

import p010a9.InterfaceC0188p;
import p057e1.AbstractC1984l;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0530l {

    /* JADX INFO: renamed from: a */
    public static final C0530l f1456a = new C0530l();

    /* JADX INFO: renamed from: b */
    public static InterfaceC0188p f1457b = AbstractC1984l.m7162b(954879418, false, new InterfaceC0188p() { // from class: androidx.compose.runtime.j
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C0530l.m1836b((InterfaceC0572r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: c */
    public static InterfaceC0188p f1458c = AbstractC1984l.m7162b(1918065384, false, new InterfaceC0188p() { // from class: androidx.compose.runtime.k
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C0530l.m1835a((InterfaceC0572r) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: a */
    public static C4700i0 m1835a(InterfaceC0572r interfaceC0572r, int i10) {
        if (interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:857)");
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m1836b(InterfaceC0572r interfaceC0572r, int i10) {
        if (interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$954879418.<anonymous> (Composition.kt:620)");
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572r.mo2190z();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0188p m1837c() {
        return f1458c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0188p m1838d() {
        return f1457b;
    }
}
