package p001;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Environment;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001.AbstractC0356q;

/* JADX INFO: renamed from: ۟.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0436w1 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1166 = "jpg";

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f1167 = "";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f1837 = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static final String m952(String str) {
        if (C0237h4.m864(str, f1166)) {
            if (f1167.length() == 0) {
                f1167 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/xhs/";
            }
            return f1167;
        }
        if (f1837.length() == 0) {
            f1837 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/xhs/video/";
        }
        return f1837;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m953(String str, List list) {
        C0237h4.m1090("urlList", list);
        C0237h4.m1090("extName", str);
        C0302m.f951.getClass();
        String str2 = C0302m.f1694;
        C0325n8.f994.getClass();
        if (C0237h4.m864(str2, C0325n8.m904())) {
            if (C0377r7.m929(Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.WRITE_EXTERNAL_STORAGE")) {
                C0286kb c0286kb = AbstractC0356q.f1031;
                AbstractC0356q.c.m921().post(new RunnableC0258ib(str, list, 8));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m1262(String str, List list) {
        List arrayList;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() <= 1) {
            int size = list.size();
            arrayList = size != 0 ? size != 1 ? new ArrayList(list) : C0272jb.m1105(list.get(0)) : C0179d2.f753;
        } else {
            arrayList = new ArrayList(list);
            Collections.reverse(arrayList);
        }
        C0325n8 c0325n8 = C0325n8.f994;
        C0397t1 c0397t1 = new C0397t1(str, arrayList);
        c0325n8.getClass();
        "callback";
        if (C0292l3.m892()) {
            AlertDialogC0478z4 alertDialogC0478z4 = new AlertDialogC0478z4(C0292l3.m893());
            int iM1038 = (int) C0167c4.m1038(1, 120.0f);
            int iM10382 = (int) C0167c4.m1038(1, 120.0f);
            alertDialogC0478z4.f1890 = iM1038;
            alertDialogC0478z4.f1891 = iM10382;
            alertDialogC0478z4.show();
            alertDialogC0478z4.setCanceledOnTouchOutside(true);
            alertDialogC0478z4.setCancelable(true);
            alertDialogC0478z4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ۟.m8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    String str2 = "ۚۗۧۨ۬۟ۘۛۢۚۥۨۜۥۦۘۚۜ۬ۧۡۖۘۛۤۘۘۢۨۚۗۘ۬ۚۛۥۥۥۡۖۦ۟ۖۛۡۘۙۗۨۘۜۖۧۘۗۚۗۖۖۡۘۘۙۧۚۖۦۘ۫ۤۥۘۘۛۖۙۚۡۤۘۖۘۨۡۦۘۗ۠ۡۘۤۤۨۘ";
                    while (true) {
                        switch ((((((((str2.hashCode() ^ 49) ^ 982) ^ 961) ^ 813) ^ 252) ^ 122) ^ 975) ^ (-1133625916)) {
                            case -2045323690:
                                str2 = "ۥۗۦ۟ۜۦۘ۟ۗۖۢۚۘۘۗۜ۬ۨۤ۬ۧۢۦۢۤۖۘۛ۟ۗۧۖۦۘۗ۠ۡ۫۠ۙۥ۠ۘۛ۫ۦۘۖۤۨۘ";
                                break;
                            case -412636906:
                                C0415u6.f1138 = true;
                                str2 = "ۙۡۘۘۦۨۘ۫ۧۡۙۦۥۖۙۤ۠ۛۥۘ۟ۚۨۘۥۙۥۙۚ۠ۢۛۡۘۥ۠ۧۨۜۘۘۘۡۦۗۦۚۥۡۘۖۢۜۘۥۢۖۚۚۛۢۨۘۘۡۦۘۢۘۥۘۡۙۙ۫ۦۚۘۧۥۚۨۘ۫۠ۡۘ۠ۙۥۘ";
                                break;
                            case 12257687:
                                return;
                            case 1351830200:
                                str2 = "۟ۚۢۡۚۘ۟ۜۡۘۚۚۚۜۗ۫ۧۨ۫ۥۡۦۥۖۖۘۨۦ۬ۡۜ۫ۧۢۖۦۢۨۘ۟ۨۦۘۤ۠ۦۖۜۘۘۧ۟ۛۛ۠۬ۘۗۥۘۧۘ۬ۤۥۨۡۙۜ۟ۤۘۘۤۤ۫ۡۜۘ۠۟ۖۘۨۛۗ۟ۗۗ";
                                break;
                        }
                    }
                }
            });
            c0397t1.mo863((TextView) alertDialogC0478z4.f1904.m886(), alertDialogC0478z4);
        }
    }
}
