package p051;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.RunnableC3179;
import com.alibaba.fastjson2.AbstractC3738;
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
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p025.AbstractC7012;
import p026.AbstractC7017;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p052.AbstractC7187;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7182 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int f17845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int f17846;

    static {
        "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?ver=2.0&chv=3";
        f17846 = 0;
        f17845 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12497(String str) {
        StringBuilder sbM12143 = AbstractC7012.m12143(str, new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        int i = f17845;
        f17845 = i + 1;
        String strValueOf = String.valueOf(i);
        int length = (28 - sbM12143.length()) - strValueOf.length();
        for (int i2 = 0; i2 < length; i2++) {
            sbM12143.append("0");
        }
        sbM12143.append(strValueOf);
        return sbM12143.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m12498(String str, String str2) {
        Class clsM12425 = AbstractC7166.m12425("com.tenpay.sdk.basebl.EncryptRequest");
        try {
            new Hook_cookie();
            return (String) AbstractC7165.m12418(String.class, "encText", XposedHelpers.callMethod(AbstractC3738.m6845(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, clsM12425), "encypt", new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, String.class}, new Object[]{Hook_cookie.getMyuin(), str2, Integer.valueOf(f17846), str, Hook_cookie.getPskey("tenpay.com"), (String) XposedHelpers.callMethod(QQEnvTool.getQRouteApi(AbstractC7166.m12425("com.tencent.mobileqq.qwallet.api.INewQWalletApi")), "hexGuid", new Object[0])}));
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("报错:获取getencText出错", String.valueOf(e));
            String strM14532 = "hb";
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m12499(String str, String str2) {
        try {
            Class clsM12425 = AbstractC7166.m12425("com.tenpay.sdk.basebl.EncryptRequest");
            return (String) AbstractC7165.m12418(null, "decryptStr", XposedHelpers.callMethod(AbstractC3738.m6845(new Object[]{AbstractC7187.f17852}, new Class[]{Context.class}, clsM12425), "decypt", new Class[]{String.class, String.class, Integer.TYPE, String.class}, new Object[]{QQEnvTool.getCurrentUin(), str2, Integer.valueOf(f17846), str}));
        } catch (Throwable th) {
            String strM14532 = "hb";
            Exception exc = th;
            String str3 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14532, exc.toString(), exc, true);
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
    public static byte[] m12500(byte[] bArr) throws Throwable {
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
    public static String m12501(String str, String str2) {
        try {
            if (Thread.currentThread().getName().equals("main")) {
                StringBuilder sb = new StringBuilder();
                Thread thread = new Thread(new RunnableC3179(sb, str, str2, 6));
                thread.start();
                thread.join();
                return sb.toString();
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?ver=2.0&chv=3").openConnection();
            httpURLConnection.setRequestProperty("user-agent", "okhttp/3.12.10");
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            String str3 = "req_text=" + m12498(str, "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?ver2.0&chv=3");
            String strM14532 = "2&random=" + f17846;
            if (str2.startsWith("v") && str2.length() > 12) {
                strM14532 = "0";
            }
            outputStream.write(((str3 + "&skey_type=" + strM14532 + "&msgno=" + m12497(QQEnvTool.getCurrentUin())) + "&skey=" + str2).getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return m12499(new String(byteArrayOutputStream.toByteArray()), "https://mqq.tenpay.com/cgi-bin/hongbao/qpay_hb_na_grap.cgi?");
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            String strM145322 = "hb";
            String str4 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145322, e.toString(), e, true);
            return null;
        }
    }
}
