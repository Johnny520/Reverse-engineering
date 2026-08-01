package p266s2;

import p010a9.InterfaceC0188p;
import p049d9.AbstractC1927c;
import p080f9.AbstractC2368o;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p376zd.C10028y0;

/* JADX INFO: renamed from: s2.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7177g {

    /* JADX INFO: renamed from: a */
    public final int f23762a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p f23763b;

    /* JADX INFO: renamed from: c */
    public float f23764c;

    /* JADX INFO: renamed from: s2.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f23765q;

        /* JADX INFO: renamed from: s */
        public int f23767s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f23765q = obj;
            this.f23767s |= Integer.MIN_VALUE;
            return C7177g.this.m28354e(0.0f, this);
        }
    }

    public C7177g(int i10, InterfaceC0188p interfaceC0188p) {
        this.f23762a = i10;
        this.f23763b = interfaceC0188p;
    }

    /* JADX INFO: renamed from: b */
    public final float m28351b() {
        return this.f23764c;
    }

    /* JADX INFO: renamed from: c */
    public final int m28352c(int i10) {
        return AbstractC2368o.m8586m(i10 - AbstractC1927c.m6980d(this.f23764c), 0, this.f23762a);
    }

    /* JADX INFO: renamed from: d */
    public final void m28353d() {
        this.f23764c = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28354e(float r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p266s2.C7177g.a
            if (r0 == 0) goto L13
            r0 = r6
            s2.g$a r0 = (p266s2.C7177g.a) r0
            int r1 = r0.f23767s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23767s = r1
            goto L18
        L13:
            s2.g$a r0 = new s2.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23765q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f23767s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r6)
            goto L42
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L30:
            p172l8.AbstractC4713t.m18808b(r6)
            a9.p r6 = r4.f23763b
            java.lang.Float r5 = p257r8.AbstractC6533b.m25847c(r5)
            r0.f23767s = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f23764c
            float r6 = r6 + r5
            r4.f23764c = r6
            l8.i0 r5 = p172l8.C4700i0.f13910a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p266s2.C7177g.m28354e(float, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public final Object m28355f(int i10, int i11, InterfaceC5976f interfaceC5976f) throws Throwable {
        if (i10 > i11) {
            C10028y0.m38849a("Expected min=", i10, " ≤ max=", i11);
            return null;
        }
        int i12 = i11 - i10;
        int i13 = this.f23762a;
        if (i12 > i13) {
            C10028y0.m38849a("Expected range (", i12, ") to be ≤ viewportSize=", this.f23762a);
            return null;
        }
        float f10 = i10;
        float f11 = this.f23764c;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return C4700i0.f13910a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objM28357h = m28357h(i10, interfaceC5976f);
        return objM28357h == AbstractC6325c.m24992g() ? objM28357h : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m28356g(int i10, int i11, InterfaceC5976f interfaceC5976f) throws Throwable {
        if (i10 > i11) {
            C10028y0.m38849a("Expected min=", i10, " ≤ max=", i11);
            return null;
        }
        int i12 = i11 - i10;
        int i13 = this.f23762a;
        if (i12 > i13) {
            C10028y0.m38849a("Expected range (", i12, ") to be ≤ viewportSize=", this.f23762a);
            return null;
        }
        float f10 = i10;
        float f11 = this.f23764c;
        if (f10 >= f11 && i11 <= f11 + i13) {
            return C4700i0.f13910a;
        }
        Object objM28357h = m28357h((i10 + (i12 / 2)) - (i13 / 2), interfaceC5976f);
        return objM28357h == AbstractC6325c.m24992g() ? objM28357h : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m28357h(float f10, InterfaceC5976f interfaceC5976f) throws Throwable {
        Object objM28354e = m28354e(f10 - this.f23764c, interfaceC5976f);
        return objM28354e == AbstractC6325c.m24992g() ? objM28354e : C4700i0.f13910a;
    }
}
