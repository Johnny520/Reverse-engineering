package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.name.C5519;
import p065.AbstractC7356;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5731 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5731 f14567 = new C5731(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14568;

    public /* synthetic */ C5731(int i) {
        this.f14568 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f14568) {
            case 0:
                AbstractC5714 abstractC5714 = (AbstractC5714) obj;
                abstractC5714.getClass();
                return abstractC5714.toString();
            default:
                if (((C5519) obj) != null) {
                    return Boolean.valueOf(!r1.equals(AbstractC7356.f18218));
                }
                C6755.m11869("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }
}
