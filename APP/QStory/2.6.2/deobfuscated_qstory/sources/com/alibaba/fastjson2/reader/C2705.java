package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2705 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2705 f8222 = new C2705(null, null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8223;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Locale f8225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f8226;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC2787 f8227;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2705(java.lang.reflect.Type r3, java.lang.String r4, java.util.Locale r5) {
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
            r2.f8224 = r3
            java.lang.Class r3 = com.alibaba.fastjson2.util.AbstractC2866.m5899(r3)
            r2.f8223 = r3
            r2.f8226 = r4
            r2.f8225 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2705.<init>(java.lang.reflect.Type, java.lang.String, java.util.Locale):void");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo5418;
        Type type2 = this.f8224;
        if (type2 == null) {
            objMo5418 = abstractC2898.mo6078();
        } else {
            if (this.f8227 == null) {
                String str = this.f8226;
                InterfaceC2787 interfaceC2787M5526 = str != null ? AbstractC2761.m5526(type2, this.f8223, str, this.f8225) : null;
                if (interfaceC2787M5526 == null) {
                    this.f8227 = abstractC2898.m6056(type2);
                } else {
                    this.f8227 = interfaceC2787M5526;
                }
            }
            objMo5418 = this.f8227.mo5418(abstractC2898, this.f8224, obj, 0L);
        }
        return objMo5418 == null ? Optional.empty() : Optional.of(objMo5418);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo5422;
        Type type2 = this.f8224;
        if (type2 == null) {
            objMo5422 = abstractC2898.mo6078();
        } else {
            if (this.f8227 == null) {
                String str = this.f8226;
                InterfaceC2787 interfaceC2787M5526 = str != null ? AbstractC2761.m5526(type2, this.f8223, str, this.f8225) : null;
                if (interfaceC2787M5526 == null) {
                    this.f8227 = abstractC2898.m6056(type2);
                } else {
                    this.f8227 = interfaceC2787M5526;
                }
            }
            objMo5422 = this.f8227.mo5422(abstractC2898, this.f8224, obj, 0L);
        }
        return objMo5422 == null ? Optional.empty() : Optional.of(objMo5422);
    }
}
