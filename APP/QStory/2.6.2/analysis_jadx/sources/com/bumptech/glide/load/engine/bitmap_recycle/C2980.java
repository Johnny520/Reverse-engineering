package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p222.AbstractC7988;
import p305.C8631;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2980 implements InterfaceC2978 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final Bitmap.Config f9415 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f9416;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f9417;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f9418;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9419;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f9420;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9421;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set f9422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8631 f9423;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2981 f9424;

    public C2980(long j) {
        C2981 c2981 = new C2981();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f9417 = j;
        this.f9424 = c2981;
        this.f9422 = setUnmodifiableSet;
        this.f9423 = new C8631(16);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final synchronized void mo6397(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f9424.getClass();
                if (AbstractC7988.m13440(bitmap) <= this.f9417 && this.f9422.contains(bitmap.getConfig())) {
                    this.f9424.getClass();
                    int iM13440 = AbstractC7988.m13440(bitmap);
                    this.f9424.m6406(bitmap);
                    this.f9423.getClass();
                    this.f9418++;
                    this.f9416 += (long) iM13440;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f9424.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(C2981.m6405(AbstractC7988.m13440(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m6404();
                    }
                    m6402(this.f9417);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f9424.getClass();
                sb.append(C2981.m6405(AbstractC7988.m13440(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.f9422.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final synchronized void m6402(long j) {
        while (this.f9416 > j) {
            try {
                C2981 c2981 = this.f9424;
                Bitmap bitmap = (Bitmap) c2981.f9431.m256();
                if (bitmap != null) {
                    c2981.m6409(Integer.valueOf(AbstractC7988.m13440(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m6404();
                    }
                    this.f9416 = 0L;
                    return;
                }
                this.f9423.getClass();
                long j2 = this.f9416;
                this.f9424.getClass();
                this.f9416 = j2 - ((long) AbstractC7988.m13440(bitmap));
                this.f9419++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f9424.getClass();
                    sb.append(C2981.m6405(AbstractC7988.m13440(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m6404();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo6398(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM6403 = m6403(i, i2, config);
        if (bitmapM6403 != null) {
            return bitmapM6403;
        }
        if (config == null) {
            config = f9415;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Bitmap m6403(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM6408;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM6408 = this.f9424.m6408(i, i2, config != null ? config : f9415);
            if (bitmapM6408 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f9424.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(C2981.m6405(AbstractC7988.m13447(config) * i * i2, config)));
                }
                this.f9421++;
            } else {
                this.f9420++;
                long j = this.f9416;
                this.f9424.getClass();
                this.f9416 = j - ((long) AbstractC7988.m13440(bitmapM6408));
                this.f9423.getClass();
                bitmapM6408.setHasAlpha(true);
                bitmapM6408.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f9424.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(C2981.m6405(AbstractC7988.m13447(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m6404();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM6408;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6404() {
        Log.v("LruBitmapPool", "Hits=" + this.f9420 + ", misses=" + this.f9421 + ", puts=" + this.f9418 + ", evictions=" + this.f9419 + ", currentSize=" + this.f9416 + ", maxSize=" + this.f9417 + "\nStrategy=" + this.f9424);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo6399() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m6402(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6400(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo6399();
        } else if (i >= 20 || i == 15) {
            m6402(this.f9417 / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Bitmap mo6401(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM6403 = m6403(i, i2, config);
        if (bitmapM6403 != null) {
            bitmapM6403.eraseColor(0);
            return bitmapM6403;
        }
        if (config == null) {
            config = f9415;
        }
        return Bitmap.createBitmap(i, i2, config);
    }
}
