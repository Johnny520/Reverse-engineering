package p080fb;

import android.content.Context;
import android.net.Uri;
import android.system.Os;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import ng.AbstractC3015m;
import ng.C3003a;
import ng.C3004b;
import ng.C3011i;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p025bc.AbstractC0255e;
import p025bc.C0260j;
import p036c9.C0415a0;
import p036c9.ThreadFactoryC0478q;
import p054dg.AbstractC0793l;
import p054dg.C0795n;
import p092g4.AbstractC1341a;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p136j8.AbstractC2091b;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3140d;
import p222p.AbstractC3199a;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3967n;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: fb.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1125g1 {

    /* JADX INFO: renamed from: a */
    public static final C1125g1 f3676a = new C1125g1();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap f3677b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public static final HashMap f3678c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final Object f3679d = new Object();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f3680e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f3681f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap.KeySetView f3682g = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap.KeySetView f3683h = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: i */
    public static final ExecutorService f3684i = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(9));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static File m2858a(Context context) {
        return new File(m2872p(context).getParentFile(), "attachments");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2859b(Context context, List list) {
        Object c3959f;
        list.getClass();
        try {
            c3959f = m2858a(context).getCanonicalFile();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        File file = (File) c3959f;
        if (file != null) {
            C3011i c3011iM6414X = AbstractC3015m.m6414X(new C0795n(list, 6), new C1121f1(context, 0));
            C3004b c3004b = new C3004b(c3011iM6414X.iterator(), new C1124g0(14));
            while (c3004b.hasNext()) {
                File file2 = (File) c3004b.next();
                try {
                    file2.delete();
                } catch (Throwable unused) {
                }
                for (File parentFile = file2.getParentFile(); parentFile != null && !parentFile.equals(file); parentFile = parentFile.getParentFile()) {
                    String[] list2 = parentFile.list();
                    if (list2 == null || list2.length != 0 || !parentFile.delete()) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C1192y m2860d(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("pluginName", HttpUrl.FRAGMENT_ENCODE_SET);
        String strM5162i = AbstractC2091b.m5162i(strOptString, "pluginId", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strOptString2 = jSONObject.optString("infoProp", HttpUrl.FRAGMENT_ENCODE_SET);
        String strM5162i2 = AbstractC2091b.m5162i(strOptString2, "mainJava", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        String strOptString3 = jSONObject.optString("summary", HttpUrl.FRAGMENT_ENCODE_SET);
        strOptString3.getClass();
        return new C1192y(strOptString, strM5162i, strOptString2, strM5162i2, strOptString3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2861e(Context context, String str) {
        context.getClass();
        str.getClass();
        String strM2869m = m2869m(str);
        ConcurrentHashMap.KeySetView keySetView = f3683h;
        keySetView.getClass();
        keySetView.add(strM2869m);
        f3681f.remove(strM2869m);
        Object objComputeIfAbsent = f3680e.computeIfAbsent(strM2869m, new C0260j(new C1124g0(13), 8));
        objComputeIfAbsent.getClass();
        synchronized (objComputeIfAbsent) {
            new File(m2872p(context), strM2869m.concat(".json")).delete();
        }
        File file = new File(ScriptPluginRuntime.INSTANCE.scriptDir(context).getParentFile(), "Agent/tool-results");
        file.mkdirs();
        if (AbstractC3149m.m6721t0(str)) {
            str = "session";
        }
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9_-]");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        strReplaceAll.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(96, strReplaceAll);
        if (AbstractC3149m.m6721t0(strM6701P0)) {
            strM6701P0 = "item";
        }
        AbstractC0793l.m2022b0(new File(file, strM6701P0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:42:0x02c7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r19v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX INFO: renamed from: f */
    public static JSONObject m2862f(C1113d1 c1113d1) throws JSONException {
        ?? r82;
        Iterator it;
        ?? jSONObject;
        Object obj;
        ?? jSONObject2 = new JSONObject();
        String str = "id";
        jSONObject2.put("id", c1113d1.f3636a);
        jSONObject2.put("title", c1113d1.f3637b);
        jSONObject2.put("createdAt", c1113d1.f3638c);
        jSONObject2.put("updatedAt", c1113d1.f3639d);
        jSONObject2.put("targetPluginId", c1113d1.f3642g);
        jSONObject2.put("conversationSummary", c1113d1.f3643h);
        jSONObject2.put("nativeToolHistory", c1113d1.f3644i);
        jSONObject2.put("protocolTranscript", c1113d1.f3645j);
        jSONObject2.put("compactedMessageCount", c1113d1.f3646k);
        jSONObject2.put("pinned", c1113d1.f3647l);
        jSONObject2.put("locked", c1113d1.f3648m);
        jSONObject2.put("sortOrder", c1113d1.f3649n);
        jSONObject2.put("checkpointSeq", c1113d1.f3651p);
        C1109c1 c1109c1 = c1113d1.f3650o;
        String str2 = "startedAt";
        if (c1109c1 != null) {
            ?? jSONObject3 = new JSONObject();
            jSONObject3.put("turnId", c1109c1.f3602a);
            jSONObject3.put("sourceUserMessageId", c1109c1.f3603b);
            jSONObject3.put("taskGoal", c1109c1.f3604c);
            jSONObject3.put("workContext", c1109c1.f3605d);
            C1138j2 c1138j2 = c1109c1.f3606e;
            if (c1138j2 != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("stagingPath", c1138j2.f3743a);
                jSONObject4.put("pluginId", c1138j2.f3744b);
                jSONObject4.put("existed", c1138j2.f3745c);
                jSONObject4.put("baseFingerprint", c1138j2.f3746d);
                jSONObject4.put("stageFingerprint", c1138j2.f3747e);
                JSONObject jSONObject5 = new JSONObject();
                for (Map.Entry entry : c1138j2.f3748f.entrySet()) {
                    jSONObject5.put((String) entry.getKey(), (String) entry.getValue());
                }
                jSONObject4.put("basePathStates", jSONObject5);
                jSONObject4.put("initialPluginName", c1138j2.f3749g);
                jSONObject4.put("revision", c1138j2.f3750h);
                jSONObject4.put("checkedRevision", c1138j2.f3751i);
                jSONObject4.put("shownRevision", c1138j2.f3752j);
                jSONObject4.put("deletePlugin", c1138j2.f3753k);
                jSONObject4.put("updatedAt", c1138j2.f3754l);
                obj = jSONObject4;
            } else {
                obj = JSONObject.NULL;
            }
            jSONObject3.put("workspaceCheckpoint", obj);
            jSONObject3.put("autoOpen", c1109c1.f3607f);
            jSONObject3.put("startedAt", c1109c1.f3608g);
            jSONObject3.put("updatedAt", c1109c1.f3609h);
            r82 = jSONObject3;
        } else {
            r82 = JSONObject.NULL;
        }
        jSONObject2.put("resumeState", r82);
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = c1113d1.f3640e.iterator();
        ?? r12 = jSONObject2;
        ?? r42 = jSONArray;
        while (it2.hasNext()) {
            C1107c c1107c = (C1107c) it2.next();
            ?? jSONObject6 = new JSONObject();
            jSONObject6.put("role", c1107c.f3584a);
            jSONObject6.put("content", c1107c.f3585b);
            jSONObject6.put(str, c1107c.f3586c);
            jSONObject6.put("turnId", c1107c.f3587d);
            jSONObject6.put("parentMessageId", c1107c.f3588e);
            jSONObject6.put("phase", c1107c.f3589f);
            jSONObject6.put("progress", c1107c.f3590g);
            jSONObject6.put("reasoning", c1107c.f3591h);
            jSONObject6.put("diff", c1107c.f3592i);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it3 = c1107c.f3593j.iterator();
            ?? r13 = r12;
            ?? r43 = r42;
            while (true) {
                it = it2;
                Iterator it4 = it3;
                if (!it3.hasNext()) {
                    break;
                }
                C1165q1 c1165q1 = (C1165q1) it4.next();
                ?? r16 = r13;
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put(str, c1165q1.f3874a);
                jSONObject7.put("kind", c1165q1.f3875b);
                jSONObject7.put("name", c1165q1.f3876c);
                jSONObject7.put("arguments", c1165q1.f3877d);
                jSONObject7.put("result", c1165q1.f3878e);
                jSONObject7.put("diff", c1165q1.f3879f);
                jSONObject7.put("status", c1165q1.f3880g);
                jSONObject7.put(str2, c1165q1.f3881h);
                jSONObject7.put("finishedAt", c1165q1.f3882i);
                jSONObject7.put("progress", c1165q1.f3883j);
                jSONObject7.put("turnId", c1165q1.f3884k);
                jSONObject7.put("toolCallId", c1165q1.f3885l);
                jSONObject7.put("protocolName", c1165q1.f3886m);
                jSONObject7.put("providerMetadata", c1165q1.f3887n);
                jSONObject7.put("parentAssistantMessageId", c1165q1.f3888o);
                jSONObject7.put("resultHandle", c1165q1.f3889p);
                jSONObject7.put("resultLength", c1165q1.f3890q);
                jSONObject7.put("truncated", c1165q1.f3891r);
                jSONObject7.put("nextOffset", c1165q1.f3892s);
                jSONArray2.put(jSONObject7);
                r13 = r16;
                it2 = it;
                it3 = it4;
                r43 = r43;
                str = str;
                str2 = str2;
            }
            ?? r162 = r13;
            String str3 = str;
            ?? r19 = r43;
            String str4 = str2;
            jSONObject6.put("toolEvents", jSONArray2);
            jSONObject6.put("status", c1107c.f3597n);
            C1192y c1192y = c1107c.f3598o;
            jSONObject6.put("draftSnapshot", c1192y != null ? m2863g(c1192y) : JSONObject.NULL);
            jSONObject6.put("clearsDraft", c1107c.f3599p);
            JSONArray jSONArray3 = new JSONArray();
            for (C1099a c1099a : c1107c.f3594k) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("name", c1099a.f3539a);
                jSONObject8.put("path", c1099a.f3540b);
                jSONObject8.put("mimeType", c1099a.f3541c);
                jSONObject8.put("size", c1099a.f3542d);
                jSONObject8.put("sourceUri", c1099a.f3543e);
                jSONArray3.put(jSONObject8);
            }
            jSONObject6.put("attachments", jSONArray3);
            C1101a1 c1101a1 = c1107c.f3595l;
            if (c1101a1 != null) {
                jSONObject = new JSONObject();
                jSONObject.put("role", c1101a1.f3547a);
                jSONObject.put("content", c1101a1.f3548b);
                jSONObject.put("createdAt", c1101a1.f3549c);
            } else {
                jSONObject = JSONObject.NULL;
            }
            jSONObject6.put("quotedMessage", jSONObject);
            jSONObject6.put("createdAt", c1107c.f3596m);
            jSONObject6.put("streamId", c1107c.f3600q);
            jSONObject6.put("completedAt", c1107c.f3601r);
            r19.put(jSONObject6);
            r42 = r19;
            r12 = r162;
            it2 = it;
            str = str3;
            str2 = str4;
        }
        ?? r163 = r12;
        r163.put("messages", r42);
        C1192y c1192y2 = c1113d1.f3641f;
        r163.put("draft", c1192y2 != null ? m2863g(c1192y2) : JSONObject.NULL);
        return r163;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static JSONObject m2863g(C1192y c1192y) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pluginName", c1192y.f4005a);
        jSONObject.put("pluginId", c1192y.f4006b);
        jSONObject.put("infoProp", c1192y.f4007c);
        jSONObject.put("mainJava", c1192y.f4008d);
        jSONObject.put("summary", c1192y.f4009e);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m2864h(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1107c c1107c = (C1107c) it.next();
                if (AbstractC1416l.m3825a(c1107c.f3584a, "user") && !(AbstractC3149m.m6721t0(c1107c.f3585b) && c1107c.f3594k.isEmpty())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static List m2865i(Context context) {
        File[] fileArrListFiles;
        File fileM2872p = m2872p(context);
        return (fileM2872p.isDirectory() && (fileArrListFiles = fileM2872p.listFiles()) != null) ? AbstractC4166m.m8402K1(AbstractC3015m.m6418b0(new C3011i(AbstractC3015m.m6414X(new C3011i(AbstractC4165l.m8376k0(fileArrListFiles), true, new C1124g0(15)), new C1124g0(16)), true, new C1124g0(11))), new C0415a0(new C0415a0(new C1167r(7), 12), 13)) : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static File m2866j(Context context, String str) {
        Object c3959f;
        Object c3959f2;
        if (AbstractC3149m.m6721t0(str)) {
            return null;
        }
        try {
            c3959f = m2858a(context).getCanonicalFile();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        File file = (File) c3959f;
        if (file == null) {
            return null;
        }
        try {
            c3959f2 = new File(str).getCanonicalFile();
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        if (c3959f2 instanceof C3959f) {
            c3959f2 = null;
        }
        File file2 = (File) c3959f2;
        if (file2 == null) {
            return null;
        }
        String path = file.getPath();
        path.getClass();
        String strM1020i = AbstractC0255e.m1020i(AbstractC3149m.m6706U0(path, File.separatorChar), File.separator);
        String path2 = file2.getPath();
        path2.getClass();
        if (AbstractC3156t.m6740d0(path2, strM1020i, false)) {
            return file2;
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: k */
    public static Object m2867k(Context context, ArrayList arrayList) {
        Uri uri;
        File file;
        Object objPutIfAbsent;
        try {
            HashSet hashSet = new HashSet();
            ArrayList<C1099a> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((C1099a) obj).f3540b)) {
                    arrayList2.add(obj);
                }
            }
            for (C1099a c1099a : arrayList2) {
                File fileM2866j = m2866j(context, c1099a.f3540b);
                if (fileM2866j == null) {
                    throw new IllegalStateException("附件路径无效: " + c1099a.f3539a);
                }
                if (!fileM2866j.isFile() || fileM2866j.length() <= 0) {
                    ConcurrentHashMap concurrentHashMap = f3677b;
                    String path = fileM2866j.getPath();
                    Object obj2 = concurrentHashMap.get(path);
                    if (obj2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(path, (obj2 = new Object()))) != null) {
                        obj2 = objPutIfAbsent;
                    }
                    synchronized (obj2) {
                        try {
                            if (!fileM2866j.isFile() || fileM2866j.length() <= 0) {
                                String str = c1099a.f3543e;
                                if (AbstractC3149m.m6721t0(str)) {
                                    str = null;
                                }
                                if (str == null || (uri = Uri.parse(str)) == null) {
                                    throw new IllegalStateException("附件副本不存在且无法重新读取: " + c1099a.f3539a);
                                }
                                file = new File(fileM2866j.getParentFile(), "." + fileM2866j.getName() + "." + UUID.randomUUID() + ".tmp");
                                File parentFile = fileM2866j.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                                if (inputStreamOpenInputStream == null) {
                                    throw new IllegalStateException("无法重新读取附件");
                                }
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
                                        AbstractC1341a.m3594j(inputStreamOpenInputStream, fileOutputStream);
                                        fileOutputStream.close();
                                        inputStreamOpenInputStream.close();
                                        if (!file.isFile() || file.length() <= 0) {
                                            throw new IllegalStateException("附件内容为空");
                                        }
                                        if (fileM2866j.exists() && !fileM2866j.delete()) {
                                            throw new IllegalStateException("无法替换附件副本");
                                        }
                                        if (!file.renameTo(fileM2866j)) {
                                            AbstractC0793l.m2021a0(file, fileM2866j);
                                            file.delete();
                                        }
                                        if (c1099a.f3542d > 0 && fileM2866j.length() != c1099a.f3542d) {
                                            throw new IllegalStateException("附件大小已变化");
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        } catch (Throwable th2) {
                            file.delete();
                            fileM2866j.delete();
                            AbstractC1184v0.m3204n("[Hchat:ScriptAgent] 恢复附件失败: " + c1099a.f3539a, th2);
                            throw new IllegalStateException("无法恢复附件: " + c1099a.f3539a, th2);
                        } finally {
                        }
                    }
                }
            }
            return C3967n.f12976a;
        } catch (Throwable th3) {
            return new C3959f(th3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m2868l(Context context, ArrayList arrayList) {
        String path;
        String path2;
        synchronized (f3679d) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    File fileM2866j = m2866j(context, ((C1099a) obj).f3540b);
                    boolean z9 = false;
                    if (fileM2866j != null && (path2 = fileM2866j.getPath()) != null) {
                        HashMap map = f3678c;
                        int iIntValue = ((Number) map.getOrDefault(path2, 1)).intValue() - 1;
                        if (iIntValue > 0) {
                            map.put(path2, Integer.valueOf(iIntValue));
                        } else {
                            map.remove(path2);
                            z9 = true;
                        }
                    }
                    if (z9) {
                        arrayList2.add(obj);
                    }
                }
                m2859b(context, arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    File fileM2866j2 = m2866j(context, ((C1099a) it.next()).f3540b);
                    if (fileM2866j2 != null && (path = fileM2866j2.getPath()) != null) {
                        f3677b.remove(path);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m2869m(String str) {
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9_-]");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        strReplaceAll.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(80, strReplaceAll);
        return AbstractC3149m.m6721t0(strM6701P0) ? "session" : strM6701P0;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: n */
    public static void m2870n(Context context, C1113d1 c1113d1) {
        Object c3959f;
        boolean zRenameTo;
        IllegalStateException illegalStateException;
        context.getClass();
        c1113d1.getClass();
        boolean zM2864h = m2864h(c1113d1.f3640e);
        String str = c1113d1.f3636a;
        if (!zM2864h) {
            str.getClass();
            m2861e(context, str);
            AbstractC0793l.m2022b0(new File(m2858a(context), m2869m(str)));
            return;
        }
        String strM2869m = m2869m(str);
        Object objComputeIfAbsent = f3680e.computeIfAbsent(strM2869m, new C0260j(new C1124g0(12), 7));
        objComputeIfAbsent.getClass();
        synchronized (objComputeIfAbsent) {
            try {
                if (f3683h.contains(strM2869m)) {
                    return;
                }
                File fileM2872p = m2872p(context);
                if (!fileM2872p.isDirectory()) {
                    fileM2872p.mkdirs();
                }
                File file = new File(fileM2872p, strM2869m.concat(".json"));
                Object obj = null;
                try {
                    c3959f = file.isFile() ? new JSONObject(AbstractC0793l.m2028h0(file, AbstractC3137a.f10177a)) : null;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (!(c3959f instanceof C3959f)) {
                    obj = c3959f;
                }
                JSONObject jSONObject = (JSONObject) obj;
                long jOptLong = jSONObject != null ? jSONObject.optLong("checkpointSeq", 0L) : 0L;
                long jOptLong2 = jSONObject != null ? jSONObject.optLong("updatedAt", 0L) : 0L;
                long j3 = c1113d1.f3651p;
                if (jOptLong <= j3 && (jOptLong != 0 || j3 != 0 || jOptLong2 <= c1113d1.f3639d)) {
                    File file2 = new File(fileM2872p, "." + file.getName() + ".tmp");
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        String string = m2862f(c1113d1).toString();
                        string.getClass();
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        byte[] bytes = string.getBytes(charset);
                        bytes.getClass();
                        fileOutputStream.write(bytes);
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        try {
                            Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
                        } finally {
                            if (!zRenameTo) {
                            }
                        }
                    } finally {
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m2871o(Context context, C1113d1 c1113d1) {
        context.getClass();
        c1113d1.getClass();
        if (m2864h(c1113d1.f3640e)) {
            String strM2869m = m2869m(c1113d1.f3636a);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f3681f.put(strM2869m, new C3958e(context, c1113d1));
            if (f3682g.add(strM2869m)) {
                f3684i.execute(new RunnableC1117e1(strM2869m));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static File m2872p(Context context) {
        return new File(ScriptPluginRuntime.INSTANCE.scriptDir(context).getParentFile(), "Agent/sessions");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m2873q(C1125g1 c1125g1, List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((C1107c) next).f3584a, "user")) {
                break;
            }
        }
        C1107c c1107c = (C1107c) next;
        String str = c1107c != null ? c1107c.f3585b : null;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll(" ");
        strReplaceAll.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(32, AbstractC3149m.m6703R0(strReplaceAll).toString());
        return AbstractC3149m.m6721t0(strM6701P0) ? "新对话" : strM6701P0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1113d1 m2874c(String str) {
        C1109c1 c1109c1;
        C1109c1 c1109c12;
        String str2;
        C1138j2 c1138j2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        int i9;
        Object next;
        C1101a1 c1101a1;
        JSONArray jSONArray2;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject2 = new JSONObject(str);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("messages");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        int length = jSONArrayOptJSONArray.length();
        int i13 = 0;
        while (true) {
            String str6 = "-";
            String str7 = "startedAt";
            String str8 = "createdAt";
            String str9 = "id";
            if (i13 >= length) {
                break;
            }
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i13);
            if (jSONObjectOptJSONObject != null) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("toolEvents");
                if (jSONArrayOptJSONArray2 == null) {
                    jSONArrayOptJSONArray2 = new JSONArray();
                }
                int length2 = jSONArrayOptJSONArray2.length();
                int i14 = 0;
                while (true) {
                    jSONObject = jSONObject2;
                    jSONArray = jSONArrayOptJSONArray;
                    i9 = length;
                    String str10 = str7;
                    if (i14 >= length2) {
                        break;
                    }
                    JSONObject jSONObject3 = jSONObjectOptJSONObject;
                    String str11 = str8;
                    ArrayList arrayList5 = arrayList2;
                    ArrayList arrayList6 = arrayList4;
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i14);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString = jSONObjectOptJSONObject2.optString("status", "success");
                        if (AbstractC3156t.m6734X(strOptString, "running") || AbstractC3156t.m6734X(strOptString, "queued")) {
                            strOptString = null;
                        }
                        if (strOptString == null) {
                            strOptString = "interrupted";
                        }
                        String strOptString2 = jSONObjectOptJSONObject2.optString(str9, AbstractC3199a.m6837j(i13, "legacy-", str6, i14));
                        i12 = i13;
                        str3 = str6;
                        String strM5162i = AbstractC2091b.m5162i(strOptString2, "kind", "tool", jSONObjectOptJSONObject2);
                        String strOptString3 = jSONObjectOptJSONObject2.optString("name", "工具调用");
                        String strM5162i2 = AbstractC2091b.m5162i(strOptString3, "arguments", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject2);
                        String strOptString4 = jSONObjectOptJSONObject2.optString("result", HttpUrl.FRAGMENT_ENCODE_SET);
                        String strM5162i3 = AbstractC2091b.m5162i(strOptString4, "diff", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject2);
                        str5 = str9;
                        long jOptLong = jSONObjectOptJSONObject2.optLong(str10, 0L);
                        str4 = str10;
                        long jOptLong2 = jSONObjectOptJSONObject2.optLong("finishedAt", 0L);
                        String strOptString5 = strOptString.equals("interrupted") ? "任务意外中断" : jSONObjectOptJSONObject2.optString("progress", HttpUrl.FRAGMENT_ENCODE_SET);
                        String strM5162i4 = AbstractC2091b.m5162i(strOptString5, "turnId", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject2);
                        String strOptString6 = jSONObjectOptJSONObject2.optString("toolCallId", HttpUrl.FRAGMENT_ENCODE_SET);
                        String strM5162i5 = AbstractC2091b.m5162i(strOptString6, "protocolName", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject2);
                        String strOptString7 = jSONObjectOptJSONObject2.optString("providerMetadata", HttpUrl.FRAGMENT_ENCODE_SET);
                        String strM5162i6 = AbstractC2091b.m5162i(strOptString7, "parentAssistantMessageId", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject2);
                        String strOptString8 = jSONObjectOptJSONObject2.optString("resultHandle", HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString8.getClass();
                        arrayList6.add(new C1165q1(strOptString2, strM5162i, strOptString3, strM5162i2, strOptString4, strM5162i3, strOptString, jOptLong, jOptLong2, strOptString5, strM5162i4, strOptString6, strM5162i5, strOptString7, strM5162i6, strOptString8, jSONObjectOptJSONObject2.optInt("resultLength", jSONObjectOptJSONObject2.optString("result", HttpUrl.FRAGMENT_ENCODE_SET).length()), jSONObjectOptJSONObject2.optBoolean("truncated", false), jSONObjectOptJSONObject2.optInt("nextOffset", 0)));
                    } else {
                        i12 = i13;
                        str3 = str6;
                        str4 = str10;
                        str5 = str9;
                    }
                    i14++;
                    arrayList4 = arrayList6;
                    jSONObject2 = jSONObject;
                    jSONArrayOptJSONArray = jSONArray;
                    length = i9;
                    str9 = str5;
                    jSONObjectOptJSONObject = jSONObject3;
                    str8 = str11;
                    i13 = i12;
                    str6 = str3;
                    str7 = str4;
                    arrayList2 = arrayList5;
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("attachments");
                if (jSONArrayOptJSONArray3 == null) {
                    jSONArrayOptJSONArray3 = new JSONArray();
                }
                int length3 = jSONArrayOptJSONArray3.length();
                int i15 = 0;
                while (i15 < length3) {
                    JSONObject jSONObject4 = jSONObjectOptJSONObject;
                    String str12 = str8;
                    ArrayList arrayList7 = arrayList4;
                    ArrayList arrayList8 = arrayList3;
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray3.optJSONObject(i15);
                    if (jSONObjectOptJSONObject3 != null) {
                        jSONArray2 = jSONArrayOptJSONArray3;
                        String strOptString9 = jSONObjectOptJSONObject3.optString("name", HttpUrl.FRAGMENT_ENCODE_SET);
                        arrayList = arrayList2;
                        String strM5162i7 = AbstractC2091b.m5162i(strOptString9, "path", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject3);
                        String strOptString10 = jSONObjectOptJSONObject3.optString("mimeType", "application/octet-stream");
                        strOptString10.getClass();
                        i10 = length3;
                        i11 = i15;
                        long jOptLong3 = jSONObjectOptJSONObject3.optLong("size", 0L);
                        String strOptString11 = jSONObjectOptJSONObject3.optString("sourceUri", HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString11.getClass();
                        arrayList8.add(new C1099a(strOptString9, strM5162i7, strOptString10, strOptString11, jOptLong3));
                    } else {
                        jSONArray2 = jSONArrayOptJSONArray3;
                        arrayList = arrayList2;
                        i10 = length3;
                        i11 = i15;
                    }
                    i15 = i11 + 1;
                    arrayList4 = arrayList7;
                    length3 = i10;
                    arrayList3 = arrayList8;
                    jSONArrayOptJSONArray3 = jSONArray2;
                    jSONObjectOptJSONObject = jSONObject4;
                    str8 = str12;
                    arrayList2 = arrayList;
                }
                String strOptString12 = jSONObjectOptJSONObject.optString("status", "complete");
                String strOptString13 = jSONObjectOptJSONObject.optString("progress", HttpUrl.FRAGMENT_ENCODE_SET);
                strOptString13.getClass();
                C3140d c3140d = new C3140d(strOptString13);
                if (c3140d.hasNext()) {
                    next = c3140d.next();
                    while (c3140d.hasNext()) {
                        next = c3140d.next();
                    }
                } else {
                    next = null;
                }
                String str13 = (String) next;
                if (str13 == null) {
                    str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String str14 = (AbstractC3156t.m6734X(strOptString12, "streaming") || (AbstractC3149m.m6709h0(str13, "等待确认", false) || AbstractC3156t.m6740d0(str13, "正在提交插件", false) || AbstractC3156t.m6740d0(str13, "正在创建插件", false) || AbstractC3156t.m6740d0(str13, "正在写入插件", false) || AbstractC3156t.m6740d0(str13, "正在删除插件", false))) ? "interrupted" : strOptString12;
                String strOptString14 = jSONObjectOptJSONObject.optString("role", "user");
                String strM5162i8 = AbstractC2091b.m5162i(strOptString14, "content", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject);
                String strOptString15 = jSONObjectOptJSONObject.optString(str9, HttpUrl.FRAGMENT_ENCODE_SET);
                if (AbstractC3149m.m6721t0(strOptString15)) {
                    strOptString15 = UUID.randomUUID().toString();
                }
                String strM5162i9 = AbstractC2091b.m5162i(strOptString15, "turnId", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject);
                String strOptString16 = jSONObjectOptJSONObject.optString("parentMessageId", HttpUrl.FRAGMENT_ENCODE_SET);
                strOptString16.getClass();
                String strOptString17 = jSONObjectOptJSONObject.optString("phase", jSONObjectOptJSONObject.optString("role", "user"));
                strOptString17.getClass();
                String strOptString18 = jSONObjectOptJSONObject.optString("progress", HttpUrl.FRAGMENT_ENCODE_SET);
                String strM5162i10 = AbstractC2091b.m5162i(strOptString18, "reasoning", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject);
                String strOptString19 = jSONObjectOptJSONObject.optString("diff", HttpUrl.FRAGMENT_ENCODE_SET);
                strOptString19.getClass();
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("quotedMessage");
                if (jSONObjectOptJSONObject4 != null) {
                    String strOptString20 = jSONObjectOptJSONObject4.optString("role", "user");
                    c1101a1 = new C1101a1(jSONObjectOptJSONObject4.optLong(str8, 0L), strOptString20, AbstractC2091b.m5162i(strOptString20, "content", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject4));
                } else {
                    c1101a1 = null;
                }
                long jOptLong4 = jSONObjectOptJSONObject.optLong(str8, System.currentTimeMillis());
                str14.getClass();
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("draftSnapshot");
                C1192y c1192yM2860d = jSONObjectOptJSONObject5 != null ? m2860d(jSONObjectOptJSONObject5) : null;
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("clearsDraft", false);
                String strOptString21 = jSONObjectOptJSONObject.optString("streamId", HttpUrl.FRAGMENT_ENCODE_SET);
                strOptString21.getClass();
                arrayList2.add(new C1107c(strOptString14, strM5162i8, strOptString15, strM5162i9, strOptString16, strOptString17, strOptString18, strM5162i10, strOptString19, arrayList4, arrayList3, c1101a1, jOptLong4, str14, c1192yM2860d, zOptBoolean, strOptString21, jSONObjectOptJSONObject.optLong("completedAt", 0L)));
            } else {
                jSONObject = jSONObject2;
                jSONArray = jSONArrayOptJSONArray;
                i9 = length;
            }
            i13++;
            jSONObject2 = jSONObject;
            jSONArrayOptJSONArray = jSONArray;
            length = i9;
            arrayList2 = arrayList2;
        }
        long jOptLong5 = jSONObject2.optLong("updatedAt", System.currentTimeMillis());
        JSONObject jSONObjectOptJSONObject6 = jSONObject2.optJSONObject("resumeState");
        if (jSONObjectOptJSONObject6 != null) {
            String strOptString22 = jSONObjectOptJSONObject6.optString("turnId", HttpUrl.FRAGMENT_ENCODE_SET);
            String strOptString23 = jSONObjectOptJSONObject6.optString("sourceUserMessageId", HttpUrl.FRAGMENT_ENCODE_SET);
            strOptString22.getClass();
            if (!AbstractC3149m.m6721t0(strOptString22)) {
                strOptString23.getClass();
                if (AbstractC3149m.m6721t0(strOptString23)) {
                    c1109c12 = null;
                } else {
                    String strOptString24 = jSONObjectOptJSONObject6.optString("taskGoal", HttpUrl.FRAGMENT_ENCODE_SET);
                    String strM5162i11 = AbstractC2091b.m5162i(strOptString24, "workContext", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject6);
                    JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject6.optJSONObject("workspaceCheckpoint");
                    if (jSONObjectOptJSONObject7 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject7.optJSONObject("basePathStates");
                        if (jSONObjectOptJSONObject8 != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject8.keys();
                            itKeys.getClass();
                            for (String str15 : (C3003a) AbstractC3015m.m6408R(itKeys)) {
                                linkedHashMap.put(str15, jSONObjectOptJSONObject8.optString(str15, "missing"));
                                strOptString24 = strOptString24;
                            }
                        }
                        str2 = strOptString24;
                        String strOptString25 = jSONObjectOptJSONObject7.optString("stagingPath", HttpUrl.FRAGMENT_ENCODE_SET);
                        String strM5162i12 = AbstractC2091b.m5162i(strOptString25, "pluginId", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject7);
                        boolean zOptBoolean2 = jSONObjectOptJSONObject7.optBoolean("existed", false);
                        String strOptString26 = jSONObjectOptJSONObject7.optString("baseFingerprint", HttpUrl.FRAGMENT_ENCODE_SET);
                        String strM5162i13 = AbstractC2091b.m5162i(strOptString26, "stageFingerprint", HttpUrl.FRAGMENT_ENCODE_SET, jSONObjectOptJSONObject7);
                        String strOptString27 = jSONObjectOptJSONObject7.optString("initialPluginName", HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString27.getClass();
                        c1138j2 = new C1138j2(strOptString25, strM5162i12, zOptBoolean2, strOptString26, strM5162i13, linkedHashMap, strOptString27, jSONObjectOptJSONObject7.optInt("revision", 0), jSONObjectOptJSONObject7.optInt("checkedRevision", -1), jSONObjectOptJSONObject7.optInt("shownRevision", -1), jSONObjectOptJSONObject7.optBoolean("deletePlugin", false), jSONObjectOptJSONObject7.optLong("updatedAt", 0L));
                    } else {
                        str2 = strOptString24;
                        c1138j2 = null;
                    }
                    c1109c12 = new C1109c1(strOptString22, strOptString23, str2, strM5162i11, c1138j2, jSONObjectOptJSONObject6.optBoolean("autoOpen", true), jSONObjectOptJSONObject6.optLong("startedAt", jOptLong5), jSONObjectOptJSONObject6.optLong("updatedAt", jOptLong5));
                }
                c1109c1 = c1109c12;
            }
        } else {
            c1109c1 = null;
        }
        String strOptString28 = jSONObject2.optString("id");
        if (AbstractC3149m.m6721t0(strOptString28)) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            strOptString28 = AbstractC3156t.m6737a0(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false);
        }
        String strOptString29 = jSONObject2.optString("title", m2873q(this, arrayList2));
        strOptString29.getClass();
        long jOptLong6 = jSONObject2.optLong("createdAt", System.currentTimeMillis());
        JSONObject jSONObjectOptJSONObject9 = jSONObject2.optJSONObject("draft");
        C1192y c1192yM2860d2 = jSONObjectOptJSONObject9 != null ? m2860d(jSONObjectOptJSONObject9) : null;
        String strOptString30 = jSONObject2.optString("targetPluginId", HttpUrl.FRAGMENT_ENCODE_SET);
        String strM5162i14 = AbstractC2091b.m5162i(strOptString30, "conversationSummary", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject2);
        String strOptString31 = jSONObject2.optString("nativeToolHistory", HttpUrl.FRAGMENT_ENCODE_SET);
        String strM5162i15 = AbstractC2091b.m5162i(strOptString31, "protocolTranscript", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject2);
        String str16 = strOptString28;
        int iM7909r = AbstractC3754e0.m7909r(jSONObject2.optInt("compactedMessageCount", 0), 0, arrayList2.size());
        boolean zOptBoolean3 = jSONObject2.optBoolean("pinned", false);
        boolean zOptBoolean4 = jSONObject2.optBoolean("locked", false);
        long jOptLong7 = jSONObject2.optLong("sortOrder", jOptLong5);
        long jOptLong8 = jSONObject2.optLong("checkpointSeq", 0L);
        return new C1113d1(str16, strOptString29, jOptLong6, jOptLong5, arrayList2, c1192yM2860d2, strOptString30, strM5162i14, strOptString31, strM5162i15, iM7909r, zOptBoolean3, zOptBoolean4, jOptLong7, c1109c1, jOptLong8 < 0 ? 0L : jOptLong8);
    }
}
