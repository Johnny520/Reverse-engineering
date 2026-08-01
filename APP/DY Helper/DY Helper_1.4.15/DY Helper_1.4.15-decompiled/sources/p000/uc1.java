package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum uc1 extends java.lang.Enum {

    /* JADX INFO: renamed from: η */
    public static final p000.uc1 f10692 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.uc1 f10693 = null;

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ p000.uc1[] f10694 = null;

    /* JADX INFO: renamed from: ε */
    public final int f10695;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f10696;

    static {
            uc1 r0 = new uc1
            java.lang.String r1 = "conversation_id"
            r2 = 0
            r3 = 1
            java.lang.String r4 = "CONVERSATION_ID"
            r0.<init>(r2, r3, r4, r1)
            p000.uc1.f10692 = r0
            uc1 r1 = new uc1
            r2 = 2
            java.lang.String r4 = "sec_pet_id"
            java.lang.String r5 = "SEC_PET_ID"
            r1.<init>(r3, r2, r5, r4)
            p000.uc1.f10693 = r1
            uc1[] r0 = new p000.uc1[]{r0, r1}
            p000.uc1.f10694 = r0
            return
    }

    uc1(int r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r3, r1)
            r0.f10695 = r2
            r0.f10696 = r4
            return
    }

    public static p000.uc1 valueOf(java.lang.String r1) {
            java.lang.Class<uc1> r0 = p000.uc1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            uc1 r1 = (p000.uc1) r1
            return r1
    }

    public static p000.uc1[] values() {
            uc1[] r0 = p000.uc1.f10694
            java.lang.Object r0 = r0.clone()
            uc1[] r0 = (p000.uc1[]) r0
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m5842(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r1.f10695
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
