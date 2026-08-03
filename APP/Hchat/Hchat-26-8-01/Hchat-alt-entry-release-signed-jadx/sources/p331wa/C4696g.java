package p331wa;

import android.content.SharedPreferences;
import android.text.TextUtils;
import ba.C0226f;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONObject;
import p020b5.C0184c;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p054dg.AbstractC0793l;
import p065eb.C0902x;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.utils.KavaReflector;
import p129ig.AbstractC2043a;
import p258r8.C3744i;

/* JADX INFO: renamed from: wa.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4696g {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f15685a;

    /* JADX INFO: renamed from: b */
    public final DexFinder f15686b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f15687c;

    /* JADX INFO: renamed from: d */
    public final C3193a f15688d;

    /* JADX INFO: renamed from: e */
    public final C0184c f15689e;

    /* JADX INFO: renamed from: f */
    public final C4694e f15690f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f15691g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f15692h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public volatile boolean f15693i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f15694j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4696g(ClassLoader classLoader, DexFinder dexFinder, SharedPreferences sharedPreferences, C0184c c0184c, C3193a c3193a) {
        this.f15685a = classLoader;
        this.f15686b = dexFinder;
        this.f15687c = sharedPreferences;
        this.f15689e = c0184c;
        this.f15688d = c3193a;
        this.f15690f = new C4694e(dexFinder, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m9215b(ArrayList arrayList, Class cls) {
        if (cls == null || cls.isInterface() || arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet] */
    /* JADX INFO: renamed from: c */
    public static void m9216c(final String str, final String str2, final int i9, final byte[] bArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC4699j.f15697c;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ?? r2 = new Object(str, str2, i9, bArr, jCurrentTimeMillis) { // from class: h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet
            private final int cgiId;
            private final byte[] data;
            private final String direction;
            private volatile String json;
            private final long timestamp;
            private final String uri;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.direction = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                this.uri = (str2 == null || "null".equals(str2)) ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
                this.cgiId = i9;
                this.data = bArr == null ? new byte[0] : (byte[]) bArr.clone();
                this.timestamp = jCurrentTimeMillis;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public int getCgiId() {
                return this.cgiId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public byte[] getData() {
                return (byte[]) this.data.clone();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String getDirection() {
                return this.direction;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String getJson() {
                String string;
                String str3 = this.json;
                if (str3 != null) {
                    return str3;
                }
                synchronized (this) {
                    try {
                        string = this.json;
                        if (string == null) {
                            try {
                                string = AbstractC2043a.m5020Z(this.data).toString();
                            } catch (Throwable unused) {
                                string = "{}";
                            }
                            this.json = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public JSONObject getJsonObject() {
                try {
                    return new JSONObject(getJson());
                } catch (Throwable unused) {
                    return new JSONObject();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public int getLength() {
                return this.data.length;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public long getTimestamp() {
                return this.timestamp;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String getUri() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public boolean isRequest() {
                return "request".equals(this.direction);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public boolean isResponse() {
                return "response".equals(this.direction);
            }
        };
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((C0902x) ((InterfaceC4698i) it.next())).getClass();
                ScriptPluginRuntime.protobufPacketListener$lambda$0(r2);
            } catch (Throwable th2) {
                AbstractC1184v0.m3204n("[Hchat:Protobuf] 数据包监听器处理失败", th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m9217e(Object obj, String str) {
        return KavaReflector.invoke(KavaReflector.findMethod(obj != null ? obj.getClass() : null, str, new Class[0]), obj, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m9218h(String str) {
        XposedBridge.log("[Hchat:Protobuf] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Object m9219i(Object obj) {
        Object field;
        if (obj == null) {
            return null;
        }
        try {
            Object field2 = KavaReflector.readField(obj, "a");
            if (m9220o(field2)) {
                return field2;
            }
        } catch (Throwable unused) {
        }
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                Iterator<Field> it = KavaReflector.declaredFields(superclass).iterator();
                while (it.hasNext()) {
                    try {
                        field = KavaReflector.readField(it.next(), obj);
                    } catch (Throwable unused2) {
                    }
                    if (m9220o(field)) {
                        return field;
                    }
                }
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m9220o(Object obj) {
        return (obj == null || KavaReflector.findMethod(obj.getClass(), "toByteArray", new Class[0]) == null || KavaReflector.findMethod(obj.getClass(), "parseFrom", byte[].class) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static byte[] m9221u(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            Object objM9217e = m9217e(obj, "toByteArray");
            if (objM9217e instanceof byte[]) {
                return (byte[]) objM9217e;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9222a(String str, ArrayList arrayList) {
        try {
            Class<?> clsLoadClass = KavaReflector.loadClass(str, this.f15685a);
            if (clsLoadClass == null || arrayList.contains(clsLoadClass)) {
                return;
            }
            arrayList.add(clsLoadClass);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m9223d(Class cls, JSONObject jSONObject, int i9) {
        LinkedHashMap linkedHashMap;
        Iterator<Constructor<?>> it;
        Object[] objArr;
        Object[] objArr2;
        Object objNewInstance;
        Class<String> cls2;
        int i10;
        Integer numValueOf;
        Integer numValueOf2;
        C4694e c4694e = new C4694e();
        c4694e.m9208c(jSONObject);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c4694e.f15677a;
        if (!linkedHashMap2.isEmpty()) {
            Iterator<Constructor<?>> it2 = KavaReflector.declaredConstructors(cls).iterator();
            while (it2.hasNext()) {
                Constructor<?> next = it2.next();
                Class<?>[] parameterTypes = next.getParameterTypes();
                if (parameterTypes == null || parameterTypes.length == 0) {
                    linkedHashMap = linkedHashMap2;
                    it = it2;
                    objArr = null;
                } else {
                    objArr2 = new Object[parameterTypes.length];
                    int length = parameterTypes.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        Class<?> cls3 = Boolean.TYPE;
                        Class<?> cls4 = Long.TYPE;
                        objArr = null;
                        Class<?> cls5 = Integer.TYPE;
                        linkedHashMap = linkedHashMap2;
                        Class<String> cls6 = String.class;
                        if (i11 < length) {
                            it = it2;
                            Class<?> cls7 = parameterTypes[i11];
                            if (cls7 == cls6) {
                                i12++;
                            }
                            if (cls7 != cls6 && cls7 != cls5 && cls7 != Integer.class && cls7 != cls4 && cls7 != Long.class && cls7 != cls3 && cls7 != Boolean.class) {
                                break;
                            }
                            i11++;
                            linkedHashMap2 = linkedHashMap;
                            it2 = it;
                        } else {
                            it = it2;
                            if (i12 > 0) {
                                Iterator it3 = c4694e.m9210h().iterator();
                                while (it3.hasNext()) {
                                    if (!TextUtils.isEmpty((String) it3.next())) {
                                    }
                                }
                            }
                            int i13 = 0;
                            int i14 = 0;
                            int i15 = 0;
                            while (i13 < parameterTypes.length) {
                                Class<?> cls8 = parameterTypes[i13];
                                if (cls8 == cls6) {
                                    int i16 = i14 + 1;
                                    cls2 = cls6;
                                    ArrayList arrayListM9210h = c4694e.m9210h();
                                    i10 = i13;
                                    objArr2[i10] = (i14 < 0 || i14 >= arrayListM9210h.size()) ? HttpUrl.FRAGMENT_ENCODE_SET : (String) arrayListM9210h.get(i14);
                                    i14 = i16;
                                } else {
                                    cls2 = cls6;
                                    i10 = i13;
                                    if (cls8 == cls5 || cls8 == Integer.class) {
                                        int i17 = i15 + 1;
                                        ArrayList arrayList = new ArrayList();
                                        for (int i18 = 0; i18 < 4; i18++) {
                                            String strM9213k = c4694e.m9213k(C4694e.f15676d[i18]);
                                            if (TextUtils.isEmpty(strM9213k)) {
                                                numValueOf2 = null;
                                            } else {
                                                try {
                                                    numValueOf2 = Integer.valueOf(Integer.parseInt(strM9213k.trim()));
                                                } catch (Throwable unused) {
                                                    numValueOf2 = null;
                                                }
                                            }
                                            if (numValueOf2 != null) {
                                                arrayList.add(numValueOf2);
                                            }
                                        }
                                        for (String str : linkedHashMap.values()) {
                                            if (TextUtils.isEmpty(str)) {
                                                numValueOf = null;
                                            } else {
                                                try {
                                                    numValueOf = Integer.valueOf(Integer.parseInt(str.trim()));
                                                } catch (Throwable unused2) {
                                                    numValueOf = null;
                                                }
                                            }
                                            if (numValueOf != null && !arrayList.contains(numValueOf)) {
                                                arrayList.add(numValueOf);
                                            }
                                        }
                                        objArr2[i10] = Integer.valueOf((i15 < 0 || i15 >= arrayList.size()) ? 0 : ((Integer) arrayList.get(i15)).intValue());
                                        i15 = i17;
                                    } else if (cls8 == cls4 || cls8 == Long.class) {
                                        objArr2[i10] = 0L;
                                    } else if (cls8 == cls3 || cls8 == Boolean.class) {
                                        objArr2[i10] = Boolean.FALSE;
                                    }
                                }
                                i13 = i10 + 1;
                                cls6 = cls2;
                            }
                        }
                    }
                }
                objArr2 = objArr;
                if (objArr2 != null && (objNewInstance = KavaReflector.newInstance(next, objArr2)) != null) {
                    int iIntValue = -1;
                    try {
                        Object objM9217e = m9217e(objNewInstance, "getType");
                        if (objM9217e instanceof Number) {
                            iIntValue = ((Number) objM9217e).intValue();
                        }
                    } catch (Throwable unused3) {
                    }
                    if (iIntValue == i9) {
                        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "原生场景参数: type=", " ctor=");
                        sbM2257t.append(next.getParameterCount());
                        sbM2257t.append(" query=");
                        sbM2257t.append(linkedHashMap.keySet().toString());
                        m9231p(sbM2257t.toString());
                        return objNewInstance;
                    }
                }
                linkedHashMap2 = linkedHashMap;
                it2 = it;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final ArrayList m9224f() {
        List<Class<?>> list;
        ArrayList arrayList = new ArrayList();
        m9222a("com.tencent.mm.modelbase.m1", arrayList);
        m9222a("com.tencent.mm.modelbase.k1", arrayList);
        m9222a("com.tencent.mm.modelbase.l1", arrayList);
        m9222a("com.tencent.mm.modelbase.n1", arrayList);
        DexFinder dexFinder = this.f15686b;
        if (dexFinder != null && (list = dexFinder.packetBaseClasses) != null) {
            for (Class<?> cls : list) {
                if (cls != null && !arrayList.contains(cls)) {
                    arrayList.add(cls);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m9225g(ArrayList arrayList, Class cls) {
        if (cls == null) {
            return;
        }
        if (!cls.isInterface()) {
            m9215b(arrayList, cls);
            for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                m9215b(arrayList, superclass);
            }
            return;
        }
        DexFinder dexFinder = this.f15686b;
        if (dexFinder == null) {
            return;
        }
        ArrayList<Class<?>> arrayList2 = new ArrayList();
        List<Class<?>> list = dexFinder.packetBaseClasses;
        if (list != null) {
            arrayList2.addAll(list);
        }
        List<Class<?>> list2 = dexFinder.netQueueCandidateClasses;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        for (Class<?> cls2 : arrayList2) {
            if (cls2 != null) {
                if (cls.isAssignableFrom(cls2)) {
                    m9215b(arrayList, cls2);
                }
                for (Class<?> cls3 : cls2.getDeclaredClasses()) {
                    if (cls.isAssignableFrom(cls3)) {
                        m9215b(arrayList, cls3);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C4695f m9226j(int i9, String str) {
        String strTrim = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str.trim();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4695f c4695f = null;
        for (C4695f c4695f2 : this.f15691g.values()) {
            if (c4695f2.f15680b == i9 && strTrim.equals(c4695f2.f15679a)) {
                long j3 = c4695f2.f15684f;
                if (jCurrentTimeMillis - j3 <= 600000 && (c4695f == null || j3 > c4695f.f15684f)) {
                    c4695f = c4695f2;
                }
            }
        }
        if (c4695f == null) {
            m9231p("快照未命中: type=" + i9 + " uri=" + strTrim);
            return c4695f;
        }
        m9231p("快照命中: type=" + i9 + " uri=" + strTrim + " req=" + c4695f.f15682d.getClass().getName());
        return c4695f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m9227k() {
        DexFinder dexFinder;
        int iM9228l;
        if (this.f15694j || (dexFinder = this.f15686b) == null || dexFinder.protobufNetSceneBaseClass == null) {
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            List<Method> list = this.f15686b.protobufSceneEndMethods;
            if (list != null) {
                Iterator<Method> it = list.iterator();
                iM9228l = 0;
                while (it.hasNext()) {
                    iM9228l += m9228l(it.next(), hashSet);
                }
            } else {
                iM9228l = 0;
            }
            ArrayList arrayList = new ArrayList();
            m9225g(arrayList, this.f15686b.protobufOnGYNetEndClass);
            List<Class<?>> list2 = this.f15686b.packetBaseClasses;
            if (list2 != null) {
                Iterator<Class<?>> it2 = list2.iterator();
                while (it2.hasNext()) {
                    m9225g(arrayList, it2.next());
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Iterator<Method> it4 = KavaReflector.declaredMethods((Class) it3.next()).iterator();
                while (it4.hasNext()) {
                    iM9228l += m9228l(it4.next(), hashSet);
                }
            }
            this.f15694j = iM9228l > 0;
            if (iM9228l <= 0) {
                m9218h("Hook通用发包回调隔离失败: 未找到onSceneEnd");
            }
        } catch (Throwable th2) {
            m9218h("Hook通用发包回调隔离失败: " + th2.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m9228l(Method method, HashSet hashSet) {
        Class<?>[] parameterTypes;
        DexFinder dexFinder;
        Class<?> cls;
        if (method != null && "onSceneEnd".equals(method.getName()) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4) {
            Class<?> cls2 = parameterTypes[0];
            Class<?> cls3 = Integer.TYPE;
            if (cls2 == cls3 && parameterTypes[1] == cls3 && parameterTypes[2] == String.class && (dexFinder = this.f15686b) != null && (cls = dexFinder.protobufNetSceneBaseClass) != null && cls.isAssignableFrom(parameterTypes[3])) {
                if (hashSet.add(method.getDeclaringClass().getName() + "#" + method.toString())) {
                    C3744i.f12154b.m7763b(method, new C0226f(27));
                    return 1;
                }
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m9229m() {
        boolean z9 = true;
        if (this.f15693i) {
            return true;
        }
        try {
            ArrayList<Class> arrayListM9224f = m9224f();
            HashSet hashSet = new HashSet();
            int i9 = 0;
            for (Class cls : arrayListM9224f) {
                for (Method method : KavaReflector.declaredMethods(cls)) {
                    if ("dispatch".equals(method.getName()) && method.getParameterTypes().length == 3) {
                        if (hashSet.add(cls.getName() + "#" + method.toString())) {
                            C3744i.f12154b.m7763b(method, new C0219e(this, 29));
                            i9++;
                        }
                    }
                }
            }
            m9227k();
            if (i9 <= 0) {
                z9 = false;
            }
            this.f15693i = z9;
            if (i9 <= 0) {
                m9218h("Hook失败: 未找到dispatch");
            }
            return this.f15693i;
        } catch (Throwable th2) {
            m9218h("Hook失败: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m9230n(int i9) {
        SharedPreferences sharedPreferences = this.f15687c;
        String string = sharedPreferences != null ? sharedPreferences.getString("protobuf_packet_block_types", "25694,14186,5171,11421,389,3565,138,1948,211,29710,996,4326,4687,4768,28920,379,8674") : "25694,14186,5171,11421,389,3565,138,1948,211,29710,996,4326,4687,4768,28920,379,8674";
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : string.split("[,，|\\s]+")) {
            if (str.length() != 0) {
                try {
                    if (Integer.parseInt(str.trim()) == i9) {
                        return true;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m9231p(String str) {
        if (this.f15688d != null) {
            XposedBridge.log("[Hchat:Protobuf] ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m9232q(String str, String str2, int i9, byte[] bArr) {
        String string;
        try {
            string = AbstractC2043a.m5020Z(bArr).toString();
        } catch (Throwable unused) {
            string = "{}";
        }
        StringBuilder sbM1027p = AbstractC0255e.m1027p("[Hchat:Protobuf] ", str, "\nUri: ", str2, "\nType: ");
        sbM1027p.append(i9);
        sbM1027p.append("\nLen: ");
        sbM1027p.append(bArr.length);
        sbM1027p.append("\nJson: ");
        sbM1027p.append(string);
        XposedBridge.log(sbM1027p.toString());
        C0184c c0184c = this.f15689e;
        if (c0184c != null) {
            int length = bArr.length;
            synchronized (c0184c) {
                string.getClass();
                try {
                    File fileM788E = c0184c.m788E();
                    if (!fileM788E.isDirectory() && !fileM788E.mkdirs()) {
                        return;
                    }
                    AbstractC0793l.m2020Z(new File(fileM788E, c0184c.m810f()), "----- " + ((SimpleDateFormat) c0184c.f470b).format(new Date()) + " -----\n" + str + "\nUri: " + str2 + "\nType: " + i9 + "\nLen: " + length + "\nJson: " + string + "\n\n");
                } catch (Throwable th2) {
                    AbstractC1184v0.m3204n("[Hchat:Protobuf] 写入抓包文件失败: " + th2.getMessage(), th2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m9233r(InterfaceC4697h interfaceC4697h, boolean z9, String str) {
        if (interfaceC4697h != null) {
            interfaceC4697h.mo2205c(str, z9);
        }
        if (z9) {
            m9231p(str);
        } else {
            m9218h(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m9234s(C4695f c4695f, byte[] bArr, String str, int i9, InterfaceC4697h interfaceC4697h) {
        String str2;
        try {
            Object obj = c4695f.f15681c;
            Object obj2 = c4695f.f15682d;
            if (obj == null) {
                return false;
            }
            byte[] bArr2 = c4695f.f15683e;
            boolean z9 = true;
            if (bArr2.length >= 4 && (bArr2[0] & 255) == 0) {
                byte[] bArr3 = new byte[(bArr == null ? 0 : bArr.length) + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, 4);
                if (bArr != null) {
                    System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
                }
                bArr = bArr3;
            }
            KavaReflector.invoke(KavaReflector.findMethodRecursive(obj2.getClass(), "parseFrom", byte[].class), obj2, bArr);
            if (WeChatApis.network() == null || !WeChatApis.network().f9079a.m6216j(obj)) {
                z9 = false;
            }
            if (z9) {
                str2 = "已用同类请求重放: " + str + " type=" + i9;
            } else {
                str2 = "发送失败: 网络API未就绪";
            }
            m9233r(interfaceC4697h, z9, str2);
            return z9;
        } catch (Throwable th2) {
            m9233r(interfaceC4697h, false, "重放发送失败: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m9235t(String str, byte[] bArr) {
        StringBuilder sbM1025n = AbstractC0255e.m1025n(str, "|");
        sbM1025n.append(Arrays.hashCode(bArr));
        String string = sbM1025n.toString();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        ConcurrentHashMap concurrentHashMap = this.f15692h;
        Long l10 = (Long) concurrentHashMap.put(string, lValueOf);
        if (concurrentHashMap.size() > 80) {
            try {
                concurrentHashMap.remove(concurrentHashMap.keySet().iterator().next());
            } catch (Throwable unused) {
            }
        }
        return l10 == null || jCurrentTimeMillis - l10.longValue() > 500;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m9236v(int i9, String str, JSONObject jSONObject, InterfaceC4697h interfaceC4697h) {
        Object obj = null;
        DexFinder dexFinder = this.f15686b;
        if (dexFinder != null) {
            try {
                Class<?> clsFindNativeNetSceneClass = dexFinder.findNativeNetSceneClass(str, i9);
                if (clsFindNativeNetSceneClass != null) {
                    Object objM9223d = m9223d(clsFindNativeNetSceneClass, jSONObject, i9);
                    if (objM9223d != null) {
                        m9231p("原生场景已构造: type=" + i9 + " class=" + objM9223d.getClass().getName());
                    }
                    obj = objM9223d;
                }
            } catch (Throwable th2) {
                m9231p("原生场景构造失败: type=" + i9 + " uri=" + str + " msg=" + th2.getMessage());
            }
        }
        if (obj == null) {
            return false;
        }
        if (WeChatApis.network() != null && WeChatApis.network().f9079a.m6216j(obj)) {
            m9233r(interfaceC4697h, true, "已用原生场景发送: " + str + " type=" + i9);
            return true;
        }
        m9231p("原生场景发送失败: type=" + i9 + " uri=" + str + " scene=" + obj.getClass().getName());
        return false;
    }
}
