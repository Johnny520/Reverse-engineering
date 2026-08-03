package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0952 implements Yue.InterfaceC0955 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.RectF f2718;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۡ$ۥ, reason: contains not printable characters */
    public class C0953 implements Yue.C5430.InterfaceC5431 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0952 f2719;

        public C0953(Yue.C0952 r1) {
                r0 = this;
                r0.f2719 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C5430.InterfaceC5431
        /* JADX INFO: renamed from: ۥ */
        public void mo5389(android.graphics.Canvas r17, android.graphics.RectF r18, float r19, android.graphics.Paint r20) {
                r16 = this;
                r0 = r16
                r7 = r17
                r8 = r18
                r1 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 * r19
                float r2 = r18.width()
                float r2 = r2 - r1
                r9 = 1065353216(0x3f800000, float:1.0)
                float r10 = r2 - r9
                float r2 = r18.height()
                float r2 = r2 - r1
                float r11 = r2 - r9
                int r1 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
                if (r1 < 0) goto La0
                r1 = 1056964608(0x3f000000, float:0.5)
                float r12 = r19 + r1
                Yue.ۥ۟ۤ۟ۡ r1 = r0.f2719
                android.graphics.RectF r1 = r1.f2718
                float r2 = -r12
                r1.set(r2, r2, r12, r12)
                int r13 = r17.save()
                float r1 = r8.left
                float r1 = r1 + r12
                float r2 = r8.top
                float r2 = r2 + r12
                r7.translate(r1, r2)
                Yue.ۥ۟ۤ۟ۡ r1 = r0.f2719
                android.graphics.RectF r2 = r1.f2718
                r4 = 1119092736(0x42b40000, float:90.0)
                r5 = 1
                r3 = 1127481344(0x43340000, float:180.0)
                r1 = r17
                r6 = r20
                r1.drawArc(r2, r3, r4, r5, r6)
                r14 = 0
                r7.translate(r10, r14)
                r15 = 1119092736(0x42b40000, float:90.0)
                r7.rotate(r15)
                Yue.ۥ۟ۤ۟ۡ r1 = r0.f2719
                android.graphics.RectF r2 = r1.f2718
                r1 = r17
                r1.drawArc(r2, r3, r4, r5, r6)
                r7.translate(r11, r14)
                r7.rotate(r15)
                Yue.ۥ۟ۤ۟ۡ r1 = r0.f2719
                android.graphics.RectF r2 = r1.f2718
                r1 = r17
                r1.drawArc(r2, r3, r4, r5, r6)
                r7.translate(r10, r14)
                r7.rotate(r15)
                Yue.ۥ۟ۤ۟ۡ r1 = r0.f2719
                android.graphics.RectF r2 = r1.f2718
                r1 = r17
                r1.drawArc(r2, r3, r4, r5, r6)
                r7.restoreToCount(r13)
                float r1 = r8.left
                float r1 = r1 + r12
                float r2 = r1 - r9
                float r3 = r8.top
                float r1 = r8.right
                float r1 = r1 - r12
                float r4 = r1 + r9
                float r5 = r3 + r12
                r1 = r17
                r1.drawRect(r2, r3, r4, r5, r6)
                float r1 = r8.left
                float r1 = r1 + r12
                float r2 = r1 - r9
                float r5 = r8.bottom
                float r3 = r5 - r12
                float r1 = r8.right
                float r1 = r1 - r12
                float r4 = r1 + r9
                r1 = r17
                r1.drawRect(r2, r3, r4, r5, r6)
            La0:
                float r2 = r8.left
                float r1 = r8.top
                float r3 = r1 + r19
                float r4 = r8.right
                float r1 = r8.bottom
                float r5 = r1 - r19
                r1 = r17
                r6 = r20
                r1.drawRect(r2, r3, r4, r5, r6)
                return
        }
    }

    public C0952() {
            r1 = this;
            r1.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.f2718 = r0
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ */
    public void mo5390(Yue.InterfaceC0954 r2, float r3) {
            r1 = this;
            Yue.ۥۡۧ۠۟ r0 = r1.m5406(r2)
            r0.m20481(r3)
            r1.mo5395(r2)
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo5391(Yue.InterfaceC0954 r1) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            float r1 = r1.m20474()
            return r1
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo5392(Yue.InterfaceC0954 r1) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            float r1 = r1.m20475()
            return r1
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public float mo5393(Yue.InterfaceC0954 r1) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            float r1 = r1.m20477()
            return r1
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo5394(Yue.InterfaceC0954 r3) {
            r2 = this;
            Yue.ۥۡۧ۠۟ r0 = r2.m5406(r3)
            boolean r1 = r3.mo5409()
            r0.m20478(r1)
            r2.mo5395(r3)
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo5395(Yue.InterfaceC0954 r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            Yue.ۥۡۧ۠۟ r1 = r4.m5406(r5)
            r1.m20473(r0)
            float r1 = r4.mo5400(r5)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = r4.mo5392(r5)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r5.mo5407(r1, r2)
            int r1 = r0.left
            int r2 = r0.top
            int r3 = r0.right
            int r0 = r0.bottom
            r5.setShadowPadding(r1, r2, r3, r0)
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo5396(Yue.InterfaceC0954 r2, float r3) {
            r1 = this;
            Yue.ۥۡۧ۠۟ r0 = r1.m5406(r2)
            r0.m20482(r3)
            r1.mo5395(r2)
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo5397(Yue.InterfaceC0954 r1, @Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            r1.m20480(r2)
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public android.content.res.ColorStateList mo5398(Yue.InterfaceC0954 r1) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            android.content.res.ColorStateList r1 = r1.m20471()
            return r1
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo5399(Yue.InterfaceC0954 r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public float mo5400(Yue.InterfaceC0954 r1) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            float r1 = r1.m20476()
            return r1
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo5401(Yue.InterfaceC0954 r7, android.content.Context r8, android.content.res.ColorStateList r9, float r10, float r11, float r12) {
            r6 = this;
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            Yue.ۥۡۧ۠۟ r8 = r0.m5405(r1, r2, r3, r4, r5)
            boolean r9 = r7.mo5409()
            r8.m20478(r9)
            r7.mo5408(r8)
            r6.mo5395(r7)
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public float mo5402(Yue.InterfaceC0954 r1) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            float r1 = r1.m20472()
            return r1
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo5403(Yue.InterfaceC0954 r1, float r2) {
            r0 = this;
            Yue.ۥۡۧ۠۟ r1 = r0.m5406(r1)
            r1.m20483(r2)
            return
    }

    @Override // Yue.InterfaceC0955
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo5388() {
            r1 = this;
            Yue.ۥ۟ۤ۟ۡ$ۥ r0 = new Yue.ۥ۟ۤ۟ۡ$ۥ
            r0.<init>(r1)
            Yue.C5430.f20128 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final Yue.C5430 m5405(android.content.Context r8, android.content.res.ColorStateList r9, float r10, float r11, float r12) {
            r7 = this;
            Yue.ۥۡۧ۠۟ r6 = new Yue.ۥۡۧ۠۟
            android.content.res.Resources r1 = r8.getResources()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final Yue.C5430 m5406(Yue.InterfaceC0954 r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.mo5411()
            Yue.ۥۡۧ۠۟ r1 = (Yue.C5430) r1
            return r1
    }
}
