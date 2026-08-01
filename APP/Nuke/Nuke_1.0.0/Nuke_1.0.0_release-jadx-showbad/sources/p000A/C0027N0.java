package p000A;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.dartcv.nuke.BuildConfig;
import p002A1.C0115D;
import p003A2.EnumC0154a;
import p011B4.AbstractC0231b;
import p056K2.C0884j;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p089R2.C1227b;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p227r.EnumC2983d0;

/* JADX INFO: renamed from: A.N0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0027N0 implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f138d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A.O0.<clinit>():void, A.X.h(java.lang.Object):java.lang.Object, E2.d.a(L2.s, z2.c, z2.b):c3.f] */
    public /* synthetic */ C0027N0(int i5) {
        this.f138d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        Object objM3229o;
        Object objM3229o2;
        Object objM3229o3;
        Object objM3229o4;
        boolean z5;
        boolean z6;
        Object objM3229o5;
        String genericString;
        switch (this.f138d) {
            case 0:
                C0029O0 c0029o0 = (C0029O0) obj2;
                return AbstractC0972l.m1987K(new Object[]{Float.valueOf(c0029o0.f142a.m2507g()), Boolean.valueOf(((EnumC2983d0) c0029o0.f147f.getValue()) == EnumC2983d0.f9447d)});
            case BuildConfig.VERSION_CODE /* 1 */:
                Boolean bool = (Boolean) ((InterfaceC1601c) obj).mo1h(((Field) obj2).getType());
                bool.booleanValue();
                return bool;
            case 2:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ((Field) obj2).getGenericType();
                throw null;
            case 3:
                Boolean bool2 = (Boolean) ((InterfaceC1601c) obj).mo1h(((Field) obj2).getGenericType());
                bool2.booleanValue();
                return bool2;
            case 4:
                Set set = (Set) obj;
                List listM2007e0 = AbstractC0972l.m2007e0(((Executable) obj2).getGenericExceptionTypes());
                boolean z7 = false;
                if (set.size() == listM2007e0.size()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        AbstractC0231b.m408s(it.next());
                        throw null;
                    }
                    if (arrayList.size() == listM2007e0.size()) {
                        z7 = true;
                    }
                }
                return Boolean.valueOf(!z7);
            case 5:
                Set set2 = (Set) obj;
                List listM2007e02 = AbstractC0972l.m2007e0(((Executable) obj2).getGenericParameterTypes());
                boolean z8 = false;
                if (set2.size() == listM2007e02.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = set2.iterator();
                    if (it2.hasNext()) {
                        AbstractC0231b.m408s(it2.next());
                        throw null;
                    }
                    if (arrayList2.size() == listM2007e02.size()) {
                        z8 = true;
                    }
                }
                return Boolean.valueOf(z8);
            case 6:
                Set set3 = (Set) obj;
                List listM2007e03 = AbstractC0972l.m2007e0(((Executable) obj2).getGenericParameterTypes());
                boolean z9 = false;
                if (set3.size() == listM2007e03.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = set3.iterator();
                    if (it3.hasNext()) {
                        AbstractC0231b.m408s(it3.next());
                        throw null;
                    }
                    if (arrayList3.size() == listM2007e03.size()) {
                        z9 = true;
                    }
                }
                return Boolean.valueOf(!z9);
            case 7:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() == ((Boolean) obj).booleanValue());
            case 8:
                return Boolean.valueOf(((Executable) obj2).isVarArgs() != ((Boolean) obj).booleanValue());
            case 9:
                try {
                    objM3229o = (Boolean) ((InterfaceC1601c) obj).mo1h(((Method) obj2).getReturnType());
                    objM3229o.getClass();
                    break;
                } catch (Throwable th) {
                    objM3229o = AbstractC1784a.m3229o(th);
                }
                Object obj3 = Boolean.FALSE;
                if (objM3229o instanceof C0884j) {
                    objM3229o = obj3;
                }
                return (Boolean) objM3229o;
            case 10:
                try {
                    objM3229o2 = (Boolean) ((InterfaceC1601c) obj).mo1h(AbstractC0972l.m2007e0(((Executable) obj2).getParameterTypes()));
                    objM3229o2.getClass();
                    break;
                } catch (Throwable th2) {
                    objM3229o2 = AbstractC1784a.m3229o(th2);
                }
                Object obj4 = Boolean.FALSE;
                if (objM3229o2 instanceof C0884j) {
                    objM3229o2 = obj4;
                }
                return (Boolean) objM3229o2;
            case 11:
                return Boolean.valueOf(((Executable) obj2).getParameterCount() == ((Integer) obj).intValue());
            case 12:
                try {
                    objM3229o3 = (Boolean) ((InterfaceC1601c) obj).mo1h(Integer.valueOf(((Executable) obj2).getParameterCount()));
                    objM3229o3.getClass();
                    break;
                } catch (Throwable th3) {
                    objM3229o3 = AbstractC1784a.m3229o(th3);
                }
                Object obj5 = Boolean.FALSE;
                if (objM3229o3 instanceof C0884j) {
                    objM3229o3 = obj5;
                }
                return (Boolean) objM3229o3;
            case 13:
                Set set4 = (Set) obj;
                List listM2007e04 = AbstractC0972l.m2007e0(((Executable) obj2).getTypeParameters());
                boolean z10 = false;
                if (set4.size() == listM2007e04.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = set4.iterator();
                    if (it4.hasNext()) {
                        AbstractC0231b.m408s(it4.next());
                        throw null;
                    }
                    if (arrayList4.size() == listM2007e04.size()) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 14:
                Set set5 = (Set) obj;
                List listM2007e05 = AbstractC0972l.m2007e0(((Executable) obj2).getTypeParameters());
                boolean z11 = false;
                if (set5.size() == listM2007e05.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = set5.iterator();
                    if (it5.hasNext()) {
                        AbstractC0231b.m408s(it5.next());
                        throw null;
                    }
                    if (arrayList5.size() == listM2007e05.size()) {
                        z11 = true;
                    }
                }
                return Boolean.valueOf(!z11);
            case 15:
                Set set6 = (Set) obj;
                List listM2007e06 = AbstractC0972l.m2007e0(((Executable) obj2).getGenericExceptionTypes());
                boolean z12 = false;
                if (set6.size() == listM2007e06.size()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it6 = set6.iterator();
                    if (it6.hasNext()) {
                        AbstractC0231b.m408s(it6.next());
                        throw null;
                    }
                    if (arrayList6.size() == listM2007e06.size()) {
                        z12 = true;
                    }
                }
                return Boolean.valueOf(z12);
            case 16:
                return Boolean.valueOf(AbstractC1665j.m2981a(((Member) obj2).getName(), (String) obj));
            case 17:
                return Boolean.valueOf(((Method) obj2).isBridge() == ((Boolean) obj).booleanValue());
            case 18:
                try {
                    objM3229o4 = (Boolean) ((InterfaceC1601c) obj).mo1h(((Member) obj2).getName());
                    objM3229o4.getClass();
                    break;
                } catch (Throwable th4) {
                    objM3229o4 = AbstractC1784a.m3229o(th4);
                }
                Object obj6 = Boolean.FALSE;
                if (objM3229o4 instanceof C0884j) {
                    objM3229o4 = obj6;
                }
                return (Boolean) objM3229o4;
            case 19:
                Member member = (Member) obj2;
                Set set7 = (Set) obj;
                if ((set7 instanceof Collection) && set7.isEmpty()) {
                    z5 = true;
                } else {
                    Iterator it7 = set7.iterator();
                    while (it7.hasNext()) {
                        if ((((EnumC0154a) it7.next()).f554d & member.getModifiers()) == 0) {
                            z5 = false;
                        }
                    }
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 20:
                Member member2 = (Member) obj2;
                Set set8 = (Set) obj;
                if ((set8 instanceof Collection) && set8.isEmpty()) {
                    z6 = true;
                } else {
                    Iterator it8 = set8.iterator();
                    while (it8.hasNext()) {
                        if ((((EnumC0154a) it8.next()).f554d & member2.getModifiers()) != 0) {
                            z6 = false;
                        }
                    }
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 21:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) obj;
                Member member3 = (Member) obj2;
                try {
                    C0115D c0115d = EnumC0154a.f551e;
                    int modifiers = member3.getModifiers();
                    c0115d.getClass();
                    C1227b c1227b = EnumC0154a.f553g;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj7 : c1227b) {
                        if ((((EnumC0154a) obj7).f554d & modifiers) != 0) {
                            arrayList7.add(obj7);
                        }
                    }
                    objM3229o5 = (Boolean) interfaceC1601c.mo1h(AbstractC0973m.m2028i0(arrayList7));
                    objM3229o5.getClass();
                    break;
                } catch (Throwable th5) {
                    objM3229o5 = AbstractC1784a.m3229o(th5);
                }
                Object obj8 = Boolean.FALSE;
                if (objM3229o5 instanceof C0884j) {
                    objM3229o5 = obj8;
                }
                return (Boolean) objM3229o5;
            case 22:
                return Boolean.valueOf(((Member) obj2).isSynthetic() == ((Boolean) obj).booleanValue());
            case 23:
                return Boolean.valueOf(((Member) obj2).isSynthetic() != ((Boolean) obj).booleanValue());
            case 24:
                String str = (String) obj;
                Member member4 = (Member) obj2;
                if (member4 instanceof Method) {
                    genericString = ((Method) member4).toGenericString();
                } else if (member4 instanceof Constructor) {
                    genericString = ((Constructor) member4).toGenericString();
                } else {
                    if (!(member4 instanceof Field)) {
                        throw new IllegalStateException(("Unsupported member type: " + member4).toString());
                    }
                    genericString = ((Field) member4).toGenericString();
                }
                return Boolean.valueOf(AbstractC1665j.m2981a(genericString, str));
            case 25:
                return Boolean.valueOf(((Method) obj2).isBridge() != ((Boolean) obj).booleanValue());
            case 26:
                return Boolean.valueOf(((Method) obj2).isDefault() == ((Boolean) obj).booleanValue());
            case 27:
                return Boolean.valueOf(((Method) obj2).isDefault() != ((Boolean) obj).booleanValue());
            case 28:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() == ((Boolean) obj).booleanValue());
            default:
                return Boolean.valueOf(((Field) obj2).isEnumConstant() != ((Boolean) obj).booleanValue());
        }
    }
}
