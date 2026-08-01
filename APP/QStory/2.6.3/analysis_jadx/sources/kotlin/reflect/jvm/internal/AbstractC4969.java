package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import p047.InterfaceC6489;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4969 extends AbstractC4978 implements InterfaceC5109 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5184 f14358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5184 f14359;

    public AbstractC4969() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14358 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4967(this, 0));
        this.f14359 = AbstractC5187.m10215(lazyThreadSafetyMode, new C4967(this, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4969) && AbstractC4395.m8907(mo9959(), ((AbstractC4969) obj).mo9959());
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return AbstractC0053.m148(new StringBuilder("<set-"), mo9959().f14378.f13217, '>');
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getParameters() {
        return AbstractC4344.m8794(mo9959().getParameters(), this.f14358.getValue());
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final InterfaceC5087 getReturnType() {
        return AbstractC5072.f14615;
    }

    public final int hashCode() {
        return mo9959().hashCode();
    }

    public final String toString() {
        return "setter of " + mo9959();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6489 mo9941() {
        return (InterfaceC6489) this.f14359.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo9961() {
        return AbstractC4344.m8794(mo9959().mo9961(), this.f14358.getValue());
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4978
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4535 mo9962() {
        return mo9959().f14378.f13215;
    }
}
