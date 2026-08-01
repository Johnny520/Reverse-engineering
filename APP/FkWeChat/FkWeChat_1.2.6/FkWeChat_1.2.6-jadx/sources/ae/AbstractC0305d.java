package ae;

import java.io.FileNotFoundException;
import java.util.Iterator;
import okio.AbstractC5795a;
import okio.C5799e;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p185m8.C5096o;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6542k;
import p257r8.AbstractC6543l;
import p376zd.C10009p;
import p376zd.C10010p0;
import p376zd.C9982c0;
import p376zd.C9983c1;
import sb.AbstractC7284j;
import sb.AbstractC7285k;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ae.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0305d {

    /* JADX INFO: renamed from: ae.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: A */
        public int f740A;

        /* JADX INFO: renamed from: B */
        public /* synthetic */ Object f741B;

        /* JADX INFO: renamed from: C */
        public int f742C;

        /* JADX INFO: renamed from: q */
        public Object f743q;

        /* JADX INFO: renamed from: r */
        public Object f744r;

        /* JADX INFO: renamed from: s */
        public Object f745s;

        /* JADX INFO: renamed from: t */
        public Object f746t;

        /* JADX INFO: renamed from: u */
        public Object f747u;

        /* JADX INFO: renamed from: v */
        public Object f748v;

        /* JADX INFO: renamed from: w */
        public Object f749w;

        /* JADX INFO: renamed from: x */
        public Object f750x;

        /* JADX INFO: renamed from: y */
        public boolean f751y;

        /* JADX INFO: renamed from: z */
        public boolean f752z;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f741B = obj;
            this.f742C |= Integer.MIN_VALUE;
            return AbstractC0305d.m912a(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: ae.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public int f753r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f754s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ AbstractC5795a f755t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C5799e f756u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC5795a abstractC5795a, C5799e c5799e, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f755t = abstractC5795a;
            this.f756u = c5799e;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(this.f755t, this.f756u, interfaceC5976f);
            bVar.f754s = obj;
            return bVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC7284j abstractC7284j = (AbstractC7284j) this.f754s;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f753r;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                AbstractC5795a abstractC5795a = this.f755t;
                C5096o c5096o = new C5096o();
                C5799e c5799e = this.f756u;
                this.f754s = AbstractC6543l.m25863a(abstractC7284j);
                this.f753r = 1;
                if (AbstractC0305d.m912a(abstractC7284j, abstractC5795a, c5096o, c5799e, false, true, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((b) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: ae.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6542k implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public Object f757r;

        /* JADX INFO: renamed from: s */
        public Object f758s;

        /* JADX INFO: renamed from: t */
        public Object f759t;

        /* JADX INFO: renamed from: u */
        public int f760u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f761v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C5799e f762w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AbstractC5795a f763x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ boolean f764y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5799e c5799e, AbstractC5795a abstractC5795a, boolean z10, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f762w = c5799e;
            this.f763x = abstractC5795a;
            this.f764y = z10;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            c cVar = new c(this.f762w, this.f763x, this.f764y, interfaceC5976f);
            cVar.f761v = obj;
            return cVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            C5096o c5096o;
            AbstractC7284j abstractC7284j = (AbstractC7284j) this.f761v;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f760u;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C5096o c5096o2 = new C5096o();
                c5096o2.addLast(this.f762w);
                it = this.f763x.list(this.f762w).iterator();
                c5096o = c5096o2;
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.f758s;
                c5096o = (C5096o) this.f757r;
                AbstractC4713t.m18808b(obj);
            }
            Iterator it2 = it;
            while (it2.hasNext()) {
                C5799e c5799e = (C5799e) it2.next();
                AbstractC5795a abstractC5795a = this.f763x;
                boolean z10 = this.f764y;
                this.f761v = abstractC7284j;
                this.f757r = c5096o;
                this.f758s = it2;
                this.f759t = AbstractC6543l.m25863a(c5799e);
                this.f760u = 1;
                if (AbstractC0305d.m912a(abstractC7284j, abstractC5795a, c5096o, c5799e, z10, false, this) == objM24992g) {
                    return objM24992g;
                }
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC7284j abstractC7284j, InterfaceC5976f interfaceC5976f) {
            return ((c) create(abstractC7284j, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r17.mo28871x(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
    
        if (r11 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0107, code lost:
    
        r13 = r1;
        r1 = r6;
        r6 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017c, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b7, code lost:
    
        if (r10.mo28871x(r1, r4) == r5) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113 A[Catch: all -> 0x016a, TRY_LEAVE, TryCatch #2 {all -> 0x016a, blocks: (B:49:0x010d, B:51:0x0113), top: B:81:0x010d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x015f -> B:20:0x0085). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m912a(sb.AbstractC7284j r17, okio.AbstractC5795a r18, p185m8.C5096o r19, okio.C5799e r20, boolean r21, boolean r22, p228p8.InterfaceC5976f r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.AbstractC0305d.m912a(sb.j, okio.a, m8.o, okio.e, boolean, boolean, p8.f):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #3 {all -> 0x0036, blocks: (B:3:0x0010, B:21:0x003c, B:27:0x0047, B:16:0x0032, B:13:0x002d, B:4:0x0018), top: B:43:0x0010, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047 A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0036, blocks: (B:3:0x0010, B:21:0x003c, B:27:0x0047, B:16:0x0032, B:13:0x002d, B:4:0x0018), top: B:43:0x0010, inners: #0, #4 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m913b(okio.AbstractC5795a r3, okio.C5799e r4, okio.C5799e r5) {
        /*
            r3.getClass()
            r4.getClass()
            r5.getClass()
            zd.w0 r4 = r3.source(r4)
            r0 = 0
            r1 = 2
            r2 = 0
            zd.u0 r3 = okio.AbstractC5795a.sink$default(r3, r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L36
            zd.j r3 = p376zd.AbstractC9988e0.m38647b(r3)     // Catch: java.lang.Throwable -> L36
            long r0 = r3.mo38670A0(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L28
            r3.close()     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r3 = move-exception
            goto L3a
        L28:
            r3 = r2
            goto L3a
        L2a:
            r5 = move-exception
            if (r3 == 0) goto L38
            r3.close()     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r3 = move-exception
            p172l8.AbstractC4693f.m18753a(r5, r3)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r3 = move-exception
            goto L48
        L38:
            r3 = r5
            r5 = r2
        L3a:
            if (r3 != 0) goto L47
            r5.longValue()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L53
            r4.close()     // Catch: java.lang.Throwable -> L45
            goto L53
        L45:
            r2 = move-exception
            goto L53
        L47:
            throw r3     // Catch: java.lang.Throwable -> L36
        L48:
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r4 = move-exception
            p172l8.AbstractC4693f.m18753a(r3, r4)
        L52:
            r2 = r3
        L53:
            if (r2 != 0) goto L56
            return
        L56:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.AbstractC0305d.m913b(okio.a, okio.e, okio.e):void");
    }

    /* JADX INFO: renamed from: c */
    public static final void m914c(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10) {
        abstractC5795a.getClass();
        c5799e.getClass();
        C5096o c5096o = new C5096o();
        for (C5799e c5799eM23302k = c5799e; c5799eM23302k != null && !abstractC5795a.exists(c5799eM23302k); c5799eM23302k = c5799eM23302k.m23302k()) {
            c5096o.addFirst(c5799eM23302k);
        }
        if (z10 && c5096o.isEmpty()) {
            C9982c0.m38640a(c5799e, " already exists.");
            return;
        }
        Iterator<E> it = c5096o.iterator();
        while (it.hasNext()) {
            AbstractC5795a.createDirectory$default(abstractC5795a, (C5799e) it.next(), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m915d(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10) {
        abstractC5795a.getClass();
        c5799e.getClass();
        Iterator it = AbstractC7285k.m28874b(new b(abstractC5795a, c5799e, null)).iterator();
        while (it.hasNext()) {
            abstractC5795a.delete((C5799e) it.next(), z10 && !it.hasNext());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m916e(AbstractC5795a abstractC5795a, C5799e c5799e) {
        abstractC5795a.getClass();
        c5799e.getClass();
        return abstractC5795a.metadataOrNull(c5799e) != null;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC7282h m917f(AbstractC5795a abstractC5795a, C5799e c5799e, boolean z10) {
        abstractC5795a.getClass();
        c5799e.getClass();
        return AbstractC7285k.m28874b(new c(c5799e, abstractC5795a, z10, null));
    }

    /* JADX INFO: renamed from: g */
    public static final C10009p m918g(AbstractC5795a abstractC5795a, C5799e c5799e) throws FileNotFoundException {
        abstractC5795a.getClass();
        c5799e.getClass();
        C10009p c10009pMetadataOrNull = abstractC5795a.metadataOrNull(c5799e);
        if (c10009pMetadataOrNull != null) {
            return c10009pMetadataOrNull;
        }
        C9983c1.m38641a("no such file: ", c5799e);
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final C5799e m919h(AbstractC5795a abstractC5795a, C5799e c5799e) {
        abstractC5795a.getClass();
        c5799e.getClass();
        C5799e c5799eM38818d = abstractC5795a.metadata(c5799e).m38818d();
        if (c5799eM38818d == null) {
            return null;
        }
        C5799e c5799eM23302k = c5799e.m23302k();
        c5799eM23302k.getClass();
        return c5799eM23302k.m23305n(c5799eM38818d);
    }
}
