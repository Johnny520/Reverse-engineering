package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements g92 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8985a;

    public /* synthetic */ qi0(int i) {
        this.f8985a = i;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final d92 mo866a(Object obj, int i, int i2, ov1 ov1Var) {
        switch (this.f8985a) {
            case 0:
                return new C0842wc((File) obj);
            case 1:
                return new C0842wc(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new zo0(drawable, 1);
                }
                return null;
        }
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo867b(Object obj, ov1 ov1Var) {
        switch (this.f8985a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
