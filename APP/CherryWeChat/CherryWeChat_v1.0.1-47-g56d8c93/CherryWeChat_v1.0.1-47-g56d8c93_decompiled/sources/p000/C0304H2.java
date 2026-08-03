package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: H2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0304H2 implements InterfaceC2389pw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1016a;

    /* JADX INFO: renamed from: b */
    public final Object f1017b;

    public /* synthetic */ C0304H2(int i, Object obj) {
        this.f1016a = i;
        this.f1017b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m654a() {
    }

    /* JADX INFO: renamed from: c */
    private final void m655c() {
    }

    /* JADX INFO: renamed from: f */
    private final void m656f() {
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        switch (this.f1016a) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f1017b;
                return AbstractC2622vD.m5133d(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.f1017b).length;
            case 2:
                return 1;
            default:
                return AbstractC2622vD.m5132c((Bitmap) this.f1017b);
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        switch (this.f1016a) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.f1017b).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final void mo118e() {
        switch (this.f1016a) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f1017b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        switch (this.f1016a) {
            case 0:
                return (AnimatedImageDrawable) this.f1017b;
            case 1:
                return (byte[]) this.f1017b;
            case 2:
                return (File) this.f1017b;
            default:
                return (Bitmap) this.f1017b;
        }
    }

    public C0304H2(byte[] bArr) {
        this.f1016a = 1;
        AbstractC0714Qj.m1488j("Argument must not be null", bArr);
        this.f1017b = bArr;
    }

    public C0304H2(File file) {
        this.f1016a = 2;
        AbstractC0714Qj.m1488j("Argument must not be null", file);
        this.f1017b = file;
    }
}
