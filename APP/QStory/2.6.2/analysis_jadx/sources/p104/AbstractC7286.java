package p104;

import com.bumptech.glide.AbstractC3055;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7286 implements InterfaceC7279 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19394;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f19395;

    public AbstractC7286(String str, InterfaceC6557 interfaceC6557) {
        this.f19395 = interfaceC6557;
        this.f19394 = "must return ".concat(str);
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ String mo12469(C4564 c4564) {
        return AbstractC3055.m6641(this, c4564);
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12470(C4564 c4564) {
        return AbstractC4394.m8917(c4564.f18790, this.f19395.invoke(AbstractC4772.m9509(c4564)));
    }

    @Override // p104.InterfaceC7279
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12471() {
        return this.f19394;
    }
}
