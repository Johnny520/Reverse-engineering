package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tb {
    static {
            return
    }

    public tb() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m424(int r4) {
            int r0 = r4 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            r2 = 1064514355(0x3f733333, float:0.95)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r3 = r4 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 * r2
            int r4 = (int) r4
            int r4 = android.graphics.Color.argb(r0, r1, r3, r4)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.graphics.drawable.GradientDrawable m425(int r3, int r4) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            r0.setShape(r1)
            r0.setGradientType(r1)
            float r3 = (float) r3
            r2 = 8
            float[] r2 = new float[r2]
            r2[r1] = r3
            r1 = 1
            r2[r1] = r3
            r1 = 2
            r2[r1] = r3
            r1 = 3
            r2[r1] = r3
            r3 = 4
            r1 = 0
            r2[r3] = r1
            r3 = 5
            r2[r3] = r1
            r3 = 6
            r2[r3] = r1
            r3 = 7
            r2[r3] = r1
            r0.setCornerRadii(r2)
            r0.setColor(r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.graphics.drawable.GradientDrawable m426(int r2, int r3) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            r0.setShape(r1)
            r0.setGradientType(r1)
            float r2 = (float) r2
            r0.setCornerRadius(r2)
            r0.setColor(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static int m427(float r1) {
            r0 = 1
            float r1 = p000.c4.m107(r0, r1)
            int r1 = (int) r1
            return r1
    }
}
