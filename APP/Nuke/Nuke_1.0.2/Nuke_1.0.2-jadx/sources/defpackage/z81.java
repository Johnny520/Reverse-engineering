package defpackage;

import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z81 implements mn0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [d91.<clinit>():void, op0.b(kw, px, int):void, tl.i(ng, zf1, yf1):bj0, zh.j(java.lang.Object):java.lang.Object] */
    public /* synthetic */ z81(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        Object x92Var;
        Object x92Var2;
        Object x92Var3;
        Object x92Var4;
        boolean z = false;
        switch (this.h) {
            case 0:
                d91 d91Var = (d91) obj2;
                return eu.P(Integer.valueOf(((kx1) d91Var.e.b).g()), Integer.valueOf(((kx1) d91Var.e.c).g()));
            case 1:
                Map mapC = ((g91) obj2).c();
                if (mapC.isEmpty()) {
                    return null;
                }
                return mapC;
            case 2:
                return Boolean.valueOf(((gi0) obj2).c.isEnumConstant() == ((Boolean) obj).booleanValue());
            case 3:
                return Boolean.valueOf(((gi0) obj2).c.isEnumConstant() != ((Boolean) obj).booleanValue());
            case 4:
                Boolean bool = (Boolean) ((in0) obj).j(((gi0) obj2).c.getType());
                bool.booleanValue();
                return bool;
            case 5:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((gi0) obj2).c.getGenericType();
                throw null;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                Boolean bool2 = (Boolean) ((in0) obj).j(((gi0) obj2).c.getGenericType());
                bool2.booleanValue();
                return bool2;
            case 7:
                Set set = (Set) obj;
                Member member = ((bh0) obj2).b;
                member.getClass();
                List listT0 = mg.t0(((Executable) member).getGenericExceptionTypes());
                if (set.size() == listT0.size()) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        vi0.t(it.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 8:
                Set set2 = (Set) obj;
                Member member2 = ((bh0) obj2).b;
                member2.getClass();
                List listT02 = mg.t0(((Executable) member2).getGenericParameterTypes());
                if (set2.size() != listT02.size()) {
                    z = false;
                } else {
                    Iterator it2 = set2.iterator();
                    if (it2.hasNext()) {
                        vi0.t(it2.next());
                        throw null;
                    }
                }
                return Boolean.valueOf(z);
            case 9:
                Set set3 = (Set) obj;
                Member member3 = ((bh0) obj2).b;
                member3.getClass();
                List listT03 = mg.t0(((Executable) member3).getGenericParameterTypes());
                if (set3.size() == listT03.size()) {
                    Iterator it3 = set3.iterator();
                    if (it3.hasNext()) {
                        vi0.t(it3.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 10:
                try {
                    Boolean bool3 = (Boolean) ((in0) obj).j(((rg1) obj2).c.getReturnType());
                    bool3.booleanValue();
                    x92Var = bool3;
                    break;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Boolean bool4 = Boolean.FALSE;
                boolean z2 = x92Var instanceof x92;
                Object obj3 = x92Var;
                if (z2) {
                    obj3 = bool4;
                }
                return (Boolean) obj3;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Member member4 = ((bh0) obj2).b;
                member4.getClass();
                return Boolean.valueOf(((Executable) member4).isVarArgs() == zBooleanValue);
            case 12:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Member member5 = ((bh0) obj2).b;
                member5.getClass();
                return Boolean.valueOf(((Executable) member5).isVarArgs() != zBooleanValue2);
            case 13:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReturnType is not supported on Android.");
            case 14:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReturnType is not supported on Android.");
            case 15:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReceiverType is not supported on Android.");
            case 16:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedReceiverType is not supported on Android.");
            case 17:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedParameterTypes is not supported on Android.");
            case 18:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((rg1) obj2).c.getGenericReturnType();
                throw null;
            case 19:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedParameterTypes is not supported on Android.");
            case AIChatConfig.MaxContextRounds /* 20 */:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedExceptionTypes is not supported on Android.");
            case 21:
                ((bh0) obj2).getClass();
                throw new IllegalStateException("getAnnotatedExceptionTypes is not supported on Android.");
            case 22:
                in0 in0Var = (in0) obj;
                try {
                    Member member6 = ((bh0) obj2).b;
                    member6.getClass();
                    x92Var2 = (Boolean) in0Var.j(mg.t0(((Executable) member6).getParameterTypes()));
                    x92Var2.getClass();
                    break;
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                Object obj4 = Boolean.FALSE;
                if (x92Var2 instanceof x92) {
                    x92Var2 = obj4;
                }
                return (Boolean) x92Var2;
            case 23:
                int iIntValue = ((Integer) obj).intValue();
                Member member7 = ((bh0) obj2).b;
                member7.getClass();
                return Boolean.valueOf(((Executable) member7).getParameterCount() == iIntValue);
            case 24:
                in0 in0Var2 = (in0) obj;
                try {
                    Member member8 = ((bh0) obj2).b;
                    member8.getClass();
                    x92Var3 = (Boolean) in0Var2.j(Integer.valueOf(((Executable) member8).getParameterCount()));
                    x92Var3.getClass();
                    break;
                } catch (Throwable th3) {
                    x92Var3 = new x92(th3);
                }
                Object obj5 = Boolean.FALSE;
                if (x92Var3 instanceof x92) {
                    x92Var3 = obj5;
                }
                return (Boolean) x92Var3;
            case 25:
                Set set4 = (Set) obj;
                Member member9 = ((bh0) obj2).b;
                member9.getClass();
                List listT04 = mg.t0(((Executable) member9).getTypeParameters());
                if (set4.size() != listT04.size()) {
                    z = false;
                } else {
                    Iterator it4 = set4.iterator();
                    if (it4.hasNext()) {
                        vi0.t(it4.next());
                        throw null;
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                Set set5 = (Set) obj;
                Member member10 = ((bh0) obj2).b;
                member10.getClass();
                List listT05 = mg.t0(((Executable) member10).getTypeParameters());
                if (set5.size() == listT05.size()) {
                    Iterator it5 = set5.iterator();
                    if (it5.hasNext()) {
                        vi0.t(it5.next());
                        throw null;
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 27:
                try {
                    Boolean bool5 = (Boolean) ((in0) obj).j(((rg1) obj2).c.getGenericReturnType());
                    bool5.booleanValue();
                    x92Var4 = bool5;
                    break;
                } catch (Throwable th4) {
                    x92Var4 = new x92(th4);
                }
                Boolean bool6 = Boolean.FALSE;
                boolean z3 = x92Var4 instanceof x92;
                Object obj6 = x92Var4;
                if (z3) {
                    obj6 = bool6;
                }
                return (Boolean) obj6;
            case 28:
                Set set6 = (Set) obj;
                Member member11 = ((bh0) obj2).b;
                member11.getClass();
                List listT06 = mg.t0(((Executable) member11).getGenericExceptionTypes());
                if (set6.size() != listT06.size()) {
                    z = false;
                } else {
                    Iterator it6 = set6.iterator();
                    if (it6.hasNext()) {
                        vi0.t(it6.next());
                        throw null;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(t11.l(((wf1) obj2).b().getName(), (String) obj));
        }
    }
}
