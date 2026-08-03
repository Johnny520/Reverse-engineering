package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5848 extends C5850 {
    @Override // Yue.C5850
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public boolean mo18077() {
        return false;
    }

    @Override // Yue.C5850
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public C5850 mo18078() {
        return null;
    }

    @Override // Yue.C5850
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ boolean mo18079() {
        return ((Boolean) m18082()).booleanValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public final /* synthetic */ <T extends C5850> void m18080(InterfaceC5124<? super T, C8107> interfaceC5124) {
        for (C5850 c5850M18105 = (C5850) m18104(); !C5499.m17094(c5850M18105, this); c5850M18105 = c5850M18105.m18105()) {
            C5499.m17112(3, C4750.f10502);
            if (c5850M18105 instanceof C5850) {
                interfaceC5124.invoke(c5850M18105);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final boolean m18081() {
        return m18104() == this;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public final Void m18082() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public final void m18083() {
        C5850 c5850 = (C5850) m18104();
        C5850 c58502 = this;
        while (!C5499.m17094(c5850, this)) {
            C5850 c5850M18105 = c5850.m18105();
            c5850.m18115(c58502, c5850M18105);
            c58502 = c5850;
            c5850 = c5850M18105;
        }
        m18115(c58502, (C5850) m18104());
    }
}
