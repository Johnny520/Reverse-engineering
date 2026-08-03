package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ce */
/* JADX INFO: loaded from: classes.dex */
public class C0077ce {
    /* JADX INFO: renamed from: a */
    public static boolean m406a(Context context) {
        PackageManager packageManager;
        try {
            if (C0069bx.m381i() && (packageManager = context.getPackageManager()) != null) {
                if (packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void reflectMEiZU(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            if (cursorQuery != null) {
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                if (string != null) {
                    C0105df.m491a().setOAID(string);
                }
                cursorQuery.close();
            }
        } catch (Throwable unused) {
        }
    }
}
