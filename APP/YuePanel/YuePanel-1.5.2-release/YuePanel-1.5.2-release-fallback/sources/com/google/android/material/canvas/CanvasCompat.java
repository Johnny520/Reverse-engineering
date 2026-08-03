package com.google.android.material.canvas;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class CanvasCompat {

    public interface CanvasOperation {
        void run(@Yue.InterfaceC4410 android.graphics.Canvas r1);
    }

    private CanvasCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int saveLayerAlpha(@Yue.InterfaceC4410 android.graphics.Canvas r0, float r1, float r2, float r3, float r4, int r5) {
            int r0 = r0.saveLayerAlpha(r1, r2, r3, r4, r5)
            return r0
    }

    public static int saveLayerAlpha(@Yue.InterfaceC4410 android.graphics.Canvas r0, @Yue.InterfaceC4544 android.graphics.RectF r1, int r2) {
            int r0 = r0.saveLayerAlpha(r1, r2)
            return r0
    }
}
