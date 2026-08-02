package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 implements zk {
    public static final Bitmap.Config q = Bitmap.Config.ARGB_8888;
    public final jr2 h;
    public final Set i;
    public final i51 j;
    public final long k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ud1(long j) {
        jr2 jr2Var = new jr2();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.k = j;
        this.h = jr2Var;
        this.i = setUnmodifiableSet;
        this.j = new i51(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.m + ", misses=" + this.n + ", puts=" + this.o + ", evictions=" + this.p + ", currentSize=" + this.l + ", maxSize=" + this.k + "\nStrategy=" + this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.h.b(i, i2, config != null ? config : q);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.h.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(jr2.c(b93.d(config) * i * i2, config)));
                }
                this.n++;
            } else {
                this.m++;
                long j = this.l;
                this.h.getClass();
                this.l = j - ((long) b93.c(bitmapB));
                this.j.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.h.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(jr2.c(b93.d(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void c(long j) {
        while (this.l > j) {
            try {
                jr2 jr2Var = this.h;
                Bitmap bitmap = (Bitmap) jr2Var.b.M();
                if (bitmap != null) {
                    jr2Var.a(Integer.valueOf(b93.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.l = 0L;
                    return;
                }
                this.j.getClass();
                long j2 = this.l;
                this.h.getClass();
                this.l = j2 - ((long) b93.c(bitmap));
                this.p++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.h.getClass();
                    sb.append(jr2.c(b93.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public final Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = q;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public final Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = q;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public final synchronized void h(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.h.getClass();
                if (b93.c(bitmap) <= this.k && this.i.contains(bitmap.getConfig())) {
                    this.h.getClass();
                    int iC = b93.c(bitmap);
                    this.h.e(bitmap);
                    this.j.getClass();
                    this.o++;
                    this.l += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.h.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(jr2.c(b93.c(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    c(this.k);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.h.getClass();
                sb.append(jr2.c(b93.c(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.i.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public final void k(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            n();
        } else if (i >= 20 || i == 15) {
            c(this.k / 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zk
    public final void n() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        c(0L);
    }
}
