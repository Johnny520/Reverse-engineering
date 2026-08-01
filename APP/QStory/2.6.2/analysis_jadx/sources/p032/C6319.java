package p032;

import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6319 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17414 = new HashMap();

    public C6319(ClassLoader classLoader) {
        super(classLoader);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class loadClass(java.lang.String r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = p032.C6319.f17414
            java.lang.Object r1 = r0.get(r7)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = "["
            boolean r1 = r7.startsWith(r1)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L49
            r1 = 91
            int r2 = r7.lastIndexOf(r1)     // Catch: java.lang.Throwable -> L56
            int r2 = r2 + 1
            java.lang.String r3 = r7.substring(r2)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L56
            java.lang.Class r2 = p032.AbstractC6318.m11839(r3)     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L56
            goto L2c
        L24:
            java.lang.String r2 = r7.substring(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.Class r2 = super.loadClass(r2)     // Catch: java.lang.Throwable -> L56
        L2c:
            r3 = 0
            r4 = r3
        L2e:
            int r5 = r7.length()     // Catch: java.lang.Throwable -> L56
            if (r4 >= r5) goto L45
            char r5 = r7.charAt(r4)     // Catch: java.lang.Throwable -> L56
            if (r5 != r1) goto L45
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)     // Catch: java.lang.Throwable -> L56
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L56
            int r4 = r4 + 1
            goto L2e
        L45:
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L56
            return r2
        L49:
            java.lang.Class r1 = p032.AbstractC6318.m11839(r7)     // Catch: java.lang.Exception -> L4e java.lang.Throwable -> L56
            goto L52
        L4e:
            java.lang.Class r1 = super.loadClass(r7)     // Catch: java.lang.Throwable -> L56
        L52:
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L56
            return r1
        L56:
            java.lang.String r1 = "com.tencent.qqnt.kernel.nativeinterface."
            boolean r1 = r7.startsWith(r1)
            java.lang.String r2 = "没有找到类: "
            if (r1 == 0) goto L7a
            java.lang.String r1 = "com.tencent.qqnt.kernel.nativeinterface"
            java.lang.String r3 = "com.tencent.qqnt.kernelpublic.nativeinterface"
            java.lang.String r7 = r7.replace(r1, r3)
            java.lang.Class r6 = super.loadClass(r7)     // Catch: java.lang.ClassNotFoundException -> L70
            r0.put(r7, r6)     // Catch: java.lang.ClassNotFoundException -> L70
            return r6
        L70:
            lin.util.ReflectUtils.ReflectException r6 = new lin.util.ReflectUtils.ReflectException
            java.lang.String r7 = androidx.activity.AbstractC0053.m152(r2, r7)
            r6.<init>(r7)
            throw r6
        L7a:
            lin.util.ReflectUtils.ReflectException r6 = new lin.util.ReflectUtils.ReflectException
            java.lang.String r7 = r2.concat(r7)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p032.C6319.loadClass(java.lang.String):java.lang.Class");
    }
}
