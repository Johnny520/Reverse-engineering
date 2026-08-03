package com.tendcloud.tenddata;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cb */
/* JADX INFO: loaded from: classes.dex */
public final class C0074cb {

    /* JADX INFO: renamed from: a */
    private static final String f365a = "oaid_limit_state";

    /* JADX INFO: renamed from: b */
    private static final String f366b = "oaid";

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cb$a */
    public static final class a {

        /* JADX INFO: renamed from: id */
        public String f367id;
        public boolean isLimit;
    }

    /* JADX INFO: renamed from: a */
    public static String m399a(Context context, ServiceConnectionC0075cc serviceConnectionC0075cc) {
        C0115h.iForInternal("get Honor id from service");
        try {
            Intent intent = new Intent();
            intent.setAction("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            context.bindService(intent, serviceConnectionC0075cc, 1);
            C0115h.iForInternal("bind honor id serice");
            long jCurrentTimeMillis = System.currentTimeMillis();
            serviceConnectionC0075cc.f369b.await(2000L, TimeUnit.MILLISECONDS);
            C0115h.iForInternal("countDown end:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            serviceConnectionC0075cc.unbind(context);
            a aVar = serviceConnectionC0075cc.f368a;
            if (aVar != null) {
                return aVar.f367id;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m400a(Context context) {
        if (C0069bx.m375c()) {
            return m401b(context);
        }
        C0115h.iForInternal("not honor");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m401b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo("com.hihonor.id", 0);
            Intent intent = new Intent("com.hihonor.id.HnOaIdService");
            intent.setPackage("com.hihonor.id");
            boolean z = !packageManager.queryIntentServices(intent, 0).isEmpty();
            C0115h.iForInternal("honor id service is exist:" + z);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void bindHonorServiceGetOAID(Context context) {
        C0115h.iForInternal("try to get id from cache");
        String strM402c = m402c(context);
        C0115h.iForInternal("get id from cache:", strM402c);
        if (TextUtils.isEmpty(strM402c)) {
            strM402c = m399a(context, new ServiceConnectionC0075cc());
            C0115h.iForInternal("get id from service:", strM402c);
        }
        if (TextUtils.isEmpty(strM402c)) {
            C0073ca.bindHWServiceGetOAID(context);
        } else {
            C0105df.m491a().setOAID(strM402c);
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m402c(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            String string = Settings.Global.getString(contentResolver, f366b);
            String string2 = Settings.Global.getString(contentResolver, f365a);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if (TextUtils.isEmpty(string2)) {
                return null;
            }
            return string;
        } catch (Throwable unused) {
            return null;
        }
    }
}
