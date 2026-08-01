package p035;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.RunnableC2346;
import com.alibaba.fastjson2.AbstractC2905;
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
import p009.AbstractC6183;
import p010.AbstractC6188;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6353 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int f17500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int f17501;

    static {
        AbstractC8405.m13972(389);
        f17501 = 0;
        f17500 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m11938(String str) {
        StringBuilder sbM11584 = AbstractC6183.m11584(str, new SimpleDateFormat(AbstractC8405.m13972(388)).format(new Date()));
        int i = f17500;
        f17500 = i + 1;
        String strValueOf = String.valueOf(i);
        int length = (28 - sbM11584.length()) - strValueOf.length();
        for (int i2 = 0; i2 < length; i2++) {
            sbM11584.append(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        }
        sbM11584.append(strValueOf);
        return sbM11584.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m11939(String str, String str2) {
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(396));
        try {
            new Hook_cookie();
            return (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜"), XposedHelpers.callMethod(AbstractC2905.m6285(new Object[]{AbstractC6358.f17507}, new Class[]{Context.class}, clsM11866), AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), new Class[]{String.class, String.class, Integer.TYPE, String.class, String.class, String.class}, new Object[]{Hook_cookie.getMyuin(), str2, Integer.valueOf(f17501), str, Hook_cookie.getPskey(AbstractC8405.m13972(398)), (String) XposedHelpers.callMethod(QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(397))), AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), new Object[0])}));
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(AbstractC8405.m13972(399), String.valueOf(e));
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜");
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, e.toString(), e, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m11940(String str, String str2) {
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(396));
            return (String) AbstractC6336.m11859(null, AbstractC8405.m13972(400), XposedHelpers.callMethod(AbstractC2905.m6285(new Object[]{AbstractC6358.f17507}, new Class[]{Context.class}, clsM11866), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), new Class[]{String.class, String.class, Integer.TYPE, String.class}, new Object[]{QQEnvTool.getCurrentUin(), str2, Integer.valueOf(f17501), str}));
        } catch (Throwable th) {
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜");
            Exception exc = th;
            String str3 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13973, exc.toString(), exc, true);
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
    public static byte[] m11941(byte[] bArr) throws Throwable {
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
    public static String m11942(String str, String str2) {
        try {
            if (Thread.currentThread().getName().equals(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵"))) {
                StringBuilder sb = new StringBuilder();
                Thread thread = new Thread(new RunnableC2346(sb, str, str2, 6));
                thread.start();
                thread.join();
                return sb.toString();
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(AbstractC8405.m13972(389)).openConnection();
            httpURLConnection.setRequestProperty(AbstractC8405.m13972(377), AbstractC8405.m13972(390));
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            String str3 = AbstractC8405.m13972(391) + m11939(str, AbstractC8405.m13972(392));
            String strM13973 = AbstractC8405.m13972(393) + f17501;
            if (str2.startsWith(AbstractC8405.m13973("喵喵喵喵喵呜喵呜")) && str2.length() > 12) {
                strM13973 = AbstractC8405.m13973("喵呜喵喵喵喵呜呜");
            }
            outputStream.write(((str3 + AbstractC8405.m13972(394) + strM13973 + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜呜~喵喵喵喵喵喵呜呜~喵呜喵呜呜呜喵喵") + m11938(QQEnvTool.getCurrentUin())) + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜呜呜喵喵~喵呜喵呜喵喵喵呜") + str2).getBytes(StandardCharsets.UTF_8));
            outputStream.flush();
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return m11940(new String(byteArrayOutputStream.toByteArray()), AbstractC8405.m13972(395));
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            String strM139732 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜呜");
            String str4 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139732, e.toString(), e, true);
            return null;
        }
    }
}
