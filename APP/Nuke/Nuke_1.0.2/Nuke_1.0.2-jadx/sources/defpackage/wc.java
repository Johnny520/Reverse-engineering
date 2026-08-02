package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wc implements d92 {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wc(byte[] bArr) {
        this.h = 1;
        fg1.q("Argument must not be null", bArr);
        this.i = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final int b() {
        switch (this.h) {
            case 0:
                return b93.d(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.i).getIntrinsicHeight() * ((AnimatedImageDrawable) this.i).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.i).length;
            case 2:
                return 1;
            default:
                return b93.c((Bitmap) this.i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Class d() {
        switch (this.h) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.i).getClass();
            default:
                return Bitmap.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final void e() {
        switch (this.h) {
            case 0:
                ((AnimatedImageDrawable) this.i).stop();
                ((AnimatedImageDrawable) this.i).clearAnimationCallbacks();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Object get() {
        switch (this.h) {
            case 0:
                return (AnimatedImageDrawable) this.i;
            case 1:
                return (byte[]) this.i;
            case 2:
                return (File) this.i;
            default:
                return (Bitmap) this.i;
        }
    }

    public /* synthetic */ wc(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    public wc(File file) {
        this.h = 2;
        fg1.q("Argument must not be null", file);
        this.i = file;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }
}
