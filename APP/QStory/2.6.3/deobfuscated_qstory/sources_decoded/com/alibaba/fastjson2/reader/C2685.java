package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2685 extends C2691 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Type f8155;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final BiConsumer f8156;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final PropertyNamingStrategy f8157;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final String f8158;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2685(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, com.alibaba.fastjson2.schema.JSONSchema r10, java.lang.reflect.Field r11, java.lang.String r12, java.util.function.BiConsumer r13) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            java.lang.Class r1 = com.alibaba.fastjson2.util.AbstractC2867.f9051
            boolean r1 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L17
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r1 = r2.getActualTypeArguments()
            int r2 = r1.length
            r3 = 2
            if (r2 != r3) goto L17
            r2 = 1
            r1 = r1[r2]
            goto L19
        L17:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
        L19:
            r0.f8155 = r1
            r0.f8158 = r12
            com.alibaba.fastjson2.PropertyNamingStrategy r1 = com.alibaba.fastjson2.PropertyNamingStrategy.of(r7)
            r0.f8157 = r1
            r0.f8156 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2685.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Field, java.lang.String, java.util.function.BiConsumer):void");
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo5482(long j, Object obj, Object obj2) {
        if (this.f8158 == null || !(obj2 instanceof Collection)) {
            super.mo5482(j, obj, obj2);
            return;
        }
        Map map = (Map) mo5496(AbstractC2933.m6389()).mo5499(j);
        C2692.m5493(map, (Collection) obj2, this.f8158, this.f8157, AbstractC2933.m6386(this.f8155, j | this.f8422), this.f8156);
        mo5471(obj, map);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo5472(AbstractC2899 abstractC2899, Object obj) {
        if (this.f8158 == null || !abstractC2899.mo6169()) {
            super.mo5472(abstractC2899, obj);
            return;
        }
        InterfaceC2788 interfaceC2788Mo5495 = mo5495(abstractC2899);
        long j = this.f8422;
        Map map = (Map) interfaceC2788Mo5495.mo5499(j);
        Type type = this.f8155;
        C2692.m5493(map, abstractC2899.mo6122(type), this.f8158, this.f8157, AbstractC2933.m6386(type, j), this.f8156);
        mo5471(obj, map);
    }
}
