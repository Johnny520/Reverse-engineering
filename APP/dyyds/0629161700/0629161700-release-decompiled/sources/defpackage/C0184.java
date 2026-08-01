package defpackage;

/* JADX INFO: renamed from: ᛱᲁᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0184 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int[] f1226;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f1227;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public float f1228;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public android.view.VelocityTracker f1229;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f1230;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC1297 f1231;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f1232;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f1233;

    public C0184(android.content.Context r3, defpackage.InterfaceC1297 r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f1227 = r0
            r2.f1232 = r0
            r2.f1233 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            r2.f1226 = r0
            r2.f1230 = r3
            r2.f1231 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m721(android.view.MotionEvent r28, int r29) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            int r3 = r1.getSource()
            int r4 = r1.getDeviceId()
            int r5 = r0.f1232
            r6 = 34
            r8 = 4194304(0x400000, float:5.877472E-39)
            int[] r10 = r0.f1226
            if (r5 != r3) goto L28
            int r5 = r0.f1233
            if (r5 != r4) goto L28
            int r5 = r0.f1227
            if (r5 == r2) goto L21
            goto L28
        L21:
            r12 = 0
            r16 = 1
            r17 = 0
            goto Lc5
        L28:
            android.content.Context r5 = r0.f1230
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r5)
            int r14 = r1.getDeviceId()
            int r15 = r1.getSource()
            r16 = 1
            int r11 = android.os.Build.VERSION.SDK_INT
            r17 = 0
            java.lang.String r12 = "android"
            java.lang.String r7 = "dimen"
            r9 = -1
            if (r11 < r6) goto L48
            int r14 = defpackage.AbstractC1275.m2408(r13, r14, r2, r15)
            goto L79
        L48:
            android.view.InputDevice r14 = android.view.InputDevice.getDevice(r14)
            if (r14 == 0) goto L76
            android.view.InputDevice$MotionRange r14 = r14.getMotionRange(r2, r15)
            if (r14 == 0) goto L76
            android.content.res.Resources r14 = r5.getResources()
            if (r15 != r8) goto L65
            r15 = 26
            if (r2 != r15) goto L65
            java.lang.String r15 = "config_viewMinRotaryEncoderFlingVelocity"
            int r15 = r14.getIdentifier(r15, r7, r12)
            goto L66
        L65:
            r15 = r9
        L66:
            if (r15 == r9) goto L71
            if (r15 == 0) goto L76
            int r14 = r14.getDimensionPixelSize(r15)
            if (r14 >= 0) goto L79
            goto L76
        L71:
            int r14 = r13.getScaledMinimumFlingVelocity()
            goto L79
        L76:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L79:
            r10[r17] = r14
            int r14 = r1.getDeviceId()
            int r15 = r1.getSource()
            if (r11 < r6) goto L8a
            int r5 = defpackage.AbstractC1275.m2403(r13, r14, r2, r15)
            goto Lbb
        L8a:
            android.view.InputDevice r11 = android.view.InputDevice.getDevice(r14)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto Lba
            android.view.InputDevice$MotionRange r11 = r11.getMotionRange(r2, r15)
            if (r11 == 0) goto Lba
            android.content.res.Resources r5 = r5.getResources()
            if (r15 != r8) goto La9
            r15 = 26
            if (r2 != r15) goto La9
            java.lang.String r11 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r7 = r5.getIdentifier(r11, r7, r12)
            goto Laa
        La9:
            r7 = r9
        Laa:
            if (r7 == r9) goto Lb5
            if (r7 == 0) goto Lba
            int r5 = r5.getDimensionPixelSize(r7)
            if (r5 >= 0) goto Lbb
            goto Lba
        Lb5:
            int r5 = r13.getScaledMaximumFlingVelocity()
            goto Lbb
        Lba:
            r5 = r14
        Lbb:
            r10[r16] = r5
            r0.f1232 = r3
            r0.f1233 = r4
            r0.f1227 = r2
            r12 = r16
        Lc5:
            r3 = r10[r17]
            android.view.VelocityTracker r4 = r0.f1229
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r5) goto Ld7
            if (r4 == 0) goto L292
            r4.recycle()
            r1 = 0
            r0.f1229 = r1
            return
        Ld7:
            if (r4 != 0) goto Ldf
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1229 = r4
        Ldf:
            java.util.Map r3 = defpackage.AbstractC0592.f2959
            r4.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r7 = 20
            if (r3 < r6) goto Lec
            goto L140
        Lec:
            int r3 = r1.getSource()
            if (r3 != r8) goto L140
            java.util.Map r3 = defpackage.AbstractC0592.f2959
            boolean r8 = r3.containsKey(r4)
            if (r8 != 0) goto L102
            ᲀᛶᛴᛱ r8 = new ᲀᛶᛴᛱ
            r8.<init>()
            r3.put(r4, r8)
        L102:
            java.lang.Object r3 = r3.get(r4)
            ᲀᛶᛴᛱ r3 = (defpackage.C1686) r3
            long[] r8 = r3.f7503
            long r13 = r1.getEventTime()
            int r9 = r3.f7500
            if (r9 == 0) goto L125
            int r11 = r3.f7499
            r19 = r8[r11]
            long r19 = r13 - r19
            r21 = 40
            int r11 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r11 <= 0) goto L125
            r11 = r17
            r3.f7500 = r11
            r3.f7501 = r5
            r9 = 0
        L125:
            int r11 = r3.f7499
            int r11 = r11 + 1
            int r11 = r11 % r7
            r3.f7499 = r11
            if (r9 == r7) goto L132
            int r9 = r9 + 1
            r3.f7500 = r9
        L132:
            float[] r9 = r3.f7502
            r15 = 26
            float r1 = r1.getAxisValue(r15)
            r9[r11] = r1
            int r1 = r3.f7499
            r8[r1] = r13
        L140:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4.computeCurrentVelocity(r1, r3)
            java.util.Map r1 = defpackage.AbstractC0592.f2959
            java.lang.Object r1 = r1.get(r4)
            ᲀᛶᛴᛱ r1 = (defpackage.C1686) r1
            if (r1 == 0) goto L239
            float[] r8 = r1.f7502
            long[] r9 = r1.f7503
            int r11 = r1.f7500
            r13 = 2
            if (r11 >= r13) goto L162
        L15b:
            r28 = r3
            r7 = r5
            r23 = r7
            goto L212
        L162:
            int r14 = r1.f7499
            int r15 = r14 + 20
            int r11 = r11 + (-1)
            int r15 = r15 - r11
            int r15 = r15 % r7
            r19 = r9[r14]
        L16c:
            r21 = r9[r15]
            long r23 = r19 - r21
            r25 = 100
            int r11 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            int r14 = r1.f7500
            if (r11 <= 0) goto L180
            int r14 = r14 + (-1)
            r1.f7500 = r14
            int r15 = r15 + 1
            int r15 = r15 % r7
            goto L16c
        L180:
            if (r14 >= r13) goto L183
            goto L15b
        L183:
            if (r14 != r13) goto L19b
            int r15 = r15 + 1
            int r15 = r15 % r7
            r13 = r9[r15]
            int r7 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r7 != 0) goto L18f
            goto L15b
        L18f:
            r7 = r8[r15]
            long r13 = r13 - r21
            float r8 = (float) r13
            float r7 = r7 / r8
            r28 = r3
            r23 = r5
            goto L212
        L19b:
            r28 = r3
            r14 = r5
            r11 = 0
            r13 = 0
        L1a0:
            int r3 = r1.f7500
            int r3 = r3 + (-1)
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 >= r3) goto L1fc
            int r3 = r11 + r15
            int r21 = r3 % 20
            r21 = r9[r21]
            int r3 = r3 + 1
            int r3 = r3 % r7
            r23 = r9[r3]
            int r23 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r23 != 0) goto L1c0
            r23 = r5
            r25 = r8
            goto L1f1
        L1c0:
            int r13 = r13 + 1
            int r23 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r23 >= 0) goto L1c8
            r19 = r20
        L1c8:
            float r20 = java.lang.Math.abs(r14)
            r23 = r5
            float r5 = r20 * r18
            r25 = r8
            double r7 = (double) r5
            double r7 = java.lang.Math.sqrt(r7)
            float r5 = (float) r7
            float r19 = r19 * r5
            r5 = r25[r3]
            r7 = r9[r3]
            long r7 = r7 - r21
            float r3 = (float) r7
            float r5 = r5 / r3
            float r3 = r5 - r19
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 * r3
            float r14 = r14 + r5
            r3 = r16
            if (r13 != r3) goto L1f1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r3
        L1f1:
            int r11 = r11 + 1
            r5 = r23
            r8 = r25
            r7 = 20
            r16 = 1
            goto L1a0
        L1fc:
            r23 = r5
            int r3 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r3 >= 0) goto L204
            r19 = r20
        L204:
            float r3 = java.lang.Math.abs(r14)
            float r3 = r3 * r18
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r19 * r3
        L212:
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r3
            r1.f7501 = r7
            float r3 = java.lang.Math.abs(r28)
            float r3 = -r3
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L228
            float r3 = java.lang.Math.abs(r28)
            float r3 = -r3
            r1.f7501 = r3
            goto L23b
        L228:
            float r3 = r1.f7501
            float r5 = java.lang.Math.abs(r28)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L23b
            float r3 = java.lang.Math.abs(r28)
            r1.f7501 = r3
            goto L23b
        L239:
            r23 = r5
        L23b:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r6) goto L244
            float r1 = defpackage.AbstractC1275.m2407(r4, r2)
            goto L267
        L244:
            if (r2 != 0) goto L24b
            float r1 = r4.getXVelocity()
            goto L267
        L24b:
            r3 = 1
            if (r2 != r3) goto L253
            float r1 = r4.getYVelocity()
            goto L267
        L253:
            java.util.Map r1 = defpackage.AbstractC0592.f2959
            java.lang.Object r1 = r1.get(r4)
            ᲀᛶᛴᛱ r1 = (defpackage.C1686) r1
            if (r1 == 0) goto L265
            r15 = 26
            if (r2 == r15) goto L262
            goto L265
        L262:
            float r1 = r1.f7501
            goto L267
        L265:
            r1 = r23
        L267:
            ᛷᛶᲁᛱ r2 = r0.f1231
            float r3 = r2.mo2292()
            float r3 = r3 * r1
            float r1 = java.lang.Math.signum(r3)
            if (r12 != 0) goto L282
            float r4 = r0.f1228
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L285
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 == 0) goto L285
        L282:
            r2.mo2295()
        L285:
            float r1 = java.lang.Math.abs(r3)
            r17 = 0
            r4 = r10[r17]
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L293
        L292:
            return
        L293:
            r16 = 1
            r1 = r10[r16]
            int r4 = -r1
            float r4 = (float) r4
            float r1 = (float) r1
            float r1 = java.lang.Math.min(r3, r1)
            float r1 = java.lang.Math.max(r4, r1)
            boolean r2 = r2.mo2299(r1)
            if (r2 == 0) goto L2aa
            r5 = r1
            goto L2ac
        L2aa:
            r5 = r23
        L2ac:
            r0.f1228 = r5
            return
    }
}
