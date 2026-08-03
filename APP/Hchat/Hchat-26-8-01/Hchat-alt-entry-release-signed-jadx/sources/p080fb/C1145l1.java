package p080fb;

import android.util.AtomicFile;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p005a5.C0016a;
import p036c9.C0415a0;
import p068eh.AbstractC0921a;
import p092g4.AbstractC1341a;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p150k5.C2264o;
import p150k5.C2266q;
import p150k5.C2270u;
import p176m1.C2731f0;
import p207o5.C3059n;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p288tb.C4143c;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4170q;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: fb.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1145l1 {

    /* JADX INFO: renamed from: e */
    public static final C3147k f3776e = new C3147k("classes(\\d*)\\.dex");

    /* JADX INFO: renamed from: a */
    public final String f3777a;

    /* JADX INFO: renamed from: b */
    public final File f3778b;

    /* JADX INFO: renamed from: c */
    public final C1141k1 f3779c;

    /* JADX INFO: renamed from: d */
    public String f3780d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1145l1(File file, String str) throws NoSuchAlgorithmException {
        this.f3777a = str;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        this.f3778b = new File(file, AbstractC3149m.m6701P0(24, AbstractC4165l.m8368E0(bArrDigest, new C1124g0(18))).concat(".json"));
        this.f3779c = new C1141k1(64, 0.75f, true, 0);
        this.f3780d = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m2902a(C1145l1 c1145l1, String str) {
        String strM6687B0 = AbstractC3149m.m6687B0(AbstractC3149m.m6686A0(str, "classes"), ".dex");
        if (AbstractC3149m.m6721t0(strM6687B0)) {
            return 1;
        }
        Integer numM6741e0 = AbstractC3156t.m6741e0(10, strM6687B0);
        if (numM6741e0 != null) {
            return numM6741e0.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m2903c(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            C2104o.m5294t("类 descriptor 为空");
            return null;
        }
        if (AbstractC3149m.m6694I0(string, 'L') && AbstractC3149m.m6713l0(string, ';')) {
            return string;
        }
        String strReplace = string.replace('.', '/');
        strReplace.getClass();
        return AbstractC0921a.m2251n("L", AbstractC3149m.m6706U0(AbstractC3149m.m6708W0(strReplace, 'L'), ';'), ";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C0016a m2904h(C2270u c2270u) {
        C0016a c0016a = new C0016a((byte) 0, 0);
        c0016a.f55h = 15;
        c0016a.f56i = new HashMap();
        c0016a.f55h = c2270u.f7533c.f3450b;
        return c0016a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: j */
    public static C2270u m2905j(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        inputStream.getClass();
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
        try {
            C2270u c2270uM5524a = C2270u.m5524a(bufferedInputStream);
            bufferedInputStream.close();
            return c2270uM5524a;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2906b(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        int iM6724w0;
        int iM7909r = AbstractC3754e0.m7909r(jSONObject.optInt("offset", 0), 0, str3.length());
        int iM7909r2 = AbstractC3754e0.m7909r(jSONObject.optInt("max_chars", C4143c.DEFAULT_HZ), 1000, 120000) + iM7909r;
        int length = str3.length();
        if (iM7909r2 > length) {
            iM7909r2 = length;
        }
        if (iM7909r2 < str3.length() && (iM6724w0 = AbstractC3149m.m6724w0(str3, '\n', iM7909r2 - 1, 4)) >= iM7909r + 1000) {
            iM7909r2 = iM6724w0 + 1;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ok", true);
        jSONObject2.put("descriptor", str);
        jSONObject2.put("sourceEntry", str2);
        jSONObject2.put("sourcePath", this.f3777a);
        jSONObject2.put("offset", iM7909r);
        jSONObject2.put("returnedLength", iM7909r2 - iM7909r);
        jSONObject2.put("totalLength", str3.length());
        jSONObject2.put("truncated", iM7909r2 < str3.length());
        if (iM7909r2 < str3.length()) {
            jSONObject2.put("nextOffset", iM7909r2);
        }
        jSONObject2.put("smali", str3.substring(iM7909r, iM7909r2));
        String string = jSONObject2.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final List m2907d(ZipFile zipFile) {
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        enumerationEntries.getClass();
        C3011i c3011i = new C3011i(AbstractC3015m.m6408R(new C2731f0(enumerationEntries)), true, new C1124g0(17));
        C0415a0 c0415a0 = new C0415a0(this, 14);
        ArrayList arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3011i, arrayList);
        AbstractC4170q.m8431g1(arrayList, c0415a0);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return C4173t.f13710g;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0000a.m99x0(next);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(next);
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: e */
    public final C1133i1 m2908e(String str, C1103b c1103b) {
        Object next;
        Object next2;
        C1141k1 c1141k1 = this.f3779c;
        m2912k();
        ZipFile zipFile = new ZipFile(this.f3777a);
        try {
            String str2 = (String) c1141k1.get(str);
            if (str2 != null) {
                c1103b.m2828d();
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry != null) {
                    C2270u c2270uM2905j = m2905j(zipFile, entry);
                    C3059n c3059n = new C3059n(new C2266q(c2270uM2905j));
                    while (true) {
                        if (!c3059n.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = c3059n.next();
                        if (AbstractC1416l.m3825a(((C2264o) next2).getType(), str)) {
                            break;
                        }
                    }
                    C2264o c2264o = (C2264o) next2;
                    if (c2264o != null) {
                        C1133i1 c1133i1 = new C1133i1(str2, c2270uM2905j, c2264o);
                        zipFile.close();
                        return c1133i1;
                    }
                }
                c1141k1.remove(str);
                m2913l();
            }
            for (ZipEntry zipEntry : m2907d(zipFile)) {
                c1103b.m2828d();
                C2270u c2270uM2905j2 = m2905j(zipFile, zipEntry);
                C3059n c3059n2 = new C3059n(new C2266q(c2270uM2905j2));
                while (true) {
                    if (!c3059n2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = c3059n2.next();
                    if (AbstractC1416l.m3825a(((C2264o) next).getType(), str)) {
                        break;
                    }
                }
                C2264o c2264o2 = (C2264o) next;
                if (c2264o2 != null) {
                    c1141k1.put(str, zipEntry.getName());
                    m2913l();
                    String name = zipEntry.getName();
                    name.getClass();
                    C1133i1 c1133i12 = new C1133i1(name, c2270uM2905j2, c2264o2);
                    zipFile.close();
                    return c1133i12;
                }
            }
            zipFile.close();
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2043a.m5035i(zipFile, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: f */
    public final Map m2909f(List list, C1103b c1103b) {
        C1141k1 c1141k1;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m2903c((String) it.next()));
        }
        if (linkedHashSet.isEmpty()) {
            return C4174u.f13711g;
        }
        m2912k();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ZipFile zipFile = new ZipFile(this.f3777a);
        try {
            Iterator it2 = linkedHashSet.iterator();
            boolean z9 = false;
            while (true) {
                boolean zHasNext = it2.hasNext();
                c1141k1 = this.f3779c;
                if (!zHasNext) {
                    break;
                }
                String str = (String) it2.next();
                String str2 = (String) c1141k1.get(str);
                if (str2 != null) {
                    if (zipFile.getEntry(str2) != null) {
                        linkedHashMap.put(str, str2);
                    } else {
                        c1141k1.remove(str);
                        z9 = true;
                    }
                }
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (Object obj : linkedHashSet) {
                if (!linkedHashMap.containsKey((String) obj)) {
                    linkedHashSet2.add(obj);
                }
            }
            for (ZipEntry zipEntry : m2907d(zipFile)) {
                if (linkedHashSet2.isEmpty()) {
                    break;
                }
                c1103b.m2828d();
                C3059n c3059n = new C3059n(new C2266q(m2905j(zipFile, zipEntry)));
                int i9 = 0;
                while (c3059n.hasNext()) {
                    C2264o c2264o = (C2264o) c3059n.next();
                    if (linkedHashSet2.isEmpty()) {
                        break;
                    }
                    int i10 = i9 + 1;
                    if (i9 % Opcodes.ACC_STRICT == 0) {
                        c1103b.m2828d();
                    }
                    if (linkedHashSet2.remove(c2264o.getType())) {
                        linkedHashMap.put(c2264o.getType(), zipEntry.getName());
                        c1141k1.put(c2264o.getType(), zipEntry.getName());
                        z9 = true;
                    }
                    i9 = i10;
                }
            }
            zipFile.close();
            if (z9) {
                m2913l();
            }
            return linkedHashMap;
        } finally {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: g */
    public final C1137j1 m2910g(String str, C1103b c1103b) {
        String strM2903c = m2903c(str);
        C1133i1 c1133i1M2908e = m2908e(strM2903c, c1103b);
        if (c1133i1M2908e == null) {
            C2104o.m5294t("没有找到类: ".concat(strM2903c));
            return null;
        }
        String str2 = c1133i1M2908e.f3708a;
        c1103b.m2828d();
        ZipFile zipFile = new ZipFile(this.f3777a);
        try {
            ZipEntry entry = zipFile.getEntry(str2);
            if (entry == null) {
                throw new IllegalStateException("Dex 条目不存在: ".concat(str2));
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            inputStream.getClass();
            BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
            try {
                byte[] bArrM3576G = AbstractC1341a.m3576G(bufferedInputStream);
                bufferedInputStream.close();
                zipFile.close();
                return new C1137j1(strM2903c, str2, bArrM3576G);
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m2911i() {
        File parentFile = this.f3778b.getParentFile();
        File[] fileArrListFiles = parentFile != null ? parentFile.listFiles(new C1129h1(0)) : null;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        Iterator it = AbstractC4166m.m8419q1(8, AbstractC4165l.m8371H0(fileArrListFiles, new C1167r(8))).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: k */
    public final void m2912k() {
        Object c3959f;
        String str = this.f3777a;
        File file = new File(str);
        String str2 = file.length() + ":" + file.lastModified();
        if (str2.equals(this.f3780d)) {
            return;
        }
        C1141k1 c1141k1 = this.f3779c;
        c1141k1.clear();
        this.f3780d = str2;
        File file2 = this.f3778b;
        try {
            FileInputStream fileInputStreamOpenRead = new AtomicFile(file2).openRead();
            try {
                fileInputStreamOpenRead.getClass();
                String str3 = new String(AbstractC1341a.m3576G(fileInputStreamOpenRead), AbstractC3137a.f10177a);
                fileInputStreamOpenRead.close();
                JSONObject jSONObject = new JSONObject(str3);
                if (jSONObject.optInt("schema", 0) == 1 && AbstractC1416l.m3825a(jSONObject.optString("apkPath", HttpUrl.FRAGMENT_ENCODE_SET), str) && jSONObject.optLong("apkLength", -1L) == file.length() && jSONObject.optLong("apkLastModified", -1L) == file.lastModified()) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("entries");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        itKeys.getClass();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String strOptString = jSONObjectOptJSONObject.optString(next, HttpUrl.FRAGMENT_ENCODE_SET);
                            next.getClass();
                            if (AbstractC3149m.m6694I0(next, 'L') && AbstractC3149m.m6713l0(next, ';')) {
                                C3147k c3147k = f3776e;
                                strOptString.getClass();
                                if (c3147k.m6683d(strOptString)) {
                                    c1141k1.put(next, strOptString);
                                }
                            }
                        }
                    }
                } else {
                    new AtomicFile(file2).delete();
                }
                c3959f = C3967n.f12976a;
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            new AtomicFile(file2).delete();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m2913l() {
        String str = this.f3777a;
        File file = this.f3778b;
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File file2 = new File(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("schema", 1);
            jSONObject.put("apkPath", str);
            jSONObject.put("apkLength", file2.length());
            jSONObject.put("apkLastModified", file2.lastModified());
            JSONObject jSONObject2 = new JSONObject();
            Iterator it = this.f3779c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject.put("entries", jSONObject2);
            AtomicFile atomicFile = new AtomicFile(file);
            FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
            try {
                String string = jSONObject.toString();
                string.getClass();
                byte[] bytes = string.getBytes(AbstractC3137a.f10177a);
                bytes.getClass();
                fileOutputStreamStartWrite.write(bytes);
                atomicFile.finishWrite(fileOutputStreamStartWrite);
                m2911i();
            } catch (Throwable th2) {
                atomicFile.failWrite(fileOutputStreamStartWrite);
                throw th2;
            }
        } catch (Throwable unused) {
        }
    }
}
