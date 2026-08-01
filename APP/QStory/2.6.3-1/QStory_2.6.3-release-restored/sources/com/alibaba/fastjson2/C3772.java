package com.alibaba.fastjson2;

import androidx.collection.C1123;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3772 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int[] f9661;

    public C3772(int[] iArr) {
        this.f9661 = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6513(C3759 c3759) {
        Object obj;
        C3759 c37592 = c3759.f9618;
        Object obj2 = c37592 == null ? c3759.f9615 : c37592.f9614;
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        if (obj2 instanceof C3754) {
            List list = ((C3754) obj2).f9605;
            int size = list.size();
            while (i < size) {
                c3759.f9614 = list.get(i);
                C3759 c37593 = new C3759(c3759.f9619, c3759, c3759.f9617, c3759.f9616);
                mo6513(c37593);
                Object obj3 = c37593.f9614;
                if (obj3 instanceof Collection) {
                    jSONArray.addAll((Collection) obj3);
                } else {
                    jSONArray.add(obj3);
                }
                i++;
            }
            c3759.f9614 = jSONArray;
            return;
        }
        int[] iArr = this.f9661;
        int length = iArr.length;
        while (i < length) {
            int i2 = iArr[i];
            if (obj2 instanceof List) {
                List list2 = (List) obj2;
                if (i2 < 0) {
                    int size2 = list2.size() + i2;
                    if (size2 >= 0) {
                        obj = list2.get(size2);
                        if (obj instanceof Collection) {
                        }
                    }
                } else if (i2 < list2.size()) {
                    obj = list2.get(i2);
                    if (obj instanceof Collection) {
                        jSONArray.add(obj);
                    } else {
                        jSONArray.addAll((Collection) obj);
                    }
                }
            } else if (obj2 instanceof Object[]) {
                Object[] objArr = (Object[]) obj2;
                if (i2 < 0) {
                    int length2 = objArr.length + i2;
                    if (length2 >= 0) {
                        obj = objArr[length2];
                        if (obj instanceof Collection) {
                        }
                    }
                } else if (i2 < objArr.length) {
                    obj = objArr[i2];
                    if (obj instanceof Collection) {
                    }
                }
            }
            i++;
        }
        c3759.f9614 = jSONArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c5, code lost:
    
        r6.f9614 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c7, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        Object objMo6744;
        C3759 c37592 = c3759.f9618;
        if (c37592 != null && (c37592.f9617 instanceof C3788) && c3759.f9616 == null) {
            mo6513(c3759);
            return;
        }
        boolean z = abstractC3732.f9544;
        int[] iArr = this.f9661;
        int i = 0;
        if (z) {
            JSONArray jSONArray = new JSONArray();
            int iMo6792 = abstractC3732.mo6792();
            while (i < iMo6792) {
                if (Arrays.binarySearch(iArr, i) >= 0) {
                    jSONArray.add(abstractC3732.mo6684());
                } else {
                    abstractC3732.mo6793();
                }
                i++;
            }
            c3759.f9614 = jSONArray;
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
                    if (Arrays.binarySearch(iArr, i) >= 0) {
                        char c2 = abstractC3732.f9538;
                        if (c2 == '\"' || c2 == '\'') {
                            objMo6744 = abstractC3732.mo6744();
                        } else if (c2 == '+') {
                            abstractC3732.mo6755();
                            objMo6744 = abstractC3732.m6663();
                        } else if (c2 == '[') {
                            objMo6744 = abstractC3732.mo6685();
                        } else if (c2 == 'f') {
                            objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                        } else if (c2 == 'n') {
                            abstractC3732.mo6762();
                            objMo6744 = null;
                        } else if (c2 != 't') {
                            if (c2 != '{') {
                                if (c2 != '-' && c2 != '.') {
                                    switch (c2) {
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
    }
}
