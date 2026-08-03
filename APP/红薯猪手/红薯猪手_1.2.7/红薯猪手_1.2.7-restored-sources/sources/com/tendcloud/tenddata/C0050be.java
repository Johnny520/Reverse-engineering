package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0066bu;
import com.tendcloud.tenddata.C0089cq;
import com.tendcloud.tenddata.C0133zz;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.be */
/* JADX INFO: loaded from: classes.dex */
public class C0050be {

    /* JADX INFO: renamed from: a */
    private static volatile C0050be f258a;

    /* JADX INFO: renamed from: b */
    private static String f259b;

    /* JADX INFO: renamed from: c */
    private static String f260c;

    /* JADX INFO: renamed from: d */
    private static String f261d;

    /* JADX INFO: renamed from: e */
    private static String f262e;

    /* JADX INFO: renamed from: f */
    private static String f263f;

    /* JADX INFO: renamed from: g */
    private static String f264g;

    /* JADX INFO: renamed from: h */
    private static String f265h;

    /* JADX INFO: renamed from: i */
    private static String f266i;

    /* JADX INFO: renamed from: j */
    private static String f267j;

    /* JADX INFO: renamed from: k */
    private static String f268k;

    /* JADX INFO: renamed from: l */
    private static String f269l;

    /* JADX INFO: renamed from: m */
    private static String f270m;

    /* JADX INFO: renamed from: n */
    private static String f271n;

    /* JADX INFO: renamed from: o */
    private static String f272o;

    /* JADX INFO: renamed from: p */
    private static String f273p;

    /* JADX INFO: renamed from: q */
    private static String f274q;

    /* JADX INFO: renamed from: r */
    private static String f275r;

    /* JADX INFO: renamed from: t */
    private static String f276t;

    /* JADX INFO: renamed from: z */
    private static JSONObject f277z;

    /* JADX INFO: renamed from: s */
    private String f279s;

    /* JADX INFO: renamed from: v */
    private String f281v;

    /* JADX INFO: renamed from: w */
    private int f282w;

    /* JADX INFO: renamed from: x */
    private String f283x;

    /* JADX INFO: renamed from: y */
    private JSONObject f284y;

    /* JADX INFO: renamed from: u */
    private a f280u = a.UNKNOWN;

    /* JADX INFO: renamed from: A */
    private Map<String, Object> f278A = new TreeMap();

    /* JADX INFO: renamed from: com.tendcloud.tenddata.be$a */
    public enum a {
        MALE,
        FEMALE,
        UNKNOWN
    }

    static {
        try {
            C0132z.m785a().register(m284a());
        } catch (Throwable unused) {
        }
        f259b = "account";
        f260c = "accountId";
        f261d = "name";
        f262e = "gender";
        f263f = "age";
        f264g = "type";
        f265h = "accountCus";
        f266i = "property1";
        f267j = "property2";
        f268k = "property3";
        f269l = "property4";
        f270m = "property5";
        f271n = "property6";
        f272o = "property7";
        f273p = "property8";
        f274q = "property9";
        f275r = "property10";
        f276t = "default";
    }

    private C0050be() {
    }

    /* JADX INFO: renamed from: a */
    public static C0050be m284a() {
        if (f258a == null) {
            synchronized (C0050be.class) {
                if (f258a == null) {
                    f258a = new C0050be();
                }
            }
        }
        return f258a;
    }

