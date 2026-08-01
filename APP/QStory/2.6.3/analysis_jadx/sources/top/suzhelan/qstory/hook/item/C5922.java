package top.suzhelan.qstory.hook.item;

import android.os.Bundle;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p287.AbstractC8405;
import p389.C9092;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲世兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5922 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16112 = AbstractC8405.m13972(1777);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16113 = AbstractC8405.m13972(1411);

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            C9092 c9092M14673 = C9092.m14673(this.f16112);
            c9092M14673.f25481 = this.f16113;
            c9092M14673.m14675(Bundle.class);
            XposedBridge.hookMethod((Method) c9092M14673.m14605(), new C5915(2));
        } catch (Exception unused) {
        }
    }
}
