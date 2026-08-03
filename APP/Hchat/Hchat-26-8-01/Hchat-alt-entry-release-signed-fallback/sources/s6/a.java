package s6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends java.lang.Enum {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l3.w f12364h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ s6.a[] f12365i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ zf.b f12366j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12367g;

    static {
            s6.a r0 = new s6.a
            java.lang.String r1 = "PUBLIC"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            s6.a r1 = new s6.a
            java.lang.String r2 = "PRIVATE"
            r4 = 2
            r1.<init>(r2, r3, r4)
            s6.a r2 = new s6.a
            java.lang.String r3 = "PROTECTED"
            r5 = 4
            r2.<init>(r3, r4, r5)
            s6.a r3 = new s6.a
            java.lang.String r4 = "STATIC"
            r6 = 3
            r7 = 8
            r3.<init>(r4, r6, r7)
            s6.a r4 = new s6.a
            java.lang.String r6 = "FINAL"
            r8 = 16
            r4.<init>(r6, r5, r8)
            s6.a r5 = new s6.a
            r6 = 5
            r8 = 32
            java.lang.String r9 = "SYNCHRONIZED"
            r5.<init>(r9, r6, r8)
            s6.a r6 = new s6.a
            r8 = 6
            r9 = 64
            java.lang.String r10 = "VOLATILE"
            r6.<init>(r10, r8, r9)
            r8 = r7
            s6.a r7 = new s6.a
            r9 = 7
            r10 = 128(0x80, float:1.8E-43)
            java.lang.String r11 = "TRANSIENT"
            r7.<init>(r11, r9, r10)
            r9 = r8
            s6.a r8 = new s6.a
            java.lang.String r10 = "NATIVE"
            r11 = 256(0x100, float:3.59E-43)
            r8.<init>(r10, r9, r11)
            s6.a r9 = new s6.a
            r10 = 9
            r11 = 512(0x200, float:7.17E-43)
            java.lang.String r12 = "INTERFACE"
            r9.<init>(r12, r10, r11)
            s6.a r10 = new s6.a
            r11 = 10
            r12 = 1024(0x400, float:1.435E-42)
            java.lang.String r13 = "ABSTRACT"
            r10.<init>(r13, r11, r12)
            s6.a r11 = new s6.a
            r12 = 11
            r13 = 2048(0x800, float:2.87E-42)
            java.lang.String r14 = "STRICT"
            r11.<init>(r14, r12, r13)
            s6.a[] r0 = new s6.a[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            s6.a.f12365i = r0
            zf.b r1 = new zf.b
            r1.<init>(r0)
            s6.a.f12366j = r1
            l3.w r0 = new l3.w
            r1 = 22
            r0.<init>(r1)
            s6.a.f12364h = r0
            return
    }

    a(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f12367g = r3
            return
    }

    public static s6.a valueOf(java.lang.String r1) {
            java.lang.Class<s6.a> r0 = s6.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            s6.a r1 = (s6.a) r1
            return r1
    }

    public static s6.a[] values() {
            s6.a[] r0 = s6.a.f12365i
            java.lang.Object r0 = r0.clone()
            s6.a[] r0 = (s6.a[]) r0
            return r0
    }
}
