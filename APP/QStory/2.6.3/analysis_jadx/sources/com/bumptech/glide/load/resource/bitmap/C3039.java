package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.security.MessageDigest;
import p286.InterfaceC8399;
import p336.C8791;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3039 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f9675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8399 f9676;

    public C3039(InterfaceC8399 interfaceC8399, boolean z) {
        this.f9676 = interfaceC8399;
        this.f9675 = z;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C3039) {
            return this.f9676.equals(((C3039) obj).f9676);
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return this.f9676.hashCode();
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6535(Context context, InterfaceC2989 interfaceC2989, int i, int i2) {
        InterfaceC2979 interfaceC2979 = ComponentCallbacks2C3058.m6767(context).f9774;
        Drawable drawable = (Drawable) interfaceC2989.get();
        C3026 c3026M6579 = AbstractC3038.m6579(interfaceC2979, drawable, i, i2);
        if (c3026M6579 == null) {
            if (!this.f9675) {
                return interfaceC2989;
            }
            C8791.m14472(drawable, "Unable to convert ", " to a Bitmap");
            return null;
        }
        InterfaceC2989 interfaceC2989Mo6535 = this.f9676.mo6535(context, c3026M6579, i, i2);
        if (!interfaceC2989Mo6535.equals(c3026M6579)) {
            return new C3026(context.getResources(), interfaceC2989Mo6535);
        }
        interfaceC2989Mo6535.recycle();
        return interfaceC2989;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        this.f9676.mo6468(messageDigest);
    }
}
