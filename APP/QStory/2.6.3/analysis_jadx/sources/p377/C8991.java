package p377;

import com.alibaba.fastjson2.AbstractC2905;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8991 extends AbstractC2905 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InputStream f25219;

    public C8991(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "origin");
        this.f25219 = inputStream;
    }

    @Override // p358.InterfaceC8905
    public final Object get() {
        return this.f25219;
    }

    public final String toString() {
        return C8991.class.getSimpleName() + "[" + this.f25219.toString() + "]";
    }
}
