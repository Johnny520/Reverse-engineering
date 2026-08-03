package gb;

import android.content.Context;
import android.system.Os;
import android.util.Base64;
import com.alibaba.fastjson2.JSONB;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p036c9.C0499x;
import p054dg.AbstractC0793l;
import p054dg.C0789h;
import p054dg.C0791j;
import p054dg.EnumC0792k;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p088g0.C1271o;
import p089g1.C1275d;
import p092g4.AbstractC1341a;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: gb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1387k {

    /* JADX INFO: renamed from: a */
    public static final Set f4608a = AbstractC4156d0.m8355W("main.java", "main.java.bshs", "info.prop", "README.md");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m3764a(Context context, String str, String str2, String str3, List list) {
        Object next;
        context.getClass();
        try {
            Iterator<T> it = ScriptPluginRuntime.INSTANCE.listPlugins(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C0859c0) next).f2626a.equals(str)) {
                    break;
                }
            }
            C0859c0 c0859c0 = (C0859c0) next;
            if (c0859c0 == null) {
                throw new IllegalStateException(("未找到本地插件: " + str).toString());
            }
            String str4 = c0859c0.f2631f;
            String str5 = c0859c0.f2630e;
            String str6 = c0859c0.f2626a;
            File file = c0859c0.f2628c;
            ArrayList arrayList = new ArrayList();
            boolean z9 = true;
            C1383g c1383gM3779p = m3779p(file, "main.java", true, "main.java");
            if (c1383gM3779p == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList.add(c1383gM3779p);
            C1383g c1383gM3780q = m3780q(file);
            if (c1383gM3780q != null) {
                arrayList.add(c1383gM3780q);
            }
            C1383g c1383gM3779p2 = m3779p(file, "info.prop", false, "info.prop");
            if (c1383gM3779p2 != null) {
                arrayList.add(c1383gM3779p2);
            }
            File file2 = new File(file, "README.md");
            if (!file2.isFile()) {
                file2 = null;
            }
            if (file2 == null) {
                file2 = new File(file, "readme.md");
                if (!file2.isFile()) {
                    file2 = null;
                }
            }
            if (file2 != null) {
                String name = file2.getName();
                name.getClass();
                C1383g c1383gM3779p3 = m3779p(file, name, true, "README.md");
                if (c1383gM3779p3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                arrayList.add(c1383gM3779p3);
            }
            AbstractC4171r.m8432h1(arrayList, list);
            m3785v(arrayList, false);
            String string = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
            if (string != null && !AbstractC3149m.m6721t0(string)) {
                z9 = false;
            }
            String str7 = z9 ? null : string;
            if (str7 == null) {
                str7 = c0859c0.f2627b;
            }
            String str8 = str7;
            if (str6.length() > 128) {
                throw new IllegalArgumentException("本地插件目录名不能超过 128 个字符");
            }
            if (str8.length() > 100) {
                throw new IllegalArgumentException("上传插件名不能超过 100 个字符");
            }
            if (str5.length() > 100) {
                throw new IllegalArgumentException("插件作者不能超过 100 个字符");
            }
            if (str4.length() > 64) {
                throw new IllegalArgumentException("插件版本不能超过 64 个字符");
            }
            if (str3.length() > 500) {
                throw new IllegalArgumentException("更新说明不能超过 500 个字符");
            }
            C1386j c1386jM3767d = m3767d();
            return new C1394r(str6, str8, str5, str4, c0859c0.f2632g, AbstractC3149m.m6703R0(str3).toString(), c1386jM3767d.f4605a, c1386jM3767d.f4606b, c1386jM3767d.f4607c, arrayList);
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: b */
    public static void m3765b(File file, File file2) throws IOException {
        m3773j(file);
        if (!file2.isDirectory() && !file2.mkdirs()) {
            C2104o.m5276A("创建插件暂存目录失败");
            return;
        }
        C0789h c0789h = new C0789h(new C0791j(file, EnumC0792k.f2375g, (C0499x) null));
        while (c0789h.hasNext()) {
            File file3 = (File) c0789h.next();
            File file4 = new File(file2, AbstractC0793l.m2029i0(file3, file).getPath());
            if (!file3.isDirectory()) {
                File parentFile = file4.getParentFile();
                if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                    C2104o.m5276A("创建父目录失败");
                    return;
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1383g m3766c(String str, byte[] bArr) {
        Object c3959f;
        String str2;
        String strM3786w = m3786w(str);
        if (m3777n(strM3786w)) {
            C2104o.m5291q("附加文件不能覆盖默认插件文件: ".concat(strM3786w));
            return null;
        }
        if (bArr.length > 16777216) {
            C2104o.m5291q(strM3786w.concat(" 超过 16384 KiB"));
            return null;
        }
        try {
            c3959f = m3768e(strM3786w, bArr);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        String strEncodeToString = (String) c3959f;
        if (strEncodeToString == null) {
            str2 = "base64";
            break;
        }
        for (byte b10 : bArr) {
            if (b10 == 0) {
                str2 = "base64";
                break;
            }
        }
        str2 = "utf8";
        if (!str2.equals("utf8")) {
            strEncodeToString = Base64.encodeToString(bArr, 2);
        } else if (strEncodeToString == null) {
            strEncodeToString = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = strEncodeToString;
        str3.getClass();
        return new C1383g(strM3786w, str3, m3783t(bArr), str2, bArr.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C1386j m3767d() {
        Object c3959f;
        C1360a c1360aAccount = WeChatApis.account();
        if (c1360aAccount == null) {
            C2104o.m5276A("当前微信账号资料尚未就绪，请重启微信后重试");
            return null;
        }
        String strM3652c = c1360aAccount.m3652c();
        strM3652c.getClass();
        String string = AbstractC3149m.m6703R0(strM3652c).toString();
        if (AbstractC3149m.m6721t0(string)) {
            C2104o.m5294t("无法读取当前账号 wxid，请重启微信后重试");
            return null;
        }
        try {
            C1368i c1368iContacts = WeChatApis.contacts();
            c3959f = c1368iContacts != null ? c1368iContacts.m3725n(string) : null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        WeChatContact weChatContact = (WeChatContact) c3959f;
        String strM3651b = c1360aAccount.m3651b(42);
        strM3651b.getClass();
        String string2 = AbstractC3149m.m6703R0(strM3651b).toString();
        boolean zM6721t0 = AbstractC3149m.m6721t0(string2);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zM6721t0) {
            String str2 = weChatContact != null ? weChatContact.customWxId : null;
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            string2 = AbstractC3149m.m6703R0(str2).toString();
        }
        String strM3651b2 = c1360aAccount.m3651b(4);
        strM3651b2.getClass();
        String string3 = AbstractC3149m.m6703R0(strM3651b2).toString();
        if (AbstractC3149m.m6721t0(string3)) {
            String str3 = weChatContact != null ? weChatContact.nickname : null;
            if (str3 != null) {
                str = str3;
            }
            string3 = AbstractC3149m.m6703R0(str).toString();
        }
        if (string.length() > 128) {
            C2104o.m5294t("当前账号 wxid 长度异常");
            return null;
        }
        if (string2.length() > 128) {
            C2104o.m5294t("当前账号微信号长度异常");
            return null;
        }
        if (string3.length() <= 100) {
            return new C1386j(string, string2, string3);
        }
        C2104o.m5294t("当前账号微信昵称过长");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m3768e(String str, byte[] bArr) {
        Object c3959f;
        try {
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            c3959f = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            throw new IllegalArgumentException(str.concat(" 不是有效 UTF-8 文本"), thM8182b);
        }
        c3959f.getClass();
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m3769f(C1391o c1391o) {
        c1391o.getClass();
        String str = c1391o.f4618b;
        if (AbstractC3149m.m6721t0(str)) {
            str = c1391o.f4617a;
        }
        return m3782s(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m3770g(File file) {
        File[] fileArrListFiles;
        if (!AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            C2104o.m5291q(AbstractC4855en.m9263g("不支持删除符号链接: ", file.getName()));
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m3770g(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        C0086a.m449h(AbstractC4855en.m9263g("删除文件失败: ", file.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m3771h(File file) {
        if (file.exists()) {
            m3770g(file);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m3772i(File file, File file2) {
        if (!AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            C2104o.m5291q(AbstractC4855en.m9263g("插件文件不能是符号链接: ", file.getName()));
        } else {
            if (AbstractC1416l.m3825a(file.getCanonicalFile().getParentFile(), file2.getCanonicalFile())) {
                return;
            }
            C2104o.m5294t("插件文件路径越界");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m3773j(File file) {
        if (!AbstractC1416l.m3825a(file.getAbsoluteFile(), file.getCanonicalFile())) {
            C2104o.m5294t("插件目录包含不支持的符号链接");
            return;
        }
        if (file.isDirectory()) {
            C0789h c0789h = new C0789h(new C0791j(file, EnumC0792k.f2375g, (C0499x) null));
            while (c0789h.hasNext()) {
                File file2 = (File) c0789h.next();
                if (!AbstractC1416l.m3825a(file2.getAbsoluteFile(), file2.getCanonicalFile())) {
                    C2104o.m5291q(AbstractC4855en.m9263g("插件目录包含不支持的符号链接: ", file2.getName()));
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m3774k(Context context, C1391o c1391o) {
        c1391o.getClass();
        File fileScriptDir = ScriptPluginRuntime.INSTANCE.scriptDir(context);
        String strM3769f = m3769f(c1391o);
        if (new File(fileScriptDir, strM3769f).isDirectory()) {
            return strM3769f;
        }
        String strM3782s = m3782s(c1391o.f4617a);
        if (!strM3782s.equals(strM3769f) && new File(fileScriptDir, strM3782s).isDirectory()) {
            return strM3782s;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: l */
    public static long m3775l(String str) {
        switch (str.hashCode()) {
            case -296580809:
                return !str.equals("main.java") ? 16777216L : 524288L;
            case 1186280611:
                return !str.equals("info.prop") ? 16777216L : 65536L;
            case 1567368051:
                str.equals("main.java.bshs");
                return 16777216L;
            case 1685611991:
                return !str.equals("README.md") ? 16777216L : 262144L;
            default:
                return 16777216L;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, THROW, IF, INVOKE, MOVE, INVOKE, CONSTRUCTOR, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a6 A[Catch: all -> 0x02a1, TRY_ENTER, TryCatch #0 {all -> 0x02a1, blocks: (B:122:0x0297, B:129:0x02a6, B:131:0x02ac, B:141:0x02ce, B:142:0x02e8, B:143:0x02e9), top: B:168:0x0297, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ce A[Catch: all -> 0x02a1, TRY_ENTER, TryCatch #0 {all -> 0x02a1, blocks: (B:122:0x0297, B:129:0x02a6, B:131:0x02ac, B:141:0x02ce, B:142:0x02e8, B:143:0x02e9), top: B:168:0x0297, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e9 A[Catch: all -> 0x02a1, TRY_LEAVE, TryCatch #0 {all -> 0x02a1, blocks: (B:122:0x0297, B:129:0x02a6, B:131:0x02ac, B:141:0x02ce, B:142:0x02e8, B:143:0x02e9), top: B:168:0x0297, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0297 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m3776m(Context context, C1391o c1391o, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object c3959f;
        Object c3959f2;
        C3967n c3967n = C3967n.f12976a;
        c1391o.getClass();
        List list = c1391o.f4628l;
        try {
            String string = AbstractC3149m.m6703R0(c1391o.f4617a).toString();
            if (AbstractC3149m.m6721t0(string)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            m3785v(list, true);
            ScriptPluginRuntime scriptPluginRuntime = ScriptPluginRuntime.INSTANCE;
            File canonicalFile = scriptPluginRuntime.ensureDirs(context).getCanonicalFile();
            String strM3782s = m3782s(m3769f(c1391o));
            if (AbstractC3149m.m6721t0(strM3782s)) {
                throw new IllegalArgumentException("无法生成本地插件目录名");
            }
            File absoluteFile = new File(canonicalFile, strM3782s).getAbsoluteFile();
            File canonicalFile2 = absoluteFile.getCanonicalFile();
            if (!AbstractC1416l.m3825a(canonicalFile2.getParentFile(), canonicalFile) || !absoluteFile.equals(canonicalFile2)) {
                throw new IllegalArgumentException("插件安装目录不在脚本插件根目录内");
            }
            if (canonicalFile2.exists() && !canonicalFile2.isDirectory()) {
                throw new IllegalStateException("插件目标不是目录: ".concat(strM3782s).toString());
            }
            String strM3782s2 = m3782s(string);
            File canonicalFile3 = new File(canonicalFile, strM3782s2).getCanonicalFile();
            if (strM3782s.equals(strM3782s2) || canonicalFile2.exists() || !canonicalFile3.isDirectory()) {
                canonicalFile3 = canonicalFile2;
            }
            String name = canonicalFile3.getName();
            boolean zIsDirectory = canonicalFile3.isDirectory();
            if (zIsDirectory && !z9) {
                throw new IllegalStateException("本地插件已存在，需要确认覆盖: ".concat(strM3782s).toString());
            }
            if (zIsDirectory) {
                m3773j(canonicalFile3);
            }
            File parentFile = canonicalFile.getParentFile();
            if (parentFile == null) {
                throw new IllegalStateException("插件根目录没有父目录");
            }
            File file = new File(parentFile, ".hchat-plugin-market-stage-" + UUID.randomUUID());
            File file2 = new File(file, strM3782s);
            File file3 = new File(parentFile, ".hchat-plugin-market-backup-" + name + "-" + UUID.randomUUID());
            m3771h(file);
            m3771h(file3);
            if (zIsDirectory) {
                name.getClass();
                z10 = scriptPluginRuntime.isPluginEnabled(context, name);
            }
            try {
            } catch (Throwable th2) {
                th = th2;
                z11 = false;
            }
            if (!file.mkdirs()) {
                throw new IllegalStateException("创建插件暂存目录失败");
            }
            if (zIsDirectory) {
                m3765b(canonicalFile3, file2);
            } else if (!file2.mkdirs()) {
                throw new IllegalStateException("创建插件目录失败");
            }
            m3781r(file2, list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1383g c1383g = (C1383g) it.next();
                String str = c1383g.f4590a;
                File file4 = new File(file2, str);
                Iterator it2 = it;
                if (!AbstractC1416l.m3825a(file4.getCanonicalFile().getParentFile(), file2.getCanonicalFile())) {
                    throw new IllegalArgumentException("插件文件路径越界");
                }
                String name2 = file4.getName();
                name2.getClass();
                m3786w(name2);
                if (file4.exists()) {
                    if (!file4.isFile()) {
                        throw new IllegalArgumentException(("插件文件目标与本地目录冲突: " + str).toString());
                    }
                    if (!file4.delete()) {
                        throw new IllegalStateException(("删除旧插件文件失败: " + str).toString());
                    }
                }
                m3787x(file4, c1383g.m3763a());
                it = it2;
            }
            m3773j(file2);
            ScriptPluginRuntime scriptPluginRuntime2 = ScriptPluginRuntime.INSTANCE;
            AbstractC1089i.m2732I0(scriptPluginRuntime2.m10926setPluginEnabled0E7RQCE(context, strM3782s, false));
            if (!AbstractC1416l.m3825a(name, strM3782s)) {
                name.getClass();
                AbstractC1089i.m2732I0(scriptPluginRuntime2.m10926setPluginEnabled0E7RQCE(context, name, false));
            }
            try {
            } catch (Throwable th3) {
                th = th3;
                z11 = true;
                z12 = false;
                z13 = false;
            }
            if (canonicalFile3.exists()) {
                if (!canonicalFile3.renameTo(file3)) {
                    throw new IllegalStateException("备份旧插件目录失败");
                }
                z15 = true;
                if (z11) {
                    try {
                        z14 = false;
                        try {
                            ScriptPluginRuntime.INSTANCE.m10926setPluginEnabled0E7RQCE(context, strM3782s, false);
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z12) {
                    try {
                        if (canonicalFile2.exists()) {
                            try {
                                m3771h(canonicalFile2);
                            } catch (Throwable unused3) {
                            }
                        }
                    } finally {
                    }
                }
                if (!z13 || (file3.exists() && file3.renameTo(canonicalFile3))) {
                    z14 = true;
                }
                if (z14) {
                    if (z13) {
                        try {
                            ScriptPluginRuntime scriptPluginRuntime3 = ScriptPluginRuntime.INSTANCE;
                            name.getClass();
                            scriptPluginRuntime3.refreshPluginObserver(context, name);
                        } catch (Throwable unused4) {
                        }
                    }
                    if (z11 && z10) {
                        try {
                            ScriptPluginRuntime scriptPluginRuntime4 = ScriptPluginRuntime.INSTANCE;
                            name.getClass();
                            scriptPluginRuntime4.m10926setPluginEnabled0E7RQCE(context, name, true);
                        } catch (Throwable unused5) {
                        }
                    }
                }
                if (z14) {
                    throw th;
                }
                throw new IllegalStateException("插件安装失败且旧插件恢复失败，备份保留在 " + file3.getAbsolutePath(), th);
            }
            z15 = false;
            try {
                if (!file2.renameTo(canonicalFile2)) {
                    throw new IllegalStateException("安装插件目录失败");
                }
                try {
                    scriptPluginRuntime2.refreshPluginObserver(context, strM3782s);
                    if (!AbstractC1416l.m3825a(name, strM3782s)) {
                        name.getClass();
                        scriptPluginRuntime2.refreshPluginObserver(context, name);
                    }
                    try {
                        m3771h(file3);
                        c3959f = c3967n;
                    } catch (Throwable th4) {
                        c3959f = new C3959f(th4);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        AbstractC1184v0.m3204n("[Hchat:PluginMarket] 清理插件安装备份失败: " + file3.getAbsolutePath(), thM8182b);
                    }
                    String absolutePath = canonicalFile2.getAbsolutePath();
                    absolutePath.getClass();
                    C1385i c1385i = new C1385i(strM3782s, absolutePath, zIsDirectory, null);
                    try {
                        m3771h(file);
                        c3959f2 = c3967n;
                    } catch (Throwable th5) {
                        c3959f2 = new C3959f(th5);
                    }
                    Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                    if (thM8182b2 == null) {
                        return c1385i;
                    }
                    AbstractC1184v0.m3204n("[Hchat:PluginMarket] 清理插件安装暂存目录失败: " + file.getAbsolutePath(), thM8182b2);
                    return c1385i;
                } catch (Throwable th6) {
                    th = th6;
                    z13 = z15;
                    z11 = true;
                    z12 = true;
                    if (z11) {
                    }
                    if (z12) {
                    }
                    if (!z13) {
                    }
                    if (z14) {
                    }
                    if (z14) {
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                z13 = z15;
                z11 = true;
                z12 = false;
            }
            if (z11) {
            }
            if (z12) {
            }
            if (!z13) {
                z14 = true;
            }
            if (z14) {
            }
            if (z14) {
            }
        } catch (Throwable th8) {
            return new C3959f(th8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m3777n(String str) {
        Set set = f4608a;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (AbstractC3156t.m6734X((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m3778o(byte[] bArr) {
        Object c3959f;
        try {
            m3768e("插件文件", bArr);
            c3959f = Boolean.TRUE;
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
    /* JADX INFO: renamed from: p */
    public static C1383g m3779p(File file, String str, boolean z9, String str2) throws IOException {
        File file2 = new File(file, str);
        if (!file2.isFile()) {
            if (z9) {
                throw new IllegalStateException("插件缺少 ".concat(str).toString());
            }
            return null;
        }
        m3772i(file2, file);
        String name = AbstractC3156t.m6734X(file2.getName(), "readme.md") ? "README.md" : file2.getName();
        name.getClass();
        long jM3775l = m3775l(name);
        if (file2.length() > jM3775l) {
            C1275d.m3410d(file2.getName(), jM3775l / ((long) 1024));
            return null;
        }
        byte[] bArrM2027g0 = AbstractC0793l.m2027g0(file2);
        if (bArrM2027g0.length > jM3775l) {
            C1275d.m3410d(file2.getName(), jM3775l / ((long) 1024));
            return null;
        }
        String name2 = file2.getName();
        name2.getClass();
        String strM3768e = m3768e(name2, bArrM2027g0);
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = strM3768e.getBytes(charset);
        bytes.getClass();
        String strM3783t = m3783t(bytes);
        strM3768e.getBytes(charset).getClass();
        return new C1383g(str2, strM3768e, strM3783t, "utf8", r7.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C1383g m3780q(File file) throws IOException {
        File file2 = new File(file, "main.java.bshs");
        if (!file2.isFile()) {
            return null;
        }
        m3772i(file2, file);
        long jM3775l = m3775l("main.java.bshs");
        if (file2.length() > jM3775l) {
            C3193a.m6817f(jM3775l / ((long) 1024), "main.java.bshs 超过 ", " KiB");
            return null;
        }
        byte[] bArrM2027g0 = AbstractC0793l.m2027g0(file2);
        if (bArrM2027g0.length > jM3775l) {
            C3193a.m6817f(jM3775l / ((long) 1024), "main.java.bshs 超过 ", " KiB");
            return null;
        }
        if (bArrM2027g0.length < 4 || !Arrays.equals(AbstractC4165l.m8385t0(bArrM2027g0, 0, 4), new byte[]{66, 83, JSONB.Constants.BC_INT32, 83})) {
            C2104o.m5294t("main.java.bshs 不是有效的 BeanShell 快照");
            return null;
        }
        String strEncodeToString = Base64.encodeToString(bArrM2027g0, 2);
        strEncodeToString.getClass();
        return new C1383g("main.java.bshs", strEncodeToString, m3783t(bArrM2027g0), "base64", bArrM2027g0.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m3781r(File file, List list) {
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1383g) it.next()).f4590a);
        }
        Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
        Set set = f4608a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!setM8412U1.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            File file2 = new File(file, (String) it2.next());
            if (file2.exists()) {
                m3771h(file2);
            }
        }
        File file3 = new File(file, "readme.md");
        if (file3.exists()) {
            m3771h(file3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m3782s(String str) {
        String strM6839l = AbstractC3199a.m6839l(str, str);
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|\\u0000-\\u001f]");
        patternCompile.getClass();
        strM6839l.getClass();
        String strReplaceAll = patternCompile.matcher(strM6839l).replaceAll("_");
        strReplaceAll.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(64, AbstractC3149m.m6704S0(AbstractC2091b.m5161h("\\s+", strReplaceAll, "_"), '.', ' '));
        if (!strM6701P0.equals(".") && !strM6701P0.equals("..")) {
            return AbstractC3149m.m6721t0(strM6701P0) ? "online_plugin" : strM6701P0;
        }
        C2104o.m5294t("插件目录名无效");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m3783t(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        bArrDigest.getClass();
        return AbstractC4165l.m8368E0(bArrDigest, new C1271o(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static Object m3784u(C1391o c1391o) {
        try {
            if (AbstractC3149m.m6721t0(c1391o.f4617a)) {
                throw new IllegalArgumentException("远程插件 ID 不能为空");
            }
            m3785v(c1391o.f4628l, true);
            return C3967n.f12976a;
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m3785v(List list, boolean z9) {
        int i9;
        Object c3959f;
        ArrayList<String> arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1383g) it.next()).f4590a);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
        for (String str : arrayList) {
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        if (AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)).size() != arrayList2.size()) {
            C2104o.m5294t("插件包包含重复文件");
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m3786w((String) it2.next());
        }
        if (arrayList.isEmpty()) {
            i9 = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i9 = 0;
            while (it3.hasNext()) {
                if (!m3777n((String) it3.next()) && (i9 = i9 + 1) < 0) {
                    AbstractC0000a.m30P0();
                    throw null;
                }
            }
        }
        if (!(i9 <= 32)) {
            C2104o.m5294t("插件包附加文件不能超过 32 个");
            return;
        }
        if (!arrayList.contains("main.java")) {
            C2104o.m5294t("插件包缺少 main.java");
            return;
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C1383g c1383g = (C1383g) it4.next();
            if (c1383g.f4590a.equals("main.java")) {
                if (AbstractC3149m.m6721t0(c1383g.f4591b)) {
                    C2104o.m5294t("main.java 不能为空");
                    return;
                }
                Iterator it5 = list.iterator();
                long length = 0;
                while (it5.hasNext()) {
                    C1383g c1383g2 = (C1383g) it5.next();
                    String str2 = c1383g2.f4590a;
                    String str3 = c1383g2.f4592c;
                    String str4 = c1383g2.f4594e;
                    long jM3775l = m3775l(str2);
                    try {
                        c3959f = c1383g2.m3763a();
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        throw new IllegalArgumentException(str2.concat(" 内容解码失败"), thM8182b);
                    }
                    byte[] bArr = (byte[]) c3959f;
                    if (!(((long) bArr.length) <= jM3775l)) {
                        C1275d.m3410d(str2, jM3775l / ((long) 1024));
                        return;
                    }
                    if (str2.equals("main.java.bshs")) {
                        if (!str4.equals("base64")) {
                            C2104o.m5294t("main.java.bshs 必须使用 Base64 传输");
                            return;
                        } else if (!(bArr.length >= 4 && Arrays.equals(AbstractC4165l.m8385t0(bArr, 0, 4), new byte[]{66, 83, JSONB.Constants.BC_INT32, 83}))) {
                            C2104o.m5294t("main.java.bshs 不是有效的 BeanShell 快照");
                            return;
                        }
                    } else if (m3777n(str2)) {
                        if (!(str4.equals("utf8") && m3778o(bArr))) {
                            C2104o.m5291q(str2.concat(" 不是有效 UTF-8 文本"));
                            return;
                        }
                    } else if (!(str4.equals("utf8") || str4.equals("base64"))) {
                        C2104o.m5291q(str2.concat(" 使用了不支持的编码"));
                        return;
                    } else if (str4.equals("utf8") && !m3778o(bArr)) {
                        C2104o.m5291q(str2.concat(" 不是有效 UTF-8 文本"));
                        return;
                    }
                    if (!(c1383g2.f4593d == ((long) bArr.length))) {
                        C2104o.m5291q(str2.concat(" 文件大小校验失败"));
                        return;
                    }
                    if (z9) {
                        if (AbstractC3149m.m6721t0(str3)) {
                            C2104o.m5291q(str2.concat(" 缺少 sha256"));
                            return;
                        } else if (!str3.equalsIgnoreCase(m3783t(bArr))) {
                            C2104o.m5291q(str2.concat(" sha256 校验失败"));
                            return;
                        }
                    }
                    length += (long) bArr.length;
                }
                if (length <= 33554432) {
                    return;
                }
                C2104o.m5294t("插件包超过 32768 KiB");
                return;
            }
        }
        C2104o.m5287l("Collection contains no element matching the predicate.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m3786w(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string) || string.equals(".") || string.equals("..")) {
            C2104o.m5294t("插件文件名无效");
            return null;
        }
        if (string.length() > 128) {
            C2104o.m5294t("插件文件名不能超过 128 个字符");
            return null;
        }
        for (int i9 = 0; i9 < string.length(); i9++) {
            char cCharAt = string.charAt(i9);
            if (cCharAt == '/' || cCharAt == '\\' || cCharAt < ' ' || cCharAt == 127) {
                C2104o.m5291q("插件文件名不能包含路径或控制字符: ".concat(string));
                return null;
            }
        }
        if (!m3777n(string) || f4608a.contains(string)) {
            return string;
        }
        C2104o.m5291q("默认插件文件名必须使用标准大小写: ".concat(string));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: x */
    public static void m3787x(File file, byte[] bArr) throws IOException {
        File file2 = new File(file.getParentFile(), "." + file.getName() + ".market-" + UUID.randomUUID() + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            try {
                Os.rename(file2.getAbsolutePath(), file.getAbsolutePath());
            } catch (Throwable th2) {
                file2.delete();
                throw new IllegalStateException(AbstractC0921a.m2251n("写入 ", file.getName(), " 失败"), th2);
            }
        } finally {
        }
    }
}
