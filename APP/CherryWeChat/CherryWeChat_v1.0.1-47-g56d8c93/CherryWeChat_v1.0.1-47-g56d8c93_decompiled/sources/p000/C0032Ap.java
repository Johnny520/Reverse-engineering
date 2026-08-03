package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: Ap */
/* JADX INFO: loaded from: classes.dex */
public final class C0032Ap implements InterfaceC0565N5 {

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config f63f = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    public final C2821zy f64a;

    /* JADX INFO: renamed from: b */
    public final Set f65b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f66c;

    /* JADX INFO: renamed from: d */
    public final long f67d;

    /* JADX INFO: renamed from: e */
    public long f68e;

    public C0032Ap(long j) {
        C2821zy c2821zy = new C2821zy();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f67d = j;
        this.f64a = c2821zy;
        this.f65b = setUnmodifiableSet;
        this.f66c = new C0668Pg(18);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Bitmap m49a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM5457b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM5457b = this.f64a.m5457b(i, i2, config != null ? config : f63f);
            if (bitmapM5457b != null) {
                long j = this.f68e;
                this.f64a.getClass();
                this.f68e = j - ((long) AbstractC2622vD.m5132c(bitmapM5457b));
                this.f66c.getClass();
                bitmapM5457b.setHasAlpha(true);
                bitmapM5457b.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f64a.getClass();
                C2821zy.m5455c(AbstractC2622vD.m5133d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f64a.getClass();
                C2821zy.m5455c(AbstractC2622vD.m5133d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f64a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM5457b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m50b(long j) {
        while (this.f68e > j) {
            C2821zy c2821zy = this.f64a;
            Bitmap bitmap = (Bitmap) c2821zy.f9548b.m1287R();
            if (bitmap != null) {
                c2821zy.m5456a(Integer.valueOf(AbstractC2622vD.m5132c(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.f64a);
                }
                this.f68e = 0L;
                return;
            }
            this.f66c.getClass();
            long j2 = this.f68e;
            this.f64a.getClass();
            this.f68e = j2 - ((long) AbstractC2622vD.m5132c(bitmap));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f64a.getClass();
                C2821zy.m5455c(AbstractC2622vD.m5132c(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f64a);
            }
            bitmap.recycle();
        }
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: e */
    public final Bitmap mo51e(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM49a = m49a(i, i2, config);
        if (bitmapM49a != null) {
            return bitmapM49a;
        }
        if (config == null) {
            config = f63f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: g */
    public final Bitmap mo52g(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM49a = m49a(i, i2, config);
        if (bitmapM49a != null) {
            bitmapM49a.eraseColor(0);
            return bitmapM49a;
        }
        if (config == null) {
            config = f63f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: h */
    public final synchronized void mo53h(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f64a.getClass();
                if (AbstractC2622vD.m5132c(bitmap) <= this.f67d && this.f65b.contains(bitmap.getConfig())) {
                    this.f64a.getClass();
                    int iM5132c = AbstractC2622vD.m5132c(bitmap);
                    this.f64a.m5459e(bitmap);
                    this.f66c.getClass();
                    this.f68e += (long) iM5132c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f64a.getClass();
                        C2821zy.m5455c(AbstractC2622vD.m5132c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f64a);
                    }
                    m50b(this.f67d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f64a.getClass();
                C2821zy.m5455c(AbstractC2622vD.m5132c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.f65b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: k */
    public final void mo54k(int i) {
        if (i >= 40 || i >= 20) {
            mo55m();
        } else if (i >= 20 || i == 15) {
            m50b(this.f67d / 2);
        }
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: m */
    public final void mo55m() {
        m50b(0L);
    }
}
