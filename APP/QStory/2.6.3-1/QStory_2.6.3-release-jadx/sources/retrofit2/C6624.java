package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6624 extends AbstractC6607 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Executor f16237;

    public C6624(Executor executor) {
        this.f16237 = executor;
    }

    @Override // retrofit2.AbstractC6607
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC6626 mo11727(Type type, Annotation[] annotationArr) {
        if (AbstractC6615.m11746(type) != InterfaceC6608.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C5703(AbstractC6615.m11747(0, (ParameterizedType) type), 1, AbstractC6615.m11749(annotationArr, InterfaceC6587.class) ? null : this.f16237);
        }
        C6755.m11869("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        return null;
    }
}
