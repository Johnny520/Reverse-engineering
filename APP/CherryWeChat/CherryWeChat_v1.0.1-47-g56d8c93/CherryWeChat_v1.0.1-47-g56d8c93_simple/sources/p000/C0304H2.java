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

    public /* synthetic */ C0304H2(int r1, Object r2) {
        this.f1016a = r1;
        this.f1017b = r2;
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
        switch(this.f1016a) {
            case 0: goto L10;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        return 1;
    L10:
        AnimatedImageDrawable r0 = (AnimatedImageDrawable) this.f1017b;
        int r1 = r0.getIntrinsicWidth();
        int r02 = r0.getIntrinsicHeight() * r1;
        return (AbstractC2622vD.m5133d(Bitmap.Config.ARGB_8888) * r02) * 2;
    L5:
        return AbstractC2622vD.m5132c((Bitmap) this.f1017b);
    L9:
        return ((byte[]) this.f1017b).length;
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        switch(this.f1016a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        return Bitmap.class;
    L8:
        return byte[].class;
    L10:
        return Drawable.class;
    L7:
        return ((File) this.f1017b).getClass();
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final void mo118e() {
        switch(this.f1016a) {
            case 0: goto L5;
            case 1: goto L4;
            case 2: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L5:
        AnimatedImageDrawable r0 = (AnimatedImageDrawable) this.f1017b;
        r0.stop();
        r0.clearAnimationCallbacks();
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        switch(this.f1016a) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return (Bitmap) this.f1017b;
    L7:
        return (File) this.f1017b;
    L9:
        return (byte[]) this.f1017b;
    L11:
        return (AnimatedImageDrawable) this.f1017b;
    }

    public C0304H2(byte[] r2) {
        this.f1016a = 1;
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        this.f1017b = r2;
    }

    public C0304H2(File r2) {
        this.f1016a = 2;
        AbstractC0714Qj.m1488j("Argument must not be null", r2);
        this.f1017b = r2;
    }
}
