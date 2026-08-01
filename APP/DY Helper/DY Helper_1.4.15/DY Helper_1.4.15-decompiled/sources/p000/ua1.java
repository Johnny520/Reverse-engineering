package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum ua1 extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.ua1 f10664 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.ua1 f10665 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.ua1 f10666 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.ua1 f10667 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.ua1 f10668 = null;

    /* JADX INFO: renamed from: λ */
    public static final /* synthetic */ p000.ua1[] f10669 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f10670;

    static {
            ua1 r0 = new ua1
            r1 = 0
            java.lang.String r2 = "invalid_food_id"
            java.lang.String r3 = "INVALID_FOOD_ID"
            r0.<init>(r1, r3, r2)
            p000.ua1.f10664 = r0
            ua1 r1 = new ua1
            r2 = 1
            java.lang.String r3 = "food_not_in_catalog"
            java.lang.String r4 = "FOOD_NOT_IN_CATALOG"
            r1.<init>(r2, r4, r3)
            p000.ua1.f10665 = r1
            ua1 r2 = new ua1
            r3 = 2
            java.lang.String r4 = "price_missing"
            java.lang.String r5 = "PRICE_MISSING"
            r2.<init>(r3, r5, r4)
            p000.ua1.f10666 = r2
            ua1 r3 = new ua1
            r4 = 3
            java.lang.String r5 = "price_above_limit"
            java.lang.String r6 = "PRICE_ABOVE_LIMIT"
            r3.<init>(r4, r6, r5)
            p000.ua1.f10667 = r3
            ua1 r4 = new ua1
            r5 = 4
            java.lang.String r6 = "closeness_missing"
            java.lang.String r7 = "CLOSENESS_MISSING"
            r4.<init>(r5, r7, r6)
            p000.ua1.f10668 = r4
            ua1[] r0 = new p000.ua1[]{r0, r1, r2, r3, r4}
            p000.ua1.f10669 = r0
            return
    }

    ua1(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f10670 = r3
            return
    }

    public static p000.ua1 valueOf(java.lang.String r1) {
            java.lang.Class<ua1> r0 = p000.ua1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ua1 r1 = (p000.ua1) r1
            return r1
    }

    public static p000.ua1[] values() {
            ua1[] r0 = p000.ua1.f10669
            java.lang.Object r0 = r0.clone()
            ua1[] r0 = (p000.ua1[]) r0
            return r0
    }
}
