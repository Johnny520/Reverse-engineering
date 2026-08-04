package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᲈᛱᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2592 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2592 f12774;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Object f12775;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C2255 f12776;

    static {
        AbstractC2328.m4341(-530282005037934L);
        AbstractC2328.m4341(-530337839612782L);
        AbstractC2328.m4341(-530419443991406L);
        AbstractC2328.m4341(-530513933271918L);
        f12774 = new C2592();
        f12775 = new Object();
        f12776 = new C2255();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static JSONObject m4658() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C1509.f7142.getClass();
        Collection collectionValues = C0668.f3168.values();
        AbstractC2328.m4341(-790050217034606L);
        for (C0350 c0350 : AbstractC1595.m3269(collectionValues)) {
            String str = c0350.f1817;
            Object objMo731 = c0350.f1819.mo731();
            f12774.getClass();
            if (objMo731 instanceof Set) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Iterable) objMo731).iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                objMo731 = jSONArray;
            } else if (objMo731 instanceof Float) {
                objMo731 = Double.valueOf(((Number) objMo731).floatValue());
            }
            jSONObject.put(str, objMo731);
        }
        jSONObject.put(AbstractC2328.m4341(-527666369954670L), System.currentTimeMillis());
        jSONObject.put(AbstractC2328.m4341(-527713614594926L), AbstractC2328.m4341(-527773744137070L));
        return jSONObject;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static C0119 m4659(Context context) {
        try {
            C0695.f3286.getClass();
            if (C0695.m1612(context)) {
                return new C0119(C0695.m1611(context), C0695.m1613(context), C0695.m1609(context));
            }
            return null;
        } catch (Exception e) {
            C2336.f11496.m4358(AbstractC2328.m4341(-526785901658990L), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Object m4660(Context context, AbstractC1861 abstractC1861) {
        C1206 c1206 = AbstractC0221.f1238;
        return AbstractC2071.m3955(ExecutorC2482.f12272, new C0219(context, null, 19), abstractC1861);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2396 m4661(JSONObject jSONObject) {
        Object objOpt;
        C1509.f7142.getClass();
        Collection collectionValues = C0668.f3168.values();
        AbstractC2328.m4341(-790050217034606L);
        for (C0350 c0350 : AbstractC1595.m3269(collectionValues)) {
            if (jSONObject.has(c0350.f1817) && !jSONObject.isNull(c0350.f1817)) {
                C2001 c2001 = c0350.f1820;
                C2592 c2592 = f12774;
                String str = c0350.f1817;
                Object obj = c0350.f1818;
                c2592.getClass();
                if (obj instanceof String) {
                    objOpt = jSONObject.optString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    objOpt = Boolean.valueOf(jSONObject.optBoolean(str, ((Boolean) obj).booleanValue()));
                } else if (obj instanceof Integer) {
                    objOpt = Integer.valueOf(jSONObject.optInt(str, ((Number) obj).intValue()));
                } else if (obj instanceof Long) {
                    objOpt = Long.valueOf(jSONObject.optLong(str, ((Number) obj).longValue()));
                } else if (obj instanceof Float) {
                    objOpt = Float.valueOf((float) jSONObject.optDouble(str, ((Number) obj).floatValue()));
                } else if (obj instanceof Set) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                        }
                    }
                    Set setM3267 = AbstractC1595.m3267(arrayList);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                    if (jSONArrayOptJSONArray != null) {
                        C0658 c0658 = new C0658();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i);
                            if (strOptString.length() <= 0) {
                                strOptString = null;
                            }
                            if (strOptString != null) {
                                c0658.add(strOptString);
                            }
                        }
                        objOpt = AbstractC1595.m3273(AbstractC1917.m3695(c0658));
                    } else if (jSONObject.has(str)) {
                        String strOptString2 = jSONObject.optString(str);
                        AbstractC2328.m4341(-528001377403758L);
                        List listM1296 = AbstractC0473.m1296(strOptString2, new String[]{AbstractC2328.m4341(-528065801913198L)}, 6);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : listM1296) {
                            if (((String) obj3).length() > 0) {
                                arrayList2.add(obj3);
                            }
                        }
                        objOpt = AbstractC1595.m3273(arrayList2);
                    } else {
                        objOpt = AbstractC1595.m3273(setM3267);
                    }
                } else {
                    objOpt = jSONObject.opt(str);
                }
                c2001.mo371(objOpt);
            }
        }
        C0561 c0561 = C0561.f2672;
        ArrayList arrayList3 = new ArrayList();
        EnumMap enumMap = new EnumMap(EnumC0868.class);
        Iterator it = EnumC0868.f3974.iterator();
        while (true) {
            C0437 c0437 = (C0437) it;
            if (!c0437.hasNext()) {
                break;
            }
            EnumC0868 enumC0868 = (EnumC0868) c0437.next();
            C0561 c05612 = C0561.f2672;
            synchronized (C0561.f2676[enumC0868.ordinal()]) {
                try {
                    long[] jArr = C0561.f2678;
                    int iOrdinal = enumC0868.ordinal();
                    jArr[iOrdinal] = jArr[iOrdinal] + 1;
                    String strM1407 = C0561.m1407(enumC0868);
                    Bitmap bitmapM1410 = AbstractC0473.m1313(strM1407) ? null : C0561.m1410(strM1407);
                    if (!AbstractC0473.m1313(strM1407) && bitmapM1410 == null) {
                        C0561.m1406(enumC0868, AbstractC2328.m4341(-544786109596526L));
                        arrayList3.add(enumC0868);
                    }
                    String strM1405 = C0561.m1405();
                    C0561.m1404(enumC0868, strM1405);
                    enumMap.put(enumC0868, new C2726(bitmapM1410, strM1405));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (C0561.f2673) {
            EnumMap enumMap2 = C0561.f2671;
            enumMap2.clear();
            enumMap2.putAll(enumMap);
            C0561.f2677.clear();
        }
        C1223 c1223 = new C1223(9, EnumC0868.f3974);
        if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
            c1223.mo731();
        } else {
            C0561.f2670.post(new RunnableC0309(5, c1223));
        }
        return new C2396(arrayList3);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static C2396 m4662(JSONObject jSONObject) {
        C2396 c2396M4661;
        AbstractC2328.m4341(-527829578711918L);
        synchronized (f12775) {
            f12774.getClass();
            JSONObject jSONObjectM4658 = m4658();
            try {
                c2396M4661 = m4661(jSONObject);
            } catch (Exception e) {
                try {
                    f12774.getClass();
                    m4661(jSONObjectM4658);
                    C2336.f11496.m4354(AbstractC2328.m4341(-527851053548398L));
                } catch (Exception e2) {
                    AbstractC1579.m3235(e, e2);
                    C2336.f11496.m4358(AbstractC2328.m4341(-527919773025134L), e2);
                }
                throw e;
            }
        }
        return c2396M4661;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4663(Context context, AbstractC1320 abstractC1320) {
        C1097 c1097;
        if (abstractC1320 instanceof C1097) {
            c1097 = (C1097) abstractC1320;
            int i = c1097.f5063;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1097.f5063 = i - Integer.MIN_VALUE;
            } else {
                c1097 = new C1097(this, abstractC1320);
            }
        }
        Object objM3955 = c1097.f5065;
        int i2 = c1097.f5063;
        InterfaceC0274 interfaceC0274 = null;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C0534 c0534 = new C0534(context, interfaceC0274, 3);
            c1097.f5063 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c0534, c1097);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-527254053094254L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4664(Context context, AbstractC1320 abstractC1320) throws Throwable {
        C2737 c2737;
        if (abstractC1320 instanceof C2737) {
            c2737 = (C2737) abstractC1320;
            int i = c2737.f13442;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2737.f13442 = i - Integer.MIN_VALUE;
            } else {
                c2737 = new C2737(this, abstractC1320);
            }
        }
        Object obj = c2737.f13444;
        int i2 = c2737.f13442;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC1544.m3189(obj);
                return ((C2248) obj).f11089;
            }
            C0188.m800(AbstractC2328.m4341(-528826011124590L));
            return null;
        }
        AbstractC1544.m3189(obj);
        String strM4341 = AbstractC2328.m4341(-528701457073006L);
        String strM43412 = AbstractC2328.m4341(-528795946353518L);
        c2737.f13442 = 1;
        Object objM4667 = m4667(context, strM4341, strM43412, c2737);
        Object obj2 = EnumC1765.f8858;
        return objM4667 == obj2 ? obj2 : objM4667;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4665(Context context, AbstractC1320 abstractC1320) throws Throwable {
        C0938 c0938;
        Object objM4674;
        if (abstractC1320 instanceof C0938) {
            c0938 = (C0938) abstractC1320;
            int i = c0938.f4319;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0938.f4319 = i - Integer.MIN_VALUE;
            } else {
                c0938 = new C0938(this, abstractC1320);
            }
        }
        Object obj = c0938.f4321;
        int i2 = c0938.f4319;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            C0695.f3286.getClass();
            if (C0695.m1608(context)) {
                c0938.f4319 = 1;
                objM4674 = m4674(context, c0938);
                Object obj2 = EnumC1765.f8858;
                if (objM4674 == obj2) {
                    return obj2;
                }
            }
            return C2746.f13459;
        }
        if (i2 != 1) {
            C0188.m800(AbstractC2328.m4341(-528181766030190L));
            return null;
        }
        AbstractC1544.m3189(obj);
        objM4674 = ((C2248) obj).f11089;
        if (!(objM4674 instanceof C2658)) {
            C2336.f11496.m4354(AbstractC2328.m4341(-528074391847790L) + ((String) objM4674));
        }
        Throwable thM4249 = C2248.m4249(objM4674);
        if (thM4249 != null) {
            String strM4341 = AbstractC2328.m4341(-528113046553454L);
            String message = thM4249.getMessage();
            if (message == null) {
                message = AbstractC2328.m4341(-528160291193710L);
            }
            AbstractC1960.m3789(strM4341.concat(message));
        }
        return C2746.f13459;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4666(String str, String str2, String str3, AbstractC1320 abstractC1320) {
        C1804 c1804;
        if (abstractC1320 instanceof C1804) {
            c1804 = (C1804) abstractC1320;
            int i = c1804.f9074;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1804.f9074 = i - Integer.MIN_VALUE;
            } else {
                c1804 = new C1804(this, abstractC1320);
            }
        }
        Object objM3955 = c1804.f9076;
        int i2 = c1804.f9074;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C0360 c0360 = new C0360(str, str2, str3, null, 1);
            c1804.f9074 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c0360, c1804);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-526841736233838L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4667(Context context, String str, String str2, AbstractC1320 abstractC1320) {
        C2269 c2269;
        if (abstractC1320 instanceof C2269) {
            c2269 = (C2269) abstractC1320;
            int i = c2269.f11186;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2269.f11186 = i - Integer.MIN_VALUE;
            } else {
                c2269 = new C2269(this, abstractC1320);
            }
        }
        Object objM3955 = c2269.f11188;
        int i2 = c2269.f11186;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C1639 c1639 = new C1639(context, str, str2, (InterfaceC0274) null);
            c2269.f11186 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c1639, c2269);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-529410126676846L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4668(Context context, AbstractC1320 abstractC1320) {
        C1040 c1040;
        if (abstractC1320 instanceof C1040) {
            c1040 = (C1040) abstractC1320;
            int i = c1040.f4736;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1040.f4736 = i - Integer.MIN_VALUE;
            } else {
                c1040 = new C1040(this, abstractC1320);
            }
        }
        Object objM3955 = c1040.f4738;
        int i2 = c1040.f4736;
        InterfaceC0274 interfaceC0274 = null;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C0534 c0534 = new C0534(context, interfaceC0274, i3);
            c1040.f4736 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c0534, c1040);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-527460211524462L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4669(Context context, AbstractC1320 abstractC1320) {
        C1706 c1706;
        if (abstractC1320 instanceof C1706) {
            c1706 = (C1706) abstractC1320;
            int i = c1706.f8643;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1706.f8643 = i - Integer.MIN_VALUE;
            } else {
                c1706 = new C1706(this, abstractC1320);
            }
        }
        Object objM3955 = c1706.f8645;
        int i2 = c1706.f8643;
        InterfaceC0274 interfaceC0274 = null;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C0534 c0534 = new C0534(context, interfaceC0274, 2);
            c1706.f8643 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c0534, c1706);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-529822443537262L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4670(C0119 c0119, String str, String str2, long j, String str3, AbstractC1320 abstractC1320) {
        C2490 c2490;
        String str4;
        long j2;
        Object objM3955;
        C0119 c01192;
        String str5;
        String str6;
        if (abstractC1320 instanceof C2490) {
            c2490 = (C2490) abstractC1320;
            int i = c2490.f12292;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2490.f12292 = i - Integer.MIN_VALUE;
            } else {
                c2490 = new C2490(this, abstractC1320);
            }
        }
        Object obj = c2490.f12295;
        int i2 = c2490.f12292;
        InterfaceC0274 interfaceC0274 = null;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            c2490.f12298 = c0119;
            c2490.f12294 = str;
            c2490.f12291 = str2;
            str4 = str3;
            c2490.f12293 = str4;
            j2 = j;
            c2490.f12297 = j2;
            c2490.f12292 = 1;
            c0119.getClass();
            C1206 c1206 = AbstractC0221.f1238;
            objM3955 = AbstractC2071.m3955(ExecutorC2482.f12272, new C0196(c0119, str2, str, interfaceC0274, 1), c2490);
            if (objM3955 != enumC1765) {
                c01192 = c0119;
                str5 = str;
                str6 = str2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC1544.m3189(obj);
                return obj;
            }
            C0188.m800(AbstractC2328.m4341(-530075846607726L));
            return null;
        }
        long j3 = c2490.f12297;
        String str7 = c2490.f12293;
        str6 = c2490.f12291;
        str5 = c2490.f12294;
        c01192 = c2490.f12298;
        AbstractC1544.m3189(obj);
        objM3955 = obj;
        str4 = str7;
        j2 = j3;
        C2646 c2646 = (C2646) objM3955;
        if (c2646 == null) {
            C0188.m796(str4, AbstractC2328.m4341(-530028601967470L));
            return null;
        }
        Long l = (Long) c2646.f13041.f10553;
        if (l.longValue() > 0 && l.longValue() > j2) {
            throw new IllegalArgumentException((str4 + AbstractC2328.m4341(-530045781836654L) + ((j2 / 1024) / 1024) + AbstractC2328.m4341(-530062961705838L)).toString());
        }
        c2490.f12298 = null;
        c2490.f12294 = null;
        c2490.f12291 = null;
        c2490.f12293 = null;
        c2490.f12297 = j2;
        c2490.f12292 = 2;
        c01192.getClass();
        if (j2 <= 0) {
            C0188.m806(AbstractC2328.m4341(-757137882645358L));
            return null;
        }
        C1206 c12062 = AbstractC0221.f1238;
        Object objM39552 = AbstractC2071.m3955(ExecutorC2482.f12272, new C0165(c01192, str6, str5, j2, null), c2490);
        return objM39552 == enumC1765 ? enumC1765 : objM39552;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4671(Context context, AbstractC1320 abstractC1320) throws Throwable {
        C1610 c1610;
        Object objM4664;
        if (abstractC1320 instanceof C1610) {
            c1610 = (C1610) abstractC1320;
            int i = c1610.f8185;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1610.f8185 = i - Integer.MIN_VALUE;
            } else {
                c1610 = new C1610(this, abstractC1320);
            }
        }
        Object obj = c1610.f8187;
        int i2 = c1610.f8185;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            C0695.f3286.getClass();
            if (C0695.m1608(context)) {
                c1610.f8185 = 1;
                objM4664 = m4664(context, c1610);
                Object obj2 = EnumC1765.f8858;
                if (objM4664 == obj2) {
                    return obj2;
                }
            }
            return C2746.f13459;
        }
        if (i2 != 1) {
            C0188.m800(AbstractC2328.m4341(-528495298642798L));
            return null;
        }
        AbstractC1544.m3189(obj);
        objM4664 = ((C2248) obj).f11089;
        if (!(objM4664 instanceof C2658)) {
            C2336.f11496.m4354(AbstractC2328.m4341(-528387924460398L) + ((String) objM4664));
        }
        Throwable thM4249 = C2248.m4249(objM4664);
        if (thM4249 != null) {
            String strM4341 = AbstractC2328.m4341(-528426579166062L);
            String message = thM4249.getMessage();
            if (message == null) {
                message = AbstractC2328.m4341(-528473823806318L);
            }
            AbstractC1960.m3789(strM4341.concat(message));
        }
        return C2746.f13459;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4672(Context context, AbstractC1320 abstractC1320) throws Throwable {
        C2570 c2570;
        if (abstractC1320 instanceof C2570) {
            c2570 = (C2570) abstractC1320;
            int i = c2570.f12654;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2570.f12654 = i - Integer.MIN_VALUE;
            } else {
                c2570 = new C2570(this, abstractC1320);
            }
        }
        Object objM3955 = c2570.f12656;
        int i2 = c2570.f12654;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C1647 c1647 = new C1647(context, (InterfaceC0274) null);
            c2570.f12654 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c1647, c2570);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-529616285107054L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4673(Context context, AbstractC1320 abstractC1320) throws Throwable {
        C2532 c2532;
        if (abstractC1320 instanceof C2532) {
            c2532 = (C2532) abstractC1320;
            int i = c2532.f12469;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2532.f12469 = i - Integer.MIN_VALUE;
            } else {
                c2532 = new C2532(this, abstractC1320);
            }
        }
        Object obj = c2532.f12471;
        int i2 = c2532.f12469;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC1544.m3189(obj);
                return ((C2248) obj).f11089;
            }
            C0188.m800(AbstractC2328.m4341(-529203968246638L));
            return null;
        }
        AbstractC1544.m3189(obj);
        String strM4341 = AbstractC2328.m4341(-529032169554798L);
        String strM43412 = AbstractC2328.m4341(-529161018573678L);
        c2532.f12469 = 1;
        Object objM4667 = m4667(context, strM4341, strM43412, c2532);
        Object obj2 = EnumC1765.f8858;
        return objM4667 == obj2 ? obj2 : objM4667;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4674(Context context, AbstractC1320 abstractC1320) {
        C1576 c1576;
        if (abstractC1320 instanceof C1576) {
            c1576 = (C1576) abstractC1320;
            int i = c1576.f7999;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1576.f7999 = i - Integer.MIN_VALUE;
            } else {
                c1576 = new C1576(this, abstractC1320);
            }
        }
        Object objM3955 = c1576.f8001;
        int i2 = c1576.f7999;
        InterfaceC0274 interfaceC0274 = null;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C0534 c0534 = new C0534(context, interfaceC0274, 0);
            c1576.f7999 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c0534, c1576);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-527047894664046L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }
}
