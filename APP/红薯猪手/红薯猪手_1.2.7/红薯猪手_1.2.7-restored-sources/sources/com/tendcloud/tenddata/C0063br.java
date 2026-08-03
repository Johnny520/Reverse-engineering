package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.br */
/* JADX INFO: loaded from: classes.dex */
final class C0063br extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public ArrayList<ScanResult> f325b;

    /* JADX INFO: renamed from: c */
    public JSONArray f326c;

    /* JADX INFO: renamed from: d */
    public C0046ba f327d;

    /* JADX INFO: renamed from: e */
    public C0046ba f328e;

    /* JADX INFO: renamed from: i */
    private WifiManager f332i;

    /* JADX INFO: renamed from: a */
    public C0047bb f324a = new C0047bb();

    /* JADX INFO: renamed from: f */
    public long f329f = 0;

    /* JADX INFO: renamed from: g */
    public long f330g = 0;

    /* JADX INFO: renamed from: h */
    private long f331h = C0062bq.f319a;

    public C0063br(WifiManager wifiManager) {
        this.f332i = wifiManager;
    }

    /* JADX INFO: renamed from: a */
    private C0046ba m366a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C0042ax(jSONObject.getString("SSID"), jSONObject.getString("BSSID"), (byte) jSONObject.getInt("level"), (byte) 0, (byte) 0));
            } catch (Throwable unused) {
            }
        }
        C0046ba c0046ba = new C0046ba();
        c0046ba.setBsslist(arrayList);
        return c0046ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m367a() {
        try {
            C0067bv c0067bv = new C0067bv();
            c0067bv.f353b = "env";
            c0067bv.f354c = "wifiUpdate";
            c0067bv.f352a = AbstractC0018a.ENV;
            C0132z.m785a().post(c0067bv);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public C0046ba m368b() {
        try {
            this.f327d = m366a(this.f326c);
        } catch (Throwable unused) {
        }
        return this.f327d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public C0046ba m370c() {
        try {
            ArrayList<ScanResult> arrayList = (ArrayList) this.f332i.getScanResults();
            this.f325b = arrayList;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.f325b.size(); i++) {
                    if (this.f325b.get(i).level >= -75) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("SSID", this.f325b.get(i).SSID);
                        jSONObject.put("BSSID", this.f325b.get(i).BSSID);
                        jSONObject.put("level", this.f325b.get(i).level);
                        jSONArray.put(jSONObject);
                    }
                }
                this.f326c = jSONArray;
                this.f328e = m366a(jSONArray);
            }
        } catch (Throwable unused) {
        }
        return this.f328e;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C0058bm.f301a.post(new Runnable() { // from class: com.tendcloud.tenddata.br.1
            @Override // java.lang.Runnable
            public void run() {
                C0046ba c0046ba;
                try {
                    C0063br.this.f329f = System.currentTimeMillis();
                    C0063br c0063br = C0063br.this;
                    if (c0063br.f329f - c0063br.f330g > c0063br.f331h) {
                        C0063br c0063br2 = C0063br.this;
                        c0063br2.f330g = c0063br2.f329f;
                        c0063br2.f327d = c0063br2.m368b();
                        C0063br c0063br3 = C0063br.this;
                        if (c0063br3.f327d == null) {
                            c0063br3.m367a();
                            C0063br c0063br4 = C0063br.this;
                            c0063br4.f327d = c0063br4.m370c();
                        }
                        C0063br c0063br5 = C0063br.this;
                        c0063br5.f328e = c0063br5.m370c();
                        C0063br c0063br6 = C0063br.this;
                        C0046ba c0046ba2 = c0063br6.f327d;
                        if (c0046ba2 == null || (c0046ba = c0063br6.f328e) == null || c0063br6.f324a.m268a(c0046ba2, c0046ba) >= 0.8d) {
                            return;
                        }
                        C0063br.this.m367a();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
