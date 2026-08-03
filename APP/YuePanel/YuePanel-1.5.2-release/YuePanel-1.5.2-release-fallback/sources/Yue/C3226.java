package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3226 extends Yue.C0468 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C3226.C3229 f10569;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f10570;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public float f10571;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public float f10572;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public float f10573;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.graphics.Path f10574;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public android.view.ViewOutlineProvider f10575;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public android.graphics.RectF f10576;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.graphics.drawable.Drawable[] f10577;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public android.graphics.drawable.LayerDrawable f10578;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ$ۥ, reason: contains not printable characters */
    public class C3227 extends android.view.ViewOutlineProvider {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3226 f10579;

        public C3227(Yue.C3226 r1) {
                r0 = this;
                r0.f10579 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View r7, android.graphics.Outline r8) {
                r6 = this;
                Yue.ۥ۠ۥ۠ۧ r7 = r6.f10579
                int r3 = r7.getWidth()
                Yue.ۥ۠ۥ۠ۧ r7 = r6.f10579
                int r4 = r7.getHeight()
                int r7 = java.lang.Math.min(r3, r4)
                float r7 = (float) r7
                Yue.ۥ۠ۥ۠ۧ r0 = r6.f10579
                float r0 = Yue.C3226.m13637(r0)
                float r7 = r7 * r0
                r0 = 1073741824(0x40000000, float:2.0)
                float r5 = r7 / r0
                r1 = 0
                r2 = 0
                r0 = r8
                r0.setRoundRect(r1, r2, r3, r4, r5)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ$ۥ۟, reason: contains not printable characters */
    public class C3228 extends android.view.ViewOutlineProvider {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3226 f10580;

        public C3228(Yue.C3226 r1) {
                r0 = this;
                r0.f10580 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View r7, android.graphics.Outline r8) {
                r6 = this;
                Yue.ۥ۠ۥ۠ۧ r7 = r6.f10580
                int r3 = r7.getWidth()
                Yue.ۥ۠ۥ۠ۧ r7 = r6.f10580
                int r4 = r7.getHeight()
                Yue.ۥ۠ۥ۠ۧ r7 = r6.f10580
                float r5 = Yue.C3226.m13638(r7)
                r1 = 0
                r2 = 0
                r0 = r8
                r0.setRoundRect(r1, r2, r3, r4, r5)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C3229 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public float[] f10581;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.graphics.ColorMatrix f10582;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.graphics.ColorMatrix f10583;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f10584;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f10585;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f10586;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float f10587;

        public C3229() {
                r1 = this;
                r1.<init>()
                r0 = 20
                float[] r0 = new float[r0]
                r1.f10581 = r0
                android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
                r0.<init>()
                r1.f10582 = r0
                android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
                r0.<init>()
                r1.f10583 = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.f10584 = r0
                r1.f10585 = r0
                r1.f10586 = r0
                r1.f10587 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m13640(float r4) {
                r3 = this;
                float[] r0 = r3.f10581
                r1 = 0
                r0[r1] = r4
                r1 = 1
                r2 = 0
                r0[r1] = r2
                r1 = 2
                r0[r1] = r2
                r1 = 3
                r0[r1] = r2
                r1 = 4
                r0[r1] = r2
                r1 = 5
                r0[r1] = r2
                r1 = 6
                r0[r1] = r4
                r1 = 7
                r0[r1] = r2
                r1 = 8
                r0[r1] = r2
                r1 = 9
                r0[r1] = r2
                r1 = 10
                r0[r1] = r2
                r1 = 11
                r0[r1] = r2
                r1 = 12
                r0[r1] = r4
                r4 = 13
                r0[r4] = r2
                r4 = 14
                r0[r4] = r2
                r4 = 15
                r0[r4] = r2
                r4 = 16
                r0[r4] = r2
                r4 = 17
                r0[r4] = r2
                r4 = 18
                r1 = 1065353216(0x3f800000, float:1.0)
                r0[r4] = r1
                r4 = 19
                r0[r4] = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m13641(float r9) {
                r8 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r1 = r0 - r9
                r2 = 1050250366(0x3e998c7e, float:0.2999)
                float r2 = r2 * r1
                r3 = 1058424226(0x3f1645a2, float:0.587)
                float r3 = r3 * r1
                r4 = 1038710997(0x3de978d5, float:0.114)
                float r1 = r1 * r4
                float[] r4 = r8.f10581
                r5 = 0
                float r6 = r2 + r9
                r4[r5] = r6
                r5 = 1
                r4[r5] = r3
                r5 = 2
                r4[r5] = r1
                r5 = 3
                r6 = 0
                r4[r5] = r6
                r5 = 4
                r4[r5] = r6
                r5 = 5
                r4[r5] = r2
                r5 = 6
                float r7 = r3 + r9
                r4[r5] = r7
                r5 = 7
                r4[r5] = r1
                r5 = 8
                r4[r5] = r6
                r5 = 9
                r4[r5] = r6
                r5 = 10
                r4[r5] = r2
                r2 = 11
                r4[r2] = r3
                r2 = 12
                float r1 = r1 + r9
                r4[r2] = r1
                r9 = 13
                r4[r9] = r6
                r9 = 14
                r4[r9] = r6
                r9 = 15
                r4[r9] = r6
                r9 = 16
                r4[r9] = r6
                r9 = 17
                r4[r9] = r6
                r9 = 18
                r4[r9] = r0
                r9 = 19
                r4[r9] = r6
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m13642(android.widget.ImageView r6) {
                r5 = this;
                android.graphics.ColorMatrix r0 = r5.f10582
                r0.reset()
                float r0 = r5.f10585
                r1 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                r3 = 1
                if (r2 == 0) goto L1a
                r5.m13641(r0)
                android.graphics.ColorMatrix r0 = r5.f10582
                float[] r2 = r5.f10581
                r0.set(r2)
                r0 = r3
                goto L1b
            L1a:
                r0 = 0
            L1b:
                float r2 = r5.f10586
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L2e
                android.graphics.ColorMatrix r0 = r5.f10583
                r0.setScale(r2, r2, r2, r1)
                android.graphics.ColorMatrix r0 = r5.f10582
                android.graphics.ColorMatrix r2 = r5.f10583
                r0.postConcat(r2)
                r0 = r3
            L2e:
                float r2 = r5.f10587
                int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r4 == 0) goto L46
                r5.m13643(r2)
                android.graphics.ColorMatrix r0 = r5.f10583
                float[] r2 = r5.f10581
                r0.set(r2)
                android.graphics.ColorMatrix r0 = r5.f10582
                android.graphics.ColorMatrix r2 = r5.f10583
                r0.postConcat(r2)
                r0 = r3
            L46:
                float r2 = r5.f10584
                int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r1 == 0) goto L5e
                r5.m13640(r2)
                android.graphics.ColorMatrix r0 = r5.f10583
                float[] r1 = r5.f10581
                r0.set(r1)
                android.graphics.ColorMatrix r0 = r5.f10582
                android.graphics.ColorMatrix r1 = r5.f10583
                r0.postConcat(r1)
                goto L5f
            L5e:
                r3 = r0
            L5f:
                if (r3 == 0) goto L6c
                android.graphics.ColorMatrixColorFilter r0 = new android.graphics.ColorMatrixColorFilter
                android.graphics.ColorMatrix r1 = r5.f10582
                r0.<init>(r1)
                r6.setColorFilter(r0)
                goto L6f
            L6c:
                r6.clearColorFilter()
            L6f:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m13643(float r12) {
                r11 = this;
                r0 = 0
                int r1 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r1 > 0) goto L8
                r12 = 1008981770(0x3c23d70a, float:0.01)
            L8:
                r1 = 1167867904(0x459c4000, float:5000.0)
                float r1 = r1 / r12
                r12 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 / r12
                r12 = 1115947008(0x42840000, float:66.0)
                int r2 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                r3 = 1126243996(0x43211e9c, float:161.11957)
                r4 = 1120334093(0x42c6f10d, float:99.4708)
                r5 = 1132396544(0x437f0000, float:255.0)
                if (r2 <= 0) goto L3f
                r2 = 1114636288(0x42700000, float:60.0)
                float r2 = r1 - r2
                double r6 = (double) r2
                r8 = -4629404809370271744(0xbfc10cda80000000, double:-0.13320475816726685)
                double r8 = java.lang.Math.pow(r6, r8)
                float r2 = (float) r8
                r8 = 1134877040(0x43a4d970, float:329.69873)
                float r2 = r2 * r8
                r8 = 4590105838747648000(0x3fb354f0e0000000, double:0.07551484555006027)
                double r6 = java.lang.Math.pow(r6, r8)
                float r6 = (float) r6
                r7 = 1133514659(0x43900fa3, float:288.12216)
                float r6 = r6 * r7
                goto L49
            L3f:
                double r6 = (double) r1
                double r6 = java.lang.Math.log(r6)
                float r2 = (float) r6
                float r2 = r2 * r4
                float r6 = r2 - r3
                r2 = r5
            L49:
                int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                r7 = 1134069180(0x439885bc, float:305.0448)
                r8 = 1124762762(0x430a848a, float:138.51773)
                if (r12 >= 0) goto L67
                r12 = 1100480512(0x41980000, float:19.0)
                int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r12 <= 0) goto L65
                r12 = 1092616192(0x41200000, float:10.0)
                float r1 = r1 - r12
                double r9 = (double) r1
                double r9 = java.lang.Math.log(r9)
                float r12 = (float) r9
                float r12 = r12 * r8
                float r12 = r12 - r7
                goto L68
            L65:
                r12 = r0
                goto L68
            L67:
                r12 = r5
            L68:
                float r1 = java.lang.Math.max(r2, r0)
                float r1 = java.lang.Math.min(r5, r1)
                float r2 = java.lang.Math.max(r6, r0)
                float r2 = java.lang.Math.min(r5, r2)
                float r12 = java.lang.Math.max(r12, r0)
                float r12 = java.lang.Math.min(r5, r12)
                r6 = 1112014848(0x42480000, float:50.0)
                double r9 = (double) r6
                double r9 = java.lang.Math.log(r9)
                float r6 = (float) r9
                float r6 = r6 * r4
                float r6 = r6 - r3
                r3 = 1109393408(0x42200000, float:40.0)
                double r3 = (double) r3
                double r3 = java.lang.Math.log(r3)
                float r3 = (float) r3
                float r3 = r3 * r8
                float r3 = r3 - r7
                float r4 = java.lang.Math.max(r5, r0)
                float r4 = java.lang.Math.min(r5, r4)
                float r6 = java.lang.Math.max(r6, r0)
                float r6 = java.lang.Math.min(r5, r6)
                float r3 = java.lang.Math.max(r3, r0)
                float r3 = java.lang.Math.min(r5, r3)
                float r1 = r1 / r4
                float r2 = r2 / r6
                float r12 = r12 / r3
                float[] r3 = r11.f10581
                r4 = 0
                r3[r4] = r1
                r1 = 1
                r3[r1] = r0
                r1 = 2
                r3[r1] = r0
                r1 = 3
                r3[r1] = r0
                r1 = 4
                r3[r1] = r0
                r1 = 5
                r3[r1] = r0
                r1 = 6
                r3[r1] = r2
                r1 = 7
                r3[r1] = r0
                r1 = 8
                r3[r1] = r0
                r1 = 9
                r3[r1] = r0
                r1 = 10
                r3[r1] = r0
                r1 = 11
                r3[r1] = r0
                r1 = 12
                r3[r1] = r12
                r12 = 13
                r3[r12] = r0
                r12 = 14
                r3[r12] = r0
                r12 = 15
                r3[r12] = r0
                r12 = 16
                r3[r12] = r0
                r12 = 17
                r3[r12] = r0
                r12 = 18
                r1 = 1065353216(0x3f800000, float:1.0)
                r3[r12] = r1
                r12 = 19
                r3[r12] = r0
                return
        }
    }

    public C3226(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = new Yue.ۥ۠ۥ۠ۧ$ۥ۟۟
            r0.<init>()
            r1.f10569 = r0
            r0 = 1
            r1.f10570 = r0
            r0 = 0
            r1.f10571 = r0
            r1.f10572 = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.f10573 = r0
            r0 = 0
            r1.m13639(r2, r0)
            return
    }

    public C3226(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = new Yue.ۥ۠ۥ۠ۧ$ۥ۟۟
            r0.<init>()
            r1.f10569 = r0
            r0 = 1
            r1.f10570 = r0
            r0 = 0
            r1.f10571 = r0
            r1.f10572 = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.f10573 = r0
            r1.m13639(r2, r3)
            return
    }

    public C3226(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r3 = new Yue.ۥ۠ۥ۠ۧ$ۥ۟۟
            r3.<init>()
            r0.f10569 = r3
            r3 = 1
            r0.f10570 = r3
            r3 = 0
            r0.f10571 = r3
            r0.f10572 = r3
            r3 = 2143289344(0x7fc00000, float:NaN)
            r0.f10573 = r3
            r0.m13639(r1, r2)
            return
    }

    private void setOverlay(boolean r1) {
            r0 = this;
            r0.f10570 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ float m13637(Yue.C3226 r0) {
            float r0 = r0.f10572
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ float m13638(Yue.C3226 r0) {
            float r0 = r0.f10573
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private void m13639(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            if (r8 == 0) goto La6
            android.content.Context r7 = r6.getContext()
            int[] r0 = androidx.constraintlayout.widget.C7473.C7486.f28478
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r0)
            int r8 = r7.getIndexCount()
            int r0 = androidx.constraintlayout.widget.C7473.C7486.f28479
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r1 = 0
            r2 = r1
        L18:
            if (r2 >= r8) goto L76
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28482
            r5 = 0
            if (r3 != r4) goto L2a
            float r3 = r7.getFloat(r3, r5)
            r6.f10571 = r3
            goto L73
        L2a:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28487
            if (r3 != r4) goto L36
            float r3 = r7.getFloat(r3, r5)
            r6.setWarmth(r3)
            goto L73
        L36:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28486
            if (r3 != r4) goto L42
            float r3 = r7.getFloat(r3, r5)
            r6.setSaturation(r3)
            goto L73
        L42:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28481
            if (r3 != r4) goto L4e
            float r3 = r7.getFloat(r3, r5)
            r6.setContrast(r3)
            goto L73
        L4e:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28484
            if (r3 != r4) goto L5a
            float r3 = r7.getDimension(r3, r5)
            r6.setRound(r3)
            goto L73
        L5a:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28485
            if (r3 != r4) goto L66
            float r3 = r7.getFloat(r3, r5)
            r6.setRoundPercent(r3)
            goto L73
        L66:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28483
            if (r3 != r4) goto L73
            boolean r4 = r6.f10570
            boolean r3 = r7.getBoolean(r3, r4)
            r6.setOverlay(r3)
        L73:
            int r2 = r2 + 1
            goto L18
        L76:
            r7.recycle()
            if (r0 == 0) goto La6
            r7 = 2
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]
            r6.f10577 = r7
            android.graphics.drawable.Drawable r8 = r6.getDrawable()
            r7[r1] = r8
            android.graphics.drawable.Drawable[] r7 = r6.f10577
            r8 = 1
            r7[r8] = r0
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r0 = r6.f10577
            r7.<init>(r0)
            r6.f10578 = r7
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r8 = 1132396544(0x437f0000, float:255.0)
            float r0 = r6.f10571
            float r0 = r0 * r8
            int r8 = (int) r0
            r7.setAlpha(r8)
            android.graphics.drawable.LayerDrawable r7 = r6.f10578
            super.setImageDrawable(r7)
        La6:
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            return
    }

    public float getBrightness() {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            float r0 = r0.f10584
            return r0
    }

    public float getContrast() {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            float r0 = r0.f10586
            return r0
    }

    public float getCrossfade() {
            r1 = this;
            float r0 = r1.f10571
            return r0
    }

    public float getRound() {
            r1 = this;
            float r0 = r1.f10573
            return r0
    }

    public float getRoundPercent() {
            r1 = this;
            float r0 = r1.f10572
            return r0
    }

    public float getSaturation() {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            float r0 = r0.f10585
            return r0
    }

    public float getWarmth() {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            float r0 = r0.f10587
            return r0
    }

    public void setBrightness(float r2) {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            r0.f10584 = r2
            r0.m13642(r1)
            return
    }

    public void setContrast(float r2) {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            r0.f10586 = r2
            r0.m13642(r1)
            return
    }

    public void setCrossfade(float r4) {
            r3 = this;
            r3.f10571 = r4
            android.graphics.drawable.Drawable[] r4 = r3.f10577
            if (r4 == 0) goto L30
            boolean r4 = r3.f10570
            r0 = 1132396544(0x437f0000, float:255.0)
            if (r4 != 0) goto L1d
            android.graphics.drawable.LayerDrawable r4 = r3.f10578
            r1 = 0
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3.f10571
            float r1 = r1 - r2
            float r1 = r1 * r0
            int r1 = (int) r1
            r4.setAlpha(r1)
        L1d:
            android.graphics.drawable.LayerDrawable r4 = r3.f10578
            r1 = 1
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r1)
            float r1 = r3.f10571
            float r1 = r1 * r0
            int r0 = (int) r1
            r4.setAlpha(r0)
            android.graphics.drawable.LayerDrawable r4 = r3.f10578
            super.setImageDrawable(r4)
        L30:
            return
    }

    @Yue.InterfaceC5336(21)
    public void setRound(float r5) {
            r4 = this;
            boolean r0 = java.lang.Float.isNaN(r5)
            if (r0 == 0) goto L12
            r4.f10573 = r5
            float r5 = r4.f10572
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.f10572 = r0
            r4.setRoundPercent(r5)
            return
        L12:
            float r0 = r4.f10573
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            r4.f10573 = r5
            r3 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L6b
            android.graphics.Path r5 = r4.f10574
            if (r5 != 0) goto L2f
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            r4.f10574 = r5
        L2f:
            android.graphics.RectF r5 = r4.f10576
            if (r5 != 0) goto L3a
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.f10576 = r5
        L3a:
            android.view.ViewOutlineProvider r5 = r4.f10575
            if (r5 != 0) goto L48
            Yue.ۥ۠ۥ۠ۧ$ۥ۟ r5 = new Yue.ۥ۠ۥ۠ۧ$ۥ۟
            r5.<init>(r4)
            r4.f10575 = r5
            r4.setOutlineProvider(r5)
        L48:
            r4.setClipToOutline(r2)
            int r5 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.RectF r2 = r4.f10576
            float r5 = (float) r5
            float r1 = (float) r1
            r2.set(r3, r3, r5, r1)
            android.graphics.Path r5 = r4.f10574
            r5.reset()
            android.graphics.Path r5 = r4.f10574
            android.graphics.RectF r1 = r4.f10576
            float r2 = r4.f10573
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r1, r2, r2, r3)
            goto L6e
        L6b:
            r4.setClipToOutline(r1)
        L6e:
            if (r0 == 0) goto L73
            r4.invalidateOutline()
        L73:
            return
    }

    @Yue.InterfaceC5336(21)
    public void setRoundPercent(float r6) {
            r5 = this;
            float r0 = r5.f10572
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            r5.f10572 = r6
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L62
            android.graphics.Path r6 = r5.f10574
            if (r6 != 0) goto L1d
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r5.f10574 = r6
        L1d:
            android.graphics.RectF r6 = r5.f10576
            if (r6 != 0) goto L28
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r5.f10576 = r6
        L28:
            android.view.ViewOutlineProvider r6 = r5.f10575
            if (r6 != 0) goto L36
            Yue.ۥ۠ۥ۠ۧ$ۥ r6 = new Yue.ۥ۠ۥ۠ۧ$ۥ
            r6.<init>(r5)
            r5.f10575 = r6
            r5.setOutlineProvider(r6)
        L36:
            r5.setClipToOutline(r2)
            int r6 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = java.lang.Math.min(r6, r1)
            float r2 = (float) r2
            float r4 = r5.f10572
            float r2 = r2 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            android.graphics.RectF r4 = r5.f10576
            float r6 = (float) r6
            float r1 = (float) r1
            r4.set(r3, r3, r6, r1)
            android.graphics.Path r6 = r5.f10574
            r6.reset()
            android.graphics.Path r6 = r5.f10574
            android.graphics.RectF r1 = r5.f10576
            android.graphics.Path$Direction r3 = android.graphics.Path.Direction.CW
            r6.addRoundRect(r1, r2, r2, r3)
            goto L65
        L62:
            r5.setClipToOutline(r1)
        L65:
            if (r0 == 0) goto L6a
            r5.invalidateOutline()
        L6a:
            return
    }

    public void setSaturation(float r2) {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            r0.f10585 = r2
            r0.m13642(r1)
            return
    }

    public void setWarmth(float r2) {
            r1 = this;
            Yue.ۥ۠ۥ۠ۧ$ۥ۟۟ r0 = r1.f10569
            r0.f10587 = r2
            r0.m13642(r1)
            return
    }
}
