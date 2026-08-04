package yyds;

import android.content.Context;
import com.p000ss.android.ugc.awemes.WardDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛶᛷᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1377 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final /* synthetic */ Context f6414;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public ArrayList f6415;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f6416;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public List f6417;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f6418;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public WardDatabase f6419;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f6420;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public String f6421;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1377(JSONObject jSONObject, Context context, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f6416 = jSONObject;
        this.f6414 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02b0  */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        boolean zOptBoolean;
        ArrayList arrayList;
        List listM3270;
        Object objM3774;
        List listM3284;
        String str;
        WardDatabase wardDatabase;
        int i = this.f6420;
        Context context = this.f6414;
        JSONObject jSONObject = this.f6416;
        boolean z = true;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        try {
            try {
                if (i == 0) {
                    AbstractC1544.m3189(obj);
                    C2255 c2255 = C2592.f12776;
                    this.f6420 = 1;
                    if (c2255.mo2252(this) != enumC1765) {
                    }
                    return enumC1765;
                }
                if (i != 1) {
                    if (i != 2) {
                        C0188.m800(AbstractC2328.m4341(-752452073325422L));
                        return null;
                    }
                    zOptBoolean = this.f6418;
                    wardDatabase = this.f6419;
                    str = this.f6421;
                    listM3284 = this.f6417;
                    ArrayList arrayList2 = this.f6415;
                    AbstractC1544.m3189(obj);
                    arrayList = arrayList2;
                    objM3774 = obj;
                    List list = (List) objM3774;
                    C1239.f5669.getClass();
                    List listM3269 = AbstractC1595.m3269(C1239.m2527(context));
                    String strM2528 = C1239.m2528(context);
                    wardDatabase.m353(new RunnableC1880(4, wardDatabase, arrayList, zOptBoolean));
                    if (listM3284 != null) {
                        if (zOptBoolean) {
                            try {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : listM3269) {
                                    if (!listM3284.contains((String) obj2)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                listM3284 = AbstractC1595.m3284(listM3284, arrayList3);
                            } catch (Exception e) {
                                ArrayList arrayList4 = new ArrayList(3);
                                try {
                                    wardDatabase.m353(new RunnableC2696(wardDatabase, 15, list));
                                } catch (Exception e2) {
                                    arrayList4.add(e2);
                                }
                                try {
                                    C1239.f5669.getClass();
                                    C1239.m2526(context, listM3269);
                                } catch (Exception e3) {
                                    arrayList4.add(e3);
                                }
                                try {
                                    C1239.f5669.getClass();
                                    C1239.m2530(context, strM2528);
                                } catch (Exception e4) {
                                    arrayList4.add(e4);
                                }
                                Iterator it = arrayList4.iterator();
                                while (it.hasNext()) {
                                    e.addSuppressed((Throwable) it.next());
                                }
                                throw new IllegalStateException(arrayList4.isEmpty() ? AbstractC2328.m4341(-752151425614702L) : AbstractC2328.m4341(-752233029993326L), e);
                            }
                        }
                        C1239.f5669.getClass();
                        C1239.m2526(context, listM3284);
                    }
                    if (jSONObject.has(AbstractC2328.m4341(-751971036988270L)) && !jSONObject.isNull(AbstractC2328.m4341(-752061231301486L))) {
                        if (str.length() > 0) {
                            str = null;
                        }
                        C1239.m2530(context, str);
                    }
                    C2336.f11496.m4354(AbstractC2328.m4341(-752314634371950L));
                    C2592.f12776.mo2251(null);
                    return C2746.f13459;
                }
                AbstractC1544.m3189(obj);
                zOptBoolean = jSONObject.optBoolean(AbstractC2328.m4341(-751069093856110L), false);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(AbstractC2328.m4341(-751129223398254L));
                if (jSONArrayOptJSONArray == null) {
                    throw new IllegalArgumentException(AbstractC2328.m4341(-751172173071214L));
                }
                if (jSONArrayOptJSONArray.length() > 200000) {
                    throw new IllegalArgumentException(AbstractC2328.m4341(-751253777449838L).toString());
                }
                if (jSONObject.has(AbstractC2328.m4341(-751301022090094L)) && jSONObject.getInt(AbstractC2328.m4341(-751365446599534L)) != jSONArrayOptJSONArray.length()) {
                    throw new IllegalArgumentException(AbstractC2328.m4341(-751429871108974L).toString());
                }
                HashSet hashSet = new HashSet(jSONArrayOptJSONArray.length());
                arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                int length = jSONArrayOptJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject == null) {
                        throw new IllegalArgumentException(AbstractC2328.m4341(-751477115749230L) + (i2 + 1) + AbstractC2328.m4341(-751490000651118L));
                    }
                    String strOptString = jSONObjectOptJSONObject.optString(AbstractC2328.m4341(-751537245291374L));
                    AbstractC2328.m4341(-751550130193262L);
                    String string = AbstractC0473.m1314(strOptString).toString();
                    if (string.length() > 0) {
                        boolean z2 = z;
                        if (string.length() <= 256) {
                            if (!hashSet.add(string)) {
                                throw new IllegalArgumentException((AbstractC2328.m4341(-751683274179438L) + string).toString());
                            }
                            arrayList.add(AbstractC0024.m3293(jSONObjectOptJSONObject));
                            i2++;
                            z = z2;
                        }
                    }
                    throw new IllegalArgumentException((AbstractC2328.m4341(-751614554702702L) + (i2 + 1) + AbstractC2328.m4341(-751627439604590L)).toString());
                }
                boolean z3 = z;
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(AbstractC2328.m4341(-751743403721582L));
                if (jSONArrayOptJSONArray2 == null) {
                    listM3270 = null;
                } else {
                    if (jSONArrayOptJSONArray2.length() > 1000) {
                        throw new IllegalArgumentException(AbstractC2328.m4341(-751790648361838L).toString());
                    }
                    C2578 c2578M3296 = AbstractC0024.m3296();
                    int length2 = jSONArrayOptJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        String string2 = jSONArrayOptJSONArray2.getString(i3);
                        if (string2.length() > 200) {
                            throw new IllegalArgumentException(AbstractC2328.m4341(-751837893002094L).toString());
                        }
                        c2578M3296.add(string2);
                    }
                    listM3270 = AbstractC1595.m3270(AbstractC0024.m3305(c2578M3296));
                }
                String strOptString2 = jSONObject.optString(AbstractC2328.m4341(-751876547707758L), AbstractC2328.m4341(-751966742020974L));
                WardDatabase wardDatabaseM1272 = WardDatabase.f492.m1272(context);
                C0380 c0380Mo344 = wardDatabaseM1272.mo344();
                this.f6415 = arrayList;
                this.f6417 = listM3270;
                this.f6421 = strOptString2;
                this.f6419 = wardDatabaseM1272;
                this.f6418 = zOptBoolean;
                this.f6420 = 2;
                c0380Mo344.getClass();
                objM3774 = AbstractC1960.m3774(c0380Mo344.f1954, this, new C1302(AbstractC2328.m4341(-1373190811714414L), 11), z3, false);
                if (objM3774 != enumC1765) {
                    listM3284 = listM3270;
                    str = strOptString2;
                    wardDatabase = wardDatabaseM1272;
                    List list2 = (List) objM3774;
                    C1239.f5669.getClass();
                    List listM32692 = AbstractC1595.m3269(C1239.m2527(context));
                    String strM25282 = C1239.m2528(context);
                    wardDatabase.m353(new RunnableC1880(4, wardDatabase, arrayList, zOptBoolean));
                    if (listM3284 != null) {
                    }
                    if (jSONObject.has(AbstractC2328.m4341(-751971036988270L))) {
                        if (str.length() > 0) {
                        }
                        C1239.m2530(context, str);
                    }
                    C2336.f11496.m4354(AbstractC2328.m4341(-752314634371950L));
                    C2592.f12776.mo2251(null);
                    return C2746.f13459;
                }
                return enumC1765;
            } catch (Throwable th) {
                C2592.f12776.mo2251(null);
                throw th;
            }
        } catch (Exception e5) {
            C2336.f11496.m4358(AbstractC2328.m4341(-752353289077614L), e5);
            throw new Exception(AbstractC2328.m4341(-752404828685166L) + e5.getMessage(), e5);
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C1377(this.f6416, this.f6414, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C1377) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
