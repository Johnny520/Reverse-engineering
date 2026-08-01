package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4529;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4515;
import net.bytebuddy.description.method.MethodDescription;
import p033.AbstractC6325;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5005 extends AbstractC5007 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5183 f14426;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4529 f14427;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5005(AbstractC5002 abstractC5002, String str, Object obj, C4529 c4529) {
        super(abstractC5002, str, obj);
        c4529.getClass();
        this.f14427 = c4529;
        this.f14426 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5004(abstractC5002, 1));
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        return MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final InterfaceC5086 getReturnType() {
        return (InterfaceC5086) this.f14426.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final KVisibility getVisibility() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4529 c4529 = this.f14427;
        c4529.getClass();
        return AbstractC6325.m11843((Visibility) AbstractC4544.f13273.m959(c4529, AbstractC4544.f13259[17]));
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final List mo9967() {
        return this.f14427.f13194;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C5069 mo9968() {
        AbstractC5002 abstractC5002 = this.f14433;
        abstractC5002.getClass();
        return ((C5044) ((C5003) abstractC5002).f14423.getValue()).m10000();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final C4515 mo9969() {
        C4529 c4529 = this.f14427;
        c4529.getClass();
        C4515 c4515 = AbstractC8174.m13616(c4529).f18955;
        if (c4515 != null) {
            return c4515;
        }
        C4210.m8605(this, "No signature for constructor: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C4533 mo9970() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo9971() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5006
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo9972() {
        return Modality.FINAL;
    }
}
