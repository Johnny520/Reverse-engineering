package p120;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8116 implements InterfaceC8109 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19734;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f19735;

    public AbstractC8116(String str, InterfaceC7387 interfaceC7387) {
        this.f19735 = interfaceC7387;
        this.f19734 = "must return ".concat(str);
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ String mo13055(C5397 c5397) {
        return AbstractC5754.m10433(this, c5397);
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo13056(C5397 c5397) {
        return AbstractC5227.m9466(c5397.f19130, this.f19735.invoke(AbstractC5605.m10058(c5397)));
    }

    @Override // p120.InterfaceC8109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo13057() {
        return this.f19734;
    }
}
