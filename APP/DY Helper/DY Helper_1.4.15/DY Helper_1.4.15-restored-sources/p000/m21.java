package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum m21 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.m21 f6909 = null;

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ p000.m21[] f6910 = null;

    static {
            m21 r0 = new m21
            java.lang.String r1 = "Default"
            r2 = 0
            r0.<init>(r1, r2)
            p000.m21.f6909 = r0
            m21 r1 = new m21
            java.lang.String r2 = "UserInput"
            r3 = 1
            r1.<init>(r2, r3)
            m21 r2 = new m21
            java.lang.String r3 = "PreventUserInput"
            r4 = 2
            r2.<init>(r3, r4)
            m21[] r0 = new p000.m21[]{r0, r1, r2}
            p000.m21.f6910 = r0
            return
    }

    public static p000.m21 valueOf(java.lang.String r1) {
            java.lang.Class<m21> r0 = p000.m21.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            m21 r1 = (p000.m21) r1
            return r1
    }

    public static p000.m21[] values() {
            m21[] r0 = p000.m21.f6910
            java.lang.Object r0 = r0.clone()
            m21[] r0 = (p000.m21[]) r0
            return r0
    }
}
