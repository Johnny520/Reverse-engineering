package com.tendcloud.tenddata;

import android.os.Environment;
import java.io.IOException;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tendcloud.tenddata.db */
/* JADX INFO: loaded from: classes.dex */
public class C0101db extends AbstractC0097cy {
    public C0101db() throws IOException {
        m473a("manufacture", C0118k.m605f());
        m473a("brand", C0118k.m607g());
        m473a("model", C0118k.m608h());
        m473a("dummy0", C0119l.m640a("dummy0"));
        JSONArray jSONArray = new JSONArray();
        for (String str : C0118k.m625p()) {
            jSONArray.put(str);
        }
        m473a("cpuInfo", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (int i : C0118k.m633t()) {
            jSONArray2.put(i);
        }
        m473a("memoryInfo", jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        for (int i2 : C0118k.m631s()) {
            jSONArray3.put(i2);
        }
        m473a("sdCardInfo", jSONArray3);
        C0118k.m589a(C0020ab.f132g, this.f433b);
        C0118k.m595b(C0020ab.f132g, this.f433b);
        m473a("totalDiskSpace", Integer.valueOf(m480a()));
        m473a("support", C0118k.m609h(C0020ab.f132g));
        m473a("cpu", C0118k.m627q());
        m473a("nfcHce", C0118k.m594b(C0020ab.f132g));
    }

    /* JADX INFO: renamed from: a */
    public static int m480a() {
        try {
            int[] iArrM635u = C0118k.m635u();
            if (iArrM635u != null) {
                return !Environment.isExternalStorageEmulated() ? iArrM635u[0] + iArrM635u[2] : iArrM635u[0];
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void setSlots(int i) {
        m473a("slots", Integer.valueOf(i));
    }
}
