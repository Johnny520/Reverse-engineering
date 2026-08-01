package p362;

import com.bumptech.glide.AbstractC3056;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8939 extends AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InputStream f25145;

    public C8939(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "origin");
        this.f25145 = inputStream;
    }

    @Override // p358.InterfaceC8915
    public final Object get() {
        return this.f25145;
    }

    public final String toString() {
        return C8939.class.getSimpleName() + "[" + this.f25145.toString() + "]";
    }
}
