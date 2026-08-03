package p001;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.skyhand.redbookhelper.utils.sqllite.AppDatabase;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

/* JADX INFO: renamed from: ۟.k8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0283k8 extends AbstractC0356q {

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static C0274k f1632;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static String f1633;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public String f1634 = "com.xingin.xhs";

    /* JADX INFO: renamed from: ۟.k8$a */
    public static final class a {
        /* JADX INFO: renamed from: ۥ */
        public static AppDatabase m884() {
            AppDatabase appDatabaseM9;
            AppDatabase.C0016c c0016c = AppDatabase.f1294;
            Context context = C0292l3.f937;
            String str = "۟ۗۨۦۖۧۛۨۢۖۦۛۖۥۚۖۚ۫ۖۘۚۤۜۘۙۚۨۘۨۧۚۨۢۨۘۢۤۤۦۙۙ۬۠ۜۦۙۨۘ";
            while (true) {
                switch (str.hashCode() ^ (-1728256313)) {
                    case -815706799:
                        str = "ۜۚ۫ۙۙۖۘ۫ۗۥ۬۟۟ۧۛۜۘۛۧۚۗۦۢۜۜ۠ۡۖۡۘۥۘۘۥۛۘۘۖۜ۟ۙ۫۠۫ۦۢۥ۟ۢۤۦۛ۠ۗۛۛۜۘۛۥۛ۟ۧۥۢۜۘ";
                        break;
                    case 188262121:
                        C0237h4.m1092("context");
                        throw null;
                    case 789188421:
                        "context";
                        AppDatabase appDatabase = AppDatabase.f1295;
                        String str2 = "ۙۥۘۘۡۡۥۘۨۗۗۢۜۦۘۚۛۥۘ۫ۥ۠ۘۛ۟ۘ۟ۛۖۥۦۘۨۖۜۘۗۧۦۙۥۘۢۜۘۨۛۥۘ۫۟ۨ۟ۡۘۤۦۡۘ۬۟۟ۨۗۥۢۤۦۘۛۢ۟";
                        while (true) {
                            switch (str2.hashCode() ^ 1369798459) {
                                case 489016361:
                                    synchronized (c0016c) {
                                        appDatabaseM9 = AppDatabase.f1295;
                                        String str3 = "۫ۘۢۙۚۖ۟۫ۨ۟ۛۨۖۦ۠۫۟ۙ۬ۘۢۘۖۘۘۛۖۜۗۥۖۘ۠۟ۜۘۖۥۖۤۗۘۙ۬۠ۢۛۦۛ۠ۥۥۘۗۜۤۢۚۚۛ۠ۧۙۖۧۘۙۦۤۙۨۙۛۖۧۘ";
                                        while (true) {
                                            switch (str3.hashCode() ^ 1680425605) {
                                                case -912503055:
                                                    String str4 = "ۡۦۦۘۤ۠ۜۛۡۗ۫ۥۘ۫ۘۡۧۛۢۘۘ۬ۘۖۘۦۢۘۘۢۖۛۨۖ۠ۥۧ۟ۛۘ۫ۢۡ۟ۨۗۨۥۡۙۖۘۧۡ۟ۜۛۚۧۦ۬۟";
                                                    while (true) {
                                                        switch (str4.hashCode() ^ 615779302) {
                                                            case -1450135730:
                                                                str4 = "ۡۙۤ۫ۙۜۘۥۛ۬ۚ۟ۜۗ۟ۜۘ۟ۧۜۘ۠ۤۖۛ۫۫۠ۗۡۘ۟ۚۖۘۨۛۨۖۤ۫۬ۢۜۙ۫ۛۙۛۨۚۢۥۨۡۥۘۘۨۚۛۖۚۘ۟۫ۥ۠ۖ۬ۡۘۖۢ۟";
                                                                break;
                                                            case -1396246629:
                                                                str3 = "ۥۚ۫ۛ۟ۛ۠ۜۡۘۖۦۖۚۛۢۜ۠ۡۗۨۤۗ۟ۧۘۘ۠۫ۢۤ۠۬ۘ۬۟۠ۢۡۡۨۦۘۘ۫ۙۧۡۖۛۨۧۘۨۡۤۦۘۥۘۡ۠ۦۨۤۡۡۘ۟ۥۗۧ۫ۜۘۨۗۗ۟ۢۜۘۚۛۡ";
                                                                continue;
                                                                continue;
                                                            case 227839372:
                                                                str3 = "۬ۢۡۘۢۗۢۦ۫ۚۛۨۘۚۘۙۥۘۤۧۜۜ۠ۢۜۘۛۘۢۖۦۖۥۘۡۘۥ۫ۦۘۜۥ۟ۥۛۡۥۡۘۙۜ۠۠۫ۛۙ۟ۙۤۨۤۨۡ۫ۖۘۢۢۚۘ۟ۖۛۖۛ۟";
                                                                continue;
                                                            case 533723582:
                                                                String str5 = "ۦۧۧۖ۬ۡۘ۫۟ۥۗۡۧۤۤۚۜ۬۫ۨۦ۟ۡ۫۬ۡۥۗۧۛۛۛۨۨۘۢۨۨۘۡۡۡۘۡ۠۫ۜۚۦۘۚۗۡۘۢۛۚۚۗۡ۬ۖۧۘۧۡۗ۟ۙ۟۬۠ۤۚۧۙۜ۬ۨۘۡۘۘ۫ۡ۫ۨۜۢ";
                                                                while (true) {
                                                                    switch (str5.hashCode() ^ (-1577427826)) {
                                                                        case -1113494486:
                                                                            str4 = "۠ۗ۟ۦۡۡۘۘۙۛۦۚۖۜۤ۠ۡۜۗ۟۫۟ۢۜۧۛۤۨۨۖۡۘۚۡ۫۠ۥۖۘۥ۠ۡۘۤۛ۫ۛۛۥ";
                                                                            break;
                                                                        case -358319191:
                                                                            str5 = appDatabaseM9 == null ? "ۧۜۧۘۡۜۖۘۥۜ۬۟ۦۧۚۢۧۢ۫ۢۤۘۘۦۨ۠۬ۤ۫ۡۘۧ۠ۦ۠۫ۦۘۧۖۛۚۥۖۘۙۚۘۘۘ۬ۥ۟ۤۘۥۢۗۜۦۘ۫ۖۦۥۚۧۧۚ۟ۨ۟ۛۢۗۨ" : "ۨ۟ۚۜ۠ۦۢۖۡۘ۠ۨۦ۬ۦۘۥ۠۠ۘۡۜۚۢۨۜۘۚۗۨۘۜۘۛۡۡۡۦۦۥۘۙۨۧۘ۟ۥۦۥ۠۬ۢۖۦۨ۫ۜۘۗۢۥۘۖۖ۟ۛۜۦۥۗۧۛۨۨۘ۬ۖۢ";
                                                                            break;
                                                                        case 1233274274:
                                                                            str4 = "ۗۧۘۨۨۦۘۘۥ۟ۨۜۜۛۖ۫ۚۢۦۨۘ۟۟ۛۖۗۥ۠ۨۘۢۖۜۘ۬ۖۦۘۢ۟ۧۖ۠ۥۦۦ۟ۢۥۙۢۧ۠۬۠ۗۧۧۨۢۦۘ۬ۧ۟ۥۜۜۘۗ۠ۘ۫ۚ";
                                                                            break;
                                                                        case 1598644152:
                                                                            str5 = "۟ۘ۬ۙۨۥ۠ۘۚۥۜ۟۠۫۫ۖۖۚۨ۟۫ۧۧۨۘۛۨۥۘۛۨۨ۬ۗۖۚۜۖۚۙۨۘۦۤۜ۠ۤۜۘ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -25336740:
                                                    str3 = "ۜ۠ۜۥۖۦۛۡۥۥۨ۬ۡۥۦۘۧۛۨۥۜۦۢ۬ۜۘۢ۠ۦ۠ۨۘۖۛ۟ۡۜۢۛۛۛۖۘۧ۠ۖۘ";
                                                    continue;
                                                case 42165976:
                                                    break;
                                                case 2089181120:
                                                    appDatabaseM9 = AppDatabase.C0016c.m9(context);
                                                    AppDatabase.f1295 = appDatabaseM9;
                                                    break;
                                                default:
                                                    continue;
                                            }
                                        }
                                    }
                                    return appDatabaseM9;
                                case 1033411083:
                                    str2 = "ۢۥۢۥ۟ۥ۟ۨۚۙ۫ۙ۟ۥ۬۟ۢۨۜۧۖۦۤۚۢۚۧۚ۬ۚۙۙۛۨۡۘۤ۬ۖۘۦۚۗۤ۫ۦۘۦۘۧۘۧۡۡۘۗۖۜۘ";
                                    break;
                                case 1105103119:
                                    return appDatabase;
                                case 2128440746:
                                    String str6 = "ۙ۠ۨۘ۟ۡۗۗ۟ۨۚۚۧۢۡۥۛ۬ۥۥۙۖۘۚۧۨۛۗۨۘۦ۬۟ۜۚۡۘ۫ۦۨۚۗ۫ۤ۟ۨۘ۟۫ۤ۬ۜۘۧۦۘۧۢۜۢ۠ۨ۟ۙ";
                                    while (true) {
                                        switch (str6.hashCode() ^ 2141668237) {
                                            case -783889152:
                                                str6 = "۠۟ۧۨۦۨۘ۬ۦۨۘۙۗ۟ۧ۟ۘۘۢۙۡۘۙ۫ۦۚۨ۬ۢۤۖۘۥۖۧۘۥ۫ۥۘۨۜۚ۟ۘۘۚۘۚۙ۫";
                                                break;
                                            case -293817752:
                                                str2 = "ۥۦۜۘ۠ۘۙ۟ۖۘۘ۬ۦۥ۫ۥۜۦۨۢۨۛۜۙۙۥۗۡۘۛۦۦۘ۠ۥۖۚۦۨۘۨۥۘۘۧۗۤۨۥۤۜۖۘۘۤ۫ۛۙ۬۟۫ۥۤ۠۬۫ۜۘۥۖۤۥۘۖۧۖۘۢ۟ۧ";
                                                continue;
                                            case 378171325:
                                                String str7 = "۟ۘۥۤۥۚ۠ۤ۫ۗۚۘۧۧۡۘۦۘ۠ۜۤۦۙۥۖۥۧۨۥ۫ۦۗۢۡۦۦ۠۟۟۫ۙۤ۬ۦۥۘۗۨ۬ۨۨۖۧۥۖۛۗۗۤۨۜۛ۫ۛۗۖۚ۫ۤۜ۟ۡ";
                                                while (true) {
                                                    switch (str7.hashCode() ^ (-1750362488)) {
                                                        case -1585704624:
                                                            str6 = "ۨۥۨ۟ۙۜۚۥۦۤۘۛۗۤۥۘۢۦۘۛۢۚۨۦۛۜ۫ۜۘۧۤۢۚ۟ۖۖ۠ۜۘۛ۬ۧۙۡۖۗ۠ۖۡۡۗۙۙۡۗۡۦۘۢۛۡۚ۬ۥۘۚ۫ۜۘ۬ۚۡۢۚۡۘ۟ۨۨ";
                                                            break;
                                                        case -863147735:
                                                            str7 = "ۢۙۧۦۜۢ۠۫ۜۘۤ۠ۢۨۧۘۘۥ۬ۧۦۗۥۖۖۨۘۢۤۘۥۥ۠ۘۤ۟ۥۥۡ۟ۥۘۗۨۘۢ۠۟۠ۛۘۨۛۛۦ۬ۦ۬۟ۡۘۗۖۜۘۗ۟ۙۖۧۨۘ۬۠ۦۘۛۡۧۘۜۢۡۘۡۚۡ";
                                                            break;
                                                        case -36814592:
                                                            str6 = "ۨۖۡۘۚۡۨۜۘۤۡۙۨۦۤۥۘۘ۟ۥۘۖۖۦۘۨۘ۠۟ۜۨۚۢ۟۠ۡ۬ۖۙ۟ۜۚۡۤۜۙۤ۟۠ۧۛۜۤۧۢ۬ۤۗ";
                                                            break;
                                                        case 1183356314:
                                                            str7 = appDatabase == null ? "ۦ۟ۖۧ۬۟۬ۡ۫ۚۘۘ۟۫۟۠ۥۚۨۥ۟ۡۘۚ۬ۛۖۧۧۨۜۘۡ۬ۦۘۜ۬ۙۜۥ۫ۜۜۘ" : "ۖۜۘۨۜۧۨۚۤ۬ۜۙۘ۫۫۫ۨۜۢۙۤۗۤ۫۬۬ۧۗۨۙۡ۠ۜۘۛ۠۠ۚۗۜۘ۬ۛ۬ۗ۟۟ۙ۟ۨۖۙۘۘ۬ۨۧۥۦۡۚ۬ۥۘۛۥ۟";
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 2127774137:
                                                str2 = "۟ۙۚۥ۟ۗۧۙۥۦ۟ۗ۬ۛۨۘۜۥۡۙۧۨ۟ۜۤۦۚۚۢۜۚۛ۫۟ۧۦۧۜۥۘۖۖۖۘۦ۫ۜۗ۟۠ۙۤۚۧۧ۠ۢۨ۬۠ۢۧۥ۬ۜۘ";
                                                continue;
                                        }
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1768604179:
                        String str8 = "۫۫ۗۚ۬ۨۘ۬ۚ۠ۥۙۖۤۙۙ۫۠۫ۜۧۚۧۥۗۘۦۥۘۗ۠ۗ۟ۗۘ۠ۜۚۖۨۧۥۘ۬ۦۡۥۘۚ۫۠ۧۨۦۡۜۧۘ";
                        while (true) {
                            switch (str8.hashCode() ^ (-1051245852)) {
                                case -554928098:
                                    String str9 = "ۢۢۨۙۚ۫ۖۘ۟ۦۧۙۘ۠ۖۘۗۛۘ۬ۚۖۦۧۤ۠ۖۜۗ۟۟ۖۥ۫ۜ۟ۧۦۤۥۤۤ۫ۚۦ۟ۤۨۘ۫ۜۘۦ۬ۢۤۘۡۘۡۚۡۜۧۘۗۧۜۨ۟ۤۘۥۜۘۖۧۥۘۦۚۗۖۦ";
                                    while (true) {
                                        switch (str9.hashCode() ^ (-1484270261)) {
                                            case -1822529389:
                                                str8 = "ۦ۬۬ۨ۠ۦۘ۬ۨۘۜۨۨۘۚۦۚۘ۫ۥۦۧ۫ۗ۟ۥۦۤۙۗۤۚۗۦۨۘ۟۠ۘۘ۫۫ۗۢ۟۟ۧۡۗۜۘۥ۟ۤۚ۟ۥۙۖ۬ۙ۬ۚ۟ۡ۬ۨۘۜ۫ۘۘۦۜۘۧۤۚ";
                                                break;
                                            case -1182749902:
                                                str8 = "ۦ۠ۥۛۢۜۘۖۤۡۘ۟ۤۦۘۖۢۘۘ۟ۧۧ۠ۧ۬۬۫ۘۥۢۚ۠ۤۤۢ۠ۨۙۙۡ۠۟ۥۧ۫ۧۜۘۤۡۦۢۦۥۘۢ۬ۨۘۚۙ۫ۡۢۜۘۥۜ۟ۙۤ۫ۧۤۜۗۡۘۗۢۡۨۘۧۨۗۨ";
                                                break;
                                            case -858790629:
                                                str9 = "ۧۤۜۘ۫ۙۚۤۧۘۨۤ۫ۘۦۢۗۗۧۤۘۗۚ۬ۡۘۘۙۢۢ۟۟۠ۤۡۘۡۢۨۘ۟ۘۖۘۗۤۜۗۗۧ۠ۛۧۚۜۜۘۗۖۜۘ";
                                                break;
                                            case 1618467857:
                                                str9 = context != null ? "ۖۜۨۛۧۦۘۥۨۜۚ۫ۘۘۧۗۧۙ۟ۘۘۚۦۘۘۛۨ۫۫ۙۖۗۨ۠ۢ۠ۡۘۧۖ۬ۧۡ۬ۨۥۦۛۦ۬ۙۤۘۖۤۖۨۢۥۘ" : "ۚ۫۬ۥۗۤۢ۟ۚۦۜۡۙ۫ۜ۫ۥۘۘۙۛۦ۫ۛۨ۟ۨۢ۬ۘۨۘۛۧۨۘۖ۠ۘۘۤۘۨۧۥۡۘۘ۫ۡ۬ۢۤ۫ۦۧۨۦۡ";
                                                break;
                                        }
                                    }
                                    break;
                                case 1065974205:
                                    str = "ۤ۫ۖ۟ۛۡۘۢۥۥۨ۬ۛ۫ۤ۫ۛۦۗ۟ۛۦۛۛۨ۠ۗۜۚۥۖۢۜۥۨۧۘ۫ۨۥ۫ۡ۟۫۠ۨۢۥۨۥۧۨ۫ۗۦۘ";
                                    continue;
                                case 1233474630:
                                    str = "ۡ۬ۡ۫ۖ۬۬۠ۛۡۢۦۘ۠۠ۙۡۛۖۖۙۘۤۢۜۥۘ۟ۤۘۥۘۘۘۨۘ۠ۗۛۘۙۙۘۘ۠ۢۧ۫ۜۥۘ۫۟ۤ۠۟ۧۛۡۤۨۡۚۡۦۗۡۤۜۘ۟ۡۦۚۨۤ۠ۧۤۡۡۖۦۨ";
                                    continue;
                                case 1984713430:
                                    str8 = "ۙ۬ۤۘۥ۠۫ۜ۠ۚ۠ۡ۠ۜۜۛۙ۫ۛۨۙۨۘۢۗۤۡۨۢۦۥ۠ۗ۟ۘۤ۬ۚۗۘۦ۫ۤۧۥۢۙۚۧۦۦ۬ۤ";
                                    break;
                            }
                        }
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static C0274k m885() {
            while (true) {
                switch (((((((("۫ۨ۟۟ۗ۫ۘۧ۠ۨۥۘۘ۠ۧۤۧۢۤۖۧۘۘۗۙۗ۬ۤۡۘۦۨۦۘۦ۬ۦۗۦۘۨۘۜۚۛۙۙ۠ۥۤۜۥۙ۠ۡۨۙۧ۫۬ۘۘ۟ۡۗۗۥۗ".hashCode() ^ 747) ^ 919) ^ 268) ^ 741) ^ 215) ^ 471) ^ 440) ^ 1446316936) {
                    case 707641238:
                        return C0283k8.f1632;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m1117(C0274k c0274k) {
            String str = "ۢ۠ۗۘۘ۠ۢۨۘ۫ۗۖ۟۬۟ۜ۬ۦۦۙۦۘ۫ۗۧۨۛۢۜ۬ۧۘۡۘۢۖۖۘۡۙۦ۬ۙۗۜ۠۬ۢۜۗۚۧۨ۟ۙۦۧۙۧۨۘۙۜ۟";
            while (true) {
                switch ((((((((str.hashCode() ^ 409) ^ 32) ^ 851) ^ 652) ^ 468) ^ 764) ^ 544) ^ (-945663593)) {
                    case -1987006325:
                        "<set-?>";
                        str = "ۧۘۦۡۗۥۗۙۡ۬ۢۘ۬ۥۨۗۤۥ۟ۡۦۘۚۧۘۘۢۢۡ۠ۚۨۢۧۛ۬۟ۥۥۘۖۘ۫۟ۚۡۘ";
                        break;
                    case -1733060606:
                        return;
                    case 877948058:
                        str = "ۨۗ۟ۖۛۛ۟ۛ۬ۛۙۥۘۖۥۘۢۧۙۤ۟ۥۘ۠ۚۨۚ۟ۡۘ۟ۡۡۘۛۗۘۘ۫ۧۤۘۧ۟۫ۧ۫ۨۘۜۡۦۘۘۡۥۘۧۦۨۘۦۜۡۘ۬ۨ۫ۢۚ۬۟ۨۤۛۧۡۘ۠ۛۖۘۦۧۦ۠ۧۥۦۢۢ";
                        break;
                    case 1786451361:
                        C0283k8.f1632 = c0274k;
                        str = "ۥۙۥۚۧۡ۠ۙۛۚۥۡۧۗۤۡۦۘۛ۫ۜۘۥۛۤۤۖۘۤۛۛۨ۬ۢ۟ۤۨۘۗۡ۟ۚۖۧۘۚ۠ۥۘۢۙۡۘۜۚۥۘۦۚۦ۠ۘۦۢ۫ۜۘۖۨۗۦ۟ۦۚۗۚۘ۬ۖۘۦۖۦۘۘ۟ۖۤ۫ۘۘ";
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public static void m1118(String str) {
            String str2 = "ۙ۠ۡۘۤ۠ۚۧۙۖۗۙۚۘۥۥۙۛۢۨۘۙۧۥۘۡۥ۠ۧۦۦۖۢ۟ۙۨۛۜ۬ۡۦۡۧ۠ۗۘۘ۬۫ۦ۫ۡۜۙۡۥۘۜۜۛۛۥۥۘۛۜ۠";
            while (true) {
                switch ((((((((str2.hashCode() ^ 841) ^ 804) ^ 979) ^ 604) ^ 850) ^ 293) ^ 56) ^ (-1875019727)) {
                    case -1922642453:
                        return;
                    case -1277612549:
                        "<set-?>";
                        str2 = "ۛۥ۠ۛۘۡۖۖ۠ۢۗ۠ۤۜۜۘۡۖۥۘ۫ۢۘۘۗۤ۫ۖۙ۫ۛۨۚۤۧ۠ۛۚۦۘۤۚۚۖۨۛۚۙۘۢۘۖۨۢ۠ۗۢۡۘۦ۠ۨۥۘۙ۬۠ۗۙ۫ۗۦۥۘۥۙۦۘ";
                        break;
                    case 1485320984:
                        str2 = "ۨۡۦۥۨۤۧۛ۟ۚۢ۟ۛۜ۬ۤۨۘۘۢۥۖۛۙۨۘۤۜۥ۬ۨۥۘ۫ۚۚۜۥۦۖ۬ۘۧۤ۫ۛ۠۫ۙۘ۬۟۬ۚۧ۫ۜ۠ۤۤۨۖۘۜ۬ۚۥۧۘۥۥ۬ۖۛ۬ۤۤۚۥۧۘ";
                        break;
                    case 1537770076:
                        C0283k8.f1633 = str;
                        str2 = "ۧ۬ۙۛۖۡۦۘۨۢۖۦۧۨ۬ۚۘۘۦۡۡۘۢ۫ۚۙۘ۬ۛۗۡۘۤۧۗۜۛۥۘۤۨۧۘ۟ۧۘۥۢۥۘۜۖ۬ۖۜۗ۠ۧ۠";
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۟.k8$b */
    public static final class b extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ */
        public final C0283k8 f914;

        public b(C0283k8 c0283k8) {
            this.f914 = c0283k8;
        }

        /* JADX DEBUG: Duplicate block (B:55:0x0146) to fix multi-entry loop: BACK_EDGE: B:55:0x0146 -> B:29:0x00c2 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x0146
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) throws Throwable {
            C0237h4.m1090("param", r8);
            Object thisObject = r8.thisObject;
            C0237h4.m1088("null cannot be cast to non-null type android.app.Application", thisObject);
            Application application = (Application) thisObject;
            if (!AbstractC0356q.c.m1193(application)) {
                return;
            }

            this.f914.m1190(application);
            a.m1118(C0173ca.m840(application, "com.skyhand.redbookhelper"));
            try {
                Class.forName("com.tendcloud.tenddata.TalkingDataSDK");
            } catch (ClassNotFoundException unused) {
                return;
            }

            C0178d1.b.m842(new C0201ea());
            try {
                a.m884();
                AbstractC0356q.c.m1191().execute(new RunnableC0297l8());
            } catch (SQLiteException unused) {
                // Database cleanup is optional; the remaining hooks still initialize.
            }

            C0412u3.a.m945(application.getClassLoader());
            InterfaceC0139a4.a.m804(new C0235h2());
            if (!C0302m.m894()) {
                return;
            }

            C0481z7.m1286(new C0481z7.b(application).m978());
            AbstractC0356q.m1189(application, AbstractC0356q.c.m1192(application));
            C0328nb.m907(application);
            C0283k8.m1115(this.f914);
            /*
                r7 = this;
                r6 = 6
                java.lang.String r0 = "param"
                p001.C0237h4.m1090(r0, r8)
                java.lang.Object r0 = r8.thisObject
                java.lang.String r1 = "null cannot be cast to non-null type android.app.Application"
                p001.C0237h4.m1088(r1, r0)
                android.app.Application r0 = (android.app.Application) r0
                ۟.kb r1 = p001.AbstractC0356q.f1031
                r2 = -565809161(0xffffffffde466ff7, float:-3.5747297E18)
                java.lang.String r1 = "ۦۧۨۘ۬ۙۛۘۜۢۨۡۦۘۥۥۦۘۛۥۧۘۡۦۡۘۡۧ۟۟ۡۨ۫ۡۥۛ۫ۨۘ۟ۚۨۚ۫ۖۤۨۘۧ۫ۚۨۢ۟ۖ۫ۨۘۢۖۧۥۛۛۧۢۧۨۙۖۘ"
            L31:
                int r3 = r1.hashCode()
                r3 = r3 ^ r2
                switch(r3) {
                    case -1777470373: goto L74;
                    case -607541711: goto L77;
                    case -471102439: goto L145;
                    case 860988989: goto L3a;
                    default: goto L39;
                }
            L39:
                goto L31
            L3a:
                r3 = -423135585(0xffffffffe6c7769f, float:-4.7096955E23)
                java.lang.String r1 = "ۧۘۡۘ۟ۢ۟۠ۛۤۧۗۡۘۦ۠ۡۙۤۗۥۖۙۨۙۨۚۡۚ۟ۘۦۛ۠ۙۡۘۤ۬ۜۜۚۦۘۢۡۖۘ۠ۙۚۛ۟ۛۛۘۨۗۨ۫ۥۙۜۦۤۛۜۘۢ۫ۙۡۘ۟ۦۗۧۦۨۘ۫ۢۙۡۡۥ"
            L3f:
                int r4 = r1.hashCode()
                r4 = r4 ^ r3
                switch(r4) {
                    case -1718002447: goto L71;
                    case 331207242: goto L4e;
                    case 866711700: goto L48;
                    case 1102352281: goto L6e;
                    default: goto L47;
                }
            L47:
                goto L3f
            L48:
                java.lang.String r1 = "ۡ۬ۚۛۛۨۘۘۜۨ۫۠ۘۨۖۨۛۥۢۛۖۘۘۨۤۥ۫ۧۧۖۛۡ۬ۨۘۜۨۢۙۢۥۘۧۛۦۘۚۘۨۖ۫۬ۙۗۖۘۛۦۡۤۘۜۘ۠ۧۨۨۘۧۗۥۧۘۦۥۢۧۦۥۘ"
                goto L31
            L4b:
                java.lang.String r1 = "۫ۖۗۘ۟ۚ۠۠ۜ۫۠ۡۘۦۥۙ۫ۘۦۢۦۜۘۗۚۙۗۦۥۦۖ۠ۗۨۜۘۢۦۘۘۘۛۛۚۥۢۘۤ۫ۡۗۙۙۨۖۥ۠۫ۖۧۜۥ۫ۙ۠ۨۢ۠ۤ۠ۚۦۚۥۖ۫ۨۘۚ۬ۥۚۚ۫"
                goto L3f
            L4e:
                r4 = 1809848164(0x6be01764, float:5.418197E26)
                java.lang.String r1 = "ۧۜۧۘۧۛ۫۬۠ۧۚۖۘۛۧ۫ۡۜۘۘۡۢۚۤۡۘۤۙۖۘۗۘۙۨۙۖۧۙۘۡ۬ۜۗۡۘۦۘۖۘۜۢۧ۠۟ۗ۬ۜۘۥۛۨۘۨ۠ۖۘۢ۟ۥۘۗۥۤۨ۠ۨۘۜۙۡ"
            L53:
                int r5 = r1.hashCode()
                r5 = r5 ^ r4
                switch(r5) {
                    case -1939742672: goto L6b;
                    case -1591721326: goto L62;
                    case -1457386879: goto L5c;
                    case 1811049108: goto L4b;
                    default: goto L5b;
                }
            L5b:
                goto L53
            L5c:
                java.lang.String r1 = "ۨ۠ۘۦۡۧۘ۟۬ۢ۬ۘۘۛۚۘۘۢۦۤۛۨۗۡ۬ۗۧ۟ۡۤ۟ۨۘۦۘۤ۟۬ۦۘۨۢۤۥۦۢۥۖۥۘۚۧ۫ۥۖ۠ۡۖۤ"
                goto L3f
            L5f:
                java.lang.String r1 = "ۦۗۜۘۥۙۢۖۢۦۘ۫ۘۡۘۚ۬ۜۘۜۖۙۗۜۖۘ۠ۘۘۥ۬۬ۜ۟ۜۘۥۗۛ۫ۨۛ۟ۢۡۗ۫ۢ۫ۨۘۤۘۗۚۨ۬ۦۖۘ"
                goto L53
            L62:
                boolean r1 = p001.AbstractC0356q.c.m1193(r0)
                if (r1 != 0) goto L5f
                java.lang.String r1 = "ۡ۬ۚۚ۟ۖۛۛۦۥۨۥۘۘۤۥۢۥۜ۟۬ۥۘ۬ۘۥۘۗ۬ۥۘۛۡۧۚ۬۬ۨۘۦ۫۬۟۟ۜۘۤۡۡۘۦۢۘۘۜ۫ۤۢۥۦۦۧۢۦۦۧۘۘۚۡۘ"
                goto L53
            L6b:
                java.lang.String r1 = "ۡۢۛ۬ۥۖۘۤۜۜۘۦۨۖۘ۫ۘ۬ۙۡۚۛ۫۬ۦۚۖ۟۠ۡ۟ۚۤۖۨۦۗۚۙۜ۬۫۠ۢ۫۠ۖۢۜۘۤۡۥۡ۟ۚۧ۠ۜۘۖۡۨۘ۟ۨۥۘۥۡۧۧۨۖۘۧ۟ۢ"
                goto L53
            L6e:
                java.lang.String r1 = "۬۫ۦۚۙۘۙ۫ۗۨۧۤۥۘۘۤۛۧ۟۬ۤۡۦۤۚۥۥۢ۟ۦ۟ۡۘ۬۟ۢۦۛۜۦۧۚۗۦ"
                goto L3f
            L71:
                java.lang.String r1 = "ۗۥۧۘۤ۠ۦۘۨۘ۠۬ۛ۟ۧۥۘۡۥ۫ۦۚۡۘ۠ۛ۫۬۫ۙۗۘۢۗۥ۠۟ۦ۠ۨ۬ۥۛۦۛۨۘ۬ۥۤ۫ۧ۫ۤۤۢۡۚۤۚۧۛۧۗۘ۫ۙۖۦۗۥۤۧۚ"
                goto L31
            L74:
                java.lang.String r1 = "۠ۖۦۘۨۘۡۢۗ۟۟ۢ۟ۚۖۘ۠۠ۥۥۛۛۢۘۦۡۘۘۘۧۤۖۘۧۗۧۧ۟ۗ۫۟ۖۧۛۨۘ۠ۤۘۘۦ۟ۡۖ۬ۖۘ۫ۦۨۘۥۧۧۛۜۤۛ۫ۦۘ"
                goto L31
            L77:
                ۟.k8 r1 = r7.f914
                r1.m1190(r0)
                ۟.k r1 = p001.C0283k8.f1632
                java.lang.String r1 = "com.skyhand.redbookhelper"
                java.lang.String r1 = p001.C0173ca.m840(r0, r1)
                p001.C0283k8.a.m1118(r1)
                java.lang.String r1 = "com.tendcloud.tenddata.TalkingDataSDK"     // Catch: java.lang.ClassNotFoundException -> L149
                java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L149
                ۟.kb r1 = p001.C0178d1.f750
                ۟.ea r1 = new ۟.ea
                r1.<init>()
                p001.C0178d1.b.m842(r1)
                p001.C0283k8.a.m884()     // Catch: android.database.sqlite.SQLiteException -> L146
                java.util.concurrent.ExecutorService r1 = p001.AbstractC0356q.c.m1191()     // Catch: android.database.sqlite.SQLiteException -> L146
                ۟.l8 r2 = new ۟.l8     // Catch: android.database.sqlite.SQLiteException -> L146
                r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> L146
                r1.execute(r2)     // Catch: android.database.sqlite.SQLiteException -> L146
            Lc2:
                int r1 = p001.C0412u3.f1825     // Catch: android.database.sqlite.SQLiteException -> L146
                java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: android.database.sqlite.SQLiteException -> L146
                p001.C0412u3.a.m945(r1)     // Catch: android.database.sqlite.SQLiteException -> L146
                ۟.h2 r1 = new ۟.h2     // Catch: android.database.sqlite.SQLiteException -> L146
                r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L146
                p001.InterfaceC0139a4.a.m804(r1)     // Catch: android.database.sqlite.SQLiteException -> L146
                ۟.m r1 = p001.C0302m.f951     // Catch: android.database.sqlite.SQLiteException -> L146
                r1.getClass()     // Catch: android.database.sqlite.SQLiteException -> L146
                r2 = 670732819(0x27fa9213, float:6.9547313E-15)
                java.lang.String r1 = "ۤۨۛۥۚۛۗۡۘۡۥۗ۟ۢ۬ۛ۫ۘۘۡۢ۬ۗۘۖۘ۟ۖۥۘۥۤ۠ۘ۟ۦۘۖۙ۫۠ۤۛۥۢۖۤۨۡۢۢ۠ۖۘۢۛۡۘ"
            Ldd:
                int r3 = r1.hashCode()     // Catch: android.database.sqlite.SQLiteException -> L146
                r3 = r3 ^ r2
                switch(r3) {
                    case -1904444373: goto Le6;
                    case 270690250: goto L145;
                    case 1260451448: goto L123;
                    case 1578375811: goto L120;
                    default: goto Le5;
                }     // Catch: android.database.sqlite.SQLiteException -> L146
            Le5:
                goto Ldd
            Le6:
                r3 = 1749452885(0x68468855, float:3.7501738E24)
                java.lang.String r1 = "۠ۗ۫ۛۥۢۙۗۢ۫ۗ۠ۜۘۘ۟ۖۗۛۚۖۗۤۥۤۗۥ۬ۧۧۦۧ۫ۦۡۤۘۗۦ۠ۙ۟ۗۦۧۘ۫ۚۜۤۦ۫ۗۦۥۘ"
            Leb:
                int r4 = r1.hashCode()     // Catch: android.database.sqlite.SQLiteException -> L146
                r4 = r4 ^ r3
                switch(r4) {
                    case -1878015910: goto Lfd;
                    case -962565802: goto Lf7;
                    case -481465388: goto L11d;
                    case -405378881: goto Lf4;
                    default: goto Lf3;
                }     // Catch: android.database.sqlite.SQLiteException -> L146
            Lf3:
                goto Leb
            Lf4:
                java.lang.String r1 = "ۚۛۥ۠ۥ۫ۨۧۚۦ۟ۨۘ۫ۘۨۘ۫۬ۥۨ۬ۢۙۦۘ۫ۡۨۛ۟ۖۘۙۛۡۙۘۢۛ۠ۖۘ۠ۖۢۜ"
                goto Leb
            Lf7:
                java.lang.String r1 = "ۡۦۖۘۗۗۘۘۗ۟ۖۦۛۦۘۛ۟ۦۘۖ۫ۨۘ۠ۢۢ۬ۢۤۜۛۨۛۡۥۘۖۘۘۘۥۖۥۚۡ۠ۤۦۤ۠ۜۡۘۙۧۤ۬ۦ۬ۚۖۢۚۙۙۦۦۛۛۦ۬"
                goto Ldd
            Lfa:
                java.lang.String r1 = "ۥ۠ۖۘۖۙۡۘ۫ۖۨۥ۟۟۟ۘۖۘۤۥۨۛۤۘۘ۫ۥۘۙ۟ۡۘۡ۟ۨ۠ۚۤۤۡۖۘۘۖۖ۠ۡۜ۠ۘۗ۠ۢۡ۬ۨۖۛۖۗ۟ۘ۫ۤۨۜۘۡۦ۠۟۠ۡ۫ۘۗۘۨۡۘ"
                goto Leb
            Lfd:
                r4 = 2015330040(0x781f7ef8, float:1.293985E34)
                java.lang.String r1 = "ۜۖۨۘۢ۠ۤۤۘۡ۠۠۬ۘۢۙ۟۟۫ۘۡۘۥ۠ۖۘۤۜۛۚۥ۬ۗۡۜۘۗۛۥۘۧۤۦۗۤۡۘۡ۠"
            L102:
                int r5 = r1.hashCode()     // Catch: android.database.sqlite.SQLiteException -> L146
                r5 = r5 ^ r4
                switch(r5) {
                    case -2098528755: goto Lfa;
                    case -598649020: goto L10b;
                    case 654060423: goto L117;
                    case 1285927266: goto L11a;
                    default: goto L10a;
                }     // Catch: android.database.sqlite.SQLiteException -> L146
            L10a:
                goto L102
            L10b:
                boolean r1 = p001.C0302m.m894()     // Catch: android.database.sqlite.SQLiteException -> L146
                if (r1 == 0) goto L114
                java.lang.String r1 = "۟۟ۚ۫ۧۚۚۢ۟ۗۘۧۘۛۜۘۚ۟۬۠ۧۨۦۢۚۖۗۜ۫ۨ۫ۧ۬ۨۘۗۘۜۗۧۚۖۦۖۘۚ۬ۦۗۖۤۤۡۥۘ۠ۢ۫ۡ۟۠ۤۖۦۘۤ۫ۚۘ۫ۘۜۘۨۤۢ"
                goto L102
            L114:
                java.lang.String r1 = "ۘۢۨۘۡۗۨۡۜۡۘۨۦۖۘ۠ۦۜۚۗ۫ۛۜۘۖ۬ۦۧۢۜ۟۫۟ۜ۫ۦۡ۟۫۠ۜۤۛ۠ۜۘ۬۠ۜۡۢۦۘۛۚۥۘۥۧۙۤ۫۠ۥ۠۟ۜۢ۫۫ۦۚ۫ۚۛۘۦ۟ۢۦۧۘۢۨۧ۫ۛۗ"
                goto L102
            L117:
                java.lang.String r1 = "ۧۛۥ۠ۨۖۘۙۧۚ۬ۚ۬ۧۡۛ۟ۦۧۘۨۙۦۘۧۜۜۘۛۛۜۘ۬ۙۘۘۨۗ۟ۢۥ۬۬ۨ۫ۘۛۙ۟ۥ۬ۤۘۥ۬ۨۘۖۥۚ۬ۨۡۘ۫ۢۦۘۨۦۢۢۦۦۘۡۢۗ۬۫"
                goto L102
            L11a:
                java.lang.String r1 = "ۧۨۖۘۙ۠ۥۘۡۢۖ۟ۙۜۤ۬۟۟ۙۜۘۥۡۖۘ۬ۥۗ۟ۤ۬۟ۙۨۛۦۨۦۡۡۘۦ۫ۥۘۥۙۡ"
                goto Leb
            L11d:
                java.lang.String r1 = "ۗۨۦۘۥۘۘۘۧۗۗ۫ۡۘ۠ۡۧۘۙۙۦۘۚۖۗۖۤۜۘ۟ۧۨۘۗۖۦۘۡ۫۬۟ۨۥۘۨۙۥۨۚۦۦ۫۟ۢ۫ۥ۠ۛ۟۠۬ۚۘۦۘۚۦۘۘۘۘۘۥۦۡۘۨ۟ۦۘ۠ۤۡۘۤ۫ۤۚۚۜۘۘۖۘ"
                goto Ldd
            L120:
                java.lang.String r1 = "ۡۢۨۘۢۢۦۚۜۧۨۘ۫ۜۖۦۘۢۗۥۦۘۦۘۥۖۖۡۛۖ۟ۜۨۘۦ۠ۖۚۤۖ۫ۢۨۘۚۦۖۢ۫ۦۘۦۧۡۘۜ۠ۡ۫ۗۚۘۧ۟ۡ۫ۡۥۗ۬ۦۨۖۘۚۛۥۚۢ"
                goto Ldd
            L123:
                ۟.z7$b r1 = new ۟.z7$b
                r1.<init>(r0)
                ۟.z7 r1 = r1.m978()
                p001.C0481z7.m1286(r1)
                ۟.k8 r1 = r7.f914
                ۟.kb r2 = p001.AbstractC0356q.f1031
                java.lang.String r2 = p001.AbstractC0356q.c.m1192(r0)
                r1.getClass()
                p001.AbstractC0356q.m1189(r0, r2)
                p001.C0328nb.m907(r0)
                ۟.k8 r0 = r7.f914
                p001.C0283k8.m1115(r0)
            L145:
                return
            L146:
                r1 = move-exception
                goto Lc2
            L149:
                r0 = move-exception
                goto L145
            */
            return;
        }
    }

    static {
        String str = "ۧۧۡۗ۟۫ۛ۬ۙۖۚۧ۫ۨۨۘ۟۫ۤۡۨۖۘۧۗۨۘۤۡ۬ۖۤۙۖۚۥۘۘ۠ۦ۫ۦۖۘ۠ۦ۬۠۠ۡۘۚ۟ۚۛۧۖۘۖۤۥۘۚ۟ۖۘۥۧۛۜۥۧۚ۬۬۠ۧۡۘۧۛۥۘۜۛۥۘۦۡۡۘ۟ۦۜ";
        while (true) {
            switch ((((((((str.hashCode() ^ 287) ^ 39) ^ 516) ^ 677) ^ 308) ^ 61) ^ 480) ^ 779662170) {
                case -559521439:
                    f1633 = "";
                    str = "ۨۙۜۧۥۚ۬ۡۡۛۡۖۗ۟ۧۗۙۚۥۦۥۘۡۥۚ۠۬ۡۖۛۥۘۘۨۘۘ۫ۥۚ۬ۚۛۨ۠ۡ۠ۧۨۘۥۦۨۧۤۥۘۦ۬ۙ۬ۘۥۘۧۨۥۖۥۡۘ۬ۢۡۘ۬۟ۦۘۥۙۥۘۡۛۛۤ۫ۨۘۧۨۦۘ";
                    break;
                case 41095911:
                    return;
                case 311409116:
                    "androidx.constraintlayout.widget.ConstraintLayout";
                    str = "ۙۨ۬ۗ۟ۥۦۤ۟ۡ۠ۥۘۧۘۡ۠ۙۘۙۦ۬ۢۦۘۛۤۚۧۘۖۦۘ۟ۜۜ۬ۦ۟ۢۚۙ۬ۙۦۧۨۖۛۡۡۡۘ۠۟ۘ";
                    break;
                case 848178347:
                    "androidx.constraintlayout.widget.ConstraintSet";
                    str = "ۘۨۥۘۦۛۗۧۚۗ۬ۦۖۜۨۘۗۛۜۢۘۥۘۥ۫ۦۘۧۗ۟ۘۚ۫۫ۜۧۘۨۡۖۘۖۛۦۘۛۜۥ۬ۘۡۘۧۥۦۘۢۨۦۘۦۚۜۗۙ۟ۚۖۦۘۖۚۗ۟ۥۦۘۨۙۗۢۛۡۘۥۛ۫۬ۛۖ۟ۘۜۘ";
                    break;
                case 1626989368:
                    f1632 = new C0274k();
                    str = "ۡۨۘۘۜ۬ۖ۠۟ۜۘۗۛۡۤ۟۟ۗۧۜۥۨۘۖۚۡۘۥۘۦۘۖۖۜۙۛۘ۠ۗۡۢۘۥۘۥۦۤۡۚۜۖ۫ۡۘۧۖۧۘۢۖۨۜ۠۟۟ۦ۫ۘۡ";
                    break;
            }
        }
    }

    public C0283k8() {
        "com.skyhand.redbookhelper";
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ void m1115(C0283k8 c0283k8) {
        String str = "ۥۜۖۜ۠ۛۜۖۖۥ۟ۖۨۜۤۜۚۡۘۡۘۥۘۡۜ۫۟ۤۦۘۖۧۖۘۨۨۥ۠ۖۘۘۦۖ۠ۛۛ۫ۥۗۢۛۘۘ۟ۧۚۢۧ۠ۘۗ۠ۦۚۖۘۚۤۜ";
        while (true) {
            switch ((((((((str.hashCode() ^ 767) ^ 24) ^ 301) ^ 619) ^ 261) ^ 713) ^ 482) ^ (-1661685853)) {
                case -633069362:
                    str = "ۖۥۧۧۧ۟ۢۢۜ۫ۥۛۙ۬ۡۘۗ۫ۨۘ۫ۛۜۘۘۙۦۘ۟ۜۜۤۤۘۡۘۚۜ۟ۨۙ۬ۤۡ۟ۜۘۛ۫ۥۛۨ۠ۙ۠۫ۤۙۨۧۚۛ۠۬ۥۛۧۢۡۢۦۤۖۘۚ۬ۢ";
                    break;
                case 1193901179:
                    return;
                case 1244625602:
                    c0283k8.getClass();
                    str = "ۜ۟ۦۗۘۚۥۙۜۘۘۦۘۢۥۖۘۜ۟ۗۙۜۧۘ۬ۢۚۘۦۘۘۛ۬ۨۛۙۧ۫ۤۖۘۙ۬ۜ۠ۨۡۘ۠ۛۙۤ۫ۚۘۘۡۘ۟ۙۥ";
                    break;
            }
        }
    }

    @Override // p001.AbstractC0149b0
    /* JADX INFO: renamed from: ۥ۟ */
    public final String mo816() {
        String str = "ۧۤ۠ۥۢ۬۠۬ۘۘ۫۟ۨۦۥۘۛ۟ۜ۟ۤۚۘۡۨۘۘۤۛۚۧ۬ۦ۫ۤۡۙۧۘۗ۬۬ۢۜ۠۠ۨۙۜۢۛۖۡۘۨۧۢ";
        while (true) {
            switch ((((((((str.hashCode() ^ 666) ^ 907) ^ 763) ^ 8) ^ 590) ^ 136) ^ 876) ^ 19517880) {
                case 1473454590:
                    str = "ۘۙۨۘۦ۬ۚۖۙۙ۠ۨۜۛۧۥۘۦۤۨۘ۟۟۟۠ۖۧۤۙۘۛۙۦۛ۫ۛۥۙۡۘ۟ۢۙۧۛۧ۠ۨۜۘۡ۫ۥۘۙۥۦ۫ۖۧۖۜۗۤ۬ۗۛ۬ۡۘ";
                    break;
                case 1588644903:
                    return this.f1634;
            }
        }
    }

    @Override // p001.AbstractC0356q
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void mo1116(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str = "ۙۛۜۘۢۧۢۧۦۧۚ۠ۨۘۨۚۡۘۨ۠ۡۙۡۥۘۖۦۦۘۨۦۦۘ۫ۜۢۦۗۙ۬۟ۦۡۜۥۘۤۖۘۘۥ۠ۥۥۛ۬ۡ۠ۚۧۨۜۘ۟ۖۘۜ۬۟۫۫";
        while (true) {
            switch ((((((((str.hashCode() ^ 633) ^ 203) ^ 769) ^ 932) ^ 918) ^ 24) ^ 805) ^ 191925123) {
                case -1002946986:
                    str = "ۤۚۥۦ۫ۙۖۧۜۤۘۜۘۘۘۜ۠ۛۧۛۜۖۘۥۗۥۤۡۘۢۙ۬۫۬ۖۗۢۧۨۙ۟ۘۨۘ۫ۜ۟ۨۢۜۜۛ۫ۜۖۚۧۨۧۤۘۘۡۢۚ";
                    break;
                case -181629173:
                    XposedHelpers.findAndHookMethod("com.xingin.xhs.app.XhsApplication", loadPackageParam.classLoader, "onCreate", new Object[]{new b(this)});
                    str = "۫ۙۦۙ۫ۢۡۛۨۜۧۥۗۛۚۖۧ۠۟ۧۖۘۡۛ۬ۤۛۖ۬۠۟ۛۦۚۡۖۜۘۥ۟ۗۧ۠ۧۖ۟۟۬ۦۡۘۖۨۨ۟۬۬";
                    break;
                case -135395725:
                    str = "ۚۤۡۘۚۖ۫۠ۚۥۘۖۢۦۘ۠ۧ۠ۤ۠ۥۘ۬ۗۡۢۘۨۘۗ۫۫ۤۨۘۘ۠ۗۚۧۛ۬ۧۗۥۦۢۦۘۛ۠ۦۘ۟ۡۥۢۡۧۘۡۡۥ";
                    break;
                case 1912573033:
                    return;
                case 2091444081:
                    C0237h4.m1090("lpparam", loadPackageParam);
                    str = "۫ۨۗ۟۠ۙۥۚۦۘۤۥۧۨ۬۟۟ۢ۠ۚ۫۫۫۫ۦۨ۟۫۟۫ۚۛۗۢ۟ۘۘۘۥۛۨ۫ۦۚۤۥۘ";
                    break;
            }
        }
    }
}
