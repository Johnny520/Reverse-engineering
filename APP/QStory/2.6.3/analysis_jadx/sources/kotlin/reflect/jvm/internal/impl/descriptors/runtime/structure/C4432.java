package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4432 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4432 f13058 = new C4432(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4432 f13059 = new C4432(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4432 f13057 = new C4432(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4432 f13056 = new C4432(3);

    public /* synthetic */ C4432(int i) {
        this.f13060 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f13060) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list = AbstractC4431.f13055;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list2 = AbstractC4431.f13055;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return AbstractC4347.m8838(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!C4691.m9329(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return C4691.m9330(simpleName);
                }
                return null;
        }
    }
}
