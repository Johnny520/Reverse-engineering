package p092S0;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.BuildConfig;
import p000A.C0038T0;
import p001A0.C0102b;
import p027E4.C0330q;
import p056K2.C0891q;
import p074O2.InterfaceC1049g;
import p095T.C1350a0;
import p099T3.C1427f;
import p108V3.AbstractC1543P;
import p110W0.AbstractC1592q;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p113W3.C1608a;
import p117X2.AbstractC1665j;
import p123Y3.C1771b;
import p125Z0.C1781b;
import p128a.AbstractC1785a;
import p147d1.C1951a;
import p147d1.C1954d;
import p147d1.C1955e;
import p147d1.C1957g;
import p147d1.C1959i;
import p147d1.C1961k;
import p147d1.C1962l;
import p147d1.C1963m;
import p147d1.C1966p;
import p147d1.C1967q;
import p147d1.C1968r;
import p147d1.C1969s;
import p152e0.C1997d;
import p153e1.C2019o;
import p153e1.C2020p;
import p158f0.AbstractC2082n;
import p160f3.AbstractC2153p;
import p203n.C2663k;
import p211o0.AbstractC2767z;
import p211o0.C2737L;
import p211o0.C2762u;

/* JADX INFO: renamed from: S0.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1286x implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4619d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A.y0.p(java.lang.Object):java.lang.Object, P.T.a():java.lang.Object, S0.C.<clinit>():void, S0.D.<clinit>():void, V3.P.E(V3.a, T.m, int):void, V3.P.a(java.lang.String, h0.p, T.m, int):void, V3.P.g(java.util.List, java.util.List, T3.f, boolean, boolean, W2.c, W2.c, T.m, int, int):void, V3.P.q(h0.p, T.m, int):void, com.bumptech.glide.e.h(W3.a[]):W3.a, e0.d.<clinit>():void, e0.k.<clinit>():void, f0.n.<clinit>():void, f3.p.<clinit>():void, n.d.<clinit>():void, nuke.ui.HomeActivity.onCreate(android.os.Bundle):void] */
    public /* synthetic */ C1286x(int i5) {
        this.f4619d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:X2.e:IGET), 61, (wrap:java.lang.Object:IGET) */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5;
        int i6;
        int i7;
        int i8;
        C1969s c1969s;
        long j5;
        switch (this.f4619d) {
            case 0:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                EnumC1271i enumC1271i = obj2 != null ? (EnumC1271i) obj2 : null;
                AbstractC1665j.m2982b(enumC1271i);
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                AbstractC1665j.m2982b(num);
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                AbstractC1665j.m2982b(num2);
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                AbstractC1665j.m2982b(str);
                switch (enumC1271i.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        C1282t c1282t = (AbstractC1665j.m2981a(obj6, Boolean.FALSE) || obj6 == null) ? null : (C1282t) ((InterfaceC1601c) AbstractC1250C.f4469g.f170f).mo1h(obj6);
                        AbstractC1665j.m2982b(c1282t);
                        return new C1267e(c1282t, iIntValue, iIntValue2, str);
                    case BuildConfig.VERSION_CODE /* 1 */:
                        Object obj7 = list.get(1);
                        C1252E c1252e = (AbstractC1665j.m2981a(obj7, Boolean.FALSE) || obj7 == null) ? null : (C1252E) ((InterfaceC1601c) AbstractC1250C.f4470h.f170f).mo1h(obj7);
                        AbstractC1665j.m2982b(c1252e);
                        return new C1267e(c1252e, iIntValue, iIntValue2, str);
                    case 2:
                        Object obj8 = list.get(1);
                        C1262O c1262o = (AbstractC1665j.m2981a(obj8, Boolean.FALSE) || obj8 == null) ? null : (C1262O) ((InterfaceC1601c) AbstractC1250C.f4465c.f170f).mo1h(obj8);
                        AbstractC1665j.m2982b(c1262o);
                        return new C1267e(c1262o, iIntValue, iIntValue2, str);
                    case 3:
                        Object obj9 = list.get(1);
                        C1261N c1261n = (AbstractC1665j.m2981a(obj9, Boolean.FALSE) || obj9 == null) ? null : (C1261N) ((InterfaceC1601c) AbstractC1250C.f4466d.f170f).mo1h(obj9);
                        AbstractC1665j.m2982b(c1261n);
                        return new C1267e(c1261n, iIntValue, iIntValue2, str);
                    case 4:
                        Object obj10 = list.get(1);
                        C1274l c1274l = (AbstractC1665j.m2981a(obj10, Boolean.FALSE) || obj10 == null) ? null : (C1274l) ((InterfaceC1601c) AbstractC1250C.f4467e.f170f).mo1h(obj10);
                        AbstractC1665j.m2982b(c1274l);
                        return new C1267e(c1274l, iIntValue, iIntValue2, str);
                    case 5:
                        Object obj11 = list.get(1);
                        C1273k c1273k = (AbstractC1665j.m2981a(obj11, Boolean.FALSE) || obj11 == null) ? null : (C1273k) ((InterfaceC1601c) AbstractC1250C.f4468f.f170f).mo1h(obj11);
                        AbstractC1665j.m2982b(c1273k);
                        return new C1267e(c1273k, iIntValue, iIntValue2, str);
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        AbstractC1665j.m2982b(str2);
                        return new C1267e(new C1254G(str2), iIntValue, iIntValue2, str);
                    default:
                        throw new C0330q();
                }
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1957g(((Integer) obj).intValue());
            case 2:
                String str3 = obj != null ? (String) obj : null;
                AbstractC1665j.m2982b(str3);
                return new C1262O(str3);
            case 3:
                String str4 = obj != null ? (String) obj : null;
                AbstractC1665j.m2982b(str4);
                return new C1261N(str4);
            case 4:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj13 = list2.get(0);
                C1249B c1249b = AbstractC1250C.f4479q;
                Boolean bool = Boolean.FALSE;
                AbstractC1665j.m2981a(obj13, bool);
                C1961k c1961k = obj13 != null ? (C1961k) c1249b.f4458e.mo1h(obj13) : null;
                AbstractC1665j.m2982b(c1961k);
                int i9 = c1961k.f6639a;
                Object obj14 = list2.get(1);
                C1249B c1249b2 = AbstractC1250C.f4480r;
                AbstractC1665j.m2981a(obj14, bool);
                C1963m c1963m = obj14 != null ? (C1963m) c1249b2.f4458e.mo1h(obj14) : null;
                AbstractC1665j.m2982b(c1963m);
                int i10 = c1963m.f6644a;
                Object obj15 = list2.get(2);
                C2020p[] c2020pArr = C2019o.f6746b;
                C1249B c1249b3 = AbstractC1250C.f4484v;
                AbstractC1665j.m2981a(obj15, bool);
                C2019o c2019o = obj15 != null ? (C2019o) c1249b3.f4458e.mo1h(obj15) : null;
                AbstractC1665j.m2982b(c2019o);
                long j6 = c2019o.f6748a;
                Object obj16 = list2.get(3);
                C1967q c1967q = C1967q.f6649c;
                C1967q c1967q2 = (AbstractC1665j.m2981a(obj16, bool) || obj16 == null) ? null : (C1967q) ((InterfaceC1601c) AbstractC1250C.f4474l.f170f).mo1h(obj16);
                Object obj17 = list2.get(4);
                C1284v c1284v = (AbstractC1665j.m2981a(obj17, bool) || obj17 == null) ? null : (C1284v) ((InterfaceC1601c) AbstractC1251D.f4489a.f170f).mo1h(obj17);
                Object obj18 = list2.get(5);
                C1959i c1959i = C1959i.f6632d;
                C1959i c1959i2 = (AbstractC1665j.m2981a(obj18, bool) || obj18 == null) ? null : (C1959i) ((InterfaceC1601c) AbstractC1250C.f4459A.f170f).mo1h(obj18);
                Object obj19 = list2.get(6);
                C1955e c1955e = (AbstractC1665j.m2981a(obj19, bool) || obj19 == null) ? null : (C1955e) ((InterfaceC1601c) AbstractC1251D.f4491c.f170f).mo1h(obj19);
                AbstractC1665j.m2982b(c1955e);
                int i11 = c1955e.f6625a;
                Object obj20 = list2.get(7);
                C1249B c1249b4 = AbstractC1250C.f4481s;
                AbstractC1665j.m2981a(obj20, bool);
                C1954d c1954d = obj20 != null ? (C1954d) c1249b4.f4458e.mo1h(obj20) : null;
                AbstractC1665j.m2982b(c1954d);
                int i12 = c1954d.f6623a;
                Object obj21 = list2.get(8);
                C0038T0 c0038t0 = AbstractC1251D.f4492d;
                if (AbstractC1665j.m2981a(obj21, bool) || obj21 == null) {
                    i5 = i9;
                    i6 = i12;
                    i7 = i11;
                    i8 = i10;
                    j5 = j6;
                    c1969s = null;
                } else {
                    i5 = i9;
                    i6 = i12;
                    i7 = i11;
                    i8 = i10;
                    c1969s = (C1969s) ((InterfaceC1601c) c0038t0.f170f).mo1h(obj21);
                    j5 = j6;
                }
                return new C1282t(i5, i8, j5, c1967q2, c1284v, c1959i2, i7, i6, c1969s);
            case 5:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj22 = list3.get(0);
                int i13 = C2762u.f8763h;
                Boolean bool2 = Boolean.FALSE;
                AbstractC1665j.m2981a(obj22, bool2);
                C2762u c2762u = obj22 != null ? obj22.equals(bool2) ? new C2762u(C2762u.f8762g) : new C2762u(AbstractC2767z.m4933c(((Integer) obj22).intValue())) : null;
                AbstractC1665j.m2982b(c2762u);
                long j7 = c2762u.f8764a;
                Object obj23 = list3.get(1);
                C2020p[] c2020pArr2 = C2019o.f6746b;
                InterfaceC1601c interfaceC1601c = AbstractC1250C.f4484v.f4458e;
                AbstractC1665j.m2981a(obj23, bool2);
                C2019o c2019o2 = obj23 != null ? (C2019o) interfaceC1601c.mo1h(obj23) : null;
                AbstractC1665j.m2982b(c2019o2);
                long j8 = c2019o2.f6748a;
                Object obj24 = list3.get(2);
                C1587l c1587l = C1587l.f5501e;
                C1587l c1587l2 = (AbstractC1665j.m2981a(obj24, bool2) || obj24 == null) ? null : (C1587l) ((InterfaceC1601c) AbstractC1250C.f4475m.f170f).mo1h(obj24);
                Object obj25 = list3.get(3);
                C1585j c1585j = (AbstractC1665j.m2981a(obj25, bool2) || obj25 == null) ? null : (C1585j) ((InterfaceC1601c) AbstractC1250C.f4482t.f170f).mo1h(obj25);
                Object obj26 = list3.get(4);
                C1586k c1586k = (AbstractC1665j.m2981a(obj26, bool2) || obj26 == null) ? null : (C1586k) ((InterfaceC1601c) AbstractC1250C.f4483u.f170f).mo1h(obj26);
                Object obj27 = list3.get(6);
                String str5 = obj27 != null ? (String) obj27 : null;
                Object obj28 = list3.get(7);
                AbstractC1665j.m2981a(obj28, bool2);
                C2019o c2019o3 = obj28 != null ? (C2019o) interfaceC1601c.mo1h(obj28) : null;
                AbstractC1665j.m2982b(c2019o3);
                long j9 = c2019o3.f6748a;
                Object obj29 = list3.get(8);
                C1951a c1951a = (AbstractC1665j.m2981a(obj29, bool2) || obj29 == null) ? null : (C1951a) ((InterfaceC1601c) AbstractC1250C.f4476n.f170f).mo1h(obj29);
                Object obj30 = list3.get(9);
                C1966p c1966p = (AbstractC1665j.m2981a(obj30, bool2) || obj30 == null) ? null : (C1966p) ((InterfaceC1601c) AbstractC1250C.f4473k.f170f).mo1h(obj30);
                Object obj31 = list3.get(10);
                C1781b c1781b = C1781b.f6089f;
                C1781b c1781b2 = (AbstractC1665j.m2981a(obj31, bool2) || obj31 == null) ? null : (C1781b) ((InterfaceC1601c) AbstractC1250C.f4487y.f170f).mo1h(obj31);
                Object obj32 = list3.get(11);
                AbstractC1665j.m2981a(obj32, bool2);
                C2762u c2762u2 = obj32 != null ? obj32.equals(bool2) ? new C2762u(C2762u.f8762g) : new C2762u(AbstractC2767z.m4933c(((Integer) obj32).intValue())) : null;
                AbstractC1665j.m2982b(c2762u2);
                long j10 = c2762u2.f8764a;
                Object obj33 = list3.get(12);
                C1962l c1962l = (AbstractC1665j.m2981a(obj33, bool2) || obj33 == null) ? null : (C1962l) ((InterfaceC1601c) AbstractC1250C.f4472j.f170f).mo1h(obj33);
                Object obj34 = list3.get(13);
                C2737L c2737l = C2737L.f8703d;
                return new C1252E(j7, j8, c1587l2, c1585j, c1586k, (AbstractC1592q) null, str5, j9, c1951a, c1966p, c1781b2, j10, c1962l, (AbstractC1665j.m2981a(obj34, bool2) || obj34 == null) ? null : (C2737L) ((InterfaceC1601c) AbstractC1250C.f4477o.f170f).mo1h(obj34), 49184);
            case 6:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                Object obj35 = list4.get(0);
                Boolean bool3 = obj35 != null ? (Boolean) obj35 : null;
                AbstractC1665j.m2982b(bool3);
                boolean zBooleanValue = bool3.booleanValue();
                Object obj36 = list4.get(1);
                C1272j c1272j = (AbstractC1665j.m2981a(obj36, Boolean.FALSE) || obj36 == null) ? null : (C1272j) ((InterfaceC1601c) AbstractC1251D.f4490b.f170f).mo1h(obj36);
                AbstractC1665j.m2982b(c1272j);
                return new C1284v(c1272j.f4575a, zBooleanValue);
            case 7:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1272j(((Integer) obj).intValue());
            case 8:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1955e(((Integer) obj).intValue());
            case 9:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj37 = list5.get(0);
                C1968r c1968r = (AbstractC1665j.m2981a(obj37, Boolean.FALSE) || obj37 == null) ? null : (C1968r) ((InterfaceC1601c) AbstractC1251D.f4493e.f170f).mo1h(obj37);
                AbstractC1665j.m2982b(c1968r);
                int i14 = c1968r.f6652a;
                Object obj38 = list5.get(1);
                Boolean bool4 = obj38 != null ? (Boolean) obj38 : null;
                AbstractC1665j.m2982b(bool4);
                return new C1969s(i14, bool4.booleanValue());
            case 10:
                AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C1968r(((Integer) obj).intValue());
            case 11:
                C0102b c0102b = ((C1350a0) obj).f4784a;
                if (c0102b != null) {
                    c0102b.mo6a();
                }
                return C0891q.f2780a;
            case 12:
                AbstractC1665j.m2985e((C1427f) obj, "it");
                return C0891q.f2780a;
            case 13:
                Context context = (Context) obj;
                AbstractC1665j.m2985e(context, "viewContext");
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 14:
                Context context2 = (Context) obj;
                AbstractC1665j.m2985e(context2, "viewContext");
                ImageView imageView2 = new ImageView(context2);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView2;
            case 15:
                Context context3 = (Context) obj;
                AbstractC1665j.m2985e(context3, "viewContext");
                ImageView imageView3 = new ImageView(context3);
                imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView3;
            case 16:
                ((Boolean) obj).getClass();
                List list6 = AbstractC1543P.f5365a;
                return C0891q.f2780a;
            case 17:
                C1608a c1608a = (C1608a) obj;
                AbstractC1665j.m2985e(c1608a, "it");
                return c1608a.f5541c;
            case 18:
                C1771b c1771b = (C1771b) obj;
                AbstractC1665j.m2985e(c1771b, "it");
                AbstractC1785a abstractC1785a = c1771b.f6068j;
                if (abstractC1785a instanceof C1771b) {
                    return (C1771b) abstractC1785a;
                }
                return null;
            case 19:
                C1771b c1771b2 = (C1771b) obj;
                AbstractC1665j.m2985e(c1771b2, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(c1771b2.f6066h);
                sb.append('=');
                sb.append(c1771b2.f6067i);
                return sb.toString();
            case 20:
                Resources resources = (Resources) obj;
                AbstractC1665j.m2985e(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 21:
                return new C1997d((Map) obj);
            case 22:
                return obj;
            case 23:
                synchronized (AbstractC2082n.f6972c) {
                    ?? r32 = AbstractC2082n.f6978i;
                    int size = r32.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        ((InterfaceC1601c) r32.get(i15)).mo1h(obj);
                    }
                }
                return C0891q.f2780a;
            case 24:
                C1286x c1286x = AbstractC2082n.f6970a;
                return C0891q.f2780a;
            case 25:
                InterfaceC1049g interfaceC1049g = (InterfaceC1049g) obj;
                if (interfaceC1049g instanceof AbstractC2153p) {
                    return (AbstractC2153p) interfaceC1049g;
                }
                return null;
            case 26:
                return C0891q.f2780a;
            case 27:
                ((InterfaceC1599a) obj).mo6a();
                return C0891q.f2780a;
            case 28:
                return new C2663k(((Float) obj).floatValue());
            default:
                return new C2663k(((Integer) obj).intValue());
        }
    }
}
