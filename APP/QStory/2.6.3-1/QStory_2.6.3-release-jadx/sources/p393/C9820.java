package p393;

import com.alibaba.fastjson2.AbstractC3738;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9820 extends AbstractC3738 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InputStream f25564;

    public C9820(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "origin");
        this.f25564 = inputStream;
    }

    @Override // p374.InterfaceC9734
    public final Object get() {
        return this.f25564;
    }

    public final String toString() {
        return C9820.class.getSimpleName() + "[" + this.f25564.toString() + "]";
    }
}
