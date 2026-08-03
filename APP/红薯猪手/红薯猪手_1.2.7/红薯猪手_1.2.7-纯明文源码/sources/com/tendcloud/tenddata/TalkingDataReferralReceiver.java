package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tendcloud.tenddata.C0089cq;
import com.tendcloud.tenddata.C0133zz;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class TalkingDataReferralReceiver extends BroadcastReceiver {
    /* JADX DEBUG: Throwable added to exception handler: 'Exception', keep only Throwable */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws UnsupportedEncodingException {
        String stringExtra;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.containsKey(null);
            }
            if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || (stringExtra = intent.getStringExtra("referrer")) == null || stringExtra.length() == 0) {
                return;
            }
            String strDecode = URLDecoder.decode(stringExtra, "UTF-8");
            if (C0020ab.f132g == null) {
                C0020ab.f132g = context.getApplicationContext();
            }
            C0133zz.a aVar = new C0133zz.a();
            aVar.paraMap.put("domain", "app");
            aVar.paraMap.put("apiType", 1);
            aVar.paraMap.put("action", "install");
            aVar.paraMap.put("service", AbstractC0018a.UNIVERSAL);
            TreeMap treeMap = new TreeMap();
            treeMap.put("referer", strDecode);
            aVar.paraMap.put(C0089cq.a.DATA, treeMap);
            C0133zz.m796c().obtainMessage(C0133zz.f658f, aVar).sendToTarget();
        } catch (Throwable unused) {
        }
    }
}
