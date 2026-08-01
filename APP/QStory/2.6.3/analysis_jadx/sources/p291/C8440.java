package p291;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.InvocationTargetException;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8440 extends AbstractC8433 {
    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        String str = this.f23618;
        try {
            return this.f23603.invoke(obj, null);
        } catch (IllegalAccessException e) {
            e = e;
            C7547.m12775("invoke getter method error, ", str, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7547.m12775("invoke getter method error, ", str, e);
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
