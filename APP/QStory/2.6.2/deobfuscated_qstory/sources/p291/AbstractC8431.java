package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.util.C2829;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8431 extends C8429 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Class f23342;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C2829 f23343;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC8431(java.lang.String r1, int r2, long r3, java.lang.String r5, java.util.Locale r6, java.lang.String r7, java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Field r10, java.lang.reflect.Method r11, java.lang.Class r12) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = r8 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            r3 = 0
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L19
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type[] r1 = r8.getActualTypeArguments()
            int r6 = r1.length
            if (r6 != r4) goto L19
            r6 = r1[r3]
            r1 = r1[r2]
            goto L1a
        L19:
            r1 = r5
        L1a:
            if (r1 != 0) goto L1e
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
        L1e:
            if (r12 == 0) goto L2d
            com.alibaba.fastjson2.util.飘花落叶言子世哲苏楪兰 r5 = new com.alibaba.fastjson2.util.飘花落叶言子世哲苏楪兰
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r3] = r6
            r4[r2] = r12
            r5.<init>(r9, r4)
        L2d:
            r0.f23342 = r12
            r0.f23343 = r5
            java.lang.Class r0 = com.alibaba.fastjson2.util.AbstractC2866.m5899(r1)
            p291.C8547.m14086(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.AbstractC8431.<init>(java.lang.String, int, long, java.lang.String, java.util.Locale, java.lang.String, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Field, java.lang.reflect.Method, java.lang.Class):void");
    }

    @Override // p291.C8429, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        Class cls2 = this.f23342;
        if (cls2 == null || !this.f23626.isAssignableFrom(cls)) {
            return super.mo13975(abstractC2896, cls);
        }
        return new C8470(cls2, this.f23623, cls, this.f23343, this.f23620 | Long.MIN_VALUE);
    }
}
