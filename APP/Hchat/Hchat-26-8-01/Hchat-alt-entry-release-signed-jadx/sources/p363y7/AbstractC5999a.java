package p363y7;

import java.util.Iterator;
import okhttp3.HttpUrl;
import okhttp3.internal.p221ws.WebSocketProtocol;
import p255r4.C3683m;
import p257r7.InterfaceC3723m;
import p379z7.C6112h;
import p379z7.C6121q;

/* JADX INFO: renamed from: y7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5999a {

    /* JADX INFO: renamed from: a */
    public static final C3683m f24365a = new C3683m(5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m10738a(Object obj, InterfaceC3723m interfaceC3723m) {
        C6000b c6000b;
        Object obj2 = obj;
        obj2 = obj;
        if (interfaceC3723m != null && interfaceC3723m != obj) {
            if (obj == null) {
                return interfaceC3723m;
            }
            if (obj.getClass() == C6000b.class) {
                c6000b = (C6000b) obj;
            } else {
                C6000b c6000b2 = new C6000b(10);
                c6000b2.add(obj);
                c6000b = c6000b2;
            }
            c6000b.add(interfaceC3723m);
            obj2 = c6000b;
        }
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m10739b(int i9, int i10) {
        if (i9 == i10) {
            return 0;
        }
        return i9 > i10 ? 1 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m10740c(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        int iCompareTo = comparable.compareTo(comparable2);
        if (iCompareTo == 0) {
            return 0;
        }
        return iCompareTo > 0 ? 1 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m10741d(boolean z9, boolean z10) {
        if (z9 == z10) {
            return 0;
        }
        return z9 ? 1 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m10742e(int i9, int i10) {
        if (i9 == i10) {
            return 0;
        }
        return (((long) i9) & 4294967295L) > (((long) i10) & 4294967295L) ? 1 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m10743f(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Iterator m10744g(Object obj) {
        return obj == null ? C6112h.f24664g : obj.getClass() == C6000b.class ? ((C6000b) obj).iterator() : C6121q.m10883a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m10745h(Iterator it) {
        StringBuilder sb2 = new StringBuilder();
        boolean z9 = false;
        while (it.hasNext()) {
            if (z9) {
                sb2.append((Object) ' ');
            }
            sb2.append(it.next());
            z9 = true;
        }
        return sb2.length() != 0 ? sb2.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Object m10746i(Object obj, InterfaceC3723m interfaceC3723m) {
        if (interfaceC3723m == null || obj == null || interfaceC3723m == obj) {
            return null;
        }
        if (obj.getClass() != C6000b.class) {
            if (obj.equals(interfaceC3723m)) {
                return null;
            }
            return obj;
        }
        C6000b c6000b = (C6000b) obj;
        c6000b.remove(interfaceC3723m);
        int i9 = c6000b.f24644i;
        if (i9 == 0) {
            return null;
        }
        return i9 == 1 ? c6000b.f24642g[0] : c6000b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m10747j(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj.getClass() == C6000b.class) {
            return ((C6000b) obj).f24644i;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m10748k(int i9, int i10) {
        return m10749l(i10, 4294967295L & ((long) i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m10749l(int i9, long j3) {
        String hexString = Long.toHexString(j3);
        StringBuilder sb2 = new StringBuilder("0x");
        int length = i9 - hexString.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append('0');
        }
        sb2.append(hexString);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m10750m(int i9, String str, long j3) {
        String hexString = Long.toHexString(j3);
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
        }
        int length = i9 - hexString.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append('0');
        }
        sb2.append(hexString);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m10751n(byte b10) {
        return m10749l(2, ((long) b10) & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m10752o(short s10) {
        return m10749l(4, ((long) s10) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m10753p(int i9, String str) {
        return m10750m(8, str, 4294967295L & ((long) i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m10754q(String str) {
        char[] charArray = str.toCharArray();
        boolean z9 = false;
        for (int i9 = 0; i9 < charArray.length; i9++) {
            char c10 = charArray[i9];
            char c11 = (c10 > 'Z' || c10 < 'A') ? c10 : (char) (c10 + ' ');
            if (c10 != c11) {
                charArray[i9] = c11;
                z9 = true;
            }
        }
        return !z9 ? str : new String(charArray);
    }
}
