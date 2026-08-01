package com.alibaba.fastjson2;

import androidx.collection.C1123;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3769 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f9655;

    public C3769(int i, int i2) {
        this.f9655 = i;
        this.f9654 = i2;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        JSONArray jSONArray = new JSONArray();
        boolean z = obj instanceof List;
        int i = this.f9655;
        int i2 = 0;
        int i3 = this.f9654;
        if (z) {
            List list = (List) obj;
            int size = list.size();
            while (i2 < size) {
                int i4 = i >= 0 ? i2 : i2 - size;
                if (i4 >= i && i4 < i3) {
                    jSONArray.add(list.get(i2));
                }
                i2++;
            }
            c3759.f9614 = jSONArray;
            c3759.f9620 = true;
            return;
        }
        if (!(obj instanceof Object[])) {
            C1123.m1410("TODO");
            return;
        }
        Object[] objArr = (Object[]) obj;
        while (i2 < objArr.length) {
            if ((i2 >= i && i2 <= i3) || (i2 - objArr.length > i && i2 - objArr.length <= i3)) {
                jSONArray.add(objArr[i2]);
            }
            i2++;
        }
        c3759.f9614 = jSONArray;
        c3759.f9620 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        Object objMo6744;
        C3759 c37592 = c3759.f9618;
        if (c37592 != null && (c37592.f9620 || ((c37592.f9617 instanceof C3788) && c3759.f9616 == null))) {
            mo6513(c3759);
            return;
        }
        boolean z = abstractC3732.f9544;
        int i = 0;
        int i2 = this.f9654;
        int i3 = this.f9655;
        if (z) {
            JSONArray jSONArray = new JSONArray();
            int iMo6792 = abstractC3732.mo6792();
            while (i < iMo6792) {
                if (i3 < 0 || (i >= i3 && i < i2)) {
                    jSONArray.add(abstractC3732.mo6684());
                } else {
                    abstractC3732.mo6793();
                }
                i++;
            }
            if (i3 < 0) {
                int size = jSONArray.size();
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    int i5 = i4 - size;
                    if (i5 < i3 || i5 >= i2) {
                        jSONArray.remove(i4);
                    }
                }
            }
            c3759.f9614 = jSONArray;
            c3759.f9620 = true;
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        abstractC3732.mo6733();
        while (true) {
            char c = abstractC3732.f9538;
            if (c != 26) {
                if (c == ']') {
                    abstractC3732.mo6733();
                } else {
                    if (i3 < 0 || (i >= i3 && i < i2)) {
                        if (c == '\"' || c == '\'') {
                            objMo6744 = abstractC3732.mo6744();
                        } else if (c == '+') {
                            abstractC3732.mo6755();
                            objMo6744 = abstractC3732.m6663();
                        } else if (c == '[') {
                            objMo6744 = abstractC3732.mo6685();
                        } else if (c == 'f') {
                            objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                        } else if (c == 'n') {
                            abstractC3732.mo6762();
                            objMo6744 = null;
                        } else if (c != 't') {
                            if (c != '{') {
                                if (c != '-' && c != '.') {
                                    switch (c) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            C1123.m1402(abstractC3732.f9538, "TODO : ");
                                            return;
                                    }
                                }
                                abstractC3732.mo6755();
                                objMo6744 = abstractC3732.m6663();
                            } else {
                                objMo6744 = abstractC3732.mo6754();
                            }
                        }
                        jSONArray2.add(objMo6744);
                    } else {
                        abstractC3732.mo6793();
                        if (abstractC3732.f9538 == ',') {
                            abstractC3732.mo6733();
                        }
                    }
                    i++;
                }
            }
        }
        if (i3 < 0) {
            int size2 = jSONArray2.size();
            for (int i6 = size2 - 1; i6 >= 0; i6--) {
                int i7 = i6 - size2;
                if (i7 < i3 || i7 >= i2) {
                    jSONArray2.remove(i6);
                }
            }
        }
        c3759.f9614 = jSONArray2;
        c3759.f9620 = true;
    }
}
