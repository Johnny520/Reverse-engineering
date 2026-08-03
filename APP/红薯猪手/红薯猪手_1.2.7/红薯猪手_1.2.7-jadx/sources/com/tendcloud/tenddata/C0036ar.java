package com.tendcloud.tenddata;

import android.os.SystemClock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ar */
/* JADX INFO: loaded from: classes.dex */
public final class C0036ar {

    /* JADX INFO: renamed from: a */
    private static final int f201a = 600;

    /* JADX INFO: renamed from: b */
    private int f202b;

    /* JADX INFO: renamed from: c */
    private byte[] f203c;

    /* JADX INFO: renamed from: d */
    private Map<String, List<String>> f204d;

    private C0036ar(int i, String str) {
        this(i, str.getBytes(), null);
    }

    private C0036ar(int i, byte[] bArr, Map<String, List<String>> map) {
        this.f202b = i;
        this.f203c = bArr;
        this.f204d = map;
    }

    /* JADX INFO: renamed from: a */
    public static int m206a() {
        return f201a;
    }

    /* JADX INFO: renamed from: a */
    private static C0036ar m207a(int i, int i2, InputStream inputStream, Map<String, List<String>> map) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = i2 != -1 ? new ByteArrayOutputStream(i2) : new ByteArrayOutputStream();
            while (true) {
                int i3 = inputStream.read();
                if (i3 == -1) {
                    inputStream.close();
                    return new C0036ar(i, byteArrayOutputStream.toByteArray(), map);
                }
                byteArrayOutputStream.write(i3);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0036ar m208a(String str) {
        return new C0036ar(f201a, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[EXC_TOP_SPLITTER, PHI: r9 r10
  0x002a: PHI (r9v2 java.io.InputStream) = (r9v1 java.io.InputStream), (r9v3 java.io.InputStream) binds: [B:16:0x0036, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r10v1 com.tendcloud.tenddata.ar) = (r10v0 com.tendcloud.tenddata.ar), (r10v3 com.tendcloud.tenddata.ar) binds: [B:16:0x0036, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0036ar m209a(String str, HttpURLConnection httpURLConnection, long j, C0032an c0032an) {
        int responseCode;
        InputStream errorStream;
        C0036ar c0036ar;
        try {
            responseCode = httpURLConnection.getResponseCode();
            try {
                errorStream = responseCode > 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            } catch (Throwable unused) {
                errorStream = null;
                try {
                    c0036ar = new C0036ar(responseCode, null, null);
                    if (errorStream != null) {
                    }
                    return c0036ar;
                } catch (Throwable th) {
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th;
                }
            }
            try {
                c0036ar = m207a(responseCode, httpURLConnection.getContentLength(), errorStream, httpURLConnection.getHeaderFields());
                m211a(str, httpURLConnection, responseCode, j, c0036ar, c0032an);
            } catch (Throwable unused3) {
                c0036ar = new C0036ar(responseCode, null, null);
                if (errorStream != null) {
                }
            }
        } catch (Throwable unused4) {
            responseCode = f201a;
        }
        if (errorStream != null) {
            try {
                errorStream.close();
            } catch (Throwable unused5) {
            }
        }
        return c0036ar;
    }

    /* JADX INFO: renamed from: a */
    private static String m210a(C0036ar c0036ar) {
        if (c0036ar == null || c0036ar.m213c() == null) {
            return "";
        }
        try {
            byte[] bArrM213c = c0036ar.m213c();
            return bArrM213c.length > 104857600 ? "Input stream more than 100 MB size limit" : new String(bArrM213c);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m211a(String str, HttpURLConnection httpURLConnection, int i, long j, C0036ar c0036ar, C0032an c0032an) {
        boolean z;
        if (httpURLConnection != null) {
            try {
                if (httpURLConnection.getRequestMethod().equalsIgnoreCase("POST")) {
                    TreeMap treeMap = new TreeMap();
                    URL url = httpURLConnection.getURL();
                    treeMap.put("targetUrl", url.toString());
                    try {
                        treeMap.put("targetIP", InetAddress.getByName(url.getHost()).getHostAddress());
                    } catch (Throwable unused) {
                        treeMap.put("targetIP", "0.0.0.0");
                    }
                    if (i == 200) {
                        if (c0032an != null && c0032an.m139a() != null) {
                            treeMap.put("reqSize", Integer.valueOf(c0032an.m139a().length));
                        }
                        treeMap.put("respTime", Long.valueOf(SystemClock.elapsedRealtime() - j));
                        z = true;
                    } else {
                        treeMap.put("errorMsg", m210a(c0036ar));
                        treeMap.put("statusCode", Integer.valueOf(i));
                        z = false;
                    }
                    C0060bo.m353a(str, z, treeMap);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m212b() {
        return this.f202b;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m213c() {
        return this.f203c;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, List<String>> m214d() {
        return this.f204d;
    }
}
