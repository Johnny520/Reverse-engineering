package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum q42 extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.zz1 f8860 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.q42 f8861 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.q42 f8862 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.q42 f8863 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.q42 f8864 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.q42 f8865 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ p000.q42[] f8866 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f8867;

    static {
            q42 r0 = new q42
            r1 = 0
            java.lang.String r2 = "TLSv1.3"
            java.lang.String r3 = "TLS_1_3"
            r0.<init>(r1, r3, r2)
            p000.q42.f8861 = r0
            q42 r1 = new q42
            r2 = 1
            java.lang.String r3 = "TLSv1.2"
            java.lang.String r4 = "TLS_1_2"
            r1.<init>(r2, r4, r3)
            p000.q42.f8862 = r1
            q42 r2 = new q42
            r3 = 2
            java.lang.String r4 = "TLSv1.1"
            java.lang.String r5 = "TLS_1_1"
            r2.<init>(r3, r5, r4)
            p000.q42.f8863 = r2
            q42 r3 = new q42
            r4 = 3
            java.lang.String r5 = "TLSv1"
            java.lang.String r6 = "TLS_1_0"
            r3.<init>(r4, r6, r5)
            p000.q42.f8864 = r3
            q42 r4 = new q42
            r5 = 4
            java.lang.String r6 = "SSLv3"
            java.lang.String r7 = "SSL_3_0"
            r4.<init>(r5, r7, r6)
            p000.q42.f8865 = r4
            q42[] r0 = new p000.q42[]{r0, r1, r2, r3, r4}
            p000.q42.f8866 = r0
            zz1 r0 = new zz1
            r1 = 5
            r2 = 0
            r0.<init>(r1, r2)
            p000.q42.f8860 = r0
            return
    }

    q42(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r2, r1)
            r0.f8867 = r3
            return
    }

    public static p000.q42 valueOf(java.lang.String r1) {
            java.lang.Class<q42> r0 = p000.q42.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            q42 r1 = (p000.q42) r1
            return r1
    }

    public static p000.q42[] values() {
            q42[] r0 = p000.q42.f8866
            java.lang.Object r0 = r0.clone()
            q42[] r0 = (p000.q42[]) r0
            return r0
    }
}
