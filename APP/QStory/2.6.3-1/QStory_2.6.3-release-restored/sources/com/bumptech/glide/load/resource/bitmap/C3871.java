package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import java.security.MessageDigest;
import p302.InterfaceC9228;
import p352.C9620;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3871 implements InterfaceC9228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f10020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC9228 f10021;

    public C3871(InterfaceC9228 interfaceC9228, boolean z) {
        this.f10021 = interfaceC9228;
        this.f10020 = z;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C3871) {
            return this.f10021.equals(((C3871) obj).f10021);
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return this.f10021.hashCode();
    }

    @Override // p302.InterfaceC9228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7095(Context context, InterfaceC3821 interfaceC3821, int i, int i2) {
        InterfaceC3811 interfaceC3811 = ComponentCallbacks2C3890.m7327(context).f10119;
        Drawable drawable = (Drawable) interfaceC3821.get();
        C3858 c3858M7139 = AbstractC3870.m7139(interfaceC3811, drawable, i, i2);
        if (c3858M7139 == null) {
            if (!this.f10020) {
                return interfaceC3821;
            }
            C9620.m15031(drawable, "Unable to convert ", " to a Bitmap");
            return null;
        }
        InterfaceC3821 interfaceC3821Mo7095 = this.f10021.mo7095(context, c3858M7139, i, i2);
        if (!interfaceC3821Mo7095.equals(c3858M7139)) {
            return new C3858(context.getResources(), interfaceC3821Mo7095);
        }
        interfaceC3821Mo7095.recycle();
        return interfaceC3821;
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        this.f10021.mo7028(messageDigest);
    }
}
