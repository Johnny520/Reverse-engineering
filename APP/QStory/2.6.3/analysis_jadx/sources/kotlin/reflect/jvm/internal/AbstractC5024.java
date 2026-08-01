package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.types.C4938;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5024 extends AbstractC5063 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5074 f14485;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5074 f14486;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5074 f14487;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5074 f14488;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5051 f14489;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5074 f14490;

    public AbstractC5024(C5051 c5051) {
        c5051.getClass();
        this.f14489 = c5051;
        this.f14490 = C8667.m14378(null, new C5033(this, 0));
        this.f14486 = C8667.m14378(null, new C5033(this, 1));
        this.f14485 = C8667.m14378(null, new C5033(this, 2));
        this.f14487 = C8667.m14378(null, new C5033(this, 3));
        this.f14488 = C8667.m14378(null, new C5033(this, 4));
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        Object objInvoke = this.f14490.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getParameters() {
        Object objInvoke = this.f14485.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final InterfaceC5087 getReturnType() {
        Object objInvoke = this.f14487.invoke();
        objInvoke.getClass();
        return (InterfaceC5087) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getTypeParameters() {
        Object objInvoke = this.f14488.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final KVisibility getVisibility() {
        C4490 visibility = mo9942().getVisibility();
        visibility.getClass();
        C4687 c4687 = AbstractC5067.f14608;
        if (visibility.equals(AbstractC4489.f13116)) {
            return KVisibility.PUBLIC;
        }
        if (visibility.equals(AbstractC4489.f13118)) {
            return KVisibility.PROTECTED;
        }
        if (visibility.equals(AbstractC4489.f13117)) {
            return KVisibility.INTERNAL;
        }
        if (visibility.equals(AbstractC4489.f13120) || visibility.equals(AbstractC4489.f13119)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isAbstract() {
        return m9990() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isFinal() {
        return m9990() == Modality.FINAL;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isOpen() {
        return m9990() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract AbstractC5024 mo9947(C5051 c5051);

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo9961() {
        Object objInvoke = this.f14486.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Modality m9990() {
        Modality modality = this.f14489.f14579;
        if (modality != null) {
            return modality;
        }
        Modality modalityMo9009 = mo9942().mo9009();
        modalityMo9009.getClass();
        return modalityMo9009;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract InterfaceC4480 mo9942();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m9991(boolean r23) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5024.m9991(boolean):java.util.ArrayList");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract C4938 mo9944();
}
