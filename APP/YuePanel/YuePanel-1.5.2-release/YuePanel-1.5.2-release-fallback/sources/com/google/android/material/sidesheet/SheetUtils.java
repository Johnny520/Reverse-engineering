package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
final class SheetUtils {
    private SheetUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isSwipeMostlyHorizontal(float r0, float r1) {
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
