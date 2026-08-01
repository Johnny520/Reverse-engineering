package top.suzhelan.qstory.hook.item;

import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲楪兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6781 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class clsM12425;
        "loader";
        classLoader.getClass();
        try {
            clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.aio.helper.PttHelper$getPhoneLowVolumeListener$onLowVolume$1");
        } catch (Throwable unused) {
            clsM12425 = null;
        }
        if (clsM12425 == null) {
            return;
        }
        C9921 c9921M15231 = C9921.m15231(clsM12425);
        c9921M15231.f25826 = "invoke";
        c9921M15231.m15234(Boolean.TYPE);
        Method method = (Method) c9921M15231.m15163();
        if (method == null) {
            return;
        }
        m12390(method, new C6755(10));
    }
}
