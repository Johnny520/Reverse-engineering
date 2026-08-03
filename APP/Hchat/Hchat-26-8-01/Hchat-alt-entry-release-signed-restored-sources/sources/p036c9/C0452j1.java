package p036c9;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0107l;
import bi.AbstractC0316d;
import bi.C0314b;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p015b0.C0145k;
import p015b0.C0151q;
import p015b0.C0152r;
import p015b0.C0153s;
import p025bc.AbstractC0255e;
import p028c1.AbstractC0378h;
import p068eh.AbstractC0921a;
import p071f1.AbstractC0996c0;
import p071f1.C1030t0;
import p071f1.C1034w;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p102h2.EnumC1571a;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p119i2.C1941n0;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p144k.AbstractC2192n;
import p177m2.C2767k;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3241o;
import p222p.AbstractC3253s;
import p222p.C3213e1;
import p222p.C3248q0;
import p222p.C3256t;
import p234q.AbstractC3418a;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3959f;
import p276sf.C3960g;
import p280t2.C4095k;
import p306v.AbstractC4360e;
import p308v1.InterfaceC4412n0;
import p321w.AbstractC4604i;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5891i0;
import p357y1.C5868c1;
import p357y1.C5928r1;
import sh.AbstractC4045s;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: c9.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0452j1 {

    /* JADX INFO: renamed from: a */
    public static final C0452j1 f1326a = new C0452j1();

    /* JADX INFO: renamed from: b */
    public static final Map f1327b = AbstractC3199a.m6843p();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final void m1452m(AbstractC0473o2 abstractC0473o2, Activity activity, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, Set set) {
        boolean z9 = (abstractC0473o2 instanceof C0440g1) && set.contains(((C0440g1) abstractC0473o2).f1296b);
        boolean zM1481e = AbstractC0473o2.m1481e(activity, set);
        m1455p(activity, zM1481e ? "聊天分组已删除" : "删除聊天分组失败");
        if (zM1481e) {
            m1453n(interfaceC1220a2);
            if (z9) {
                interfaceC1220a.invoke();
            } else {
                m1454o(activity, abstractC0473o2, interfaceC1809a1, interfaceC1809a12, interfaceC1809a13);
                interfaceC1809a14.setValue(EnumC0432e1.f1269h);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m1453n(InterfaceC1220a interfaceC1220a) {
        Object c3959f;
        try {
            c3959f = interfaceC1220a.invoke();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:ConversationGroup] 刷新聊天分组失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final void m1454o(Activity activity, AbstractC0473o2 abstractC0473o2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        interfaceC1809a1.setValue(AbstractC0473o2.m1485i(activity));
        interfaceC1809a12.setValue(m1456s(abstractC0473o2, (List) interfaceC1809a1.getValue()));
        Set set = (Set) interfaceC1809a13.getValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            String str = (String) obj;
            List list = (List) interfaceC1809a1.getValue();
            boolean z9 = false;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC1416l.m3825a(((C0414a) it.next()).f1179a, str)) {
                            z9 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z9) {
                linkedHashSet.add(obj);
            }
        }
        interfaceC1809a13.setValue(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final void m1455p(Activity activity, String str) {
        Toast.makeText(activity, str, 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m1456s(AbstractC0473o2 abstractC0473o2, List list) {
        Object next;
        if (abstractC0473o2 instanceof C0436f1) {
            return AbstractC0473o2.m1480d(((C0436f1) abstractC0473o2).f1288b, list);
        }
        if (!(abstractC0473o2 instanceof C0440g1)) {
            C3193a.m6822k();
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((C0414a) next).f1179a, ((C0440g1) abstractC0473o2).f1296b)) {
                break;
            }
        }
        C0414a c0414a = (C0414a) next;
        if (c0414a != null) {
            return c0414a.f1181c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static ArrayList m1457t(List list) {
        ArrayList arrayListM1488l = AbstractC0473o2.m1488l(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayListM1488l) {
            String str = ((C0414a) obj).f1181c;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        m1458u(linkedHashMap, new HashSet(), arrayList2, null, 0, C4173t.f13710g);
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final void m1458u(LinkedHashMap linkedHashMap, HashSet hashSet, ArrayList arrayList, String str, int i9, List list) {
        HashSet hashSet2;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap2;
        Iterable iterable = (List) linkedHashMap.get(str);
        if (iterable == null) {
            iterable = C4173t.f13710g;
        }
        for (C0414a c0414a : AbstractC4166m.m8402K1(iterable, new C0444h1(0))) {
            String str2 = c0414a.f1179a;
            String str3 = c0414a.f1180b;
            if (hashSet.add(str2)) {
                ArrayList arrayListM8398G1 = AbstractC4166m.m8398G1(list, str3);
                arrayList.add(new C0424c1(i9, c0414a.f1179a, str3, AbstractC4166m.m8392A1(arrayListM8398G1, " / ", null, null, null, 62)));
                hashSet2 = hashSet;
                arrayList2 = arrayList;
                linkedHashMap2 = linkedHashMap;
                m1458u(linkedHashMap2, hashSet2, arrayList2, c0414a.f1179a, i9 + 1, arrayListM8398G1);
            } else {
                linkedHashMap2 = linkedHashMap;
                hashSet2 = hashSet;
                arrayList2 = arrayList;
            }
            linkedHashMap = linkedHashMap2;
            hashSet = hashSet2;
            arrayList = arrayList2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1459v(Activity activity, String str, InterfaceC1220a interfaceC1220a) {
        Object next;
        Object c0440g1;
        Object obj;
        InterfaceC0428d1 c0448i1;
        activity.getClass();
        str.getClass();
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string) || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (!AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            activity.runOnUiThread(new RunnableC0059l(5, activity, interfaceC1220a, string));
            return;
        }
        if (C0429d2.m1438q(string)) {
            Iterator it = AbstractC0473o2.m1485i(activity).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (C0429d2.m1421F(((C0414a) next).f1179a).equals(string)) {
                        break;
                    }
                }
            }
            C0414a c0414a = (C0414a) next;
            if (c0414a == null) {
                Toast.makeText(activity, "聊天分组不存在", 0).show();
                obj = null;
                if (obj == null) {
                    Map map = f1327b;
                    InterfaceC0428d1 interfaceC0428d1 = (InterfaceC0428d1) map.remove(activity);
                    if (interfaceC0428d1 != null) {
                        interfaceC0428d1.close();
                    }
                    C3874d c3874d = new C3874d(1358702910, new C0455k0((Object) activity, string, obj, (Object) interfaceC1220a, 1), true);
                    Window window = activity.getWindow();
                    View decorView = window != null ? window.getDecorView() : null;
                    ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                    if (viewGroup != null) {
                        C0416a1 c0416a1 = new C0416a1(0);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        FrameLayout frameLayout = new FrameLayout(activity);
                        frameLayout.setBackgroundColor(0);
                        frameLayout.setClickable(true);
                        frameLayout.setFocusable(true);
                        frameLayout.setFocusableInTouchMode(true);
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        AbstractC5700d.m10251H(viewGroup, c0416a1, c0416a1, c0416a1, c0416a1);
                        AbstractC5700d.m10251H(frameLayout, c0416a1, c0416a1, c0416a1, c0416a1);
                        if (!c0416a1.f1198l) {
                            c0416a1.f1195i.m7017F(Bundle.EMPTY);
                            c0416a1.f1198l = true;
                        }
                        C0114s c0114s = c0416a1.f1194h;
                        c0114s.m554c("setCurrentState");
                        c0114s.m556e(EnumC0107l.f291i);
                        c0114s.m554c("setCurrentState");
                        c0114s.m556e(EnumC0107l.f292j);
                        c0114s.m554c("setCurrentState");
                        c0114s.m556e(EnumC0107l.f293k);
                        C1425u c1425u = new C1425u();
                        C0475p0 c0475p0 = new C0475p0(atomicBoolean, activity, c0416a1, frameLayout, viewGroup, c1425u, 0);
                        C5868c1 c5868c1 = new C5868c1(activity);
                        AbstractC5700d.m10251H(c5868c1, c0416a1, c0416a1, c0416a1, c0416a1);
                        c5868c1.setViewCompositionStrategy(C5928r1.f24042h);
                        c5868c1.setContent(new C3874d(340971526, new C0479q0(c0416a1, activity, c3874d, c0475p0, 0), true));
                        c1425u.f4738g = c5868c1;
                        frameLayout.addView(c5868c1, new FrameLayout.LayoutParams(-1, -1));
                        viewGroup.addView(frameLayout);
                        frameLayout.requestFocus();
                        c0448i1 = new C0448i1(c0475p0, atomicBoolean);
                    } else {
                        c0448i1 = C0420b1.f1204a;
                    }
                    if (c0448i1.mo1413a()) {
                        map.put(activity, c0448i1);
                        return;
                    }
                    return;
                }
                return;
            }
            c0440g1 = new C0440g1(c0414a.f1179a);
        } else {
            c0440g1 = new C0436f1(string);
        }
        obj = c0440g1;
        if (obj == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1460a(int i9, int i10, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, String str, String str2, boolean z9) {
        int i11;
        boolean z10;
        C1876r1 c1876r1M4557t;
        long jM2634b;
        c1836h0.m4527b0(838758014);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4534f(str) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h0.m4534f(str2) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128;
        }
        int i12 = i10 & 8;
        if (i12 == 0) {
            if ((i9 & 3072) == 0) {
                z10 = z9;
                i11 |= c1836h0.m4536g(z10) ? Opcodes.ACC_STRICT : 1024;
            }
            if (c1836h0.m4516S(i11 & 1, (i11 & 1171) == 1170)) {
                c1836h0.m4519V();
            } else {
                boolean z11 = i12 != 0 ? true : z10;
                C5850l c5850l = C5850l.f23787a;
                float f3 = 10;
                boolean z12 = z11;
                InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC2192n.m5433j(AbstractC0378h.m1337b(AbstractC3222h1.m6901d(c5850l, 1.0f), AbstractC4360e.m8800a(f3)), z11, null, null, interfaceC1220a, 14), f3, 11);
                C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.f10298a, C5840b.f23771q, c1836h0, 48);
                int iHashCode = Long.hashCode(c1836h0.f6095T);
                C3878h c3878hM4546l = c1836h0.m4546l();
                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6883m);
                InterfaceC5605g.f22815f.getClass();
                C5660y c5660y = C5601f.f22758b;
                c1836h0.m4531d0();
                if (c1836h0.f6094S) {
                    c1836h0.m4544k(c5660y);
                } else {
                    c1836h0.m4551n0();
                }
                C5597e c5597e = C5601f.f22761e;
                AbstractC1874r.m4615A(c5597e, c1836h0, c3213e1M6892a);
                C5597e c5597e2 = C5601f.f22760d;
                AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l);
                Integer numValueOf = Integer.valueOf(iHashCode);
                C5597e c5597e3 = C5601f.f22762f;
                AbstractC1874r.m4615A(c5597e3, c1836h0, numValueOf);
                C5593d c5593d = C5601f.f22763g;
                AbstractC1874r.m4641w(c5593d, c1836h0);
                C5597e c5597e4 = C5601f.f22759c;
                AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c);
                if (1.0f <= 0.0d) {
                    AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                }
                C3248q0 c3248q0 = new C3248q0(1.0f, true);
                C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h0, 0);
                int iHashCode2 = Long.hashCode(c1836h0.f6095T);
                C3878h c3878hM4546l2 = c1836h0.m4546l();
                InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h0, c3248q0);
                c1836h0.m4531d0();
                if (c1836h0.f6094S) {
                    c1836h0.m4544k(c5660y);
                } else {
                    c1836h0.m4551n0();
                }
                AbstractC1874r.m4615A(c5597e, c1836h0, c3256tM6935a);
                AbstractC1874r.m4615A(c5597e2, c1836h0, c3878hM4546l2);
                AbstractC2091b.m5169p(iHashCode2, c1836h0, c5597e3, c1836h0, c5593d);
                AbstractC1874r.m4615A(c5597e4, c1836h0, interfaceC5853oM10543c2);
                if (z12) {
                    c1836h0.m4525a0(-83009554);
                    jM2634b = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1237g();
                    c1836h0.m4553p(false);
                } else {
                    c1836h0.m4525a0(-82923622);
                    jM2634b = C1034w.m2634b(((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1237g(), 0.38f);
                    c1836h0.m4553p(false);
                }
                AbstractC4045s.m8250n(str, null, jM2634b, AbstractC5700d.m10248D(15), C2767k.f9000j, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, (i11 & 14) | 1597440, 0, 262058);
                AbstractC4045s.m8250n(str2, AbstractC3208d.m6886p(c5850l, 0.0f, 2, 0.0f, 0.0f, 13), C1034w.m2634b(((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1238h(), z12 ? 1.0f : 0.45f), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, ((i11 >> 3) & 14) | 24624, 0, 262120);
                c1836h0.m4553p(true);
                c1836h0.m4553p(true);
                z10 = z12;
            }
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t == null) {
                c1876r1M4557t.f6241d = new C0459l0(this, str, str2, interfaceC1220a, z10, i9, i10);
                return;
            }
            return;
        }
        i11 |= 3072;
        z10 = z9;
        if (c1836h0.m4516S(i11 & 1, (i11 & 1171) == 1170)) {
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1461b(List list, String str, String str2, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, C1836h0 c1836h0, int i9) {
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(820144010);
        int i10 = i9 | (c1836h02.m4534f(list) ? 4 : 2) | (c1836h02.m4534f(str) ? 32 : 16) | (c1836h02.m4534f(str2) ? Opcodes.ACC_NATIVE : 128) | (c1836h02.m4538h(interfaceC1231l) ? Opcodes.ACC_STRICT : 1024) | (c1836h02.m4538h(interfaceC1231l2) ? 16384 : 8192) | (c1836h02.m4538h(interfaceC1220a) ? Opcodes.ACC_DEPRECATED : 65536) | (c1836h02.m4538h(interfaceC1220a2) ? 1048576 : 524288);
        if (c1836h02.m4516S(i10 & 1, (599187 & i10) != 599186)) {
            boolean z9 = (i10 & 14) == 4;
            Object objM4514P = c1836h02.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z9 || objM4514P == c1823e) {
                objM4514P = m1457t(list);
                c1836h02.m4545k0(objM4514P);
            }
            List list2 = (List) objM4514P;
            C5850l c5850l = C5850l.f23787a;
            InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 580, 1);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6904g);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, c3256tM6935a);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
            C0452j1 c0452j1 = f1326a;
            c0452j1.m1473r("添加聊天分组", c1836h02, 54);
            int i11 = i10 >> 3;
            c0452j1.m1466g((i11 & 896) | (i11 & 14) | 24624, 8, interfaceC1231l, c1836h02, str, "分组名称", null);
            float f3 = 4;
            AbstractC4045s.m8250n("上级分组", AbstractC3208d.m6886p(c5850l, f3, 12, 0.0f, f3, 4), ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24630, 0, 262120);
            InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            InterfaceC5853o interfaceC5853oM6904g2 = AbstractC3222h1.m6904g(interfaceC5853oM6901d.mo10549d(new C3248q0(1.0f, false)), 0.0f, 280, 1);
            boolean zM4538h = ((i10 & 896) == 256) | ((57344 & i10) == 16384) | c1836h0.m4538h(list2);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4538h || objM4514P2 == c1823e) {
                objM4514P2 = new C0503y0(list2, str2, interfaceC1231l2, 0);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC0000a.m53b(interfaceC5853oM6904g2, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h0, 0, 510);
            c0452j1.m1465f(interfaceC1220a, "添加", interfaceC1220a2, false, c1836h0, ((i10 >> 12) & 112) | 196998 | ((i10 >> 9) & 7168), 16);
            c1836h02 = c1836h0;
            c1836h02.m4553p(true);
        } else {
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0427d0(this, list, str, str2, interfaceC1231l, interfaceC1231l2, interfaceC1220a, interfaceC1220a2, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1462c(String str, String str2, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, C1836h0 c1836h0, int i9) {
        String str3;
        int i10;
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(1143552259);
        if ((i9 & 6) == 0) {
            str3 = str;
            i10 = i9 | (c1836h02.m4534f(str3) ? 4 : 2);
        } else {
            str3 = str;
            i10 = i9;
        }
        int i11 = i10 | (c1836h02.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128) | (c1836h02.m4538h(interfaceC1220a2) ? Opcodes.ACC_STRICT : 1024);
        if (c1836h02.m4516S(i11 & 1, (i11 & 1171) != 1170)) {
            C5850l c5850l = C5850l.f23787a;
            InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6901d);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, c3256tM6935a);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
            AbstractC4045s.m8250n(str3, AbstractC3208d.m6884n(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 1), ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, (i11 & 14) | 24624, 0, 262120);
            c1836h02 = c1836h0;
            f1326a.m1465f(interfaceC1220a, str2, interfaceC1220a2, false, c1836h02, ((i11 >> 3) & 112) | 196998 | (i11 & 7168), 16);
            c1836h02.m4553p(true);
        } else {
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0423c0(this, str, str2, interfaceC1220a, interfaceC1220a2, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1463d(List list, Set set, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, C1836h0 c1836h0, int i9) {
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(571194583);
        int i10 = i9 | (c1836h02.m4534f(list) ? 4 : 2) | (c1836h02.m4534f(set) ? 32 : 16) | (c1836h02.m4538h(interfaceC1231l) ? Opcodes.ACC_NATIVE : 128) | (c1836h02.m4538h(interfaceC1220a) ? Opcodes.ACC_STRICT : 1024) | (c1836h02.m4538h(interfaceC1220a2) ? 16384 : 8192);
        if (c1836h02.m4516S(i10 & 1, (i10 & 9363) != 9362)) {
            boolean z9 = (i10 & 14) == 4;
            Object objM4514P = c1836h02.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z9 || objM4514P == c1823e) {
                objM4514P = m1457t(list);
                c1836h02.m4545k0(objM4514P);
            }
            List list2 = (List) objM4514P;
            C5850l c5850l = C5850l.f23787a;
            InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 580, 1);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6904g);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, c3256tM6935a);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
            C0452j1 c0452j1 = f1326a;
            c0452j1.m1473r("删除多个", c1836h02, 54);
            AbstractC4045s.m8250n(AbstractC0921a.m2250m(set.size(), "已选择 ", " 个分组"), AbstractC3208d.m6886p(c5850l, 0.0f, 0.0f, 0.0f, 6, 7), ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24624, 0, 262120);
            InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            InterfaceC5853o interfaceC5853oM6904g2 = AbstractC3222h1.m6904g(interfaceC5853oM6901d.mo10549d(new C3248q0(1.0f, false)), 0.0f, 380, 1);
            boolean zM4538h = c1836h0.m4538h(list2) | ((i10 & 112) == 32) | ((i10 & 896) == 256);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4538h || objM4514P2 == c1823e) {
                objM4514P2 = new C0153s(list2, set, interfaceC1231l, 4);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC0000a.m53b(interfaceC5853oM6904g2, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h0, 0, 510);
            c1836h02 = c1836h0;
            c0452j1.m1465f(interfaceC1220a, "继续", interfaceC1220a2, false, c1836h02, ((i10 >> 6) & 112) | 196998 | ((i10 >> 3) & 7168), 16);
            c1836h02.m4553p(true);
        } else {
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0506z0(this, list, set, interfaceC1231l, interfaceC1220a, interfaceC1220a2, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1464e(String str, InterfaceC1220a interfaceC1220a, InterfaceC5853o interfaceC5853o, boolean z9, C1836h0 c1836h0, int i9, int i10) {
        String str2;
        int i11;
        boolean z10;
        boolean z11;
        C1876r1 c1876r1M4557t;
        long jM1241k;
        long jM1237g;
        c1836h0.m4527b0(-29943864);
        if ((i9 & 6) == 0) {
            str2 = str;
            i11 = (c1836h0.m4534f(str2) ? 4 : 2) | i9;
        } else {
            str2 = str;
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1220a) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c1836h0.m4534f(interfaceC5853o) ? Opcodes.ACC_NATIVE : 128;
        }
        int i12 = i10 & 8;
        if (i12 == 0) {
            if ((i9 & 3072) == 0) {
                z10 = z9;
                i11 |= c1836h0.m4536g(z10) ? Opcodes.ACC_STRICT : 1024;
            }
            if (c1836h0.m4516S(i11 & 1, (i11 & 1171) == 1170)) {
                c1836h0.m4519V();
                z11 = z10;
            } else {
                boolean z12 = i12 != 0 ? false : z10;
                InterfaceC5853o interfaceC5853oM1337b = AbstractC0378h.m1337b(AbstractC3222h1.m6904g(interfaceC5853o, 44, 0.0f, 2), AbstractC4360e.m8800a(10));
                if (z12) {
                    c1836h0.m4525a0(1295894764);
                    jM1241k = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1240j();
                    c1836h0.m4553p(false);
                } else {
                    c1836h0.m4525a0(1295978371);
                    jM1241k = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1241k();
                    c1836h0.m4553p(false);
                }
                InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC2192n.m5433j(AbstractC2192n.m5430g(interfaceC5853oM1337b, jM1241k, AbstractC0996c0.f3162b), false, null, null, interfaceC1220a, 15), 6, 8);
                InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23765k, false);
                int iHashCode = Long.hashCode(c1836h0.f6095T);
                C3878h c3878hM4546l = c1836h0.m4546l();
                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h0, interfaceC5853oM6883m);
                InterfaceC5605g.f22815f.getClass();
                C5660y c5660y = C5601f.f22758b;
                c1836h0.m4531d0();
                if (c1836h0.f6094S) {
                    c1836h0.m4544k(c5660y);
                } else {
                    c1836h0.m4551n0();
                }
                AbstractC1874r.m4615A(C5601f.f22761e, c1836h0, interfaceC4412n0M6930d);
                AbstractC1874r.m4615A(C5601f.f22760d, c1836h0, c3878hM4546l);
                AbstractC1874r.m4615A(C5601f.f22762f, c1836h0, Integer.valueOf(iHashCode));
                AbstractC1874r.m4641w(C5601f.f22763g, c1836h0);
                AbstractC1874r.m4615A(C5601f.f22759c, c1836h0, interfaceC5853oM10543c);
                if (z12) {
                    c1836h0.m4525a0(457117668);
                    c1836h0.m4553p(false);
                    jM1237g = C1034w.f3259c;
                } else {
                    c1836h0.m4525a0(457202732);
                    jM1237g = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1237g();
                    c1836h0.m4553p(false);
                }
                AbstractC4045s.m8250n(str2, null, jM1237g, AbstractC5700d.m10248D(13), C2767k.f9000j, null, 0L, new C4095k(3), 0L, 0, false, 0, 0, null, null, c1836h0, (i11 & 14) | 1597440, 0, 261034);
                c1836h0.m4553p(true);
                z11 = z12;
            }
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t == null) {
                c1876r1M4557t.f6241d = new C0435f0(this, str, interfaceC1220a, interfaceC5853o, z11, i9, i10, 1);
                return;
            }
            return;
        }
        i11 |= 3072;
        z10 = z9;
        if (c1836h0.m4516S(i11 & 1, (i11 & 1171) == 1170)) {
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1465f(InterfaceC1220a interfaceC1220a, String str, InterfaceC1220a interfaceC1220a2, boolean z9, C1836h0 c1836h0, int i9, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        C1876r1 c1876r1M4557t;
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(-92809835);
        if ((i9 & 6) == 0) {
            i11 = (c1836h02.m4534f("取消") ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h02.m4538h(interfaceC1220a) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c1836h02.m4534f(str) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c1836h02.m4538h(interfaceC1220a2) ? Opcodes.ACC_STRICT : 1024;
        }
        int i13 = i10 & 16;
        if (i13 == 0) {
            if ((i9 & 24576) == 0) {
                z10 = z9;
                i11 |= c1836h02.m4536g(z10) ? 16384 : 8192;
            }
            i12 = i11;
            if (c1836h02.m4516S(i12 & 1, (i12 & 9363) == 9362)) {
                c1836h02.m4519V();
                z11 = z10;
            } else {
                boolean z12 = i13 != 0 ? true : z10;
                InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 0.0f, 10, 0.0f, 4, 5);
                C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.m6921g(8), C5840b.f23770p, c1836h02, 6);
                int iHashCode = Long.hashCode(c1836h02.f6095T);
                C3878h c3878hM4546l = c1836h02.m4546l();
                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6886p);
                InterfaceC5605g.f22815f.getClass();
                C5660y c5660y = C5601f.f22758b;
                c1836h02.m4531d0();
                if (c1836h02.f6094S) {
                    c1836h02.m4544k(c5660y);
                } else {
                    c1836h02.m4551n0();
                }
                AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, c3213e1M6892a);
                AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
                AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
                AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
                AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
                if (1.0f <= 0.0d) {
                    AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                }
                C0452j1 c0452j1 = f1326a;
                c0452j1.m1464e("取消", interfaceC1220a, new C3248q0(1.0f, true), false, c1836h02, (i12 & 14) | 24576 | (i12 & 112), 8);
                if (1.0f <= 0.0d) {
                    AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                }
                int i14 = i12 >> 6;
                c1836h02 = c1836h0;
                z11 = z12;
                c0452j1.m1464e(str, interfaceC1220a2, new C3248q0(1.0f, true), z11, c1836h02, (i14 & 112) | (i14 & 14) | 24576 | ((i12 >> 3) & 7168), 0);
                c1836h02.m4553p(true);
            }
            c1876r1M4557t = c1836h02.m4557t();
            if (c1876r1M4557t == null) {
                c1876r1M4557t.f6241d = new C0435f0(this, interfaceC1220a, str, interfaceC1220a2, z11, i9, i10);
                return;
            }
            return;
        }
        i11 |= 24576;
        z10 = z9;
        i12 = i11;
        if (c1836h02.m4516S(i12 & 1, (i12 & 9363) == 9362)) {
        }
        c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1466g(int i9, int i10, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, String str, String str2, InterfaceC5853o interfaceC5853o) {
        int i11;
        InterfaceC5853o interfaceC5853o2;
        InterfaceC5853o interfaceC5853o3;
        C1876r1 c1876r1M4557t;
        c1836h0.m4527b0(85511746);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4534f(str) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h0.m4534f(str2) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_NATIVE : 128;
        }
        int i12 = i10 & 8;
        if (i12 == 0) {
            if ((i9 & 3072) == 0) {
                interfaceC5853o2 = interfaceC5853o;
                i11 |= c1836h0.m4534f(interfaceC5853o2) ? Opcodes.ACC_STRICT : 1024;
            }
            if (c1836h0.m4516S(i11 & 1, (i11 & 1171) == 1170)) {
                c1836h0.m4519V();
                interfaceC5853o3 = interfaceC5853o2;
            } else {
                InterfaceC5853o interfaceC5853o4 = i12 != 0 ? C5850l.f23787a : interfaceC5853o2;
                C1858m2 c1858m2 = AbstractC0316d.f944a;
                AbstractC4604i.m9031a(str, interfaceC1231l, AbstractC3208d.m6883m(AbstractC2192n.m5430g(AbstractC0378h.m1337b(AbstractC3222h1.m6901d(interfaceC5853o4, 1.0f), AbstractC4360e.m8800a(10)), ((C0314b) c1836h0.m4542j(c1858m2)).m1241k(), AbstractC0996c0.f3162b), 12, 11), false, new C1941n0(((C0314b) c1836h0.m4542j(c1858m2)).m1237g(), AbstractC5700d.m10248D(15), null, 0L, 0, 0L, 16777212), null, null, true, 0, 0, null, null, new C1030t0(((C0314b) c1836h0.m4542j(c1858m2)).m1240j()), AbstractC3879i.m8071e(519108863, new C0447i0(0, str, str2), c1836h0), c1836h0, (i11 & 14) | 100663296 | ((i11 >> 3) & 112), 196608, 16088);
                interfaceC5853o3 = interfaceC5853o4;
            }
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t == null) {
                c1876r1M4557t.f6241d = new C0451j0(this, str, str2, interfaceC1231l, interfaceC5853o3, i9, i10);
                return;
            }
            return;
        }
        i11 |= 3072;
        interfaceC5853o2 = interfaceC5853o;
        if (c1836h0.m4516S(i11 & 1, (i11 & 1171) == 1170)) {
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1467h(Context context, C3874d c3874d, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-1424091417);
        int i10 = (c1836h0.m4538h(context) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 19) != 18)) {
            AbstractC2043a.m5023b((context.getResources().getConfiguration().uiMode & 48) == 32 ? AbstractC0316d.m1246a() : AbstractC0316d.m1247b(), null, false, c3874d, c1836h0, 3072);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0145k(this, context, c3874d, i9, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1468i(int i9, int i10, InterfaceC1220a interfaceC1220a, C1836h0 c1836h0, String str, String str2, boolean z9) {
        int i11;
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(96628841);
        if ((i10 & 6) == 0) {
            i11 = (c1836h0.m4534f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1836h02.m4534f(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1836h02.m4530d(i9) ? Opcodes.ACC_NATIVE : 128;
        }
        int i12 = i11 | (c1836h02.m4536g(z9) ? Opcodes.ACC_STRICT : 1024) | (c1836h02.m4538h(interfaceC1220a) ? 16384 : 8192);
        if (c1836h02.m4516S(i12 & 1, (i12 & 9363) != 9362)) {
            C5850l c5850l = C5850l.f23787a;
            float f3 = 10;
            InterfaceC5853o interfaceC5853oM6885o = AbstractC3208d.m6885o(AbstractC2192n.m5433j(AbstractC0378h.m1337b(AbstractC3222h1.m6901d(c5850l, 1.0f), AbstractC4360e.m8800a(f3)), false, null, null, interfaceC1220a, 15), ((i9 <= 6 ? i9 : 6) * 14) + 10, f3, f3, f3);
            C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(AbstractC3226j.f10298a, C5840b.f23771q, c1836h02, 48);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6885o);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            C5597e c5597e = C5601f.f22761e;
            AbstractC1874r.m4615A(c5597e, c1836h02, c3213e1M6892a);
            C5597e c5597e2 = C5601f.f22760d;
            AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C5597e c5597e3 = C5601f.f22762f;
            AbstractC1874r.m4615A(c5597e3, c1836h02, numValueOf);
            C5593d c5593d = C5601f.f22763g;
            AbstractC1874r.m4641w(c5593d, c1836h02);
            C5597e c5597e4 = C5601f.f22759c;
            AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c);
            if (1.0f <= 0.0d) {
                AbstractC3418a.m7194a("invalid weight; must be greater than zero");
            }
            C3248q0 c3248q0 = new C3248q0(1.0f, true);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
            int iHashCode2 = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l2 = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h02, c3248q0);
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            AbstractC1874r.m4615A(c5597e, c1836h02, c3256tM6935a);
            AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l2);
            AbstractC2091b.m5169p(iHashCode2, c1836h02, c5597e3, c1836h02, c5593d);
            AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c2);
            C1858m2 c1858m2 = AbstractC0316d.f944a;
            AbstractC4045s.m8250n(str, null, ((C0314b) c1836h02.m4542j(c1858m2)).m1237g(), AbstractC5700d.m10248D(15), C2767k.f9000j, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h02, (i12 & 14) | 1597440, 0, 262058);
            c1836h02 = c1836h02;
            if (AbstractC3149m.m6721t0(str2) || str2.equals(str)) {
                c1836h02.m4525a0(-360819265);
                c1836h02.m4553p(false);
            } else {
                c1836h02.m4525a0(-361038373);
                AbstractC4045s.m8250n(str2, null, ((C0314b) c1836h02.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, ((i12 >> 3) & 14) | 24576, 0, 262122);
                c1836h02 = c1836h0;
                c1836h02.m4553p(false);
            }
            c1836h02.m4553p(true);
            AbstractC4045s.m8240d(z9 ? EnumC1571a.f5230g : EnumC1571a.f5231h, AbstractC3222h1.m6907j(c5850l, 22), null, false, c1836h02, 432);
            c1836h02.m4553p(true);
        } else {
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0459l0(this, str, str2, i9, z9, interfaceC1220a, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1469j(List list, AbstractC0473o2 abstractC0473o2, String str, String str2, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, C1836h0 c1836h0, int i9) {
        AbstractC0473o2 abstractC0473o22;
        C1836h0 c1836h02;
        Object next;
        String strConcat;
        C0452j1 c0452j1;
        boolean z9;
        Iterator it;
        C1836h0 c1836h03 = c1836h0;
        c1836h03.m4527b0(1160933333);
        int i10 = i9 | (c1836h03.m4534f(list) ? 4 : 2) | (c1836h03.m4534f(abstractC0473o2) ? 32 : 16) | (c1836h03.m4534f(str) ? Opcodes.ACC_NATIVE : 128) | (c1836h03.m4534f(str2) ? Opcodes.ACC_STRICT : 1024) | (c1836h03.m4538h(interfaceC1231l) ? 16384 : 8192) | (c1836h03.m4538h(interfaceC1231l2) ? Opcodes.ACC_DEPRECATED : 65536) | (c1836h03.m4538h(interfaceC1220a) ? 1048576 : 524288) | (c1836h03.m4538h(interfaceC1220a2) ? 8388608 : 4194304) | (c1836h03.m4538h(interfaceC1220a3) ? 67108864 : 33554432);
        if (c1836h03.m4516S(i10 & 1, (38347923 & i10) != 38347922)) {
            int i11 = i10 & 112;
            boolean z10 = ((i10 & 14) == 4) | (i11 == 32);
            Object objM4514P = c1836h03.m4514P();
            C1823e c1823e = C1851l.f6155a;
            Object obj = objM4514P;
            if (z10 || objM4514P == c1823e) {
                ArrayList arrayListM1457t = m1457t(list);
                ArrayList arrayListM8397F1 = arrayListM1457t;
                if (!(abstractC0473o2 instanceof C0436f1)) {
                    String str3 = ((C0440g1) abstractC0473o2).f1296b;
                    LinkedHashSet linkedHashSetM8354V = AbstractC4156d0.m8354V(AbstractC0473o2.m1482f(str3, list), str3);
                    List listM99x0 = AbstractC0000a.m99x0(new C0424c1(0, null, "微信首页", "作为一级分组"));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListM1457t) {
                        String str4 = ((C0424c1) obj2).f1216a;
                        if (str4 == null || !linkedHashSetM8354V.contains(str4)) {
                            arrayList.add(obj2);
                        }
                    }
                    arrayListM8397F1 = AbstractC4166m.m8397F1(listM99x0, arrayList);
                }
                c1836h03.m4545k0(arrayListM8397F1);
                obj = arrayListM8397F1;
            }
            String string = AbstractC3149m.m6703R0(str).toString();
            Locale locale = Locale.US;
            String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                C0424c1 c0424c1 = (C0424c1) next2;
                if (strM5165l.length() == 0) {
                    it = it2;
                } else {
                    String str5 = c0424c1.f1217b;
                    Locale locale2 = Locale.US;
                    it = it2;
                    if (AbstractC0255e.m1032u(locale2, str5, locale2, strM5165l, false) || AbstractC0255e.m1031t(c0424c1.f1218c, locale2, strM5165l, false)) {
                    }
                    it2 = it;
                }
                arrayList2.add(next2);
                it2 = it;
            }
            float f3 = ((Configuration) c1836h03.m4542j(AbstractC5891i0.f23945a)).screenHeightDp;
            C5850l c5850l = C5850l.f23787a;
            InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, f3 * 0.78f, 1);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h03, 0);
            int iHashCode = Long.hashCode(c1836h03.f6095T);
            C3878h c3878hM4546l = c1836h03.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM6904g);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h03.m4531d0();
            if (c1836h03.f6094S) {
                c1836h03.m4544k(c5660y);
            } else {
                c1836h03.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h03, c3256tM6935a);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h03, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h03, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h03);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h03, interfaceC5853oM10543c);
            if (abstractC0473o2 instanceof C0436f1) {
                strConcat = "选择当前会话所属分组";
            } else {
                if (!(abstractC0473o2 instanceof C0440g1)) {
                    C3193a.m6822k();
                    return;
                }
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (AbstractC1416l.m3825a(((C0414a) next).f1179a, ((C0440g1) abstractC0473o2).f1296b)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0414a c0414a = (C0414a) next;
                String str6 = c0414a != null ? c0414a.f1180b : null;
                if (str6 == null) {
                    str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                strConcat = "移动分组：".concat(str6);
            }
            C1858m2 c1858m2 = AbstractC0316d.f944a;
            AbstractC4045s.m8250n(strConcat, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 0.0f, 0.0f, 4, 7), ((C0314b) c1836h03.m4542j(c1858m2)).m1238h(), AbstractC5700d.m10248D(13), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 24624, 0, 262120);
            C0452j1 c0452j12 = f1326a;
            c0452j12.m1460a(((i10 >> 12) & 896) | 24630, 8, interfaceC1220a, c1836h0, "管理聊天分组", "新建、删除、导入与导出", false);
            c0452j12.m1472q(str, interfaceC1231l, c1836h0, ((i10 >> 6) & 14) | 384 | ((i10 >> 9) & 112));
            if (arrayList2.isEmpty()) {
                c1836h0.m4525a0(-2136310139);
                c0452j1 = c0452j12;
                AbstractC4045s.m8250n(list.isEmpty() ? "暂无聊天分组" : "没有匹配的聊天分组", AbstractC3208d.m6884n(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 28, 1), ((C0314b) c1836h0.m4542j(c1858m2)).m1238h(), 0L, null, null, 0L, new C4095k(3), 0L, 0, false, 0, 0, null, null, c1836h0, 48, 0, 261112);
                c1836h0.m4553p(false);
                z9 = true;
                abstractC0473o22 = abstractC0473o2;
            } else {
                c0452j1 = c0452j12;
                c1836h0.m4525a0(-2135966876);
                InterfaceC5853o interfaceC5853oM6901d = AbstractC3222h1.m6901d(c5850l, 1.0f);
                if (1.0f <= 0.0d) {
                    AbstractC3418a.m7194a("invalid weight; must be greater than zero");
                }
                InterfaceC5853o interfaceC5853oM6904g2 = AbstractC3222h1.m6904g(interfaceC5853oM6901d.mo10549d(new C3248q0(1.0f, false)), 0.0f, 360, 1);
                boolean zM4538h = c1836h0.m4538h(arrayList2) | ((i10 & 7168) == 2048) | (i11 == 32) | ((458752 & i10) == 131072);
                Object objM4514P2 = c1836h0.m4514P();
                if (zM4538h || objM4514P2 == c1823e) {
                    abstractC0473o22 = abstractC0473o2;
                    objM4514P2 = new C0454k(arrayList2, str2, abstractC0473o22, interfaceC1231l2);
                    c1836h0.m4545k0(objM4514P2);
                } else {
                    abstractC0473o22 = abstractC0473o2;
                }
                z9 = true;
                AbstractC0000a.m53b(interfaceC5853oM6904g2, null, null, null, null, null, false, null, (InterfaceC1231l) objM4514P2, c1836h0, 0, 510);
                c1836h0.m4553p(false);
            }
            c0452j1.m1465f(interfaceC1220a2, "确定", interfaceC1220a3, true, c1836h0, ((i10 >> 18) & 112) | 221574 | ((i10 >> 15) & 7168), 0);
            C1836h0 c1836h04 = c1836h0;
            c1836h04.m4553p(z9);
            c1836h02 = c1836h04;
        } else {
            abstractC0473o22 = abstractC0473o2;
            c1836h03.m4519V();
            c1836h02 = c1836h03;
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0431e0(this, list, abstractC0473o22, str, str2, interfaceC1231l, interfaceC1231l2, interfaceC1220a, interfaceC1220a2, interfaceC1220a3, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1470k(List list, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, InterfaceC1220a interfaceC1220a4, InterfaceC1220a interfaceC1220a5, InterfaceC1220a interfaceC1220a6, C1836h0 c1836h0, int i9) {
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(-366518988);
        int i10 = i9 | (c1836h02.m4534f(list) ? 4 : 2) | (c1836h02.m4538h(interfaceC1220a) ? 32 : 16) | (c1836h02.m4538h(interfaceC1220a2) ? Opcodes.ACC_NATIVE : 128) | (c1836h02.m4538h(interfaceC1220a3) ? Opcodes.ACC_STRICT : 1024) | (c1836h02.m4538h(interfaceC1220a4) ? 16384 : 8192) | (c1836h02.m4538h(interfaceC1220a5) ? Opcodes.ACC_DEPRECATED : 65536) | (c1836h02.m4538h(interfaceC1220a6) ? 1048576 : 524288);
        if (c1836h02.m4516S(i10 & 1, (599187 & i10) != 599186)) {
            C5850l c5850l = C5850l.f23787a;
            InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 560, 1);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6904g);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            AbstractC1874r.m4615A(C5601f.f22761e, c1836h02, c3256tM6935a);
            AbstractC1874r.m4615A(C5601f.f22760d, c1836h02, c3878hM4546l);
            AbstractC1874r.m4615A(C5601f.f22762f, c1836h02, Integer.valueOf(iHashCode));
            AbstractC1874r.m4641w(C5601f.f22763g, c1836h02);
            AbstractC1874r.m4615A(C5601f.f22759c, c1836h02, interfaceC5853oM10543c);
            C0452j1 c0452j1 = f1326a;
            c0452j1.m1473r("管理聊天分组", c1836h02, 54);
            c0452j1.m1460a(((i10 << 3) & 896) | 24630, 8, interfaceC1220a, c1836h02, "新建分组", "创建一级或多级聊天分组", false);
            c0452j1.m1460a(((i10 >> 3) & 896) | 24630, 0, interfaceC1220a3, c1836h0, "删除多个", "选择一个或多个聊天分组删除", !list.isEmpty());
            c0452j1.m1460a(((i10 >> 6) & 896) | 24630, 8, interfaceC1220a4, c1836h0, "导入", "从聊天分组文件恢复配置", false);
            c0452j1.m1460a(((i10 >> 9) & 896) | 24630, 8, interfaceC1220a5, c1836h0, "导出", "将当前账号的聊天分组保存到文件", false);
            c0452j1.m1460a((i10 & 896) | 24630, 0, interfaceC1220a2, c1836h0, "全部删除", "删除当前账号的全部聊天分组", !list.isEmpty());
            AbstractC4045s.m8251o("返回", interfaceC1220a6, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 8, 0.0f, 0.0f, 13), false, 0.0f, 0.0f, 0.0f, null, null, c1836h0, ((i10 >> 15) & 112) | 390, 2040);
            c1836h02 = c1836h0;
            c1836h02.m4553p(true);
        } else {
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0427d0(this, list, interfaceC1220a, interfaceC1220a2, interfaceC1220a3, interfaceC1220a4, interfaceC1220a5, interfaceC1220a6, i9, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m1471l(Activity activity, AbstractC0473o2 abstractC0473o2, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, InterfaceC1220a interfaceC1220a3, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-1417977276);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4538h(activity) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= (i9 & 64) == 0 ? c1836h0.m4534f(abstractC0473o2) : c1836h0.m4538h(abstractC0473o2) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1220a2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1220a3) ? 16384 : 8192;
        }
        int i11 = i10;
        if (c1836h0.m4516S(i11 & 1, (i11 & 9363) != 9362)) {
            int i12 = i11 & 112;
            boolean z9 = i12 == 32 || ((i11 & 64) != 0 && c1836h0.m4534f(abstractC0473o2));
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (z9 || objM4514P == c1823e) {
                objM4514P = AbstractC1874r.m4639u(AbstractC0473o2.m1485i(activity));
                c1836h0.m4545k0(objM4514P);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P;
            boolean z10 = i12 == 32 || ((i11 & 64) != 0 && c1836h0.m4534f(abstractC0473o2));
            Object objM4514P2 = c1836h0.m4514P();
            if (z10 || objM4514P2 == c1823e) {
                objM4514P2 = AbstractC1874r.m4639u(EnumC0432e1.f1268g);
                c1836h0.m4545k0(objM4514P2);
            }
            InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P2;
            boolean z11 = i12 == 32 || ((i11 & 64) != 0 && c1836h0.m4534f(abstractC0473o2));
            Object objM4514P3 = c1836h0.m4514P();
            if (z11 || objM4514P3 == c1823e) {
                objM4514P3 = AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
                c1836h0.m4545k0(objM4514P3);
            }
            InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) objM4514P3;
            boolean zM4534f = (i12 == 32 || ((i11 & 64) != 0 && c1836h0.m4534f(abstractC0473o2))) | c1836h0.m4534f((List) interfaceC1809a1.getValue());
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4534f || objM4514P4 == c1823e) {
                objM4514P4 = AbstractC1874r.m4639u(m1456s(abstractC0473o2, (List) interfaceC1809a1.getValue()));
                c1836h0.m4545k0(objM4514P4);
            }
            InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) objM4514P4;
            boolean z12 = i12 == 32 || ((i11 & 64) != 0 && c1836h0.m4534f(abstractC0473o2));
            Object objM4514P5 = c1836h0.m4514P();
            if (z12 || objM4514P5 == c1823e) {
                objM4514P5 = AbstractC1874r.m4639u(HttpUrl.FRAGMENT_ENCODE_SET);
                c1836h0.m4545k0(objM4514P5);
            }
            InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) objM4514P5;
            boolean z13 = i12 == 32 || ((i11 & 64) != 0 && c1836h0.m4534f(abstractC0473o2));
            Object objM4514P6 = c1836h0.m4514P();
            if (z13 || objM4514P6 == c1823e) {
                objM4514P6 = AbstractC1874r.m4639u(null);
                c1836h0.m4545k0(objM4514P6);
            }
            InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) objM4514P6;
            boolean z14 = i12 == 32 || ((i11 & 64) != 0 && c1836h0.m4534f(abstractC0473o2));
            Object objM4514P7 = c1836h0.m4514P();
            if (z14 || objM4514P7 == c1823e) {
                objM4514P7 = AbstractC1874r.m4639u(C4175v.f13712g);
                c1836h0.m4545k0(objM4514P7);
            }
            AbstractC3165h.m6777d(null, "聊天分组", 0L, 0L, 0L, false, interfaceC1220a, 0L, 0L, false, AbstractC3879i.m8071e(1965846147, new C0485s0(abstractC0473o2, interfaceC1809a13, interfaceC1809a14, interfaceC1809a12, interfaceC1220a, activity, interfaceC1220a2, interfaceC1809a15, interfaceC1809a16, interfaceC1809a1, (InterfaceC1809a1) objM4514P7, interfaceC1220a3), c1836h0), c1836h0, ((i11 << 18) & 234881024) | 390, 3072);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0488t0(this, activity, abstractC0473o2, interfaceC1220a, interfaceC1220a2, interfaceC1220a3, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m1472q(String str, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-700545265);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(str) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4538h(interfaceC1231l) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4534f(this) ? Opcodes.ACC_NATIVE : 128;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            m1466g(((i10 << 6) & 57344) | (i10 & 14) | 3120 | ((i10 << 3) & 896), 0, interfaceC1231l, c1836h0, str, "搜索聊天分组", AbstractC3208d.m6884n(C5850l.f23787a, 0.0f, 8, 1));
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(this, str, interfaceC1231l, i9, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m1473r(String str, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-1909802936);
        if (c1836h0.m4516S(i9 & 1, (i9 & 3) != 2)) {
            AbstractC4045s.m8250n(str, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(C5850l.f23787a, 1.0f), 0.0f, 0.0f, 0.0f, 10, 7), ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1237g(), AbstractC5700d.m10248D(16), C2767k.f9000j, null, 0L, null, 0L, 0, false, 0, 0, null, null, c1836h0, 1597494, 0, 262056);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0151q(this, str, i9, 3);
        }
    }
}
