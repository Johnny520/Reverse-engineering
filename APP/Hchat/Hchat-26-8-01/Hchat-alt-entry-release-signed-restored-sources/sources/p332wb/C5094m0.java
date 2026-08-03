package p332wb;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p249qg.AbstractC3591p;
import p276sf.C3959f;
import p276sf.C3967n;
import p297u6.C4274a;
import p297u6.C4275b;
import p297u6.C4277d;
import p348xb.C5763i;
import tf.AbstractC4165l;
import wf.C5556b;
import wf.C5558d;
import wf.C5562h;
import wf.InterfaceC5559e;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: wb.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5094m0 implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18827g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [f8.i.q0(wf.e, wf.g):wf.g] */
    public /* synthetic */ C5094m0(int i9) {
        this.f18827g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C5556b c5556b;
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4;
        switch (this.f18827g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9657s0("该规则已不存在", c1836h0, 6);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 1:
                C1836h0 c1836h02 = (C1836h0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("正在载入标签...", c1836h02, 6);
                } else {
                    c1836h02.m4519V();
                }
                return C3967n.f12976a;
            case 2:
                C1836h0 c1836h03 = (C1836h0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c1836h03.m4516S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("暂无关键词，点击底部“添加关键词”。", c1836h03, 6);
                } else {
                    c1836h03.m4519V();
                }
                return C3967n.f12976a;
            case 3:
                C1836h0 c1836h04 = (C1836h0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c1836h04.m4516S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配结果", c1836h04, 6);
                } else {
                    c1836h04.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                C1836h0 c1836h05 = (C1836h0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c1836h05.m4516S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC4955ho.m9657s0("没有匹配标签", c1836h05, 6);
                } else {
                    c1836h05.m4519V();
                }
                return C3967n.f12976a;
            case 5:
                C1836h0 c1836h06 = (C1836h0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c1836h06.m4516S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC4955ho.m9296B1("生效范围", "微信和小程序定位", null, c1836h06, 54, 4);
                } else {
                    c1836h06.m4519V();
                }
                return C3967n.f12976a;
            case 6:
                ((C5763i) obj).getClass();
                return C3967n.f12976a;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9422R((C1836h0) obj, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9494a((C1836h0) obj, AbstractC1874r.m4617C(1));
                return C3967n.f12976a;
            case 9:
                String str = (String) obj;
                InterfaceC5559e interfaceC5559e = (InterfaceC5559e) obj2;
                str.getClass();
                interfaceC5559e.getClass();
                if (str.length() == 0) {
                    return interfaceC5559e.toString();
                }
                return str + ", " + interfaceC5559e;
            case 10:
                InterfaceC5561g interfaceC5561g = (InterfaceC5561g) obj;
                InterfaceC5559e interfaceC5559e2 = (InterfaceC5559e) obj2;
                interfaceC5561g.getClass();
                interfaceC5559e2.getClass();
                InterfaceC5561g interfaceC5561gMo2063t = interfaceC5561g.mo2063t(interfaceC5559e2.getKey());
                C5562h c5562h = C5562h.f22661g;
                if (interfaceC5561gMo2063t == c5562h) {
                    return interfaceC5559e2;
                }
                C5558d c5558d = C5558d.f22660g;
                AbstractC3591p abstractC3591p = (AbstractC3591p) interfaceC5561gMo2063t.mo2062s(c5558d);
                if (abstractC3591p == null) {
                    c5556b = new C5556b(interfaceC5559e2, interfaceC5561gMo2063t);
                } else {
                    InterfaceC5561g interfaceC5561gMo2063t2 = interfaceC5561gMo2063t.mo2063t(c5558d);
                    if (interfaceC5561gMo2063t2 == c5562h) {
                        return new C5556b(abstractC3591p, interfaceC5559e2);
                    }
                    c5556b = new C5556b(abstractC3591p, new C5556b(interfaceC5559e2, interfaceC5561gMo2063t2));
                }
                return c5556b;
            case 11:
                try {
                    Boolean bool = (Boolean) ((InterfaceC1231l) obj).invoke(((C4277d) obj2).f14193c.getDefaultValue());
                    bool.booleanValue();
                    c3959f = bool;
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Boolean bool2 = Boolean.FALSE;
                boolean z9 = c3959f instanceof C3959f;
                Object obj3 = c3959f;
                if (z9) {
                    obj3 = bool2;
                }
                return (Boolean) obj3;
            case 12:
                return Boolean.valueOf(((C4275b) obj2).f14190c.isEnumConstant() == ((Boolean) obj).booleanValue());
            case 13:
                return Boolean.valueOf(((C4275b) obj2).f14190c.isEnumConstant() != ((Boolean) obj).booleanValue());
            case 14:
                Class<?> type = ((C4275b) obj2).f14190c.getType();
                type.getClass();
                Boolean bool3 = (Boolean) ((InterfaceC1231l) obj).invoke(type);
                bool3.getClass();
                return bool3;
            case 15:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((C4275b) obj2).f14190c.getGenericType().getClass();
                throw null;
            case 16:
                Type genericType = ((C4275b) obj2).f14190c.getGenericType();
                genericType.getClass();
                Boolean bool4 = (Boolean) ((InterfaceC1231l) obj).invoke(genericType);
                bool4.getClass();
                return bool4;
            case 17:
                Set set = (Set) obj;
                Type[] genericExceptionTypes = ((C4274a) obj2).f14188c.getGenericExceptionTypes();
                genericExceptionTypes.getClass();
                List listM8375L0 = AbstractC4165l.m8375L0(genericExceptionTypes);
                boolean z10 = false;
                if (set.size() == listM8375L0.size()) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        AbstractC4855en.m9270n(it.next());
                        throw null;
                    }
                    z10 = true;
                }
                return Boolean.valueOf(!z10);
            case 18:
                Set set2 = (Set) obj;
                Type[] genericParameterTypes = ((C4274a) obj2).f14188c.getGenericParameterTypes();
                genericParameterTypes.getClass();
                List listM8375L02 = AbstractC4165l.m8375L0(genericParameterTypes);
                boolean z11 = false;
                if (set2.size() == listM8375L02.size()) {
                    Iterator it2 = set2.iterator();
                    if (it2.hasNext()) {
                        AbstractC4855en.m9270n(it2.next());
                        throw null;
                    }
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 19:
                Set set3 = (Set) obj;
                Type[] genericParameterTypes2 = ((C4274a) obj2).f14188c.getGenericParameterTypes();
                genericParameterTypes2.getClass();
                List listM8375L03 = AbstractC4165l.m8375L0(genericParameterTypes2);
                boolean z12 = false;
                if (set3.size() == listM8375L03.size()) {
                    Iterator it3 = set3.iterator();
                    if (it3.hasNext()) {
                        AbstractC4855en.m9270n(it3.next());
                        throw null;
                    }
                    z12 = true;
                }
                return Boolean.valueOf(!z12);
            case 20:
                return Boolean.valueOf(((C4274a) obj2).f14188c.isVarArgs() == ((Boolean) obj).booleanValue());
            case 21:
                return Boolean.valueOf(((C4274a) obj2).f14188c.isVarArgs() != ((Boolean) obj).booleanValue());
            case 22:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj;
                try {
                    Class<?> returnType = ((C4277d) obj2).f14193c.getReturnType();
                    returnType.getClass();
                    c3959f2 = (Boolean) interfaceC1231l.invoke(returnType);
                    c3959f2.getClass();
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Object obj4 = Boolean.FALSE;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = obj4;
                }
                return (Boolean) c3959f2;
            case 23:
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj;
                try {
                    Class<?>[] parameterTypes = ((C4274a) obj2).f14188c.getParameterTypes();
                    parameterTypes.getClass();
                    c3959f3 = (Boolean) interfaceC1231l2.invoke(AbstractC4165l.m8375L0(parameterTypes));
                    c3959f3.getClass();
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                Object obj5 = Boolean.FALSE;
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = obj5;
                }
                return (Boolean) c3959f3;
            case 24:
                return Boolean.valueOf(((C4274a) obj2).f14188c.getParameterCount() == ((Integer) obj).intValue());
            case 25:
                try {
                    Boolean bool5 = (Boolean) ((InterfaceC1231l) obj).invoke(Integer.valueOf(((C4274a) obj2).f14188c.getParameterCount()));
                    bool5.booleanValue();
                    c3959f4 = bool5;
                    break;
                } catch (Throwable th5) {
                    c3959f4 = new C3959f(th5);
                }
                Boolean bool6 = Boolean.FALSE;
                boolean z13 = c3959f4 instanceof C3959f;
                Object obj6 = c3959f4;
                if (z13) {
                    obj6 = bool6;
                }
                return (Boolean) obj6;
            case 26:
                Set set4 = (Set) obj;
                TypeVariable<?>[] typeParameters = ((C4274a) obj2).f14188c.getTypeParameters();
                typeParameters.getClass();
                List listM8375L04 = AbstractC4165l.m8375L0(typeParameters);
                boolean z14 = false;
                if (set4.size() == listM8375L04.size()) {
                    Iterator it4 = set4.iterator();
                    if (it4.hasNext()) {
                        AbstractC4855en.m9270n(it4.next());
                        throw null;
                    }
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 27:
                Set set5 = (Set) obj;
                TypeVariable<?>[] typeParameters2 = ((C4274a) obj2).f14188c.getTypeParameters();
                typeParameters2.getClass();
                List listM8375L05 = AbstractC4165l.m8375L0(typeParameters2);
                boolean z15 = false;
                if (set5.size() == listM8375L05.size()) {
                    Iterator it5 = set5.iterator();
                    if (it5.hasNext()) {
                        AbstractC4855en.m9270n(it5.next());
                        throw null;
                    }
                    z15 = true;
                }
                return Boolean.valueOf(!z15);
            case 28:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((C4277d) obj2).f14193c.getGenericReturnType().getClass();
                throw null;
            default:
                Set set6 = (Set) obj;
                Type[] genericExceptionTypes2 = ((C4274a) obj2).f14188c.getGenericExceptionTypes();
                genericExceptionTypes2.getClass();
                List listM8375L06 = AbstractC4165l.m8375L0(genericExceptionTypes2);
                boolean z16 = false;
                if (set6.size() == listM8375L06.size()) {
                    Iterator it6 = set6.iterator();
                    if (it6.hasNext()) {
                        AbstractC4855en.m9270n(it6.next());
                        throw null;
                    }
                    z16 = true;
                }
                return Boolean.valueOf(z16);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [wb.ho.R(i0.h0, int):void, wb.ho.a(i0.h0, int):void] */
    public /* synthetic */ C5094m0(int i9, int i10) {
        this.f18827g = i10;
    }
}
