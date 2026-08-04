package yyds;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛲᲁᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0452 implements InterfaceC0556 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0556 f2285;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f2286;

    public C0452(InterfaceC0556 interfaceC0556, boolean z) {
        this.f2285 = interfaceC0556;
        this.f2286 = z;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (obj instanceof C0452) {
            return this.f2285.equals(((C0452) obj).f2285);
        }
        return false;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return this.f2285.hashCode();
    }

    @Override // yyds.InterfaceC0556
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2162 mo1240(Context context, InterfaceC2162 interfaceC2162, int i, int i2) {
        InterfaceC2587 interfaceC2587 = ComponentCallbacks2C0040.m249(context).f383;
        Drawable drawable = (Drawable) interfaceC2162.get();
        C0656 c0656M1827 = AbstractC0797.m1827(interfaceC2587, drawable, i, i2);
        if (c0656M1827 == null) {
            if (!this.f2286) {
                return interfaceC2162;
            }
            C1693.m3444(drawable, "Unable to convert ", " to a Bitmap");
            return null;
        }
        InterfaceC2162 interfaceC2162Mo1240 = this.f2285.mo1240(context, c0656M1827, i, i2);
        if (!interfaceC2162Mo1240.equals(c0656M1827)) {
            return new C0656(context.getResources(), interfaceC2162Mo1240);
        }
        interfaceC2162Mo1240.mo1177();
        return interfaceC2162;
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        this.f2285.mo1227(messageDigest);
    }
}
