package p095;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.text.C1850;
import com.alibaba.fastjson2.C3775;
import io.ktor.util.C5043;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5253;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import p035.C7092;
import p062.C7311;
import p065.AbstractC7359;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7817 extends AbstractC7838 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f19041;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5669 f19042;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Map f19043;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC7359 f19044;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC5307 f19045;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f19046;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC7824 f19047;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0955 f19048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5677 f19049;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7817(C5523 c5523, C5677 c5677, AbstractC7359 abstractC7359, int i) {
        super(C7311.f18113, c5523);
        Map mapM9335 = AbstractC5171.m9335();
        c5523.getClass();
        this.f19049 = c5677;
        this.f19044 = abstractC7359;
        if (!c5523.f14049) {
            C5043.m9163(c5523, "Module name must be special: ");
            throw null;
        }
        this.f19043 = mapM9335;
        InterfaceC7824.f19094.getClass();
        InterfaceC7824 interfaceC7824 = (InterfaceC7824) mo9624(C7814.f19030);
        this.f19047 = interfaceC7824 == null ? C7813.f19029 : interfaceC7824;
        this.f19046 = true;
        this.f19042 = c5677.m10138(new C1850(this, 26));
        this.f19041 = AbstractC6019.m10773(new C5253(this, 2));
    }

    @Override // p095.AbstractC7838
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC7838.m12906(this));
        if (!this.f19046) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC5307 interfaceC5307 = this.f19045;
        sb.append(interfaceC5307 != null ? interfaceC5307.getClass().getSimpleName() : null);
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo9619(InterfaceC5318 interfaceC5318) {
        interfaceC5318.getClass();
        if (this == interfaceC5318) {
            return true;
        }
        C0955 c0955 = this.f19048;
        c0955.getClass();
        return AbstractC5176.m9365((Set) c0955.f665, interfaceC5318) || mo9623().contains(interfaceC5318) || interfaceC5318.mo9623().contains(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final void m12864() {
        if (this.f19046) {
            return;
        }
        if (mo9624(AbstractC5323.f13477) != null) {
            C3775.m6954();
        } else {
            throw new InvalidModuleException("Accessing invalid module descriptor " + this);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo9620() {
        return this.f19044;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo848(obj, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final C7833 mo9621(C5519 c5519) {
        c5519.getClass();
        m12864();
        return (C7833) this.f19042.invoke(c5519);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final /* bridge */ InterfaceC5331 mo9587() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Collection mo9622(C5519 c5519, InterfaceC7387 interfaceC7387) {
        c5519.getClass();
        m12864();
        m12864();
        return ((C7846) this.f19041.getValue()).mo9513(c5519, interfaceC7387);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final List mo9623() {
        C0955 c0955 = this.f19048;
        if (c0955 != null) {
            return (List) c0955.f663;
        }
        String str = getName().f14050;
        str.getClass();
        C7092.m12335(str, "Dependencies of module ", " were not set");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final Object mo9624(C5317 c5317) {
        c5317.getClass();
        Object obj = this.f19043.get(c5317);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
