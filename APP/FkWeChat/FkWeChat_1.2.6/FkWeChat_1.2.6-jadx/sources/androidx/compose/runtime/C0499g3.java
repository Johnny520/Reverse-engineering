package androidx.compose.runtime;

import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: androidx.compose.runtime.g3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0499g3 implements InterfaceC0492f3, InterfaceC0512i2 {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0512i2 f1377q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j f1378r;

    /* JADX INFO: renamed from: androidx.compose.runtime.g3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f1379q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f1380r;

        /* JADX INFO: renamed from: t */
        public int f1382t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f1380r = obj;
            this.f1382t |= Integer.MIN_VALUE;
            return C0499g3.this.mo1666q0(null, this);
        }
    }

    public C0499g3(InterfaceC0512i2 interfaceC0512i2, InterfaceC5980j interfaceC5980j) {
        this.f1377q = interfaceC0512i2;
        this.f1378r = interfaceC5980j;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f1378r;
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2, androidx.compose.runtime.InterfaceC0564p5
    public Object getValue() {
        return this.f1377q.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.InterfaceC0492f3
    /* JADX INFO: renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1666q0(p010a9.InterfaceC0173a r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.C0499g3.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.g3$a r0 = (androidx.compose.runtime.C0499g3.a) r0
            int r1 = r0.f1382t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1382t = r1
            goto L18
        L13:
            androidx.compose.runtime.g3$a r0 = new androidx.compose.runtime.g3$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1380r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f1382t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 == r3) goto L2c
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L2c:
            java.lang.Object r5 = r0.f1379q
            a9.a r5 = (p010a9.InterfaceC0173a) r5
            p172l8.AbstractC4713t.m18808b(r6)     // Catch: java.lang.Throwable -> L34
            goto L59
        L34:
            r6 = move-exception
            goto L5f
        L36:
            p172l8.AbstractC4713t.m18808b(r6)
            r0.f1379q = r5     // Catch: java.lang.Throwable -> L34
            r0.f1382t = r3     // Catch: java.lang.Throwable -> L34
            ec.o r6 = new ec.o     // Catch: java.lang.Throwable -> L34
            p8.f r2 = p242q8.AbstractC6324b.m24989d(r0)     // Catch: java.lang.Throwable -> L34
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L34
            r6.m7851E()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r6 = r6.m7875w()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = p242q8.AbstractC6325c.m24992g()     // Catch: java.lang.Throwable -> L34
            if (r6 != r2) goto L56
            p257r8.AbstractC6539h.m25860c(r0)     // Catch: java.lang.Throwable -> L34
        L56:
            if (r6 != r1) goto L59
            return r1
        L59:
            l8.i r6 = new l8.i     // Catch: java.lang.Throwable -> L34
            r6.<init>()     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L5f:
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0499g3.mo1666q0(a9.a, p8.f):java.lang.Object");
    }

    @Override // androidx.compose.runtime.InterfaceC0512i2
    public void setValue(Object obj) {
        this.f1377q.setValue(obj);
    }
}
