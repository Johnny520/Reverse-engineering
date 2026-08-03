package p001;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ۟.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0356q extends AbstractC0149b0 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C0286kb f1031;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C0286kb f1754;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static Stack<Activity> f1755;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final ArrayList f1756;

    /* JADX INFO: renamed from: ۟.q$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<Handler> {

        /* JADX INFO: renamed from: ۥ */
        public static final a f1032;

        static {
            String str = "ۧۦ۠۠ۨۛۦۧۦۙۛۦۨۨ۟ۜۘۨۡۖۛۘۢۛۤۦۘ۬ۨۡۜ۫ۚۡۡۡۘۢ۫ۨۘۥ۬ۦۙۤ۬ۜۧۖۘۗ۟ۦ۬ۘ۬";
            while (true) {
                switch ((((((((str.hashCode() ^ 749) ^ 78) ^ 250) ^ 496) ^ 914) ^ 1011) ^ 191) ^ 1381763402) {
                    case -694730246:
                        return;
                    case 1973971273:
                        f1032 = new a();
                        str = "ۖۡۤۥۙۨۘۖۛ۟ۜۤۢۤۨۦۢۦۚ۫ۖۤ۬ۨۚۚۖ۫ۢۘۘۤۨۜۙۛ۬ۨۘۨۘۡ۬۬ۢۧۨۗۙ۬ۦۜۥۦۖۧۡۖۜۢ۫۟ۚۢۜۘۘ۬ۥۧۧۥۘۙۙۗۦۙ۫ۢۢۚۡۛۨۘ";
                        break;
                }
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Handler mo7() {
            String str = "ۛۨ۬ۦۗۚۧۢۦۙۧۖۢۥۘۦۤۗۜۗۧۚۧۥۘۦۤۥ۠ۥۚۧۛۜۘۧ۠ۘۨۢۖۘۦ۠ۥۘ۬۟ۚۢۙۧۥۖۘ۠ۧۥ";
            while (true) {
                switch ((((((((str.hashCode() ^ 311) ^ 838) ^ 524) ^ 68) ^ 83) ^ 410) ^ 807) ^ (-134863775)) {
                    case -1956196750:
                        return new Handler(Looper.getMainLooper());
                    case 934396223:
                        str = "ۙۖۧ۫۟ۨۧۥۛۤ۬ۖۘ۫ۛۡ۠ۢۘ۠ۥ۠ۡۤۛۜۧۨۘۥ۫ۡۖۧۥۘۜۡۚۡۗۖۘۘۛۢ۟ۨۤ";
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟.q$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0208f3<ExecutorService> {

        /* JADX INFO: renamed from: ۥ */
        public static final b f1033;

        static {
            String str = "ۨ۟ۥۤۥۚۗۘۙۜۢ۟ۜ۫ۦ۫ۦۥۧۤۦۜۘۧۤۙۚۘۦۘ۬ۨۘۘۦۛۧۨۦۜۧۘۧۘ۬ۤۨۘ۟ۘۧۚ۠ۘۘۦۗۥۢۙۜۤۖۨۘۘۙۡۘۗۥۙۜۢۘۦۨۛۡ۟ۘۘ۫ۘۡ۠۟ۚ";
            while (true) {
                switch ((((((((str.hashCode() ^ 543) ^ 593) ^ 227) ^ 709) ^ 157) ^ 630) ^ 227) ^ (-545661958)) {
                    case -1486668925:
                        return;
                    case 1830537258:
                        f1033 = new b();
                        str = "ۢۨۨۘ۠ۛۙۧۙۖۘۡۡۛۚۥۖۘۖ۬ۖۘۨۚۦۘۦۤۨۘۛۧۗ۫ۜۥۘۚ۠ۦۘۦۛۢۢۤ۟ۙۧۦ۠۠ۧۧۙۤۗۙ۫ۢۖۘ۟ۘۡۦۚۧۚۜۘۘۙۗۙۗ۠ۦۘۥۘۘ";
                        break;
                }
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final ExecutorService mo7() {
            String str = "ۖۘ۬ۙۡۧۘۨۤۛۡۖۡۘۖ۫۫ۢۨۨۘ۟ۗۧۗۦۧۨ۟ۡۦ۠ۛۙۙۥ۬ۥۛۙ۟۫ۛ۫ۘ۠ۦۜ۫ۤ۟ۨۧۧۤۛۘ۠ۢۡۚۚۡۜۥۘۘۚ۫ۦ۟ۛۡۖۗۖ";
            while (true) {
                switch ((((((((str.hashCode() ^ 598) ^ 481) ^ 181) ^ 406) ^ 735) ^ 103) ^ 931) ^ (-7284004)) {
                    case -112384546:
                        str = "ۗۧۘۘۡۢۤۜۖۖۘۙۗۘۜۗ۫ۦۚۖۡۚ۠ۜۥ۫ۚۧۤ۬۫ۥ۫ۛۥۥۧۘۧۘۙۗۙۖۖۛۨ";
                        break;
                    case 1424018780:
                        return Executors.newCachedThreadPool();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟.q$c */
    public static final class c {
        /* JADX INFO: renamed from: ۥ */
        public static Stack m920() {
            while (true) {
                switch (((((((("۟۫ۙۦۛۜ۟ۧۨۘۛ۠ۦۧ۬ۛۗۨ۫ۢۦۦۦۦۙۧ۬ۡۘۖۨۢ۠ۛ۫ۥۨ۟ۙ۟ۢۖۜۘۙۖۥۦ۠ۗۚۤۛۧۥۘۖ۬۠ۜ۟ۖۘۘۢۡ".hashCode() ^ 789) ^ 370) ^ 466) ^ 383) ^ 456) ^ 702) ^ 576) ^ (-802586240)) {
                    case -669999890:
                        return AbstractC0356q.f1755;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static Handler m921() {
            while (true) {
                switch (((((((("ۛۥۖۘ۫ۦۢۤۦ۠ۜۨۖۘۡۛۜ۫۟ۗۜۧۘۘۚ۠ۡۧ۠ۥۘۤۜۡۘۤۤۚۙ۟ۦۨ۫ۗۖۖۜۘۤۦ۬ۜۦۨۧ۟ۘۡۥۡۘۤ۟ۙۢۚ۬ۦۘۘۤۘ۟ۢۨۖۘۢۖۢ".hashCode() ^ 782) ^ 48) ^ 216) ^ 900) ^ 640) ^ 384) ^ 33) ^ 1045878232) {
                    case 1242154222:
                        return (Handler) AbstractC0356q.f1031.m886();
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static ExecutorService m1191() {
            Object objM886 = null;
            String str = "ۚۗۢۦۜۚۥۧۚ۠ۥۘ۠ۨۥۧ۟ۜۛۡ۟ۜۜۘۧۧۚۡۧۜۘۜۙۦۘۜۚۜۘۘۛۦۘۘ۬ۖۥۧۨۘۛۙۜۛ۟ۦۘۜۨۧۘ۟۫ۡۘ۬ۗۦۘۛۜۨۨۘۖۛۗۖۢۗۘ";
            while (true) {
                switch ((((((((str.hashCode() ^ 638) ^ 374) ^ 227) ^ 813) ^ 40) ^ 477) ^ 84) ^ (-1888207802)) {
                    case -1324333221:
                        C0237h4.m1089("getValue(...)", objM886);
                        str = "ۛۜ۟ۗۛ۠۬ۨۗۦ۠۟۟ۡۚۢۨۡۛۤۜۡۙ۟ۗۥۘ۠ۢۥۘۧۨۢ۟ۛۥۚۨۤۥۤۛۘۜ۫ۦۘ۠ۤۛۖۘۛۜۛ۬ۛۙۙۖۨۘۧۦۡ۬ۨۖۧ۠ۜۤۧۧ۟ۜۦۘۛۚ۬";
                        break;
                    case 379140478:
                        objM886 = AbstractC0356q.f1754.m886();
                        str = "ۗۢۦۘۡۨۘۦ۟۠ۧۜۢۥۜۙۡۛۤۘۚۖۘۛۖۡ۬۬ۚۦۙ۟ۘۚۤ۬ۧ۬ۛۤۖۘۤۙ۬۫ۖۦۘۤۡۗۗۧۤ۫ۚۖۘۦۚۘۘۥۨۨۡ۫ۗۘۘۘ۫۬ۗۨۚۙ";
                        break;
                    case 1843421723:
                        return (ExecutorService) objM886;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public static String m1192(Application application) {
            int iMyPid = 0;
            String str = "ۗۛۥۘ۫ۨۨۘۥۚۜ۟ۚۙۜۖۘۦۦۨ۫ۧۥۘۜۗۤۚۘۗۡۦۙۖۖۛۡ۟ۖۘۖۧ۠ۦۢۥۘ۬ۡۜۘۦۦۤ۟۬۟ۙۧۗۥۧ۟ۦ۠ۤۘ۬ۖۘ";
            String str2 = null;
            ActivityManager.RunningAppProcessInfo next = null;
            Iterator<ActivityManager.RunningAppProcessInfo> it = null;
            Object systemService = null;
            while (true) {
                switch ((((((((str.hashCode() ^ 842) ^ 644) ^ 708) ^ 512) ^ 469) ^ 644) ^ 875) ^ 1432996094) {
                    case -1946535541:
                        "application";
                        str = "ۦۧۦ۬ۦۘۥۛۙۦۖۦۘۥ۬ۙۗۖ۠ۢۧۨۘۛۙۡۥۙۙۤۛۘۘۦۜ۬ۥ۫ۖۨۧۢۧ۬ۤۖۛۗ";
                        break;
                    case -1865347532:
                        str = "۫ۧۡۘۗۗۨۧ۠ۧ۟۟۠ۘۨۖۥۡۘۜۚۖۘۛۥۜۘۛ۬۠۫ۢۦۘ۠ۘۘۦۜۡۨۖۜۜ۬ۢ۫۟ۚ۟ۚۘۘۛۗ۬ۡۦ۬ۤۛۡۚۨ۟ۡۥۜۘ۟ۧۨۤۙۘۘۛۛۦۘۗۡۥۦۦ۬ۦ۟ۛ";
                        break;
                    case -1860302585:
                        return "";
                    case -1832767071:
                        str = "ۢۥۖۦۧۖۘۛۘۡۥۤۥۘ۠ۢۡۢۘۘۜۡۘۨۡۧۡ۬ۨۘۗۧۖۘۛۧۨۗۛۦۙ۠ۗۤۥۘ۬ۚ۠";
                        it = ((ActivityManager) systemService).getRunningAppProcesses().iterator();
                        break;
                    case -1197383981:
                        C0237h4.m1089("processName", str2);
                        str = "ۦۛ۠۬ۚۘۥۥۥ۬۬ۥۘ۫ۜۦۖ۫ۢۢۦۘۘۖۜۧۘ۬ۖۤۚ۠ۨ۠۫ۥۘۧۦۨۖۙۖ۟۟ۧۥ۠ۖۘ۬ۗۦۘ۬ۡ۫۠ۨۚۚۥۘۘۦۧۡۥۛۖۜ۬ۜ۬ۙۢۜۧۘۦۜۘۘۡۦۗۢۛ";
                        break;
                    case -931030037:
                        C0237h4.m1088("null cannot be cast to non-null type android.app.ActivityManager", systemService);
                        str = "ۙۤۨۜۗۨۦۨۘۘ۬ۥ۬ۘ۟ۛۖ۫ۦۜۦ۫ۛ۠ۧۗ۬۠ۦۙ۫ۖۜۘۦ۬ۙۖۢۖۡۛۨۘۗۖۚ۟ۧ۠ۢ۬ۦۘۚۖۥۘ";
                        break;
                    case -887205891:
                        str = "ۛۘ۬ۨۚۜۘۡۨۖ۫ۘۡۜۥۜۥۨۗ۬ۡۘۥۛۗۧۙ۟ۨ۟ۥ۬ۢۙۘۦ۬۫ۡۘۤۜۥۤۙ۬۫ۘۘۤۜۜۙ۟ۥۛۦۘۛ۟ۚۡۙۨۘۙ۟ۡۡۙۥ";
                        iMyPid = Process.myPid();
                        break;
                    case -848945676:
                        systemService = application.getSystemService("activity");
                        str = "۟۫ۦۙۖۡۘ۟ۜۧۘۚۡۖۘۛۦۗۤۜۦۘۥۦۤ۬ۖۙۜۜۥۘۡۛۙۜۨ۫ۙ۠ۚ۫ۦۛۥۛۛۧۦۖۘۤۘۧۘ۟ۧۢۡۜۙۢ۟ۢۦۖۚۡۛ۠ۢ۫ۨۘۢۡۜۘ۟ۙۢ";
                        break;
                    case -412896909:
                        return str2;
                    case -105582704:
                        str2 = next.processName;
                        str = "ۧۗ۬ۛ۠ۘۨ۬ۙۙۘۢۧۚۨۢۖۧ۟ۛۤ۠ۦۨۡۛ۫ۢ۠ۗۖ۠ۜۧۘۙ۟ۨۜۢ۠ۨۖۢۡۢۙ۠ۢۚۤۡۘ";
                        break;
                    case 272361588:
                        String str3 = "ۤۙۜ۠ۜۖۘۨ۫ۡۘ۬ۛۡۘۥ۟ۘۘۖۢ۠ۧ۬ۢ۫۟۟۫۠ۘۦۥۡۛۧۖۧۘ۬۫ۜ۠ۢۧ۫";
                        while (true) {
                            switch (str3.hashCode() ^ (-697682028)) {
                                case -2015142451:
                                    str = "۠ۛۡۘۖۜۧۜۢ۠۫ۤۙۚۘ۫ۥۗ۫ۤ۫ۢۥۙۨۢۛۛۥۨۖۘۗۛۚۜۘۨۘۧۛۖۘ۟۬ۢۜۘۗ۠ۤ۠ۦۜۘۡۧ۟ۨ۠ۘۥۢۦۘۖۥۚ";
                                    continue;
                                case -1358452385:
                                    str3 = "ۖۛ۠ۦۖۖۘۡۡۢۧۖۥ۬ۛۘۘ۠ۨۜۘۜ۟ۥ۫۟ۨ۟ۚۙۨ۬ۜۦۦۡ۟ۨۜۘ۫ۢۙۡۤۦ۠۠ۜ۟ۨ۫ۛۛۖۘۤۛۜ۫ۖۜۘ۫ۖۤۗۖۛ۟ۘۜۖ۬ۨۘۥ۟ۦ۫۬ۢۛ۟ۛ";
                                    break;
                                case 17012598:
                                    str = "ۘۧۡۘ۫۟ۡۘ۟۠ۘۜۛۙۨ۟ۡۘۛ۠ۖۘۥ۫۬ۥۢۘۘۡۙۤۙۗۦ۟۬ۡۥۥۘۘۙۥۘۥۤۥۗ۟۟۫ۢۘۘ۫ۨۥۘۢ۠ۖۡۚ۠ۘۥۘۛ۬ۦۘۜۖۨۘۜۚۨۘۗۘۛ";
                                    continue;
                                case 214943902:
                                    String str4 = "ۥۡۜۗۦۛۢۤۗۗۗۗ۟ۘۡۘۖۧۤۖۨۦۢۦۛۖۜۜۘۙ۬ۜۘ۠ۚ۠ۥ۠ۡۘۛۘ۬ۦۤ۟ۨۨۚۢ۠ۙۨۛۚۜۤۛۜۜۧ۫ۙۦ۟۟ۦ";
                                    while (true) {
                                        switch (str4.hashCode() ^ (-817084800)) {
                                            case -1208707062:
                                                str3 = "۟ۙۦۘ۟ۨۧۘۧۥۡۘۧۧۡۘۖۧۡۗۥۙۚ۫۬۠ۢۧۥۥ۟ۗۡۘۛۜۧۧۧۨۘ۬ۖۤۙۚۢ۫ۢۧۧۤۖۘۜۨ۬ۤۡۨ۟ۨۢ۠ۨۛۛۥۢۘۜۘ۬۬ۘۘۨۚۖ";
                                                break;
                                            case 721767632:
                                                str3 = "۫ۗۦۘۜ۠ۖ۬ۥۧ۟ۨۡۘۧۡۘۚۜۜۘۜ۠ۦۛۥۘۥۘ۫ۜ۬ۖۘۘۦۡۨ۫ۤۥۜۘۛ۟ۜۘۚۤۤۜۛ۬ۜۧۛ۟۟ۜۘ۟ۦ۫۟ۥۧۥۚۤۨ۠ۖۤۚ۫ۖۘ۫";
                                                break;
                                            case 926649329:
                                                str4 = "۫ۗۗۜ۠ۤۗۗۨۘۚۥۚۤۧۡۡۡۡۧۧۧ۠ۛۗۛۙۖۘۗۛۨۤۥ۟ۦۤۚۡۡۧۥۛ۫ۚۧۦۖ۟ۚۢ۠ۨۘۜۤۤ۬ۥۥۜۜۗۙۥۨۘ۠ۜۜۘۖۗۡۘ۟ۖ۠";
                                                break;
                                            case 1067370567:
                                                String str5 = "ۘۢۨ۬ۖۘۘۜۦ۟ۙ۠ۜۘۚۛۜۘۥ۬ۖۘۨ۫ۙ۫ۖۧۡۤۘۘۚۙۘ۟۫ۖ۟ۡۥۘۥ۟۫ۙۖۨۘ۟۟ۚ";
                                                while (true) {
                                                    switch (str5.hashCode() ^ 2080076057) {
                                                        case -1990218860:
                                                            str4 = "ۜۚۚۜ۫ۨۜۘۥۜ۫ۖۤۙۖۘۨۗۧۘۥ۟ۢ۠ۡ۠ۧ۟ۡۢۘۘۗۨۨۘۦ۠ۢۡۜ۬ۛۘۧۘ۟ۧۘۘۡۛۧۢۦۡۦۜۘ";
                                                            break;
                                                        case -755936727:
                                                            str5 = "۫۬ۖۘۢۦۢۜۙۨۛۘۖۘۚۛۖۥۢۡۘ۟ۤۖۘۗۙۧۛۜۚۡۢ۠ۜ۠ۛ۫ۤۦ۬ۨۗۦۚۗ۫ۗۡ۠ۜۘ۬ۧۨۘ۫ۧۖۦۜۜۘۚۦۘۘۡ۬۟ۛۙۥۘۡۨۨۘ۟ۢۖۘ";
                                                            break;
                                                        case 1102423224:
                                                            str5 = it.hasNext() ? "ۙ۫ۥۢۘۨۘۙۘۡۘۡۜۢ۟۟ۨۘۥۜۘ۬ۘۘۥۚۚ۬ۢۗۜۖۙ۬ۨۘ۟ۤۛۧۜۡۧۗۛۧۘۥۘۡ۬۠ۤۨۧۜ۟ۧۥۖ۟ۘۖۡۘۗۙۘۘۥ۠ۦۘۙۚۧۖۤۘ۠۟ۙۤۛۦۘۢۧ۫" : "۟ۜۥۦۤ۬ۘۙۘۘۜۦۧۨۢۙۧۡۗۨۚۧۤۧۡۘۡۘۘ۫ۚ۫ۢۦۗۘۡۘۥۘ۫ۜۥۧ۫ۦ۠";
                                                            break;
                                                        case 1426361306:
                                                            str4 = "ۖۥۜۧۡۛۤۥۥۧ۬ۦۢۥ۟ۡۛۨۤۨۘۦۡۨۘۧ۫ۥ۟ۥۗۡۤۦۥۥۡۘۜۗۖۘۗ۠۠ۗۡۦۘۦۡ۠۠ۡ۬ۥۘۨۘ";
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 689923781:
                        String str6 = "ۚۡ۫ۢۥۢۨۤۗۨ۟ۦۘۙ۬۟ۘۚۦۥۗۜۘ۠۫ۤۗۥ۠۬۬ۗ۬۬ۡۥۗۨ۟ۡۥۘۚۛۢۛۦۦۙ۠ۖۘۙۙۡۛۖۙ";
                        while (true) {
                            switch (str6.hashCode() ^ (-1096571575)) {
                                case -859589168:
                                    String str7 = "۫ۘۡ۠ۛۥۘۘ۠ۙ۟ۡۥۘۨۧ۬ۗۢۦۗۘۜۘۙۛ۬ۥۙۡۘۢ۠۠ۖۙۢۤۢۦۘ۠ۢۤۤۛۖۘ۟۠ۦۘ۬ۦۛۖۚۤۢۛ۠ۢ۫ۛۖۥۘۡۛ۬";
                                    while (true) {
                                        switch (str7.hashCode() ^ (-1121473748)) {
                                            case -893102206:
                                                String str8 = "ۜۙۘۚۛۥۚ۟ۢۘۡۘۘۡۧۡۘۗۛ۠ۖ۬۬ۡۗۢ۠ۗ۫۫ۢۘۚۙۗۤۘۥ۬ۢۥ۟ۧۘۢۥۘ";
                                                while (true) {
                                                    switch (str8.hashCode() ^ 729684875) {
                                                        case -1088401962:
                                                            str7 = "۫ۥۙ۬ۧۦۛۗۙ۫ۙۦۖۢۨۨ۫ۡۘ۟ۧۖۘۗ۟۬ۥۜۤۤۧۗۥۙ۬۬۫ۙۡ۬ۗۛۛۘۖۧۘۘ۟ۥۨۧۙۢ۬ۢۜۘۚۙ۟ۛۧۦ۟ۧۦۘۧۥۘۘ۫۠۫ۜۜۚۦۡۡۘۡ۬ۨۥ۬ۦ";
                                                            break;
                                                        case -614796570:
                                                            str7 = "ۗ۠۟ۤ۫ۖۘۦۚۥ۠ۛۖۤۥۡ۠۠ۘۛۗۢ۟ۙۙ۠ۘۨۢۚۖۦۨۘۖۖۘ۫ۙۡ۠ۤۘۛۧ۠ۚۖۚۛ۠ۛ۠ۘۘۤۤۡ۠ۤۨۦۧ۠۫۫ۦۖۖۤۡۗۤۖۧ۠ۡۘۧۘ۟ۚۗ";
                                                            break;
                                                        case 482422719:
                                                            str8 = "۬ۡۦ۫ۘۤۙۥۖۘۘ۟ۤۦۜۧۘ۠ۡۘۘۥ۫ۖۘۧۡۥۘۙۨۦۚۘۧۘۥۚۗۦ۟ۤۜۦۥۘۡۛۨۛ۬ۙۚ۠ۜۧۨۦۘۙ۫ۡۦۜۘ۬ۢۤ۟";
                                                            break;
                                                        case 716352637:
                                                            str8 = next.pid == iMyPid ? "ۙۡۚۡۨۘۘ۬ۖ۠۬ۥ۠ۖۨ۟ۦۚۤ۟ۛۨۘۨۗ۠ۥۦۜۛۤۗ۬ۤۘۡۧۥۘۜ۬ۛۘۚۥۘ۠ۘۙۤۥۦ۫ۘۨۘ۟ۙۥۘۘۧ۟۫ۢۢۜۧۚ" : "۠۠ۛۥۨۧ۬ۚۛۚ۬ۧۤۤ۫ۛ۫۬۠ۙۘۘۡۢۜۘۧ۠ۢ۫ۢۘۚۧ۬ۛ۟۬ۦۚ۟ۚۙۜ۫ۘۖۦۘۘۡۡۚۚۜ۬۬ۦۘۤۥۤ";
                                                            break;
                                                    }
                                                }
                                                break;
                                            case -414604361:
                                                str6 = "ۚ۟ۢۜۧۦۥۢۨۘ۠ۥۦۘۚۖۜۘۗ۬ۗ۟ۨ۬ۚۙۖۘۧۖۡۘۥۨۙۗۥۡۘۖۖۗۜۖۙۡۥۖۚۘ";
                                                break;
                                            case 1050727956:
                                                str7 = "ۡۘ۟ۙ۟۠۬ۛ۟ۧ۬ۢۙ۫ۥۘۗۢۦۘۢۢۖۨۨۖۛ۠۬ۙۢۘۚۧۛۚۢۡۦۘۥۘۜۗۦۦۘۨۚ۠ۙۗۡۧۜ۠ۛ";
                                                break;
                                            case 1821119973:
                                                str6 = "ۙ۟ۘۘۛۦۛۧ۫ۗۖ۫ۥۥ۫ۦۘ۠ۡۦۘۥۡۜۘۘۘۚ۠۫۫ۖۡۥۘ۟ۘ۠ۛۧۤۧ۟ۥۚۢۜۘۨۨۖۘۚۖ۫ۧۢۜۨۨۘۚۜۗۦۧۙۗۛ";
                                                break;
                                        }
                                    }
                                    break;
                                case -349977026:
                                    str = "ۚۤ۟ۖ۠ۘۘۘۨۜ۫۫۬ۡۙۘۘۡۨ۠ۤۥۡۘۦۛۡۙ۫۫۬۬ۧۘۧۗۜۜۗۜۧ۫ۚۚ۠۫ۙۨۚۥۘۙۧۖۘۙۜۘۘ۟ۙۜۨۢۦۘۘۗۨۘۥۡۥۘۚۦ۬ۤۗۚ";
                                    continue;
                                case -26696944:
                                    str6 = "ۙ۫ۥۘۚۗۜۙۦۛ۟۟ۦۘۡۡ۠ۦۜۚۤۘۤۘۖۘۛ۬ۗۗۙ۟ۥۡۜۡۙۛۢۖۦۢ۬ۧۗۢۥۘ";
                                    break;
                                case 2122991142:
                                    str = "ۢۥۖۦۧۖۘۛۘۡۥۤۥۘ۠ۢۡۢۘۘۜۡۘۨۡۧۡ۬ۨۘۗۧۖۘۛۧۨۗۛۦۙ۠ۗۤۥۘ۬ۚ۠";
                                    continue;
                            }
                        }
                        break;
                    case 824204272:
                        str = "ۢۗ۟ۥۚ۠۬۠ۙۜۦۘۡۗۖۤۨۦ۫۬ۤۗ۬ۖۘۡۜۚۤ۟ۘۘۥۨۧۤۜۡۙۙۡۘۛۛ۠ۤۢۨۗۥۘۘۦۘۚۦۜۨۘۛۨ۫ۦۘۖۘۘ۟ۖۖۘۖۚۚۖۚۙۛ۫۫ۨ۫۬ۚ۫";
                        next = it.next();
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public static boolean m1193(Application application) {
            String str = "ۦۨۜۘۜۖۡ۟ۢۖۘۡۥۚ۟۟ۘۚۨۦۘۜۧۡۨ۟ۘۘ۬ۦۗ۟ۡۥۦۨ۫۬۟ۧۢۦۖ۟ۖۜۘۡۖۨۘۨۖۦۥۚۖۢۛ۟۫ۖ۬ۥۗ۟ۦۙ۠ۛۘۧۜۘۢۙ۠";
            while (true) {
                switch ((((((((str.hashCode() ^ 425) ^ 852) ^ 587) ^ 181) ^ 844) ^ 609) ^ 697) ^ (-2096620013)) {
                    case -2106544281:
                        str = "ۨۛۡۖ۠ۖ۠ۙۘۘۛ۠۬ۨۧۧ۬ۜۡۘۚ۟۬ۧۢۨۘ۬۫۟۠ۗۡ۠ۦۘ۠۠ۘۘ۬۫ۧۥۢۨۘ۟۫ۛۛۘۨۘ۬ۗۡۨۤ";
                        break;
                    case -1655577582:
                        "application";
                        str = "ۚۢۘ۠ۜۡۡۢۦۘ۠ۘۨۘۘۛۙۚ۫ۢۚۨۙۡۜۘۧۥۥۘۛۥۡۘۦ۟۟ۜۘۖۘ۠۟ۡۘۧۥ۬ۜ۟ۚۙ۠ۢۗۧۦۘۧۢۗۛ۟۟ۖ۫ۖۚۡۡۙۛۛۖۚۦۧۤ۬";
                        break;
                    case 803422593:
                        return C0237h4.m864(application.getApplicationInfo().packageName, m1192(application));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟.q$d */
    public static final class d extends AbstractC0335o4 implements InterfaceC0208f3<Integer> {

        /* JADX INFO: renamed from: ۥ */
        public static final d f1034;

        static {
            String str = "ۚۡۦۘۡۖۥۘ۟ۢۥۢ۬ۦۖ۟ۜۘۛۥۘ۟۬ۛۘ۠۠۠۟ۜۥ۬۬ۗ۠ۗۦۘ۟ۤۘۚ۟ۙۚۗۥۘ";
            while (true) {
                switch ((((((((str.hashCode() ^ 694) ^ 616) ^ 743) ^ 809) ^ 267) ^ 348) ^ 27) ^ 962414720) {
                    case -391639827:
                        f1034 = new d();
                        str = "۟ۤ۟ۥۜ۬ۚۖۙۢۚ۫ۤۖۗۗۨۢۗ۟۟ۜ۫ۤ۫ۡۙۨۗۤۗۨۗۡۘۤ۬ۖۚۛ۠ۖ۫ۛ۫ۧۥۘۢ۬ۢ۬ۥ۫ۨ۬ۙ۬ۙۧ۠ۢۜۘۘۘۨۘۗۦۨۡۦۘۨۘۡۘۘ۫ۦ";
                        break;
                    case 582557197:
                        return;
                }
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Integer mo7() {
            String str = "ۦ۫ۧ۫ۨ۬ۢ۫ۜۘۗۚ۟۫ۢۡۢۚۛۢۦۨۘ۟ۧۘۨۨۥۜۛۘۙۡۘۚۡۡۘۤۦ۫۠ۢۖۜۛۡۘ";
            Context context = null;
            while (true) {
                switch ((((((((str.hashCode() ^ 331) ^ 653) ^ 311) ^ 8) ^ 668) ^ 445) ^ 14) ^ 1800796888) {
                    case -731588842:
                        return Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode);
                    case -257108963:
                        throw null;
                    case 5243243:
                        "context";
                        str = "ۚۖۘ۫ۖ۟ۡۨۧۘۡۨۚۦۢۗۘۚۧۜۨۜ۠ۨۥ۠ۥۧۜۙۨۘۡۜ۟ۗۜۤ۬۠ۛۢۤۙۙۨ۫ۗۗۤ۟ۖ۬۫ۨۧۘۢ۟ۨۘۡۙۗ۠ۡۦۜۢۜۘۗۤۜۘۛۚ";
                        break;
                    case 439169979:
                        int i = C0330o.f1000;
                        str = "۟ۛ۬ۤ۠ۛۗۚۜ۬ۖۛ۟ۗۦۘ۠ۡۥ۫ۨۙۢ۠ۢۚ۫ۡۘۚۢۜۘ۫ۖۥۘۢۤۖۧۨۙۢۘۦۘۚ۫۫ۤ۠ۖۘۤ۟۠ۡۡۧۖۦۨۘۦۖۖۡ۬ۘۘ۟۬۬۫ۘۘۚۨۖ";
                        break;
                    case 802720172:
                        str = "ۢۛۘۛۘ۟۫ۦۡۘۢ۟۬۠ۛۥ۠ۡۚۜۙۘۙۧ۬ۨۖ۫ۡۦۧۘۡۗۜۖ۫ۤۧۡۘۘ۠ۥۜۗۤۨۦ۬ۖ۟ۡۜۘۧۗ۟ۢۥ۬ۥۡۦۘۥۘۘۘۧ۬۠ۥۗۚۘ۟ۚۡۡۡ۠ۥۜۘۙۨۛ";
                        break;
                    case 1058586195:
                        String str2 = "ۖۙۥ۬ۢۤ۠۠۠ۥۚۥۢ۠ۡۖۡۤ۠۫ۥۘۚ۟ۜۘۜۤ۬ۤۥۖۘۧۚۥۘۤۦۥ۠ۙۨۘ۫ۨۙۗ۫ۙۘۤۙۘۗۥۧۗۡۘ۠ۤ۟ۗۢۧۘۜۗ۬ۘۘۘۤۘۧۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 624673676) {
                                case -1449778833:
                                    str = "ۜۜۖۥۚۡۚۘۜۘۛۜۦۘۦۤۦۘۡۛۚۘۛ۫ۙۖۙۖۤۙۥ۫ۦۘۦ۫ۦۘۜۗۡۘۛۦۥۖۡ۠ۙۚۚۡۜۦ۬ۨۘۙۗۨۘۤ۬ۨۦۖۡ۠ۥۨۦۥۨۡۧۧۦۤۛ";
                                    continue;
                                case -1245834135:
                                    str2 = "۬ۥۖۖۦۚۗۙۧۖۢۦۤۦۡۘۦ۬ۙۨۢۗۜۤۥۘۧۖۤۢۧۤ۟ۨۘۛۥۦۛۥۦۡۙ۬۬ۙۘۚۡۡۡۗ۠ۜۘۘۨ۫ۨۘۦۦۗۨ۠۫۫ۧۧۢۘۡۛ۠ۥۘۜۦ۬ۢۧ۠ۤۗۦ";
                                    break;
                                case -571410906:
                                    String str3 = "۠ۗۤ۬ۤۥۘۧ۫ۚۛۨۦۘۢۙ۫۠ۤۨۧۜۨۘۛۖۙۘۘۡ۫ۧۜۦ۬ۚۨۗۖۘۖ۟ۧۖۥۜۘۢ۟ۛ۠ۙۨ۬۬ۦۘۥۛۦۘ";
                                    while (true) {
                                        switch (str3.hashCode() ^ 1148320964) {
                                            case -101585713:
                                                str3 = "ۥۙۡۛۨۜۨ۫۠ۤۥۥ۬ۦۙۘۛۨۘۤۙۦۘۧۚۨۘۚ۠ۦۘۦۤۚ۫ۤ۟ۚۘۜۧۛ۬ۖۘۘۤۙۛۙۨۚۖ۟ۙۛۦۘۚۛۖۘۖۢۛۤۙۡۘ";
                                                break;
                                            case 112814270:
                                                String str4 = "۟ۛۖ۫ۦۗۚۡۜۘۢۗۦۨ۫ۦۘۦۦۢۛۡۢۙ۠ۘۘۘۦۚ۬ۖۦۥ۫ۘۛۡۨۘۚۛ۫ۗۧۨۘۡ۟ۢ";
                                                while (true) {
                                                    switch (str4.hashCode() ^ (-1199829520)) {
                                                        case -1749312850:
                                                            str4 = "ۙۤۘۘۧ۟ۛۖ۠ۙۙ۬۠ۦۗۧۥۨ۫ۢۙ۠۟ۛۦۢۨۨۙۖۤ۠ۜۡۘۨۗ۟۫ۜۢۛۚۡۧۙۥۗۛۥ۫ۘۖۤ۫";
                                                            break;
                                                        case -948989070:
                                                            str3 = "ۚۥ۫ۢۙۡۤۧۘۤۢۡۥۘۥۘ۟ۙۗۨۖۜۗۨۦۘۚ۟ۙۛۜۜۨۢۤۖۡۗۤۤۛۜۗۖۘ۠ۥۦۛۤ۫ۦۥۚۘۧۛۗۥۘۖۗۨۘۗۛ۬۬۟ۤ۫ۦۘۙۥ۟";
                                                            break;
                                                        case 46923904:
                                                            str4 = context != null ? "ۘۦۤۙۥۧۘۘۡۢۧ۠۫ۖۦۘۤۚۘۢ۠ۙۤۙۦۖۧۡۜۡۧۘ۟ۚۡۥ۫ۖۘۦۘۖۘۙۗۦۚۡۖ۫ۥۘۘۖۖۘۤۤۨۨۨۧ۠ۥۛۤۢۥۡ۫ۨۥۦۘۡۛ۠" : "ۨ۠۫ۜۙۖۘۧۧۘۘۘۘۛۤۜۨ۠ۨۗۦۜ۬ۖۨۖۘۢۤ۫۫ۦۦۖ۠ۧۘۛ۠ۙۙۨۘۚۥۡۘۢ۬ۗ۫ۨۙۚ۫ۜۢۛۨ۠ۢۧۛۚۥۡۥۦۘ۠ۛۡۘۨ۠ۥۘۢۨۥ";
                                                            break;
                                                        case 1158510194:
                                                            str3 = "ۡ۠ۡۘۛ۫ۨۘ۠ۚۜۘۙۢ۟ۨ۠ۧۦۤۙ۟ۧ۟ۥ۠ۥۛۜۖۢۢۛۥۦ۟ۢۖۤۖ۫ۗۥۨۘۧ۬ۧ";
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 696242186:
                                                str2 = "ۧۜۗۘۖۧۘۗۦۜۥۗۢۡۡۡۗۢۢ۟ۛۘۘۚۤۧۢ۟ۦۘۛۗ۟ۙ۟ۢۢ۟ۡۛۤۦۘۨۤۥۘۨۘۜۘ";
                                                break;
                                            case 908910539:
                                                str2 = "۟۫ۘۘ۠ۘۦۤ۬ۤۛۡۥۢ۟ۘۢۡۨۦۡۚۤۚ۫ۢۨۡۧۘ۟ۧۜۡ۫ۥۘۛۦۦۘ۬ۗۤۖۥۥۙ۬ۢۡۦۥۖۥۖۘۤۘ۟ۙۙ۫ۧۚۢ";
                                                break;
                                        }
                                    }
                                    break;
                                case 46546295:
                                    str = "ۢۥۥ۫۟ۥ۟۬ۚۜ۟ۘ۟ۗۦ۟ۜۖۘۡۘۤۘۛۦ۫۠ۦ۠ۨۤ۠ۖۜۘۘ۫ۦۘ۟ۤۗ۠ۥۧۗۗۥ";
                                    continue;
                            }
                        }
                        break;
                    case 1585904730:
                        context = C0292l3.f937;
                        str = "ۚۚۢۖۙۥۘ۟ۘ۬ۗۧۚۙۙ۠۬ۤۧۜۥۡۘۜ۬ۦۛ۠ۤۘ۠۬ۖۙۗۢۧۙۧ۬ۗۖۧۘۨۧ۠ۨۤۗۙۤ۠ۤۖۛۗۚۡۨۥۗ۟ۜۗۨ۠ۦۛۖۘۥۥۨۘ";
                        break;
                    case 1781857577:
                        C0237h4.m1092("context");
                        str = "ۤ۟ۥۘ۫ۗۛ۬ۙ۬۬۟ۖۘ۬ۥۢۛۤۧ۬ۡۖۘۦۗۥۘۡۘۤۜ۠ۨۘۢۤۨۥۥ۠ۚۡۛ۟۬۟ۧ۠ۢ";
                        break;
                }
            }
        }
    }

    static {
        String str = "ۛۧۖۧۡۨۘ۟ۜ۠ۥ۬ۖۘۜۜۘۘۡۛۘ۠ۤ۟ۦۙ۟ۡۘۛۚۛۚ۟۠ۛۖ۬ۥۖۛۤۢۥۘۡۢۡۤۥۗ۬ۧۨۘۡۗ";
        while (true) {
            switch ((((((((str.hashCode() ^ 208) ^ 924) ^ 675) ^ 138) ^ 745) ^ 112) ^ 240) ^ (-780314849)) {
                case -844825459:
                    f1755 = new Stack<>();
                    str = "۠۬۫ۧۨۨۢۧ۬ۗۙۜۚۤۡ۬ۧۘۘۢۘۘ۟ۥۜ۬۫ۡۚۥۢۗۨۘۙ۫ۥۥۦ۬ۨ۫ۨۜ۟ۤۖۡۤۦۜۦۖ۫ۦۘۙ۟ۡۘۘۖۡۘۨۡۚۤۚۥۘۥ۟ۢ۫ۘ۠ۢ۬ۧۦۨۘ۫ۡۘۘ";
                    break;
                case -714115071:
                    f1754 = new C0286kb(b.f1033);
                    str = "۫۫ۡۘۛۚۘۘۖۙ۟۟ۛ۟ۖۦۖۡۙۛۡۖۘۦۨۙۡۥۥۗۨۧۜۛۚۤۚۡۘۦۧۗۦۦۥۘۛۥ۬";
                    break;
                case -51790902:
                    f1756 = new ArrayList();
                    str = "ۙۡۡۘۡۗ۫ۗۧۧۗ۫ۥۘ۟۫ۢۘۖۜۖۜۖۘۛۚۤۘۛۛۡۤۘۦۢ۠۫ۧۦۘۥۨ۟ۜ۫۬ۜۛۨۘ";
                    break;
                case 1345766891:
                    return;
                case 1832603581:
                    f1031 = new C0286kb(a.f1032);
                    str = "ۘۜۤۙۚۦۘۢۤۜۘ۫ۥ۫ۚۖۡۗ۠ۗۜۚۡۜۗۖۘۙۙ۫ۥۡۗۚۛۗۗۚۥۥۡ۫۠ۧۨۜۧۥۘۗۧۘ۬ۢۡۖ۟ۡ";
                    break;
            }
        }
    }

    public AbstractC0356q() {
        new C0286kb(d.f1034);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m1189(Application application, String str) {
        String str2 = "ۥۜۦۘ۠ۡۨۢۧۦۖۥ۠ۤۖۗۡۧۘۖۗۧۦۡۘۘۧۨۢۖۚۦۘۤۧۜۘۘۚ۠ۤۧۡۘۙۦ۠ۙۤۥۘۜ۠ۤۥۚۘۘۢۦۡۘۧ۬ۜۘۦۘۥۗۥ";
        Iterator it = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            switch ((((((((str2.hashCode() ^ 326) ^ 525) ^ 483) ^ 415) ^ 599) ^ 177) ^ 751) ^ 954750950) {
                case -2018436182:
                    arrayList2.clear();
                    str2 = "ۢۥۡۖۗۖۘۤۨ۬ۥۜۨۘۦۤۛۛۙۗۛۢ۬ۤ۬ۖۤۦۦۘ۟ۚۦۖۘۧ۬ۡۘ۟ۧۨۘۧ۟ۘۛۡۘ";
                    break;
                case -1680044178:
                    it = arrayList2.iterator();
                    str2 = "ۛۤۢۗ۟ۡۘ۫۠ۛۚ۠ۛ۟۠ۛۢۚۨ۫۫ۜۘۧۥۗ۟ۙۖۜۚۡۘ۠ۦۙۥۨۖۘۡۡۦۜۦ۟ۦۤ۟ۢ۬ۖۘ۬ۛۖۘۛ۟۫ۙۧۖۘۘۢۜۘ۬ۗۚۗۢ۬ۘۡۦۢۖۜ";
                    break;
                case -1667353119:
                    str2 = "ۙۥۙۧۨۥۨۡۛ۟ۤ۟ۢۘۚ۫۟ۨۘ۫ۙۚۛۢۜۘ۟ۨۘۡۛۨۘ۠ۙ۬ۦۜۖۘ۟ۧ۠ۙۙۘۘۡ۫۠ۦ۠ۧۖۧ۫ۢ۠۫";
                    break;
                case -1615119157:
                    arrayList.add(new C0210f5());
                    str2 = "۠ۡۨۚۗۙۧۜۜۗ۫ۘۨۙۘ۟۟ۚۗۥۢۜۖۛ۠۟ۡۘۙۜۗۨۜۖ۟۬ۥۡ۟ۥۘۛۤۛۢۘۥ۟ۢۙۨۘۥ۫ۧۛۢۦۗ۫ۗ۟ۦ۠ۙ";
                    break;
                case -1610738112:
                    arrayList.add(new C0475z1());
                    str2 = "ۢۧۜۘ۠ۤۦۘۡ۬ۛ۠ۦۦۗۚۖۢۘۛۖۙۖۘۘۜ۟ۦۡۦۥۚۖۘ۟ۨ۟ۛۧۨۘۙۘۧ۟ۙۛۧۤ۟ۦۤۖۗۜۘۗۘۥۦۡ۠ۡۦۘۥۧۜ۟ۜۢۛۛۖۘ۫ۘۛ";
                    break;
                case -1559759074:
                    arrayList.add(new C0400t4());
                    str2 = "ۛ۟ۖۡۡ۟ۙۨۥ۟ۥۖۘۦۦۖ۟ۚۢۧۨۛ۬۟ۖۘۡ۬ۧۖۚۖۙۨۘۤۙۥۘۡۗۡۘۖۘ۠ۡ۠ۤۥ۟ۙۛۛ۬ۡ۟ۚۚۤۗ۫ۧۨ۫ۨۢ۬ۜۘۘۥ۟ۤۖۥۖۙۤۘۘۢۘۦ۬ۤۜ";
                    break;
                case -1333880009:
                    ((InterfaceC0139a4) it.next()).mo802(str);
                    str2 = "ۤۨ۠۫ۦۧۧۤۘۘۜۨۘۘۡۛۢۤۨۖ۬ۜۨۘۦۘۖۨۤۥۗۦۜۘۘ۟ۖۘۢ۬ۦۘۤۖ۬۠ۖۧ۟ۘۘۤۛۖۘ۬ۧ۬ۜۚۥۜ۫۠ۗۖۦۘ۟۬ۢۘۡۛۗۙۙۛ۟ۗ";
                    break;
                case -1167212962:
                    arrayList.add(new C0310m7());
                    str2 = "ۢۨۗۨۧۧۙۤۙۙ۬ۘۘ۟۠ۧۙۛۥ۬ۗۖ۠ۜۖۘۜ۟ۢۗۧۖۘۨۙۡۘۨۙۨۘ۠ۙ۫ۦۡۘۘۨۘۘۜ۬ۢۨۙۡۜۘۙۛۜ۟ۤۦۜۘۥۙ۬ۛۨۚۡ۬ۥۤۨ۠";
                    break;
                case -1127331516:
                    str2 = "ۛۤۢۗ۟ۡۘ۫۠ۛۚ۠ۛ۟۠ۛۢۚۨ۫۫ۜۘۧۥۗ۟ۙۖۜۚۡۘ۠ۦۙۥۨۖۘۡۡۦۜۦ۟ۦۤ۟ۢ۬ۖۘ۬ۛۖۘۛ۟۫ۙۧۖۘۘۢۜۘ۬ۗۚۗۢ۬ۘۡۦۢۖۜ";
                    break;
                case -1105671324:
                    arrayList.add(new C0355pb());
                    str2 = "ۤۤۚۨۤ۫ۨۨ۬ۛۤۨۜۤۙ۠ۥ۠ۧۗ۫ۤۥۖۘۛۧۡۘۛۧۛۦۘۖ۬ۛۙ۬ۤ۟۠ۦۛ۬۬ۡۘۖۛۘۘۢۦۥۘۤۨۚۛۢۥۛۤ۟ۜۡۨۨۘ۠ۙ۟۠ۗ۬";
                    break;
                case -1017949100:
                    "processName";
                    str2 = "ۜۜۨۘ۬ۚۘ۠۟ۛۙۖۥۘ۟ۛۤۨۘۡۨۦ۫ۙۥۘ۫ۧۗ۬ۢۜۘۥۨ۟ۤۚۙۛۛۛ۠ۧۜۘۧۙۛ۫ۨۙۙۖۘ";
                    break;
                case -896561793:
                    "getList(...)";
                    str2 = "ۜۨۧۘۖۘۡۘ۠۫ۖۤۙۗۙۘۦۥ۬ۦۛۘۧۙۚۘۜۧۡ۫۟ۦۥ۟ۗۜۙۚۙۨۘۧ۠ۙۜۥ۠۬ۛۨۘ۬ۖۘۤ۟ۡۘۤ۫ۧۛۖۦۘۚ۫ۘ";
                    break;
                case -700231849:
                    arrayList.add(new C0273jc());
                    str2 = "ۨۡۛۖۜۧۙۗۖۢ۬ۘۘ۠ۨ۟ۨۙ۫ۜ۠ۘۘۢۡۙ۫۫ۛ۠ۦۘۚۥۧۘۙۗۤ۫۫۫ۖۜۧۘۚۨۢ";
                    break;
                case -689654787:
                    arrayList.add(new C0211f6());
                    str2 = "ۢۜ۟ۤ۟ۦۘۦۖۧۘۚۨۡۤۥۚۘۗ۫۟ۖۡۜۧۦۘۜۛۥۘۤۦۜۘ۬ۦۘۘۧۨۘۙۘۜۘ۬ۤۡ۫ۚ۠ۦۘۢۛۖۨ۟ۛۗۨۡۜ۠ۘ۫۟۫۬";
                    break;
                case -660395411:
                    arrayList.add(new C0405t9());
                    str2 = "ۛۥۤۖۜۖۜۚۡۡۡۨۡۢۨ۫ۘۘۚۧۙۚۨۥۚۗۖ۠ۗۢۙۦۥۘ۬ۗ۠۟ۜۥ۟ۘ۟ۛ۬ۡۥۡۘ۠ۜۘۜ۟ۢ۠ۦۙۛۤۢۖۥۡۨۘۚۗۡ۬ۗۤۤۦۘۘۢۘۧ۫ۗۢ";
                    break;
                case -536365501:
                    arrayList.add(new C0327na());
                    str2 = "۠ۧ۠۠ۙۖۡۖۘۘۙۜۖۘۤۢۧۜۤۖۘۡ۫ۖۦۘۜۚ۠ۦۧۧۥۘۜۢ۟ۙ۫ۘۡ۬ۘۙۨۥۘ۬ۧ۫ۜۡ۬ۡ۬ۡ۟ۛۖۘ۟۠۠ۢ۟ۦۖۧۧۙۚۨۘۦۢۨۘ۫ۗۥۘۙۡۜۢۗۡۘۗۖۥۘ";
                    break;
                case -510011943:
                    arrayList.add(new C0468y7());
                    str2 = "ۤۢۚۙۢۢۚۡۡۧ۟ۜۢۜ۫ۡۗۙ۠ۚۗۛۘۘۙۜۖۘۘۤۜۘۢ۬ۖۘۗۚۙۨۥۛۜ۬ۘۗۘۗ";
                    break;
                case -478936484:
                    str2 = "ۜ۫ۨۥۗۖۘ۟ۢۜۘ۟ۚۚۙۢ۫ۤۥۥۘ۟ۨۨۘۚۡۨۚۥ۬ۚۜۡۖۦۥۘۥۡۢۥۧۡۘۡۤۨۘۤ۠ۦۛۙۡۘۧۤۜۘۗ۫ۜۛۛۥۘۥ۠ۘۦۖۥۘۜۥۖ۫ۙۦۘۡۡ";
                    arrayList = new ArrayList();
                    break;
                case -415896403:
                    arrayList.add(new C0197e6());
                    str2 = "۟ۥۡ۬ۗ۟ۦۗۜۘۧۤ۬ۚۥ۠ۗۗۦ۟ۘۘۖۖ۬ۤۧۛۤۙۨۗۚۦۘۜ۟ۢۖۢۖ۟ۦ۬۫ۘۚ";
                    break;
                case -226124618:
                    arrayList.add(new C0463y2());
                    str2 = "ۚۗۧۙ۟ۦۥۥۖۘۦ۠۫ۢۦۘۤۥۨۚ۟۠ۥ۠ۗۦۤۥ۠ۗ۫ۨۥۘۦ۟ۥۘۖ۟ۦۘۡۜۥۢۖ۫ۛۙۤۨ۠ۦۨۖۖۘۨ۫ۜۘ۠ۦۧۘۙۤ۠۬ۦۥۘۡ۠ۖ۠ۖۡ";
                    break;
                case 11201738:
                    arrayList.add(new C0300lb());
                    str2 = "ۜ۠ۦۥۙ۬ۜۗۦۘ۠ۛ۫ۘ۟ۚۦۗۡۖۖ۫ۨۘۖ۫ۘۘۡ۟ۛۜۤۢۚۚۢۨ۫۟ۛۤۥۙ۟۠ۨۦۧۢۘۡۘۜ";
                    break;
                case 37636834:
                    str2 = "۟ۚ۠ۘۛۛ۟ۡۡۘ۠ۧۨۛ۠ۗۚۨۡۘۚۘۡۚۦۘۘۦۤ۬۠۬ۜۘۦ۠۟۬ۧۨۨۜۥۦ۟ۘۘۢۦۙۢۜۦۘۢۡۗۡ۠ۥۘۤ۟۠۟۠۫ۨۛ۟ۗۗۦۙ۫۫ۤ۟";
                    break;
                case 55786001:
                    arrayList2.addAll(arrayList);
                    str2 = "ۥۦۥۘ۫ۡۡۘۨۜۛۚ۠ۖۘۜۖۡۘۛۥۖۘۧ۠ۨۥۡۦۛۘۗۤۨۗۖۥۨ۬ۚۡۘۖ۬۫۬ۨۜۦ۟ۖۙ۟ۖۤۡ۫ۙ۬ۦۘۨ۬ۤۨۧ۠ۛۛۡۜ۬ۚۦۧۧۘۨ";
                    break;
                case 443919119:
                    c.m921().sendEmptyMessage(-1);
                    str2 = "ۨۥۘۗۢۥۘۙۢۤۤۙۤۨۤۦۘۖۥۨۛۙۨۜۜ۬ۖۚۦۡ۟ۥۨ۟ۨۘۦۙ۟۫ۤۘۘۘۥۗ۬ۧۜ";
                    break;
                case 522490440:
                    "processName";
                    str2 = "ۛۗۨۘۛۡۡۨ۫ۢ۫ۚ۟ۦ۫ۜ۫ۦۡ۠ۢۗ۬ۧ۫ۤۘۥۛۚۥۖۗۖۦ۠ۛۘ۟ۜۘۡۦۚۖۛۖۘۤ۬ۧۙ۟ۛۗ۠ۖ۠ۜ۠۠ۙۜۘ۫۟۬ۖۚۡۘۜۥۖۘۧۗۖۘۗۚ۬ۚۧ۠ۖ۠۫";
                    break;
                case 1081358346:
                    String str3 = "ۛۥۥۗۧ۫ۦۡۙۗ۠ۢۧۢۙۚ۟ۨۡۖۨۨۛۤۡۘۘۗۦ۬ۙۖۦۖۘۖ۟ۢۙۢۜۘۘ۫ۡۧۘ";
                    while (true) {
                        switch (str3.hashCode() ^ (-2000288971)) {
                            case -2030465715:
                                str2 = "ۢۚۢۥۖۧۘۧۤۘۘۨۗۚۦۤۖۗۢۘ۫ۨ۠ۖۨۖۘ۟۬ۡۚۡۘۤۙۡۗۥۦۢۤ۬ۖۦۦۖۛۜۘۢ۬ۦۘۡ۟۫ۛۦۖۗ۠ۧۚ۬۫ۛ۬ۥۘ";
                                continue;
                            case -1815366274:
                                str3 = "ۡ۫ۤ۫ۚۚۛۧۡۘۢۨۦۘۨۘۘۗۛۛۛۨۖ۫۟ۧۙۥۙۦۨۘ۫ۢۡۘۧ۠۠ۤۜۨ۠ۤ۟ۡۨۥۘۖۖۖۜۖۧۘۗۘ۬ۚۢۜۢۖۧۘۨۙۖۘ۬ۧۖۘ۫ۗۢۜۛۦۘ";
                                break;
                            case 1184839847:
                                String str4 = "ۡۖۡۙ۟ۥۘۙۘۥۘۛۙۢۢ۟ۤ۫ۡۧۜۤۖۘۧۗۙۡۜۡ۟ۗۜ۠۫ۥۘۨۙۜۖ۠ۨۘۤۧۚۜۜۧ۬ۡۥۘۘ۟۠۬ۥۛۙۦۤۨۖۡۘ۟ۡ۟۠ۚ۬ۢۚۨۥۘۦ۫۫ۘۘۖ۬ۜ۬ۛۦ";
                                while (true) {
                                    switch (str4.hashCode() ^ (-464163878)) {
                                        case -885671050:
                                            str3 = "ۢۥۧۘۖ۬ۧ۬۬ۜۘۗۙۗۨ۫ۡۚۗۛۦ۟ۤۤۙۥۤۗۧ۬۫۬ۚۜۚۚۢۦۧۨۖۚۖۛ۟ۧۗ۬ۥ۠ۦۧۜۦۜۜۡۜۤۚۢۜۥۘ";
                                            break;
                                        case -349671322:
                                            str3 = "ۖ۫ۡۘۢۙۜۘۦۜۘ۠ۨۘۡۦۜۡۖۢ۫ۙۘۙۨۢۤۥۥۡۦۖۘۛۥۚۗۖۡۘۙ۟ۡ۫ۖۘۘۧۖۥۜۢۖۘۘۨۢۖۛ۬ۨ۟ۜۧۢۨۘۤۖۗ۫۟ۘۘۥۚۙۨۦۨ";
                                            break;
                                        case 830938696:
                                            str4 = "۟۫ۧۡۢۜۘ۟ۘۨۘ۬۠ۤۛۨۖۘۚ۫ۗۜۨۚۙۚۦۢۛۖۘۢۗۥۘ۠ۙ۟ۢۘۦۘۦۧۘۘۙۦۖۘۘۧۚۢۨۖۖۚۘۘۥۗۛۢ۟ۚۢ۬ۢۦۜۛ۟ۤۚۤۡۜۜۘ";
                                            break;
                                        case 1867186585:
                                            String str5 = "ۦۖۨۥۦۘۥۧۦۘۛۛ۟۟ۙۨۦۧ۠ۦ۫ۘ۬۫ۜ۫ۛۘۚۜۖۤۥۚۙۤۛۘۧۖۡۨۢۢۜۜۘۗۛ۟ۧۙۙۨۜۙ";
                                            while (true) {
                                                switch (str5.hashCode() ^ (-897359631)) {
                                                    case -2118044460:
                                                        str5 = it.hasNext() ? "ۧۚۘۢۜۡۘۦۥۦۘۥۜ۫۟ۦ۫ۘۥۥۛۚۙ۟۟ۛ۬ۛۦۡۘۨۦۥۚۖ۫ۙۤ۫ۡۥۢۖۤۗۡۘۢۚۘۖۙۦۘۨۜ۫ۥۤۡۛۛ۫ۡۥۜۖ۠۫ۥۥۦۘۙۤۖۘ" : "ۗۧۜۗ۬ۛۢۤۜۥۡۧۗۦۚۘ۟ۗۥ۟۫ۘ۠ۨۘۚۤۡۘۚۙۡۘۜۙۤۘ۠ۨۘۥۙۚۦۙۤۖ۠ۧۙۖ۫۬ۧ۠ۚۨۙ";
                                                        break;
                                                    case -1942425587:
                                                        str4 = "ۛ۟۫ۡ۟ۥۘۛۗۘۦۥۚۖۘۧۖ۫ۧ۫۫ۗۧۙۧۖۦۦۘۧۥ۟ۤۙۢۗۚ۫ۨۧۦۗ۬۟ۛۚ۬";
                                                        break;
                                                    case -1855570096:
                                                        str5 = "ۨۜۧۘ۫ۨۧۘۙۙۥۡۜۚۥۢ۠ۨۦۗ۫۬۠۬ۙۜۧ۫۫ۜۤۜۘ۫۟ۜۘۘ۠ۘۥۧ۫ۛۖۧۘ۟ۜۗۢ۟ۦۦۖ۬ۡۨ۠ۗۨۤ۠ۢۖۚ۠ۘۨۥۖۘۜ۠۬ۡ۫ۤۘۘۡۛۦۘۨۜۥۘ";
                                                        break;
                                                    case -789370368:
                                                        str4 = "ۚۡ۬ۘۧۤۦ۠ۢ۠ۥۘ۟ۘۗۘ۫۟ۧۡ۬ۢۘۤۥۚ۫ۤۥ۠۟۟ۦۘ۬ۢۥۥۗۚ۠ۗۧۦۦ۬۫ۥۦ۫ۙۖۨۛۡۛۙۖۜۢۥۤۜۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 1351289526:
                                str2 = "ۛۗۦۘۚ۬۠ۡۥۡۘۗ۠ۘ۬ۖ۫ۦ۠ۙ۫ۚۜۘۧۧۚ۬۫ۥۤۘۧۦ۬۫ۨۜۨۘۤ۠ۘۡۡۖۘۙۙۨۘۘۤ۬۬ۙۥۨۖۦۘ۠ۖۢۥۦۨ۟ۗۧۥۧۖ۬ۗ۠۫ۚۧ";
                                continue;
                        }
                    }
                    break;
                case 1239588274:
                    arrayList.add(new C0246i());
                    str2 = "ۜ۬۠۫ۙۦۘۧ۠ۘۢۤۜۘۨۡۡۘۚ۠ۙ۟۟۠ۤۥ۟ۦۜۘۗۧۦۥ۠ۛۙۛۥۘ۫ۜۥۘۙۢ۫ۜۜۘۛۚۥۘۨۜۗۖۘۦۗۛۤۛۗۘۘۜۢ۫ۙۢۛۛۚۥۘۜ۟ۜ";
                    break;
                case 1587398376:
                    str2 = "ۗۤ۟۠ۗۖۘۦۜۥۘۥۨۦۘۧۗۥۧۗۘۘۖۦۦۘۢۗۙۧۖۖۘۦۗۖۘۥۨ۟ۚۦۛۖۘۘۛ۫۫ۤۖۡۘۥۜ۬ۡ۟ۚۛ۟ۛ۟ۧۥ۠ۙۦۦۢۧۦۖۡۘۡ۟ۜ۫ۡۘۙ۫ۘۘۧۧۙ۬ۘ";
                    arrayList2 = f1756;
                    break;
                case 1685626461:
                    arrayList.add(new C0461y0());
                    str2 = "ۚۗۖ۬۟۫۬ۨۢۖۙۜۜۢۢۜۗۜۜۦۧۘۖۚۡۘۚۤۧۙۗ۬ۨۥۦۘۗۨۧۘۙ۬۠۟ۥۧۖۚۜ";
                    break;
                case 1860335762:
                    return;
                case 2119553963:
                    "context";
                    str2 = "ۛ۠ۦۤۙۨۙ۬ۙۤۦۧۘۚۘۡۧۙۚۚۦۥ۠۠ۡۘۥۦ۫ۘۨۜ۟ۖۡ۟ۢۤ۠ۨۤۥۤۢۦۨۙۚۡۦ۫ۨۥۘ۟ۡۦۘ";
                    break;
            }
        }
    }

    @Override // p001.InterfaceC0425v3
    /* JADX INFO: renamed from: ۥ */
    public final void mo919(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str = "ۧۗۛۡۖۥۘۡۜۦۧ۠ۦۨۚۛ۠ۤ۟ۢۥۧۘۗۧۛۢ۟ۨۛۨۘۚۖۛۗ۬ۚۤۤ۬ۨۧ۟ۨۚ۫ۤۡۖۢ۫ۗۘ۟۟ۜۘ۠ۙ۫ۥ۬ۡۘۢۧ۬ۛۦۘۚۦۨۖۤۚۙۨۖۘۙ۫ۘ";
        boolean z = false;
        boolean z2 = false;
        while (true) {
            switch ((((((((str.hashCode() ^ 138) ^ 589) ^ 75) ^ 484) ^ 150) ^ 560) ^ 394) ^ (-842064962)) {
                case -1977104997:
                    C0237h4.m1090("lpparam", loadPackageParam);
                    str = "ۧۖۥۘ۫ۙۜۘۘ۟ۘۛ۫ۘ۬ۡ۬ۧۛۨ۟ۡ۟ۛ۟ۚۢ۫ۡۘۚۢۥ۫ۙۡۘ۬ۡۦۘ۠ۖۥۡۖۘۥۚۥ۠ۥۤ۬ۜۦ۫ۗۗۘۛۨۘۛۥۤۚۦۢ";
                    continue;
                case -1802375411:
                    str = "ۡۛۖۡۖۗۘۗۥۜ۫ۗ۬ۗۛۗۚۜۧۨۥۘۦۙ۟ۦۥۗۘ۟ۨ۬ۢۛۚ۠ۚ۫ۡۙ۫ۨۗۥ۠ۦۘ";
                    continue;
                case -1455718427:
                    str = "ۜۢۚ۬ۗۜۘۘۘۘۘۧۡۜۘۜ۟۫ۙۡۥۘ۬ۤۢۙ۬ۖۘۜۡۖۢۡ۠۟۠۠ۗۡۖۘۦ۠۫۫ۜۘۘۤۙۚ۟ۧۗۧۥۘۡۦۨ";
                    continue;
                case -1020018139:
                    String str2 = "ۥۨ۬ۧۢۗۢۗۤۛۜۥۘۙۦۨۘ۬ۨۧۘۛۤۡۗۖۗۜۗۡ۠ۧۜۘ۬ۦۛۥۙۥ۫ۦۦۨ۬ۢۢۘ۫ۜۜۖۘۤ۟ۦۧ۬ۥۢۖۘۘۛ۟ۢ۠ۜۙۢۥۖۨۨۡۤۗ";
                    while (true) {
                        switch (str2.hashCode() ^ (-1420496935)) {
                            case -693507881:
                                String str3 = "ۛۥۘۘ۫ۖۖۘۚۤۨۜۡ۠۠ۗۙ۫ۦ۫ۨۦۤۛۧۥۛۨۧۘۨ۫ۥۗۡۘۘۦۡۦ۟ۖۧ۟۫ۖۘۥۖۧۘۥۨۨۘۤۗۧ۟۟ۡۥ۬ۨۢۨ۟ۥ۫۬۟ۖۘۦۦۛۨۚۜۧ۫ۖۘ۟ۨۖۤ۫ۗ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-1762061906)) {
                                        case -1287624385:
                                            str2 = "ۙ۬ۡۘۦۛۡۢۙۨۘۥۦۦۘۜۢ۫ۧۢۦ۬۬ۛۖۥۥۘۘۚۘۘۦۢۘۘۨۡۨۘۚۢۜۘ۟۬ۨۖۜۘۤۘۤۘۘۙۜۥۗۘ۫۟ۢۦۘ۠۠۬ۖۖ۫ۢۢۢۢۡۜۘۖ۫ۙ";
                                            break;
                                        case 403261568:
                                            str2 = "ۖۖ۟۠ۥۘۘۧۥ۠ۢۢ۠ۤۥۡۘۦ۫ۦۥۜۖۘ۠ۨۤ۟ۡۖۘۥۨۥۘۖۤۧۚۥۧ۫ۖۨۘۦۚۨۦ۫ۢ۟ۦۚۜۖۜۨۘ۬ۥۡۗۘۤۤۙۨۛۘۧۘۤۥۖ";
                                            break;
                                        case 453277610:
                                            str3 = "۫ۡۦۡ۠ۛۦۥۡۘۗۜ۠ۧۙۚۤۢۜۘۧۘۤۖۘ۬ۨۥۘۘۦۨۘۘۖۘۗۡ۬ۜۦ۠۟ۚ۠ۤۛۗ۟۫۫ۥۘۦۡۚۜۘۙۛۚۡۢۛۧۡۡۡۥۦۡۗ۠۠ۖ۟ۧۙۖۘۙۜۚ۬ۧۗ";
                                            break;
                                        case 897843383:
                                            String str4 = "ۤۙ۠ۢۥۗ۫۠۫ۖۙۚۨ۬۟۬۫ۧۛۗ۫ۜۥۘ۬ۗ۠۬ۧ۬۠ۥۥۥ۫ۥ۫ۜ۬۟ۙۖۘ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1677341897)) {
                                                    case -914876302:
                                                        str3 = "ۨۛۧۗ۟ۜۧ۟ۦۘۚ۬ۦۘۘۦۨ۟ۖۜۘۛ۬ۤ۠ۙۢۢۖۡۧۥۡۜۘۥۘۧۧۜ۠ۘ۬۟ۦۚۧۗۡۛۢۤۗۜۥۘۙۨۢ۠ۨۜۦۛ۟";
                                                        break;
                                                    case -590941736:
                                                        str3 = "ۥ۠ۘۘۖ۟ۛۤۤۜۘۥ۫ۚۖۢۦۜۧ۟ۜ۬ۚۖۘۧۧۦۘۧۨۚ۟۫ۡۘۥ۬۟ۦۛۖۛ۫ۚۦۦۨۘۖۜۥۘۨۦۖۘ";
                                                        break;
                                                    case -517608730:
                                                        str4 = "ۛۦ۫۬ۗۧۦۙۥۘۤۛۥۘۧۦۜۘۘۗۜۘۜۤۢۡۤۙۙۖۨۘ۟ۚۦۚ۫ۧۚۨۗۥۘۙۤۤۛ۟۟۠ۗ۬ۡۛۢۛۥ";
                                                        break;
                                                    case 1859481106:
                                                        str4 = z ? "ۖۙۢۢۖۡۘۙۖۡۘۧۚۖۘ۟ۤۥۘۧ۟ۗۤۚ۠ۥۧۖ۟ۨۙۖۨ۠ۙۢۡۘۜۘۥۘ۬۬ۘۙۗۧۧۖ۠ۤۗۥ۫ۜ۬ۡۙۧ" : "ۜۥۘۧۖ۟ۗۢۡۨۘۙ۬ۦۙۤۙۖۘۥۙۚۥۛۛ۠ۤۡۚۧۜۘۤ۫ۤۡۙۙۨۖۦۘۙۦ۠ۤۜۡۘۡۧۡۚ۫ۘۘۧۗۜۘۛۤۦۘ۠ۗۧ۟ۡۧ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 468231023:
                                str = "ۡۢۤۛۤۙ۠ۢۘۗ۟ۙۘ۬ۘۛۜۥۘۙ۟ۥۘ۠ۧۘۖۧۡ۠ۦۖۥۥۤۥۜۤ۬ۙۡۧۜۙۘ۫ۗۥۦۘ۠۬ۡۘ۠ۨۢۘۨۙۤ۟ۚ۠ۨ۬ۘۥ۟ۤۖۦۢۜۨۘ";
                                continue;
                            case 1349359337:
                                str = "ۤ۠۫ۗ۫ۧۨۥۨۘ۬ۛۦۘۡ۬ۦۖۗۛۖۢۘ۟ۡۜۘۖۜۛۛۜۧۘۖۧ۫ۛ۬ۧۚۜۨ۬ۗۨۚۢۖۘ۠ۖۜۘ۟۠ۘۢۦۥۢۚۘۛۚۜۘۚۧۡ";
                                continue;
                                continue;
                            case 2085030610:
                                str2 = "ۤۙۢۛۛۗۥۙۤۡۤ۬ۘۗۤۖۜۥۘۜۡۥۘ۠ۙ۫ۥۦۙۨۜۨۢۙۜۢۗۚۡۗۜۘۤ۬ۡ۬ۛۘ۟ۘۧۙۘۘۡۡۘ";
                                break;
                        }
                    }
                    break;
                case -940627919:
                    str = "ۙۨ۟ۛۖۘ۟۟ۖۘ۬ۡۦۘ۟ۤۤۨۖۡۧۖۘۘۨۤۢۧۗۧۗۗ۟۠ۡ۬ۦۥۘ۫ۖۖۘ۫ۧۖۘ۟۠ۜۘ۟ۜ۠ۖۦ۟ۖۘۘ";
                    continue;
                case -900914992:
                    String str5 = "ۗۚۧۥۦۖۖۛۚۖۨۨۘۗۙۖۤ۠ۗ۟ۙۥۘۛۗۦۗۧۜۖۥ۟ۙۚۦۖۢۙ۫ۛۙ۫۠ۦۧۥ۬۠۫ۚۘۦۢۨۜۥۘۙۢۥۚۚۖۘۜۗ۟۟۠ۡۗ۫ۘۘۗۢۨۖۚۜۘۢۚۘۢۚۦۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 1762073924) {
                            case -1682457114:
                                str5 = "ۖۧۖۘ۠ۤۧۘۥۦۘۖۛۘۜۘۥۥۤ۠ۖۖ۫ۢۦۗ۬۬ۡۢ۠ۢۥۗۧ۫ۗۗۚ۫۬ۧۗۥۖۤۧ";
                                break;
                            case -632336935:
                                str = "۫ۥ۠ۤ۬ۦۢۦۨۘۗۖۘۦ۠ۤۗ۠ۡ۠ۥۛۗۗۢ۠ۗۗ۬ۛۦۦۦۖۘۚ۟ۘۨ۠۠ۖۜۡۧۡۗ";
                                continue;
                                continue;
                            case -230090879:
                                String str6 = "ۗۢۤۘۡۖ۫ۙ۬۫۠ۥۘۤۥۤۥۧۛۧۦۜۥ۬ۘۘۛۖۡۘۚۜ۬۬ۤۡۘۤۡۗۧۚۗۡۧۧۡۘۡۛ۫۫ۜۧۦۢۜۘۘ۠ۤۤۚۦۘ۫ۤۦۘۥۚۗۗ۟ۘ۠۫ۤ";
                                while (true) {
                                    switch (str6.hashCode() ^ (-1514460455)) {
                                        case -1924587654:
                                            str5 = "ۜۙ۠ۦۘۜۘۗۢۦۘۦ۠ۨۢۚۜۖۚۜۤ۟ۥ۠ۚ۠ۛۙۨۢۥۦۧۚۧ۬ۛۗ۠ۤۙۗۘۛۤۤ";
                                            break;
                                        case -35110123:
                                            str5 = "ۗۚۚۢۨ۫ۧۨۖۡۢۥ۬۫ۥۜۚۜۘۥ۟ۜۘۥۦۘۦۜۜۘ۬۫ۨۘۘۚۧۙ۫ۢۢۡۥۦۜۖۡۦۘۗۨۦۚۘۛۡ۬ۜۥ۬۟ۧ۫ۛۨ۬ۨۢۨۧۘۚۖ۬ۛۡۜۡۧۥۘۙۡ۠۟ۤۙ";
                                            break;
                                        case 412180938:
                                            str6 = "ۥۨۜ۫ۘۦۤ۬ۢۚۗ۠ۘۡۦۦۘۡۘ۬۟ۘۖۗ۠ۤ۬ۘۦۥۘۛۥۨۢۨۗۖ۬ۖۘۜۚ۟۬ۙ۫ۡ۫ۦۘۜۚۜۘۗۙۡۜۘۨۘ۫ۜۘۢۛۖۘ۬۟ۛۗۛۛۧۘۤ۬۫ۥۛۤۡۤۢۢ";
                                            break;
                                        case 832632069:
                                            String str7 = "ۥ۠۫۬۟ۖۦۖۦۘۙۚ۬ۖ۟ۙۨۚۨۖۤ۬ۥۗۙۤۡۧ۫ۨۘۗ۟ۛۤۘۡۘ۠ۜۥۚۨۤ۠ۛۘۘ۬ۤۨۙۖۘۘۤ۠۠ۤۦۘۡۤۗۦ۫۫";
                                            while (true) {
                                                switch (str7.hashCode() ^ (-1448102856)) {
                                                    case -1910379749:
                                                        str7 = "ۢ۠ۘۧۦۤۡۖۖۘۖۢ۬ۢ۫ۘۘۤۢ۫ۥۧ۟ۚۛۜۦۤۢۗۘ۫ۧۚ۬ۘۢۜۤ۟ۧ۫ۙ۟ۥ۬ۢۘۘۡۛۘۘۦۥۡۘۚ۠ۢۧۚ۟ۡ۬ۡ";
                                                        break;
                                                    case -1708959365:
                                                        str6 = "۠ۡۡۘۤۛ۫ۤۚۙۥ۟۫۬۬ۦۗۚۨۡۦۡۘۘۦۢ۫ۢۜۘۛ۫۬ۗ۫ۦۡۖۡۘ۠ۧۘۘ۠۫ۢۜۙۜ";
                                                        break;
                                                    case 444350969:
                                                        str7 = mo816().length() == 0 ? "۫ۙۛ۟ۜ۬ۗۥۦۜۖۦۘ۬ۡۡۘۙ۫ۥۘۧ۠ۖۗۥ۟ۢۧۥۜۗ۬۬ۘۛۗۨۤۚۚۚۗۤۚۜ۠ۨۗۙ۠ۨۢۦۘۥۜۡۘ" : "ۜۚۘۘۡۥۨۢۙۜۘۤۖۘۘۨۘۘۘۧۥۚۗۗۜۘۦۦۘ۬۟ۛۥۚۦۘۨۦۤۙۛۦۘۢۤ۬ۚۢۘ۬ۧۚۘۜۜۘ۫ۧۗۢۤۜۘۦۗۡۛۖۥۘۗۤ";
                                                        break;
                                                    case 986912317:
                                                        str6 = "۠ۢ۠ۧۜۘۘۙۜۛۤۨۥۘ۟ۨۡۘۖ۟ۙۢۥ۫۟ۛۦۗۡۙۖ۫۟ۨۢۧ۠ۨۘۨۚۙۨۦۤۙۘ۫ۢ۫۠ۧۢۗۡۤۘۛۦۙۚ۠ۢ۫ۙ۟";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 2039536454:
                                str = "ۧۢۦۤ۬ۨۘۧ۬ۙۦۧۡۘ۟۬ۥۢ۫ۘۘۡ۠ۨۘۚ۫ۚۡۘۨۜ۬ۖ۟ۚۡۡ۠ۢۖۜۧۘۡۙۘۘ۟۬ۛۢۦ۫ۖۗۙۡۙ۠";
                                continue;
                        }
                    }
                    break;
                case -679982242:
                    return;
                case -196469354:
                    z2 = true;
                    str = "ۜۘ۟ۦ۠ۡۙۙۚ۫ۧ۟ۚ۬ۜۘ۬ۥۗۢ۠ۙۛۧۖۘ۟ۙۜۘۚۤۗۖۥ۟ۥ۠ۡ۫۠ۗۗۘۘۘ۬ۥ۫ۥۦۜۘۙ۬۠ۜۤۦۧۚۥۥۗۖۙ۠ۦۘۖۘۧ۟ۖ۫ۨۘۘۘۗۨ۫ۘۦ۬ۦ";
                    continue;
                case -39467378:
                    str = "ۢۚۜ۟ۘۥۚۨۨۦۖۨۘۛۖۨۘۚۨ۠ۧ۟ۘ۫ۖۥۘۦ۬ۨۦۖۡۙۥۢۜۜۘۡ۟ۜۦۗۜ۫ۨ۫ۙۛۡۘۙۢۖۘۜ۟ۚۙ۫ۡ۠ۧ۬۬ۧۧۚۛ۠ۜۘۘۡۦۗ";
                    z = z2;
                    continue;
                case 156297882:
                    break;
                case 181613049:
                    str = "ۙۨ۟ۛۖۘ۟۟ۖۘ۬ۡۦۘ۟ۤۤۨۖۡۧۖۘۘۨۤۢۧۗۧۗۗ۟۠ۡ۬ۦۥۘ۫ۖۖۘ۫ۧۖۘ۟۠ۜۘ۟ۜ۠ۖۦ۟ۖۘۘ";
                    z = false;
                    continue;
                case 382987565:
                    mo1116(loadPackageParam);
                    str = "ۦۚۤ۟ۡۜۘۨۜۧ۫ۡۦۢ۠ۨۘ۫۬ۘۡۨۜۘۙۧ۬۫۟۟ۛ۬ۖۘۡۗۙۡۜۧۘۡۡۘۘۜۜۘ۬۠ۛۗۙۨۘۦۗۨۘ۬۠ۡۘۜۧۜۦۙۙ۬ۥۛۨۜۨۘۚ۬ۙ۠ۡۧۗۛۥۘۡۢۨۤۡۜ";
                    continue;
                case 637045837:
                    String str8 = "ۙۦۙۚۛۗۙۢۥۙۧ۟۫ۧۜۧۨۙۗۗۘۘۘ۬ۖۘۚ۟ۥۘۦ۟ۨۜۡۦ۠۬ۢۧۜۘۘۖۨۜۘۗۖۙۤۨۚۜۜۛۡۘۥ۬ۛۦۘۢۚۖۡۡ۠ۗۛۤۨۢۤ۬ۢۢ";
                    while (true) {
                        switch (str8.hashCode() ^ 1731730146) {
                            case -482768633:
                                str = "ۚۙۧۡۧۤۥۖ۟ۧۨ۠ۡۦۧۤۦۖۜۙۨۘۦۨۙۖ۬ۜۘۘ۬ۦۚۤۗ۬ۥۘۢۙ۟ۖ۬ۨ۠ۥۙۙۜۙۡۥۧۘۘۡۧۧۧۨۘۨۤۜ۟ۙ۟۟ۥۘۘۚۘۜۜۗ۬ۢۜۖ۬ۖۘ۠۟ۥ";
                                break;
                            case 332202048:
                                break;
                            case 804610678:
                                str8 = "ۧۙ۟۟ۢۨۤۥۖۖۨۜۗ۬ۥۘۢ۫ۨۘۢۘۘۘۙ۫ۙ۫۠ۢ۟ۘۖۢۡۘ۠ۦ۟۬ۖ۠ۜۙۚۥۖ۫ۢۖۖۦۥۖۤۛۤۡۘۥۥۗۛۦۦۘ";
                                break;
                            case 1424073292:
                                String str9 = "ۨۦۖۘ۬ۜۨۥۡۨۜۚۖۘۜ۬ۙۥۜ۫۬ۗۘۘۘۨۜۤۡۙۦۤۙ۟ۛۗۗۦۚ۫ۢۦۖۖۦۘۖ۠ۦ";
                                while (true) {
                                    switch (str9.hashCode() ^ (-1014051337)) {
                                        case -2102430596:
                                            str9 = "ۦۙۥۘۧۤ۬ۚۙۚ۬ۘۛۡ۬ۡۘۧۖۖۦۡۢۚۦۨ۬ۖۥۘۖۤۜۚ۠ۗۥۙۜۘۢۜۘۘۦ۟ۨۨ۟ۛۜ۠ۤۜ۠ۥۘۙ۠ۦۘۙۡۥۘۖۙ۬ۚۖۖۘۖ۬۟ۥۗۖۘۨۚ";
                                            break;
                                        case -1412916512:
                                            str8 = "ۡۡۨۘۢۖۡۤ۠ۗ۬ۗۤ۠ۜۘۘۖۡۢۚۨۘۙۢۥۨۚۢۖ۬ۙۢ۬ۥۘۜۡۚۧۛ۫۬ۨۜۛۦۜۢۚۨۨۥۜۥۦۜۥۤۚۚۚۘۨۥۜۘ۟ۜۖۘ۫ۨ۟ۤ۫ۛۨۚ۬ۗۨۧۘۖ۬";
                                            break;
                                        case 352998628:
                                            str8 = "ۗۜۘۘ۬ۛۢ۠ۙۨۘۙۛۗۢۜۖۘۜۥۚۧ۠۬ۘۧۗ۠ۜۘۗۗۘۘۡۢۖۚۙۘۛۗۦۘۥۗۖ۬ۢۖۘۗۦۧۘۤۦۡ۟ۜ";
                                            break;
                                        case 486373787:
                                            String str10 = "ۘۚۖۘۡۖۡۘۧۥۡۘۙۛۨۘۦ۠ۢۧۦۙ۬ۚۚۥۗ۟ۗۖۖۥ۫ۖۖۦۘۢ۠ۚ۠۫ۘۘۘۧ۠ۢۜۡۘ۠ۗۗۡ۫ۥۘۙ۫ۛۧ۠ۘۘ۟ۨۤۨ۟ۘۘۦۚۙ۟ۦۜۘۤۦۘۘ";
                                            while (true) {
                                                switch (str10.hashCode() ^ (-1164873941)) {
                                                    case -1206282410:
                                                        str10 = C0237h4.m864(loadPackageParam.packageName, mo816()) ? "ۦۥۨۘۢۛۥۘ۬ۘۙۖۦۙۨ۠ۦۘ۠ۨۧۘۤۛۜۗۦۨۡۨ۠ۥۦۡۘۢۜ۫ۖۜۥ۫۠ۥۘۤۦۛۙۜۗۚۢۥۘۚۨ۫ۡ۠ۦۘۤۥۨۘ۬ۖۜ۫ۚ۠ۢ۟ۥۖ۬ۚۤۖۛ" : "ۙۙۦۘۦ۠ۡۘۖۛۖۘۜ۠۬ۢۘۘۥ۫ۘۜۡ۟ۘۜۨۘۥۦۨۨۥ۫ۢۢ۟۟ۢۦ۠ۥ۫۟ۦۖۘ۬ۙۜۤ۟ۗ۠ۘۖۛۢۗۚۥۧۘۦ۬ۥۙۥ";
                                                        break;
                                                    case -73062617:
                                                        str9 = "ۜۢۨۘۦ۫ۨ۬۫ۚۛۦۗۚ۫ۥۘۘۗۥۘۥ۟ۤ۟ۙۘ۬ۘۧۘۖۤ۠ۘۗۗۖۘۦۦۥۛۛۧۜۦۨۢ";
                                                        break;
                                                    case 396248240:
                                                        str9 = "ۨۥۜۤۨۨۤۥۤۧۚ۠ۗۦۥۘۨۖ۫ۨ۫ۖۘۤۚۘۘۛۚۚۤ۫ۦۖۨۨۜۨۙۥۚۡۘۨۜۧ۫ۡۨۘۤۖۥۘۛ۟ۖۚۥۘۚۧۙ۟ۜ۠ۜۥۤۢ۟ۛۤۜۦ۠۬۠";
                                                        break;
                                                    case 2088630325:
                                                        str10 = "۟ۦۤۡۛۡۘۤ۠ۖۘۥۚۡۗۛۘۘۨۛۘۘۜۘۙۧۨ۠ۢۤۘۘ۠ۢۖۙۛۥۘۧۚۧ۫ۖۜۗۤۙۚۖۤ۠ۙۤ۬ۛۢۗۚۨۨۙ۬۟ۖۜۘۘۜ۬۟ۛۙۡۡۤۖۥۗ۠ۧۙۦۨۜۖۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 676816893:
                    str = "ۖۙۦۚ۬ۛ۬ۚۢۚ۬ۙۤۧۡۥۧۗۥۗۦۘ۫ۨۢۦۦۘۘۨۧ۫ۧۤۢۗۦۤۤۖ۠ۜۖۧۘۥ۠ۘۘۧۧۤۡ۫ۜۜۦ";
                    continue;
            }
            str = "ۦۚۤ۟ۡۜۘۨۜۧ۫ۡۦۢ۠ۨۘ۫۬ۘۡۨۜۘۙۧ۬۫۟۟ۛ۬ۖۘۡۗۙۡۜۧۘۡۡۘۘۜۜۘ۬۠ۛۗۙۨۘۦۗۨۘ۬۠ۡۘۜۧۜۦۙۙ۬ۥۛۨۜۨۘۚ۬ۙ۠ۡۧۗۛۥۘۡۢۨۤۡۜ";
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1190(Application application) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = null;
        String str = null;
        ClassLoader classLoader = null;
        ApplicationInfo applicationInfo = null;
        boolean z = false;
        Bundle bundle = null;
        String string = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str2 = "ۢۗۤۙۦ۠ۤۖۘۙۧۡۚ۫۟۬ۖۦۨۚۨۢۜۧ۠ۥۘ۫ۢۘۘۡ۟ۘۘۘۘۗۘۧۡۙۖۜۦ۫ۖ";
        while (true) {
            switch ((((((((str2.hashCode() ^ 568) ^ 94) ^ 981) ^ 73) ^ 286) ^ 809) ^ 8) ^ 1416635696) {
                case -2130536130:
                    String str3 = "ۜۛۥۘۧۙۜ۠ۗ۠ۤۙۡ۬۬ۗۥۤۡۖۦۘۨۡۧۚۜۚۢ۟ۧۢۨ۫ۦ۬ۙۢۜۨۘ۠ۚ۬ۚۗۥۘۙۙ۠ۚۦۨ۬ۛ";
                    while (true) {
                        switch (str3.hashCode() ^ (-1212420293)) {
                            case -181122111:
                                str2 = "ۙ۠ۜۘۤۙۛۜۡ۬ۗۛۢۙۨۡۤۘۘۘۧ۬۬۬ۛۖۘۙۨۙۤۢۡۘۨۤۡۜۧۘۦۡۨۘ۫۟ۨۛۧۤ";
                                continue;
                                continue;
                            case 271733538:
                                str2 = "۫ۛۛۙ۟۫ۥۚۜۖۘۤۡ۫ۢۡۘۘ۟ۨ۠۫ۘۘۘۚۚۗۧۢۢ۟ۚۥۘ۬ۥۖۛۘۗۢ۫ۡۘۜ۬ۘۚۡۥۛۦ۫ۘۡۥۨۗ۠ۧۚۥۗۛۡۘ۟ۜۥۘۗۥۥۘۜۚۧ";
                                continue;
                            case 1407346668:
                                String str4 = "ۨۛ۬ۢۘ۠ۡۥۡۖۧۡۘۦ۠ۦۧ۟۬ۚۛۘۘۥۗ۬۬ۡۥۗ۟ۨۘۨۥۧ۫۬ۘۘۚۢۡۘۨۘۘۜۛۦۗۡ۠ۥۡۤۢۙۨۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ 595294736) {
                                        case -1825137830:
                                            str4 = "ۜۛۥۡ۬۬ۦۡ۟ۙۧ۬۠ۥۚۜ۠ۜۘۚۥۖۘۡۡۖۘ۫ۖۨۗ۟ۧۨۙۧۘۘۥۘۥۘ۬ۧۦۖۘ۟ۢۛۗ۠ۛۙۙۥۢۖۘ";
                                            break;
                                        case -1167780225:
                                            str3 = "۠ۜ۠ۥۡۡۗۦ۟۬ۚۘۘ۬ۥۗۗ۬۬Oۧ۬ۙۚۦۛۨۚ۫ۢۘۘۡۙۦ۠۠ۤۜۧۤۚۨۘۘۖۖۚۡۗۙۖۤۥ";
                                            break;
                                        case -386304693:
                                            str3 = "۠۠ۨۧۚۦۙۥۨ۫ۨۜۡۤۙۛۜۥ۬۟ۜۘ۟ۧۙۘۥۥۘۗۢۨۘ۟ۧۢۘۡ۬۟ۧۚۦۡۥۧ۠ۡ۠۫ۚ۠ۖۧۘۜۡۖۘ";
                                            break;
                                        case 765405607:
                                            String str5 = "ۜۖۚۛۥۙۧۙۦۘ۬ۢۧۢۦۖۦ۟ۦۘۘۛۖۢۜۥۧۜۢۘۜۘۨۢ۠۟۬ۙ۫ۨۜ۬ۜۘۘ۟۟ۤ";
                                            while (true) {
                                                switch (str5.hashCode() ^ 344315451) {
                                                    case -2043405470:
                                                        str5 = string.length() > 0 ? "ۨ۟ۖۨۢۧۡ۟۟۟ۜ۫ۢۨۚۛ۬۠ۛۜۡۡ۠ۖۜ۟ۨۖۗ۬۬ۜۤۘ۫ۜۘۧۡۦۢۦ۫ۛ۫ۨۘ۠۫ۥۗۛ۫ۦۢۧۥۧۤ۠۫ۗۖۡۥ۫ۛۡۙۙۡۘۗ۬۟" : "ۜۦۘۦۤۦۘۜۛۖۘۥ۟ۦۤ۠ۖۘۗۙۚۥۦ۟۟ۥ۫ۜۢۜۢۜ۫ۨ۟۫ۤۢۢۙۨۖ۠ۡۘۧۧۙۢۥ۬ۦ۟ۧۨۘۧ۬ۡۡۢۧۛۧۙۗۧ۠ۧۖ۠ۖۘۖۧ";
                                                        break;
                                                    case -1034622332:
                                                        str5 = "ۗۥۡۘۛۡۘۘۙۨۧۙۨۘۦۜۘۥۥۧۘۛۙۥۘۛۡۧۘۦۘۢۛۡۨۘ۬۫ۚۡ۫ۢ۠۫ۙۜۢۡۘۦۢۨۦۥۘۘۚ۬ۨۗۨۦۛ۬ۘۖۡۘ۫ۦ۠ۥۖۦۡۖۘۜۦۨۘ";
                                                        break;
                                                    case 184247071:
                                                        str4 = "ۘ۠ۚۧۖۦۖۥ۟ۚۛۦۜۧۘۜ۟ۜۙۜۦۘ۠ۦۧۘ۠ۖۦۛۚۡۙۢۧۨ۠۫ۨۡۘ۬۬ۙۥۙ۬ۗ۫ۢۦۖۗ۠ۚۧۙۢۦۨۗۤۧۙۘۘۢۚۘۙۖۖۚ۟ۤۦۥۧۤۗۜۘۢۤۖ";
                                                        break;
                                                    case 1774831619:
                                                        str4 = "ۙۨ۫ۖۢ۠ۙۛۤۥ۠ۛ۟۫ۥۘۦۢۢۗ۟۫ۖ۬ۧۦۜۧۘۗۖۧۘۙ۠ۧۘۡۜۘۛۗۡ۠ۢۥۘۙ۬ۥ۬ۗۥۘۦۥ۫ۖۥۚۜۗۘۘۖ۫ۘ۬۬۬ۘ۟ۗۨۧۥۘۨ۬۫ۖۥۦۘۙۧ۠ۘ۫ۦ";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 1411569836:
                                str3 = "ۘۢۚۗۡۥۘۜۗۦۘۢۛۡۘ۟ۧۤۙ۫ۨۢۨۘۡ۫ۖۘۤ۟ۨۘۦۨۦۥ۫۠ۦۙۗ۬ۖۘۦۥۡ۠۬ۡۘ۫ۥۧۘۤۛۜۘۤۖۘ۫ۚۖۢۘۘۘۖ۟ۗ";
                                break;
                        }
                    }
                    break;
                case -2083211115:
                    C0237h4.m1089("getClassLoader(...)", classLoader);
                    str2 = "ۢۦ۫ۤۜۛ۫ۘۖۤۢۗ۫ۦۘۛۛۥۘۥۙۡۘۛ۟ۚۚۧۥۗ۫۠۟ۖۦۦ۟ۚۦۙۥۘۗۤۧ۬ۤۤ۟ۜۨۨۛۢۚۨۧ۠۫ۖۢۛۢۤۢۛۤ۫۬ۧ۠ۜ۠ۜۨۘۨۘۛ۫ۡۧۘۘۦۦ";
                    continue;
                case -2070338649:
                    "context";
                    str2 = "ۤ۟ۤۛۦ۫۫ۚۡ۫ۤۦۛۜۨۘۜۢۨۤ۟ۜۘۧۧ۫ۥ۫ۘۘۜۗۥۧۗ۠ۢۖۚۚۥۜۥۥۡۗۘۦ";
                    continue;
                case -2061641600:
                    C0292l3.f938 = classLoader;
                    str2 = "ۙۨۧۘۗۛۘۙۘۤ۠۠ۦۨۧۖۘ۬ۛۨۘۡۧ۟ۖۜۤۜ۠ۨۛۜۢ۟۠ۖۦۡۚۛ۫ۥۘۛۥۖ۠ۚۗۥ۫۬۬۬۠ۢۜۘ";
                    continue;
                case -2060588424:
                    str2 = "ۧۜۛ۠ۥ۬ۡ۠ۗ۟ۗۙ۫ۜۙۘۛۦ۫ۢۘۘۚۘۤۡۥۘۘۧۢۜۘۗۨۜۘۥۤۥۘۨۜۦۜۥۦۘۧۜۘۘۛۚۜۘ۟۟ۢۤۢۜ";
                    z4 = z2;
                    continue;
                case -1957909855:
                    C0237h4.m1089("versionName", str);
                    str2 = "۫ۥۘ۟ۡۖ۫ۗۦۗۤۨۘۙۛۜۖۛۛ۠ۧۢۤ۬ۜۘۧ۠ۙۢۨۦ۬۠ۦ۫۫۟ۚۙۙ۟ۥۧۘۦ۬۬ۜۗ۠ۦۗ۟ۜۦۙۦۜۨۨۧ۬ۦ۫ۥ۫ۤ۠ۚ۫ۨۤۥۥ۬ۨ۠ۢۜۘۨۦۜۘ";
                    continue;
                case -1861659698:
                    C0237h4.m1089("getPackageInfo(...)", packageInfo);
                    str2 = "ۥۖۥۘۚۦۘۘۨۘۖۘۖۡۨۦۨۡۦۖ۠ۦۡۡۘۜۙۨۘۛ۠ۚۤۤۛ۬ۧ۫ۨۤۜۘۤۤۡ۟ۛ۬ۢ۠ۘۘۖۦۚ۠ۡۢۛۡ۠ۤۢۚۘ۫ۨ۠۬ۘ";
                    continue;
                case -1468889635:
                    str2 = "ۤۦۦۘۡۥۧۘۖۦۜۘۚۡۡۢۙۘۘۘۚۜۤۖۧ۫ۧۦۡۨۖۘۗۘۚۨۚۘۢۘۖۘۢ۬ۖۘۥ۫ۨۚۗۤۦ۠۟۟ۙۢۛۘۖ";
                    z6 = z;
                    continue;
                case -1383341846:
                    C0292l3.f1688 = z6;
                    str2 = "ۦ۫۬ۙۡۨ۟۬ۘۘ۠ۗ۫ۤۦۥۚۤۥۘ۟ۧ۠ۧ۫ۙ۬ۗۨۘۚ۟ۡۘ۟ۥ۬۬ۤ۫ۨۜۦۘۤۙۨۡۚۧۡۚۘ۬۬۠۠ۛۘۘۤۖۜۢۧۨۜۧۦ۬ۡۧۗ۟۫ۘ۟ۜ";
                    continue;
                case -1335843094:
                    "<set-?>";
                    str2 = "ۚۖۛ۟ۖۘ۠ۙ۫ۤۙۡۘ۬ۤۗ۫ۗۦۖۛۨۥۚۦۘۙۡۙۢۧۜ۟ۥۥۘۚۖۨۢۖۖۗۛۛ۠ۧۨۚۨۚۡۤ۬۠ۦۘۘۖۦۘۙۖۘۘۤۦ۠ۨۖ۫۠ۢ۠ۥۢۙ۟ۘۘۖ۠۫ۤ";
                    continue;
                case -1326570450:
                    string = bundle.getString("com.google.android.gms.version");
                    str2 = "ۘ۟۫ۦۙۥ۫۟ۖ۬ۘۘۥۨۥۘۙ۫ۤۦۢۘ۫۠ۤۖ۠ۡۗ۬ۥۘۚۗۨۘۜۛۜۘ۟ۜۧۚۨۤ۬ۡۘ";
                    continue;
                case -1207290239:
                    String str6 = "ۘۨۖۘۛ۫۠ۢۖۚۖۢ۟ۚ۫۬ۙۤۡۥۚۘۜ۫ۙۙۡۡۘۢۙ۬ۛۥ۟۫ۢۖۦۦۚۤۙۘۚۙۛ۟۫ۖۚۦۖۘ۟ۧۙۙۜۛ۟ۦۗۙۘ۠";
                    while (true) {
                        switch (str6.hashCode() ^ (-402422439)) {
                            case -1891411867:
                                str6 = "ۛۚۨۘۙۗۗۤۛۨ۠ۡۥۘۤۜۦۦۨۙۜۧۘۜۧۦۨۥۖۨ۟ۖۘۧۚۘۘ۠ۗۖۘۖ۬ۥ۠ۥۘۨۤۜۘۥۚۨۚۛۙۧ۠۠ۧۛۥۗۥۚۘۛۥ";
                                break;
                            case -814515884:
                                break;
                            case 514168873:
                                String str7 = "۟ۤۤۦ۫ۦ۬ۨۜۘۚۛۨۘۜ۫ۜۘ۬ۥۧۧۗۥۘۚ۫ۡۘۧۥۥۙۚ۬ۙۨۦۛۘ۫ۜۨ۬ۜۥۧۜ۠ۧۢۨ۫۬ۘۤ۫۬ۡۛۢۤۡۖۘۨۗۥۘۖۖۡۘۥۤۡۛ۟ۦۘ";
                                while (true) {
                                    switch (str7.hashCode() ^ (-80350941)) {
                                        case -741112187:
                                            str6 = "ۢۜۥۥۤۖۘۨۗۥۙۘۡۘۘ۟ۚ۬ۛۗۚ۠ۦۘ۬ۢۤۦۧۢۥۖۙۦ۫ۙۧۖۘۗ۠ۚ۫ۦۜۜ۫۬ۙۘۚۖ۬۟ۙۚۛ";
                                            break;
                                        case 273464816:
                                            String str8 = "ۢ۠ۧۢۛۢۡۘۜۤۤۚ۫۟ۥۗ۫ۜۘ۬ۙۜۘۛۨۢۨۙۤ۠ۨۘ۟ۤۧۖۨ۠ۤۚۡۘۥۨ۫ۧۤۜۘۤۡ۬۠ۘۡۘۙۙۦۘۙۗۧ۫ۚ۠ۙۚۘۘۧۜۤۢۗۦۘ۟ۥۨ۟ۙۛ۫ۛۘۘۨۤ";
                                            while (true) {
                                                switch (str8.hashCode() ^ (-397792333)) {
                                                    case -1902046298:
                                                        str7 = "ۗۖۡۘۛ۫۫۠۠ۘۘ۫ۨۢۦ۬ۚۚۙۛۖۙۤۚۦۙۦۙۥۘۧۖۖۘۙۙۘۨۜۡۘۖۡۖۘۦۙۥۦۙۤ";
                                                        break;
                                                    case 508053602:
                                                        str8 = "ۧۗۖۘۨ۠ۗۤۚۖۦۢۦۘۚۨۖۚۨۛ۬۠ۤۙۖۥۘۘۘۧۘۘۦ۬ۜۧۡۘۥۗۖۘۢ۠ۛۛۧ۬ۖ۫ۤ";
                                                        break;
                                                    case 981148144:
                                                        str7 = "ۡ۠ۘۘۚۛۙۚۧۤۙۘۡۘۥۤۦۘۤ۬ۡۘۧۚۙۧۨۧۧ۫۠۟ۖ۠ۡۨۧۘۘۚ۠۠ۘۘ۟ۛۜۧۡۢۙۗ۫ۘۘ۠ۗ۫";
                                                        break;
                                                    case 1119539232:
                                                        str8 = applicationInfo != null ? "ۖۖۖۘۨۙۚۡۜۙۚۦۘۘۧۛۢۤ۠ۘۘ۬۟۫ۤۜ۟ۤۡۜۨۥۤۧ۟ۜۘۚۦۛ۫ۘۧۘۤۚۤۤۖۦۧۧۨۧۖۥۘۤۨۘۘۥۥۜۘ۬۫۬ۚۤ۟" : "ۙۦۧۘ۫ۖۘ۬ۘۜ۠ۚ۠ۛۛۦۘۗ۬ۗۙۤۜ۠ۜ۟ۢ۬ۧۙۧۘۘ۫ۡ۬ۜۛ۟ۥۖۧۘۨۢ۟ۧۤ۫ۡۨۡۘۢۛۖۤۦۦۥۨۤۘۘۗۙ۟ۜۘ۟ۤ۟ۚ۟۫۠ۚۖۨۚۦۛۘۦۨۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 298999783:
                                            str6 = "ۙۧ۟ۨۗۘۘۖۨۖۡۗۖۘۘۖۡۘۗۨ۫ۧ۟ۧ۫ۥۦۧ۬ۙ۬ۨۨۘۨۨۙۚۛۜۨۙۛۥۜ۟ۖۧۘ";
                                            break;
                                        case 517041081:
                                            str7 = "ۜۧۗۘۚۘ۬ۦۤۡۙۨۘ۠ۖۗۥۧۥۛۚۢ۠ۡۙ۫ۙۖۘ۟ۘۜۖۚۜۘۖۡۧۢۨۘ۟۬ۖۘ۟ۡ۬ۗۘۚۢ۠ۡۢۙۢۚۚۢۥۡۨ۫ۙۙۗۡۧۨۗۢۘ۟ۧ۬ۗۜۛ۫ۡۜۘۛ";
                                            break;
                                    }
                                }
                                break;
                            case 770720148:
                                str2 = "ۘۤۗۖ۫ۙۥۚۗۦۥۧۘۡۜۦ۫ۥۛ۠۟ۨۡۤۘۜۚۗۥۤۥۘۢۖۡۘۗۧۡۘۖۢۖۥۤۙۛۗۤۤۚۦ۬ۚۜۜۨۗۖۗۜۘۘۜۥ۫ۦۘ۟ۜۘ۫ۙۙۥۧۥۘۤ۠۫ۦ۬۫ۛ۠";
                                break;
                        }
                    }
                    break;
                case -1134025219:
                    z = true;
                    str2 = "ۙۨۡ۠۬ۦۘۛ۫ۖۤۖ۫ۦۚۦۗۢۚۖۗۡۛۢۧۖ۠ۦۜۘۖۘ۬۠ۖۡۜۦۘ۬ۖۦۘ۬ۥ۟ۡۦۙۜۨۢۙۡۜۘۙۙۥۘۘ۬ۖۧۗۘۧ۠ۡ";
                    continue;
                case -1062813151:
                    str = packageInfo.versionName;
                    str2 = "ۨۗۧۢۨۧۘۡ۠ۛۦۛۢۢۡۖ۫۟ۢ۟۠ۜۦۘۘ۬ۚۗۜ۟ۘۘۨۤۖۛ۠ۡۛ۟ۘ۫ۦۢۢۘۤ۫ۚۨۤۢۡۘۖۚۦ۬ۤ۫۟ۨۙۖۨۖۘ";
                    continue;
                case -784162543:
                    str2 = "ۗۘ۠ۡۥۘۜۥ۠۫۟ۨ۬ۦۧۘ۟ۥۙۘۘ۟ۥۨۘۤۦۡۘ۬ۖۜۘۗۤ۠ۗۙ۬ۤۖ۟ۥۡۖۚ۟ۜۜ۬ۥۙۜۨ۠ۧ";
                    continue;
                case -619786390:
                    str2 = "ۜۗۦۖۛۨۘۤ۟ۡۘۨۖۦۖ۫۠ۢۚۛۥ۫ۨۛۦ۬ۜ۟ۧۥۛۗ۫ۡۘ۫ۢ۠ۢۙۘۘۡۖۦۘۡۗۛۙۨ۫۠۫ۢۘۗۙ۟ۦۧۦۥۢۛۘۡ۠۠ۘۘۜۘ۟ۧۥۘۛۖۥۘۨ۬ۡۖۥۖ";
                    continue;
                case -444400014:
                    String str9 = "ۙ۫ۡۘۛۘ۬ۤۧۜۨ۫ۥۤۢ۟۟ۜ۬ۘۘ۟ۡۧۥۡۢۖۢۢۚۧۘۜۛۛۘۥ۬ۘۘۢۘۡۘۙۨۘۙۘۡۦ۫ۦ۫۫ۡۘۘۧ۠ۢۜۥۘۚۛۖۘ";
                    while (true) {
                        switch (str9.hashCode() ^ 1393939203) {
                            case -1770133554:
                                break;
                            case 233178748:
                                str2 = "ۙۘ۟ۨۙۦ۬۫۫ۙۧۚۖۧۧۧ۠۬ۗۦۡۜ۟ۡۘۥۢ۟ۨۘۥ۟ۚۖۚۜۨۜۖۧ۟۫۠ۛۛۗۜۚۧۜۢۦۚ";
                                break;
                            case 1422830118:
                                String str10 = "ۥۧۦۘۚۗ۠ۖۖۜۘۥۛۘۖ۫۠ۛ۬ۦۘۡۙ۟ۢۥۘۤۖۘۨۖۜۘۜۨۗۥ۬ۘۘۗۨۧۘۘۦۘۘۚۛۤۧۦۛ۫۠ۘ۬ۥۤۗۦ۠۬ۡۘۤۛۧۦۤۨۘۤۤۦۘۖ۬ۥۗۜۡۘۥۛۘۛۖۥۘ";
                                while (true) {
                                    switch (str10.hashCode() ^ (-1077448077)) {
                                        case -1659996482:
                                            str9 = "۠ۡۘۗۤ۟۟ۢۧۘۙۜۘۧ۠ۖۘۜ۫ۧۗ۫ۧ۟ۙۖۘ۫ۦۛ۟ۚۨۘۗۜۡۘ۫۬ۡۘۦۤۦۘۤۧۥۘۖۡ۠۫ۡۦۘۙۥۥۘۙۘۛ";
                                            break;
                                        case -1223547892:
                                            str9 = "ۙۡۤ۫۫ۜۘۨۥ۬ۘ۬ۢۖۧۖۛۤ۫۟ۘۥۚۥۜۗۨ۟۫ۛۥۘۤۚۧۙۛۦۘۡۤۛۛۚۨۙ۟۫ۤۛۘۘۜۡۚۤۚۖۘۦۛۤۛ۬ۛ۠ۤۥۛۨۢۘۖۙ۟ۘۥ";
                                            break;
                                        case -1086995176:
                                            String str11 = "ۡۙ۟ۜ۫ۙۦۧۘۘۥۤ۠ۖ۠ۘۙۡۘ۬ۥۘۚۨۦۖۖۥۘۛۤۥ۫ۨۖۗۖۥ۠ۥۘۘۤۡۜۘ۟ۥۜۘۜۗ۠ۙۙۗۜ۫ۢۦۗۢۙۡۘۗۤۡ۬ۚ۠ۦۘۘ۫ۥۦ";
                                            while (true) {
                                                switch (str11.hashCode() ^ 1667199428) {
                                                    case -301276318:
                                                        str11 = string != null ? "ۧۡۨۥۚۧۖ۬ۤۖۧۙۦۥۨۗۦۘۢ۠۫ۦۥۙۚۨۦۨۦۘۤ۬ۨۘۛۖۦ۫ۙۜۘ۟۫۫ۛ۠ۤۙ۠۫ۧۘۡۧ۟ۥۙۙۦۧۙ۬ۢۘۘۙۦ۬ۨ۠ۢۦ۫ۜۜۜۤۛۛ۟۟ۗۛ" : "۠ۖۜۘۜۛۜۖۘۚۜۗۨۘۤۨۥۜ۬۟۠۠ۧ۫ۛۦۨۛۦۘۗۡۛۜۥۨۘ۠ۧۨۢۡۢۖ۫ۤ۬ۖۥۘۗۧۛۧۜۘۘۛۚۥ";
                                                        break;
                                                    case 139267293:
                                                        str11 = "ۜۛۛ۠ۖۡۨۤ۟ۨۤ۠ۘۧۗۙۢۤۨۘۨۛۧۡۜۤۖۨۨۛۙۗۦۦ۬ۘ۫ۖۘۥۤۘۤۛۘۘ";
                                                        break;
                                                    case 853050084:
                                                        str10 = "ۜۦۖۡۦۧۘ۠ۖ۫ۥ۠ۜۘۡ۠ۜۘ۟ۢ۟۟ۡۛۡۜۥۤۢۗۥۜۦۜۗۨۗۘۦۘۗۥۢ۟ۦۘ۟ۖۡۘ";
                                                        break;
                                                    case 1911078622:
                                                        str10 = "ۥۨۜۢ۟ۨۘۗۘۥۥۤۦۘۖۘۥۦ۠ۧۥۘۜۥ۫ۦۘ۬ۙ۫ۧۢ۠ۥۙ۫ۢۡۥۨۛۡۚ۟ۨۤۢ۠ۙۡۖۖۛ۫ۢ۟ۥۘۨۙۡۘۛ۟ۥۘۢۦۢۧ۟۬ۚۢ۬ۙۢۖۘۘۡۡۘۧۗ۟ۥۙ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 128871507:
                                            str10 = "ۙۥۙۘۨۘۘ۠ۚۥۤ۠ۤ۠ۡۨۘ۟۫۟ۙۤۦۜۚ۬ۛ۟ۖۘ۬۠ۧ۟ۧۖ۠ۤۨۦ۟ۢۦۘۙ۟ۘ";
                                            break;
                                    }
                                }
                                break;
                            case 1478074220:
                                str9 = "ۨ۟ۤۘۤۥۖۢۨۘۘۛۨۘ۠ۦۥۘۦۙۘۘۥۥۦۨۢۘۚۡۤۤۘۘۗۦۨۘۛۜۨ۫ۖ۠ۧۘۜۖۨۘۘۦۖۦۘۡۚ۟۫ۡۤۥۡۖۚۧ۬ۦۨۨۨۧۢ۫ۚۘۘۧۜۧۘۢۜۜۧۨۚۢۚۙ";
                                break;
                        }
                    }
                    break;
                case -341056533:
                    str2 = "ۗۘ۠ۡۥۘۜۥ۠۫۟ۨ۬ۦۧۘ۟ۥۙۘۘ۟ۥۨۘۤۦۡۘ۬ۖۜۘۗۤ۠ۗۙ۬ۤۖ۟ۥۡۖۚ۟ۜۜ۬ۥۙۜۨ۠ۧ";
                    z6 = z5;
                    continue;
                case -216870671:
                    String str12 = "ۚۛۤۚۡ۬ۨ۫ۖۘۡ۫ۜۦۚۥۘ۟ۘۢۜۡۨۘۦۖ۫ۨۘۘۨۨ۬۫ۦۘ۟ۘۨۗۦۧۘ۫ۛۡ۬ۧ۟ۨ۬ۘۧۨ۫ۗۛۖۘۡۙۙ۠ۘۥۘ۠ۢ";
                    while (true) {
                        switch (str12.hashCode() ^ 147155877) {
                            case -1955399834:
                                str12 = "ۧۨۚۘۧۨ۟ۗۨۛۜۘۗۚۚۦ۫۟ۘۨۤۘۛۨۘۡۥۗۗ۬ۘ۠ۦۨۤۥۜۘ۟ۢۨۘۘۢ۫ۖۜ۬ۛ۠۠ۧۖۡۘ۬ۜ۠";
                                break;
                            case -1337267265:
                                break;
                            case -64792033:
                                String str13 = "ۚۙۦۘۦۦۚۧۤۤۥۨۜۦۛ۫ۡۜۙۦۜۘۨۘۤۛۛۖۘ۟ۚۨۘۗۖۗۘ۬ۦ۬۬ۨۛ۠ۦ۟ۖۘ";
                                while (true) {
                                    switch (str13.hashCode() ^ (-926065734)) {
                                        case -1834882993:
                                            str13 = "ۤۤۢۛۥۚۙۡۜۘ۟ۤۥۘۙۙۤۙۜۘۛ۠ۘۘۖۚۥۨۦۨۦۘۗ۟ۗ۫ۜۧۧۨۘۘۙۤۡۤۘ۟ۤ۟ۧۨۙۡۘۛ۠۟ۚۛۢۜۙۢۢۖ۬ۢۢۖۖۤۨۧۢ۟";
                                            break;
                                        case -342149326:
                                            str12 = "۟ۙۢ۟ۛۙ۟ۚ۫ۤۘ۬۬۟ۙۜۚۖۤۗۜ۫ۛۧۡ۟ۢۘۡۘۖۜۜۘ۫ۛۛۗ۟ۗۨۘۗۗۦۛ۫ۙۧۖ۠۬ۧ۟۬ۢۘۖۚۘۙ۬ۨۘۘۜۘۦۘ۠ۡ۠۟ۘۥۘۚ۠ۥ۫";
                                            break;
                                        case -122617328:
                                            str12 = "ۘ۠ۚۤۡۖۘ۫ۙۜۗۦۘۥۥۗۖۧۨۘۡۘۜۘ۬ۥۨۛۡۜۘۖۜۦۘۜۥۨۘۦ۠۟ۥۜ۠ۖۦ۫ۦۙۜۘ";
                                            break;
                                        case -80701610:
                                            String str14 = "ۚ۠ۚۘۜۚۘۦۘۧۡۦۥۤۨۨۨۥۗۗۨۚ۬ۘۘۖۡ۫ۧۖۙۥۚۘ۟ۛۦۘۧ۟ۖۜۧ۬ۦ۠ۙۚۧ۟ۦۨۢۛۡۘۘۤۖۘۘۤۘۦۘۥۧ۟ۡۦۤۧۙ۬ۨۗۛ";
                                            while (true) {
                                                switch (str14.hashCode() ^ (-58897778)) {
                                                    case -1409782125:
                                                        str14 = "ۢۘۤۛۥ۟ۖۜۦۖ۟ۜۖۜۡ۬ۙۖۢۢۡۘۢۜۚۘۤ۠ۥ۠ۧۖۘۖۘۥۥۥۘۜۦۦۤ۠ۜۡ۫ۚۙۡۦۘۢ۟ۛ۬ۛ۬۫ۜۢۖ۫ۦۚۨۢۡۖۧۗ۟ۛۨۘ";
                                                        break;
                                                    case -883500709:
                                                        str13 = "ۧۗۦۗۥۥۘۜۘ۠ۘۥۨۤۢۚۡۢۡۘۛۚۢۚۙۢۤۤۨۗۛۗ۠ۡۘۥۖۨۛۙ۠ۥۡۘۡۚ۬";
                                                        break;
                                                    case 1224109502:
                                                        str13 = "ۚۘۗۗۡۡ۫ۜۖۥۜۛۧ۠ۢۧۤۘۖ۟ۙۙۜۤۖۘۜۦۗۨۚۧۘۤۧ۟ۗۦۘۘۘۘۡۗۨ";
                                                        break;
                                                    case 1825946465:
                                                        str14 = z4 ? "۫ۜ۬ۘۦ۫۠ۦۨۗۚۧۗۛۛ۠ۤ۠ۚ۫ۙۗ۟۟ۤۤۡۖۥۘۘ۬ۦۜۢۥۜۘۢۘۥۘۦۤۖۘ۠ۧۙۚۨۖۘۚۘۜۧۨۨ۠ۜۘۡ۬ۧۖ۫۫" : "ۤۨۘۨۗۘۘۘۖ۫ۜۘۧۖۢۘۚ۠ۛۧ۫ۥۘۗۡۘۜ۟ۦۘ۟۬ۘۖۜۦۘۧۨۧۘۤۡۦۘۗۡۡۘۥۘ۫";
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 1814413628:
                                str2 = "ۢ۫ۨۥۗۛۙۚۖۘ۫ۧۚۨۧۢۧۚۖۘۤۡۨۘۥۢۦۘۧ۬ۜۘۜۢۙۗۧۨۘۦۡۖۢۙۡۘۚۘۙۜ۠۫۠۫ۖۜ۟ۡۘۥ۬۬ۚۘۨۖ۟۟۠ۚ۟ۗۙۖۚۥۡۘۧ۬ۘۘ";
                                break;
                        }
                    }
                    break;
                case -85680027:
                    packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 128);
                    str2 = "۫ۤۥۘۨۘۗۙۖۜۤۧۨۘۙۤۘۘۦۢۙ۫ۘۘ۟ۤۙ۠ۗۚۨۨ۬ۜۡۥۘۛۦۘۤۛۥۡۦۜۖۥۥۤۘ۠ۤۥۜۘۖۗۖۘۦۢۜۘ۠ۡۗۨۡۢۘۗ۠ۡۗۧۦۥۜ";
                    continue;
                case 109997509:
                    bundle = applicationInfo.metaData;
                    str2 = "ۛۤۖۛۦۡۗ۠ۦۨۦ۠ۖۗۢۚۦۖ۠ۜۥۡۢۨۘ۬ۜۤۖۨۧۘۜۦۗۙۢۢۚۨ۠ۡۚۨ۟۟ۥ۬ۘۦۘۘۥۚۙۤۢۤۘۘۖۡۖۘۥۧ۫";
                    continue;
                case 314604098:
                    str2 = "ۤۘۘۚۙۨۘۘ۬ۦۘ۠ۜ۠ۦۡۧۧ۫ۛ۟ۦۚۡۢ۟ۧۜۜۘۧۡۜۘ۟ۘۨۘۛۦ۟۫ۚۦۡۦۦۘۡۤۛۤۧۘۘۖۘۢۙ۬۬۠ۥۘۘۘۛۥۙۢۖۘۗ۟ۢۨ۬۠۠۠";
                    continue;
                case 591184669:
                    String str15 = "۬ۧ۠ۤۨ۫ۙۚۛۦ۬ۖۘۘۨۨۛۧۨۡۢۧ۟ۜۖۘۖۦۧۘۗۤ۠ۛۛۖۖۨۜۘ۬ۚ۠ۤۢۧۦۚۨ۟ۚۥ۬ۜۦۘۖۗۜۘ۫ۙۘۘۦ۟۫ۢ۬ۥۘۦ۬ۖۢۘۘۥۛۦۘۥ۫ۧۧۡۘۜۤۖۘ";
                    while (true) {
                        switch (str15.hashCode() ^ (-1774258207)) {
                            case -1271799947:
                                break;
                            case 1066779763:
                                str2 = "ۤۤۗۤۥ۬ۦۦۙۚ۠ۥۖۤۥۘۥۨۦۘ۠۠ۥۘۧ۫ۥۘۦۨ۠ۤۛۤۥۘ۠ۢۢ۠ۢۚۜ۫ۤۨۢۨۘۦۡۥۘۥۘۛۧۥۧۨۛۤۙۢ۫ۗۖۜ۫ۖۢۙۢۜۖۧۜۚۗۙۛۘۖ۠ۥۜۘ";
                                break;
                            case 1338001282:
                                str15 = "ۚ۟ۗۢۖۥۧ۠ۙۦ۬ۢۦ۟ۘ۫ۜ۫ۡۥۘۤۙۦۘۗۤۚۧ۟۫ۖ۫ۙۦۚ۬ۡۡۘۘۥۧۘ۫ۨۦ";
                                break;
                            case 1657380642:
                                String str16 = "ۜۧۥۢ۟ۨ۠ۦۧۖۨ۠ۢۙ۠ۛۚۛ۬ۚۧۜۙۡۧۚ۠ۥ۫ۥۗۧۜۗۢۨۘۙۛۖۜۤۨۚۙۙ۫ۛۘۘ۬ۚۖ";
                                while (true) {
                                    switch (str16.hashCode() ^ 1781740577) {
                                        case -766563070:
                                            String str17 = "ۡۨۥۘۥۥ۟ۢۧۦۘ۫۫ۜ۫ۦ۠ۖۗ۟ۘ۬ۥۘۖۘۢ۟ۡۚۢۚۢۧ۬ۥۘۖۢ۟ۖۦۥۘۡۡۖ۫ۙۖۘ۬ۡۧۘ۫ۥۖۘ۬۠ۘۘۨ۠ۖۗۤۧ۬ۙۜۨۚۡۘ۫ۡۦۖۡۦۘ";
                                            while (true) {
                                                switch (str17.hashCode() ^ (-1006499715)) {
                                                    case -1556924827:
                                                        str17 = "ۦۜۘۘۛ۫ۢۗۘۥۨۦۘۦۥۡۘۨۘۜۥ۠ۜ۬ۖۚ۬ۢ۫ۦ۫ۧۦۥۧۘۖ۫ۤۚۥۘۘۤۗۦۚ۬ۥۜۜۚۘ۟ۡۨ۟ۜۘ۠ۨۢۧ۟۬ۦ۟ۘ۫ۥۤۛۙۨۘۙۤۦ";
                                                        break;
                                                    case -450632145:
                                                        str16 = "۫۫۟ۧۦۧۥۥۦۘۚ۬ۙۖۗۨ۬ۦۨۗۡۜۥۙۖۘۗ۬ۛۨۚۨۘ۟ۙۚۥۡۡۨۤ۫ۗ۫ۜ۠۠ۜۘۖۙ۠ۘ۬ۛۨ۠";
                                                        break;
                                                    case -51319556:
                                                        str17 = bundle != null ? "ۚۡۖۤۡۦۘ۟ۦۖ۟۬ۛۙ۬ۚۗ۟۬ۖۗۘۘۖۛۘۘۘۡۡۘۥۖۧۘۗ۫ۗۘۢۧۘۥۤۗۤۛۨۛۦۘۢ۬ۨۘ۠ۙۦۘ۟ۛ۟ۜۡۖۤۗۤ۠ۛۙ" : "ۢۖۖ۬ۜ۠ۤ۟ۡۥۜۖ۬ۦۗۥۖۛ۬۫۬ۡۘۡۘۚۦۛۧۤۧۢۜۙۡ۬۠ۢۚۗ۠ۗۗ۫ۘۘ";
                                                        break;
                                                    case 1152063286:
                                                        str16 = "ۗ۬ۖۘۨۜۧۧۥۡۖۨۘۥۚ۫۫۬ۨۘۤۜۙۤۤۙ۠۬ۘ۠ۗۧۜۘۘۖۦۘۙۧۙ۬ۜ۫ۘ۟ۧۘ۫ۨۥ۠۟ۨۚۛۦۡۘ۠ۢۖۘۢۨ۬۟ۖ۠ۛ۟ۡۘۚۢۗ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 762012468:
                                            str15 = "۬ۖۖۥ۟ۨۧۡۘۘۨۨۢۥۗۡۘۤ۬۟ۦ۟۠۫ۦۦۧۥۘ۠ۘۖۙۨۘۘۥۧۗۚۨ۠ۘۖۦ۠ۘۤۙ۬ۜۙۧۥۚۡۘ";
                                            break;
                                        case 845020011:
                                            str16 = "۟ۘ۬ۥۥۘۧۜۡۘۧۧۨۘۜۖۖۛ۠ۚۗۛۜۘۤۤۧۙۜۥۧ۫۟ۛ۟ۛۙ۠ۨ۠ۦۜۧۧۤۨۡۢۥ۠۬۬ۛۥ۟ۥۜۛۘۡۨۜۡۙ۟";
                                            break;
                                        case 1098059790:
                                            str15 = "ۜۖۛۢۦۨۨۡۤۙ۠ۘۦۘ۟ۚ۠ۘۚۛۥۧ۟ۢۜۥۘ۫ۛۜۛۦ۟ۤ۫ۚ۬ۧۥۘ۫ۧۢۢۦ۠";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 755929524:
                    "app";
                    str2 = "ۚ۫ۥۤۜ۬۫ۜ۫ۘۦۘۛۦۙۨۚ۫۬ۜۛ۬ۚۘۜۘ۟ۤۥۚ۟۬ۛۙۡۚۥۖۥ۟ۘۙۙۛۚۢۜۘۦۘ۠ۘۢۖۘ";
                    continue;
                case 783787037:
                    z5 = false;
                    str2 = "ۚۧۜۘۜۛۨۘۚ۠۬ۦ۫۫ۨۘۤۢۚۢۛۖۜۘ۬ۛۦۢۗ۬ۨ۠ۘۘۤۖۘ۬ۥۥۥۡۛۜۡۘۡۦۨۘۜۘۥۘۧۘۖۖۚۨۘۡ۬ۡۢۙۢۥۙۥ";
                    continue;
                case 828271340:
                    classLoader = C0292l3.m1138().getClassLoader();
                    str2 = "ۗۖۘۡۚۘۘۢ۬ۡۛۜ۬ۘۜۘ۟۟ۨ۬ۖۧ۬۟ۨۘۦۦۤۥۜ۫۠ۚۦۤۤۡۘۘ۠ۛۥ۟ۗۚۖۘۚۤۥۘۢۢۛۥ۬ۜۤۘ۟ۖۖۤۤۡۖۘۧۧ۬ۜۗۘۘۙۦ";
                    continue;
                case 841610428:
                    str2 = "ۡۤ۟۟ۢۗ۟۠۟ۥ۠ۡۘۨۨ۫ۚۚۦۘۢ۠۠ۦۤۦ۬ۨ۠ۤۖۛۖۗۤۚۜۨۜۛ۠ۘۥۧۜۨۖۤۡۘۘ۠۬ۨۘۗۨۜۘ";
                    z4 = z3;
                    continue;
                case 977812252:
                    z2 = true;
                    str2 = "ۢۢۦۘۚۦ۬ۚ۬۠۠ۙۥۘۚۛۗ۫ۥۚۛۘۡۜۛ۟ۛۨۤۨۚۛۚ۫ۛۙۥۥ۬ۨۛۙۗۙۨۚۖۘۖۦ۫۫ۗۘ۟ۧۥۢۧۤۙ۠ۖۧۧۦ";
                    continue;
                case 1033354022:
                    int i = C0330o.f1000;
                    str2 = "ۥ۠ۗۡۙۖ۫ۡۡۧۗ۠ۡ۬ۦۡ۠ۜۘ۟ۥۘ۠ۤۤۖ۬۫ۦۘۥۢ۠ۧۙۥۘۛ۟۠۟ۨۥۘۗۘۡۘۗۨۘۚۢۚۢۤۥۘ";
                    continue;
                case 1053040493:
                    return;
                case 1091609338:
                    application.registerActivityLifecycleCallbacks(new C0369r(this));
                    str2 = "ۛۜۖۘۥۙۜۦۗ۟ۨۢۗۥۜۘۥۧ۠ۖۜۜۤۧ۠ۗ۠ۦۜۘۦ۟ۥۧۛۙۨۘۙۙۥۤۧۥۘۗ۫ۜۜۦۘۜۥۜۘۜۘۥۘۤ۬ۘۘ۟ۘۥۧۥۖۡۛ۠۠ۨۤۜ۠۬ۗۥۗۤ۠۫ۡ۠ۘۘ";
                    continue;
                case 1113981833:
                    C0292l3.f1686 = packageInfo.versionCode;
                    str2 = "ۛۦۛۤ۟ۢۜۛۡۖۘۤۘۗ۫ۖۖۙۦۙ۫۫ۦۜۡۚۦۘۛۨۗۡۛۦۗۜۖۡۦۡۗۘۨۙۗۙ";
                    continue;
                case 1411151898:
                    "pInfo";
                    str2 = "ۜۙۖ۠ۧ۟ۤۢ۫ۙۚۖۙۨۘۛۜۥۚ۠ۦۘ۠۫ۤۚ۬ۤۙۨۨۘۛۖۦۛۗۘۘۦۘ۫۟ۥۥۘۦۗۗۤۛۡۘۙۦ۟ۢۢۖۘ۠۬ۨ۟ۨۜۘ۬ۥۜۘ";
                    continue;
                case 1595282881:
                    C0292l3.m1143(application);
                    str2 = "ۧۛۗۧ۬ۥۙۗۨۢۚۖۡۗۛۡۦۖۛۛۜۘۧۥ۟ۨۙۥۘ۟۟۠ۘۖۘۘۡۧۗۥۙۚ۟ۛۢۢۥۘۙۨۥۡ۬ۡۘۜۘۥۗۥۜ۬۬ۚ";
                    continue;
                case 1628378911:
                    z3 = false;
                    str2 = "۫ۛۦۘۗ۫۟ۢۨۦۘۗۦۡۘ۟ۗۨ۫ۦۥۘ۬ۥۙۙۜۥۙۡۡۘ۬ۚۘۘۚۥۦۧۥۗۥۢۡۘۗۛۥۘۨۙۤۢۛۙۥۨۨۥ۫ۜۘۥ۫ۧۡۙۦۘۜۥۘۘ";
                    continue;
                case 1924362156:
                    applicationInfo = packageInfo.applicationInfo;
                    str2 = "ۥ۟ۜ۟ۦۦۛ۠ۛۛ۠ۘۘۥۙۨۨ۫۠ۡ۬ۘ۬ۢۥۘۧۛۨۘۛۗۥۘۖۖۨۥۜ۠ۤۧ۟ۘۖۗ۠ۗۢۤۖۦۚۦۢۤ۬۫ۚۢۘۘ۠ۤ۬ۨۛۥۘۢۗۜۤۧۧۢۛۖۘ";
                    continue;
                case 2028169232:
                    C0292l3.m1144(str);
                    str2 = "ۥ۬ۤۢۢۨۘ۫ۡ۠ۚ۬۠ۛ۫ۥۦۚۜۘۨۖۙۢ۟۠ۜۙۥۘۜۖۡ۫ۗۜۛۚۜۤۦ۫ۦۗۙۙۨ۟ۥۖۦۘ۫ۧۥۘۚۢۛ۟ۚ۬۬ۘۘۧۦۧۘۚۙ۫ۛۜۜۘ۟ۥۘ";
                    continue;
                case 2044859776:
                    str2 = "ۡۤ۟۟ۢۗ۟۠۟ۥ۠ۡۘۨۨ۫ۚۚۦۘۢ۠۠ۦۤۦ۬ۨ۠ۤۖۛۖۗۤۚۜۨۜۛ۠ۘۥۧۜۨۖۤۡۘۘ۠۬ۨۘۗۨۜۘ";
                    continue;
                case 2112841415:
                    "application";
                    str2 = "۠ۢ۫ۨ۠ۘۛۛۙۖۚۘ۠ۤۛۥۚۡۘۛۨۨ۟ۖۖۥۘۜۘ۠ۘۢۨۤۧۨۚۘۘۙۥۖۖۛ۠ۜۡۜ";
                    continue;
            }
            str2 = "۫ۘ۠ۗۤۧۙۛۛۘۗ۫ۚۢۥۤۦۘ۫ۗ۟ۥ۟ۛۤۘۦ۬ۤۨۘۦۡۦۘ۟ۘۙۥۖۘۦ۟ۜۘۤۢۘۘۜۧۥۛۛۖۘۘۡ۫ۖۙۙۜۢۛۘۤۖۘۨۨۥۧۖۚۨۘۜ۠۟ۘۡۦۡۘ۬ۚۘ";
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡ */
    public abstract void mo1116(XC_LoadPackage.LoadPackageParam loadPackageParam);
}
