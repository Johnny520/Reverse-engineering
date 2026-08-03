package tb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final int $stable = 0;
    public static final tb.b Companion = null;
    private static final int DEFAULT_CHANNELS = 1;
    public static final int DEFAULT_HZ = 24000;
    private static final int DEFAULT_SAMPLE_RATE = 44100;
    private static final java.util.Set<java.lang.Integer> SUPPORTED_SILK_HZ = null;
    private final fg.l logger;
    private final sf.c silkCodec$delegate;

    static {
            tb.b r0 = new tb.b
            r0.<init>()
            tb.c.Companion = r0
            r0 = 8000(0x1f40, float:1.121E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 12000(0x2ee0, float:1.6816E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 16000(0x3e80, float:2.2421E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 24000(0x5dc0, float:3.3631E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1, r2, r3}
            java.util.Set r0 = tf.d0.W(r0)
            tb.c.SUPPORTED_SILK_HZ = r0
            return
    }

    public c(b0.d0 r2) {
            r1 = this;
            r1.<init>()
            r1.logger = r2
            k.s1 r2 = new k.s1
            r0 = 12
            r2.<init>(r0)
            sf.d r0 = sf.d.f12415g
            sf.c r2 = be.h.G(r0, r2)
            r1.silkCodec$delegate = r2
            return
    }

    public static java.lang.String c(java.lang.String r1) {
            if (r1 == 0) goto L18
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L18
            int r0 = r1.length()
            if (r0 <= 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L18
            return r1
        L18:
            r1 = 0
            return r1
    }

    public static int d(int r2) {
            java.util.Set<java.lang.Integer> r0 = tb.c.SUPPORTED_SILK_HZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Ld
            return r2
        Ld:
            r2 = 24000(0x5dc0, float:3.3631E-41)
            return r2
    }

    public final me.yun.silk.SilkCodec a() {
            r1 = this;
            sf.c r0 = r1.silkCodec$delegate
            java.lang.Object r0 = r0.getValue()
            me.yun.silk.SilkCodec r0 = (me.yun.silk.SilkCodec) r0
            return r0
    }

    public final int aacToPcm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L3f
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L3c
            int r2 = me.yun.silk.AacCodec.aacToPcm(r2, r3)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L1c:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L2b
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "aacToPcm 失败: "
            p.a.w(r0, r3, r1)
        L2b:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L30
            r2 = 0
        L30:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L39
            int r2 = r2.intValue()
            goto L3b
        L39:
            r2 = -803(0xfffffffffffffcdd, float:NaN)
        L3b:
            return r2
        L3c:
            r2 = -12
            return r2
        L3f:
            r2 = -801(0xfffffffffffffcdf, float:NaN)
            return r2
    }

    public final int aacToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.aacToSilk(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "aacToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -1031(0xfffffffffffffbf9, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -801(0xfffffffffffffcdf, float:NaN)
            return r2
    }

    public final int autoAacToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.autoAacToSilk(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "autoAacToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -1031(0xfffffffffffffbf9, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -1
            return r2
    }

    public final int autoToAac(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L46
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L43
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = r1.b(r4, r2)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.autoToAac(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "autoToAac 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L42
        L41:
            r2 = -2
        L42:
            return r2
        L43:
            r2 = -901(0xfffffffffffffc7b, float:NaN)
            return r2
        L46:
            r2 = -1
            return r2
    }

    public final int autoToM4a(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L46
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L43
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = r1.b(r4, r2)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.autoToM4a(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "autoToM4a 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L42
        L41:
            r2 = -2
        L42:
            return r2
        L43:
            r2 = -911(0xfffffffffffffc71, float:NaN)
            return r2
        L46:
            r2 = -1
            return r2
    }

    public final int autoToPcm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L42
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L3f
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L19
            int r2 = me.yun.silk.AacCodec.autoToPcmCompat(r2, r3, r0)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L20:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "autoToPcm 失败: "
            p.a.w(r0, r3, r1)
        L2f:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L34
            r2 = 0
        L34:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L3d
            int r2 = r2.intValue()
            goto L3e
        L3d:
            r2 = -2
        L3e:
            return r2
        L3f:
            r2 = -12
            return r2
        L42:
            r2 = -1
            return r2
    }

    public final int autoToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L46
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L43
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.autoToSilkCompat(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "autoToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L42
        L41:
            r2 = -2
        L42:
            return r2
        L43:
            r2 = -10
            return r2
        L46:
            r2 = -1
            return r2
    }

    public final int b(int r3, java.lang.String r4) {
            r2 = this;
            me.yun.silk.SilkCodec r0 = r2.a()     // Catch: java.lang.Throwable -> Ld
            int r4 = r0.getFileType(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L14:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r4 instanceof sf.f
            if (r1 == 0) goto L1e
            r4 = r0
        L1e:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r0 = 1
            if (r4 != r0) goto L2c
            int r3 = d(r3)
            goto L32
        L2c:
            if (r3 <= 0) goto L2f
            goto L32
        L2f:
            r3 = 44100(0xac44, float:6.1797E-41)
        L32:
            return r3
    }

    public final int decodeAacFile(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L41
            java.lang.String r4 = c(r4)
            if (r4 == 0) goto L3e
            r0 = 0
            int r3 = me.yun.silk.AacCodec.decodeAacFile(r3, r4, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L1d:
            java.lang.Throwable r4 = sf.g.b(r3)
            if (r4 == 0) goto L2c
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "decodeAacFile 失败: "
            p.a.w(r1, r4, r2)
        L2c:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L31
            goto L32
        L31:
            r0 = r3
        L32:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L3b
            int r3 = r0.intValue()
            goto L3d
        L3b:
            r3 = -803(0xfffffffffffffcdd, float:NaN)
        L3d:
            return r3
        L3e:
            r3 = -12
            return r3
        L41:
            r3 = -801(0xfffffffffffffcdf, float:NaN)
            return r3
    }

    public final int decodeM4aFile(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L41
            java.lang.String r4 = c(r4)
            if (r4 == 0) goto L3e
            r0 = 0
            int r3 = me.yun.silk.AacCodec.decodeM4aFile(r3, r4, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L1d:
            java.lang.Throwable r4 = sf.g.b(r3)
            if (r4 == 0) goto L2c
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "decodeM4aFile 失败: "
            p.a.w(r1, r4, r2)
        L2c:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L31
            goto L32
        L31:
            r0 = r3
        L32:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L3b
            int r3 = r0.intValue()
            goto L3d
        L3b:
            r3 = -803(0xfffffffffffffcdd, float:NaN)
        L3d:
            return r3
        L3e:
            r3 = -12
            return r3
        L41:
            r3 = -801(0xfffffffffffffcdf, float:NaN)
            return r3
    }

    public final int encodePcmToAac(java.lang.String r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L4b
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L48
            if (r4 <= 0) goto Lf
            goto L12
        Lf:
            r4 = 44100(0xac44, float:6.1797E-41)
        L12:
            if (r5 <= 0) goto L15
            goto L16
        L15:
            r5 = 1
        L16:
            r0 = 0
            int r2 = me.yun.silk.AacCodec.encodePcmToAac(r2, r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L27:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L36
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "encodePcmToAac 失败: "
            p.a.w(r4, r3, r1)
        L36:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r2
        L3c:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L45
            int r2 = r0.intValue()
            goto L47
        L45:
            r2 = -902(0xfffffffffffffc7a, float:NaN)
        L47:
            return r2
        L48:
            r2 = -11
            return r2
        L4b:
            r2 = -901(0xfffffffffffffc7b, float:NaN)
            return r2
    }

    public final int encodePcmToM4a(java.lang.String r2, java.lang.String r3, int r4, int r5) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L48
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L48
            if (r4 <= 0) goto Lf
            goto L12
        Lf:
            r4 = 44100(0xac44, float:6.1797E-41)
        L12:
            if (r5 <= 0) goto L15
            goto L16
        L15:
            r5 = 1
        L16:
            r0 = 0
            int r2 = me.yun.silk.AacCodec.encodePcmToM4a(r2, r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L27:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L36
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "encodePcmToM4a 失败: "
            p.a.w(r4, r3, r1)
        L36:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r2
        L3c:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L45
            int r2 = r0.intValue()
            goto L47
        L45:
            r2 = -912(0xfffffffffffffc70, float:NaN)
        L47:
            return r2
        L48:
            r2 = -911(0xfffffffffffffc71, float:NaN)
            return r2
    }

    public final int flacToPcm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L43
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L40
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L19
            int r2 = r0.flacToPcm(r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L20:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "flacToPcm 失败: "
            p.a.w(r0, r3, r1)
        L2f:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L34
            r2 = 0
        L34:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L3d
            int r2 = r2.intValue()
            goto L3f
        L3d:
            r2 = -601(0xfffffffffffffda7, float:NaN)
        L3f:
            return r2
        L40:
            r2 = -12
            return r2
        L43:
            r2 = -1
            return r2
    }

    public final int flacToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.flacToSilk(r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "flacToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -601(0xfffffffffffffda7, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -1
            return r2
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAudioInfo(java.lang.String r6) {
            r5 = this;
            java.lang.String r6 = c(r6)
            if (r6 == 0) goto L73
            me.yun.silk.AacCodec$AudioInfo r6 = me.yun.silk.AacCodec.getAudioInfo(r6)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r6 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r6)
            r6 = r0
        L12:
            java.lang.Throwable r0 = sf.g.b(r6)
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "读取音频信息失败: "
            p.a.w(r1, r0, r5)
        L21:
            boolean r0 = r6 instanceof sf.f
            r1 = 0
            if (r0 == 0) goto L27
            r6 = r1
        L27:
            me.yun.silk.AacCodec$AudioInfo r6 = (me.yun.silk.AacCodec.AudioInfo) r6
            if (r6 == 0) goto L73
            java.lang.String r0 = "sampleRate"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r6, r0)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L38
            java.lang.Number r2 = (java.lang.Number) r2
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 == 0) goto L40
            int r2 = r2.intValue()
            goto L43
        L40:
            r2 = 44100(0xac44, float:6.1797E-41)
        L43:
            java.lang.String r3 = "channelCount"
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r6, r3)
            boolean r4 = r6 instanceof java.lang.Number
            if (r4 == 0) goto L50
            r1 = r6
            java.lang.Number r1 = (java.lang.Number) r1
        L50:
            if (r1 == 0) goto L57
            int r6 = r1.intValue()
            goto L58
        L57:
            r6 = 1
        L58:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            sf.e r2 = new sf.e
            r2.<init>(r0, r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            sf.e r0 = new sf.e
            r0.<init>(r3, r6)
            sf.e[] r6 = new sf.e[]{r2, r0}
            java.util.LinkedHashMap r6 = tf.y.Z(r6)
            return r6
        L73:
            tf.u r6 = tf.u.f13168g
            return r6
    }

    public final long getDuration(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = c(r5)
            r0 = 0
            if (r5 == 0) goto L38
            me.yun.silk.SilkCodec r2 = r4.a()     // Catch: java.lang.Throwable -> L15
            long r2 = r2.getDuration(r5)     // Catch: java.lang.Throwable -> L15
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r5 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r5)
            r5 = r2
        L1c:
            java.lang.Throwable r2 = sf.g.b(r5)
            if (r2 == 0) goto L2b
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "getDuration 失败: "
            p.a.w(r3, r2, r4)
        L2b:
            boolean r2 = r5 instanceof sf.f
            if (r2 == 0) goto L30
            r5 = 0
        L30:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L38
            long r0 = r5.longValue()
        L38:
            return r0
    }

    public final long getDurationLimited(java.lang.String r5) {
            r4 = this;
            java.lang.String r5 = c(r5)
            if (r5 == 0) goto L12
            long r0 = r4.getDuration(r5)
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = java.lang.Math.min(r0, r2)
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final java.lang.String getErrorMessage(int r3) {
            r2 = this;
            if (r3 != 0) goto L5
            java.lang.String r3 = "成功"
            return r3
        L5:
            r0 = -1
            if (r3 != r0) goto Lb
            java.lang.String r3 = "无法获取文件扩展名"
            return r3
        Lb:
            r0 = -2
            if (r3 != r0) goto L11
            java.lang.String r3 = "不支持的音频格式"
            return r3
        L11:
            r0 = -3
            if (r3 != r0) goto L17
            java.lang.String r3 = "PCM 转 Silk 需要额外参数"
            return r3
        L17:
            r0 = -4
            if (r3 != r0) goto L1d
            java.lang.String r3 = "输入已经是 PCM 格式"
            return r3
        L1d:
            r0 = -5
            if (r3 != r0) goto L23
            java.lang.String r3 = "输入已经是 Silk 格式"
            return r3
        L23:
            r0 = -10
            if (r3 != r0) goto L2a
            java.lang.String r3 = "输出必须是 .silk 或 .slk"
            return r3
        L2a:
            r0 = -11
            if (r3 != r0) goto L31
            java.lang.String r3 = "输出必须是 .mp3"
            return r3
        L31:
            r0 = -12
            if (r3 != r0) goto L38
            java.lang.String r3 = "输出必须是 .pcm 或 .raw"
            return r3
        L38:
            r0 = -13
            if (r3 != r0) goto L3f
            java.lang.String r3 = "文件格式与方法不匹配"
            return r3
        L3f:
            r0 = -201(0xffffffffffffff37, float:NaN)
            if (r0 > r3) goto L48
            if (r3 >= r0) goto L48
            java.lang.String r3 = "Silk 转 MP3 文件错误"
            return r3
        L48:
            r0 = -301(0xfffffffffffffed3, float:NaN)
            if (r3 != r0) goto L4f
            java.lang.String r3 = "MP3 解码错误"
            return r3
        L4f:
            r0 = -302(0xfffffffffffffed2, float:NaN)
            if (r3 != r0) goto L56
            java.lang.String r3 = "MP3 文件错误"
            return r3
        L56:
            r0 = -401(0xfffffffffffffe6f, float:NaN)
            if (r3 != r0) goto L5d
            java.lang.String r3 = "OGG 解码错误"
            return r3
        L5d:
            r0 = -402(0xfffffffffffffe6e, float:NaN)
            if (r3 != r0) goto L64
            java.lang.String r3 = "OGG 文件错误"
            return r3
        L64:
            r0 = -501(0xfffffffffffffe0b, float:NaN)
            if (r3 != r0) goto L6b
            java.lang.String r3 = "WAV 解码错误"
            return r3
        L6b:
            r0 = -502(0xfffffffffffffe0a, float:NaN)
            if (r3 != r0) goto L72
            java.lang.String r3 = "WAV 文件错误"
            return r3
        L72:
            r0 = -601(0xfffffffffffffda7, float:NaN)
            if (r3 != r0) goto L79
            java.lang.String r3 = "FLAC 解码错误"
            return r3
        L79:
            r0 = -602(0xfffffffffffffda6, float:NaN)
            if (r3 != r0) goto L80
            java.lang.String r3 = "FLAC 文件错误"
            return r3
        L80:
            r0 = -701(0xfffffffffffffd43, float:NaN)
            if (r3 == r0) goto L11b
            r0 = -703(0xfffffffffffffd41, float:NaN)
            if (r3 != r0) goto L8a
            goto L11b
        L8a:
            r0 = -702(0xfffffffffffffd42, float:NaN)
            if (r3 != r0) goto L91
            java.lang.String r3 = "PCM 文件错误"
            return r3
        L91:
            r0 = -801(0xfffffffffffffcdf, float:NaN)
            if (r3 != r0) goto L98
            java.lang.String r3 = "AAC/M4A 解码错误 (文件不存在)"
            return r3
        L98:
            r0 = -802(0xfffffffffffffcde, float:NaN)
            if (r3 != r0) goto L9f
            java.lang.String r3 = "AAC/M4A 解码错误 (未找到音频轨道)"
            return r3
        L9f:
            r0 = -803(0xfffffffffffffcdd, float:NaN)
            if (r3 != r0) goto La6
            java.lang.String r3 = "AAC/M4A 解码错误 (格式不支持)"
            return r3
        La6:
            r0 = -901(0xfffffffffffffc7b, float:NaN)
            if (r0 > r3) goto Laf
            if (r3 >= r0) goto Laf
            java.lang.String r3 = "AAC 编码错误"
            return r3
        Laf:
            r0 = -911(0xfffffffffffffc71, float:NaN)
            if (r0 > r3) goto Lb8
            if (r3 >= r0) goto Lb8
            java.lang.String r3 = "M4A 编码错误"
            return r3
        Lb8:
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            if (r0 > r3) goto Lc3
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r3 >= r0) goto Lc3
            java.lang.String r3 = "Silk 转 AAC/M4A 错误"
            return r3
        Lc3:
            r0 = -1011(0xfffffffffffffc0d, float:NaN)
            if (r0 > r3) goto Lcc
            if (r3 >= r0) goto Lcc
            java.lang.String r3 = "MP3 转 AAC/M4A 错误"
            return r3
        Lcc:
            r0 = -1021(0xfffffffffffffc03, float:NaN)
            if (r0 > r3) goto Ld5
            if (r3 >= r0) goto Ld5
            java.lang.String r3 = "WAV 转 AAC/M4A 错误"
            return r3
        Ld5:
            r0 = -1031(0xfffffffffffffbf9, float:NaN)
            if (r0 > r3) goto Le0
            r0 = -1038(0xfffffffffffffbf2, float:NaN)
            if (r3 >= r0) goto Le0
            java.lang.String r3 = "M4A/AAC 转 Silk 错误"
            return r3
        Le0:
            r0 = -1051(0xfffffffffffffbe5, float:NaN)
            if (r0 > r3) goto Leb
            r0 = -1058(0xfffffffffffffbde, float:NaN)
            if (r3 >= r0) goto Leb
            java.lang.String r3 = "M4A/AAC 转 AAC 错误"
            return r3
        Leb:
            r0 = -1061(0xfffffffffffffbdb, float:NaN)
            if (r0 > r3) goto Lf6
            r0 = -1068(0xfffffffffffffbd4, float:NaN)
            if (r3 >= r0) goto Lf6
            java.lang.String r3 = "M4A/AAC 转 M4A 错误"
            return r3
        Lf6:
            r0 = -2000(0xfffffffffffff830, float:NaN)
            if (r3 != r0) goto Lfd
            java.lang.String r3 = "M4A/AAC 转 Silk 错误 (解码失败)"
            return r3
        Lfd:
            java.lang.String r0 = me.yun.silk.AacCodec.getErrorMessage(r3)     // Catch: java.lang.Throwable -> L102
            goto L109
        L102:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L109:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L110
            goto L118
        L110:
            java.lang.String r0 = "错误码: "
            java.lang.String r1 = " -> 未知错误"
            java.lang.String r0 = eh.a.m(r3, r0, r1)
        L118:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L11b:
            java.lang.String r3 = "PCM 参数错误"
            return r3
    }

    public final int getFileType(java.lang.String r4) {
            r3 = this;
            java.lang.String r4 = c(r4)
            r0 = 0
            if (r4 == 0) goto L37
            me.yun.silk.SilkCodec r1 = r3.a()     // Catch: java.lang.Throwable -> L14
            int r4 = r1.getFileType(r4)     // Catch: java.lang.Throwable -> L14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r4 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r4)
            r4 = r1
        L1b:
            java.lang.Throwable r1 = sf.g.b(r4)
            if (r1 == 0) goto L2a
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "getFileType 失败: "
            p.a.w(r2, r1, r3)
        L2a:
            boolean r1 = r4 instanceof sf.f
            if (r1 == 0) goto L2f
            r4 = 0
        L2f:
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L37
            int r0 = r4.intValue()
        L37:
            return r0
    }

    public final void log(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            fg.l r0 = r1.logger
            if (r0 == 0) goto La
            r0.invoke(r2)
        La:
            return
    }

    public final int m4aToAac(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.String r1 = c(r1)
            if (r1 == 0) goto L45
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L42
            if (r3 <= 0) goto Lf
            goto L12
        Lf:
            r3 = 44100(0xac44, float:6.1797E-41)
        L12:
            int r1 = me.yun.silk.AacCodec.m4aToAac(r1, r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L22:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "m4aToAac 失败: "
            p.a.w(r3, r2, r0)
        L31:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L36
            r1 = 0
        L36:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3f
            int r1 = r1.intValue()
            goto L41
        L3f:
            r1 = -1051(0xfffffffffffffbe5, float:NaN)
        L41:
            return r1
        L42:
            r1 = -901(0xfffffffffffffc7b, float:NaN)
            return r1
        L45:
            r1 = -801(0xfffffffffffffcdf, float:NaN)
            return r1
    }

    public final int m4aToM4a(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.String r1 = c(r1)
            if (r1 == 0) goto L45
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L42
            if (r3 <= 0) goto Lf
            goto L12
        Lf:
            r3 = 44100(0xac44, float:6.1797E-41)
        L12:
            int r1 = me.yun.silk.AacCodec.m4aToM4a(r1, r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L22:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "m4aToM4a 失败: "
            p.a.w(r3, r2, r0)
        L31:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L36
            r1 = 0
        L36:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3f
            int r1 = r1.intValue()
            goto L41
        L3f:
            r1 = -1061(0xfffffffffffffbdb, float:NaN)
        L41:
            return r1
        L42:
            r1 = -911(0xfffffffffffffc71, float:NaN)
            return r1
        L45:
            r1 = -801(0xfffffffffffffcdf, float:NaN)
            return r1
    }

    public final int m4aToPcm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L3f
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L3c
            int r2 = me.yun.silk.AacCodec.m4aToPcm(r2, r3)     // Catch: java.lang.Throwable -> L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L1c:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L2b
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "m4aToPcm 失败: "
            p.a.w(r0, r3, r1)
        L2b:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L30
            r2 = 0
        L30:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L39
            int r2 = r2.intValue()
            goto L3b
        L39:
            r2 = -803(0xfffffffffffffcdd, float:NaN)
        L3b:
            return r2
        L3c:
            r2 = -12
            return r2
        L3f:
            r2 = -801(0xfffffffffffffcdf, float:NaN)
            return r2
    }

    public final int m4aToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.m4aToSilk(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "m4aToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -1031(0xfffffffffffffbf9, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -801(0xfffffffffffffcdf, float:NaN)
            return r2
    }

    public final int mp3ToPcm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L43
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L40
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L19
            int r2 = r0.mp3ToPcm(r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L20:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "mp3ToPcm 失败: "
            p.a.w(r0, r3, r1)
        L2f:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L34
            r2 = 0
        L34:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L3d
            int r2 = r2.intValue()
            goto L3f
        L3d:
            r2 = -301(0xfffffffffffffed3, float:NaN)
        L3f:
            return r2
        L40:
            r2 = -12
            return r2
        L43:
            r2 = -1
            return r2
    }

    public final int mp3ToSilk(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 24000(0x5dc0, float:3.3631E-41)
            int r2 = r1.mp3ToSilk(r2, r3, r0)
            return r2
    }

    public final int mp3ToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.mp3ToSilk(r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "mp3ToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -301(0xfffffffffffffed3, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -1
            return r2
    }

    public final int mp4ToAac(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.String r1 = c(r1)
            if (r1 == 0) goto L45
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L42
            if (r3 <= 0) goto Lf
            goto L12
        Lf:
            r3 = 44100(0xac44, float:6.1797E-41)
        L12:
            int r1 = me.yun.silk.AacCodec.mp4ToAac(r1, r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L22:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "mp4ToAac 失败: "
            p.a.w(r3, r2, r0)
        L31:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L36
            r1 = 0
        L36:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3f
            int r1 = r1.intValue()
            goto L41
        L3f:
            r1 = -1051(0xfffffffffffffbe5, float:NaN)
        L41:
            return r1
        L42:
            r1 = -901(0xfffffffffffffc7b, float:NaN)
            return r1
        L45:
            r1 = -801(0xfffffffffffffcdf, float:NaN)
            return r1
    }

    public final int mp4ToM4a(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.String r1 = c(r1)
            if (r1 == 0) goto L45
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L42
            if (r3 <= 0) goto Lf
            goto L12
        Lf:
            r3 = 44100(0xac44, float:6.1797E-41)
        L12:
            int r1 = me.yun.silk.AacCodec.mp4ToM4a(r1, r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L22:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 == 0) goto L31
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "mp4ToM4a 失败: "
            p.a.w(r3, r2, r0)
        L31:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L36
            r1 = 0
        L36:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3f
            int r1 = r1.intValue()
            goto L41
        L3f:
            r1 = -1061(0xfffffffffffffbdb, float:NaN)
        L41:
            return r1
        L42:
            r1 = -911(0xfffffffffffffc71, float:NaN)
            return r1
        L45:
            r1 = -801(0xfffffffffffffcdf, float:NaN)
            return r1
    }

    public final int mp4ToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.mp4ToSilk(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "mp4ToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -1031(0xfffffffffffffbf9, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -801(0xfffffffffffffcdf, float:NaN)
            return r2
    }

    public final int oggToPcm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L43
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L40
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L19
            int r2 = me.yun.silk.AacCodec.oggToPcmCompat(r2, r3, r0)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L20:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "oggToPcm 失败: "
            p.a.w(r0, r3, r1)
        L2f:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L34
            r2 = 0
        L34:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L3d
            int r2 = r2.intValue()
            goto L3f
        L3d:
            r2 = -401(0xfffffffffffffe6f, float:NaN)
        L3f:
            return r2
        L40:
            r2 = -12
            return r2
        L43:
            r2 = -1
            return r2
    }

    public final int oggToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = me.yun.silk.AacCodec.oggToSilkCompat(r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "oggToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -401(0xfffffffffffffe6f, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -1
            return r2
    }

    public final int pcmToAac(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            java.lang.String r1 = c(r1)
            if (r1 == 0) goto L46
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L46
            if (r3 <= 0) goto Lf
            goto L12
        Lf:
            r3 = 44100(0xac44, float:6.1797E-41)
        L12:
            if (r4 <= 0) goto L15
            goto L16
        L15:
            r4 = 1
        L16:
            int r1 = me.yun.silk.AacCodec.pcmToAac(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L26:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 == 0) goto L35
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "pcmToAac 失败: "
            p.a.w(r3, r2, r0)
        L35:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L3a
            r1 = 0
        L3a:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L43
            int r1 = r1.intValue()
            goto L45
        L43:
            r1 = -902(0xfffffffffffffc7a, float:NaN)
        L45:
            return r1
        L46:
            r1 = -901(0xfffffffffffffc7b, float:NaN)
            return r1
    }

    public final int pcmToM4a(java.lang.String r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            java.lang.String r1 = c(r1)
            if (r1 == 0) goto L46
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L46
            if (r3 <= 0) goto Lf
            goto L12
        Lf:
            r3 = 44100(0xac44, float:6.1797E-41)
        L12:
            if (r4 <= 0) goto L15
            goto L16
        L15:
            r4 = 1
        L16:
            int r1 = me.yun.silk.AacCodec.pcmToM4a(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L26:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 == 0) goto L35
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "pcmToM4a 失败: "
            p.a.w(r3, r2, r0)
        L35:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L3a
            r1 = 0
        L3a:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L43
            int r1 = r1.intValue()
            goto L45
        L43:
            r1 = -912(0xfffffffffffffc70, float:NaN)
        L45:
            return r1
        L46:
            r1 = -911(0xfffffffffffffc71, float:NaN)
            return r1
    }

    public final int pcmToSilk(java.lang.String r7, java.lang.String r8, int r9, int r10, int r11) {
            r6 = this;
            java.lang.String r1 = c(r7)
            if (r1 == 0) goto L56
            java.lang.String r2 = c(r8)
            if (r2 == 0) goto L53
            me.yun.silk.SilkCodec r0 = r6.a()     // Catch: java.lang.Throwable -> L2b
            int r3 = d(r9)     // Catch: java.lang.Throwable -> L2b
            if (r10 <= 0) goto L18
        L16:
            r4 = r10
            goto L1c
        L18:
            r10 = 44100(0xac44, float:6.1797E-41)
            goto L16
        L1c:
            if (r11 <= 0) goto L20
        L1e:
            r5 = r11
            goto L22
        L20:
            r11 = 1
            goto L1e
        L22:
            int r7 = r0.pcmToSilk(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2b
            goto L33
        L2b:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L33:
            java.lang.Throwable r8 = sf.g.b(r7)
            if (r8 == 0) goto L42
            java.lang.String r8 = r8.getMessage()
            java.lang.String r9 = "pcmToSilk 失败: "
            p.a.w(r9, r8, r6)
        L42:
            boolean r8 = r7 instanceof sf.f
            if (r8 == 0) goto L47
            r7 = 0
        L47:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L50
            int r7 = r7.intValue()
            goto L52
        L50:
            r7 = -701(0xfffffffffffffd43, float:NaN)
        L52:
            return r7
        L53:
            r7 = -10
            return r7
        L56:
            r7 = -1
            return r7
    }

    public final int silkToAac(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            java.lang.String r3 = c(r3)
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            if (r3 == 0) goto L46
            java.lang.String r4 = c(r4)
            if (r4 == 0) goto L43
            me.yun.silk.SilkCodec r1 = r2.a()     // Catch: java.lang.Throwable -> L1f
            int r5 = d(r5)     // Catch: java.lang.Throwable -> L1f
            int r3 = me.yun.silk.AacCodec.silkToAac(r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L26:
            java.lang.Throwable r4 = sf.g.b(r3)
            if (r4 == 0) goto L35
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "silkToAac 失败: "
            p.a.w(r5, r4, r2)
        L35:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L3a
            r3 = 0
        L3a:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L42
            int r0 = r3.intValue()
        L42:
            return r0
        L43:
            r3 = -901(0xfffffffffffffc7b, float:NaN)
            return r3
        L46:
            return r0
    }

    public final int silkToM4a(java.lang.String r3, java.lang.String r4, int r5) {
            r2 = this;
            java.lang.String r3 = c(r3)
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            if (r3 == 0) goto L46
            java.lang.String r4 = c(r4)
            if (r4 == 0) goto L43
            me.yun.silk.SilkCodec r1 = r2.a()     // Catch: java.lang.Throwable -> L1f
            int r5 = d(r5)     // Catch: java.lang.Throwable -> L1f
            int r3 = me.yun.silk.AacCodec.silkToM4a(r3, r4, r1, r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L26:
            java.lang.Throwable r4 = sf.g.b(r3)
            if (r4 == 0) goto L35
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "silkToM4a 失败: "
            p.a.w(r5, r4, r2)
        L35:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L3a
            r3 = 0
        L3a:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L42
            int r0 = r3.intValue()
        L42:
            return r0
        L43:
            r3 = -911(0xfffffffffffffc71, float:NaN)
            return r3
        L46:
            return r0
    }

    public final int silkToMp3(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 24000(0x5dc0, float:3.3631E-41)
            int r2 = r1.silkToMp3(r2, r3, r0)
            return r2
    }

    public final int silkToMp3(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.silkToMp3(r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "silkToMp3 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -201(0xffffffffffffff37, float:NaN)
        L43:
            return r2
        L44:
            r2 = -11
            return r2
        L47:
            r2 = -1
            return r2
    }

    public final int silkToPcm(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.silkToPcm(r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "silkToPcm 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -201(0xffffffffffffff37, float:NaN)
        L43:
            return r2
        L44:
            r2 = -12
            return r2
        L47:
            r2 = -1
            return r2
    }

    public final void startTransform(int r9, java.lang.String r10, java.lang.String r11, int r12, java.util.function.Consumer<java.lang.Object> r13) {
            r8 = this;
            java.lang.String r3 = c(r10)
            if (r3 == 0) goto L2a
            java.lang.String r4 = c(r11)
            if (r4 == 0) goto L2a
            int r5 = d(r12)
            if (r12 <= 0) goto L14
        L12:
            r6 = r12
            goto L18
        L14:
            r12 = 44100(0xac44, float:6.1797E-41)
            goto L12
        L18:
            java.lang.Thread r10 = new java.lang.Thread
            tb.a r0 = new tb.a
            r2 = r8
            r1 = r9
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "Hchat-Audio-Transform"
            r10.<init>(r0, r9)
            r10.start()
        L2a:
            return
    }

    public final int wavToPcm(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L43
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L40
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L19
            int r2 = r0.wavToPcm(r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L20:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "wavToPcm 失败: "
            p.a.w(r0, r3, r1)
        L2f:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L34
            r2 = 0
        L34:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L3d
            int r2 = r2.intValue()
            goto L3f
        L3d:
            r2 = -501(0xfffffffffffffe0b, float:NaN)
        L3f:
            return r2
        L40:
            r2 = -12
            return r2
        L43:
            r2 = -1
            return r2
    }

    public final int wavToSilk(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.String r2 = c(r2)
            if (r2 == 0) goto L47
            java.lang.String r3 = c(r3)
            if (r3 == 0) goto L44
            me.yun.silk.SilkCodec r0 = r1.a()     // Catch: java.lang.Throwable -> L1d
            int r4 = d(r4)     // Catch: java.lang.Throwable -> L1d
            int r2 = r0.wavToSilk(r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L24:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 == 0) goto L33
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "wavToSilk 失败: "
            p.a.w(r4, r3, r1)
        L33:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L38
            r2 = 0
        L38:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L41
            int r2 = r2.intValue()
            goto L43
        L41:
            r2 = -501(0xfffffffffffffe0b, float:NaN)
        L43:
            return r2
        L44:
            r2 = -10
            return r2
        L47:
            r2 = -1
            return r2
    }
}
