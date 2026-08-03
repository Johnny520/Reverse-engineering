package p331wa;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p068eh.AbstractC0921a;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p129ig.AbstractC2043a;

/* JADX INFO: renamed from: wa.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4694e {

    /* JADX INFO: renamed from: c */
    public static final String[][] f15675c = {new String[]{"sendId", "sendid"}, new String[]{"nativeUrl", "nativeurl"}, new String[]{"headImg", "headimg"}, new String[]{"nickName", "nickname"}, new String[]{"sessionUserName", "sessionUser"}, new String[]{"ver"}, new String[]{"timingIdentifier"}, new String[]{"left_button_continue", "leftButtonContinue"}};

    /* JADX INFO: renamed from: d */
    public static final String[] f15676d = {"msgType", "msgtype", "channelId", "channelid"};

    /* JADX INFO: renamed from: a */
    public final Object f15677a;

    /* JADX INFO: renamed from: b */
    public final Object f15678b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4694e() {
        this.f15677a = new LinkedHashMap();
        this.f15678b = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m9202a(Object obj, String str, StringBuilder sb2) {
        if (obj != null) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append(',');
        }
        sb2.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m9203d(byte[] bArr, Class cls) {
        Object objNewInstance;
        if (cls == null || (objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0])) == null) {
            return null;
        }
        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethodRecursive(objNewInstance.getClass(), "parseFrom", byte[].class), objNewInstance, bArr);
        return objInvoke != null ? objInvoke : objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static byte[] m9204f(Object obj) {
        Object objInvoke;
        if (obj == null) {
            return null;
        }
        try {
            Object field = KavaReflector.readField(KavaReflector.readField(obj, "b"), "a");
            try {
                objInvoke = KavaReflector.invoke(KavaReflector.findMethod(field.getClass(), "initialProtobufBytes", new Class[0]), field, new Object[0]);
            } catch (Throwable unused) {
                objInvoke = null;
            }
            if (objInvoke instanceof byte[]) {
                return (byte[]) objInvoke;
            }
            Object objInvoke2 = KavaReflector.invoke(KavaReflector.findMethod(field.getClass(), "toByteArray", new Class[0]), field, new Object[0]);
            if (objInvoke2 instanceof byte[]) {
                return (byte[]) objInvoke2;
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m9205g(final InterfaceC4697h interfaceC4697h, final boolean z9, final String str) {
        if (interfaceC4697h == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: wa.b
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = z9;
                interfaceC4697h.mo2205c(str, z10);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m9206l(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException {
        Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str);
        if (fieldFindFieldRecursive == null) {
            throw new NoSuchFieldException(str);
        }
        if (!KavaReflector.writeField(fieldFindFieldRecursive, obj, obj2)) {
            throw new IllegalAccessException(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r3.isAssignableFrom(r2.getClass()) != false) goto L9;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m9207b(Object obj) {
        Class<?> cls;
        DexFinder dexFinder = (DexFinder) this.f15677a;
        try {
            Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "a", new Class[0]), obj, new Object[0]);
            if (objInvoke != null) {
                Class<?> cls2 = dexFinder.protobufReqRespClass;
                if (cls2 != null) {
                }
                return objInvoke;
            }
        } catch (Throwable unused) {
        }
        for (Method method : KavaReflector.declaredMethods(obj.getClass())) {
            try {
                if (method.getParameterTypes().length == 0) {
                    Class<?> returnType = method.getReturnType();
                    Class<?> cls3 = Void.TYPE;
                    if (returnType != cls3 && method.getReturnType() != cls3 && ((cls = dexFinder.protobufReqRespClass) == null || cls.isAssignableFrom(method.getReturnType()))) {
                        return KavaReflector.invoke(method, obj, new Object[0]);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m9208c(Object obj) {
        if (obj == null || obj == JSONObject.NULL) {
            return;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                m9208c(jSONObject.opt(itKeys.next()));
            }
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                m9208c(jSONArray.opt(i9));
            }
            return;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return;
        }
        if (strValueOf.indexOf(61) < 0 || strValueOf.indexOf(38) < 0) {
            ((ArrayList) this.f15678b).add(strValueOf);
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f15677a;
        for (String str : strValueOf.split("&")) {
            int iIndexOf = str.indexOf(61);
            if (iIndexOf > 0) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    strSubstring = URLDecoder.decode(strSubstring, "UTF-8");
                } catch (Throwable unused) {
                }
                String strSubstring2 = str.substring(iIndexOf + 1);
                try {
                    strSubstring2 = URLDecoder.decode(strSubstring2, "UTF-8");
                } catch (Throwable unused2) {
                }
                if (!TextUtils.isEmpty(strSubstring) && !linkedHashMap.containsKey(strSubstring)) {
                    if (strSubstring2 == null) {
                        strSubstring2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    linkedHashMap.put(strSubstring, strSubstring2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m9209e(final int i9, final String str, byte[] bArr, Object obj, final InterfaceC4697h interfaceC4697h, String str2) {
        ClassLoader classLoader = (ClassLoader) this.f15678b;
        DexFinder dexFinder = (DexFinder) this.f15677a;
        try {
            Object objInvokeOrThrow = KavaReflector.invokeOrThrow(dexFinder.protobufStaticDispatchMethod, null, obj, Proxy.newProxyInstance(classLoader, new Class[]{dexFinder.protobufCallbackClass}, new InvocationHandler(this) { // from class: wa.c
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
                @Override // java.lang.reflect.InvocationHandler
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    int i10 = i9;
                    String str3 = str;
                    if ("hashCode".equals(method.getName())) {
                        return Integer.valueOf(System.identityHashCode(obj2));
                    }
                    if ("equals".equals(method.getName())) {
                        if (objArr != null && objArr.length > 0) {
                            obj = objArr[0];
                        }
                        return Boolean.valueOf(obj2 == obj);
                    }
                    if ("toString".equals(method.getName())) {
                        return "HchatProtobufCallback";
                    }
                    if (objArr != null && "callback".equals(method.getName())) {
                        try {
                            int iIntValue = -1;
                            if (objArr.length > 0) {
                                Object obj3 = objArr[0];
                                int iIntValue2 = obj3 instanceof Number ? ((Number) obj3).intValue() : -1;
                                if (objArr.length > 1) {
                                    Object obj4 = objArr[1];
                                    if (obj4 instanceof Number) {
                                        iIntValue = ((Number) obj4).intValue();
                                    }
                                }
                                String strValueOf = objArr.length > 2 ? String.valueOf(objArr[2]) : HttpUrl.FRAGMENT_ENCODE_SET;
                                byte[] bArrM9204f = C4694e.m9204f(objArr.length > 3 ? objArr[3] : null);
                                String string = bArrM9204f != null ? AbstractC2043a.m5020Z(bArrM9204f).toString() : "{}";
                                StringBuilder sb2 = new StringBuilder("[Hchat:Protobuf] 发包回调: type=");
                                sb2.append(i10);
                                sb2.append(" uri=");
                                sb2.append(str3);
                                sb2.append(" errType=");
                                sb2.append(iIntValue2);
                                sb2.append(" errCode=");
                                sb2.append(iIntValue);
                                sb2.append(" errMsg=");
                                sb2.append(strValueOf);
                                sb2.append(" respLen=");
                                sb2.append(bArrM9204f == null ? 0 : bArrM9204f.length);
                                sb2.append(" resp=");
                                sb2.append(string);
                                XposedBridge.log(sb2.toString());
                                InterfaceC4697h interfaceC4697h2 = interfaceC4697h;
                                if (iIntValue2 == 0 && iIntValue == 0) {
                                    C4694e.m9205g(interfaceC4697h2, true, "响应: " + string);
                                } else {
                                    String str4 = "响应失败: type=" + iIntValue2 + " code=" + iIntValue + " msg=" + strValueOf;
                                    if (i10 == 681) {
                                        XposedBridge.log("[Hchat:Protobuf] Oplog回包非成功但请求已发送: uri=" + str3 + " " + str4);
                                    } else {
                                        C4694e.m9205g(interfaceC4697h2, false, str4);
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    return 0;
                }
            }), Boolean.FALSE);
            if (objInvokeOrThrow != null) {
                AbstractC4699j.f15696b.put(objInvokeOrThrow, Boolean.TRUE);
            }
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "[Hchat:Protobuf] 发包Dispatch: type=", " reqResp=");
            sbM2257t.append(obj.getClass().getName());
            sbM2257t.append(" req=");
            sbM2257t.append(str2);
            sbM2257t.append(" len=");
            sbM2257t.append(bArr != null ? bArr.length : 0);
            sbM2257t.append(" scene=");
            sbM2257t.append(objInvokeOrThrow == null ? "null" : objInvokeOrThrow.getClass().getName());
            XposedBridge.log(sbM2257t.toString());
            m9205g(interfaceC4697h, true, "通用发包已发送: " + str + " type=" + i9);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            InvocationTargetException cause2 = e6;
            if (cause != null) {
                cause2 = e6.getCause();
            }
            m9205g(interfaceC4697h, false, "通用发包失败: Dispatch异常 " + cause2.getClass().getSimpleName() + ": " + cause2.getMessage());
        } catch (Throwable th2) {
            m9205g(interfaceC4697h, false, "通用发包失败: Dispatch异常 " + th2.getClass().getSimpleName() + ": " + th2.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public ArrayList m9210h() {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < 8; i9++) {
            String[] strArr = f15675c[i9];
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (strArr != null) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        String strM9213k = m9213k(strArr[i10]);
                        if (!TextUtils.isEmpty(strM9213k)) {
                            str = strM9213k;
                            break;
                        }
                        i10++;
                    }
                }
            }
            arrayList.add(str);
        }
        for (String str2 : ((LinkedHashMap) this.f15677a).values()) {
            if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        for (String str3 : (ArrayList) this.f15678b) {
            if (!TextUtils.isEmpty(str3) && !arrayList.contains(str3)) {
                arrayList.add(str3);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public String m9211i() {
        DexFinder dexFinder = (DexFinder) this.f15677a;
        StringBuilder sb2 = new StringBuilder();
        m9202a(dexFinder.protobufRawReqClass, "RawReq", sb2);
        m9202a(dexFinder.protobufGenericRespClass, "GenericResp", sb2);
        m9202a(dexFinder.protobufConfigBuilderClass, "ConfigBuilder", sb2);
        m9202a(dexFinder.protobufReqRespClass, "ReqResp", sb2);
        m9202a(dexFinder.protobufCallbackClass, "Callback", sb2);
        Class<?> cls = dexFinder.protobufCallbackClass;
        if (cls != null && !cls.isInterface()) {
            String strConcat = "Callback非接口=".concat(dexFinder.protobufCallbackClass.getName());
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(strConcat);
        }
        m9202a(dexFinder.protobufStaticDispatchMethod, "Dispatch", sb2);
        return sb2.length() == 0 ? "已就绪" : sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public boolean m9212j(String str, int i9, int i10, int i11, byte[] bArr, InterfaceC4697h interfaceC4697h) {
        Class<?> cls;
        Object objM9203d;
        Class<?> cls2;
        Class<?> cls3;
        DexFinder dexFinder = (DexFinder) this.f15677a;
        if (dexFinder.protobufRawReqClass == null || dexFinder.protobufGenericRespClass == null || dexFinder.protobufConfigBuilderClass == null || dexFinder.protobufReqRespClass == null || (cls = dexFinder.protobufCallbackClass) == null || !cls.isInterface() || dexFinder.protobufStaticDispatchMethod == null) {
            return false;
        }
        if (i9 == 522) {
            try {
                objM9203d = m9203d(bArr, dexFinder.protobufNewSendMsgReqClass);
            } catch (Throwable th2) {
                m9205g(interfaceC4697h, false, "通用发包失败: " + th2.getMessage());
                return true;
            }
        } else {
            objM9203d = null;
        }
        if (objM9203d == null && i9 == 681) {
            objM9203d = m9203d(bArr, dexFinder.protobufOplogReqClass);
        }
        if (objM9203d == null) {
            objM9203d = KavaReflector.newInstance(KavaReflector.findConstructor(dexFinder.protobufRawReqClass, byte[].class), bArr);
        }
        Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(dexFinder.protobufGenericRespClass, new Class[0]), new Object[0]);
        Object objNewInstance2 = KavaReflector.newInstance(KavaReflector.findConstructor(dexFinder.protobufConfigBuilderClass, new Class[0]), new Object[0]);
        if (objM9203d != null && objNewInstance != null && objNewInstance2 != null) {
            StringBuilder sb2 = new StringBuilder("[Hchat:Protobuf] 发包请求: type=");
            sb2.append(i9);
            sb2.append(" req=");
            sb2.append(objM9203d.getClass().getName());
            sb2.append(" len=");
            sb2.append(bArr == null ? 0 : bArr.length);
            sb2.append(" func=");
            sb2.append(i10);
            sb2.append(" route=");
            sb2.append(i11);
            sb2.append(" special=");
            Class<?> cls4 = objM9203d.getClass();
            sb2.append((i9 != 522 || (cls3 = dexFinder.protobufNewSendMsgReqClass) == null) ? (i9 != 681 || (cls2 = dexFinder.protobufOplogReqClass) == null) ? false : cls2.isAssignableFrom(cls4) : cls3.isAssignableFrom(cls4));
            XposedBridge.log(sb2.toString());
            m9206l(objNewInstance2, "a", objM9203d);
            m9206l(objNewInstance2, "b", objNewInstance);
            m9206l(objNewInstance2, "c", str);
            m9206l(objNewInstance2, "d", Integer.valueOf(i9));
            m9206l(objNewInstance2, "e", Integer.valueOf(i10));
            m9206l(objNewInstance2, "f", Integer.valueOf(i11));
            m9206l(objNewInstance2, "l", 1);
            m9206l(objNewInstance2, "n", bArr);
            Object objM9207b = m9207b(objNewInstance2);
            if (objM9207b == null) {
                m9205g(interfaceC4697h, false, "通用发包失败: ReqResp构造失败");
                return true;
            }
            m9209e(i9, str, bArr, objM9207b, interfaceC4697h, objM9203d.getClass().getName());
            return true;
        }
        m9205g(interfaceC4697h, false, "通用发包失败: 对象创建失败");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public String m9213k(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f15677a;
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = (String) linkedHashMap.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public C4694e(DexFinder dexFinder, ClassLoader classLoader) {
        this.f15677a = dexFinder;
        this.f15678b = classLoader;
    }
}
