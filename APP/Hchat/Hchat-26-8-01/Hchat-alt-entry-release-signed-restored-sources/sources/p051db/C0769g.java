package p051db;

import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p009a9.C0031h;
import p218og.AbstractC3149m;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: db.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0769g {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f2319a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0769g(Context context) {
        this.f2319a = AbstractC4302b.m8640c(context, "Hchat_scheduled_task_config");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1981a(String str) {
        str.getClass();
        List listM1986f = m1986f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1986f) {
            if (!AbstractC1416l.m3825a(((C0765c) obj).f2288a, str)) {
                arrayList.add(obj);
            }
        }
        m1985e(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final C0765c m1982b(String str) {
        Object next;
        str.getClass();
        Iterator it = m1986f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Boolean.valueOf(AbstractC1416l.m3825a(((C0765c) next).f2288a, str)).booleanValue()) {
                break;
            }
        }
        return (C0765c) next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1983c() {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f2319a;
            c3959f = Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean("scheduled_task_enable", false) : false);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1984d(C0765c c0765c) {
        List listM1986f = m1986f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1986f) {
            if (!AbstractC1416l.m3825a(((C0765c) obj).f2288a, c0765c.f2288a)) {
                arrayList.add(obj);
            }
        }
        m1985e(AbstractC4166m.m8398G1(arrayList, c0765c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:149:0x00a2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m1985e(ArrayList arrayList) {
        SharedPreferences.Editor editorEdit;
        int iIntValue;
        ?? arrayList2;
        SharedPreferences sharedPreferences = this.f2319a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        ?? jSONArray = new JSONArray();
        for (C0765c c0765c : AbstractC4166m.m8402K1(arrayList, new C0031h(9))) {
            ?? jSONObject = new JSONObject();
            ArrayList<C0763a> arrayListM186t = C0014a.m186t(c0765c);
            int i9 = c0765c.f2305r;
            C0763a c0763a = (C0763a) AbstractC4166m.m8424v1(arrayListM186t);
            int iIntValue2 = 0;
            if (c0763a != null) {
                iIntValue = c0763a.f2286a;
            } else {
                int i10 = c0765c.f2289b;
                Integer numValueOf = Integer.valueOf(i10);
                if (i10 < 0 || i10 >= 9) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            }
            Iterable iterableM8407P1 = C4173t.f13710g;
            if (iIntValue == 0 || iIntValue == 6) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayListM186t) {
                    if (((C0763a) obj).f2286a == iIntValue) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C0763a) it.next()).f2287b);
                }
            } else {
                arrayList2 = iterableM8407P1;
            }
            if (iIntValue != 0 && iIntValue != 6 && iIntValue != 8) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayListM186t) {
                    if (((C0763a) obj2).f2286a == iIntValue) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(arrayList4));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((C0763a) it2.next()).f2287b);
                }
                iterableM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList5));
            }
            jSONObject.put("id", c0765c.f2288a);
            jSONObject.put("remark", AbstractC3149m.m6703R0(c0765c.f2304q).toString());
            jSONObject.put("type", iIntValue);
            String str = (String) AbstractC4166m.m8424v1(arrayList2);
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            jSONObject.put("content", str);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                jSONArray2.put((String) it3.next());
            }
            jSONObject.put("contentItems", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            Iterator it4 = iterableM8407P1.iterator();
            while (it4.hasNext()) {
                jSONArray3.put((String) it4.next());
            }
            jSONObject.put("mediaPaths", jSONArray3);
            JSONArray jSONArray4 = new JSONArray();
            for (C0763a c0763a2 : arrayListM186t) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", c0763a2.f2286a);
                jSONObject2.put("value", c0763a2.f2287b);
                jSONArray4.put(jSONObject2);
            }
            jSONObject.put("items", jSONArray4);
            JSONArray jSONArray5 = new JSONArray();
            Iterator it5 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(c0765c.f2293f)).iterator();
            while (it5.hasNext()) {
                jSONArray5.put((String) it5.next());
            }
            jSONObject.put("targetIds", jSONArray5);
            List listM188v = C0014a.m188v(c0765c);
            Long l10 = (Long) AbstractC4166m.m8424v1(listM188v);
            jSONObject.put("planTime", l10 != null ? l10.longValue() : 0L);
            JSONArray jSONArray6 = new JSONArray();
            Iterator it6 = listM188v.iterator();
            while (it6.hasNext()) {
                jSONArray6.put(((Number) it6.next()).longValue());
            }
            jSONObject.put("planTimes", jSONArray6);
            jSONObject.put("repeatType", c0765c.f2295h);
            JSONArray jSONArray7 = new JSONArray();
            Iterator it7 = AbstractC4166m.m8401J1(c0765c.f2296i).iterator();
            while (it7.hasNext()) {
                jSONArray7.put(((Number) it7.next()).intValue());
            }
            jSONObject.put("repeatDays", jSONArray7);
            jSONObject.put("intervalSeconds", AbstractC3754e0.m7909r(c0765c.f2297j, 0, 3600));
            jSONObject.put("mediaIntervalSeconds", AbstractC3754e0.m7909r(c0765c.f2298k, 0, 3600));
            jSONObject.put("sendOnTimeout", c0765c.f2299l);
            String str2 = c0765c.f2300m;
            if (AbstractC3149m.m6721t0(str2)) {
                str2 = "pending";
            }
            jSONObject.put("status", str2);
            long j3 = c0765c.f2301n;
            jSONObject.put("lastExecutedTime", j3 >= 0 ? j3 : 0L);
            int i11 = c0765c.f2302o;
            if (i11 < 0) {
                i11 = 0;
            }
            jSONObject.put("lastSuccessCount", i11);
            int i12 = c0765c.f2303p;
            if (i12 < 0) {
                i12 = 0;
            }
            jSONObject.put("lastFailCount", i12);
            Integer numValueOf2 = Integer.valueOf(i9);
            if (i9 != 0 && i9 != 1) {
                numValueOf2 = null;
            }
            jSONObject.put("targetType", numValueOf2 != null ? numValueOf2.intValue() : 0);
            int i13 = c0765c.f2306s;
            Integer numValueOf3 = Integer.valueOf(i13);
            if (i13 < 0 || i13 >= 5) {
                numValueOf3 = null;
            }
            jSONObject.put("momentsType", numValueOf3 != null ? numValueOf3.intValue() : 0);
            if (i9 == 0) {
                int i14 = c0765c.f2308u;
                Integer numValueOf4 = (i14 == 0 || i14 == 1) ? Integer.valueOf(i14) : null;
                if (numValueOf4 != null) {
                    iIntValue2 = numValueOf4.intValue();
                }
            }
            jSONObject.put("sendChannel", iIntValue2);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        SharedPreferences.Editor editorPutString = editorEdit.putString("scheduled_task_items_v1", string);
        if (editorPutString != null) {
            editorPutString.apply();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m1986f() {
        Object c3959f;
        Object c3959f2;
        C4329c c4329c;
        String str;
        String str2;
        int i9;
        int i10;
        List listM90t;
        JSONArray jSONArray;
        int i11;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            SharedPreferences sharedPreferences = this.f2319a;
            if (sharedPreferences != null) {
                c3959f = sharedPreferences.getString("scheduled_task_items_v1", HttpUrl.FRAGMENT_ENCODE_SET);
                if (c3959f == null) {
                    c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = (String) c3959f;
        String str5 = "pending";
        boolean zM6721t0 = AbstractC3149m.m6721t0(str4);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(str4);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray2.length();
            int i12 = 0;
            int i13 = 0;
            while (i13 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i13);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    strOptString.getClass();
                    String string = AbstractC3149m.m6703R0(strOptString).toString();
                    if (AbstractC3149m.m6721t0(string)) {
                        c4329c = c4329cM7E;
                        str = str3;
                        str2 = str5;
                        i9 = i12;
                        i10 = i13;
                    } else {
                        List listM192z = C0014a.m192z(jSONObjectOptJSONObject);
                        String strOptString2 = jSONObjectOptJSONObject.optString("remark", str3);
                        strOptString2.getClass();
                        int iOptInt = jSONObjectOptJSONObject.optInt("type", i12);
                        String strOptString3 = jSONObjectOptJSONObject.optString("content", str3);
                        strOptString3.getClass();
                        List listM165A = C0014a.m165A(jSONObjectOptJSONObject.optJSONArray("contentItems"));
                        List listM165A2 = C0014a.m165A(jSONObjectOptJSONObject.optJSONArray("mediaPaths"));
                        List listM165A3 = C0014a.m165A(jSONObjectOptJSONObject.optJSONArray("targetIds"));
                        Long l10 = (Long) AbstractC4166m.m8424v1(listM192z);
                        i10 = i13;
                        long jLongValue = l10 != null ? l10.longValue() : 0L;
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("repeatType", 0);
                        Set setM191y = C0014a.m191y(jSONObjectOptJSONObject.optJSONArray("repeatDays"));
                        int iM7909r = AbstractC3754e0.m7909r(jSONObjectOptJSONObject.optInt("intervalSeconds", 0), 0, 3600);
                        int iM7909r2 = AbstractC3754e0.m7909r(jSONObjectOptJSONObject.optInt("mediaIntervalSeconds", 0), 0, 3600);
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("sendOnTimeout", true);
                        String strOptString4 = jSONObjectOptJSONObject.optString("status", str5);
                        String str6 = AbstractC3149m.m6721t0(strOptString4) ? str5 : strOptString4;
                        long jOptLong = jSONObjectOptJSONObject.optLong("lastExecutedTime", 0L);
                        str = str3;
                        int iOptInt3 = jSONObjectOptJSONObject.optInt("lastSuccessCount", 0);
                        int i14 = iOptInt3 < 0 ? 0 : iOptInt3;
                        int iOptInt4 = jSONObjectOptJSONObject.optInt("lastFailCount", 0);
                        int i15 = iOptInt4 < 0 ? 0 : iOptInt4;
                        int iOptInt5 = jSONObjectOptJSONObject.optInt("targetType", 0);
                        Integer numValueOf = iOptInt5 == 0 || iOptInt5 == 1 ? Integer.valueOf(iOptInt5) : null;
                        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        int iOptInt6 = jSONObjectOptJSONObject.optInt("momentsType", 0);
                        Integer numValueOf2 = Integer.valueOf(iOptInt6);
                        if (!(iOptInt6 >= 0 && iOptInt6 < 5)) {
                            numValueOf2 = null;
                        }
                        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("items");
                        if (jSONArrayOptJSONArray == null) {
                            listM90t = C4173t.f13710g;
                            str2 = str5;
                        } else {
                            C4329c c4329cM7E2 = AbstractC0000a.m7E();
                            int length2 = jSONArrayOptJSONArray.length();
                            str2 = str5;
                            int i16 = 0;
                            while (i16 < length2) {
                                int i17 = iM7909r;
                                int i18 = iM7909r2;
                                C4329c c4329c2 = c4329cM7E;
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i16);
                                if (jSONObjectOptJSONObject2 != null) {
                                    jSONArray = jSONArrayOptJSONArray;
                                    i11 = i16;
                                    int iOptInt7 = jSONObjectOptJSONObject2.optInt("type", 0);
                                    String strM9266j = AbstractC4855en.m9266j("value", jSONObjectOptJSONObject2);
                                    if (iOptInt7 >= 0 && iOptInt7 < 9 && !AbstractC3149m.m6721t0(strM9266j)) {
                                        c4329cM7E2.add(new C0763a(iOptInt7, strM9266j));
                                    }
                                } else {
                                    jSONArray = jSONArrayOptJSONArray;
                                    i11 = i16;
                                }
                                i16 = i11 + 1;
                                iM7909r = i17;
                                iM7909r2 = i18;
                                c4329cM7E = c4329c2;
                                jSONArrayOptJSONArray = jSONArray;
                            }
                            listM90t = AbstractC0000a.m90t(c4329cM7E2);
                        }
                        List list = listM90t;
                        int iOptInt8 = jSONObjectOptJSONObject.optInt("sendChannel", 0);
                        Integer numValueOf3 = Integer.valueOf(iOptInt8);
                        boolean z9 = true;
                        if (iOptInt8 != 0 && iOptInt8 != 1) {
                            z9 = false;
                        }
                        Integer num = z9 ? numValueOf3 : null;
                        c4329cM7E.add(new C0765c(string, iOptInt, strOptString3, listM165A, listM165A2, listM165A3, jLongValue, iOptInt2, setM191y, iM7909r, iM7909r2, zOptBoolean, str6, jOptLong, i14, i15, strOptString2, iIntValue, iIntValue2, list, num != null ? num.intValue() : 0, listM192z));
                        c4329c = c4329cM7E;
                        i9 = 0;
                    }
                }
                i13 = i10 + 1;
                c4329cM7E = c4329c;
                i12 = i9;
                str3 = str;
                str5 = str2;
            }
            c3959f2 = AbstractC4166m.m8402K1(AbstractC0000a.m90t(c4329cM7E), new C0031h(10));
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        Object obj = c4173t;
        if (!(c3959f2 instanceof C3959f)) {
            obj = c3959f2;
        }
        return (List) obj;
    }
}
