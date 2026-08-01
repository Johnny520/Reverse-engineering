package kotlin.collections;

import io.ktor.util.C5043;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.sequences.C5949;
import kotlin.sequences.InterfaceC5959;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p191.AbstractC8568;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5179 extends AbstractC7173 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static Integer m9382(int[] iArr, int i) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static Object m9383(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static Object m9384(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        C5043.m9176("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static ArrayList m9385(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static int m9386(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static Object m9387(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m9389(int[] iArr, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = iArr.length;
        }
        Arrays.fill(iArr, 0, i2, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static Object[] m9390(Object[] objArr, int i, int i2) {
        objArr.getClass();
        AbstractC7173.m12450(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static byte[] m9391(int i, byte[] bArr, int i2) {
        bArr.getClass();
        AbstractC7173.m12450(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m9392(long j, long[] jArr) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static void m9393(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m9394(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m9395(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m9396(Object obj, Object[] objArr) {
        objArr.getClass();
        return m9411(obj, objArr) >= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static InterfaceC5959 m9397(Object[] objArr) {
        return objArr.length == 0 ? C5949.f14997 : new C5178(objArr, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static /* synthetic */ void m9398(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        m9403(bArr, 0, bArr2, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static /* synthetic */ void m9399(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        m9394(0, i, objArr, i2, objArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static /* synthetic */ void m9400(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        m9395(i, 0, i2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m9401(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static void m9402(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static void m9403(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static Set m9404(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.INSTANCE;
        }
        if (length == 1) {
            return AbstractC8568.m13614(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5171.m9331(objArr.length));
        m9407(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public static List m9405(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC7176.m12487(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static List m9406(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return AbstractC7176.m12487(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static final void m9407(Object[] objArr, HashSet hashSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static Object m9408(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            C5043.m9176("Array is empty.");
            return null;
        }
        if (length == 1) {
            return objArr[0];
        }
        C6755.m11869("Array has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static char m9409(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            C5043.m9176("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        C6755.m11869("Array has more than one element.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static final void m9410(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC7387 interfaceC7387) throws IOException {
        objArr.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC9004.m14209(sb, obj, interfaceC7387);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static int m9411(Object obj, Object[] objArr) {
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

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static Object m9412(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        C5043.m9176("Array is empty.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static byte[] m9413(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static String m9414(byte[] bArr, InterfaceC7387 interfaceC7387, int i) {
        String str = (i & 1) != 0 ? ", " : "";
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        int i2 = (i & 8) != 0 ? -1 : 32;
        if ((i & 32) != 0) {
            interfaceC7387 = null;
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
            if (interfaceC7387 != null) {
                sb.append((CharSequence) interfaceC7387.invoke(Byte.valueOf(b)));
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

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static String m9415(Object[] objArr, String str, String str2, InterfaceC7387 interfaceC7387, int i) throws IOException {
        String str3 = (i & 1) != 0 ? ", " : "";
        String str4 = (i & 2) != 0 ? "" : str;
        String str5 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            interfaceC7387 = null;
        }
        StringBuilder sb = new StringBuilder();
        m9410(objArr, sb, str3, str4, str5, "...", interfaceC7387);
        return sb.toString();
    }
}
