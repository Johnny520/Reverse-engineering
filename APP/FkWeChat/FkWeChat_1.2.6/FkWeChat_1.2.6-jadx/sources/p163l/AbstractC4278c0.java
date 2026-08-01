package p163l;

import p024b9.C1047m;

/* JADX INFO: renamed from: l.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4278c0 {
    /* JADX INFO: renamed from: a */
    public static final float m16825a(InterfaceC4266a0 interfaceC4266a0, float f10, float f11) {
        return ((C4337o) interfaceC4266a0.mo16764a(AbstractC4336n3.m17025t(C1047m.f3206a)).mo17105d(AbstractC4362t.m17115a(f10), AbstractC4362t.m17115a(f11))).m17037f();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4266a0 m16826b(float f10, float f11) {
        return m16828d(new C4318k0(f10, f11));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC4266a0 m16827c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.1f;
        }
        return m16826b(f10, f11);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4266a0 m16828d(InterfaceC4313j0 interfaceC4313j0) {
        return new C4272b0(interfaceC4313j0);
    }
}
