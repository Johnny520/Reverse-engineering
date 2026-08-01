package p000;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.C0439lp;

/* JADX INFO: renamed from: hp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0291hp {

    /* JADX INFO: renamed from: b */
    private static final String f2336b = "DL";

    /* JADX INFO: renamed from: e */
    private static volatile boolean f2339e;

    /* JADX INFO: renamed from: f */
    private static DialogC0402kp f2340f;

    /* JADX INFO: renamed from: a */
    public static final C0291hp f2335a = new C0291hp();

    /* JADX INFO: renamed from: c */
    private static final ExecutorService f2337c = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: d */
    private static final u60 f2338d = new x51(new C0658qn(1));

    /* JADX INFO: renamed from: g */
    public static final int f2341g = 8;

    /* JADX INFO: renamed from: hp$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class a {

        /* JADX INFO: renamed from: c */
        public static final int f2342c = 0;

        /* JADX INFO: renamed from: a */
        private final String f2343a;

        /* JADX INFO: renamed from: b */
        private final String f2344b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f2343a = str;
            this.f2344b = str2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ a m1491d(a aVar, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f2343a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f2344b;
            }
            return aVar.m1494c(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m1492a() {
            return this.f2343a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final String m1493b() {
            return this.f2344b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final a m1494c(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new a(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final String m1495e() {
            return this.f2343a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p30.m3002l(this.f2343a, aVar.f2343a) && p30.m3002l(this.f2344b, aVar.f2344b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final String m1496f() {
            return this.f2344b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.f2344b.hashCode() + (this.f2343a.hashCode() * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "LivePair(imageUrl=" + this.f2343a + ", videoUrl=" + this.f2344b + ")";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0291hp() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m1435A(List list, Context context) {
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                o30.m2757A();
                throw null;
            }
            a aVar = (a) obj;
            if (f2335a.m1440H(context, aVar.m1495e(), aVar.m1496f(), i2)) {
                i++;
            }
            i2 = i3;
        }
        if (i == list.size()) {
            f2335a.m1459a0(context, "下载完成");
        } else {
            f2335a.m1459a0(context, AbstractC0748t1.m4153k(i, list.size(), "已下载 ", "/"));
        }
        f2339e = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m1436B(List list, Context context) {
        long j;
        long j2 = 100;
        long size = ((long) list.size()) * 100;
        boolean z = true;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                o30.m2757A();
                throw null;
            }
            a aVar = (a) obj;
            C0291hp c0291hp = f2335a;
            if (c0291hp.m1455X()) {
                j = j2;
                z = false;
            } else {
                j = j2;
                c0291hp.m1465d0(AbstractC0748t1.m4153k(i2, list.size(), "Live图 ", "/"), ((long) i) * j, size);
                try {
                } catch (Exception e) {
                    lb0.f3404a.m2014a(f2336b, "batch live exc idx=" + i + ": " + e.getMessage());
                }
                if (!c0291hp.m1440H(context, aVar.m1495e(), aVar.m1496f(), i)) {
                    lb0.f3404a.m2014a(f2336b, "batch live fail idx=" + i);
                    z = false;
                }
                C0291hp c0291hp2 = f2335a;
                c0291hp2.m1465d0(AbstractC0748t1.m4153k(i2, list.size(), "Live图 ", "/"), ((long) i2) * j, size);
                if (c0291hp2.m1455X()) {
                    z = false;
                }
            }
            i = i2;
            j2 = j;
        }
        C0291hp c0291hp3 = f2335a;
        c0291hp3.m1480s(z);
        c0291hp3.m1459a0(context, z ? "下载完成" : c0291hp3.m1455X() ? "已取消下载" : "下载失败");
        f2339e = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m1437D(String str, int i, boolean z, Context context, long j, String str2, int i2) {
        boolean zM1479r;
        int i3 = 0;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                String str3 = "已取消下载";
                if (httpURLConnection.getResponseCode() != 200) {
                    httpURLConnection.disconnect();
                    lb0.f3404a.m2014a(f2336b, "img fail HTTP " + httpURLConnection.getResponseCode() + " pos=" + i);
                    if (z) {
                        C0291hp c0291hp = f2335a;
                        c0291hp.m1480s(false);
                        if (!c0291hp.m1455X()) {
                            str3 = "下载失败";
                        }
                        c0291hp.m1459a0(context, str3);
                    } else {
                        C0291hp c0291hp2 = f2335a;
                        if (!c0291hp2.m1455X()) {
                            str3 = "下载失败";
                        }
                        c0291hp2.m1459a0(context, str3);
                    }
                    f2339e = false;
                    return;
                }
                String contentType = httpURLConnection.getContentType();
                if (contentType == null) {
                    contentType = "image/jpeg";
                }
                C0291hp c0291hp3 = f2335a;
                String strM1478q = c0291hp3.m1478q(contentType);
                String strM1450S = c0291hp3.m1450S(contentType);
                File file = new File(c0291hp3.m1451T(context), "whs-" + j + "-" + i + "." + strM1478q);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (z) {
                    zM1479r = c0291hp3.m1479r(httpURLConnection, fileOutputStream, str2);
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    byte[] bArr = new byte[8192];
                    for (int i4 = inputStream.read(bArr); i4 != -1; i4 = inputStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, i4);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                    zM1479r = true;
                }
                httpURLConnection.disconnect();
                if (zM1479r) {
                    file.setLastModified(j + ((long) i2));
                    MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{strM1450S}, new C0100cp(i3));
                    if (z) {
                        C0291hp c0291hp4 = f2335a;
                        c0291hp4.m1480s(true);
                        c0291hp4.m1459a0(context, "下载完成");
                    } else {
                        f2335a.m1459a0(context, "下载完成");
                    }
                    f2339e = false;
                    return;
                }
                file.delete();
                if (z) {
                    C0291hp c0291hp5 = f2335a;
                    c0291hp5.m1480s(false);
                    if (!c0291hp5.m1455X()) {
                        str3 = "下载失败";
                    }
                    c0291hp5.m1459a0(context, str3);
                }
                f2339e = false;
            } catch (Exception e) {
                lb0.f3404a.m2014a(f2336b, "img exc pos=" + i + ": " + e.getMessage());
                if (z) {
                    C0291hp c0291hp6 = f2335a;
                    c0291hp6.m1480s(false);
                    c0291hp6.m1459a0(context, "下载失败");
                } else {
                    f2335a.m1459a0(context, "下载失败");
                }
                f2339e = false;
            }
        } catch (Throwable th) {
            f2339e = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m1439G(boolean z, Context context, String str, String str2, int i, int i2) {
        if (z ? f2335a.m1442J(context, str, str2, i) : f2335a.m1440H(context, str, str2, i)) {
            if (!z) {
                f2335a.m1459a0(context, "合成完成");
                return;
            }
            C0291hp c0291hp = f2335a;
            c0291hp.m1480s(true);
            c0291hp.m1459a0(context, "下载完成");
            return;
        }
        C0291hp c0291hp2 = f2335a;
        if (c0291hp2.m1455X()) {
            if (z) {
                c0291hp2.m1480s(false);
                c0291hp2.m1459a0(context, "已取消下载");
                return;
            }
            return;
        }
        lb0.f3404a.m2014a(f2336b, "live fail pos=" + i2);
        if (z) {
            c0291hp2.m1480s(false);
            c0291hp2.m1459a0(context, "合成失败");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final boolean m1440H(Context context, String str, String str2, int i) throws Throwable {
        File file;
        String str3;
        String strM1463c0 = m1463c0(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = i + 1;
        File file2 = null;
        try {
            File file3 = new File(context.getCacheDir(), "live_temp");
            if (!file3.exists()) {
                file3.mkdirs();
            }
            File fileM1447O = m1447O(strM1463c0, file3);
            if (fileM1447O == null) {
                return false;
            }
            try {
                file = new File(file3, "_live_tmp_" + jCurrentTimeMillis + ".mp4");
                try {
                    m1446N(str2, file);
                    File fileM1452U = m1452U(context);
                    if (i >= 0) {
                        str3 = "whs-live-" + jCurrentTimeMillis + "-" + i2 + ".jpg";
                    } else {
                        str3 = "whs-live-" + jCurrentTimeMillis + ".jpg";
                    }
                    File file4 = new File(fileM1452U, str3);
                    boolean zM5471c = za0.f7856a.m5471c(context, fileM1447O, file, file4);
                    if (zM5471c) {
                        file4.setLastModified(jCurrentTimeMillis);
                        MediaScannerConnection.scanFile(context, new String[]{file4.getAbsolutePath()}, new String[]{"image/jpeg"}, new C0100cp(1));
                    }
                    fileM1447O.delete();
                    file.delete();
                    return zM5471c;
                } catch (Exception unused) {
                    file2 = fileM1447O;
                    if (file2 != null) {
                        file2.delete();
                    }
                    if (file != null) {
                        file.delete();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    file2 = fileM1447O;
                    if (file2 != null) {
                        file2.delete();
                    }
                    if (file != null) {
                        file.delete();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                file = null;
            } catch (Throwable th2) {
                th = th2;
                file = null;
            }
        } catch (Exception unused3) {
            file = null;
        } catch (Throwable th3) {
            th = th3;
            file = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m1442J(Context context, String str, String str2, int i) throws Throwable {
        File file;
        File file2;
        File fileM1447O;
        String str3;
        String strM1463c0 = m1463c0(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = i + 1;
        File file3 = null;
        try {
            m1465d0("下载图片...", 5L, 100L);
            file2 = new File(context.getCacheDir(), "live_temp");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            fileM1447O = m1447O(strM1463c0, file2);
        } catch (Exception e) {
            e = e;
            file = null;
        } catch (Throwable th) {
            th = th;
            file = null;
            if (file3 != null) {
            }
            if (file != null) {
            }
            throw th;
        }
        if (fileM1447O == null) {
            return false;
        }
        try {
            if (m1455X()) {
                fileM1447O.delete();
                return false;
            }
            m1465d0("下载图片...", 30L, 100L);
            m1465d0("下载视频...", 35L, 100L);
            File file4 = new File(file2, "_live_tmp_" + jCurrentTimeMillis + ".mp4");
            try {
                m1446N(str2, file4);
                if (m1455X()) {
                    fileM1447O.delete();
                    file4.delete();
                    return false;
                }
                file = file4;
                try {
                    m1465d0("下载视频...", 70L, 100L);
                    m1465d0("合成中...", 75L, 100L);
                    File fileM1452U = m1452U(context);
                    if (i >= 0) {
                        str3 = "whs-live-" + jCurrentTimeMillis + "-" + i2 + ".jpg";
                    } else {
                        str3 = "whs-live-" + jCurrentTimeMillis + ".jpg";
                    }
                    File file5 = new File(fileM1452U, str3);
                    boolean zM5471c = za0.f7856a.m5471c(context, fileM1447O, file, file5);
                    if (m1455X()) {
                        fileM1447O.delete();
                        file.delete();
                        return false;
                    }
                    if (zM5471c) {
                        m1465d0("合成中...", 100L, 100L);
                        file5.setLastModified(jCurrentTimeMillis);
                        MediaScannerConnection.scanFile(context, new String[]{file5.getAbsolutePath()}, new String[]{"image/jpeg"}, new C0100cp(3));
                    }
                    fileM1447O.delete();
                    file.delete();
                    return zM5471c;
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    file3 = fileM1447O;
                    if (file3 != null) {
                    }
                    if (file != null) {
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                file = file4;
            } catch (Throwable th3) {
                th = th3;
                file = file4;
            }
        } catch (Exception e4) {
            e = e4;
            file = null;
        } catch (Throwable th4) {
            th = th4;
            file = null;
        }
        file3 = fileM1447O;
        try {
            lb0.f3404a.m2014a(f2336b, "live exc pos=" + i2 + ": " + e.getMessage());
            if (file3 != null) {
                file3.delete();
            }
            if (file != null) {
                file.delete();
            }
            return false;
        } catch (Throwable th5) {
            th = th5;
            if (file3 != null) {
                file3.delete();
            }
            if (file != null) {
                file.delete();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    private final boolean m1444L(Context context, String str, int i) {
        String strM1463c0 = m1463c0(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = i + 1;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(strM1463c0).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(60000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() != 200) {
                httpURLConnection.disconnect();
                return false;
            }
            String contentType = httpURLConnection.getContentType();
            if (contentType == null) {
                contentType = "image/jpeg";
            }
            String strM1478q = m1478q(contentType);
            String strM1450S = m1450S(contentType);
            File file = new File(m1451T(context), "whs-" + jCurrentTimeMillis + "-" + i2 + "." + strM1478q);
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            for (int i3 = inputStream.read(bArr); i3 != -1; i3 = inputStream.read(bArr)) {
                fileOutputStream.write(bArr, 0, i3);
            }
            fileOutputStream.close();
            inputStream.close();
            httpURLConnection.disconnect();
            file.setLastModified(jCurrentTimeMillis + ((long) i));
            MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{strM1450S}, new C0100cp(2));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    private final void m1446N(String str, File file) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(120000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[8192];
            for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                fileOutputStream.write(bArr, 0, i);
            }
            fileOutputStream.close();
            inputStream.close();
        }
        httpURLConnection.disconnect();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    private final File m1447O(String str, File file) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() != 200) {
            httpURLConnection.disconnect();
            return null;
        }
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "image/jpeg";
        }
        String strM1478q = m1478q(contentType);
        File file2 = new File(file, "temp_" + System.nanoTime() + "." + strM1478q);
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[8192];
        for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
            fileOutputStream.write(bArr, 0, i);
        }
        fileOutputStream.close();
        inputStream.close();
        httpURLConnection.disconnect();
        return file2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m1448Q(String str, boolean z, Context context, String str2, long j) {
        boolean zM1479r;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(300000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36");
                httpURLConnection.setRequestProperty("Referer", "https://www.xiaohongshu.com/");
                httpURLConnection.connect();
                String str3 = "已取消下载";
                if (httpURLConnection.getResponseCode() != 200) {
                    httpURLConnection.disconnect();
                    lb0.f3404a.m2014a(f2336b, "video fail HTTP " + httpURLConnection.getResponseCode());
                    if (z) {
                        C0291hp c0291hp = f2335a;
                        c0291hp.m1480s(false);
                        if (!c0291hp.m1455X()) {
                            str3 = "下载失败";
                        }
                        c0291hp.m1459a0(context, str3);
                    } else {
                        C0291hp c0291hp2 = f2335a;
                        if (!c0291hp2.m1455X()) {
                            str3 = "下载失败";
                        }
                        c0291hp2.m1459a0(context, str3);
                    }
                    f2339e = false;
                    return;
                }
                C0291hp c0291hp3 = f2335a;
                File file = new File(c0291hp3.m1454W(context), str2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                if (z) {
                    zM1479r = c0291hp3.m1479r(httpURLConnection, fileOutputStream, "视频");
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    byte[] bArr = new byte[16384];
                    for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                    zM1479r = true;
                }
                httpURLConnection.disconnect();
                if (zM1479r) {
                    file.setLastModified(j);
                    MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"video/mp4"}, new C0100cp(5));
                    if (z) {
                        C0291hp c0291hp4 = f2335a;
                        c0291hp4.m1480s(true);
                        c0291hp4.m1459a0(context, "下载完成");
                    } else {
                        f2335a.m1459a0(context, "下载完成");
                    }
                    f2339e = false;
                    return;
                }
                file.delete();
                if (z) {
                    C0291hp c0291hp5 = f2335a;
                    c0291hp5.m1480s(false);
                    if (!c0291hp5.m1455X()) {
                        str3 = "下载失败";
                    }
                    c0291hp5.m1459a0(context, str3);
                }
                f2339e = false;
            } catch (Exception e) {
                lb0.f3404a.m2014a(f2336b, "video exc: " + e.getMessage());
                if (z) {
                    C0291hp c0291hp6 = f2335a;
                    c0291hp6.m1480s(false);
                    c0291hp6.m1459a0(context, "下载失败");
                } else {
                    f2335a.m1459a0(context, "下载失败");
                }
                f2339e = false;
            }
        } catch (Throwable th) {
            f2339e = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: S */
    private final String m1450S(String str) {
        switch (str.hashCode()) {
            case 97669:
                return !str.equals("bmp") ? "image/jpeg" : "image/bmp";
            case 102340:
                return !str.equals("gif") ? "image/jpeg" : "image/gif";
            case 111145:
                return !str.equals("png") ? "image/jpeg" : "image/png";
            case 114276:
                return !str.equals("svg") ? "image/jpeg" : "image/svg+xml";
            case 3198682:
                return !str.equals("heif") ? "image/jpeg" : "image/heif";
            case 3645340:
                return !str.equals("webp") ? "image/jpeg" : "image/webp";
            default:
                return "image/jpeg";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    private final File m1451T(Context context) {
        return m00.f3663S.m2381i0(context, "原图_whs");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final File m1452U(Context context) {
        return m00.f3663S.m2381i0(context, "live 动图_whs");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final Handler m1453V() {
        return (Handler) f2338d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final File m1454W(Context context) {
        return m00.f3663S.m2381i0(context, "视频_whs");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    private final boolean m1455X() {
        return C0439lp.f3566a.m2048d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final Handler m1456Y() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    private final void m1457Z(Context context, String str) {
        C0439lp c0439lp = C0439lp.f3566a;
        if (c0439lp.m2050f(context)) {
            try {
                DialogC0402kp dialogC0402kp = f2340f;
                if (dialogC0402kp == null || !dialogC0402kp.isShowing()) {
                    c0439lp.m2053i();
                    DialogC0402kp dialogC0402kp2 = new DialogC0402kp(context, str);
                    f2340f = dialogC0402kp2;
                    dialogC0402kp2.show();
                    return;
                }
                c0439lp.m2054j(new C0439lp.a(str, 0L, 0L, false, false, 24, null));
            } catch (Exception e) {
                AbstractC0748t1.m4161s("showProgress fail: ", e.getMessage(), lb0.f3404a, f2336b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    private final void m1459a0(Context context, String str) {
        m1453V().post(new RunnableC0063bp(context, str, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m1461b0(Context context, String str) {
        try {
            Toast.makeText(context, str, 0).show();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    private final String m1463c0(String str) {
        int iM1767Y = k41.m1767Y(str, '?', 0, 6);
        if (iM1767Y < 0 || iM1767Y == str.length() - 1) {
            return str;
        }
        String strSubstring = str.substring(0, iM1767Y);
        List listM1773e0 = k41.m1773e0(str.substring(iM1767Y + 1), new String[]{"&"}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1773e0) {
            if (k41.m1764V((String) obj, "=", false)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return strSubstring;
        }
        return strSubstring + "?" + AbstractC0960ye.m5245O(arrayList, "&", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    private final void m1465d0(String str, long j, long j2) {
        C0439lp.f3566a.m2054j(new C0439lp.a(str, j, j2, false, false, 24, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    private final String m1478q(String str) {
        return (k41.m1764V(str, "heif", true) || k41.m1764V(str, "heic", true)) ? "heif" : k41.m1764V(str, "webp", true) ? "webp" : k41.m1764V(str, "png", true) ? "png" : k41.m1764V(str, "gif", true) ? "gif" : k41.m1764V(str, "bmp", true) ? "bmp" : k41.m1764V(str, "svg", true) ? "svg" : "jpg";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    private final boolean m1479r(HttpURLConnection httpURLConnection, FileOutputStream fileOutputStream, String str) throws IOException {
        long contentLength = httpURLConnection.getContentLength();
        InputStream inputStream = httpURLConnection.getInputStream();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        long j2 = 0;
        while (i != -1) {
            if (m1455X()) {
                inputStream.close();
                fileOutputStream.close();
                return false;
            }
            fileOutputStream.write(bArr, 0, i);
            long j3 = j + ((long) i);
            if (j3 - j2 > 262144) {
                m1465d0(str, j3, contentLength > 0 ? contentLength : -1L);
                j2 = j3;
            }
            i = inputStream.read(bArr);
            j = j3;
        }
        m1465d0(str, contentLength > 0 ? contentLength : j, contentLength > 0 ? contentLength : j);
        inputStream.close();
        fileOutputStream.close();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    private final void m1480s(boolean z) {
        C0439lp.f3566a.m2054j(new C0439lp.a(null, 0L, 0L, z, !z, 7, null));
        m1453V().post(new RunnableC0269h3(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m1481t() {
        try {
            DialogC0402kp dialogC0402kp = f2340f;
            if (dialogC0402kp != null) {
                dialogC0402kp.dismiss();
            }
            f2340f = null;
        } catch (Exception e) {
            AbstractC0748t1.m4161s("dismissProgress fail: ", e.getMessage(), lb0.f3404a, f2336b);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: f3.h(java.lang.Object):android.os.VibratorManager */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final void m1482u(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = context.getSystemService("vibrator_manager");
                systemService.getClass();
                AbstractC0195f3.m1010h(systemService).getDefaultVibrator().vibrate(VibrationEffect.createOneShot(30L, -1));
            } else {
                Object systemService2 = context.getSystemService("vibrator");
                systemService2.getClass();
                ((Vibrator) systemService2).vibrate(VibrationEffect.createOneShot(30L, -1));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m1483w(List list, Context context) {
        boolean z = true;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                o30.m2757A();
                throw null;
            }
            if (!f2335a.m1444L(context, (String) obj, i)) {
                z = false;
            }
            i = i2;
        }
        if (z) {
            f2335a.m1459a0(context, "下载完成");
        } else {
            f2335a.m1459a0(context, "下载失败");
        }
        f2339e = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m1484x(List list, Context context) {
        boolean z;
        HttpURLConnection httpURLConnection;
        File file;
        boolean z2 = true;
        boolean z3 = true;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                o30.m2757A();
                throw null;
            }
            String str = (String) obj;
            C0291hp c0291hp = f2335a;
            if (c0291hp.m1455X()) {
                z3 = false;
            } else {
                String strM1463c0 = c0291hp.m1463c0(str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(strM1463c0).openConnection();
                    uRLConnectionOpenConnection.getClass();
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(60000);
                    httpURLConnection.setDoInput(z2);
                    httpURLConnection.connect();
                } catch (Exception e) {
                    e = e;
                    z = false;
                }
                if (httpURLConnection.getResponseCode() != 200) {
                    httpURLConnection.disconnect();
                    lb0.f3404a.m2014a(f2336b, "batch img fail HTTP " + httpURLConnection.getResponseCode() + " idx=" + i);
                    z3 = false;
                } else {
                    String contentType = httpURLConnection.getContentType();
                    if (contentType == null) {
                        contentType = "image/jpeg";
                    }
                    String strM1478q = c0291hp.m1478q(contentType);
                    String strM1450S = c0291hp.m1450S(contentType);
                    File fileM1451T = c0291hp.m1451T(context);
                    StringBuilder sb = new StringBuilder();
                    z = false;
                    try {
                        sb.append("whs-");
                        sb.append(jCurrentTimeMillis);
                        sb.append("-");
                        sb.append(i2);
                        sb.append(".");
                        sb.append(strM1478q);
                        file = new File(fileM1451T, sb.toString());
                    } catch (Exception e2) {
                        e = e2;
                        lb0.f3404a.m2014a(f2336b, "batch img exc idx=" + i + ": " + e.getMessage());
                    }
                    if (c0291hp.m1479r(httpURLConnection, new FileOutputStream(file), "图片 " + i2 + "/" + list.size())) {
                        httpURLConnection.disconnect();
                        file.setLastModified(jCurrentTimeMillis + ((long) i));
                        MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{strM1450S}, new C0100cp(4));
                    } else {
                        file.delete();
                        httpURLConnection.disconnect();
                        z3 = z;
                    }
                }
            }
            i = i2;
            z2 = true;
        }
        C0291hp c0291hp2 = f2335a;
        c0291hp2.m1480s(z3);
        c0291hp2.m1459a0(context, z3 ? "下载完成" : c0291hp2.m1455X() ? "已取消下载" : "下载失败");
        f2339e = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m1486C(final Context context, String str, final int i) {
        context.getClass();
        str.getClass();
        final String strM1463c0 = m1463c0(str);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int i2 = i + 1;
        final String strM4154l = AbstractC0748t1.m4154l("图片 #", i2);
        m1482u(context);
        final boolean zM2050f = C0439lp.f3566a.m2050f(context);
        if (zM2050f) {
            m1457Z(context, strM4154l);
        } else {
            m1459a0(context, "下载中...");
        }
        f2337c.execute(new Runnable() { // from class: ep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                C0291hp.m1437D(strM1463c0, i2, zM2050f, context, jCurrentTimeMillis, strM4154l, i);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m1487F(final Context context, final String str, final String str2, final int i) {
        context.getClass();
        str.getClass();
        str2.getClass();
        final int i2 = i + 1;
        String strM4154l = AbstractC0748t1.m4154l("Live图 #", i2);
        m1482u(context);
        final boolean zM2050f = C0439lp.f3566a.m2050f(context);
        if (zM2050f) {
            m1457Z(context, strM4154l);
        } else {
            m1459a0(context, "下载中...");
        }
        f2337c.execute(new Runnable() { // from class: fp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                C0291hp.m1439G(zM2050f, context, str, str2, i, i2);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m1488P(final Context context, final String str, String str2, String str3) {
        context.getClass();
        str.getClass();
        if (f2339e) {
            m1459a0(context, "上一任务未完成，请稍后");
            return;
        }
        f2339e = true;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String str4 = "whs_video_" + jCurrentTimeMillis + ".mp4";
        m1482u(context);
        final boolean zM2050f = C0439lp.f3566a.m2050f(context);
        if (zM2050f) {
            m1457Z(context, "视频");
        } else {
            m1459a0(context, "下载中...");
        }
        f2337c.execute(new Runnable() { // from class: dp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                C0291hp.m1448Q(str, zM2050f, context, str4, jCurrentTimeMillis);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m1489v(Context context, List<String> list) {
        context.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        if (f2339e) {
            m1459a0(context, "上一任务未完成，请稍后");
            return;
        }
        int i = 1;
        f2339e = true;
        m1482u(context);
        if (C0439lp.f3566a.m2050f(context)) {
            m1457Z(context, AbstractC0748t1.m4154l("图片 0/", list.size()));
            f2337c.execute(new RunnableC0254gp(list, context, i));
        } else {
            m1459a0(context, "下载中...");
            f2337c.execute(new RunnableC0254gp(list, context, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m1490z(Context context, List<a> list) {
        context.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        if (f2339e) {
            m1459a0(context, "上一任务未完成，请稍后");
            return;
        }
        f2339e = true;
        m1482u(context);
        if (C0439lp.f3566a.m2050f(context)) {
            m1457Z(context, AbstractC0748t1.m4154l("Live图 0/", list.size()));
            f2337c.execute(new RunnableC0254gp(list, context, 3));
        } else {
            m1459a0(context, "下载中...");
            f2337c.execute(new RunnableC0254gp(list, context, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m1438E(String str, Uri uri) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m1441I(String str, Uri uri) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m1443K(String str, Uri uri) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m1445M(String str, Uri uri) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final void m1449R(String str, Uri uri) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m1485y(String str, Uri uri) {
    }
}
