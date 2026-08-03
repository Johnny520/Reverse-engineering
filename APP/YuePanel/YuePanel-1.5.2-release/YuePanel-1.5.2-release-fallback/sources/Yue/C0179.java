package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C0179 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.content.Context f407;

    public C0179(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f407 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C0179 m983(android.content.Context r1) {
            Yue.ۥ۟۟ۦۨ r0 = new Yue.ۥ۟۟ۦۨ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m984() {
            r2 = this;
            android.content.Context r0 = r2.f407
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 14
            if (r0 >= r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m985() {
            r1 = this;
            android.content.Context r0 = r1.f407
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m986() {
            r4 = this;
            android.content.Context r0 = r4.f407
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            int r0 = r0.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r0 > r3) goto L3e
            if (r1 > r3) goto L3e
            r0 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r1 <= r3) goto L1e
            if (r2 > r0) goto L3e
        L1e:
            if (r1 <= r0) goto L23
            if (r2 <= r3) goto L23
            goto L3e
        L23:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L3c
            r0 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r1 <= r3) goto L2f
            if (r2 > r0) goto L3c
        L2f:
            if (r1 <= r0) goto L34
            if (r2 <= r3) goto L34
            goto L3c
        L34:
            r0 = 360(0x168, float:5.04E-43)
            if (r1 < r0) goto L3a
            r0 = 3
            return r0
        L3a:
            r0 = 2
            return r0
        L3c:
            r0 = 4
            return r0
        L3e:
            r0 = 5
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m987() {
            r2 = this;
            android.content.Context r0 = r2.f407
            android.content.res.Resources r0 = r0.getResources()
            int r1 = Yue.C5058.C5063.f16920
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m988() {
            r5 = this;
            android.content.Context r0 = r5.f407
            int[] r1 = Yue.C5058.C5071.f17589
            int r2 = Yue.C5058.C5060.f16557
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r3, r1, r2, r4)
            int r1 = Yue.C5058.C5071.f17603
            int r1 = r0.getLayoutDimension(r1, r4)
            android.content.Context r2 = r5.f407
            android.content.res.Resources r2 = r2.getResources()
            boolean r3 = r5.m989()
            if (r3 != 0) goto L28
            int r3 = Yue.C5058.C5063.f16919
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = java.lang.Math.min(r1, r2)
        L28:
            r0.recycle()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m989() {
            r2 = this;
            android.content.Context r0 = r2.f407
            android.content.res.Resources r0 = r0.getResources()
            int r1 = Yue.C5058.C5061.f16825
            boolean r0 = r0.getBoolean(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m990() {
            r1 = this;
            r0 = 1
            return r0
    }
}
