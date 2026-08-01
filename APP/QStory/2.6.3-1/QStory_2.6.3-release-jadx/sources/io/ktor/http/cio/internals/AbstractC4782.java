package io.ktor.http.cio.internals;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1594;
import androidx.core.view.C3075;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.InterfaceC5079;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p064.C7346;
import p064.C7348;
import p252.C8928;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4782 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f12506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f12507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3075 f12508;

    static {
        long j;
        long j2;
        long j3;
        int i = 13;
        f12508 = AbstractC1298.m1719(C8928.f22718, new C4639(i), new C1594(i));
        C7348 c7348 = new C7348(0, Opcodes.CONST_METHOD_TYPE, 1);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c7348, 10));
        Iterator it = c7348.iterator();
        while (true) {
            C7346 c7346 = (C7346) it;
            if (!c7346.f18168) {
                break;
            }
            int iNextInt = c7346.nextInt();
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
        f12507 = AbstractC5176.m9344(arrayList);
        C7348 c73482 = new C7348(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(c73482, 10));
        Iterator it2 = c73482.iterator();
        while (true) {
            C7346 c73462 = (C7346) it2;
            if (!c73462.f18168) {
                f12506 = AbstractC5176.m9355(arrayList2);
                return;
            } else {
                int iNextInt2 = c73462.nextInt();
                arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8887(InterfaceC5079 interfaceC5079, int i, ContinuationImpl continuationImpl) {
        CharsKt$writeIntHex$1 charsKt$writeIntHex$1;
        int i2;
        byte[] bArr;
        if (continuationImpl instanceof CharsKt$writeIntHex$1) {
            charsKt$writeIntHex$1 = (CharsKt$writeIntHex$1) continuationImpl;
            int i3 = charsKt$writeIntHex$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                charsKt$writeIntHex$1.label = i3 - Integer.MIN_VALUE;
            } else {
                charsKt$writeIntHex$1 = new CharsKt$writeIntHex$1(continuationImpl);
            }
        }
        Object obj = charsKt$writeIntHex$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = charsKt$writeIntHex$1.label;
        if (i4 == 0) {
            AbstractC6017.m10769(obj);
            if (i <= 0) {
                C6755.m11869("Does only work for positive numbers");
                return null;
            }
            int i5 = 0;
            while (true) {
                i2 = i5 + 1;
                bArr = f12506;
                if (i5 < 8) {
                    int i6 = i >>> 28;
                    i <<= 4;
                    if (i6 != 0) {
                        byte b = bArr[i6];
                        charsKt$writeIntHex$1.L$0 = interfaceC5079;
                        charsKt$writeIntHex$1.L$1 = bArr;
                        charsKt$writeIntHex$1.I$0 = i;
                        charsKt$writeIntHex$1.I$1 = i2;
                        charsKt$writeIntHex$1.label = 1;
                        if (AbstractC5078.m9249(interfaceC5079, b, charsKt$writeIntHex$1) != coroutineSingletons) {
                        }
                    } else {
                        i5 = i2;
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i4 != 1 && i4 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i7 = charsKt$writeIntHex$1.I$1;
        i = charsKt$writeIntHex$1.I$0;
        byte[] bArr2 = (byte[]) charsKt$writeIntHex$1.L$1;
        InterfaceC5079 interfaceC50792 = (InterfaceC5079) charsKt$writeIntHex$1.L$0;
        AbstractC6017.m10769(obj);
        i2 = i7;
        interfaceC5079 = interfaceC50792;
        bArr = bArr2;
        while (true) {
            int i8 = i2 + 1;
            if (i2 >= 8) {
                return C6008.f15084;
            }
            int i9 = i >>> 28;
            i <<= 4;
            byte b2 = bArr[i9];
            charsKt$writeIntHex$1.L$0 = interfaceC5079;
            charsKt$writeIntHex$1.L$1 = bArr;
            charsKt$writeIntHex$1.I$0 = i;
            charsKt$writeIntHex$1.I$1 = i8;
            charsKt$writeIntHex$1.label = 2;
            if (AbstractC5078.m9249(interfaceC5079, b2, charsKt$writeIntHex$1) == coroutineSingletons) {
                break;
            }
            i2 = i8;
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long m8888(StringBuilder sb) {
        int length = sb.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            int iCharAt = sb.charAt(i) & 65535;
            long j2 = iCharAt < 255 ? f12507[iCharAt] : -1L;
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
    public static final long m8889(C4786 c4786) {
        int length = c4786.length();
        if (length > 19) {
            C3775.m6963(c4786, "Invalid number ", ": too large for Long type");
            return 0L;
        }
        int i = 0;
        if (length != 19) {
            long j = 0;
            while (i < length) {
                long jCharAt = ((long) c4786.charAt(i)) - 48;
                if (jCharAt < 0 || jCharAt > 9) {
                    m8890(c4786, i);
                    throw null;
                }
                j = (j << 3) + (j << 1) + jCharAt;
                i++;
            }
            return j;
        }
        int length2 = c4786.length();
        long j2 = 0;
        while (i < length2) {
            long jCharAt2 = ((long) c4786.charAt(i)) - 48;
            if (jCharAt2 < 0 || jCharAt2 > 9) {
                m8890(c4786, i);
                throw null;
            }
            j2 = (j2 << 3) + (j2 << 1) + jCharAt2;
            if (j2 < 0) {
                C3775.m6963(c4786, "Invalid number ", ": too large for Long type");
                return 0L;
            }
            i++;
        }
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m8890(C4786 c4786, int i) {
        throw new NumberFormatException("Invalid number: " + ((Object) c4786) + ", wrong digit: " + c4786.charAt(i) + " at position " + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int m8891(CharSequence charSequence, int i, int i2) {
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
    public static boolean m8892(CharSequence charSequence, String str) {
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
