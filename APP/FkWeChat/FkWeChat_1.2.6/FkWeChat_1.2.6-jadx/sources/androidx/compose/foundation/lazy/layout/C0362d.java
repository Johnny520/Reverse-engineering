package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import p135j2.InterfaceC3578w;
import p135j2.InterfaceC3585y0;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0362d implements InterfaceC3585y0 {

    /* JADX INFO: renamed from: b */
    public boolean f1042b;

    /* JADX INFO: renamed from: c */
    public final List f1043c = new ArrayList();

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f1044q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f1045r;

        /* JADX INFO: renamed from: t */
        public int f1047t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f1045r = obj;
            this.f1047t |= Integer.MIN_VALUE;
            return C0362d.this.m1154k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1154k(p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.lazy.layout.C0362d.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.lazy.layout.d$a r0 = (androidx.compose.foundation.lazy.layout.C0362d.a) r0
            int r1 = r0.f1047t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1047t = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.layout.d$a r0 = new androidx.compose.foundation.lazy.layout.d$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1045r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f1047t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f1044q
            b9.n0 r0 = (p024b9.C1050n0) r0
            p172l8.AbstractC4713t.m18808b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L72
        L2d:
            r7 = move-exception
            goto L7e
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L36:
            p172l8.AbstractC4713t.m18808b(r7)
            boolean r7 = r6.f1042b
            if (r7 != 0) goto L8a
            b9.n0 r7 = new b9.n0
            r7.<init>()
            r0.f1044q = r7     // Catch: java.lang.Throwable -> L69
            r0.f1047t = r3     // Catch: java.lang.Throwable -> L69
            ec.o r2 = new ec.o     // Catch: java.lang.Throwable -> L69
            p8.f r4 = p242q8.AbstractC6324b.m24989d(r0)     // Catch: java.lang.Throwable -> L69
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L69
            r2.m7851E()     // Catch: java.lang.Throwable -> L69
            r7.f3208q = r2     // Catch: java.lang.Throwable -> L69
            java.util.List r3 = m1153j(r6)     // Catch: java.lang.Throwable -> L69
            r3.add(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r2.m7875w()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = p242q8.AbstractC6325c.m24992g()     // Catch: java.lang.Throwable -> L69
            if (r2 != r3) goto L6e
            p257r8.AbstractC6539h.m25860c(r0)     // Catch: java.lang.Throwable -> L69
            goto L6e
        L69:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L7e
        L6e:
            if (r2 != r1) goto L71
            return r1
        L71:
            r0 = r7
        L72:
            java.util.List r7 = r6.f1043c
            java.lang.Object r0 = r0.f3208q
            java.util.Collection r7 = p024b9.AbstractC1064u0.m3853a(r7)
            r7.remove(r0)
            goto L8a
        L7e:
            java.util.List r1 = r6.f1043c
            java.lang.Object r0 = r0.f3208q
            java.util.Collection r1 = p024b9.AbstractC1064u0.m3853a(r1)
            r1.remove(r0)
            throw r7
        L8a:
            l8.i0 r7 = p172l8.C4700i0.f13910a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0362d.m1154k(p8.f):java.lang.Object");
    }

    @Override // p135j2.InterfaceC3585y0
    /* JADX INFO: renamed from: x */
    public void mo1155x(InterfaceC3578w interfaceC3578w) {
        if (this.f1042b) {
            return;
        }
        this.f1042b = true;
        List list = this.f1043c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5976f interfaceC5976f = (InterfaceC5976f) list.get(i10);
            C4712s.a aVar = C4712s.f13928r;
            interfaceC5976f.resumeWith(C4712s.m18798b(C4700i0.f13910a));
        }
        this.f1043c.clear();
    }
}
