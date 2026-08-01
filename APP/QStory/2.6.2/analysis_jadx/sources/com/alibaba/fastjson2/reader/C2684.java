package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2684 extends C2690 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Type f8153;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final BiConsumer f8154;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final PropertyNamingStrategy f8155;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final String f8156;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2684(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, com.alibaba.fastjson2.schema.JSONSchema r10, java.lang.reflect.Field r11, java.lang.String r12, java.util.function.BiConsumer r13) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            java.lang.Class r1 = com.alibaba.fastjson2.util.AbstractC2866.f9049
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
            r0.f8153 = r1
            r0.f8156 = r12
            com.alibaba.fastjson2.PropertyNamingStrategy r1 = com.alibaba.fastjson2.PropertyNamingStrategy.of(r7)
            r0.f8155 = r1
            r0.f8154 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2684.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, com.alibaba.fastjson2.schema.JSONSchema, java.lang.reflect.Field, java.lang.String, java.util.function.BiConsumer):void");
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo5437(long j, Object obj, Object obj2) {
        if (this.f8156 == null || !(obj2 instanceof Collection)) {
            super.mo5437(j, obj, obj2);
            return;
        }
        Map map = (Map) mo5451(AbstractC2932.m6331()).mo5454(j);
        C2691.m5448(map, (Collection) obj2, this.f8156, this.f8155, AbstractC2932.m6328(this.f8153, j | this.f8420), this.f8154);
        mo5426(obj, map);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo5427(AbstractC2898 abstractC2898, Object obj) {
        if (this.f8156 == null || !abstractC2898.mo6123()) {
            super.mo5427(abstractC2898, obj);
            return;
        }
        InterfaceC2787 interfaceC2787Mo5450 = mo5450(abstractC2898);
        long j = this.f8420;
        Map map = (Map) interfaceC2787Mo5450.mo5454(j);
        Type type = this.f8153;
        C2691.m5448(map, abstractC2898.mo6076(type), this.f8156, this.f8155, AbstractC2932.m6328(type, j), this.f8154);
        mo5426(obj, map);
    }
}
