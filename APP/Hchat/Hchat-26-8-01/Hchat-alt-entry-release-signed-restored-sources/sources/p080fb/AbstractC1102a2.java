package p080fb;

import gg.AbstractC1416l;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import p332wb.AbstractC4855en;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: fb.a2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1102a2 {

    /* JADX INFO: renamed from: a */
    public static final C3147k f3550a = new C3147k("[\\\\/:*?\"<>|\\u0000-\\u001f]");

    /* JADX INFO: renamed from: b */
    public static final C3147k f3551b = new C3147k("(?:new\\s+File|FileOutputStream|FileWriter|RandomAccessFile|Paths\\.get)\\s*\\(\\s*[\\\"'](?:/|[A-Za-z]:[\\\\/]|[^\\\"']*\\.\\.[\\\\/])");

    /* JADX INFO: renamed from: c */
    public static final List f3552c = AbstractC0000a.m101y0(new C3958e(new C3147k("Runtime\\.getRuntime\\(\\)\\.exec|ProcessBuilder"), "包含执行系统进程的代码，保存前请确认来源和用途"), new C3958e(new C3147k("ClassLoader|DexClassLoader|createPackageContext"), "包含 ClassLoader 或跨包加载代码，保存前请确认来源和用途"), new C3958e(new C3147k("System\\.load(?:Library)?|\\bloadSo\\s*\\("), "包含Native库加载代码，保存前请确认来源和用途"), new C3958e(new C3147k("java\\.lang\\.reflect|XposedBridge|XposedHelpers|hookBefore|hookAfter|hookReplace"), "包含反射或 Hook 代码，保存前请确认来源和用途"), new C3958e(new C3147k("\\.delete\\s*\\("), "包含删除文件的代码，保存前请确认来源和用途"), new C3958e(new C3147k("OkHttpClient|new\\s+URL\\s*\\(|Socket|https?://|\\b(?:get|post|download)\\s*\\(\\s*\"https?://"), "包含网络访问代码，保存前请确认请求目标和数据范围"));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m2819a(String str) {
        String strM6839l = AbstractC3199a.m6839l(str, str);
        if (AbstractC3156t.m6740d0(strM6839l, "```", false)) {
            strM6839l = AbstractC3149m.m6695J0(strM6839l, '\n', HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return AbstractC3156t.m6733W(strM6839l, "```", false) ? AbstractC3149m.m6705T0(AbstractC3149m.m6712k0(3, strM6839l)).toString() : strM6839l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m2820b(String str) {
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        Character chValueOf = null;
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            int i11 = i9 + 1;
            Character chM6715n0 = AbstractC3149m.m6715n0(str, i11);
            if (z9) {
                if (cCharAt == '\n') {
                    z9 = false;
                }
            } else if (z10) {
                if (cCharAt == '*' && chM6715n0 != null && chM6715n0.charValue() == '/') {
                    i9 += 2;
                    z10 = false;
                }
            } else if (chValueOf != null) {
                if (z11) {
                    z11 = false;
                } else if (cCharAt == '\\') {
                    z11 = true;
                } else if (cCharAt == chValueOf.charValue()) {
                    chValueOf = null;
                }
            } else if (cCharAt == '/' && chM6715n0 != null && chM6715n0.charValue() == '/') {
                i9 += 2;
                z9 = true;
            } else if (cCharAt == '/' && chM6715n0 != null && chM6715n0.charValue() == '*') {
                i9 += 2;
                z10 = true;
            } else if (cCharAt == '\"' || cCharAt == '\'') {
                chValueOf = Character.valueOf(cCharAt);
            } else if (cCharAt == '{') {
                i10++;
            } else if (cCharAt == '}') {
                i10--;
            } else if (i10 == 0 && AbstractC3156t.m6735Y(str, i9, "native", 0, 6, false)) {
                Character chM6715n02 = AbstractC3149m.m6715n0(str, i9 - 1);
                Character chM6715n03 = AbstractC3149m.m6715n0(str, i9 + 6);
                boolean z12 = chM6715n02 != null && Character.isJavaIdentifierPart(chM6715n02.charValue());
                boolean z13 = chM6715n03 != null && Character.isJavaIdentifierPart(chM6715n03.charValue());
                if (!z12 && !z13) {
                    return true;
                }
            }
            i9 = i11;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1192y m2821c(C1192y c1192y) {
        String strM2819a = m2819a(c1192y.f4007c);
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(strM2819a));
        } catch (Throwable unused) {
        }
        String string = AbstractC3149m.m6703R0(c1192y.f4005a).toString();
        if (AbstractC3149m.m6721t0(string)) {
            String property = properties.getProperty("name");
            if (property == null) {
                property = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            string = property;
        }
        String str = string;
        String str2 = c1192y.f4006b;
        if (AbstractC3149m.m6721t0(str2)) {
            str2 = str;
        }
        String strM2823e = m2823e(str2);
        String string2 = AbstractC3149m.m6703R0(strM2819a).toString();
        String string3 = AbstractC3149m.m6703R0(m2819a(c1192y.f4008d)).toString();
        String string4 = AbstractC3149m.m6703R0(c1192y.f4009e).toString();
        string2.getClass();
        string3.getClass();
        string4.getClass();
        return new C1192y(str, strM2823e, string2, string3, string4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static ArrayList m2822d(String str) {
        ArrayList arrayList = new ArrayList();
        for (C3958e c3958e : f3552c) {
            C1100a0 c1100a0 = ((C3147k) c3958e.f12961g).m6682a(str) ? new C1100a0(EnumC1104b0.f3556h, (String) c3958e.f12962h, true) : null;
            if (c1100a0 != null) {
                arrayList.add(c1100a0);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2823e(String str) {
        String strM6701P0 = AbstractC3149m.m6701P0(64, AbstractC3149m.m6704S0(AbstractC2091b.m5161h("\\s+", f3550a.m6685f(AbstractC3199a.m6839l(str, str), "_"), "_"), '.', ' '));
        return AbstractC3149m.m6721t0(strM6701P0) ? "ai_plugin" : strM6701P0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1197z1 m2824f(C1192y c1192y) {
        String str;
        List listM99x0;
        ArrayList arrayList = new ArrayList();
        String string = AbstractC3149m.m6703R0(c1192y.f4006b).toString();
        String str2 = c1192y.f4008d;
        String str3 = c1192y.f4007c;
        Properties properties = new Properties();
        try {
            properties.load(new StringReader(str3));
        } catch (Throwable unused) {
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(string);
        EnumC1104b0 enumC1104b0 = EnumC1104b0.f3555g;
        if (zM6721t0 || string.equals(".") || string.equals("..")) {
            arrayList.add(new C1100a0(enumC1104b0, "插件目录名不能为空", false));
        }
        if (!string.equals(m2823e(string))) {
            arrayList.add(new C1100a0(enumC1104b0, "插件目录名包含路径或文件名不允许的字符", false));
        }
        if (AbstractC3149m.m6709h0(string, "..", false)) {
            arrayList.add(new C1100a0(enumC1104b0, "插件目录名不能包含 ..", false));
        }
        if (AbstractC3149m.m6721t0(str2)) {
            arrayList.add(new C1100a0(enumC1104b0, "main.java 不能为空", false));
        }
        Iterator it = AbstractC0000a.m101y0("name", "version", "author").iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (!zHasNext) {
                break;
            }
            String str4 = (String) it.next();
            String property = properties.getProperty(str4);
            if (property != null) {
                str = property;
            }
            if (AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(str).toString())) {
                arrayList.add(new C1100a0(enumC1104b0, AbstractC4855en.m9263g("info.prop 缺少 ", str4), false));
            }
        }
        String property2 = properties.getProperty("process");
        if (property2 != null) {
            str = property2;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Pattern patternCompile = Pattern.compile("[,;|\\s]+");
        patternCompile.getClass();
        AbstractC3149m.m6689D0(0);
        Matcher matcher = patternCompile.matcher(lowerCase);
        char c10 = '\n';
        if (matcher.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(lowerCase.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList2.add(lowerCase.subSequence(iEnd, lowerCase.length()).toString());
            listM99x0 = arrayList2;
        } else {
            listM99x0 = AbstractC0000a.m99x0(lowerCase.toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : listM99x0) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            String str5 = (String) obj2;
            if (!AbstractC1416l.m3825a(str5, "main") && !AbstractC1416l.m3825a(str5, "appbrand") && !AbstractC1416l.m3825a(str5, "all")) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            arrayList.add(new C1100a0(enumC1104b0, "info.prop 的 process 只支持 main、appbrand 或 all", false));
        }
        if (AbstractC3149m.m6709h0(str2, "```", false)) {
            arrayList.add(new C1100a0(enumC1104b0, "main.java 仍包含 Markdown 代码围栏", false));
        }
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        Character chValueOf = null;
        while (true) {
            if (i9 < str2.length()) {
                char cCharAt = str2.charAt(i9);
                int i11 = i9 + 1;
                Character chM6715n0 = AbstractC3149m.m6715n0(str2, i11);
                if (z9) {
                    if (cCharAt == c10) {
                        z9 = false;
                    }
                } else if (z10) {
                    if (cCharAt == '*' && chM6715n0 != null && chM6715n0.charValue() == '/') {
                        i9 += 2;
                        z10 = false;
                    }
                } else if (chValueOf == null) {
                    if (cCharAt == '/' && chM6715n0 != null && chM6715n0.charValue() == '/') {
                        i9 += 2;
                        z9 = true;
                    } else if (cCharAt == '/' && chM6715n0 != null && chM6715n0.charValue() == '*') {
                        i9 += 2;
                        z10 = true;
                    } else {
                        if (cCharAt == '\"' || cCharAt == '\'') {
                            chValueOf = Character.valueOf(cCharAt);
                        } else if (cCharAt == '{') {
                            i10++;
                        } else if (cCharAt == '}' && i10 - 1 < 0) {
                            break;
                        }
                        i9 = i11;
                    }
                    c10 = '\n';
                } else if (z11) {
                    z11 = false;
                } else if (cCharAt == '\\') {
                    z11 = true;
                } else if (cCharAt == chValueOf.charValue()) {
                    chValueOf = null;
                }
                i9 = i11;
            } else if (chValueOf != null || z10 || i10 != 0) {
                break;
            }
        }
        arrayList.add(new C1100a0(enumC1104b0, "main.java 的大括号不平衡", false));
        if (m2820b(str2)) {
            arrayList.add(new C1100a0(enumC1104b0, "BeanShell 顶层 native 方法无法绑定 JNI，请把 native 声明放进类并将该类的 ClassLoader 传给 loadSo", false));
        }
        if (f3551b.m6682a(str2)) {
            arrayList.add(new C1100a0(enumC1104b0, "代码包含绝对路径或 .. 路径，请改用 pluginDir、pluginDirFile 或 cacheDir", false));
        }
        for (String str6 : AbstractC0000a.m101y0("onLoad", "onUnload", "openSettings", "onClickSendBtn", "onHandleMsg", "onImageDownload", "onMemberChange", "onNewFriend", "onProtobufPacket")) {
            Pattern patternCompile2 = Pattern.compile("\\b" + str6 + "\\s*\\(");
            patternCompile2.getClass();
            if (patternCompile2.matcher(str2).find()) {
                Pattern patternCompile3 = Pattern.compile("\\b" + str6 + "\\s*\\([^)]*\\)\\s*\\{");
                patternCompile3.getClass();
                if (!patternCompile3.matcher(str2).find()) {
                    arrayList.add(new C1100a0(EnumC1104b0.f3556h, AbstractC0255e.m1020i(str6, " 的定义看起来不完整，请确认回调签名和大括号"), false));
                }
            }
        }
        AbstractC4171r.m8432h1(arrayList, m2822d(str2));
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList) {
            C1100a0 c1100a0 = (C1100a0) obj3;
            if (hashSet.add(new C3958e(c1100a0.f3544a, c1100a0.f3545b))) {
                arrayList5.add(obj3);
            }
        }
        return new C1197z1(arrayList5);
    }
}
