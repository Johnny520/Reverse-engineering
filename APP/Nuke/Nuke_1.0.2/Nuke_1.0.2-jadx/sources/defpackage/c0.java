package defpackage;

import android.os.Process;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements xm0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c1.<clinit>():void, ch.<clinit>():void, cr.<clinit>():void, di.<clinit>():void, er.<clinit>():void, gr.<clinit>():void, ir.<clinit>():void, nuke.module.wechat.ai.AIChatConfig.<clinit>():void, pp0.c(boolean, xm0, px, int, int):void, se.g(in0, in0, px, int):void, ta.a():java.lang.Object, te.d(c73, boolean, in0, in0, px, int):void, zq.<clinit>():void] */
    public /* synthetic */ c0(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: nuke.module.wechat.ai.AIChatConfig.a():w41 */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        Object next;
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 2:
                c1[] c1VarArrValues = c1.values();
                c1VarArrValues.getClass();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                nv2 nv2Var = nv2.a;
                break;
            case 7:
                nv2 nv2Var2 = nv2.a;
                break;
            case 8:
                jn1.d.getClass();
                Constructor<?>[] declaredConstructors = ((Class) jn1.f.getValue()).getDeclaredConstructors();
                declaredConstructors.getClass();
                ii iiVar = ii.d;
                ArrayList arrayList = new ArrayList();
                for (Constructor<?> constructor : declaredConstructors) {
                    iiVar.getClass();
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    if (ii.m.contains(Integer.valueOf(parameterTypes.length)) && parameterTypes.length >= 6 && t11.l(parameterTypes[0], String.class) && t11.l(parameterTypes[1], String.class)) {
                        Class<?> cls = parameterTypes[2];
                        Class cls2 = Integer.TYPE;
                        if (t11.l(cls, cls2) && t11.l(parameterTypes[3], String.class) && t11.l(parameterTypes[4], String.class) && t11.l(parameterTypes[5], cls2)) {
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
                    ig1.a(constructor2);
                } else {
                    s.l("No supported NetSceneTenpayRemittanceConfirm constructor found");
                }
                break;
            case 9:
                nv2 nv2Var3 = nv2.a;
                break;
            case 10:
                nv2 nv2Var4 = nv2.a;
                break;
            case 12:
                tu2 tu2Var = lk.a;
                break;
            case 16:
                nv2 nv2Var5 = nv2.a;
                break;
            case 19:
                er[] erVarArrValues = er.values();
                erVarArrValues.getClass();
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                gr[] grVarArrValues = gr.values();
                grVarArrValues.getClass();
                break;
            case 21:
                ir[] irVarArrValues = ir.values();
                irVarArrValues.getClass();
                break;
            case 27:
                tu2 tu2Var2 = ru.a;
                break;
            case 28:
                pp1 pp1Var = pp1.a;
                if (pp1.d() == vu0.i) {
                    fd3.b();
                } else {
                    Process.killProcess(Process.myPid());
                }
                break;
        }
        return a83Var;
    }
}
