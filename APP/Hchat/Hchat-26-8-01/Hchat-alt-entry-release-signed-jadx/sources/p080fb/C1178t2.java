package p080fb;

import android.content.Context;
import android.os.Process;
import android.system.Os;
import android.system.StructStat;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1423s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p025bc.C0260j;
import p036c9.C0499x;
import p054dg.AbstractC0793l;
import p054dg.C0789h;
import p054dg.C0791j;
import p054dg.EnumC0792k;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p092g4.AbstractC1341a;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p172lg.C2563c;
import p172lg.C2564d;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3963j;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import p343x6.AbstractC5700d;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.AbstractC4178y;
import tf.C4150a0;
import tf.C4173t;
import tf.C4174u;
import tf.C4179z;

/* JADX INFO: renamed from: fb.t2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1178t2 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f3961a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static final Set f3962b = AbstractC4156d0.m8355W("check_access", "list_files", "read_file", "search_files", "create_directory", "write_file", "apply_patch", "move_path", "delete_path", "restore_path", "reset_workspace", "delete_plugin", "show_diff", "workspace_status");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static JSONObject m3035A(String str, int i9, int i10, Integer num) throws JSONException {
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
    public static final boolean m3036B(String str) {
        str.getClass();
        String strM6686A0 = AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(str).toString(), "local.");
        return AbstractC3156t.m6740d0(strM6686A0, "hchat.workspace.", false) && f3962b.contains(m3039E(strM6686A0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m3037C(byte[] bArr) {
        int iMin = Math.min(bArr.length, 8192);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 < iMin) {
                int i11 = bArr[i9] & 255;
                if (i11 == 0) {
                    break;
                }
                if (i11 < 9 || (14 <= i11 && i11 < 32)) {
                    i10++;
                }
                i9++;
            } else if (iMin == 0 || i10 * 10 < iMin) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static final boolean m3038D(String str) {
        return AbstractC4156d0.m8355W("create_directory", "write_file", "apply_patch", "move_path", "delete_path", "restore_path", "reset_workspace", "delete_plugin").contains(m3039E(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m3039E(String str) {
        return AbstractC3149m.m6686A0(AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(str).toString(), "local."), "hchat.workspace.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final C1174s2 m3040F(Context context, String str) throws NoSuchAlgorithmException, IOException {
        Object next;
        Map mapM3053S;
        String str2;
        String str3;
        str.getClass();
        m3074j(context);
        ScriptPluginRuntime scriptPluginRuntime = ScriptPluginRuntime.INSTANCE;
        File canonicalFile = scriptPluginRuntime.ensureDirs(context).getCanonicalFile();
        canonicalFile.getClass();
        m3048N(canonicalFile);
        m3047M(canonicalFile);
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            C2104o.m5294t("plugin_id 不能为空");
            return null;
        }
        Iterator<T> it = scriptPluginRuntime.listPlugins(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C0859c0 c0859c0 = (C0859c0) next;
            if (c0859c0.f2626a.equalsIgnoreCase(string) || c0859c0.f2627b.equalsIgnoreCase(string) || ((str3 = c0859c0.f2633h) != null && str3.equalsIgnoreCase(string))) {
                break;
            }
        }
        C0859c0 c0859c02 = (C0859c0) next;
        if (c0859c02 != null) {
            string = c0859c02.f2626a;
        }
        String str4 = string;
        if (!str4.equals(AbstractC1102a2.m2823e(str4)) || AbstractC3149m.m6709h0(str4, "..", false)) {
            C2104o.m5294t("plugin_id 包含不允许的路径字符");
            return null;
        }
        File absoluteFile = new File(canonicalFile, str4).getAbsoluteFile();
        File canonicalFile2 = absoluteFile.getCanonicalFile();
        if (!AbstractC1416l.m3825a(canonicalFile2.getParentFile(), canonicalFile) || !absoluteFile.equals(canonicalFile2)) {
            C2104o.m5294t("插件目录不在脚本根目录内或使用了符号链接");
            return null;
        }
        boolean zIsDirectory = canonicalFile2.isDirectory();
        if (zIsDirectory) {
            m3085u(canonicalFile2);
        }
        File file = new File(m3066c0(context), UUID.randomUUID().toString());
        if (!file.mkdirs()) {
            C2104o.m5276A("创建插件暂存工作区失败");
            return null;
        }
        try {
            if (zIsDirectory) {
                m3083s(canonicalFile2);
                m3078n(canonicalFile2, file);
                mapM3053S = m3053S(file);
            } else {
                mapM3053S = C4174u.f13711g;
            }
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            String strM3062a0 = m3062a0(mapM3053S);
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC4178y.m8438a0(mapM3053S.size()));
            for (Map.Entry entry : mapM3053S.entrySet()) {
                linkedHashMap.put(entry.getKey(), m3052R((C1166q2) entry.getValue()));
            }
            if (c0859c02 != null && (str = c0859c02.f2633h) != null) {
                str2 = str;
            } else if (c0859c02 != null) {
                String str5 = c0859c02.f2627b;
                str2 = str5;
            } else {
                str2 = str4;
            }
            return new C1174s2(context2, str4, canonicalFile2, file, zIsDirectory, strM3062a0, linkedHashMap, str2, 0, -1, -1, false);
        } catch (Throwable th2) {
            try {
                m3081q(file);
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (p218og.AbstractC3156t.m6740d0(r0, r5.getPath() + java.io.File.separator, false) != false) goto L8;
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m3041G(File file, String str) throws IOException {
        File absoluteFile = new File(file, str).getAbsoluteFile();
        File canonicalFile = absoluteFile.getCanonicalFile();
        if (absoluteFile.equals(canonicalFile)) {
            if (!AbstractC1416l.m3825a(canonicalFile, file)) {
                String path = canonicalFile.getPath();
                path.getClass();
            }
            return m3052R(!canonicalFile.exists() ? null : canonicalFile.isDirectory() ? new C1166q2(true, 0L, HttpUrl.FRAGMENT_ENCODE_SET) : new C1166q2(false, canonicalFile.length(), m3089y(canonicalFile)));
        }
        C2104o.m5291q(AbstractC4855en.m9263g("变更路径超出插件目录或使用了符号链接: ", str));
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: H */
    public static C1158o2 m3042H(File file) {
        Object c3959f;
        FileOutputStream fileOutputStream;
        if (!file.isDirectory()) {
            return new C1158o2(false, "目录不存在");
        }
        if (!file.canWrite() || !file.canExecute()) {
            return new C1158o2(false, "File.canWrite/canExecute=false");
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        File file2 = new File(file, ".hchat-agent-access-".concat(AbstractC3149m.m6701P0(8, string)));
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        try {
            fileOutputStream.write(0);
            fileOutputStream.close();
            if (!file2.delete()) {
                throw new IllegalStateException("无法清理权限探针");
            }
            c3959f = new C1158o2(true, "写入探针成功");
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                try {
                    file2.delete();
                } catch (Throwable unused) {
                }
                String simpleName = thM8182b.getClass().getSimpleName();
                String message = thM8182b.getMessage();
                if (message == null) {
                    message = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(message)) {
                    message = "未知写入错误";
                }
                c3959f = new C1158o2(false, simpleName + ": " + ((Object) message));
            }
            return (C1158o2) c3959f;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static C1170r2 m3043I(File file) {
        if (!file.exists()) {
            return new C1170r2(C4173t.f13710g, true);
        }
        ArrayList arrayList = new ArrayList();
        m3044J(arrayList, new C1423s(), file, file);
        return new C1170r2(arrayList, arrayList.isEmpty());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static final void m3044J(ArrayList arrayList, C1423s c1423s, File file, File file2) {
        Object c3959f;
        Object c3959f2;
        if (arrayList.size() >= 8) {
            return;
        }
        int i9 = c1423s.f4736g + 1;
        c1423s.f4736g = i9;
        if (i9 > 4096) {
            arrayList.add("目录项过多，无法完成安全替换预检");
            return;
        }
        try {
            c3959f = file2.getCanonicalFile();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            String strM3045K = m3045K(file, file2);
            String message = thM8182b.getMessage();
            if (message == null) {
                message = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            arrayList.add(strM3045K + " 无法解析真实路径：" + message);
            return;
        }
        if (!AbstractC1416l.m3825a(file2.getAbsoluteFile(), (File) c3959f)) {
            arrayList.add(m3045K(file, file2).concat(" 是不支持的符号链接"));
            return;
        }
        if (!file2.isDirectory()) {
            if (!file2.isFile()) {
                arrayList.add(m3045K(file, file2).concat(" 不是普通文件"));
                return;
            }
            if (file2.canRead()) {
                try {
                    new FileInputStream(file2).close();
                    c3959f2 = C3967n.f12976a;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                if (!(c3959f2 instanceof C3959f)) {
                    return;
                }
            }
            arrayList.add(m3045K(file, file2).concat(" 文件不可读，无法创建备份"));
            return;
        }
        if (!file2.canRead() || !file2.canExecute()) {
            arrayList.add(m3045K(file, file2).concat(" 目录不可读或不可进入"));
            return;
        }
        C1158o2 c1158o2M3042H = m3042H(file2);
        if (!c1158o2M3042H.f3845a) {
            arrayList.add(m3045K(file, file2) + " 目录不可修改：" + c1158o2M3042H.f3846b);
            return;
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            arrayList.add(m3045K(file, file2).concat(" 无法列出目录内容"));
            return;
        }
        for (File file3 : fileArrListFiles) {
            m3044J(arrayList, c1423s, file, file3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static final String m3045K(File file, File file2) {
        if (AbstractC1416l.m3825a(file2, file)) {
            return ".";
        }
        String path = file2.getPath();
        path.getClass();
        if (AbstractC3156t.m6740d0(path, file.getPath() + File.separator, false)) {
            return AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file2, file));
        }
        String name = file2.getName();
        name.getClass();
        return name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static String m3046L(File file) {
        Object c3959f;
        if (!file.isFile() || file.length() > 2097152) {
            return null;
        }
        try {
            c3959f = AbstractC0793l.m2027g0(file);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        byte[] bArr = (byte[]) c3959f;
        if (bArr == null) {
            return null;
        }
        String str = new String(bArr, AbstractC3137a.f10177a);
        if (m3037C(bArr)) {
            return str;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:167:0x006a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x006a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032f A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:32:0x00da, B:37:0x00ef, B:40:0x00f5, B:42:0x00fa, B:44:0x0104, B:47:0x010c, B:48:0x0115, B:50:0x011b, B:52:0x012c, B:55:0x0134, B:56:0x0141, B:58:0x0147, B:59:0x0155, B:60:0x0169, B:62:0x016f, B:64:0x0180, B:65:0x0184, B:66:0x0191, B:68:0x0197, B:69:0x01a5, B:70:0x01bd, B:73:0x01c5, B:75:0x01dd, B:77:0x01e7, B:79:0x01ed, B:80:0x01f1, B:82:0x01f7, B:83:0x021d, B:84:0x0226, B:86:0x022c, B:88:0x023c, B:90:0x024a, B:91:0x024e, B:93:0x0259, B:94:0x0262, B:96:0x0268, B:98:0x027c, B:100:0x028a, B:101:0x028e, B:102:0x0291, B:120:0x02f8, B:127:0x030b, B:129:0x0311, B:130:0x0329, B:133:0x032f, B:134:0x0338, B:136:0x033e, B:138:0x034d, B:139:0x0351, B:140:0x0355, B:142:0x035b, B:151:0x0388, B:153:0x038e, B:150:0x0383, B:126:0x0306, B:105:0x02a5, B:108:0x02b0, B:111:0x02c7, B:112:0x02cb, B:115:0x02e6, B:118:0x02f2, B:36:0x00e9, B:123:0x02fe, B:33:0x00e3, B:143:0x036a, B:145:0x0372, B:148:0x037b), top: B:159:0x00da, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3047M(File file) {
        ?? arrayList;
        Object c3959f;
        Object next;
        Object c3959f2;
        Object c3959f3;
        C3963j c3963j;
        Pattern patternCompile = Pattern.compile("^\\.(.+)\\.agent-(new|old|copy)-([A-Za-z0-9]+)$");
        patternCompile.getClass();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                name.getClass();
                Matcher matcher = patternCompile.matcher(name);
                matcher.getClass();
                C3145i c3145i = !matcher.matches() ? null : new C3145i(matcher, name);
                if (c3145i != null) {
                    String str = (String) ((C3143g) c3145i.m6676a()).get(1);
                    c3963j = !str.equals(AbstractC1102a2.m2823e(str)) ? null : new C3963j(str, ((C3143g) c3145i.m6676a()).get(2), file2);
                }
                if (c3963j != null) {
                    arrayList.add(c3963j);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C4173t.f13710g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str2 = (String) ((C3963j) obj).f12971g;
            Object arrayList2 = linkedHashMap.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str2, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Object objComputeIfAbsent = f3961a.computeIfAbsent(str3, new C0260j(new C1124g0(25), 9));
            objComputeIfAbsent.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) objComputeIfAbsent;
            reentrantLock.lock();
            try {
                File absoluteFile = new File(file, str3).getAbsoluteFile();
                try {
                    c3959f = absoluteFile.getCanonicalFile();
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                File file3 = (File) c3959f;
                if (file3 != null && AbstractC1416l.m3825a(file3.getParentFile(), file) && AbstractC1416l.m3825a(absoluteFile, file3)) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (AbstractC1416l.m3825a(((C3963j) obj2).f12972h, "old")) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add((File) ((C3963j) it.next()).f12973i);
                    }
                    List listM8402K1 = AbstractC4166m.m8402K1(arrayList4, new C1167r(12));
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : list) {
                        if (AbstractC1416l.m3825a(((C3963j) obj3).f12972h, "copy")) {
                            arrayList5.add(obj3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(AbstractC4167n.m8429e1(arrayList5));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add((File) ((C3963j) it2.next()).f12973i);
                    }
                    ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(listM8402K1, AbstractC4166m.m8402K1(arrayList6, new C1167r(13)));
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj4 : arrayListM8397F1) {
                        File file4 = (File) obj4;
                        file4.getClass();
                        if (!AbstractC1416l.m3825a(m3059Y(m3058X(file4)), "complete") && m3060Z(file4).isFile() && !m3090z(file4)) {
                            arrayList7.add(obj4);
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj5 : arrayListM8397F1) {
                            File file5 = (File) obj5;
                            file5.getClass();
                            if (m3090z(file5) && !AbstractC1416l.m3825a(m3059Y(m3058X(file5)), "complete")) {
                                arrayList8.add(obj5);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList(arrayList8);
                        if (!file3.exists()) {
                            ArrayList arrayList10 = new ArrayList();
                            for (Object obj6 : listM8402K1) {
                                File file6 = (File) obj6;
                                file6.getClass();
                                if (!m3060Z(file6).exists() && !AbstractC1416l.m3825a(m3059Y(m3058X(file6)), "complete")) {
                                    arrayList10.add(obj6);
                                }
                            }
                            AbstractC4171r.m8432h1(arrayList9, arrayList10);
                        }
                        Iterator it3 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList9)).iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                File file7 = (File) next;
                                file7.getClass();
                                long jLastModified = m3060Z(file7).lastModified();
                                long jLastModified2 = file7.lastModified();
                                if (jLastModified < jLastModified2) {
                                    jLastModified = jLastModified2;
                                }
                                Long lValueOf = Long.valueOf(jLastModified);
                                do {
                                    Object next2 = it3.next();
                                    File file8 = (File) next2;
                                    file8.getClass();
                                    long jLastModified3 = m3060Z(file8).lastModified();
                                    long jLastModified4 = file8.lastModified();
                                    if (jLastModified3 < jLastModified4) {
                                        jLastModified3 = jLastModified4;
                                    }
                                    Long lValueOf2 = Long.valueOf(jLastModified3);
                                    if (lValueOf.compareTo(lValueOf2) < 0) {
                                        next = next2;
                                        lValueOf = lValueOf2;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        File file9 = (File) next;
                        C3967n c3967n = C3967n.f12976a;
                        if (file9 != null) {
                            try {
                                m3050P(file9, file3, "恢复插件事务备份失败");
                                c3959f2 = c3967n;
                            } catch (Throwable th3) {
                                c3959f2 = new C3959f(th3);
                            }
                            Throwable thM8182b = C3960g.m8182b(c3959f2);
                            if (thM8182b != null) {
                                AbstractC1184v0.m3204n("[Hchat:ScriptAgent] 恢复插件事务失败: " + file9.getPath(), thM8182b);
                            }
                            if (!(c3959f2 instanceof C3959f)) {
                                ArrayList<C3963j> arrayList11 = new ArrayList();
                                for (Object obj7 : list) {
                                    if (!AbstractC1416l.m3825a(((C3963j) obj7).f12973i, file3)) {
                                        arrayList11.add(obj7);
                                    }
                                }
                                for (C3963j c3963j2 : arrayList11) {
                                    String str4 = (String) c3963j2.f12972h;
                                    File file10 = (File) c3963j2.f12973i;
                                    try {
                                        if (AbstractC1416l.m3825a(str4, "new")) {
                                            file10.getClass();
                                            m3081q(file10);
                                        } else {
                                            file10.getClass();
                                            m3079o(file10);
                                        }
                                        c3959f3 = c3967n;
                                    } catch (Throwable th4) {
                                        c3959f3 = new C3959f(th4);
                                    }
                                    Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                                    if (thM8182b2 != null) {
                                        AbstractC1184v0.m3204n("[Hchat:ScriptAgent] 清理插件事务残留失败: " + file10.getPath(), thM8182b2);
                                    }
                                }
                            }
                        }
                    } else {
                        AbstractC1184v0.m3203m("[Hchat:ScriptAgent] 插件事务备份校验失败，已保留现场: " + AbstractC4166m.m8392A1(arrayList7, null, null, null, new C1124g0(22), 31));
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th5) {
                reentrantLock.unlock();
                throw th5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m3048N(File file) {
        if (file.exists()) {
            try {
                file.setReadable(true, true);
            } catch (Throwable unused) {
            }
            try {
                file.setWritable(true, true);
            } catch (Throwable unused2) {
            }
            if (file.isDirectory()) {
                try {
                    file.setExecutable(true, true);
                } catch (Throwable unused3) {
                }
            }
            try {
                Os.chmod(file.getAbsolutePath(), (Os.stat(file.getAbsolutePath()).st_mode & 4095) | (file.isDirectory() ? 448 : 384));
            } catch (Throwable unused4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m3049O(File file) {
        File[] fileArrListFiles;
        if (file.exists() && AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            m3048N(file);
            if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                m3049O(file2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static void m3050P(File file, File file2, String str) throws NoSuchAlgorithmException {
        Object c3959f;
        if (!file.isDirectory()) {
            C2104o.m5291q(str.concat("：源目录不存在"));
            return;
        }
        if (!file2.exists()) {
            try {
                Os.rename(file.getAbsolutePath(), file2.getAbsolutePath());
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (!(c3959f instanceof C3959f)) {
                return;
            }
        }
        String strM3062a0 = m3062a0(m3053S(file));
        try {
            if (!file2.exists() && !file2.mkdirs()) {
                throw new IllegalStateException(str.concat("：创建目标目录失败").toString());
            }
            if (!file2.isDirectory()) {
                throw new IllegalArgumentException(str.concat("：目标不是目录").toString());
            }
            m3055U(file, file2);
            if (!m3062a0(m3053S(file)).equals(strM3062a0)) {
                throw new IllegalStateException("源目录在复制时发生变化");
            }
            if (!m3062a0(m3053S(file2)).equals(strM3062a0)) {
                throw new IllegalStateException("目标目录内容不完整");
            }
        } catch (Throwable th3) {
            String message = th3.getMessage();
            if (message == null) {
                message = th3.getClass().getSimpleName();
            }
            throw new IllegalStateException(AbstractC4855en.m9264h(str, "：", message), th3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[LOOP:0: B:22:0x00a3->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1174s2 m3051Q(Context context, C1138j2 c1138j2) throws IOException {
        int i9;
        int i10;
        String str = c1138j2.f3746d;
        LinkedHashMap linkedHashMap = c1138j2.f3748f;
        String str2 = c1138j2.f3747e;
        m3074j(context);
        if (c1138j2.f3754l < System.currentTimeMillis() - 86400000) {
            C2104o.m5294t("插件工作区恢复点已过期");
            return null;
        }
        File canonicalFile = ScriptPluginRuntime.INSTANCE.ensureDirs(context).getCanonicalFile();
        canonicalFile.getClass();
        m3048N(canonicalFile);
        m3047M(canonicalFile);
        String string = AbstractC3149m.m6703R0(c1138j2.f3744b).toString();
        if (!string.equals(AbstractC1102a2.m2823e(string)) || AbstractC3149m.m6709h0(string, "..", false)) {
            C2104o.m5294t("插件工作区恢复点的 plugin_id 无效");
            return null;
        }
        File absoluteFile = new File(canonicalFile, string).getAbsoluteFile();
        File canonicalFile2 = absoluteFile.getCanonicalFile();
        if (!AbstractC1416l.m3825a(canonicalFile2.getParentFile(), canonicalFile) || !absoluteFile.equals(canonicalFile2)) {
            C2104o.m5294t("插件工作区恢复点不在脚本根目录内");
            return null;
        }
        Pattern patternCompile = Pattern.compile("[0-9a-f]{64}");
        patternCompile.getClass();
        if (!patternCompile.matcher(str).matches()) {
            C2104o.m5294t("插件工作区恢复点缺少有效基线");
            return null;
        }
        Pattern patternCompile2 = Pattern.compile("[0-9a-f]{64}");
        patternCompile2.getClass();
        if (!patternCompile2.matcher(str2).matches()) {
            C2104o.m5294t("插件工作区恢复点缺少有效内容指纹");
            return null;
        }
        if (linkedHashMap.size() > 4096) {
            C2104o.m5294t("插件工作区恢复点包含过多路径");
            return null;
        }
        if (!linkedHashMap.isEmpty()) {
            loop0: for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (!AbstractC3149m.m6721t0(str3) && str3.length() <= 240 && !AbstractC3149m.m6710i0(str3, (char) 0) && !AbstractC3149m.m6710i0(str3, '\\') && !AbstractC3149m.m6694I0(str3, '/') && !AbstractC3149m.m6713l0(str3, '/')) {
                    List<String> listM6691F0 = AbstractC3149m.m6691F0(str3, new char[]{'/'}, 6);
                    if (!listM6691F0.isEmpty()) {
                        for (String str5 : listM6691F0) {
                            if (AbstractC3149m.m6721t0(str5) || str5.equals(".") || str5.equals("..")) {
                                break loop0;
                            }
                        }
                        if (str4.length() > 256) {
                        }
                    } else if (str4.length() > 256) {
                    }
                }
                C2104o.m5294t("插件工作区恢复点包含无效路径");
                return null;
            }
        }
        int i11 = c1138j2.f3750h;
        if (i11 < 0 || -1 > (i9 = c1138j2.f3751i) || i9 > i11 || -1 > (i10 = c1138j2.f3752j) || i10 > i11) {
            C2104o.m5294t("插件工作区恢复点的 revision 无效");
            return null;
        }
        File fileM3073i = m3073i(context, c1138j2.f3743a);
        m3085u(fileM3073i);
        m3083s(fileM3073i);
        if (!m3062a0(m3053S(fileM3073i)).equals(str2)) {
            C2104o.m5294t("插件工作区内容与恢复点不一致");
            return null;
        }
        fileM3073i.setLastModified(System.currentTimeMillis());
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext != null ? applicationContext : context;
        boolean z9 = c1138j2.f3745c;
        String str6 = c1138j2.f3749g;
        return new C1174s2(context2, string, canonicalFile2, fileM3073i, z9, str, linkedHashMap, AbstractC3149m.m6721t0(str6) ? string : str6, c1138j2.f3750h, c1138j2.f3751i, c1138j2.f3752j, c1138j2.f3753k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m3052R(C1166q2 c1166q2) {
        if (c1166q2 == null) {
            return "missing";
        }
        return (c1166q2.f3893a ? "directory" : "file") + ":" + c1166q2.f3894b + ":" + c1166q2.f3895c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static Map m3053S(File file) {
        if (!file.isDirectory()) {
            return C4174u.f13711g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3010h c3010h = new C3010h(new C3011i(new C0791j(file, EnumC0792k.f2375g, (C0499x) null), true, new C1146l2(file, 0)));
        while (c3010h.hasNext()) {
            File file2 = (File) c3010h.next();
            linkedHashMap.put(AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file2, file)), file2.isDirectory() ? new C1166q2(true, 0L, HttpUrl.FRAGMENT_ENCODE_SET) : new C1166q2(false, file2.length(), m3089y(file2)));
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static JSONObject m3054T(int i9, String str) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("type", "string", "description", str);
        jSONObjectM9268l.put("minLength", i9);
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static void m3055U(File file, File file2) throws IOException {
        Map mapM3053S = m3053S(file);
        Map mapM3053S2 = m3053S(file2);
        Set setKeySet = mapM3053S2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            C1166q2 c1166q2 = (C1166q2) mapM3053S.get(str);
            if (c1166q2 == null || c1166q2.f3893a != ((C1166q2) AbstractC4178y.m8436Y(str, mapM3053S2)).f3893a) {
                arrayList.add(obj);
            }
        }
        Iterator it = AbstractC4166m.m8402K1(arrayList, new C1167r(15)).iterator();
        while (it.hasNext()) {
            m3081q(new File(file2, (String) it.next()));
        }
        Set setEntrySet = mapM3053S.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (((C1166q2) ((Map.Entry) obj2).getValue()).f3893a) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = AbstractC4166m.m8402K1(arrayList2, new C1167r(14)).iterator();
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            File file3 = new File(file2, str2);
            if (!file3.isDirectory() && !file3.mkdirs()) {
                C0086a.m449h(AbstractC4855en.m9263g("创建目录失败: ", str2));
                return;
            }
        }
        Set setEntrySet2 = mapM3053S.entrySet();
        ArrayList<Map.Entry> arrayList3 = new ArrayList();
        for (Object obj3 : setEntrySet2) {
            if (!((C1166q2) ((Map.Entry) obj3).getValue()).f3893a) {
                arrayList3.add(obj3);
            }
        }
        for (Map.Entry entry : arrayList3) {
            String str3 = (String) entry.getKey();
            if (!AbstractC1416l.m3825a(mapM3053S2.get(str3), (C1166q2) entry.getValue())) {
                File file4 = new File(file2, str3);
                m3081q(file4);
                m3077m(new File(file, str3), file4);
            }
        }
        m3083s(file2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static void m3056V(JSONArray jSONArray, String str, String str2, LinkedHashMap linkedHashMap, List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "hchat.workspace.".concat(str));
        jSONObject.put("description", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "object");
        jSONObject2.put("properties", new JSONObject(linkedHashMap));
        jSONObject2.put("required", new JSONArray((Collection) list));
        jSONObject2.put("additionalProperties", false);
        jSONObject.put("inputSchema", jSONObject2);
        jSONArray.put(jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static final String m3057W() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        m3056V(jSONArray, "check_access", "检查插件文件是否可读、可写或可替换，并可尝试修复当前微信进程有权修改的文件权限", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名；必须使用插件列表中的准确 ID")), new C3958e("path", m3054T(0, "相对插件目录的路径，默认 .")), new C3958e("recursive", m3069e("是否递归检查子文件和目录", true)), new C3958e("repair", m3069e("是否尝试补齐当前文件所有者的读写权限和目录进入权限", false))), AbstractC0000a.m99x0("plugin_id"));
        m3056V(jSONArray, "list_files", "列出插件工作区内的文件和目录", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名；修改现有插件时使用插件列表中的准确 ID")), new C3958e("path", m3054T(0, "相对插件目录的路径，默认 .")), new C3958e("recursive", m3069e("是否递归列出", false)), new C3958e("max_depth", m3035A("递归最大深度", 3, 1, 8))), AbstractC0000a.m99x0("plugin_id"));
        m3056V(jSONArray, "read_file", "按行读取插件工作区内的文本文件并返回稳定行号", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("path", m3054T(1, "相对插件目录的文件路径")), new C3958e("start_line", m3035A("起始行，从 1 开始", 1, 1, null)), new C3958e("start_column", m3035A("起始行内的字符位置，从 1 开始", 1, 1, null)), new C3958e("end_line", m3035A("可选结束行，0 表示按 max_lines", 0, 0, null)), new C3958e("max_lines", m3035A("未指定 end_line 时最多返回行数", 400, 1, 2000)), new C3958e("include_line_numbers", m3069e("是否在内容前显示行号", true))), AbstractC0000a.m101y0("plugin_id", "path"));
        m3056V(jSONArray, "search_files", "搜索插件工作区内文本文件的内容", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("query", m3054T(1, "搜索文本或正则表达式")), new C3958e("path", m3054T(0, "搜索起始目录，默认 .")), new C3958e("regex", m3069e("是否按正则表达式搜索", false)), new C3958e("case_sensitive", m3069e("是否区分大小写", false)), new C3958e("file_pattern", m3054T(0, "可选路径通配符，例如 **/*.java")), new C3958e("exclude_pattern", m3054T(0, "可选排除路径通配符")), new C3958e("before_context", m3035A("返回匹配行之前的上下文行数", 0, 0, 10)), new C3958e("after_context", m3035A("返回匹配行之后的上下文行数", 0, 0, 10)), new C3958e("limit", m3035A("最多返回匹配数量", 50, 1, 200))), AbstractC0000a.m101y0("plugin_id", "query"));
        m3056V(jSONArray, "create_directory", "在插件工作区内创建目录", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("path", m3054T(1, "要创建的相对目录路径"))), AbstractC0000a.m101y0("plugin_id", "path"));
        m3056V(jSONArray, "write_file", "新建文本文件，或在 overwrite=true 时完整覆写文件", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("path", m3054T(1, "相对插件目录的文件路径")), new C3958e("content", m3054T(0, "完整文件内容")), new C3958e("overwrite", m3069e("是否允许覆写现有文件", false))), AbstractC0000a.m101y0("plugin_id", "path", "content"));
        m3056V(jSONArray, "apply_patch", "应用 Codex 风格统一补丁，可在一次调用中新增、更新、移动或删除多个文件", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("patch", m3054T(1, "以 *** Begin Patch 开始、*** End Patch 结束的完整统一补丁"))), AbstractC0000a.m101y0("plugin_id", "patch"));
        m3056V(jSONArray, "move_path", "移动或重命名插件工作区内的文件或目录", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("source", m3054T(1, "源相对路径")), new C3958e("destination", m3054T(1, "目标相对路径")), new C3958e("overwrite", m3069e("是否覆盖目标", false))), AbstractC0000a.m101y0("plugin_id", "source", "destination"));
        m3056V(jSONArray, "delete_path", "删除插件工作区内的文件或子目录；不能删除插件根目录", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("path", m3054T(1, "要删除的相对路径"))), AbstractC0000a.m101y0("plugin_id", "path"));
        m3056V(jSONArray, "restore_path", "把文件或目录恢复到本轮开始时的状态；新建路径会被移除", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("path", m3054T(1, "要恢复的相对路径"))), AbstractC0000a.m101y0("plugin_id", "path"));
        m3056V(jSONArray, "reset_workspace", "丢弃本轮全部暂存修改并恢复到任务开始状态", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名"))), AbstractC0000a.m99x0("plugin_id"));
        m3056V(jSONArray, "delete_plugin", "标记删除整个现有插件；最终提交前客户端一定会要求用户确认", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名"))), AbstractC0000a.m99x0("plugin_id"));
        m3056V(jSONArray, "show_diff", "显示当前暂存工作区相对原插件的标准统一 diff", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名")), new C3958e("path", m3054T(0, "可选相对路径，只显示该路径下的差异"))), AbstractC0000a.m99x0("plugin_id"));
        m3056V(jSONArray, "workspace_status", "检查工作区变更、必需文件和静态校验结果", AbstractC4178y.m8437Z(new C3958e("plugin_id", m3054T(1, "插件目录名"))), AbstractC0000a.m99x0("plugin_id"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", "Hchat 插件工作区工具");
        jSONObject.put("instructions", "所有路径均相对单个插件目录。权限异常或写入失败时先调用 check_access，必要时设置 repair=true；修改代码先 list/read/search，再使用 Codex 风格 apply_patch。完成前必须依次调用 workspace_status 和 show_diff。");
        jSONObject.put("tools", jSONArray);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static File m3058X(File file) {
        return new File(file.getParentFile(), AbstractC0255e.m1020i(file.getName(), ".committed"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static String m3059Y(File file) {
        Object c3959f;
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if (1 > length || length >= 129) {
            return null;
        }
        try {
            c3959f = AbstractC0793l.m2028h0(file, AbstractC3137a.f10177a);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static File m3060Z(File file) {
        return new File(file.getParentFile(), AbstractC0255e.m1020i(file.getName(), ".ready"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public static final void m3061a(File file, String str) throws IOException {
        File file2 = new File(file.getParentFile(), AbstractC0921a.m2251n(".", file.getName(), ".agent.tmp"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            try {
                Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
            } catch (Throwable th2) {
                file2.delete();
                throw new IllegalStateException(AbstractC4855en.m9263g("写入文件失败: ", file.getName()), th2);
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static String m3062a0(Map map) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        for (Map.Entry entry : new TreeMap(map).entrySet()) {
            String str = (String) entry.getKey();
            C1166q2 c1166q2 = (C1166q2) entry.getValue();
            str.getClass();
            byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            messageDigest.update(bytes);
            messageDigest.update(c1166q2.f3893a ? (byte) 1 : (byte) 0);
            String strValueOf = String.valueOf(c1166q2.f3894b);
            Charset charset = AbstractC3137a.f10178b;
            byte[] bytes2 = strValueOf.getBytes(charset);
            bytes2.getClass();
            messageDigest.update(bytes2);
            byte[] bytes3 = c1166q2.f3895c.getBytes(charset);
            bytes3.getClass();
            messageDigest.update(bytes3);
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return AbstractC4165l.m8368E0(bArrDigest, new C1124g0(24));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final JSONArray m3063b(List list, int i9, int i10) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (i9 < 0) {
            i9 = 0;
        }
        int size = list.size();
        if (i10 > size) {
            i10 = size;
        }
        while (i9 < i10) {
            JSONObject jSONObject = new JSONObject();
            int i11 = i9 + 1;
            jSONObject.put("line", i11);
            jSONObject.put(WeChatSnsPost.TYPE_TEXT, AbstractC3149m.m6701P0(500, (String) list.get(i9)));
            jSONArray.put(jSONObject);
            i9 = i11;
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static C1162p2 m3064b0(File file, String str) throws IOException {
        Object c3959f;
        File file2 = new File(file, "main.java");
        File file3 = new File(file, "info.prop");
        if (!file2.isFile()) {
            C2104o.m5294t("插件缺少 main.java");
            return null;
        }
        if (!file3.isFile()) {
            C2104o.m5294t("插件缺少 info.prop");
            return null;
        }
        if (file2.length() > 2097152 || file3.length() > 2097152) {
            C2104o.m5294t("插件主文件超过大小限制");
            return null;
        }
        String strM2028h0 = AbstractC0793l.m2028h0(file3, AbstractC3137a.f10177a);
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(strM2028h0));
        } catch (Throwable unused) {
        }
        C3147k c3147k = AbstractC1102a2.f3550a;
        String property = properties.getProperty("name");
        if (property == null) {
            property = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1192y c1192yM2821c = AbstractC1102a2.m2821c(new C1192y(property, str, strM2028h0, AbstractC0793l.m2028h0(file2, AbstractC3137a.f10177a), HttpUrl.FRAGMENT_ENCODE_SET));
        ArrayList arrayList = new ArrayList(AbstractC1102a2.m2824f(c1192yM2821c).f4024a);
        C3010h c3010h = new C3010h(new C3011i(new C0791j(file, EnumC0792k.f2375g, (C0499x) null), true, new C1124g0(21)));
        while (c3010h.hasNext()) {
            File file4 = (File) c3010h.next();
            String strM2024d0 = AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file4, file));
            long length = file4.length();
            EnumC1104b0 enumC1104b0 = EnumC1104b0.f3555g;
            if (length > 2097152) {
                arrayList.add(new C1100a0(enumC1104b0, strM2024d0.concat(" 超过 2 MB，不能执行静态检查"), false));
            } else {
                try {
                    c3959f = AbstractC0793l.m2027g0(file4);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                byte[] bArr = (byte[]) c3959f;
                if (bArr == null || !m3037C(bArr)) {
                    arrayList.add(new C1100a0(enumC1104b0, strM2024d0.concat(" 不是可静态检查的文本代码"), false));
                } else {
                    C3147k c3147k2 = AbstractC1102a2.f3550a;
                    String str2 = new String(bArr, AbstractC3137a.f10177a);
                    ArrayList arrayList2 = new ArrayList();
                    if (AbstractC3149m.m6709h0(str2, "```", false)) {
                        arrayList2.add(new C1100a0(enumC1104b0, strM2024d0.concat(" 仍包含 Markdown 代码围栏"), false));
                    }
                    if (AbstractC1102a2.f3551b.m6682a(str2)) {
                        arrayList2.add(new C1100a0(enumC1104b0, strM2024d0.concat(" 包含绝对路径或 .. 路径，请改用 pluginDir、pluginDirFile 或 cacheDir"), false));
                    }
                    if (AbstractC1102a2.m2820b(str2)) {
                        arrayList2.add(new C1100a0(enumC1104b0, strM2024d0.concat(": BeanShell 顶层 native 方法无法绑定 JNI，请把 native 声明放进类并将该类的 ClassLoader 传给 loadSo"), false));
                    }
                    ArrayList<C1100a0> arrayListM2822d = AbstractC1102a2.m2822d(str2);
                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayListM2822d));
                    for (C1100a0 c1100a0 : arrayListM2822d) {
                        String strM9264h = AbstractC4855en.m9264h(strM2024d0, ": ", c1100a0.f3545b);
                        EnumC1104b0 enumC1104b02 = c1100a0.f3544a;
                        boolean z9 = c1100a0.f3546c;
                        enumC1104b02.getClass();
                        arrayList3.add(new C1100a0(enumC1104b02, strM9264h, z9));
                    }
                    AbstractC4171r.m8432h1(arrayList2, arrayList3);
                    AbstractC4171r.m8432h1(arrayList, arrayList2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            C1100a0 c1100a02 = (C1100a0) obj;
            if (hashSet.add(new C3958e(c1100a02.f3544a, c1100a02.f3545b))) {
                arrayList4.add(obj);
            }
        }
        return new C1162p2(c1192yM2821c, new C1197z1(arrayList4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: c */
    public static final p218og.C3147k m3065c(java.lang.String r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "^"
            r0.<init>(r1)
            r1 = 92
            r2 = 47
            java.lang.String r9 = r9.replace(r1, r2)
            r9.getClass()
            boolean r3 = p218og.AbstractC3149m.m6710i0(r9, r2)
        */
        //  java.lang.String r4 = "(?:.*/)?"
        /*
            if (r3 != 0) goto L1d
            r0.append(r4)
        L1d:
            r3 = 0
            r5 = r3
        L1f:
            int r6 = r9.length()
            r7 = 36
            if (r5 >= r6) goto L82
            char r6 = r9.charAt(r5)
            if (r6 == r7) goto L79
            r7 = 46
            if (r6 == r7) goto L79
            r7 = 63
            if (r6 == r7) goto L73
            switch(r6) {
                case 40: goto L79;
                case 41: goto L79;
                case 42: goto L42;
                case 43: goto L79;
                default: goto L38;
            }
        L38:
            switch(r6) {
                case 91: goto L79;
                case 92: goto L79;
                case 93: goto L79;
                case 94: goto L79;
                default: goto L3b;
            }
        L3b:
            switch(r6) {
                case 123: goto L79;
                case 124: goto L79;
                case 125: goto L79;
                default: goto L3e;
            }
        L3e:
            r0.append(r6)
            goto L7f
        L42:
            int r6 = r5 + 1
            java.lang.Character r7 = p218og.AbstractC3149m.m6715n0(r9, r6)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            char r7 = r7.charValue()
            r8 = 42
            if (r7 != r8) goto L6d
            int r5 = r5 + 2
            java.lang.Character r7 = p218og.AbstractC3149m.m6715n0(r9, r5)
            if (r7 != 0) goto L5c
            goto L66
        L5c:
            char r7 = r7.charValue()
            if (r7 != r2) goto L66
            r0.append(r4)
            goto L7f
        L66:
            java.lang.String r5 = ".*"
            r0.append(r5)
            r5 = r6
            goto L7f
        L6d:
            java.lang.String r6 = "[^/]*"
            r0.append(r6)
            goto L7f
        L73:
            java.lang.String r6 = "[^/]"
            r0.append(r6)
            goto L7f
        L79:
            r0.append(r1)
            r0.append(r6)
        L7f:
            int r5 = r5 + 1
            goto L1f
        L82:
            r0.append(r7)
            java.lang.String r9 = r0.toString()
            og.k r0 = new og.k
            r0.<init>(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p080fb.C1178t2.m3065c(java.lang.String):og.k");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static File m3066c0(Context context) {
        File file = new File(context.getCacheDir(), "Hchat_agent_plugin_workspaces");
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        C2104o.m5276A("创建 Agent 工作区目录失败");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3067d(File file, File file2, C1134i2 c1134i2) throws IOException {
        Iterator it = AbstractC4166m.m8402K1(c1134i2.f3718h, new C1167r(10)).iterator();
        while (it.hasNext()) {
            m3081q(new File(file2, (String) it.next()));
        }
        for (String str : AbstractC4166m.m8402K1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC4166m.m8397F1(c1134i2.f3716f, c1134i2.f3717g))), new C1167r(9))) {
            File file3 = new File(file, str);
            File file4 = new File(file2, str);
            if (!file3.exists()) {
                C2104o.m5291q(AbstractC4855en.m9263g("暂存变更路径不存在: ", str));
                return;
            }
            if (file3.isDirectory()) {
                if (file4.exists() && !file4.isDirectory()) {
                    m3080p(file4);
                }
                if (!file4.isDirectory() && !file4.mkdirs()) {
                    C0086a.m449h(AbstractC4855en.m9263g("创建目录失败: ", str));
                    return;
                }
            } else {
                m3081q(file4);
                m3077m(file3, file4);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: d0 */
    public static void m3068d0(File file, String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static JSONObject m3069e(String str, boolean z9) throws JSONException {
        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("type", "boolean", "description", str);
        jSONObjectM9268l.put("default", z9);
        return jSONObjectM9268l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013d, code lost:
    
        if (p218og.AbstractC3156t.m6740d0(r7, r9.getPath() + java.io.File.separator, false) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3 A[EDGE_INSN: B:179:0x01f3->B:89:0x01f3 BREAK  A[LOOP:3: B:79:0x01d6->B:180:0x01d6]] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m3070f(Context context, String str, JSONObject jSONObject) throws JSONException, IOException {
        String strM8392A1;
        boolean z9;
        boolean z10;
        if (!m3039E(str).equals("check_access")) {
            C2104o.m5291q("不是工作区预检工具: ".concat(str));
            return null;
        }
        m3074j(context);
        File canonicalFile = ScriptPluginRuntime.INSTANCE.ensureDirs(context).getCanonicalFile();
        canonicalFile.getClass();
        m3047M(canonicalFile);
        String strM1023l = AbstractC0255e.m1023l("plugin_id", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            C2104o.m5294t("plugin_id 不能为空");
            return null;
        }
        if (strM1023l.equals(AbstractC1102a2.m2823e(strM1023l))) {
            boolean z11 = false;
            if (!AbstractC3149m.m6709h0(strM1023l, "..", false)) {
                File absoluteFile = new File(canonicalFile, strM1023l).getAbsoluteFile();
                File canonicalFile2 = absoluteFile.getCanonicalFile();
                if (!AbstractC1416l.m3825a(canonicalFile2.getParentFile(), canonicalFile) || !absoluteFile.equals(canonicalFile2)) {
                    C2104o.m5294t("插件目录不在脚本根目录内或使用了符号链接");
                    return null;
                }
                String strOptString = jSONObject.optString("path", ".");
                strOptString.getClass();
                String strM6704S0 = AbstractC3149m.m6704S0(AbstractC3156t.m6738b0(AbstractC3149m.m6703R0(strOptString).toString(), '\\', '/'), '/');
                if (AbstractC3149m.m6721t0(strM6704S0) || strM6704S0.equals(".")) {
                    strM8392A1 = ".";
                } else {
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
                    if (strM6704S0.length() > 240) {
                        C2104o.m5294t("路径过长");
                        return null;
                    }
                    strM8392A1 = AbstractC4166m.m8392A1(listM6691F0, "/", null, null, null, 62);
                }
                File absoluteFile2 = strM8392A1.equals(".") ? canonicalFile2 : new File(canonicalFile2, strM8392A1).getAbsoluteFile();
                File canonicalFile3 = absoluteFile2.getCanonicalFile();
                if (absoluteFile2.equals(canonicalFile3)) {
                    if (!AbstractC1416l.m3825a(canonicalFile3, canonicalFile2)) {
                        String path = canonicalFile3.getPath();
                        path.getClass();
                    }
                    boolean zOptBoolean = jSONObject.optBoolean("recursive", true);
                    boolean zOptBoolean2 = jSONObject.optBoolean("repair", false);
                    if (zOptBoolean2) {
                        m3048N(canonicalFile);
                        if (!canonicalFile2.exists()) {
                            ArrayList arrayList = new ArrayList();
                            for (File parentFile = canonicalFile3.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
                                String path2 = parentFile.getPath();
                                path2.getClass();
                                String path3 = canonicalFile2.getPath();
                                path3.getClass();
                                if (!AbstractC3156t.m6740d0(path2, path3, false)) {
                                    break;
                                }
                                arrayList.add(parentFile);
                                if (parentFile.equals(canonicalFile2)) {
                                    break;
                                }
                            }
                            Iterator it = new C4150a0(arrayList).iterator();
                            while (true) {
                                ListIterator listIterator = (ListIterator) ((C4179z) it).f13716h;
                                if (!listIterator.hasPrevious()) {
                                    break;
                                }
                                m3048N((File) listIterator.previous());
                            }
                        } else {
                            m3049O(canonicalFile2);
                        }
                    }
                    ArrayList<C1150m2> arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    canonicalFile3.getClass();
                    C1421q c1421q = new C1421q();
                    m3075k(arrayList2, c1421q, canonicalFile2, arrayList3, zOptBoolean, canonicalFile3);
                    boolean z12 = c1421q.f4734g;
                    C1158o2 c1158o2M3042H = m3042H(canonicalFile);
                    C1170r2 c1170r2M3043I = m3043I(canonicalFile2);
                    boolean z13 = c1158o2M3042H.f3845a;
                    if (z12) {
                        z9 = false;
                    } else if (!arrayList2.isEmpty()) {
                        for (C1150m2 c1150m2 : arrayList2) {
                            if (c1150m2.f3790b && !c1150m2.f3798j) {
                                break;
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                        }
                    } else if (!arrayList3.isEmpty()) {
                        z9 = true;
                    }
                    if (z12) {
                        z10 = false;
                        break;
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (!((C1150m2) it2.next()).f3799k) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z13 && c1170r2M3043I.f3904a) {
                        z11 = true;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.addAll(arrayList3);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        ArrayList arrayList6 = arrayList2;
                        C1150m2 c1150m22 = (C1150m2) next;
                        Iterator it4 = it3;
                        if (c1150m22.f3790b && !c1150m22.f3798j) {
                            arrayList5.add(next);
                        }
                        arrayList2 = arrayList6;
                        it3 = it4;
                    }
                    ArrayList<C1150m2> arrayList7 = arrayList2;
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(((C1150m2) it5.next()).f3789a.concat(" 当前不可读"));
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj : arrayList7) {
                        if (!((C1150m2) obj).f3799k) {
                            arrayList8.add(obj);
                        }
                    }
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(((C1150m2) it6.next()).f3789a.concat(" 当前不可修改或替换"));
                    }
                    if (z12) {
                        arrayList4.add("权限检查结果超过 500 项，请缩小 path 后继续检查");
                    }
                    if (!z13) {
                        arrayList4.add("脚本插件根目录不可写，无法提交插件目录：".concat(c1158o2M3042H.f3846b));
                    }
                    ?? r12 = c1170r2M3043I.f3905b;
                    ArrayList arrayList9 = new ArrayList(AbstractC4167n.m8429e1(r12));
                    Iterator it7 = r12.iterator();
                    while (it7.hasNext()) {
                        arrayList9.add("插件目录无法安全替换：" + ((String) it7.next()));
                    }
                    arrayList4.addAll(arrayList9);
                    List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("ok", true);
                    jSONObject2.put("pluginId", strM1023l);
                    jSONObject2.put("path", strM8392A1);
                    jSONObject2.put("repairAttempted", zOptBoolean2);
                    jSONObject2.put("appUid", Process.myUid());
                    jSONObject2.put("scriptRootWritable", z13);
                    jSONObject2.put("canRead", z9);
                    jSONObject2.put("canModify", z10);
                    jSONObject2.put("canCommitPlugin", z11);
                    jSONObject2.put("issues", new JSONArray((Collection) listM8407P1));
                    JSONArray jSONArray = new JSONArray();
                    for (C1150m2 c1150m23 : arrayList7) {
                        c1150m23.getClass();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("path", c1150m23.f3789a);
                        jSONObject3.put("exists", c1150m23.f3790b);
                        jSONObject3.put("type", c1150m23.f3791c);
                        jSONObject3.put("readable", c1150m23.f3792d);
                        jSONObject3.put("writable", c1150m23.f3793e);
                        jSONObject3.put("executable", c1150m23.f3794f);
                        jSONObject3.put("symbolicLink", c1150m23.f3795g);
                        jSONObject3.put("parentWritable", c1150m23.f3796h);
                        jSONObject3.put("replaceable", c1150m23.f3797i);
                        jSONObject3.put("workspaceReadable", c1150m23.f3798j);
                        jSONObject3.put("modifiable", c1150m23.f3799k);
                        String str3 = c1150m23.f3800l;
                        if (!AbstractC3149m.m6721t0(str3)) {
                            jSONObject3.put("mode", str3);
                        }
                        Integer num = c1150m23.f3801m;
                        if (num != null) {
                            jSONObject3.put("ownerUid", num.intValue());
                        }
                        Integer num2 = c1150m23.f3802n;
                        if (num2 != null) {
                            jSONObject3.put("ownerGid", num2.intValue());
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject2.put("items", jSONArray);
                    jSONObject2.put("truncated", z12);
                    jSONObject2.put("recommendation", listM8407P1.isEmpty() ? "当前路径可由插件 Agent 读取和修改" : !zOptBoolean2 ? "请再次调用 check_access 并设置 repair=true" : "当前微信进程无法修复这些权限，请用系统文件管理器重新复制该插件目录后再试");
                    String string = jSONObject2.toString();
                    string.getClass();
                    return string;
                }
                C2104o.m5294t("检查路径超出插件目录或使用了符号链接");
                return null;
            }
        }
        C2104o.m5294t("plugin_id 包含不允许的路径字符");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static File m3071g(Context context, C1134i2 c1134i2) throws IOException {
        File canonicalFile = m3066c0(context).getCanonicalFile();
        File canonicalFile2 = new File(c1134i2.f3713c).getCanonicalFile();
        if (AbstractC1416l.m3825a(canonicalFile2.getParentFile(), canonicalFile) && canonicalFile2.isDirectory()) {
            return canonicalFile2;
        }
        C2104o.m5294t("插件暂存工作区无效或已失效");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m3072h(String str, String str2) {
        if (AbstractC1416l.m3825a(str, ".") || AbstractC1416l.m3825a(str2, str)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        return AbstractC3156t.m6740d0(str2, sb2.toString(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static File m3073i(Context context, String str) throws IOException {
        File canonicalFile = m3066c0(context).getCanonicalFile();
        File absoluteFile = new File(str).getAbsoluteFile();
        File canonicalFile2 = absoluteFile.getCanonicalFile();
        if (absoluteFile.equals(canonicalFile2) && AbstractC1416l.m3825a(canonicalFile2.getParentFile(), canonicalFile) && canonicalFile2.isDirectory()) {
            return canonicalFile2;
        }
        C2104o.m5294t("插件暂存工作区无效或已失效");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m3074j(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        File[] fileArrListFiles = m3066c0(context).listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory() && file.lastModified() < jCurrentTimeMillis) {
                    arrayList.add(file);
                }
            }
            for (File file2 : arrayList) {
                try {
                    file2.getClass();
                    m3080p(file2);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3075k(ArrayList arrayList, C1421q c1421q, File file, ArrayList arrayList2, boolean z9, File file2) {
        Object c3959f;
        boolean z10;
        Object c3959f2;
        boolean z11;
        boolean z12;
        Object c3959f3;
        String strM2024d0;
        C1421q c1421q2 = c1421q;
        File file3 = file;
        ArrayList arrayList3 = arrayList2;
        if (arrayList.size() >= 500) {
            c1421q2.f4734g = true;
            return;
        }
        boolean zExists = file2.exists();
        try {
            c3959f = Boolean.valueOf(!AbstractC1416l.m3825a(file2.getAbsoluteFile(), file2.getCanonicalFile()));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        boolean zBooleanValue = ((Boolean) c3959f).booleanValue();
        boolean zIsDirectory = file2.isDirectory();
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            z10 = parentFile.isDirectory() && parentFile.canWrite() && parentFile.canExecute();
        } else {
            z10 = false;
        }
        boolean z13 = zExists && file2.canRead();
        boolean z14 = zExists && file2.canWrite();
        boolean z15 = zExists && file2.canExecute();
        if (zBooleanValue) {
            z11 = false;
        } else if (zExists) {
            if (zIsDirectory) {
                z11 = z13 && z15 && file2.listFiles() != null;
            } else {
                if (z13) {
                    try {
                        new FileInputStream(file2).close();
                        c3959f2 = C3967n.f12976a;
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    if (!(c3959f2 instanceof C3959f)) {
                        z11 = true;
                    }
                }
                z11 = false;
            }
        }
        if (!zBooleanValue) {
            if (!zExists) {
                z12 = z10;
            } else if (zIsDirectory) {
                z12 = z14 && z15;
            } else {
                z12 = z14 || z10;
            }
        }
        try {
            c3959f3 = Os.stat(file2.getAbsolutePath());
        } catch (Throwable th4) {
            c3959f3 = new C3959f(th4);
        }
        if (c3959f3 instanceof C3959f) {
            c3959f3 = null;
        }
        StructStat structStat = (StructStat) c3959f3;
        if (file2.equals(file3)) {
            strM2024d0 = ".";
        } else {
            String path = file2.getPath();
            path.getClass();
            String path2 = file3.getPath();
            String str = File.separator;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(path2);
            sb2.append(str);
            strM2024d0 = AbstractC3156t.m6740d0(path, sb2.toString(), false) ? AbstractC0793l.m2024d0(AbstractC0793l.m2029i0(file2, file3)) : file2.getName();
        }
        String str2 = strM2024d0;
        str2.getClass();
        String str3 = zBooleanValue ? "symbolic_link" : !zExists ? "missing" : zIsDirectory ? "directory" : file2.isFile() ? "file" : "other";
        String str4 = structStat != null ? String.format(Locale.US, "%04o", Arrays.copyOf(new Object[]{Integer.valueOf(structStat.st_mode & 4095)}, 1)) : null;
        if (str4 == null) {
            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str5 = str4;
        ArrayList arrayList4 = arrayList;
        arrayList4.add(new C1150m2(str2, zExists, str3, z13, z14, z15, zBooleanValue, z10, z10, z11, z12, str5, structStat != null ? Integer.valueOf(structStat.st_uid) : null, structStat != null ? Integer.valueOf(structStat.st_gid) : null));
        if (zBooleanValue) {
            arrayList3.add(str2.concat(" 是不支持的符号链接"));
            return;
        }
        if (z9 && file2.isDirectory() && !c1421q2.f4734g) {
            File[] fileArrListFiles = file2.listFiles();
            if (fileArrListFiles == null) {
                arrayList3.add(str2.concat(" 无法列出目录内容"));
                return;
            }
            Iterator it = AbstractC4165l.m8371H0(fileArrListFiles, new C1167r(11)).iterator();
            while (it.hasNext()) {
                m3075k(arrayList4, c1421q2, file3, arrayList3, z9, (File) it.next());
                arrayList4 = arrayList;
                c1421q2 = c1421q;
                file3 = file;
                arrayList3 = arrayList2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m3076l(File file, File file2) throws NoSuchAlgorithmException {
        String strM3062a0 = m3062a0(m3053S(file));
        try {
            m3079o(file2);
            m3078n(file, file2);
            if (!m3062a0(m3053S(file)).equals(strM3062a0)) {
                throw new IllegalStateException("源插件目录在备份时发生变化");
            }
            if (!m3062a0(m3053S(file2)).equals(strM3062a0)) {
                throw new IllegalStateException("备份目录内容不完整");
            }
            m3068d0(m3060Z(file2), strM3062a0);
        } catch (Throwable th2) {
            try {
                m3079o(file2);
            } catch (Throwable unused) {
            }
            String message = th2.getMessage();
            if (message == null) {
                message = th2.getClass().getSimpleName();
            }
            throw new IllegalStateException("备份原插件目录失败：".concat(message), th2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: m */
    public static void m3077m(File file, File file2) throws IOException {
        if (!AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            C2104o.m5291q(AbstractC4855en.m9263g("不支持恢复符号链接: ", file.getName()));
            return;
        }
        if (file.isDirectory()) {
            m3078n(file, file2);
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
            C0086a.m449h(AbstractC4855en.m9263g("创建恢复目录失败: ", parentFile.getName()));
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                AbstractC1341a.m3594j(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: n */
    public static void m3078n(File file, File file2) throws IOException {
        if (!file.isDirectory()) {
            C2104o.m5291q(AbstractC4855en.m9263g("源目录不存在: ", file.getPath()));
            return;
        }
        C0789h c0789h = new C0789h(new C0791j(file, EnumC0792k.f2375g, (C0499x) null));
        while (c0789h.hasNext()) {
            File file3 = (File) c0789h.next();
            if (!AbstractC1416l.m3825a(file3.getAbsoluteFile(), file3.getCanonicalFile())) {
                C2104o.m5291q(AbstractC4855en.m9263g("不支持符号链接: ", file3.getName()));
                return;
            }
            File file4 = new File(file2, AbstractC0793l.m2029i0(file3, file).getPath());
            if (!file3.isDirectory()) {
                File parentFile = file4.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file3);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                    try {
                        AbstractC1341a.m3594j(fileInputStream, fileOutputStream);
                        fileOutputStream.close();
                        fileInputStream.close();
                    } finally {
                    }
                } finally {
                }
            } else if (!file4.isDirectory() && !file4.mkdirs()) {
                C0086a.m449h(AbstractC4855en.m9263g("创建目录失败: ", file4.getName()));
                return;
            }
        }
        m3083s(file2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m3079o(File file) {
        m3081q(file);
        for (File file2 : AbstractC0000a.m101y0(m3060Z(file), m3058X(file))) {
            if (file2.exists() && !file2.delete()) {
                C0086a.m449h(AbstractC4855en.m9263g("删除事务标记失败: ", file2.getName()));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m3080p(File file) {
        File[] fileArrListFiles;
        if (!AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            C2104o.m5294t("不支持删除符号链接");
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m3080p(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        C0086a.m449h(AbstractC4855en.m9263g("删除失败: ", file.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m3081q(File file) {
        if (file.exists()) {
            m3080p(file);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b9 A[RETURN] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m3082r(String str) {
        str.getClass();
        String strM3039E = m3039E(str);
        switch (strM3039E.hashCode()) {
            case -1903804409:
                return !strM3039E.equals("show_diff") ? str : "查看代码差异";
            case -1526776777:
                if (strM3039E.equals("apply_patch")) {
                    return "修改插件文件";
                }
                break;
            case -1356730971:
                if (strM3039E.equals("reset_workspace")) {
                    return "重置插件工作区";
                }
                break;
            case -1121949127:
                if (strM3039E.equals("delete_path")) {
                    return "删除插件路径";
                }
                break;
            case -1113857403:
                if (strM3039E.equals("read_file")) {
                    return "读取插件文件";
                }
                break;
            case -636524068:
                if (strM3039E.equals("write_file")) {
                    return "写入插件文件";
                }
                break;
            case -440298373:
                if (strM3039E.equals("check_access")) {
                    return "检查插件文件权限";
                }
                break;
            case -146128825:
                if (strM3039E.equals("delete_plugin")) {
                    return "删除整个插件";
                }
                break;
            case -38568228:
                if (strM3039E.equals("workspace_status")) {
                    return "检查插件变更";
                }
                break;
            case 450667808:
                if (strM3039E.equals("search_files")) {
                    return "搜索插件文件";
                }
                break;
            case 695361430:
                if (strM3039E.equals("list_files")) {
                    return "列出插件文件";
                }
                break;
            case 1068342227:
                if (strM3039E.equals("move_path")) {
                    return "移动插件路径";
                }
                break;
            case 1648866102:
                if (strM3039E.equals("restore_path")) {
                    return "恢复插件路径";
                }
                break;
            case 1675538154:
                if (strM3039E.equals("create_directory")) {
                    return "创建插件目录";
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m3083s(File file) {
        C3010h c3010h = new C3010h(new C3011i(new C0791j(file, EnumC0792k.f2375g, (C0499x) null), true, new C1124g0(23)));
        int i9 = 0;
        long length = 0;
        while (c3010h.hasNext()) {
            i9++;
            length += ((File) c3010h.next()).length();
            if (i9 > 512) {
                C2104o.m5294t("插件文件数量超过 512");
                return;
            } else if (length > 33554432) {
                C2104o.m5294t("插件总大小超过 32 MB");
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m3084t(File file, File file2) {
        m3048N(file);
        if (file2.exists()) {
            m3049O(file2);
        }
        m3087w(file, "脚本插件根目录");
        if (file2.isDirectory()) {
            m3087w(file2, "插件目录 " + file2.getName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m3085u(File file) {
        m3049O(file);
        ArrayList arrayList = new ArrayList();
        m3086v(arrayList, file);
        if (arrayList.isEmpty()) {
            return;
        }
        C0086a.m449h("插件文件权限不可用，当前微信进程无法修复：".concat(AbstractC4166m.m8392A1(arrayList, "；", null, null, null, 62)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final void m3086v(ArrayList arrayList, File file) {
        Object c3959f;
        if (arrayList.size() >= 8) {
            return;
        }
        if (!AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            arrayList.add(file.getPath() + ": 不支持符号链接");
            return;
        }
        if (!file.isDirectory()) {
            if (file.canRead()) {
                try {
                    new FileInputStream(file).close();
                    c3959f = C3967n.f12976a;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (!(c3959f instanceof C3959f)) {
                    return;
                }
            }
            arrayList.add(file.getPath() + ": 文件不可读");
            return;
        }
        if (!file.canRead() || !file.canExecute()) {
            arrayList.add(file.getPath() + ": 目录不可读或不可进入");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            arrayList.add(file.getPath() + ": 无法列出目录内容");
            return;
        }
        for (File file2 : fileArrListFiles) {
            m3086v(arrayList, file2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m3087w(File file, String str) {
        Object c3959f;
        m3048N(file);
        C1158o2 c1158o2M3042H = m3042H(file);
        if (c1158o2M3042H.f3845a) {
            return;
        }
        try {
            c3959f = Os.stat(file.getAbsolutePath());
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        StructStat structStat = (StructStat) c3959f;
        String strM6837j = structStat != null ? AbstractC3199a.m6837j(structStat.st_uid, "uid=", ", gid=", structStat.st_gid) : "无法读取所有者";
        int iMyUid = Process.myUid();
        String str2 = c1158o2M3042H.f3846b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" 不可写，当前微信进程 uid=");
        sb2.append(iMyUid);
        sb2.append("，");
        sb2.append(strM6837j);
        C0086a.m449h(AbstractC0921a.m2255r(sb2, "，", str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m3088x(File file, File file2, String str) {
        EnumC1181u1 enumC1181u1;
        String str2;
        int i9;
        int i10;
        int i11;
        char c10;
        int i12;
        String str3;
        if ((file != null && file.isDirectory()) || (file2 != null && file2.isDirectory())) {
            if (file == null) {
                StringBuilder sbM1027p = AbstractC0255e.m1027p("diff --git a/", str, " b/", str, "\nnew directory ");
                sbM1027p.append(str);
                return sbM1027p.toString();
            }
            if (file2 == null) {
                StringBuilder sbM1027p2 = AbstractC0255e.m1027p("diff --git a/", str, " b/", str, "\ndeleted directory ");
                sbM1027p2.append(str);
                return sbM1027p2.toString();
            }
            StringBuilder sbM1027p3 = AbstractC0255e.m1027p("diff --git a/", str, " b/", str, "\npath type changed ");
            sbM1027p3.append(str);
            return sbM1027p3.toString();
        }
        String strM3046L = file != null ? m3046L(file) : null;
        String strM3046L2 = file2 != null ? m3046L(file2) : null;
        if ((file != null && strM3046L == null) || (file2 != null && strM3046L2 == null)) {
            return AbstractC0255e.m1022k("diff --git a/", str, " b/", str, "\nBinary files differ");
        }
        str.getClass();
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        List listM10253J = AbstractC5700d.m10253J(strM3046L == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3046L);
        if (strM3046L2 != null) {
            str4 = strM3046L2;
        }
        List listM10253J2 = AbstractC5700d.m10253J(str4);
        int i13 = 0;
        while (i13 < listM10253J.size() && i13 < listM10253J2.size() && AbstractC1416l.m3825a(listM10253J.get(i13), listM10253J2.get(i13))) {
            i13++;
        }
        int i14 = 0;
        while (i14 < listM10253J.size() - i13 && i14 < listM10253J2.size() - i13 && AbstractC1416l.m3825a(listM10253J.get((listM10253J.size() - 1) - i14), listM10253J2.get((listM10253J2.size() - 1) - i14))) {
            i14++;
        }
        List listSubList = listM10253J.subList(i13, listM10253J.size() - i14);
        List listSubList2 = listM10253J2.subList(i13, listM10253J2.size() - i14);
        ArrayList arrayList = new ArrayList(listM10253J2.size() + listM10253J.size());
        Iterator it = AbstractC4166m.m8403L1(i13, listM10253J).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC1181u1 = EnumC1181u1.f3968g;
            if (!zHasNext) {
                break;
            }
            arrayList.add(new C1185v1(enumC1181u1, (String) it.next()));
        }
        int i15 = 1;
        long size = ((long) listSubList.size()) * ((long) listSubList2.size());
        EnumC1181u1 enumC1181u12 = EnumC1181u1.f3969h;
        EnumC1181u1 enumC1181u13 = EnumC1181u1.f3970i;
        if (size <= 2000000) {
            int size2 = listSubList.size() + 1;
            int[][] iArr = new int[size2][];
            int i16 = 0;
            while (i16 < size2) {
                iArr[i16] = new int[listSubList2.size() + 1];
                i16++;
                i15 = i15;
            }
            i9 = i15;
            int size3 = listSubList.size() - 1;
            while (true) {
                if (-1 >= size3) {
                    break;
                }
                String str5 = strM3046L;
                int size4 = listSubList2.size() - 1;
                for (int i17 = -1; i17 < size4; i17 = -1) {
                    int i18 = size3;
                    iArr[size3][size4] = AbstractC1416l.m3825a(listSubList.get(size3), listSubList2.get(size4)) ? iArr[i18 + 1][size4 + 1] + 1 : Math.max(iArr[i18 + 1][size4], iArr[i18][size4 + 1]);
                    size4--;
                    size3 = i18;
                }
                size3--;
                strM3046L = str5;
            }
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (i19 >= listSubList.size() && i20 >= listSubList2.size()) {
                    break;
                }
                if (i19 >= listSubList.size() || i20 >= listSubList2.size()) {
                    str3 = strM3046L;
                } else {
                    str3 = strM3046L;
                    if (AbstractC1416l.m3825a(listSubList.get(i19), listSubList2.get(i20))) {
                        arrayList.add(new C1185v1(enumC1181u1, (String) listSubList.get(i19)));
                        i19++;
                        i20++;
                    }
                    strM3046L = str3;
                }
                if (i20 >= listSubList2.size() || (i19 < listSubList.size() && iArr[i19][i20 + 1] <= iArr[i19 + 1][i20])) {
                    arrayList.add(new C1185v1(enumC1181u12, (String) listSubList.get(i19)));
                    i19++;
                } else {
                    arrayList.add(new C1185v1(enumC1181u13, (String) listSubList2.get(i20)));
                    i20++;
                }
                strM3046L = str3;
            }
            str2 = strM3046L;
        } else {
            str2 = strM3046L;
            i9 = 1;
            Iterator it2 = listSubList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1185v1(enumC1181u12, (String) it2.next()));
            }
            Iterator it3 = listSubList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C1185v1(enumC1181u13, (String) it3.next()));
            }
        }
        if (i14 > 0) {
            Iterator it4 = AbstractC4166m.m8404M1(i14, listM10253J).iterator();
            while (it4.hasNext()) {
                arrayList.add(new C1185v1(enumC1181u1, (String) it4.next()));
            }
        }
        C2564d c2564dM45X = AbstractC0000a.m45X(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = c2564dM45X.iterator();
        while (true) {
            C2563c c2563c = (C2563c) it5;
            if (!c2563c.f8317i) {
                break;
            }
            Object next = c2563c.next();
            if (((C1185v1) arrayList.get(((Number) next).intValue())).f3989a != enumC1181u1) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return AbstractC2091b.m5164k(AbstractC0255e.m1027p("diff --git a/", str, " b/", str, "\n--- a/"), str, "\n+++ b/", str, "\nFile bytes changed without line-level text changes");
        }
        int[] iArr2 = new int[arrayList.size() + 1];
        int[] iArr3 = new int[arrayList.size() + 1];
        int i21 = i9;
        int i22 = i21;
        int i23 = 0;
        for (Object obj : arrayList) {
            int i24 = i23 + 1;
            if (i23 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            iArr2[i23] = i21;
            iArr3[i23] = i22;
            EnumC1181u1 enumC1181u14 = ((C1185v1) obj).f3989a;
            if (enumC1181u14 != enumC1181u13) {
                i21++;
            }
            if (enumC1181u14 != enumC1181u12) {
                i22++;
            }
            i23 = i24;
        }
        iArr2[arrayList.size()] = i21;
        iArr3[arrayList.size()] = i22;
        StringBuilder sbM1027p4 = AbstractC0255e.m1027p("diff --git a/", str, " b/", str, "\n--- ");
        sbM1027p4.append(str2 == null ? "/dev/null" : "a/".concat(str));
        sbM1027p4.append("\n+++ ");
        sbM1027p4.append(strM3046L2 != null ? "b/".concat(str) : "/dev/null");
        sbM1027p4.append('\n');
        ArrayList<C3958e> arrayList3 = new ArrayList();
        int iIntValue = ((Number) AbstractC4166m.m8422t1(arrayList2)).intValue();
        Iterator it6 = AbstractC4166m.m8419q1(i9, arrayList2).iterator();
        int i25 = iIntValue;
        while (it6.hasNext()) {
            int iIntValue2 = ((Number) it6.next()).intValue();
            List listSubList3 = arrayList.subList(i25 + 1, iIntValue2);
            if (listSubList3 == null || !listSubList3.isEmpty()) {
                Iterator it7 = listSubList3.iterator();
                i12 = 0;
                while (it7.hasNext()) {
                    if (((C1185v1) it7.next()).f3989a == enumC1181u1 && (i12 = i12 + 1) < 0) {
                        AbstractC0000a.m30P0();
                        throw null;
                    }
                }
            } else {
                i12 = 0;
            }
            if (i12 > 6) {
                arrayList3.add(new C3958e(Integer.valueOf(iIntValue), Integer.valueOf(i25)));
                iIntValue = iIntValue2;
            }
            i25 = iIntValue2;
        }
        arrayList3.add(new C3958e(Integer.valueOf(iIntValue), Integer.valueOf(i25)));
        ArrayList<C2564d> arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
        for (C3958e c3958e : arrayList3) {
            int iIntValue3 = ((Number) c3958e.f12961g).intValue();
            int iIntValue4 = ((Number) c3958e.f12962h).intValue();
            for (int i26 = 0; i26 < 3; i26++) {
                if (iIntValue3 > 0 && ((C1185v1) arrayList.get(iIntValue3 - 1)).f3989a == enumC1181u1) {
                    iIntValue3--;
                }
            }
            for (int i27 = 0; i27 < 3; i27++) {
                int i28 = iIntValue4 + 1;
                if (i28 < arrayList.size() && ((C1185v1) arrayList.get(i28)).f3989a == enumC1181u1) {
                    iIntValue4 = i28;
                }
            }
            arrayList4.add(new C2564d(iIntValue3, iIntValue4, 1));
        }
        int i29 = 1;
        for (C2564d c2564d : arrayList4) {
            int i30 = c2564d.f8312g;
            List<C1185v1> listSubList4 = arrayList.subList(i30, c2564d.f8313h + i29);
            if (listSubList4 == null || !listSubList4.isEmpty()) {
                Iterator it8 = listSubList4.iterator();
                i10 = 0;
                while (it8.hasNext()) {
                    if ((((C1185v1) it8.next()).f3989a != enumC1181u13) && (i10 = i10 + 1) < 0) {
                        AbstractC0000a.m30P0();
                        throw null;
                    }
                }
            } else {
                i10 = 0;
            }
            if (listSubList4 == null || !listSubList4.isEmpty()) {
                Iterator it9 = listSubList4.iterator();
                i11 = 0;
                while (it9.hasNext()) {
                    if ((((C1185v1) it9.next()).f3989a != enumC1181u12) && (i11 = i11 + 1) < 0) {
                        AbstractC0000a.m30P0();
                        throw null;
                    }
                }
            } else {
                i11 = 0;
            }
            sbM1027p4.append("@@ -");
            sbM1027p4.append(AbstractC5700d.m10264W(iArr2[i30], i10));
            sbM1027p4.append(" +");
            sbM1027p4.append(AbstractC5700d.m10264W(iArr3[i30], i11));
            sbM1027p4.append(" @@\n");
            for (C1185v1 c1185v1 : listSubList4) {
                int iOrdinal = c1185v1.f3989a.ordinal();
                if (iOrdinal == 0) {
                    c10 = ' ';
                } else if (iOrdinal == 1) {
                    c10 = '-';
                } else {
                    if (iOrdinal != 2) {
                        C3193a.m6822k();
                        return null;
                    }
                    c10 = '+';
                }
                sbM1027p4.append(c10);
                sbM1027p4.append(c1185v1.f3990b);
                sbM1027p4.append('\n');
            }
            i29 = 1;
        }
        return AbstractC3149m.m6705T0(sbM1027p4.toString()).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: y */
    public static String m3089y(File file) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[32768];
            while (true) {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    fileInputStream.close();
                    byte[] bArrDigest = messageDigest.digest();
                    bArrDigest.getClass();
                    return AbstractC4165l.m8368E0(bArrDigest, new C1124g0(24));
                }
                messageDigest.update(bArr, 0, i9);
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m3090z(File file) {
        Object c3959f;
        String strM3059Y = m3059Y(m3060Z(file));
        if (strM3059Y == null) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("[0-9a-f]{64}");
        patternCompile.getClass();
        if (!patternCompile.matcher(strM3059Y).matches()) {
            return false;
        }
        try {
            c3959f = Boolean.valueOf(m3062a0(m3053S(file)).equals(strM3059Y));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }
}
