package kotlin.reflect.jvm.internal;

import io.ktor.client.plugins.AbstractC4765;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5937;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5367;
import kotlin.reflect.jvm.internal.impl.p009km.Modality;
import kotlin.reflect.jvm.internal.impl.p009km.Visibility;
import p063.InterfaceC7318;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5810 extends AbstractC5839 implements InterfaceC5942, InterfaceC5937 {
    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        Annotation[] annotations;
        if (AbstractC9019.m14257(mo10518())) {
            return EmptyList.INSTANCE;
        }
        Member memberMo12555 = mo10500().mo12555();
        List listM9405 = null;
        Method method = memberMo12555 instanceof Method ? (Method) memberMo12555 : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listM9405 = AbstractC5179.m9405(annotations);
        }
        if (listM9405 == null) {
            listM9405 = EmptyList.INSTANCE;
        }
        return AbstractC5899.m10625(listM9405);
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getTypeParameters() {
        return mo10518().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final KVisibility getVisibility() {
        Visibility visibility;
        KVisibility kVisibilityM8851;
        C5367 c5367Mo10521 = mo10521();
        return (c5367Mo10521 == null || (visibility = (Visibility) AbstractC5377.f13613.m1520(c5367Mo10521, AbstractC5377.f13608[44])) == null || (kVisibilityM8851 = AbstractC4765.m8851(visibility)) == null) ? mo10518().getVisibility() : kVisibilityM8851;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isExternal() {
        C5367 c5367Mo10521 = mo10521();
        return c5367Mo10521 != null && AbstractC5377.f13611.m1137(c5367Mo10521, AbstractC5377.f13608[47]);
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInline() {
        C5367 c5367Mo10521 = mo10521();
        return c5367Mo10521 != null && AbstractC5377.f13612.m1137(c5367Mo10521, AbstractC5377.f13608[48]);
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7318 mo10498() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract AbstractC5814 mo10518();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5835 mo10502() {
        return mo10518().f14729;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5839
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Modality mo10528() {
        Modality modality;
        C5367 c5367Mo10521 = mo10521();
        return (c5367Mo10521 == null || (modality = (Modality) AbstractC5377.f13614.m1520(c5367Mo10521, AbstractC5377.f13608[45])) == null) ? mo10518().mo10528() : modality;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract C5367 mo10521();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo10504() {
        return mo10518().f14724;
    }
}
