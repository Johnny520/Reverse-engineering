package com.tendcloud.tenddata;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cg */
/* JADX INFO: loaded from: classes.dex */
public class C0079cg {
    /* JADX INFO: renamed from: a */
    public static boolean m408a(Context context) {
        try {
            return C0069bx.m384l();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectNUBIA(Context context) {
        String string;
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (contentProviderClientAcquireContentProviderClient != null) {
                Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                contentProviderClientAcquireContentProviderClient.close();
                if (bundleCall == null || bundleCall.getInt("code", -1) != 0 || (string = bundleCall.getString("id")) == null) {
                    return;
                }
                C0105df.m491a().setOAID(string);
            }
        } catch (Throwable unused) {
        }
    }
}
