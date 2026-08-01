package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.p009km.Modality;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5839 extends AbstractC5895 {
    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isAbstract() {
        return mo10528() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isFinal() {
        return mo10528() == Modality.FINAL;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isOpen() {
        return mo10528() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract Modality mo10528();
}
