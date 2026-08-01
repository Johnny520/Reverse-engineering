package p250;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.resource.bitmap.C3858;
import java.security.MessageDigest;
import p238.AbstractC8818;
import p302.InterfaceC9228;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8909 implements InterfaceC9228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC9228 f22617;

    public C8909(InterfaceC9228 interfaceC9228) {
        AbstractC8818.m14028(interfaceC9228, "Argument must not be null");
        this.f22617 = interfaceC9228;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C8909) {
            return this.f22617.equals(((C8909) obj).f22617);
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return this.f22617.hashCode();
    }

    @Override // p302.InterfaceC9228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7095(Context context, InterfaceC3821 interfaceC3821, int i, int i2) {
        C8911 c8911 = (C8911) interfaceC3821.get();
        C3858 c3858 = new C3858(((C8913) c8911.f22629.f20627).f22650, ComponentCallbacks2C3890.m7327(context).f10119);
        InterfaceC9228 interfaceC9228 = this.f22617;
        InterfaceC3821 interfaceC3821Mo7095 = interfaceC9228.mo7095(context, c3858, i, i2);
        if (c3858 != interfaceC3821Mo7095) {
            c3858.recycle();
        }
        ((C8913) c8911.f22629.f20627).m14122(interfaceC9228, (Bitmap) interfaceC3821Mo7095.get());
        return interfaceC3821;
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        this.f22617.mo7028(messageDigest);
    }
}
