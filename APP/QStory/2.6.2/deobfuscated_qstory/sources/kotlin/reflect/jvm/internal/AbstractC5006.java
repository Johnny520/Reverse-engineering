package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.km.Modality;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5006 extends AbstractC5062 {
    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isAbstract() {
        return mo9972() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isFinal() {
        return mo9972() == Modality.FINAL;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final boolean isOpen() {
        return mo9972() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract Modality mo9972();
}
