package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4530;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4516;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5006 extends AbstractC5008 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5184 f14428;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4530 f14429;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5006(AbstractC5003 abstractC5003, String str, Object obj, C4530 c4530) {
        super(abstractC5003, str, obj);
        c4530.getClass();
        this.f14429 = c4530;
        this.f14428 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5005(abstractC5003, 1));
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final InterfaceC5087 getReturnType() {
        return (InterfaceC5087) this.f14428.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final KVisibility getVisibility() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4530 c4530 = this.f14429;
        c4530.getClass();
        return AbstractC3933.m8292((Visibility) AbstractC4545.f13277.m960(c4530, AbstractC4545.f13263[17]));
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final List mo9964() {
        return this.f14429.f13198;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C5070 mo9965() {
        AbstractC5003 abstractC5003 = this.f14435;
        abstractC5003.getClass();
        return ((C5045) ((C5004) abstractC5003).f14425.getValue()).m9997();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final C4516 mo9966() {
        C4530 c4530 = this.f14429;
        c4530.getClass();
        C4516 c4516 = AbstractC3056.m6713(c4530).f18950;
        if (c4516 != null) {
            return c4516;
        }
        C4211.m8595(this, "No signature for constructor: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4534 mo9967() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9968() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo9969() {
        return Modality.FINAL;
    }
}
