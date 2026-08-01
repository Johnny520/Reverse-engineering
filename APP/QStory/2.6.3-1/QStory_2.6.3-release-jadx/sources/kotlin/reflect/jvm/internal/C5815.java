package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5933;
import kotlin.reflect.InterfaceC5934;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5815 extends AbstractC5814 implements InterfaceC5934 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f14731;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f14732;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5815(AbstractC5835 abstractC5835, String str, Object obj, C5368 c5368) {
        super(abstractC5835, str, obj, c5368);
        str.getClass();
        c5368.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14732 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5818(this, 0));
        this.f14731 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5818(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5934
    public final Object get(Object obj) {
        return ((C5819) this.f14732.getValue()).call(obj);
    }

    @Override // kotlin.reflect.InterfaceC5934
    public final Object getDelegate(Object obj) {
        return AbstractC9019.m14263(this, (Member) this.f14731.getValue(), obj, null);
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5938 getGetter() {
        return (C5819) this.f14732.getValue();
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5814
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC5811 mo10519() {
        return (C5819) this.f14732.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5933 getGetter() {
        return (C5819) this.f14732.getValue();
    }
}
