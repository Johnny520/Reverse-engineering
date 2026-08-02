package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 implements InterfaceC0965zk {

    /* JADX INFO: renamed from: q */
    public static final Bitmap.Config f11242q = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: h */
    public final jr2 f11243h;

    /* JADX INFO: renamed from: i */
    public final Set f11244i;

    /* JADX INFO: renamed from: j */
    public final i51 f11245j;

    /* JADX INFO: renamed from: k */
    public final long f11246k;

    /* JADX INFO: renamed from: l */
    public long f11247l;

    /* JADX INFO: renamed from: m */
    public int f11248m;

    /* JADX INFO: renamed from: n */
    public int f11249n;

    /* JADX INFO: renamed from: o */
    public int f11250o;

    /* JADX INFO: renamed from: p */
    public int f11251p;

    public ud1(long j) {
        jr2 jr2Var = new jr2();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f11246k = j;
        this.f11243h = jr2Var;
        this.f11244i = setUnmodifiableSet;
        this.f11245j = new i51(3);
    }

    /* JADX INFO: renamed from: a */
    public final void m5485a() {
        Log.v("LruBitmapPool", "Hits=" + this.f11248m + ", misses=" + this.f11249n + ", puts=" + this.f11250o + ", evictions=" + this.f11251p + ", currentSize=" + this.f11247l + ", maxSize=" + this.f11246k + "\nStrategy=" + this.f11243h);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Bitmap m5486b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM2553b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM2553b = this.f11243h.m2553b(i, i2, config != null ? config : f11242q);
            if (bitmapM2553b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f11243h.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(jr2.m2551c(b93.m497d(config) * i * i2, config)));
                }
                this.f11249n++;
            } else {
                this.f11248m++;
                long j = this.f11247l;
                this.f11243h.getClass();
                this.f11247l = j - ((long) b93.m496c(bitmapM2553b));
                this.f11245j.getClass();
                bitmapM2553b.setHasAlpha(true);
                bitmapM2553b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f11243h.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(jr2.m2551c(b93.m497d(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m5485a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM2553b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5487c(long j) {
        while (this.f11247l > j) {
            try {
                jr2 jr2Var = this.f11243h;
                Bitmap bitmap = (Bitmap) jr2Var.f5186b.m5040M();
                if (bitmap != null) {
                    jr2Var.m2552a(Integer.valueOf(b93.m496c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m5485a();
                    }
                    this.f11247l = 0L;
                    return;
                }
                this.f11245j.getClass();
                long j2 = this.f11247l;
                this.f11243h.getClass();
                this.f11247l = j2 - ((long) b93.m496c(bitmap));
                this.f11251p++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f11243h.getClass();
                    sb.append(jr2.m2551c(b93.m496c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m5485a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: e */
    public final Bitmap mo1323e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM5486b = m5486b(i, i2, config);
        if (bitmapM5486b != null) {
            return bitmapM5486b;
        }
        if (config == null) {
            config = f11242q;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: f */
    public final Bitmap mo1324f(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM5486b = m5486b(i, i2, config);
        if (bitmapM5486b != null) {
            bitmapM5486b.eraseColor(0);
            return bitmapM5486b;
        }
        if (config == null) {
            config = f11242q;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: h */
    public final synchronized void mo1325h(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f11243h.getClass();
                if (b93.m496c(bitmap) <= this.f11246k && this.f11244i.contains(bitmap.getConfig())) {
                    this.f11243h.getClass();
                    int iM496c = b93.m496c(bitmap);
                    this.f11243h.m2555e(bitmap);
                    this.f11245j.getClass();
                    this.f11250o++;
                    this.f11247l += (long) iM496c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f11243h.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(jr2.m2551c(b93.m496c(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m5485a();
                    }
                    m5487c(this.f11246k);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f11243h.getClass();
                sb.append(jr2.m2551c(b93.m496c(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.f11244i.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: k */
    public final void mo1326k(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo1328n();
        } else if (i >= 20 || i == 15) {
            m5487c(this.f11246k / 2);
        }
    }

    @Override // p000.InterfaceC0965zk
    /* JADX INFO: renamed from: n */
    public final void mo1328n() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m5487c(0L);
    }
}
