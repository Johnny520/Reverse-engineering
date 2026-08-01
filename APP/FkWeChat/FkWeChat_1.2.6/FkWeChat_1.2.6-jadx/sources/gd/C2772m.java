package gd;

import cd.C1517b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p053dd.C1950b;
import p068ed.AbstractC2212a;
import p201nd.C5580h;
import p315vd.AbstractC8924d;
import p330wd.C9227b;

/* JADX INFO: renamed from: gd.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2772m extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public static Class f7229e;

    /* JADX INFO: renamed from: f */
    public static Class f7230f;

    /* JADX INFO: renamed from: g */
    public static Class f7231g;

    /* JADX INFO: renamed from: h */
    public static Class f7232h;

    /* JADX INFO: renamed from: i */
    public static final Set f7233i = ConcurrentHashMap.newKeySet();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m9899z(InterfaceC5154i interfaceC5154i) {
        Object obj = interfaceC5154i.getArgs()[1];
        Object obj2 = interfaceC5154i.getArgs()[2];
        if (obj != null) {
            m9904E(obj, true);
        }
        if (obj2 != null) {
            m9906t(obj2.getClass());
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m9900A(InterfaceC5154i interfaceC5154i) {
        if (interfaceC5154i.getArgs().length < 2 || interfaceC5154i.getArgs()[1] == null) {
            return;
        }
        m9906t(interfaceC5154i.getArgs()[1].getClass());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9901B(InterfaceC5154i interfaceC5154i) {
        Object obj = interfaceC5154i.getArgs()[1];
        if (obj != null) {
            m9904E(obj, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m9902C(InterfaceC5154i interfaceC5154i) {
        if (interfaceC5154i.getArgs().length < 5 || interfaceC5154i.getArgs()[4] == null) {
            return;
        }
        m9904E(interfaceC5154i.getArgs()[4], false);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m9903D(InterfaceC5154i interfaceC5154i) {
        if (interfaceC5154i.getArgs().length < 4 || interfaceC5154i.getArgs()[3] == null) {
            return;
        }
        try {
            Object objCallMethod = AbstractC5161p.callMethod(interfaceC5154i.getArgs()[3], "getReqResp", new Object[0]);
            if (objCallMethod != null) {
                m9904E(objCallMethod, false);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m9904E(Object obj, boolean z10) {
        byte[] bArrM9907u;
        try {
            int iIntValue = ((Integer) AbstractC5161p.callMethod(obj, "getType", new Object[0])).intValue();
            String str = (String) AbstractC5161p.callMethod(obj, "getUri", new Object[0]);
            if (str != null && !str.isEmpty()) {
                Object objCallMethod = z10 ? AbstractC5161p.callMethod(obj, "getReqObj", new Object[0]) : AbstractC5161p.callMethod(obj, "getRespObj", new Object[0]);
                if (objCallMethod != null && (bArrM9907u = m9907u(objCallMethod, z10)) != null && bArrM9907u.length != 0) {
                    C1950b c1950b = new C1950b(iIntValue, str, C9227b.m35911a(bArrM9907u), bArrM9907u);
                    if (z10) {
                        C5580h.dispatchCgiRequ(c1950b);
                    } else {
                        C5580h.dispatchCgiResp(c1950b);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: F */
    public final byte[] m9905F(Object obj) {
        byte[] bArr;
        String[] strArr = {"getData", "toProtoBuf", "toByteArray", "toByteArrayOrNull"};
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                bArr = (byte[]) AbstractC5161p.callMethod(obj, strArr[i10], new Object[0]);
            } catch (Throwable unused) {
            }
            if (bArr != null && bArr.length > 0) {
                return bArr;
            }
        }
        return null;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        Class<?> cls = C1517b.findClass().usingStrings("MicroMsg.NetSceneBase", "dispatcher send, %s, ThreadID:%s, getType:%s").get();
        f7229e = cls;
        if (cls == null) {
            AbstractC8924d.m34262b("NetSceneBase not found");
            return false;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Field field = declaredFields[i10];
            if ("irr".equals(field.getName())) {
                f7232h = field.getType();
                break;
            }
            i10++;
        }
        for (Method method : f7229e.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ("dispatch".equals(method.getName()) && parameterTypes.length >= 3) {
                f7230f = parameterTypes[2];
            }
            if ("doScene".equals(method.getName()) && parameterTypes.length >= 2) {
                f7231g = parameterTypes[1];
            }
        }
        if (f7232h != null && f7230f != null) {
            return true;
        }
        AbstractC8924d.m34262b("Failed to derive interface classes from NetSceneBase");
        return false;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        Class cls = f7229e;
        if (cls != null) {
            HookEngine.hookAllMethodsBefore(cls, "dispatch", new InterfaceC5156k() { // from class: gd.f
                @Override // md.InterfaceC5156k
                /* JADX INFO: renamed from: a */
                public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                    this.f7221a.m9899z(interfaceC5154i);
                }
            });
            HookEngine.hookAllMethodsBefore(f7229e, "doScene", new InterfaceC5156k() { // from class: gd.g
                @Override // md.InterfaceC5156k
                /* JADX INFO: renamed from: a */
                public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                    this.f7222a.m9900A(interfaceC5154i);
                }
            });
            try {
                HookEngine.hookBefore(f7229e.getDeclaredMethod("G", f7230f, f7232h, Integer.TYPE), new InterfaceC5156k() { // from class: gd.h
                    @Override // md.InterfaceC5156k
                    /* JADX INFO: renamed from: a */
                    public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                        this.f7223a.m9901B(interfaceC5154i);
                    }
                });
            } catch (Throwable unused) {
            }
        }
        Class cls2 = f7230f;
        if (cls2 != null) {
            for (Method method : cls2.getMethods()) {
                if ("onGYNetEnd".equals(method.getName())) {
                    HookEngine.hookAfter(method, new InterfaceC5156k() { // from class: gd.i
                        @Override // md.InterfaceC5156k
                        /* JADX INFO: renamed from: a */
                        public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                            this.f7224a.m9902C(interfaceC5154i);
                        }
                    });
                }
            }
        }
        Class cls3 = f7231g;
        if (cls3 != null) {
            for (Method method2 : cls3.getMethods()) {
                if ("onSceneEnd".equals(method2.getName())) {
                    HookEngine.hookAfter(method2, new InterfaceC5156k() { // from class: gd.j
                        @Override // md.InterfaceC5156k
                        /* JADX INFO: renamed from: a */
                        public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                            this.f7225a.m9903D(interfaceC5154i);
                        }
                    });
                }
            }
        }
        m9909w();
    }

    /* JADX INFO: renamed from: t */
    public final void m9906t(Class cls) {
        if (cls == null) {
            return;
        }
        for (Class superclass = cls; superclass != null && !superclass.getName().equals("java.lang.Object"); superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                final String name = method.getName();
                if ("onGYNetEnd".equals(name) || "onSceneEnd".equals(name)) {
                    String str = cls.getName() + "#" + name;
                    Set set = f7233i;
                    if (!set.contains(str)) {
                        set.add(str);
                        HookEngine.hookAfter(method, new InterfaceC5156k() { // from class: gd.l
                            @Override // md.InterfaceC5156k
                            /* JADX INFO: renamed from: a */
                            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                                this.f7227a.m9910x(name, interfaceC5154i);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final byte[] m9907u(Object obj, boolean z10) {
        byte[] bArrM9905F;
        byte[] bArrM9905F2;
        if (obj == null) {
            return null;
        }
        if (z10) {
            try {
                Object objectField = AbstractC5161p.getObjectField(obj, "a");
                if (objectField != null && (bArrM9905F = m9905F(objectField)) != null) {
                    if (bArrM9905F.length > 0) {
                        return bArrM9905F;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        byte[] bArrM9905F3 = m9905F(obj);
        if (bArrM9905F3 != null && bArrM9905F3.length > 0) {
            return bArrM9905F3;
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
                if (obj2 != null && !(obj2 instanceof byte[]) && !(obj2 instanceof String) && !(obj2 instanceof Number) && !(obj2 instanceof Boolean) && (bArrM9905F2 = m9905F(obj2)) != null && bArrM9905F2.length > 0) {
                    return bArrM9905F2;
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m9908v(Class cls) {
        if (cls == null) {
            return;
        }
        try {
            HookEngine.hookBefore(cls.getDeclaredMethod("doScene", null), new InterfaceC5156k() { // from class: gd.k
                @Override // md.InterfaceC5156k
                /* JADX INFO: renamed from: a */
                public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                    this.f7226a.m9911y(interfaceC5154i);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m9909w() {
        try {
            Class<?> cls = C1517b.findClass().usingStrings("MicroMsg.RunCgi").pkg("com.tencent.mm.modelbase").get();
            if (cls != null) {
                m9908v(cls);
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls2 = C1517b.findClass().usingStrings("MicroMsg.Cgi").pkg("com.tencent.mm.modelbase").get();
            if (cls2 != null) {
                m9908v(cls2);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m9910x(String str, InterfaceC5154i interfaceC5154i) {
        Object objCallMethod;
        Object obj;
        if ("onGYNetEnd".equals(str) && interfaceC5154i.getArgs().length >= 5) {
            objCallMethod = interfaceC5154i.getArgs()[4];
        } else if (!"onSceneEnd".equals(str) || interfaceC5154i.getArgs().length < 4 || (obj = interfaceC5154i.getArgs()[3]) == null) {
            objCallMethod = null;
        } else {
            try {
                objCallMethod = AbstractC5161p.callMethod(obj, "getReqResp", new Object[0]);
            } catch (Throwable unused) {
                objCallMethod = null;
            }
        }
        if (objCallMethod != null) {
            m9904E(objCallMethod, false);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m9911y(InterfaceC5154i interfaceC5154i) {
        Object objCallMethod = AbstractC5161p.callMethod(interfaceC5154i.getThisObject(), "getReqResp", new Object[0]);
        if (objCallMethod != null) {
            m9904E(objCallMethod, true);
        }
    }
}
