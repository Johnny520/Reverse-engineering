package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9257 extends AbstractC9264 {
    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        try {
            return this.f23948.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C3775.m6961("invoke getter method error, ", this.f23963, e);
            return null;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        List list = (List) mo14554(obj);
        if (list == null) {
            abstractC3730.mo6527();
        } else {
            m14570(abstractC3730, list);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        try {
            List list = (List) mo14554(obj);
            long j = abstractC3730.f9523.f9498 | this.f23956;
            if (list == null) {
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j) == 0) {
                    return false;
                }
                m14637(abstractC3730);
                abstractC3730.mo6598(j);
                return true;
            }
            if ((j & JSONWriter$Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                return false;
            }
            String strM6648 = abstractC3730.m6648(this, list);
            if (strM6648 != null) {
                m14637(abstractC3730);
                abstractC3730.mo6580(strM6648);
                abstractC3730.m6643(list);
                return true;
            }
            if (this.f23691 == String.class) {
                m14571(abstractC3730, list);
            } else {
                m14573(abstractC3730, list);
            }
            abstractC3730.m6643(list);
            return true;
        } catch (JSONException e) {
            if (abstractC3730.m6635()) {
                return false;
            }
            throw e;
        }
    }
}
