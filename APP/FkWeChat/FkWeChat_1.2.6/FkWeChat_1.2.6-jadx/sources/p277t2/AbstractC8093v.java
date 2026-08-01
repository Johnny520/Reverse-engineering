package p277t2;

import java.util.concurrent.atomic.AtomicInteger;
import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: t2.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8093v {

    /* JADX INFO: renamed from: a */
    public static AtomicInteger f27031a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m31264a(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l) {
        return interfaceC4507m.mo17445i(new C8063c(interfaceC0184l));
    }

    /* JADX INFO: renamed from: b */
    public static final int m31265b() {
        return f27031a.addAndGet(1);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4507m m31266c(InterfaceC4507m interfaceC4507m, boolean z10, InterfaceC0184l interfaceC0184l) {
        return interfaceC4507m.mo17445i(new C8061b(z10, interfaceC0184l));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC4507m m31267d(InterfaceC4507m interfaceC4507m, boolean z10, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m31266c(interfaceC4507m, z10, interfaceC0184l);
    }
}
