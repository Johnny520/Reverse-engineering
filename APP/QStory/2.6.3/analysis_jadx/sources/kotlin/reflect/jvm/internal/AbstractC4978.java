package kotlin.reflect.jvm.internal;

import io.ktor.client.plugins.AbstractC3933;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import p047.InterfaceC6489;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4978 extends AbstractC5007 implements InterfaceC5110, InterfaceC5105 {
    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        Annotation[] annotations;
        if (AbstractC8190.m13698(mo9959())) {
            return EmptyList.INSTANCE;
        }
        Member memberMo11996 = mo9941().mo11996();
        List listM8846 = null;
        Method method = memberMo11996 instanceof Method ? (Method) memberMo11996 : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listM8846 = AbstractC4347.m8846(annotations);
        }
        if (listM8846 == null) {
            listM8846 = EmptyList.INSTANCE;
        }
        return AbstractC5067.m10066(listM8846);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getTypeParameters() {
        return mo9959().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final KVisibility getVisibility() {
        Visibility visibility;
        KVisibility kVisibilityM8292;
        C4535 c4535Mo9962 = mo9962();
        return (c4535Mo9962 == null || (visibility = (Visibility) AbstractC4545.f13268.m960(c4535Mo9962, AbstractC4545.f13263[44])) == null || (kVisibilityM8292 = AbstractC3933.m8292(visibility)) == null) ? mo9959().getVisibility() : kVisibilityM8292;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isExternal() {
        C4535 c4535Mo9962 = mo9962();
        return c4535Mo9962 != null && AbstractC4545.f13266.m577(c4535Mo9962, AbstractC4545.f13263[47]);
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInline() {
        C4535 c4535Mo9962 = mo9962();
        return c4535Mo9962 != null && AbstractC4545.f13267.m577(c4535Mo9962, AbstractC4545.f13263[48]);
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6489 mo9939() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract AbstractC4982 mo9959();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5003 mo9943() {
        return mo9959().f14384;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo9969() {
        Modality modality;
        C4535 c4535Mo9962 = mo9962();
        return (c4535Mo9962 == null || (modality = (Modality) AbstractC4545.f13269.m960(c4535Mo9962, AbstractC4545.f13263[45])) == null) ? mo9959().mo9969() : modality;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract C4535 mo9962();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9945() {
        return mo9959().f14379;
    }
}
