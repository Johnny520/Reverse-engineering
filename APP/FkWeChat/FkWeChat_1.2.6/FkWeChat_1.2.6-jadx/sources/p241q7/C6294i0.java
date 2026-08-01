package p241q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p034c7.InterfaceC1368h0;
import p184m7.C5057a;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p210o7.AbstractC5653e;
import p228p8.InterfaceC5976f;
import p241q7.AbstractC6296j0;
import p241q7.AbstractC6301m;
import p257r8.AbstractC6535d;
import p281t6.AbstractC8136b;
import p281t6.AbstractC8149h0;
import p281t6.C8157l0;
import p281t6.C8173z;
import p281t6.InterfaceC8143e0;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: q7.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6294i0 {

    /* JADX INFO: renamed from: a */
    public final C6319w f19725a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1368h0 f19726b;

    /* JADX INFO: renamed from: c */
    public final List f19727c;

    /* JADX INFO: renamed from: d */
    public final List f19728d;

    /* JADX INFO: renamed from: e */
    public final boolean f19729e;

    /* JADX INFO: renamed from: f */
    public final C6302m0 f19730f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f19731g;

    /* JADX INFO: renamed from: h */
    public AbstractC6301m.b f19732h;

    /* JADX INFO: renamed from: i */
    public int f19733i;

    /* JADX INFO: renamed from: q7.i0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: A */
        public int f19734A;

        /* JADX INFO: renamed from: q */
        public Object f19735q;

        /* JADX INFO: renamed from: r */
        public Object f19736r;

        /* JADX INFO: renamed from: s */
        public Object f19737s;

        /* JADX INFO: renamed from: t */
        public Object f19738t;

        /* JADX INFO: renamed from: u */
        public int f19739u;

        /* JADX INFO: renamed from: v */
        public int f19740v;

        /* JADX INFO: renamed from: w */
        public int f19741w;

        /* JADX INFO: renamed from: x */
        public double f19742x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f19743y;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f19743y = obj;
            this.f19734A |= Integer.MIN_VALUE;
            return C6294i0.this.m24898f(null, 0, null, 0.0d, this);
        }
    }

    /* JADX INFO: renamed from: q7.i0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f19745q;

        /* JADX INFO: renamed from: s */
        public int f19747s;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f19745q = obj;
            this.f19747s |= Integer.MIN_VALUE;
            return C6294i0.this.m24901i(this);
        }
    }

    public C6294i0(C6319w c6319w, InterfaceC1368h0 interfaceC1368h0, List list) throws C5057a {
        c6319w.getClass();
        interfaceC1368h0.getClass();
        list.getClass();
        this.f19725a = c6319w;
        this.f19726b = interfaceC1368h0;
        this.f19727c = list;
        C6302m0 c6302m0 = null;
        this.f19729e = AbstractC8621f0.m33132d0(AbstractC5653e.m22862g(interfaceC1368h0.mo5372m()), '/', false, 2, null);
        this.f19731g = new ArrayList(16);
        this.f19732h = AbstractC6301m.f19755b.m24920d();
        try {
            List listM24900h = m24900h(AbstractC5653e.m22862g(interfaceC1368h0.mo5372m()));
            this.f19728d = listM24900h;
            if (!list.isEmpty()) {
                c6302m0 = new C6302m0(interfaceC1368h0, listM24900h);
            }
            this.f19730f = c6302m0;
        } catch (C8157l0 e10) {
            throw new C5057a("Url decode failed for " + AbstractC5653e.m22860e(this.f19726b.mo5372m()), e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC6296j0 m24894b() {
        C8173z c8173zM31822x;
        ArrayList arrayList = this.f19731g;
        if (arrayList.isEmpty()) {
            C6319w c6319w = this.f19725a;
            AbstractC6301m.b bVar = this.f19732h;
            if (bVar == null || (c8173zM31822x = bVar.m24924h()) == null) {
                c8173zM31822x = C8173z.f27462s.m31822x();
            }
            return new AbstractC6296j0.a(c6319w, "No matched subtrees found", c8173zM31822x);
        }
        int i10 = 0;
        InterfaceC8143e0 interfaceC8143e0M31618b = AbstractC8149h0.m31618b(0, 1, null);
        int iM20802q = AbstractC5114x.m20802q(arrayList);
        double dMin = Double.MAX_VALUE;
        if (iM20802q >= 0) {
            while (true) {
                Object obj = arrayList.get(i10);
                obj.getClass();
                AbstractC6296j0.b bVar2 = (AbstractC6296j0.b) obj;
                interfaceC8143e0M31618b.mo31876a(bVar2.m24905b());
                dMin = Math.min(dMin, bVar2.m24906c() == -1.0d ? 1.0d : bVar2.m24906c());
                if (i10 == iM20802q) {
                    break;
                }
                i10++;
            }
        }
        return new AbstractC6296j0.b(((AbstractC6296j0.b) AbstractC5081g0.m20587u0(arrayList)).m24903a(), interfaceC8143e0M31618b.build(), dMin);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1368h0 m24895c() {
        return this.f19726b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m24896d() {
        return this.f19729e;
    }

    /* JADX INFO: renamed from: e */
    public final List m24897e() {
        return this.f19728d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (r2 == r7) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01b5 -> B:76:0x01be). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m24898f(p241q7.C6319w r23, int r24, java.util.ArrayList r25, double r26, p228p8.InterfaceC5976f r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241q7.C6294i0.m24898f(q7.w, int, java.util.ArrayList, double, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m24899g(List list) {
        int i10;
        int i11;
        ArrayList arrayList = this.f19731g;
        int i12 = 0;
        int i13 = 0;
        while (i12 < arrayList.size() && i13 < list.size()) {
            double dM24906c = ((AbstractC6296j0.b) arrayList.get(i12)).m24906c();
            double dM24906c2 = ((AbstractC6296j0.b) list.get(i13)).m24906c();
            if (dM24906c == -1.0d) {
                i12++;
            } else {
                if (dM24906c2 != -1.0d) {
                    if (dM24906c != dM24906c2) {
                        return dM24906c2 > dM24906c;
                    }
                    i12++;
                }
                i13++;
            }
        }
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it = arrayList.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (!(((AbstractC6296j0.b) it.next()).m24906c() == -1.0d) && (i10 = i10 + 1) < 0) {
                    AbstractC5114x.m20809x();
                }
            }
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            i11 = 0;
            while (it2.hasNext()) {
                if (!(((AbstractC6296j0.b) it2.next()).m24906c() == -1.0d) && (i11 = i11 + 1) < 0) {
                    AbstractC5114x.m20809x();
                }
            }
        } else {
            i11 = 0;
        }
        return i11 > i10;
    }

    /* JADX INFO: renamed from: h */
    public final List m24900h(String str) {
        if (str.length() == 0 || AbstractC1061t.m3842c(str, "/")) {
            return AbstractC5114x.m20800o();
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '/') {
                i10++;
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = i13;
            String str2 = str;
            int iM33150m0 = AbstractC8621f0.m33150m0(str2, '/', i14, false, 4, null);
            i12 = iM33150m0 == -1 ? length : iM33150m0;
            if (i12 == i14) {
                i13 = i12 + 1;
            } else {
                int i15 = i12;
                arrayList.add(AbstractC8136b.m31590e(str2, i14, i15, null, 4, null));
                i13 = i15 + 1;
            }
            str = str2;
        }
        String str3 = str;
        if (!AbstractC6281c.m24878c(this.f19726b) && AbstractC8611a0.m33060E(str3, "/", false, 2, null)) {
            arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m24901i(p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p241q7.C6294i0.b
            if (r0 == 0) goto L14
            r0 = r9
            q7.i0$b r0 = (p241q7.C6294i0.b) r0
            int r1 = r0.f19747s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f19747s = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            q7.i0$b r0 = new q7.i0$b
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r7.f19745q
            java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
            int r1 = r7.f19747s
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            p172l8.AbstractC4713t.m18808b(r9)
            r1 = r8
            goto L4e
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r9)
            r9 = 0
            return r9
        L33:
            p172l8.AbstractC4713t.m18808b(r9)
            r9 = r2
            q7.w r2 = r8.f19725a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f19747s = r9
            r3 = 0
            r5 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            r1 = r8
            java.lang.Object r9 = r1.m24898f(r2, r3, r4, r5, r7)
            if (r9 != r0) goto L4e
            return r0
        L4e:
            q7.j0 r9 = r8.m24894b()
            q7.m0 r0 = r1.f19730f
            if (r0 == 0) goto L59
            r0.m24936h(r9)
        L59:
            q7.m0 r0 = r1.f19730f
            if (r0 == 0) goto L73
            java.util.List r2 = r1.f19727c
            java.util.Iterator r2 = r2.iterator()
        L63:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.next()
            a9.l r3 = (p010a9.InterfaceC0184l) r3
            r3.mo27m(r0)
            goto L63
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p241q7.C6294i0.m24901i(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public final void m24902j(AbstractC6301m.b bVar, ArrayList arrayList) {
        AbstractC6301m.b bVar2 = this.f19732h;
        if (bVar2 == null) {
            return;
        }
        if (bVar2.m24925i() < bVar.m24925i() || this.f19733i < arrayList.size()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC6296j0.b bVar3 = (AbstractC6296j0.b) it.next();
                    if (bVar3.m24906c() != -1.0d && bVar3.m24906c() != 1.0d) {
                        return;
                    }
                }
            }
            this.f19732h = bVar;
            this.f19733i = arrayList.size();
        }
    }
}
