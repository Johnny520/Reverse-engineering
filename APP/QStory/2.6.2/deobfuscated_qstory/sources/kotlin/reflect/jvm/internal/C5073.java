package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C5073 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5068 f14623 = new C5068();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile SoftReference f14624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6542 f14625;

    public C5073(InterfaceC6542 interfaceC6542, Object obj) {
        if (interfaceC6542 == null) {
            C5919.m11249("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.f14624 = null;
        this.f14625 = interfaceC6542;
        if (obj != null) {
            this.f14624 = new SoftReference(obj);
        }
    }

    @Override // p052.InterfaceC6542
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
