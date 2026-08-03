package com.abc.core.features;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.C0172c;
import p009E0.C0180k;
import p011F0.C0197a;
import p011F0.C0199c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.C0401d;
import p040V0.C0402e;
import p040V0.C0406i;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0621R0 {

    /* JADX INFO: renamed from: a */
    public static final C0621R0 f1913a = new C0621R0();

    /* JADX INFO: renamed from: b */
    public static final C0422g f1914b = new C0422g(".*\\d+(?:\\.\\d+)?\\s*(?:B|KB|MB|GB|TB).*");

    /* JADX INFO: renamed from: c */
    public static final C0422g f1915c = new C0422g(".*\\.(?:docx?|xlsx?|pptx?|pdf|zip|rar|7z|txt|apk|jpg|jpeg|png|gif|mp4|mp3|m4a|wav)(?:\\s|$).*", 0);

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f1916d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f1917e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m1520a(View view, ArrayList arrayList) {
        if (view instanceof TextView) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1520a(childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1521b(String str) {
        return AbstractC0433r.m1028C0(str, "@chatroom") || AbstractC0433r.m1028C0(str, "@im.chatroom");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1522c(String str) {
        String string = str != null ? AbstractC0425j.m1022a1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0 || m1521b(string)) {
            return false;
        }
        if (!AbstractC0433r.m1033H0(string, "wxid_", false)) {
            int length = string.length();
            if (6 > length || length >= 81) {
                return false;
            }
            Pattern patternCompile = Pattern.compile("[a-zA-Z][\\w@.\\-]+");
            AbstractC0307g.m702d(patternCompile, "compile(...)");
            if (!patternCompile.matcher(string).matches()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static String m1523e(Object obj, String... strArr) {
        Object next;
        Object objM116u;
        Object objM116u2;
        for (String str : strArr) {
            C0406i c0406iM861K = AbstractC0358S.m861K(new C0616P0(obj.getClass(), null));
            while (true) {
                if (!c0406iM861K.hasNext()) {
                    next = null;
                    break;
                }
                next = c0406iM861K.next();
                Method method = (Method) next;
                if (AbstractC0307g.m699a(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && AbstractC0307g.m699a(method.getReturnType(), String.class)) {
                        break;
                    }
                }
            }
            Method method2 = (Method) next;
            if (method2 != null) {
                try {
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(obj, null);
                    objM116u = objInvoke instanceof String ? (String) objInvoke : null;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                String str2 = (String) objM116u;
                if (str2 != null) {
                    if (!(!AbstractC0425j.m1013R0(str2))) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        return str2;
                    }
                }
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    objM116u2 = obj2 instanceof String ? (String) obj2 : null;
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                if (objM116u2 instanceof C0140f) {
                    objM116u2 = null;
                }
                String str3 = (String) objM116u2;
                if (str3 != null) {
                    if (!(!AbstractC0425j.m1013R0(str3))) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static C0613O0 m1524f(Object obj) {
        String string;
        Object objInvoke;
        Object objM116u;
        String string2;
        String strM1523e = m1523e(obj, "getTalker", "field_talker", "talker");
        if (strM1523e == null || (string = AbstractC0425j.m1022a1(strM1523e).toString()) == null) {
            return null;
        }
        if (!m1521b(string)) {
            if ((m1522c(string) ? string : null) != null) {
                return new C0613O0(string, string, false);
            }
            return null;
        }
        Method method = (Method) f1917e.computeIfAbsent(obj.getClass(), new C0612O(new C0570A(10), 5));
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
        } else {
            objInvoke = null;
        }
        objM116u = objInvoke instanceof String ? (String) objInvoke : null;
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        String str = (String) objM116u;
        if (m1522c(str)) {
            AbstractC0307g.m700b(str);
            string2 = AbstractC0425j.m1022a1(str).toString();
        } else {
            String strM1523e2 = m1523e(obj, "getSender", "field_sender", "field_sendTalker", "sender");
            if (strM1523e2 == null || (string2 = AbstractC0425j.m1022a1(strM1523e2).toString()) == null || !m1522c(string2)) {
                string2 = null;
            }
        }
        if (string2 == null) {
            String strM1523e3 = m1523e(obj, "getContent", "field_content", "content");
            if (strM1523e3 == null) {
                strM1523e3 = "";
            }
            List listM556h0 = AbstractC0182m.m556h0(":\r\n", ":\n");
            ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(listM556h0, 10));
            Iterator it = listM556h0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(AbstractC0425j.m1011P0(strM1523e3, (String) it.next(), 0, false, 6)));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                int iIntValue = ((Number) obj2).intValue();
                if (1 <= iIntValue && iIntValue < 81) {
                    arrayList2.add(obj2);
                }
            }
            Integer num = (Integer) AbstractC0181l.m547s0(arrayList2);
            if (num != null) {
                String strSubstring = strM1523e3.substring(0, num.intValue());
                AbstractC0307g.m702d(strSubstring, "substring(...)");
                String string3 = AbstractC0425j.m1022a1(strSubstring).toString();
                if (!m1522c(string3)) {
                    string3 = null;
                }
                string2 = string3;
            } else {
                string2 = null;
            }
            if (string2 == null) {
                return null;
            }
        }
        if (m1521b(string2)) {
            return null;
        }
        return new C0613O0(string, string2, true);
    }

    /* JADX INFO: renamed from: d */
    public final TextView m1525d(View view, Object obj) {
        Object objM116u;
        Object tag;
        C0199c c0199c = new C0199c(10);
        c0199c.add(obj);
        Object tag2 = view.getTag();
        if (tag2 != null) {
            c0199c.add(tag2);
        }
        Object next = null;
        try {
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (superclass.equals(Object.class)) {
                    break;
                }
                C0172c c0172cM714c = AbstractC0317q.m714c(superclass.getDeclaredFields());
                while (c0172cM714c.hasNext()) {
                    Field field = (Field) c0172cM714c.next();
                    if (View.class.isAssignableFrom(field.getType())) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        View view2 = obj2 instanceof View ? (View) obj2 : null;
                        if (view2 != null && (tag = view2.getTag()) != null) {
                            c0199c.add(tag);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
        ListIterator listIterator = AbstractC0040p.m103f(c0199c).listIterator(0);
        while (true) {
            C0197a c0197a = (C0197a) listIterator;
            if (!c0197a.hasNext()) {
                ArrayList arrayList = new ArrayList();
                m1520a(view, arrayList);
                C0401d c0401d = new C0401d(new C0402e(new C0402e(new C0402e(new C0402e(new C0180k(2, arrayList), true, new C0619Q0(1, this, C0621R0.class, "isLikelyNickname", "isLikelyNickname(Landroid/widget/TextView;)Z", 0)), false, new C0570A(11)), false, new C0570A(12)), true, new C0570A(13)));
                if (c0401d.hasNext()) {
                    next = c0401d.next();
                    if (c0401d.hasNext()) {
                        int top = ((TextView) next).getTop();
                        do {
                            Object next2 = c0401d.next();
                            int top2 = ((TextView) next2).getTop();
                            if (top > top2) {
                                next = next2;
                                top = top2;
                            }
                        } while (c0401d.hasNext());
                    }
                }
                return (TextView) next;
            }
            Object next3 = c0197a.next();
            Field field2 = (Field) f1916d.computeIfAbsent(next3.getClass(), new C0612O(new C0619Q0(1, this, C0621R0.class, "findNicknameField", "findNicknameField(Ljava/lang/Class;)Ljava/lang/reflect/Field;", 1), 6));
            if (field2 != null) {
                try {
                    field2.setAccessible(true);
                    Object obj3 = field2.get(next3);
                    objM116u = obj3 instanceof TextView ? (TextView) obj3 : null;
                } catch (Throwable th2) {
                    objM116u = AbstractC0040p.m116u(th2);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                TextView textView = (TextView) objM116u;
                if (textView != null) {
                    return textView;
                }
            }
        }
    }
}
