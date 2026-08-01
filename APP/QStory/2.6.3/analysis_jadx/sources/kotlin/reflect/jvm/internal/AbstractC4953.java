package kotlin.reflect.jvm.internal;

import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.InterfaceC5110;
import p047.InterfaceC6489;
import p079.AbstractC6994;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4953 extends AbstractC5024 implements InterfaceC5110, InterfaceC5105 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4953() {
        super(C5051.f14575);
        C5051 c5051 = C5051.f14575;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isExternal() {
        return mo9953().f18747;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInfix() {
        mo9953();
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isInline() {
        return mo9953().f18746;
    }

    @Override // kotlin.reflect.InterfaceC5110
    public final boolean isOperator() {
        mo9953();
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isSuspend() {
        mo9953();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract AbstractC4942 mo9949();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract AbstractC6994 mo9953();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6489 mo9939() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5003 mo9943() {
        return mo9949().f14308;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9945() {
        return mo9949().f14306;
    }
}
