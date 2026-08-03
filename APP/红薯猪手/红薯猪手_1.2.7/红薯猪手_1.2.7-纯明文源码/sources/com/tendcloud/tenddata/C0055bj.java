package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0066bu;
import com.tendcloud.tenddata.C0089cq;
import com.tendcloud.tenddata.C0133zz;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bj */
/* JADX INFO: loaded from: classes.dex */
public class C0055bj {

    /* JADX INFO: renamed from: a */
    private static volatile C0055bj f291a;

    static {
        try {
            C0132z.m785a().register(m322a());
        } catch (Throwable unused) {
        }
    }

    private C0055bj() {
    }

    /* JADX INFO: renamed from: a */
    public static C0055bj m322a() {
        if (f291a == null) {
            synchronized (C0055bj.class) {
                if (f291a == null) {
                    f291a = new C0055bj();
                }
            }
        }
        return f291a;
    }

    public final void onTDEBEventIAP(C0133zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 8) {
                    C0067bv c0067bv = new C0067bv();
                    Object obj = aVar.paraMap.get(C0089cq.a.DATA);
                    AbstractC0018a abstractC0018a = (AbstractC0018a) aVar.paraMap.get("service");
                    c0067bv.f353b = String.valueOf(aVar.paraMap.get("domain"));
                    c0067bv.f354c = String.valueOf(aVar.paraMap.get("action"));
                    if (obj instanceof Map) {
                        c0067bv.f355d = (Map) obj;
                    }
                    c0067bv.f352a = abstractC0018a;
                    C0132z.m785a().post(c0067bv);
                    C0066bu c0066bu = new C0066bu();
                    c0066bu.f350a = abstractC0018a;
                    c0066bu.f351b = C0066bu.a.IMMEDIATELY;
                    C0132z.m785a().post(c0066bu);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
