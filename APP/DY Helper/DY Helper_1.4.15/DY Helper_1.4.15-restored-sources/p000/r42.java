package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum r42 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.r42 f9260 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.r42 f9261 = null;

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ p000.r42[] f9262 = null;

    static {
            r42 r0 = new r42
            java.lang.String r1 = "On"
            r2 = 0
            r0.<init>(r1, r2)
            p000.r42.f9260 = r0
            r42 r1 = new r42
            java.lang.String r2 = "Off"
            r3 = 1
            r1.<init>(r2, r3)
            p000.r42.f9261 = r1
            r42 r2 = new r42
            java.lang.String r3 = "Indeterminate"
            r4 = 2
            r2.<init>(r3, r4)
            r42[] r0 = new p000.r42[]{r0, r1, r2}
            p000.r42.f9262 = r0
            return
    }

    public static p000.r42 valueOf(java.lang.String r1) {
            java.lang.Class<r42> r0 = p000.r42.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            r42 r1 = (p000.r42) r1
            return r1
    }

    public static p000.r42[] values() {
            r42[] r0 = p000.r42.f9262
            java.lang.Object r0 = r0.clone()
            r42[] r0 = (p000.r42[]) r0
            return r0
    }
}
