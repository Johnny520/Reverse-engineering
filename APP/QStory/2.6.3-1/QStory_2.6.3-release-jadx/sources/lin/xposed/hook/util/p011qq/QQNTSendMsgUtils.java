package lin.xposed.hook.util.p011qq;

import androidx.compose.runtime.internal.C2080;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import p025.AbstractC7012;
import p026.AbstractC7014;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTSendMsgUtils {
    public static void forwardMsg(ArrayList<Long> arrayList, Object obj, ArrayList<Object> arrayList2) {
        Object objM12146 = AbstractC7012.m12146(965);
        Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(971));
        C7164 c7164M12413 = C7164.m12413(objM12146.getClass());
        Class[] clsArr = {ArrayList.class, AbstractC7166.m12425(AbstractC9234.m14531(133)), ArrayList.class, ArrayList.class, clsM12425};
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        c7164M12413.f17803.f3963 = AbstractC9234.m14531(662);
        c7164M12413.m12415(objM12146, arrayList, obj, arrayList2, null, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{clsM12425}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String post(String str, String str2, String str3) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer = new StringBuffer();
        CookieHandler.setDefault(new CookieManager());
        ?? r2 = 0;
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(2000000);
                    httpURLConnection.setReadTimeout(2000000);
                    httpURLConnection.setRequestMethod(AbstractC9234.m14532("喵喵呜喵喵喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵呜呜呜呜喵喵"));
                    httpURLConnection.setRequestProperty(AbstractC9234.m14531(39), AbstractC9234.m14531(974));
                    httpURLConnection.setRequestProperty(AbstractC9234.m14532("喵喵呜呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵喵呜"), str2);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    Charset charset = StandardCharsets.UTF_8;
                    outputStream.write(str3.getBytes(charset));
                    httpURLConnection.getOutputStream().flush();
                    inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), charset);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
            } catch (Exception e2) {
                e = e2;
                inputStreamReader2 = inputStreamReader;
                e.printStackTrace();
                r2 = inputStreamReader2;
                if (inputStreamReader2 != null) {
                    inputStreamReader2.close();
                    r2 = inputStreamReader2;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = inputStreamReader;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            stringBuffer.append(line + AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
            if (stringBuffer.length() != 0) {
                return stringBuffer.toString();
            }
            stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
            return stringBuffer.toString();
        }
        OutputStream outputStream2 = httpURLConnection.getOutputStream();
        outputStream2.close();
        httpURLConnection.disconnect();
        bufferedReader.close();
        inputStreamReader.close();
        r2 = outputStream2;
        if (stringBuffer.length() != 0) {
        }
    }

    public static void sendCard(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createArkElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendFile(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createFileElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendMsg(Object obj, ArrayList arrayList) {
        if (obj == null) {
            AbstractC7014.m12151(AbstractC9234.m14531(972));
            return;
        }
        if (arrayList == null) {
            AbstractC7014.m12151(AbstractC9234.m14531(973));
            return;
        }
        Object objM12146 = AbstractC7012.m12146(965);
        C7164 c7164M12413 = C7164.m12413(objM12146.getClass());
        Class[] clsArr = {AbstractC7166.m12425(AbstractC9234.m14531(133)), ArrayList.class, AbstractC7166.m12425(AbstractC9234.m14531(136))};
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        c7164M12413.f17803.f3963 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        c7164M12413.m12415(objM12146, obj, arrayList, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(136))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.2
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        }));
    }

    public static void sendPic(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createPicElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendText(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createTextElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendVideo(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createVideoElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendVoice(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createPttElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendMsg(Object obj, ArrayList arrayList, final IOperateCallback iOperateCallback) {
        if (obj == null) {
            AbstractC7014.m12151(AbstractC9234.m14531(972));
            return;
        }
        if (arrayList == null) {
            AbstractC7014.m12151(AbstractC9234.m14531(973));
            return;
        }
        Object objM12146 = AbstractC7012.m12146(965);
        C7164 c7164M12413 = C7164.m12413(objM12146.getClass());
        Class[] clsArr = {AbstractC7166.m12425(AbstractC9234.m14531(133)), ArrayList.class, AbstractC7166.m12425(AbstractC9234.m14531(136))};
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        c7164M12413.f17803.f3963 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        c7164M12413.m12415(objM12146, obj, arrayList, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(136))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                iOperateCallback.onResult(((Integer) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            }
        }));
    }
}
