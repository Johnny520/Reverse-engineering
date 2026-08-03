package Yue;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: renamed from: Yue.ۥۡۤۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6665 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Picture m3155(@InterfaceC6399 Picture picture, int i, int i2, @InterfaceC6399 InterfaceC5124<? super Canvas, C8107> interfaceC5124) {
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        try {
            interfaceC5124.invoke(canvasBeginRecording);
            return picture;
        } finally {
            C5437.m16930(1);
            picture.endRecording();
            C5437.m16929(1);
        }
    }
}
