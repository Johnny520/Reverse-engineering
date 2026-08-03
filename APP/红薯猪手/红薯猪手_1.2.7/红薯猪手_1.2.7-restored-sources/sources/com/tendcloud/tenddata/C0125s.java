package com.tendcloud.tenddata;

import android.content.Context;

/* JADX INFO: renamed from: com.tendcloud.tenddata.s */
/* JADX INFO: loaded from: classes.dex */
public class C0125s {
    /* JADX INFO: renamed from: a */
    public static void m725a(Context context, String str, String str2, long j) {
        try {
            context.getSharedPreferences(str, 0).edit().putLong(str2, j).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m726a(Context context, String str, String str2, String str3) {
        try {
            context.getSharedPreferences(str, 0).edit().putString(str2, str3).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m727b(Context context, String str, String str2, long j) {
        try {
            return context.getSharedPreferences(str, 0).getLong(str2, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m728b(Context context, String str, String str2, String str3) {
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable unused) {
            return str3;
        }
    }
}
