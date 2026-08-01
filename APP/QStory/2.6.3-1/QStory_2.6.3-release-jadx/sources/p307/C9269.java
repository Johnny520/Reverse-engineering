package p307;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.InvocationTargetException;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9269 extends AbstractC9262 {
    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        String str = this.f23963;
        try {
            return this.f23948.invoke(obj, null);
        } catch (IllegalAccessException e) {
            e = e;
            C8376.m13334("invoke getter method error, ", str, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C8376.m13334("invoke getter method error, ", str, e);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3;
            Throwable cause = e.getCause();
            String str2 = "invoke getter method error, " + str;
            if (cause != null) {
                e = cause;
            }
            throw new JSONException(str2, e);
        }
    }
}
