package yyds;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: yyds.ᛳᛸᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0656 implements InterfaceC2162, InterfaceC0765 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f3144;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3145 = 1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f3146;

    public C0656(Bitmap bitmap, InterfaceC2587 interfaceC2587) {
        AbstractC0319.m992(bitmap, "Bitmap must not be null");
        this.f3146 = bitmap;
        AbstractC0319.m992(interfaceC2587, "BitmapPool must not be null");
        this.f3144 = interfaceC2587;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C0656 m1574(Bitmap bitmap, InterfaceC2587 interfaceC2587) {
        if (bitmap == null) {
            return null;
        }
        return new C0656(bitmap, interfaceC2587);
    }

    @Override // yyds.InterfaceC2162
    public final Object get() {
        switch (this.f3145) {
            case 0:
                return (Bitmap) this.f3146;
            default:
                return new BitmapDrawable((Resources) this.f3146, (Bitmap) ((InterfaceC2162) this.f3144).get());
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1177() {
        switch (this.f3145) {
            case 0:
                ((InterfaceC2587) this.f3144).mo1856((Bitmap) this.f3146);
                break;
            default:
                ((InterfaceC2162) this.f3144).mo1177();
                break;
        }
    }

    @Override // yyds.InterfaceC0765
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo1575() {
        switch (this.f3145) {
            case 0:
                ((Bitmap) this.f3146).prepareToDraw();
                break;
            default:
                InterfaceC2162 interfaceC2162 = (InterfaceC2162) this.f3144;
                if (interfaceC2162 instanceof InterfaceC0765) {
                    ((InterfaceC0765) interfaceC2162).mo1575();
                }
                break;
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final int mo1178() {
        switch (this.f3145) {
            case 0:
                return AbstractC0181.m756((Bitmap) this.f3146);
            default:
                return ((InterfaceC2162) this.f3144).mo1178();
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Class mo1179() {
        switch (this.f3145) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    public C0656(Resources resources, InterfaceC2162 interfaceC2162) {
        AbstractC0319.m992(resources, "Argument must not be null");
        this.f3146 = resources;
        AbstractC0319.m992(interfaceC2162, "Argument must not be null");
        this.f3144 = interfaceC2162;
    }
}
