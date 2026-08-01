package kotlin.reflect.jvm.internal;

import io.ktor.util.C4210;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4515;
import p033.AbstractC6325;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4975 extends AbstractC5007 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14360;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5183 f14361;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4537 f14362;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4975(AbstractC5002 abstractC5002, String str, Object obj, C4537 c4537) {
        super(abstractC5002, str, obj);
        c4537.getClass();
        this.f14362 = c4537;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14361 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4976(abstractC5002, this));
        this.f14360 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4976(this, abstractC5002));
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        return this.f14362.f13232;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final InterfaceC5086 getReturnType() {
        return (InterfaceC5086) this.f14360.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final KVisibility getVisibility() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4537 c4537 = this.f14362;
        c4537.getClass();
        return AbstractC6325.m11843((Visibility) AbstractC4544.f13272.m959(c4537, AbstractC4544.f13259[22]));
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isExternal() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4537 c4537 = this.f14362;
        c4537.getClass();
        return AbstractC4544.f13267.m576(c4537, AbstractC4544.f13259[28]);
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInfix() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4537 c4537 = this.f14362;
        c4537.getClass();
        return AbstractC4544.f13274.m576(c4537, AbstractC4544.f13259[25]);
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInline() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4537 c4537 = this.f14362;
        c4537.getClass();
        return AbstractC4544.f13275.m576(c4537, AbstractC4544.f13259[26]);
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isOperator() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4537 c4537 = this.f14362;
        c4537.getClass();
        return AbstractC4544.f13277.m576(c4537, AbstractC4544.f13259[24]);
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isSuspend() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4537 c4537 = this.f14362;
        c4537.getClass();
        return AbstractC4544.f13266.m576(c4537, AbstractC4544.f13259[29]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final List mo9967() {
        return this.f14362.f13228;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5069 mo9968() {
        return (C5069) this.f14361.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4515 mo9969() {
        C4537 c4537 = this.f14362;
        c4537.getClass();
        C4515 c4515 = AbstractC8174.m13617(c4537).f18953;
        if (c4515 != null) {
            return c4515;
        }
        C4210.m8605(this, "No signature for function: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4533 mo9970() {
        return this.f14362.f13230;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final List mo9971() {
        return this.f14362.f13235;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5006
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Modality mo9972() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4537 c4537 = this.f14362;
        c4537.getClass();
        return (Modality) AbstractC4544.f13276.m959(c4537, AbstractC4544.f13259[23]);
    }
}
