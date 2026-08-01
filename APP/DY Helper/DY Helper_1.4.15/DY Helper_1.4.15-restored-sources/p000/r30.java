package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum r30 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.r30 f9249 = null;

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ p000.r30[] f9250 = null;

    static {
            r30 r0 = new r30
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            r30 r1 = new r30
            java.lang.String r2 = "BOTTOM_UP"
            r3 = 1
            r1.<init>(r2, r3)
            p000.r30.f9249 = r1
            r30[] r0 = new p000.r30[]{r0, r1}
            p000.r30.f9250 = r0
            return
    }

    public static p000.r30 valueOf(java.lang.String r1) {
            java.lang.Class<r30> r0 = p000.r30.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            r30 r1 = (p000.r30) r1
            return r1
    }

    public static p000.r30[] values() {
            r30[] r0 = p000.r30.f9250
            java.lang.Object r0 = r0.clone()
            r30[] r0 = (p000.r30[]) r0
            return r0
    }
}
