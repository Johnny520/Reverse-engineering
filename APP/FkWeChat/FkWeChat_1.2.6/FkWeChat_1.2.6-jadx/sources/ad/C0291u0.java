package ad;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4685b;
import p172l8.AbstractC4687c;
import p172l8.AbstractC4713t;
import p172l8.C4683a;
import p172l8.C4700i0;
import p215oc.C5706c;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6542k;
import p257r8.AbstractC6543l;
import p375zc.AbstractC9956k0;
import p375zc.AbstractC9957l;
import p375zc.C9936a0;
import p375zc.C9941d;
import p375zc.C9944e0;
import p375zc.C9950h0;
import p375zc.C9951i;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ad.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0291u0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0239a f700a;

    /* JADX INFO: renamed from: b */
    public final boolean f701b;

    /* JADX INFO: renamed from: c */
    public final boolean f702c;

    /* JADX INFO: renamed from: d */
    public int f703d;

    /* JADX INFO: renamed from: ad.u0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6542k implements InterfaceC0189q {

        /* JADX INFO: renamed from: r */
        public int f704r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f705s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC4687c abstractC4687c = (AbstractC4687c) this.f705s;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f704r;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                byte bMo596H = C0291u0.this.f700a.mo596H();
                if (bMo596H == 1) {
                    return C0291u0.this.m857j(true);
                }
                if (bMo596H == 0) {
                    return C0291u0.this.m857j(false);
                }
                if (bMo596H != 6) {
                    C0291u0 c0291u0 = C0291u0.this;
                    if (bMo596H == 8) {
                        return c0291u0.m853f();
                    }
                    AbstractC0239a.m588z(c0291u0.f700a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    C5706c.m23089a();
                    return null;
                }
                C0291u0 c0291u02 = C0291u0.this;
                this.f705s = AbstractC6543l.m25863a(abstractC4687c);
                this.f704r = 1;
                obj = c0291u02.m855h(abstractC4687c, this);
                if (obj == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return (AbstractC9957l) obj;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(AbstractC4687c abstractC4687c, C4700i0 c4700i0, InterfaceC5976f interfaceC5976f) {
            a aVar = C0291u0.this.new a(interfaceC5976f);
            aVar.f705s = abstractC4687c;
            return aVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: ad.u0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f707q;

        /* JADX INFO: renamed from: r */
        public Object f708r;

        /* JADX INFO: renamed from: s */
        public Object f709s;

        /* JADX INFO: renamed from: t */
        public Object f710t;

        /* JADX INFO: renamed from: u */
        public int f711u;

        /* JADX INFO: renamed from: v */
        public int f712v;

        /* JADX INFO: renamed from: w */
        public byte f713w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f714x;

        /* JADX INFO: renamed from: z */
        public int f716z;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f714x = obj;
            this.f716z |= Integer.MIN_VALUE;
            return C0291u0.this.m855h(null, this);
        }
    }

    public C0291u0(C9951i c9951i, AbstractC0239a abstractC0239a) {
        c9951i.getClass();
        abstractC0239a.getClass();
        this.f700a = abstractC0239a;
        this.f701b = c9951i.m38564q();
        this.f702c = c9951i.m38551d();
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC9957l m852e() {
        byte bMo596H = this.f700a.mo596H();
        if (bMo596H == 1) {
            return m857j(true);
        }
        if (bMo596H == 0) {
            return m857j(false);
        }
        if (bMo596H == 6) {
            int i10 = this.f703d + 1;
            this.f703d = i10;
            this.f703d--;
            return i10 == 200 ? m854g() : m856i();
        }
        if (bMo596H == 8) {
            return m853f();
        }
        AbstractC0239a.m588z(this.f700a, "Cannot read Json element because of unexpected " + AbstractC0242b.m653c(bMo596H), 0, null, 6, null);
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC9957l m853f() {
        byte bMo616k = this.f700a.mo616k();
        if (this.f700a.mo596H() == 4) {
            AbstractC0239a.m588z(this.f700a, "Unexpected leading comma", 0, null, 6, null);
            C5706c.m23089a();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (this.f700a.mo611f()) {
            arrayList.add(m852e());
            bMo616k = this.f700a.mo616k();
            if (bMo616k != 4) {
                AbstractC0239a abstractC0239a = this.f700a;
                boolean z10 = bMo616k == 9;
                int i10 = abstractC0239a.f592a;
                if (!z10) {
                    AbstractC0239a.m588z(abstractC0239a, "Expected end of the array or comma", i10, null, 4, null);
                    C5706c.m23089a();
                    return null;
                }
            }
        }
        if (bMo616k == 8) {
            this.f700a.m617l((byte) 9);
        } else if (bMo616k == 4) {
            boolean z11 = this.f702c;
            AbstractC0239a abstractC0239a2 = this.f700a;
            if (!z11) {
                AbstractC0246c0.m701g(abstractC0239a2, "array");
                C5706c.m23089a();
                return null;
            }
            abstractC0239a2.m617l((byte) 9);
        }
        return new C9941d(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC9957l m854g() {
        return (AbstractC9957l) AbstractC4685b.m18709b(new C4683a(new a(null)), C4700i0.f13910a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a2 -> B:27:0x00a9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m855h(p172l8.AbstractC4687c r22, p228p8.InterfaceC5976f r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.C0291u0.m855h(l8.c, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC9957l m856i() {
        byte bM617l = this.f700a.m617l((byte) 6);
        if (this.f700a.mo596H() == 4) {
            AbstractC0239a.m588z(this.f700a, "Unexpected leading comma", 0, null, 6, null);
            C5706c.m23089a();
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f700a.mo611f()) {
                break;
            }
            boolean z10 = this.f701b;
            AbstractC0239a abstractC0239a = this.f700a;
            String strM623s = z10 ? abstractC0239a.m623s() : abstractC0239a.m621q();
            this.f700a.m617l((byte) 5);
            linkedHashMap.put(strM623s, m852e());
            bM617l = this.f700a.mo616k();
            if (bM617l != 4) {
                if (bM617l != 7) {
                    AbstractC0239a.m588z(this.f700a, "Expected end of the object or comma", 0, null, 6, null);
                    C5706c.m23089a();
                    return null;
                }
            }
        }
        if (bM617l == 6) {
            this.f700a.m617l((byte) 7);
        } else if (bM617l == 4) {
            boolean z11 = this.f702c;
            AbstractC0239a abstractC0239a2 = this.f700a;
            if (!z11) {
                AbstractC0246c0.m702h(abstractC0239a2, null, 1, null);
                C5706c.m23089a();
                return null;
            }
            abstractC0239a2.m617l((byte) 7);
        }
        return new C9950h0(linkedHashMap);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC9956k0 m857j(boolean z10) {
        String strM623s = (this.f701b || !z10) ? this.f700a.m623s() : this.f700a.m621q();
        return (z10 || !AbstractC1061t.m3842c(strM623s, "null")) ? new C9936a0(strM623s, z10, null, 4, null) : C9944e0.INSTANCE;
    }
}
