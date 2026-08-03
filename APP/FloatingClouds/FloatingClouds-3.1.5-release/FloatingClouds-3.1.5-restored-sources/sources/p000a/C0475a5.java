package p000a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: a.a5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475a5 {

    /* JADX INFO: renamed from: a */
    public static Object f1753a;

    /* JADX INFO: renamed from: a.a5$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f1754a;

        /* JADX INFO: renamed from: b */
        public final String f1755b;

        /* JADX INFO: renamed from: c */
        public final String f1756c;

        /* JADX INFO: renamed from: d */
        public final String f1757d;

        public a(String str, String str2, String str3, String str4) {
            this.f1754a = str;
            this.f1755b = str2;
            this.f1756c = str3;
            this.f1757d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C0631i9.m1478a(this.f1754a, aVar.f1754a) && C0631i9.m1478a(this.f1755b, aVar.f1755b) && C0631i9.m1478a(this.f1756c, aVar.f1756c) && C0631i9.m1478a(this.f1757d, aVar.f1757d);
        }

        public final int hashCode() {
            return this.f1757d.hashCode() + C0944z.m2222b(this.f1756c, C0944z.m2222b(this.f1755b, this.f1754a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContactAddMaskCache(entryClassName=");
            sb.append(this.f1754a);
            sb.append(", adapterClassName=");
            sb.append(this.f1755b);
            sb.append(", builderClassName=");
            sb.append(this.f1756c);
            sb.append(", clickListenerClassName=");
            return C0944z.m2228h(sb, this.f1757d, ")");
        }
    }

    /* JADX INFO: renamed from: a.a5$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Object f1758a;

        public b(List<String> list) {
            this.f1758a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f1758a.equals(((b) obj).f1758a);
        }

        public final int hashCode() {
            return this.f1758a.hashCode();
        }

        public final String toString() {
            return "ContactCache(classNames=" + this.f1758a + ")";
        }
    }

    /* JADX INFO: renamed from: a.a5$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final String f1759a;

        /* JADX INFO: renamed from: b */
        public final String f1760b;

        /* JADX INFO: renamed from: c */
        public final String f1761c;

        public c(String str, String str2, String str3) {
            this.f1759a = str;
            this.f1760b = str2;
            this.f1761c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C0631i9.m1478a(this.f1759a, cVar.f1759a) && C0631i9.m1478a(this.f1760b, cVar.f1760b) && C0631i9.m1478a(this.f1761c, cVar.f1761c);
        }

        public final int hashCode() {
            return this.f1761c.hashCode() + C0944z.m2222b(this.f1760b, this.f1759a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContactListFields(displayListField=");
            sb.append(this.f1759a);
            sb.append(", snapshotField=");
            sb.append(this.f1760b);
            sb.append(", adapterField=");
            return C0944z.m2228h(sb, this.f1761c, ")");
        }
    }

    /* JADX INFO: renamed from: a.a5$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Object f1762a;

        /* JADX INFO: renamed from: b */
        public final Object f1763b;

        /* JADX INFO: renamed from: c */
        public final Object f1764c;

        /* JADX INFO: renamed from: d */
        public final Object f1765d;

        /* JADX INFO: renamed from: e */
        public final Object f1766e;

        /* JADX INFO: renamed from: f */
        public final Object f1767f;

        public d(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
            this.f1762a = list;
            this.f1763b = list2;
            this.f1764c = list3;
            this.f1765d = list4;
            this.f1766e = list5;
            this.f1767f = list6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1762a.equals(dVar.f1762a) && this.f1763b.equals(dVar.f1763b) && this.f1764c.equals(dVar.f1764c) && this.f1765d.equals(dVar.f1765d) && this.f1766e.equals(dVar.f1766e) && this.f1767f.equals(dVar.f1767f);
        }

        public final int hashCode() {
            return this.f1767f.hashCode() + ((this.f1766e.hashCode() + ((this.f1765d.hashCode() + ((this.f1764c.hashCode() + ((this.f1763b.hashCode() + (this.f1762a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ConvMvvmListCache(adapterClassNames=" + this.f1762a + ", dataSourceClassNames=" + this.f1763b + ", itemClassNames=" + this.f1764c + ", holderClassNames=" + this.f1765d + ", requestClassNames=" + this.f1766e + ", storageClassNames=" + this.f1767f + ")";
        }
    }

    /* JADX INFO: renamed from: a.a5$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final String f1768a;

        /* JADX INFO: renamed from: b */
        public final String f1769b;

        /* JADX INFO: renamed from: c */
        public final String f1770c;

        public e(String str, String str2, String str3) {
            this.f1768a = str;
            this.f1769b = str2;
            this.f1770c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C0631i9.m1478a(this.f1768a, eVar.f1768a) && C0631i9.m1478a(this.f1769b, eVar.f1769b) && C0631i9.m1478a(this.f1770c, eVar.f1770c);
        }

        public final int hashCode() {
            return this.f1770c.hashCode() + C0944z.m2222b(this.f1769b, this.f1768a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MsgStorageInfo(storageClass=");
            sb.append(this.f1768a);
            sb.append(", insertMethod=");
            sb.append(this.f1769b);
            sb.append(", msgInfoClass=");
            return C0944z.m2228h(sb, this.f1770c, ")");
        }
    }

    /* JADX INFO: renamed from: a.a5$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final String f1771a;

        /* JADX INFO: renamed from: b */
        public final String f1772b;

        public f(String str, String str2) {
            this.f1771a = str;
            this.f1772b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C0631i9.m1478a(this.f1771a, fVar.f1771a) && C0631i9.m1478a(this.f1772b, fVar.f1772b);
        }

        public final int hashCode() {
            return this.f1772b.hashCode() + (this.f1771a.hashCode() * 31);
        }

        public final String toString() {
            return "PopupBuildSpec(popupClassName=" + this.f1771a + ", methodName=" + this.f1772b + ")";
        }
    }

    /* JADX INFO: renamed from: a.a5$g */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final String f1773a;

        /* JADX INFO: renamed from: b */
        public final String f1774b;

        /* JADX INFO: renamed from: c */
        public final String f1775c;

        public g(String str, String str2, String str3) {
            this.f1773a = str;
            this.f1774b = str2;
            this.f1775c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C0631i9.m1478a(this.f1773a, gVar.f1773a) && C0631i9.m1478a(this.f1774b, gVar.f1774b) && C0631i9.m1478a(this.f1775c, gVar.f1775c);
        }

        public final int hashCode() {
            return this.f1775c.hashCode() + C0944z.m2222b(this.f1774b, this.f1773a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PopupCreateSpec(popupClassName=");
            sb.append(this.f1773a);
            sb.append(", callbackClassName=");
            sb.append(this.f1774b);
            sb.append(", methodName=");
            return C0944z.m2228h(sb, this.f1775c, ")");
        }
    }

    /* JADX INFO: renamed from: a.a5$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final Object f1776a;

        /* JADX INFO: renamed from: b */
        public final Object f1777b;

        /* JADX INFO: renamed from: c */
        public final Object f1778c;

        /* JADX INFO: renamed from: d */
        public final Object f1779d;

        /* JADX INFO: renamed from: e */
        public final Object f1780e;

        /* JADX INFO: renamed from: f */
        public final Object f1781f;

        /* JADX INFO: renamed from: g */
        public final Object f1782g;

        /* JADX INFO: renamed from: h */
        public final Object f1783h;

        public h(List<String> list, List<String> list2, List<String> list3, List<g> list4, List<f> list5, List<String> list6, List<String> list7, List<String> list8) {
            this.f1776a = list;
            this.f1777b = list2;
            this.f1778c = list3;
            this.f1779d = list4;
            this.f1780e = list5;
            this.f1781f = list6;
            this.f1782g = list7;
            this.f1783h = list8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f1776a.equals(hVar.f1776a) && this.f1777b.equals(hVar.f1777b) && this.f1778c.equals(hVar.f1778c) && this.f1779d.equals(hVar.f1779d) && this.f1780e.equals(hVar.f1780e) && this.f1781f.equals(hVar.f1781f) && this.f1782g.equals(hVar.f1782g) && this.f1783h.equals(hVar.f1783h);
        }

        public final int hashCode() {
            return this.f1783h.hashCode() + ((this.f1782g.hashCode() + ((this.f1781f.hashCode() + ((this.f1780e.hashCode() + ((this.f1779d.hashCode() + ((this.f1778c.hashCode() + ((this.f1777b.hashCode() + (this.f1776a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "QuickAddMenuCache(conversationLongClickClassNames=" + this.f1776a + ", conversationMenuCallbackClassNames=" + this.f1777b + ", popupClassNames=" + this.f1778c + ", popupCreateSpecs=" + this.f1779d + ", popupBuildSpecs=" + this.f1780e + ", popupClickHandlerClassNames=" + this.f1781f + ", popupAdapterClassNames=" + this.f1782g + ", contactMenuCallbackClassNames=" + this.f1783h + ")";
        }
    }

    /* JADX INFO: renamed from: a.a5$i */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public final Object f1784a;

        public i(List<String> list) {
            this.f1784a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f1784a.equals(((i) obj).f1784a);
        }

        public final int hashCode() {
            return this.f1784a.hashCode();
        }

        public final String toString() {
            return "RecentForwardCache(activityClassNames=" + this.f1784a + ")";
        }
    }

    /* JADX INFO: renamed from: a.a5$j */
    public static final class j {

        /* JADX INFO: renamed from: a */
        public final Object f1785a;

        public j(List<String> list) {
            this.f1785a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f1785a.equals(((j) obj).f1785a);
        }

        public final int hashCode() {
            return this.f1785a.hashCode();
        }

        public final String toString() {
            return "SearchCache(searchViewClassNames=" + this.f1785a + ")";
        }
    }

    /* JADX INFO: renamed from: a.a5$k */
    public static final class k {

        /* JADX INFO: renamed from: a */
        public final String f1786a;

        /* JADX INFO: renamed from: b */
        public final String f1787b;

        public k(String str, String str2) {
            this.f1786a = str;
            this.f1787b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return C0631i9.m1478a(this.f1786a, kVar.f1786a) && C0631i9.m1478a(this.f1787b, kVar.f1787b);
        }

        public final int hashCode() {
            return this.f1787b.hashCode() + (this.f1786a.hashCode() * 31);
        }

        public final String toString() {
            return "VersionInfoClasses(versionFormatClass=" + this.f1786a + ", baselineInfoClass=" + this.f1787b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m1152a() {
        JSONObject jSONObjectM1155d = m1155d("contact_mvvm_address_v2");
        if (jSONObjectM1155d == null && (jSONObjectM1155d = m1155d("contact_mvvm_address")) == null) {
            return null;
        }
        try {
            List listM1158g = m1158g("classNames", jSONObjectM1155d);
            if (listM1158g.isEmpty()) {
                listM1158g = m1158g("dataClassNames", jSONObjectM1155d);
            }
            return new b(listM1158g);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static d m1153b() {
        JSONObject jSONObjectM1155d = m1155d("conversation_mvvm_list_v3");
        if (jSONObjectM1155d == null && (jSONObjectM1155d = m1155d("conversation_mvvm_list_v2")) == null) {
            return null;
        }
        try {
            return new d(m1158g("adapterClassNames", jSONObjectM1155d), m1158g("dataSourceClassNames", jSONObjectM1155d), m1158g("itemClassNames", jSONObjectM1155d), m1158g("holderClassNames", jSONObjectM1155d), m1158g("requestClassNames", jSONObjectM1155d), m1158g("storageClassNames", jSONObjectM1155d));
        } catch (Throwable th) {
            C0908x1.m2197e("DexKitCache: parse ConvMvvm failed", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static List m1154c() {
        JSONObject jSONObjectM1155d = m1155d("conv_storage_class_v1");
        return jSONObjectM1155d != null ? m1158g("classNames", jSONObjectM1155d) : C0439Y5.f1645a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static JSONObject m1155d(String str) {
        String str2;
        ?? r0 = f1753a;
        if (r0 == 0 || (str2 = (String) r0.get(str)) == null) {
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static e m1156e() {
        JSONObject jSONObjectM1155d = m1155d("msg_storage_v1");
        if (jSONObjectM1155d == null) {
            return null;
        }
        String strOptString = jSONObjectM1155d.optString("storageClass", "");
        String strOptString2 = jSONObjectM1155d.optString("insertMethod", "");
        String strOptString3 = jSONObjectM1155d.optString("msgInfoClass", "");
        C0631i9.m1479b(strOptString);
        if (C0034Be.m101P(strOptString)) {
            return null;
        }
        C0631i9.m1479b(strOptString2);
        if (C0034Be.m101P(strOptString2)) {
            return null;
        }
        C0631i9.m1479b(strOptString3);
        if (C0034Be.m101P(strOptString3)) {
            return null;
        }
        return new e(strOptString, strOptString2, strOptString3);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m1157f() {
        JSONObject jSONObjectM1155d = m1155d("quick_add_menu_v10");
        h hVar = null;
        if (jSONObjectM1155d != null) {
            try {
                List listM1158g = m1158g("conversationLongClickClassNames", jSONObjectM1155d);
                List listM1158g2 = m1158g("conversationMenuCallbackClassNames", jSONObjectM1155d);
                List listM1158g3 = m1158g("popupClassNames", jSONObjectM1155d);
                JSONArray jSONArrayOptJSONArray = jSONObjectM1155d.optJSONArray("popupCreateSpecs");
                List listM1161j = C0439Y5.f1645a;
                List listM1162k = jSONArrayOptJSONArray != null ? m1162k(jSONArrayOptJSONArray) : listM1161j;
                JSONArray jSONArrayOptJSONArray2 = jSONObjectM1155d.optJSONArray("popupBuildSpecs");
                if (jSONArrayOptJSONArray2 != null) {
                    listM1161j = m1161j(jSONArrayOptJSONArray2);
                }
                hVar = new h(listM1158g, listM1158g2, listM1158g3, listM1162k, listM1161j, m1158g("popupClickHandlerClassNames", jSONObjectM1155d), m1158g("popupAdapterClassNames", jSONObjectM1155d), m1158g("contactMenuCallbackClassNames", jSONObjectM1155d));
            } catch (Throwable th) {
                C0908x1.m2197e("DexKitCache: parse QuickAddMenu failed", th);
            }
        }
        return (hVar == null || m1153b() == null) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static List m1158g(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return C0439Y5.f1645a;
        }
        C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0574f9M749D, 10));
        Iterator<Integer> it = c0574f9M749D.iterator();
        while (((C0555e9) it).f2095c) {
            arrayList.add(jSONArrayOptJSONArray.optString(((AbstractC0517c9) it).mo1278a(), ""));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: h */
    public static void m1159h(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        C0631i9.m1482e(str, "ruleId");
        C0631i9.m1482e(str2, "className");
        try {
            Context context = C0889w1.f3488p;
            LinkedHashMap linkedHashMapM1233I = null;
            SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("dexkit_scan_cache", 0) : null;
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("rule_class_".concat(str), str2)) != null) {
                editorPutString.apply();
            }
            ?? r0 = f1753a;
            if (r0 != 0) {
                linkedHashMapM1233I = C0499ba.m1233I(r0);
                linkedHashMapM1233I.put("rule_class_".concat(str), str2);
            }
            f1753a = linkedHashMapM1233I;
        } catch (Exception unused) {
            C0908x1.m2197e(C0944z.m2227g("DexKitCache: putClassResult(", str, ") failed"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: i */
    public static void m1160i(C0675kf c0675kf) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        try {
            Context context = C0889w1.f3488p;
            LinkedHashMap linkedHashMapM1233I = null;
            SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("dexkit_scan_cache", 0) : null;
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("tinker_symbols_v1", c0675kf.m1544b().toString())) != null) {
                editorPutString.apply();
            }
            ?? r0 = f1753a;
            if (r0 != 0) {
                linkedHashMapM1233I = C0499ba.m1233I(r0);
                String string = c0675kf.m1544b().toString();
                C0631i9.m1481d(string, "toString(...)");
                linkedHashMapM1233I.put("tinker_symbols_v1", string);
            }
            f1753a = linkedHashMapM1233I;
        } catch (Throwable th) {
            C0908x1.m2197e("DexKitCache: putTinkerSymbols failed", th);
        }
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m1161j(JSONArray jSONArray) {
        f fVar;
        C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = c0574f9M749D.iterator();
        while (((C0555e9) it).f2095c) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(((AbstractC0517c9) it).mo1278a());
            if (jSONObjectOptJSONObject == null) {
                fVar = null;
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("popupClassName", "");
                C0631i9.m1481d(strOptString, "optString(...)");
                String strOptString2 = jSONObjectOptJSONObject.optString("methodName", "");
                C0631i9.m1481d(strOptString2, "optString(...)");
                fVar = new f(strOptString, strOptString2);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static ArrayList m1162k(JSONArray jSONArray) {
        g gVar;
        C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = c0574f9M749D.iterator();
        while (((C0555e9) it).f2095c) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(((AbstractC0517c9) it).mo1278a());
            if (jSONObjectOptJSONObject == null) {
                gVar = null;
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("popupClassName", "");
                C0631i9.m1481d(strOptString, "optString(...)");
                String strOptString2 = jSONObjectOptJSONObject.optString("callbackClassName", "");
                C0631i9.m1481d(strOptString2, "optString(...)");
                String strOptString3 = jSONObjectOptJSONObject.optString("methodName", "");
                C0631i9.m1481d(strOptString3, "optString(...)");
                gVar = new g(strOptString, strOptString2, strOptString3);
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }
}
