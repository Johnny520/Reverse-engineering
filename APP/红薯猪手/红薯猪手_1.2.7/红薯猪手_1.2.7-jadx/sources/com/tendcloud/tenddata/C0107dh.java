package com.tendcloud.tenddata;

import android.net.Proxy;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.dh */
/* JADX INFO: loaded from: classes.dex */
public class C0107dh extends AbstractC0097cy {

    /* JADX INFO: renamed from: a */
    private C0046ba f472a;

    /* JADX INFO: renamed from: c */
    private String f473c;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.dh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: $SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType */
        public static final /* synthetic */ int[] f474x4bb14de0;

        static {
            int[] iArr = new int[EnumC0108di.values().length];
            f474x4bb14de0 = iArr;
            try {
                iArr[EnumC0108di.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f474x4bb14de0[EnumC0108di.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f474x4bb14de0[EnumC0108di.BLUETOOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C0107dh(EnumC0108di enumC0108di) {
        this.f473c = UUID.randomUUID().toString();
        int i = AnonymousClass1.f474x4bb14de0[enumC0108di.ordinal()];
        if (i != 1) {
            try {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    m473a("type", EnumC0108di.BLUETOOTH.m499a());
                    return;
                }
                m473a("type", EnumC0108di.CELLULAR.m499a());
                m473a("available", Boolean.valueOf(C0122o.m696e(C0020ab.f132g)));
                m473a("connected", Boolean.valueOf(C0122o.m701j(C0020ab.f132g)));
                m473a("ip", C0122o.m671a("cell_ip"));
                m473a("ipv6", C0122o.m671a("cell_ipv6"));
                if (C0122o.m688b(C0020ab.f132g)) {
                    m473a("current", C0122o.m672a(C0020ab.f132g, false));
                }
                if (C0122o.m687b()) {
                    m473a("proxy", Proxy.getDefaultHost() + ":" + Proxy.getDefaultPort());
                }
                m473a("scannable", C0122o.m713v(C0020ab.f132g));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        m473a("type", EnumC0108di.WIFI.m499a());
        m473a("available", Boolean.valueOf(C0122o.m695d(C0020ab.f132g)));
        if (C0122o.m700i(C0020ab.f132g)) {
            m473a("connected", Boolean.TRUE);
            m473a("current", C0122o.m716y(C0020ab.f132g));
            JSONArray jSONArrayM717z = C0122o.m717z(C0020ab.f132g);
            C0046ba c0046baM498a = m498a(jSONArrayM717z);
            if (this.f472a == null) {
                m473a("scannable", jSONArrayM717z);
                this.f472a = c0046baM498a;
            } else if (new C0047bb().m268a(this.f472a, c0046baM498a) > 0.8d) {
                m473a("scannable", (Object) null);
            } else {
                m473a("scannable", jSONArrayM717z);
                this.f472a = c0046baM498a;
                this.f473c = UUID.randomUUID().toString();
            }
            m473a("configured", C0122o.m715x(C0020ab.f132g));
            m473a("ip", C0122o.m671a("ip"));
            m473a("ipv6", C0122o.m671a("ipv6"));
        } else {
            m473a("connected", Boolean.FALSE);
        }
        if (C0122o.m687b()) {
            m473a("proxy", Proxy.getDefaultHost() + ":" + Proxy.getDefaultPort());
        }
        m473a("scannableFingerId", this.f473c);
    }

    /* JADX INFO: renamed from: a */
    private static C0046ba m498a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new C0042ax(jSONObject.getString("name"), jSONObject.getString("id"), (byte) jSONObject.getInt("level"), (byte) 0, (byte) 0));
            } catch (Throwable th) {
                C0115h.eForInternal(th);
            }
        }
        C0046ba c0046ba = new C0046ba();
        c0046ba.setBsslist(arrayList);
        return c0046ba;
    }
}
