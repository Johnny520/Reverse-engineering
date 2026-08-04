package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: yyds.ᲀᛲᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1944 implements InterfaceC0814 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9784;

    public /* synthetic */ C1944(int i) {
        this.f9784 = i;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo427(Object obj, C0822 c0822) {
        switch (this.f9784) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // yyds.InterfaceC0814
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC2162 mo428(Object obj, int i, int i2, C0822 c0822) {
        switch (this.f9784) {
            case 0:
                return new C0418((File) obj);
            case 1:
                return new C0418(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C1003(drawable, 1);
                }
                return null;
        }
    }
}
