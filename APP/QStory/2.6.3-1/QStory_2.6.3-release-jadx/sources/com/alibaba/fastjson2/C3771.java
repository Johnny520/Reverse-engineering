package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import p307.AbstractC9323;
import p307.C9368;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3771 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f9658 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long[] f9659;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f9660;

    public C3771(String[] strArr) {
        this.f9660 = strArr;
        this.f9659 = new long[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.f9659[i] = AbstractC3693.m6334(strArr[i]);
            this.f9658.add(strArr[i]);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        boolean z = obj instanceof Map;
        int i = 0;
        String[] strArr = this.f9660;
        if (z) {
            Map map = (Map) obj;
            JSONArray jSONArray = new JSONArray(strArr.length);
            int length = strArr.length;
            while (i < length) {
                jSONArray.add(map.get(strArr[i]));
                i++;
            }
            c3759.f9614 = jSONArray;
            return;
        }
        if (obj instanceof Collection) {
            c3759.f9614 = obj;
            return;
        }
        C9368 c9368 = c3759.f9619.m6939().f9499;
        Class<?> cls = obj.getClass();
        InterfaceC9352 interfaceC9352M14665 = c9368.m14665(cls, cls, false);
        JSONArray jSONArray2 = new JSONArray(strArr.length);
        while (i < strArr.length) {
            AbstractC9323 abstractC9323Mo14650 = interfaceC9352M14665.mo14650(this.f9659[i]);
            jSONArray2.add(abstractC9323Mo14650 != null ? abstractC9323Mo14650.mo14554(obj) : null);
            i++;
        }
        c3759.f9614 = jSONArray2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        if ((r0 instanceof com.alibaba.fastjson2.C3772) == false) goto L12;
     */
    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        if (c37592 != null) {
            if (!c37592.f9620) {
                AbstractC3785 abstractC3785 = c37592.f9617;
                if (!(abstractC3785 instanceof AbstractC3711)) {
                }
            }
            mo6513(c3759);
            return;
        }
        Object objMo6684 = abstractC3732.mo6684();
        boolean z = objMo6684 instanceof Map;
        String[] strArr = this.f9660;
        if (z) {
            Map map = (Map) objMo6684;
            JSONArray jSONArray = new JSONArray(strArr.length);
            for (String str : strArr) {
                jSONArray.add(map.get(str));
            }
            c3759.f9614 = jSONArray;
            return;
        }
        if (!(objMo6684 instanceof Collection)) {
            C1123.m1410(AbstractC0900.m714(C3771.class, "UnsupportedOperation "));
            return;
        }
        if (c3759.f9616 != null) {
            c3759.f9614 = objMo6684;
            return;
        }
        Collection collection = (Collection) objMo6684;
        JSONArray jSONArray2 = new JSONArray(collection.size());
        for (Object obj : collection) {
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                JSONArray jSONArray3 = new JSONArray(strArr.length);
                for (String str2 : strArr) {
                    jSONArray3.add(map2.get(str2));
                }
                jSONArray2.add(jSONArray3);
            }
        }
        c3759.f9614 = jSONArray2;
    }
}
