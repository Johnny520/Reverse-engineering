package ec;

import p145jc.AbstractC3816l;

/* JADX INFO: renamed from: ec.g2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2135g2 extends AbstractC2149k0 {
    /* JADX INFO: renamed from: E0 */
    public final String m7752E0() {
        AbstractC2135g2 abstractC2135g2Mo7754q0;
        AbstractC2135g2 abstractC2135g2M7728c = C2122d1.m7728c();
        if (this == abstractC2135g2M7728c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC2135g2Mo7754q0 = abstractC2135g2M7728c.mo7754q0();
        } catch (UnsupportedOperationException unused) {
            abstractC2135g2Mo7754q0 = null;
        }
        if (this == abstractC2135g2Mo7754q0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: b0 */
    public AbstractC2149k0 mo7753b0(int i10, String str) {
        AbstractC3816l.m15199a(i10);
        return AbstractC3816l.m15200b(this, str);
    }

    /* JADX INFO: renamed from: q0 */
    public abstract AbstractC2135g2 mo7754q0();
}
