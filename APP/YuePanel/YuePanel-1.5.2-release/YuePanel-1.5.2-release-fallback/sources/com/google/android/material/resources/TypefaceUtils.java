package com.google.android.material.resources;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class TypefaceUtils {
    private TypefaceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(@Yue.InterfaceC4410 android.content.Context r0, @Yue.InterfaceC4410 android.graphics.Typeface r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.graphics.Typeface r0 = maybeCopyWithFontWeightAdjustment(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    public static android.graphics.Typeface maybeCopyWithFontWeightAdjustment(@Yue.InterfaceC4410 android.content.res.Configuration r2, @Yue.InterfaceC4410 android.graphics.Typeface r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            int r0 = Yue.C6498.m24002(r2)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L30
            int r0 = Yue.C6498.m24002(r2)
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            int r0 = Yue.C6499.m24003(r3)
            int r2 = Yue.C6498.m24002(r2)
            int r0 = r0 + r2
            r2 = 1
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = Yue.C4095.m16013(r0, r2, r1)
            boolean r0 = r3.isItalic()
            android.graphics.Typeface r2 = Yue.C6500.m24004(r3, r2, r0)
            return r2
        L30:
            r2 = 0
            return r2
    }
}
