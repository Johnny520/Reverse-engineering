package yyds;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛴᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1003 implements InterfaceC2162, InterfaceC0765 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Drawable f4567;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f4568;

    public C1003(Drawable drawable, int i) {
        this.f4568 = i;
        AbstractC0319.m992(drawable, "Argument must not be null");
        this.f4567 = drawable;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m2184() {
    }

    @Override // yyds.InterfaceC2162
    public final Object get() {
        Drawable drawable = this.f4567;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1177() {
        C2267 c2267;
        C2267 c22672;
        C2267 c22673;
        switch (this.f4568) {
            case 0:
                C2380 c2380 = (C2380) this.f4567;
                c2380.stop();
                c2380.f11733 = true;
                C2445 c2445 = c2380.f11732.f12303;
                ComponentCallbacks2C2272 componentCallbacks2C2272 = c2445.f12041;
                c2445.f12038.clear();
                Bitmap bitmap = c2445.f12036;
                if (bitmap != null) {
                    c2445.f12030.mo1856(bitmap);
                    c2445.f12036 = null;
                }
                c2445.f12040 = false;
                C1751 c1751 = c2445.f12029;
                if (c1751 != null) {
                    componentCallbacks2C2272.m4281(c1751);
                    c2445.f12029 = null;
                }
                C1751 c17512 = c2445.f12035;
                if (c17512 != null) {
                    componentCallbacks2C2272.m4281(c17512);
                    c2445.f12035 = null;
                }
                C1751 c17513 = c2445.f12028;
                if (c17513 != null) {
                    componentCallbacks2C2272.m4281(c17513);
                    c2445.f12028 = null;
                }
                C1575 c1575 = c2445.f12031;
                C2133 c2133 = c1575.f7995;
                c1575.f7992 = null;
                byte[] bArr = c1575.f7982;
                if (bArr != null && (c22673 = (C2267) c2133.f10553) != null) {
                    c22673.m4271(bArr);
                }
                int[] iArr = c1575.f7993;
                if (iArr != null && (c22672 = (C2267) c2133.f10553) != null) {
                    c22672.m4271(iArr);
                }
                Bitmap bitmap2 = c1575.f7981;
                if (bitmap2 != null) {
                    ((InterfaceC2587) c2133.f10555).mo1856(bitmap2);
                }
                c1575.f7981 = null;
                c1575.f7998 = null;
                c1575.f7994 = null;
                byte[] bArr2 = c1575.f7983;
                if (bArr2 != null && (c2267 = (C2267) c2133.f10553) != null) {
                    c2267.m4271(bArr2);
                }
                c2445.f12037 = true;
                break;
        }
    }

    @Override // yyds.InterfaceC0765
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo1575() {
        int i = this.f4568;
        Drawable drawable = this.f4567;
        switch (i) {
            case 0:
                ((C2380) drawable).f11732.f12303.f12036.prepareToDraw();
                break;
            default:
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C2380) {
                    ((C2380) drawable).f11732.f12303.f12036.prepareToDraw();
                }
                break;
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final int mo1178() {
        int i = this.f4568;
        Drawable drawable = this.f4567;
        switch (i) {
            case 0:
                C2445 c2445 = ((C2380) drawable).f11732.f12303;
                C1575 c1575 = c2445.f12031;
                return (c1575.f7993.length * 4) + c1575.f7998.limit() + c1575.f7982.length + c2445.f12026;
            default:
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Class mo1179() {
        switch (this.f4568) {
            case 0:
                return C2380.class;
            default:
                return this.f4567.getClass();
        }
    }
}
