package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.name.C4687;
import p049.AbstractC6527;
import p052.InterfaceC6558;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4899 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4899 f14222 = new C4899(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14223;

    public /* synthetic */ C4899(int i) {
        this.f14223 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f14223) {
            case 0:
                AbstractC4882 abstractC4882 = (AbstractC4882) obj;
                abstractC4882.getClass();
                return abstractC4882.toString();
            default:
                if (((C4687) obj) != null) {
                    return Boolean.valueOf(!r1.equals(AbstractC6527.f17873));
                }
                C5925.m11310("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }
}
