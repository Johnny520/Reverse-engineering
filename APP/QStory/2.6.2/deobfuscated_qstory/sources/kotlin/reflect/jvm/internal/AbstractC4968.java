package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import p047.InterfaceC6488;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4968 extends AbstractC4977 implements InterfaceC5108 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5183 f14356;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5183 f14357;

    public AbstractC4968() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14356 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4966(this, 0));
        this.f14357 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4966(this, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4968) && AbstractC4394.m8917(mo9962(), ((AbstractC4968) obj).mo9962());
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        return AbstractC0053.m155(new StringBuilder("<set-"), mo9962().f14376.f13213, '>');
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final List getParameters() {
        return AbstractC4343.m8821(mo9962().getParameters(), this.f14356.getValue());
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final InterfaceC5086 getReturnType() {
        return AbstractC5071.f14615;
    }

    public final int hashCode() {
        return mo9962().hashCode();
    }

    public final String toString() {
        return "setter of " + mo9962();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6488 mo9944() {
        return (InterfaceC6488) this.f14357.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo9964() {
        return AbstractC4343.m8821(mo9962().mo9964(), this.f14356.getValue());
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4977
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4534 mo9965() {
        return mo9962().f14376.f13211;
    }
}
