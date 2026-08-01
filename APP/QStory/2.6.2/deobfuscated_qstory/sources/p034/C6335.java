package p034;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.RunnableC2346;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p035.AbstractC6340;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6335 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int f17452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int f17453;

    static {
        "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?ver=2.0&chv=3";
        f17453 = 0;
        f17452 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m11890(String str) {
        StringBuilder sbM11553 = AbstractC6136.m11553(str, new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        int i = f17452;
        f17452 = i + 1;
        String strValueOf = String.valueOf(i);
        int length = (28 - sbM11553.length()) - strValueOf.length();
        for (int i2 = 0; i2 < length; i2++) {
            sbM11553.append("0");
        }
        sbM11553.append(strValueOf);
        return sbM11553.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m11891(String str, String str2) {
        Class clsM11838 = AbstractC6318.m11838("com.tenpay.sdk.basebl.EncryptRequest");
        try {
            new Hook_cookie();
            return (String) AbstractC6317.m11831(String.class, "encText", XposedHelpers.callMethod(AbstractC6087.m11389(new Object[]{AbstractC6340.f17460}, new Class[]{Context.class}, clsM11838), "encypt", new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, String.class}, new Object[]{Hook_cookie.getMyuin(), str2, Integer.valueOf(f17453), str, Hook_cookie.getPskey("tenpay.com"), (String) XposedHelpers.callMethod(QQEnvTool.getQRouteApi(AbstractC6318.m11838("com.tencent.mobileqq.qwallet.api.INewQWalletApi")), "hexGuid", new Object[0])}));
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("\u62a5\u9519:\u83b7\u53d6getencText\u51fa\u9519", String.valueOf(e));
            String strM6668 = "hb";
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m11892(String str, String str2) {
        try {
            Class clsM11838 = AbstractC6318.m11838("com.tenpay.sdk.basebl.EncryptRequest");
            return (String) AbstractC6317.m11831(null, "decryptStr", XposedHelpers.callMethod(AbstractC6087.m11389(new Object[]{AbstractC6340.f17460}, new Class[]{Context.class}, clsM11838), "decypt", new Class[]{String.class, String.class, Integer.TYPE, String.class}, new Object[]{QQEnvTool.getCurrentUin(), str2, Integer.valueOf(f17453), str}));
        } catch (Throwable th) {
            String strM6668 = "hb";
            Exception exc = th;
            String str3 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, exc.toString(), exc, true);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.DataOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static byte[] m11893(byte[] bArr) throws Throwable {
        ?? r2;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ?? length = bArr.length + 4;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(length);
            try {
                try {
                    length = new DataOutputStream(byteArrayOutputStream2);
                    try {
                        length.writeInt(bArr.length + 4);
                        length.write(bArr);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        try {
                            byteArrayOutputStream2.close();
                            length.close();
                            return byteArray;
                        } catch (Exception unused) {
                            return byteArray;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        try {
                            byteArrayOutputStream2.close();
                            length.close();
                        } catch (Exception unused2) {
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    length = 0;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    r2 = length;
                    try {
                        byteArrayOutputStream.close();
                        r2.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                r2 = length;
                byteArrayOutputStream.close();
                r2.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r2 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m11894(String str, String str2) {
        try {
            if (Thread.currentThread().getName().equals("main")) {
                StringBuilder sb = new StringBuilder();
                Thread thread = new Thread(new RunnableC2346(sb, str, str2, 6));
                thread.start();
                thread.join();
                return sb.toString();
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?ver=2.0&chv=3").openConnection();
            httpURLConnection.setRequestProperty("user-agent", "okhttp/3.12.10");
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            String str3 = "req_text=" + m11891(str, "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?ver2.0&chv=3");
            String strM6668 = "2&random=" + f17453;
            if (str2.startsWith("v") && str2.length() > 12) {
                strM6668 = "0";
            }
            outputStream.write(((str3 + "&skey_type=" + strM6668 + "&msgno=" + m11890(QQEnvTool.getCurrentUin())) + "&skey=" + str2).getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return m11892(new String(byteArrayOutputStream.toByteArray()), "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?");
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            String strM66682 = "hb";
            String str4 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
            return null;
        }
    }
}
