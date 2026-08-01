package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2765 extends AbstractC2761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Type f8431;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2765(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, java.lang.String r18, com.alibaba.fastjson2.schema.JSONSchema r19, java.lang.reflect.Method r20, java.lang.reflect.Field r21) {
        /*
            r13 = this;
            r8 = 0
            r9 = 0
            r5 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r7 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            boolean r14 = r15 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L28
            java.lang.reflect.ParameterizedType r15 = (java.lang.reflect.ParameterizedType) r15
            java.lang.reflect.Type[] r14 = r15.getActualTypeArguments()
            int r15 = r14.length
            r1 = 1
            if (r15 != r1) goto L28
            r15 = 0
            r14 = r14[r15]
            goto L29
        L28:
            r14 = 0
        L29:
            r13.f8431 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.AbstractC2765.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, java.lang.String, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Method, java.lang.reflect.Field):void");
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        if (abstractC2898.mo6087()) {
            return;
        }
        mo5426(obj, abstractC2898.mo6093(this.f8431));
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        return abstractC2898.mo6093(this.f8431);
    }
}
