package p023b8;

import java.util.List;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: b8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1008a extends AbstractC1012e {

    /* JADX INFO: renamed from: r */
    public final List f3141r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC5980j f3142s;

    /* JADX INFO: renamed from: t */
    public Object f3143t;

    /* JADX INFO: renamed from: u */
    public int f3144u;

    /* JADX INFO: renamed from: b8.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f3145q;

        /* JADX INFO: renamed from: s */
        public int f3147s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f3145q = obj;
            this.f3147s |= Integer.MIN_VALUE;
            return C1008a.this.m3712l(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1008a(Object obj, List list, Object obj2, InterfaceC5980j interfaceC5980j) {
        super(obj);
        obj.getClass();
        list.getClass();
        obj2.getClass();
        interfaceC5980j.getClass();
        this.f3141r = list;
        this.f3142s = interfaceC5980j;
        this.f3143t = obj2;
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: a */
    public Object mo3706a(Object obj, InterfaceC5976f interfaceC5976f) {
        this.f3144u = 0;
        mo3711i(obj);
        return mo3709g(interfaceC5976f);
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: b */
    public void mo3707b() {
        this.f3144u = -1;
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: f */
    public Object mo3708f() {
        return this.f3143t;
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: g */
    public Object mo3709g(InterfaceC5976f interfaceC5976f) {
        int i10 = this.f3144u;
        if (i10 < 0) {
            return mo3708f();
        }
        if (i10 < this.f3141r.size()) {
            return m3712l(interfaceC5976f);
        }
        mo3707b();
        return mo3708f();
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f3142s;
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: h */
    public Object mo3710h(Object obj, InterfaceC5976f interfaceC5976f) {
        mo3711i(obj);
        return mo3709g(interfaceC5976f);
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: i */
    public void mo3711i(Object obj) {
        obj.getClass();
        this.f3143t = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3712l(p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p023b8.C1008a.a
            if (r0 == 0) goto L13
            r0 = r6
            b8.a$a r0 = (p023b8.C1008a.a) r0
            int r1 = r0.f3147s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3147s = r1
            goto L18
        L13:
            b8.a$a r0 = new b8.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3145q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f3147s
            r3 = 1
            if (r2 == 0) goto L2d
            if (r2 != r3) goto L26
            goto L2d
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L2d:
            p172l8.AbstractC4713t.m18808b(r6)
        L30:
            int r6 = r5.f3144u
            r2 = -1
            if (r6 != r2) goto L36
            goto L41
        L36:
            java.util.List r2 = r5.f3141r
            int r4 = r2.size()
            if (r6 < r4) goto L46
            r5.mo3707b()
        L41:
            java.lang.Object r6 = r5.mo3708f()
            return r6
        L46:
            java.lang.Object r2 = r2.get(r6)
            a9.q r2 = (p010a9.InterfaceC0189q) r2
            int r6 = r6 + 1
            r5.f3144u = r6
            java.lang.Object r6 = r5.mo3708f()
            r0.f3147s = r3
            java.lang.Object r6 = r2.mo236e(r5, r6, r0)
            if (r6 != r1) goto L30
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p023b8.C1008a.m3712l(p8.f):java.lang.Object");
    }
}
