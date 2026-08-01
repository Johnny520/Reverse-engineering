package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum ca1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.ca1 f2037 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.ca1 f2038 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.ca1 f2039 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.ca1 f2040 = null;

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ p000.ca1[] f2041 = null;

    static {
            ca1 r0 = new ca1
            java.lang.String r1 = "Invalid"
            r2 = 0
            r0.<init>(r1, r2)
            ca1 r1 = new ca1
            java.lang.String r2 = "Cancelled"
            r3 = 1
            r1.<init>(r2, r3)
            p000.ca1.f2037 = r1
            ca1 r2 = new ca1
            java.lang.String r3 = "InitialPending"
            r4 = 2
            r2.<init>(r3, r4)
            ca1 r3 = new ca1
            java.lang.String r4 = "RecomposePending"
            r5 = 3
            r3.<init>(r4, r5)
            p000.ca1.f2038 = r3
            ca1 r4 = new ca1
            java.lang.String r5 = "Recomposing"
            r6 = 4
            r4.<init>(r5, r6)
            p000.ca1.f2039 = r4
            ca1 r5 = new ca1
            java.lang.String r6 = "ApplyPending"
            r7 = 5
            r5.<init>(r6, r7)
            p000.ca1.f2040 = r5
            ca1 r6 = new ca1
            java.lang.String r7 = "Applied"
            r8 = 6
            r6.<init>(r7, r8)
            ca1[] r0 = new p000.ca1[]{r0, r1, r2, r3, r4, r5, r6}
            p000.ca1.f2041 = r0
            return
    }

    public static p000.ca1 valueOf(java.lang.String r1) {
            java.lang.Class<ca1> r0 = p000.ca1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ca1 r1 = (p000.ca1) r1
            return r1
    }

    public static p000.ca1[] values() {
            ca1[] r0 = p000.ca1.f2041
            java.lang.Object r0 = r0.clone()
            ca1[] r0 = (p000.ca1[]) r0
            return r0
    }
}
