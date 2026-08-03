package p036c9;

import ac.AbstractC0063p;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import bi.C0315c;
import ci.AbstractC0592k0;
import ci.C0580e0;
import ci.C0598n0;
import ci.C0602p0;
import ci.C0603q;
import ci.C0607s;
import ci.C0611w;
import gg.C1421q;
import gg.C1424t;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3019q;
import p015b0.C0136d0;
import p015b0.C0153s;
import p019b4.C0178b;
import p027c0.C0361f;
import p049d9.C0752m;
import p054dg.C0791j;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p069f.C0943k0;
import p069f.C0945l0;
import p071f1.AbstractC1027s;
import p071f1.C1009j;
import p071f1.C1010j0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p096g8.C1363d;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p101h1.InterfaceC1567d;
import p116i.C1743d0;
import p116i.C1744d1;
import p116i.C1752g0;
import p116i.C1753g1;
import p116i.C1759i1;
import p116i.C1762j1;
import p116i.C1765k1;
import p117i0.C1808a0;
import p117i0.C1871q;
import p117i0.C1890w0;
import p117i0.C1897y1;
import p117i0.C1899z0;
import p117i0.EnumC1885u1;
import p136j8.C2093d;
import p144k.InterfaceC2184k0;
import p153k8.C2343g;
import p187n.C2857k;
import p187n.C2858l;
import p187n.InterfaceC2856j;
import p218og.AbstractC3149m;
import p224p1.C3287b;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p267s1.C3914t;
import p276sf.C3958e;
import p276sf.C3967n;
import p304uf.C4329c;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p322w0.C4665p;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import p339x1.C5610h0;
import p372z.InterfaceC6059g;
import sg.InterfaceC3984p;
import tf.AbstractC4166m;
import tg.C4183b0;

