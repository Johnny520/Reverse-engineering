package com.qmdeve.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.qmdeve.blurview.BlurNative;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import yyds.ThreadFactoryC1569;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class BlurNative {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final ExecutorService f446;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final int f447;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AtomicBoolean f448 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public float f449 = 100.0f;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f450 = 2;

    static {
        int iMax = Math.max(2, Math.min(5, Runtime.getRuntime().availableProcessors()));
        f447 = iMax;
        f446 = Executors.newFixedThreadPool(iMax, new ThreadFactoryC1569());
        System.loadLibrary("QmBlur");
    }

    public static native void blur(Object obj, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m301(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null || bitmap.isRecycled() || bitmap2.isRecycled()) {
            return;
        }
        AtomicBoolean atomicBoolean = this.f448;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (bitmap != bitmap2) {
                try {
                    try {
                        bitmap2.eraseColor(0);
                        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    } catch (Exception e) {
                        if (Boolean.TRUE.equals(null)) {
                            e.printStackTrace();
                        }
                        atomicBoolean.set(false);
                        return;
                    }
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            }
            for (int i = 0; i < this.f450; i++) {
                m302(bitmap2, 1);
                m302(bitmap2, 2);
            }
            atomicBoolean.set(false);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m302(final Bitmap bitmap, final int i) {
        final int i2 = (int) this.f449;
        int i3 = f447;
        if (i3 == 1) {
            blur(bitmap, i2, 1, 0, i);
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(i3);
        for (final int i4 = 0; i4 < i3; i4++) {
            f446.execute(new Runnable() { // from class: yyds.ᲈᲇᛲᛷ
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmap2 = bitmap;
                    int i5 = i2;
                    int i6 = i4;
                    int i7 = i;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    try {
                        BlurNative.blur(bitmap2, i5, BlurNative.f447, i6, i7);
                    } catch (Exception e) {
                        if (Boolean.TRUE.equals(null)) {
                            e.printStackTrace();
                        }
                    } finally {
                        countDownLatch2.countDown();
                    }
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
