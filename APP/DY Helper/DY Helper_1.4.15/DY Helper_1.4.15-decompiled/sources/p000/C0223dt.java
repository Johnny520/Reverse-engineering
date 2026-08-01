package p000;

/* JADX INFO: renamed from: dt */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0223dt {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f3270;

    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0260et f3271;

    /* JADX INFO: renamed from: γ */
    public android.view.VelocityTracker f3272;

    /* JADX INFO: renamed from: δ */
    public float f3273;

    /* JADX INFO: renamed from: ε */
    public int f3274;

    /* JADX INFO: renamed from: ζ */
    public int f3275;

    /* JADX INFO: renamed from: η */
    public int f3276;

    /* JADX INFO: renamed from: θ */
    public final int[] f3277;

    public C0223dt(android.content.Context r3, p000.InterfaceC0260et r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f3274 = r0
            r2.f3275 = r0
            r2.f3276 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            r2.f3277 = r0
            r2.f3270 = r3
            r2.f3271 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m1799(android.view.MotionEvent r28, int r29) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            int r3 = r1.getSource()
            int r4 = r1.getDeviceId()
            int r5 = r0.f3275
            r6 = 34
            r8 = 4194304(0x400000, float:5.877472E-39)
            int[] r10 = r0.f3277
            if (r5 != r3) goto L28
            int r5 = r0.f3276
            if (r5 != r4) goto L28
            int r5 = r0.f3274
            if (r5 == r2) goto L21
            goto L28
        L21:
            r12 = 0
            r16 = 1
            r17 = 0
            goto Lcb
        L28:
            android.content.Context r5 = r0.f3270
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
            int r14 = p000.AbstractC1117.m7295(r13, r14, r2, r15)
            goto L7c
        L48:
            android.view.InputDevice r14 = android.view.InputDevice.getDevice(r14)
            if (r14 == 0) goto L79
            android.view.InputDevice$MotionRange r14 = r14.getMotionRange(r2, r15)
            if (r14 == 0) goto L79
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
            java.util.Objects.requireNonNull(r13)
            if (r15 == r9) goto L74
            if (r15 == 0) goto L79
            int r14 = r14.getDimensionPixelSize(r15)
            if (r14 >= 0) goto L7c
            goto L79
        L74:
            int r14 = r13.getScaledMinimumFlingVelocity()
            goto L7c
        L79:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L7c:
            r10[r17] = r14
            int r14 = r1.getDeviceId()
            int r15 = r1.getSource()
            if (r11 < r6) goto L8d
            int r5 = p000.AbstractC1117.m7294(r13, r14, r2, r15)
            goto Lc1
        L8d:
            android.view.InputDevice r11 = android.view.InputDevice.getDevice(r14)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto Lc0
            android.view.InputDevice$MotionRange r11 = r11.getMotionRange(r2, r15)
            if (r11 == 0) goto Lc0
            android.content.res.Resources r5 = r5.getResources()
            if (r15 != r8) goto Lac
            r15 = 26
            if (r2 != r15) goto Lac
            java.lang.String r11 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r7 = r5.getIdentifier(r11, r7, r12)
            goto Lad
        Lac:
            r7 = r9
        Lad:
            java.util.Objects.requireNonNull(r13)
            if (r7 == r9) goto Lbb
            if (r7 == 0) goto Lc0
            int r5 = r5.getDimensionPixelSize(r7)
            if (r5 >= 0) goto Lc1
            goto Lc0
        Lbb:
            int r5 = r13.getScaledMaximumFlingVelocity()
            goto Lc1
        Lc0:
            r5 = r14
        Lc1:
            r10[r16] = r5
            r0.f3275 = r3
            r0.f3276 = r4
            r0.f3274 = r2
            r12 = r16
        Lcb:
            r3 = r10[r17]
            android.view.VelocityTracker r4 = r0.f3272
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r5) goto Ldd
            if (r4 == 0) goto L29c
            r4.recycle()
            r1 = 0
            r0.f3272 = r1
            return
        Ldd:
            if (r4 != 0) goto Le5
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r0.f3272 = r3
        Le5:
            android.view.VelocityTracker r3 = r0.f3272
            java.util.Map r4 = p000.o72.f7976
            r3.addMovement(r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r7 = 20
            if (r4 < r6) goto Lf4
            goto L149
        Lf4:
            int r4 = r1.getSource()
            if (r4 != r8) goto L149
            java.util.Map r4 = p000.o72.f7976
            boolean r8 = r4.containsKey(r3)
            if (r8 != 0) goto L10a
            p72 r8 = new p72
            r8.<init>()
            r4.put(r3, r8)
        L10a:
            java.lang.Object r4 = r4.get(r3)
            p72 r4 = (p000.p72) r4
            long[] r8 = r4.f8449
            long r13 = r1.getEventTime()
            int r9 = r4.f8451
            if (r9 == 0) goto L12c
            int r9 = r4.f8452
            r19 = r8[r9]
            long r19 = r13 - r19
            r21 = 40
            int r9 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r9 <= 0) goto L12c
            r9 = r17
            r4.f8451 = r9
            r4.f8450 = r5
        L12c:
            int r9 = r4.f8452
            int r9 = r9 + 1
            int r9 = r9 % r7
            r4.f8452 = r9
            int r11 = r4.f8451
            if (r11 == r7) goto L13b
            int r11 = r11 + 1
            r4.f8451 = r11
        L13b:
            float[] r11 = r4.f8448
            r15 = 26
            float r1 = r1.getAxisValue(r15)
            r11[r9] = r1
            int r1 = r4.f8452
            r8[r1] = r13
        L149:
            r1 = 1000(0x3e8, float:1.401E-42)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.computeCurrentVelocity(r1, r4)
            java.util.Map r8 = p000.o72.f7976
            java.lang.Object r8 = r8.get(r3)
            p72 r8 = (p000.p72) r8
            if (r8 == 0) goto L241
            float[] r9 = r8.f8448
            long[] r11 = r8.f8449
            int r13 = r8.f8451
            r14 = 2
            if (r13 >= r14) goto L16b
        L164:
            r28 = r4
            r7 = r5
            r24 = r7
            goto L21b
        L16b:
            int r15 = r8.f8452
            int r18 = r15 + 20
            int r13 = r13 + (-1)
            int r18 = r18 - r13
            int r18 = r18 % 20
            r19 = r11[r15]
        L177:
            r21 = r11[r18]
            long r23 = r19 - r21
            r25 = 100
            int r13 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            int r15 = r8.f8451
            if (r13 <= 0) goto L18c
            int r15 = r15 + (-1)
            r8.f8451 = r15
            int r18 = r18 + 1
            int r18 = r18 % 20
            goto L177
        L18c:
            if (r15 >= r14) goto L18f
            goto L164
        L18f:
            if (r15 != r14) goto L1a8
            int r18 = r18 + 1
            int r18 = r18 % 20
            r13 = r11[r18]
            int r7 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r7 != 0) goto L19c
            goto L164
        L19c:
            r7 = r9[r18]
            long r13 = r13 - r21
            float r9 = (float) r13
            float r7 = r7 / r9
            r28 = r4
            r24 = r5
            goto L21b
        L1a8:
            r28 = r4
            r15 = r5
            r13 = 0
            r14 = 0
        L1ad:
            int r4 = r8.f8451
            int r4 = r4 + (-1)
            r19 = 1073741824(0x40000000, float:2.0)
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r13 >= r4) goto L205
            int r4 = r13 + r18
            int r22 = r4 % 20
            r22 = r11[r22]
            int r4 = r4 + 1
            int r4 = r4 % r7
            r24 = r11[r4]
            int r24 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1))
            if (r24 != 0) goto L1cb
            r24 = r5
            goto L1fa
        L1cb:
            int r14 = r14 + 1
            int r24 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r24 >= 0) goto L1d3
            r20 = r21
        L1d3:
            float r21 = java.lang.Math.abs(r15)
            r24 = r5
            float r5 = r21 * r19
            double r6 = (double) r5
            double r5 = java.lang.Math.sqrt(r6)
            float r5 = (float) r5
            float r20 = r20 * r5
            r5 = r9[r4]
            r6 = r11[r4]
            long r6 = r6 - r22
            float r4 = (float) r6
            float r5 = r5 / r4
            float r4 = r5 - r20
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 * r4
            float r15 = r15 + r5
            r4 = r16
            if (r14 != r4) goto L1fa
            r4 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r4
        L1fa:
            int r13 = r13 + 1
            r5 = r24
            r6 = 34
            r7 = 20
            r16 = 1
            goto L1ad
        L205:
            r24 = r5
            int r4 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
            if (r4 >= 0) goto L20d
            r20 = r21
        L20d:
            float r4 = java.lang.Math.abs(r15)
            float r4 = r4 * r19
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r7 = r20 * r4
        L21b:
            float r1 = (float) r1
            float r7 = r7 * r1
            r8.f8450 = r7
            float r1 = java.lang.Math.abs(r28)
            float r1 = -r1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L230
            float r1 = java.lang.Math.abs(r28)
            float r1 = -r1
            r8.f8450 = r1
            goto L243
        L230:
            float r1 = r8.f8450
            float r4 = java.lang.Math.abs(r28)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L243
            float r1 = java.lang.Math.abs(r28)
            r8.f8450 = r1
            goto L243
        L241:
            r24 = r5
        L243:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r1 < r4) goto L24e
            float r1 = p000.AbstractC1117.m7291(r3, r2)
            goto L271
        L24e:
            if (r2 != 0) goto L255
            float r1 = r3.getXVelocity()
            goto L271
        L255:
            r4 = 1
            if (r2 != r4) goto L25d
            float r1 = r3.getYVelocity()
            goto L271
        L25d:
            java.util.Map r1 = p000.o72.f7976
            java.lang.Object r1 = r1.get(r3)
            p72 r1 = (p000.p72) r1
            if (r1 == 0) goto L26f
            r15 = 26
            if (r2 == r15) goto L26c
            goto L26f
        L26c:
            float r1 = r1.f8450
            goto L271
        L26f:
            r1 = r24
        L271:
            et r2 = r0.f3271
            float r3 = r2.mo1956()
            float r3 = r3 * r1
            float r1 = java.lang.Math.signum(r3)
            if (r12 != 0) goto L28c
            float r4 = r0.f3273
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L28f
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 == 0) goto L28f
        L28c:
            r2.mo1957()
        L28f:
            float r1 = java.lang.Math.abs(r3)
            r17 = 0
            r4 = r10[r17]
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L29d
        L29c:
            return
        L29d:
            r16 = 1
            r1 = r10[r16]
            int r4 = -r1
            float r4 = (float) r4
            float r1 = (float) r1
            float r1 = java.lang.Math.min(r3, r1)
            float r1 = java.lang.Math.max(r4, r1)
            boolean r2 = r2.mo1955(r1)
            if (r2 == 0) goto L2b4
            r5 = r1
            goto L2b6
        L2b4:
            r5 = r24
        L2b6:
            r0.f3273 = r5
            return
    }
}
