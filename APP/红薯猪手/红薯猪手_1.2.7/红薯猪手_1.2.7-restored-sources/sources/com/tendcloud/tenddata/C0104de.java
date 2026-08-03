package com.tendcloud.tenddata;

import android.os.Build;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.de */
/* JADX INFO: loaded from: classes.dex */
public class C0104de extends AbstractC0097cy {
    public C0104de() {
        m473a("os", "android");
        m473a("osVersionName", C0118k.m586a());
        m473a("isHarmony", Boolean.valueOf(C0118k.m596b()));
        m473a("harmonyOsVersion", C0118k.m598c());
        m473a("kernelVersion", C0118k.m600d());
        m473a("osVersionCode", String.valueOf(C0118k.m616l()));
        m473a("timezone", TimeZone.getDefault().getID());
        m473a("locale", m486e());
        m473a("timezoneV", m488g());
        m473a("language", C0118k.m620n());
        m473a("romVersion", Build.FINGERPRINT);
        m473a("basebandVersion", m485d());
        m473a("osBuild", C0118k.m602e());
        m473a("isAdbEnabled", Boolean.valueOf(C0118k.m590a(C0020ab.f132g)));
    }

    /* JADX INFO: renamed from: d */
    public static String m485d() {
        try {
            if (C0131y.m754a(14)) {
                return Build.getRadioVersion();
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m486e() {
        try {
            return Locale.getDefault().toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static float m487f() {
        try {
            return TimeZone.getDefault().getRawOffset() / 3600000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m488g() {
        try {
            return String.valueOf(m487f());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m489a() {
        return ((JSONObject) mo467b()).optString("timezoneV");
    }

    /* JADX INFO: renamed from: c */
    public String m490c() {
        return ((JSONObject) mo467b()).optString("locale");
    }
}
