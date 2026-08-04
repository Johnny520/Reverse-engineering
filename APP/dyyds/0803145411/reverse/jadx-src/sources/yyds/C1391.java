package yyds;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛶᛸᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1391 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1391 f6485 = new C1391();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2454 f6486;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static volatile C0771 f6487;

    static {
        C1206 c1206 = AbstractC0221.f1238;
        C1158 c1158 = AbstractC1353.f6250;
        C2326 c2326M3466 = AbstractC1741.m3466();
        c1158.getClass();
        f6486 = AbstractC1917.m3696(AbstractC0879.m1960(c1158, c2326M3466));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C1737 m2806(Context context, String str, String str2, String str3, String str4, List list) throws JSONException {
        if (list.isEmpty()) {
            C0188.m800(AbstractC2328.m4341(-760191604392814L));
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2770) it.next()).f13511);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC0473.m1313((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listM3270 = AbstractC1595.m3270(arrayList2);
        C1239.f5669.getClass();
        ArrayList arrayListM2527 = C1239.m2527(context);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayListM2527) {
            if (listM3270.contains((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listM3270) {
            if (!arrayListM2527.contains((String) obj3)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayListM3284 = AbstractC1595.m3284(arrayList3, arrayList4);
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = arrayListM3284.iterator();
        while (it2.hasNext()) {
            jSONArray.put((String) it2.next());
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            jSONArray2.put(((C2770) it3.next()).m4888());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC2328.m4341(-760238849033070L), str);
        jSONObject.put(AbstractC2328.m4341(-760286093673326L), str2);
        String strM4341 = AbstractC2328.m4341(-760350518182766L);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(AbstractC2328.m4341(-760406352757614L), str3);
        jSONObject2.put(AbstractC2328.m4341(-760419237659502L), str4);
        jSONObject.put(strM4341, jSONObject2);
        jSONObject.put(AbstractC2328.m4341(-760440712495982L), true);
        jSONObject.put(AbstractC2328.m4341(-760500842038126L), jSONArray);
        String strM43412 = AbstractC2328.m4341(-760548086678382L);
        String strM43413 = (String) AbstractC1595.m3281(arrayListM3284);
        if (strM43413 == null) {
            strM43413 = AbstractC2328.m4341(-760638280991598L);
        }
        jSONObject.put(strM43412, strM43413);
        jSONObject.put(AbstractC2328.m4341(-760642575958894L), jSONArray2);
        jSONObject.put(AbstractC2328.m4341(-760685525631854L), list.size());
        jSONObject.put(AbstractC2328.m4341(-760749950141294L), jCurrentTimeMillis);
        jSONObject.put(AbstractC2328.m4341(-760797194781550L), jCurrentTimeMillis);
        jSONObject.put(AbstractC2328.m4341(-760844439421806L), AbstractC2328.m4341(-760904568963950L));
        return new C1737(jSONObject, list.size(), arrayListM3284.size());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m2807(Activity activity, C0771 c0771) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC2328.m4341(-760960403538798L), Locale.getDefault());
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-761029123015534L));
        C2701.f13261.getClass();
        sb.append(C2701.m4809(activity));
        sb.append(AbstractC2328.m4341(-761059187786606L));
        sb.append(c0771.f3559);
        sb.append('_');
        String strM4341 = c0771.f3562;
        if (AbstractC0473.m1313(strM4341)) {
            strM4341 = AbstractC2328.m4341(-761115022361454L);
        }
        String strM1292 = AbstractC0473.m1292(40, AbstractC0473.m1298(Pattern.compile(AbstractC2328.m4341(-761226691511150L)).matcher(Pattern.compile(AbstractC2328.m4341(-761149382099822L)).matcher(strM4341).replaceAll(AbstractC2328.m4341(-761218101576558L))).replaceAll(AbstractC2328.m4341(-761239576413038L)), '_'));
        if (AbstractC0473.m1313(strM1292)) {
            strM1292 = AbstractC2328.m4341(-761248166347630L);
        }
        sb.append(strM1292);
        sb.append('_');
        sb.append(simpleDateFormat.format(new Date()));
        sb.append(AbstractC2328.m4341(-761089252557678L));
        String string = sb.toString();
        Intent intent = new Intent(AbstractC2328.m4341(-759289661260654L));
        intent.setType(AbstractC2328.m4341(-759452870017902L));
        intent.putExtra(AbstractC2328.m4341(-759525884461934L), string);
        intent.addCategory(AbstractC2328.m4341(-759641848578926L));
        try {
            f6487 = c0771;
            activity.startActivityForResult(Intent.createChooser(intent, AbstractC2328.m4341(-759783582499694L) + c0771.f3560 + AbstractC2328.m4341(-759796467401582L)), 6607);
        } catch (ActivityNotFoundException e) {
            f6487 = null;
            AbstractC1960.m3789(AbstractC2328.m4341(-759817942238062L));
            C2336.f11496.m4358(AbstractC2328.m4341(-759856596943726L), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2808(Context context, Uri uri, C0771 c0771, AbstractC1320 abstractC1320) throws Throwable {
        C0699 c0699;
        Uri uri2;
        C1737 c1737;
        Uri uri3;
        C1737 c17372;
        Context context2 = context;
        if (abstractC1320 instanceof C0699) {
            c0699 = (C0699) abstractC1320;
            int i = c0699.f3300;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0699.f3300 = i - Integer.MIN_VALUE;
            } else {
                c0699 = new C0699(this, abstractC1320);
            }
        }
        C0699 c06992 = c0699;
        Object objM3955 = c06992.f3298;
        int i2 = c06992.f3300;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            String str = c0771.f3559;
            String str2 = c0771.f3561;
            if (str.equals(AbstractC2328.m4341(-759895251649390L))) {
                c06992.f3302 = context2;
                c06992.f3299 = uri;
                c06992.f3300 = 1;
                C1206 c1206 = AbstractC0221.f1238;
                objM3955 = AbstractC2071.m3955(ExecutorC2482.f12272, new C2474(context2, str2, null, 6), c06992);
                if (objM3955 != enumC1765) {
                    uri2 = uri;
                    c1737 = (C1737) objM3955;
                }
            } else {
                if (!str.equals(AbstractC2328.m4341(-759933906355054L))) {
                    C0188.m800(AbstractC2328.m4341(-759955381191534L));
                    return null;
                }
                String str3 = c0771.f3562;
                c06992.f3302 = context2;
                c06992.f3299 = uri;
                c06992.f3300 = 2;
                C1206 c12062 = AbstractC0221.f1238;
                objM3955 = AbstractC2071.m3955(ExecutorC2482.f12272, new C1126(context2, str2, str3, null, 5), c06992);
                if (objM3955 != enumC1765) {
                    context2 = context;
                    uri2 = uri;
                    c1737 = (C1737) objM3955;
                }
            }
            return enumC1765;
        }
        if (i2 == 1) {
            uri2 = c06992.f3299;
            context2 = c06992.f3302;
            AbstractC1544.m3189(objM3955);
            c1737 = (C1737) objM3955;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    C0188.m800(AbstractC2328.m4341(-759985445962606L));
                    return null;
                }
                c17372 = c06992.f3297;
                uri3 = c06992.f3299;
                AbstractC1544.m3189(objM3955);
                return new C0023(uri3, c17372.f8785, c17372.f8786);
            }
            uri2 = c06992.f3299;
            context2 = c06992.f3302;
            AbstractC1544.m3189(objM3955);
            c1737 = (C1737) objM3955;
        }
        Uri uri4 = uri2;
        Context context3 = context2;
        C1737 c17373 = c1737;
        C1206 c12063 = AbstractC0221.f1238;
        ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
        C2361 c2361 = new C2361(context3, uri4, c17373, null, 4);
        c06992.f3302 = null;
        c06992.f3299 = uri4;
        c06992.f3297 = c17373;
        c06992.f3300 = 3;
        if (AbstractC2071.m3955(executorC2482, c2361, c06992) == enumC1765) {
            return enumC1765;
        }
        uri3 = uri4;
        c17372 = c17373;
        return new C0023(uri3, c17372.f8785, c17372.f8786);
    }
}
