package p000;

import android.net.Uri;
import android.os.Environment;
import com.p001mr.elaris.AbstractC0169w;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0515w6 implements InterfaceC0027ba {

    /* JADX INFO: renamed from: a */
    public final Object f997a;

    /* JADX INFO: renamed from: b */
    public final Object f998b;

    /* JADX INFO: renamed from: c */
    public final Comparable f999c;

    /* JADX INFO: renamed from: d */
    public final Serializable f1000d;

    /* JADX INFO: renamed from: e */
    public final Object f1001e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0515w6(File file, Uri uri, Uri uri2, ArrayList arrayList, ArrayList arrayList2) {
        this.f997a = file;
        this.f998b = uri;
        this.f999c = uri2;
        this.f1000d = arrayList == null ? new ArrayList() : arrayList;
        this.f1001e = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0027ba
    /* JADX INFO: renamed from: a */
    public void mo74a(int i, int i2) {
        int iM1208o;
        C0566z9 c0566z9 = (C0566z9) this.f1001e;
        if (i2 > 0) {
            for (String str : (String[]) this.f997a) {
                if (!c0566z9.m1197d(str, i2)) {
                    return;
                }
            }
            String strSubstring = (String) this.f999c;
            if (strSubstring.startsWith("L") && strSubstring.endsWith(";")) {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
            }
            String strReplace = strSubstring.replace('/', '.');
            String strM1194a = C0566z9.m1194a(c0566z9, i);
            int iM1195b = C0566z9.m1195b(c0566z9, i);
            String strM1196c = C0566z9.m1196c(c0566z9, i);
            int iM1199f = c0566z9.m1199f(i);
            if (iM1199f >= 0) {
                int iM1208o2 = c0566z9.m1208o((iM1199f * 12) + c0566z9.f1148f + 8);
                if (iM1208o2 != 0 && (iM1208o = c0566z9.m1208o(iM1208o2)) > 0 && iM1208o <= 64) {
                    String[] strArr = new String[iM1208o];
                    for (int i3 = 0; i3 < iM1208o; i3++) {
                        strArr[i3] = c0566z9.m1205l(c0566z9.m1207n((i3 * 2) + iM1208o2 + 4));
                    }
                }
            }
            if (((HashSet) this.f998b).add(strReplace + "#" + strM1194a + "#" + iM1195b + "#" + strM1196c)) {
                ((HashSet) this.f1000d).add(new C0043ca(strReplace, strM1194a, iM1195b, strM1196c));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m1122b() throws IllegalAccessException, InvocationTargetException {
        ((Method) this.f997a).invoke(this.f998b, (String) this.f999c, (String) this.f1000d);
        C0531x6 c0531x6 = (C0531x6) this.f1001e;
        c0531x6.f1034e = true;
        c0531x6.f1035f = true;
        c0531x6.f1038i = true;
        if (AbstractC0008a7.m59p(c0531x6.f1036g)) {
            c0531x6.f1036g = "native handler invoked";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public String m1123c() {
        if (!m1125e()) {
            return AbstractC0169w.m299h0((File) this.f997a);
        }
        ArrayList arrayList = (ArrayList) this.f1001e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (str != null && str.length() != 0) {
                if (sb.length() > 0) {
                    sb.append(" > ");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public boolean m1124d() {
        File file = (File) this.f997a;
        if (m1125e()) {
            return true;
        }
        return file != null && file.exists() && file.isDirectory();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public boolean m1125e() {
        return (((Uri) this.f998b) == null || ((Uri) this.f999c) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0515w6 m1126f() {
        File parentFile;
        ArrayList arrayList = (ArrayList) this.f1000d;
        if (m1125e()) {
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            Uri uri = (Uri) arrayList2.remove(arrayList2.size() - 1);
            ArrayList arrayList3 = new ArrayList((ArrayList) this.f1001e);
            if (arrayList3.size() > 1) {
                arrayList3.remove(arrayList3.size() - 1);
            }
            return new C0515w6((File) null, (Uri) this.f998b, uri, arrayList2, arrayList3);
        }
        File file = (File) this.f997a;
        String[] strArr = AbstractC0169w.f161a;
        if (file == null) {
            parentFile = null;
        } else {
            try {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (externalStorageDirectory != null) {
                    if (AbstractC0169w.m325u0(AbstractC0169w.m320s(file)).equals(AbstractC0169w.m325u0(AbstractC0169w.m320s(externalStorageDirectory)))) {
                    }
                }
            } catch (Throwable unused) {
            }
            parentFile = file.getParentFile();
        }
        if (parentFile == null) {
            return null;
        }
        return new C0515w6(parentFile, (Uri) null, (Uri) null, (ArrayList) null, (ArrayList) null);
    }

    public C0515w6(C0566z9 c0566z9, String[] strArr, String str, HashSet hashSet, HashSet hashSet2) {
        this.f1001e = c0566z9;
        this.f997a = strArr;
        this.f999c = str;
        this.f998b = hashSet;
        this.f1000d = hashSet2;
    }

    public C0515w6(Method method, Object obj, String str, String str2, C0531x6 c0531x6) {
        this.f997a = method;
        this.f998b = obj;
        this.f999c = str;
        this.f1000d = str2;
        this.f1001e = c0531x6;
    }
}