    /* JADX INFO: renamed from: a */
    private void m285a(AbstractC0018a abstractC0018a) {
        try {
            C0066bu c0066bu = new C0066bu();
            c0066bu.f351b = C0066bu.a.IMMEDIATELY;
            c0066bu.f350a = abstractC0018a;
            C0132z.m785a().post(c0066bu);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m286a(Object obj, Object obj2, Object obj3, AbstractC0018a abstractC0018a) {
        m287a(obj, obj2, obj3, null, abstractC0018a);
    }

    /* JADX INFO: renamed from: a */
    public static void m287a(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0018a abstractC0018a) {
        if (abstractC0018a == null || obj == null || obj2 == null || !(obj instanceof String) || !(obj2 instanceof String)) {
            return;
        }
        C0067bv c0067bv = new C0067bv();
        c0067bv.f353b = String.valueOf(obj);
        c0067bv.f354c = String.valueOf(obj2);
        if (obj3 != null && (obj3 instanceof Map)) {
            Map<String, Object> map = (Map) obj3;
            if (obj4 != null) {
                map.put("eventValue", obj4);
            }
            c0067bv.f355d = map;
        }
        c0067bv.f352a = abstractC0018a;
        C0132z.m785a().post(c0067bv);
    }

    /* JADX INFO: renamed from: a */
    private void m288a(String str) {
        try {
            this.f279s = str;
            String strM533a = C0116i.m533a(str);
            if (strM533a != null) {
                JSONObject jSONObject = new JSONObject(strM533a);
                if (jSONObject.has(f261d)) {
                    this.f281v = jSONObject.getString(f261d);
                }
                if (jSONObject.has(f262e)) {
                    this.f280u = a.valueOf(jSONObject.getString(f262e));
                }
                if (jSONObject.has(f263f)) {
                    this.f282w = jSONObject.getInt(f263f);
                }
                if (jSONObject.has(f264g)) {
                    this.f283x = jSONObject.getString(f264g);
                }
                if (jSONObject.has(f265h)) {
                    this.f284y = jSONObject.getJSONObject(f265h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m289a(String str, AbstractC0018a abstractC0018a) {
        try {
            f277z = new JSONObject();
            f276t = str;
            Map<String, Object> mapM300g = m300g();
            m286a(f259b, "roleCreate", mapM300g, abstractC0018a);
            C0092ct.m466a().setSubprofile(new JSONObject(mapM300g));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m290a(String str, Object obj, Object obj2, Object obj3, Object obj4, AbstractC0018a abstractC0018a) {
        m291a(str, obj, obj2, obj3, obj4, null, abstractC0018a);
    }

    /* JADX INFO: renamed from: a */
    private void m291a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AbstractC0018a abstractC0018a) {
        try {
            m296c();
            String str2 = this.f279s;
            if (str2 != null && !str2.equals(str)) {
                this.f278A.clear();
            }
            this.f279s = str;
            TreeMap treeMap = new TreeMap();
            treeMap.put(f260c, this.f279s);
            treeMap.putAll((Map) obj);
            if (obj4 != null) {
                treeMap.put("invitationCode", String.valueOf(obj4));
            }
            this.f278A.putAll(treeMap);
            JSONObject jSONObject = new JSONObject(this.f278A);
            C0116i.setUniversalProfileInfo(jSONObject.toString());
            C0092ct.m466a().setProfile(jSONObject);
            m287a(obj3, obj2, treeMap, obj5, abstractC0018a);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m292a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private Map<String, Object> m293b() {
        try {
            String str = this.f279s;
            if (str != null) {
                this.f278A.put(f260c, str);
            }
        } catch (Throwable unused) {
        }
        return this.f278A;
    }

    /* JADX INFO: renamed from: b */
    private static void m294b(AbstractC0018a abstractC0018a) {
        try {
            Map<String, Object> mapM300g = m300g();
            C0092ct.m466a().setSubprofile(new JSONObject(mapM300g));
            m286a(f259b, "roleUpdate", mapM300g, abstractC0018a);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m295b(Object obj, Object obj2, Object obj3, AbstractC0018a abstractC0018a) {
        try {
            m296c();
            Map<String, Object> mapM293b = m293b();
            mapM293b.putAll((Map) obj);
            JSONObject jSONObject = new JSONObject(mapM293b);
            C0116i.setUniversalProfileInfo(jSONObject.toString());
            C0092ct.m466a().setProfile(jSONObject);
            m286a(obj3, obj2, obj, abstractC0018a);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m296c() {
        try {
            String strM561m = C0116i.m561m();
            if (strM561m != null) {
                JSONObject jSONObject = new JSONObject(strM561m);
                if (jSONObject.has(f260c)) {
                    String string = jSONObject.getString(f260c);
                    this.f279s = string;
                    this.f278A.put(f260c, string);
                }
                if (jSONObject.has(f261d)) {
                    Map<String, Object> map = this.f278A;
                    String str = f261d;
                    map.put(str, jSONObject.getString(str));
                }
                if (jSONObject.has(f264g)) {
                    Map<String, Object> map2 = this.f278A;
                    String str2 = f264g;
                    map2.put(str2, Integer.valueOf(jSONObject.getInt(str2)));
                }
                if (jSONObject.has(f262e)) {
                    Map<String, Object> map3 = this.f278A;
                    String str3 = f262e;
                    map3.put(str3, Integer.valueOf(jSONObject.getInt(str3)));
                }
                if (jSONObject.has(f263f)) {
                    Map<String, Object> map4 = this.f278A;
                    String str4 = f263f;
                    map4.put(str4, Integer.valueOf(jSONObject.getInt(str4)));
                }
                if (jSONObject.has(f266i)) {
                    Map<String, Object> map5 = this.f278A;
                    String str5 = f266i;
                    map5.put(str5, jSONObject.get(str5));
                }
                if (jSONObject.has(f267j)) {
                    Map<String, Object> map6 = this.f278A;
                    String str6 = f267j;
                    map6.put(str6, jSONObject.get(str6));
                }
                if (jSONObject.has(f268k)) {
                    Map<String, Object> map7 = this.f278A;
                    String str7 = f268k;
                    map7.put(str7, jSONObject.get(str7));
                }
                if (jSONObject.has(f269l)) {
                    Map<String, Object> map8 = this.f278A;
                    String str8 = f269l;
                    map8.put(str8, jSONObject.get(str8));
                }
                if (jSONObject.has(f270m)) {
                    Map<String, Object> map9 = this.f278A;
                    String str9 = f270m;
                    map9.put(str9, jSONObject.get(str9));
                }
                if (jSONObject.has(f271n)) {
                    Map<String, Object> map10 = this.f278A;
                    String str10 = f271n;
                    map10.put(str10, jSONObject.get(str10));
                }
                if (jSONObject.has(f272o)) {
                    Map<String, Object> map11 = this.f278A;
                    String str11 = f272o;
                    map11.put(str11, jSONObject.get(str11));
                }
                if (jSONObject.has(f273p)) {
                    Map<String, Object> map12 = this.f278A;
                    String str12 = f273p;
                    map12.put(str12, jSONObject.get(str12));
                }
                if (jSONObject.has(f274q)) {
                    Map<String, Object> map13 = this.f278A;
                    String str13 = f274q;
                    map13.put(str13, jSONObject.get(str13));
                }
                if (jSONObject.has(f275r)) {
                    Map<String, Object> map14 = this.f278A;
                    String str14 = f275r;
                    map14.put(str14, jSONObject.get(str14));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m297d() {
        try {
            Map<String, Object> mapM299f = m299f();
            C0133zz.a aVar = new C0133zz.a();
            aVar.paraMap.put("apiType", 9);
            aVar.paraMap.put("domain", f259b);
            aVar.paraMap.put("action", "update");
            aVar.paraMap.put(C0089cq.a.DATA, mapM299f);
            C0133zz.m796c().obtainMessage(C0133zz.f658f, aVar).sendToTarget();
            C0092ct.m466a().setProfile(new JSONObject(mapM299f));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m298e() {
        C0116i.setLastRoleName(f276t);
        C0116i.m543b(f276t, f277z.toString());
    }

    /* JADX INFO: renamed from: f */
    private Map<String, Object> m299f() {
        TreeMap treeMap = new TreeMap();
        try {
            treeMap.put(f260c, this.f279s);
            int i = this.f282w;
            if (i != 0) {
                treeMap.put(f263f, Integer.valueOf(i));
            }
            if (!"UNKNOWN".equals(this.f280u.name())) {
                treeMap.put(f262e, this.f280u.name());
            }
            String str = this.f281v;
            if (str != null) {
                treeMap.put(f261d, str);
            }
            String str2 = this.f283x;
            if (str2 != null) {
                treeMap.put(f264g, str2);
            }
            JSONObject jSONObject = this.f284y;
            if (jSONObject != null && jSONObject.length() > 0) {
                treeMap.put("custom", this.f284y);
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: g */
    private static Map<String, Object> m300g() {
        TreeMap treeMap = new TreeMap();
        try {
            treeMap.put("name", f276t);
            JSONObject jSONObject = f277z;
            if (jSONObject != null && jSONObject.length() > 0) {
                treeMap.put("custom", f277z);
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: h */
    private static void m301h() {
        try {
            C0092ct.m466a().setSubprofile(new JSONObject(m300g()));
            m294b(null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m302a(String str, int i) {
        if (f277z == null) {
            f277z = new JSONObject();
        }
        try {
            f277z.put(str, i);
            m298e();
            m301h();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m303a(String str, String str2) {
        if (f277z == null) {
            f277z = new JSONObject();
        }
        try {
            f277z.put(str, str2);
            m298e();
            m301h();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m304b(String str, int i) {
        if (this.f284y == null) {
            this.f284y = new JSONObject();
        }
        try {
            this.f284y.put(str, i);
            m297d();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m305b(String str, String str2) {
        if (this.f284y == null) {
            this.f284y = new JSONObject();
        }
        try {
            this.f284y.put(str, str2);
            m297d();
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventAccount(C0133zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 9) {
                    aVar.paraMap.get("account");
                    AbstractC0018a abstractC0018a = (AbstractC0018a) aVar.paraMap.get("service");
                    Object obj = aVar.paraMap.get(C0089cq.a.DATA);
                    Object obj2 = aVar.paraMap.get("domain");
                    Object obj3 = aVar.paraMap.get("action");
                    Object obj4 = aVar.paraMap.get("immediate");
                    if (obj3 != null) {
                        if (!obj3.equals("login") && !obj3.equals("register")) {
                            if (obj3.equals("roleCreate")) {
                                m289a(String.valueOf(aVar.paraMap.get("parameter")), abstractC0018a);
                                return;
                            } else if (obj3.equals("update")) {
                                m295b(obj, obj3, obj2, abstractC0018a);
                                return;
                            }
                        }
                        m291a(String.valueOf(aVar.paraMap.get("accountId")), obj, obj3, obj2, aVar.paraMap.get("invitationCode"), aVar.paraMap.get("eventValue"), abstractC0018a);
                        return;
                    }
                    if (obj3 != null) {
                        m286a(obj2, obj3, obj, abstractC0018a);
                        if (m292a(obj4)) {
                            m285a(abstractC0018a);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setAccountType(String str) {
        try {
            String str2 = this.f283x;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f283x = str;
                m297d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setAge(int i) {
        try {
            if (this.f282w != i) {
                this.f282w = i;
                m297d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setGender(a aVar) {
        try {
            if (this.f280u != aVar) {
                this.f280u = aVar;
                m297d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setName(String str) {
        try {
            String str2 = this.f281v;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f281v = str;
                m297d();
            }
        } catch (Throwable unused) {
        }
    }
}
