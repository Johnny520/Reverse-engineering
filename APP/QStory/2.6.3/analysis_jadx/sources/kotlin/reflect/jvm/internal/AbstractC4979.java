package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import p047.InterfaceC6489;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4979 extends AbstractC4978 implements InterfaceC5106 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5184 f14368 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 14));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4979) && AbstractC4395.m8907(mo9959(), ((AbstractC4979) obj).mo9959());
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return AbstractC0053.m148(new StringBuilder("<get-"), mo9959().f14378.f13217, '>');
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getParameters() {
        return mo9959().getParameters();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final InterfaceC5087 getReturnType() {
        return mo9959().getReturnType();
    }

    public final int hashCode() {
        return mo9959().hashCode();
    }

    public final String toString() {
        return "getter of " + mo9959();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6489 mo9941() {
        return (InterfaceC6489) this.f14368.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo9961() {
        return mo9959().mo9961();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4978
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C4535 mo9962() {
        return mo9959().f14378.f13216;
    }
}
