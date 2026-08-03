package Yue;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
public class C4836 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final File m1745(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        return new File(m14708(file));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m1746(String str) {
        int iM24056;
        char c = File.separatorChar;
        int iM240562 = C7628.m24056(str, c, 0, false, 4, null);
        if (iM240562 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iM24056 = C7628.m24056(str, c, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iM240563 = C7628.m24056(str, c, iM24056 + 1, false, 4, null);
            return iM240563 >= 0 ? iM240563 + 1 : str.length();
        }
        if (iM240562 > 0 && str.charAt(iM240562 - 1) == ':') {
            return iM240562 + 1;
        }
        if (iM240562 == -1 && C7628.m24040(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m14708(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        String path = file.getPath();
        C5499.m17102(path, "path");
        String path2 = file.getPath();
        C5499.m17102(path2, "path");
        String strSubstring = path.substring(0, m1746(path2));
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m14709(@InterfaceC6399 File file) {
        C5499.m17103(file, "<this>");
        String path = file.getPath();
        C5499.m17102(path, "path");
        return m1746(path) > 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final File m14710(@InterfaceC6399 File file, int i, int i2) {
        C5499.m17103(file, "<this>");
        return m14711(file).m14606(i, i2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C4813 m14711(@InterfaceC6399 File file) {
        List listM10735;
        C5499.m17103(file, "<this>");
        String path = file.getPath();
        C5499.m17102(path, "path");
        int iM1746 = m1746(path);
        String strSubstring = path.substring(0, iM1746);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = path.substring(iM1746);
        C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
        if (strSubstring2.length() == 0) {
            listM10735 = C3880.m10735();
        } else {
            List listM24136 = C7628.m24136(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(C3881.m10756(listM24136, 10));
            Iterator it = listM24136.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listM10735 = arrayList;
        }
        return new C4813(new File(strSubstring), listM10735);
    }
}
