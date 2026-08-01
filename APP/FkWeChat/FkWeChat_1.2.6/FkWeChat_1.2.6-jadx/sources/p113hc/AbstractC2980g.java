package p113hc;

import p099gc.InterfaceC2753v;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: hc.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2980g {

    /* JADX INFO: renamed from: hc.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7858q;

        /* JADX INFO: renamed from: r */
        public Object f7859r;

        /* JADX INFO: renamed from: s */
        public Object f7860s;

        /* JADX INFO: renamed from: t */
        public boolean f7861t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f7862u;

        /* JADX INFO: renamed from: v */
        public int f7863v;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f7862u = obj;
            this.f7863v |= Integer.MIN_VALUE;
            return AbstractC2980g.m11001c(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m11000b(InterfaceC2974d interfaceC2974d, InterfaceC2753v interfaceC2753v, InterfaceC5976f interfaceC5976f) throws Throwable {
        Object objM11001c = m11001c(interfaceC2974d, interfaceC2753v, true, interfaceC5976f);
        return objM11001c == AbstractC6325c.m24992g() ? objM11001c : C4700i0.f13910a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r2.mo400a(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0061, B:28:0x0076, B:30:0x007e, B:20:0x0053, B:23:0x005d), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11001c(p113hc.InterfaceC2974d r6, p099gc.InterfaceC2753v r7, boolean r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof p113hc.AbstractC2980g.a
            if (r0 == 0) goto L13
            r0 = r9
            hc.g$a r0 = (p113hc.AbstractC2980g.a) r0
            int r1 = r0.f7863v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7863v = r1
            goto L18
        L13:
            hc.g$a r0 = new hc.g$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f7862u
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f7863v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3e
            boolean r8 = r0.f7861t
            java.lang.Object r6 = r0.f7860s
            gc.i r6 = (p099gc.InterfaceC2740i) r6
            java.lang.Object r7 = r0.f7859r
            gc.v r7 = (p099gc.InterfaceC2753v) r7
            java.lang.Object r2 = r0.f7858q
            hc.d r2 = (p113hc.InterfaceC2974d) r2
            p172l8.AbstractC4713t.m18808b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L61
        L3c:
            r6 = move-exception
            goto L9c
        L3e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L45:
            boolean r8 = r0.f7861t
            java.lang.Object r6 = r0.f7860s
            gc.i r6 = (p099gc.InterfaceC2740i) r6
            java.lang.Object r7 = r0.f7859r
            gc.v r7 = (p099gc.InterfaceC2753v) r7
            java.lang.Object r2 = r0.f7858q
            hc.d r2 = (p113hc.InterfaceC2974d) r2
            p172l8.AbstractC4713t.m18808b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L76
        L57:
            p172l8.AbstractC4713t.m18808b(r9)
            p113hc.AbstractC2976e.m10983k(r6)
            gc.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L61:
            r0.f7858q = r6     // Catch: java.lang.Throwable -> L3c
            r0.f7859r = r7     // Catch: java.lang.Throwable -> L3c
            r0.f7860s = r9     // Catch: java.lang.Throwable -> L3c
            r0.f7861t = r8     // Catch: java.lang.Throwable -> L3c
            r0.f7863v = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.mo9793b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L72
            goto L92
        L72:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L76:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L93
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f7858q = r2     // Catch: java.lang.Throwable -> L3c
            r0.f7859r = r7     // Catch: java.lang.Throwable -> L3c
            r0.f7860s = r6     // Catch: java.lang.Throwable -> L3c
            r0.f7861t = r8     // Catch: java.lang.Throwable -> L3c
            r0.f7863v = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.mo400a(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L92:
            return r1
        L93:
            if (r8 == 0) goto L99
            r6 = 0
            p099gc.AbstractC2744m.m9863a(r7, r6)
        L99:
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        L9c:
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r8 == 0) goto La3
            p099gc.AbstractC2744m.m9863a(r7, r6)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2980g.m11001c(hc.d, gc.v, boolean, p8.f):java.lang.Object");
    }
}
