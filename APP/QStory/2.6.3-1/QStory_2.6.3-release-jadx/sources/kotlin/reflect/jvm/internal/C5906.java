package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;
import p068.InterfaceC7372;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5906 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5901 f14968 = new C5901();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile SoftReference f14969;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7372 f14970;

    public C5906(InterfaceC7372 interfaceC7372, Object obj) {
        if (interfaceC7372 == null) {
            C6755.m11869("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.f14969 = null;
        this.f14970 = interfaceC7372;
        if (obj != null) {
            this.f14969 = new SoftReference(obj);
        }
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        Object obj;
        Object obj2 = f14968;
        SoftReference softReference = this.f14969;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f14970.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f14969 = new SoftReference(obj2);
        return objInvoke;
    }
}
