package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import p052.InterfaceC6543;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5074 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5069 f14623 = new C5069();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile SoftReference f14624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6543 f14625;

    public C5074(InterfaceC6543 interfaceC6543, Object obj) {
        if (interfaceC6543 == null) {
            C5925.m11310("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.f14624 = null;
        this.f14625 = interfaceC6543;
        if (obj != null) {
            this.f14624 = new SoftReference(obj);
        }
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        Object obj;
        Object obj2 = f14623;
        SoftReference softReference = this.f14624;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f14625.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f14624 = new SoftReference(obj2);
        return objInvoke;
    }
}
