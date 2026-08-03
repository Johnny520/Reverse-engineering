package com.tendcloud.tenddata;

import android.content.Context;

/* JADX INFO: renamed from: com.tendcloud.tenddata.i */
/* JADX INFO: loaded from: classes.dex */
public class C0116i {

    /* JADX INFO: renamed from: A */
    private static final String f500A = "TDtime_set_collect_net";

    /* JADX INFO: renamed from: B */
    private static final String f501B = "TDtd_role_id";

    /* JADX INFO: renamed from: C */
    private static final String f502C = "TDpref.accountid.key";

    /* JADX INFO: renamed from: D */
    private static final String f503D = "TDpref.accountgame.key";

    /* JADX INFO: renamed from: E */
    private static final String f504E = "TDpref.missionid.key";

    /* JADX INFO: renamed from: F */
    private static final String f505F = "TDpref.game.session.startsystem.key";

    /* JADX INFO: renamed from: a */
    public static final String f506a = "TDpref.profile.key";

    /* JADX INFO: renamed from: b */
    public static final String f507b = "TDpref.session.key";

    /* JADX INFO: renamed from: c */
    public static final String f508c = "TDpref.session.backup.key";

    /* JADX INFO: renamed from: d */
    public static final String f509d = "TDpref.lastactivity.key";

    /* JADX INFO: renamed from: e */
    public static final String f510e = "TDpref.start.key";

    /* JADX INFO: renamed from: f */
    public static final String f511f = "TDpref.init.key";

    /* JADX INFO: renamed from: g */
    public static final String f512g = "TDpref.init.flag";

    /* JADX INFO: renamed from: h */
    public static final String f513h = "TDpref.actstart.key";

    /* JADX INFO: renamed from: i */
    public static final String f514i = "TDpref.end.key";

    /* JADX INFO: renamed from: j */
    public static final String f515j = "TDpref.ip";

    /* JADX INFO: renamed from: k */
    public static final String f516k = "TD_CHANNEL_ID";

    /* JADX INFO: renamed from: l */
    public static final String f517l = "TDappcontext_push";

    /* JADX INFO: renamed from: m */
    public static final String f518m = "TDpref.tokensync.key";

    /* JADX INFO: renamed from: n */
    public static final String f519n = "TDpref.push.msgid.key";

    /* JADX INFO: renamed from: o */
    public static final String f520o = "TDpref.running.app.key";

    /* JADX INFO: renamed from: p */
    public static final String f521p = "TDpref_longtime";

    /* JADX INFO: renamed from: q */
    public static final String f522q = "TDpref_shorttime";

    /* JADX INFO: renamed from: r */
    public static final String f523r = "TDapp.account.key";

    /* JADX INFO: renamed from: s */
    public static final String f524s = "TDuniversal.account.key";

    /* JADX INFO: renamed from: t */
    public static final String f525t = "TDaes_key";

    /* JADX INFO: renamed from: u */
    public static final String f526u = "TDpref_game";

    /* JADX INFO: renamed from: v */
    public static final String f527v = "TD_push_pref_file";

    /* JADX INFO: renamed from: w */
    public static final String f528w = "TDisAppQuiting";

    /* JADX INFO: renamed from: x */
    public static final String f529x = "TDpref.last.sdk.check";

    /* JADX INFO: renamed from: y */
    public static final String f530y = "TDadditionalVersionName";

    /* JADX INFO: renamed from: z */
    public static final String f531z = "TDadditionalVersionCode";

