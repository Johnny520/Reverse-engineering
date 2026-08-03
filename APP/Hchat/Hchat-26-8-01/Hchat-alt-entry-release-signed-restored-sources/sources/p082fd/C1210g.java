package p082fd;

import ae.C0071b;
import ae.C0073d;
import ae.C0075f;
import af.C0083f;
import be.AbstractC0269a;
import be.AbstractC0283h;
import be.C0285i;
import be.C0294m0;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import nc.C2959b;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p014b.C0126e;
import p020b5.C0184c;
import p020b5.C0192k;
import p025bc.C0257g;
import p025bc.EnumC0251a;
import p038ce.C0559l;
import p038ce.C0560m;
import p052dd.AbstractC0770a;
import p068eh.AbstractC0921a;
import p081fc.C1199b;
import p081fc.C1203f;
import p128ic.C2036a;
import p128ic.C2039d;
import p140jd.AbstractC2124c;
import p199nd.C2984p;
import p199nd.C2985q;
import p199nd.C2992x;
import p199nd.C2993y;
import p214oc.C3126c;
import p215od.C3131d;
import p232pc.C3379a;
import p232pc.C3381c;
import p232pc.C3382d;
import p233pd.AbstractC3409t;
import p233pd.C3393d;
import p233pd.C3398i;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3507k;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4320p;
import p302ud.C4322r;
import p351xe.AbstractC5798s;
import p351xe.C5787h;

