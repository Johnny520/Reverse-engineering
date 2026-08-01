package p079;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.text.C1012;
import com.alibaba.fastjson2.C2942;
import io.ktor.util.C4211;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4421;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import p019.C6263;
import p046.C6482;
import p049.AbstractC6530;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6988 extends AbstractC7009 implements InterfaceC4486 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f18696;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4837 f18697;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Map f18698;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC6530 f18699;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC4475 f18700;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f18701;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6995 f18702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0108 f18703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4845 f18704;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6988(C4691 c4691, C4845 c4845, AbstractC6530 abstractC6530, int i) {
        super(C6482.f17768, c4691);
        Map mapM8776 = AbstractC4339.m8776();
        c4691.getClass();
        this.f18704 = c4845;
        this.f18699 = abstractC6530;
        if (!c4691.f13704) {
            C4211.m8604(c4691, "Module name must be special: ");
            throw null;
        }
        this.f18698 = mapM8776;
        InterfaceC6995.f18749.getClass();
        InterfaceC6995 interfaceC6995 = (InterfaceC6995) mo9065(C6985.f18685);
        this.f18702 = interfaceC6995 == null ? C6984.f18684 : interfaceC6995;
        this.f18701 = true;
        this.f18697 = c4845.m9579(new C1012(this, 26));
        this.f18696 = AbstractC5187.m10214(new C4421(this, 2));
    }

    @Override // p079.AbstractC7009
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC7009.m12347(this));
        if (!this.f18701) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC4475 interfaceC4475 = this.f18700;
        sb.append(interfaceC4475 != null ? interfaceC4475.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo9060(InterfaceC4486 interfaceC4486) {
        interfaceC4486.getClass();
        if (this == interfaceC4486) {
            return true;
        }
        C0108 c0108 = this.f18703;
        c0108.getClass();
        return AbstractC4344.m8806((Set) c0108.f320, interfaceC4486) || mo9064().contains(interfaceC4486) || interfaceC4486.mo9064().contains(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void m12305() {
        if (this.f18701) {
            return;
        }
        if (mo9065(AbstractC4491.f13132) != null) {
            C2942.m6394();
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9061() {
        return this.f18699;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo288(obj, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final C7004 mo9062(C4687 c4687) {
        c4687.getClass();
        m12305();
        return (C7004) this.f18697.invoke(c4687);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final /* bridge */ InterfaceC4499 mo9028() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9063(C4687 c4687, InterfaceC6558 interfaceC6558) {
        c4687.getClass();
        m12305();
        m12305();
        return ((C7017) this.f18696.getValue()).mo8954(c4687, interfaceC6558);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final List mo9064() {
        C0108 c0108 = this.f18703;
        if (c0108 != null) {
            return (List) c0108.f318;
        }
        String str = getName().f13705;
        str.getClass();
        C6263.m11776(str, "Dependencies of module ", " were not set");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final Object mo9065(C4485 c4485) {
        c4485.getClass();
        Object obj = this.f18698.get(c4485);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
