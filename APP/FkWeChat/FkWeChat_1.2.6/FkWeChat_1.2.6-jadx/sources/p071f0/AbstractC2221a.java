package p071f0;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p073f2.InterfaceC2230b;
import p073f2.InterfaceC2254m0;
import p172l8.C4700i0;
import p219p.AbstractC5865l0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6542k;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2221a {

    /* JADX INFO: renamed from: f0.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f6060q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f6061r;

        /* JADX INFO: renamed from: s */
        public int f6062s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f6061r = obj;
            this.f6062s |= Integer.MIN_VALUE;
            return AbstractC2221a.m8014b(null, this);
        }
    }

    /* JADX INFO: renamed from: f0.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public int f6063r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f6064s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0184l f6065t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f6065t = interfaceC0184l;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f6065t, interfaceC5976f);
            bVar.f6064s = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r7.f6063r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                p172l8.AbstractC4713t.m18808b(r8)
                goto L52
            L12:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r8)
                r8 = 0
                return r8
            L19:
                java.lang.Object r1 = r7.f6064s
                f2.b r1 = (p073f2.InterfaceC2230b) r1
                p172l8.AbstractC4713t.m18808b(r8)
                goto L34
            L21:
                p172l8.AbstractC4713t.m18808b(r8)
                java.lang.Object r8 = r7.f6064s
                r1 = r8
                f2.b r1 = (p073f2.InterfaceC2230b) r1
                r7.f6064s = r1
                r7.f6063r = r3
                java.lang.Object r8 = p071f0.AbstractC2221a.m8013a(r1, r7)
                if (r8 != r0) goto L34
                goto L51
            L34:
                f2.d0 r8 = (p073f2.C2236d0) r8
                r8.m8071a()
                a9.l r4 = r7.f6065t
                long r5 = r8.m8077h()
                r1.e r8 = p250r1.C6455e.m25550d(r5)
                r4.mo27m(r8)
                r8 = 0
                r7.f6064s = r8
                r7.f6063r = r2
                java.lang.Object r8 = p219p.AbstractC5896v1.m23791v(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L52
            L51:
                return r0
            L52:
                f2.d0 r8 = (p073f2.C2236d0) r8
                if (r8 == 0) goto L59
                r8.m8071a()
            L59:
                l8.i0 r8 = p172l8.C4700i0.f13910a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f0.AbstractC2221a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2230b interfaceC2230b, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2230b, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8014b(p073f2.InterfaceC2230b r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof p071f0.AbstractC2221a.a
            if (r0 == 0) goto L13
            r0 = r9
            f0.a$a r0 = (p071f0.AbstractC2221a.a) r0
            int r1 = r0.f6062s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6062s = r1
            goto L18
        L13:
            f0.a$a r0 = new f0.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6061r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f6062s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f6060q
            f2.b r8 = (p073f2.InterfaceC2230b) r8
            p172l8.AbstractC4713t.m18808b(r9)
            goto L43
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r8)
            r8 = 0
            return r8
        L34:
            p172l8.AbstractC4713t.m18808b(r9)
        L37:
            r0.f6060q = r8
            r0.f6062s = r3
            r9 = 0
            java.lang.Object r9 = p073f2.InterfaceC2230b.m8030W0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L43
            return r1
        L43:
            f2.q r9 = (p073f2.C2261q) r9
            int r2 = r9.m8215b()
            boolean r2 = p073f2.AbstractC2271v.m8276c(r2)
            if (r2 == 0) goto L37
            java.util.List r2 = r9.m8216c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L59:
            if (r6 >= r4) goto L6b
            java.lang.Object r7 = r2.get(r6)
            f2.d0 r7 = (p073f2.C2236d0) r7
            boolean r7 = p073f2.AbstractC2263r.m8228a(r7)
            if (r7 != 0) goto L68
            goto L37
        L68:
            int r6 = r6 + 1
            goto L59
        L6b:
            java.util.List r8 = r9.m8216c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f0.AbstractC2221a.m8014b(f2.b, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static final Object m8015c(InterfaceC2254m0 interfaceC2254m0, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        Object objM23631d = AbstractC5865l0.m23631d(interfaceC2254m0, new b(interfaceC0184l, null), interfaceC5976f);
        return objM23631d == AbstractC6325c.m24992g() ? objM23631d : C4700i0.f13910a;
    }
}
