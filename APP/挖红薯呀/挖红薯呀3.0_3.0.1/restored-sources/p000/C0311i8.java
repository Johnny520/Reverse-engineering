package p000;

import android.os.Debug;
import android.os.Process;
import java.io.File;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0311i8 {

    /* JADX INFO: renamed from: a */
    public static final C0311i8 f2476a = new C0311i8();

    /* JADX INFO: renamed from: b */
    public static final int f2477b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0311i8() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private final String m1559a() {
        int[] iArr = new int[9];
        int[] iArr2 = {108, 105, 110, 106, 101, 99, 116, 111, 114};
        for (int i = 0; i < 9; i++) {
            iArr[i] = iArr2[i];
        }
        ArrayList arrayList = new ArrayList(9);
        for (int i2 = 0; i2 < 9; i2++) {
            arrayList.add(Character.valueOf((char) iArr[i2]));
        }
        return AbstractC0960ye.m5245O(arrayList, "", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private final String m1560b() {
        int[] iArr = new int[9];
        int[] iArr2 = {84, 114, 97, 99, 101, 114, 80, 105, 100};
        for (int i = 0; i < 9; i++) {
            iArr[i] = iArr2[i];
        }
        ArrayList arrayList = new ArrayList(9);
        for (int i2 = 0; i2 < 9; i2++) {
            arrayList.add(Character.valueOf((char) iArr[i2]));
        }
        return AbstractC0960ye.m5245O(arrayList, "", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private final String m1561c() {
        int[] iArr = new int[6];
        int[] iArr2 = {120, 112, 111, 115, 101, 100};
        for (int i = 0; i < 6; i++) {
            iArr[i] = iArr2[i];
        }
        ArrayList arrayList = new ArrayList(6);
        for (int i2 = 0; i2 < 6; i2++) {
            arrayList.add(Character.valueOf((char) iArr[i2]));
        }
        return AbstractC0960ye.m5245O(arrayList, "", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final boolean m1562d() {
        try {
            return Debug.isDebuggerConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final boolean m1563e() {
        try {
            int[] iArr = new int[12];
            int[] iArr2 = {102, 114, 105, 100, 97, 46, 115, 101, 114, 118, 101, 114};
            for (int i = 0; i < 12; i++) {
                iArr[i] = iArr2[i];
            }
            ArrayList arrayList = new ArrayList(12);
            for (int i2 = 0; i2 < 12; i2++) {
                arrayList.add(Character.valueOf((char) iArr[i2]));
            }
            String strM5245O = AbstractC0960ye.m5245O(arrayList, "", null, null, null, 62);
            File file = new File("/proc/" + Process.myPid() + "/maps");
            if (file.exists() && file.canRead()) {
                String strM3156c0 = AbstractC0627pt.m3156c0(file);
                if (!k41.m1764V(strM3156c0, strM5245O, false) && !k41.m1764V(strM3156c0, m1559a(), false) && !k41.m1764V(strM3156c0, "gadget", false)) {
                    if (k41.m1764V(strM3156c0, m1561c(), false)) {
                        return true;
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        try {
            int[] iArr3 = {27042, 27043, 27044, 27045};
            for (int i3 = 0; i3 < 4; i3++) {
                try {
                    Socket socket = new Socket("127.0.0.1", iArr3[i3]);
                    socket.setSoTimeout(100);
                    socket.close();
                    return true;
                } catch (Exception unused2) {
                }
            }
        } catch (Exception unused3) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r2.intValue() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m1564f() {
        try {
            File file = new File("/proc/self/status");
            if (file.exists() && file.canRead()) {
                Iterator it = AbstractC0627pt.m3155b0(file).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (r41.m3382S(str, m1560b(), false)) {
                        List listM1773e0 = k41.m1773e0(str, new String[]{":"}, 6);
                        if (listM1773e0.size() < 2) {
                            break;
                        }
                        Integer numM3383T = r41.m3383T(k41.m1775g0((String) listM1773e0.get(1)).toString());
                        if (numM3383T != null) {
                            break;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m1565g() {
        return (m1562d() || m1563e() || m1564f()) ? false : true;
    }
}
