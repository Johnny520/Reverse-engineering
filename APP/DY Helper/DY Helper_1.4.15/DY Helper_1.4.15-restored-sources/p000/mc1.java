package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum mc1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.mc1 f7068 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.mc1 f7069 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.mc1 f7070 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.mc1 f7071 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.mc1 f7072 = null;

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ p000.mc1[] f7073 = null;

    static {
            mc1 r0 = new mc1
            java.lang.String r1 = "LOCKED"
            r2 = 0
            r0.<init>(r1, r2)
            p000.mc1.f7068 = r0
            mc1 r1 = new mc1
            java.lang.String r2 = "IDLE"
            r3 = 1
            r1.<init>(r2, r3)
            p000.mc1.f7069 = r1
            mc1 r2 = new mc1
            java.lang.String r3 = "GROWING"
            r4 = 2
            r2.<init>(r3, r4)
            p000.mc1.f7070 = r2
            mc1 r3 = new mc1
            java.lang.String r4 = "MATURE"
            r5 = 3
            r3.<init>(r4, r5)
            p000.mc1.f7071 = r3
            mc1 r4 = new mc1
            java.lang.String r5 = "UNKNOWN"
            r6 = 4
            r4.<init>(r5, r6)
            p000.mc1.f7072 = r4
            mc1[] r0 = new p000.mc1[]{r0, r1, r2, r3, r4}
            p000.mc1.f7073 = r0
            return
    }

    public static p000.mc1 valueOf(java.lang.String r1) {
            java.lang.Class<mc1> r0 = p000.mc1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            mc1 r1 = (p000.mc1) r1
            return r1
    }

    public static p000.mc1[] values() {
            mc1[] r0 = p000.mc1.f7073
            java.lang.Object r0 = r0.clone()
            mc1[] r0 = (p000.mc1[]) r0
            return r0
    }
}
