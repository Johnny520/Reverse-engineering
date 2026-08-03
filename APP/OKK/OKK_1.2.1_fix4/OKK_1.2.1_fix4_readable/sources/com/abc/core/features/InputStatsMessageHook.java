package com.abc.core.features;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.abc.ui.FloatingBottomTabView;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p006D.RunnableC0129u;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p007D0.C0139e;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.j */
/* JADX INFO: loaded from: classes.dex */
public final class InputStatsMessageHook extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2066b;

    public /* synthetic */ InputStatsMessageHook(int i2, boolean z2) {
        this.f2066b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1385a(C0760b c0760b) {
        Object objM116u;
        Object objM116u2;
        Object obj;
        Object obj2;
        Object objM116u3;
        C0598J0 c0598j0M1413a;
        String strM1775l;
        Object objM1776m;
        Object objM116u4;
        String str = "";
        int i2 = 1;
        switch (this.f2066b) {
            case 2:
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM536m0 = AbstractC0179j.m536m0(objArr);
                if (objM536m0 != null) {
                    AtomicBoolean atomicBoolean = MessageDatabaseHook.f2105a;
                    MessageDatabaseHook.f2114j = c0760b.f2669b;
                    AtomicBoolean atomicBoolean2 = MessageDatabaseHook.f2105a;
                    Object objM1694c = MessageDatabaseHook.m1694c(objM536m0, "field_type");
                    Number number = objM1694c instanceof Number ? (Number) objM1694c : null;
                    Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        Object objM1694c2 = MessageDatabaseHook.m1694c(objM536m0, "field_content");
                        String str2 = objM1694c2 instanceof String ? (String) objM1694c2 : null;
                        String str3 = str2 == null ? "" : str2;
                        Object objM1694c3 = MessageDatabaseHook.m1694c(objM536m0, "field_talker");
                        String str4 = objM1694c3 instanceof String ? (String) objM1694c3 : null;
                        Long lM1701j = MessageDatabaseHook.m1701j(objM536m0, "field_msgSvrId");
                        long jLongValue = (lM1701j == null && (lM1701j = MessageDatabaseHook.m1701j(objM536m0, "field_newMsgId")) == null) ? 0L : lM1701j.longValue();
                        String strM1740c = AntiRevokeProcessor.m1740c(str3);
                        String str5 = strM1740c == null ? (str4 == null || !AntiRevokeProcessor.m1745h(str4) || AntiRevokeProcessor.m1744g(str4)) ? null : str4 : strM1740c;
                        Long lM1701j2 = MessageDatabaseHook.m1701j(objM536m0, "field_createTime");
                        C0652e1 c0652e1 = new C0652e1(iIntValue, str3, str4, lM1701j2 != null ? lM1701j2.longValue() : 0L, str5, jLongValue);
                        Long lM1701j3 = MessageDatabaseHook.m1701j(objM536m0, "field_msgId");
                        long jLongValue2 = lM1701j3 != null ? lM1701j3.longValue() : 0L;
                        MessageDatabaseHook.m1704m(c0652e1, jLongValue2, jLongValue, str4);
                        ArrayList arrayListM535l0 = AbstractC0179j.m535l0(new Long[]{Long.valueOf(jLongValue2), Long.valueOf(jLongValue)});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : arrayListM535l0) {
                            if (((Number) obj3).longValue() > 0) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            MessageDatabaseHook.f2112h.put(Long.valueOf(((Number) it.next()).longValue()), objM536m0);
                        }
                    }
                    break;
                }
                break;
            case 5:
                if (BottomTabConfig.m1807b()) {
                    C0588G c0588g = C0588G.f1768a;
                    Object obj4 = c0760b.f2669b;
                    AbstractC0307g.m702d(obj4, "thisObject");
                    try {
                        Object objM920y = AbstractC0358S.m920y(obj4, "mViewPager");
                        objM116u = objM920y instanceof ViewGroup ? (ViewGroup) objM920y : null;
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    boolean z2 = objM116u instanceof C0140f;
                    Object obj5 = objM116u;
                    if (z2) {
                        obj5 = null;
                    }
                    ViewGroup viewGroup = (ViewGroup) obj5;
                    try {
                        objM116u2 = AbstractC0358S.m920y(obj4, "mTabsAdapter");
                    } catch (Throwable th2) {
                        objM116u2 = AbstractC0040p.m116u(th2);
                    }
                    Object obj6 = objM116u2 instanceof C0140f ? null : objM116u2;
                    if (viewGroup == null || obj6 == null) {
                        C0588G.m1436w("skip: pager/adapter missing");
                    } else {
                        ViewParent parent = viewGroup.getParent();
                        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup2 == null) {
                            C0588G.m1436w("skip: no parent");
                        } else {
                            FloatingBottomTabView floatingBottomTabView = C0588G.f1770c;
                            if (floatingBottomTabView == null || !floatingBottomTabView.isAttachedToWindow()) {
                                viewGroup.post(new RunnableC0573B(viewGroup2, viewGroup, obj4, obj6, 0));
                            } else {
                                C0588G.f1771d = obj6;
                                Method methodM1421h = C0588G.m1421h(obj6.getClass());
                                if (methodM1421h == null) {
                                    methodM1421h = C0588G.f1772e;
                                }
                                C0588G.f1772e = methodM1421h;
                                C0588G.m1423j(viewGroup2);
                                floatingBottomTabView.bringToFront();
                                floatingBottomTabView.requestLayout();
                                C0588G.m1436w("already attached, re-hide native");
                            }
                        }
                    }
                    break;
                }
                break;
            case 11:
                BottomTabConfig.m1807b();
                break;
            case 12:
                BottomTabConfig.m1807b();
                break;
            case 13:
                Object obj7 = c0760b.f2669b;
                ViewGroup viewGroup3 = obj7 instanceof ViewGroup ? (ViewGroup) obj7 : null;
                if (viewGroup3 != null) {
                    C0594I.m1469a(viewGroup3);
                    break;
                }
                break;
            case 14:
                Object obj8 = c0760b.f2669b;
                ViewGroup viewGroup4 = obj8 instanceof ViewGroup ? (ViewGroup) obj8 : null;
                if (viewGroup4 != null) {
                    C0594I.m1469a(viewGroup4);
                    break;
                }
                break;
            case 15:
                Object obj9 = c0760b.f2669b;
                ViewGroup viewGroup5 = obj9 instanceof ViewGroup ? (ViewGroup) obj9 : null;
                if (viewGroup5 != null) {
                    C0594I c0594i = C0594I.f1812a;
                    for (Class<?> superclass = viewGroup5.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                        if (superclass.getName().equals("com.tencent.mm.ui.LauncherUIBottomTabView")) {
                            C0594I.m1469a(viewGroup5);
                        }
                        break;
                    }
                    break;
                }
                break;
            case 16:
                MessageDetailHook.f1961A = c0760b.f2669b;
                break;
            case 18:
                MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                MessageDetailHook.f1962B = c0760b.f2669b;
                break;
            case 20:
                MessageEditHook messageEditHook = MessageEditHook.f2116a;
                if (MessageEditHook.m1725p()) {
                    Object obj10 = c0760b.f2669b;
                    Menu menu = obj10 instanceof Menu ? (Menu) obj10 : null;
                    if (menu != null) {
                        MessageEditHook.m1713b(messageEditHook, menu);
                        break;
                    }
                }
                break;
            case 23:
                FoldBannerPinHook.m1755b();
                if (FoldBannerPinHook.f2156c) {
                    FoldBannerPinHook.m1756c(c0760b.f2669b);
                    break;
                }
                break;
            case 24:
                FoldBannerPinHook.m1755b();
                if (FoldBannerPinHook.f2156c) {
                    FoldBannerPinHook.m1756c(c0760b.f2669b);
                    break;
                }
                break;
            case 25:
                Object obj11 = c0760b.f2672e;
                Number number2 = obj11 instanceof Number ? (Number) obj11 : null;
                if (number2 == null || number2.longValue() > 0) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    int length = objArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            obj = objArr2[i3];
                            if (!(obj instanceof String)) {
                                i3++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    String str6 = obj instanceof String ? (String) obj : null;
                    if (str6 != null && str6.equals("message")) {
                        Object[] objArr3 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr3, "args");
                        int length2 = objArr3.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length2) {
                                obj2 = objArr3[i4];
                                if (!(obj2 instanceof ContentValues)) {
                                    i4++;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        ContentValues contentValues = obj2 instanceof ContentValues ? (ContentValues) obj2 : null;
                        if (contentValues != null) {
                            InputStatsDatabase inputStatsDatabase = InputStatsDatabase.f1818a;
                            try {
                                c0598j0M1413a = InputStatsConfig.m1413a();
                            } catch (Throwable th3) {
                                objM116u3 = AbstractC0040p.m116u(th3);
                            }
                            if (c0598j0M1413a.f1828a && c0598j0M1413a.f1829b) {
                                Integer asInteger = contentValues.getAsInteger("isSend");
                                if (((asInteger == null && (asInteger = contentValues.getAsInteger("field_isSend")) == null) ? 0 : asInteger.intValue()) == 1) {
                                    Integer asInteger2 = contentValues.getAsInteger("type");
                                    if (asInteger2 == null && (asInteger2 = contentValues.getAsInteger("field_type")) == null) {
                                    }
                                    int iIntValue2 = asInteger2.intValue();
                                    String asString = contentValues.getAsString("content");
                                    if (asString == null) {
                                        String asString2 = contentValues.getAsString("field_content");
                                        if (asString2 != null) {
                                            str = asString2;
                                        }
                                    } else {
                                        str = asString;
                                    }
                                    if (InputStatsDatabase.f1822e.m1788c(InputStatsDatabase.m1480h(contentValues, iIntValue2, str))) {
                                        Context context = InputStatsDatabase.f1824g;
                                        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("abc_input_stats", 0) : null;
                                        if (sharedPreferences != null) {
                                            String string = LocalDate.now().toString();
                                            AbstractC0307g.m702d(string, "toString(...)");
                                            InputStatsDatabase.m1481i(sharedPreferences, AbstractC0358S.m877b(InputStatsDatabase.m1479g(sharedPreferences, string), iIntValue2, str));
                                            View view = InputStatsDatabase.f1825h;
                                            if (view != null) {
                                                view.post(new RunnableC0129u(view, 3));
                                            }
                                            objM116u3 = C0146l.f339a;
                                        }
                                    }
                                }
                                AbstractC0141g.m465a(objM116u3);
                            }
                            break;
                        }
                    }
                }
                break;
            case 26:
                WeakReference weakReference = C0670k1.f2090g;
                if ((weakReference != null ? weakReference.get() : null) == c0760b.f2669b) {
                    C0670k1.f2090g = new WeakReference(null);
                }
                break;
            case 27:
                RealNameTailHook realNameTailHook = RealNameTailHook.f2163a;
                Object obj12 = c0760b.f2669b;
                if (obj12 != null) {
                    C0139e c0139e = (C0139e) RealNameTailHook.f2173k.remove(obj12);
                    InterfaceC0286l interfaceC0286l = (InterfaceC0286l) RealNameTailHook.f2174l.remove(obj12);
                    if (c0139e != null || interfaceC0286l != null) {
                        String str7 = c0139e != null ? (String) c0139e.f328a : null;
                        Object objM1776m2 = RealNameTailHook.m1776m(obj12, "r");
                        if (objM1776m2 == null && (objM1776m2 = RealNameTailHook.m1776m(obj12, "f150798r")) == null) {
                            objM1776m2 = RealNameTailHook.m1776m(obj12, "f150798R");
                        }
                        if (objM1776m2 == null) {
                            Object objM1776m3 = RealNameTailHook.m1776m(obj12, "f206693n");
                            if (objM1776m3 == null) {
                                objM1776m3 = RealNameTailHook.m1776m(obj12, "n");
                            }
                            if (objM1776m3 == null) {
                                strM1775l = RealNameTailHook.m1775l(obj12);
                                if (strM1775l == null) {
                                    strM1775l = null;
                                }
                            } else {
                                Object objM1776m4 = RealNameTailHook.m1776m(objM1776m3, "f66769b");
                                if (objM1776m4 == null && (objM1776m4 = RealNameTailHook.m1776m(objM1776m3, "b")) == null) {
                                    objM1776m = null;
                                } else {
                                    objM1776m = RealNameTailHook.m1776m(objM1776m4, "f66756a");
                                    if (objM1776m == null) {
                                        objM1776m = RealNameTailHook.m1776m(objM1776m4, "a");
                                    }
                                }
                                if (objM1776m != null) {
                                    String strM1777n = RealNameTailHook.m1777n(objM1776m, "f231704f");
                                    if (strM1777n == null) {
                                        strM1775l = RealNameTailHook.m1775l(objM1776m);
                                        if (strM1775l == null) {
                                        }
                                    } else {
                                        strM1775l = (!(AbstractC0425j.m1013R0(strM1777n) ^ true) || strM1777n.length() > 16) ? null : strM1777n;
                                        if (strM1775l == null) {
                                        }
                                    }
                                }
                            }
                        } else {
                            strM1775l = RealNameTailHook.m1777n(objM1776m2, "f231704f");
                            if (strM1775l == null) {
                                strM1775l = RealNameTailHook.m1777n(objM1776m2, "f");
                                if (strM1775l == null) {
                                    strM1775l = RealNameTailHook.m1775l(objM1776m2);
                                    if (strM1775l == null) {
                                    }
                                } else {
                                    if (!RealNameTailHook.m1774j(strM1775l)) {
                                        strM1775l = null;
                                    }
                                    if (strM1775l == null) {
                                    }
                                }
                            } else {
                                if (!(!AbstractC0425j.m1013R0(strM1775l)) || strM1775l.length() > 16) {
                                    strM1775l = null;
                                }
                                if (strM1775l == null) {
                                }
                            }
                        }
                        AbstractC0685p1 c0679n1 = (strM1775l == null || AbstractC0425j.m1013R0(strM1775l)) ? C0682o1.f2140a : new C0679n1(AbstractC0425j.m1022a1(strM1775l).toString());
                        try {
                            Object objM1776m5 = RealNameTailHook.m1776m(obj12, "r");
                            if (objM1776m5 == null) {
                                objM1776m5 = RealNameTailHook.m1776m(obj12, "f150798r");
                            }
                            objM116u4 = objM1776m5 != null ? objM1776m5.getClass().getName() : null;
                        } catch (Throwable th4) {
                            objM116u4 = AbstractC0040p.m116u(th4);
                        }
                        RealNameTailHook.m1782s("cgi cb sender=" + str7 + " name=" + strM1775l + " result=" + c0679n1.getClass().getSimpleName() + " resp=" + ((String) (objM116u4 instanceof C0140f ? null : objM116u4)));
                        boolean z3 = c0679n1 instanceof C0679n1;
                        if (z3 && str7 != null) {
                            RealNameTailHook.f2170h.put(str7, ((C0679n1) c0679n1).f2136a);
                            RealNameTailHook.m1780q();
                        }
                        if (interfaceC0286l != null) {
                            try {
                                interfaceC0286l.invoke(c0679n1);
                            } catch (Throwable th5) {
                                AbstractC0040p.m116u(th5);
                                return;
                            }
                            break;
                        } else if (z3 && str7 != null) {
                            RealNameTailHook.f2169g.post(new RunnableC0673l1(str7, c0679n1, i2));
                            break;
                        }
                    }
                    break;
                }
                break;
            case 29:
                C0709x1 c0709x1M1792a = RoundAvatarHook.m1792a();
                if (c0709x1M1792a.f2230a) {
                    AvatarHook.m1797a(AvatarHook.f2217a, c0760b.f2669b, c0709x1M1792a.f2231b);
                    break;
                }
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        boolean z2;
        Object obj;
        Method method;
        Object obj2;
        Object objM116u;
        String strM1415b;
        String string;
        int iIntValue;
        String str = null;
        str = null;
        String str2 = null;
        str = null;
        switch (this.f2066b) {
            case 0:
                if (C0683p.m1753a().f2150f) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    int length = objArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                        } else if (!(objArr[i2] instanceof String)) {
                            i2++;
                        }
                    }
                    if (i2 < 0) {
                        return;
                    }
                    Object obj3 = c0760b.f2670c[i2];
                    String strM1031F0 = obj3 instanceof String ? (String) obj3 : null;
                    if (strM1031F0 == null) {
                        return;
                    }
                    C0422g c0422g = AbstractC0671l.f2092a;
                    if (!AbstractC0425j.m1013R0(strM1031F0)) {
                        if (AbstractC0425j.m1005J0(strM1031F0, "(sourceType & 2 != 0 )  AND", false)) {
                            strM1031F0 = AbstractC0433r.m1031F0(strM1031F0, "(sourceType & 2 != 0 )  AND", "", false);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (AbstractC0425j.m1005J0(strM1031F0, "(sourceType & 2 != 0)  AND", false)) {
                            strM1031F0 = AbstractC0433r.m1031F0(strM1031F0, "(sourceType & 2 != 0)  AND", "", false);
                            z2 = true;
                        }
                        if (AbstractC0425j.m1005J0(strM1031F0, "(sourceType & 2 != 0) AND", false)) {
                            strM1031F0 = AbstractC0433r.m1031F0(strM1031F0, "(sourceType & 2 != 0) AND", "", false);
                            z2 = true;
                        }
                        if (AbstractC0425j.m1005J0(strM1031F0, "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", false)) {
                            strM1031F0 = AbstractC0433r.m1031F0(strM1031F0, "(sourceType in (8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", "(sourceType in (0,2,4,6,8,264,10,266,12,268,14,270,24,280,26,282,28,284,30,286,72,328,74,330,76,332,78,334,88,344,90,346,92,348,94,350,136,392,138,394,140,396,142,398,152,408,154,410,156,412,158,414,200,456,202,458,204,460,206,462,216,472,218,474,220,476,222,478))", false);
                            z2 = true;
                        }
                        if (AbstractC0425j.m1005J0(strM1031F0, "WHERE SnsInfo.userName=", true) && AbstractC0425j.m1005J0(strM1031F0, "(snsId >=", false)) {
                            strM1031F0 = AbstractC0433r.m1031F0(strM1031F0, "(snsId >=", "(1=1 or snsId >=", false);
                        } else {
                            z = z2;
                        }
                        if (z) {
                            str = strM1031F0;
                        }
                    }
                    if (str == null) {
                        return;
                    }
                    c0760b.f2670c[i2] = str;
                    return;
                }
                return;
            case 1:
                CopyOnWriteArrayList copyOnWriteArrayList = AbstractC0642b0.f1999a;
                AbstractC0642b0.m1626m(c0760b.f2669b);
                return;
            case 3:
                C0686q c0686qM1753a = C0683p.m1753a();
                if (c0686qM1753a.f2145a) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr2);
                    String string2 = objM537n0 != null ? objM537n0.toString() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    Object[] objArr3 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr3, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(1, objArr3);
                    Number number = objM537n02 instanceof Number ? (Number) objM537n02 : null;
                    long jLongValue = number != null ? number.longValue() : 0L;
                    Object[] objArr4 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr4, "args");
                    Object objM537n03 = AbstractC0179j.m537n0(3, objArr4);
                    String string3 = objM537n03 != null ? objM537n03.toString() : null;
                    String str3 = string3 != null ? string3 : "";
                    boolean zM1746i = AntiRevokeProcessor.m1746i(str3);
                    if (zM1746i) {
                        C0572A1.m1384a(new long[]{jLongValue});
                        AtomicBoolean atomicBoolean = MessageDatabaseHook.f2105a;
                        MessageDatabaseHook.m1708q("MARKED self revoke source serverId=" + jLongValue);
                        if (!c0686qM1753a.f2147c) {
                            return;
                        }
                    }
                    boolean z3 = c0686qM1753a.f2146b;
                    if (z3) {
                        AtomicBoolean atomicBoolean2 = MessageDatabaseHook.f2105a;
                        if (jLongValue > 0 && z3 && (obj = MessageDatabaseHook.f2114j) != null && (method = MessageDatabaseHook.f2113i) != null && (obj2 = MessageDatabaseHook.f2112h.get(Long.valueOf(jLongValue))) != null) {
                            C0652e1 c0652e1M1705n = MessageDatabaseHook.m1705n(jLongValue, jLongValue, string2);
                            if (AbstractC0425j.m1013R0(str3)) {
                                str3 = "recalled a message";
                            }
                            AbstractC0358S abstractC0358SM1738a = AntiRevokeProcessor.m1738a(new C0700u1(jLongValue, 10000, str3), c0652e1M1705n, c0686qM1753a.f2147c, c0686qM1753a.f2148d, true, AbstractC0642b0.m1620g(AntiRevokeProcessor.m1752o(AntiRevokeProcessor.m1746i(str3), c0652e1M1705n, string2, str3), str3));
                            if (!abstractC0358SM1738a.equals(C0694s1.f2193z)) {
                                if (!(abstractC0358SM1738a instanceof C0697t1)) {
                                    throw new C0137c();
                                }
                                String str4 = ((C0697t1) abstractC0358SM1738a).f2198z;
                                if (!AbstractC0425j.m1013R0(str4)) {
                                    try {
                                        MessageDatabaseHook.m1706o(obj2, 10000, "field_type");
                                        MessageDatabaseHook.m1706o(obj2, str4, "field_content");
                                        MessageDatabaseHook.m1706o(obj2, Long.valueOf((c0652e1M1705n != null ? c0652e1M1705n.f2027d : 0L) + 1), "field_createTime");
                                        MessageDatabaseHook.m1706o(obj2, str4, "x0");
                                        try {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj, obj2, bool, bool);
                                        } catch (Throwable unused) {
                                            method.invoke(obj, obj2, Boolean.FALSE);
                                        }
                                        MessageDatabaseHook.m1708q("inserted source revoke notice serverId=" + jLongValue + " notice=" + AbstractC0425j.m1021Z0(str4, 48));
                                        objM116u = C0146l.f339a;
                                    } catch (Throwable th) {
                                        objM116u = AbstractC0040p.m116u(th);
                                    }
                                    Throwable thM465a = AbstractC0141g.m465a(objM116u);
                                    if (thM465a != null) {
                                        AtomicBoolean atomicBoolean3 = MessageDatabaseHook.f2105a;
                                        MessageDatabaseHook.m1708q("source revoke notice failed serverId=" + jLongValue + ": " + thM465a.getMessage());
                                    }
                                }
                            }
                        }
                        break;
                    }
                    c0760b.m1946c(null);
                    AtomicBoolean atomicBoolean4 = MessageDatabaseHook.f2105a;
                    MessageDatabaseHook.m1708q("BLOCKED source revoke serverId=" + jLongValue + " talker=" + string2 + " self=" + zM1746i);
                    return;
                }
                return;
            case 4:
                if (BottomTabConfig.m1807b()) {
                    Object obj4 = c0760b.f2670c[0];
                    Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
                    if (number2 == null || number2.intValue() == 0) {
                        return;
                    }
                    c0760b.f2670c[0] = 0;
                    return;
                }
                return;
            case 6:
                if (!BottomTabConfig.m1807b() || C0588G.f1783p) {
                    return;
                }
                Object[] objArr5 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr5, "args");
                Object objM537n04 = AbstractC0179j.m537n0(0, objArr5);
                String str5 = objM537n04 instanceof String ? (String) objM537n04 : null;
                if (str5 == null || (strM1415b = C0588G.m1415b(str5)) == null || strM1415b.equals(str5)) {
                    return;
                }
                c0760b.f2670c[0] = strM1415b;
                return;
            case 7:
                if (!BottomTabConfig.m1807b() || C0588G.f1783p) {
                    return;
                }
                Object obj5 = c0760b.f2669b;
                TextView textView = obj5 instanceof TextView ? (TextView) obj5 : null;
                if (textView != null && textView.getId() == 16908308) {
                    C0588G c0588g = C0588G.f1768a;
                    Context context = textView.getContext();
                    AbstractC0307g.m702d(context, "getContext(...)");
                    if (C0588G.m1431r(context) && C0588G.m1428o(textView)) {
                        Object[] objArr6 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr6, "args");
                        Object objM537n05 = AbstractC0179j.m537n0(0, objArr6);
                        if (objM537n05 == null) {
                            return;
                        }
                        CharSequence charSequence = objM537n05 instanceof CharSequence ? (CharSequence) objM537n05 : null;
                        if (charSequence == null || (string = charSequence.toString()) == null) {
                            return;
                        }
                        String strM1415b2 = C0588G.m1415b(string);
                        if (strM1415b2 == null) {
                            String str6 = (String) AbstractC0181l.m545q0(BottomTabConfig.m1808c(), C0588G.f1784q);
                            if (str6 != null && (AbstractC0425j.m1013R0(string) || C0588G.m1430q((String) C0588G.m1433t(string).f328a))) {
                                str2 = str6;
                            }
                            if (str2 == null) {
                                return;
                            } else {
                                strM1415b2 = str2;
                            }
                        }
                        if (strM1415b2.equals(string)) {
                            return;
                        }
                        c0760b.f2670c[0] = strM1415b2;
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Object obj6 = c0760b.f2669b;
                View view = obj6 instanceof View ? (View) obj6 : null;
                if (view != null && BottomTabConfig.m1807b() && !C0588G.f1777j && C0588G.m1414a(view)) {
                    Object obj7 = c0760b.f2670c[0];
                    Number number3 = obj7 instanceof Number ? (Number) obj7 : null;
                    if (number3 == null || (iIntValue = number3.intValue()) == 8 || iIntValue == 4) {
                        return;
                    }
                    c0760b.f2670c[0] = 8;
                    return;
                }
                return;
            case 9:
                if (!BottomTabConfig.m1807b() || C0588G.f1777j) {
                    return;
                }
                Object obj8 = c0760b.f2669b;
                View view2 = obj8 instanceof View ? (View) obj8 : null;
                if (view2 != null && C0588G.m1414a(view2)) {
                    c0760b.f2670c[0] = 0;
                    return;
                }
                return;
            case 10:
                if (!BottomTabConfig.m1807b() || C0588G.f1777j) {
                    return;
                }
                Object obj9 = c0760b.f2669b;
                View view3 = obj9 instanceof View ? (View) obj9 : null;
                if (view3 != null && C0588G.m1414a(view3)) {
                    Object[] objArr7 = c0760b.f2670c;
                    if (objArr7[0] != null) {
                        objArr7[0] = null;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                if (C0683p.m1753a().f2152h) {
                    Object obj10 = c0760b.f2669b;
                    View view4 = obj10 instanceof View ? (View) obj10 : null;
                    if (view4 == null) {
                        return;
                    }
                    Object tag = view4.getTag(C1031R.id.abc_tag_bubble_msg_type);
                    Integer num = tag instanceof Integer ? (Integer) tag : null;
                    if (num != null) {
                        int iIntValue2 = num.intValue();
                        Object tag2 = view4.getTag(C1031R.id.abc_tag_bubble_supports_custom);
                        Boolean bool2 = tag2 instanceof Boolean ? (Boolean) tag2 : null;
                        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : AbstractC0600K.m1486a("", iIntValue2);
                        C0422g c0422g2 = AbstractC0600K.f1833a;
                        if (!(AbstractC0425j.m1005J0(view4.getClass().getName(), "MMNeat7extView", false) && zBooleanValue)) {
                            view4.setTag(C1031R.id.abc_tag_bubble_source, null);
                            return;
                        }
                        Object tag3 = view4.getTag(C1031R.id.abc_tag_bubble_is_send);
                        Boolean bool3 = tag3 instanceof Boolean ? (Boolean) tag3 : null;
                        if (bool3 != null) {
                            boolean zBooleanValue2 = bool3.booleanValue();
                            ConcurrentHashMap concurrentHashMap = AbstractC0626U.f1936a;
                            String strM1534g = AbstractC0626U.m1534g(MessageDetailHook.f1965E, zBooleanValue2);
                            Object[] objArr8 = c0760b.f2670c;
                            AbstractC0307g.m702d(objArr8, "args");
                            Object objM537n06 = AbstractC0179j.m537n0(0, objArr8);
                            Drawable drawable = objM537n06 instanceof Drawable ? (Drawable) objM537n06 : null;
                            if (drawable != null) {
                                view4.setTag(C1031R.id.abc_tag_bubble_original_background, drawable);
                            }
                            Context context2 = view4.getContext();
                            AbstractC0307g.m702d(context2, "getContext(...)");
                            C0618Q c0618qM1532e = AbstractC0626U.m1532e(context2, MessageDetailHook.f1965E, zBooleanValue2);
                            if (c0618qM1532e != null) {
                                c0760b.f2670c[0] = c0618qM1532e.f1908a;
                                view4.setTag(C1031R.id.abc_tag_bubble_source, strM1534g);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                MessageEditHook messageEditHook = MessageEditHook.f2116a;
                Object obj11 = c0760b.f2669b;
                if (obj11 == null || MessageEditHook.f2128m) {
                    return;
                }
                Set set = MessageEditHook.f2127l;
                AbstractC0307g.m702d(set, "dbIdentitySeen");
                synchronized (set) {
                    try {
                        if (MessageEditHook.f2128m) {
                            return;
                        }
                        if (set.contains(obj11)) {
                            return;
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList2 = MessageEditHook.f2125j;
                        if (!(copyOnWriteArrayList2 instanceof Collection) || !copyOnWriteArrayList2.isEmpty()) {
                            Iterator it = copyOnWriteArrayList2.iterator();
                            while (it.hasNext()) {
                                if (it.next() == obj11) {
                                    MessageEditHook.f2127l.add(obj11);
                                    return;
                                }
                            }
                        }
                        if (AbstractC0307g.m699a(MessageEditHook.f2126k.computeIfAbsent(obj11.getClass(), new C0612O(new C0570A(7), 3)), Boolean.TRUE)) {
                            MessageEditHook.f2127l.add(obj11);
                            CopyOnWriteArrayList copyOnWriteArrayList3 = MessageEditHook.f2125j;
                            if (copyOnWriteArrayList3.size() >= 4) {
                                MessageEditHook.f2128m = true;
                                return;
                            }
                            copyOnWriteArrayList3.add(obj11);
                            if (copyOnWriteArrayList3.size() >= 4) {
                                MessageEditHook.f2128m = true;
                            }
                            if (copyOnWriteArrayList3.size() <= 2) {
                                MessageEditHook.m1711C("remember db=" + obj11.getClass().getName() + " total=" + copyOnWriteArrayList3.size());
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 21:
                if (AbstractC0307g.m699a(FoldBannerPinHook.f2162i.get(), Boolean.TRUE)) {
                    return;
                }
                FoldBannerPinHook.m1755b();
                if (FoldBannerPinHook.f2156c) {
                    Object obj12 = c0760b.f2669b;
                    View view5 = obj12 instanceof View ? (View) obj12 : null;
                    if (view5 != null && FoldBannerPinHook.m1754a(view5)) {
                        Object obj13 = c0760b.f2670c[0];
                        Integer num2 = obj13 instanceof Integer ? (Integer) obj13 : null;
                        if (num2 == null || num2.intValue() == 8) {
                            return;
                        }
                        c0760b.f2670c[0] = 8;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                if (AbstractC0307g.m699a(FoldBannerPinHook.f2162i.get(), Boolean.TRUE)) {
                    return;
                }
                FoldBannerPinHook.m1755b();
                if (FoldBannerPinHook.f2156c) {
                    Object obj14 = c0760b.f2669b;
                    View view6 = obj14 instanceof View ? (View) obj14 : null;
                    if (view6 != null && FoldBannerPinHook.m1754a(view6)) {
                        c0760b.f2670c[0] = Float.valueOf(0.0f);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                C0709x1 c0709x1M1792a = RoundAvatarHook.m1792a();
                if (c0709x1M1792a.f2230a) {
                    Object[] objArr9 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr9, "args");
                    Object objM537n07 = AbstractC0179j.m537n0(0, objArr9);
                    Bitmap bitmap = objM537n07 instanceof Bitmap ? (Bitmap) objM537n07 : null;
                    if (bitmap == null || bitmap.isRecycled() || c0760b.f2670c.length < 3) {
                        return;
                    }
                    float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
                    if (fMin <= 1.0f) {
                        return;
                    }
                    c0760b.f2670c[2] = Float.valueOf(c0709x1M1792a.f2231b * fMin);
                    return;
                }
                return;
            case 29:
                C0709x1 c0709x1M1792a2 = RoundAvatarHook.m1792a();
                if (c0709x1M1792a2.f2230a) {
                    Object[] objArr10 = c0760b.f2670c;
                    float f2 = c0709x1M1792a2.f2231b;
                    objArr10[1] = Float.valueOf(f2);
                    AvatarHook.m1798b(AvatarHook.f2217a, "drawable.<init>", f2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public InputStatsMessageHook(int i2) {
        this.f2066b = i2;
        switch (i2) {
            case 8:
                C0588G c0588g = C0588G.f1768a;
                break;
            case 9:
                C0588G c0588g2 = C0588G.f1768a;
                break;
            case 10:
                C0588G c0588g3 = C0588G.f1768a;
                break;
            case 11:
            case 12:
            case 17:
            case 18:
            case 25:
            case 27:
            case 28:
            default:
                C0588G c0588g4 = C0588G.f1768a;
                break;
            case 13:
                C0594I c0594i = C0594I.f1812a;
                break;
            case 14:
                C0594I c0594i2 = C0594I.f1812a;
                break;
            case 15:
                C0594I c0594i3 = C0594I.f1812a;
                break;
            case 16:
                MessageDetailHook messageDetailHook = MessageDetailHook.f1967a;
                break;
            case 19:
                MessageEditHook messageEditHook = MessageEditHook.f2116a;
                break;
            case 20:
                MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                break;
            case 21:
                FoldBannerPinHook foldBannerPinHook = FoldBannerPinHook.f2154a;
                break;
            case 22:
                FoldBannerPinHook foldBannerPinHook2 = FoldBannerPinHook.f2154a;
                break;
            case 23:
                FoldBannerPinHook foldBannerPinHook3 = FoldBannerPinHook.f2154a;
                break;
            case 24:
                FoldBannerPinHook foldBannerPinHook4 = FoldBannerPinHook.f2154a;
                break;
            case 26:
                C0670k1 c0670k1 = C0670k1.f2084a;
                break;
            case 29:
                AvatarHook avatarHook = AvatarHook.f2217a;
                break;
        }
    }
}
