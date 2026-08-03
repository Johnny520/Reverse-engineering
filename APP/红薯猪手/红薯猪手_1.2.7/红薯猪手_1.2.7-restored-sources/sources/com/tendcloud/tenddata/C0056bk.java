package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0089cq;
import com.tendcloud.tenddata.C0133zz;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bk */
/* JADX INFO: loaded from: classes.dex */
public class C0056bk {

    /* JADX INFO: renamed from: a */
    private static volatile C0056bk f292a;

    static {
        try {
            C0132z.m785a().register(m323a());
        } catch (Throwable unused) {
        }
    }

    private C0056bk() {
    }

    /* JADX INFO: renamed from: a */
    public static C0056bk m323a() {
        if (f292a == null) {
            synchronized (C0056bk.class) {
                if (f292a == null) {
                    f292a = new C0056bk();
                }
            }
        }
        return f292a;
    }

    public final void onTDEBEventIndustry(C0133zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 17) {
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
                }
            } catch (Throwable unused) {
            }
        }
    }
}
