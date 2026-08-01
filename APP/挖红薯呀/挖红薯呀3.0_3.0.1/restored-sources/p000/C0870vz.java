package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C0439lp;

/* JADX INFO: renamed from: vz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0870vz {

    /* JADX INFO: renamed from: b */
    private static final String f6879b = "ImgDL";

    /* JADX INFO: renamed from: d */
    private static final int f6881d = 2;

    /* JADX INFO: renamed from: a */
    public static final C0870vz f6878a = new C0870vz();

    /* JADX INFO: renamed from: c */
    private static final ExecutorService f6880c = Executors.newFixedThreadPool(8);

    /* JADX INFO: renamed from: e */
    public static final int f6882e = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0870vz() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4808g(C0870vz c0870vz, Context context, List list, InterfaceC0904ww interfaceC0904ww, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC0904ww = null;
        }
        c0870vz.m4818f(context, list, interfaceC0904ww);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m4809h(String str, Context context, int i, long j, AtomicInteger atomicInteger, InterfaceC0904ww interfaceC0904ww, int i2) {
        String strM4120h = C0745sz.f5862a.m4120h(str);
        for (int i3 = 0; i3 < 3; i3++) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(strM4120h).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(8000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    String contentType = httpURLConnection.getContentType();
                    if (contentType == null) {
                        contentType = "image/jpeg";
                    }
                    C0870vz c0870vz = f6878a;
                    String strM4812l = c0870vz.m4812l(contentType);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    inputStream.getClass();
                    byte[] bArrM2983S = p30.m2983S(inputStream);
                    httpURLConnection.disconnect();
                    c0870vz.m4816r(context, bArrM2983S, i, strM4812l, j);
                    break;
                }
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
        int iIncrementAndGet = atomicInteger.incrementAndGet();
        if (interfaceC0904ww != null) {
            interfaceC0904ww.invoke(Integer.valueOf(iIncrementAndGet), Integer.valueOf(i2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m4810j(C0870vz c0870vz, Context context, List list, InterfaceC0904ww interfaceC0904ww, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC0904ww = null;
        }
        c0870vz.m4819i(context, list, interfaceC0904ww);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m4811k(List list, InterfaceC0904ww interfaceC0904ww, int i, Context context, long j) throws IOException {
        Iterator it;
        int i2;
        String str;
        String str2;
        HttpURLConnection httpURLConnection;
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            int i4 = i3 + 1;
            uo0 uo0Var = (uo0) it2.next();
            C0439lp c0439lp = C0439lp.f3566a;
            if (c0439lp.m2048d()) {
                c0439lp.m2054j(new C0439lp.a(null, 0L, 0L, false, true, 15, null));
                if (interfaceC0904ww != null) {
                    interfaceC0904ww.invoke(Integer.valueOf(i3), Integer.valueOf(i));
                    return;
                }
                return;
            }
            String str3 = (String) uo0Var.f6274d;
            int iIntValue = ((Number) uo0Var.f6275e).intValue();
            String strM4153k = AbstractC0748t1.m4153k(i4, i, "图片 ", "/");
            c0439lp.m2054j(new C0439lp.a(strM4153k, 0L, 0L, false, false, 24, null));
            String strM4120h = C0745sz.f5862a.m4120h(str3);
            int i5 = 0;
            while (i5 < 3 && !C0439lp.f3566a.m2048d()) {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(strM4120h).openConnection();
                    uRLConnectionOpenConnection.getClass();
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(8000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                } catch (Exception e) {
                    e = e;
                    it = it2;
                }
                if (httpURLConnection.getResponseCode() == 200) {
                    String contentType = httpURLConnection.getContentType();
                    if (contentType == null) {
                        contentType = "image/jpeg";
                    }
                    String strM4812l = f6878a.m4812l(contentType);
                    long contentLength = httpURLConnection.getContentLength();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[16384];
                    it = it2;
                    int i6 = inputStream.read(bArr);
                    long j2 = 0;
                    long j3 = 0;
                    while (i6 != -1) {
                        try {
                            C0439lp c0439lp2 = C0439lp.f3566a;
                            if (c0439lp2.m2048d()) {
                                inputStream.close();
                                httpURLConnection.disconnect();
                                c0439lp2.m2054j(new C0439lp.a(null, 0L, 0L, false, true, 15, null));
                                if (interfaceC0904ww != null) {
                                    interfaceC0904ww.invoke(Integer.valueOf(i4), Integer.valueOf(i));
                                    return;
                                }
                                return;
                            }
                            i2 = i4;
                            try {
                                byteArrayOutputStream.write(bArr, 0, i6);
                                str = strM4120h;
                                j2 += (long) i6;
                                if (j2 - j3 > 131072) {
                                    try {
                                        c0439lp2.m2054j(new C0439lp.a(strM4153k, j2, contentLength > 0 ? contentLength : -1L, false, false, 24, null));
                                        j3 = j2;
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                }
                                i6 = inputStream.read(bArr);
                                strM4120h = str;
                                i4 = i2;
                            } catch (Exception e3) {
                                e = e3;
                                str = strM4120h;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i2 = i4;
                        }
                        str = strM4120h;
                        str2 = f6879b;
                        lb0.f3404a.m2014a(str2, "dl fail idx=" + i3 + ": " + e.getMessage());
                        i5++;
                        strM4120h = str;
                        it2 = it;
                        i4 = i2;
                    }
                    i2 = i4;
                    str = strM4120h;
                    C0439lp c0439lp3 = C0439lp.f3566a;
                    long j4 = j2;
                    if (contentLength > 0) {
                        j2 = contentLength;
                    }
                    c0439lp3.m2054j(new C0439lp.a(strM4153k, j2, contentLength > 0 ? contentLength : j4, false, false, 24, null));
                    inputStream.close();
                    httpURLConnection.disconnect();
                    str2 = f6879b;
                    try {
                        C0870vz c0870vz = f6878a;
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                        c0870vz.m4816r(context, byteArray, iIntValue, strM4812l, j);
                        break;
                    } catch (Exception e5) {
                        e = e5;
                        lb0.f3404a.m2014a(str2, "dl fail idx=" + i3 + ": " + e.getMessage());
                        i5++;
                        strM4120h = str;
                        it2 = it;
                        i4 = i2;
                    }
                } else {
                    it = it2;
                    i2 = i4;
                    str = strM4120h;
                    httpURLConnection.disconnect();
                    i5++;
                    strM4120h = str;
                    it2 = it;
                    i4 = i2;
                }
            }
            it = it2;
            i2 = i4;
            lb0.f3404a.m2014a(f6879b, "dl failed after retry idx=" + i3);
            if (interfaceC0904ww != null) {
                interfaceC0904ww.invoke(Integer.valueOf(i2), Integer.valueOf(i));
            }
            it2 = it;
            i3 = i2;
        }
        C0439lp.f3566a.m2054j(new C0439lp.a(null, 0L, 0L, true, false, 23, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    private final String m4812l(String str) {
        return (k41.m1764V(str, "heif", true) || k41.m1764V(str, "heic", true)) ? "heif" : k41.m1764V(str, "webp", true) ? "webp" : k41.m1764V(str, "png", true) ? "png" : k41.m1764V(str, "gif", true) ? "gif" : k41.m1764V(str, "bmp", true) ? "bmp" : k41.m1764V(str, "svg", true) ? "svg" : "jpg";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m4813n(String str, Context context, int i, long j, InterfaceC0742sw interfaceC0742sw) {
        String strM4120h = C0745sz.f5862a.m4120h(str);
        boolean z = false;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(strM4120h).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(8000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    String contentType = httpURLConnection.getContentType();
                    if (contentType == null) {
                        contentType = "image/jpeg";
                    }
                    C0870vz c0870vz = f6878a;
                    String strM4812l = c0870vz.m4812l(contentType);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    inputStream.getClass();
                    byte[] bArrM2983S = p30.m2983S(inputStream);
                    httpURLConnection.disconnect();
                    c0870vz.m4816r(context, bArrM2983S, i, strM4812l, j);
                    z = true;
                    break;
                }
                httpURLConnection.disconnect();
            } catch (Exception unused) {
            }
        }
        interfaceC0742sw.invoke(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m4814p(String str, InterfaceC0742sw interfaceC0742sw) {
        Bitmap bitmapDecodeStream = null;
        for (int i = 0; i < 3; i++) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                    httpURLConnection.disconnect();
                    if (bitmapDecodeStream != null) {
                        break;
                    }
                } else {
                    httpURLConnection.disconnect();
                }
            } catch (Exception unused) {
            }
        }
        interfaceC0742sw.invoke(bitmapDecodeStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    private final String m4815q(String str) {
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

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: r */
    private final void m4816r(Context context, byte[] bArr, int i, String str, long j) {
        try {
            File file = new File(m00.f3663S.m2381i0(context, "原图_whs"), "whs-" + j + "-" + (i + 1) + "." + str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                file.setLastModified(j + ((long) i));
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{m4815q(str)}, new C0100cp(6));
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4818f(final Context context, List<uo0> list, final InterfaceC0904ww interfaceC0904ww) {
        context.getClass();
        list.getClass();
        final int size = list.size();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        for (uo0 uo0Var : list) {
            final String str = (String) uo0Var.f6274d;
            final int iIntValue = ((Number) uo0Var.f6275e).intValue();
            f6880c.execute(new Runnable() { // from class: tz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    C0870vz.m4809h(str, context, iIntValue, jCurrentTimeMillis, atomicInteger, interfaceC0904ww, size);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4819i(Context context, List<uo0> list, InterfaceC0904ww interfaceC0904ww) {
        context.getClass();
        list.getClass();
        f6880c.execute(new RunnableC0821uz(list, interfaceC0904ww, list.size(), context, System.currentTimeMillis()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4820m(Context context, String str, int i, InterfaceC0742sw interfaceC0742sw) {
        context.getClass();
        str.getClass();
        interfaceC0742sw.getClass();
        f6880c.execute(new RunnableC0821uz(str, context, i, System.currentTimeMillis(), interfaceC0742sw));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m4821o(String str, InterfaceC0742sw interfaceC0742sw) {
        str.getClass();
        interfaceC0742sw.getClass();
        f6880c.execute(new RunnableC0751t4(3, str, interfaceC0742sw));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m4817s(String str, Uri uri) {
    }
}
