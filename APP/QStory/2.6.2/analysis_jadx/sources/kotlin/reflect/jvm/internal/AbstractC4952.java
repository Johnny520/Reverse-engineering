package kotlin.reflect.jvm.internal;

import kotlin.reflect.InterfaceC5104;
import kotlin.reflect.InterfaceC5109;
import p047.InterfaceC6488;
import p079.AbstractC6993;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4952 extends AbstractC5023 implements InterfaceC5109, InterfaceC5104 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4952() {
        super(C5050.f14573);
        C5050 c5050 = C5050.f14573;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isExternal() {
        return mo9956().f18752;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInfix() {
        mo9956();
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isInline() {
        return mo9956().f18751;
    }

    @Override // kotlin.reflect.InterfaceC5109
    public final boolean isOperator() {
        mo9956();
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isSuspend() {
        mo9956();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract AbstractC4941 mo9952();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract AbstractC6993 mo9956();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6488 mo9942() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5002 mo9946() {
        return mo9952().f14306;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo9948() {
        return mo9952().f14304;
    }
}
