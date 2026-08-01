package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5104;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import p033.AbstractC6325;
import p047.InterfaceC6488;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4977 extends AbstractC5006 implements InterfaceC5109, InterfaceC5104 {
    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        Annotation[] annotations;
        if (AbstractC3056.m6675(mo9962())) {
            return EmptyList.INSTANCE;
        }
        Member memberMo11953 = mo9944().mo11953();
        List listM8850 = null;
        Method method = memberMo11953 instanceof Method ? (Method) memberMo11953 : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listM8850 = AbstractC4346.m8850(annotations);
        }
        if (listM8850 == null) {
            listM8850 = EmptyList.INSTANCE;
        }
        return AbstractC5066.m10062(listM8850);
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        return mo9962().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final KVisibility getVisibility() {
        Visibility visibility;
        KVisibility kVisibilityM11843;
        C4534 c4534Mo9965 = mo9965();
        return (c4534Mo9965 == null || (visibility = (Visibility) AbstractC4544.f13264.m959(c4534Mo9965, AbstractC4544.f13259[44])) == null || (kVisibilityM11843 = AbstractC6325.m11843(visibility)) == null) ? mo9962().getVisibility() : kVisibilityM11843;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isExternal() {
        C4534 c4534Mo9965 = mo9965();
        return c4534Mo9965 != null && AbstractC4544.f13262.m576(c4534Mo9965, AbstractC4544.f13259[47]);
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInline() {
        C4534 c4534Mo9965 = mo9965();
        return c4534Mo9965 != null && AbstractC4544.f13263.m576(c4534Mo9965, AbstractC4544.f13259[48]);
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6488 mo9942() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract AbstractC4981 mo9962();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5002 mo9946() {
        return mo9962().f14382;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5006
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo9972() {
        Modality modality;
        C4534 c4534Mo9965 = mo9965();
        return (c4534Mo9965 == null || (modality = (Modality) AbstractC4544.f13265.m959(c4534Mo9965, AbstractC4544.f13259[45])) == null) ? mo9962().mo9972() : modality;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract C4534 mo9965();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9948() {
        return mo9962().f14377;
    }
}
