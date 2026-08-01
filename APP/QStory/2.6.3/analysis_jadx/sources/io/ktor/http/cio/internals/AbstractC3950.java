package io.ktor.http.cio.internals;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.C0753;
import androidx.core.view.C2242;
import com.alibaba.fastjson2.C2942;
import com.android.dx.io.Opcodes;
import com.materialkolor.dynamiccolor.C3807;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import p048.C6517;
import p048.C6519;
import p236.C8099;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3950 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f12161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f12162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2242 f12163;

    static {
        long j;
        long j2;
        long j3;
        int i = 13;
        f12163 = AbstractC0455.m1159(C8099.f22373, new C3807(i), new C0753(i));
        C6519 c6519 = new C6519(0, Opcodes.CONST_METHOD_TYPE, 1);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c6519, 10));
        Iterator it = c6519.iterator();
        while (true) {
            C6517 c6517 = (C6517) it;
            if (!c6517.f17823) {
                break;
            }
            int iNextInt = c6517.nextInt();
            if (48 > iNextInt || iNextInt >= 58) {
                j = iNextInt;
                if (j >= 97 && j <= 102) {
                    j3 = 87;
                } else if (j < 65 || j > 70) {
                    j2 = -1;
                    arrayList.add(Long.valueOf(j2));
                } else {
                    j3 = 55;
                }
            } else {
                j = iNextInt;
                j3 = 48;
            }
            j2 = j - j3;
            arrayList.add(Long.valueOf(j2));
        }
        f12162 = AbstractC4344.m8785(arrayList);
        C6519 c65192 = new C6519(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(c65192, 10));
        Iterator it2 = c65192.iterator();
        while (true) {
            C6517 c65172 = (C6517) it2;
            if (!c65172.f17823) {
                f12161 = AbstractC4344.m8796(arrayList2);
                return;
            } else {
                int iNextInt2 = c65172.nextInt();
                arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8328(io.ktor.utils.io.InterfaceC4247 r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.http.cio.internals.CharsKt$writeIntHex$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.http.cio.internals.CharsKt$writeIntHex$1 r0 = (io.ktor.http.cio.internals.CharsKt$writeIntHex$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.internals.CharsKt$writeIntHex$1 r0 = new io.ktor.http.cio.internals.CharsKt$writeIntHex$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 8
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L30
            if (r2 != r5) goto L2a
            goto L30
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r3
        L30:
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$1
            byte[] r2 = (byte[]) r2
            java.lang.Object r3 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪哲苏世兰 r3 = (io.ktor.utils.io.InterfaceC4247) r3
            kotlin.AbstractC5185.m10210(r10)
            r7 = r2
            r2 = r8
            r8 = r3
            r3 = r7
            goto L6b
        L44:
            kotlin.AbstractC5185.m10210(r10)
            if (r9 <= 0) goto L8b
            r10 = 0
        L4a:
            int r2 = r10 + 1
            byte[] r3 = io.ktor.http.cio.internals.AbstractC3950.f12161
            if (r10 >= r4) goto L6b
            int r10 = r9 >>> 28
            int r9 = r9 << 4
            if (r10 == 0) goto L69
            r10 = r3[r10]
            r0.L$0 = r8
            r0.L$1 = r3
            r0.I$0 = r9
            r0.I$1 = r2
            r0.label = r6
            java.lang.Object r10 = io.ktor.utils.io.AbstractC4246.m8690(r8, r10, r0)
            if (r10 != r1) goto L6b
            goto L85
        L69:
            r10 = r2
            goto L4a
        L6b:
            int r10 = r2 + 1
            if (r2 >= r4) goto L88
            int r2 = r9 >>> 28
            int r9 = r9 << 4
            r2 = r3[r2]
            r0.L$0 = r8
            r0.L$1 = r3
            r0.I$0 = r9
            r0.I$1 = r10
            r0.label = r5
            java.lang.Object r2 = io.ktor.utils.io.AbstractC4246.m8690(r8, r2, r0)
            if (r2 != r1) goto L86
        L85:
            return r1
        L86:
            r2 = r10
            goto L6b
        L88:
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5176.f14739
            return r8
        L8b:
            java.lang.String r8 = "Does only work for positive numbers"
            top.suzhelan.qstory.hook.item.C5925.m11310(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.internals.AbstractC3950.m8328(io.ktor.utils.io.飘花落叶言子楪哲苏世兰, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m8329(StringBuilder sb) {
        int length = sb.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            int iCharAt = sb.charAt(i) & 65535;
            long j2 = iCharAt < 255 ? f12162[iCharAt] : -1L;
            if (j2 == -1) {
                StringBuilder sb2 = new StringBuilder("Invalid HEX number: ");
                sb2.append((Object) sb);
                char cCharAt = sb.charAt(i);
                sb2.append(", wrong digit: ");
                sb2.append(cCharAt);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 4) | j2;
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long m8330(C3954 c3954) {
        int length = c3954.length();
        if (length > 19) {
            C2942.m6403(c3954, "Invalid number ", ": too large for Long type");
            return 0L;
        }
        int i = 0;
        if (length != 19) {
            long j = 0;
            while (i < length) {
                long jCharAt = ((long) c3954.charAt(i)) - 48;
                if (jCharAt < 0 || jCharAt > 9) {
                    m8331(c3954, i);
                    throw null;
                }
                j = (j << 3) + (j << 1) + jCharAt;
                i++;
            }
            return j;
        }
        int length2 = c3954.length();
        long j2 = 0;
        while (i < length2) {
            long jCharAt2 = ((long) c3954.charAt(i)) - 48;
            if (jCharAt2 < 0 || jCharAt2 > 9) {
                m8331(c3954, i);
                throw null;
            }
            j2 = (j2 << 3) + (j2 << 1) + jCharAt2;
            if (j2 < 0) {
                C2942.m6403(c3954, "Invalid number ", ": too large for Long type");
                return 0L;
            }
            i++;
        }
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m8331(C3954 c3954, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) c3954) + ", wrong digit: " + c3954.charAt(i) + " at position " + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m8332(CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        int i3 = 0;
        while (i < i2) {
            int iCharAt = charSequence.charAt(i);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i3 = (i3 * 31) + iCharAt;
            i++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m8333(CharSequence charSequence, String str) {
        int length = charSequence.length();
        charSequence.getClass();
        if (length == str.length()) {
            for (int i = 0; i < length; i++) {
                int iCharAt = charSequence.charAt(i);
                if (65 <= iCharAt && iCharAt < 91) {
                    iCharAt += 32;
                }
                int iCharAt2 = str.charAt(i);
                if (65 <= iCharAt2 && iCharAt2 < 91) {
                    iCharAt2 += 32;
                }
                if (iCharAt == iCharAt2) {
                }
            }
            return true;
        }
        return false;
    }
}
