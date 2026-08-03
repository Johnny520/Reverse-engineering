package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0032an;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bc */
/* JADX INFO: loaded from: classes.dex */
public class C0048bc {

    /* JADX INFO: renamed from: a */
    private static final String f253a = "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl/v2";

    /* JADX INFO: renamed from: b */
    private static final String f254b = "hAF3uVnSYyk2qN3trMjXFVsijBTGcR";

    /* JADX INFO: renamed from: c */
    private static C0048bc f255c;

    /* JADX INFO: renamed from: d */
    private Map<String, Object> f256d = null;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bc$a */
    public enum a {
        UNSTOP(0),
        STOP(1);

        private final int index;

        a(int i) {
            this.index = i;
        }

        public int index() {
            return this.index;
        }
    }

    private C0048bc() {
    }

    /* JADX INFO: renamed from: a */
    public static C0048bc m275a() {
        return new C0048bc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public String m277a(JSONObject jSONObject, String str) {
        return C0131y.m771c(jSONObject.get("pageUrl") + "." + jSONObject.get("shortUrl") + "." + jSONObject.get("is_retargeting") + "." + str + "." + f254b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m280a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C0048bc m281a(Map<String, Object> map) {
        this.f256d = map;
        return this;
    }

    public void getShortUrl(final TDGenerateUrl tDGenerateUrl) {
        new Thread(new Runnable() { // from class: com.tendcloud.tenddata.bc.1
            @Override // java.lang.Runnable
            public void run() {
                InputStream inputStream;
                ByteArrayOutputStream byteArrayOutputStream;
                OutputStream outputStream;
                InputStream inputStream2 = null;
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : C0048bc.this.f256d.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    byte[] bArrM734a = C0127u.m734a(jSONObject.toString().getBytes());
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    URL url = new URL("https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl/v2?sign=" + C0048bc.this.m277a(jSONObject, strValueOf) + "&nonce=" + strValueOf);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Short url serve: ");
                    sb.append(url);
                    C0115h.dForInternal(sb.toString());
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(15000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestProperty("Content-Type", C0032an.a.UNIVERSAL_STREAM.getName());
                    httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArrM734a.length));
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArrM734a);
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (Throwable unused) {
                                byteArrayOutputStream = null;
                            }
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i);
                                    }
                                }
                                byteArrayOutputStream.flush();
                                String str = new String(C0127u.m736b(byteArrayOutputStream.toByteArray()), Charset.forName("UTF-8"));
                                C0115h.dForInternal("TD getShortUrl success:", str);
                                JSONObject jSONObject2 = new JSONObject(str);
                                if (jSONObject2.getInt("code") != 200) {
                                    C0115h.eForInternal("TD getShortUrl Error:", str);
                                    tDGenerateUrl.callback(null);
                                } else {
                                    tDGenerateUrl.callback(jSONObject2.getString("result"));
                                }
                                inputStream2 = inputStream;
                            } catch (Throwable unused2) {
                                try {
                                    tDGenerateUrl.callback(null);
                                    C0048bc.this.m280a(outputStream);
                                    C0048bc.this.m280a(inputStream);
                                } catch (Throwable th) {
                                    C0048bc.this.m280a(outputStream);
                                    C0048bc.this.m280a(inputStream);
                                    C0048bc.this.m280a(byteArrayOutputStream);
                                    throw th;
                                }
                            }
                        } else {
                            C0115h.eForInternal("TD getShortUrl Http Error:" + responseCode);
                            tDGenerateUrl.callback(null);
                            byteArrayOutputStream = null;
                        }
                        C0048bc.this.m280a(outputStream);
                        C0048bc.this.m280a(inputStream2);
                    } catch (Throwable unused3) {
                        inputStream = null;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable unused4) {
                    inputStream = null;
                    byteArrayOutputStream = null;
                    outputStream = null;
                }
                C0048bc.this.m280a(byteArrayOutputStream);
            }
        }).start();
    }
}
