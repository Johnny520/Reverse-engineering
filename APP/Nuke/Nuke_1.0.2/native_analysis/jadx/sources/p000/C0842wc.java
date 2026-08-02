package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: wc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0842wc implements d92 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12455h;

    /* JADX INFO: renamed from: i */
    public final Object f12456i;

    public C0842wc(byte[] bArr) {
        this.f12455h = 1;
        fg1.m1642q("Argument must not be null", bArr);
        this.f12456i = bArr;
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: b */
    public final int mo190b() {
        switch (this.f12455h) {
            case 0:
                return b93.m497d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.f12456i).getIntrinsicHeight() * ((AnimatedImageDrawable) this.f12456i).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.f12456i).length;
            case 2:
                return 1;
            default:
                return b93.m496c((Bitmap) this.f12456i);
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: d */
    public final Class mo191d() {
        switch (this.f12455h) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.f12456i).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // p000.d92
    /* JADX INFO: renamed from: e */
    public final void mo192e() {
        switch (this.f12455h) {
            case 0:
                ((AnimatedImageDrawable) this.f12456i).stop();
                ((AnimatedImageDrawable) this.f12456i).clearAnimationCallbacks();
                break;
        }
    }

    @Override // p000.d92
    public final Object get() {
        switch (this.f12455h) {
            case 0:
                return (AnimatedImageDrawable) this.f12456i;
            case 1:
                return (byte[]) this.f12456i;
            case 2:
                return (File) this.f12456i;
            default:
                return (Bitmap) this.f12456i;
        }
    }

    public /* synthetic */ C0842wc(int i, Object obj) {
        this.f12455h = i;
        this.f12456i = obj;
    }

    public C0842wc(File file) {
        this.f12455h = 2;
        fg1.m1642q("Argument must not be null", file);
        this.f12456i = file;
    }

    /* JADX INFO: renamed from: a */
    private final void m5865a() {
    }

    /* JADX INFO: renamed from: c */
    private final void m5866c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m5867f() {
    }
}
