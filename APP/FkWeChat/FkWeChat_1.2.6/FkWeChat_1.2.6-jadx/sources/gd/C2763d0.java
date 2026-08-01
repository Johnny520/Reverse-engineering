package gd;

import cd.C1517b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p068ed.AbstractC2212a;
import p084fd.AbstractC2429i;
import p315vd.AbstractC8924d;
import ye.C9797a;
import ye.C9807k;

/* JADX INFO: renamed from: gd.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2763d0 extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public static Class f7211e;

    /* JADX INFO: renamed from: f */
    public static Class f7212f;

    /* JADX INFO: renamed from: g */
    public static Class f7213g;

    /* JADX INFO: renamed from: h */
    public static Class f7214h;

    /* JADX INFO: renamed from: i */
    public static Class f7215i;

    /* JADX INFO: renamed from: j */
    public static Class f7216j;

    /* JADX INFO: renamed from: gd.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            try {
                return Integer.compare(Integer.parseInt(str), Integer.parseInt(str2));
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m9874m(C9797a c9797a) {
        c9797a.m38104d(C9807k.m38130c().m38137h("getUri"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getType"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getRespObj"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getReqObj"));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m9875n(C9797a c9797a) {
        c9797a.m38104d(C9807k.m38130c().m38137h("getUri"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getType"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getRespObj"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getReqObjImp"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getTransHeader"));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m9876o(InterfaceC5154i interfaceC5154i) {
        byte[] bArr;
        Object additionalField = AbstractC5161p.getAdditionalField(interfaceC5154i.getThisObject(), "is_fk_custom");
        if (additionalField == null || !((Boolean) additionalField).booleanValue() || (bArr = (byte[]) AbstractC5161p.getAdditionalField(interfaceC5154i.getThisObject(), "fk_shadow_data")) == null) {
            return;
        }
        interfaceC5154i.setResult(bArr);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m9877p(InterfaceC5154i interfaceC5154i) {
        byte[] bArr;
        Object additionalField = AbstractC5161p.getAdditionalField(interfaceC5154i.getThisObject(), "is_fk_custom");
        if (additionalField == null || !((Boolean) additionalField).booleanValue() || (bArr = (byte[]) AbstractC5161p.getAdditionalField(interfaceC5154i.getThisObject(), "fk_shadow_data")) == null) {
            return;
        }
        interfaceC5154i.setResult(Integer.valueOf(bArr.length));
    }

    /* JADX INFO: renamed from: r */
    public static Object m9879r(Class cls) {
        try {
            return cls.newInstance();
        } catch (Throwable unused) {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            for (int i10 = 0; i10 < length; i10++) {
                Constructor<?> constructor = declaredConstructors[i10];
                try {
                    constructor.setAccessible(true);
                    Object[] objArr = new Object[constructor.getParameterCount()];
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                        objArr[i11] = parameterTypes[i11].isPrimitive() ? parameterTypes[i11] == Boolean.TYPE ? Boolean.FALSE : 0 : null;
                    }
                    return constructor.newInstance(objArr);
                } catch (Throwable unused2) {
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m9880s(JSONObject jSONObject) throws JSONException, IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            arrayList.add(itKeys.next());
        }
        Collections.sort(arrayList, new a());
        for (String str : arrayList) {
            int i10 = Integer.parseInt(str);
            Object obj = jSONObject.get(str);
            if (obj instanceof Number) {
                m9885x(byteArrayOutputStream, i10 << 3);
                m9885x(byteArrayOutputStream, ((Number) obj).longValue());
            } else if (obj instanceof Boolean) {
                m9885x(byteArrayOutputStream, i10 << 3);
                m9885x(byteArrayOutputStream, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2.startsWith("hex->")) {
                    byte[] bArrM9881t = m9881t(str2.substring(5));
                    m9885x(byteArrayOutputStream, (i10 << 3) | 2);
                    m9885x(byteArrayOutputStream, bArrM9881t.length);
                    byteArrayOutputStream.write(bArrM9881t);
                } else if (str2.startsWith("f32->")) {
                    long j10 = Long.parseLong(str2.substring(5));
                    m9885x(byteArrayOutputStream, (i10 << 3) | 5);
                    m9883v(byteArrayOutputStream, (int) j10);
                } else if (str2.startsWith("f64->")) {
                    long j11 = Long.parseLong(str2.substring(5));
                    m9885x(byteArrayOutputStream, (i10 << 3) | 1);
                    m9884w(byteArrayOutputStream, j11);
                } else {
                    byte[] bytes = str2.getBytes("UTF-8");
                    m9885x(byteArrayOutputStream, (i10 << 3) | 2);
                    m9885x(byteArrayOutputStream, bytes.length);
                    byteArrayOutputStream.write(bytes);
                }
            } else if (obj instanceof JSONObject) {
                byte[] bArrM9880s = m9880s((JSONObject) obj);
                m9885x(byteArrayOutputStream, (i10 << 3) | 2);
                m9885x(byteArrayOutputStream, bArrM9880s.length);
                byteArrayOutputStream.write(bArrM9880s);
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    Object obj2 = jSONArray.get(i11);
                    if (obj2 instanceof JSONObject) {
                        byte[] bArrM9880s2 = m9880s((JSONObject) obj2);
                        m9885x(byteArrayOutputStream, (i10 << 3) | 2);
                        m9885x(byteArrayOutputStream, bArrM9880s2.length);
                        byteArrayOutputStream.write(bArrM9880s2);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(str, obj2);
                        byteArrayOutputStream.write(m9880s(jSONObject2));
                    }
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: t */
    public static byte[] m9881t(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i10 + 1), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: u */
    public static void m9882u(int i10, String str, String str2) {
        Object objNewInstance;
        int i11 = 0;
        try {
            byte[] bArrM9880s = m9880s(new JSONObject(str2));
            Object objNewInstance2 = f7215i.newInstance();
            Object objNewInstance3 = f7215i.newInstance();
            AbstractC5161p.setAdditionalField(objNewInstance2, "is_fk_custom", Boolean.TRUE);
            AbstractC5161p.setAdditionalField(objNewInstance2, "fk_shadow_data", bArrM9880s);
            Constructor<?>[] declaredConstructors = f7211e.getDeclaredConstructors();
            int length = declaredConstructors.length;
            while (true) {
                if (i11 >= length) {
                    objNewInstance = null;
                    break;
                }
                Constructor<?> constructor = declaredConstructors[i11];
                if (constructor.getParameterCount() == 13) {
                    constructor.setAccessible(true);
                    Integer numValueOf = Integer.valueOf(i10);
                    Boolean bool = Boolean.TRUE;
                    objNewInstance = constructor.newInstance(objNewInstance2, objNewInstance3, str, numValueOf, 0, 0, bool, 0, 0, bool, 1, bool, null);
                    break;
                }
                i11++;
            }
            if (objNewInstance == null) {
                return;
            }
            Object objNewInstance4 = AbstractC5161p.newInstance(f7212f, m9879r(f7213g));
            AbstractC5161p.setObjectField(objNewInstance4, "g", objNewInstance);
            AbstractC5161p.setObjectField(objNewInstance4, "h", new WeakReference(null));
            AbstractC2429i.m8778c(objNewInstance4);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("StnPacketHook", "Send Failure: ", th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m9883v(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        byteArrayOutputStream.write(i10 & 255);
        byteArrayOutputStream.write((i10 >> 8) & 255);
        byteArrayOutputStream.write((i10 >> 16) & 255);
        byteArrayOutputStream.write((i10 >> 24) & 255);
    }

    /* JADX INFO: renamed from: w */
    public static void m9884w(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        for (int i10 = 0; i10 < 8; i10++) {
            byteArrayOutputStream.write((int) ((j10 >> (i10 * 8)) & 255));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m9885x(ByteArrayOutputStream byteArrayOutputStream, long j10) {
        while (((-128) & j10) != 0) {
            byteArrayOutputStream.write((int) ((127 & j10) | 128));
            j10 >>>= 7;
        }
        byteArrayOutputStream.write((int) j10);
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        try {
            f7211e = C1517b.findClass().pkg("com.tencent.mm.modelbase").matcher(new Consumer() { // from class: gd.a0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C2763d0.m9875n((C9797a) obj);
                }
            }).get();
            f7212f = C1517b.findClass().pkg("com.tencent.mm.modelbase").usingStrings("MicroMsg.Cgi", "Start doScene:%d func:%d netid:%d time:%d").get();
            f7213g = C1517b.findClass().pkg("com.tencent.mm.modelbase").usingStrings("MicroMsg.Cgi", "[afterDead] cgi=%s").get();
            f7214h = C1517b.findClass().pkg("com.tencent.mm.network").matcher(new Consumer() { // from class: gd.b0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C2763d0.m9874m((C9797a) obj);
                }
            }).get();
            f7215i = C1517b.findClass().usingStrings("PrefixLocalClickInfo").matcher(new Consumer() { // from class: gd.c0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((C9797a) obj).m38104d(C9807k.m38130c().m38137h("op"));
                }
            }).get();
            f7216j = C1517b.findClass().pkg("com.tencent.mm.protobuf").usingStrings("Cannot use this method").get();
            return true;
        } catch (Throwable th) {
            AbstractC8924d.m34264d("StnPacketHook", "Driver initialization failed", th);
            return false;
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookBefore(AbstractC5161p.findMethodExact(f7216j, "toByteArray", new Class[0]), new InterfaceC5156k() { // from class: gd.y
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                C2763d0.m9876o(interfaceC5154i);
            }
        });
        HookEngine.hookBefore(AbstractC5161p.findMethodExact(f7216j, "computeSize", new Class[0]), new InterfaceC5156k() { // from class: gd.z
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                C2763d0.m9877p(interfaceC5154i);
            }
        });
    }
}
