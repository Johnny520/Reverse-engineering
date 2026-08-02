package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2435h;

    public /* synthetic */ eg1(int i) {
        this.f2435h = 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12g(Object obj, Object obj2) {
        Object x92Var;
        Object x92Var2;
        String genericString;
        Object x92Var3;
        int i = this.f2435h;
        a83 a83Var = a83.f116a;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 0:
                try {
                    Boolean bool = (Boolean) ((in0) obj).mo5j(((wf1) obj2).mo534b().getName());
                    bool.getClass();
                    x92Var = bool;
                    break;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Boolean bool2 = Boolean.FALSE;
                boolean z3 = x92Var instanceof x92;
                Object obj3 = x92Var;
                if (z3) {
                    obj3 = bool2;
                }
                return (Boolean) obj3;
            case 1:
                wf1 wf1Var = (wf1) obj2;
                Set set = (Set) obj;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if ((((zh1) it.next()).f13910h & wf1Var.mo534b().getModifiers()) != 0) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                wf1 wf1Var2 = (wf1) obj2;
                Set set2 = (Set) obj;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    z2 = true;
                } else {
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if ((((zh1) it2.next()).f13910h & wf1Var2.mo534b().getModifiers()) != 0) {
                        }
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 3:
                in0 in0Var = (in0) obj;
                wf1 wf1Var3 = (wf1) obj2;
                try {
                    j51 j51Var = zh1.f13907i;
                    int modifiers = wf1Var3.mo534b().getModifiers();
                    j51Var.getClass();
                    yf0 yf0Var = zh1.f13909k;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : yf0Var) {
                        if ((((zh1) obj4).f13910h & modifiers) != 0) {
                            arrayList.add(obj4);
                        }
                    }
                    Boolean bool3 = (Boolean) in0Var.mo5j(AbstractC0142du.m1153K0(arrayList));
                    bool3.getClass();
                    x92Var2 = bool3;
                    break;
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                Boolean bool4 = Boolean.FALSE;
                boolean z4 = x92Var2 instanceof x92;
                Object obj5 = x92Var2;
                if (z4) {
                    obj5 = bool4;
                }
                return (Boolean) obj5;
            case 4:
                return Boolean.valueOf(((wf1) obj2).mo534b().isSynthetic() == ((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(((rg1) obj2).f9553c.isBridge() == ((Boolean) obj).booleanValue());
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return Boolean.valueOf(((wf1) obj2).mo534b().isSynthetic() != ((Boolean) obj).booleanValue());
            case 7:
                String str = (String) obj;
                wf1 wf1Var4 = (wf1) obj2;
                Member memberMo534b = wf1Var4.mo534b();
                if (memberMo534b instanceof Method) {
                    Member memberMo534b2 = wf1Var4.mo534b();
                    memberMo534b2.getClass();
                    genericString = ((Method) memberMo534b2).toGenericString();
                } else if (memberMo534b instanceof Constructor) {
                    Member memberMo534b3 = wf1Var4.mo534b();
                    memberMo534b3.getClass();
                    genericString = ((Constructor) memberMo534b3).toGenericString();
                } else {
                    if (!(memberMo534b instanceof Field)) {
                        C0676s.m4652k("Unsupported member type: ", wf1Var4.mo534b());
                        return null;
                    }
                    Member memberMo534b4 = wf1Var4.mo534b();
                    memberMo534b4.getClass();
                    genericString = ((Field) memberMo534b4).toGenericString();
                }
                return Boolean.valueOf(t11.m5086l(genericString, str));
            case 8:
                return Boolean.valueOf(((rg1) obj2).f9553c.isBridge() != ((Boolean) obj).booleanValue());
            case 9:
                return Boolean.valueOf(((rg1) obj2).f9553c.isDefault() == ((Boolean) obj).booleanValue());
            case 10:
                return Boolean.valueOf(((rg1) obj2).f9553c.isDefault() != ((Boolean) obj).booleanValue());
            case 11:
                return Boolean.valueOf(t11.m5086l(((rg1) obj2).f9553c.getDefaultValue(), obj));
            case 12:
                try {
                    Boolean bool5 = (Boolean) ((in0) obj).mo5j(((rg1) obj2).f9553c.getDefaultValue());
                    bool5.booleanValue();
                    x92Var3 = bool5;
                    break;
                } catch (Throwable th3) {
                    x92Var3 = new x92(th3);
                }
                Boolean bool6 = Boolean.FALSE;
                boolean z5 = x92Var3 instanceof x92;
                Object obj6 = x92Var3;
                if (z5) {
                    obj6 = bool6;
                }
                return (Boolean) obj6;
            case 13:
                ((Integer) obj2).getClass();
                rp0.m4522H(pp0.m3902N(1), (InterfaceC0596px) obj);
                return a83Var;
            case 14:
                C0402kw c0402kw = up0.f11393a;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0402kw.mo12g(go0Var, 0);
                } else {
                    go0Var.m1961R();
                }
                return a83Var;
            case 15:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 16:
                dc2 dc2Var = (dc2) obj2;
                Map map = dc2Var.f1985h;
                rk1 rk1Var = dc2Var.f1986i;
                Object[] objArr = rk1Var.f9619b;
                Object[] objArr2 = rk1Var.f9620c;
                long[] jArr = rk1Var.f9618a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj7 = objArr[i5];
                                    Map mapMo977c = ((fc2) objArr2[i5]).mo977c();
                                    if (mapMo977c.isEmpty()) {
                                        map.remove(obj7);
                                    } else {
                                        map.put(obj7, mapMo977c);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 17:
                return obj2;
            case 18:
                C0690sd c0690sd = (C0690sd) obj2;
                return AbstractC0179eu.m1473w(c0690sd.f10051i, bd2.m513a(c0690sd.f10050h, bd2.f792a, (bc2) obj));
            case 19:
                return Integer.valueOf(((gz2) obj2).f3749a);
            case AIChatConfig.MaxContextRounds /* 20 */:
                m03 m03Var = (m03) obj2;
                return AbstractC0179eu.m1473w(Float.valueOf(m03Var.f6427a), Float.valueOf(m03Var.f6428b));
            case 21:
                bc2 bc2Var = (bc2) obj;
                n03 n03Var = (n03) obj2;
                p13 p13Var = new p13(n03Var.f6961a);
                ad2 ad2Var = bd2.f813v;
                return AbstractC0179eu.m1473w(bd2.m513a(p13Var, ad2Var, bc2Var), bd2.m513a(new p13(n03Var.f6962b), ad2Var, bc2Var));
            case 22:
                return Integer.valueOf(((im0) obj2).f4684h);
            case 23:
                eb1 eb1Var = (eb1) obj2;
                return AbstractC0179eu.m1473w(eb1Var.f2379a, bd2.m513a(eb1Var.f2380b, bd2.f800i, (bc2) obj));
            case 24:
                return Float.valueOf(((C0888xj) obj2).f13048a);
            case 25:
                bc2 bc2Var2 = (bc2) obj;
                List list = (List) obj2;
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList2.add(bd2.m513a((C0652rd) list.get(i6), bd2.f793b, bc2Var2));
                }
                return arrayList2;
            case 26:
                f13 f13Var = (f13) obj2;
                return AbstractC0179eu.m1473w(Integer.valueOf((int) (f13Var.f2739a >> 32)), Integer.valueOf((int) (f13Var.f2739a & 4294967295L)));
            case 27:
                bc2 bc2Var3 = (bc2) obj;
                bq2 bq2Var = (bq2) obj2;
                return AbstractC0179eu.m1473w(bd2.m513a(new C0363ju(bq2Var.f986a), bd2.f807p, bc2Var3), bd2.m513a(new rs1(bq2Var.f987b), bd2.f815x, bc2Var3), Float.valueOf(bq2Var.f988c));
            case 28:
                return Integer.valueOf(((ky2) obj2).f5851a);
            default:
                return Integer.valueOf(((jz2) obj2).f5289a);
        }
    }

    public /* synthetic */ eg1(byte b, int i) {
        this.f2435h = i;
    }
}
