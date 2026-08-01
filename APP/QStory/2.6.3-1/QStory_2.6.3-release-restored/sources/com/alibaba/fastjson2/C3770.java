package com.alibaba.fastjson2;

import androidx.collection.C1123;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3770 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3770 f9656 = new C3770();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Random f9657;

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.isEmpty()) {
                return;
            }
            if (this.f9657 == null) {
                this.f9657 = new Random();
            }
            c3759.f9614 = list.get(Math.abs(this.f9657.nextInt()) % list.size());
            c3759.f9620 = true;
            return;
        }
        if (!(obj instanceof Object[])) {
            C1123.m1410("TODO");
            return;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 0) {
            return;
        }
        if (this.f9657 == null) {
            this.f9657 = new Random();
        }
        c3759.f9614 = objArr[this.f9657.nextInt() % objArr.length];
        c3759.f9620 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        if (r5.f9657 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        r5.f9657 = new java.util.Random();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        r7.f9614 = r0.get(java.lang.Math.abs(r5.f9657.nextInt()) % r0.size());
        r7.f9620 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
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
        if (abstractC3732.f9544) {
            JSONArray jSONArray = new JSONArray();
            int iMo6792 = abstractC3732.mo6792();
            for (int i = 0; i < iMo6792; i++) {
                jSONArray.add(abstractC3732.mo6684());
            }
            if (this.f9657 == null) {
                this.f9657 = new Random();
            }
            c3759.f9614 = jSONArray.get(Math.abs(this.f9657.nextInt()) % jSONArray.size());
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
                }
            }
        }
    }
}
