package p000a;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0021B1;
import p000a.C0319Rb;
import p000a.C0597gd;
import p000a.C0692ld;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.hd */
/* JADX INFO: loaded from: classes.dex */
public final class C0616hd {

    /* JADX INFO: renamed from: a */
    public static final C0616hd f2278a = new C0616hd();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f2279b = true;

    /* JADX INFO: renamed from: c */
    public static volatile ClassLoader f2280c;

    /* JADX INFO: renamed from: a.hd$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f2281a;

        /* JADX INFO: renamed from: b */
        public final String f2282b;

        /* JADX INFO: renamed from: c */
        public final Serializable f2283c;

        /* JADX INFO: renamed from: d */
        public final Serializable f2284d;

        public a(String str, String str2, Serializable serializable, Serializable serializable2) {
            this.f2281a = str;
            this.f2282b = str2;
            this.f2283c = serializable;
            this.f2284d = serializable2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2281a.equals(aVar.f2281a) && this.f2282b.equals(aVar.f2282b) && C0631i9.m1478a(this.f2283c, aVar.f2283c) && C0631i9.m1478a(this.f2284d, aVar.f2284d);
        }

        public final int hashCode() {
            int iM2222b = C0944z.m2222b(this.f2282b, this.f2281a.hashCode() * 31, 31);
            Serializable serializable = this.f2283c;
            int iHashCode = (iM2222b + (serializable == null ? 0 : serializable.hashCode())) * 31;
            Serializable serializable2 = this.f2284d;
            return iHashCode + (serializable2 != null ? serializable2.hashCode() : 0);
        }

