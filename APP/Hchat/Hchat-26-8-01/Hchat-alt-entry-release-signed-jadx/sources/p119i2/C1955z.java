package p119i2;

import android.content.Context;
import android.speech.tts.Voice;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import ng.InterfaceC3012j;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p054dg.C0795n;
import p071f1.AbstractC0996c0;
import p071f1.C1024q0;
import p071f1.C1034w;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p117i0.AbstractC1874r;
import p117i0.C1858m2;
import p136j8.C2097h;
import p144k.AbstractC2182j1;
import p144k.AbstractC2183k;
import p144k.C2179i1;
import p144k.C2180j;
import p144k.C2221w1;
import p167l8.C2529d;
import p174m.AbstractC2606h;
import p174m.C2591e;
import p174m.InterfaceC2596f;
import p177m2.AbstractC2772p;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p225p2.C3290b;
import p227p4.C3315t;
import p266s0.C3878h;
import p267s1.C3890d0;
import p276sf.C3959f;
import p276sf.C3967n;
import p280t2.C4085a;
import p280t2.C4088d;
import p280t2.C4089e;
import p280t2.C4093i;
import p280t2.C4095k;
import p280t2.C4096l;
import p280t2.C4097m;
import p280t2.C4100p;
import p280t2.C4101q;
import p280t2.C4102r;
import p280t2.C4103s;
import p293u2.C4245o;
import p293u2.C4246p;
import p293u2.InterfaceC4233c;
import p332wb.C5026jv;
import p339x1.C5610h0;
import p357y1.AbstractC5888h1;
import p357y1.AbstractC5891i0;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: i2.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1955z implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6621g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ac.p.M(android.content.SharedPreferences, java.lang.String, java.lang.String, java.util.List, java.lang.String, fg.p):java.lang.reflect.Method, b0.d0.invoke(java.lang.Object):java.lang.Object, b0.q.e(java.lang.Object, java.lang.Object):java.lang.Object, b9.e.i(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, cb.f.n(boolean):java.lang.reflect.Method, ci.c.invokeSuspend(java.lang.Object):java.lang.Object, ci.j.invokeSuspend(java.lang.Object):java.lang.Object, ea.b.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, i2.d0.<clinit>():void, i2.e0.<clinit>():void, ia.q.b(java.util.List):java.util.List, j8.e.d(java.lang.Object, java.lang.String, long, java.util.List, int):int, j8.h.i(java.lang.Object):j8.i, j8.h.z(long, java.lang.String):boolean, k.w1.<clinit>():void, l8.d.a(l8.d, java.lang.String):java.lang.String, m.a2.<clinit>():void, ng.m.X(ng.j, fg.l):ng.i, ng.m.Y(ng.j, dg.n):dg.j, rb.g.run():void] */
    public /* synthetic */ C1955z(int i9) {
        this.f6621g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9;
        int i10;
        int i11;
        int i12;
        C4103s c4103s;
        long j3;
        Object c3959f;
        Object c3959f2;
        int i13;
        int i14 = this.f6621g;
        C3967n c3967n = C3967n.f12976a;
        z = false;
        boolean z9 = false;
        z = false;
        boolean z10 = false;
        switch (i14) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                C1919c0 c1919c0 = AbstractC1921d0.f6493q;
                Boolean bool = Boolean.FALSE;
                AbstractC1416l.m3825a(obj2, bool);
                C4095k c4095k = obj2 != null ? (C4095k) c1919c0.f6469h.invoke(obj2) : null;
                c4095k.getClass();
                int i15 = c4095k.f13557a;
                Object obj3 = list.get(1);
                C1919c0 c1919c02 = AbstractC1921d0.f6494r;
                AbstractC1416l.m3825a(obj3, bool);
                C4097m c4097m = obj3 != null ? (C4097m) c1919c02.f6469h.invoke(obj3) : null;
                c4097m.getClass();
                int i16 = c4097m.f13562a;
                Object obj4 = list.get(2);
                C4246p[] c4246pArr = C4245o.f13923b;
                C1919c0 c1919c03 = AbstractC1921d0.f6498v;
                AbstractC1416l.m3825a(obj4, bool);
                C4245o c4245o = obj4 != null ? (C4245o) c1919c03.f6469h.invoke(obj4) : null;
                c4245o.getClass();
                long j4 = c4245o.f13925a;
                Object obj5 = list.get(3);
                C4101q c4101q = C4101q.f13567c;
                C4101q c4101q2 = (AbstractC1416l.m3825a(obj5, bool) || obj5 == null) ? null : (C4101q) ((InterfaceC1231l) AbstractC1921d0.f6488l.f10678i).invoke(obj5);
                Object obj6 = list.get(4);
                C1952w c1952w = (AbstractC1416l.m3825a(obj6, bool) || obj6 == null) ? null : (C1952w) ((InterfaceC1231l) AbstractC1923e0.f6507a.f10678i).invoke(obj6);
                Object obj7 = list.get(5);
                C4093i c4093i = C4093i.f13550d;
                C4093i c4093i2 = (AbstractC1416l.m3825a(obj7, bool) || obj7 == null) ? null : (C4093i) ((InterfaceC1231l) AbstractC1921d0.f6473A.f10678i).invoke(obj7);
                Object obj8 = list.get(6);
                C4089e c4089e = (AbstractC1416l.m3825a(obj8, bool) || obj8 == null) ? null : (C4089e) ((InterfaceC1231l) AbstractC1923e0.f6509c.f10678i).invoke(obj8);
                c4089e.getClass();
                int i17 = c4089e.f13543a;
                Object obj9 = list.get(7);
                C1919c0 c1919c04 = AbstractC1921d0.f6495s;
                AbstractC1416l.m3825a(obj9, bool);
                C4088d c4088d = obj9 != null ? (C4088d) c1919c04.f6469h.invoke(obj9) : null;
                c4088d.getClass();
                int i18 = c4088d.f13541a;
                Object obj10 = list.get(8);
                boolean zM3825a = AbstractC1416l.m3825a(obj10, bool);
                C3315t c3315t = AbstractC1923e0.f6510d;
                if (zM3825a || obj10 == null) {
                    i9 = i15;
                    i10 = i18;
                    i11 = i16;
                    i12 = i17;
                    j3 = j4;
                    c4103s = null;
                } else {
                    i9 = i15;
                    i10 = i18;
                    i11 = i16;
                    i12 = i17;
                    c4103s = (C4103s) ((InterfaceC1231l) c3315t.f10678i).invoke(obj10);
                    j3 = j4;
                }
                return new C1950u(i9, i11, j3, c4101q2, c1952w, c4093i2, i12, i10, c4103s);
            case 1:
                obj.getClass();
                List list2 = (List) obj;
                Object obj11 = list2.get(0);
                int i19 = C1034w.f3264h;
                Boolean bool2 = Boolean.FALSE;
                AbstractC1416l.m3825a(obj11, bool2);
                C1034w c1034w = obj11 != null ? obj11.equals(bool2) ? new C1034w(C1034w.f3263g) : new C1034w(AbstractC0996c0.m2507c(((Integer) obj11).intValue())) : null;
                c1034w.getClass();
                long j5 = c1034w.f3265a;
                Object obj12 = list2.get(1);
                C4246p[] c4246pArr2 = C4245o.f13923b;
                InterfaceC1231l interfaceC1231l = AbstractC1921d0.f6498v.f6469h;
                AbstractC1416l.m3825a(obj12, bool2);
                C4245o c4245o2 = obj12 != null ? (C4245o) interfaceC1231l.invoke(obj12) : null;
                c4245o2.getClass();
                long j10 = c4245o2.f13925a;
                Object obj13 = list2.get(2);
                C2767k c2767k = C2767k.f8998h;
                C2767k c2767k2 = (AbstractC1416l.m3825a(obj13, bool2) || obj13 == null) ? null : (C2767k) ((InterfaceC1231l) AbstractC1921d0.f6489m.f10678i).invoke(obj13);
                Object obj14 = list2.get(3);
                C2765i c2765i = (AbstractC1416l.m3825a(obj14, bool2) || obj14 == null) ? null : (C2765i) ((InterfaceC1231l) AbstractC1921d0.f6496t.f10678i).invoke(obj14);
                Object obj15 = list2.get(4);
                C2766j c2766j = (AbstractC1416l.m3825a(obj15, bool2) || obj15 == null) ? null : (C2766j) ((InterfaceC1231l) AbstractC1921d0.f6497u.f10678i).invoke(obj15);
                Object obj16 = list2.get(6);
                String str = obj16 != null ? (String) obj16 : null;
                Object obj17 = list2.get(7);
                AbstractC1416l.m3825a(obj17, bool2);
                C4245o c4245o3 = obj17 != null ? (C4245o) interfaceC1231l.invoke(obj17) : null;
                c4245o3.getClass();
                long j11 = c4245o3.f13925a;
                Object obj18 = list2.get(8);
                C4085a c4085a = (AbstractC1416l.m3825a(obj18, bool2) || obj18 == null) ? null : (C4085a) ((InterfaceC1231l) AbstractC1921d0.f6490n.f10678i).invoke(obj18);
                Object obj19 = list2.get(9);
                C4100p c4100p = (AbstractC1416l.m3825a(obj19, bool2) || obj19 == null) ? null : (C4100p) ((InterfaceC1231l) AbstractC1921d0.f6487k.f10678i).invoke(obj19);
                Object obj20 = list2.get(10);
                C3290b c3290b = C3290b.f10460i;
                C3290b c3290b2 = (AbstractC1416l.m3825a(obj20, bool2) || obj20 == null) ? null : (C3290b) ((InterfaceC1231l) AbstractC1921d0.f6501y.f10678i).invoke(obj20);
                Object obj21 = list2.get(11);
                AbstractC1416l.m3825a(obj21, bool2);
                C1034w c1034w2 = obj21 != null ? obj21.equals(bool2) ? new C1034w(C1034w.f3263g) : new C1034w(AbstractC0996c0.m2507c(((Integer) obj21).intValue())) : null;
                c1034w2.getClass();
                long j12 = c1034w2.f3265a;
                Object obj22 = list2.get(12);
                C4096l c4096l = (AbstractC1416l.m3825a(obj22, bool2) || obj22 == null) ? null : (C4096l) ((InterfaceC1231l) AbstractC1921d0.f6486j.f10678i).invoke(obj22);
                Object obj23 = list2.get(13);
                C1024q0 c1024q0 = C1024q0.f3233d;
                return new C1925f0(j5, j10, c2767k2, c2765i, c2766j, (AbstractC2772p) null, str, j11, c4085a, c4100p, c3290b2, j12, c4096l, (AbstractC1416l.m3825a(obj23, bool2) || obj23 == null) ? null : (C1024q0) ((InterfaceC1231l) AbstractC1921d0.f6491o.f10678i).invoke(obj23), 49184);
            case 2:
                obj.getClass();
                List list3 = (List) obj;
                Object obj24 = list3.get(0);
                Boolean bool3 = obj24 != null ? (Boolean) obj24 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj25 = list3.get(1);
                C1932j c1932j = (AbstractC1416l.m3825a(obj25, Boolean.FALSE) || obj25 == null) ? null : (C1932j) ((InterfaceC1231l) AbstractC1923e0.f6508b.f10678i).invoke(obj25);
                c1932j.getClass();
                return new C1952w(c1932j.f6548a, zBooleanValue);
            case 3:
                obj.getClass();
                return new C1932j(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                return new C4089e(((Integer) obj).intValue());
            case 5:
                obj.getClass();
                List list4 = (List) obj;
                Object obj26 = list4.get(0);
                C4102r c4102r = (AbstractC1416l.m3825a(obj26, Boolean.FALSE) || obj26 == null) ? null : (C4102r) ((InterfaceC1231l) AbstractC1923e0.f6511e.f10678i).invoke(obj26);
                c4102r.getClass();
                int i20 = c4102r.f13570a;
                Object obj27 = list4.get(1);
                Boolean bool4 = obj27 != null ? (Boolean) obj27 : null;
                bool4.getClass();
                return new C4103s(i20, bool4.booleanValue());
            case 6:
                obj.getClass();
                return new C4102r(((Integer) obj).intValue());
            case 7:
                C5026jv c5026jv = (C5026jv) obj;
                c5026jv.getClass();
                return c5026jv.f18249a;
            case 8:
                C1730o c1730o = (C1730o) obj;
                c1730o.getClass();
                return AbstractC4166m.m8415m1(c1730o.m4349q());
            case 9:
                obj.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                String[] strArr = {"getContent", "getMsgContent"};
                for (int i21 = 0; i21 < 2; i21++) {
                    Method methodFindMethod = KavaReflector.findMethod(obj.getClass(), strArr[i21], new Class[0]);
                    if (methodFindMethod != null) {
                        Class<?>[] parameterTypes = methodFindMethod.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length != 0 || !AbstractC1416l.m3825a(methodFindMethod.getReturnType(), String.class)) {
                            methodFindMethod = null;
                        }
                        if (methodFindMethod != null) {
                            Object objInvoke = KavaReflector.invoke(methodFindMethod, obj, new Object[0]);
                            String str2 = objInvoke instanceof String ? (String) objInvoke : null;
                            if (str2 != null) {
                                if (AbstractC3149m.m6721t0(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    linkedHashSet.add(str2);
                                }
                            }
                        }
                    }
                }
                String[] strArr2 = {"field_content", "content", "msgContent"};
                for (int i22 = 0; i22 < 3; i22++) {
                    Object field = KavaReflector.readField(obj, strArr2[i22]);
                    String str3 = field instanceof String ? (String) field : null;
                    if (str3 != null) {
                        if (AbstractC3149m.m6721t0(str3)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            linkedHashSet.add(str3);
                        }
                    }
                }
                return new C0795n(AbstractC4166m.m8407P1(linkedHashSet), 6);
            case 10:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                String str4 = (String) ((C3143g) ((C3145i) interfaceC3142f).m6676a()).get(2);
                if (str4 != null && !AbstractC3149m.m6721t0(str4)) {
                    String strM5229h = C2097h.m5229h(str4);
                    if (!AbstractC3149m.m6721t0(strM5229h)) {
                        return AbstractC3149m.m6701P0(Opcodes.IF_ICMPNE, strM5229h);
                    }
                }
                return HttpUrl.FRAGMENT_ENCODE_SET;
            case 11:
                ((String) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r0));
            case 12:
                Method method = (Method) obj;
                method.getClass();
                String genericString = method.toGenericString();
                genericString.getClass();
                return genericString;
            case 13:
                ((C5610h0) obj).m10064e();
                return c3967n;
            case 14:
                return c3967n;
            case 15:
                ((Long) obj).getClass();
                return c3967n;
            case 16:
                C3878h c3878h = (C3878h) obj;
                int i23 = AbstractC2183k.f7261a;
                C1858m2 c1858m2 = AbstractC5891i0.f23946b;
                c3878h.getClass();
                Context context = (Context) AbstractC1874r.m4640v(c3878h, c1858m2);
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) AbstractC1874r.m4640v(c3878h, AbstractC5888h1.f23926h);
                C2179i1 c2179i1 = (C2179i1) AbstractC1874r.m4640v(c3878h, AbstractC2182j1.f7260a);
                if (c2179i1 == null) {
                    return null;
                }
                return new C2180j(context, interfaceC4233c, c2179i1.f7253a, c2179i1.f7254b);
            case 17:
                return new C2221w1(((Integer) obj).intValue());
            case 18:
                Method method2 = (Method) obj;
                method2.getClass();
                String genericString2 = method2.toGenericString();
                genericString2.getClass();
                return genericString2;
            case 19:
                Field field2 = (Field) obj;
                field2.getClass();
                if (AbstractC1416l.m3825a(field2.getType(), Integer.TYPE) && !KavaReflector.isStatic(field2)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 20:
                InterfaceC3142f interfaceC3142f2 = (InterfaceC3142f) obj;
                interfaceC3142f2.getClass();
                C3145i c3145i = (C3145i) interfaceC3142f2;
                String str5 = (String) ((C3143g) c3145i.m6676a()).get(1);
                C2529d c2529d = WeChatMessage.Companion;
                try {
                    if (AbstractC3156t.m6740d0(str5, "x", true)) {
                        String strSubstring = str5.substring(1);
                        AbstractC0000a.m96w(16);
                        i13 = Integer.parseInt(strSubstring, 16);
                    } else {
                        i13 = Integer.parseInt(str5);
                    }
                    c3959f = Integer.valueOf(i13);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Integer num = (Integer) (c3959f instanceof C3959f ? null : c3959f);
                if (num == null) {
                    return c3145i.m6678c();
                }
                C2529d c2529d2 = WeChatMessage.Companion;
                try {
                    char[] chars = Character.toChars(num.intValue());
                    chars.getClass();
                    c3959f2 = new String(chars);
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                String strM6678c = c3145i.m6678c();
                boolean z11 = c3959f2 instanceof C3959f;
                Object obj28 = c3959f2;
                if (z11) {
                    obj28 = strM6678c;
                }
                return (CharSequence) obj28;
            case 21:
                WeChatMessage weChatMessage = (WeChatMessage) obj;
                weChatMessage.getClass();
                String str6 = weChatMessage.imagePath;
                String str7 = !AbstractC3149m.m6721t0(str6) ? str6 : null;
                if (str7 != null) {
                    return str7;
                }
                String strBodyContent = weChatMessage.bodyContent();
                List listM6691F0 = AbstractC3149m.m6691F0(AbstractC3149m.m6706U0(strBodyContent, '\n', '\r'), new char[]{':'}, 6);
                if (listM6691F0.size() >= 3 && AbstractC3149m.m6718q0(strBodyContent, '<', 0, 6) < 0) {
                    return AbstractC3149m.m6703R0(listM6691F0.size() == 4 ? (String) listM6691F0.get(1) : (String) listM6691F0.get(0)).toString();
                }
                WeChatMessage.Companion.getClass();
                String strM5947m = C2529d.m5947m(strBodyContent, "filename");
                if (AbstractC3149m.m6721t0(strM5947m)) {
                    strM5947m = C2529d.m5947m(strBodyContent, "voiceurl");
                }
                String str8 = strM5947m;
                return AbstractC3149m.m6721t0(str8) ? C2529d.m5949o(strBodyContent, "filename") : str8;
            case 22:
                C3878h c3878h2 = (C3878h) obj;
                C1858m2 c1858m22 = AbstractC5891i0.f23946b;
                c3878h2.getClass();
                if (((Context) AbstractC1874r.m4640v(c3878h2, c1858m22)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC2606h.f8447b;
                }
                InterfaceC2596f.f8409a.getClass();
                return C2591e.f8393c;
            case 23:
                return Boolean.TRUE;
            case 24:
                C3890d0 c3890d0 = (C3890d0) obj;
                if (c3890d0 != null && c3890d0.f12762a == 2) {
                    z9 = true;
                }
                return Boolean.valueOf(!z9);
            case 25:
                Method method3 = (Method) obj;
                method3.getClass();
                String genericString3 = method3.toGenericString();
                genericString3.getClass();
                return genericString3;
            case 26:
                ((Voice) obj).getName().getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r0));
            case 27:
                return ((Voice) obj).getName();
            case 28:
                InterfaceC3012j interfaceC3012j = (InterfaceC3012j) obj;
                interfaceC3012j.getClass();
                return interfaceC3012j.iterator();
            default:
                return Boolean.valueOf(obj == null);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [c9.w.run():void, j8.h.i(java.lang.Object):j8.i] */
    public /* synthetic */ C1955z(Object obj, int i9) {
        this.f6621g = i9;
    }
}
