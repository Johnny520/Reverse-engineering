package com.alibaba.fastjson2;

import androidx.collection.C0276;
import java.util.List;
import java.util.Random;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2937 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2937 f9311 = new C2937();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Random f9312;

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.isEmpty()) {
                return;
            }
            if (this.f9312 == null) {
                this.f9312 = new Random();
            }
            c2926.f9269 = list.get(Math.abs(this.f9312.nextInt()) % list.size());
            c2926.f9275 = true;
            return;
        }
        if (!(obj instanceof Object[])) {
            C0276.m850("TODO");
            return;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 0) {
            return;
        }
        if (this.f9312 == null) {
            this.f9312 = new Random();
        }
        c2926.f9269 = objArr[this.f9312.nextInt() % objArr.length];
        c2926.f9275 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        if (r5.f9312 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c9, code lost:
    
        r5.f9312 = new java.util.Random();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        r7.f9269 = r0.get(java.lang.Math.abs(r5.f9312.nextInt()) % r0.size());
        r7.f9275 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5954(com.alibaba.fastjson2.AbstractC2899 r6, com.alibaba.fastjson2.C2926 r7) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2937.mo5954(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}
