package com.p001mr.elaris;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0008a7;
import p000.AbstractC0260i5;
import p000.C0263i8;
import p000.C0282j8;
import p000.C0298k8;
import p000.RunnableC0255i0;

/* JADX INFO: renamed from: com.mr.elaris.f */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0152f {

    /* JADX INFO: renamed from: b */
    public static volatile Application f121b;

    /* JADX INFO: renamed from: c */
    public static volatile ClassLoader f122c;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f120a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static volatile String f123d = "";

    /* JADX INFO: renamed from: e */
    public static volatile String f124e = "";

    /* JADX INFO: renamed from: f */
    public static volatile int f125f = 0;

    /* JADX INFO: renamed from: g */
    public static volatile long f126g = 0;

    /* JADX INFO: renamed from: h */
    public static volatile long f127h = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m200A() {
        String str;
        String strM219p = m219p(Prefs.KEY_KEEP_FIRE_TIME, Prefs.defaultString(Prefs.KEY_KEEP_FIRE_TIME));
        int[] iArrM216m = m216m(strM219p);
        if (iArrM216m == null) {
            str = "";
        } else {
            str = m202C(iArrM216m[0]) + ":" + m202C(iArrM216m[1]);
        }
        if (str.length() > 0) {
            return str;
        }
        String strReplace = strM219p != null ? strM219p.trim().replace((char) 65306, ':') : "";
        return strReplace.length() == 0 ? Prefs.defaultString(Prefs.KEY_KEEP_FIRE_TIME) : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static String m201B() {
        return new SimpleDateFormat("yyyyMMdd", Locale.ROOT).format(new Date());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static String m202C(int i) {
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static ArrayList m203D(C0263i8 c0263i8) {
        ArrayList arrayList = new ArrayList();
        List<C0298k8> list = c0263i8.f404a;
        if (list != null) {
            for (C0298k8 c0298k8 : list) {
                if (m211h(c0298k8) && !m208e(arrayList, c0298k8)) {
                    arrayList.add(c0298k8);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m204a() {
        C0263i8 c0263i8M209f = m209f();
        if (!c0263i8M209f.m676a()) {
            if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                HookEntry.log("keep-fire skipped: " + c0263i8M209f.f409f);
                return;
            }
            return;
        }
        String strM201B = m201B();
        if (!strM201B.equals(f124e)) {
            f124e = strM201B;
            f125f = 0;
            f126g = 0L;
            f123d = "";
        }
        ArrayList arrayListM218o = m218o(c0263i8M209f);
        if (arrayListM218o.isEmpty()) {
            m221r(Prefs.KEY_KEEP_FIRE_LAST_SENT_DAY, strM201B);
            f123d = strM201B;
            return;
        }
        if (f125f >= 6) {
            f123d = strM201B;
            HookEntry.logAlways("keep-fire pending after max attempts: ".concat(m212i(arrayListM218o)));
            return;
        }
        f125f++;
        f126g = System.currentTimeMillis();
        HookEntry.logAlways("keep-fire auto run, targets=" + arrayListM218o.size() + ", attempt=" + f125f + "/6");
        int iM227x = m227x(c0263i8M209f, arrayListM218o, false, false);
        ArrayList arrayListM218o2 = m218o(c0263i8M209f);
        StringBuilder sb = new StringBuilder("keep-fire result, manual=false, sent=");
        sb.append(iM227x);
        sb.append("/");
        sb.append(arrayListM218o.size());
        sb.append(", pending=");
        sb.append(arrayListM218o2.size());
        sb.append(arrayListM218o2.isEmpty() ? "" : ", pendingTargets=".concat(m212i(arrayListM218o2)));
        HookEntry.logAlways(sb.toString());
        if (arrayListM218o2.isEmpty()) {
            m221r(Prefs.KEY_KEEP_FIRE_LAST_SENT_DAY, strM201B);
            f123d = strM201B;
        } else if (f125f < 6) {
            m221r(Prefs.KEY_KEEP_FIRE_LAST_SENT_DAY, "");
            f123d = "";
        } else {
            m221r(Prefs.KEY_KEEP_FIRE_LAST_SENT_DAY, "");
            f123d = strM201B;
            HookEntry.logAlways("keep-fire pending after max attempts: ".concat(m212i(arrayListM218o2)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m205b(int i, long j) {
        long jMax = Math.max(0L, j) + System.currentTimeMillis();
        while (m226w(i)) {
            long jCurrentTimeMillis = jMax - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                return;
            }
            try {
                Thread.sleep(Math.min(jCurrentTimeMillis, 60000L));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m206c(C0263i8 c0263i8, C0263i8 c0263i82) {
        return (m213j(c0263i8.f404a).equals(m213j(c0263i82.f404a)) && c0263i8.f405b.equals(c0263i82.f405b) && c0263i8.f406c.equals(c0263i82.f406c)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C0263i8 m207d(String str, String str2, String str3) {
        String str4;
        ArrayList arrayListM217n = m217n(str);
        String str5 = "";
        if (str2 == null) {
            str4 = "";
        } else {
            String strTrim = str2.replace('\r', ' ').replace('\n', ' ').trim();
            while (strTrim.contains("  ")) {
                strTrim = strTrim.replace("  ", " ");
            }
            if (strTrim.length() > 120) {
                strTrim = strTrim.substring(0, 120).trim();
            }
            str4 = strTrim;
        }
        int[] iArrM216m = m216m(str3);
        if (iArrM216m != null) {
            str5 = m202C(iArrM216m[0]) + ":" + m202C(iArrM216m[1]);
        }
        if (arrayListM217n.isEmpty()) {
            return new C0263i8(arrayListM217n, str4, str5, 0, 0, "未选择续火对象");
        }
        String str6 = str5;
        if (str4.length() == 0) {
            return new C0263i8(arrayListM217n, str4, str6, 0, 0, "未填写消息");
        }
        if (iArrM216m == null) {
            return new C0263i8(arrayListM217n, str4, "", 0, 0, "时间格式应为 HH:mm");
        }
        return new C0263i8(arrayListM217n, str4, m202C(iArrM216m[0]) + ":" + m202C(iArrM216m[1]), iArrM216m[0], iArrM216m[1], "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m208e(ArrayList arrayList, C0298k8 c0298k8) {
        if (c0298k8 == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0298k8 c0298k82 = (C0298k8) it.next();
            if (c0298k82 != null && c0298k82.f497a == c0298k8.f497a && c0298k8.f498b.equals(c0298k82.f498b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C0263i8 m209f() {
        return m207d(m213j(m217n(m219p(Prefs.KEY_KEEP_FIRE_GROUPS, ""))), m219p(Prefs.KEY_KEEP_FIRE_MESSAGE, ""), m219p(Prefs.KEY_KEEP_FIRE_TIME, Prefs.defaultString(Prefs.KEY_KEEP_FIRE_TIME)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m210g(C0298k8 c0298k8) {
        try {
            SharedPreferences sharedPreferencesM220q = m220q();
            if (sharedPreferencesM220q != null && c0298k8 != null) {
                String str = c0298k8.f498b;
                String string = sharedPreferencesM220q.getString(Prefs.KEY_KEEP_FIRE_DONE_PREFIX.concat(c0298k8.m736a()), "");
                if (string != null && string.length() > 0) {
                    return string;
                }
                if (c0298k8.f497a == 1) {
                    return sharedPreferencesM220q.getString("keep_fire_done_friend_" + str, "");
                }
                String string2 = sharedPreferencesM220q.getString("keep_fire_done_group_" + str, "");
                if (string2 != null && string2.length() > 0) {
                    return string2;
                }
                return sharedPreferencesM220q.getString(Prefs.KEY_KEEP_FIRE_DONE_PREFIX + str, "");
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m211h(C0298k8 c0298k8) {
        String str;
        if (c0298k8 == null || (str = c0298k8.f498b) == null || str.trim().length() == 0) {
            return false;
        }
        return c0298k8.f497a == 1 ? AbstractC0260i5.m534H0(str) : AbstractC0008a7.m60q(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m212i(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0298k8 c0298k8 = (C0298k8) it.next();
            if (c0298k8 != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(c0298k8.m736a());
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m213j(List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0298k8 c0298k8 = (C0298k8) it.next();
            if (c0298k8 != null && c0298k8.f498b.length() != 0) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(c0298k8.m736a());
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static long m214k(C0263i8 c0263i8) {
        if (!c0263i8.m676a() || m203D(c0263i8).isEmpty() || c0263i8.f405b.length() == 0) {
            return 60000L;
        }
        long jCurrentTimeMillis = f127h - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            return Math.min(jCurrentTimeMillis, 60000L);
        }
        Calendar calendarM225v = m225v(c0263i8);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (m218o(c0263i8).isEmpty()) {
            calendarM225v.add(6, 1);
            return Math.max(60000L, calendarM225v.getTimeInMillis() - jCurrentTimeMillis2);
        }
        if (jCurrentTimeMillis2 < calendarM225v.getTimeInMillis()) {
            return Math.max(0L, calendarM225v.getTimeInMillis() - jCurrentTimeMillis2);
        }
        String strM201B = m201B();
        if (!strM201B.equals(f124e)) {
            f124e = strM201B;
            f125f = 0;
            f126g = 0L;
            f123d = "";
        }
        if (strM201B.equals(f123d) || f125f >= 6) {
            calendarM225v.add(6, 1);
            return Math.max(60000L, calendarM225v.getTimeInMillis() - jCurrentTimeMillis2);
        }
        if (f126g > 0) {
            return Math.max(0L, (f126g + 300000) - jCurrentTimeMillis2);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m215l() {
        try {
            C0263i8 c0263i8M209f = m209f();
            if (c0263i8M209f.m676a() && !m203D(c0263i8M209f).isEmpty() && c0263i8M209f.f405b.length() != 0) {
                int[] iArrM216m = m216m(c0263i8M209f.f406c);
                boolean z = false;
                int i = iArrM216m == null ? 0 : iArrM216m[0];
                int i2 = iArrM216m == null ? 0 : iArrM216m[1];
                ArrayList arrayListM218o = m218o(c0263i8M209f);
                Calendar calendarM225v = m225v(c0263i8M209f);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!arrayListM218o.isEmpty() && jCurrentTimeMillis >= calendarM225v.getTimeInMillis()) {
                    if (f127h - jCurrentTimeMillis > 0) {
                        return "稍后补发";
                    }
                    if ((f126g > 0 ? (f126g + 300000) - jCurrentTimeMillis : 0L) > 0) {
                        return "稍后重试";
                    }
                    if (!m201B().equals(f123d) && f125f < 6) {
                        return "立即补发";
                    }
                }
                long jM214k = m214k(c0263i8M209f);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis() + Math.max(0L, jM214k));
                Calendar calendar2 = Calendar.getInstance();
                if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                    z = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(z ? "今天 " : "明天 ");
                sb.append(m202C(i));
                sb.append(":");
                sb.append(m202C(i2));
                return sb.toString();
            }
            return "等待配置";
        } catch (Throwable unused) {
            return "等待配置";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int[] m216m(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.trim().replace((char) 65306, ':');
        if (strReplace.length() == 0) {
            strReplace = Prefs.defaultString(Prefs.KEY_KEEP_FIRE_TIME);
        }
        String[] strArrSplit = strReplace.split(":");
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            int i = Integer.parseInt(strArrSplit[0].trim());
            int i2 = Integer.parseInt(strArrSplit[1].trim());
            if (i >= 0 && i <= 23 && i2 >= 0 && i2 <= 59) {
                return new int[]{i, i2};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static ArrayList m217n(String str) {
        char c;
        ArrayList arrayList = new ArrayList();
        if (str != null && str.trim().length() != 0) {
            char c2 = 65292;
            char c3 = ',';
            String[] strArrSplit = str.replace('\r', '\n').replace((char) 65292, '\n').replace(',', '\n').replace((char) 65307, '\n').replace(';', '\n').split("\\n+");
            int length = strArrSplit.length;
            int i = 0;
            while (i < length) {
                String str2 = strArrSplit[i];
                C0298k8 c0298k8 = null;
                if (str2 != null) {
                    String strTrim = str2.trim();
                    if (strTrim.length() != 0) {
                        String lowerCase = strTrim.toLowerCase(Locale.ROOT);
                        if (lowerCase.startsWith("u:") || lowerCase.startsWith("friend:") || lowerCase.startsWith("c2c:")) {
                            strTrim = strTrim.substring(strTrim.indexOf(58) + 1);
                            c = 1;
                        } else if (lowerCase.startsWith("g:") || lowerCase.startsWith("group:") || lowerCase.startsWith("troop:")) {
                            strTrim = strTrim.substring(strTrim.indexOf(58) + 1);
                            c = 2;
                        } else {
                            c = 0;
                        }
                        String strTrim2 = strTrim.trim();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= strTrim2.length()) {
                                i2 = -1;
                                break;
                            }
                            char cCharAt = strTrim2.charAt(i2);
                            if (Character.isWhitespace(cCharAt) || cCharAt == c3 || cCharAt == ';' || cCharAt == c2 || cCharAt == 65307) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 >= 0) {
                            strTrim2 = strTrim2.substring(0, i2).trim();
                        }
                        StringBuilder sb = new StringBuilder();
                        for (int i3 = 0; i3 < strTrim2.length(); i3++) {
                            char cCharAt2 = strTrim2.charAt(i3);
                            if ((cCharAt2 >= '0' && cCharAt2 <= '9') || ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || cCharAt2 == '_' || cCharAt2 == '-'))) {
                                sb.append(cCharAt2);
                            }
                        }
                        String string = sb.toString();
                        if (string.length() != 0) {
                            if (c == 1) {
                                if (AbstractC0260i5.m534H0(string)) {
                                    c0298k8 = new C0298k8(string, 1);
                                }
                            } else if (c == 2) {
                                if (AbstractC0008a7.m60q(string)) {
                                    c0298k8 = new C0298k8(string, 2);
                                }
                            } else if (AbstractC0008a7.m60q(string)) {
                                c0298k8 = new C0298k8(string, 2);
                            }
                        }
                    }
                }
                if (c0298k8 != null && !m208e(arrayList, c0298k8)) {
                    arrayList.add(c0298k8);
                }
                i++;
                c2 = 65292;
                c3 = ',';
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static ArrayList m218o(C0263i8 c0263i8) {
        ArrayList arrayList = new ArrayList();
        String strM201B = m201B();
        for (C0298k8 c0298k8 : m203D(c0263i8)) {
            if (!strM201B.equals(m210g(c0298k8)) && !m208e(arrayList, c0298k8)) {
                arrayList.add(c0298k8);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m219p(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesM220q = m220q();
            return sharedPreferencesM220q == null ? HookEntry.runtimeString(str, str2) : Prefs.readString(sharedPreferencesM220q, str, HookEntry.runtimeString(str, str2));
        } catch (Throwable unused) {
            return HookEntry.runtimeString(str, str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static SharedPreferences m220q() {
        try {
            Context contextHostContext = HookEntry.hostContext();
            if (contextHostContext == null) {
                Application application = f121b;
                contextHostContext = application == null ? null : application.getApplicationContext();
            }
            if (contextHostContext == null) {
                return null;
            }
            return contextHostContext.getSharedPreferences(Prefs.PREFS_NAME, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m221r(String str, String str2) {
        try {
            HookEntry.setRuntimeString(str, str2 == null ? "" : str2);
            SharedPreferences sharedPreferencesM220q = m220q();
            if (sharedPreferencesM220q != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesM220q.edit();
                if (str2 == null) {
                    str2 = "";
                }
                Prefs.putString(editorEdit, str, str2);
                editorEdit.putLong(Prefs.KEY_CONFIG_VERSION, System.currentTimeMillis()).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C0282j8 m222s() {
        String str;
        C0263i8 c0263i8M209f = m209f();
        List list = c0263i8M209f.f404a;
        if (!c0263i8M209f.m676a()) {
            list.size();
            return new C0282j8(c0263i8M209f.f409f);
        }
        ArrayList arrayListM203D = m203D(c0263i8M209f);
        if (arrayListM203D.isEmpty()) {
            list.size();
            return new C0282j8("未选择续火对象");
        }
        int iM227x = m227x(c0263i8M209f, arrayListM203D, true, true);
        if (iM227x > 0 && m218o(c0263i8M209f).isEmpty()) {
            String strM201B = m201B();
            if (strM201B == null) {
                strM201B = "";
            }
            m221r(Prefs.KEY_KEEP_FIRE_LAST_SENT_DAY, strM201B);
        }
        arrayListM203D.size();
        if (iM227x > 0) {
            str = "续火完成：" + iM227x + "/" + arrayListM203D.size();
        } else {
            str = "续火未发送成功，请查看日志";
        }
        return new C0282j8(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m223t(String str) {
        C0263i8 c0263i8M209f = m209f();
        m221r(Prefs.KEY_KEEP_FIRE_GROUPS, m213j(m217n(str)));
        if (m206c(c0263i8M209f, m209f())) {
            m221r(Prefs.KEY_KEEP_FIRE_LAST_SENT_DAY, "");
        }
        m224u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0002 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX INFO: renamed from: u */
    public static void m224u() {
        ?? RuntimeBool = Prefs.KEY_KEEP_FIRE_ENABLED;
        try {
            SharedPreferences sharedPreferencesM220q = m220q();
            RuntimeBool = sharedPreferencesM220q == null ? HookEntry.runtimeBool(Prefs.KEY_KEEP_FIRE_ENABLED) : Prefs.readBoolean(sharedPreferencesM220q, Prefs.KEY_KEEP_FIRE_ENABLED);
        } catch (Throwable unused) {
            RuntimeBool = HookEntry.runtimeBool(RuntimeBool);
        }
        if (RuntimeBool == 0) {
            HookEntry.logAlways("keep-fire scheduler not started reason=disabled");
            return;
        }
        C0263i8 c0263i8M209f = m209f();
        if (!c0263i8M209f.m676a()) {
            HookEntry.logAlways("keep-fire scheduler not started reason=" + c0263i8M209f.f409f);
        } else {
            if (!f120a.compareAndSet(false, true)) {
                HookEntry.logAlways("keep-fire scheduler already running, next=".concat(m215l()));
                return;
            }
            Thread thread = new Thread(new RunnableC0255i0(HookEntry.hotReloadGeneration(), 2), "Elaris-KeepFire");
            thread.setDaemon(true);
            thread.start();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static Calendar m225v(C0263i8 c0263i8) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, c0263i8.f407d);
        calendar.set(12, c0263i8.f408e);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0002 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: w */
    public static boolean m226w(int i) {
        ?? RuntimeBool = Prefs.KEY_KEEP_FIRE_ENABLED;
        try {
            SharedPreferences sharedPreferencesM220q = m220q();
            RuntimeBool = sharedPreferencesM220q == null ? HookEntry.runtimeBool(Prefs.KEY_KEEP_FIRE_ENABLED) : Prefs.readBoolean(sharedPreferencesM220q, Prefs.KEY_KEEP_FIRE_ENABLED);
        } catch (Throwable unused) {
            RuntimeBool = HookEntry.runtimeBool(RuntimeBool);
        }
        return RuntimeBool != 0 && HookEntry.isCurrentHotReloadGeneration(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static int m227x(C0263i8 c0263i8, ArrayList arrayList, boolean z, boolean z2) {
        ClassLoader classLoader;
        if (f122c != null) {
            classLoader = f122c;
        } else {
            Context contextHostContext = HookEntry.hostContext();
            if (contextHostContext == null) {
                Application application = f121b;
                contextHostContext = application == null ? null : application.getApplicationContext();
            }
            classLoader = contextHostContext != null ? contextHostContext.getClassLoader() : AbstractC0152f.class.getClassLoader();
        }
        ClassLoader classLoader2 = classLoader;
        int i = 0;
        if (classLoader2 == null) {
            HookEntry.log("keep-fire send failed reason=classLoader null");
            return 0;
        }
        String strM201B = m201B();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0298k8 c0298k8 = (C0298k8) it.next();
            if (m211h(c0298k8)) {
                if (z2) {
                    m228y(c0298k8, "");
                } else if (strM201B.equals(m210g(c0298k8))) {
                }
                boolean zSendPlainText = MessageRepeater.sendPlainText(classLoader2, (c0298k8 == null || c0298k8.f497a != 1) ? 2 : 1, c0298k8.f498b, "", c0263i8.f405b, z ? "keep-fire manual" : "keep-fire");
                StringBuilder sb = new StringBuilder("keep-fire target result, manual=");
                sb.append(z);
                sb.append(", type=");
                sb.append(c0298k8.f497a == 1 ? "好友" : "群");
                sb.append(", id=");
                sb.append(c0298k8.f498b);
                sb.append(", sent=");
                sb.append(zSendPlainText);
                HookEntry.logAlways(sb.toString());
                if (zSendPlainText) {
                    i++;
                    m228y(c0298k8, strM201B);
                }
                try {
                    Thread.sleep(900L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m228y(C0298k8 c0298k8, String str) {
        try {
            SharedPreferences sharedPreferencesM220q = m220q();
            if (sharedPreferencesM220q == null || c0298k8 == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesM220q.edit();
            String strConcat = Prefs.KEY_KEEP_FIRE_DONE_PREFIX.concat(c0298k8.m736a());
            if (str == null) {
                str = "";
            }
            editorEdit.putString(strConcat, str).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static String m229z() {
        C0263i8 c0263i8M209f = m209f();
        String str = c0263i8M209f.f409f;
        ArrayList arrayListM203D = m203D(c0263i8M209f);
        if (arrayListM203D.isEmpty()) {
            return "未选择续火对象";
        }
        if (str.length() > 0 && !"未填写消息".equals(str) && !"时间格式应为 HH:mm".equals(str)) {
            return str;
        }
        Iterator it = arrayListM203D.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            if (((C0298k8) it.next()).f497a == 1) {
                i3++;
            } else {
                i2++;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i2 > 0) {
            sb.append(i2);
            sb.append("群");
        }
        if (i3 > 0) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(i3);
            sb.append("友");
        }
        sb.append(" · ");
        ArrayList arrayListM203D2 = m203D(c0263i8M209f);
        String strM201B = m201B();
        Iterator it2 = arrayListM203D2.iterator();
        while (it2.hasNext()) {
            if (strM201B.equals(m210g((C0298k8) it2.next()))) {
                i++;
            }
        }
        sb.append(i);
        sb.append("/");
        sb.append(arrayListM203D.size());
        return sb.toString();
    }
}
