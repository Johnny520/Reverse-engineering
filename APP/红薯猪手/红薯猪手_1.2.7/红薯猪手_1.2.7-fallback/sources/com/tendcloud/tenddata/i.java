package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class i {
    private static final java.lang.String A = "TDtime_set_collect_net";
    private static final java.lang.String B = "TDtd_role_id";
    private static final java.lang.String C = "TDpref.accountid.key";
    private static final java.lang.String D = "TDpref.accountgame.key";
    private static final java.lang.String E = "TDpref.missionid.key";
    private static final java.lang.String F = "TDpref.game.session.startsystem.key";
    public static final java.lang.String a = "TDpref.profile.key";
    public static final java.lang.String b = "TDpref.session.key";
    public static final java.lang.String c = "TDpref.session.backup.key";
    public static final java.lang.String d = "TDpref.lastactivity.key";
    public static final java.lang.String e = "TDpref.start.key";
    public static final java.lang.String f = "TDpref.init.key";
    public static final java.lang.String g = "TDpref.init.flag";
    public static final java.lang.String h = "TDpref.actstart.key";
    public static final java.lang.String i = "TDpref.end.key";
    public static final java.lang.String j = "TDpref.ip";
    public static final java.lang.String k = "TD_CHANNEL_ID";
    public static final java.lang.String l = "TDappcontext_push";
    public static final java.lang.String m = "TDpref.tokensync.key";
    public static final java.lang.String n = "TDpref.push.msgid.key";
    public static final java.lang.String o = "TDpref.running.app.key";
    public static final java.lang.String p = "TDpref_longtime";
    public static final java.lang.String q = "TDpref_shorttime";
    public static final java.lang.String r = "TDapp.account.key";
    public static final java.lang.String s = "TDuniversal.account.key";
    public static final java.lang.String t = "TDaes_key";
    public static final java.lang.String u = "TDpref_game";
    public static final java.lang.String v = "TD_push_pref_file";
    public static final java.lang.String w = "TDisAppQuiting";
    public static final java.lang.String x = "TDpref.last.sdk.check";
    public static final java.lang.String y = "TDadditionalVersionName";
    public static final java.lang.String z = "TDadditionalVersionCode";

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TDpref_longtime"
            java.lang.String r3 = "TDaes_key"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            return r1
    }

    public static java.lang.String a(com.tendcloud.tenddata.a r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 == 0) goto L24
            if (r4 != 0) goto L8
            goto L24
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "TDpref_longtime"
            r2.append(r3)     // Catch: java.lang.Throwable -> L24
            int r4 = r4.index()     // Catch: java.lang.Throwable -> L24
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "TDpref.session.key"
            java.lang.String r4 = com.tendcloud.tenddata.s.b(r0, r4, r2, r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            return r1
    }

    public static java.lang.String a(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TDpref_shorttime"
            java.lang.String r3 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            return r1
    }

    public static void a(long r3, com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L21
            if (r5 != 0) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "TDpref_longtime"
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L21
            r1.append(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "TDpref.start.key"
            com.tendcloud.tenddata.s.a(r0, r5, r1, r3)     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    public static void a(java.lang.String r3, com.tendcloud.tenddata.a r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L21
            if (r4 != 0) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "TDpref_longtime"
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            int r4 = r4.index()     // Catch: java.lang.Throwable -> L21
            r1.append(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "TDpref.session.key"
            com.tendcloud.tenddata.s.a(r0, r4, r1, r3)     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    public static void a(java.lang.String r2, java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public static void a(boolean r4, com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L28
            if (r5 != 0) goto L7
            goto L28
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "TDpref_longtime"
            r1.append(r2)     // Catch: java.lang.Throwable -> L28
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L28
            r1.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L28
            java.lang.String r1 = "TDpref.init.flag"
            if (r4 == 0) goto L23
            r2 = 1
            goto L25
        L23:
            r2 = 0
        L25:
            com.tendcloud.tenddata.s.a(r0, r5, r1, r2)     // Catch: java.lang.Throwable -> L28
        L28:
            return
    }

    public static java.lang.String b(com.tendcloud.tenddata.a r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 == 0) goto L24
            if (r4 != 0) goto L8
            goto L24
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "TDpref_longtime"
            r2.append(r3)     // Catch: java.lang.Throwable -> L24
            int r4 = r4.index()     // Catch: java.lang.Throwable -> L24
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "TDpref.session.backup.key"
            java.lang.String r4 = com.tendcloud.tenddata.s.b(r0, r4, r2, r1)     // Catch: java.lang.Throwable -> L24
            return r4
        L24:
            return r1
    }

    public static java.lang.String b(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TDpref_shorttime"
            java.lang.String r3 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            return r1
    }

    public static void b() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TD_CHANNEL_ID"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "location_called"
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)     // Catch: java.lang.Throwable -> L1a
            r0.commit()     // Catch: java.lang.Throwable -> L1a
        L1a:
            return
    }

    public static void b(long r3, com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L21
            if (r5 != 0) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "TDpref_longtime"
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L21
            r1.append(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "TDpref.init.key"
            com.tendcloud.tenddata.s.a(r0, r5, r1, r3)     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    public static void b(java.lang.String r3, com.tendcloud.tenddata.a r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L21
            if (r4 != 0) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "TDpref_longtime"
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            int r4 = r4.index()     // Catch: java.lang.Throwable -> L21
            r1.append(r4)     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "TDpref.session.backup.key"
            com.tendcloud.tenddata.s.a(r0, r4, r1, r3)     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    public static void b(java.lang.String r2, java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public static long c(com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 == 0) goto L25
            if (r5 != 0) goto L9
            goto L25
        L9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "TDpref_longtime"
            r3.append(r4)     // Catch: java.lang.Throwable -> L25
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L25
            r3.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "TDpref.start.key"
            long r0 = com.tendcloud.tenddata.s.b(r0, r5, r3, r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L25:
            return r1
    }

    public static java.lang.String c(java.lang.String r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r2 = "TDpref_game"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1f
            r3.<init>()     // Catch: java.lang.Throwable -> L1f
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "TDpref.accountgame.key"
            r3.append(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = com.tendcloud.tenddata.s.b(r0, r2, r4, r1)     // Catch: java.lang.Throwable -> L1f
            return r4
        L1f:
            return r1
    }

    public static void c(long r3, com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 == 0) goto L21
            if (r5 != 0) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "TDpref_shorttime"
            r1.append(r2)     // Catch: java.lang.Throwable -> L21
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L21
            r1.append(r5)     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "TDpref.end.key"
            com.tendcloud.tenddata.s.a(r0, r5, r1, r3)     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    public static void c(java.lang.String r3, java.lang.String r4) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_game"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r2.<init>()     // Catch: java.lang.Throwable -> L1b
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "TDpref.accountgame.key"
            r2.append(r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L1b
            com.tendcloud.tenddata.s.a(r0, r1, r3, r4)     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public static boolean c() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TD_CHANNEL_ID"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "location_called"
            boolean r0 = r0.getBoolean(r2, r1)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            return r1
    }

    public static long d(com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 == 0) goto L25
            if (r5 != 0) goto L9
            goto L25
        L9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "TDpref_longtime"
            r3.append(r4)     // Catch: java.lang.Throwable -> L25
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L25
            r3.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "TDpref.init.key"
            long r0 = com.tendcloud.tenddata.s.b(r0, r5, r3, r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L25:
            return r1
    }

    public static java.lang.String d() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r2 = "TDpref_shorttime"
            java.lang.String r3 = "TDpref.lastactivity.key"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static long e() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r3 = "TDpref_longtime"
            java.lang.String r4 = "TDpref.init.key"
            long r0 = com.tendcloud.tenddata.s.b(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static long e(com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 1
            if (r0 == 0) goto L25
            if (r5 != 0) goto L9
            goto L25
        L9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "TDpref_longtime"
            r3.append(r4)     // Catch: java.lang.Throwable -> L25
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L25
            r3.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "TDpref.init.flag"
            long r0 = com.tendcloud.tenddata.s.b(r0, r5, r3, r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L25:
            return r1
    }

    public static long f() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r3 = "TDpref_shorttime"
            java.lang.String r4 = "TDpref.actstart.key"
            long r0 = com.tendcloud.tenddata.s.b(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static long f(com.tendcloud.tenddata.a r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 == 0) goto L25
            if (r5 != 0) goto L9
            goto L25
        L9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "TDpref_shorttime"
            r3.append(r4)     // Catch: java.lang.Throwable -> L25
            int r5 = r5.index()     // Catch: java.lang.Throwable -> L25
            r3.append(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "TDpref.end.key"
            long r0 = com.tendcloud.tenddata.s.b(r0, r5, r3, r1)     // Catch: java.lang.Throwable -> L25
            return r0
        L25:
            return r1
    }

    public static long g() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r3 = "TDpref_longtime"
            java.lang.String r4 = "TDpref.running.app.key"
            long r0 = com.tendcloud.tenddata.s.b(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static java.lang.String h() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TDpref_longtime"
            java.lang.String r3 = "TDadditionalVersionName"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            return r1
    }

    public static long i() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = -1
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r3 = "TDpref_longtime"
            java.lang.String r4 = "TDadditionalVersionCode"
            long r0 = com.tendcloud.tenddata.s.b(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static int j() {
            long r0 = i()     // Catch: java.lang.Throwable -> L22
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            long r0 = i()     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L22
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L22
            return r0
        L17:
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a()     // Catch: java.lang.Throwable -> L22
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L22
            int r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L22
            return r0
        L22:
            r0 = -1
            return r0
    }

    public static java.lang.String k() {
            java.lang.String r0 = h()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto Lb
            java.lang.String r0 = h()     // Catch: java.lang.Throwable -> L16
            return r0
        Lb:
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a()     // Catch: java.lang.Throwable -> L16
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L16
            java.lang.String r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            java.lang.String r0 = "unknown"
            return r0
    }

    public static java.lang.String l() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TDpref_shorttime"
            java.lang.String r3 = "TDapp.account.key"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            return r1
    }

    public static java.lang.String m() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TDpref_shorttime"
            java.lang.String r3 = "TDuniversal.account.key"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            return r1
    }

    public static java.lang.String n() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "TDpref_shorttime"
            java.lang.String r3 = "TDtd_role_id"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            return r1
    }

    public static long o() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r3 = "TDpref_shorttime"
            java.lang.String r4 = "TDtime_set_collect_net"
            long r0 = com.tendcloud.tenddata.s.b(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static java.lang.String p() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r2 = "TDpref_game"
            java.lang.String r3 = "TDpref.accountid.key"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static java.lang.String q() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r2 = "TDpref_game"
            java.lang.String r3 = "TDpref.missionid.key"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static void r() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_game"
            java.lang.String r2 = "TDpref.game.session.startsystem.key"
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L10
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public static java.lang.String s() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r2 = "TD_push_pref_file"
            java.lang.String r3 = "TDappcontext_push"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static void setAESKey(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_longtime"
            java.lang.String r2 = "TDaes_key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setActivityStartTime(long r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            java.lang.String r2 = "TDpref.actstart.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setAdditionalVersionCode(long r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_longtime"
            java.lang.String r2 = "TDadditionalVersionCode"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setAdditionalVersionName(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_longtime"
            java.lang.String r2 = "TDadditionalVersionName"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setCollectNetInfoTime(long r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            java.lang.String r2 = "TDtime_set_collect_net"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setCollectRunningTime(long r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L9
            java.lang.String r1 = "TDpref_longtime"
            java.lang.String r2 = "TDpref.running.app.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L9
        L9:
            return
    }

    public static void setInitTime(long r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_longtime"
            java.lang.String r2 = "TDpref.init.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setLastActivity(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            java.lang.String r2 = "TDpref.lastactivity.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setLastRoleName(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            java.lang.String r2 = "TDtd_role_id"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setMissionId(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_game"
            java.lang.String r2 = "TDpref.missionid.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setPostProfile(boolean r5) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = "TDpref_longtime"
            java.lang.String r2 = "TDpref.profile.key"
            if (r5 == 0) goto Lb
            r3 = 1
            goto Ld
        Lb:
            r3 = 0
        Ld:
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public static void setProfileId(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_game"
            java.lang.String r2 = "TDpref.accountid.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setProfileInfo(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            java.lang.String r2 = "TDapp.account.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setPushAppContext(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TD_push_pref_file"
            java.lang.String r2 = "TDappcontext_push"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setPushLastMsgId(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TD_push_pref_file"
            java.lang.String r2 = "TDpref.push.msgid.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setPushSyncTokenLastTime(long r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TD_push_pref_file"
            java.lang.String r2 = "TDpref.tokensync.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static void setUniversalProfileInfo(java.lang.String r3) {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "TDpref_shorttime"
            java.lang.String r2 = "TDuniversal.account.key"
            com.tendcloud.tenddata.s.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return
    }

    public static long t() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            r1 = 0
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r3 = "TD_push_pref_file"
            java.lang.String r4 = "TDpref.tokensync.key"
            long r0 = com.tendcloud.tenddata.s.b(r0, r3, r4, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }

    public static java.lang.String u() {
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r2 = "TD_push_pref_file"
            java.lang.String r3 = "TDpref.push.msgid.key"
            java.lang.String r0 = com.tendcloud.tenddata.s.b(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            return r1
    }
}
