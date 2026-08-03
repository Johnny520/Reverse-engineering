package com.abc.core.features;

import android.content.ContentValues;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.abc.ui.FloatingBottomTabView;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0139e;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p040V0.C0406i;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0570A implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1691a;

    public /* synthetic */ C0570A(int i2) {
        this.f1691a = i2;
    }

    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        Context context;
        Object next;
        Object next2;
        Object next3;
        switch (this.f1691a) {
            case 0:
                C0760b c0760b = (C0760b) obj;
                AbstractC0307g.m703e(c0760b, "param");
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                Number number = objM537n0 instanceof Number ? (Number) objM537n0 : null;
                Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    C0588G.f1775h = true;
                    C0588G.f1774g = true;
                } else if (numValueOf != null && numValueOf.intValue() == 2) {
                    C0588G.f1774g = C0588G.f1775h;
                } else {
                    C0588G.f1774g = false;
                    C0588G.f1775h = false;
                }
                return C0146l.f339a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                C0588G c0588g = C0588G.f1768a;
                C0588G.m1432s(iIntValue);
                return C0146l.f339a;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                C0588G c0588g2 = C0588G.f1768a;
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (iIntValue2 == 0 && C0588G.f1773f != null && jUptimeMillis - C0588G.f1776i <= 300) {
                    FloatingBottomTabView floatingBottomTabView = C0588G.f1770c;
                    if (floatingBottomTabView != null && (context = floatingBottomTabView.getContext()) != null) {
                        View view = new View(context);
                        view.setTag(0);
                        try {
                            View.OnClickListener onClickListener = C0588G.f1773f;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                            }
                            View.OnClickListener onClickListener2 = C0588G.f1773f;
                            if (onClickListener2 != null) {
                                onClickListener2.onClick(view);
                            }
                        } catch (Throwable th) {
                            AbstractC0040p.m116u(th);
                        }
                        C0588G.f1776i = jUptimeMillis;
                    }
                    break;
                } else {
                    C0588G.m1432s(iIntValue2);
                    C0588G.f1776i = iIntValue2 == 0 ? jUptimeMillis : 0L;
                }
                return C0146l.f339a;
            case 3:
                int iIntValue3 = ((Integer) obj).intValue();
                C0588G c0588g3 = C0588G.f1768a;
                C0588G.f1778k = iIntValue3 >= 0 ? iIntValue3 : 0;
                C0588G.m1416c();
                return C0146l.f339a;
            case 4:
                View view2 = (View) obj;
                AbstractC0307g.m703e(view2, "view");
                C0422g c0422g = AbstractC0600K.f1833a;
                return Boolean.valueOf(AbstractC0425j.m1005J0(view2.getClass().getName(), "MMNeat7extView", false));
            case 5:
                View view3 = (View) obj;
                AbstractC0307g.m703e(view3, "view");
                String name = view3.getClass().getName();
                if (!AbstractC0425j.m1005J0(name, "RTChattingEmojiView", false) && !AbstractC0425j.m1005J0(name, "RTChattingEmoji", false)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                Class cls = (Class) obj;
                AbstractC0307g.m703e(cls, "clazz");
                MessageEditHook messageEditHook = MessageEditHook.f2116a;
                C0406i c0406iM861K = AbstractC0358S.m861K(new C0669k0(cls, null));
                while (true) {
                    if (c0406iM861K.hasNext()) {
                        next = c0406iM861K.next();
                        Class<?> type = ((Field) next).getType();
                        AbstractC0307g.m702d(type, "getType(...)");
                        if (AbstractC0433r.m1033H0(type.getName(), "com.tencent.mm.storage.", false)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Field field = (Field) next;
                if (field == null) {
                    return null;
                }
                field.setAccessible(true);
                return field;
            case 7:
                Class cls2 = (Class) obj;
                AbstractC0307g.m703e(cls2, "it");
                Method[] methods = cls2.getMethods();
                AbstractC0307g.m702d(methods, "getMethods(...)");
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Method method = methods[i2];
                        if (!AbstractC0307g.m699a(method.getName(), "update") || method.getParameterTypes().length < 4 || !AbstractC0307g.m699a(method.getParameterTypes()[0], String.class) || !ContentValues.class.isAssignableFrom(method.getParameterTypes()[1])) {
                            i2++;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 8:
                Class cls3 = (Class) obj;
                AbstractC0307g.m703e(cls3, "clazz");
                MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                C0406i c0406iM861K2 = AbstractC0358S.m861K(new C0672l0(cls3, null));
                while (true) {
                    if (c0406iM861K2.hasNext()) {
                        next2 = c0406iM861K2.next();
                        Method method2 = (Method) next2;
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            Class<?> returnType = method2.getReturnType();
                            AbstractC0307g.m702d(returnType, "getReturnType(...)");
                            if (AbstractC0433r.m1033H0(returnType.getName(), "com.tencent.mm.storage.", false)) {
                            }
                        }
                    } else {
                        next2 = null;
                    }
                }
                Method method3 = (Method) next2;
                if (method3 == null) {
                    return null;
                }
                method3.setAccessible(true);
                return method3;
            case 9:
                EnumC0583E0 enumC0583E0 = (EnumC0583E0) obj;
                AbstractC0307g.m703e(enumC0583E0, "it");
                return enumC0583E0.f1756a;
            case 10:
                Class cls4 = (Class) obj;
                AbstractC0307g.m703e(cls4, "clazz");
                C0621R0 c0621r0 = C0621R0.f1913a;
                C0406i c0406iM861K3 = AbstractC0358S.m861K(new C0616P0(cls4, null));
                while (true) {
                    if (c0406iM861K3.hasNext()) {
                        next3 = c0406iM861K3.next();
                        Method method4 = (Method) next3;
                        Class<?>[] parameterTypes2 = method4.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
                        if (parameterTypes2.length != 0 || !AbstractC0307g.m699a(method4.getReturnType(), String.class) || !AbstractC0040p.m92W("R1", "P1", "o0", "x0", "j0", "getSender", "getSendTalker").contains(method4.getName())) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                Method method5 = (Method) next3;
                if (method5 == null) {
                    return null;
                }
                method5.setAccessible(true);
                return method5;
            case 11:
                TextView textView = (TextView) obj;
                AbstractC0307g.m703e(textView, "it");
                String string = textView.getText().toString();
                Pattern patternCompile = Pattern.compile(".*\\d{1,2}:\\d{2}.*");
                AbstractC0307g.m702d(patternCompile, "compile(...)");
                AbstractC0307g.m703e(string, "input");
                return Boolean.valueOf(patternCompile.matcher(string).matches());
            case 12:
                TextView textView2 = (TextView) obj;
                AbstractC0307g.m703e(textView2, "it");
                if (!AbstractC0425j.m1005J0(textView2.getText().toString(), "小时前", false) && !AbstractC0425j.m1005J0(textView2.getText().toString(), "分钟前", false)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                TextView textView3 = (TextView) obj;
                AbstractC0307g.m703e(textView3, "it");
                return Boolean.valueOf(textView3.getText().length() <= 80);
            case 14:
                Field field2 = (Field) obj;
                AbstractC0307g.m703e(field2, "it");
                return Boolean.valueOf(Modifier.isStatic(field2.getModifiers()));
            case 15:
                Field field3 = (Field) obj;
                AbstractC0307g.m703e(field3, "it");
                return Boolean.valueOf(Modifier.isStatic(field3.getModifiers()));
            case 16:
                Field field4 = (Field) obj;
                AbstractC0307g.m703e(field4, "it");
                return Boolean.valueOf(Modifier.isStatic(field4.getModifiers()));
            case 17:
                String str = (String) obj;
                AbstractC0307g.m703e(str, "it");
                return AbstractC0425j.m1022a1(str).toString();
            case 18:
                String str2 = (String) obj;
                AbstractC0307g.m703e(str2, "it");
                return Boolean.valueOf(str2.length() > 0 && !AbstractC0433r.m1033H0(str2, "#", false) && AbstractC0425j.m1006K0(str2, '='));
            case 19:
                String str3 = (String) obj;
                AbstractC0307g.m703e(str3, "it");
                int iM1010O0 = AbstractC0425j.m1010O0(str3, '=', 0, false, 6);
                String strSubstring = str3.substring(0, iM1010O0);
                AbstractC0307g.m702d(strSubstring, "substring(...)");
                String string2 = AbstractC0425j.m1022a1(strSubstring).toString();
                String strSubstring2 = str3.substring(iM1010O0 + 1);
                AbstractC0307g.m702d(strSubstring2, "substring(...)");
                return new C0139e(string2, AbstractC0425j.m1022a1(strSubstring2).toString());
            case 20:
                AbstractC0307g.m703e((C0139e) obj, "<destruct>");
                return Boolean.valueOf(!AbstractC0307g.m699a((String) r0.f328a, "updated"));
            case 21:
                Method method6 = (Method) obj;
                AbstractC0307g.m703e(method6, "it");
                String name2 = method6.getName();
                AbstractC0307g.m702d(name2, "getName(...)");
                return name2;
            case 22:
                return Boolean.valueOf(((WeakReference) obj).get() == null);
            case 23:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0307g.m703e(entry, "<destruct>");
                Object key = entry.getKey();
                AbstractC0307g.m702d(key, "component1(...)");
                Object value = entry.getValue();
                AbstractC0307g.m702d(value, "component2(...)");
                return "\"" + AbstractC0433r.m1031F0((String) key, "\"", "", false) + "\":\"" + AbstractC0433r.m1031F0((String) value, "\"", "", false) + "\"";
            case 24:
                AbstractC0307g.m703e((String) obj, "it");
                return new CopyOnWriteArrayList();
            case 25:
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            case 26:
                String str4 = (String) obj;
                AbstractC0307g.m703e(str4, "it");
                return AbstractC0425j.m1022a1(str4).toString();
            case 27:
                String str5 = (String) obj;
                AbstractC0307g.m703e(str5, "it");
                return Boolean.valueOf(AbstractC0425j.m1006K0(str5, '='));
            case 28:
                String str6 = (String) obj;
                AbstractC0307g.m703e(str6, "it");
                return AbstractC0425j.m1022a1(str6).toString();
            default:
                String str7 = (String) obj;
                AbstractC0307g.m703e(str7, "it");
                return Boolean.valueOf(str7.length() > 0 && !AbstractC0433r.m1033H0(str7, "#", false) && AbstractC0425j.m1006K0(str7, '='));
        }
    }
}
