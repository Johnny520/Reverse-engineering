package nc;

import p145jc.C3801d0;

/* JADX INFO: renamed from: nc.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5568g {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f17432a = new C3801d0("NO_OWNER");

    /* JADX INFO: renamed from: b */
    public static final C3801d0 f17433b = new C3801d0("ALREADY_LOCKED_BY_OWNER");

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5562a m22626a(boolean z10) {
        return new C5567f(z10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC5562a m22627b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m22626a(z10);
    }
}
