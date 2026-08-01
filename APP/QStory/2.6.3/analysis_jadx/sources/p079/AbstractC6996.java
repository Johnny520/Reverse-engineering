package p079;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6996 extends AbstractC7008 implements InterfaceC4496 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4845 f18750;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6997 f18751;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C4490 f18752;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f18753;

    static {
        new PropertyReference1Impl(AbstractC6996.class, "constructors", "getConstructors()Ljava/util/Collection;", 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6996(C4845 c4845, InterfaceC4499 interfaceC4499, InterfaceC6481 interfaceC6481, C4691 c4691, C4490 c4490) {
        super(interfaceC4499, interfaceC6481, c4691, InterfaceC4462.f13091);
        c4845.getClass();
        interfaceC4499.getClass();
        c4490.getClass();
        this.f18750 = c4845;
        this.f18752 = c4490;
        c4845.m9580(new C1322(this, 14));
        this.f18751 = new C6997(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4490 getVisibility() {
        return this.f18752;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    public final boolean isExternal() {
        return false;
    }

    @Override // p079.AbstractC7009
    public final String toString() {
        return "typealias " + getName().m9335();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public abstract AbstractC6989 mo9519();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰 */
    public abstract AbstractC4878 mo9521();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public abstract AbstractC4878 mo9522();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4873 mo9001() {
        return this.f18751;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo292(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9008() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo9011() {
        return AbstractC4917.m9846(mo9522(), new C1012(this, 25), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final List mo9015() {
        List list = this.f18753;
        if (list != null) {
            return list;
        }
        AbstractC4395.m8908("declaredTypeParametersImpl");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9016() {
        return false;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4499 mo9002() {
        return this;
    }

    @Override // p079.AbstractC7008
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final InterfaceC4500 mo9002() {
        return this;
    }

    @Override // p079.AbstractC7008, p079.AbstractC7009, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4477 mo9002() {
        return this;
    }
}