        public final String toString() {
            return "Case(id=" + this.f2281a + ", kind=" + this.f2282b + ", engineVal=" + this.f2283c + ", legacyVal=" + this.f2284d + ")";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0390 A[LOOP:2: B:224:0x0389->B:226:0x0390, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0597gd m1467a(String str, C0578fd c0578fd) {
        boolean z;
        C0597gd c0597gdM2206a;
        C0597gd c0597gdM1428a;
        String str2;
        C0597gd c0597gd;
        String str3;
        Object objM2206a;
        Object objM2206a2;
        Class<?> clsM13b;
        JSONObject jSONObject;
        List<String> list;
        Class<?> clsM13b2;
        int i;
        JSONArray jSONArrayOptJSONArray;
        Iterator<Integer> it;
        String str4;
        boolean zBooleanValue;
        boolean z2 = f2279b && C0804rb.f3191a.m1879a(str);
        if (f2279b) {
            synchronized (C0804rb.f3191a) {
                Boolean bool = (Boolean) C0804rb.f3193c.get(str);
                zBooleanValue = bool != null ? bool.booleanValue() : false;
            }
            z = zBooleanValue;
        }
        C0692ld c0692ld = C0692ld.f2564a;
        C0692ld.a aVarM1556c = c0692ld.m1556c(str);
        boolean z3 = (aVarM1556c != null ? aVarM1556c.f2574g : null) != null;
        C0571f6.f2132a.getClass();
        ClassLoader classLoader = c0578fd.f2146b;
        C0692ld.a aVarM1556c2 = c0692ld.m1556c(str);
        if ((aVarM1556c2 != null ? aVarM1556c2.f2575h : null) != null) {
            try {
                c0597gdM2206a = aVarM1556c2.f2575h.mo53f(c0578fd);
            } catch (Throwable th) {
                c0597gdM2206a = C0920xd.m2206a(th);
            }
            Throwable thM2189a = C0901wd.m2189a(c0597gdM2206a);
            if (thM2189a != null) {
                C0908x1.m2193a("ExistingBackend", "newResolverFull FAIL for ".concat(str), thM2189a);
            }
            if (c0597gdM2206a instanceof C0901wd.a) {
                c0597gdM2206a = null;
            }
            c0597gdM1428a = (C0597gd) c0597gdM2206a;
            if (c0597gdM1428a == null || !c0597gdM1428a.f2208a) {
                if ((aVarM1556c2 != null ? aVarM1556c2.f2574g : null) != null) {
                    try {
                        objM2206a2 = (Class) aVarM1556c2.f2574g.mo53f(c0578fd);
                    } catch (Throwable th2) {
                        objM2206a2 = C0920xd.m2206a(th2);
                    }
                    Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
                    if (thM2189a2 != null) {
                        C0908x1.m2193a("ExistingBackend", "newResolver FAIL for ".concat(str), thM2189a2);
                    }
                    if (objM2206a2 instanceof C0901wd.a) {
                        objM2206a2 = null;
                    }
                    Class cls = (Class) objM2206a2;
                    if (cls != null) {
                        c0597gdM1428a = C0597gd.a.m1428a(cls, EnumC0521cd.f1908a, null, null, 28);
                    } else {
                        switch (str.hashCode()) {
                            case -2000268143:
                                clsM13b = str.equals("F021_select_contact_mvvm_list") ? C0002A1.m13b(classLoader, "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList") : null;
                                break;
                            case -1989457361:
                                if (str.equals("F008_hide_own_sns")) {
                                    clsM13b = C0002A1.m13b(classLoader, "com.tencent.mm.plugin.sns.ui.improve.component.h2");
                                    break;
                                }
                                break;
                            case -1967051526:
                                if (str.equals("F004_contact_add_mask")) {
                                    clsM13b = C0002A1.m13b(classLoader, "ym5.q");
                                    break;
                                }
                                break;
                            case -1948673376:
                                if (str.equals("F006:snsTimeLineAdapter")) {
                                    boolean z4 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f274f;
                                    break;
                                }
                                break;
                            case -1946352257:
                                if (str.equals("sns_info_model")) {
                                    clsM13b = C0002A1.m13b(classLoader, "ae4.p");
                                    break;
                                }
                                break;
                            case -1605164217:
                                if (str.equals("F007_voip_mgr")) {
                                    C0319Rb.f1143a.getClass();
                                    clsM13b = C0319Rb.m890k(classLoader);
                                    break;
                                }
                                break;
                            case -1600152996:
                                if (str.equals("F006:snsMsgAdapter")) {
                                    boolean z5 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f272d;
                                    break;
                                }
                                break;
                            case -1587176526:
                                if (str.equals("F017:flutterVoip")) {
                                    C0319Rb.f1143a.getClass();
                                    C0631i9.m1482e(classLoader, "cl");
                                    ?? r0 = C0475a5.f1753a;
                                    if (r0 == 0 || (str4 = (String) r0.get("flutter_voip_class_v1")) == null) {
                                        jSONObject = null;
                                        list = C0439Y5.f1645a;
                                        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("classNames")) != null) {
                                            C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArrayOptJSONArray.length());
                                            ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0574f9M749D, 10));
                                            it = c0574f9M749D.iterator();
                                            while (((C0555e9) it).f2095c) {
                                                arrayList.add(jSONArrayOptJSONArray.optString(((AbstractC0517c9) it).mo1278a(), ""));
                                            }
                                            list = arrayList;
                                        }
                                        for (String str5 : list) {
                                            clsM13b2 = C0002A1.m13b(classLoader, str5);
                                            if (clsM13b2 != null) {
                                                Method[] declaredMethods = clsM13b2.getDeclaredMethods();
                                                C0631i9.m1481d(declaredMethods, "getDeclaredMethods(...)");
                                                int length = declaredMethods.length;
                                                int i2 = 0;
                                                while (i2 < length) {
                                                    Method method = declaredMethods[i2];
                                                    if (C0631i9.m1478a(method.getName(), "a") || C0631i9.m1478a(method.getName(), "b")) {
                                                        i = 1;
                                                        if (method.getParameterTypes().length >= 1) {
                                                            C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: DexKit 命中 ".concat(str5)}, 1));
                                                            clsM13b = clsM13b2;
                                                            break;
                                                        }
                                                    } else {
                                                        i = 1;
                                                    }
                                                    i2 += i;
                                                }
                                            }
                                        }
                                        clsM13b = C0002A1.m13b(classLoader, "iq0.d");
                                        if (clsM13b == null) {
                                            clsM13b = C0002A1.m13b(classLoader, "com.tencent.mm.plugin.voip_cs.flutter.d");
                                        }
                                    } else {
                                        try {
                                            jSONObject = new JSONObject(str4);
                                        } catch (Exception unused) {
                                            jSONObject = null;
                                        }
                                        list = C0439Y5.f1645a;
                                        if (jSONObject != null) {
                                            C0574f9 c0574f9M749D2 = C0267Oc.m749D(0, jSONArrayOptJSONArray.length());
                                            ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(c0574f9M749D2, 10));
                                            it = c0574f9M749D2.iterator();
                                            while (((C0555e9) it).f2095c) {
                                            }
                                            list = arrayList2;
                                        }
                                        while (r0.hasNext()) {
                                        }
                                        clsM13b = C0002A1.m13b(classLoader, "iq0.d");
                                        if (clsM13b == null) {
                                        }
                                    }
                                    break;
                                }
                                break;
                            case -1314564120:
                                if (str.equals("F005_hide_contact_label")) {
                                    clsM13b = C0002A1.m13b(classLoader, "d53.b");
                                    break;
                                }
                                break;
                            case -1268391660:
                                if (str.equals("F003:convItem")) {
                                    boolean z6 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f277i;
                                    break;
                                }
                                break;
                            case -1151154972:
                                if (str.equals("F013_timeline_adapter")) {
                                    clsM13b = C0002A1.m13b(classLoader, "com.tencent.mm.plugin.sns.ui.improve.component.h2");
                                    break;
                                }
                                break;
                            case -1135824144:
                                if (str.equals("F010:convStoragePair")) {
                                    C0319Rb.f1143a.getClass();
                                    C0319Rb.a aVarM886g = C0319Rb.m886g(classLoader);
                                    clsM13b = aVarM886g != null ? aVarM886g.f1150a : null;
                                    break;
                                }
                                break;
                            case -1077842615:
                                if (str.equals("F006:snsMsgRelevanceAdapter")) {
                                    boolean z7 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f273e;
                                    break;
                                }
                                break;
                            case -897656803:
                                if (str.equals("F006_hide_sns_entry")) {
                                    boolean z8 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f281m;
                                    break;
                                }
                                break;
                            case -832254182:
                                if (str.equals("F004:muteYj0")) {
                                    C0319Rb.f1143a.getClass();
                                    C0631i9.m1482e(classLoader, "cl");
                                    JSONObject jSONObjectM1155d = C0475a5.m1155d("conv_storage_helper_v1");
                                    for (String str6 : jSONObjectM1155d != null ? C0475a5.m1158g("classNames", jSONObjectM1155d) : C0439Y5.f1645a) {
                                        clsM13b2 = C0002A1.m13b(classLoader, str6);
                                        if (clsM13b2 != null) {
                                            C0319Rb.f1143a.getClass();
                                            if (C0319Rb.m881b(clsM13b2)) {
                                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: DexKit 命中 ".concat(str6)}, 1));
                                                clsM13b = clsM13b2;
                                                break;
                                            }
                                        }
                                    }
                                    clsM13b = C0002A1.m13b(classLoader, "yj0.j1");
                                    if (clsM13b == null && (clsM13b = C0002A1.m13b(classLoader, "yj0.h1")) == null) {
                                        clsM13b = C0002A1.m13b(classLoader, "yj0.i1");
                                    }
                                    break;
                                }
                                break;
                            case -830557628:
                                if (str.equals("F010:convStorageHelper")) {
                                    C0319Rb.f1143a.getClass();
                                    clsM13b = C0319Rb.m885f(classLoader);
                                    break;
                                }
                                break;
                            case -710442962:
                                if (str.equals("F006:snsAlbumAdapter")) {
                                    boolean z9 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f283o;
                                    break;
                                }
                                break;
                            case -429662084:
                                if (str.equals("F006:commentListAdapter")) {
                                    boolean z10 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f271c;
                                    break;
                                }
                                break;
                            case -421655294:
                                if (str.equals("F006:snsRecyclerAdapter")) {
                                    boolean z11 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f276h;
                                    break;
                                }
                                break;
                            case 28208165:
                                if (str.equals("F006:wxRecyclerAdapter")) {
                                    boolean z12 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f279k;
                                    break;
                                }
                                break;
                            case 219392170:
                                if (str.equals("F017:incomingCallMgr")) {
                                    C0319Rb.f1143a.getClass();
                                    clsM13b = C0319Rb.m887h(classLoader);
                                    break;
                                }
                                break;
                            case 235568406:
                                if (str.equals("F006:snsCommentDetailUI")) {
                                    boolean z13 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f270b;
                                    break;
                                }
                                break;
                            case 528661224:
                                if (str.equals("F006:mvvmList")) {
                                    boolean z14 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f280l;
                                    break;
                                }
                                break;
                            case 665889664:
                                if (str.equals("F004:muteX3")) {
                                    C0319Rb.f1143a.getClass();
                                    C0631i9.m1482e(classLoader, "cl");
                                    for (String str7 : C0475a5.m1154c()) {
                                        clsM13b2 = C0002A1.m13b(classLoader, str7);
                                        if (clsM13b2 != null) {
                                            C0319Rb.f1143a.getClass();
                                            if (C0319Rb.m881b(clsM13b2)) {
                                                C0908x1.m2194b(Arrays.copyOf(new Object[]{"ObfResolv: DexKit 命中 ".concat(str7)}, 1));
                                                clsM13b = clsM13b2;
                                                break;
                                            }
                                        }
                                    }
                                    clsM13b = C0002A1.m13b(classLoader, "e3.x3");
                                    if (clsM13b == null && (clsM13b = C0002A1.m13b(classLoader, "ge3.x3")) == null && (clsM13b = C0002A1.m13b(classLoader, "sc3.x3")) == null) {
                                        clsM13b = C0002A1.m13b(classLoader, "sc3.x");
                                    }
                                    break;
                                }
                                break;
                            case 678425280:
                                if (str.equals("F006:snsTimelineAdapter")) {
                                    boolean z15 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f281m;
                                    break;
                                }
                                break;
                            case 920607376:
                                if (str.equals("F002:contactList")) {
                                    boolean z16 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f278j;
                                    break;
                                }
                                break;
                            case 1135560438:
                                if (str.equals("F010:convStorage")) {
                                    C0319Rb.f1143a.getClass();
                                    clsM13b = C0319Rb.m884e(classLoader);
                                    break;
                                }
                                break;
                            case 1180487253:
                                if (str.equals("F006:snsSelfAdapter")) {
                                    boolean z17 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f282n;
                                    break;
                                }
                                break;
                            case 1354784558:
                                if (str.equals("F017:voipMgr")) {
                                    C0319Rb.f1143a.getClass();
                                    clsM13b = C0319Rb.m890k(classLoader);
                                    break;
                                }
                                break;
                            case 1569815995:
                                if (str.equals("F017_msg_info")) {
                                    clsM13b = C0002A1.m13b(classLoader, "com.tencent.mm.storage.f9");
                                    break;
                                }
                                break;
                            case 1594006072:
                                if (str.equals("F006:contactInfoUI")) {
                                    boolean z18 = C0088Ed.f269a;
                                    clsM13b = C0088Ed.f275g;
                                    break;
                                }
                                break;
                            case 1843172051:
                                if (str.equals("F010_conv_storage_pair")) {
                                    C0319Rb.f1143a.getClass();
                                    C0319Rb.a aVarM886g2 = C0319Rb.m886g(classLoader);
                                    if (aVarM886g2 != null) {
                                        clsM13b = aVarM886g2.f1150a;
                                        break;
                                    }
                                }
                                break;
                        }
                        c0597gdM1428a = clsM13b != null ? C0597gd.a.m1428a(clsM13b, EnumC0521cd.f1909b, null, null, 28) : new C0597gd(false, null, new C0647j6("NOT_FOUND", str, "existing backend: no resolver wired for this featureId", "", System.currentTimeMillis()), EnumC0521cd.f1909b, EnumC0540dd.f1946c, null, null);
                    }
                }
            }
        }
        C0597gd c0597gd2 = c0597gdM1428a;
        if (z3 && (z2 || z)) {
            try {
                C0631i9.m1479b(aVarM1556c);
                InterfaceC0064D7<C0578fd, Class<?>> interfaceC0064D7 = aVarM1556c.f2574g;
                C0631i9.m1479b(interfaceC0064D7);
                objM2206a = (Class) interfaceC0064D7.mo53f(c0578fd);
            } catch (Throwable th3) {
                objM2206a = C0920xd.m2206a(th3);
            }
            Object obj = objM2206a;
            Throwable thM2189a3 = C0901wd.m2189a(obj);
            if (thM2189a3 != null) {
                C0908x1.m2193a("ResolverEngine", "newResolver invoke FAILED for ".concat(str), thM2189a3);
            }
            if (obj instanceof C0901wd.a) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 != null) {
                str2 = null;
                c0597gd = C0597gd.a.m1428a(cls2, EnumC0521cd.f1908a, null, null, 28);
            } else {
                str2 = null;
                c0597gd = new C0597gd(false, null, new C0647j6("NEW_PATH_NOT_FOUND", str, "registry newResolver returned null", "", System.currentTimeMillis()), EnumC0521cd.f1909b, EnumC0540dd.f1946c, null, null);
            }
        } else {
            str2 = null;
            c0597gd = null;
        }
        C0597gd c0597gd3 = (z2 && c0597gd != null && c0597gd.f2208a) ? c0597gd : c0597gd2;
        C0263O8 c0263o8 = new C0263O8(22);
        if (c0597gd == null) {
            str3 = "NA";
        } else if (c0597gd2.f2208a != c0597gd.f2208a) {
            str3 = "FAIL";
        } else {
            Class<?> cls3 = c0597gd2.f2209b;
            String name = cls3 != null ? cls3.getName() : str2;
            Class<?> cls4 = c0597gd.f2209b;
            if (C0631i9.m1478a(name, cls4 != null ? cls4.getName() : str2)) {
                str3 = "PASS";
            }
        }
        C0908x1.m2194b("ResolverEngine", "bypass7 featureId=" + str + " ver=" + c0578fd.f2145a + " legacy=" + c0263o8.mo53f(c0597gd2) + " new=" + c0263o8.mo53f(c0597gd) + " matched=" + str3 + " effective=" + (z2 ? "NEW" : "LEGACY") + " ts=" + System.currentTimeMillis());
        return c0597gd3;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1468b() {
        a aVar;
        int i;
        Serializable serializableM2206a;
        String name;
        C0052Cd c0052Cd;
        ClassLoader classLoader = f2280c;
        if (classLoader == null) {
            C0908x1.m2194b("ResolverEngine", "[ResolverBypass] skip: defaultClassLoader not injected");
            return;
        }
        int iM55b = C0021B1.a.m55b();
        C0578fd c0578fd = new C0578fd(iM55b, classLoader);
        Class<?> cls = m1467a("F010_conv_storage_pair", c0578fd).f2209b;
        C0319Rb.f1143a.getClass();
        C0319Rb.a aVarM886g = C0319Rb.m886g(classLoader);
        a aVar2 = new a("F010_conv_storage_pair", "CLASS", cls, aVarM886g != null ? aVarM886g.f1150a : null);
        a aVar3 = new a("D1:versionGate", "VERSION", Integer.valueOf(iM55b), Integer.valueOf(C0021B1.a.m55b()));
        a aVar4 = new a("F007_voip_mgr", "CLASS", m1467a("F007_voip_mgr", c0578fd).f2209b, C0319Rb.m890k(classLoader));
        a aVar5 = new a("F017_msg_info", "CLASS", m1467a("F017_msg_info", c0578fd).f2209b, C0002A1.m13b(classLoader, "com.tencent.mm.storage.f9"));
        a aVar6 = new a("F021_select_contact_mvvm_list", "CLASS", m1467a("F021_select_contact_mvvm_list", c0578fd).f2209b, C0002A1.m13b(classLoader, "com.tencent.mm.ui.mvvm.list.SelectContactMvvmList"));
        a aVar7 = new a("F013_timeline_adapter", "CLASS", m1467a("F013_timeline_adapter", c0578fd).f2209b, C0002A1.m13b(classLoader, "com.tencent.mm.plugin.sns.ui.improve.component.h2"));
        a aVar8 = new a("F004_contact_add_mask", "CLASS", m1467a("F004_contact_add_mask", c0578fd).f2209b, C0002A1.m13b(classLoader, "ym5.q"));
        try {
            c0052Cd = C0052Cd.f184a;
            aVar = aVar6;
            i = 0;
        } catch (Throwable th) {
            th = th;
            aVar = aVar6;
            i = 0;
        }
        try {
            C0587g3 c0587g3 = new C0587g3("F017_msg_info_class", "mm.storage.f9", 0, 28);
            C0578fd c0578fd2 = new C0578fd(iM55b, classLoader);
            c0052Cd.getClass();
            serializableM2206a = C0052Cd.m131a(c0587g3, c0578fd2).f2209b;
        } catch (Throwable th2) {
            th = th2;
            serializableM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(serializableM2206a);
        if (thM2189a != null) {
            C0908x1.m2193a("ResolverEngine", "F017 RuleSystem direct FAIL", thM2189a);
            C0413Wf c0413Wf = C0413Wf.f1577a;
        }
        if (serializableM2206a instanceof C0901wd.a) {
            serializableM2206a = null;
        }
        List<a> listM1757d0 = C0739o3.m1757d0(aVar2, aVar3, aVar4, aVar5, aVar, aVar7, aVar8, new a("F017_rule_direct", "CLASS", serializableM2206a, C0002A1.m13b(classLoader, "com.tencent.mm.storage.f9")));
        C0908x1.m2194b("ResolverEngine", "[ResolverBypass] === START (newPathEnabled=" + f2279b + ") ===");
        int i2 = i;
        int i3 = i2;
        int i4 = i3;
        for (a aVar9 : listM1757d0) {
            boolean zM1478a = C0631i9.m1478a(aVar9.f2283c, aVar9.f2284d);
            if (zM1478a) {
                i2++;
            } else {
                i3++;
            }
            Serializable serializable = aVar9.f2283c;
            int i5 = (serializable == null && aVar9.f2284d == null) ? 1 : i;
            if (i5 != 0) {
                i4++;
            }
            String str = "null";
            if (serializable == null) {
                name = "null";
            } else {
                Class cls2 = serializable instanceof Class ? (Class) serializable : null;
                name = cls2 != null ? cls2.getName() : serializable.toString();
                if (name == null) {
                }
            }
            Serializable serializable2 = aVar9.f2284d;
            if (serializable2 != null) {
                Class cls3 = serializable2 instanceof Class ? (Class) serializable2 : null;
                String name2 = cls3 != null ? cls3.getName() : serializable2.toString();
                if (name2 != null) {
                    str = name2;
                }
            }
            String str2 = i5 != 0 ? "(both-null-consistent)" : "";
            String str3 = aVar9.f2281a;
            String str4 = aVar9.f2282b;
            String str5 = zM1478a ? "PASS" : "FAIL";
            StringBuilder sbM2229i = C0944z.m2229i("[ResolverBypass] case=", str3, " kind=", str4, " result=");
            sbM2229i.append(str5);
            sbM2229i.append(str2);
            sbM2229i.append(" engine=");
            sbM2229i.append(name);
            C0908x1.m2194b("ResolverEngine", C0944z.m2228h(sbM2229i, " legacy=", str));
        }
        C0908x1.m2194b("ResolverEngine", "[ResolverBypass] === SUMMARY pass=" + i2 + " fail=" + i3 + " unresolved=" + i4 + " (thin-wrapper " + (i3 == 0 ? "verified" : "MISMATCH-investigate") + ") ===");
    }
}
