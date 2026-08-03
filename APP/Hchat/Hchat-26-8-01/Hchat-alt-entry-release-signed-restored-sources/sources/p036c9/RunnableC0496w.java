package p036c9;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Trace;
import be.C0289k;
import bsh.org.objectweb.asm.Opcodes;
import ca.C0517e0;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lb.C2547i;
import lb.RunnableC2539a;
import ng.AbstractC3015m;
import ng.C3022t;
import okhttp3.HttpUrl;
import p002a1.RunnableC0006d;
import p014b.C0126e;
import p024b9.C0219e;
import p024b9.RunnableC0217c;
import p054dg.C0795n;
import p065eb.C0886p;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1941n0;
import p119i2.C1955z;
import p136j8.C2114y;
import p153k8.C2351o;
import p177m2.InterfaceC2760d;
import p196n8.C2911c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p227p4.C3315t;
import p230p8.C3370v;
import p244qb.C3485f;
import p244qb.C3490k;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.C4651b;
import p332wb.InterfaceC5059kv;
import p345x8.C5724q;
import tf.C4173t;
import ua.C4291b;
import ua.C4292c;
import ua.C4293d;
import ua.C4295f;
import ua.C4296g;

/* JADX INFO: renamed from: c9.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0496w implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1511g = 4;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1512h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1513i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1514j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1515k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1516l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1517m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0496w(Activity activity, C3490k c3490k, ArrayList arrayList, Object obj, C0126e c0126e, InterfaceC1231l interfaceC1231l) {
        this.f1513i = activity;
        this.f1515k = c3490k;
        this.f1512h = arrayList;
        this.f1516l = obj;
        this.f1517m = c0126e;
        this.f1514j = interfaceC1231l;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object c3959f;
        Object c3959f2;
        Object objInvoke;
        Object c3959f3;
        int i9;
        Class<?> cls;
        int i10;
        boolean zBooleanValue;
        Object c3959f4;
        Object next;
        Object c3959f5;
        int i11;
        Object[] objArr;
        C4651b c4651bMo9085C;
        switch (this.f1511g) {
            case 0:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1514j;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1512h;
                String str = (String) this.f1516l;
                InterfaceC5059kv interfaceC5059kv = (InterfaceC5059kv) this.f1517m;
                Activity activity = (Activity) this.f1513i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1515k;
                try {
                    c3959f = (C0502y) interfaceC1231l.invoke(atomicBoolean);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC1184v0.m3204n("[Hchat:ConversationGroup] " + str + " 失败: " + thM8182b.getMessage(), thM8182b);
                    c3959f = new C0502y(str, 0, 0, true);
                }
                C0419b0.f1202a.post(new RunnableC0217c(interfaceC5059kv, activity, interfaceC1231l2, (C0502y) c3959f, 3));
                return;
            case 1:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1512h;
                Activity activity2 = (Activity) this.f1513i;
                Object obj = this.f1515k;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f1514j;
                C0517e0 c0517e0 = (C0517e0) this.f1516l;
                C3370v c3370v = (C3370v) this.f1517m;
                if (atomicBoolean2.get() || activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                if (!(obj instanceof C3959f)) {
                    interfaceC1231l3.invoke(obj);
                }
                Throwable thM8182b2 = C3960g.m8182b(obj);
                if (thM8182b2 == null || (thM8182b2 instanceof InterruptedException)) {
                    return;
                }
                c0517e0.f1581c.invoke("准备朋友圈转发内容失败: id=".concat(c3370v.f10879a), thM8182b2);
                String message = thM8182b2.getMessage();
                if (message == null) {
                    message = "朋友圈内容准备失败";
                }
                c0517e0.m1532r(activity2, message);
                return;
            case 2:
                C2547i c2547i = (C2547i) this.f1514j;
                WeChatMessage weChatMessage = (WeChatMessage) this.f1515k;
                WeChatMessage[] weChatMessageArr = (WeChatMessage[]) this.f1512h;
                C2114y c2114y = (C2114y) this.f1517m;
                Object obj2 = this.f1513i;
                String str2 = (String) this.f1516l;
                try {
                    ArrayList arrayList = new ArrayList(weChatMessageArr.length + 1);
                    C2547i.m5968N(arrayList, weChatMessage);
                    for (WeChatMessage weChatMessage2 : weChatMessageArr) {
                        C2547i.m5968N(arrayList, weChatMessage2);
                    }
                    C3022t c3022tM6413W = AbstractC3015m.m6413W(new C0795n(arrayList, 6), new C1955z(c2547i, 21));
                    Iterator it = c3022tM6413W.f9822a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            objInvoke = c3022tM6413W.f9823b.invoke(it.next());
                            if (!AbstractC3149m.m6721t0((String) objInvoke)) {
                            }
                        } else {
                            objInvoke = null;
                        }
                    }
                    String str3 = (String) objInvoke;
                    if (str3 != null) {
                        String strM5321q = c2114y.m5321q(str3);
                        strM5321q.getClass();
                        String str4 = AbstractC3149m.m6721t0(strM5321q) ? null : strM5321q;
                        if (str4 != null) {
                            c2547i.f8263l.post(new RunnableC2539a(c2547i, c2114y, str2, str4, C2547i.m5967L(arrayList, obj2, str3)));
                        }
                    }
                    c3959f2 = C3967n.f12976a;
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Throwable thM8182b3 = C3960g.m8182b(c3959f2);
                if (thM8182b3 != null) {
                    c2547i.f8253b.invoke("复读语音准备失败", thM8182b3);
                    return;
                }
                return;
            case 3:
                C3490k c3490k = (C3490k) this.f1515k;
                Handler handler = (Handler) this.f1512h;
                Activity activity3 = (Activity) this.f1513i;
                ArrayList arrayList2 = (ArrayList) this.f1516l;
                C0126e c0126e = (C0126e) this.f1517m;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f1514j;
                try {
                    List listM7308v = C3490k.m7308v();
                    c3490k.f11347r = new C3485f(listM7308v, System.currentTimeMillis());
                    c3959f3 = listM7308v;
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                handler.post(new RunnableC0496w(activity3, c3490k, arrayList2, c3959f3, c0126e, interfaceC1231l4));
                return;
            case 4:
                Activity activity4 = (Activity) this.f1513i;
                C3490k c3490k2 = (C3490k) this.f1515k;
                Set set = c3490k2.f11341l;
                ArrayList arrayList3 = (ArrayList) this.f1512h;
                Object obj3 = this.f1516l;
                C0126e c0126e2 = (C0126e) this.f1517m;
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f1514j;
                if (activity4.isFinishing()) {
                    C3490k.m7298e(arrayList3);
                    set.remove(activity4);
                    return;
                }
                if (!(obj3 instanceof C3959f)) {
                    c3490k2.m7319K(activity4, arrayList3, (List) obj3, c0126e2, interfaceC1231l5);
                }
                if (C3960g.m8182b(obj3) != null) {
                    C3490k.m7298e(arrayList3);
                    set.remove(activity4);
                    C3490k.m7295N(activity4, "联系人列表不可用");
                    return;
                }
                return;
            case 5:
                String str5 = (String) this.f1516l;
                C4291b c4291b = (C4291b) this.f1514j;
                C3315t c3315t = (C3315t) this.f1515k;
                C4292c c4292c = (C4292c) this.f1512h;
                C2351o c2351o = (C2351o) this.f1517m;
                C4293d c4293d = (C4293d) this.f1513i;
                if (str5 != null) {
                    if (!c4292c.f14262t || c4291b.m8620m(c4293d, "refuse", null)) {
                        return;
                    }
                    c4291b.m7750e("自动退回失败: ".concat(str5), null);
                    return;
                }
                String str6 = c4292c.f14249g;
                if (str6.equals("default")) {
                    c4291b.m8619k(c4292c, c2351o, c4293d, null);
                    return;
                }
                C4295f c4295fM8625d = (AbstractC3149m.m6721t0(str6) || str6.equals("default")) ? null : C4296g.m8625d(str6, C4296g.m8627g((Context) c3315t.f10677h));
                if (c4295fM8625d != null) {
                    c4291b.m8619k(c4292c, c2351o, c4293d, c4295fM8625d);
                    return;
                }
                WeChatApis.payment().getClass();
                C2911c c2911c = WeChatApis.transferApi;
                if (c2911c == null || !c2911c.f9404a.hasTransferQueryApi()) {
                    c4291b.m8619k(c4292c, c2351o, c4293d, null);
                    return;
                }
                String str7 = c4293d.f14269a;
                String str8 = c4293d.f14270b;
                int i12 = c4293d.f14273e;
                String str9 = c2351o.f7715c;
                str9.getClass();
                String str10 = AbstractC3156t.m6733W(str9, "@chatroom", false) ? c2351o.f7715c : HttpUrl.FRAGMENT_ENCODE_SET;
                str10.getClass();
                String str11 = c4293d.f14277i;
                C0886p c0886p = new C0886p(str6, c2351o, c3315t, c4291b, c4292c, c4293d);
                if (AbstractC3149m.m6721t0(str7) || AbstractC3149m.m6721t0(str8) || (cls = c2911c.f9404a.transferQueryClass) == null) {
                    i9 = 0;
                } else {
                    synchronized (c2911c) {
                        if (c2911c.f9408e) {
                            zBooleanValue = true;
                            i10 = 0;
                        } else {
                            Method method = c2911c.f9404a.transferQueryResponseMethod;
                            if (method != null) {
                                i10 = 0;
                                try {
                                    C3744i.f12154b.m7763b(method, new C0219e(c2911c, 18));
                                    c2911c.f9408e = true;
                                    c3959f4 = Boolean.TRUE;
                                } catch (Throwable th5) {
                                    c3959f4 = new C3959f(th5);
                                }
                                Throwable thM8182b4 = C3960g.m8182b(c3959f4);
                                if (thM8182b4 != null) {
                                    c2911c.m6317e("转账查询响应 Hook 失败: " + thM8182b4.getMessage());
                                    c3959f4 = Boolean.FALSE;
                                }
                                zBooleanValue = ((Boolean) c3959f4).booleanValue();
                            } else {
                                i10 = 0;
                                zBooleanValue = false;
                            }
                        }
                        break;
                    }
                    if (zBooleanValue) {
                        Integer numValueOf = Integer.valueOf(i10);
                        List<Constructor<?>> listDeclaredConstructors = KavaReflector.declaredConstructors(cls);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = listDeclaredConstructors.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            Integer num = numValueOf;
                            Class<?>[] parameterTypes = ((Constructor) next2).getParameterTypes();
                            Iterator it3 = it2;
                            int length = parameterTypes.length;
                            if (((5 <= length && length < 7 && C2911c.m6315d(parameterTypes[i10]) && AbstractC1416l.m3825a(parameterTypes[1], String.class) && AbstractC1416l.m3825a(parameterTypes[2], String.class) && C2911c.m6315d(parameterTypes[3]) && AbstractC1416l.m3825a(parameterTypes[4], String.class) && (parameterTypes.length == 5 || AbstractC1416l.m3825a(parameterTypes[5], String.class))) ? 1 : i10) != 0) {
                                arrayList4.add(next2);
                            }
                            it2 = it3;
                            numValueOf = num;
                        }
                        Integer num2 = numValueOf;
                        Iterator it4 = arrayList4.iterator();
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (it4.hasNext()) {
                                Integer numValueOf2 = Integer.valueOf(((Constructor) next).getParameterTypes().length);
                                do {
                                    Object next3 = it4.next();
                                    Integer numValueOf3 = Integer.valueOf(((Constructor) next3).getParameterTypes().length);
                                    if (numValueOf2.compareTo(numValueOf3) < 0) {
                                        next = next3;
                                        numValueOf2 = numValueOf3;
                                    }
                                } while (it4.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        Constructor constructor = (Constructor) next;
                        if (constructor != null) {
                            if (constructor.getParameterTypes().length == 6) {
                                objArr = new Object[6];
                                objArr[i10] = num2;
                                objArr[1] = str7;
                                objArr[2] = str8;
                                objArr[3] = Integer.valueOf(i12);
                                objArr[4] = str10;
                                objArr[5] = str11;
                            } else {
                                objArr = new Object[5];
                                objArr[i10] = num2;
                                objArr[1] = str7;
                                objArr[2] = str8;
                                objArr[3] = Integer.valueOf(i12);
                                objArr[4] = str10;
                            }
                            c2911c.m6317e("构造转账查询请求: transactionId=" + (!AbstractC3149m.m6721t0(str7)) + " transId=" + (!AbstractC3149m.m6721t0(str8)) + " args=" + constructor.getParameterTypes().length);
                            try {
                                c3959f5 = KavaReflector.newInstance(constructor, Arrays.copyOf(objArr, objArr.length));
                            } catch (Throwable th6) {
                                c3959f5 = new C3959f(th6);
                            }
                            Throwable thM8182b5 = C3960g.m8182b(c3959f5);
                            if (thM8182b5 != null) {
                                c2911c.m6317e("构造转账查询请求失败: " + thM8182b5.getMessage());
                                c3959f5 = null;
                            }
                            if (c3959f5 == null) {
                            }
                            break;
                        } else {
                            c3959f5 = null;
                            if (c3959f5 == null) {
                                Map map = c2911c.f9407d;
                                map.getClass();
                                map.put(c3959f5, c0886p);
                                c2911c.f9406c.postDelayed(new RunnableC0006d(c2911c, 24, c3959f5), 7000L);
                                if ((c2911c.f9405b.m6216j(c3959f5) ? 1 : i10) != 0) {
                                    i11 = 1;
                                    i9 = i11;
                                } else {
                                    c2911c.f9407d.remove(c3959f5);
                                    i11 = i10;
                                    i9 = i11;
                                }
                            }
                        }
                    } else {
                        i11 = i10;
                        i9 = i11;
                    }
                }
                if (i9 == 0) {
                    c4291b.m8619k(c4292c, c2351o, c4293d, null);
                    return;
                }
                return;
            case 6:
                C1941n0 c1941n0 = (C1941n0) this.f1514j;
                EnumC4243m enumC4243m = (EnumC4243m) this.f1515k;
                List list = (List) this.f1512h;
                C1926g c1926g = (C1926g) this.f1516l;
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) this.f1517m;
                InterfaceC2760d interfaceC2760d = (InterfaceC2760d) this.f1513i;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
                    C4651b c4651b = abstractC4655fM9129j instanceof C4651b ? (C4651b) abstractC4655fM9129j : null;
                    if (c4651b == null || (c4651bMo9085C = c4651b.mo9085C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        AbstractC4655f abstractC4655fM9110j = c4651bMo9085C.m9110j();
                        try {
                            C1941n0 c1941n0M4790h = AbstractC1923e0.m4790h(c1941n0, enumC4243m);
                            if (list == null) {
                                list = C4173t.f13710g;
                            }
                            C0289k c0289k = new C0289k(c1926g, c1941n0M4790h, list, interfaceC4233c, interfaceC2760d);
                            c0289k.mo1194c();
                            c0289k.mo1193b();
                            AbstractC4655f.m9106q(abstractC4655fM9110j);
                            c4651bMo9085C.mo9091w().mo9114d();
                            return;
                        } finally {
                            AbstractC4655f.m9106q(abstractC4655fM9110j);
                        }
                    } finally {
                    }
                } finally {
                    Trace.endSection();
                }
            default:
                C5724q.m10334F((AtomicBoolean) this.f1512h, (AtomicReference) this.f1514j, (AtomicReference) this.f1515k, (CountDownLatch) this.f1516l, (AtomicReference) this.f1517m, (AtomicReference) this.f1513i, Opcodes.CHECKCAST);
                return;
        }
    }

    public /* synthetic */ RunnableC0496w(InterfaceC1231l interfaceC1231l, AtomicBoolean atomicBoolean, String str, InterfaceC5059kv interfaceC5059kv, Activity activity, InterfaceC1231l interfaceC1231l2) {
        this.f1514j = interfaceC1231l;
        this.f1512h = atomicBoolean;
        this.f1516l = str;
        this.f1517m = interfaceC5059kv;
        this.f1513i = activity;
        this.f1515k = interfaceC1231l2;
    }

    public /* synthetic */ RunnableC0496w(C1941n0 c1941n0, EnumC4243m enumC4243m, List list, C1926g c1926g, InterfaceC4233c interfaceC4233c, InterfaceC2760d interfaceC2760d) {
        this.f1514j = c1941n0;
        this.f1515k = enumC4243m;
        this.f1512h = list;
        this.f1516l = c1926g;
        this.f1517m = interfaceC4233c;
        this.f1513i = interfaceC2760d;
    }

    public /* synthetic */ RunnableC0496w(String str, C2351o c2351o, C3315t c3315t, C4291b c4291b, C4292c c4292c, C4293d c4293d) {
        this.f1516l = str;
        this.f1514j = c4291b;
        this.f1515k = c3315t;
        this.f1512h = c4292c;
        this.f1517m = c2351o;
        this.f1513i = c4293d;
    }

    public /* synthetic */ RunnableC0496w(AtomicBoolean atomicBoolean, Activity activity, Object obj, InterfaceC1231l interfaceC1231l, C0517e0 c0517e0, C3370v c3370v) {
        this.f1512h = atomicBoolean;
        this.f1513i = activity;
        this.f1515k = obj;
        this.f1514j = interfaceC1231l;
        this.f1516l = c0517e0;
        this.f1517m = c3370v;
    }

    public /* synthetic */ RunnableC0496w(AtomicBoolean atomicBoolean, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch, AtomicReference atomicReference3, AtomicReference atomicReference4) {
        this.f1512h = atomicBoolean;
        this.f1514j = atomicReference;
        this.f1515k = atomicReference2;
        this.f1516l = countDownLatch;
        this.f1517m = atomicReference3;
        this.f1513i = atomicReference4;
    }

    public /* synthetic */ RunnableC0496w(C2547i c2547i, WeChatMessage weChatMessage, WeChatMessage[] weChatMessageArr, C2114y c2114y, Object obj, String str) {
        this.f1514j = c2547i;
        this.f1515k = weChatMessage;
        this.f1512h = weChatMessageArr;
        this.f1517m = c2114y;
        this.f1513i = obj;
        this.f1516l = str;
    }

    public /* synthetic */ RunnableC0496w(C3490k c3490k, Handler handler, Activity activity, ArrayList arrayList, C0126e c0126e, InterfaceC1231l interfaceC1231l) {
        this.f1515k = c3490k;
        this.f1512h = handler;
        this.f1513i = activity;
        this.f1516l = arrayList;
        this.f1517m = c0126e;
        this.f1514j = interfaceC1231l;
    }
}
