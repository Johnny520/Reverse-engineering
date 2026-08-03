package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public s() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.putLong(r3, r4)     // Catch: java.lang.Throwable -> L10
            r1.commit()     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public static void a(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L10
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r4)     // Catch: java.lang.Throwable -> L10
            r1.commit()     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public static long b(android.content.Context r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> La
            long r1 = r1.getLong(r3, r4)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            return r4
    }

    public static java.lang.String b(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> La
            java.lang.String r1 = r1.getString(r3, r4)     // Catch: java.lang.Throwable -> La
            return r1
        La:
            return r4
    }
}
