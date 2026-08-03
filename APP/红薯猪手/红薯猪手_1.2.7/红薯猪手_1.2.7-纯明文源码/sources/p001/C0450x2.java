package p001;

import android.os.Environment;
import java.io.File;

/* JADX INFO: renamed from: ۟.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0450x2 {
    /* JADX INFO: renamed from: ۥ */
    public static String m961() {
        File externalStorageDirectory = Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null;
        return externalStorageDirectory != null ? externalStorageDirectory.toString() : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m962(String str) {
        String strM961 = m961();
        if (!str.contains(strM961)) {
            StringBuilder sbM1039 = C0167c4.m1039(strM961);
            sbM1039.append(str.indexOf("/") == 0 ? "" : "/");
            sbM1039.append(str);
            str = sbM1039.toString();
        }
        File file = new File(str);
        if (str.lastIndexOf(".") > str.lastIndexOf("/")) {
            file = new File(file.getParent());
        }
        if (file.exists()) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        String strM9612 = m961();
        String[] strArrSplit = absolutePath.replace(strM9612, "").split("/");
        StringBuilder sb = new StringBuilder(strM9612);
        for (String str2 : strArrSplit) {
            if (!"".equals(str2) && !str2.equals(strM9612)) {
                sb.append("/");
                sb.append(str2);
                File file2 = new File(sb.toString());
                if (!file2.exists() && !file2.mkdirs()) {
                    return;
                }
            }
        }
    }
}
