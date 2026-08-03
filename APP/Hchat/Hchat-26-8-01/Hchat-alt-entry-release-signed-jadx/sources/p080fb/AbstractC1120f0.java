package p080fb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.C0415a0;
import p054dg.AbstractC0793l;
import p063e9.C0837h;
import p068eh.AbstractC0921a;
import p069f.C0939i0;
import p129ig.AbstractC2043a;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3140d;
import p218og.C3145i;
import p218og.C3147k;
import p218og.InterfaceC3142f;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: fb.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1120f0 {

    /* JADX INFO: renamed from: a */
    public static final C3147k f3669a = new C3147k("(?<![A-Za-z0-9_])/(?:storage|sdcard|data|mnt|system|vendor|product|apex)(?:/[^\\s\\\"'`<>|]+)+");

    /* JADX INFO: renamed from: b */
    public static final Set f3670b = AbstractC4156d0.m8355W("txt", "md", "java", "kt", "kts", "xml", "json", "jsonl", "prop", "properties", "log", "csv", "tsv", "html", "htm", "css", "js", "ts", "py", "sh", "c", "cc", "cpp", "h", "hpp", "gradle", "toml", "yaml", "yml", "ini", "conf", "sql", "bsh");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static File m2850a(File file) {
        Object c3959f;
        try {
            c3959f = file.getCanonicalFile();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        return (File) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2851b(String str) {
        return AbstractC3149m.m6704S0(AbstractC3149m.m6703R0(str).toString(), '\"', '\'', '`', ',', ';', 65292, 12290, 65307, ')', 65289, ']', 12305);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ArrayList m2852c(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C3140d c3140d = new C3140d(str);
        while (c3140d.hasNext()) {
            String strM2851b = m2851b(AbstractC3149m.m6703R0((String) c3140d.next()).toString());
            if (AbstractC3156t.m6740d0(strM2851b, "/", false) && new File(strM2851b).exists()) {
                linkedHashSet.add(strM2851b);
            }
        }
        C0939i0 c0939i0 = new C0939i0(C3147k.m6681c(f3669a, str));
        while (c0939i0.hasNext()) {
            String strM2851b2 = m2851b(((C3145i) ((InterfaceC3142f) c0939i0.next())).m6678c());
            if (!AbstractC3149m.m6721t0(strM2851b2)) {
                linkedHashSet.add(strM2851b2);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            File fileM2850a = m2850a(new File((String) it.next()));
            if (fileM2850a != null) {
                arrayList.add(fileM2850a);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((File) obj).getPath())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2853d(String str, String str2) {
        str.getClass();
        String strQuote = JSONObject.quote(str);
        strQuote.getClass();
        return AbstractC0255e.m1022k("<local_file path=", strQuote, ">\n", str2, "\n</local_file>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public static String m2854e(String str, String str2) {
        str.getClass();
        if (AbstractC3156t.m6740d0(str2, "image/", false)) {
            return str2;
        }
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (strGuessContentTypeFromName != null) {
            if (!AbstractC3156t.m6740d0(strGuessContentTypeFromName, "image/", false)) {
                strGuessContentTypeFromName = null;
            }
            if (strGuessContentTypeFromName != null) {
                return strGuessContentTypeFromName;
            }
        }
        String lowerCase = AbstractC0793l.m2023c0(new File(str)).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 102340:
                return !lowerCase.equals("gif") ? HttpUrl.FRAGMENT_ENCODE_SET : "image/gif";
            case 105441:
                return !lowerCase.equals("jpg") ? HttpUrl.FRAGMENT_ENCODE_SET : "image/jpeg";
            case 111145:
                return !lowerCase.equals("png") ? HttpUrl.FRAGMENT_ENCODE_SET : "image/png";
            case 3268712:
                return !lowerCase.equals("jpeg") ? HttpUrl.FRAGMENT_ENCODE_SET : "image/jpeg";
            case 3645340:
                return !lowerCase.equals("webp") ? HttpUrl.FRAGMENT_ENCODE_SET : "image/webp";
            default:
                return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1116e0 m2855f(String str) {
        return m2856g(m2852c(str), C4174u.f13711g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1116e0 m2856g(List list, Map map) {
        C4173t c4173t;
        Iterator it;
        ArrayList arrayList;
        boolean zBooleanValue;
        Object c3959f;
        String str;
        File file;
        Throwable thM8182b;
        RandomAccessFile randomAccessFile;
        Object c3959f2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        byte[] bArr;
        boolean z9;
        boolean zIsEmpty = list.isEmpty();
        C4173t c4173t2 = C4173t.f13710g;
        if (zIsEmpty) {
            return new C1116e0(HttpUrl.FRAGMENT_ENCODE_SET, c4173t2, c4173t2);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            File fileM2850a = m2850a((File) it2.next());
            if (fileM2850a != null) {
                arrayList5.add(fileM2850a);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : arrayList5) {
            if (hashSet.add(((File) obj).getPath())) {
                arrayList6.add(obj);
            }
        }
        Iterator it3 = AbstractC4166m.m8403L1(12, arrayList6).iterator();
        while (it3.hasNext()) {
            File file2 = (File) it3.next();
            if (!file2.exists()) {
                String path = file2.getPath();
                path.getClass();
                arrayList2.add(m2853d(path, "文件不存在"));
            } else if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                List listM8403L1 = fileArrListFiles != null ? AbstractC4166m.m8403L1(120, AbstractC4165l.m8371H0(fileArrListFiles, new C0415a0(new C1167r(2), 10))) : null;
                String strM8392A1 = AbstractC4166m.m8392A1(listM8403L1 == null ? c4173t2 : listM8403L1, "\n", null, null, new C0837h(29), 30);
                if (AbstractC3149m.m6721t0(strM8392A1)) {
                    strM8392A1 = "目录为空或无法读取";
                }
                String path2 = file2.getPath();
                path2.getClass();
                arrayList2.add(m2853d(path2, strM8392A1));
                String name = file2.getName();
                if (AbstractC3149m.m6721t0(name)) {
                    name = file2.getPath();
                }
                arrayList4.add("读取目录: " + ((Object) name));
            } else {
                if (file2.isFile()) {
                    String str2 = (String) map.get(file2.getPath());
                    String str3 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
                    String path3 = file2.getPath();
                    path3.getClass();
                    String strM2854e = m2854e(path3, str3);
                    if (!AbstractC3149m.m6721t0(strM2854e)) {
                        if (file2.length() <= 10485760) {
                            arrayList3.add(file2.getPath());
                            String path4 = file2.getPath();
                            path4.getClass();
                            StringBuilder sbM2259v = AbstractC0921a.m2259v("图片，类型=", strM2854e, "，大小=", file2.length());
                            sbM2259v.append(" bytes");
                            arrayList2.add(m2853d(path4, sbM2259v.toString()));
                            arrayList4.add("读取图片: " + file2.getName());
                        } else {
                            String path5 = file2.getPath();
                            path5.getClass();
                            arrayList2.add(m2853d(path5, "图片超过 10 MB，未发送给模型"));
                        }
                        c4173t = c4173t2;
                        it = it3;
                        arrayList = arrayList3;
                    } else if (!AbstractC3156t.m6740d0(str3, "text/", false)) {
                        String lowerCase = AbstractC0793l.m2023c0(file2).toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (f3670b.contains(lowerCase)) {
                            c4173t = c4173t2;
                            arrayList = arrayList3;
                            zBooleanValue = true;
                        } else {
                            try {
                                fileInputStream = new FileInputStream(file2);
                                arrayList = arrayList3;
                            } catch (Throwable th2) {
                                th = th2;
                                c4173t = c4173t2;
                                arrayList = arrayList3;
                            }
                            try {
                                try {
                                    bArr = new byte[(int) Math.min(4096L, file2.length())];
                                    fileInputStream2 = fileInputStream;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c4173t = c4173t2;
                                    fileInputStream2 = fileInputStream;
                                }
                                try {
                                    int i9 = fileInputStream2.read(bArr);
                                    if (i9 <= 0) {
                                        z9 = true;
                                        c3959f2 = Boolean.valueOf(z9);
                                        try {
                                            fileInputStream2.close();
                                            c4173t = c4173t2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c4173t = c4173t2;
                                            c3959f2 = new C3959f(th);
                                        }
                                        Object obj2 = Boolean.FALSE;
                                        if (c3959f2 instanceof C3959f) {
                                            c3959f2 = obj2;
                                        }
                                        zBooleanValue = ((Boolean) c3959f2).booleanValue();
                                    } else {
                                        int i10 = 0;
                                        int i11 = 0;
                                        while (true) {
                                            if (i10 < i9) {
                                                int i12 = bArr[i10] & 255;
                                                if (i12 == 0) {
                                                    break;
                                                }
                                                C4173t c4173t3 = c4173t2;
                                                if (i12 < 9 || (14 <= i12 && i12 < 32)) {
                                                    i11++;
                                                }
                                                i10++;
                                                c4173t2 = c4173t3;
                                            } else if (i11 * 10 < i9) {
                                            }
                                        }
                                        z9 = false;
                                        c3959f2 = Boolean.valueOf(z9);
                                        fileInputStream2.close();
                                        c4173t = c4173t2;
                                        Object obj22 = Boolean.FALSE;
                                        if (c3959f2 instanceof C3959f) {
                                        }
                                        zBooleanValue = ((Boolean) c3959f2).booleanValue();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c4173t = c4173t2;
                                    Throwable th6 = th;
                                    try {
                                        throw th6;
                                    } catch (Throwable th7) {
                                        try {
                                            AbstractC2043a.m5035i(fileInputStream2, th6);
                                            throw th7;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            c3959f2 = new C3959f(th);
                                            Object obj222 = Boolean.FALSE;
                                            if (c3959f2 instanceof C3959f) {
                                            }
                                            zBooleanValue = ((Boolean) c3959f2).booleanValue();
                                            if (zBooleanValue) {
                                            }
                                            arrayList3 = arrayList;
                                            it3 = it;
                                            c4173t2 = c4173t;
                                        }
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                c4173t = c4173t2;
                                fileInputStream2 = fileInputStream;
                            }
                        }
                        if (zBooleanValue) {
                            it = it3;
                            String path6 = file2.getPath();
                            path6.getClass();
                            if (AbstractC3149m.m6721t0(str3)) {
                                str3 = "未知";
                            }
                            arrayList2.add(m2853d(path6, "二进制文件，类型=" + ((Object) str3) + "，大小=" + file2.length() + " bytes"));
                            String name2 = file2.getName();
                            StringBuilder sb2 = new StringBuilder("检查文件: ");
                            sb2.append(name2);
                            arrayList4.add(sb2.toString());
                        } else {
                            String path7 = file2.getPath();
                            path7.getClass();
                            if (file2.length() <= 524288) {
                                try {
                                    c3959f = AbstractC0793l.m2028h0(file2, AbstractC3137a.f10177a);
                                } catch (Throwable th10) {
                                    c3959f = new C3959f(th10);
                                }
                                Throwable thM8182b2 = C3960g.m8182b(c3959f);
                                if (thM8182b2 != null) {
                                    c3959f = AbstractC4855en.m9263g("读取失败: ", thM8182b2.getMessage());
                                }
                                str = (String) c3959f;
                                it = it3;
                                file = file2;
                            } else {
                                try {
                                    randomAccessFile = new RandomAccessFile(file2, "r");
                                } catch (Throwable th11) {
                                    th = th11;
                                    it = it3;
                                    file = file2;
                                }
                                try {
                                    byte[] bArr2 = new byte[Opcodes.ASM4];
                                    int i13 = randomAccessFile.read(bArr2);
                                    int iMin = (int) Math.min(262144L, file2.length());
                                    byte[] bArr3 = new byte[iMin];
                                    it = it3;
                                    file = file2;
                                    long length = file2.length() - ((long) iMin);
                                    if (length < 0) {
                                        length = 0;
                                    }
                                    try {
                                        randomAccessFile.seek(length);
                                        int i14 = randomAccessFile.read(bArr3);
                                        StringBuilder sb3 = new StringBuilder();
                                        if (i13 < 0) {
                                            i13 = 0;
                                        }
                                        Charset charset = AbstractC3137a.f10177a;
                                        sb3.append(new String(bArr2, 0, i13, charset));
                                        sb3.append("\n\n... 文件中间内容已截断 ...\n\n");
                                        if (i14 < 0) {
                                            i14 = 0;
                                        }
                                        sb3.append(new String(bArr3, 0, i14, charset));
                                        Object c3959f3 = sb3.toString();
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable th12) {
                                            th = th12;
                                            c3959f3 = new C3959f(th);
                                            thM8182b = C3960g.m8182b(c3959f3);
                                            if (thM8182b != null) {
                                            }
                                            str = (String) c3959f3;
                                            arrayList2.add(m2853d(path7, str));
                                            arrayList4.add("读取文件: " + file.getName());
                                            arrayList3 = arrayList;
                                            it3 = it;
                                            c4173t2 = c4173t;
                                        }
                                        thM8182b = C3960g.m8182b(c3959f3);
                                        if (thM8182b != null) {
                                            c3959f3 = AbstractC4855en.m9263g("读取失败: ", thM8182b.getMessage());
                                        }
                                        str = (String) c3959f3;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        Throwable th14 = th;
                                        try {
                                            throw th14;
                                        } catch (Throwable th15) {
                                            AbstractC2043a.m5035i(randomAccessFile, th14);
                                            throw th15;
                                        }
                                    }
                                } catch (Throwable th16) {
                                    th = th16;
                                    it = it3;
                                    file = file2;
                                }
                            }
                            arrayList2.add(m2853d(path7, str));
                            arrayList4.add("读取文件: " + file.getName());
                        }
                    }
                } else {
                    c4173t = c4173t2;
                    it = it3;
                    arrayList = arrayList3;
                    String path8 = file2.getPath();
                    path8.getClass();
                    arrayList2.add(m2853d(path8, "不是普通文件或目录"));
                }
                arrayList3 = arrayList;
                it3 = it;
                c4173t2 = c4173t;
            }
            c4173t = c4173t2;
            it = it3;
            arrayList = arrayList3;
            arrayList3 = arrayList;
            it3 = it;
            c4173t2 = c4173t;
        }
        return new C1116e0(AbstractC3149m.m6701P0(120000, AbstractC4166m.m8392A1(arrayList2, "\n\n", null, null, null, 62)), AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3)), AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C1116e0 m2857h(String str, ArrayList arrayList) {
        str.getClass();
        File fileM2850a = m2850a(new File(AbstractC3149m.m6703R0(str).toString()));
        C4173t c4173t = C4173t.f13710g;
        if (fileM2850a == null) {
            return new C1116e0(m2853d(str, "路径无效"), c4173t, AbstractC0000a.m99x0("读取失败: ".concat(str)));
        }
        ArrayList<File> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File fileM2850a2 = m2850a((File) it.next());
            if (fileM2850a2 != null) {
                arrayList2.add(fileM2850a2);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (File file : arrayList2) {
                boolean z9 = true;
                if (!AbstractC1416l.m3825a(fileM2850a.getPath(), file.getPath())) {
                    String path = fileM2850a.getPath();
                    path.getClass();
                    String path2 = file.getPath();
                    path2.getClass();
                    if (!AbstractC3156t.m6740d0(path, AbstractC3149m.m6706U0(path2, File.separatorChar) + File.separator, false)) {
                        z9 = false;
                    }
                }
                if (z9) {
                    return m2856g(AbstractC0000a.m99x0(fileM2850a), C4174u.f13711g);
                }
            }
        }
        return new C1116e0(m2853d(str, "只能读取用户消息中明确提供的路径或其子项"), c4173t, AbstractC0000a.m99x0("读取失败: ".concat(str)));
    }
}
