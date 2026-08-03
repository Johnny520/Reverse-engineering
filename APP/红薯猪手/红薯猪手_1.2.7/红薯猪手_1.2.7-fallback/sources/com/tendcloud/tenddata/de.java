package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class de extends com.tendcloud.tenddata.cy {
    public de() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "os"
            java.lang.String r1 = "android"
            r2.a(r0, r1)
            java.lang.String r0 = com.tendcloud.tenddata.k.a()
            java.lang.String r1 = "osVersionName"
            r2.a(r1, r0)
            boolean r0 = com.tendcloud.tenddata.k.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "isHarmony"
            r2.a(r1, r0)
            java.lang.String r0 = com.tendcloud.tenddata.k.c()
            java.lang.String r1 = "harmonyOsVersion"
            r2.a(r1, r0)
            java.lang.String r0 = com.tendcloud.tenddata.k.d()
            java.lang.String r1 = "kernelVersion"
            r2.a(r1, r0)
            int r0 = com.tendcloud.tenddata.k.l()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "osVersionCode"
            r2.a(r1, r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r0 = r0.getID()
            java.lang.String r1 = "timezone"
            r2.a(r1, r0)
            java.lang.String r0 = e()
            java.lang.String r1 = "locale"
            r2.a(r1, r0)
            java.lang.String r0 = g()
            java.lang.String r1 = "timezoneV"
            r2.a(r1, r0)
            java.lang.String r0 = com.tendcloud.tenddata.k.n()
            java.lang.String r1 = "language"
            r2.a(r1, r0)
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "romVersion"
            r2.a(r1, r0)
            java.lang.String r0 = d()
            java.lang.String r1 = "basebandVersion"
            r2.a(r1, r0)
            java.lang.String r0 = com.tendcloud.tenddata.k.e()
            java.lang.String r1 = "osBuild"
            r2.a(r1, r0)
            android.content.Context r0 = com.tendcloud.tenddata.ab.g
            boolean r0 = com.tendcloud.tenddata.k.a(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "isAdbEnabled"
            r2.a(r1, r0)
            return
    }

    public static java.lang.String d() {
            r0 = 14
            r1 = 0
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Le
            java.lang.String r0 = android.os.Build.getRadioVersion()     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            return r1
    }

    public static java.lang.String e() {
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static float f() {
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch: java.lang.Throwable -> Le
            int r0 = r0.getRawOffset()     // Catch: java.lang.Throwable -> Le
            float r0 = (float) r0
            r1 = 1247525376(0x4a5bba00, float:3600000.0)
            float r0 = r0 / r1
            return r0
        Le:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r0
    }

    private static java.lang.String g() {
            float r0 = f()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.lang.String a() {
            r2 = this;
            java.lang.Object r0 = r2.b()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "timezoneV"
            java.lang.String r0 = r0.optString(r1)
            return r0
    }

    public java.lang.String c() {
            r2 = this;
            java.lang.Object r0 = r2.b()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = "locale"
            java.lang.String r0 = r0.optString(r1)
            return r0
    }
}
