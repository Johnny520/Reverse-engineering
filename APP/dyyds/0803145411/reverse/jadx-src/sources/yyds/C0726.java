package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0040;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛳᲇᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0726 implements InterfaceC0556 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0556 f3393;

    public C0726(InterfaceC0556 interfaceC0556) {
        AbstractC0319.m992(interfaceC0556, "Argument must not be null");
        this.f3393 = interfaceC0556;
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (obj instanceof C0726) {
            return this.f3393.equals(((C0726) obj).f3393);
        }
        return false;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return this.f3393.hashCode();
    }

    @Override // yyds.InterfaceC0556
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final InterfaceC2162 mo1240(Context context, InterfaceC2162 interfaceC2162, int i, int i2) {
        C2380 c2380 = (C2380) interfaceC2162.get();
        C0656 c0656 = new C0656(c2380.f11732.f12303.f12036, ComponentCallbacks2C0040.m249(context).f383);
        InterfaceC0556 interfaceC0556 = this.f3393;
        InterfaceC2162 interfaceC2162Mo1240 = interfaceC0556.mo1240(context, c0656, i, i2);
        if (c0656 != interfaceC2162Mo1240) {
            c0656.mo1177();
        }
        c2380.f11732.f12303.m4483(interfaceC0556, (Bitmap) interfaceC2162Mo1240.get());
        return interfaceC2162;
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        this.f3393.mo1227(messageDigest);
    }
}
