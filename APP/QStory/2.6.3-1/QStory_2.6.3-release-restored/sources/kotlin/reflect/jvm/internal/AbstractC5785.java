package kotlin.reflect.jvm.internal;

import kotlin.reflect.InterfaceC5937;
import kotlin.reflect.InterfaceC5942;
import p063.InterfaceC7318;
import p095.AbstractC7823;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5785 extends AbstractC5856 implements InterfaceC5942, InterfaceC5937 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5785() {
        super(C5883.f14920);
        C5883 c5883 = C5883.f14920;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isExternal() {
        return mo10512().f19092;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInfix() {
        mo10512();
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isInline() {
        return mo10512().f19091;
    }

    @Override // kotlin.reflect.InterfaceC5942
    public final boolean isOperator() {
        mo10512();
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isSuspend() {
        mo10512();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract AbstractC5774 mo10508();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract AbstractC7823 mo10512();

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7318 mo10498() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC5835 mo10502() {
        return mo10508().f14653;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo10504() {
        return mo10508().f14651;
    }
}