/* JADX INFO: renamed from: fd.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1210g {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2844b f4066e = AbstractC2846d.m6274b(C1210g.class);

    /* JADX INFO: renamed from: a */
    public final C4322r f4067a;

    /* JADX INFO: renamed from: b */
    public final C1204a f4068b;

    /* JADX INFO: renamed from: c */
    public final C0126e f4069c;

    /* JADX INFO: renamed from: d */
    public final C1211h f4070d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1210g(C1204a c1204a, C4322r c4322r) {
        this.f4067a = c4322r;
        this.f4068b = c1204a;
        this.f4069c = c1204a.f4042c;
        this.f4070d = new C1211h(c1204a, c4322r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C1210g m3313h(C4322r c4322r) {
        return new C1210g(new C1204a(c4322r.f14411l, null, false, true, true, 1), c4322r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m3314i(int i9) {
        return i9 < 0 ? String.format("LB_%x", Integer.valueOf(-i9)) : String.format("L%x", Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m3315j(C4305a c4305a) {
        return String.format("L%d", Integer.valueOf(c4305a.f14348i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3316a(C1203f c1203f, C4320p c4320p, boolean z9) {
        C0071b c0071b = (C0071b) c4320p.f9217g.mo6237c(C2825b.f9179F);
        if (c0071b == null) {
            return;
        }
        c1203f.mo3255e("     // Catch:");
        for (C0075f c0075f : c0071b.f228g) {
            c1203f.mo3254d(' ');
            this.f4068b.m3289p(c1203f, c0075f.m443b());
            c1203f.mo3255e(" -> ");
            if (z9) {
                c1203f.mo3255e(m3314i(c0075f.f233b));
            } else {
                c1203f.mo3255e(m3315j(c0075f.f234c));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3317b(C1203f c1203f) {
        boolean z9;
        boolean z10;
        C3507k c3507kM7398b;
        C3382d c3382d;
        C4322r c4322r = this.f4067a;
        C3131d c3131d = c4322r.f14410k;
        C3131d c3131d2 = c4322r.f14410k;
        C4309e c4309e = c4322r.f14411l;
        boolean z11 = true;
        if (c3131d.m6662e()) {
            c1203f.m3269p();
            c1203f.mo3261k(c4322r);
            c1203f.mo3255e("static");
            return true;
        }
        boolean z12 = false;
        if (c4322r.f9217g.mo6235a(EnumC2824a.f9122H)) {
            c1203f.m3269p();
            c1203f.mo3261k(c4322r);
            return false;
        }
        C2992x c2992x = (C2992x) c4322r.f9217g.mo6237c(C2825b.f9203r);
        EnumC0251a enumC0251a = EnumC0251a.f700k;
        if (c2992x != null && !c2992x.f9767i.contains(c4322r)) {
            c1203f.m3271r("@Override");
            if (c4322r.m6385N(enumC0251a)) {
                c1203f.mo3255e(" // ");
                c1203f.mo3255e(AbstractC5798s.m10517k(c2992x.f9765g, ", ", new C0640b(21)));
            }
        }
        C0126e c0126e = this.f4069c;
        c0126e.m631i(c4322r, c1203f);
        C0192k c0192k = c4309e.f14375o;
        C0192k c0192kM860m = c4322r.f14412m;
        if (c0192k.m852d()) {
            c0192kM860m = c0192kM860m.m860m(1024).m860m(1);
        }
        if ((c0192k.f488b & 8192) != 0) {
            c0192kM860m = c0192kM860m.m860m(1);
        }
        if (c3131d2.m6663f() && c4309e.m8658c0()) {
            c0192kM860m = c0192kM860m.m860m(7);
        }
        if (!c3131d2.f10150g.equals(c3131d2.f10157n) && !c0192kM860m.m849a()) {
            AbstractC2124c.m5345f(c1203f, c4322r, c3131d2.f10150g);
        }
        if (c4322r.f9217g.mo6235a(EnumC2824a.f9140Z) && c4322r.m6385N(EnumC0251a.f698i)) {
            c1203f.m3271r("/*");
            c1203f.m3268o();
            c1203f.m3271r("Code decompiled incorrectly, please refer to instructions dump.");
            if (!c4309e.f14371k.f14435a.f746o) {
                if (c1203f instanceof C1199b) {
                    c1203f.m3271r("To view partially-correct code enable 'Show inconsistent code' option in preferences");
                } else {
                    c1203f.m3271r("To view partially-correct add '--show-bad-code' argument");
                }
            }
            c1203f.m3267n();
            c1203f.m3271r("*/");
        }
        c1203f.m3272s(c4322r.f9752i);
        c1203f.mo3255e(c0192kM860m.m858j(c4322r.m6385N(enumC0251a)));
        if (c0192k.m852d() && !c4322r.f14415p && !c4322r.f14412m.m856h()) {
            c1203f.mo3255e("default ");
        }
        List list = c4322r.f14421v;
        C1204a c1204a = this.f4068b;
        if (c1204a.m3279d(c1203f, list, false)) {
            c1203f.mo3254d(' ');
        }
        if (c0192kM860m.m849a()) {
            c1203f.mo3261k(c4322r);
            c1203f.mo3255e(c1204a.f4040a.f14373m.m6646k());
        } else {
            c1204a.m3292s(c1203f, c4322r.f14419t);
            c1203f.mo3254d(' ');
            C2993y c2993y = (C2993y) c4322r.f9217g.mo6237c(C2825b.f9200o);
            C4322r c4322r2 = c2993y != null ? c2993y.f9768g : c4322r;
            c1203f.mo3261k(c4322r2);
            c1203f.mo3255e(c4322r2.f14410k.f10157n);
        }
        c1203f.mo3254d('(');
        List listM8694S = c4322r.m8694S();
        if (c3131d2.m6663f()) {
            if (c4309e.f9217g.mo6236b(C2825b.f9190e)) {
                if (listM8694S.size() == 2) {
                    listM8694S = Collections.EMPTY_LIST;
                } else if (listM8694S.size() > 2) {
                    listM8694S = listM8694S.subList(2, listM8694S.size());
                } else {
                    c4322r.m6383L("Incorrect number of args for enum constructor: " + listM8694S.size() + " (expected >= 2)");
                }
            } else if (c4322r.f9217g.mo6235a(EnumC2824a.f9119E)) {
                listM8694S = listM8694S.subList(1, listM8694S.size());
            }
        }
        C3381c c3381c = (C3381c) c4322r.f9217g.mo6237c(C3126c.f10134g);
        Iterator it = listM8694S.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            C3514r c3514r = (C3514r) it.next();
            C3515s c3515s = c3514r.f11440m;
            if (c3515s == null) {
                boolean z13 = c1204a.f4043d;
                c3507kM7398b = new C3507k();
                c3507kM7398b.f11412b = c3514r.f11419i;
                c3507kM7398b.f11411a = c3514r.getName();
                c3507kM7398b.f11415e = c3514r.m7380N();
                c3507kM7398b.f11416f = z11;
                c3507kM7398b.f11415e = c3514r.m7380N();
                if (z13) {
                    z9 = z11;
                    z10 = false;
                    c3507kM7398b.f11413c = Collections.singletonList(new C3515s(c3514r.f11439l, 0, c3514r));
                } else {
                    z9 = z11;
                    z10 = false;
                }
            } else {
                z9 = z11;
                z10 = z12;
                c3507kM7398b = c3515s.m7398b();
            }
            if (c3381c != null) {
                ArrayList arrayList = c3381c.f10915g;
                if (i9 < arrayList.size() && (c3382d = (C3382d) arrayList.get(i9)) != null) {
                    HashMap map = c3382d.f10916g;
                    if (!map.isEmpty()) {
                        Iterator it2 = map.values().iterator();
                        while (it2.hasNext()) {
                            c0126e.m641s(c1203f, (C2959b) it2.next());
                            c1203f.mo3254d(' ');
                        }
                    }
                }
            }
            if (c3507kM7398b.f11414d) {
                c1203f.mo3255e("final ");
            }
            AbstractC3506j abstractC3506j = c3507kM7398b.f11412b;
            if (abstractC3506j == null || abstractC3506j == AbstractC3506j.f11404u) {
                abstractC3506j = c3514r.f11419i;
            }
            if (it.hasNext() || (c4322r.f14412m.f488b & 128) == 0) {
                c1204a.m3292s(c1203f, abstractC3506j);
            } else {
                abstractC3506j.getClass();
                if (abstractC3506j instanceof C3497a) {
                    c1204a.m3292s(c1203f, abstractC3506j.mo7340g());
                    c1203f.mo3255e("...");
                } else {
                    c4322r.m6383L("Last argument in varargs method is not array: ".concat(String.valueOf(c3507kM7398b)));
                    c1204a.m3292s(c1203f, abstractC3506j);
                }
            }
            c1203f.mo3254d(' ');
            String strM3323a = this.f4070d.m3323a(c3507kM7398b);
            if ((c1203f instanceof C1199b) && c3515s != null) {
                c1203f.mo3261k(C2039d.m4990a(c4322r, c3507kM7398b.m7367a()));
            }
            c1203f.mo3255e(strM3323a);
            i9++;
            if (it.hasNext()) {
                c1203f.mo3255e(", ");
            }
            z12 = z10;
            z11 = z9;
        }
        boolean z14 = z11;
        c1203f.mo3254d(')');
        List listMo2223s = c4322r.mo2223s();
        if (!listMo2223s.isEmpty()) {
            c1203f.mo3255e(" throws ");
            Iterator it3 = listMo2223s.iterator();
            while (it3.hasNext()) {
                ((C1204a) c0126e.f333i).m3292s(c1203f, (AbstractC3506j) it3.next());
                if (it3.hasNext()) {
                    c1203f.mo3255e(", ");
                }
            }
        }
        if ((c4309e.f14375o.f488b & 8192) != 0) {
            C3379a c3379a = (C3379a) c4322r.f9217g.mo6237c(C3126c.f10135h);
            C2958a c2958a = c3379a == null ? null : c3379a.f10913g;
            if (c2958a != null) {
                c1203f.mo3255e(" default ");
                c0126e.m639q(c4309e.f14371k, c1203f, c2958a);
            }
        }
        return z14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3318c(C1203f c1203f, int i9) {
        C4322r c4322r = this.f4067a;
        if (i9 == 3 && c4322r.mo8668n().f14435a.f722H != EnumC0251a.f701l) {
            long j3 = c4322r.f14414o;
            if (j3 > 200) {
                c1203f.m3268o();
                c1203f.m3271r("Method dump skipped, instruction units count: " + j3);
                if (c1203f instanceof C1199b) {
                    c1203f.m3271r("To view this dump change 'Code comments level' option to 'DEBUG'");
                } else {
                    c1203f.m3271r("To view this dump add '--comments-level debug' option");
                }
                c1203f.m3267n();
                return;
            }
        }
        if (i9 != 1) {
            List listMo6238d = c4322r.f9217g.mo6238d(C2825b.f9188c);
            try {
                try {
                    c4322r.m8706e0();
                    c4322r.m8702a0();
                    Iterator it = AbstractC0770a.m1987a().iterator();
                    while (it.hasNext()) {
                        AbstractC0283h.m1164i0((AbstractC0269a) it.next(), c4322r);
                    }
                    final int i10 = 0;
                    listMo6238d.forEach(new Consumer(this) { // from class: fd.f

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1210g f4065b;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f4065b = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            C2984p c2984p = (C2984p) obj;
                            switch (i10) {
                                case 0:
                                    this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                    break;
                                default:
                                    this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                    break;
                            }
                        }
                    });
                    final int i11 = 1;
                    listMo6238d.forEach(new Consumer(this) { // from class: fd.f

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1210g f4065b;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f4065b = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            C2984p c2984p = (C2984p) obj;
                            switch (i11) {
                                case 0:
                                    this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                    break;
                                default:
                                    this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                    break;
                            }
                        }
                    });
                } catch (Exception e6) {
                    f4066e.mo6251e("Error reload instructions in fallback mode:", e6);
                    c1203f.m3271r("// Can't load method instructions: " + e6.getMessage());
                    final int i12 = 1;
                    listMo6238d.forEach(new Consumer(this) { // from class: fd.f

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C1210g f4065b;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        {
                            this.f4065b = this;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            C2984p c2984p = (C2984p) obj;
                            switch (i12) {
                                case 0:
                                    this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                    break;
                                default:
                                    this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                    break;
                            }
                        }
                    });
                    return;
                }
            } catch (Throwable th2) {
                final int i13 = 1;
                listMo6238d.forEach(new Consumer(this) { // from class: fd.f

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C1210g f4065b;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f4065b = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C2984p c2984p = (C2984p) obj;
                        switch (i13) {
                            case 0:
                                this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                break;
                            default:
                                this.f4065b.f4067a.m6232x(C2825b.f9188c, c2984p);
                                break;
                        }
                    }
                });
                throw th2;
            }
        }
        C4320p[] c4320pArr = c4322r.f14424y;
        if (c4320pArr == null) {
            c1203f.m3271r("// Can't load method instructions.");
            return;
        }
        c1203f.m3268o();
        C3514r c3514r = c4322r.f14422w;
        if (c3514r != null) {
            C1211h c1211h = this.f4070d;
            c1211h.getClass();
            String name = c3514r.getName();
            if (name == null || c1211h.f4071g) {
                name = AbstractC0921a.m2249l(c3514r.f11439l, "r");
            }
            c1203f.m3271r(name);
            c1203f.mo3255e(" = this;");
        }
        int i14 = c1203f.f4037c;
        C1210g c1210gM3313h = m3313h(c4322r);
        C1208e c1208e = new C1208e(c1210gM3313h, true);
        C4320p c4320p = null;
        for (C4320p c4320p2 : c4320pArr) {
            if (c4320p2 != null) {
                C2829f c2829f = c4320p2.f9217g;
                C2825b c2825b = C2825b.f9188c;
                if (c2829f.mo6236b(c2825b)) {
                    for (C2984p c2984p : c4320p2.f9217g.mo6238d(c2825b)) {
                        c1203f.m3271r("// ");
                        c1203f.mo3255e(c2984p.f9748g);
                    }
                } else {
                    if (i9 != 2) {
                        if (c4320p2.f9217g.mo6236b(C2825b.f9178E)) {
                            c1203f.m3267n();
                            c1203f.m3271r(m3314i(c4320p2.f14399n).concat(":"));
                            c1203f.m3268o();
                        } else {
                            C2829f c2829f2 = c4320p2.f9217g;
                            C2825b c2825b2 = C2825b.f9181H;
                            if (c2829f2.mo6236b(c2825b2)) {
                                if (c4320p != null && c4320p.f14396k == EnumC3400k.f10992v) {
                                    List listMo6238d2 = c4320p2.f9217g.mo6238d(c2825b2);
                                    if (listMo6238d2.size() == 1) {
                                        C2985q c2985q = (C2985q) listMo6238d2.get(0);
                                        if (c2985q.f9750a == c4320p.f14399n && c2985q.f9751b == c4320p2.f14399n) {
                                            if (c4320p2.f14399n == ((C3398i) c4320p).mo7173k0()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    EnumC3400k enumC3400k = c4320p2.f14396k;
                    if (enumC3400k != EnumC3400k.f10965Q) {
                        if (i9 == 3) {
                            try {
                                boolean zContains = enumC3400k == EnumC3400k.f10978h ? ((C3393d) c4320p2).f10930o.contains("*/") : false;
                                if (zContains) {
                                    c1203f.m3267n();
                                    c1203f.m3271r("*/");
                                    c1203f.m3271r("//  ");
                                } else {
                                    c1203f.m3272s(c4320p2.f9752i);
                                }
                                C2036a.m4989a(c1203f, c4320p2);
                                C3514r c3514r2 = c4320p2.f14397l;
                                if (c3514r2 != null) {
                                    AbstractC3506j abstractC3506j = c3514r2.f11419i;
                                    if (abstractC3506j.mo7345w()) {
                                        c1203f.mo3255e(abstractC3506j.toString()).mo3254d(' ');
                                    }
                                }
                                c1208e.m3306j(c4320p2, c1203f, EnumC1207d.f4055i);
                                if (zContains) {
                                    c1203f.m3271r("/*");
                                    c1203f.m3268o();
                                }
                                c1210gM3313h.m3316a(c1203f, c4320p2, true);
                                AbstractC2124c.m5340a(c1203f, c1210gM3313h.f4067a, c4320p2);
                            } catch (Exception e7) {
                                f4066e.mo6266t("Error generate fallback instruction: ", e7.getCause());
                                c1203f.f4037c = i14;
                                c1203f.m3273t();
                                c1203f.m3271r("// error: ".concat(String.valueOf(c4320p2)));
                            }
                        }
                    }
                }
                c4320p = c4320p2;
            }
        }
        c1203f.m3267n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3319d(C1203f c1203f) {
        C4322r c4322r = this.f4067a;
        C4309e c4309e = c4322r.f14411l;
        C0257g c0257g = c4309e.f14371k.f14435a;
        C4309e c4309eM8656a0 = c4309e.m8656a0();
        if (c4309eM8656a0.f9217g.mo6237c(C2825b.f9195j) != null) {
            C0086a.m445d();
            return;
        }
        int iOrdinal = c0257g.f719E.ordinal();
        if (iOrdinal == 0) {
            if (this.f4068b.f4043d || c4322r.f14407G == null) {
                m3321f(c1203f);
                return;
            } else {
                m3320e(c1203f);
                return;
            }
        }
        if (iOrdinal == 1) {
            m3320e(c1203f);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            m3318c(c1203f, 1);
            return;
        }
        if (c4322r.f14425z == null) {
            c1203f.m3271r("// Blocks not ready for simple mode, using fallback");
            m3318c(c1203f, 1);
            return;
        }
        C0257g c0257g2 = c4322r.f14411l.f14371k.f14435a;
        c0257g2.f744m.getClass();
        C1199b c1199b = new C1199b(c0257g2);
        try {
            c1199b.f4037c = c1203f.f4037c;
            c1199b.m3273t();
            m3322g(c1199b);
            c1203f.mo3253c(c1199b);
        } catch (Exception e6) {
            C5787h.m10468a(c4322r, "Simple mode code generation failed", e6);
            AbstractC2124c.m5342c(c1203f, "Simple mode code generation failed", e6);
            m3321f(c1203f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m3320e(C1203f c1203f) throws Exception {
        C4322r c4322r = this.f4067a;
        try {
            new C1212i(this, false).m3329u(c1203f, c4322r.f14407G);
        } catch (BootstrapMethodError | StackOverflowError unused) {
            C0083f c0083f = new C0083f("StackOverflow");
            c4322r.getClass();
            C5787h.m10468a(c4322r, "Method code generation error", c0083f);
            AbstractC2124c.m5343d(c1203f, c4322r);
            m3321f(c1203f);
        } catch (Exception e6) {
            C4309e c4309eM8656a0 = c4322r.f14411l.m8656a0();
            if (c4309eM8656a0.f9217g.mo6235a(EnumC2824a.f9146f0)) {
                throw e6;
            }
            C5787h.m10468a(c4322r, "Method code generation error", e6);
            AbstractC2124c.m5343d(c1203f, c4322r);
            m3321f(c1203f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3321f(C1203f c1203f) {
        EnumC0251a enumC0251a = EnumC0251a.f698i;
        C4322r c4322r = this.f4067a;
        boolean zM6385N = c4322r.m6385N(enumC0251a);
        C3131d c3131d = c4322r.f14410k;
        if (zM6385N) {
            c1203f.m3271r("/*");
            m3318c(c1203f, 3);
            c1203f.m3271r("*/");
        }
        c1203f.m3271r("throw new UnsupportedOperationException(\"Method not decompiled: ");
        c1203f.mo3255e(c4322r.f14411l.f14373m.m6642f()).mo3254d('.').mo3255e(c3131d.f10157n).mo3254d('(').mo3255e(AbstractC5798s.m10516j(c3131d.f10152i, ", ")).mo3255e("):").mo3255e(c3131d.f10151h.toString()).mo3255e("\");");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3322g(C1199b c1199b) {
        List<C4305a> list;
        C0184c c0184c = new C0184c();
        C4322r c4322r = this.f4067a;
        c0184c.f469a = c4322r;
        c0184c.f470b = AbstractC0000a.m6D0(c4322r);
        c0184c.f471c = AbstractC0000a.m6D0(c4322r);
        BitSet bitSet = (BitSet) c0184c.f471c;
        BitSet bitSet2 = (BitSet) c0184c.f470b;
        for (C4305a c4305a : c4322r.f14425z) {
            if (c4305a.f14351l.isEmpty() && c4305a.f14352m.size() > 0 && c4305a.f14353n.size() == 1) {
                C4305a c4305a2 = (C4305a) c4305a.f14353n.get(0);
                List list2 = c4305a.f14352m;
                C0560m.m1573p(c4305a, c4305a2);
                if (list2.size() == 1) {
                    C0560m.m1575r((C4305a) list2.get(0), c4305a, c4305a2);
                } else {
                    Iterator it = new ArrayList(list2).iterator();
                    while (it.hasNext()) {
                        C0560m.m1575r((C4305a) it.next(), c4305a, c4305a2);
                    }
                }
                c4305a.m6231w(EnumC2824a.f9168u);
            }
        }
        C0559l.m1564o(c4322r);
        ArrayList arrayList = new ArrayList(c4322r.f14425z.size());
        AbstractC0000a.m61d1(c4322r, c4322r.f14402B, new C0073d(28), new C0294m0(3, arrayList));
        arrayList.removeIf(new C0285i(c0184c, 14));
        if (!c4322r.f14405E.isEmpty()) {
            Iterator it2 = c4322r.f14405E.iterator();
            while (it2.hasNext()) {
                C4305a c4305a3 = ((C0075f) it2.next()).f234c;
                if (c4305a3 != null) {
                    EnumSet enumSet = C0560m.f1749g;
                    Iterator it3 = c4305a3.f14352m.iterator();
                    while (it3.hasNext()) {
                        ((C4305a) it3.next()).f14353n.remove(c4305a3);
                    }
                    c4305a3.f14352m.clear();
                }
            }
        }
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            int size = arrayList.size();
            C4305a c4305a4 = null;
            int i9 = 0;
            while (i9 < size) {
                C4305a c4305a5 = (C4305a) arrayList.get(i9);
                i9++;
                C4305a c4305a6 = i9 == size ? null : (C4305a) arrayList.get(i9);
                List list3 = c4305a5.f14352m;
                int size2 = list3.size();
                if (size2 > 1) {
                    bitSet2.set(c4305a5.f14349j);
                } else if (size2 == 1 && c4305a4 != null && !c4305a4.equals(list3.get(0))) {
                    if (!c4305a5.f9217g.mo6235a(EnumC2824a.f9116B)) {
                        bitSet2.set(c4305a5.f14349j);
                    }
                    if (c4305a4.f14353n.size() == 1 && !c4322r.m8700Y(c4305a4)) {
                        bitSet.set(c4305a4.f14349j);
                    }
                }
                C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a5);
                if (c4320pM57c0 instanceof AbstractC3409t) {
                    if (c4320pM57c0 instanceof C3398i) {
                        C3398i c3398i = (C3398i) c4320pM57c0;
                        C4305a c4305a7 = c3398i.f10946q;
                        if (Objects.equals(c4305a6, c4305a7)) {
                            c3398i.m7176l0();
                            bitSet2.set(c3398i.f10946q.f14349j);
                        } else {
                            bitSet2.set(c4305a7.f14349j);
                        }
                        c3398i.m7177m0();
                    } else {
                        Iterator it4 = c4305a5.f14353n.iterator();
                        while (it4.hasNext()) {
                            bitSet2.set(((C4305a) it4.next()).f14349j);
                        }
                    }
                }
                if (c4305a5.f9217g.mo6236b(C2825b.f9178E)) {
                    bitSet2.set(c4305a5.f14349j);
                }
                if (c4305a6 == null && !c4322r.m8700Y(c4305a5)) {
                    bitSet.set(c4305a5.f14349j);
                }
                c4305a4 = c4305a5;
            }
            list = arrayList;
            if (c4322r.m8701Z()) {
                int size3 = arrayList.size() - 1;
                C4305a c4305a8 = (C4305a) arrayList.get(size3);
                list = arrayList;
                if (c4305a8.f9217g.mo6235a(EnumC2824a.f9161n)) {
                    arrayList.remove(size3);
                    list = arrayList;
                }
            }
        }
        C1208e c1208e = new C1208e(this, true);
        for (C4305a c4305a9 : list) {
            C2829f c2829f = c4305a9.f9217g;
            EnumC2824a enumC2824a = EnumC2824a.f9166s;
            if (!c2829f.mo6235a(enumC2824a)) {
                if (bitSet2.get(c4305a9.f14349j)) {
                    c1199b.m3267n();
                    c1199b.m3271r(m3315j(c4305a9));
                    c1199b.mo3254d(':');
                    c1199b.m3268o();
                }
                for (C4320p c4320p : c4305a9.f14351l) {
                    if (!c4320p.f9217g.mo6235a(enumC2824a)) {
                        C3514r c3514r = c4320p.f14397l;
                        if (c3514r != null) {
                            C3507k c3507kM7398b = c3514r.f11440m.m7398b();
                            if (!c3507kM7398b.f11416f) {
                                c4320p.m6231w(EnumC2824a.f9131Q);
                                c3507kM7398b.f11416f = true;
                            }
                        }
                        C2036a.m4989a(c1199b, c4320p);
                        c1208e.m3306j(c4320p, c1199b, null);
                        m3316a(c1199b, c4320p, false);
                        AbstractC2124c.m5340a(c1199b, c4322r, c4320p);
                    }
                }
                if (bitSet.get(c4305a9.f14349j)) {
                    c1199b.m3271r("goto ");
                    c1199b.mo3255e(m3315j((C4305a) c4305a9.f14353n.get(0)));
                }
            }
        }
    }
}
