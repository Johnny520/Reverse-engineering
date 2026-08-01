package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum r00 extends java.lang.Enum {

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ p000.r00[] f9188 = null;

    /* JADX INFO: renamed from: ι */
    public static final /* synthetic */ p000.C0779rz f9189 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.EnumC0491kx f9190;

    /* JADX INFO: renamed from: ζ */
    public final java.util.Set f9191;

    /* JADX INFO: renamed from: η */
    public final java.util.Set f9192;

    static {
            r00 r0 = new r00
            java.lang.String r1 = "isTextMode"
            java.lang.String r2 = "textMode"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.Set r4 = p000.AbstractC0312g7.m2263(r1)
            java.lang.String r1 = "is_text_mode"
            java.lang.String r2 = "text_mode"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.Set r5 = p000.AbstractC0312g7.m2263(r1)
            java.lang.String r1 = "TEXT_MODE"
            r2 = 0
            kx r3 = p000.EnumC0491kx.f6205
            r0.<init>(r1, r2, r3, r4, r5)
            r00 r1 = new r00
            java.lang.String r2 = "isNewTextMode"
            java.lang.String r3 = "newTextMode"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.Set r5 = p000.AbstractC0312g7.m2263(r2)
            java.lang.String r2 = "is_new_text_mode"
            java.lang.String r3 = "new_text_mode"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.Set r6 = p000.AbstractC0312g7.m2263(r2)
            java.lang.String r2 = "NEW_TEXT_MODE"
            r3 = 1
            kx r4 = p000.EnumC0491kx.f6206
            r1.<init>(r2, r3, r4, r5, r6)
            r00[] r0 = new p000.r00[]{r0, r1}
            p000.r00.f9188 = r0
            rz r1 = new rz
            r1.<init>(r0)
            p000.r00.f9189 = r1
            return
    }

    r00(java.lang.String r1, int r2, p000.EnumC0491kx r3, java.util.Set r4, java.util.Set r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f9190 = r3
            r0.f9191 = r4
            r0.f9192 = r5
            return
    }

    public static p000.r00 valueOf(java.lang.String r1) {
            java.lang.Class<r00> r0 = p000.r00.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            r00 r1 = (p000.r00) r1
            return r1
    }

    public static p000.r00[] values() {
            r00[] r0 = p000.r00.f9188
            java.lang.Object r0 = r0.clone()
            r00[] r0 = (p000.r00[]) r0
            return r0
    }
}
