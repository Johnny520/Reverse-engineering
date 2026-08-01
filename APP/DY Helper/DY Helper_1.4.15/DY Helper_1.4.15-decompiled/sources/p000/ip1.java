package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum ip1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.ip1 f5162 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.ip1 f5163 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.ip1 f5164 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.ip1[] f5165 = null;

    static {
            ip1 r0 = new ip1
            java.lang.String r1 = "FOLLOW_GLOBAL"
            r2 = 0
            r0.<init>(r1, r2)
            p000.ip1.f5162 = r0
            ip1 r1 = new ip1
            java.lang.String r2 = "ENABLED"
            r3 = 1
            r1.<init>(r2, r3)
            p000.ip1.f5163 = r1
            ip1 r2 = new ip1
            java.lang.String r3 = "DISABLED"
            r4 = 2
            r2.<init>(r3, r4)
            p000.ip1.f5164 = r2
            ip1[] r0 = new p000.ip1[]{r0, r1, r2}
            p000.ip1.f5165 = r0
            return
    }

    public static p000.ip1 valueOf(java.lang.String r1) {
            java.lang.Class<ip1> r0 = p000.ip1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ip1 r1 = (p000.ip1) r1
            return r1
    }

    public static p000.ip1[] values() {
            ip1[] r0 = p000.ip1.f5165
            java.lang.Object r0 = r0.clone()
            ip1[] r0 = (p000.ip1[]) r0
            return r0
    }
}
