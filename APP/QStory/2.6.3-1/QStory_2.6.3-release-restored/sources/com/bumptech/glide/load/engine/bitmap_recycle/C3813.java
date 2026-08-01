package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p238.AbstractC8818;
import p321.C9452;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3813 implements InterfaceC3811 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final Bitmap.Config f9762 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f9763;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f9764;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f9765;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f9766;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f9767;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9768;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Set f9769;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9452 f9770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3814 f9771;

    public C3813(long j) {
        C3814 c3814 = new C3814();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f9764 = j;
        this.f9771 = c3814;
        this.f9769 = setUnmodifiableSet;
        this.f9770 = new C9452(16);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final synchronized void mo7015(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f9771.getClass();
                if (AbstractC8818.m14027(bitmap) <= this.f9764 && this.f9769.contains(bitmap.getConfig())) {
                    this.f9771.getClass();
                    int iM14027 = AbstractC8818.m14027(bitmap);
                    this.f9771.m7024(bitmap);
                    this.f9770.getClass();
                    this.f9765++;
                    this.f9763 += (long) iM14027;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f9771.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(C3814.m7023(AbstractC8818.m14027(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m7022();
                    }
                    m7020(this.f9764);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f9771.getClass();
                sb.append(C3814.m7023(AbstractC8818.m14027(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.f9769.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Bitmap mo7016(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM7021 = m7021(i, i2, config);
        if (bitmapM7021 != null) {
            return bitmapM7021;
        }
        if (config == null) {
            config = f9762;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized void m7020(long j) {
        while (this.f9763 > j) {
            try {
                C3814 c3814 = this.f9771;
                Bitmap bitmap = (Bitmap) c3814.f9778.m817();
                if (bitmap != null) {
                    c3814.m7027(Integer.valueOf(AbstractC8818.m14027(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m7022();
                    }
                    this.f9763 = 0L;
                    return;
                }
                this.f9770.getClass();
                long j2 = this.f9763;
                this.f9771.getClass();
                this.f9763 = j2 - ((long) AbstractC8818.m14027(bitmap));
                this.f9766++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f9771.getClass();
                    sb.append(C3814.m7023(AbstractC8818.m14027(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m7022();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final synchronized Bitmap m7021(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM7026;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM7026 = this.f9771.m7026(i, i2, config != null ? config : f9762);
            if (bitmapM7026 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f9771.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(C3814.m7023(AbstractC8818.m14034(config) * i * i2, config)));
                }
                this.f9768++;
            } else {
                this.f9767++;
                long j = this.f9763;
                this.f9771.getClass();
                this.f9763 = j - ((long) AbstractC8818.m14027(bitmapM7026));
                this.f9770.getClass();
                bitmapM7026.setHasAlpha(true);
                bitmapM7026.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f9771.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(C3814.m7023(AbstractC8818.m14034(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m7022();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM7026;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7022() {
        Log.v("LruBitmapPool", "Hits=" + this.f9767 + ", misses=" + this.f9768 + ", puts=" + this.f9765 + ", evictions=" + this.f9766 + ", currentSize=" + this.f9763 + ", maxSize=" + this.f9764 + "\nStrategy=" + this.f9771);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo7017(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo7018();
        } else if (i >= 20 || i == 15) {
            m7020(this.f9764 / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo7018() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m7020(0L);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Bitmap mo7019(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM7021 = m7021(i, i2, config);
        if (bitmapM7021 != null) {
            bitmapM7021.eraseColor(0);
            return bitmapM7021;
        }
        if (config == null) {
            config = f9762;
        }
        return Bitmap.createBitmap(i, i2, config);
    }
}
