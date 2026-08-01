package p079;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.text.C1012;
import com.alibaba.fastjson2.C2941;
import io.ktor.util.C4210;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4420;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p022.C6267;
import p046.C6481;
import p049.AbstractC6529;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6987 extends AbstractC7008 implements InterfaceC4485 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f18701;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C4836 f18702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Map f18703;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC6529 f18704;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC4474 f18705;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f18706;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6994 f18707;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0108 f18708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4844 f18709;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6987(C4690 c4690, C4844 c4844, AbstractC6529 abstractC6529, int i) {
        super(C6481.f17772, c4690);
        Map mapM8781 = AbstractC4338.m8781();
        c4690.getClass();
        this.f18709 = c4844;
        this.f18704 = abstractC6529;
        if (!c4690.f13700) {
            C4210.m8614(c4690, "Module name must be special: ");
            throw null;
        }
        this.f18703 = mapM8781;
        InterfaceC6994.f18754.getClass();
        InterfaceC6994 interfaceC6994 = (InterfaceC6994) mo9075(C6984.f18690);
        this.f18707 = interfaceC6994 == null ? C6983.f18689 : interfaceC6994;
        this.f18706 = true;
        this.f18702 = c4844.m9589(new C1012(this, 26));
        this.f18701 = AbstractC5186.m10210(new C4420(this, 2));
    }

    @Override // p079.AbstractC7008
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC7008.m12320(this));
        if (!this.f18706) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC4474 interfaceC4474 = this.f18705;
        sb.append(interfaceC4474 != null ? interfaceC4474.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo9070(InterfaceC4485 interfaceC4485) {
        interfaceC4485.getClass();
        if (this == interfaceC4485) {
            return true;
        }
        C0108 c0108 = this.f18708;
        c0108.getClass();
        return AbstractC4343.m8789((Set) c0108.f320, interfaceC4485) || mo9074().contains(interfaceC4485) || interfaceC4485.mo9074().contains(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void m12278() {
        if (this.f18706) {
            return;
        }
        if (mo9075(AbstractC4490.f13128) != null) {
            C2941.m6336();
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9071() {
        return this.f18704;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo287(obj, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final C7003 mo9072(C4686 c4686) {
        c4686.getClass();
        m12278();
        return (C7003) this.f18702.invoke(c4686);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final /* bridge */ InterfaceC4498 mo9038() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9073(C4686 c4686, InterfaceC6557 interfaceC6557) {
        c4686.getClass();
        m12278();
        m12278();
        return ((C7016) this.f18701.getValue()).mo8964(c4686, interfaceC6557);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final List mo9074() {
        C0108 c0108 = this.f18708;
        if (c0108 != null) {
            return (List) c0108.f318;
        }
        String str = getName().f13701;
        str.getClass();
        C6267.m11759(str, "Dependencies of module ", " were not set");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final Object mo9075(C4484 c4484) {
        c4484.getClass();
        Object obj = this.f18703.get(c4484);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
