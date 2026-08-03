package com.abc.core.features;

import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0647d extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2011c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2012d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Serializable f2013e;

    public C0647d(Class cls) {
        this.f2010b = 3;
        AvatarHook avatarHook = AvatarHook.f2217a;
        this.f2012d = cls;
        this.f2011c = avatarHook;
        this.f2013e = "u.a";
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public final void mo1386b(C0760b c0760b) {
        WeakReference weakReference;
        TextView textView;
        Object obj;
        WeakReference weakReference2;
        TextView textView2;
        String strM1734y;
        Method method;
        switch (this.f2010b) {
            case 0:
                ((MomentsCommentProtectHook) this.f2012d).getClass();
                if (MomentsCommentProtectHook.m1649j()) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    String string = objM537n0 != null ? objM537n0.toString() : null;
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(1, objArr2);
                    String string2 = objM537n02 != null ? objM537n02.toString() : null;
                    if (!AbstractC0433r.m1029D0(string, "SnsComment", true) && string != null && AbstractC0425j.m1005J0(string, "SnsComment", true)) {
                        string2 = string;
                        string = null;
                    }
                    if ((!AbstractC0433r.m1029D0(string, "SnsComment", true) || !AbstractC0358S.m855E(string2)) && ((string != null && !AbstractC0425j.m1013R0(string)) || !AbstractC0358S.m855E(string2))) {
                        if (string2 == null) {
                            string2 = "";
                        }
                        if (!AbstractC0425j.m1005J0(string2, "delete from SnsComment", true)) {
                        }
                    }
                    Method method2 = (Method) this.f2011c;
                    Class<?> returnType = method2.getReturnType();
                    Class cls = Boolean.TYPE;
                    if (AbstractC0307g.m699a(returnType, cls) || AbstractC0307g.m699a(method2.getReturnType(), cls)) {
                        c0760b.m1946c(Boolean.TRUE);
                    } else {
                        c0760b.m1946c(null);
                    }
                    MomentsCommentProtectHook.m1657r("BLOCKED execSQL via " + ((String) this.f2013e));
                    break;
                }
                break;
            case 1:
                ((MessageEditHook) this.f2012d).getClass();
                if (MessageEditHook.m1725p()) {
                    Object obj2 = c0760b.f2669b;
                    MenuItem menuItem = obj2 instanceof MenuItem ? (MenuItem) obj2 : null;
                    if (menuItem != null && menuItem.getItemId() == 1212368196 && (weakReference = MessageEditHook.f2131p) != null && (textView = (TextView) weakReference.get()) != null) {
                        ((MessageEditHook) this.f2012d).getClass();
                        if (MessageEditHook.m1723n(textView)) {
                            ((MessageEditHook) this.f2012d).getClass();
                            MessageEditHook.m1709A(textView);
                            c0760b.m1946c(Boolean.TRUE);
                            MessageEditHook messageEditHook = (MessageEditHook) this.f2012d;
                            String str = "edit menu item dispatched via " + ((Class) this.f2013e).getName() + "." + ((Method) this.f2011c).getName();
                            messageEditHook.getClass();
                            MessageEditHook.m1711C(str);
                            break;
                        }
                    }
                }
                break;
            case 2:
                ((MessageEditHook) this.f2012d).getClass();
                if (MessageEditHook.m1725p()) {
                    Object[] objArr3 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr3, "args");
                    int length = objArr3.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            obj = objArr3[i2];
                            if (!(obj instanceof MenuItem)) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    MenuItem menuItem2 = obj instanceof MenuItem ? (MenuItem) obj : null;
                    if (menuItem2 != null && menuItem2.getItemId() == 1212368196 && (weakReference2 = MessageEditHook.f2131p) != null && (textView2 = (TextView) weakReference2.get()) != null) {
                        ((MessageEditHook) this.f2012d).getClass();
                        if (MessageEditHook.m1723n(textView2)) {
                            C0666j0 c0666j0 = MessageEditHook.f2130o;
                            ((MessageEditHook) this.f2012d).getClass();
                            if (MessageEditHook.m1724o(c0666j0)) {
                                MessageEditHook.f2131p = new WeakReference(textView2);
                                MessageEditHook messageEditHook2 = (MessageEditHook) this.f2012d;
                                if (c0666j0 == null || (strM1734y = c0666j0.f2068b) == null) {
                                    messageEditHook2.getClass();
                                    strM1734y = MessageEditHook.m1734y(textView2);
                                }
                                MessageEditHook.f2132q = strM1734y;
                                MessageEditHook.f2133r = System.currentTimeMillis();
                                ((MessageEditHook) this.f2012d).getClass();
                                MessageEditHook.m1709A(textView2);
                                MessageEditHook messageEditHook3 = (MessageEditHook) this.f2012d;
                                String str2 = "edit menu selected class=" + ((Method) this.f2011c).getDeclaringClass().getName() + " method=" + ((String) this.f2013e);
                                messageEditHook3.getClass();
                                MessageEditHook.m1711C(str2);
                                c0760b.m1946c(null);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                C0709x1 c0709x1M1792a = RoundAvatarHook.m1792a();
                if (c0709x1M1792a.f2230a) {
                    Object[] objArr4 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr4, "args");
                    int i3 = 0;
                    Object objM537n03 = AbstractC0179j.m537n0(0, objArr4);
                    ImageView imageView = objM537n03 instanceof ImageView ? (ImageView) objM537n03 : null;
                    if (imageView != null) {
                        Object[] objArr5 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr5, "args");
                        Object objM537n04 = AbstractC0179j.m537n0(1, objArr5);
                        String str3 = objM537n04 instanceof String ? (String) objM537n04 : null;
                        if (str3 != null) {
                            Method method3 = AvatarHook.f2221e;
                            if (method3 == null) {
                                Method[] declaredMethods = ((Class) this.f2012d).getDeclaredMethods();
                                AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                                AvatarHook avatarHook = (AvatarHook) this.f2011c;
                                int length2 = declaredMethods.length;
                                while (true) {
                                    if (i3 < length2) {
                                        method = declaredMethods[i3];
                                        AbstractC0307g.m700b(method);
                                        avatarHook.getClass();
                                        if (!AvatarHook.m1801f(method)) {
                                            i3++;
                                        }
                                    } else {
                                        method = null;
                                    }
                                }
                                if (method != null) {
                                    method.setAccessible(true);
                                    AvatarHook.f2221e = method;
                                    method3 = method;
                                } else {
                                    method3 = null;
                                }
                                if (method3 == null) {
                                }
                            }
                            try {
                                method3.invoke(null, imageView, str3, Float.valueOf(c0709x1M1792a.f2231b), Boolean.FALSE);
                                c0760b.m1946c(null);
                                AvatarHook.m1798b((AvatarHook) this.f2011c, (String) this.f2013e, c0709x1M1792a.f2231b);
                            } catch (Throwable th) {
                                AvatarHook avatarHook2 = (AvatarHook) this.f2011c;
                                String str4 = "a→b fail: " + th.getMessage();
                                avatarHook2.getClass();
                                AvatarHook.m1804i(str4);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }

    public C0647d(Class cls, Method method) {
        this.f2010b = 1;
        this.f2012d = MessageEditHook.f2116a;
        this.f2013e = cls;
        this.f2011c = method;
    }

    public C0647d(Method method) {
        this.f2010b = 0;
        this.f2012d = MomentsCommentProtectHook.f2040a;
        this.f2011c = method;
        this.f2013e = "DexKit:execSQL";
    }

    public C0647d(MessageEditHook messageEditHook, Method method, String str) {
        this.f2010b = 2;
        this.f2012d = messageEditHook;
        this.f2011c = method;
        this.f2013e = str;
    }
}
