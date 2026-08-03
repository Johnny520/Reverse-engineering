package p080fb;

import ac.AbstractC0063p;
import android.content.Context;
import gg.AbstractC1416l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import ng.InterfaceC3012j;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p027c0.C0361f;
import p036c9.C0499x;
import p054dg.AbstractC0793l;
import p054dg.C0791j;
import p054dg.C0795n;
import p054dg.EnumC0792k;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p136j8.C2104o;
import p172lg.C2564d;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p218og.EnumC3148l;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: fb.s2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1174s2 implements AutoCloseable {

    /* JADX INFO: renamed from: g */
    public final Context f3923g;

    /* JADX INFO: renamed from: h */
    public final String f3924h;

    /* JADX INFO: renamed from: i */
    public final File f3925i;

    /* JADX INFO: renamed from: j */
    public final File f3926j;

    /* JADX INFO: renamed from: k */
    public final boolean f3927k;

    /* JADX INFO: renamed from: l */
    public final String f3928l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f3929m;

    /* JADX INFO: renamed from: n */
    public final String f3930n;

    /* JADX INFO: renamed from: o */
    public int f3931o;

    /* JADX INFO: renamed from: p */
    public boolean f3932p;

    /* JADX INFO: renamed from: q */
    public int f3933q;

    /* JADX INFO: renamed from: r */
    public int f3934r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1174s2(Context context, String str, File file, File file2, boolean z9, String str2, LinkedHashMap linkedHashMap, String str3, int i9, int i10, int i11, boolean z10) {
        str3.getClass();
        this.f3923g = context;
        this.f3924h = str;
        this.f3925i = file;
        this.f3926j = file2;
        this.f3927k = z9;
        this.f3928l = str2;
        this.f3929m = linkedHashMap;
        this.f3930n = str3;
        this.f3931o = i9;
        this.f3932p = z10;
        this.f3933q = i10;
        this.f3934r = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static C1154n2 m2991J(C1174s2 c1174s2, String str, int i9) {
        boolean z9;
        String str2 = (i9 & 1) != 0 ? "." : str;
        boolean z10 = (i9 & 2) != 0;
        ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
        LinkedHashMap linkedHashMap = c1174s2.f3929m;
        File file = c1174s2.f3925i;
        File file2 = c1174s2.f3926j;
        Map mapM3053S = C1178t2.m3053S(file2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4178y.m8438a0(mapM3053S.size()));
        for (Map.Entry entry : mapM3053S.entrySet()) {
            Object key = entry.getKey();
            ConcurrentHashMap concurrentHashMap2 = C1178t2.f3961a;
            linkedHashMap2.put(key, C1178t2.m3052R((C1166q2) entry.getValue()));
        }
        Set setM8352T = AbstractC4156d0.m8352T(linkedHashMap2.keySet(), linkedHashMap.keySet());
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM8352T) {
            if (C1178t2.m3072h(str2, (String) obj)) {
                arrayList.add(obj);
            }
        }
        List listM8401J1 = AbstractC4166m.m8401J1(arrayList);
        Set setM8352T2 = AbstractC4156d0.m8352T(linkedHashMap.keySet(), linkedHashMap2.keySet());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setM8352T2) {
            if (C1178t2.m3072h(str2, (String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        List listM8401J12 = AbstractC4166m.m8401J1(arrayList2);
        LinkedHashSet linkedHashSetM8426x1 = AbstractC4166m.m8426x1(linkedHashMap.keySet(), linkedHashMap2.keySet());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : linkedHashSetM8426x1) {
            String str3 = (String) obj3;
            if (C1178t2.m3072h(str2, str3) && !AbstractC1416l.m3825a(linkedHashMap.get(str3), linkedHashMap2.get(str3))) {
                arrayList3.add(obj3);
            }
        }
        List listM8401J13 = AbstractC4166m.m8401J1(arrayList3);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = (z10 ? AbstractC4166m.m8397F1(AbstractC4166m.m8397F1(listM8401J1, listM8401J13), listM8401J12) : C4173t.f13710g).iterator();
        while (true) {
            if (!it.hasNext()) {
                z9 = false;
                break;
            }
            String str4 = (String) it.next();
            File file3 = new File(file, str4);
            File file4 = new File(file2, str4);
            String strM3088x = listM8401J1.contains(str4) ? C1178t2.m3088x(null, file4, str4) : listM8401J12.contains(str4) ? C1178t2.m3088x(file3, null, str4) : C1178t2.m3088x(file3, file4, str4);
            String str5 = sb2.length() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "\n\n";
            if (strM3088x.length() + str5.length() + sb2.length() > 96000) {
                int length = (96000 - sb2.length()) - str5.length();
                int i10 = length >= 0 ? length : 0;
                sb2.append(str5);
                sb2.append(AbstractC3149m.m6701P0(i10, strM3088x));
                z9 = true;
            } else {
                sb2.append(str5);
                sb2.append(strM3088x);
            }
        }
        if (z9) {
            sb2.append("\n... diff 已截断，请按 path 分段调用 show_diff ...");
        }
        return new C1154n2(listM8401J1, listM8401J13, listM8401J12, sb2.toString(), z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static String m2992y(String str, boolean z9) {
        String strM6704S0 = AbstractC3149m.m6704S0(AbstractC3156t.m6738b0(AbstractC3149m.m6703R0(str).toString(), '\\', '/'), '/');
        if (AbstractC3149m.m6721t0(strM6704S0) || strM6704S0.equals(".")) {
            if (z9) {
                return ".";
            }
            C2104o.m5294t("path 不能为空");
            return null;
        }
        if (AbstractC3149m.m6694I0(strM6704S0, '/') || AbstractC3149m.m6710i0(strM6704S0, (char) 0)) {
            C2104o.m5294t("必须使用插件目录内的相对路径");
            return null;
        }
        List<String> listM6691F0 = AbstractC3149m.m6691F0(strM6704S0, new char[]{'/'}, 6);
        if (!listM6691F0.isEmpty()) {
            for (String str2 : listM6691F0) {
                if (AbstractC3149m.m6721t0(str2) || str2.equals(".") || str2.equals("..")) {
                    C2104o.m5294t("路径包含不允许的片段");
                    return null;
                }
            }
        }
        if (strM6704S0.length() <= 240) {
            return AbstractC4166m.m8392A1(listM6691F0, "/", null, null, null, 62);
        }
        C2104o.m5294t("路径过长");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[PHI: r12
  0x00a7: PHI (r12v7 int) = (r12v4 int), (r12v8 int) binds: [B:29:0x00af, B:26:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2993A(JSONObject jSONObject) throws JSONException, IOException {
        int size;
        int length;
        int i9;
        boolean z9;
        String str;
        String strM6836i;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String strOptString = jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        String strM2992y = m2992y(strOptString, false);
        File fileM2996D = m2996D(strM2992y, false);
        if (!fileM2996D.isFile()) {
            C2104o.m5291q("文件不存在: ".concat(strM2992y));
            return null;
        }
        if (fileM2996D.length() > 2097152) {
            C2104o.m5294t("文件超过 2 MB，不能作为文本读取");
            return null;
        }
        byte[] bArrM2027g0 = AbstractC0793l.m2027g0(fileM2996D);
        ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
        if (!C1178t2.m3037C(bArrM2027g0)) {
            C2104o.m5291q("文件不是可读取的文本文件: ".concat(strM2992y));
            return null;
        }
        String str3 = new String(bArrM2027g0, AbstractC3137a.f10177a);
        String strReplace = AbstractC3156t.m6737a0(str3, "\r\n", "\n", false).replace('\r', '\n');
        strReplace.getClass();
        int i10 = 1;
        List listM6691F0 = strReplace.length() == 0 ? C4173t.f13710g : AbstractC3149m.m6713l0(strReplace, '\n') ? AbstractC3149m.m6691F0(AbstractC3149m.m6712k0(1, strReplace), new char[]{'\n'}, 6) : AbstractC3149m.m6691F0(strReplace, new char[]{'\n'}, 6);
        int iOptInt = jSONObject.optInt("start_line", 1);
        if (iOptInt < 1) {
            iOptInt = 1;
        }
        int iOptInt2 = jSONObject.optInt("start_column", 1);
        if (iOptInt2 < 1) {
            iOptInt2 = 1;
        }
        int iM7909r = AbstractC3754e0.m7909r(jSONObject.optInt("max_lines", 400), 1, 2000);
        int iOptInt3 = jSONObject.optInt("end_line", 0);
        if (iOptInt3 > 0) {
            if (iOptInt3 < iOptInt) {
                iOptInt3 = iOptInt;
            }
            size = listM6691F0.size();
            if (iOptInt3 > size) {
                iOptInt3 = size;
            }
        } else {
            size = (iM7909r + iOptInt) - 1;
            iOptInt3 = listM6691F0.size();
            if (size <= iOptInt3) {
            }
        }
        boolean zOptBoolean = jSONObject.optBoolean("include_line_numbers", true);
        StringBuilder sb2 = new StringBuilder();
        if (iOptInt <= listM6691F0.size() && iOptInt <= iOptInt3) {
            int i11 = 0;
            int i12 = 0;
            i9 = iOptInt;
            while (true) {
                String str4 = (String) listM6691F0.get(i9 - 1);
                if (i9 == iOptInt) {
                    length = str4.length() + 1;
                    if (iOptInt2 <= length) {
                        length = iOptInt2;
                    }
                } else {
                    length = i10;
                }
                String strSubstring = str4.substring(length - 1);
                if (zOptBoolean) {
                    z9 = zOptBoolean;
                    if (length > 1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        str = str2;
                        sb3.append(":");
                        sb3.append(length);
                        sb3.append(" | ");
                        strM6836i = sb3.toString();
                    } else {
                        str = str2;
                        strM6836i = AbstractC3199a.m6836i(i9, " | ");
                    }
                } else {
                    z9 = zOptBoolean;
                    str = str2;
                    strM6836i = str;
                }
                int length2 = ((64000 - sb2.length()) - ((sb2.length() == 0 ? 1 : 0) ^ 1)) - strM6836i.length();
                if (length2 <= 0) {
                    break;
                }
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(strM6836i);
                if (strSubstring.length() > length2) {
                    sb2.append(AbstractC3149m.m6701P0(length2, strSubstring));
                    length += length2;
                    break;
                }
                sb2.append(strSubstring);
                if (i9 == iOptInt3 && iOptInt3 < listM6691F0.size()) {
                    i11 = iOptInt3 + 1;
                    i12 = 1;
                }
                if (i9 == iOptInt3) {
                    i9 = i11;
                    length = i12;
                    break;
                }
                i9++;
                zOptBoolean = z9;
                str2 = str;
                i10 = 1;
            }
        } else {
            length = 0;
            i9 = 0;
        }
        JSONObject jSONObjectM3020z = m3020z();
        jSONObjectM3020z.put("path", strM2992y);
        jSONObjectM3020z.put("startLine", iOptInt);
        jSONObjectM3020z.put("startColumn", iOptInt2);
        jSONObjectM3020z.put("endLine", iOptInt3);
        jSONObjectM3020z.put("returnedLength", sb2.length());
        jSONObjectM3020z.put("totalLength", str3.length());
        jSONObjectM3020z.put("totalLines", listM6691F0.size());
        jSONObjectM3020z.put("truncated", i9 > 0);
        if (i9 > 0) {
            jSONObjectM3020z.put("nextLine", i9);
            jSONObjectM3020z.put("nextColumn", length);
        }
        jSONObjectM3020z.put("content", sb2.toString());
        String string = jSONObjectM3020z.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m2994B() {
        if (this.f3932p) {
            C2104o.m5294t("整个插件已标记删除，不能继续修改文件");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final String m2995C() throws JSONException, IOException {
        ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
        File file = this.f3925i;
        if (!C1178t2.m3062a0(C1178t2.m3053S(file)).equals(this.f3928l)) {
            C2104o.m5294t("原插件已在任务期间发生变化，请重新读取后修改");
            return null;
        }
        File file2 = this.f3926j;
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles != null) {
            ConcurrentHashMap concurrentHashMap2 = C1178t2.f3961a;
            for (File file3 : fileArrListFiles) {
                C1178t2.m3080p(file3);
            }
        }
        if (this.f3927k) {
            ConcurrentHashMap concurrentHashMap3 = C1178t2.f3961a;
            C1178t2.m3078n(file, file2);
        }
        this.f3932p = false;
        m3007g();
        JSONObject jSONObjectM3000H = m3000H();
        jSONObjectM3000H.put("reset", true);
        jSONObjectM3000H.put("hasChanges", false);
        String string = jSONObjectM3000H.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final File m2996D(String str, boolean z9) {
        boolean zM3825a = AbstractC1416l.m3825a(str, ".");
        File file = this.f3926j;
        File canonicalFile = (zM3825a ? file : new File(file, str)).getCanonicalFile();
        File canonicalFile2 = file.getCanonicalFile();
        if (!AbstractC1416l.m3825a(canonicalFile, canonicalFile2)) {
            String path = canonicalFile.getPath();
            path.getClass();
            if (!AbstractC3156t.m6740d0(path, canonicalFile2.getPath() + File.separator, false)) {
                C2104o.m5294t("路径超出插件工作区");
                return null;
            }
        }
        if (z9 || !AbstractC1416l.m3825a(canonicalFile, canonicalFile2)) {
            canonicalFile.getClass();
            return canonicalFile;
        }
        C2104o.m5294t("不能操作插件工作区根目录");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        if (p218og.AbstractC3156t.m6740d0(r5, r0.getPath() + java.io.File.separator, false) != false) goto L10;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2997E(JSONObject jSONObject) throws JSONException, IOException {
        m2994B();
        ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
        File file = this.f3925i;
        if (!C1178t2.m3062a0(C1178t2.m3053S(file)).equals(this.f3928l)) {
            C2104o.m5294t("原插件已在任务期间发生变化，请重新读取后修改");
            return null;
        }
        String strOptString = jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        String strM2992y = m2992y(strOptString, false);
        File fileM2996D = m2996D(strM2992y, false);
        File absoluteFile = new File(file, strM2992y).getAbsoluteFile();
        File canonicalFile = absoluteFile.getCanonicalFile();
        if (absoluteFile.equals(canonicalFile)) {
            if (!AbstractC1416l.m3825a(canonicalFile, file)) {
                String path = canonicalFile.getPath();
                path.getClass();
            }
            if (!fileM2996D.exists() && !canonicalFile.exists()) {
                C2104o.m5291q("路径在原插件和工作区中都不存在: ".concat(strM2992y));
                return null;
            }
            if (fileM2996D.exists()) {
                ConcurrentHashMap concurrentHashMap2 = C1178t2.f3961a;
                C1178t2.m3080p(fileM2996D);
            }
            if (canonicalFile.exists()) {
                ConcurrentHashMap concurrentHashMap3 = C1178t2.f3961a;
                C1178t2.m3077m(canonicalFile, fileM2996D);
            }
            ConcurrentHashMap concurrentHashMap4 = C1178t2.f3961a;
            C1178t2.m3083s(this.f3926j);
            m3007g();
            JSONObject jSONObjectM3000H = m3000H();
            jSONObjectM3000H.put("path", strM2992y);
            jSONObjectM3000H.put("restored", canonicalFile.exists());
            jSONObjectM3000H.put("removedNewPath", !canonicalFile.exists());
            String string = jSONObjectM3000H.toString();
            string.getClass();
            return string;
        }
        C2104o.m5294t("恢复路径超出原插件目录或使用了符号链接");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final String m2998F(JSONObject jSONObject, C1103b c1103b) throws JSONException {
        C3147k c3147k;
        String str;
        Object obj;
        InterfaceC3012j c3011i;
        Object c3959f;
        String lowerCase;
        boolean z9;
        String str2;
        Iterator it;
        int i9;
        int iM6719r0;
        String str3;
        C2564d c2564dM6677b;
        C1174s2 c1174s2 = this;
        String strOptString = jSONObject.optString("query", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        if (AbstractC3149m.m6721t0(strOptString)) {
            C2104o.m5294t("query 不能为空");
            return null;
        }
        String strOptString2 = jSONObject.optString("path", ".");
        strOptString2.getClass();
        String strM2992y = m2992y(strOptString2, true);
        File fileM2996D = c1174s2.m2996D(strM2992y, true);
        if (!fileM2996D.exists()) {
            C2104o.m5291q("搜索路径不存在: ".concat(strM2992y));
            return null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("case_sensitive", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("regex", false);
        int iM7909r = AbstractC3754e0.m7909r(jSONObject.optInt("limit", 50), 1, 200);
        String strM1023l = AbstractC0255e.m1023l("file_pattern", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strM1023l2 = AbstractC0255e.m1023l("exclude_pattern", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            strM1023l = null;
        }
        C3147k c3147kM3065c = strM1023l != null ? C1178t2.m3065c(strM1023l) : null;
        if (AbstractC3149m.m6721t0(strM1023l2)) {
            strM1023l2 = null;
        }
        C3147k c3147kM3065c2 = strM1023l2 != null ? C1178t2.m3065c(strM1023l2) : null;
        int iM7909r2 = AbstractC3754e0.m7909r(jSONObject.optInt("before_context", 0), 0, 10);
        int iM7909r3 = AbstractC3754e0.m7909r(jSONObject.optInt("after_context", 0), 0, 10);
        if (zOptBoolean2) {
            c3147k = new C3147k(strOptString, zOptBoolean ? C4175v.f13712g : AbstractC0063p.m404N(EnumC3148l.IGNORE_CASE));
        } else {
            c3147k = null;
        }
        if (zOptBoolean) {
            str = strOptString;
        } else {
            String lowerCase2 = strOptString.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            str = lowerCase2;
        }
        JSONArray jSONArray = new JSONArray();
        if (fileM2996D.isFile()) {
            c3011i = new C0795n(fileM2996D, 3);
            obj = null;
        } else {
            obj = null;
            c3011i = new C3011i(new C0791j(fileM2996D, EnumC0792k.f2375g, (C0499x) null), true, new C1124g0(27));
        }
        Iterator it2 = c3011i.iterator();
        while (it2.hasNext()) {
            File file = (File) it2.next();
            c1103b.m2828d();
            if (jSONArray.length() >= iM7909r) {
                break;
            }
            String strM2024d0 = AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file, c1174s2.f3926j));
            if (c3147kM3065c == null || c3147kM3065c.m6683d(strM2024d0)) {
                if (c3147kM3065c2 == null || !c3147kM3065c2.m6683d(strM2024d0)) {
                    if (file.length() <= 2097152) {
                        try {
                            c3959f = AbstractC0793l.m2027g0(file);
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = obj;
                        }
                        byte[] bArr = (byte[]) c3959f;
                        if (bArr != null) {
                            ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
                            if (C1178t2.m3037C(bArr)) {
                                C3147k c3147k2 = c3147kM3065c2;
                                String strReplace = AbstractC3156t.m6737a0(new String(bArr, AbstractC3137a.f10177a), "\r\n", "\n", false).replace('\r', '\n');
                                strReplace.getClass();
                                List listM6691F0 = AbstractC3149m.m6691F0(strReplace, new char[]{'\n'}, 6);
                                int i10 = 0;
                                while (i10 < listM6691F0.size() && jSONArray.length() < iM7909r) {
                                    c1103b.m2828d();
                                    String str4 = (String) listM6691F0.get(i10);
                                    if (c3147k != null) {
                                        C3145i c3145iM6680b = C3147k.m6680b(c3147k, str4);
                                        iM6719r0 = (c3145iM6680b == null || (c2564dM6677b = c3145iM6680b.m6677b()) == null) ? -1 : c2564dM6677b.f8312g;
                                        String str5 = str;
                                        z9 = zOptBoolean;
                                        str2 = str5;
                                        it = it2;
                                        i9 = iM7909r3;
                                    } else {
                                        if (zOptBoolean) {
                                            lowerCase = str4;
                                        } else {
                                            lowerCase = str4.toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                        }
                                        String str6 = str;
                                        z9 = zOptBoolean;
                                        str2 = str6;
                                        it = it2;
                                        i9 = iM7909r3;
                                        iM6719r0 = AbstractC3149m.m6719r0(lowerCase, str2, 0, false, 6);
                                    }
                                    if (iM6719r0 >= 0) {
                                        JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("path", strM2024d0);
                                        int i11 = i10 + 1;
                                        jSONObjectM9267k.put("line", i11);
                                        str3 = str2;
                                        jSONObjectM9267k.put("column", iM6719r0 + 1);
                                        jSONObjectM9267k.put("preview", AbstractC3149m.m6701P0(500, str4));
                                        if (iM7909r2 > 0) {
                                            jSONObjectM9267k.put("before", C1178t2.m3063b(listM6691F0, i10 - iM7909r2, i10));
                                        }
                                        if (i9 > 0) {
                                            jSONObjectM9267k.put("after", C1178t2.m3063b(listM6691F0, i11, i11 + i9));
                                        }
                                        jSONArray.put(jSONObjectM9267k);
                                    } else {
                                        str3 = str2;
                                    }
                                    i10++;
                                    it2 = it;
                                    zOptBoolean = z9;
                                    iM7909r3 = i9;
                                    str = str3;
                                }
                                c1174s2 = this;
                                it2 = it2;
                                zOptBoolean = zOptBoolean;
                                iM7909r3 = iM7909r3;
                                c3147kM3065c2 = c3147k2;
                                str = str;
                            }
                        } else {
                            c1174s2 = this;
                        }
                    }
                }
            }
        }
        JSONObject jSONObjectM3020z = m3020z();
        jSONObjectM3020z.put("query", strOptString);
        jSONObjectM3020z.put("matches", jSONArray);
        jSONObjectM3020z.put("truncated", jSONArray.length() >= iM7909r);
        String string = jSONObjectM3020z.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final String m2999G(JSONObject jSONObject) throws JSONException {
        String strM1023l = AbstractC0255e.m1023l("path", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strM2992y = (AbstractC3149m.m6721t0(strM1023l) || strM1023l.equals(".")) ? "." : m2992y(strM1023l, false);
        C1154n2 c1154n2M2991J = m2991J(this, strM2992y, 2);
        if (strM2992y.equals(".")) {
            this.f3934r = this.f3931o;
        }
        JSONObject jSONObjectM3020z = m3020z();
        jSONObjectM3020z.put("path", strM2992y);
        jSONObjectM3020z.put("completeDiff", strM2992y.equals("."));
        jSONObjectM3020z.put("hasChanges", c1154n2M2991J.m2973a() || this.f3932p);
        jSONObjectM3020z.put("created", new JSONArray((Collection) c1154n2M2991J.f3825a));
        jSONObjectM3020z.put("modified", new JSONArray((Collection) c1154n2M2991J.f3826b));
        jSONObjectM3020z.put("deleted", new JSONArray((Collection) c1154n2M2991J.f3827c));
        jSONObjectM3020z.put("diff", c1154n2M2991J.f3828d);
        jSONObjectM3020z.put("truncated", c1154n2M2991J.f3829e);
        String string = jSONObjectM3020z.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final JSONObject m3000H() throws JSONException {
        JSONObject jSONObjectM3020z = m3020z();
        jSONObjectM3020z.put("staged", true);
        jSONObjectM3020z.put("persisted", false);
        jSONObjectM3020z.put("message", "变更仅写入暂存工作区，尚未提交到真实插件目录");
        return jSONObjectM3020z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final String m3001I() throws JSONException {
        Object c3959f;
        C1197z1 c1197z1;
        C1154n2 c1154n2M2991J = m2991J(this, null, 1);
        if (this.f3932p) {
            c1197z1 = new C1197z1(C4173t.f13710g);
        } else {
            try {
                ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
                c3959f = C1178t2.m3064b0(this.f3926j, this.f3924h).f3870b;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                String message = thM8182b.getMessage();
                if (message == null) {
                    message = "插件文件不完整";
                }
                c3959f = new C1197z1(AbstractC0000a.m99x0(new C1100a0(EnumC1104b0.f3555g, message, false)));
            }
            c1197z1 = (C1197z1) c3959f;
        }
        this.f3933q = this.f3931o;
        JSONObject jSONObjectM3020z = m3020z();
        jSONObjectM3020z.put("hasChanges", c1154n2M2991J.m2973a() || this.f3932p);
        jSONObjectM3020z.put("deletePlugin", this.f3932p);
        jSONObjectM3020z.put("created", new JSONArray((Collection) c1154n2M2991J.f3825a));
        jSONObjectM3020z.put("modified", new JSONArray((Collection) c1154n2M2991J.f3826b));
        jSONObjectM3020z.put("deleted", new JSONArray((Collection) c1154n2M2991J.f3827c));
        jSONObjectM3020z.put("canApply", c1197z1.m3248a());
        ArrayList arrayListM3249b = c1197z1.m3249b();
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayListM3249b));
        Iterator it = arrayListM3249b.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1100a0) it.next()).f3545b);
        }
        jSONObjectM3020z.put("errors", new JSONArray((Collection) arrayList));
        ArrayList arrayListM3250c = c1197z1.m3250c();
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayListM3250c));
        Iterator it2 = arrayListM3250c.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C1100a0) it2.next()).f3545b);
        }
        jSONObjectM3020z.put("warnings", new JSONArray((Collection) arrayList2));
        jSONObjectM3020z.put("requiresDiff", true);
        String string = jSONObjectM3020z.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final String m3002K(JSONObject jSONObject) throws JSONException, IOException {
        m2994B();
        String strOptString = jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        String strM2992y = m2992y(strOptString, false);
        File fileM2996D = m2996D(strM2992y, false);
        String strOptString2 = jSONObject.optString("content", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString2.getClass();
        byte[] bytes = strOptString2.getBytes(AbstractC3137a.f10177a);
        bytes.getClass();
        if (bytes.length > 2097152) {
            C2104o.m5294t("写入内容超过 2 MB");
            return null;
        }
        if (fileM2996D.isDirectory()) {
            C2104o.m5291q("目标是目录: ".concat(strM2992y));
            return null;
        }
        boolean zExists = fileM2996D.exists();
        if (zExists && !jSONObject.optBoolean("overwrite", false)) {
            C2104o.m5294t("文件已存在；局部修改请使用 apply_patch，完整覆盖需传 overwrite=true");
            return null;
        }
        long length = bytes.length;
        C3010h c3010h = new C3010h(new C3011i(new C0791j(this.f3926j, EnumC0792k.f2375g, (C0499x) null), true, new C1146l2(fileM2996D, 2)));
        int i9 = 1;
        while (c3010h.hasNext()) {
            i9++;
            length += ((File) c3010h.next()).length();
            if (i9 > 512) {
                C2104o.m5294t("插件文件数量超过 512");
                return null;
            }
            if (length > 33554432) {
                C2104o.m5294t("插件总大小超过 32 MB");
                return null;
            }
        }
        File parentFile = fileM2996D.getParentFile();
        if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
            C2104o.m5276A("创建父目录失败");
            return null;
        }
        C1178t2.m3061a(fileM2996D, strOptString2);
        m3007g();
        JSONObject jSONObjectM3000H = m3000H();
        jSONObjectM3000H.put("path", strM2992y);
        jSONObjectM3000H.put("created", !zExists);
        jSONObjectM3000H.put("bytes", fileM2996D.length());
        String string = jSONObjectM3000H.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized boolean m3003a(String str) {
        String str2;
        try {
            str.getClass();
            String string = AbstractC3149m.m6703R0(str).toString();
            boolean z9 = true;
            if (AbstractC3156t.m6734X(string, this.f3924h)) {
                return true;
            }
            List<C0859c0> listListPlugins = ScriptPluginRuntime.INSTANCE.listPlugins(this.f3923g);
            if (listListPlugins == null || !listListPlugins.isEmpty()) {
                for (C0859c0 c0859c0 : listListPlugins) {
                    if (c0859c0.f2626a.equalsIgnoreCase(this.f3924h) && (c0859c0.f2627b.equalsIgnoreCase(string) || ((str2 = c0859c0.f2633h) != null && str2.equalsIgnoreCase(string)))) {
                        break;
                    }
                }
                z9 = false;
            } else {
                z9 = false;
            }
            return z9;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v64, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r0v67, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x030d, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x030e, code lost:
    
        if (r22 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0314, code lost:
    
        if (r22.isEmpty() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0316, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0319, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x031a, code lost:
    
        if (r2 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0320, code lost:
    
        if (r8.isEmpty() == false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0322, code lost:
    
        p080fb.AbstractC1194y1.m3247e(r11, r2);
        r8.add(new p080fb.C1191x1(null, r2, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x032f, code lost:
    
        p136j8.C2104o.m5291q("带 @@ 的补丁不能混用无标题区块: ".concat(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0339, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x033e, code lost:
    
        if (r8.isEmpty() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0344, code lost:
    
        if (r6.equals(r11) != false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0347, code lost:
    
        p136j8.C2104o.m5291q("更新文件缺少补丁区块: ".concat(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0352, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0357, code lost:
    
        if (r8.isEmpty() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0359, code lost:
    
        r21 = r1;
        r22 = r3;
        r32 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0366, code lost:
    
        if (p218og.AbstractC3149m.m6709h0(r12, r1, false) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0368, code lost:
    
        r27 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x036b, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x036d, code lost:
    
        r0 = p218og.AbstractC3156t.m6737a0(r12, r1, r3, false).replace('\r', '\n');
        r0.getClass();
        r7 = p218og.AbstractC3149m.m6713l0(r0, '\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0384, code lost:
    
        if (r0.length() != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0386, code lost:
    
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x038d, code lost:
    
        if (r7 == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x038f, code lost:
    
        r9 = new java.util.ArrayList(p218og.AbstractC3149m.m6691F0(p218og.AbstractC3149m.m6712k0(1, r0), new char[]{'\n'}, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03a4, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03a6, code lost:
    
        r9 = new java.util.ArrayList(p218og.AbstractC3149m.m6691F0(r0, new char[]{'\n'}, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03b8, code lost:
    
        r8 = r8.iterator();
        r9 = 0;
        r12 = 0;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03c3, code lost:
    
        if (r8.hasNext() == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03c5, code lost:
    
        r17 = r8.next();
        r2 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03cb, code lost:
    
        if (r9 < 0) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03cd, code lost:
    
        r9 = (p080fb.C1191x1) r17;
        r4 = r9.f4003b;
        r10 = r9.f4004c;
        r21 = r1;
        r1 = new java.util.ArrayList();
        r4 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03e4, code lost:
    
        if (r4.hasNext() == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03e6, code lost:
    
        r22 = r3;
        r3 = r4.next();
        r26 = r4;
        r4 = (java.lang.String) r3;
        r32 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03f9, code lost:
    
        if (p218og.AbstractC3149m.m6694I0(r4, '+') != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03fb, code lost:
    
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0404, code lost:
    
        if (p218og.AbstractC3156t.m6740d0(r4, "\\ ", false) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0407, code lost:
    
        r1.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x040a, code lost:
    
        r3 = r22;
        r4 = r26;
        r5 = r32;
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0413, code lost:
    
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0416, code lost:
    
        r22 = r3;
        r32 = r5;
        r33 = r7;
        r3 = new java.util.ArrayList(tf.AbstractC4167n.m8429e1(r1));
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x042d, code lost:
    
        if (r1.hasNext() == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x042f, code lost:
    
        r3.add(((java.lang.String) r1.next()).substring(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x043e, code lost:
    
        r1 = r9.f4002a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0441, code lost:
    
        if (r1 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0443, code lost:
    
        r1 = (r1.intValue() - 1) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0449, code lost:
    
        if (r1 >= 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x044b, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x044c, code lost:
    
        r1 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0451, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0452, code lost:
    
        if (r10 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0458, code lost:
    
        if (r3.isEmpty() == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x045a, code lost:
    
        r1 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0460, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0461, code lost:
    
        if (r10 == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0463, code lost:
    
        r1 = r0.size() - r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0470, code lost:
    
        if (p080fb.AbstractC1194y1.m3243a(r0, r3, r1) == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0474, code lost:
    
        r5 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0478, code lost:
    
        if (r1 < 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x047e, code lost:
    
        if (p080fb.AbstractC1194y1.m3244b(r0, r3, r1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0481, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0482, code lost:
    
        if (r5 == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0484, code lost:
    
        r1 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x048a, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0491, code lost:
    
        if (r3.isEmpty() == false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0493, code lost:
    
        if (r1 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0495, code lost:
    
        r1 = r1.intValue();
        r4 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x049d, code lost:
    
        if (r1 <= r4) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04a0, code lost:
    
        r1 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04a4, code lost:
    
        if (r12 <= r1) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04a6, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04a7, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04aa, code lost:
    
        if (r1 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04b4, code lost:
    
        if (p080fb.AbstractC1194y1.m3243a(r0, r3, r1.intValue()) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04b6, code lost:
    
        r1 = r1.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04bf, code lost:
    
        if (r3.isEmpty() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04c1, code lost:
    
        r1 = p259r9.AbstractC3754e0.m7909r(r12, 0, r0.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04cb, code lost:
    
        r1 = r0.size() - r3.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04d4, code lost:
    
        if (r1 >= 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04d7, code lost:
    
        if (r12 >= 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04d9, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04db, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04dc, code lost:
    
        if (r5 > r1) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04e2, code lost:
    
        if (p080fb.AbstractC1194y1.m3243a(r0, r3, r5) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04e4, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04e6, code lost:
    
        if (r5 != r1) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04e9, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ec, code lost:
    
        if (r12 >= 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04ee, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04ef, code lost:
    
        if (r12 > r1) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x04f1, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04f6, code lost:
    
        if (p080fb.AbstractC1194y1.m3244b(r0, r3, r12) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x04f9, code lost:
    
        if (r5 < 0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04fc, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04fd, code lost:
    
        if (r12 != r1) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0500, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0503, code lost:
    
        if (r1 < 0) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0505, code lost:
    
        r4 = r9.f4003b;
        r5 = new java.util.ArrayList();
        r4 = r4.iterator();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0515, code lost:
    
        if (r4.hasNext() == false) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0517, code lost:
    
        r9 = (java.lang.String) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0523, code lost:
    
        if (p218og.AbstractC3149m.m6694I0(r9, ' ') == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0525, code lost:
    
        r5.add(r0.get(r1 + r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x052e, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0539, code lost:
    
        if (p218og.AbstractC3149m.m6694I0(r9, '-') == false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0542, code lost:
    
        if (p218og.AbstractC3149m.m6694I0(r9, '+') == false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0544, code lost:
    
        r5.add(r9.substring(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x054d, code lost:
    
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0554, code lost:
    
        if (r7 >= r4) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0556, code lost:
    
        r0.remove(r1);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x055c, code lost:
    
        r0.addAll(r1, r5);
        r12 = r5.size() + r1;
        r14 = r14 + (r5.size() - r3.size());
        r9 = r2;
        r1 = r21;
        r3 = r22;
        r5 = r32;
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05a3, code lost:
    
        throw new java.lang.IllegalArgumentException(("第 " + r2 + " 个补丁区块在 " + r11 + " 中找不到匹配上下文，请重新读取文件").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x05a4, code lost:
    
        p000a.AbstractC0000a.m32Q0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x05a9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05aa, code lost:
    
        r21 = r1;
        r22 = r3;
        r32 = r5;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05b6, code lost:
    
        if (r0.isEmpty() == false) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05b8, code lost:
    
        r12 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05bb, code lost:
    
        r0 = tf.AbstractC4166m.m8392A1(r0, r27, null, null, null, 62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05c9, code lost:
    
        if (r33 == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05cb, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05ce, code lost:
    
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05d0, code lost:
    
        r12 = r0.concat(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05d9, code lost:
    
        if (r6.equals(r11) != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05db, code lost:
    
        r1 = r25;
        p080fb.AbstractC1194y1.m3246d(r1, r13, new p080fb.C1188w1(r11, null, "move-source", r11));
        p080fb.AbstractC1194y1.m3246d(r1, r13, new p080fb.C1188w1(r6, r12, "move", r11));
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05f5, code lost:
    
        r1 = r25;
        r3 = r23;
        p080fb.AbstractC1194y1.m3246d(r1, r13, new p080fb.C1188w1(r11, r12, "update", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0603, code lost:
    
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0215, code lost:
    
        r23 = r9;
        r25 = r10;
        r22 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02ca, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0309 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m3004b(JSONObject jSONObject) throws JSONException, IOException {
        C0361f c0361f;
        String str;
        String str2;
        List list;
        String str3;
        LinkedHashMap linkedHashMap;
        int i9;
        String strM2992y;
        String str4;
        LinkedHashMap linkedHashMap2;
        boolean z9;
        String str5;
        m2994B();
        String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        String strOptString = jSONObject.optString("patch", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        if (AbstractC3149m.m6721t0(strOptString)) {
            C2104o.m5294t("patch 不能为空");
            return null;
        }
        strOptString.getBytes(AbstractC3137a.f10177a).getClass();
        if (r0.length > 4194304) {
            C2104o.m5294t("补丁超过 4 MB");
            return null;
        }
        C3147k c3147k = AbstractC1194y1.f4014a;
        C0361f c0361f2 = new C0361f(1, this, AbstractC0921a.m2246i(C1174s2.class), "readPatchText", "readPatchText(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 14);
        String str7 = "\r\n";
        String str8 = "\n";
        boolean z10 = false;
        String strReplace = AbstractC3156t.m6737a0(strOptString, "\r\n", "\n", false).replace('\r', '\n');
        strReplace.getClass();
        List listM6691F0 = AbstractC3149m.m6691F0(AbstractC3149m.m6706U0(strReplace, '\n'), new char[]{'\n'}, 6);
        if (!AbstractC1416l.m3825a(AbstractC4166m.m8424v1(listM6691F0), "*** Begin Patch")) {
            C2104o.m5294t("补丁必须以 *** Begin Patch 开始");
            return null;
        }
        if (!AbstractC1416l.m3825a(AbstractC4166m.m8394C1(listM6691F0), "*** End Patch")) {
            C2104o.m5294t("补丁必须以 *** End Patch 结束");
            return null;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        int i10 = 1;
        for (int i11 = 1; i10 < listM6691F0.size() - i11; i11 = 1) {
            String str9 = (String) listM6691F0.get(i10);
            if (AbstractC3156t.m6740d0(str9, "*** Add File: ", z10)) {
                String string = AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(str9, "*** Add File: ")).toString();
                string.getClass();
                String strM2992y2 = m2992y(string, z10);
                if (AbstractC1194y1.m3245c(linkedHashMap3, c0361f2, strM2992y2) != null) {
                    C2104o.m5291q("新增文件已存在: ".concat(strM2992y2));
                    return null;
                }
                i10++;
                ArrayList arrayList = new ArrayList();
                while (i10 < listM6691F0.size() - 1 && !AbstractC3156t.m6740d0((String) listM6691F0.get(i10), "*** ", z10)) {
                    int i12 = i10 + 1;
                    String str10 = (String) listM6691F0.get(i10);
                    if (!AbstractC3149m.m6694I0(str10, '+')) {
                        C2104o.m5291q("新增文件内容每行必须以 + 开头: ".concat(strM2992y2));
                        return null;
                    }
                    arrayList.add(str10.substring(i11));
                    i10 = i12;
                }
                AbstractC1194y1.m3246d(linkedHashMap3, linkedHashMap4, new C1188w1(strM2992y2, arrayList.isEmpty() ? str6 : AbstractC4166m.m8392A1(arrayList, "\n", null, "\n", null, 58), "add", str6));
            } else if (AbstractC3156t.m6740d0(str9, "*** Delete File: ", z10)) {
                String string2 = AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(str9, "*** Delete File: ")).toString();
                string2.getClass();
                String strM2992y3 = m2992y(string2, z10);
                if (AbstractC1194y1.m3245c(linkedHashMap3, c0361f2, strM2992y3) == null) {
                    C2104o.m5291q("删除文件不存在: ".concat(strM2992y3));
                    return null;
                }
                AbstractC1194y1.m3246d(linkedHashMap3, linkedHashMap4, new C1188w1(strM2992y3, null, "delete", str6));
                i10++;
            } else {
                if (AbstractC3156t.m6740d0(str9, "*** Update File: ", z10)) {
                    String string3 = AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(str9, "*** Update File: ")).toString();
                    string3.getClass();
                    String strM2992y4 = m2992y(string3, z10);
                    String strM3245c = AbstractC1194y1.m3245c(linkedHashMap3, c0361f2, strM2992y4);
                    if (strM3245c == null) {
                        throw new IllegalStateException("更新文件不存在: ".concat(strM2992y4).toString());
                    }
                    int i13 = i10 + 1;
                    if (i13 < listM6691F0.size() - 1) {
                        i9 = i11;
                        if (AbstractC3156t.m6740d0((String) listM6691F0.get(i13), "*** Move to: ", z10)) {
                            String string4 = AbstractC3149m.m6703R0(AbstractC3149m.m6686A0((String) listM6691F0.get(i13), "*** Move to: ")).toString();
                            string4.getClass();
                            strM2992y = m2992y(string4, z10);
                            if (strM2992y.equals(strM2992y4)) {
                                C2104o.m5291q("移动目标与源文件相同: ".concat(strM2992y4));
                                return null;
                            }
                            if (AbstractC1194y1.m3245c(linkedHashMap3, c0361f2, strM2992y) != null) {
                                C2104o.m5300z(strM2992y, "移动目标已存在: ");
                                return null;
                            }
                            i13 = i10 + 2;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = null;
                        while (true) {
                            if (i13 < listM6691F0.size() - 1) {
                                c0361f = c0361f2;
                                break;
                            }
                            c0361f = c0361f2;
                            if (AbstractC3156t.m6740d0((String) listM6691F0.get(i13), "*** ", false) && !AbstractC1416l.m3825a(listM6691F0.get(i13), "*** End of File")) {
                                break;
                            }
                            int i14 = i13 + 1;
                            String str11 = (String) listM6691F0.get(i13);
                            if (AbstractC1416l.m3825a(str11, "*** End of File")) {
                                i13 = i14;
                                String str12 = str6;
                                LinkedHashMap linkedHashMap5 = linkedHashMap3;
                                ArrayList arrayList4 = arrayList3;
                                boolean z11 = i9;
                                break;
                            }
                            ArrayList arrayList5 = arrayList3;
                            if (AbstractC3156t.m6740d0(str11, "@@", false)) {
                                Matcher matcher = AbstractC1194y1.f4014a.f10206g.matcher(str11);
                                matcher.getClass();
                                C3145i c3145i = !matcher.matches() ? null : new C3145i(matcher, str11);
                                Integer numM6741e0 = (c3145i == null || (str5 = (String) AbstractC4166m.m8425w1(i9, c3145i.m6676a())) == null) ? null : AbstractC3156t.m6741e0(10, str5);
                                ArrayList arrayList6 = new ArrayList();
                                i13 = i14;
                                while (true) {
                                    str4 = str6;
                                    if (i13 >= listM6691F0.size() - 1) {
                                        linkedHashMap2 = linkedHashMap3;
                                        break;
                                    }
                                    linkedHashMap2 = linkedHashMap3;
                                    if (AbstractC3156t.m6740d0((String) listM6691F0.get(i13), "@@", false) || (AbstractC3156t.m6740d0((String) listM6691F0.get(i13), "*** ", false) && !AbstractC1416l.m3825a(listM6691F0.get(i13), "*** End of File"))) {
                                        break;
                                    }
                                    if (AbstractC1416l.m3825a(listM6691F0.get(i13), "*** End of File")) {
                                        i13++;
                                        z9 = true;
                                        break;
                                    }
                                    arrayList6.add(listM6691F0.get(i13));
                                    i13++;
                                    str6 = str4;
                                    linkedHashMap3 = linkedHashMap2;
                                }
                                if (arrayList6.isEmpty()) {
                                    C2104o.m5291q("补丁区块不能为空: ".concat(strM2992y4));
                                    return null;
                                }
                                AbstractC1194y1.m3247e(strM2992y4, arrayList6);
                                arrayList2.add(new C1191x1(numM6741e0, arrayList6, z9));
                                arrayList3 = arrayList5;
                            } else {
                                str4 = str6;
                                linkedHashMap2 = linkedHashMap3;
                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                arrayList3.add(str11);
                                i13 = i14;
                            }
                            c0361f2 = c0361f;
                            str6 = str4;
                            linkedHashMap3 = linkedHashMap2;
                            i9 = 1;
                        }
                    } else {
                        i9 = i11;
                    }
                    strM2992y = strM2992y4;
                    ArrayList arrayList22 = new ArrayList();
                    ArrayList arrayList32 = null;
                    while (true) {
                        if (i13 < listM6691F0.size() - 1) {
                        }
                        c0361f2 = c0361f;
                        str6 = str4;
                        linkedHashMap3 = linkedHashMap2;
                        i9 = 1;
                    }
                } else {
                    c0361f = c0361f2;
                    str = str7;
                    str2 = str8;
                    list = listM6691F0;
                    str3 = str6;
                    linkedHashMap = linkedHashMap3;
                    if (!AbstractC3149m.m6721t0(str9)) {
                        throw new IllegalStateException("未知补丁指令: ".concat(str9).toString());
                    }
                    i10++;
                }
                linkedHashMap3 = linkedHashMap;
                str6 = str3;
                c0361f2 = c0361f;
                str7 = str;
                str8 = str2;
                listM6691F0 = list;
                z10 = false;
            }
            c0361f = c0361f2;
            str = str7;
            str2 = str8;
            list = listM6691F0;
            str3 = str6;
            linkedHashMap = linkedHashMap3;
            linkedHashMap3 = linkedHashMap;
            str6 = str3;
            c0361f2 = c0361f;
            str7 = str;
            str8 = str2;
            listM6691F0 = list;
            z10 = false;
        }
        String str13 = str6;
        if (linkedHashMap4.isEmpty()) {
            C2104o.m5294t("补丁没有文件变更");
            return null;
        }
        Collection collectionValues = linkedHashMap4.values();
        collectionValues.getClass();
        List<C1188w1> listM8407P1 = AbstractC4166m.m8407P1(collectionValues);
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        File file = this.f3926j;
        C3010h c3010h = new C3010h(new C3011i(new C0791j(file, EnumC0792k.f2375g, (C0499x) null), true, new C1124g0(28)));
        while (c3010h.hasNext()) {
            File file2 = (File) c3010h.next();
            linkedHashMap6.put(AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file2, file)), Long.valueOf(file2.length()));
        }
        for (C1188w1 c1188w1 : listM8407P1) {
            String str14 = c1188w1.f3996b;
            String str15 = c1188w1.f3995a;
            if (str14 == null) {
                linkedHashMap6.remove(str15);
            } else {
                byte[] bytes = str14.getBytes(AbstractC3137a.f10177a);
                bytes.getClass();
                long length = bytes.length;
                if (length > 2097152) {
                    C2104o.m5291q(AbstractC0255e.m1020i(str15, " 超过 2 MB"));
                    return null;
                }
                linkedHashMap6.put(str15, Long.valueOf(length));
            }
        }
        if (linkedHashMap6.size() > 512) {
            C2104o.m5294t("插件文件数量超过 512");
            return null;
        }
        Collection collectionValues2 = linkedHashMap6.values();
        collectionValues2.getClass();
        Iterator it = collectionValues2.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        if (jLongValue > 33554432) {
            C2104o.m5294t("插件总大小超过 32 MB");
            return null;
        }
        ArrayList<C1188w1> arrayList7 = new ArrayList();
        for (Object obj : listM8407P1) {
            if (((C1188w1) obj).f3996b == null) {
                arrayList7.add(obj);
            }
        }
        for (C1188w1 c1188w12 : arrayList7) {
            File fileM2996D = m2996D(c1188w12.f3995a, false);
            if (fileM2996D.exists()) {
                if (!fileM2996D.isFile()) {
                    C2104o.m5291q(AbstractC4855en.m9263g("统一补丁只能删除文件: ", c1188w12.f3995a));
                    return null;
                }
                ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
                C1178t2.m3080p(fileM2996D);
            }
        }
        ArrayList<C1188w1> arrayList8 = new ArrayList();
        for (Object obj2 : listM8407P1) {
            if (((C1188w1) obj2).f3996b != null) {
                arrayList8.add(obj2);
            }
        }
        for (C1188w1 c1188w13 : arrayList8) {
            String str16 = c1188w13.f3995a;
            File fileM2996D2 = m2996D(str16, false);
            if (fileM2996D2.isDirectory()) {
                File[] fileArrListFiles = fileM2996D2.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                if (fileArrListFiles.length == 0 && !fileM2996D2.delete()) {
                    C0086a.m449h(AbstractC4855en.m9263g("替换空目录失败: ", str16));
                    return null;
                }
            }
            if (fileM2996D2.isDirectory()) {
                C2104o.m5291q(AbstractC4855en.m9263g("统一补丁目标是目录: ", str16));
                return null;
            }
            File parentFile = fileM2996D2.getParentFile();
            if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                C0086a.m449h(AbstractC4855en.m9263g("创建父目录失败: ", str16));
                return null;
            }
            ConcurrentHashMap concurrentHashMap2 = C1178t2.f3961a;
            String str17 = c1188w13.f3996b;
            if (str17 == null) {
                str17 = str13;
            }
            C1178t2.m3061a(fileM2996D2, str17);
        }
        m3007g();
        JSONObject jSONObjectM3000H = m3000H();
        JSONArray jSONArray = new JSONArray();
        for (C1188w1 c1188w14 : listM8407P1) {
            JSONObject jSONObject2 = new JSONObject();
            String str18 = c1188w14.f3995a;
            String str19 = c1188w14.f3998d;
            jSONObject2.put("path", str18);
            jSONObject2.put("operation", c1188w14.f3997c);
            if (!AbstractC3149m.m6721t0(str19)) {
                jSONObject2.put("sourcePath", str19);
            }
            String str20 = c1188w14.f3996b;
            if (str20 != null) {
                byte[] bytes2 = str20.getBytes(AbstractC3137a.f10177a);
                bytes2.getClass();
                jSONObject2.put("bytes", bytes2.length);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObjectM3000H.put("files", jSONArray);
        String string5 = jSONObjectM3000H.toString();
        string5.getClass();
        return string5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized C1134i2 m3005c() {
        C1162p2 c1162p2M3064b0;
        String str;
        int i9 = this.f3933q;
        int i10 = this.f3931o;
        if (i9 != i10) {
            throw new IllegalStateException("完成前必须对当前版本调用 workspace_status");
        }
        if (this.f3934r != i10) {
            throw new IllegalStateException("完成前必须对当前版本调用 show_diff");
        }
        C1154n2 c1154n2M2991J = m2991J(this, null, 3);
        if (!c1154n2M2991J.m2973a() && !this.f3932p) {
            return null;
        }
        if (this.f3932p) {
            c1162p2M3064b0 = null;
        } else {
            ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
            c1162p2M3064b0 = C1178t2.m3064b0(this.f3926j, this.f3924h);
        }
        C1192y c1192y = c1162p2M3064b0 != null ? c1162p2M3064b0.f3869a : null;
        C1197z1 c1197z1 = c1162p2M3064b0 != null ? c1162p2M3064b0.f3870b : null;
        if (c1197z1 != null ? !c1197z1.m3248a() : false) {
            Iterable iterableM3249b = c1197z1 != null ? c1197z1.m3249b() : null;
            if (iterableM3249b == null) {
                iterableM3249b = C4173t.f13710g;
            }
            throw new IllegalStateException(AbstractC4166m.m8392A1(iterableM3249b, "；", null, null, new C1124g0(26), 30).toString());
        }
        C1197z1 c1197z12 = c1197z1;
        String str2 = this.f3924h;
        if (c1192y == null || (str = c1192y.f4005a) == null) {
            str = this.f3930n;
        }
        String canonicalPath = this.f3926j.getCanonicalPath();
        canonicalPath.getClass();
        String str3 = str;
        boolean z9 = this.f3927k;
        String str4 = this.f3928l;
        List list = c1154n2M2991J.f3825a;
        List list2 = c1154n2M2991J.f3826b;
        List list3 = c1154n2M2991J.f3827c;
        String str5 = c1154n2M2991J.f3828d;
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC4166m.m8397F1(AbstractC4166m.m8397F1(list, list2), c1154n2M2991J.f3827c)));
        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(listM8407P1));
        if (iM8438a0 < 16) {
            iM8438a0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
        Iterator it = listM8407P1.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Iterator it2 = it;
            String str6 = (String) this.f3929m.get((String) next);
            if (str6 == null) {
                str6 = "missing";
            }
            linkedHashMap.put(next, str6);
            it = it2;
        }
        boolean z10 = this.f3932p;
        List listM3250c = c1197z12 != null ? c1197z12.m3250c() : null;
        if (listM3250c == null) {
            listM3250c = C4173t.f13710g;
        }
        return new C1134i2(str2, str3, canonicalPath, z9, str4, list, list2, list3, str5, c1192y, linkedHashMap, z10, listM3250c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
            C1178t2.m3081q(this.f3926j);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public final synchronized String m3006e(String str, JSONObject jSONObject, C1103b c1103b) {
        String strM2999G;
        try {
            c1103b.m2828d();
            String strOptString = jSONObject.optString("plugin_id", HttpUrl.FRAGMENT_ENCODE_SET);
            strOptString.getClass();
            if (!m3003a(strOptString)) {
                throw new IllegalArgumentException("本轮只能操作插件 ".concat(this.f3924h).toString());
            }
            ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
            String strM3039E = C1178t2.m3039E(str);
            switch (strM3039E.hashCode()) {
                case -1903804409:
                    if (strM3039E.equals("show_diff")) {
                        strM2999G = m2999G(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
                case -1526776777:
                    if (strM3039E.equals("apply_patch")) {
                        strM2999G = m3004b(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
                case -1356730971:
                    if (strM3039E.equals("reset_workspace")) {
                        strM2999G = m2995C();
                        c1103b.m2828d();
                    }
                    break;
                case -1121949127:
                    if (strM3039E.equals("delete_path")) {
                        strM2999G = m3010k(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
                case -1113857403:
                    if (strM3039E.equals("read_file")) {
                        strM2999G = m2993A(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
                case -636524068:
                    if (strM3039E.equals("write_file")) {
                        strM2999G = m3002K(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
                case -146128825:
                    if (strM3039E.equals("delete_plugin")) {
                        strM2999G = m3011l();
                        c1103b.m2828d();
                    }
                    break;
                case -38568228:
                    if (strM3039E.equals("workspace_status")) {
                        strM2999G = m3001I();
                        c1103b.m2828d();
                    }
                    break;
                case 450667808:
                    if (strM3039E.equals("search_files")) {
                        strM2999G = m2998F(jSONObject, c1103b);
                        c1103b.m2828d();
                    }
                    break;
                case 695361430:
                    if (strM3039E.equals("list_files")) {
                        strM2999G = m3018w(jSONObject, c1103b);
                        c1103b.m2828d();
                    }
                    break;
                case 1068342227:
                    if (strM3039E.equals("move_path")) {
                        strM2999G = m3019x(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
                case 1648866102:
                    if (strM3039E.equals("restore_path")) {
                        strM2999G = m2997E(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
                case 1675538154:
                    if (strM3039E.equals("create_directory")) {
                        strM2999G = m3009i(jSONObject);
                        c1103b.m2828d();
                    }
                    break;
            }
            throw new IllegalStateException("未知插件工作区工具: ".concat(str).toString());
        } finally {
        }
        return strM2999G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3007g() {
        this.f3931o++;
        this.f3933q = -1;
        this.f3934r = -1;
        this.f3926j.setLastModified(System.currentTimeMillis());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized C1138j2 m3008h() {
        long jCurrentTimeMillis;
        String canonicalPath;
        String str;
        boolean z9;
        String str2;
        jCurrentTimeMillis = System.currentTimeMillis();
        this.f3926j.setLastModified(jCurrentTimeMillis);
        canonicalPath = this.f3926j.getCanonicalPath();
        canonicalPath.getClass();
        str = this.f3924h;
        z9 = this.f3927k;
        str2 = this.f3928l;
        ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
        return new C1138j2(canonicalPath, str, z9, str2, C1178t2.m3062a0(C1178t2.m3053S(this.f3926j)), this.f3929m, this.f3930n, this.f3931o, this.f3933q, this.f3934r, this.f3932p, jCurrentTimeMillis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m3009i(JSONObject jSONObject) throws JSONException {
        m2994B();
        String strOptString = jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        String strM2992y = m2992y(strOptString, false);
        File fileM2996D = m2996D(strM2992y, false);
        if (fileM2996D.isFile()) {
            C2104o.m5291q("同名文件已存在: ".concat(strM2992y));
            return null;
        }
        boolean zIsDirectory = fileM2996D.isDirectory();
        boolean z9 = !zIsDirectory;
        if (!zIsDirectory && !fileM2996D.mkdirs()) {
            C0086a.m449h("创建目录失败: ".concat(strM2992y));
            return null;
        }
        if (!zIsDirectory) {
            m3007g();
        }
        JSONObject jSONObjectM3000H = m3000H();
        jSONObjectM3000H.put("path", strM2992y);
        jSONObjectM3000H.put("created", z9);
        String string = jSONObjectM3000H.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m3010k(JSONObject jSONObject) throws JSONException {
        m2994B();
        String strOptString = jSONObject.optString("path", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        String strM2992y = m2992y(strOptString, false);
        File fileM2996D = m2996D(strM2992y, false);
        if (!fileM2996D.exists()) {
            C2104o.m5291q("路径不存在: ".concat(strM2992y));
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
        C1178t2.m3080p(fileM2996D);
        m3007g();
        JSONObject jSONObjectM3000H = m3000H();
        jSONObjectM3000H.put("path", strM2992y);
        String string = jSONObjectM3000H.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m3011l() throws JSONException {
        File[] fileArrListFiles;
        if (!this.f3927k) {
            C2104o.m5294t("新插件尚未存在，不能删除整个插件");
            return null;
        }
        boolean z9 = this.f3932p;
        if (!z9 && (fileArrListFiles = this.f3926j.listFiles()) != null) {
            ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
            for (File file : fileArrListFiles) {
                C1178t2.m3080p(file);
            }
        }
        this.f3932p = true;
        if (!z9) {
            m3007g();
        }
        JSONObject jSONObjectM3000H = m3000H();
        jSONObjectM3000H.put("deletePlugin", true);
        jSONObjectM3000H.put("requiresConfirmation", true);
        String string = jSONObjectM3000H.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m3012m(File file) {
        String strM2024d0 = AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file, this.f3926j));
        int i9 = 0;
        for (int i10 = 0; i10 < strM2024d0.length(); i10++) {
            if (strM2024d0.charAt(i10) == '/') {
                i9++;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final synchronized void m3013o() {
        File parentFile = this.f3925i.getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException("插件根目录无效");
        }
        ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
        C1178t2.m3048N(parentFile);
        C1178t2.m3087w(parentFile, "脚本插件根目录");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final JSONObject m3014q(File file) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file, this.f3926j)));
        jSONObject.put("type", file.isDirectory() ? "directory" : "file");
        if (file.isFile()) {
            jSONObject.put("size", file.length());
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final String m3015s() {
        return this.f3924h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m3016t() {
        return this.f3931o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final synchronized boolean m3017u() {
        boolean z9;
        z9 = true;
        if (!this.f3932p) {
            if (!m2991J(this, null, 1).m2973a()) {
                z9 = false;
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final String m3018w(JSONObject jSONObject, C1103b c1103b) throws JSONException {
        String strOptString = jSONObject.optString("path", ".");
        strOptString.getClass();
        String strM2992y = m2992y(strOptString, true);
        File fileM2996D = m2996D(strM2992y, true);
        if (!fileM2996D.exists()) {
            C2104o.m5291q("路径不存在: ".concat(strM2992y));
            return null;
        }
        boolean zOptBoolean = jSONObject.optBoolean("recursive", false);
        int iM7909r = AbstractC3754e0.m7909r(jSONObject.optInt("max_depth", 3), 1, 8);
        JSONArray jSONArray = new JSONArray();
        if (fileM2996D.isFile()) {
            jSONArray.put(m3014q(fileM2996D));
        } else {
            int iM3012m = m3012m(fileM2996D);
            for (File file : AbstractC3015m.m6416Z(new C3011i(new C0791j(fileM2996D, EnumC0792k.f2375g, new C0499x(c1103b, zOptBoolean, fileM2996D)), true, new C1146l2(fileM2996D, 1)), 500)) {
                c1103b.m2828d();
                if (!zOptBoolean || m3012m(file) - iM3012m <= iM7909r) {
                    if (zOptBoolean || AbstractC1416l.m3825a(file.getParentFile(), fileM2996D)) {
                        jSONArray.put(m3014q(file));
                    }
                }
            }
        }
        JSONObject jSONObjectM3020z = m3020z();
        jSONObjectM3020z.put("path", strM2992y);
        jSONObjectM3020z.put("items", jSONArray);
        jSONObjectM3020z.put("truncated", jSONArray.length() >= 500);
        String string = jSONObjectM3020z.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final String m3019x(JSONObject jSONObject) throws JSONException, IOException {
        m2994B();
        String strOptString = jSONObject.optString("source", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString.getClass();
        String strM2992y = m2992y(strOptString, false);
        String strOptString2 = jSONObject.optString("destination", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString2.getClass();
        String strM2992y2 = m2992y(strOptString2, false);
        File fileM2996D = m2996D(strM2992y, false);
        File fileM2996D2 = m2996D(strM2992y2, false);
        if (!fileM2996D.exists()) {
            C2104o.m5291q("源路径不存在: ".concat(strM2992y));
            return null;
        }
        if (fileM2996D.equals(fileM2996D2)) {
            C2104o.m5294t("源路径和目标路径相同");
            return null;
        }
        if (fileM2996D.isDirectory()) {
            String canonicalPath = fileM2996D2.getCanonicalPath();
            canonicalPath.getClass();
            if (AbstractC3156t.m6740d0(canonicalPath, fileM2996D.getCanonicalPath() + File.separator, false)) {
                C2104o.m5294t("不能把目录移动到自身内部");
                return null;
            }
        }
        if (fileM2996D2.exists()) {
            if (!jSONObject.optBoolean("overwrite", false)) {
                C2104o.m5291q("目标路径已存在: ".concat(strM2992y2));
                return null;
            }
            ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
            C1178t2.m3080p(fileM2996D2);
        }
        File parentFile = fileM2996D2.getParentFile();
        if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
            C2104o.m5276A("创建目标父目录失败");
            return null;
        }
        if (!fileM2996D.renameTo(fileM2996D2)) {
            C2104o.m5276A("移动路径失败");
            return null;
        }
        m3007g();
        JSONObject jSONObjectM3000H = m3000H();
        jSONObjectM3000H.put("source", strM2992y);
        jSONObjectM3000H.put("destination", strM2992y2);
        String string = jSONObjectM3000H.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final JSONObject m3020z() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ok", true);
        jSONObject.put("pluginId", this.f3924h);
        jSONObject.put("revision", this.f3931o);
        return jSONObject;
    }
}
