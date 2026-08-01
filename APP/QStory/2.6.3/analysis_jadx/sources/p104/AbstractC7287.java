package p104;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7287 implements InterfaceC7280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f19390;

    public AbstractC7287(String str, InterfaceC6558 interfaceC6558) {
        this.f19390 = interfaceC6558;
        this.f19389 = "must return ".concat(str);
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ String mo12496(C4565 c4565) {
        return AbstractC4922.m9874(this, c4565);
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12497(C4565 c4565) {
        return AbstractC4395.m8907(c4565.f18785, this.f19390.invoke(AbstractC4773.m9499(c4565)));
    }

    @Override // p104.InterfaceC7280
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12498() {
        return this.f19389;
    }
}
