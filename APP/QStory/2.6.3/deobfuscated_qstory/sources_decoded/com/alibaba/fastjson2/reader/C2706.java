package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2706 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2706 f8224 = new C2706(null, null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8226;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Locale f8227;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f8228;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC2788 f8229;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2706(java.lang.reflect.Type r3, java.lang.String r4, java.util.Locale r5) {
        /*
            r2 = this;
            java.lang.Class<java.util.Optional> r0 = java.util.Optional.class
            r2.<init>(r0)
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L17
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto L17
            r0 = 0
            r3 = r3[r0]
            goto L18
        L17:
            r3 = 0
        L18:
            r2.f8226 = r3
            java.lang.Class r3 = com.alibaba.fastjson2.util.AbstractC2867.m5944(r3)
            r2.f8225 = r3
            r2.f8228 = r4
            r2.f8227 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2706.<init>(java.lang.reflect.Type, java.lang.String, java.util.Locale):void");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo5463;
        Type type2 = this.f8226;
        if (type2 == null) {
            objMo5463 = abstractC2899.mo6124();
        } else {
            if (this.f8229 == null) {
                String str = this.f8228;
                InterfaceC2788 interfaceC2788M5571 = str != null ? AbstractC2762.m5571(type2, this.f8225, str, this.f8227) : null;
                if (interfaceC2788M5571 == null) {
                    this.f8229 = abstractC2899.m6102(type2);
                } else {
                    this.f8229 = interfaceC2788M5571;
                }
            }
            objMo5463 = this.f8229.mo5463(abstractC2899, this.f8226, obj, 0L);
        }
        return objMo5463 == null ? Optional.empty() : Optional.of(objMo5463);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo5467;
        Type type2 = this.f8226;
        if (type2 == null) {
            objMo5467 = abstractC2899.mo6124();
        } else {
            if (this.f8229 == null) {
                String str = this.f8228;
                InterfaceC2788 interfaceC2788M5571 = str != null ? AbstractC2762.m5571(type2, this.f8225, str, this.f8227) : null;
                if (interfaceC2788M5571 == null) {
                    this.f8229 = abstractC2899.m6102(type2);
                } else {
                    this.f8229 = interfaceC2788M5571;
                }
            }
            objMo5467 = this.f8229.mo5467(abstractC2899, this.f8226, obj, 0L);
        }
        return objMo5467 == null ? Optional.empty() : Optional.of(objMo5467);
    }
}
