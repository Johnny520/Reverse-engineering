package androidx.appcompat.app;

/* JADX INFO: loaded from: classes2.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;

    /* JADX INFO: renamed from: C1 */
    private static final float f11C1 = 0.0334196f;

    /* JADX INFO: renamed from: C2 */
    private static final float f12C2 = 3.49066E-4f;

    /* JADX INFO: renamed from: C3 */
    private static final float f13C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;

    /* JADX INFO: renamed from: J0 */
    private static final float f14J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static androidx.appcompat.app.TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    TwilightCalculator() {
            r0 = this;
            r0.<init>()
            return
    }

    static androidx.appcompat.app.TwilightCalculator getInstance() {
            androidx.appcompat.app.TwilightCalculator r0 = androidx.appcompat.app.TwilightCalculator.sInstance
            if (r0 != 0) goto Lb
            androidx.appcompat.app.TwilightCalculator r0 = new androidx.appcompat.app.TwilightCalculator
            r0.<init>()
            androidx.appcompat.app.TwilightCalculator.sInstance = r0
        Lb:
            androidx.appcompat.app.TwilightCalculator r0 = androidx.appcompat.app.TwilightCalculator.sInstance
            return r0
    }

    public void calculateTwilight(long r32, double r34, double r36) {
            r31 = this;
            r0 = r31
            r1 = 946728000000(0xdc6d62da00, double:4.67745780756E-312)
            long r3 = r32 - r1
            float r3 = (float) r3
            r4 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r3 = r3 / r4
            r4 = 1015868197(0x3c8ceb25, float:0.01720197)
            float r4 = r4 * r3
            r5 = 1086828178(0x40c7ae92, float:6.24006)
            float r4 = r4 + r5
            double r5 = (double) r4
            double r7 = (double) r4
            double r7 = java.lang.Math.sin(r7)
            r9 = 4584977093208571904(0x3fa11c5fc0000000, double:0.03341960161924362)
            double r7 = r7 * r9
            double r5 = r5 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r4
            double r7 = (double) r7
            double r7 = java.lang.Math.sin(r7)
            r9 = 4555074754578481152(0x3f36e05b00000000, double:3.4906598739326E-4)
            double r7 = r7 * r9
            double r5 = r5 + r7
            r7 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 * r4
            double r7 = (double) r7
            double r7 = java.lang.Math.sin(r7)
            r9 = 4527795603731644416(0x3ed5f61cc0000000, double:5.236000106378924E-6)
            double r7 = r7 * r9
            double r5 = r5 + r7
            r7 = 4610769955021710130(0x3ffcbed85e1ce332, double:1.796593063)
            double r7 = r7 + r5
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 + r9
            r9 = r36
            double r11 = -r9
            r13 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r11 = r11 / r13
            r13 = 980151802(0x3a6bedfa, float:9.0E-4)
            float r14 = r3 - r13
            double r14 = (double) r14
            double r14 = r14 - r11
            long r14 = java.lang.Math.round(r14)
            float r14 = (float) r14
            float r13 = r13 + r14
            double r1 = (double) r13
            double r1 = r1 + r11
            r17 = r5
            double r5 = (double) r4
            double r5 = java.lang.Math.sin(r5)
            r19 = 4572760506128099233(0x3f75b573eab367a1, double:0.0053)
            double r5 = r5 * r19
            double r1 = r1 + r5
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r7
            double r5 = java.lang.Math.sin(r5)
            r19 = -4648766856319305620(0xbf7c432ca57a786c, double:-0.0069)
            double r5 = r5 * r19
            double r1 = r1 + r5
            double r5 = java.lang.Math.sin(r7)
            r19 = 4601044547609296896(0x3fda31a380000000, double:0.4092797040939331)
            double r19 = java.lang.Math.sin(r19)
            double r5 = r5 * r19
            double r5 = java.lang.Math.asin(r5)
            r19 = 4580687790437564416(0x3f91df46a0000000, double:0.01745329238474369)
            double r19 = r19 * r34
            r21 = -4631161762379464704(0xbfbaceea00000000, double:-0.10471975803375244)
            double r21 = java.lang.Math.sin(r21)
            double r23 = java.lang.Math.sin(r19)
            double r25 = java.lang.Math.sin(r5)
            double r23 = r23 * r25
            double r21 = r21 - r23
            double r23 = java.lang.Math.cos(r19)
            double r25 = java.lang.Math.cos(r5)
            double r23 = r23 * r25
            double r21 = r21 / r23
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r13 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            r15 = 1
            r16 = r3
            r25 = r4
            r3 = -1
            if (r13 < 0) goto Ld2
            r0.state = r15
            r0.sunset = r3
            r0.sunrise = r3
            return
        Ld2:
            r26 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r13 = (r21 > r26 ? 1 : (r21 == r26 ? 0 : -1))
            r15 = 0
            if (r13 > 0) goto Le0
            r0.state = r15
            r0.sunset = r3
            r0.sunrise = r3
            return
        Le0:
            double r3 = java.lang.Math.acos(r21)
            r27 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r3 = r3 / r27
            float r3 = (float) r3
            r27 = r5
            double r4 = (double) r3
            double r4 = r4 + r1
            r29 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            double r4 = r4 * r29
            long r4 = java.lang.Math.round(r4)
            r23 = 946728000000(0xdc6d62da00, double:4.67745780756E-312)
            long r4 = r4 + r23
            r0.sunset = r4
            double r4 = (double) r3
            double r4 = r1 - r4
            double r4 = r4 * r29
            long r4 = java.lang.Math.round(r4)
            long r4 = r4 + r23
            r0.sunrise = r4
            long r4 = r0.sunrise
            int r4 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r4 >= 0) goto L120
            long r4 = r0.sunset
            int r4 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r4 <= 0) goto L120
            r0.state = r15
            goto L123
        L120:
            r4 = 1
            r0.state = r4
        L123:
            return
    }
}
