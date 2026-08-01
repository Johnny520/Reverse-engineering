package p234;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.resource.bitmap.C3025;
import java.security.MessageDigest;
import p222.AbstractC7988;
import p286.InterfaceC8398;

/* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8079 implements InterfaceC8398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8398 f22274;

    public C8079(InterfaceC8398 interfaceC8398) {
        AbstractC7988.m13441(interfaceC8398, "Argument must not be null");
        this.f22274 = interfaceC8398;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C8079) {
            return this.f22274.equals(((C8079) obj).f22274);
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return this.f22274.hashCode();
    }

    @Override // p286.InterfaceC8398
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6475(Context context, InterfaceC2988 interfaceC2988, int i, int i2) {
        C8081 c8081 = (C8081) interfaceC2988.get();
        C3025 c3025 = new C3025(((C8083) c8081.f22286.f20287).f22307, ComponentCallbacks2C3057.m6722(context).f9765);
        InterfaceC8398 interfaceC8398 = this.f22274;
        InterfaceC2988 interfaceC2988Mo6475 = interfaceC8398.mo6475(context, c3025, i, i2);
        if (c3025 != interfaceC2988Mo6475) {
            c3025.recycle();
        }
        ((C8083) c8081.f22286.f20287).m13534(interfaceC8398, (Bitmap) interfaceC2988Mo6475.get());
        return interfaceC2988;
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        this.f22274.mo6410(messageDigest);
    }
}
