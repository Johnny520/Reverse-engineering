package yyds;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᛶᲁᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1436 implements InterfaceC2587 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final Bitmap.Config f6791 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6792;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f6793;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final long f6794;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f6795;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f6796;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2110 f6797;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public long f6798;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Set f6799;

    public C1436(long j) {
        C2110 c2110 = new C2110();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f6794 = j;
        this.f6797 = c2110;
        this.f6799 = setUnmodifiableSet;
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final synchronized void mo1856(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && AbstractC0181.m756(bitmap) <= this.f6794 && this.f6799.contains(bitmap.getConfig())) {
                int iM756 = AbstractC0181.m756(bitmap);
                this.f6797.m4025(bitmap);
                this.f6793++;
                this.f6798 += (long) iM756;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=".concat(C2110.m4024(AbstractC0181.m756(bitmap), bitmap.getConfig())));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m2934();
                }
                m2936(this.f6794);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + C2110.m4024(AbstractC0181.m756(bitmap), bitmap.getConfig()) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f6799.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final void mo1857(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo1862();
        } else if (i >= 20 || i == 15) {
            m2936(this.f6794 / 2);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2934() {
        Log.v("LruBitmapPool", "Hits=" + this.f6795 + ", misses=" + this.f6792 + ", puts=" + this.f6793 + ", evictions=" + this.f6796 + ", currentSize=" + this.f6798 + ", maxSize=" + this.f6794 + "\nStrategy=" + this.f6797);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final synchronized Bitmap m2935(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM4027;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM4027 = this.f6797.m4027(i, i2, config != null ? config : f6791);
            if (bitmapM4027 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(C2110.m4024(AbstractC0181.m749(config) * i * i2, config)));
                }
                this.f6792++;
            } else {
                this.f6795++;
                this.f6798 -= (long) AbstractC0181.m756(bitmapM4027);
                bitmapM4027.setHasAlpha(true);
                bitmapM4027.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=".concat(C2110.m4024(AbstractC0181.m749(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m2934();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapM4027;
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Bitmap mo1861(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM2935 = m2935(i, i2, config);
        if (bitmapM2935 != null) {
            bitmapM2935.eraseColor(0);
            return bitmapM2935;
        }
        if (config == null) {
            config = f6791;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo1862() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m2936(0L);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final synchronized void m2936(long j) {
        while (this.f6798 > j) {
            try {
                C2110 c2110 = this.f6797;
                Bitmap bitmap = (Bitmap) c2110.f10446.m4067();
                if (bitmap != null) {
                    c2110.m4026(Integer.valueOf(AbstractC0181.m756(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m2934();
                    }
                    this.f6798 = 0L;
                    return;
                }
                this.f6798 -= (long) AbstractC0181.m756(bitmap);
                this.f6796++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + C2110.m4024(AbstractC0181.m756(bitmap), bitmap.getConfig()));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m2934();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC2587
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Bitmap mo1863(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM2935 = m2935(i, i2, config);
        if (bitmapM2935 != null) {
            return bitmapM2935;
        }
        if (config == null) {
            config = f6791;
        }
        return Bitmap.createBitmap(i, i2, config);
    }
}
