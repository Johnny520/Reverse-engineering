package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3687;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigInteger;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3777 implements BiFunction {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final BiFunction f9666;

    static {
        BiFunction c3777;
        if (AbstractC3687.f9274 || AbstractC3687.f9273) {
            c3777 = null;
        } else {
            try {
                MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(BigInteger.class);
                MethodHandle methodHandleFindConstructor = lookupM6328.findConstructor(BigInteger.class, MethodType.methodType(Void.TYPE, Integer.TYPE, int[].class));
                c3777 = (BiFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", MethodType.methodType(BiFunction.class), methodHandleFindConstructor.type().generic(), methodHandleFindConstructor, MethodType.methodType(BigInteger.class, Integer.class, int[].class)).getTarget().invokeExact();
            } catch (Throwable unused) {
                c3777 = null;
            }
        }
        if (c3777 == null) {
            c3777 = new C3777();
        }
        f9666 = c3777;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // java.util.function.BiFunction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj, Object obj2) {
        int length;
        int[] iArr = (int[]) obj2;
        int iIntValue = ((Integer) obj).intValue();
        if (iArr.length == 0) {
            length = 0;
        } else {
            length = ((iArr.length - 1) << 5) + (32 - Integer.numberOfLeadingZeros(iArr[0]));
            if (iIntValue < 0) {
                boolean z = Integer.bitCount(iArr[0]) == 1;
                for (int i = 1; i < iArr.length && z; i++) {
                    z = iArr[i] == 0;
                }
                if (z) {
                    length--;
                }
            }
        }
        int i2 = length / 8;
        byte[] bArr = new byte[i2 + 1];
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (i2 >= 0) {
            if (i5 == 4) {
                int i6 = i4 + 1;
                if (i4 >= 0) {
                    if (i4 >= iArr.length) {
                        i3 = iIntValue < 0 ? -1 : 0;
                    } else {
                        i3 = iArr[(iArr.length - i4) - 1];
                        if (iIntValue < 0) {
                            int length2 = iArr.length;
                            int i7 = length2 - 1;
                            while (i7 >= 0 && iArr[i7] == 0) {
                                i7--;
                            }
                            i3 = i4 <= (length2 - i7) - 1 ? -i3 : ~i3;
                        }
                    }
                    i4 = i6;
                    i5 = 1;
                }
            } else {
                i3 >>>= 8;
                i5++;
            }
            bArr[i2] = (byte) i3;
            i2--;
        }
        return new BigInteger(bArr);
    }
}
