package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.km.Modality;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5007 extends AbstractC5063 {
    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isAbstract() {
        return mo9969() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isFinal() {
        return mo9969() == Modality.FINAL;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final boolean isOpen() {
        return mo9969() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract Modality mo9969();
}
