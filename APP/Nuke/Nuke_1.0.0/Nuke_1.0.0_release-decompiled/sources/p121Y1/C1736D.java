package p121Y1;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import me.dartcv.nuke.BuildConfig;
import p088R1.InterfaceC1194D;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: Y1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1736D implements InterfaceC1194D {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5996d;

    /* JADX INFO: renamed from: e */
    public final Object f5997e;

    public /* synthetic */ C1736D(int i5, Object obj) {
        this.f5996d = i5;
        this.f5997e = obj;
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: c */
    public final int mo2254c() {
        switch (this.f5996d) {
            case 0:
                return AbstractC2511o.m4454c((Bitmap) this.f5997e);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((byte[]) this.f5997e).length;
            case 2:
                return AbstractC2511o.m4455d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f5997e).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f5997e).getIntrinsicWidth() * 2;
            default:
                return 1;
        }
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: d */
    public final Class mo2255d() {
        switch (this.f5996d) {
            case 0:
                return Bitmap.class;
            case BuildConfig.VERSION_CODE /* 1 */:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return ((File) this.f5997e).getClass();
        }
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: e */
    public final void mo2256e() {
        switch (this.f5996d) {
            case 2:
                ((AnimatedImageDrawable) this.f5997e).stop();
                ((AnimatedImageDrawable) this.f5997e).clearAnimationCallbacks();
                break;
        }
    }

    @Override // p088R1.InterfaceC1194D
    public final Object get() {
        switch (this.f5996d) {
            case 0:
                return (Bitmap) this.f5997e;
            case BuildConfig.VERSION_CODE /* 1 */:
                return (byte[]) this.f5997e;
            case 2:
                return (AnimatedImageDrawable) this.f5997e;
            default:
                return (File) this.f5997e;
        }
    }

    public C1736D(byte[] bArr) {
        this.f5996d = 1;
        AbstractC2503g.m4445c(bArr, "Argument must not be null");
        this.f5997e = bArr;
    }

    public C1736D(File file) {
        this.f5996d = 3;
        AbstractC2503g.m4445c(file, "Argument must not be null");
        this.f5997e = file;
    }

    /* JADX INFO: renamed from: a */
    private final void m3094a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m3095b() {
    }

    /* JADX INFO: renamed from: f */
    private final void m3096f() {
    }
}
