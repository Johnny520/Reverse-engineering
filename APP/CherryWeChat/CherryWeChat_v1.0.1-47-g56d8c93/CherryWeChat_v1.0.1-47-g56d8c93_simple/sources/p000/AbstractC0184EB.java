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
    public static final Paint f545a = null;

    /* JADX INFO: renamed from: b */
    public static final Paint f546b = null;

    /* JADX INFO: renamed from: c */
    public static final Paint f547c = null;

    /* JADX INFO: renamed from: d */
    public static final Lock f548d = null;

    static {
        f545a = new Paint(6);
        f546b = new Paint(7);
        if (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL) == false) goto L5;
        Lock r0 = new ReentrantLock();
    L6:
        f548d = r0;
        Paint r02 = new Paint(7);
        f547c = r02;
        r02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        return;
    L5:
        r0 = new LockC0141DB();
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public static void m384a(Bitmap r2, Bitmap r3, Matrix r4) {
        Lock r0 = f548d;
        r0.lock();
        Canvas r1 = new Canvas(r3);     // Catch: Throwable -> L6
        r1.drawBitmap(r2, r4, f545a);     // Catch: Throwable -> L6
        r1.setBitmap(null);     // Catch: Throwable -> L6
        r0.unlock();
        return;
    L6:
        th = move-exception;
        r0.unlock();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m385b(InterfaceC0565N5 r2, Bitmap r3, int r4, int r5) {
        if (r3.getWidth() == r4) goto L5;
    L7:
        float r42 = Math.min(r4 / r3.getWidth(), r5 / r3.getHeight());
        int r52 = Math.round(r3.getWidth() * r42);
        int r0 = Math.round(r3.getHeight() * r42);
        if (r3.getWidth() == r52) goto L10;
    L12:
        int r53 = (int) (r3.getWidth() * r42);
        int r02 = (int) (r3.getHeight() * r42);
        if (r3.getConfig() == null) goto L15;
        Bitmap.Config r1 = r3.getConfig();
    L16:
        Bitmap r22 = r2.mo52g(r53, r02, r1);
        r22.setHasAlpha(r3.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2) == false) goto L19;
        r3.getWidth();
        r3.getHeight();
        r22.getWidth();
        r22.getHeight();
    L19:
        Matrix r54 = new Matrix();
        r54.setScale(r42, r42);
        m384a(r3, r22, r54);
        return r22;
    L15:
        r1 = Bitmap.Config.ARGB_8888;
        goto L16
    L10:
        if (r3.getHeight() != r0) goto L12;
    L11:
        return r3;
    L5:
        if (r3.getHeight() != r5) goto L7;
        goto L7
    }
}
