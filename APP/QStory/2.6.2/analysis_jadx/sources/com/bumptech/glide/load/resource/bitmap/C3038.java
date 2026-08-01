package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.security.MessageDigest;
import p286.InterfaceC8398;
import p330.C8796;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3038 implements InterfaceC8398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f9673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8398 f9674;

    public C3038(InterfaceC8398 interfaceC8398, boolean z) {
        this.f9674 = interfaceC8398;
        this.f9673 = z;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C3038) {
            return this.f9674.equals(((C3038) obj).f9674);
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return this.f9674.hashCode();
    }

    @Override // p286.InterfaceC8398
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6475(Context context, InterfaceC2988 interfaceC2988, int i, int i2) {
        InterfaceC2978 interfaceC2978 = ComponentCallbacks2C3057.m6722(context).f9765;
        Drawable drawable = (Drawable) interfaceC2988.get();
        C3025 c3025M6519 = AbstractC3037.m6519(interfaceC2978, drawable, i, i2);
        if (c3025M6519 == null) {
            if (!this.f9673) {
                return interfaceC2988;
            }
            C8796.m14448(drawable, "Unable to convert ", " to a Bitmap");
            return null;
        }
        InterfaceC2988 interfaceC2988Mo6475 = this.f9674.mo6475(context, c3025M6519, i, i2);
        if (!interfaceC2988Mo6475.equals(c3025M6519)) {
            return new C3025(context.getResources(), interfaceC2988Mo6475);
        }
        interfaceC2988Mo6475.recycle();
        return interfaceC2988;
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        this.f9674.mo6410(messageDigest);
    }
}
