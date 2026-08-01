package p182m5;

import java.util.ArrayList;
import p225p5.C5953a;
import p225p5.C5957e;
import p225p5.EnumC5954b;
import p254r5.AbstractC6487a;
import p254r5.C6491c;
import p254r5.C6492c0;
import p254r5.C6493d;
import p254r5.C6496e0;
import p254r5.C6510o;
import p254r5.C6513r;
import p254r5.C6520y;
import p269s5.C7188c;
import p269s5.InterfaceC7190e;

/* JADX INFO: renamed from: m5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4985d {

    /* JADX INFO: renamed from: a */
    public static final C6496e0 f15151a = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: b */
    public static final C6496e0 f15152b = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: c */
    public static final C6496e0 f15153c = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: d */
    public static final C6496e0 f15154d = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: e */
    public static final C6496e0 f15155e = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: f */
    public static final C6496e0 f15156f = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: g */
    public static final C6496e0 f15157g = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/SourceDebugExtension;"));

    /* JADX INFO: renamed from: h */
    public static final C6496e0 f15158h = C6496e0.m25758u(C7188c.m28404v("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: i */
    public static final C6492c0 f15159i = new C6492c0("accessFlags");

    /* JADX INFO: renamed from: j */
    public static final C6492c0 f15160j = new C6492c0("name");

    /* JADX INFO: renamed from: k */
    public static final C6492c0 f15161k = new C6492c0("value");

    /* JADX INFO: renamed from: a */
    public static C5953a m20115a(C5953a c5953a) {
        C5953a c5953a2 = new C5953a(f15151a, EnumC5954b.SYSTEM);
        c5953a2.m23929B(new C5957e(f15161k, new C6491c(c5953a)));
        c5953a2.mo6829t();
        return c5953a2;
    }

    /* JADX INFO: renamed from: b */
    public static C6493d m20116b(InterfaceC7190e interfaceC7190e) {
        int size = interfaceC7190e.size();
        C6493d.a aVar = new C6493d.a(size);
        for (int i10 = 0; i10 < size; i10++) {
            aVar.m25748F(i10, C6496e0.m25758u(interfaceC7190e.getType(i10)));
        }
        aVar.mo6829t();
        return new C6493d(aVar);
    }

    /* JADX INFO: renamed from: c */
    public static C5953a m20117c(C6496e0 c6496e0) {
        C5953a c5953a = new C5953a(f15152b, EnumC5954b.SYSTEM);
        c5953a.m23929B(new C5957e(f15161k, c6496e0));
        c5953a.mo6829t();
        return c5953a;
    }

    /* JADX INFO: renamed from: d */
    public static C5953a m20118d(C6520y c6520y) {
        C5953a c5953a = new C5953a(f15153c, EnumC5954b.SYSTEM);
        c5953a.m23929B(new C5957e(f15161k, c6520y));
        c5953a.mo6829t();
        return c5953a;
    }

    /* JADX INFO: renamed from: e */
    public static C5953a m20119e(C6492c0 c6492c0, int i10) {
        C5953a c5953a = new C5953a(f15154d, EnumC5954b.SYSTEM);
        AbstractC6487a abstractC6487a = c6492c0;
        if (c6492c0 == null) {
            abstractC6487a = C6513r.f20434q;
        }
        c5953a.m23929B(new C5957e(f15160j, abstractC6487a));
        c5953a.m23929B(new C5957e(f15159i, C6510o.m25781v(i10)));
        c5953a.mo6829t();
        return c5953a;
    }

    /* JADX INFO: renamed from: f */
    public static C5953a m20120f(InterfaceC7190e interfaceC7190e) {
        C6493d c6493dM20116b = m20116b(interfaceC7190e);
        C5953a c5953a = new C5953a(f15155e, EnumC5954b.SYSTEM);
        c5953a.m23929B(new C5957e(f15161k, c6493dM20116b));
        c5953a.mo6829t();
        return c5953a;
    }

    /* JADX INFO: renamed from: g */
    public static C5953a m20121g(C6492c0 c6492c0) {
        C5953a c5953a = new C5953a(f15156f, EnumC5954b.SYSTEM);
        String strM25741n = c6492c0.m25741n();
        int length = strM25741n.length();
        ArrayList arrayList = new ArrayList(20);
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (strM25741n.charAt(i10) == 'L') {
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    char cCharAt = strM25741n.charAt(i11);
                    if (cCharAt == ';') {
                        i11++;
                        break;
                    }
                    if (cCharAt == '<') {
                        break;
                    }
                    i11++;
                }
            } else {
                while (i11 < length && strM25741n.charAt(i11) != 'L') {
                    i11++;
                }
            }
            arrayList.add(strM25741n.substring(i10, i11));
            i10 = i11;
        }
        int size = arrayList.size();
        C6493d.a aVar = new C6493d.a(size);
        for (int i12 = 0; i12 < size; i12++) {
            aVar.m25748F(i12, new C6492c0((String) arrayList.get(i12)));
        }
        aVar.mo6829t();
        c5953a.m23929B(new C5957e(f15161k, new C6493d(aVar)));
        c5953a.mo6829t();
        return c5953a;
    }

    /* JADX INFO: renamed from: h */
    public static C5953a m20122h(C6492c0 c6492c0) {
        C5953a c5953a = new C5953a(f15157g, EnumC5954b.SYSTEM);
        c5953a.m23929B(new C5957e(f15161k, c6492c0));
        c5953a.mo6829t();
        return c5953a;
    }

    /* JADX INFO: renamed from: i */
    public static C5953a m20123i(InterfaceC7190e interfaceC7190e) {
        C6493d c6493dM20116b = m20116b(interfaceC7190e);
        C5953a c5953a = new C5953a(f15158h, EnumC5954b.SYSTEM);
        c5953a.m23929B(new C5957e(f15161k, c6493dM20116b));
        c5953a.mo6829t();
        return c5953a;
    }
}
