package kotlin.collections;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.sequences.C5116;
import kotlin.sequences.InterfaceC5126;
import p052.InterfaceC6557;
import p251.AbstractC8174;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4346 extends AbstractC8174 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static /* synthetic */ void m8833(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        m8840(bArr, 0, bArr2, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static byte[] m8834(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC8174.m13604(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static void m8835(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m8836(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static /* synthetic */ void m8837(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        m8839(0, i, objArr, i2, objArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static /* synthetic */ void m8838(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        m8842(i, 0, i2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m8839(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m8840(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static InterfaceC5126 m8841(Object[] objArr) {
        return objArr.length == 0 ? C5116.f14652 : new C4345(objArr, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m8842(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static boolean m8843(Object obj, Object[] objArr) {
        objArr.getClass();
        return m8844(obj, objArr) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static int m8844(Object obj, Object[] objArr) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static Object m8845(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static Integer m8846(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static int m8847(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static Object m8848(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static Object m8849(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        C4210.m8627("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static List m8850(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC8189.m13660(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static List m8851(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC8189.m13660(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static Set m8852(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.INSTANCE;
        }
        if (length == 1) {
            return AbstractC0455.m1140(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4338.m8779(objArr.length));
        m8854(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static Object m8853(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            C4210.m8627("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        C5919.m11249("Array has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static final void m8854(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static Object m8855(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        C4210.m8627("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static String m8856(Object[] objArr, String str, String str2, InterfaceC6557 interfaceC6557, int i) {
        String str3 = (i & 1) != 0 ? ", " : "";
        String str4 = (i & 2) != 0 ? "" : str;
        String str5 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            interfaceC6557 = null;
        }
        StringBuilder sb = new StringBuilder();
        m8859(objArr, sb, str3, str4, str5, "...", interfaceC6557);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static char m8857(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            C4210.m8627("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        C5919.m11249("Array has more than one element.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static byte[] m8858(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static final void m8859(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC6557 interfaceC6557) {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC3055.m6631(sb, obj, interfaceC6557);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static String m8860(byte[] bArr, InterfaceC6557 interfaceC6557, int i) {
        String str = (i & 1) != 0 ? ", " : "";
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            interfaceC6557 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i3 = 0;
        for (byte b : bArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (interfaceC6557 != null) {
                sb.append((CharSequence) interfaceC6557.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append((CharSequence) "...");
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m8861(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static Object[] m8862(Object[] objArr, int i, int i2) {
        objArr.getClass();
        AbstractC8174.m13604(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m8863(int[] iArr, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static ArrayList m8864(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static void m8865(long j, long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }
}
