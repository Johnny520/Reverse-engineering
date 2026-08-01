package p291;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.InvocationTargetException;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8448 extends AbstractC8441 {
    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        String str = this.f23627;
        try {
            return this.f23612.invoke(obj, null);
        } catch (IllegalAccessException e) {
            e = e;
            C7546.m12746("invoke getter method error, ", str, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            C7546.m12746("invoke getter method error, ", str, e);
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
