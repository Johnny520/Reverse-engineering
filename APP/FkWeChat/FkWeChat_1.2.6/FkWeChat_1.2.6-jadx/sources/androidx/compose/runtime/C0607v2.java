package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC0625y1;
import p010a9.InterfaceC0188p;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: androidx.compose.runtime.v2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607v2 implements InterfaceC0625y1 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0625y1 f1623q;

    /* JADX INFO: renamed from: r */
    public final C0592t1 f1624r = new C0592t1();

    /* JADX INFO: renamed from: androidx.compose.runtime.v2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f1625q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f1626r;

        /* JADX INFO: renamed from: t */
        public int f1628t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f1626r = obj;
            this.f1628t |= Integer.MIN_VALUE;
            return C0607v2.this.mo1650W(null, this);
        }
    }

    public C0607v2(InterfaceC0625y1 interfaceC0625y1) {
        this.f1623q = interfaceC0625y1;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public /* bridge */ InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC0625y1.a.m2456c(this, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.InterfaceC0625y1
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1650W(p010a9.InterfaceC0184l r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.C0607v2.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.v2$a r0 = (androidx.compose.runtime.C0607v2.a) r0
            int r1 = r0.f1628t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1628t = r1
            goto L18
        L13:
            androidx.compose.runtime.v2$a r0 = new androidx.compose.runtime.v2$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1626r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f1628t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            p172l8.AbstractC4713t.m18808b(r7)
            return r7
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L33:
            java.lang.Object r6 = r0.f1625q
            a9.l r6 = (p010a9.InterfaceC0184l) r6
            p172l8.AbstractC4713t.m18808b(r7)
            goto L4b
        L3b:
            p172l8.AbstractC4713t.m18808b(r7)
            androidx.compose.runtime.t1 r7 = r5.f1624r
            r0.f1625q = r6
            r0.f1628t = r4
            java.lang.Object r7 = r7.m2220c(r0)
            if (r7 != r1) goto L4b
            goto L58
        L4b:
            androidx.compose.runtime.y1 r7 = r5.f1623q
            r2 = 0
            r0.f1625q = r2
            r0.f1628t = r3
            java.lang.Object r6 = r7.mo1650W(r6, r0)
            if (r6 != r1) goto L59
        L58:
            return r1
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0607v2.mo1650W(a9.l, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final void m2237a() {
        this.f1624r.m2221d();
    }

    /* JADX INFO: renamed from: b */
    public final void m2238b() {
        this.f1624r.m2223f();
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC0625y1.a.m2457d(this, interfaceC5980j);
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public /* bridge */ InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC0625y1.a.m2455b(this, cVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public /* bridge */ Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC0625y1.a.m2454a(this, obj, interfaceC0188p);
    }
}
