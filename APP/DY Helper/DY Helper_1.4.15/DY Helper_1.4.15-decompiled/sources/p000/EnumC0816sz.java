package p000;

/* JADX INFO: renamed from: sz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0816sz extends java.lang.Enum {

    /* JADX INFO: renamed from: ζ */
    public static final p000.C0381i2 f10086 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.EnumC0816sz f10087 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.EnumC0816sz f10088 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.EnumC0816sz f10089 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.EnumC0816sz f10090 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.EnumC0816sz f10091 = null;

    /* JADX INFO: renamed from: μ */
    public static final p000.EnumC0816sz f10092 = null;

    /* JADX INFO: renamed from: ν */
    public static final /* synthetic */ p000.EnumC0816sz[] f10093 = null;

    /* JADX INFO: renamed from: ε */
    public final int f10094;

    static {
            sz r0 = new sz
            java.lang.String r1 = "NO_ERROR"
            r2 = 0
            r0.<init>(r2, r2, r1)
            p000.EnumC0816sz.f10087 = r0
            sz r1 = new sz
            java.lang.String r2 = "PROTOCOL_ERROR"
            r3 = 1
            r1.<init>(r3, r3, r2)
            p000.EnumC0816sz.f10088 = r1
            sz r2 = new sz
            java.lang.String r3 = "INTERNAL_ERROR"
            r4 = 2
            r2.<init>(r4, r4, r3)
            p000.EnumC0816sz.f10089 = r2
            sz r3 = new sz
            java.lang.String r4 = "FLOW_CONTROL_ERROR"
            r5 = 3
            r3.<init>(r5, r5, r4)
            p000.EnumC0816sz.f10090 = r3
            sz r4 = new sz
            java.lang.String r5 = "SETTINGS_TIMEOUT"
            r6 = 4
            r4.<init>(r6, r6, r5)
            sz r5 = new sz
            java.lang.String r6 = "STREAM_CLOSED"
            r7 = 5
            r5.<init>(r7, r7, r6)
            sz r6 = new sz
            java.lang.String r7 = "FRAME_SIZE_ERROR"
            r8 = 6
            r6.<init>(r8, r8, r7)
            sz r7 = new sz
            java.lang.String r8 = "REFUSED_STREAM"
            r9 = 7
            r7.<init>(r9, r9, r8)
            p000.EnumC0816sz.f10091 = r7
            sz r8 = new sz
            java.lang.String r9 = "CANCEL"
            r10 = 8
            r8.<init>(r10, r10, r9)
            p000.EnumC0816sz.f10092 = r8
            sz r9 = new sz
            java.lang.String r10 = "COMPRESSION_ERROR"
            r11 = 9
            r9.<init>(r11, r11, r10)
            sz r10 = new sz
            java.lang.String r11 = "CONNECT_ERROR"
            r12 = 10
            r10.<init>(r12, r12, r11)
            sz r11 = new sz
            java.lang.String r12 = "ENHANCE_YOUR_CALM"
            r13 = 11
            r11.<init>(r13, r13, r12)
            sz r12 = new sz
            java.lang.String r13 = "INADEQUATE_SECURITY"
            r14 = 12
            r12.<init>(r14, r14, r13)
            sz r13 = new sz
            java.lang.String r14 = "HTTP_1_1_REQUIRED"
            r15 = 13
            r13.<init>(r15, r15, r14)
            sz[] r0 = new p000.EnumC0816sz[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            p000.EnumC0816sz.f10093 = r0
            i2 r0 = new i2
            r1 = 23
            r0.<init>(r1)
            p000.EnumC0816sz.f10086 = r0
            return
    }

    EnumC0816sz(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r3, r1)
            r0.f10094 = r2
            return
    }

    public static p000.EnumC0816sz valueOf(java.lang.String r1) {
            java.lang.Class<sz> r0 = p000.EnumC0816sz.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sz r1 = (p000.EnumC0816sz) r1
            return r1
    }

    public static p000.EnumC0816sz[] values() {
            sz[] r0 = p000.EnumC0816sz.f10093
            java.lang.Object r0 = r0.clone()
            sz[] r0 = (p000.EnumC0816sz[]) r0
            return r0
    }
}
