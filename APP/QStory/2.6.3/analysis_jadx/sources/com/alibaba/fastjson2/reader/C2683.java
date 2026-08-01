package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2683 extends C2692 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Type f8151;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final BiConsumer f8152;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final PropertyNamingStrategy f8153;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final String f8154;

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2683(java.lang.String r15, java.lang.reflect.Type r16, java.lang.Class r17, int r18, long r19, java.lang.String r21, java.util.Locale r22, java.lang.Object r23, com.alibaba.fastjson2.schema.JSONSchema r24, java.lang.reflect.Method r25, java.lang.reflect.Field r26, java.lang.String r27, java.util.function.BiConsumer r28) {
        /*
            r14 = this;
            r13 = 0
            r0 = r14
            r7 = r15
            r11 = r16
            r5 = r17
            r1 = r18
            r2 = r19
            r8 = r21
            r12 = r22
            r6 = r23
            r4 = r24
            r10 = r25
            r9 = r26
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Class r15 = com.alibaba.fastjson2.util.AbstractC2867.f9051
            boolean r15 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r15 == 0) goto L2f
            r15 = r11
            java.lang.reflect.ParameterizedType r15 = (java.lang.reflect.ParameterizedType) r15
            java.lang.reflect.Type[] r15 = r15.getActualTypeArguments()
            int r1 = r15.length
            r2 = 2
            if (r1 != r2) goto L2f
            r1 = 1
            r15 = r15[r1]
            goto L31
        L2f:
            java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
        L31:
            r14.f8151 = r15
            r15 = r27
            r14.f8154 = r15
            com.alibaba.fastjson2.PropertyNamingStrategy r15 = com.alibaba.fastjson2.PropertyNamingStrategy.of(r21)
            r14.f8153 = r15
            r15 = r28
            r14.f8152 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2683.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Method, java.lang.reflect.Field, java.lang.String, java.util.function.BiConsumer):void");
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo5482(long j, Object obj, Object obj2) throws IOException {
        if (this.f8154 == null || !(obj2 instanceof Collection)) {
            super.mo5482(j, obj, obj2);
            return;
        }
        Map map = (Map) mo5496(AbstractC2933.m6389()).mo5499(j);
        C2692.m5493(map, (Collection) obj2, this.f8154, this.f8153, AbstractC2933.m6386(this.f8151, j | this.f8422), this.f8152);
        mo5471(obj, map);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo5472(AbstractC2899 abstractC2899, Object obj) {
        if (this.f8154 == null || !abstractC2899.mo6169()) {
            super.mo5472(abstractC2899, obj);
            return;
        }
        InterfaceC2788 interfaceC2788Mo5495 = mo5495(abstractC2899);
        long j = this.f8422;
        Map map = (Map) interfaceC2788Mo5495.mo5499(j);
        Type type = this.f8151;
        C2692.m5493(map, abstractC2899.mo6122(type), this.f8154, this.f8153, AbstractC2933.m6386(type, j), this.f8152);
        mo5471(obj, map);
    }
}
