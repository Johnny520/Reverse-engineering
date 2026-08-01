package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.C4538;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4516;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4976 extends AbstractC5008 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14362;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5184 f14363;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4538 f14364;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4976(AbstractC5003 abstractC5003, String str, Object obj, C4538 c4538) {
        super(abstractC5003, str, obj);
        c4538.getClass();
        this.f14364 = c4538;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14363 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4977(abstractC5003, this));
        this.f14362 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4977(this, abstractC5003));
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return this.f14364.f13236;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final InterfaceC5087 getReturnType() {
        return (InterfaceC5087) this.f14362.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final KVisibility getVisibility() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4538 c4538 = this.f14364;
        c4538.getClass();
        return AbstractC3933.m8292((Visibility) AbstractC4545.f13276.m960(c4538, AbstractC4545.f13263[22]));
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isExternal() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4538 c4538 = this.f14364;
        c4538.getClass();
        return AbstractC4545.f13271.m577(c4538, AbstractC4545.f13263[28]);
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInfix() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4538 c4538 = this.f14364;
        c4538.getClass();
        return AbstractC4545.f13278.m577(c4538, AbstractC4545.f13263[25]);
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInline() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4538 c4538 = this.f14364;
        c4538.getClass();
        return AbstractC4545.f13279.m577(c4538, AbstractC4545.f13263[26]);
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isOperator() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4538 c4538 = this.f14364;
        c4538.getClass();
        return AbstractC4545.f13281.m577(c4538, AbstractC4545.f13263[24]);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isSuspend() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4538 c4538 = this.f14364;
        c4538.getClass();
        return AbstractC4545.f13270.m577(c4538, AbstractC4545.f13263[29]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final List mo9964() {
        return this.f14364.f13232;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C5070 mo9965() {
        return (C5070) this.f14363.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C4516 mo9966() {
        C4538 c4538 = this.f14364;
        c4538.getClass();
        C4516 c4516 = AbstractC3056.m6714(c4538).f18948;
        if (c4516 != null) {
            return c4516;
        }
        C4211.m8595(this, "No signature for function: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C4534 mo9967() {
        return this.f14364.f13234;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5008
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final List mo9968() {
        return this.f14364.f13239;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5007
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Modality mo9969() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4538 c4538 = this.f14364;
        c4538.getClass();
        return (Modality) AbstractC4545.f13280.m960(c4538, AbstractC4545.f13263[23]);
    }
}
