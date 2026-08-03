package p381zb;

import android.content.Context;
import android.net.Uri;
import bsh.org.objectweb.asm.Opcodes;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p136j8.AbstractC2091b;
import p172lg.C2562b;
import p183m8.C2815c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p332wb.AbstractC4855en;
import p332wb.C5218pp;
import tf.C4173t;

/* JADX INFO: renamed from: zb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6133b {

    /* JADX INFO: renamed from: a */
    public static final C3962i f24713a = new C3962i(new C5218pp(7));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m10895a(String str, String str2, String str3) {
        if (str == null) {
            str = str2 + "_" + System.currentTimeMillis() + "." + str3;
        } else {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            if (str == null) {
            }
        }
        String strM5161h = AbstractC2091b.m5161h("[\\\\/:*?\"<>|\\r\\n]+", str, "_");
        return AbstractC3149m.m6721t0(AbstractC3149m.m6697L0(strM5161h, '.', HttpUrl.FRAGMENT_ENCODE_SET)) ? AbstractC4855en.m9264h(strM5161h, ".", str3) : strM5161h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m10896b(byte[] bArr, int i9, C2815c c2815c) {
        if (i9 <= 0) {
            return;
        }
        C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, i9), 8);
        int i10 = c2562bM7902n0.f8312g;
        int i11 = c2562bM7902n0.f8313h;
        int i12 = c2562bM7902n0.f8314i;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            int i13 = c2815c.f9080a;
            BigInteger bigInteger = ((BigInteger[]) c2815c.f9083d)[i13];
            if (i13 == 0) {
                c2815c.m6219n();
                c2815c.f9080a = 255;
            } else {
                c2815c.f9080a = i13 - 1;
            }
            byte[] bArr2 = new byte[8];
            for (int i14 = 0; i14 < 8; i14++) {
                int i15 = 7 - i14;
                byte[] byteArray = bigInteger.shiftRight(i14 * 8).and(BigInteger.valueOf(255L)).toByteArray();
                byteArray.getClass();
                Byte bValueOf = byteArray.length == 0 ? null : Byte.valueOf(byteArray[byteArray.length - 1]);
                bArr2[i15] = bValueOf != null ? bValueOf.byteValue() : (byte) 0;
            }
            int iMin = Math.min(8, i9 - i10);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = i10 + i16;
                bArr[i17] = (byte) (bArr[i17] ^ bArr2[i16]);
            }
            if (i10 == i11) {
                return;
            } else {
                i10 += i12;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: c */
    public static void m10897c(File file, File file2, BigInteger bigInteger) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                C2815c c2815c = new C2815c(bigInteger);
                byte[] bArr = new byte[33554432];
                int i9 = Opcodes.ACC_DEPRECATED;
                while (true) {
                    int i10 = fileInputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    } else {
                        if (i9 > 0) {
                            int iMin = Math.min(i10, i9);
                            m10896b(bArr, iMin, c2815c);
                            i9 -= iMin;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final File m10898d(Context context, String str, String str2, String str3) {
        Object c3959f;
        if (str == null || AbstractC3149m.m6721t0(str) || AbstractC3149m.m6721t0(str2)) {
            return null;
        }
        File file = new File(m10903i(context, "Finder"), m10895a(str3, "finder_video", "mp4"));
        File file2 = new File(file.getParentFile(), AbstractC0255e.m1020i(file.getName(), ".tmp"));
        try {
            if (m10901g(file2, str, false) != null) {
                m10897c(file2, file, new BigInteger(str2));
                file2.delete();
                c3959f = file;
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            file2.delete();
            file.delete();
            AbstractC0921a.m2261x("[Hchat:MediaDownloader] 视频号视频下载解密失败: ", thM8182b.getMessage(), thM8182b);
        }
        return (File) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final File m10899e(Context context, String str, String str2) {
        context.getClass();
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return null;
        }
        return m10901g(new File(m10903i(context, "Image"), m10895a(str2, WeChatSnsPost.TYPE_IMAGE, m10902h(str))), str, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final List m10900f(Context context, String str, List list) {
        String string;
        context.getClass();
        if (list == null) {
            return C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 1;
        for (Object obj : list) {
            if (obj != null && (string = obj.toString()) != null) {
                String str2 = null;
                if (AbstractC3149m.m6721t0(string)) {
                    string = null;
                }
                if (string != null) {
                    if (str != null && !AbstractC3149m.m6721t0(str)) {
                        str2 = str + "_" + i9 + "." + m10902h(string);
                    }
                    File fileM10899e = m10899e(context, string, str2);
                    if (fileM10899e != null) {
                        arrayList.add(fileM10899e);
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m10901g(final File file, String str, boolean z9) {
        Object c3959f;
        Throwable thM8182b;
        File parentFile;
        File[] fileArrListFiles;
        File file2;
        Response responseExecute;
        ResponseBody responseBodyBody;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        try {
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null && !parentFile2.isDirectory()) {
                parentFile2.mkdirs();
            }
            if (z9) {
                if (parentFile2 == null) {
                    parentFile2 = new File(".");
                }
                file2 = new File(parentFile2, "." + file.getName() + ".download." + System.nanoTime() + ".tmp");
            } else {
                file2 = file;
            }
            responseExecute = ((OkHttpClient) f24713a.getValue()).newCall(new Request.Builder().url(str).get().build()).execute();
            try {
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!responseExecute.isSuccessful() || (responseBodyBody = responseExecute.body()) == null) {
            file2.delete();
            responseExecute.close();
            c3959f = null;
            thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
            }
            return (File) (c3959f instanceof C3959f ? null : c3959f);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(responseBodyBody.byteStream());
        try {
            fileOutputStream = new FileOutputStream(file2);
            try {
                bArr = new byte[8192];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i9 = bufferedInputStream.read(bArr);
            if (i9 <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, i9);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        bufferedInputStream.close();
        responseExecute.close();
        if (z9) {
            Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
        c3959f = file;
        thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            if (z9 && (parentFile = file.getParentFile()) != null && (fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: zb.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.io.FileFilter
                public final boolean accept(File file3) {
                    String name = file3.getName();
                    name.getClass();
                    if (AbstractC3156t.m6740d0(name, "." + file.getName() + ".download.", false)) {
                        String name2 = file3.getName();
                        name2.getClass();
                        if (AbstractC3156t.m6733W(name2, ".tmp", false)) {
                            return true;
                        }
                    }
                    return false;
                }
            })) != null) {
                for (File file3 : fileArrListFiles) {
                    try {
                        file3.delete();
                    } catch (Throwable unused) {
                    }
                }
            }
            AbstractC0921a.m2261x("[Hchat:MediaDownloader] 下载失败: ", thM8182b.getMessage(), thM8182b);
        }
        return (File) (c3959f instanceof C3959f ? null : c3959f);
        c3959f = new C3959f(th2);
        thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
        }
        return (File) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    public static String m10902h(String str) {
        Object c3959f;
        try {
            c3959f = Uri.parse(str).getLastPathSegment();
            if (c3959f == null) {
                c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM6697L0 = AbstractC3149m.m6697L0((String) c3959f, '.', HttpUrl.FRAGMENT_ENCODE_SET);
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, strM6697L0, locale);
        switch (strM5165l.hashCode()) {
            case 97669:
                return !strM5165l.equals("bmp") ? "png" : strM5165l;
            case 102340:
                return !strM5165l.equals("gif") ? "png" : strM5165l;
            case 105441:
                return !strM5165l.equals("jpg") ? "png" : strM5165l;
            case 108273:
                return !strM5165l.equals("mp4") ? "png" : strM5165l;
            case 111145:
                return !strM5165l.equals("png") ? "png" : strM5165l;
            case 3268712:
                return !strM5165l.equals("jpeg") ? "png" : strM5165l;
            case 3645340:
                return !strM5165l.equals("webp") ? "png" : strM5165l;
            default:
                return "png";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final File m10903i(Context context, String str) {
        Object c3959f;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        try {
            Object[] externalMediaDirs = context.getExternalMediaDirs();
            if (externalMediaDirs != null) {
                int length = externalMediaDirs.length;
                for (int i9 = 0; i9 < length; i9++) {
                    c3959f = externalMediaDirs[i9];
                    if (c3959f != null) {
                        break;
                    }
                }
                c3959f = null;
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        File file = (File) (c3959f instanceof C3959f ? null : c3959f);
        if (file == null) {
            file = new File(AbstractC4855en.m9263g("/storage/emulated/0/Android/media/", context.getPackageName()));
        }
        File file2 = new File(new File(file, "Hchat"), str);
        file2.mkdirs();
        return file2;
    }
}
