package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum kg1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.kg1 f5912 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.kg1 f5913 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.kg1 f5914 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.kg1 f5915 = null;

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ p000.kg1[] f5916 = null;

    static {
            kg1 r0 = new kg1
            java.lang.String r1 = "CLAIM_ONLY"
            r2 = 0
            r0.<init>(r1, r2)
            p000.kg1.f5912 = r0
            kg1 r1 = new kg1
            java.lang.String r2 = "MUTUAL_MESSAGE"
            r3 = 1
            r1.<init>(r2, r3)
            p000.kg1.f5913 = r1
            kg1 r2 = new kg1
            java.lang.String r3 = "DAILY"
            r4 = 2
            r2.<init>(r3, r4)
            p000.kg1.f5914 = r2
            kg1 r3 = new kg1
            java.lang.String r4 = "PERSON"
            r5 = 3
            r3.<init>(r4, r5)
            p000.kg1.f5915 = r3
            kg1[] r0 = new p000.kg1[]{r0, r1, r2, r3}
            p000.kg1.f5916 = r0
            return
    }

    public static p000.kg1 valueOf(java.lang.String r1) {
            java.lang.Class<kg1> r0 = p000.kg1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kg1 r1 = (p000.kg1) r1
            return r1
    }

    public static p000.kg1[] values() {
            kg1[] r0 = p000.kg1.f5916
            java.lang.Object r0 = r0.clone()
            kg1[] r0 = (p000.kg1[]) r0
            return r0
    }
}