/* JADX INFO: renamed from: c9.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0446i implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1307g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1308h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1309i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0446i(C0423c0 c0423c0, List list) {
        this.f1307g = 13;
        this.f1309i = c0423c0;
        this.f1308h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws InterruptedException {
        int i9 = 7;
        int i10 = 6;
        int i11 = 3;
        int i12 = 2;
        boolean z9 = false;
        boolean zM1627b = false;
        z9 = false;
        switch (this.f1307g) {
            case 0:
                List<String> list = (List) this.f1308h;
                String str = (String) this.f1309i;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.getClass();
                C2343g c2343gMessages = WeChatApis.messages();
                int i13 = 0;
                for (String str2 : list) {
                    if (!atomicBoolean.get()) {
                        if (c2343gMessages != null && c2343gMessages.m5601x(str2, str)) {
                            i13++;
                        }
                        if (!atomicBoolean.get()) {
                            Thread.sleep(500L);
                        }
                    }
                }
                return new C0502y("发送", i13, list.size(), false);
            case 1:
                ArrayList arrayList = (ArrayList) this.f1308h;
                C5026jv c5026jv = (C5026jv) this.f1309i;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) obj;
                atomicBoolean2.getClass();
                WeChatApis.contact().getClass();
                C1363d c1363d = WeChatApis.chatroomApi;
                int size = 0;
                for (List list2 : AbstractC4166m.m8416n1(30, arrayList)) {
                    if (!atomicBoolean2.get()) {
                        if (c1363d != null && c1363d.m3681m(c5026jv.f18249a, list2)) {
                            size += list2.size();
                        }
                        if (!atomicBoolean2.get()) {
                            Thread.sleep(500L);
                        }
                    }
                }
                return new C0502y("邀请", size, arrayList.size(), false);
            case 2:
                Activity activity = (Activity) this.f1308h;
                ArrayList arrayList2 = (ArrayList) this.f1309i;
                List list3 = (List) obj;
                list3.getClass();
                C5026jv c5026jv2 = (C5026jv) AbstractC4166m.m8400I1(list3);
                if (c5026jv2 != null) {
                    C5491y2.m9803S1(activity, "发送群聊邀请", "将邀请当前分组中的 " + arrayList2.size() + " 位好友加入“" + c5026jv2.f18250b + "”。", new C0153s(activity, arrayList2, c5026jv2, i12), new C0315c(6), EnumC5092lv.f18824j);
                }
                return C3967n.f12976a;
            case 3:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f1308h;
                Activity activity2 = (Activity) this.f1309i;
                C0477p2 c0477p2 = (C0477p2) obj;
                c0477p2.getClass();
                String str3 = c0477p2.f1414a;
                if (!AbstractC3149m.m6721t0(str3)) {
                    C0452j1.m1455p(activity2, str3);
                }
                interfaceC1220a.invoke();
                return C3967n.f12976a;
            case 4:
                C1425u c1425u = (C1425u) this.f1308h;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f1309i;
                C0414a c0414a = (C0414a) obj;
                c0414a.getClass();
                if (AbstractC4166m.m8417o1((Iterable) c1425u.f4738g, c0414a.f1181c) && !linkedHashSet.contains(c0414a.f1179a)) {
                    z9 = true;
                }
                return Boolean.valueOf(z9);
            case 5:
                C4329c c4329c = (C4329c) this.f1308h;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1309i;
                Set set = (Set) obj;
                set.getClass();
                interfaceC1231l.invoke(AbstractC3015m.m6418b0(AbstractC3015m.m6409S(new C0791j(AbstractC3015m.m6414X(new C0795n(set, 6), new C0361f(1, c4329c, AbstractC0921a.m2246i(AbstractC4166m.class), "getOrNull", "getOrNull(Ljava/util/List;I)Ljava/lang/Object;", 1, 0, 10)), new C0178b(16), C3019q.f9816n))));
                return C3967n.f12976a;
            case 6:
                AbstractC4377b1 abstractC4377b1 = (AbstractC4377b1) this.f1308h;
                C0607s c0607s = (C0607s) this.f1309i;
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                abstractC4374a1.getClass();
                AbstractC4374a1.m8813G(abstractC4374a1, abstractC4377b1, 0, 0, new C0603q(c0607s, 1 == true ? 1 : 0), 4);
                return C3967n.f12976a;
            case 7:
                C4665p c4665p = (C4665p) this.f1308h;
                C4665p c4665p2 = (C4665p) this.f1309i;
                ((C1808a0) obj).getClass();
                return new C0611w(c4665p, false ? 1 : 0, c4665p2);
            case 8:
                AbstractC4377b1 abstractC4377b12 = (AbstractC4377b1) this.f1308h;
                C0580e0 c0580e0 = (C0580e0) this.f1309i;
                AbstractC4374a1 abstractC4374a12 = (AbstractC4374a1) obj;
                abstractC4374a12.getClass();
                AbstractC4374a1.m8813G(abstractC4374a12, abstractC4377b12, 0, 0, new C0136d0(c0580e0, i10), 4);
                return C3967n.f12976a;
            case 9:
                C1424t c1424t = (C1424t) this.f1308h;
                C0580e0 c0580e02 = (C0580e0) this.f1309i;
                C0602p0 c0602p0 = c0580e02.f1803z;
                long jLongValue = ((Long) obj).longValue();
                if (c1424t.f4737g == -1) {
                    c1424t.f4737g = jLongValue;
                } else {
                    c1424t.f4737g = jLongValue;
                    zM1627b = c0602p0.m1627b((jLongValue - r7) / 1.0E9f);
                    c0580e02.m1587q1((float) c0602p0.f1901c);
                    c0580e02.f1796D = AbstractC0592k0.m1604b(c0580e02.f1795C, c0580e02.f1797E) * Math.signum(c0580e02.f1795C);
                }
                return Boolean.valueOf(zM1627b);
            case 10:
                AbstractC4377b1 abstractC4377b13 = (AbstractC4377b1) this.f1308h;
                C0598n0 c0598n0 = (C0598n0) this.f1309i;
                AbstractC4374a1 abstractC4374a13 = (AbstractC4374a1) obj;
                abstractC4374a13.getClass();
                AbstractC4374a1.m8813G(abstractC4374a13, abstractC4377b13, 0, 0, new C0136d0(c0598n0, i9), 4);
                return C3967n.f12976a;
            case 11:
                C0752m c0752m = (C0752m) this.f1308h;
                Activity activity3 = (Activity) this.f1309i;
                String str4 = ((Boolean) obj).booleanValue() ? "自定义头像已保存" : "头像设置失败";
                c0752m.getClass();
                if (activity3 != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0487t(activity3, str4, i11));
                }
                return C3967n.f12976a;
            case 12:
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f1308h;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f1309i;
                InterfaceC6059g interfaceC6059g = (InterfaceC6059g) obj;
                interfaceC1220a2.invoke();
                if (interfaceC1220a3 != null ? ((Boolean) interfaceC1220a3.invoke()).booleanValue() : true) {
                    interfaceC6059g.close();
                }
                return C3967n.f12976a;
            case 13:
                C0423c0 c0423c0 = (C0423c0) this.f1309i;
                List list4 = (List) this.f1308h;
                Set set2 = (Set) obj;
                set2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    C3958e c3958e = (C3958e) AbstractC4166m.m8425w1(((Number) it.next()).intValue(), list4);
                    Integer num = c3958e != null ? (Integer) c3958e.f12961g : null;
                    if (num != null) {
                        arrayList3.add(num);
                    }
                }
                Set setM8412U1 = AbstractC4166m.m8412U1(arrayList3);
                if (!setM8412U1.isEmpty()) {
                    c0423c0.invoke(2, setM8412U1);
                }
                return C3967n.f12976a;
            case 14:
                C1752g0 c1752g0 = (C1752g0) this.f1308h;
                C1743d0 c1743d0 = (C1743d0) this.f1309i;
                c1752g0.f5844a.m5056b(c1743d0);
                c1752g0.f5845b.setValue(Boolean.TRUE);
                return new C0611w(c1752g0, 1 == true ? 1 : 0, c1743d0);
            case 15:
                AbstractC3603v.m7563q((InterfaceC3599t) this.f1308h, null, new C1759i1((C1765k1) this.f1309i, null), 1);
                return new C1762j1(0);
            case 16:
                C1765k1 c1765k1 = (C1765k1) this.f1308h;
                C1765k1 c1765k12 = (C1765k1) this.f1309i;
                c1765k1.f5898j.add(c1765k12);
                return new C0611w(c1765k1, i12, c1765k12);
            case 17:
                return new C0611w((C1765k1) this.f1308h, i11, (C1744d1) this.f1309i);
            case 18:
                C1765k1 c1765k13 = (C1765k1) this.f1308h;
                C1753g1 c1753g1 = (C1753g1) this.f1309i;
                c1765k13.f5897i.add(c1753g1);
                return new C0611w(c1765k13, 4, c1753g1);
            case 19:
                ((C1899z0) this.f1308h).f6329i.add(new C1890w0(obj, (InterfaceC3984p) this.f1309i));
                return C3967n.f12976a;
            case 20:
                Set set3 = (Set) this.f1308h;
                C1899z0 c1899z0 = (C1899z0) this.f1309i;
                if (set3.contains(obj)) {
                    C0943k0 c0943k0 = c1899z0.f6328h;
                    C0945l0 c0945l0 = c1899z0.f6330j;
                    Object objM2320g = c0943k0.m2320g(obj);
                    if (objM2320g != null) {
                        if (objM2320g instanceof C0945l0) {
                            C0945l0 c0945l02 = (C0945l0) objM2320g;
                            Object[] objArr = c0945l02.f2976b;
                            long[] jArr = c0945l02.f2975a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j3 = jArr[i14];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((255 & j3) < 128) {
                                                c0945l0.m2328a((InterfaceC3984p) objArr[(i14 << 3) + i16]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i15 == 8) {
                                            if (i14 != length) {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c0945l0.m2328a((InterfaceC3984p) objM2320g);
                        }
                    }
                }
                return C3967n.f12976a;
            case 21:
                C1871q c1871q = (C1871q) this.f1308h;
                C0945l0 c0945l03 = (C0945l0) this.f1309i;
                c1871q.m4613z(obj);
                if (c0945l03 != null) {
                    c0945l03.m2328a(obj);
                }
                return C3967n.f12976a;
            case 22:
                C1897y1 c1897y1 = (C1897y1) this.f1308h;
                Throwable th2 = (Throwable) this.f1309i;
                Throwable th3 = (Throwable) obj;
                synchronized (c1897y1.f6305c) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th3 != null) {
                        try {
                            if (th3 instanceof CancellationException) {
                                th3 = null;
                            }
                            if (th3 != null) {
                                AbstractC0063p.m412e(th2, th3);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    c1897y1.f6307e = th2;
                    C4183b0 c4183b0 = c1897y1.f6323u;
                    EnumC1885u1 enumC1885u1 = EnumC1885u1.f6256g;
                    c4183b0.getClass();
                    c4183b0.m8446h(null, enumC1885u1);
                }
                return C3967n.f12976a;
            case 23:
                Context context = (Context) this.f1308h;
                ClassLoader classLoader = (ClassLoader) this.f1309i;
                String str5 = (String) obj;
                str5.getClass();
                ConcurrentHashMap concurrentHashMap = C2093d.f6997a;
                return C2093d.m5186j(context, classLoader, str5, "Hchat_fav_voice", "silk");
            case 24:
                ((C2857k) this.f1308h).m6282b((C2858l) this.f1309i);
                return C3967n.f12976a;
            case 25:
                C1009j c1009j = (C1009j) this.f1308h;
                AbstractC1027s abstractC1027s = (AbstractC1027s) this.f1309i;
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.m10064e();
                InterfaceC1567d.m4089s0(c5610h0, c1009j, abstractC1027s, 0.0f, null, 60);
                return C3967n.f12976a;
            case 26:
                C1010j0 c1010j0 = (C1010j0) this.f1308h;
                AbstractC1027s abstractC1027s2 = (AbstractC1027s) this.f1309i;
                C5610h0 c5610h02 = (C5610h0) obj;
                c5610h02.m10064e();
                InterfaceC1567d.m4089s0(c5610h02, c1010j0.f3195f, abstractC1027s2, 0.0f, null, 60);
                return C3967n.f12976a;
            case 27:
                C3287b c3287b = (C3287b) this.f1308h;
                C1421q c1421q = (C1421q) this.f1309i;
                boolean z10 = c1421q.f4734g || ((InterfaceC2184k0) obj).mo5418B0(c3287b);
                c1421q.f4734g = z10;
                return Boolean.valueOf(!z10);
            case 28:
                C3914t c3914t = (C3914t) this.f1308h;
                C1421q c1421q2 = (C1421q) this.f1309i;
                boolean z11 = c1421q2.f4734g || ((InterfaceC2184k0) obj).mo5419X(c3914t);
                c1421q2.f4734g = z11;
                return Boolean.valueOf(!z11);
            default:
                ((C2857k) this.f1308h).m6282b((InterfaceC2856j) this.f1309i);
                return C3967n.f12976a;
        }
    }

    public /* synthetic */ C0446i(Object obj, int i9, Object obj2) {
        this.f1307g = i9;
        this.f1308h = obj;
        this.f1309i = obj2;
    }
}
