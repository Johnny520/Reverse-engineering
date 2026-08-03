package p230p8;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import gg.AbstractC1416l;
import gg.C1414j;
import gg.C1421q;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p000a.AbstractC0000a;
import p015b0.C0153s;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p100h0.C1529j1;
import p100h0.C1549s0;
import p119i2.C1939m0;
import p190n2.C2865a;
import p190n2.C2884s;
import p236q1.AbstractC3424d;
import p236q1.C3422b;
import p249qg.AbstractC3602u0;
import p276sf.C3967n;
import p321w.C4585b1;
import p321w.C4596f0;
import p321w.C4630q1;
import p321w.EnumC4617m0;
import p347xa.C5753n;

/* JADX INFO: renamed from: p8.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3364p extends C1414j implements InterfaceC1231l {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f10859n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3364p(int i9, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i9, obj, cls, str, str2, i10, i11);
        this.f10859n = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C2865a c2865a;
        EnumC4617m0 enumC4617m0M9043a;
        Integer numValueOf;
        switch (this.f10859n) {
            case 0:
                Method method = (Method) obj;
                method.getClass();
                ((C3365q) this.f4723h).getClass();
                Class<?>[] parameterTypes = method.getParameterTypes();
                boolean z9 = false;
                if (C3365q.m7141a(method) && AbstractC0921a.m2236A(method, false, "com.tencent.mm.plugin.sns.model.") && parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class)) {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case 1:
                Method method2 = (Method) obj;
                method2.getClass();
                ((C3365q) this.f4723h).getClass();
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                boolean z10 = false;
                if (C3365q.m7141a(method2) && parameterTypes2.length == 1 && !parameterTypes2[0].isPrimitive() && !AbstractC1416l.m3825a(parameterTypes2[0], String.class)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                Method method3 = (Method) obj;
                method3.getClass();
                ((C3365q) this.f4723h).getClass();
                Class<?>[] parameterTypes3 = method3.getParameterTypes();
                boolean z11 = false;
                if (C3365q.m7141a(method3) && AbstractC0921a.m2236A(method3, false, "com.tencent.mm.plugin.sns.model.") && parameterTypes3.length == 1 && !parameterTypes3[0].isPrimitive() && !AbstractC1416l.m3825a(parameterTypes3[0], String.class)) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 3:
                Method method4 = (Method) obj;
                method4.getClass();
                return Boolean.valueOf(C3368t.m7143a((C3368t) this.f4723h, method4));
            case 4:
                Method method5 = (Method) obj;
                method5.getClass();
                ((C3368t) this.f4723h).getClass();
                Class<?>[] parameterTypes4 = method5.getParameterTypes();
                boolean z12 = false;
                if (!Modifier.isStatic(method5.getModifiers()) && AbstractC1416l.m3825a(method5.getReturnType(), Boolean.TYPE) && AbstractC0921a.m2236A(method5, false, "com.tencent.mm.plugin.sns.model.") && parameterTypes4.length == 4 && !parameterTypes4[0].isPrimitive() && AbstractC1416l.m3825a(parameterTypes4[1], Integer.TYPE) && !parameterTypes4[2].isPrimitive() && !parameterTypes4[3].isPrimitive()) {
                    z12 = true;
                }
                return Boolean.valueOf(z12);
            case 5:
                Method method6 = (Method) obj;
                method6.getClass();
                return Boolean.valueOf(C3368t.m7143a((C3368t) this.f4723h, method6));
            case 6:
                Method method7 = (Method) obj;
                method7.getClass();
                ((C3368t) this.f4723h).getClass();
                Class<?>[] parameterTypes5 = method7.getParameterTypes();
                boolean z13 = false;
                if (!Modifier.isStatic(method7.getModifiers())) {
                    Class<?> returnType = method7.getReturnType();
                    Class cls = Boolean.TYPE;
                    if (AbstractC1416l.m3825a(returnType, cls) && AbstractC0921a.m2236A(method7, false, "com.tencent.mm.plugin.sns.model.") && parameterTypes5.length == 7 && !parameterTypes5[0].isPrimitive()) {
                        Class<?> cls2 = parameterTypes5[1];
                        Class cls3 = Integer.TYPE;
                        if (AbstractC1416l.m3825a(cls2, cls3) && AbstractC1416l.m3825a(parameterTypes5[2], String.class) && AbstractC1416l.m3825a(parameterTypes5[3], cls) && AbstractC1416l.m3825a(parameterTypes5[4], cls) && AbstractC1416l.m3825a(parameterTypes5[5], cls3) && AbstractC1416l.m3825a(parameterTypes5[6], String.class)) {
                            z13 = true;
                        }
                    }
                }
                return Boolean.valueOf(z13);
            case 7:
                Method method8 = (Method) obj;
                method8.getClass();
                return Boolean.valueOf(C3368t.m7144b((C3368t) this.f4723h, method8));
            case 8:
                Method method9 = (Method) obj;
                method9.getClass();
                return Boolean.valueOf(C3368t.m7144b((C3368t) this.f4723h, method9));
            case 9:
                Method method10 = (Method) obj;
                method10.getClass();
                ((C3368t) this.f4723h).getClass();
                Class<?>[] parameterTypes6 = method10.getParameterTypes();
                boolean z14 = false;
                if (Modifier.isStatic(method10.getModifiers()) && AbstractC1416l.m3825a(method10.getReturnType(), String.class) && AbstractC0921a.m2236A(method10, false, "com.tencent.mm.plugin.sns.model.") && parameterTypes6.length == 1 && !parameterTypes6[0].isPrimitive()) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 10:
                String str = (String) obj;
                str.getClass();
                ((C3351d0) this.f4723h).m7079l(str);
                return C3967n.f12976a;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                ((C3351d0) this.f4723h).m7079l(str2);
                return C3967n.f12976a;
            case 12:
                String str3 = (String) obj;
                str3.getClass();
                ((C3351d0) this.f4723h).m7079l(str3);
                return C3967n.f12976a;
            case 13:
                ((AbstractC3602u0) this.f4723h).mo7496l((Throwable) obj);
                return C3967n.f12976a;
            case 14:
                KeyEvent keyEvent = ((C3422b) obj).f11091a;
                C4585b1 c4585b1 = (C4585b1) this.f4723h;
                C1529j1 c1529j1 = c4585b1.f15106f;
                boolean z15 = c4585b1.f15104d;
                boolean z16 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    c2865a = null;
                } else {
                    C4596f0 c4596f0 = c4585b1.f15109i;
                    c4596f0.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        c4596f0.f15147a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = c4596f0.f15147a;
                        if (num != null) {
                            c4596f0.f15147a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        c2865a = new C2865a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    }
                }
                if (c2865a != null) {
                    if (z15) {
                        c4585b1.m9029a(AbstractC0000a.m99x0(c2865a));
                        c1529j1.f5103a = null;
                    } else {
                        z16 = false;
                    }
                } else if (AbstractC3424d.m7199c(keyEvent) == 2 && (enumC4617m0M9043a = c4585b1.f15110j.m9043a(keyEvent)) != null && (!enumC4617m0M9043a.f15292g || z15)) {
                    C1421q c1421q = new C1421q();
                    c1421q.f4734g = true;
                    C0153s c0153s = new C0153s(enumC4617m0M9043a, c4585b1, c1421q, 24);
                    C2884s c2884s = c4585b1.f15103c;
                    C1549s0 c1549s0 = new C1549s0(c2884s, c4585b1.f15107g, c4585b1.f15101a.m9051d(), c1529j1);
                    c0153s.invoke(c1549s0);
                    if (!C1939m0.m4812b(c1549s0.f5170f, c2884s.f9317b) || !AbstractC1416l.m3825a(c1549s0.f5171g, c2884s.f9316a)) {
                        c4585b1.f15111k.invoke(C2884s.m6290a(c2884s, c1549s0.f5171g, c1549s0.f5170f, 4));
                    }
                    C4630q1 c4630q1 = c4585b1.f15108h;
                    if (c4630q1 != null) {
                        c4630q1.f15356e = true;
                    }
                    z16 = c1421q.f4734g;
                }
                return Boolean.valueOf(z16);
            case 15:
                Method method11 = (Method) obj;
                method11.getClass();
                ((C5753n) this.f4723h).getClass();
                return Boolean.valueOf(C5753n.m10452c(method11));
            case 16:
                Method method12 = (Method) obj;
                method12.getClass();
                ((C5753n) this.f4723h).getClass();
                return Boolean.valueOf(C5753n.m10451b(method12));
            case 17:
                Method method13 = (Method) obj;
                method13.getClass();
                ((C5753n) this.f4723h).getClass();
                return Boolean.valueOf(C5753n.m10451b(method13));
            default:
                Method method14 = (Method) obj;
                method14.getClass();
                ((C5753n) this.f4723h).getClass();
                return Boolean.valueOf(C5753n.m10451b(method14));
        }
    }
}
