package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h8 extends android.view.View {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f448;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f449;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f450;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public float f451;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public android.graphics.Paint f452;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public float f453;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f454;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public int f455;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public int f456;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public int f457;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public int f458;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public android.graphics.PorterDuffXfermode f459;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public float f460;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public ۟.h8.a f461;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public ۟.h8.d f462;

    public class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.h8 f463;

        public a(p000.h8 r1) {
                r0 = this;
                r0.f463 = r1
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo194(android.graphics.Canvas r4) {
                r3 = this;
                ۟.h8 r0 = r3.f463
                boolean r1 = r0.f454
                if (r1 == 0) goto Lb
                android.graphics.Paint r1 = r0.f452
                int r0 = r0.f455
                goto Lf
            Lb:
                android.graphics.Paint r1 = r0.f452
                int r0 = r0.f456
            Lf:
                r1.setColor(r0)
                ۟.h8 r0 = r3.f463
                float r1 = r0.f451
                android.graphics.Paint r0 = r0.f452
                r2 = 0
                r4.drawCircle(r2, r2, r1, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo195(android.graphics.Canvas r5) {
                r4 = this;
                ۟.h8 r0 = r4.f463
                boolean r1 = r0.f454
                if (r1 == 0) goto Lb
                android.graphics.Paint r1 = r0.f452
                int r0 = r0.f457
                goto Lf
            Lb:
                android.graphics.Paint r1 = r0.f452
                int r0 = r0.f458
            Lf:
                r1.setColor(r0)
                ۟.h8 r0 = r4.f463
                android.graphics.Paint r0 = r0.f452
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
                r0.setStyle(r1)
                r5.save()
                ۟.h8 r0 = r4.f463
                float r0 = r0.f451
                r1 = 1090519040(0x41000000, float:8.0)
                float r1 = r0 / r1
                float r1 = -r1
                r2 = 1077936128(0x40400000, float:3.0)
                float r0 = r0 / r2
                r5.translate(r1, r0)
                r0 = -1036779520(0xffffffffc2340000, float:-45.0)
                r5.rotate(r0)
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r0.reset()
                r1 = 0
                r0.moveTo(r1, r1)
                ۟.h8 r2 = r4.f463
                float r2 = r2.f453
                r0.lineTo(r2, r1)
                r0.moveTo(r1, r1)
                ۟.h8 r2 = r4.f463
                float r2 = r2.f453
                float r2 = -r2
                r3 = 1073741824(0x40000000, float:2.0)
                float r2 = r2 / r3
                r0.lineTo(r1, r2)
                ۟.h8 r1 = r4.f463
                android.graphics.Paint r1 = r1.f452
                r5.drawPath(r0, r1)
                r5.restore()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo196(android.graphics.Canvas r8) {
                r7 = this;
                ۟.h8 r0 = r7.f463
                boolean r1 = r0.f454
                if (r1 == 0) goto Lb
                android.graphics.Paint r1 = r0.f452
                int r0 = r0.f455
                goto Lf
            Lb:
                android.graphics.Paint r1 = r0.f452
                int r0 = r0.f456
            Lf:
                r1.setColor(r0)
                ۟.h8 r0 = r7.f463
                float r5 = r0.f451
                float r2 = -r5
                float r3 = -r5
                android.graphics.Paint r6 = r0.f452
                r1 = r8
                r4 = r5
                r1.drawRect(r2, r3, r4, r5, r6)
                return
        }
    }

    public class b extends ۟.h8.a {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ p000.h8 f464;

        public b(p000.h8 r1) {
                r0 = this;
                r0.f464 = r1
                r0.<init>(r1)
                return
        }

        @Override // ۟.h8.a
        /* JADX INFO: renamed from: ۥ */
        public final void mo194(android.graphics.Canvas r3) {
                r2 = this;
                ۟.h8 r0 = r2.f464
                boolean r1 = r0.f454
                android.graphics.Paint r0 = r0.f452
                if (r1 == 0) goto Lb
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
                goto Ld
            Lb:
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            Ld:
                r0.setStyle(r1)
                super.mo194(r3)
                return
        }

        @Override // ۟.h8.a
        /* JADX INFO: renamed from: ۥ۟ */
        public final void mo195(android.graphics.Canvas r3) {
                r2 = this;
                ۟.h8 r0 = r2.f464
                boolean r1 = r0.f454
                if (r1 == 0) goto L18
                android.graphics.Paint r1 = r0.f452
                android.graphics.PorterDuffXfermode r0 = r0.f459
                r1.setXfermode(r0)
                super.mo195(r3)
                ۟.h8 r3 = r2.f464
                android.graphics.Paint r3 = r3.f452
                r0 = 0
                r3.setXfermode(r0)
            L18:
                return
        }

        @Override // ۟.h8.a
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final void mo196(android.graphics.Canvas r3) {
                r2 = this;
                ۟.h8 r0 = r2.f464
                boolean r1 = r0.f454
                android.graphics.Paint r0 = r0.f452
                if (r1 == 0) goto Lb
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
                goto Ld
            Lb:
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            Ld:
                r0.setStyle(r1)
                super.mo196(r3)
                return
        }
    }

    public class c extends ۟.h8.a {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ p000.h8 f465;

        public c(p000.h8 r1) {
                r0 = this;
                r0.f465 = r1
                r0.<init>(r1)
                return
        }

        @Override // ۟.h8.a
        /* JADX INFO: renamed from: ۥ */
        public final void mo194(android.graphics.Canvas r3) {
                r2 = this;
                ۟.h8 r0 = r2.f465
                android.graphics.Paint r0 = r0.f452
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
                r0.setStyle(r1)
                super.mo194(r3)
                return
        }
    }

    public interface d {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo197(boolean r1);
    }

    public class e implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.View.OnClickListener f466;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ p000.h8 f467;

        public e(p000.h8 r1, android.view.View.OnClickListener r2) {
                r0 = this;
                r0.f467 = r1
                r0.<init>()
                r0.f466 = r2
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r3) {
                r2 = this;
                ۟.h8 r0 = r2.f467
                boolean r1 = r0.f454
                r1 = r1 ^ 1
                r0.f454 = r1
                r0.invalidate()
                ۟.h8 r0 = r2.f467
                ۟.h8$d r1 = r0.f462
                if (r1 == 0) goto L16
                boolean r0 = r0.f454
                r1.mo197(r0)
            L16:
                android.view.View$OnClickListener r0 = r2.f466
                if (r0 == 0) goto L1d
                r0.onClick(r3)
            L1d:
                return
        }
    }

    public h8(android.content.Context r9) {
            r8 = this;
            r0 = 0
            r1 = 0
            r8.<init>(r9, r0, r1)
            int r2 = p000.ya.f1213
            r3 = 255(0xff, float:3.57E-43)
            r4 = 234(0xea, float:3.28E-43)
            int r4 = android.graphics.Color.argb(r3, r4, r4, r4)
            r5 = 53
            r6 = 40
            r7 = 33
            int r5 = android.graphics.Color.argb(r3, r5, r6, r7)
            int r3 = android.graphics.Color.argb(r3, r3, r3, r3)
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r6
            int r9 = (int) r9
            float r9 = (float) r9
            r8.f455 = r2
            r8.f456 = r4
            r8.f457 = r5
            r8.f458 = r3
            r2 = 1
            r8.f448 = r2
            r8.f460 = r9
            r8.f454 = r1
            ۟.h8$b r9 = new ۟.h8$b
            r9.<init>(r8)
            r8.f461 = r9
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r8.f452 = r9
            r9.setAntiAlias(r2)
            android.graphics.Paint r9 = r8.f452
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r9.setStyle(r1)
            android.graphics.Paint r9 = r8.f452
            int r1 = r8.f456
            r9.setColor(r1)
            android.graphics.Paint r9 = r8.f452
            float r1 = r8.f460
            r9.setStrokeWidth(r1)
            android.graphics.Paint r9 = r8.f452
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            r9.setStrokeJoin(r1)
            android.graphics.Paint r9 = r8.f452
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r9.setStrokeCap(r1)
            r8.setLayerType(r2, r0)
            android.graphics.PorterDuffXfermode r9 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.XOR
            r9.<init>(r0)
            r8.f459 = r9
            ۟.g8 r9 = new ۟.g8
            r9.<init>()
            r8.setOnClickListener(r9)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            super.onDraw(r10)
            int r0 = r9.f449
            int r0 = -r0
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r0 / r1
            int r0 = r9.f450
            int r0 = -r0
            float r0 = (float) r0
            float r4 = r0 / r1
            int r0 = r9.getWidth()
            float r5 = (float) r0
            int r0 = r9.getHeight()
            float r6 = (float) r0
            r7 = 0
            r8 = 31
            r2 = r10
            int r0 = r2.saveLayer(r3, r4, r5, r6, r7, r8)
            int r2 = r9.f449
            float r2 = (float) r2
            float r2 = r2 / r1
            int r3 = r9.f450
            float r3 = (float) r3
            float r3 = r3 / r1
            r10.translate(r2, r3)
            boolean r1 = r9.f448
            if (r1 == 0) goto L38
            ۟.h8$a r1 = r9.f461
            r1.mo194(r10)
            goto L3d
        L38:
            ۟.h8$a r1 = r9.f461
            r1.mo196(r10)
        L3d:
            ۟.h8$a r1 = r9.f461
            r1.mo195(r10)
            r10.restoreToCount(r0)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 80
            if (r0 != r2) goto L14
            goto L1c
        L14:
            if (r0 != r1) goto L1b
            int r5 = java.lang.Math.min(r3, r5)
            goto L1c
        L1b:
            r5 = r3
        L1c:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            if (r0 != r2) goto L28
            r3 = r6
            goto L2e
        L28:
            if (r0 != r1) goto L2e
            int r3 = java.lang.Math.min(r3, r6)
        L2e:
            r4.setMeasuredDimension(r5, r3)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            r0.f449 = r1
            r0.f450 = r2
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r3 = 1063675494(0x3f666666, float:0.9)
            float r1 = r1 * r3
            r0.f451 = r1
            int r1 = r0.f449
            int r3 = r0.f450
            int r1 = java.lang.Math.min(r1, r3)
            float r1 = (float) r1
            float r1 = r1 / r2
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 * r2
            r0.f453 = r1
            return
    }

    public void setCircle(boolean r1) {
            r0 = this;
            r0.f448 = r1
            return
    }

    public void setOnCheckedChangeListener(۟.h8.d r1) {
            r0 = this;
            r0.f462 = r1
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            ۟.h8$e r0 = new ۟.h8$e
            r0.<init>(r1, r2)
            super.setOnClickListener(r0)
            return
    }

    public void setStyle(int r2) {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto L9
            ۟.h8$b r2 = new ۟.h8$b
            r2.<init>(r1)
            goto L11
        L9:
            r0 = 1
            if (r2 != r0) goto L13
            ۟.h8$c r2 = new ۟.h8$c
            r2.<init>(r1)
        L11:
            r1.f461 = r2
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m193(boolean r2) {
            r1 = this;
            r1.f454 = r2
            ۟.h8$d r0 = r1.f462
            if (r0 == 0) goto L9
            r0.mo197(r2)
        L9:
            r1.postInvalidate()
            return
    }
}
