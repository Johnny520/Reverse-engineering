package p000;

import android.os.Process;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: c0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0074c0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1089h;

    public /* synthetic */ C0074c0(int i) {
        this.f1089h = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        Object next;
        int i = this.f1089h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 2:
                EnumC0075c1[] enumC0075c1ArrValues = EnumC0075c1.values();
                enumC0075c1ArrValues.getClass();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                nv2 nv2Var = nv2.f7346a;
                break;
            case 7:
                nv2 nv2Var2 = nv2.f7346a;
                break;
            case 8:
                jn1.f5122d.getClass();
                Constructor<?>[] declaredConstructors = ((Class) jn1.f5124f.getValue()).getDeclaredConstructors();
                declaredConstructors.getClass();
                C0314ii c0314ii = C0314ii.f4621d;
                ArrayList arrayList = new ArrayList();
                for (Constructor<?> constructor : declaredConstructors) {
                    c0314ii.getClass();
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    if (C0314ii.f4630m.contains(Integer.valueOf(parameterTypes.length)) && parameterTypes.length >= 6 && t11.m5086l(parameterTypes[0], String.class) && t11.m5086l(parameterTypes[1], String.class)) {
                        Class<?> cls = parameterTypes[2];
                        Class cls2 = Integer.TYPE;
                        if (t11.m5086l(cls, cls2) && t11.m5086l(parameterTypes[3], String.class) && t11.m5086l(parameterTypes[4], String.class) && t11.m5086l(parameterTypes[5], cls2)) {
                            arrayList.add(constructor);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int parameterCount = ((Constructor) next).getParameterCount();
                        do {
                            Object next2 = it.next();
                            int parameterCount2 = ((Constructor) next2).getParameterCount();
                            if (parameterCount < parameterCount2) {
                                next = next2;
                                parameterCount = parameterCount2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Constructor constructor2 = (Constructor) next;
                if (constructor2 != null) {
                    ig1.m2344a(constructor2);
                } else {
                    C0676s.m4653l("No supported NetSceneTenpayRemittanceConfirm constructor found");
                }
                break;
            case 9:
                nv2 nv2Var3 = nv2.f7346a;
                break;
            case 10:
                nv2 nv2Var4 = nv2.f7346a;
                break;
            case 12:
                tu2 tu2Var = AbstractC0427lk.f6159a;
                break;
            case 16:
                nv2 nv2Var5 = nv2.f7346a;
                break;
            case 19:
                EnumC0176er[] enumC0176erArrValues = EnumC0176er.values();
                enumC0176erArrValues.getClass();
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                EnumC0250gr[] enumC0250grArrValues = EnumC0250gr.values();
                enumC0250grArrValues.getClass();
                break;
            case 21:
                EnumC0323ir[] enumC0323irArrValues = EnumC0323ir.values();
                enumC0323irArrValues.getClass();
                break;
            case 27:
                tu2 tu2Var2 = AbstractC0670ru.f9755a;
                break;
            case 28:
                pp1 pp1Var = pp1.f8445a;
                if (pp1.m3932d() == vu0.f12174i) {
                    fd3.m1599b();
                } else {
                    Process.killProcess(Process.myPid());
                }
                break;
        }
        return a83Var;
    }
}
