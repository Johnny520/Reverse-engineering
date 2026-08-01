package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9255 extends AbstractC9264 {
    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        String strM6647;
        List list = (List) mo14554(obj);
        if (list == null) {
            abstractC3730.mo6527();
            return;
        }
        boolean zM6632 = abstractC3730.m6632();
        if (zM6632 && (strM6647 = abstractC3730.m6647(list, this.f23963)) != null) {
            abstractC3730.mo6580(strM6647);
            abstractC3730.m6643(list);
        } else {
            m14570(abstractC3730, list);
            if (zM6632) {
                abstractC3730.m6643(list);
            }
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        List list = (List) mo14554(obj);
        C3728 c3728 = abstractC3730.f9523;
        if (list == null) {
            long j = this.f23956 | c3728.f9498;
            if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j) == 0) {
                return false;
            }
            m14637(abstractC3730);
            abstractC3730.mo6598(j);
            return true;
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
    }
}
