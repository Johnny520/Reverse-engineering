package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.name.C4686;
import p049.AbstractC6526;
import p052.InterfaceC6557;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4898 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4898 f14218 = new C4898(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14219;

    public /* synthetic */ C4898(int i) {
        this.f14219 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f14219) {
            case 0:
                AbstractC4881 abstractC4881 = (AbstractC4881) obj;
                abstractC4881.getClass();
                return abstractC4881.toString();
            default:
                if (((C4686) obj) != null) {
                    return Boolean.valueOf(!r1.equals(AbstractC6526.f17877));
                }
                C5919.m11249("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }
}
