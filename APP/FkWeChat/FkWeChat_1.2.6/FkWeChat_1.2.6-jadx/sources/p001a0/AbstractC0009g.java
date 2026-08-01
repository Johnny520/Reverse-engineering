package p001a0;

import p121i3.C3179i;

/* JADX INFO: renamed from: a0.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009g {

    /* JADX INFO: renamed from: a */
    public static final C0008f f8a = m15a(50);

    /* JADX INFO: renamed from: a */
    public static final C0008f m15a(int i10) {
        return m16b(AbstractC0005c.m12a(i10));
    }

    /* JADX INFO: renamed from: b */
    public static final C0008f m16b(InterfaceC0004b interfaceC0004b) {
        return new C0008f(interfaceC0004b, interfaceC0004b, interfaceC0004b, interfaceC0004b);
    }

    /* JADX INFO: renamed from: c */
    public static final C0008f m17c(float f10) {
        return m16b(AbstractC0005c.m13b(f10));
    }

    /* JADX INFO: renamed from: d */
    public static final C0008f m18d(float f10, float f11, float f12, float f13) {
        return new C0008f(AbstractC0005c.m13b(f10), AbstractC0005c.m13b(f11), AbstractC0005c.m13b(f12), AbstractC0005c.m13b(f13));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C0008f m19e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = C3179i.m12003k(0);
        }
        if ((i10 & 2) != 0) {
            f11 = C3179i.m12003k(0);
        }
        if ((i10 & 4) != 0) {
            f12 = C3179i.m12003k(0);
        }
        if ((i10 & 8) != 0) {
            f13 = C3179i.m12003k(0);
        }
        return m18d(f10, f11, f12, f13);
    }

    /* JADX INFO: renamed from: f */
    public static final C0008f m20f() {
        return f8a;
    }
}
