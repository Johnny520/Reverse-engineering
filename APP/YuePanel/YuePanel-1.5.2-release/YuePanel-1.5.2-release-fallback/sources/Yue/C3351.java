package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3351 implements Yue.InterfaceC3350 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.InterfaceC3350 f10805 = null;

    static {
            Yue.ۥ۠ۥۨۢ r0 = new Yue.ۥ۠ۥۨۢ
            r0.<init>()
            Yue.C3351.f10805 = r0
            return
    }

    public C3351() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m13958(androidx.recyclerview.widget.RecyclerView r5, android.view.View r6) {
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1b
            android.view.View r3 = r5.getChildAt(r2)
            if (r3 != r6) goto Lf
            goto L18
        Lf:
            float r3 = Yue.C6794.m26131(r3)
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L18
            r1 = r3
        L18:
            int r2 = r2 + 1
            goto L6
        L1b:
            return r1
    }

    @Override // Yue.InterfaceC3350
    /* JADX INFO: renamed from: ۥ */
    public void mo13954(android.view.View r3) {
            r2 = this;
            int r0 = Yue.C5086.C5091.f18262
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L13
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            Yue.C6794.m26237(r3, r0)
        L13:
            int r0 = Yue.C5086.C5091.f18262
            r1 = 0
            r3.setTag(r0, r1)
            r0 = 0
            r3.setTranslationX(r0)
            r3.setTranslationY(r0)
            return
    }

    @Override // Yue.InterfaceC3350
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo13955(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC3350
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo13956(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2, android.view.View r3, float r4, float r5, int r6, boolean r7) {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC3350
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo13957(android.graphics.Canvas r1, androidx.recyclerview.widget.RecyclerView r2, android.view.View r3, float r4, float r5, int r6, boolean r7) {
            r0 = this;
            if (r7 == 0) goto L21
            int r1 = Yue.C5086.C5091.f18262
            java.lang.Object r1 = r3.getTag(r1)
            if (r1 != 0) goto L21
            float r1 = Yue.C6794.m26131(r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6 = 1065353216(0x3f800000, float:1.0)
            float r2 = m13958(r2, r3)
            float r2 = r2 + r6
            Yue.C6794.m26237(r3, r2)
            int r2 = Yue.C5086.C5091.f18262
            r3.setTag(r2, r1)
        L21:
            r3.setTranslationX(r4)
            r3.setTranslationY(r5)
            return
    }
}
