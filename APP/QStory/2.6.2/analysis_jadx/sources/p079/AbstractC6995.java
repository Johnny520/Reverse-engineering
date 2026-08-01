package p079;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6995 extends AbstractC7007 implements InterfaceC4495 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4844 f18755;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6996 f18756;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4489 f18757;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18758;

    static {
        new PropertyReference1Impl(AbstractC6995.class, "constructors", "getConstructors()Ljava/util/Collection;", 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6995(C4844 c4844, InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, C4690 c4690, C4489 c4489) {
        super(interfaceC4498, interfaceC6480, c4690, InterfaceC4461.f13087);
        c4844.getClass();
        interfaceC4498.getClass();
        c4489.getClass();
        this.f18755 = c4844;
        this.f18757 = c4489;
        c4844.m9590(new C1322(this, 14));
        this.f18756 = new C6996(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497
    public final C4489 getVisibility() {
        return this.f18757;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC7008
    public final String toString() {
        return "typealias " + getName().m9345();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public abstract AbstractC6988 mo9529();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract AbstractC4877 mo9531();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public abstract AbstractC4877 mo9532();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        return this.f18756;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo299(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9018() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9021() {
        return AbstractC4916.m9852(mo9532(), new C1012(this, 25), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9025() {
        List list = this.f18758;
        if (list != null) {
            return list;
        }
        AbstractC4394.m8918("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9026() {
        return false;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4498 mo9012() {
        return this;
    }

    @Override // p079.AbstractC7007
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final InterfaceC4499 mo9012() {
        return this;
    }

    @Override // p079.AbstractC7007, p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4476 mo9012() {
        return this;
    }
}
