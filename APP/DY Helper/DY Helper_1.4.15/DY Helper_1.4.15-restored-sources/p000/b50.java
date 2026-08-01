package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum b50 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.b50 f1476 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.b50 f1477 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.b50 f1478 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.b50[] f1479 = null;

    static {
            b50 r0 = new b50
            java.lang.String r1 = "Active"
            r2 = 0
            r0.<init>(r1, r2)
            p000.b50.f1476 = r0
            b50 r1 = new b50
            java.lang.String r2 = "ActiveParent"
            r3 = 1
            r1.<init>(r2, r3)
            p000.b50.f1477 = r1
            b50 r2 = new b50
            java.lang.String r3 = "Captured"
            r4 = 2
            r2.<init>(r3, r4)
            b50 r3 = new b50
            java.lang.String r4 = "Inactive"
            r5 = 3
            r3.<init>(r4, r5)
            p000.b50.f1478 = r3
            b50[] r0 = new p000.b50[]{r0, r1, r2, r3}
            p000.b50.f1479 = r0
            return
    }

    public static p000.b50 valueOf(java.lang.String r1) {
            java.lang.Class<b50> r0 = p000.b50.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            b50 r1 = (p000.b50) r1
            return r1
    }

    public static p000.b50[] values() {
            b50[] r0 = p000.b50.f1479
            java.lang.Object r0 = r0.clone()
            b50[] r0 = (p000.b50[]) r0
            return r0
    }
}
