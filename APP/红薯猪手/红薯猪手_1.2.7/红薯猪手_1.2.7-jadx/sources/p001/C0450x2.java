package p001;

import android.os.Environment;
import java.io.File;

/* JADX INFO: renamed from: ۟.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0450x2 {
    /* JADX INFO: renamed from: ۥ */
    public static String m961() {
        File externalStorageDirectory = Environment.getExternalStorageState().equals(C0341oa.m915(new byte[]{101, 55, 66, 116, 23, 58, 108}, new byte[]{8, 88, 55, 26, 99, 95})) ? Environment.getExternalStorageDirectory() : null;
        return externalStorageDirectory != null ? externalStorageDirectory.toString() : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m962(String str) {
        String strM961 = m961();
        if (!str.contains(strM961)) {
            StringBuilder sbM1039 = C0167c4.m1039(strM961);
            sbM1039.append(str.indexOf(C0341oa.m915(new byte[]{-124}, new byte[]{-85, 96, -54, -110, 91, 4})) == 0 ? "" : C0341oa.m915(new byte[]{89}, new byte[]{118, 50, -20, -114, -66, 55}));
            sbM1039.append(str);
            str = sbM1039.toString();
        }
        File file = new File(str);
        if (str.lastIndexOf(C0341oa.m915(new byte[]{87}, new byte[]{121, -95, 0, -124, 108, -78})) > str.lastIndexOf(C0341oa.m915(new byte[]{-11}, new byte[]{-38, 112, -88, 57, 113, -31}))) {
            file = new File(file.getParent());
        }
        if (file.exists()) {
            return;
        }
        String absolutePath = file.getAbsolutePath();
        String strM9612 = m961();
        String[] strArrSplit = absolutePath.replace(strM9612, "").split(C0341oa.m915(new byte[]{89}, new byte[]{118, -58, 71, 50, -99, 65}));
        StringBuilder sb = new StringBuilder(strM9612);
        for (String str2 : strArrSplit) {
            if (!"".equals(str2) && !str2.equals(strM9612)) {
                sb.append(C0341oa.m915(new byte[]{-9}, new byte[]{-40, -108, 37, -99, -64, 34}));
                sb.append(str2);
                File file2 = new File(sb.toString());
                if (!file2.exists() && !file2.mkdirs()) {
                    return;
                }
            }
        }
    }
}
