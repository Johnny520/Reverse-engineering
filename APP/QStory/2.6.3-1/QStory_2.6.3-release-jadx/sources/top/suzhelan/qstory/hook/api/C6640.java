package top.suzhelan.qstory.hook.api;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7145;
import p049.AbstractC7166;
import p303.AbstractC9234;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6640 extends AbstractC7145 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C9921 c9921M15232 = C9921.m15232(AbstractC9234.m14531(1556));
        c9921M15232.m15234(String.class, byte[].class, AbstractC7166.m12425(AbstractC9234.m14531(1557)));
        c9921M15232.f25826 = AbstractC9234.m14531(1558);
        AbstractC5894.m10598((Method) c9921M15232.m15164(), new C6385(25));
    }
}
