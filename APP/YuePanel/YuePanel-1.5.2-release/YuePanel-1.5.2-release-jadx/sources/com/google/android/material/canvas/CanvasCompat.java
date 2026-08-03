package com.google.android.material.canvas;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.graphics.Canvas;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class CanvasCompat {

    public interface CanvasOperation {
        void run(@InterfaceC6391 Canvas canvas);
    }

    private CanvasCompat() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int saveLayerAlpha(@InterfaceC6391 Canvas canvas, @InterfaceC6490 RectF rectF, int i) {
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int saveLayerAlpha(@InterfaceC6391 Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }
}
