package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ defpackage.r5 a;

    public o2(defpackage.r5 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r29) {
            r28 = this;
            r0 = r28
            r5 r1 = r0.a
            java.lang.Object r1 = r1.b
            l0 r1 = (defpackage.l0) r1
            java.lang.Object r1 = r1.b
            p2 r1 = (defpackage.p2) r1
            long r2 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r4 = r1.b
            long r5 = android.os.SystemClock.uptimeMillis()
            r8 = 0
        L17:
            int r9 = r4.size()
            if (r8 >= r9) goto L116
            java.lang.Object r9 = r4.get(r8)
            h40 r9 = (defpackage.h40) r9
            if (r9 != 0) goto L28
        L25:
            r15 = r8
            goto L112
        L28:
            u30 r11 = r1.a
            r12 = 0
            java.lang.Object r12 = r11.getOrDefault(r9, r12)
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 != 0) goto L34
            goto L3f
        L34:
            long r12 = r12.longValue()
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L25
            r11.remove(r9)
        L3f:
            long r11 = r9.f
            r13 = 0
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 != 0) goto L4f
            r9.f = r2
            float r10 = r9.b
            r9.g(r10)
            goto L25
        L4f:
            long r16 = r2 - r11
            r9.f = r2
            float r11 = r9.k
            r12 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 == 0) goto L9e
            i40 r11 = r9.j
            double r13 = r11.i
            float r13 = r9.b
            double r13 = (double) r13
            float r15 = r9.a
            r18 = r11
            r29 = 1
            double r10 = (double) r15
            r19 = 2
            long r23 = r16 / r19
            r21 = r10
            r19 = r13
            rh r10 = r18.c(r19, r21, r23)
            i40 r11 = r9.j
            float r13 = r9.k
            double r13 = (double) r13
            r11.i = r13
            r9.k = r12
            float r13 = r10.a
            double r13 = (double) r13
            float r10 = r10.b
            r15 = r13
            double r12 = (double) r10
            r21 = r11
            r26 = r23
            r24 = r12
            r22 = r15
            rh r10 = r21.c(r22, r24, r26)
            float r11 = r10.a
            r9.b = r11
            float r10 = r10.b
            r9.a = r10
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto Lb7
        L9e:
            r29 = 1
            i40 r11 = r9.j
            float r10 = r9.b
            double r12 = (double) r10
            float r10 = r9.a
            double r14 = (double) r10
            r10 = 2139095039(0x7f7fffff, float:3.4028235E38)
            rh r11 = r11.c(r12, r14, r16)
            float r12 = r11.a
            r9.b = r12
            float r11 = r11.b
            r9.a = r11
        Lb7:
            float r11 = r9.b
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r11 = java.lang.Math.max(r11, r12)
            r9.b = r11
            float r11 = java.lang.Math.min(r11, r10)
            r9.b = r11
            float r13 = r9.a
            i40 r14 = r9.j
            r14.getClass()
            float r13 = java.lang.Math.abs(r13)
            r15 = r8
            double r7 = (double) r13
            double r12 = r14.e
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 >= 0) goto Lf7
            double r7 = r14.i
            float r7 = (float) r7
            float r11 = r11 - r7
            float r7 = java.lang.Math.abs(r11)
            double r7 = (double) r7
            double r11 = r14.d
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto Lf7
            i40 r7 = r9.j
            double r7 = r7.i
            float r7 = (float) r7
            r9.b = r7
            r7 = 0
            r9.a = r7
            r7 = r29
            goto Lf8
        Lf7:
            r7 = 0
        Lf8:
            float r8 = r9.b
            float r8 = java.lang.Math.min(r8, r10)
            r9.b = r8
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r8 = java.lang.Math.max(r8, r10)
            r9.b = r8
            r9.g(r8)
            if (r7 == 0) goto L112
            r7 = 0
            r9.d(r7)
        L112:
            int r8 = r15 + 1
            goto L17
        L116:
            r29 = 1
            boolean r2 = r1.e
            if (r2 == 0) goto L133
            int r2 = r4.size()
            int r2 = r2 + (-1)
        L122:
            if (r2 < 0) goto L130
            java.lang.Object r3 = r4.get(r2)
            if (r3 != 0) goto L12d
            r4.remove(r2)
        L12d:
            int r2 = r2 + (-1)
            goto L122
        L130:
            r7 = 0
            r1.e = r7
        L133:
            int r2 = r4.size()
            if (r2 <= 0) goto L153
            r5 r2 = r1.d
            if (r2 != 0) goto L146
            r5 r2 = new r5
            l0 r3 = r1.c
            r2.<init>(r3)
            r1.d = r2
        L146:
            r5 r1 = r1.d
            java.lang.Object r2 = r1.c
            android.view.Choreographer r2 = (android.view.Choreographer) r2
            java.lang.Object r1 = r1.d
            o2 r1 = (defpackage.o2) r1
            r2.postFrameCallback(r1)
        L153:
            return
    }
}
