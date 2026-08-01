package org.apache.commons.lang3.builder;

import java.util.stream.Stream;
import org.apache.commons.lang3.C5689;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.lang3.builder.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5636 extends C5635 {
    @Override // org.apache.commons.lang3.builder.C5635
    public final String toString() {
        boolean zAnyMatch = Stream.empty().anyMatch(new C5689(1));
        Object obj = this.f15519;
        if (zAnyMatch) {
            ToStringStyle.unregister(obj);
            C5919.m11250("includeFieldNames and excludeFieldNames must not intersect");
            return null;
        }
        Class<?> superclass = obj.getClass();
        m10969(superclass);
        while (superclass.getSuperclass() != null) {
            superclass = superclass.getSuperclass();
            m10969(superclass);
        }
        return super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10969(java.lang.Class r12) {
        /*
            r11 = this;
            boolean r0 = r12.isArray()
            r1 = 0
            java.lang.StringBuffer r2 = r11.f15520
            org.apache.commons.lang3.builder.ToStringStyle r3 = r11.f15518
            java.lang.Object r11 = r11.f15519
            if (r0 == 0) goto L11
            r3.reflectionAppendArrayDetail(r2, r1, r11)
            return
        L11:
            java.lang.reflect.Field[] r12 = r12.getDeclaredFields()
            com.alibaba.fastjson2.reader.飘花落叶言子兰世苏楪哲 r0 = new com.alibaba.fastjson2.reader.飘花落叶言子兰世苏楪哲
            r4 = 19
            r0.<init>(r4)
            java.util.Comparator r0 = java.util.Comparator.comparing(r0)
            if (r12 == 0) goto L25
            java.util.Arrays.sort(r12, r0)
        L25:
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r12, r0)
            int r4 = r12.length
            r5 = 0
            r6 = r5
        L2c:
            if (r6 >= r4) goto L8f
            r7 = r12[r6]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = r7.getName()
            r10 = 36
            int r9 = r9.indexOf(r10)
            r10 = -1
            if (r9 == r10) goto L43
        L41:
            r9 = r5
            goto L72
        L43:
            int r9 = r7.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isTransient(r9)
            if (r9 == 0) goto L4e
            goto L41
        L4e:
            int r9 = r7.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L59
            goto L41
        L59:
            boolean r9 = org.apache.commons.lang3.AbstractC5685.m10995(r1)
            if (r9 != 0) goto L6b
            java.lang.String r9 = r7.getName()
            int r9 = java.util.Arrays.binarySearch(r1, r9)
            if (r9 < 0) goto L41
            r9 = r0
            goto L72
        L6b:
            java.lang.Class<org.apache.commons.lang3.builder.飘花落叶言子楪世兰苏哲> r9 = org.apache.commons.lang3.builder.InterfaceC5634.class
            boolean r9 = r7.isAnnotationPresent(r9)
            r9 = r9 ^ r0
        L72:
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r7.get(r11)     // Catch: java.lang.IllegalAccessException -> L87
            java.lang.Class<org.apache.commons.lang3.builder.飘花落叶言子楪世兰哲苏> r10 = org.apache.commons.lang3.builder.InterfaceC5633.class
            boolean r7 = r7.isAnnotationPresent(r10)     // Catch: java.lang.IllegalAccessException -> L87
            r7 = r7 ^ r0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.IllegalAccessException -> L87
            r3.append(r2, r8, r9, r7)     // Catch: java.lang.IllegalAccessException -> L87
            goto L8c
        L87:
            r11 = move-exception
            bsh.C2632.m5292(r11)
            return
        L8c:
            int r6 = r6 + 1
            goto L2c
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.builder.C5636.m10969(java.lang.Class):void");
    }
}
