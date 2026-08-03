package p343x6;

import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p162l3.C2469w;
import p272s6.EnumC3930a;
import p276sf.C3959f;
import p297u6.C4276c;
import p297u6.C4277d;
import p385zf.C6143b;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: x6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5699c implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23169g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i0.q0.invoke(java.lang.Object):java.lang.Object] */
    public /* synthetic */ C5699c(int i9) {
        this.f23169g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        boolean zEquals;
        Object c3959f;
        boolean z9;
        boolean z10;
        Object c3959f2;
        Object c3959f3;
        String string;
        switch (this.f23169g) {
            case 0:
                String name = ((C4276c) obj2).mo8594a().getName();
                name.getClass();
                zEquals = name.equals((String) obj);
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj;
                try {
                    String name2 = ((C4276c) obj2).mo8594a().getName();
                    name2.getClass();
                    c3959f = (Boolean) interfaceC1231l.invoke(name2);
                    c3959f.getClass();
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Object obj3 = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = obj3;
                }
                return (Boolean) c3959f;
            case 2:
                C4276c c4276c = (C4276c) obj2;
                Set set = (Set) obj;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z9 = true;
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if ((((EnumC3930a) it.next()).f12910g & c4276c.mo8594a().getModifiers()) == 0) {
                            z9 = false;
                        }
                    }
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case 3:
                C4276c c4276c2 = (C4276c) obj2;
                Set set2 = (Set) obj;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z10 = true;
                } else {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if ((((EnumC3930a) it2.next()).f12910g & c4276c2.mo8594a().getModifiers()) != 0) {
                            z10 = false;
                        }
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 4:
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj;
                C4276c c4276c3 = (C4276c) obj2;
                try {
                    C2469w c2469w = EnumC3930a.f12907h;
                    int modifiers = c4276c3.mo8594a().getModifiers();
                    c2469w.getClass();
                    C6143b c6143b = EnumC3930a.f12909j;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : c6143b) {
                        if ((((EnumC3930a) obj4).f12910g & modifiers) != 0) {
                            arrayList.add(obj4);
                        }
                    }
                    c3959f2 = (Boolean) interfaceC1231l2.invoke(AbstractC4166m.m8412U1(arrayList));
                    c3959f2.getClass();
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Object obj5 = Boolean.FALSE;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = obj5;
                }
                return (Boolean) c3959f2;
            case 5:
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) obj;
                try {
                    Type genericReturnType = ((C4277d) obj2).f14193c.getGenericReturnType();
                    genericReturnType.getClass();
                    c3959f3 = (Boolean) interfaceC1231l3.invoke(genericReturnType);
                    c3959f3.getClass();
                    break;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                Object obj6 = Boolean.FALSE;
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = obj6;
                }
                return (Boolean) c3959f3;
            case 6:
                return Boolean.valueOf(((C4276c) obj2).mo8594a().isSynthetic() == ((Boolean) obj).booleanValue());
            case 7:
                return Boolean.valueOf(((C4276c) obj2).mo8594a().isSynthetic() != ((Boolean) obj).booleanValue());
            case 8:
                String str = (String) obj;
                Member memberMo8594a = ((C4276c) obj2).mo8594a();
                if (memberMo8594a instanceof Method) {
                    string = ((Method) memberMo8594a).toGenericString();
                    string.getClass();
                } else if (memberMo8594a instanceof Constructor) {
                    string = ((Constructor) memberMo8594a).toGenericString();
                    string.getClass();
                } else if (memberMo8594a instanceof Field) {
                    string = ((Field) memberMo8594a).toGenericString();
                    string.getClass();
                } else {
                    string = memberMo8594a.toString();
                }
                zEquals = AbstractC1416l.m3825a(string, str);
                break;
            case 9:
                return Boolean.valueOf(((C4277d) obj2).f14193c.isBridge() == ((Boolean) obj).booleanValue());
            case 10:
                return Boolean.valueOf(((C4277d) obj2).f14193c.isBridge() != ((Boolean) obj).booleanValue());
            case 11:
                return Boolean.valueOf(((C4277d) obj2).f14193c.isDefault() == ((Boolean) obj).booleanValue());
            case 12:
                return Boolean.valueOf(((C4277d) obj2).f14193c.isDefault() != ((Boolean) obj).booleanValue());
            default:
                zEquals = AbstractC1416l.m3825a(((C4277d) obj2).f14193c.getDefaultValue(), obj);
                break;
        }
        return Boolean.valueOf(zEquals);
    }
}
