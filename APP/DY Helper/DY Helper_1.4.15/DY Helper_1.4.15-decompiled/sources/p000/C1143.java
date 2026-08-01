package p000;

/* JADX INFO: renamed from: ｍ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1143 implements p000.InterfaceC0411iy {

    /* JADX INFO: renamed from: α */
    public android.content.Context f13489;

    /* JADX INFO: renamed from: β */
    public static p000.C1143 m7359(android.content.Context r1) {
            ｍ r0 = new ｍ
            r0.<init>()
            r0.f13489 = r1
            return r0
    }

    @Override // p000.InterfaceC0411iy
    /* JADX INFO: renamed from: α */
    public void mo2828(p000.pd2 r9) {
            r8 = this;
            ho r7 = new ho
            r0 = 0
            java.lang.String r1 = "EmojiCompatInitializer"
            r7.<init>(r0, r1)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            e9 r1 = new e9
            r2 = 10
            r1.<init>(r8, r9, r0, r2)
            r0.execute(r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public int m7360() {
            r3 = this;
            android.content.Context r3 = r3.f13489
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r0 = r3.screenWidthDp
            int r1 = r3.screenHeightDp
            int r3 = r3.smallestScreenWidthDp
            r2 = 600(0x258, float:8.41E-43)
            if (r3 > r2) goto L3e
            if (r0 > r2) goto L3e
            r3 = 720(0x2d0, float:1.009E-42)
            r2 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r2) goto L1e
            if (r1 > r3) goto L3e
        L1e:
            if (r0 <= r3) goto L23
            if (r1 <= r2) goto L23
            goto L3e
        L23:
            r3 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r3) goto L3c
            r3 = 480(0x1e0, float:6.73E-43)
            r2 = 640(0x280, float:8.97E-43)
            if (r0 <= r2) goto L2f
            if (r1 > r3) goto L3c
        L2f:
            if (r0 <= r3) goto L34
            if (r1 <= r2) goto L34
            goto L3c
        L34:
            r3 = 360(0x168, float:5.04E-43)
            if (r0 < r3) goto L3a
            r3 = 3
            return r3
        L3a:
            r3 = 2
            return r3
        L3c:
            r3 = 4
            return r3
        L3e:
            r3 = 5
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public int m7361() {
            r4 = this;
            android.content.Context r4 = r4.f13489
            r0 = 0
            int[] r1 = p000.kk1.f5967
            r2 = 2130968581(0x7f040005, float:1.754582E38)
            r3 = 0
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r0, r1, r2, r3)
            r1 = 13
            int r1 = r0.getLayoutDimension(r1, r3)
            android.content.res.Resources r2 = r4.getResources()
            android.content.res.Resources r4 = r4.getResources()
            r3 = 2131034112(0x7f050000, float:1.7678732E38)
            boolean r4 = r4.getBoolean(r3)
            if (r4 != 0) goto L2e
            r4 = 2131165193(0x7f070009, float:1.7944596E38)
            int r4 = r2.getDimensionPixelSize(r4)
            int r1 = java.lang.Math.min(r1, r4)
        L2e:
            r0.recycle()
            return r1
    }
}
