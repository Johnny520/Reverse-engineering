package p050c0;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.abc.core.hooks.ModuleLog;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0193x;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p033R0.InterfaceC0319a;
import p033R0.InterfaceC0320b;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: c0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0653f extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2031c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2032d;

    public /* synthetic */ C0653f(Object obj, Object obj2, int i2) {
        this.f2030b = i2;
        this.f2031c = obj;
        this.f2032d = obj2;
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        Object obj;
        Object obj2;
        TextView textViewM1712a;
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        Object objM116u4;
        int i2 = 0;
        Object obj3 = null;
        switch (this.f2030b) {
            case 2:
                ((C0678n0) this.f2031c).getClass();
                if (C0678n0.m1725p()) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    int length = objArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            obj = objArr[i3];
                            if (!(obj instanceof Menu)) {
                                i3++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Menu menu = obj instanceof Menu ? (Menu) obj : null;
                    if (menu != null) {
                        Object[] objArr2 = c0760b.f2670c;
                        AbstractC0307g.m702d(objArr2, "args");
                        int length2 = objArr2.length;
                        while (true) {
                            if (i2 < length2) {
                                obj2 = objArr2[i2];
                                if (!(obj2 instanceof View)) {
                                    i2++;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        View view = obj2 instanceof View ? (View) obj2 : null;
                        if (view != null && (textViewM1712a = C0678n0.m1712a((C0678n0) this.f2031c, view)) != null) {
                            ((C0678n0) this.f2031c).getClass();
                            C0666j0 c0666j0M1730u = C0678n0.m1730u(view, textViewM1712a);
                            if (c0666j0M1730u != null) {
                                C0678n0.f2130o = c0666j0M1730u;
                                C0678n0.f2131p = new WeakReference(textViewM1712a);
                                C0678n0.f2132q = c0666j0M1730u.f2068b;
                                C0678n0.f2133r = System.currentTimeMillis();
                                C0678n0.m1713b((C0678n0) this.f2031c, menu);
                                C0678n0 c0678n0 = (C0678n0) this.f2031c;
                                long j2 = c0666j0M1730u.f2067a;
                                String str = c0666j0M1730u.f2068b;
                                c0678n0.getClass();
                                C0678n0.m1711C("create menu bind msgId=" + j2 + " text=" + AbstractC0425j.m1021Z0(AbstractC0433r.m1032G0(str, '\n', ' '), 32) + " method=" + ((String) this.f2032d));
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                ((C0655f1) this.f2031c).getClass();
                if (C0655f1.m1637b()) {
                    Object obj4 = c0760b.f2669b;
                    Activity activity = obj4 instanceof Activity ? (Activity) obj4 : null;
                    if (activity != null) {
                        ClassLoader classLoader = (ClassLoader) this.f2032d;
                        try {
                            try {
                                objM116u = AbstractC0358S.m887g(activity, "getPreferenceScreen", new Object[0]);
                            } catch (Throwable th) {
                                objM116u = AbstractC0040p.m116u(th);
                            }
                            if (objM116u instanceof C0140f) {
                                objM116u = null;
                            }
                        } catch (Throwable th2) {
                            objM116u2 = AbstractC0040p.m116u(th2);
                        }
                        if (objM116u != null) {
                            try {
                                objM116u3 = AbstractC0358S.m887g(objM116u, "i", "achat_profile_id");
                            } catch (Throwable th3) {
                                objM116u3 = AbstractC0040p.m116u(th3);
                            }
                            if (objM116u3 instanceof C0140f) {
                                objM116u3 = null;
                            }
                            String strM1638c = C0655f1.m1638c(activity);
                            if (AbstractC0425j.m1013R0(strM1638c)) {
                                strM1638c = "获取失败";
                            }
                            String strConcat = "微信 ID: ".concat(strM1638c);
                            if (objM116u3 != null) {
                                try {
                                    AbstractC0307g.m701c(strConcat, "null cannot be cast to non-null type kotlin.CharSequence");
                                    AbstractC0358S.m887g(objM116u3, "K", strConcat);
                                } catch (Throwable th4) {
                                    AbstractC0040p.m116u(th4);
                                }
                                try {
                                    AbstractC0358S.m887g(objM116u, "notifyDataSetChanged", new Object[0]);
                                } catch (Throwable th5) {
                                    AbstractC0040p.m116u(th5);
                                    return;
                                }
                            } else {
                                try {
                                    objM116u4 = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.base.preference.Preference");
                                } catch (Throwable th6) {
                                    objM116u4 = AbstractC0040p.m116u(th6);
                                }
                                if (!(objM116u4 instanceof C0140f)) {
                                    obj3 = objM116u4;
                                }
                                Class cls = (Class) obj3;
                                if (cls != null) {
                                    Object objNewInstance = cls.getConstructor(Context.class).newInstance(activity);
                                    AbstractC0358S.m887g(objNewInstance, "C", "achat_profile_id");
                                    AbstractC0307g.m701c(strConcat, "null cannot be cast to non-null type kotlin.CharSequence");
                                    AbstractC0358S.m887g(objNewInstance, "K", strConcat);
                                    AbstractC0358S.m887g(objNewInstance, "H", "点击复制");
                                    AbstractC0358S.m887g(objM116u, "d", objNewInstance, 1);
                                    AbstractC0358S.m887g(objM116u, "notifyDataSetChanged", new Object[0]);
                                    C0655f1.m1639d("injected profile id row: ".concat(strM1638c));
                                    objM116u2 = C0146l.f339a;
                                }
                            }
                            objM116u2 = AbstractC0040p.m116u(th2);
                            break;
                        }
                        Throwable thM465a = AbstractC0141g.m465a(objM116u2);
                        if (thM465a != null) {
                            C0655f1 c0655f1 = C0655f1.f2038a;
                            C0655f1.m1639d("inject fail: " + thM465a.getMessage());
                        }
                        break;
                    }
                }
                break;
            case 4:
                ((C0688q1) this.f2031c).getClass();
                if (C0688q1.m1771g()) {
                    Object obj5 = c0760b.f2669b;
                    Activity activity2 = obj5 instanceof Activity ? (Activity) obj5 : null;
                    if (activity2 != null) {
                        C0688q1.m1770f(activity2, (ClassLoader) this.f2032d);
                        break;
                    }
                }
                break;
            case 5:
                C0709x1 c0709x1M1792a = C0703v1.m1792a();
                if (c0709x1M1792a.f2230a) {
                    Object[] objArr3 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr3, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr3);
                    ImageView imageView = objM537n0 instanceof ImageView ? (ImageView) objM537n0 : null;
                    if (imageView != null) {
                        C0706w1.m1797a((C0706w1) this.f2031c, imageView.getDrawable(), c0709x1M1792a.f2231b);
                        imageView.postInvalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        Object objM116u;
        Object objM116u2;
        Class clsM906r;
        Object objM1652m;
        Object objM1652m2;
        List listM1653n;
        List listM1653n2;
        String strM1644d;
        Object obj;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        int i2 = 0;
        Object obj2 = this.f2032d;
        Object obj3 = this.f2031c;
        switch (this.f2030b) {
            case 0:
                ((C0656g) obj3).getClass();
                if (C0656g.m1649j()) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    byte[] bArr2 = objM537n0 instanceof byte[] ? (byte[]) objM537n0 : null;
                    if (bArr2 == null) {
                        return;
                    }
                    try {
                        objM116u = AbstractC0358S.m920y(c0760b.f2669b, "field_attrBuf");
                        break;
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    boolean z2 = objM116u instanceof C0140f;
                    Object obj4 = objM116u;
                    if (z2) {
                        obj4 = null;
                    }
                    byte[] bArr3 = obj4 instanceof byte[] ? (byte[]) obj4 : null;
                    if (bArr3 == null || bArr3.length == 0) {
                        return;
                    }
                    try {
                        clsM906r = AbstractC0358S.m906r((ClassLoader) obj2, "com.tencent.mm.protocal.protobuf.SnsObject");
                        objM1652m = C0656g.m1652m(clsM906r, bArr3);
                    } catch (Throwable th2) {
                        objM116u2 = AbstractC0040p.m116u(th2);
                    }
                    if (objM1652m != null && (objM1652m2 = C0656g.m1652m(clsM906r, bArr2)) != null && (listM1653n = C0656g.m1653n(objM1652m)) != null && (listM1653n2 = C0656g.m1653n(objM1652m2)) != null && !listM1653n.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : listM1653n2) {
                            if (obj5 == null) {
                                obj5 = null;
                            }
                            String strM1644d2 = obj5 != null ? C0656g.m1644d(obj5) : null;
                            if (strM1644d2 != null) {
                                arrayList.add(strM1644d2);
                            }
                        }
                        HashSet hashSet = new HashSet(AbstractC0193x.m563g0(AbstractC0183n.m559k0(arrayList, 12)));
                        AbstractC0181l.m551w0(arrayList, hashSet);
                        int i3 = 0;
                        for (Object obj6 : listM1653n) {
                            if (obj6 == null) {
                                obj6 = null;
                            }
                            if (obj6 != null && (strM1644d = C0656g.m1644d(obj6)) != null && !hashSet.contains(strM1644d)) {
                                C0656g.m1651l(obj6);
                                C0656g.m1643c(obj6);
                                if ((listM1653n2 instanceof InterfaceC0319a) && !(listM1653n2 instanceof InterfaceC0320b)) {
                                    AbstractC0317q.m715d(listM1653n2, "kotlin.collections.MutableList");
                                    throw null;
                                }
                                listM1653n2.add(obj6);
                                hashSet.add(strM1644d);
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            int size = listM1653n2.size();
                            try {
                                AbstractC0358S.m893j0(objM1652m2, Integer.valueOf(size), "CommentCount");
                            } catch (Throwable th3) {
                                AbstractC0040p.m116u(th3);
                            }
                            try {
                                AbstractC0358S.m893j0(objM1652m2, Integer.valueOf(size), "CommentUserListCount");
                            } catch (Throwable th4) {
                                AbstractC0040p.m116u(th4);
                            }
                            objM116u2 = C0656g.m1654o(objM1652m2);
                            break;
                        }
                        Throwable thM465a = AbstractC0141g.m465a(objM116u2);
                        if (thM465a != null) {
                            C0656g c0656g = C0656g.f2040a;
                            C0656g.m1657r("mergeAttrBufComments: " + thM465a.getMessage());
                        }
                        bArr = (byte[]) (objM116u2 instanceof C0140f ? null : objM116u2);
                    }
                    if (bArr == null || bArr == bArr2 || Arrays.equals(bArr, bArr2)) {
                        return;
                    }
                    c0760b.f2670c[0] = bArr;
                    C0656g.m1657r("merged CommentUserList into setAttrBuf");
                    ModuleLog.INSTANCE.m1813i("朋友圈评论防删: 合并回 CommentUserList + [已删除]");
                    return;
                }
                return;
            case 1:
                C0686q c0686qM1753a = C0683p.m1753a();
                if (c0686qM1753a.f2145a) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    int length = objArr2.length;
                    while (true) {
                        if (i2 < length) {
                            obj = objArr2[i2];
                            if (!(obj instanceof ContentValues)) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ContentValues contentValues = obj instanceof ContentValues ? (ContentValues) obj : null;
                    if (contentValues == null) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = C0677n.f2105a;
                    if (C0677n.m1692a(AbstractC0425j.m1020Y0((String) obj3) + "." + ((Method) obj2).getName(), contentValues, c0686qM1753a)) {
                        c0760b.m1946c(1);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                C0709x1 c0709x1M1792a = C0703v1.m1792a();
                if (c0709x1M1792a.f2230a) {
                    Object[] objArr3 = c0760b.f2670c;
                    if (objArr3.length >= 3) {
                        float f2 = c0709x1M1792a.f2231b;
                        objArr3[2] = Float.valueOf(f2);
                        C0706w1.m1798b((C0706w1) obj3, (String) obj2, f2);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public C0653f(ClassLoader classLoader, int i2) {
        this.f2030b = i2;
        switch (i2) {
            case 4:
                this.f2031c = C0688q1.f2163a;
                this.f2032d = classLoader;
                break;
            default:
                this.f2031c = C0656g.f2040a;
                this.f2032d = classLoader;
                break;
        }
    }

    public C0653f(String str, Method method) {
        this.f2030b = 1;
        AtomicBoolean atomicBoolean = C0677n.f2105a;
        this.f2031c = str;
        this.f2032d = method;
    }
}
