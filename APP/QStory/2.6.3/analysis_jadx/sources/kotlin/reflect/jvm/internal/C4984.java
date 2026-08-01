package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.jvm.internal.impl.km.C4536;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4984 extends AbstractC4982 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f14388;

    public C4984(AbstractC5003 abstractC5003, String str, Object obj, C4536 c4536) {
        super(abstractC5003, str, obj, c4536);
        this.f14388 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5012(this, 15));
    }

    @Override // kotlin.reflect.InterfaceC5088
    public final InterfaceC5106 getGetter() {
        return (C4985) this.f14388.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4982
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC4979 mo9960() {
        return (C4985) this.f14388.getValue();
    }
}
