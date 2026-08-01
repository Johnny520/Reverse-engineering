package androidx.compose.p001ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2434;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3897;
import kotlin.AbstractC6017;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C6276;
import p034.AbstractC7082;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2360 implements InterfaceC2361 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2360 f4761 = new C2360();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2361
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3366(C2351 c2351, InterfaceC5189 interfaceC5189) throws Exception {
        LayerSnapshotV22$toBitmap$1 layerSnapshotV22$toBitmap$1;
        AutoCloseable autoCloseable;
        if (interfaceC5189 instanceof LayerSnapshotV22$toBitmap$1) {
            layerSnapshotV22$toBitmap$1 = (LayerSnapshotV22$toBitmap$1) interfaceC5189;
            int i = layerSnapshotV22$toBitmap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                layerSnapshotV22$toBitmap$1.label = i - Integer.MIN_VALUE;
            } else {
                layerSnapshotV22$toBitmap$1 = new LayerSnapshotV22$toBitmap$1(this, interfaceC5189);
            }
        }
        Object objM11099 = layerSnapshotV22$toBitmap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = layerSnapshotV22$toBitmap$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM11099);
            long j = c2351.f4706;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (j >> 32), (int) (j & 4294967295L), 1, 1);
            try {
                layerSnapshotV22$toBitmap$1.L$0 = c2351;
                layerSnapshotV22$toBitmap$1.L$1 = looperMyLooper;
                layerSnapshotV22$toBitmap$1.L$2 = imageReaderNewInstance;
                layerSnapshotV22$toBitmap$1.L$3 = imageReaderNewInstance;
                layerSnapshotV22$toBitmap$1.L$4 = layerSnapshotV22$toBitmap$1;
                layerSnapshotV22$toBitmap$1.label = 1;
                C6276 c6276 = new C6276(1, AbstractC3400.m5624(layerSnapshotV22$toBitmap$1));
                c6276.m11102();
                imageReaderNewInstance.setOnImageAvailableListener(new C2359(c6276), AbstractC7082.m12298(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(AbstractC2416.m3433(C2434.f5041), PorterDuff.Mode.CLEAR);
                    Canvas canvas = AbstractC2429.f5032;
                    C2430 c2430 = new C2430();
                    c2430.f5035 = canvasLockHardwareCanvas;
                    c2351.m3355(c2430, null);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    objM11099 = c6276.m11099();
                    if (objM11099 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    autoCloseable = imageReaderNewInstance;
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                autoCloseable = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            autoCloseable = (AutoCloseable) layerSnapshotV22$toBitmap$1.L$2;
            try {
                AbstractC6017.m10769(objM11099);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    AbstractC3897.m7396(autoCloseable, th);
                    throw th4;
                }
            }
        }
        Bitmap bitmapM14246 = AbstractC9019.m14246((Image) objM11099);
        AbstractC3897.m7396(autoCloseable, null);
        return bitmapM14246;
    }
}
