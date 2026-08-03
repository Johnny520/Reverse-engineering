package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: EB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0184EB {

    /* JADX INFO: renamed from: a */
    public static final Paint f545a = new Paint(6);

    /* JADX INFO: renamed from: b */
    public static final Paint f546b = new Paint(7);

    /* JADX INFO: renamed from: c */
    public static final Paint f547c;

    /* JADX INFO: renamed from: d */
    public static final Lock f548d;

    static {
        f548d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new LockC0141DB();
        Paint paint = new Paint(7);
        f547c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    public static void m384a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f548d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f545a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m385b(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapMo52g = interfaceC0565N5.mo52g((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                bitmapMo52g.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    bitmap.getWidth();
                    bitmap.getHeight();
                    bitmapMo52g.getWidth();
                    bitmapMo52g.getHeight();
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                m384a(bitmap, bitmapMo52g, matrix);
                return bitmapMo52g;
            }
        }
        return bitmap;
    }
}
