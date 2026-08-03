package p080fb;

import ac.AbstractC0063p;
import ac.C0058k;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0119x;
import be.AbstractC0283h;
import bh.C0312a;
import ca.C0532s;
import ch.C0568c;
import ch.C0570e;
import gg.AbstractC1411g;
import gg.AbstractC1416l;
import gh.C1431c;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipFile;
import ng.AbstractC3015m;
import ng.C3003a;
import ng.C3011i;
import ng.C3019q;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p007a7.C0020c;
import p020b5.C0184c;
import p020b5.C0190i;
import p025bc.AbstractC0255e;
import p054dg.AbstractC0793l;
import p054dg.C0791j;
import p061e5.C0826a;
import p063e9.C0837h;
import p065eb.C0868g;
import p074f5.EnumC1065a;
import p085fg.InterfaceC1231l;
import p086fh.C1243a;
import p086fh.C1253k;
import p115hh.C1716a;
import p115hh.C1717b;
import p115hh.C1719d;
import p115hh.C1724i;
import p115hh.C1725j;
import p115hh.C1727l;
import p115hh.C1728m;
import p115hh.C1730o;
import p115hh.C1731p;
import p115hh.C1732q;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p150k5.C2251e;
import p150k5.C2255g;
import p150k5.C2258i;
import p150k5.C2261l;
import p150k5.C2263n;
import p150k5.C2264o;
import p150k5.C2268s;
import p150k5.C2270u;
import p150k5.C2272w;
import p150k5.C2275z;
import p166l7.C2516d;
import p166l7.C2518f;
import p166l7.C2524l;
import p172lg.C2563c;
import p172lg.C2564d;
import p173lh.C2567a;
import p173lh.C2570d;
import p207o5.AbstractC3050e;
import p207o5.C3061p;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p276sf.C3967n;
import p285t7.C4135b;
import p288tb.C4143c;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import p363y7.AbstractC5999a;
import p379z7.C6110f;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: fb.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1152n0 {

    /* JADX INFO: renamed from: e */
    public static C1136j0 f3807e;

    /* JADX INFO: renamed from: p */
    public static final List f3818p;

    /* JADX INFO: renamed from: q */
    public static final List f3819q;

    /* JADX INFO: renamed from: r */
    public static final List f3820r;

    /* JADX INFO: renamed from: s */
    public static final List f3821s;

    /* JADX INFO: renamed from: t */
    public static final List f3822t;

    /* JADX INFO: renamed from: u */
    public static final Set f3823u;

    /* JADX INFO: renamed from: a */
    public static final Set f3803a = AbstractC4156d0.m8355W("open_target_session", "list_target_sessions", "get_target_session", "close_target_session", "compare_methods_using_strings", "find_classes_using_strings", "find_methods_using_strings", "find_methods_using_resource", "find_methods", "inspect_method", "inspect_class", "export_method_java", "export_class_java", "export_method_smali", "export_class_smali", "read_tool_result", "find_resource_values", "get_resource_value", "list_res", "decode_xml", "manifest");

    /* JADX INFO: renamed from: b */
    public static final AtomicReference f3804b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public static final Object f3805c = new Object();

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f3806d = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public static final List f3808f = AbstractC0000a.m101y0("className", "descriptor", "sourceFile", "methodCount", "fieldCount", "modifiers", "sourcePath", "sourceEntry");

    /* JADX INFO: renamed from: g */
    public static final List f3809g = AbstractC0000a.m101y0("className", "descriptor", "sourceFile", "methodCount", "fieldCount");

    /* JADX INFO: renamed from: h */
    public static final List f3810h = AbstractC0000a.m101y0("className", "descriptor");

    /* JADX INFO: renamed from: i */
    public static final List f3811i = AbstractC0000a.m101y0("className", "methodName", "descriptor", "methodSign", "returnType", "paramTypes", "paramCount", "modifiers", "sourcePath", "sourceEntry");

    /* JADX INFO: renamed from: j */
    public static final List f3812j = AbstractC0000a.m101y0("className", "methodName", "descriptor", "methodSign", "returnType", "paramTypes", "paramCount", "modifiers");

    /* JADX INFO: renamed from: k */
    public static final List f3813k = AbstractC0000a.m99x0("descriptor");

    /* JADX INFO: renamed from: l */
    public static final List f3814l = AbstractC0000a.m101y0("resourceId", "type", "name", "filePath", "sourcePath", "sourceEntry", "resolution");

    /* JADX INFO: renamed from: m */
    public static final List f3815m = AbstractC0000a.m101y0("resourceId", "type", "name", "value", "qualifiers", "default", "filePath", "sourcePath", "sourceEntry", "resolution");

    /* JADX INFO: renamed from: n */
    public static final List f3816n = AbstractC0000a.m101y0("resourceId", "type", "name", "sourcePath");

    /* JADX INFO: renamed from: o */
    public static final List f3817o = AbstractC0000a.m101y0("resourceId", "type", "name", "value", "qualifiers", "default", "sourcePath");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        List listM101y0 = AbstractC0000a.m101y0("resourceId", "type", "name");
        f3818p = listM101y0;
        f3819q = listM101y0;
        f3820r = AbstractC0000a.m101y0("strings", "using-fields", "invokes", "callers", "annotations", "opcodes");
        f3821s = AbstractC0000a.m101y0("fields", "methods", "annotations");
        f3822t = AbstractC0000a.m101y0("uses-sdk", "application", "uses-permissions", "defined-permissions", "uses-features", "activities", "activity-aliases", "services", "receivers", "providers");
        f3823u = AbstractC4156d0.m8355W("open_target_session", "list_target_sessions", "get_target_session", "close_target_session", "compare_methods_using_strings");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static JSONObject m2914A(String str, int i9, int i10, Integer num) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("type", "integer", "description", str);
        jSONObjectM9268l.put("default", i9);
        jSONObjectM9268l.put("minimum", i10);
        if (num != null) {
            jSONObjectM9268l.put("maximum", num.intValue());
        }
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static int m2915B(JSONObject jSONObject) {
        return AbstractC3754e0.m7909r(jSONObject.optInt("limit", 30), 1, 100);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: C */
    public static String m2916C(C1136j0 c1136j0, JSONObject jSONObject) {
        String strM1023l = AbstractC0255e.m1023l("type", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        Object value = c1136j0.f3738q.getValue();
        value.getClass();
        List listM6418b0 = AbstractC3015m.m6418b0(new C3011i(AbstractC3015m.m6408R(new C2516d(((C2524l) value).m5927W(null), 1)), true, new C0532s(strM1023l, 7)));
        Set setM2927N = m2927N(jSONObject, f3814l, f3818p, f3816n);
        int iOptInt = jSONObject.optInt("offset", 0);
        List listM8403L1 = AbstractC4166m.m8403L1(m2915B(jSONObject), AbstractC4166m.m8419q1(iOptInt >= 0 ? iOptInt : 0, listM6418b0));
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
        Iterator it = listM8403L1.iterator();
        while (it.hasNext()) {
            arrayList.add(m2932S(c1136j0, (C4135b) it.next(), null, setM2927N));
        }
        return m2933T(arrayList, listM6418b0.size(), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static String m2917D(C1136j0 c1136j0) throws JSONException {
        LinkedHashMap linkedHashMap = f3806d;
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            C1148m0 c1148m0 = (C1148m0) obj;
            if (c1148m0.f3785c.equals("external_wechat_apk") && !new File(c1148m0.f3784b).isFile()) {
                arrayList.add(obj);
            }
        }
        ArrayList<String> arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C1148m0) it.next()).f3783a);
        }
        if (!arrayList2.isEmpty()) {
            for (String str : arrayList2) {
                linkedHashMap.remove(str);
                C1136j0 c1136j02 = f3807e;
                if (AbstractC1416l.m3825a(c1136j02 != null ? c1136j02.f3731j : null, str)) {
                    C1136j0 c1136j03 = f3807e;
                    if (c1136j03 != null) {
                        c1136j03.close();
                    }
                    f3807e = null;
                }
            }
            m2925L(c1136j0);
        }
        Collection collectionValues2 = linkedHashMap.values();
        collectionValues2.getClass();
        Collection<C1148m0> collection = collectionValues2;
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(collection));
        for (C1148m0 c1148m02 : collection) {
            c1148m02.getClass();
            arrayList3.add(m2947d0(c1136j0, c1148m02));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total", arrayList3.size());
        jSONObject.put("default_session_id", c1136j0.f3731j);
        jSONObject.put("items", new JSONArray((Collection) arrayList3));
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2918E(C1136j0 c1136j0) {
        Object c3959f;
        JSONArray jSONArray;
        int length;
        int i9;
        boolean z9;
        LinkedHashMap linkedHashMap;
        Object c3959f2;
        C1136j0 c1136j02 = c1136j0;
        Context context = c1136j02.f3728g;
        String string = AbstractC4302b.m8640c(context, "Hchat_agent_reverse_targets").getString("targets_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(string)) {
            return;
        }
        try {
            jSONArray = new JSONArray(string);
            length = jSONArray.length();
            i9 = 0;
            z9 = false;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        while (true) {
            linkedHashMap = f3806d;
            if (i9 >= length) {
                break;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject == null) {
                z9 = true;
            } else {
                try {
                    c3959f2 = new File(jSONObjectOptJSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET)).getCanonicalFile();
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                File file = (File) c3959f2;
                if (file != null && file.isFile() && AbstractC0793l.m2023c0(file).equalsIgnoreCase("apk") && !m2936W(file, new File(c1136j02.f3730i))) {
                    String strM2945c0 = m2945c0(file);
                    String path = file.getPath();
                    path.getClass();
                    long length2 = file.length();
                    long jLastModified = file.lastModified();
                    long jOptLong = jSONObjectOptJSONObject.optLong("addedAt", file.lastModified());
                    linkedHashMap.put(strM2945c0, new C1148m0(strM2945c0, path, "external_wechat_apk", length2, jLastModified, jOptLong < 0 ? 0L : jOptLong));
                }
            }
            i9++;
            c1136j02 = c1136j0;
            c3959f = new C3959f(th2);
            if (C3960g.m8182b(c3959f) == null) {
                AbstractC4302b.m8640c(context, "Hchat_agent_reverse_targets").edit().remove("targets_v1").apply();
                return;
            }
            return;
        }
        int size = linkedHashMap.size();
        m2928O(c1136j02);
        if (z9 || linkedHashMap.size() != size) {
            m2925L(c1136j02);
        }
        c3959f = C3967n.f12976a;
        if (C3960g.m8182b(c3959f) == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:116:0x021e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x035f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:193:0x03bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:208:0x03ff */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:219:0x042c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:250:0x00d4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:251:0x00fa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:252:0x0120 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:253:0x0146 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:254:0x021e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:255:0x02f7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:261:0x035f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:265:0x03bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:266:0x03ff */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:269:0x042c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00d4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x00fa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0120 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0146 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: F */
    public static String m2919F(C1136j0 c1136j0, JSONObject jSONObject) throws JSONException {
        String str;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        C4173t c4173t;
        boolean z9;
        ArrayList arrayList5;
        ?? arrayList6;
        ?? arrayList7;
        ?? arrayList8;
        ?? arrayList9;
        ArrayList arrayList10;
        C4173t c4173t2;
        String str2;
        String strConcat;
        ?? arrayList11;
        Object obj;
        Set setM8412U1 = AbstractC4166m.m8412U1(m2943b0("include", jSONObject));
        Set set = setM8412U1;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!f3822t.contains((String) it.next())) {
                    C2104o.m5294t("manifest include 包含不支持的值");
                    return null;
                }
            }
        }
        Context context = c1136j0.f3728g;
        String str3 = c1136j0.f3730i;
        PackageInfo packageInfoM2944c = m2944c(context, str3, 20623);
        if (packageInfoM2944c == null) {
            return m2958l("无法解析 APK Manifest: ".concat(str3));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("packageName", packageInfoM2944c.packageName);
        String str4 = packageInfoM2944c.versionName;
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str4 == null) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONObject2.put("versionName", str4);
        jSONObject2.put("versionCode", packageInfoM2944c.getLongVersionCode());
        jSONObject2.put("sourcePath", str3);
        jSONObject2.put("sourceEntry", "AndroidManifest.xml");
        ApplicationInfo applicationInfo = packageInfoM2944c.applicationInfo;
        if (applicationInfo == null || (str = applicationInfo.className) == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONObject2.put("applicationClass", str);
        ApplicationInfo applicationInfo2 = packageInfoM2944c.applicationInfo;
        jSONObject2.put("minSdk", applicationInfo2 != null ? applicationInfo2.minSdkVersion : 0);
        ApplicationInfo applicationInfo3 = packageInfoM2944c.applicationInfo;
        jSONObject2.put("targetSdk", applicationInfo3 != null ? applicationInfo3.targetSdkVersion : 0);
        String[] strArr = packageInfoM2944c.requestedPermissions;
        List listM8375L0 = strArr != null ? AbstractC4165l.m8375L0(strArr) : null;
        C4173t c4173t3 = C4173t.f13710g;
        if (listM8375L0 == null) {
            listM8375L0 = c4173t3;
        }
        jSONObject2.put("permissions", new JSONArray((Collection) listM8375L0));
        ActivityInfo[] activityInfoArr = packageInfoM2944c.activities;
        if (activityInfoArr != null) {
            arrayList = new ArrayList(activityInfoArr.length);
            for (ActivityInfo activityInfo : activityInfoArr) {
                arrayList.add(activityInfo.name);
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = c4173t3;
        }
        jSONObject2.put("activities", new JSONArray((Collection) arrayList));
        ServiceInfo[] serviceInfoArr = packageInfoM2944c.services;
        if (serviceInfoArr != null) {
            arrayList2 = new ArrayList(serviceInfoArr.length);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                arrayList2.add(serviceInfo.name);
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = c4173t3;
        }
        jSONObject2.put("services", new JSONArray((Collection) arrayList2));
        ActivityInfo[] activityInfoArr2 = packageInfoM2944c.receivers;
        if (activityInfoArr2 != null) {
            arrayList3 = new ArrayList(activityInfoArr2.length);
            for (ActivityInfo activityInfo2 : activityInfoArr2) {
                arrayList3.add(activityInfo2.name);
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = c4173t3;
        }
        jSONObject2.put("receivers", new JSONArray((Collection) arrayList3));
        ProviderInfo[] providerInfoArr = packageInfoM2944c.providers;
        if (providerInfoArr != null) {
            arrayList4 = new ArrayList(providerInfoArr.length);
            for (ProviderInfo providerInfo : providerInfoArr) {
                arrayList4.add(providerInfo.name);
            }
        } else {
            arrayList4 = 0;
        }
        if (arrayList4 == 0) {
            arrayList4 = c4173t3;
        }
        jSONObject2.put("providers", new JSONArray((Collection) arrayList4));
        if (setM8412U1.contains("uses-sdk")) {
            JSONObject jSONObject3 = new JSONObject();
            ApplicationInfo applicationInfo4 = packageInfoM2944c.applicationInfo;
            jSONObject3.put("minSdkVersion", applicationInfo4 != null ? applicationInfo4.minSdkVersion : 0);
            ApplicationInfo applicationInfo5 = packageInfoM2944c.applicationInfo;
            jSONObject3.put("targetSdkVersion", applicationInfo5 != null ? applicationInfo5.targetSdkVersion : 0);
            jSONObject2.put("usesSdk", jSONObject3);
        }
        String str6 = "name";
        if (setM8412U1.contains("application")) {
            ApplicationInfo applicationInfo6 = packageInfoM2944c.applicationInfo;
            if (applicationInfo6 != null) {
                JSONObject jSONObject4 = new JSONObject();
                String str7 = applicationInfo6.className;
                if (str7 == null) {
                    str7 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                jSONObject4.put("name", str7);
                String str8 = applicationInfo6.processName;
                if (str8 != null) {
                    str5 = str8;
                }
                jSONObject4.put("process", str5);
                jSONObject4.put("enabled", applicationInfo6.enabled);
                jSONObject4.put("labelRes", applicationInfo6.labelRes);
                jSONObject4.put("icon", applicationInfo6.icon);
                jSONObject4.put("metaData", m2950f(applicationInfo6.metaData));
                obj = jSONObject4;
            } else {
                obj = JSONObject.NULL;
            }
            jSONObject2.put("application", obj);
        }
        if (setM8412U1.contains("uses-permissions")) {
            String[] strArr2 = packageInfoM2944c.requestedPermissions;
            List listM8375L02 = strArr2 != null ? AbstractC4165l.m8375L0(strArr2) : null;
            if (listM8375L02 == null) {
                listM8375L02 = c4173t3;
            }
            jSONObject2.put("usesPermissions", new JSONArray((Collection) listM8375L02));
        }
        if (setM8412U1.contains("defined-permissions")) {
            PermissionInfo[] permissionInfoArr = packageInfoM2944c.permissions;
            if (permissionInfoArr != null) {
                arrayList11 = new ArrayList(permissionInfoArr.length);
                int length = permissionInfoArr.length;
                int i9 = 0;
                while (i9 < length) {
                    PermissionInfo permissionInfo = permissionInfoArr[i9];
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("name", permissionInfo.name);
                    jSONObject5.put("protectionLevel", permissionInfo.protectionLevel);
                    arrayList11.add(jSONObject5);
                    i9++;
                    permissionInfoArr = permissionInfoArr;
                }
            } else {
                arrayList11 = 0;
            }
            if (arrayList11 == 0) {
                arrayList11 = c4173t3;
            }
            jSONObject2.put("definedPermissions", new JSONArray((Collection) arrayList11));
        }
        if (setM8412U1.contains("uses-features")) {
            FeatureInfo[] featureInfoArr = packageInfoM2944c.reqFeatures;
            if (featureInfoArr != null) {
                arrayList10 = new ArrayList(featureInfoArr.length);
                int length2 = featureInfoArr.length;
                int i10 = 0;
                while (i10 < length2) {
                    FeatureInfo featureInfo = featureInfoArr[i10];
                    JSONObject jSONObject6 = new JSONObject();
                    FeatureInfo[] featureInfoArr2 = featureInfoArr;
                    Object obj2 = featureInfo.name;
                    if (obj2 == null) {
                        obj2 = JSONObject.NULL;
                    }
                    jSONObject6.put(str6, obj2);
                    int i11 = length2;
                    jSONObject6.put("required", (featureInfo.flags & 1) != 0);
                    int i12 = featureInfo.reqGlEsVersion;
                    AbstractC0000a.m96w(16);
                    C4173t c4173t4 = c4173t3;
                    long j3 = ((long) i12) & 4294967295L;
                    if (j3 >= 0) {
                        AbstractC0000a.m96w(16);
                        strConcat = Long.toString(j3, 16);
                        strConcat.getClass();
                        str2 = str6;
                        c4173t2 = c4173t4;
                    } else {
                        long j4 = j3 >>> 1;
                        long j5 = 16;
                        long j10 = (j4 / j5) << 1;
                        long j11 = j3 - (j10 * j5);
                        if (j11 >= j5) {
                            j11 -= j5;
                            j10++;
                        }
                        c4173t2 = c4173t4;
                        AbstractC0000a.m96w(16);
                        str2 = str6;
                        String string = Long.toString(j10, 16);
                        string.getClass();
                        AbstractC0000a.m96w(16);
                        String string2 = Long.toString(j11, 16);
                        string2.getClass();
                        strConcat = string.concat(string2);
                    }
                    jSONObject6.put("glEsVersion", "0x" + AbstractC3149m.m6726y0(8, strConcat));
                    arrayList10.add(jSONObject6);
                    i10++;
                    featureInfoArr = featureInfoArr2;
                    length2 = i11;
                    c4173t3 = c4173t2;
                    str6 = str2;
                }
            } else {
                arrayList10 = null;
            }
            c4173t = c4173t3;
            z9 = true;
            Collection collection = arrayList10;
            if (arrayList10 == null) {
                collection = c4173t;
            }
            jSONObject2.put("usesFeatures", new JSONArray(collection));
        } else {
            c4173t = c4173t3;
            z9 = true;
        }
        if (setM8412U1.contains("activities")) {
            ActivityInfo[] activityInfoArr3 = packageInfoM2944c.activities;
            if (activityInfoArr3 != null) {
                ArrayList arrayList12 = new ArrayList();
                for (ActivityInfo activityInfo3 : activityInfoArr3) {
                    String str9 = activityInfo3.targetActivity;
                    if ((str9 == null || AbstractC3149m.m6721t0(str9)) ? z9 : false) {
                        arrayList12.add(activityInfo3);
                    }
                }
                arrayList9 = new ArrayList(AbstractC4167n.m8429e1(arrayList12));
                Iterator it2 = arrayList12.iterator();
                while (it2.hasNext()) {
                    arrayList9.add(m2940a((ActivityInfo) it2.next()));
                }
            } else {
                arrayList9 = 0;
            }
            if (arrayList9 == 0) {
                arrayList9 = c4173t;
            }
            jSONObject2.put("activities", new JSONArray((Collection) arrayList9));
        }
        if (setM8412U1.contains("activity-aliases")) {
            ActivityInfo[] activityInfoArr4 = packageInfoM2944c.activities;
            if (activityInfoArr4 != null) {
                ArrayList arrayList13 = new ArrayList();
                for (ActivityInfo activityInfo4 : activityInfoArr4) {
                    String str10 = activityInfo4.targetActivity;
                    if (!((str10 == null || AbstractC3149m.m6721t0(str10)) ? z9 : false)) {
                        arrayList13.add(activityInfo4);
                    }
                }
                arrayList8 = new ArrayList(AbstractC4167n.m8429e1(arrayList13));
                Iterator it3 = arrayList13.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(m2940a((ActivityInfo) it3.next()));
                }
            } else {
                arrayList8 = 0;
            }
            if (arrayList8 == 0) {
                arrayList8 = c4173t;
            }
            jSONObject2.put("activityAliases", new JSONArray((Collection) arrayList8));
        }
        if (setM8412U1.contains("services")) {
            ServiceInfo[] serviceInfoArr2 = packageInfoM2944c.services;
            if (serviceInfoArr2 != null) {
                arrayList7 = new ArrayList(serviceInfoArr2.length);
                for (ServiceInfo serviceInfo2 : serviceInfoArr2) {
                    JSONObject jSONObjectM2956j = m2956j(serviceInfo2);
                    Object obj3 = serviceInfo2.permission;
                    if (obj3 == null) {
                        obj3 = JSONObject.NULL;
                    }
                    jSONObjectM2956j.put("permission", obj3);
                    jSONObjectM2956j.put("metaData", m2950f(serviceInfo2.metaData));
                    arrayList7.add(jSONObjectM2956j);
                }
            } else {
                arrayList7 = 0;
            }
            if (arrayList7 == 0) {
                arrayList7 = c4173t;
            }
            jSONObject2.put("services", new JSONArray((Collection) arrayList7));
        }
        if (setM8412U1.contains("receivers")) {
            ActivityInfo[] activityInfoArr5 = packageInfoM2944c.receivers;
            if (activityInfoArr5 != null) {
                arrayList6 = new ArrayList(activityInfoArr5.length);
                for (ActivityInfo activityInfo5 : activityInfoArr5) {
                    arrayList6.add(m2940a(activityInfo5));
                }
            } else {
                arrayList6 = 0;
            }
            if (arrayList6 == 0) {
                arrayList6 = c4173t;
            }
            jSONObject2.put("receivers", new JSONArray((Collection) arrayList6));
        }
        if (setM8412U1.contains("providers")) {
            ProviderInfo[] providerInfoArr2 = packageInfoM2944c.providers;
            if (providerInfoArr2 != null) {
                arrayList5 = new ArrayList(providerInfoArr2.length);
                for (ProviderInfo providerInfo2 : providerInfoArr2) {
                    JSONObject jSONObjectM2956j2 = m2956j(providerInfo2);
                    Object obj4 = providerInfo2.authority;
                    if (obj4 == null) {
                        obj4 = JSONObject.NULL;
                    }
                    jSONObjectM2956j2.put("authorities", obj4);
                    Object obj5 = providerInfo2.readPermission;
                    if (obj5 == null) {
                        obj5 = JSONObject.NULL;
                    }
                    jSONObjectM2956j2.put("readPermission", obj5);
                    Object obj6 = providerInfo2.writePermission;
                    if (obj6 == null) {
                        obj6 = JSONObject.NULL;
                    }
                    jSONObjectM2956j2.put("writePermission", obj6);
                    jSONObjectM2956j2.put("metaData", m2950f(providerInfo2.metaData));
                    arrayList5.add(jSONObjectM2956j2);
                }
            } else {
                arrayList5 = null;
            }
            jSONObject2.put("providers", new JSONArray(arrayList5 == null ? c4173t : arrayList5));
        }
        String string3 = jSONObject2.toString();
        string3.getClass();
        return string3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static String m2920G(C1136j0 c1136j0, List list, JSONObject jSONObject, C1103b c1103b) throws JSONException {
        Map mapM2909f;
        Set setM2927N = m2927N(jSONObject, f3811i, f3813k, f3812j);
        int iOptInt = jSONObject.optInt("offset", 0);
        List<C1730o> listM8403L1 = AbstractC4166m.m8403L1(m2915B(jSONObject), AbstractC4166m.m8419q1(iOptInt >= 0 ? iOptInt : 0, list));
        if (setM2927N.contains("sourceEntry")) {
            C1145l1 c1145l1 = c1136j0.f3735n;
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
            Iterator it = listM8403L1.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3149m.m6699N0(((C1730o) it.next()).f5750j, "->"));
            }
            mapM2909f = c1145l1.m2909f(arrayList, c1103b);
        } else {
            mapM2909f = C4174u.f13711g;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
        for (C1730o c1730o : listM8403L1) {
            JSONObject jSONObject2 = new JSONObject();
            C2570d c2570dM4348p = c1730o.m4348p();
            String str = c1730o.f5750j;
            m2929P(jSONObject2, setM2927N, "className", c2570dM4348p.f8333g);
            m2929P(jSONObject2, setM2927N, "methodName", c1730o.m4348p().f8334h);
            m2929P(jSONObject2, setM2927N, "descriptor", str);
            m2929P(jSONObject2, setM2927N, "methodSign", (String) c1730o.m4348p().f8337k.getValue());
            m2929P(jSONObject2, setM2927N, "returnType", c1730o.m4348p().f8336j);
            m2929P(jSONObject2, setM2927N, "paramTypes", new JSONArray((Collection) c1730o.m4348p().f8335i));
            m2929P(jSONObject2, setM2927N, "paramCount", Integer.valueOf(c1730o.f5752l.size()));
            m2929P(jSONObject2, setM2927N, "modifiers", Integer.valueOf(c1730o.f5749i));
            m2929P(jSONObject2, setM2927N, "sourcePath", c1136j0.f3730i);
            Object obj = (String) mapM2909f.get(AbstractC3149m.m6699N0(str, "->"));
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            m2929P(jSONObject2, setM2927N, "sourceEntry", obj);
            arrayList2.add(jSONObject2);
        }
        return m2933T(arrayList2, list.size(), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static JSONObject m2921H(C1730o c1730o) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("className", c1730o.m4348p().f8333g);
        jSONObject.put("methodName", c1730o.m4348p().f8334h);
        jSONObject.put("descriptor", c1730o.f5750j);
        jSONObject.put("methodSign", (String) c1730o.m4348p().f8337k.getValue());
        jSONObject.put("returnType", c1730o.m4348p().f8336j);
        jSONObject.put("paramTypes", new JSONArray((Collection) c1730o.m4348p().f8335i));
        jSONObject.put("paramCount", c1730o.f5752l.size());
        jSONObject.put("modifiers", c1730o.f5749i);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static String m2922I(String str) {
        return AbstractC3149m.m6686A0(AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(str).toString(), "hchat.reverse."), "local.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2923J(C1136j0 c1136j0, JSONObject jSONObject, ArrayList arrayList) throws JSONException, NoSuchAlgorithmException, IOException {
        Object c3959f;
        Object c3959f2;
        C1136j0 c1136j0M2930Q;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String strM1023l = AbstractC0255e.m1023l("input", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strM1023l2 = AbstractC0255e.m1023l("session_id", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l) || AbstractC3149m.m6721t0(strM1023l2)) {
            str = strM1023l2;
        } else if (!strM1023l2.equals(strM1023l) && !new File(strM1023l2).isAbsolute()) {
            return m2958l("open_target_session 不能同时传 input 和 session_id");
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(strM1023l);
        LinkedHashMap linkedHashMap = f3806d;
        if (!zM6721t0) {
            try {
                c3959f = new File(strM1023l).getCanonicalFile();
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                throw new IllegalArgumentException("APK 路径无效: ".concat(strM1023l), thM8182b);
            }
            File file = (File) c3959f;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        c3959f2 = ((File) it.next()).getCanonicalFile();
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    File file2 = (File) c3959f2;
                    if (file2 != null) {
                        if (!AbstractC1416l.m3825a(file.getPath(), file2.getPath())) {
                            String path = file.getPath();
                            path.getClass();
                            String path2 = file2.getPath();
                            path2.getClass();
                            if (AbstractC3156t.m6740d0(path, AbstractC3149m.m6706U0(path2, File.separatorChar) + File.separator, false)) {
                            }
                        }
                        file.getClass();
                        if (!file.isFile()) {
                            C2104o.m5291q(AbstractC4855en.m9263g("APK 文件不存在或不可读取: ", file.getPath()));
                            return null;
                        }
                        if (!AbstractC0793l.m2023c0(file).equalsIgnoreCase("apk")) {
                            C2104o.m5291q(AbstractC4855en.m9263g("目标必须是 APK 文件: ", file.getName()));
                            return null;
                        }
                        if (file.length() <= 0) {
                            C2104o.m5291q(AbstractC4855en.m9263g("APK 文件为空: ", file.getName()));
                            return null;
                        }
                        ZipFile zipFile = new ZipFile(file);
                        try {
                            if (zipFile.getEntry("AndroidManifest.xml") == null) {
                                throw new IllegalArgumentException("APK 缺少 AndroidManifest.xml");
                            }
                            if (zipFile.getEntry("classes.dex") == null) {
                                throw new IllegalArgumentException("APK 缺少 classes.dex");
                            }
                            zipFile.close();
                            if (m2936W(file, new File(c1136j0.f3730i))) {
                                c1136j0M2930Q = c1136j0;
                            } else {
                                String strM2945c0 = m2945c0(file);
                                if (((C1148m0) linkedHashMap.get(strM2945c0)) != null) {
                                    c1136j0M2930Q = m2930Q(c1136j0, strM2945c0);
                                } else {
                                    Collection collectionValues = linkedHashMap.values();
                                    collectionValues.getClass();
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj : collectionValues) {
                                        C1148m0 c1148m0 = (C1148m0) obj;
                                        if (c1148m0.f3785c.equals("external_wechat_apk") && c1148m0.f3784b.equals(file.getPath())) {
                                            arrayList2.add(obj);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList3.add(((C1148m0) it2.next()).f3783a);
                                    }
                                    String path3 = file.getPath();
                                    path3.getClass();
                                    C1148m0 c1148m02 = new C1148m0(strM2945c0, path3, "external_wechat_apk", file.length(), file.lastModified(), System.currentTimeMillis());
                                    linkedHashMap.put(strM2945c0, c1148m02);
                                    try {
                                        C1136j0 c1136j0M2930Q2 = m2930Q(c1136j0, strM2945c0);
                                        Iterator it3 = arrayList3.iterator();
                                        while (it3.hasNext()) {
                                            linkedHashMap.remove((String) it3.next());
                                        }
                                        m2928O(c1136j0);
                                        m2925L(c1136j0);
                                        c1136j0M2930Q = c1136j0M2930Q2;
                                    } catch (Throwable th4) {
                                        linkedHashMap.remove(c1148m02.f3783a);
                                        throw th4;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            C2104o.m5294t("只能打开用户消息中明确提供的 APK 路径或其子项");
            return null;
        }
        if (!AbstractC3149m.m6721t0(str)) {
            c1136j0M2930Q = m2930Q(c1136j0, str);
        }
        String str2 = c1136j0M2930Q.f3732k;
        String str3 = c1136j0M2930Q.f3730i;
        String str4 = c1136j0M2930Q.f3731j;
        C1148m0 c1148m03 = (C1148m0) linkedHashMap.get(str4);
        if (c1148m03 == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file3 = new File(str3);
            c1148m03 = new C1148m0(str4, str3, str2, file3.length(), file3.lastModified(), jCurrentTimeMillis);
        }
        JSONObject jSONObjectM2947d0 = m2947d0(c1136j0, c1148m03);
        jSONObjectM2947d0.put("dexCount", c1136j0M2930Q.f3729h.getDexNum());
        jSONObjectM2947d0.put("message", str2.equals("current_wechat_apk") ? "当前运行微信已绑定；省略 session_id 时默认查询此目标" : "外部微信 APK 已打开；后续每次查询必须传此 session_id");
        String string = jSONObjectM2947d0.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static Integer m2924K(String str) {
        Object c3959f;
        long j3;
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return null;
        }
        try {
            if (AbstractC3156t.m6740d0(string, "0x", true)) {
                String strSubstring = string.substring(2);
                AbstractC0000a.m96w(16);
                j3 = Long.parseLong(strSubstring, 16);
            } else {
                j3 = Long.parseLong(string);
            }
            c3959f = Integer.valueOf((int) j3);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Integer) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static void m2925L(C1136j0 c1136j0) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Collection collectionValues = f3806d.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C1148m0) obj).f3785c.equals("external_wechat_apk")) {
                arrayList.add(obj);
            }
        }
        for (C1148m0 c1148m0 : AbstractC4166m.m8402K1(arrayList, new C1167r(3))) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", c1148m0.f3784b);
            jSONObject.put("addedAt", c1148m0.f3788f);
            jSONArray.put(jSONObject);
        }
        AbstractC4302b.m8640c(c1136j0.f3728g, "Hchat_agent_reverse_targets").edit().putString("targets_v1", jSONArray.toString()).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M */
    public static String m2926M(String str) {
        switch (str.hashCode()) {
            case -2038529043:
                return !str.equals("find_resource_values") ? "查询 Dex 索引" : "解析 APK 资源";
            case -1973125623:
                return !str.equals("get_resource_value") ? "查询 Dex 索引" : "解析 APK 资源";
            case -1893280047:
                return !str.equals("export_method_smali") ? "查询 Dex 索引" : "导出 Smali";
            case -1326346764:
                return !str.equals("export_class_java") ? "查询 Dex 索引" : "反编译 Java";
            case -1208423866:
                return !str.equals("decode_xml") ? "查询 Dex 索引" : "解析 APK 资源";
            case -472994452:
                return !str.equals("inspect_method") ? "查询 Dex 索引" : "检查 Dex 结构";
            case -453892995:
                return !str.equals("open_target_session") ? "查询 Dex 索引" : "打开 APK 逆向目标";
            case 130625071:
                return !str.equals("manifest") ? "查询 Dex 索引" : "解析 Manifest";
            case 806981517:
                return !str.equals("inspect_class") ? "查询 Dex 索引" : "检查 Dex 结构";
            case 1324120757:
                return !str.equals("export_method_java") ? "查询 Dex 索引" : "反编译 Java";
            case 1345984895:
                return !str.equals("list_res") ? "查询 Dex 索引" : "解析 APK 资源";
            case 1804330875:
                return !str.equals("read_tool_result") ? "查询 Dex 索引" : "读取结果分页";
            case 1841572722:
                return !str.equals("export_class_smali") ? "查询 Dex 索引" : "导出 Smali";
            case 1899852832:
                return !str.equals("compare_methods_using_strings") ? "查询 Dex 索引" : "横向查询多个微信版本";
            default:
                return "查询 Dex 索引";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static Set m2927N(JSONObject jSONObject, List list, List list2, List list3) {
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(m2943b0("fields", jSONObject)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM8407P1) {
            if (!list.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            C2104o.m5291q("fields 包含不支持的值: ".concat(AbstractC4166m.m8392A1(arrayList, null, null, null, null, 63)));
            return null;
        }
        if (!listM8407P1.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            AbstractC4166m.m8405N1(listM8407P1, linkedHashSet);
            return linkedHashSet;
        }
        if (jSONObject.optBoolean("brief", false)) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            AbstractC4166m.m8405N1(list2, linkedHashSet2);
            return linkedHashSet2;
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        AbstractC4166m.m8405N1(list3, linkedHashSet3);
        return linkedHashSet3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m2928O(C1136j0 c1136j0) throws JSONException {
        LinkedHashMap linkedHashMap = f3806d;
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((C1148m0) obj).f3785c.equals("external_wechat_apk")) {
                arrayList.add(obj);
            }
        }
        List listM8402K1 = AbstractC4166m.m8402K1(arrayList, new C1167r(4));
        for (C1148m0 c1148m0 : AbstractC4166m.m8420r1(16, listM8402K1)) {
            linkedHashMap.remove(c1148m0.f3783a);
            C1136j0 c1136j02 = f3807e;
            if (AbstractC1416l.m3825a(c1136j02 != null ? c1136j02.f3731j : null, c1148m0.f3783a)) {
                C1136j0 c1136j03 = f3807e;
                if (c1136j03 != null) {
                    c1136j03.close();
                }
                f3807e = null;
            }
        }
        if (listM8402K1.size() > 16) {
            m2925L(c1136j0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static void m2929P(JSONObject jSONObject, Set set, String str, Object obj) throws JSONException {
        if (set.contains(str)) {
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put(str, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static C1136j0 m2930Q(C1136j0 c1136j0, String str) {
        String str2 = c1136j0.f3731j;
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            string = str2;
        }
        if (string.equals(str2)) {
            return c1136j0;
        }
        C1148m0 c1148m0 = (C1148m0) f3806d.get(string);
        if (c1148m0 == null) {
            C2104o.m5294t("没有找到目标会话: ".concat(string));
            return null;
        }
        String str3 = c1148m0.f3784b;
        File file = new File(str3);
        if (!file.isFile() || file.length() != c1148m0.f3786d || file.lastModified() != c1148m0.f3787e) {
            C2104o.m5276A("目标 APK 已移动或发生变化，请使用 open_target_session(input) 重新打开");
            return null;
        }
        C1136j0 c1136j02 = f3807e;
        if (c1136j02 != null) {
            if (!(c1136j02.f3731j.equals(string) && c1136j02.f3729h.isValid())) {
                c1136j02 = null;
            }
            if (c1136j02 != null) {
                return c1136j02;
            }
        }
        C1136j0 c1136j03 = f3807e;
        if (c1136j03 != null) {
            c1136j03.close();
        }
        f3807e = null;
        C0312a c0312a = DexKitBridge.Companion;
        String path = file.getPath();
        path.getClass();
        c0312a.getClass();
        DexKitBridge dexKitBridge = new DexKitBridge(path, (AbstractC1411g) null);
        if (dexKitBridge.isValid()) {
            C1136j0 c1136j04 = new C1136j0(c1136j0.f3728g, dexKitBridge, str3, c1148m0.f3783a, c1148m0.f3785c, HttpUrl.FRAGMENT_ENCODE_SET, true);
            f3807e = c1136j04;
            return c1136j04;
        }
        dexKitBridge.close();
        C2104o.m5276A(AbstractC4855en.m9263g("DexKit 无法打开目标 APK: ", file.getName()));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static List m2931R(C4135b c4135b) {
        return AbstractC3015m.m6418b0(AbstractC3015m.m6409S(new C3011i(AbstractC3015m.m6414X(AbstractC3015m.m6408R(c4135b.m8324d(true)), new C1124g0(1)), true, new C1124g0(2))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: S */
    public static JSONObject m2932S(C1136j0 c1136j0, C4135b c4135b, C1144l0 c1144l0, Set set) throws JSONException {
        String str;
        Set<String> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            str = null;
        } else {
            for (String str2 : set2) {
                if (AbstractC1416l.m3825a(str2, "filePath") || AbstractC1416l.m3825a(str2, "sourceEntry") || AbstractC1416l.m3825a(str2, "resolution")) {
                    str = (String) ((HashMap) c1136j0.f3739r.getValue()).get(Integer.valueOf(c4135b.f13628g));
                    break;
                }
            }
            str = null;
        }
        JSONObject jSONObject = new JSONObject();
        m2929P(jSONObject, set, "resourceId", AbstractC5999a.m10748k(c4135b.f13628g, 8));
        m2929P(jSONObject, set, "type", c4135b.m8323c());
        m2929P(jSONObject, set, "name", c4135b.m8322b());
        if (c1144l0 != null) {
            m2929P(jSONObject, set, "value", c1144l0.f3773a);
            m2929P(jSONObject, set, "qualifiers", c1144l0.f3774b);
            m2929P(jSONObject, set, "default", Boolean.valueOf(c1144l0.f3775c));
        }
        m2929P(jSONObject, set, "filePath", str != null ? str : JSONObject.NULL);
        m2929P(jSONObject, set, "sourcePath", c1136j0.f3730i);
        m2929P(jSONObject, set, "sourceEntry", str != null ? str : JSONObject.NULL);
        m2929P(jSONObject, set, "resolution", str != null ? "table-backed" : c4135b.m8324d(true).hasNext() ? "table-value" : c4135b.m8322b() != null ? "table-hole" : "unresolved");
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static String m2933T(ArrayList arrayList, int i9, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("offset", 0);
        if (iOptInt < 0) {
            iOptInt = 0;
        }
        int iM2915B = m2915B(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("total", i9);
        jSONObject2.put("offset", iOptInt);
        jSONObject2.put("limit", iM2915B);
        jSONObject2.put("hasMore", arrayList.size() + iOptInt < i9);
        jSONObject2.put("items", new JSONArray((Collection) arrayList));
        String string = jSONObject2.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static JSONObject m2934U() {
        return m2914A("本次最多返回的候选数量", 30, 1, 100);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static JSONObject m2935V() {
        return m2914A("候选或文本的起始偏移", 0, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static boolean m2936W(File file, File file2) {
        Object c3959f;
        try {
            c3959f = Boolean.valueOf(AbstractC1416l.m3825a(file.getCanonicalPath(), file2.getCanonicalPath()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object objValueOf = Boolean.valueOf(AbstractC1416l.m3825a(file.getPath(), file2.getPath()));
        if (c3959f instanceof C3959f) {
            c3959f = objValueOf;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static JSONObject m2937X(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        int iOptInt = jSONObject2.optInt("offset", 0);
        jSONObject2.put("offset", iOptInt >= 0 ? iOptInt : 0);
        jSONObject2.put("max_chars", AbstractC3754e0.m7909r(jSONObject2.optInt("max_chars", C4143c.DEFAULT_HZ), 1000, 48000));
        return jSONObject2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static JSONObject m2938Y(String str, List list, boolean z9) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("type", "array", "description", str);
        if (z9) {
            jSONObjectM9268l.put("minItems", 1);
        }
        JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("type", "string");
        if (!list.isEmpty()) {
            jSONObjectM9267k.put("enum", new JSONArray((Collection) list));
        }
        jSONObjectM9268l.put("items", jSONObjectM9267k);
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ JSONObject m2939Z(String str) {
        return m2938Y(str, C4173t.f13710g, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static JSONObject m2940a(ActivityInfo activityInfo) throws JSONException {
        JSONObject jSONObjectM2956j = m2956j(activityInfo);
        Object obj = activityInfo.permission;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObjectM2956j.put("permission", obj);
        String str = activityInfo.targetActivity;
        if (str != null && !AbstractC3149m.m6721t0(str)) {
            jSONObjectM2956j.put("targetActivity", activityInfo.targetActivity);
        }
        jSONObjectM2956j.put("metaData", m2950f(activityInfo.metaData));
        return jSONObjectM2956j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static JSONObject m2941a0(String str) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("type", "string", "description", str);
        jSONObjectM9268l.put("minLength", 1);
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static JSONObject m2942b(C1716a c1716a) throws JSONException {
        String str;
        String str2;
        Object string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("typeName", ((C2567a) c1716a.f5707k.getValue()).f8327g);
        jSONObject.put("typeDescriptor", c1716a.f5704h);
        int i9 = c1716a.f5705i;
        if (i9 == 0) {
            str = "UNKNOWN";
        } else if (i9 == 1) {
            str = "Build";
        } else if (i9 == 2) {
            str = "Runtime";
        } else {
            if (i9 != 3) {
                throw null;
            }
            str = "System";
        }
        jSONObject.put("visibility", str);
        ArrayList<C1717b> arrayList = c1716a.f5706j;
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
        for (C1717b c1717b : arrayList) {
            JSONObject jSONObject2 = new JSONObject();
            String str3 = c1717b.f5708h;
            C1719d c1719d = c1717b.f5709i;
            jSONObject2.put("name", str3);
            switch (c1719d.f5712b) {
                case 1:
                    str2 = "ByteValue";
                    break;
                case 2:
                    str2 = "ShortValue";
                    break;
                case 3:
                    str2 = "CharValue";
                    break;
                case 4:
                    str2 = "IntValue";
                    break;
                case 5:
                    str2 = "LongValue";
                    break;
                case 6:
                    str2 = "FloatValue";
                    break;
                case 7:
                    str2 = "DoubleValue";
                    break;
                case 8:
                    str2 = "StringValue";
                    break;
                case 9:
                    str2 = "TypeValue";
                    break;
                case 10:
                    str2 = "MethodValue";
                    break;
                case 11:
                    str2 = "EnumValue";
                    break;
                case 12:
                    str2 = "ArrayValue";
                    break;
                case 13:
                    str2 = "AnnotationValue";
                    break;
                case 14:
                    str2 = "NullValue";
                    break;
                case 15:
                    str2 = "BoolValue";
                    break;
                default:
                    throw null;
            }
            jSONObject2.put("type", str2);
            Object obj = c1719d.f5711a;
            if (obj == null || (string = obj.toString()) == null) {
                string = JSONObject.NULL;
            }
            jSONObject2.put("value", string);
            arrayList2.add(jSONObject2);
        }
        jSONObject.put("elements", new JSONArray((Collection) arrayList2));
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static List m2943b0(String str, JSONObject jSONObject) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null) {
            return C4173t.f13710g;
        }
        if (!(objOpt instanceof JSONArray)) {
            List listM6691F0 = AbstractC3149m.m6691F0(objOpt.toString(), new char[]{',', '\n'}, 6);
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
            Iterator it = listM6691F0.iterator();
            while (it.hasNext()) {
                AbstractC2091b.m5171r((String) it.next(), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!AbstractC3149m.m6721t0((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        JSONArray jSONArray = (JSONArray) objOpt;
        C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, jSONArray.length());
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = c2564dM7910r0.iterator();
        while (true) {
            C2563c c2563c = (C2563c) it2;
            if (!c2563c.f8317i) {
                return arrayList3;
            }
            String strOptString = jSONArray.optString(((Number) c2563c.next()).intValue());
            strOptString.getClass();
            String string = AbstractC3149m.m6703R0(strOptString).toString();
            if (AbstractC3149m.m6721t0(string)) {
                string = null;
            }
            if (string != null) {
                arrayList3.add(string);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static PackageInfo m2944c(Context context, String str, int i9) {
        Object c3959f;
        try {
            c3959f = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageArchiveInfo(str, PackageManager.PackageInfoFlags.of(i9)) : context.getPackageManager().getPackageArchiveInfo(str, i9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        return (PackageInfo) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static String m2945c0(File file) throws NoSuchAlgorithmException {
        String str = file.getPath() + "\u0000" + file.length() + "\u0000" + file.lastModified();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        return "hchat-local-".concat(AbstractC3149m.m6701P0(24, AbstractC4165l.m8368E0(bArrDigest, new C1124g0(0))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2946d(C1136j0 c1136j0, String str) {
        Object c3959f;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("session_id", c1136j0.f3731j);
            jSONObject.put("sourcePath", c1136j0.f3730i);
            jSONObject.put("targetKind", c1136j0.f3732k);
            c3959f = jSONObject.toString();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = str;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject m2947d0(C1136j0 c1136j0, C1148m0 c1148m0) throws JSONException {
        boolean z9;
        Context context = c1136j0.f3728g;
        String str = c1148m0.f3784b;
        PackageInfo packageInfoM2944c = m2944c(context, str, 128);
        JSONObject jSONObject = new JSONObject();
        String str2 = c1148m0.f3783a;
        jSONObject.put("session_id", str2);
        jSONObject.put("input", str);
        jSONObject.put("sourcePath", str);
        String str3 = c1148m0.f3785c;
        jSONObject.put("kind", str3);
        String str4 = c1136j0.f3731j;
        jSONObject.put("default", str2.equals(str4));
        if (str2.equals(str4)) {
            z9 = true;
        } else {
            C1136j0 c1136j02 = f3807e;
            if (!AbstractC1416l.m3825a(c1136j02 != null ? c1136j02.f3731j : null, str2)) {
                z9 = false;
            }
        }
        jSONObject.put("loaded", z9);
        jSONObject.put("fileName", new File(str).getName());
        jSONObject.put("fileSize", c1148m0.f3786d);
        jSONObject.put("lastModified", c1148m0.f3787e);
        String str5 = packageInfoM2944c != null ? packageInfoM2944c.packageName : null;
        String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str5 == null) {
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONObject.put("packageName", str5);
        String str7 = packageInfoM2944c != null ? packageInfoM2944c.versionName : null;
        if (str7 != null) {
            str6 = str7;
        }
        jSONObject.put("versionName", str6);
        jSONObject.put("versionCode", packageInfoM2944c != null ? packageInfoM2944c.getLongVersionCode() : 0L);
        if (str3.equals("current_wechat_apk")) {
            jSONObject.put("classLoader", c1136j0.f3733l);
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static JSONObject m2948e(String str, boolean z9) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("type", "boolean", "description", str);
        jSONObjectM9268l.put("default", z9);
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static void m2949e0(JSONArray jSONArray, String str, String str2, Map map, List list, List list2) throws JSONException {
        String strM2922I = m2922I(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (!f3823u.contains(strM2922I) && !strM2922I.equals("read_tool_result")) {
            linkedHashMap.putIfAbsent("session_id", m2941a0("可选目标 session_id；省略时查询当前运行微信 APK"));
        }
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("name", str, "description", str2);
        JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("type", "object");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), (JSONObject) entry.getValue());
        }
        jSONObjectM9267k.put("properties", jSONObject);
        if (!list.isEmpty()) {
            jSONObjectM9267k.put("required", new JSONArray((Collection) list));
        }
        if (!list2.isEmpty()) {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new JSONObject().put("required", new JSONArray((Collection) it.next())));
            }
            jSONObjectM9267k.put("anyOf", new JSONArray((Collection) arrayList));
        }
        jSONObjectM9267k.put("additionalProperties", false);
        jSONObjectM9268l.put("inputSchema", jSONObjectM9267k);
        jSONArray.put(jSONObjectM9268l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static JSONObject m2950f(Bundle bundle) throws JSONException {
        Set<String> setKeySet;
        Object string;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : AbstractC4166m.m8401J1(setKeySet)) {
                Object obj = bundle.get(str);
                if (obj == null || (string = obj.toString()) == null) {
                    string = JSONObject.NULL;
                }
                jSONObject.put(str, string);
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m2951f0(JSONArray jSONArray, String str, String str2, LinkedHashMap linkedHashMap, List list, List list2, int i9) throws JSONException {
        List list3;
        JSONArray jSONArray2;
        String str3;
        String str4;
        Map map = linkedHashMap;
        if ((i9 & 8) != 0) {
            map = C4174u.f13711g;
        }
        Map map2 = map;
        int i10 = i9 & 16;
        C4173t c4173t = C4173t.f13710g;
        List list4 = i10 != 0 ? c4173t : list;
        if ((i9 & 32) != 0) {
            list3 = c4173t;
            str3 = str;
            str4 = str2;
            jSONArray2 = jSONArray;
        } else {
            list3 = list2;
            jSONArray2 = jSONArray;
            str3 = str;
            str4 = str2;
        }
        m2949e0(jSONArray2, str3, str4, map2, list4, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019a A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a8 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b6 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0170 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018c A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:29:0x0074, B:30:0x007f, B:52:0x00ca, B:53:0x00dd, B:113:0x01be, B:115:0x01cb, B:117:0x01d4, B:55:0x00e2, B:58:0x00ec, B:59:0x00f2, B:62:0x00fc, B:63:0x0102, B:66:0x010c, B:67:0x0112, B:70:0x011c, B:71:0x0122, B:74:0x012c, B:75:0x0132, B:78:0x013c, B:79:0x0142, B:82:0x014c, B:83:0x0152, B:86:0x015c, B:87:0x0162, B:90:0x016b, B:91:0x0170, B:94:0x0179, B:95:0x017e, B:98:0x0187, B:99:0x018c, B:102:0x0195, B:103:0x019a, B:106:0x01a3, B:107:0x01a8, B:110:0x01b1, B:111:0x01b6, B:114:0x01c7, B:32:0x0083, B:35:0x008c, B:38:0x0095, B:41:0x009e, B:42:0x00a4, B:45:0x00ad, B:46:0x00b3, B:49:0x00bc, B:50:0x00c2, B:116:0x01d0), top: B:140:0x0074, outer: #2 }] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m2952g(String str, JSONObject jSONObject, C1103b c1103b, InterfaceC1231l interfaceC1231l, Context context, ArrayList arrayList) throws Throwable {
        Object c3959f;
        Object c3959f2;
        String strM2969w;
        String strM2922I = m2922I(str);
        if (strM2922I.equals("read_tool_result")) {
            try {
                c1103b.m2828d();
                interfaceC1231l.invoke(m2926M(strM2922I));
                c3959f = AbstractC3754e0.m7885d0(context, jSONObject);
                c1103b.m2828d();
                interfaceC1231l.invoke("整理逆向结果");
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                if (c1103b.m2826b(thM8182b)) {
                    throw thM8182b;
                }
                String message = thM8182b.getMessage();
                if (message == null) {
                    message = thM8182b.getClass().getSimpleName();
                }
                c3959f = m2958l(message);
            }
            return (String) c3959f;
        }
        C1136j0 c1136j0 = (C1136j0) f3804b.get();
        if (c1136j0 == null) {
            return m2958l("内置逆向工具尚未绑定到微信运行时");
        }
        if (!f3803a.contains(strM2922I)) {
            return m2958l("未知的内置逆向工具: ".concat(str));
        }
        try {
            c1103b.m2828d();
            synchronized (f3805c) {
                try {
                    interfaceC1231l.invoke(m2926M(strM2922I));
                    switch (strM2922I.hashCode()) {
                        case -970958065:
                            if (!strM2922I.equals("close_target_session")) {
                                String strOptString = jSONObject.optString("session_id", HttpUrl.FRAGMENT_ENCODE_SET);
                                strOptString.getClass();
                                C1136j0 c1136j0M2930Q = m2930Q(c1136j0, strOptString);
                                switch (strM2922I.hashCode()) {
                                    case -2038529043:
                                        strM2969w = !strM2922I.equals("find_resource_values") ? m2958l("未知的内置逆向工具: ".concat(str)) : m2968v(c1136j0M2930Q, jSONObject);
                                        break;
                                    case -1973125623:
                                        if (strM2922I.equals("get_resource_value")) {
                                            strM2969w = m2969w(c1136j0M2930Q, jSONObject);
                                        }
                                        break;
                                    case -1893280047:
                                        if (strM2922I.equals("export_method_smali")) {
                                            strM2969w = m2962p(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case -1538578584:
                                        if (strM2922I.equals("find_classes_using_strings")) {
                                            strM2969w = m2964r(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case -1326346764:
                                        if (strM2922I.equals("export_class_java")) {
                                            strM2969w = m2959m(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case -1208423866:
                                        if (strM2922I.equals("decode_xml")) {
                                            strM2969w = m2957k(c1136j0M2930Q, jSONObject);
                                        }
                                        break;
                                    case -899473620:
                                        if (strM2922I.equals("find_methods")) {
                                            strM2969w = m2965s(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case -472994452:
                                        if (strM2922I.equals("inspect_method")) {
                                            strM2969w = m2972z(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case 130625071:
                                        if (strM2922I.equals("manifest")) {
                                            strM2969w = m2919F(c1136j0M2930Q, jSONObject);
                                        }
                                        break;
                                    case 806981517:
                                        if (strM2922I.equals("inspect_class")) {
                                            strM2969w = m2971y(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case 1183956700:
                                        if (strM2922I.equals("find_methods_using_resource")) {
                                            strM2969w = m2966t(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case 1324120757:
                                        if (strM2922I.equals("export_method_java")) {
                                            strM2969w = m2961o(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case 1345984895:
                                        if (strM2922I.equals("list_res")) {
                                            strM2969w = m2916C(c1136j0M2930Q, jSONObject);
                                        }
                                        break;
                                    case 1841572722:
                                        if (strM2922I.equals("export_class_smali")) {
                                            strM2969w = m2960n(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    case 2046760436:
                                        if (strM2922I.equals("find_methods_using_strings")) {
                                            strM2969w = m2967u(c1136j0M2930Q, jSONObject, c1103b);
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                c3959f2 = m2946d(c1136j0M2930Q, strM2969w);
                            } else {
                                c3959f2 = m2954h(c1136j0, jSONObject);
                            }
                            break;
                        case -453892995:
                            if (!strM2922I.equals("open_target_session")) {
                                String strOptString2 = jSONObject.optString("session_id", HttpUrl.FRAGMENT_ENCODE_SET);
                                strOptString2.getClass();
                                C1136j0 c1136j0M2930Q2 = m2930Q(c1136j0, strOptString2);
                                switch (strM2922I.hashCode()) {
                                    case -2038529043:
                                        break;
                                    case -1973125623:
                                        break;
                                    case -1893280047:
                                        break;
                                    case -1538578584:
                                        break;
                                    case -1326346764:
                                        break;
                                    case -1208423866:
                                        break;
                                    case -899473620:
                                        break;
                                    case -472994452:
                                        break;
                                    case 130625071:
                                        break;
                                    case 806981517:
                                        break;
                                    case 1183956700:
                                        break;
                                    case 1324120757:
                                        break;
                                    case 1345984895:
                                        break;
                                    case 1841572722:
                                        break;
                                    case 2046760436:
                                        break;
                                }
                                c3959f2 = m2946d(c1136j0M2930Q2, strM2969w);
                            } else {
                                c3959f2 = m2923J(c1136j0, jSONObject, arrayList);
                            }
                            break;
                        case 112840170:
                            if (!strM2922I.equals("list_target_sessions")) {
                                String strOptString22 = jSONObject.optString("session_id", HttpUrl.FRAGMENT_ENCODE_SET);
                                strOptString22.getClass();
                                C1136j0 c1136j0M2930Q22 = m2930Q(c1136j0, strOptString22);
                                switch (strM2922I.hashCode()) {
                                    case -2038529043:
                                        break;
                                    case -1973125623:
                                        break;
                                    case -1893280047:
                                        break;
                                    case -1538578584:
                                        break;
                                    case -1326346764:
                                        break;
                                    case -1208423866:
                                        break;
                                    case -899473620:
                                        break;
                                    case -472994452:
                                        break;
                                    case 130625071:
                                        break;
                                    case 806981517:
                                        break;
                                    case 1183956700:
                                        break;
                                    case 1324120757:
                                        break;
                                    case 1345984895:
                                        break;
                                    case 1841572722:
                                        break;
                                    case 2046760436:
                                        break;
                                }
                                c3959f2 = m2946d(c1136j0M2930Q22, strM2969w);
                            } else {
                                c3959f2 = m2917D(c1136j0);
                            }
                            break;
                        case 408682993:
                            if (!strM2922I.equals("get_target_session")) {
                                String strOptString222 = jSONObject.optString("session_id", HttpUrl.FRAGMENT_ENCODE_SET);
                                strOptString222.getClass();
                                C1136j0 c1136j0M2930Q222 = m2930Q(c1136j0, strOptString222);
                                switch (strM2922I.hashCode()) {
                                    case -2038529043:
                                        break;
                                    case -1973125623:
                                        break;
                                    case -1893280047:
                                        break;
                                    case -1538578584:
                                        break;
                                    case -1326346764:
                                        break;
                                    case -1208423866:
                                        break;
                                    case -899473620:
                                        break;
                                    case -472994452:
                                        break;
                                    case 130625071:
                                        break;
                                    case 806981517:
                                        break;
                                    case 1183956700:
                                        break;
                                    case 1324120757:
                                        break;
                                    case 1345984895:
                                        break;
                                    case 1841572722:
                                        break;
                                    case 2046760436:
                                        break;
                                }
                                c3959f2 = m2946d(c1136j0M2930Q222, strM2969w);
                            } else {
                                c3959f2 = m2970x(c1136j0, jSONObject);
                            }
                            break;
                        case 1899852832:
                            if (!strM2922I.equals("compare_methods_using_strings")) {
                                String strOptString2222 = jSONObject.optString("session_id", HttpUrl.FRAGMENT_ENCODE_SET);
                                strOptString2222.getClass();
                                C1136j0 c1136j0M2930Q2222 = m2930Q(c1136j0, strOptString2222);
                                switch (strM2922I.hashCode()) {
                                    case -2038529043:
                                        break;
                                    case -1973125623:
                                        break;
                                    case -1893280047:
                                        break;
                                    case -1538578584:
                                        break;
                                    case -1326346764:
                                        break;
                                    case -1208423866:
                                        break;
                                    case -899473620:
                                        break;
                                    case -472994452:
                                        break;
                                    case 130625071:
                                        break;
                                    case 806981517:
                                        break;
                                    case 1183956700:
                                        break;
                                    case 1324120757:
                                        break;
                                    case 1345984895:
                                        break;
                                    case 1841572722:
                                        break;
                                    case 2046760436:
                                        break;
                                }
                                c3959f2 = m2946d(c1136j0M2930Q2222, strM2969w);
                            } else {
                                c3959f2 = m2955i(c1136j0, jSONObject, c1103b);
                            }
                            break;
                        default:
                            String strOptString22222 = jSONObject.optString("session_id", HttpUrl.FRAGMENT_ENCODE_SET);
                            strOptString22222.getClass();
                            C1136j0 c1136j0M2930Q22222 = m2930Q(c1136j0, strOptString22222);
                            switch (strM2922I.hashCode()) {
                                case -2038529043:
                                    break;
                                case -1973125623:
                                    break;
                                case -1893280047:
                                    break;
                                case -1538578584:
                                    break;
                                case -1326346764:
                                    break;
                                case -1208423866:
                                    break;
                                case -899473620:
                                    break;
                                case -472994452:
                                    break;
                                case 130625071:
                                    break;
                                case 806981517:
                                    break;
                                case 1183956700:
                                    break;
                                case 1324120757:
                                    break;
                                case 1345984895:
                                    break;
                                case 1841572722:
                                    break;
                                case 2046760436:
                                    break;
                            }
                            c3959f2 = m2946d(c1136j0M2930Q22222, strM2969w);
                            break;
                    }
                    c1103b.m2828d();
                    interfaceC1231l.invoke("整理逆向结果");
                } finally {
                }
            }
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
        if (thM8182b2 != null) {
            if (c1103b.m2826b(thM8182b2)) {
                throw thM8182b2;
            }
            String message2 = thM8182b2.getMessage();
            if (message2 == null) {
                message2 = thM8182b2.getClass().getSimpleName();
            }
            c3959f2 = m2958l("内置逆向工具执行失败: ".concat(message2));
        }
        return (String) c3959f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static final String m2953g0() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        m2951f0(jSONArray, "hchat.reverse.open_target_session", "注册并打开指定微信 APK，或在省略参数时返回当前运行微信目标；返回的 session_id 仅用于后续查询工具", AbstractC4178y.m8437Z(new C3958e("input", m2941a0("可选的微信 APK 绝对路径；只传此参数，省略时使用当前运行微信"))), null, null, 48);
        m2951f0(jSONArray, "hchat.reverse.list_target_sessions", "列出当前微信和已注册的外部微信 APK 目标", null, null, null, 56);
        m2951f0(jSONArray, "hchat.reverse.get_target_session", "读取一个目标会话的路径、微信版本和当前加载状态", AbstractC4178y.m8437Z(new C3958e("session_id", m2941a0("list_target_sessions 返回的 session_id"))), AbstractC0000a.m99x0("session_id"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.close_target_session", "关闭并取消注册一个外部 APK 目标；不会删除原 APK 文件", AbstractC4178y.m8437Z(new C3958e("session_id", m2941a0("要关闭的外部目标 session_id"))), AbstractC0000a.m99x0("session_id"), null, 32);
        m2949e0(jSONArray, "hchat.reverse.compare_methods_using_strings", "在多个微信 APK 中使用同一组字符串锚点定位方法，返回各版本候选以便横向比较", AbstractC4178y.m8437Z(new C3958e("session_ids", m2939Z("至少两个目标 session_id")), new C3958e("contains_all_strings", m2939Z("候选方法必须同时使用的全部字符串")), new C3958e("contains_any_strings", m2939Z("候选方法使用任意一个即可命中的字符串")), new C3958e("limit", m2914A("每个目标最多返回的候选数量", 30, 1, 100))), AbstractC0000a.m99x0("session_ids"), AbstractC0000a.m101y0(AbstractC0000a.m99x0("contains_all_strings"), AbstractC0000a.m99x0("contains_any_strings")));
        m2951f0(jSONArray, "hchat.reverse.find_classes_using_strings", "按字符串常量锚点定位类候选，先用独特字符串缩小范围", AbstractC4178y.m8437Z(new C3958e("contains_all_strings", m2939Z("候选类必须同时使用的全部字符串")), new C3958e("contains_any_strings", m2939Z("候选类使用任意一个即可命中的字符串")), new C3958e("brief", m2948e("只返回继续定位所需的紧凑字段", false)), new C3958e("fields", m2938Y("需要返回的字段", f3808f, false)), new C3958e("limit", m2934U()), new C3958e("offset", m2935V())), null, AbstractC0000a.m101y0(AbstractC0000a.m99x0("contains_all_strings"), AbstractC0000a.m99x0("contains_any_strings")), 16);
        C3958e c3958e = new C3958e("contains_all_strings", m2939Z("候选方法必须同时使用的全部字符串"));
        C3958e c3958e2 = new C3958e("contains_any_strings", m2939Z("候选方法使用任意一个即可命中的字符串"));
        C3958e c3958e3 = new C3958e("brief", m2948e("只返回 descriptor 和 Dex 来源", false));
        List list = f3811i;
        m2951f0(jSONArray, "hchat.reverse.find_methods_using_strings", "按字符串常量锚点定位方法候选，返回可继续检查的完整 descriptor", AbstractC4178y.m8437Z(c3958e, c3958e2, c3958e3, new C3958e("fields", m2938Y("需要返回的字段", list, false)), new C3958e("limit", m2934U()), new C3958e("offset", m2935V())), null, AbstractC0000a.m101y0(AbstractC0000a.m99x0("contains_all_strings"), AbstractC0000a.m99x0("contains_any_strings")), 16);
        List listM101y0 = AbstractC0000a.m101y0("string", "integer", "bool", "color");
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("type", "string", "description", "资源类型");
        jSONObjectM9268l.put("enum", new JSONArray((Collection) listM101y0));
        m2951f0(jSONArray, "hchat.reverse.find_resource_values", "按 APK resources.arsc 中的资源值定位字符串、整数、布尔值或颜色；界面文本必须优先使用此工具，不要拿资源文本做 DEX 字符串检索", AbstractC4178y.m8437Z(new C3958e("type", jSONObjectM9268l), new C3958e("value", m2941a0("要查找的资源值")), new C3958e("contains", m2948e("字符串是否使用包含匹配；默认 true", true)), new C3958e("ignore_case", m2948e("字符串匹配是否忽略大小写", false)), new C3958e("brief", m2948e("只返回资源 ID、类型和名称", false)), new C3958e("fields", m2938Y("需要返回的字段", f3815m, false)), new C3958e("limit", m2934U()), new C3958e("offset", m2935V())), AbstractC0000a.m101y0("type", "value"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.get_resource_value", "按资源 ID 或资源类型/名称读取 resources.arsc 中的全部配置值", AbstractC4178y.m8437Z(new C3958e("resource_id", m2941a0("资源 ID，例如 0x7f111663")), new C3958e("type", m2941a0("资源类型，例如 string")), new C3958e("name", m2941a0("资源名称，例如 cfs"))), null, AbstractC0000a.m101y0(AbstractC0000a.m99x0("resource_id"), AbstractC0000a.m101y0("type", "name")), 16);
        m2951f0(jSONArray, "hchat.reverse.find_methods_using_resource", "按资源 ID 定位直接使用该常量的方法；先用资源值检索取得 resource_id", AbstractC4178y.m8437Z(new C3958e("resource_id", m2941a0("资源 ID，例如 0x7f111663")), new C3958e("brief", m2948e("只返回 descriptor 和 Dex 来源", false)), new C3958e("fields", m2938Y("需要返回的字段", list, false)), new C3958e("limit", m2934U()), new C3958e("offset", m2935V())), AbstractC0000a.m99x0("resource_id"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.list_res", "列出当前 APK 的资源表条目；可按资源类型过滤", AbstractC4178y.m8437Z(new C3958e("type", m2941a0("可选资源类型，例如 string、layout、drawable")), new C3958e("brief", m2948e("只返回资源 ID、类型和名称", false)), new C3958e("fields", m2938Y("需要返回的字段", f3814l, false)), new C3958e("limit", m2934U()), new C3958e("offset", m2935V())), null, null, 48);
        m2951f0(jSONArray, "hchat.reverse.decode_xml", "解码 APK 内的二进制 XML，例如 AndroidManifest.xml 或 res/layout/*.xml；truncated=true 时按 nextOffset 续读", AbstractC4178y.m8437Z(new C3958e("path", m2941a0("APK 内路径，例如 AndroidManifest.xml 或 res/layout/main.xml")), new C3958e("offset", m2914A("XML 字符偏移，续读时使用上次返回的 nextOffset", 0, 0, null)), new C3958e("max_chars", m2914A("本次最多返回字符数", C4143c.DEFAULT_HZ, 1000, 48000))), AbstractC0000a.m99x0("path"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.find_methods", "按完整 descriptor 精确定位，或按类名/方法名组合筛选方法", AbstractC4178y.m8437Z(new C3958e("descriptor", m2941a0("完整方法 descriptor，例如 Lpkg/Class;->name(I)Z；填写时精确查询")), new C3958e("class_name_contains", m2941a0("声明类名包含的文本，可用点分类名或 descriptor 片段")), new C3958e("method_name_contains", m2941a0("方法名包含的文本，区分大小写")), new C3958e("descriptor_contains", m2941a0("在类名/方法名筛选结果上继续过滤 descriptor 的文本")), new C3958e("brief", m2948e("只返回 descriptor 和 Dex 来源", false)), new C3958e("fields", m2938Y("需要返回的字段", list, false)), new C3958e("limit", m2934U()), new C3958e("offset", m2935V())), null, AbstractC0000a.m101y0(AbstractC0000a.m99x0("descriptor"), AbstractC0000a.m99x0("class_name_contains"), AbstractC0000a.m99x0("method_name_contains")), 16);
        m2951f0(jSONArray, "hchat.reverse.inspect_method", "检查一个方法的字符串、字段、opcode，并按需返回一层调用目标或调用者", AbstractC4178y.m8437Z(new C3958e("descriptor", m2941a0("find_methods 返回的完整方法 descriptor")), new C3958e("include", m2938Y("可选证据；省略或传空数组时返回全部证据", AbstractC0000a.m101y0("strings", "using-fields", "invokes", "callers", "annotations", "opcodes"), false)), new C3958e("brief", m2948e("只返回各类证据数量", false))), AbstractC0000a.m99x0("descriptor"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.inspect_class", "列出一个类的父类、接口、字段和方法 descriptor", AbstractC4178y.m8437Z(new C3958e("descriptor", m2941a0("完整类 descriptor，例如 Lpkg/Class;")), new C3958e("class_name", m2941a0("完整点分类名或类 descriptor")), new C3958e("include", m2938Y("可选内容；省略时返回字段和方法，annotations 需显式请求", AbstractC0000a.m101y0("fields", "methods", "annotations"), false)), new C3958e("brief", m2948e("只返回类摘要和内容数量", false)), new C3958e("limit", m2914A("返回的字段和方法各自最大数量", 30, 1, 100))), null, AbstractC0000a.m101y0(AbstractC0000a.m99x0("descriptor"), AbstractC0000a.m99x0("class_name")), 16);
        m2951f0(jSONArray, "hchat.reverse.export_method_java", "按完整方法 descriptor 导出 Java 语义代码；truncated=true 时用 nextOffset 继续读取", AbstractC4178y.m8437Z(new C3958e("descriptor", m2941a0("要导出的完整方法 descriptor")), new C3958e("offset", m2914A("Java 字符偏移，续读时使用上次返回的 nextOffset", 0, 0, null)), new C3958e("max_chars", m2914A("本次最多返回字符数；大方法应分页读取", C4143c.DEFAULT_HZ, 1000, 48000))), AbstractC0000a.m99x0("descriptor"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.export_class_java", "按类 descriptor 或类名导出整类 Java 语义代码；truncated=true 时用 nextOffset 继续读取", AbstractC4178y.m8437Z(new C3958e("descriptor", m2941a0("要导出的完整类 descriptor")), new C3958e("class_name", m2941a0("要导出的完整点分类名")), new C3958e("offset", m2914A("Java 字符偏移，续读时使用上次返回的 nextOffset", 0, 0, null)), new C3958e("max_chars", m2914A("本次最多返回字符数；整类 Java 应分页读取", C4143c.DEFAULT_HZ, 1000, 48000))), null, AbstractC0000a.m101y0(AbstractC0000a.m99x0("descriptor"), AbstractC0000a.m99x0("class_name")), 16);
        m2951f0(jSONArray, "hchat.reverse.export_method_smali", "按完整方法 descriptor 导出 Smali；truncated=true 时用 nextOffset 继续读取", AbstractC4178y.m8437Z(new C3958e("descriptor", m2941a0("要导出的完整方法 descriptor")), new C3958e("offset", m2914A("Smali 字符偏移，续读时使用上次返回的 nextOffset", 0, 0, null)), new C3958e("max_chars", m2914A("本次最多返回字符数；大方法应分页读取", C4143c.DEFAULT_HZ, 1000, 48000))), AbstractC0000a.m99x0("descriptor"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.export_class_smali", "按类 descriptor 或类名导出整类 Smali；truncated=true 时用 nextOffset 继续读取", AbstractC4178y.m8437Z(new C3958e("descriptor", m2941a0("要导出的完整类 descriptor")), new C3958e("class_name", m2941a0("要导出的完整点分类名")), new C3958e("offset", m2914A("Smali 字符偏移，续读时使用上次返回的 nextOffset", 0, 0, null)), new C3958e("max_chars", m2914A("本次最多返回字符数；整类 Smali 应分页读取", C4143c.DEFAULT_HZ, 1000, 48000))), null, AbstractC0000a.m101y0(AbstractC0000a.m99x0("descriptor"), AbstractC0000a.m99x0("class_name")), 16);
        m2951f0(jSONArray, "hchat.reverse.read_tool_result", "按 handle 和字符偏移继续读取被分页保存的任意工具结果", AbstractC4178y.m8437Z(new C3958e("handle", m2941a0("长工具结果返回的 handle")), new C3958e("offset", m2914A("从 nextOffset 指定的位置继续读取", 0, 0, null)), new C3958e("max_chars", m2914A("本次最多返回字符数", C4143c.DEFAULT_HZ, 1000, 48000))), AbstractC0000a.m99x0("handle"), null, 32);
        m2951f0(jSONArray, "hchat.reverse.manifest", "读取目标 APK 的结构化 Manifest；include 省略时保持基础摘要", AbstractC4178y.m8437Z(new C3958e("include", m2938Y("需要展开的 Manifest 分区", f3822t, false))), null, null, 48);
        JSONObject jSONObjectM9268l2 = AbstractC4855en.m9268l("source", "Hchat 内置逆向工具", "instructions", "默认目标是当前微信 APK。分析其它版本时先用 open_target_session(input) 注册 APK，并在后续每次查询中传返回的 session_id；多版本初筛优先使用 compare_methods_using_strings。find/list 首次查询优先 brief=true，确有需要再选择 fields。Java/Smali/XML 按 nextOffset 分页读取。");
        jSONObjectM9268l2.put("tools", jSONArray);
        jSONObjectM9268l2.put("target", "当前微信 APK，可按 session_id 查询已注册的其它微信 APK");
        String string = jSONObjectM9268l2.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m2954h(C1136j0 c1136j0, JSONObject jSONObject) throws JSONException {
        String strM1023l = AbstractC0255e.m1023l("session_id", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            return m2958l("close_target_session 需要 session_id");
        }
        if (strM1023l.equals(c1136j0.f3731j)) {
            return m2958l("当前运行微信目标不能关闭");
        }
        C1148m0 c1148m0 = (C1148m0) f3806d.remove(strM1023l);
        if (c1148m0 == null) {
            return m2958l("没有找到目标会话: ".concat(strM1023l));
        }
        C1136j0 c1136j02 = f3807e;
        if (AbstractC1416l.m3825a(c1136j02 != null ? c1136j02.f3731j : null, strM1023l)) {
            C1136j0 c1136j03 = f3807e;
            if (c1136j03 != null) {
                c1136j03.close();
            }
            f3807e = null;
        }
        m2925L(c1136j0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ok", true);
        jSONObject2.put("session_id", c1148m0.f3783a);
        jSONObject2.put("sourcePath", c1148m0.f3784b);
        jSONObject2.put("message", "外部目标已关闭，原 APK 文件未删除");
        String string = jSONObject2.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m2955i(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) throws JSONException {
        boolean zM2826b;
        int i9;
        C1136j0 c1136j02 = c1136j0;
        JSONObject jSONObject2 = jSONObject;
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(m2943b0("session_ids", jSONObject2)));
        if (listM8407P1.size() < 2) {
            return m2958l("compare_methods_using_strings 至少需要两个 session_id");
        }
        if (listM8407P1.size() > 12) {
            return m2958l("compare_methods_using_strings 一次最多比较 12 个目标");
        }
        List listM2943b0 = m2943b0("contains_all_strings", jSONObject2);
        List listM2943b02 = m2943b0("contains_any_strings", jSONObject2);
        if (listM2943b0.isEmpty() && listM2943b02.isEmpty()) {
            return m2958l("至少提供 contains_all_strings 或 contains_any_strings");
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = listM8407P1.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ok", i10 == 0);
                jSONObject3.put("requested", listM8407P1.size());
                jSONObject3.put("compared", jSONArray.length());
                jSONObject3.put("failed", i10);
                jSONObject3.put("items", jSONArray);
                String string = jSONObject3.toString();
                string.getClass();
                return string;
            }
            String str = (String) it.next();
            c1103b.m2828d();
            C1148m0 c1148m0 = (C1148m0) f3806d.get(str);
            if (c1148m0 == null) {
                i10++;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("session_id", str);
                jSONObject4.put("ok", false);
                jSONObject4.put("error", "没有找到目标会话");
                jSONArray.put(jSONObject4);
            } else {
                JSONObject jSONObjectM2947d0 = m2947d0(c1136j02, c1148m0);
                try {
                    JSONObject jSONObject5 = new JSONObject(m2967u(m2930Q(c1136j02, str), jSONObject2, c1103b));
                    String strOptString = jSONObject5.optString("error", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString.getClass();
                    boolean zOptBoolean = jSONObject5.optBoolean("ok", AbstractC3149m.m6721t0(strOptString));
                    if (!zOptBoolean) {
                        i10++;
                    }
                    jSONObjectM2947d0.put("ok", zOptBoolean);
                    jSONObjectM2947d0.put("total", jSONObject5.optInt("total", 0));
                    jSONObjectM2947d0.put("offset", jSONObject5.optInt("offset", 0));
                    jSONObjectM2947d0.put("limit", jSONObject5.optInt("limit", m2915B(jSONObject)));
                    jSONObjectM2947d0.put("hasMore", jSONObject5.optBoolean("hasMore", false));
                    JSONArray jSONArrayOptJSONArray = jSONObject5.optJSONArray("items");
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                    }
                    jSONObjectM2947d0.put("items", jSONArrayOptJSONArray);
                    String str2 = !AbstractC3149m.m6721t0(strOptString) ? strOptString : null;
                    if (str2 != null) {
                        jSONObjectM2947d0.put("error", str2);
                    }
                } finally {
                    if (zM2826b != i9) {
                    }
                }
                jSONArray.put(jSONObjectM2947d0);
            }
            c1136j02 = c1136j0;
            jSONObject2 = jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static JSONObject m2956j(ComponentInfo componentInfo) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = componentInfo.name;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONObject.put("name", str);
        String str3 = componentInfo.processName;
        if (str3 != null) {
            str2 = str3;
        }
        jSONObject.put("process", str2);
        jSONObject.put("exported", componentInfo.exported);
        jSONObject.put("enabled", componentInfo.enabled);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: k */
    public static String m2957k(C1136j0 c1136j0, JSONObject jSONObject) throws JSONException {
        Object c3959f;
        String strOptString = jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        String strM6686A0 = AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(strOptString).toString(), "/");
        if (AbstractC3149m.m6721t0(strM6686A0)) {
            return m2958l("decode_xml 需要 APK 内路径");
        }
        try {
            Object value = c1136j0.f3737p.getValue();
            value.getClass();
            String string = ((C0020c) value).m274m(strM6686A0).toString();
            string.getClass();
            int iM7909r = AbstractC3754e0.m7909r(jSONObject.optInt("offset", 0), 0, string.length());
            int iM7909r2 = AbstractC3754e0.m7909r(jSONObject.optInt("max_chars", C4143c.DEFAULT_HZ), 1000, 48000) + iM7909r;
            int length = string.length();
            if (iM7909r2 > length) {
                iM7909r2 = length;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("path", strM6686A0);
            jSONObject2.put("sourcePath", c1136j0.f3730i);
            jSONObject2.put("sourceEntry", strM6686A0);
            jSONObject2.put("offset", iM7909r);
            jSONObject2.put("returnedLength", iM7909r2 - iM7909r);
            jSONObject2.put("totalLength", string.length());
            jSONObject2.put("truncated", iM7909r2 < string.length());
            if (iM7909r2 < string.length()) {
                jSONObject2.put("nextOffset", iM7909r2);
            }
            jSONObject2.put("xml", string.substring(iM7909r, iM7909r2));
            c3959f = jSONObject2.toString();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            String message = thM8182b.getMessage();
            if (message == null) {
                message = thM8182b.getClass().getSimpleName();
            }
            c3959f = m2958l("无法解码 XML " + strM6686A0 + ": " + message);
        }
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m2958l(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", str);
        jSONObject.put("ok", false);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m2959m(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) {
        String strOptString = jSONObject.optString("descriptor", jSONObject.optString("class_name", HttpUrl.FRAGMENT_ENCODE_SET));
        strOptString.getClass();
        String string = AbstractC3149m.m6703R0(strOptString).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return m2958l("export_class_java 需要 descriptor 或 class_name");
        }
        C1112d0 c1112d0 = c1136j0.f3736o;
        c1112d0.getClass();
        C1137j1 c1137j1M2910g = c1112d0.f3635b.m2910g(string, c1103b);
        return c1112d0.m2847a(c1137j1M2910g.f3740a, c1137j1M2910g.f3741b, C1112d0.m2846b(c1137j1M2910g, c1103b, new C0837h(28)), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m2960n(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) throws JSONException, IOException {
        JSONObject jSONObject2;
        String str;
        C2263n c2263n;
        String str2;
        C0184c c0184c;
        StringWriter stringWriter;
        HashSet hashSet;
        C2264o c2264o;
        boolean z9;
        C1145l1 c1145l1;
        Iterable c2255g;
        C1133i1 c1133i1;
        HashSet hashSet2;
        String str3;
        String str4;
        boolean z10;
        Iterable c2258i;
        String str5;
        HashSet hashSet3;
        C0826a c0826aM820q;
        C0826a c0826aM820q2;
        String str6;
        Iterator it;
        C0826a c0826aM820q3;
        HashSet hashSet4;
        String str7;
        C2264o c2264o2;
        C2261l c2261l;
        String str8;
        Iterator it2;
        boolean z11;
        boolean zContains;
        C0826a c0826a;
        int i9;
        C2261l c2261l2;
        C0184c c0184c2;
        String strOptString = jSONObject.optString("descriptor", jSONObject.optString("class_name", HttpUrl.FRAGMENT_ENCODE_SET));
        strOptString.getClass();
        String string = AbstractC3149m.m6703R0(strOptString).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return m2958l("export_class_smali 需要 descriptor 或 class_name");
        }
        C1145l1 c1145l12 = c1136j0.f3735n;
        JSONObject jSONObjectM2937X = m2937X(jSONObject);
        c1145l12.getClass();
        String strM2903c = C1145l1.m2903c(string);
        C1133i1 c1133i1M2908e = c1145l12.m2908e(strM2903c, c1103b);
        if (c1133i1M2908e == null) {
            C2104o.m5294t("没有找到类: ".concat(strM2903c));
            return null;
        }
        C2270u c2270u = c1133i1M2908e.f3709b;
        C2264o c2264o3 = c1133i1M2908e.f3710c;
        C2263n c2263n2 = c2264o3.f7513l;
        int i10 = c2264o3.f7512k;
        C2270u c2270u2 = c2264o3.f7511j;
        StringWriter stringWriter2 = new StringWriter();
        C0826a c0826a2 = new C0826a(stringWriter2, c2264o3.getType());
        C0184c c0184c3 = new C0184c(C1145l1.m2904h(c2270u), c2264o3);
        C0014a c0014a = (C0014a) c0184c3.f471c;
        c0826a2.write(".class ");
        int iM583N = c2270u2.f7531a.m583N(i10 + 4);
        EnumC1065a[] enumC1065aArr = EnumC1065a.f3413n;
        int length = enumC1065aArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            C0184c c0184c4 = c0184c3;
            EnumC1065a enumC1065a = enumC1065aArr[i12];
            int i13 = iM583N;
            if (enumC1065a.f3418i && (i13 & enumC1065a.f3416g) != 0) {
                i11++;
            }
            i12++;
            c0184c3 = c0184c4;
            iM583N = i13;
        }
        C0184c c0184c5 = c0184c3;
        int i14 = iM583N;
        EnumC1065a[] enumC1065aArr2 = new EnumC1065a[i11];
        int length2 = enumC1065aArr.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length2) {
            EnumC1065a[] enumC1065aArr3 = enumC1065aArr2;
            EnumC1065a enumC1065a2 = enumC1065aArr[i15];
            int i17 = length2;
            if (enumC1065a2.f3418i && (i14 & enumC1065a2.f3416g) != 0) {
                enumC1065aArr3[i16] = enumC1065a2;
                i16++;
            }
            i15++;
            enumC1065aArr2 = enumC1065aArr3;
            length2 = i17;
        }
        EnumC1065a[] enumC1065aArr4 = enumC1065aArr2;
        for (int i18 = 0; i18 < i11; i18++) {
            c0826a2.write(enumC1065aArr4[i18].f3417h);
            c0826a2.write(32);
        }
        c0826a2.m7221t(c2264o3.getType());
        c0826a2.write(10);
        C2268s c2268s = c2270u2.f7549s;
        C0119x c0119x = c2270u2.f7531a;
        String strM5523d = c2268s.m5523d(c0119x.m581L(i10 + 8));
        if (strM5523d != null) {
            c0826a2.write(".super ");
            c0826a2.m7221t(strM5523d);
            c0826a2.write(10);
        }
        String strM5523d2 = c2270u2.f7548r.m5523d(c0119x.m581L(i10 + 16));
        if (strM5523d2 != null) {
            c0826a2.write(".source ");
            c0826a2.m7218m(strM5523d2);
            c0826a2.write("\n");
        }
        int iM583N2 = c0119x.m583N(i10 + 12);
        List<String> c2251e = iM583N2 > 0 ? new C2251e(c2264o3, iM583N2, c2270u2.f7532b.m583N(iM583N2)) : Collections.EMPTY_LIST;
        if (c2251e.size() != 0) {
            c0826a2.write(10);
            c0826a2.write("# interfaces\n");
            for (String str9 : c2251e) {
                c0826a2.write(".implements ");
                c0826a2.m7221t(str9);
                c0826a2.write(10);
            }
        }
        Set setMo6489b = c2264o3.m5514e1().mo6489b();
        if (setMo6489b.size() != 0) {
            c0826a2.write("\n\n");
            c0826a2.write("# annotations\n");
            AbstractC0063p.m407Q(c0826a2, setMo6489b);
        }
        HashSet hashSet5 = new HashSet();
        if (c2264o3.f7518q > 0) {
            C0119x c0119x2 = c2270u2.f7532b;
            int i19 = c2264o3.f7514m;
            c0119x2.getClass();
            AbstractC3050e abstractC3050eM5514e1 = c2264o3.m5514e1();
            int iM583N3 = c2270u2.f7531a.m583N(i10 + 28);
            if (c2263n2 == null) {
                c0184c2 = c0184c5;
                stringWriter = stringWriter2;
                hashSet = hashSet5;
                jSONObject2 = jSONObjectM2937X;
                str2 = "\n\n";
                i9 = i19;
                c2261l2 = null;
            } else {
                C2264o c2264o4 = (C2264o) c2263n2.f7510l;
                i9 = i19;
                stringWriter = stringWriter2;
                hashSet = hashSet5;
                jSONObject2 = jSONObjectM2937X;
                str2 = "\n\n";
                c2261l2 = new C2261l(c2263n2, c2264o4.f7511j.f7532b, c2263n2.f7506h, c2264o4.f7518q, 0);
                c0184c2 = c0184c5;
            }
            c2263n = c2263n2;
            str = strM2903c;
            c0184c = c0184c2;
            c1145l1 = c1145l12;
            c2255g = new C2255g(c2264o3, abstractC3050eM5514e1, iM583N3, i9, c2261l2, false);
            c2264o = c2264o3;
            z9 = false;
        } else {
            jSONObject2 = jSONObjectM2937X;
            str = strM2903c;
            c2263n = c2263n2;
            str2 = "\n\n";
            c0184c = c0184c5;
            stringWriter = stringWriter2;
            hashSet = hashSet5;
            c2264o = c2264o3;
            z9 = false;
            c1145l1 = c1145l12;
            c2264o.f7515n = c2264o.f7514m;
            c2255g = Collections.EMPTY_SET;
        }
        Iterator it3 = c2255g.iterator();
        boolean z12 = z9;
        while (it3.hasNext()) {
            C2272w c2272w = (C2272w) it3.next();
            if (!z12) {
                c0826a2.write(str2);
                c0826a2.write("# static fields");
                z12 = true;
            }
            c0826a2.write(10);
            String strM194h = c0014a.m194h(c2272w);
            if (hashSet.add(strM194h)) {
                it2 = it3;
                z11 = z12;
                zContains = ((HashSet) c0184c.f470b).contains(strM194h);
                c0826a = c0826a2;
            } else {
                c0826a2.write("# duplicate field ignored\n");
                C0826a c0826aM820q4 = c0184c.m820q(c0826a2);
                it2 = it3;
                z11 = z12;
                System.err.println("Ignoring duplicate field: " + c2264o.getType() + "->" + strM194h);
                c0826a = c0826aM820q4;
                zContains = false;
            }
            AbstractC0283h.m1172m0(c0826a, c2272w, zContains);
            z12 = z11;
            it3 = it2;
        }
        HashSet hashSet6 = new HashSet();
        if (c2264o.f7519r > 0) {
            C0119x c0119x3 = c2270u2.f7532b;
            int iM5517h1 = c2264o.m5517h1();
            c0119x3.getClass();
            AbstractC3050e abstractC3050eM5514e12 = c2264o.m5514e1();
            if (c2263n == null) {
                c2264o2 = c2264o;
                str7 = "Ignoring duplicate field: ";
                str8 = "# duplicate field ignored\n";
                c2261l = null;
                hashSet4 = hashSet6;
            } else {
                C2264o c2264o5 = (C2264o) c2263n.f7510l;
                hashSet4 = hashSet6;
                str7 = "Ignoring duplicate field: ";
                c2264o2 = c2264o;
                c2261l = new C2261l(c2263n, c2264o5.f7511j.f7532b, c2263n.m5508e(), c2264o5.f7519r, 1);
                str8 = "# duplicate field ignored\n";
            }
            c1133i1 = c1133i1M2908e;
            str4 = str8;
            hashSet2 = hashSet4;
            str3 = str7;
            C2264o c2264o6 = c2264o2;
            c2258i = new C2258i(c2264o6, abstractC3050eM5514e12, iM5517h1, c2261l, false, 0);
            c2264o = c2264o6;
            z10 = false;
        } else {
            c1133i1 = c1133i1M2908e;
            hashSet2 = hashSet6;
            str3 = "Ignoring duplicate field: ";
            str4 = "# duplicate field ignored\n";
            z10 = false;
            int i20 = c2264o.f7515n;
            if (i20 > 0) {
                c2264o.f7516o = i20;
            }
            c2258i = Collections.EMPTY_SET;
        }
        Iterator it4 = c2258i.iterator();
        boolean z13 = z10;
        while (it4.hasNext()) {
            C2272w c2272w2 = (C2272w) it4.next();
            if (!z13) {
                c0826a2.write(str2);
                c0826a2.write("# instance fields");
                z13 = true;
            }
            c0826a2.write(10);
            String strM194h2 = c0014a.m194h(c2272w2);
            if (hashSet2.add(strM194h2)) {
                str6 = str4;
                it = it4;
                if (hashSet.contains(strM194h2)) {
                    System.err.println("Duplicate static+instance field found: " + c2264o.getType() + "->" + strM194h2);
                    System.err.println("You will need to rename one of these fields, including all references.");
                    c0826a2.write("# There is both a static and instance field with this signature.\n# You will need to rename one of these fields, including all references.\n");
                }
                c0826aM820q3 = c0826a2;
            } else {
                c0826a2.write(str4);
                c0826aM820q3 = c0184c.m820q(c0826a2);
                str6 = str4;
                it = it4;
                System.err.println(str3 + c2264o.getType() + "->" + strM194h2);
            }
            z10 = false;
            AbstractC0283h.m1172m0(c0826aM820q3, c2272w2, false);
            str4 = str6;
            it4 = it;
        }
        HashSet hashSet7 = new HashSet();
        boolean z14 = false;
        for (C2275z c2275z : c2264o.m5515f1(z10)) {
            if (!z14) {
                c0826a2.write(str2);
                c0826a2.write("# direct methods");
                z14 = true;
            }
            c0826a2.write(10);
            StringWriter stringWriter3 = new StringWriter();
            try {
                c0014a.m196j(stringWriter3).m7220q(c2275z);
                if (hashSet7.add(stringWriter3.toString())) {
                    c0826aM820q2 = c0826a2;
                } else {
                    c0826a2.write("# duplicate method ignored\n");
                    c0826aM820q2 = c0184c.m820q(c0826a2);
                }
                C0058k c0058kM5527i1 = c2275z.m5527i1();
                if (c0058kM5527i1 == null) {
                    C0190i.m837k(c0826aM820q2, c2275z, c0184c);
                } else {
                    new C0190i(c0184c, c2275z, c0058kM5527i1).m847m(c0826aM820q2);
                }
            } catch (IOException unused) {
                C2104o.m5281f("Unexpected IOException");
                return null;
            }
        }
        HashSet hashSet8 = new HashSet();
        boolean z15 = false;
        for (C2275z c2275z2 : c2264o.m5518i1(false)) {
            if (!z15) {
                c0826a2.write(str2);
                c0826a2.write("# virtual methods");
                z15 = true;
            }
            c0826a2.write(10);
            StringWriter stringWriter4 = new StringWriter();
            try {
                c0014a.m196j(stringWriter4).m7220q(c2275z2);
                String string2 = stringWriter4.toString();
                if (hashSet8.add(string2)) {
                    if (hashSet7.contains(string2)) {
                        c0826a2.write("# There is both a direct and virtual method with this signature.\n# You will need to rename one of these methods, including all references.\n");
                        str5 = str2;
                        hashSet3 = hashSet7;
                        System.err.println("Duplicate direct+virtual method found: " + c2264o.getType() + "->" + string2);
                        System.err.println("You will need to rename one of these methods, including all references.");
                    } else {
                        str5 = str2;
                        hashSet3 = hashSet7;
                    }
                    c0826aM820q = c0826a2;
                } else {
                    c0826a2.write("# duplicate method ignored\n");
                    c0826aM820q = c0184c.m820q(c0826a2);
                    str5 = str2;
                    hashSet3 = hashSet7;
                }
                C0058k c0058kM5527i12 = c2275z2.m5527i1();
                if (c0058kM5527i12 == null) {
                    C0190i.m837k(c0826aM820q, c2275z2, c0184c);
                } else {
                    new C0190i(c0184c, c2275z2, c0058kM5527i12).m847m(c0826aM820q);
                }
                str2 = str5;
                hashSet7 = hashSet3;
            } catch (IOException unused2) {
                C2104o.m5281f("Unexpected IOException");
                return null;
            }
        }
        c0826a2.flush();
        String string3 = stringWriter.toString();
        string3.getClass();
        return c1145l1.m2906b(str, c1133i1.f3708a, string3, jSONObject2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m2961o(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) {
        String strM1023l = AbstractC0255e.m1023l("descriptor", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            return m2958l("export_method_java 需要完整 descriptor");
        }
        C1112d0 c1112d0 = c1136j0.f3736o;
        c1112d0.getClass();
        if (!AbstractC3149m.m6709h0(strM1023l, "->", false)) {
            C2104o.m5294t("export_method_java 需要完整 descriptor");
            return null;
        }
        C1137j1 c1137j1M2910g = c1112d0.f3635b.m2910g(AbstractC3149m.m6699N0(strM1023l, "->"), c1103b);
        String strM6696K0 = AbstractC3149m.m6696K0(strM1023l, "->");
        String strM9264h = AbstractC4855en.m9264h(c1137j1M2910g.f3740a, "->", strM6696K0);
        return c1112d0.m2847a(strM9264h, c1137j1M2910g.f3741b, C1112d0.m2846b(c1137j1M2910g, c1103b, new C0868g(9, strM6696K0, strM9264h)), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m2962p(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) throws JSONException, IOException {
        Object next;
        String strM1023l = AbstractC0255e.m1023l("descriptor", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            return m2958l("export_method_smali 需要完整 descriptor");
        }
        C1145l1 c1145l1 = c1136j0.f3735n;
        JSONObject jSONObjectM2937X = m2937X(jSONObject);
        c1145l1.getClass();
        if (!AbstractC3149m.m6709h0(strM1023l, "->", false)) {
            C2104o.m5294t("export_method_smali 需要完整 descriptor");
            return null;
        }
        String strM2903c = C1145l1.m2903c(AbstractC3149m.m6699N0(strM1023l, "->"));
        String strM9264h = AbstractC4855en.m9264h(strM2903c, "->", AbstractC3149m.m6696K0(strM1023l, "->"));
        C1133i1 c1133i1M2908e = c1145l1.m2908e(strM2903c, c1103b);
        if (c1133i1M2908e == null) {
            C2104o.m5294t("没有找到类: ".concat(strM2903c));
            return null;
        }
        C2264o c2264o = c1133i1M2908e.f3710c;
        Iterable iterableM5515f1 = c2264o.m5515f1(true);
        Iterable iterableM5518i1 = c2264o.m5518i1(true);
        Iterator it = iterableM5515f1.iterator();
        Iterator it2 = iterableM5518i1.iterator();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                next = null;
                break;
            }
            next = it.hasNext() ? it.next() : it2.next();
            C2275z c2275z = (C2275z) next;
            c2275z.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c2275z.f7571k.getType());
            sb2.append("->");
            sb2.append(c2275z.getName());
            sb2.append('(');
            List listM5528j1 = c2275z.m5528j1();
            listM5528j1.getClass();
            Iterator it3 = listM5528j1.iterator();
            while (it3.hasNext()) {
                sb2.append(((C3061p) it3.next()).f9898l);
            }
            sb2.append(')');
            sb2.append(c2275z.mo4931h1());
            if (sb2.toString().equals(strM9264h)) {
                break;
            }
        }
        C2275z c2275z2 = (C2275z) next;
        if (c2275z2 == null) {
            C2104o.m5294t("没有找到方法: ".concat(strM9264h));
            return null;
        }
        C2270u c2270u = c1133i1M2908e.f3709b;
        StringWriter stringWriter = new StringWriter();
        C0826a c0826a = new C0826a(stringWriter, c2264o.getType());
        C0184c c0184c = new C0184c(C1145l1.m2904h(c2270u), c2264o);
        C0058k c0058kM5527i1 = c2275z2.m5527i1();
        if (c0058kM5527i1 == null) {
            C0190i.m837k(c0826a, c2275z2, c0184c);
        } else {
            new C0190i(c0184c, c2275z2, c0058kM5527i1).m847m(c0826a);
        }
        c0826a.flush();
        String string = stringWriter.toString();
        string.getClass();
        return c1145l1.m2906b(strM9264h, c1133i1M2908e.f3708a, string, jSONObjectM2937X);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static JSONObject m2963q(C1727l c1727l) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (c1727l == null) {
            return jSONObject;
        }
        jSONObject.put("className", c1727l.m4347p().f8328g);
        jSONObject.put("fieldName", c1727l.m4347p().f8329h);
        jSONObject.put("descriptor", c1727l.f5741j);
        jSONObject.put("type", c1727l.m4347p().f8330i);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m2964r(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) throws JSONException {
        Map mapM2909f;
        DexKitBridge dexKitBridge = c1136j0.f3729h;
        List listM2943b0 = m2943b0("contains_all_strings", jSONObject);
        List<String> listM2943b02 = m2943b0("contains_any_strings", jSONObject);
        if (listM2943b0.isEmpty() && listM2943b02.isEmpty()) {
            return m2958l("至少提供 contains_all_strings 或 contains_any_strings");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listM2943b0.isEmpty()) {
            C1243a c1243a = new C1243a();
            C1243a.m3357r0(c1243a, listM2943b0);
            C0568c c0568c = new C0568c();
            c0568c.f1762h = c1243a;
            for (C1724i c1724i : dexKitBridge.findClass(c0568c)) {
                linkedHashMap.put(c1724i.m4345p().f8327g, c1724i);
            }
        }
        for (String str : listM2943b02) {
            C1243a c1243a2 = new C1243a();
            c1243a2.m3364q0(str);
            C0568c c0568c2 = new C0568c();
            c0568c2.f1762h = c1243a2;
            for (C1724i c1724i2 : dexKitBridge.findClass(c0568c2)) {
                linkedHashMap.put(c1724i2.m4345p().f8327g, c1724i2);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        List listM8407P1 = AbstractC4166m.m8407P1(collectionValues);
        Set setM2927N = m2927N(jSONObject, f3808f, f3810h, f3809g);
        int iOptInt = jSONObject.optInt("offset", 0);
        List<C1724i> listM8403L1 = AbstractC4166m.m8403L1(m2915B(jSONObject), AbstractC4166m.m8419q1(iOptInt >= 0 ? iOptInt : 0, listM8407P1));
        if (setM2927N.contains("sourceEntry")) {
            C1145l1 c1145l1 = c1136j0.f3735n;
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
            Iterator it = listM8403L1.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1724i) it.next()).f5724j);
            }
            mapM2909f = c1145l1.m2909f(arrayList, c1103b);
        } else {
            mapM2909f = C4174u.f13711g;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
        for (C1724i c1724i3 : listM8403L1) {
            JSONObject jSONObject2 = new JSONObject();
            C2567a c2567aM4345p = c1724i3.m4345p();
            String str2 = c1724i3.f5724j;
            m2929P(jSONObject2, setM2927N, "className", c2567aM4345p.f8327g);
            m2929P(jSONObject2, setM2927N, "descriptor", str2);
            String str3 = c1724i3.f5722h;
            if (str3 == null) {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            m2929P(jSONObject2, setM2927N, "sourceFile", str3);
            m2929P(jSONObject2, setM2927N, "methodCount", Integer.valueOf(c1724i3.f5727m.size()));
            m2929P(jSONObject2, setM2927N, "fieldCount", Integer.valueOf(c1724i3.f5728n.size()));
            m2929P(jSONObject2, setM2927N, "modifiers", Integer.valueOf(c1724i3.f5723i));
            m2929P(jSONObject2, setM2927N, "sourcePath", c1136j0.f3730i);
            Object obj = (String) mapM2909f.get(str2);
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            m2929P(jSONObject2, setM2927N, "sourceEntry", obj);
            arrayList2.add(jSONObject2);
        }
        return m2933T(arrayList2, listM8407P1.size(), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m2965s(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) {
        Object c3959f;
        Object c3959f2;
        DexKitBridge dexKitBridge = c1136j0.f3729h;
        String strM1023l = AbstractC0255e.m1023l("descriptor", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (!AbstractC3149m.m6721t0(strM1023l) && AbstractC3149m.m6709h0(strM1023l, "->", false) && !jSONObject.has("descriptor_contains")) {
            try {
                c3959f2 = dexKitBridge.getMethodData(strM1023l);
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            return m2920G(c1136j0, AbstractC0000a.m1A0((C1730o) (c3959f2 instanceof C3959f ? null : c3959f2)), jSONObject, c1103b);
        }
        String strM1023l2 = AbstractC0255e.m1023l("class_name_contains", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strM1023l3 = AbstractC0255e.m1023l("method_name_contains", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strM1023l4 = AbstractC0255e.m1023l("descriptor_contains", strM1023l, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l2) && AbstractC3149m.m6721t0(strM1023l3)) {
            if (!AbstractC3149m.m6709h0(strM1023l4, "->", false)) {
                return m2958l("至少提供 class_name_contains、method_name_contains 或完整 descriptor");
            }
            try {
                c3959f = dexKitBridge.getMethodData(strM1023l4);
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            return m2920G(c1136j0, AbstractC0000a.m1A0((C1730o) (c3959f instanceof C3959f ? null : c3959f)), jSONObject, c1103b);
        }
        C1253k c1253k = new C1253k();
        if (!AbstractC3149m.m6721t0(strM1023l2)) {
            c1253k.m3369l0(1, strM1023l2);
        }
        if (!AbstractC3149m.m6721t0(strM1023l3)) {
            c1253k.f4103g = new C1431c(strM1023l3, 1);
        }
        C0570e c0570e = new C0570e();
        c0570e.f1764h = c1253k;
        C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c1731pFindMethod) {
            if (AbstractC3149m.m6721t0(strM1023l4) || AbstractC3149m.m6709h0(((C1730o) obj).f5750j, strM1023l4, false)) {
                arrayList.add(obj);
            }
        }
        return m2920G(c1136j0, arrayList, jSONObject, c1103b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m2966t(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) {
        String strOptString = jSONObject.optString("resource_id", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        Integer numM2924K = m2924K(strOptString);
        if (numM2924K == null) {
            return m2958l("find_methods_using_resource 需要有效的 resource_id");
        }
        DexKitBridge dexKitBridge = c1136j0.f3729h;
        C0570e c0570e = new C0570e();
        C1253k c1253k = new C1253k();
        c1253k.m3375s0(numM2924K);
        c0570e.f1764h = c1253k;
        return m2920G(c1136j0, AbstractC4166m.m8407P1(dexKitBridge.findMethod(c0570e)), jSONObject, c1103b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static String m2967u(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) {
        DexKitBridge dexKitBridge = c1136j0.f3729h;
        List listM2943b0 = m2943b0("contains_all_strings", jSONObject);
        List<String> listM2943b02 = m2943b0("contains_any_strings", jSONObject);
        if (listM2943b0.isEmpty() && listM2943b02.isEmpty()) {
            return m2958l("至少提供 contains_all_strings 或 contains_any_strings");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listM2943b0.isEmpty()) {
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, listM2943b0);
            C0570e c0570e = new C0570e();
            c0570e.f1764h = c1253k;
            for (C1730o c1730o : dexKitBridge.findMethod(c0570e)) {
                linkedHashMap.put(c1730o.f5750j, c1730o);
            }
        }
        for (String str : listM2943b02) {
            C1253k c1253k2 = new C1253k();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C1431c(new String[]{str}[0], 1));
            c1253k2.f4107k = new ArrayList(arrayList);
            C0570e c0570e2 = new C0570e();
            c0570e2.f1764h = c1253k2;
            for (C1730o c1730o2 : dexKitBridge.findMethod(c0570e2)) {
                linkedHashMap.put(c1730o2.f5750j, c1730o2);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        return m2920G(c1136j0, AbstractC4166m.m8407P1(collectionValues), jSONObject, c1103b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: v */
    public static String m2968v(C1136j0 c1136j0, JSONObject jSONObject) {
        String strM1023l = AbstractC0255e.m1023l("type", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strM1023l2 = AbstractC0255e.m1023l("value", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l) || AbstractC3149m.m6721t0(strM1023l2)) {
            return m2958l("find_resource_values 需要 type 和 value");
        }
        boolean zOptBoolean = jSONObject.has("contains") ? jSONObject.optBoolean("contains", true) : true;
        boolean zOptBoolean2 = jSONObject.optBoolean("ignore_case", false);
        if (zOptBoolean2) {
            strM1023l2 = strM1023l2.toLowerCase(Locale.ROOT);
            strM1023l2.getClass();
        }
        Object value = c1136j0.f3738q.getValue();
        value.getClass();
        List listM6418b0 = AbstractC3015m.m6418b0(new C0791j(new C3011i(AbstractC3015m.m6408R(new C2516d(((C2524l) value).m5927W(null), 1)), true, new C0532s(strM1023l, 8)), new C1128h0(zOptBoolean2, zOptBoolean, strM1023l2, 0), C3019q.f9816n));
        Set setM2927N = m2927N(jSONObject, f3815m, f3819q, f3817o);
        int iOptInt = jSONObject.optInt("offset", 0);
        List<C1140k0> listM8403L1 = AbstractC4166m.m8403L1(m2915B(jSONObject), AbstractC4166m.m8419q1(iOptInt >= 0 ? iOptInt : 0, listM6418b0));
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
        for (C1140k0 c1140k0 : listM8403L1) {
            arrayList.add(m2932S(c1136j0, c1140k0.f3760a, c1140k0.f3761b, setM2927N));
        }
        return m2933T(arrayList, listM6418b0.size(), jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = r7.m5931a0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r1 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r1 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r7 = r7.m5926V(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r7.hasNext() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r3 = ((p166l7.C2518f) r7.next()).m5917W(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r3 == null) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2969w(C1136j0 c1136j0, JSONObject jSONObject) throws JSONException {
        Object c3959f;
        C4135b c4135b;
        C2524l c2524l;
        int iIntValue;
        Object next;
        ?? r02 = c1136j0.f3738q;
        String strOptString = jSONObject.optString("resource_id", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        Integer numM2924K = m2924K(strOptString);
        String strM1023l = AbstractC0255e.m1023l("type", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strM1023l2 = AbstractC0255e.m1023l("name", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (numM2924K != null) {
            try {
                Object value = r02.getValue();
                value.getClass();
                c2524l = (C2524l) value;
                iIntValue = numM2924K.intValue();
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (iIntValue == 0) {
                c3959f = null;
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                c4135b = (C4135b) c3959f;
            } else {
                C6110f c6110fM5926V = c2524l.m5926V(null);
                while (true) {
                    if (!c6110fM5926V.hasNext()) {
                        break;
                    }
                    c3959f = ((C2518f) c6110fM5926V.next()).m5917W(iIntValue);
                    if (c3959f != null) {
                        break;
                    }
                }
                if (c3959f instanceof C3959f) {
                }
                c4135b = (C4135b) c3959f;
            }
        } else if (AbstractC3149m.m6721t0(strM1023l) || AbstractC3149m.m6721t0(strM1023l2)) {
            c4135b = null;
        } else {
            Object value2 = r02.getValue();
            value2.getClass();
            Iterator it = ((C3003a) AbstractC3015m.m6408R(new C2516d(((C2524l) value2).m5927W(null), 1))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C4135b c4135b2 = (C4135b) next;
                if (AbstractC3156t.m6734X(c4135b2.m8323c(), strM1023l) && AbstractC1416l.m3825a(c4135b2.m8322b(), strM1023l2)) {
                    break;
                }
            }
            c4135b = (C4135b) next;
        }
        if (c4135b == null) {
            return m2958l("没有找到资源；请提供 resource_id，或同时提供 type 和 name");
        }
        JSONObject jSONObjectM2932S = m2932S(c1136j0, c4135b, null, AbstractC4166m.m8412U1(f3817o));
        List<C1144l0> listM2931R = m2931R(c4135b);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM2931R));
        for (C1144l0 c1144l0 : listM2931R) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", c1144l0.f3773a);
            jSONObject2.put("qualifiers", c1144l0.f3774b);
            jSONObject2.put("default", c1144l0.f3775c);
            arrayList.add(jSONObject2);
        }
        jSONObjectM2932S.put("values", new JSONArray((Collection) arrayList));
        String string = jSONObjectM2932S.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m2970x(C1136j0 c1136j0, JSONObject jSONObject) {
        String strM1023l = AbstractC0255e.m1023l("session_id", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        C1148m0 c1148m0 = (C1148m0) f3806d.get(strM1023l);
        if (c1148m0 != null) {
            String string = m2947d0(c1136j0, c1148m0).toString();
            string.getClass();
            return string;
        }
        return m2958l("没有找到目标会话: " + strM1023l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x016a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX INFO: renamed from: y */
    public static String m2971y(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) throws JSONException {
        Object c3959f;
        Object c3959f2;
        ?? c3959f3;
        String strOptString = jSONObject.optString("descriptor", jSONObject.optString("class_name", HttpUrl.FRAGMENT_ENCODE_SET));
        strOptString.getClass();
        String string = AbstractC3149m.m6703R0(strOptString).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return m2958l("inspect_class 需要 descriptor 或 class_name");
        }
        try {
            c3959f = c1136j0.f3729h.getClassData(string);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        C1724i c1724i = (C1724i) c3959f;
        if (c1724i == null) {
            return m2958l("没有找到类: ".concat(string));
        }
        ArrayList arrayList = c1724i.f5728n;
        ArrayList arrayList2 = c1724i.f5727m;
        String str = c1724i.f5724j;
        int iM2915B = m2915B(jSONObject);
        Set setM8412U1 = AbstractC4166m.m8412U1(m2943b0("include", jSONObject));
        Set set = setM8412U1;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!f3821s.contains((String) it.next())) {
                    C2104o.m5294t("inspect_class include 包含不支持的值");
                    return null;
                }
            }
        }
        Set set2 = setM8412U1;
        Set setM8355W = set2.isEmpty() ? AbstractC4156d0.m8355W("fields", "methods") : set2;
        boolean zOptBoolean = jSONObject.optBoolean("brief", false);
        String str2 = (String) c1136j0.f3735n.m2909f(AbstractC0000a.m99x0(str), c1103b).get(str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("className", c1724i.m4345p().f8327g);
        jSONObject2.put("descriptor", str);
        String str3 = c1724i.f5722h;
        if (str3 == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        jSONObject2.put("sourceFile", str3);
        jSONObject2.put("methodCount", arrayList2.size());
        jSONObject2.put("fieldCount", arrayList.size());
        jSONObject2.put("sourcePath", c1136j0.f3730i);
        jSONObject2.put("sourceEntry", str2 != null ? str2 : JSONObject.NULL);
        jSONObject2.put("include", new JSONArray((Collection) set2));
        jSONObject2.put("brief", zOptBoolean);
        try {
            C1724i c1724i2 = (C1724i) c1724i.f5730p.getValue();
            c3959f2 = c1724i2 != null ? c1724i2.m4345p().f8327g : null;
            if (c3959f2 == null) {
                c3959f2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        jSONObject2.put("superClass", c3959f2 instanceof C3959f ? HttpUrl.FRAGMENT_ENCODE_SET : c3959f2);
        try {
            C1725j c1725j = (C1725j) c1724i.f5731q.getValue();
            c3959f3 = new ArrayList(AbstractC4167n.m8429e1(c1725j));
            Iterator it2 = c1725j.iterator();
            while (it2.hasNext()) {
                c3959f3.add(((C1724i) it2.next()).m4345p().f8327g);
            }
        } catch (Throwable th4) {
            c3959f3 = new C3959f(th4);
        }
        boolean z9 = c3959f3 instanceof C3959f;
        ?? r12 = c3959f3;
        if (z9) {
            r12 = C4173t.f13710g;
        }
        jSONObject2.put("interfaces", new JSONArray((Collection) r12));
        if (setM8355W.contains("fields")) {
            if (zOptBoolean) {
                jSONObject2.put("fieldsCount", arrayList.size());
            } else {
                List listM8403L1 = AbstractC4166m.m8403L1(iM2915B, (C1728m) c1724i.f5733s.getValue());
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
                Iterator it3 = listM8403L1.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(m2963q((C1727l) it3.next()));
                }
                jSONObject2.put("fields", new JSONArray((Collection) arrayList3));
            }
        }
        if (setM8355W.contains("methods")) {
            if (zOptBoolean) {
                jSONObject2.put("methodsCount", arrayList2.size());
            } else {
                List listM8403L12 = AbstractC4166m.m8403L1(iM2915B, (C1731p) c1724i.f5732r.getValue());
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(listM8403L12));
                Iterator it4 = listM8403L12.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(m2921H((C1730o) it4.next()));
                }
                jSONObject2.put("methods", new JSONArray((Collection) arrayList4));
            }
        }
        if (setM8355W.contains("annotations")) {
            C3962i c3962i = c1724i.f5734t;
            if (zOptBoolean) {
                jSONObject2.put("annotationsCount", ((List) c3962i.getValue()).size());
            } else {
                List list = (List) c3962i.getValue();
                ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(m2942b((C1716a) it5.next()));
                }
                jSONObject2.put("annotations", new JSONArray((Collection) arrayList5));
            }
        }
        String string2 = jSONObject2.toString();
        string2.getClass();
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static String m2972z(C1136j0 c1136j0, JSONObject jSONObject, C1103b c1103b) throws JSONException {
        Object c3959f;
        String strM1023l = AbstractC0255e.m1023l("descriptor", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            return m2958l("inspect_method 需要完整 descriptor");
        }
        try {
            c3959f = c1136j0.f3729h.getMethodData(strM1023l);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        C1730o c1730o = (C1730o) c3959f;
        if (c1730o == null) {
            return m2958l("没有找到方法: ".concat(strM1023l));
        }
        C3962i c3962i = c1730o.f5758r;
        Set setM8412U1 = AbstractC4166m.m8412U1(m2943b0("include", jSONObject));
        Set set = setM8412U1;
        boolean z9 = set instanceof Collection;
        List list = f3820r;
        if (!z9 || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!list.contains((String) it.next())) {
                    C2104o.m5294t("inspect_method include 包含不支持的值");
                    return null;
                }
            }
        }
        Set set2 = setM8412U1;
        Set setM8412U12 = set2.isEmpty() ? AbstractC4166m.m8412U1(list) : set2;
        boolean zOptBoolean = jSONObject.optBoolean("brief", false);
        String strM6699N0 = AbstractC3149m.m6699N0(c1730o.f5750j, "->");
        Object obj = (String) c1136j0.f3735n.m2909f(AbstractC0000a.m99x0(strM6699N0), c1103b).get(strM6699N0);
        JSONObject jSONObjectM2921H = m2921H(c1730o);
        jSONObjectM2921H.put("sourcePath", c1136j0.f3730i);
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObjectM2921H.put("sourceEntry", obj);
        jSONObjectM2921H.put("include", new JSONArray((Collection) set2));
        jSONObjectM2921H.put("brief", zOptBoolean);
        if (setM8412U12.contains("strings")) {
            if (zOptBoolean) {
                jSONObjectM2921H.put("usingStringsCount", ((List) c3962i.getValue()).size());
            } else {
                jSONObjectM2921H.put("usingStrings", new JSONArray((Collection) AbstractC4166m.m8403L1(100, (List) c3962i.getValue())));
            }
        }
        if (setM8412U12.contains("using-fields")) {
            C3962i c3962i2 = c1730o.f5759s;
            if (zOptBoolean) {
                jSONObjectM2921H.put("usingFieldsCount", ((List) c3962i2.getValue()).size());
            } else {
                List listM8403L1 = AbstractC4166m.m8403L1(100, (List) c3962i2.getValue());
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
                Iterator it2 = listM8403L1.iterator();
                while (it2.hasNext()) {
                    arrayList.add(m2963q(((C1732q) it2.next()).f5760a));
                }
                jSONObjectM2921H.put("usingFields", new JSONArray((Collection) arrayList));
            }
        }
        if (setM8412U12.contains("invokes")) {
            if (zOptBoolean) {
                jSONObjectM2921H.put("invokesCount", c1730o.m4349q().size());
            } else {
                List listM8403L12 = AbstractC4166m.m8403L1(100, c1730o.m4349q());
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM8403L12));
                Iterator it3 = listM8403L12.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(m2921H((C1730o) it3.next()));
                }
                jSONObjectM2921H.put("invokes", new JSONArray((Collection) arrayList2));
            }
        }
        if (setM8412U12.contains("callers")) {
            C3962i c3962i3 = c1730o.f5756p;
            if (zOptBoolean) {
                jSONObjectM2921H.put("callersCount", ((C1731p) c3962i3.getValue()).size());
            } else {
                List listM8403L13 = AbstractC4166m.m8403L1(100, (C1731p) c3962i3.getValue());
                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(listM8403L13));
                Iterator it4 = listM8403L13.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(m2921H((C1730o) it4.next()));
                }
                jSONObjectM2921H.put("callers", new JSONArray((Collection) arrayList3));
            }
        }
        if (setM8412U12.contains("annotations")) {
            C3962i c3962i4 = c1730o.f5754n;
            if (zOptBoolean) {
                jSONObjectM2921H.put("annotationsCount", ((List) c3962i4.getValue()).size());
            } else {
                List list2 = (List) c3962i4.getValue();
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(list2));
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(m2942b((C1716a) it5.next()));
                }
                jSONObjectM2921H.put("annotations", new JSONArray((Collection) arrayList4));
            }
        }
        if (setM8412U12.contains("opcodes")) {
            if (zOptBoolean) {
                jSONObjectM2921H.put("opCodesCount", c1730o.m4351s().size());
            } else {
                jSONObjectM2921H.put("opNames", new JSONArray((Collection) AbstractC4166m.m8403L1(400, c1730o.m4351s())));
            }
        }
        String string = jSONObjectM2921H.toString();
        string.getClass();
        return string;
    }
}
