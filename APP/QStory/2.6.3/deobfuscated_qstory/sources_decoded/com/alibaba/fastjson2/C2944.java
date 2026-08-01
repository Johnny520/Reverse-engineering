package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2854;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigInteger;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2944 implements BiFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final BiFunction f9321;

    static {
        BiFunction c2944;
        if (AbstractC2854.f8929 || AbstractC2854.f8928) {
            c2944 = null;
        } else {
            try {
                MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(BigInteger.class);
                MethodHandle methodHandleFindConstructor = lookupM5768.findConstructor(BigInteger.class, MethodType.methodType(Void.TYPE, Integer.TYPE, int[].class));
                c2944 = (BiFunction) LambdaMetafactory.metafactory(lookupM5768, "apply", MethodType.methodType(BiFunction.class), methodHandleFindConstructor.type().generic(), methodHandleFindConstructor, MethodType.methodType(BigInteger.class, Integer.class, int[].class)).getTarget().invokeExact();
            } catch (Throwable unused) {
                c2944 = null;
            }
        }
        if (c2944 == null) {
            c2944 = new C2944();
        }
        f9321 = c2944;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // java.util.function.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            java.lang.Integer r11 = (java.lang.Integer) r11
            int[] r12 = (int[]) r12
            int r10 = r11.intValue()
            int r11 = r12.length
            r0 = 0
            r1 = 1
            if (r11 != 0) goto Lf
            r2 = r0
            goto L3d
        Lf:
            r11 = r12[r0]
            int r11 = java.lang.Integer.numberOfLeadingZeros(r11)
            int r11 = 32 - r11
            int r2 = r12.length
            int r2 = r2 - r1
            int r2 = r2 << 5
            int r2 = r2 + r11
            if (r10 >= 0) goto L3d
            r11 = r12[r0]
            int r11 = java.lang.Integer.bitCount(r11)
            if (r11 != r1) goto L28
            r11 = r1
            goto L29
        L28:
            r11 = r0
        L29:
            r3 = r1
        L2a:
            int r4 = r12.length
            if (r3 >= r4) goto L39
            if (r11 == 0) goto L39
            r11 = r12[r3]
            if (r11 != 0) goto L35
            r11 = r1
            goto L36
        L35:
            r11 = r0
        L36:
            int r3 = r3 + 1
            goto L2a
        L39:
            if (r11 == 0) goto L3d
            int r2 = r2 + (-1)
        L3d:
            int r2 = r2 / 8
            int r11 = r2 + 1
            byte[] r11 = new byte[r11]
            r3 = 4
            r5 = r0
            r6 = r5
            r4 = r3
        L47:
            if (r2 < 0) goto L80
            if (r4 != r3) goto L76
            int r4 = r6 + 1
            if (r6 >= 0) goto L51
        L4f:
            r5 = r0
            goto L73
        L51:
            int r5 = r12.length
            if (r6 < r5) goto L58
            if (r10 >= 0) goto L4f
            r5 = -1
            goto L73
        L58:
            int r5 = r12.length
            int r5 = r5 - r6
            int r5 = r5 - r1
            r5 = r12[r5]
            if (r10 < 0) goto L60
            goto L73
        L60:
            int r7 = r12.length
            int r8 = r7 + (-1)
        L63:
            if (r8 < 0) goto L6c
            r9 = r12[r8]
            if (r9 != 0) goto L6c
            int r8 = r8 + (-1)
            goto L63
        L6c:
            int r7 = r7 - r8
            int r7 = r7 - r1
            if (r6 > r7) goto L72
            int r5 = -r5
            goto L73
        L72:
            int r5 = ~r5
        L73:
            r6 = r4
            r4 = r1
            goto L7a
        L76:
            int r5 = r5 >>> 8
            int r4 = r4 + 1
        L7a:
            byte r7 = (byte) r5
            r11[r2] = r7
            int r2 = r2 + (-1)
            goto L47
        L80:
            java.math.BigInteger r10 = new java.math.BigInteger
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2944.apply(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
