package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3055;
import java.util.List;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.types.C4937;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5023 extends AbstractC5062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5073 f14483;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5073 f14484;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5073 f14485;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5073 f14486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5050 f14487;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5073 f14488;

    public AbstractC5023(C5050 c5050) {
        c5050.getClass();
        this.f14487 = c5050;
        this.f14488 = AbstractC3055.m6635(null, new C5032(this, 0));
        this.f14484 = AbstractC3055.m6635(null, new C5032(this, 1));
        this.f14483 = AbstractC3055.m6635(null, new C5032(this, 2));
        this.f14485 = AbstractC3055.m6635(null, new C5032(this, 3));
        this.f14486 = AbstractC3055.m6635(null, new C5032(this, 4));
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        Object objInvoke = this.f14488.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getParameters() {
        Object objInvoke = this.f14483.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final InterfaceC5086 getReturnType() {
        Object objInvoke = this.f14485.invoke();
        objInvoke.getClass();
        return (InterfaceC5086) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getTypeParameters() {
        Object objInvoke = this.f14486.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final KVisibility getVisibility() {
        C4489 visibility = mo9945().getVisibility();
        visibility.getClass();
        C4686 c4686 = AbstractC5066.f14608;
        if (visibility.equals(AbstractC4488.f13112)) {
            return KVisibility.PUBLIC;
        }
        if (visibility.equals(AbstractC4488.f13114)) {
            return KVisibility.PROTECTED;
        }
        if (visibility.equals(AbstractC4488.f13113)) {
            return KVisibility.INTERNAL;
        }
        if (visibility.equals(AbstractC4488.f13116) || visibility.equals(AbstractC4488.f13115)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isAbstract() {
        return m9993() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isFinal() {
        return m9993() == Modality.FINAL;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isOpen() {
        return m9993() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract AbstractC5023 mo9950(C5050 c5050);

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo9964() {
        Object objInvoke = this.f14484.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Modality m9993() {
        Modality modality = this.f14487.f14577;
        if (modality != null) {
            return modality;
        }
        Modality modalityMo9019 = mo9945().mo9019();
        modalityMo9019.getClass();
        return modalityMo9019;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract InterfaceC4479 mo9945();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m9994(boolean r23) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5023.m9994(boolean):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract C4937 mo9947();
}
