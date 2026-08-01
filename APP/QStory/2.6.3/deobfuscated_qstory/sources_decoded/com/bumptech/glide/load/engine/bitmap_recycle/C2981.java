package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p222.AbstractC7989;
import p305.C8623;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2981 implements InterfaceC2979 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final Bitmap.Config f9417 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f9418;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f9419;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f9420;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9421;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f9422;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9423;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set f9424;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8623 f9425;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2982 f9426;

    public C2981(long j) {
        C2982 c2982 = new C2982();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f9419 = j;
        this.f9426 = c2982;
        this.f9424 = setUnmodifiableSet;
        this.f9425 = new C8623(16);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final synchronized void mo6455(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f9426.getClass();
                if (AbstractC7989.m13468(bitmap) <= this.f9419 && this.f9424.contains(bitmap.getConfig())) {
                    this.f9426.getClass();
                    int iM13468 = AbstractC7989.m13468(bitmap);
                    this.f9426.m6464(bitmap);
                    this.f9425.getClass();
                    this.f9420++;
                    this.f9418 += (long) iM13468;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f9426.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(C2982.m6463(AbstractC7989.m13468(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m6462();
                    }
                    m6460(this.f9419);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f9426.getClass();
                sb.append(C2982.m6463(AbstractC7989.m13468(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.f9424.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Bitmap mo6456(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM6461 = m6461(i, i2, config);
        if (bitmapM6461 != null) {
            return bitmapM6461;
        }
        if (config == null) {
            config = f9417;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized void m6460(long j) {
        while (this.f9418 > j) {
            try {
                C2982 c2982 = this.f9426;
                Bitmap bitmap = (Bitmap) c2982.f9433.m257();
                if (bitmap != null) {
                    c2982.m6467(Integer.valueOf(AbstractC7989.m13468(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m6462();
                    }
                    this.f9418 = 0L;
                    return;
                }
                this.f9425.getClass();
                long j2 = this.f9418;
                this.f9426.getClass();
                this.f9418 = j2 - ((long) AbstractC7989.m13468(bitmap));
                this.f9421++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f9426.getClass();
                    sb.append(C2982.m6463(AbstractC7989.m13468(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m6462();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Bitmap m6461(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM6466;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM6466 = this.f9426.m6466(i, i2, config != null ? config : f9417);
            if (bitmapM6466 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f9426.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(C2982.m6463(AbstractC7989.m13475(config) * i * i2, config)));
                }
                this.f9423++;
            } else {
                this.f9422++;
                long j = this.f9418;
                this.f9426.getClass();
                this.f9418 = j - ((long) AbstractC7989.m13468(bitmapM6466));
                this.f9425.getClass();
                bitmapM6466.setHasAlpha(true);
                bitmapM6466.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f9426.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(C2982.m6463(AbstractC7989.m13475(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m6462();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM6466;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6462() {
        Log.v("LruBitmapPool", "Hits=" + this.f9422 + ", misses=" + this.f9423 + ", puts=" + this.f9420 + ", evictions=" + this.f9421 + ", currentSize=" + this.f9418 + ", maxSize=" + this.f9419 + "\nStrategy=" + this.f9426);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo6457(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo6458();
        } else if (i >= 20 || i == 15) {
            m6460(this.f9419 / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo6458() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m6460(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Bitmap mo6459(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM6461 = m6461(i, i2, config);
        if (bitmapM6461 != null) {
            bitmapM6461.eraseColor(0);
            return bitmapM6461;
        }
        if (config == null) {
            config = f9417;
        }
        return Bitmap.createBitmap(i, i2, config);
    }
}
