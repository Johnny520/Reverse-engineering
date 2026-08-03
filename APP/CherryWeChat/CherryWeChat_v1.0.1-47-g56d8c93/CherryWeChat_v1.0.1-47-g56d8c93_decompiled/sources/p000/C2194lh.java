package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: lh */
/* JADX INFO: loaded from: classes.dex */
public final class C2194lh implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7647a;

    public /* synthetic */ C2194lh(int i) {
        this.f7647a = i;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object obj, int i, int i2, C2644vt c2644vt) {
        switch (this.f7647a) {
            case 0:
                return new C0304H2((File) obj);
            case 1:
                return new C0304H2(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C0069Bj(drawable, 1);
                }
                return null;
        }
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo750b(Object obj, C2644vt c2644vt) {
        switch (this.f7647a) {
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
