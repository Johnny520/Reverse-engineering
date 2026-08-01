package top.suzhelan.qstory.hook.api;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6316;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p389.C9092;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5810 extends AbstractC6316 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C9092 c9092M14673 = C9092.m14673(AbstractC8405.m13972(1556));
        c9092M14673.m14675(String.class, byte[].class, AbstractC6337.m11866(AbstractC8405.m13972(1557)));
        c9092M14673.f25481 = AbstractC8405.m13972(1558);
        AbstractC5062.m10039((Method) c9092M14673.m14605(), new C5554(25));
    }
}
