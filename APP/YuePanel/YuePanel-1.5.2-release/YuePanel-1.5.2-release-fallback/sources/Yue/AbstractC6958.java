package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6958 extends Yue.AbstractC6435 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f24236 = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f24237 = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String[] f24238 = null;

    static {
            java.lang.String r0 = "android:visibilityPropagation:visibility"
            java.lang.String r1 = "android:visibilityPropagation:center"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            Yue.AbstractC6958.f24238 = r0
            return
    }

    public AbstractC6958() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m26893(@Yue.InterfaceC4544 Yue.C6447 r2, int r3) {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f22708
            java.lang.String r1 = "android:visibilityPropagation:center"
            java.lang.Object r2 = r2.get(r1)
            int[] r2 = (int[]) r2
            if (r2 != 0) goto L11
            return r0
        L11:
            r2 = r2[r3]
            return r2
    }

    @Override // Yue.AbstractC6435
    /* JADX INFO: renamed from: ۥ */
    public void mo23712(@Yue.InterfaceC4410 Yue.C6447 r7) {
            r6 = this;
            android.view.View r0 = r7.f22709
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.f22708
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L16
            int r1 = r0.getVisibility()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L16:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.f22708
            java.lang.String r3 = "android:visibilityPropagation:visibility"
            r2.put(r3, r1)
            r1 = 2
            int[] r2 = new int[r1]
            r0.getLocationOnScreen(r2)
            r3 = 0
            r4 = r2[r3]
            float r5 = r0.getTranslationX()
            int r5 = java.lang.Math.round(r5)
            int r4 = r4 + r5
            r2[r3] = r4
            int r5 = r0.getWidth()
            int r5 = r5 / r1
            int r4 = r4 + r5
            r2[r3] = r4
            r3 = 1
            r4 = r2[r3]
            float r5 = r0.getTranslationY()
            int r5 = java.lang.Math.round(r5)
            int r4 = r4 + r5
            r2[r3] = r4
            int r0 = r0.getHeight()
            int r0 = r0 / r1
            int r4 = r4 + r0
            r2[r3] = r4
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f22708
            java.lang.String r0 = "android:visibilityPropagation:center"
            r7.put(r0, r2)
            return
    }

    @Override // Yue.AbstractC6435
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String[] mo23713() {
            r1 = this;
            java.lang.String[] r0 = Yue.AbstractC6958.f24238
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m26894(@Yue.InterfaceC4544 Yue.C6447 r3) {
            r2 = this;
            r0 = 8
            if (r3 != 0) goto L5
            return r0
        L5:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f22708
            java.lang.String r1 = "android:visibilityPropagation:visibility"
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L12
            return r0
        L12:
            int r3 = r3.intValue()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m26895(@Yue.InterfaceC4544 Yue.C6447 r2) {
            r1 = this;
            r0 = 0
            int r2 = m26893(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m26896(@Yue.InterfaceC4544 Yue.C6447 r2) {
            r1 = this;
            r0 = 1
            int r2 = m26893(r2, r0)
            return r2
    }
}
