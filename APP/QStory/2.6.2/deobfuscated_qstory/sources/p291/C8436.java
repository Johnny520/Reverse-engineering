package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8436 extends AbstractC8443 {
    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        try {
            return this.f23612.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C2941.m6343("invoke getter method error, ", this.f23627, e);
            return null;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        List list = (List) mo13976(obj);
        if (list == null) {
            abstractC2896.mo5922();
        } else {
            m13992(abstractC2896, list);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        try {
            List list = (List) mo13976(obj);
            long j = abstractC2896.f9176.f9151 | this.f23620;
            if (list == null) {
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j) == 0) {
                    return false;
                }
                m14059(abstractC2896);
                abstractC2896.mo5993(j);
                return true;
            }
            if ((j & JSONWriter$Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                return false;
            }
            String strM6042 = abstractC2896.m6042(this, list);
            if (strM6042 != null) {
                m14059(abstractC2896);
                abstractC2896.mo5975(strM6042);
                abstractC2896.m6037(list);
                return true;
            }
            if (this.f23355 == String.class) {
                m13993(abstractC2896, list);
            } else {
                m13995(abstractC2896, list);
            }
            abstractC2896.m6037(list);
            return true;
        } catch (JSONException e) {
            if (abstractC2896.m6026()) {
                return false;
            }
            throw e;
        }
    }
}
