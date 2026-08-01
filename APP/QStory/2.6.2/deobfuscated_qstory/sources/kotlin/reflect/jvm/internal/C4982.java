package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5100;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.jvm.internal.impl.km.C4535;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4982 extends AbstractC4981 implements InterfaceC5101 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f14384;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14385;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4982(AbstractC5002 abstractC5002, String str, Object obj, C4535 c4535) {
        super(abstractC5002, str, obj, c4535);
        str.getClass();
        c4535.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14385 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4985(this, 0));
        this.f14384 = AbstractC5186.m10211(lazyThreadSafetyMode, new C4985(this, 1));
    }

    @Override // kotlin.reflect.InterfaceC5101
    public final Object get(Object obj) {
        return ((C4986) this.f14385.getValue()).call(obj);
    }

    @Override // kotlin.reflect.InterfaceC5101
    public final Object getDelegate(Object obj) {
        return AbstractC3056.m6687(this, (Member) this.f14384.getValue(), obj, null);
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5105 getGetter() {
        return (C4986) this.f14385.getValue();
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4981
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC4978 mo9963() {
        return (C4986) this.f14385.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5100 getGetter() {
        return (C4986) this.f14385.getValue();
    }
}
