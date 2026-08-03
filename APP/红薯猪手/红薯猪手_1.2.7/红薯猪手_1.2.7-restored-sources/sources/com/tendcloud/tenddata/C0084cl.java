package com.tendcloud.tenddata;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cl */
/* JADX INFO: loaded from: classes.dex */
public class C0084cl {
    /* JADX INFO: renamed from: a */
    private static String m422a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:3:0x0002, B:28:0x0069, B:30:0x0077, B:32:0x007d, B:33:0x0088, B:23:0x003d, B:25:0x0060, B:24:0x004f, B:10:0x0018, B:13:0x0022, B:16:0x002c), top: B:36:0x0002 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m423a(String str, String str2, Context context) {
        String str3;
        Uri uri;
        Cursor cursorQuery;
        byte b = -1;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != 2986299) {
                if (iHashCode != 3403373) {
                    if (iHashCode == 3611910 && str.equals("vaid")) {
                        b = 1;
                    }
                } else if (str.equals("oaid")) {
                    b = 0;
                }
            } else if (str.equals("aaid")) {
                b = 2;
            }
        } catch (Throwable unused) {
        }
        if (b == 0) {
            str3 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID";
        } else if (b == 1) {
            str3 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + str2;
        } else {
            if (b != 2) {
                uri = null;
                cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                if (cursorQuery != null) {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                    cursorQuery.close();
                }
                return string;
            }
            str3 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + str2;
        }
        uri = Uri.parse(str3);
        cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery != null) {
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m424a() {
        String strM422a;
        try {
            if (C0069bx.m378f() && (strM422a = m422a("persist.sys.identifierid.supported", "0")) != null) {
                return strM422a.equals("1");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectVIVO(Context context) {
        try {
            C0105df.m491a().setOAID(m423a("oaid", null, context));
        } catch (Throwable unused) {
        }
        try {
            C0105df.m491a().setVAID(m423a("vaid", null, context));
        } catch (Throwable unused2) {
        }
        try {
            C0105df.m491a().setAAID(m423a("aaid", null, context));
        } catch (Throwable unused3) {
        }
    }
}
