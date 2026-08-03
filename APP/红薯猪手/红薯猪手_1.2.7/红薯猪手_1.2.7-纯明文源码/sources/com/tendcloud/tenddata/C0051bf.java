package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0133zz;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bf */
/* JADX INFO: loaded from: classes.dex */
public class C0051bf {

    /* JADX INFO: renamed from: a */
    private static volatile C0051bf f285a;

    static {
        try {
            C0132z.m785a().register(m306a());
        } catch (Throwable unused) {
        }
    }

    private C0051bf() {
    }

    /* JADX INFO: renamed from: a */
    public static C0051bf m306a() {
        if (f285a == null) {
            synchronized (C0051bf.class) {
                if (f285a == null) {
                    f285a = new C0051bf();
                }
            }
        }
        return f285a;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, Object> m307a(Map<String, Object> map) {
        String strM747a;
        Object objM747a;
        TreeMap treeMap = new TreeMap();
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return treeMap;
                }
                int i = 0;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getValue() instanceof Number) {
                        strM747a = entry.getKey();
                        objM747a = entry.getValue();
                    } else {
                        strM747a = C0131y.m747a(String.valueOf(entry.getKey()));
                        objM747a = C0131y.m747a(String.valueOf(entry.getValue()));
                    }
                    treeMap.put(strM747a, objM747a);
                    i++;
                    if (i == 50) {
                        break;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return treeMap;
    }

    public final void onTDEBEventAppEvent(C0133zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 2) {
                    AbstractC0018a abstractC0018a = (AbstractC0018a) aVar.paraMap.get("service");
                    TreeMap treeMap = new TreeMap();
                    String strValueOf = String.valueOf(aVar.paraMap.get("eventId"));
                    Object obj = aVar.paraMap.get("value");
                    Map<String, Object> map2 = C0020ab.f129d;
                    if (map2.size() > 0) {
                        treeMap.putAll(map2);
                    }
                    Object obj2 = aVar.paraMap.get("map");
                    if (obj2 != null && (obj2 instanceof Map)) {
                        treeMap.putAll((Map) obj2);
                    }
                    C0067bv c0067bv = new C0067bv();
                    c0067bv.f353b = "appEvent";
                    c0067bv.f354c = strValueOf;
                    c0067bv.f352a = abstractC0018a;
                    TreeMap treeMap2 = new TreeMap();
                    Object obj3 = aVar.paraMap.get("eventLabel");
                    if (obj3 != null) {
                        treeMap2.put("eventLabel", String.valueOf(obj3));
                    }
                    treeMap2.put("eventParam", new JSONObject(m307a(treeMap)));
                    if (obj instanceof Double) {
                        treeMap2.put("value", obj);
                    }
                    Object obj4 = aVar.paraMap.get("eventValue");
                    if (obj4 != null) {
                        treeMap2.put("eventValue", obj4);
                    }
                    c0067bv.f355d = treeMap2;
                    C0132z.m785a().post(c0067bv);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}