    /* JADX INFO: renamed from: a */
    public static String m531a() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return null;
        }
        try {
            return C0125s.m728b(context, f521p, f525t, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m532a(AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context != null && abstractC0018a != null) {
            try {
                return C0125s.m728b(context, f521p + abstractC0018a.index(), f507b, (String) null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m533a(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return null;
        }
        try {
            return C0125s.m728b(context, f522q, str, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m534a(long j, AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context == null || abstractC0018a == null) {
            return;
        }
        try {
            C0125s.m725a(context, f521p + abstractC0018a.index(), f510e, j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m535a(String str, AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context == null || abstractC0018a == null) {
            return;
        }
        try {
            C0125s.m726a(context, f521p + abstractC0018a.index(), f507b, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m536a(String str, String str2) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f522q, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m537a(boolean z, AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context == null || abstractC0018a == null) {
            return;
        }
        try {
            C0125s.m725a(context, f521p + abstractC0018a.index(), f512g, z ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m538b(AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context != null && abstractC0018a != null) {
            try {
                return C0125s.m728b(context, f521p + abstractC0018a.index(), f508c, (String) null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m539b(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return null;
        }
        try {
            return C0125s.m728b(context, f522q, str, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m540b() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences("TD_CHANNEL_ID", 0).edit().putBoolean("location_called", true).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m541b(long j, AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context == null || abstractC0018a == null) {
            return;
        }
        try {
            C0125s.m725a(context, f521p + abstractC0018a.index(), f511f, j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m542b(String str, AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context == null || abstractC0018a == null) {
            return;
        }
        try {
            C0125s.m726a(context, f521p + abstractC0018a.index(), f508c, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m543b(String str, String str2) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f522q, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m544c(AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context != null && abstractC0018a != null) {
            try {
                return C0125s.m727b(context, f521p + abstractC0018a.index(), f510e, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    public static String m545c(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return "";
        }
        try {
            return C0125s.m728b(context, f526u, str + f503D, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m546c(long j, AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context == null || abstractC0018a == null) {
            return;
        }
        try {
            C0125s.m725a(context, f522q + abstractC0018a.index(), f514i, j);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m547c(String str, String str2) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f526u, str + f503D, str2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m548c() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return false;
        }
        try {
            return context.getSharedPreferences("TD_CHANNEL_ID", 0).getBoolean("location_called", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static long m549d(AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context != null && abstractC0018a != null) {
            try {
                return C0125s.m727b(context, f521p + abstractC0018a.index(), f511f, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public static String m550d() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return "";
        }
        try {
            return C0125s.m728b(context, f522q, f509d, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m551e() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return 0L;
        }
        try {
            return C0125s.m727b(context, f521p, f511f, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    public static long m552e(AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context != null && abstractC0018a != null) {
            try {
                return C0125s.m727b(context, f521p + abstractC0018a.index(), f512g, 1L);
            } catch (Throwable unused) {
            }
        }
        return 1L;
    }

    /* JADX INFO: renamed from: f */
    public static long m553f() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return 0L;
        }
        try {
            return C0125s.m727b(context, f522q, f513h, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m554f(AbstractC0018a abstractC0018a) {
        Context context = C0020ab.f132g;
        if (context != null && abstractC0018a != null) {
            try {
                return C0125s.m727b(context, f522q + abstractC0018a.index(), f514i, 0L);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public static long m555g() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return 0L;
        }
        try {
            return C0125s.m727b(context, f521p, f520o, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m556h() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return null;
        }
        try {
            return C0125s.m728b(context, f521p, f530y, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m557i() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return -1L;
        }
        try {
            return C0125s.m727b(context, f521p, f531z, -1L);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m558j() {
        try {
            return m557i() != -1 ? Integer.parseInt(String.valueOf(m557i())) : C0114g.m517a().m520b(C0020ab.f132g);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m559k() {
        try {
            return m556h() != null ? m556h() : C0114g.m517a().m521c(C0020ab.f132g);
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m560l() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return null;
        }
        try {
            return C0125s.m728b(context, f522q, f523r, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static String m561m() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return null;
        }
        try {
            return C0125s.m728b(context, f522q, f524s, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m562n() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return null;
        }
        try {
            return C0125s.m728b(context, f522q, f501B, (String) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static long m563o() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return 0L;
        }
        try {
            return C0125s.m727b(context, f522q, f500A, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m564p() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return "";
        }
        try {
            return C0125s.m728b(context, f526u, f502C, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m565q() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return "";
        }
        try {
            return C0125s.m728b(context, f526u, f504E, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m566r() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m725a(context, f526u, f505F, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m567s() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return "";
        }
        try {
            return C0125s.m728b(context, f527v, f517l, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void setAESKey(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f521p, f525t, str);
        } catch (Throwable unused) {
        }
    }

    public static void setActivityStartTime(long j) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m725a(context, f522q, f513h, j);
        } catch (Throwable unused) {
        }
    }

    public static void setAdditionalVersionCode(long j) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m725a(context, f521p, f531z, j);
        } catch (Throwable unused) {
        }
    }

    public static void setAdditionalVersionName(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f521p, f530y, str);
        } catch (Throwable unused) {
        }
    }

    public static void setCollectNetInfoTime(long j) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m725a(context, f522q, f500A, j);
        } catch (Throwable unused) {
        }
    }

    public static void setCollectRunningTime(long j) {
        try {
            C0125s.m725a(C0020ab.f132g, f521p, f520o, j);
        } catch (Throwable unused) {
        }
    }

    public static void setInitTime(long j) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m725a(context, f521p, f511f, j);
        } catch (Throwable unused) {
        }
    }

    public static void setLastActivity(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f522q, f509d, str);
        } catch (Throwable unused) {
        }
    }

    public static void setLastRoleName(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f522q, f501B, str);
        } catch (Throwable unused) {
        }
    }

    public static void setMissionId(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f526u, f504E, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPostProfile(boolean z) {
        try {
            C0125s.m725a(C0020ab.f132g, f521p, f506a, z ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    public static void setProfileId(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f526u, f502C, str);
        } catch (Throwable unused) {
        }
    }

    public static void setProfileInfo(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f522q, f523r, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushAppContext(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f527v, f517l, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushLastMsgId(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f527v, f519n, str);
        } catch (Throwable unused) {
        }
    }

    public static void setPushSyncTokenLastTime(long j) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m725a(context, f527v, f518m, j);
        } catch (Throwable unused) {
        }
    }

    public static void setUniversalProfileInfo(String str) {
        Context context = C0020ab.f132g;
        if (context == null) {
            return;
        }
        try {
            C0125s.m726a(context, f522q, f524s, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static long m568t() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return 0L;
        }
        try {
            return C0125s.m727b(context, f527v, f518m, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m569u() {
        Context context = C0020ab.f132g;
        if (context == null) {
            return "";
        }
        try {
            return C0125s.m728b(context, f527v, f519n, "");
        } catch (Throwable unused) {
            return "";
        }
    }
}
