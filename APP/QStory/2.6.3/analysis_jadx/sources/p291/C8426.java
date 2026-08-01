package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8426 extends AbstractC8435 {
    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        String strM6087;
        List list = (List) mo13995(obj);
        if (list == null) {
            abstractC2897.mo5967();
            return;
        }
        boolean zM6072 = abstractC2897.m6072();
        if (zM6072 && (strM6087 = abstractC2897.m6087(list, this.f23618)) != null) {
            abstractC2897.mo6020(strM6087);
            abstractC2897.m6083(list);
        } else {
            m14011(abstractC2897, list);
            if (zM6072) {
                abstractC2897.m6083(list);
            }
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        List list = (List) mo13995(obj);
        C2895 c2895 = abstractC2897.f9178;
        if (list == null) {
            long j = this.f23611 | c2895.f9153;
            if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j) == 0) {
                return false;
            }
            m14078(abstractC2897);
            abstractC2897.mo6038(j);
            return true;
        }
        String strM6088 = abstractC2897.m6088(this, list);
        if (strM6088 != null) {
            m14078(abstractC2897);
            abstractC2897.mo6020(strM6088);
            abstractC2897.m6083(list);
            return true;
        }
        if (this.f23346 == String.class) {
            m14012(abstractC2897, list);
        } else {
            m14014(abstractC2897, list);
        }
        abstractC2897.m6083(list);
        return true;
    }
}
