package p093S1;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p002A1.C0115D;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: S1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1295g implements InterfaceC1289a {

    /* JADX INFO: renamed from: m */
    public static final Bitmap.Config f4637m = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: d */
    public final C1299k f4638d;

    /* JADX INFO: renamed from: e */
    public final Set f4639e;

    /* JADX INFO: renamed from: f */
    public final C0115D f4640f;

    /* JADX INFO: renamed from: g */
    public final long f4641g;

    /* JADX INFO: renamed from: h */
    public long f4642h;

    /* JADX INFO: renamed from: i */
    public int f4643i;

    /* JADX INFO: renamed from: j */
    public int f4644j;

    /* JADX INFO: renamed from: k */
    public int f4645k;

    /* JADX INFO: renamed from: l */
    public int f4646l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1295g(long j5) {
        C1299k c1299k = new C1299k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f4641g = j5;
        this.f4638d = c1299k;
        this.f4639e = setUnmodifiableSet;
        this.f4640f = new C0115D(23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2389a() {
        Log.v("LruBitmapPool", "Hits=" + this.f4643i + ", misses=" + this.f4644j + ", puts=" + this.f4645k + ", evictions=" + this.f4646l + ", currentSize=" + this.f4642h + ", maxSize=" + this.f4641g + "\nStrategy=" + this.f4638d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: b */
    public final Bitmap mo151b(int i5, int i6, Bitmap.Config config) {
        Bitmap bitmapM2390c = m2390c(i5, i6, config);
        if (bitmapM2390c != null) {
            return bitmapM2390c;
        }
        if (config == null) {
            config = f4637m;
        }
        return Bitmap.createBitmap(i5, i6, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized Bitmap m2390c(int i5, int i6, Bitmap.Config config) {
        Bitmap bitmapM2394b;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM2394b = this.f4638d.m2394b(i5, i6, config != null ? config : f4637m);
            if (bitmapM2394b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f4638d.getClass();
                    sb.append(C1299k.m2392c(AbstractC2511o.m4455d(config) * i5 * i6, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f4644j++;
            } else {
                this.f4643i++;
                long j5 = this.f4642h;
                this.f4638d.getClass();
                this.f4642h = j5 - ((long) AbstractC2511o.m4454c(bitmapM2394b));
                this.f4640f.getClass();
                bitmapM2394b.setHasAlpha(true);
                bitmapM2394b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f4638d.getClass();
                sb2.append(C1299k.m2392c(AbstractC2511o.m4455d(config) * i5 * i6, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m2389a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM2394b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: d */
    public final Bitmap mo153d(int i5, int i6, Bitmap.Config config) {
        Bitmap bitmapM2390c = m2390c(i5, i6, config);
        if (bitmapM2390c != null) {
            bitmapM2390c.eraseColor(0);
            return bitmapM2390c;
        }
        if (config == null) {
            config = f4637m;
        }
        return Bitmap.createBitmap(i5, i6, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: e */
    public final synchronized void mo154e(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f4638d.getClass();
                if (AbstractC2511o.m4454c(bitmap) <= this.f4641g && this.f4639e.contains(bitmap.getConfig())) {
                    this.f4638d.getClass();
                    int iM4454c = AbstractC2511o.m4454c(bitmap);
                    this.f4638d.m2396e(bitmap);
                    this.f4640f.getClass();
                    this.f4645k++;
                    this.f4642h += (long) iM4454c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f4638d.getClass();
                        sb.append(C1299k.m2392c(AbstractC2511o.m4454c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m2389a();
                    }
                    m2391f(this.f4641g);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f4638d.getClass();
                sb2.append(C1299k.m2392c(AbstractC2511o.m4454c(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f4639e.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m2391f(long j5) {
        while (this.f4642h > j5) {
            try {
                C1299k c1299k = this.f4638d;
                Bitmap bitmap = (Bitmap) c1299k.f4657b.m30D();
                if (bitmap != null) {
                    c1299k.m2393a(Integer.valueOf(AbstractC2511o.m4454c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m2389a();
                    }
                    this.f4642h = 0L;
                    return;
                }
                this.f4640f.getClass();
                long j6 = this.f4642h;
                this.f4638d.getClass();
                this.f4642h = j6 - ((long) AbstractC2511o.m4454c(bitmap));
                this.f4646l++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f4638d.getClass();
                    sb.append(C1299k.m2392c(AbstractC2511o.m4454c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m2389a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: i */
    public final void mo157i(int i5) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i5);
        }
        if (i5 >= 40 || i5 >= 20) {
            mo158j();
        } else if (i5 >= 20 || i5 == 15) {
            m2391f(this.f4641g / 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p093S1.InterfaceC1289a
    /* JADX INFO: renamed from: j */
    public final void mo158j() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m2391f(0L);
    }
}
