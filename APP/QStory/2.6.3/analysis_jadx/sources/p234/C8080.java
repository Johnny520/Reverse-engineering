package p234;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.resource.bitmap.C3026;
import java.security.MessageDigest;
import p222.AbstractC7989;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8080 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8399 f22272;

    public C8080(InterfaceC8399 interfaceC8399) {
        AbstractC7989.m13469(interfaceC8399, "Argument must not be null");
        this.f22272 = interfaceC8399;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C8080) {
            return this.f22272.equals(((C8080) obj).f22272);
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return this.f22272.hashCode();
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6535(Context context, InterfaceC2989 interfaceC2989, int i, int i2) {
        C8082 c8082 = (C8082) interfaceC2989.get();
        C3026 c3026 = new C3026(((C8084) c8082.f22284.f20282).f22305, ComponentCallbacks2C3058.m6767(context).f9774);
        InterfaceC8399 interfaceC8399 = this.f22272;
        InterfaceC2989 interfaceC2989Mo6535 = interfaceC8399.mo6535(context, c3026, i, i2);
        if (c3026 != interfaceC2989Mo6535) {
            c3026.recycle();
        }
        ((C8084) c8082.f22284.f20282).m13563(interfaceC8399, (Bitmap) interfaceC2989Mo6535.get());
        return interfaceC2989;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        this.f22272.mo6468(messageDigest);
    }
}
