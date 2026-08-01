package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum fl1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.fl1 f4005 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.fl1 f4006 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.fl1 f4007 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.fl1 f4008 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.fl1 f4009 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.fl1 f4010 = null;

    /* JADX INFO: renamed from: λ */
    public static final /* synthetic */ p000.fl1[] f4011 = null;

    static {
            fl1 r0 = new fl1
            java.lang.String r1 = "ShutDown"
            r2 = 0
            r0.<init>(r1, r2)
            p000.fl1.f4005 = r0
            fl1 r1 = new fl1
            java.lang.String r2 = "ShuttingDown"
            r3 = 1
            r1.<init>(r2, r3)
            p000.fl1.f4006 = r1
            fl1 r2 = new fl1
            java.lang.String r3 = "Inactive"
            r4 = 2
            r2.<init>(r3, r4)
            p000.fl1.f4007 = r2
            fl1 r3 = new fl1
            java.lang.String r4 = "InactivePendingWork"
            r5 = 3
            r3.<init>(r4, r5)
            p000.fl1.f4008 = r3
            fl1 r4 = new fl1
            java.lang.String r5 = "Idle"
            r6 = 4
            r4.<init>(r5, r6)
            p000.fl1.f4009 = r4
            fl1 r5 = new fl1
            java.lang.String r6 = "PendingWork"
            r7 = 5
            r5.<init>(r6, r7)
            p000.fl1.f4010 = r5
            fl1[] r0 = new p000.fl1[]{r0, r1, r2, r3, r4, r5}
            p000.fl1.f4011 = r0
            return
    }

    public static p000.fl1 valueOf(java.lang.String r1) {
            java.lang.Class<fl1> r0 = p000.fl1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            fl1 r1 = (p000.fl1) r1
            return r1
    }

    public static p000.fl1[] values() {
            fl1[] r0 = p000.fl1.f4011
            java.lang.Object r0 = r0.clone()
            fl1[] r0 = (p000.fl1[]) r0
            return r0
    }
}
