package p178i3;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p160f3.C2135g;
import p172h3.EnumC2241a;
import p184j3.AbstractC2383b;
import p184j3.AbstractC2384c;
import p184j3.AbstractC2385d;
import p184j3.C2388g;
import p184j3.InterfaceC2394m;

/* JADX INFO: renamed from: i3.C */
/* JADX INFO: loaded from: classes.dex */
public final class C2318C extends AbstractC2383b implements InterfaceC2334o, InterfaceC2323d, InterfaceC2394m {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7563i = AtomicReferenceFieldUpdater.newUpdater(C2318C.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: h */
    public int f7564h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2318C(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p184j3.AbstractC2383b
    /* JADX INFO: renamed from: b */
    public final AbstractC2385d mo4145b() {
        return new C2319D();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        if (obj == null) {
            obj = AbstractC2384c.f7730b;
        }
        m4147g(null, obj);
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p184j3.AbstractC2383b
    /* JADX INFO: renamed from: d */
    public final AbstractC2385d[] mo4146d() {
        return new C2319D[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4147g(Object obj, Object obj2) {
        int i5;
        AbstractC2385d[] abstractC2385dArr;
        C1753n c1753n;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7563i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC1665j.m2981a(obj3, obj)) {
                return false;
            }
            if (AbstractC1665j.m2981a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i6 = this.f7564h;
            if ((i6 & 1) != 0) {
                this.f7564h = i6 + 2;
                return true;
            }
            int i7 = i6 + 1;
            this.f7564h = i7;
            AbstractC2385d[] abstractC2385dArr2 = this.f7725d;
            while (true) {
                C2319D[] c2319dArr = (C2319D[]) abstractC2385dArr2;
                if (c2319dArr != null) {
                    for (C2319D c2319d : c2319dArr) {
                        if (c2319d != null) {
                            AtomicReference atomicReference = c2319d.f7565a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c1753n = AbstractC2339t.f7627c)) {
                                    C1753n c1753n2 = AbstractC2339t.f7626b;
                                    if (obj4 != c1753n2) {
                                        while (!atomicReference.compareAndSet(obj4, c1753n2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C2135g) obj4).mo278i(C0891q.f2780a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c1753n)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i5 = this.f7564h;
                    if (i5 == i7) {
                        this.f7564h = i7 + 1;
                        return true;
                    }
                    abstractC2385dArr = this.f7725d;
                }
                abstractC2385dArr2 = abstractC2385dArr;
                i7 = i5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2316A
    public final Object getValue() {
        C1753n c1753n = AbstractC2384c.f7730b;
        Object obj = f7563i.get(this);
        if (obj == c1753n) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:59:0x00f8) to fix multi-entry loop: BACK_EDGE: B:59:0x00f8 -> B:28:0x007e */
    /* JADX WARN: Path cross not found for [B:58:0x00f7, B:59:0x00f8], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0091, B:36:0x0094, B:46:0x00b5, B:49:0x00c5, B:50:0x00e1, B:56:0x00f1, B:53:0x00e8, B:55:0x00ee, B:38:0x009a, B:42:0x00a1, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0091, B:36:0x0094, B:46:0x00b5, B:49:0x00c5, B:50:0x00e1, B:56:0x00f1, B:53:0x00e8, B:55:0x00ee, B:38:0x009a, B:42:0x00a1, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0091, B:36:0x0094, B:46:0x00b5, B:49:0x00c5, B:50:0x00e1, B:56:0x00f1, B:53:0x00e8, B:55:0x00ee, B:38:0x009a, B:42:0x00a1, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c4 -> B:28:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p178i3.InterfaceC2323d
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo3119i(p178i3.InterfaceC2324e r18, p074O2.InterfaceC1046d r19) {
        /*
            r17 = this;
            r0 = r19
            boolean r1 = r0 instanceof p178i3.C2317B
            if (r1 == 0) goto L17
            r1 = r0
            i3.B r1 = (p178i3.C2317B) r1
            int r2 = r1.f7562n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f7562n = r2
            r2 = r17
            goto L1e
        L17:
            i3.B r1 = new i3.B
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f7560l
            int r3 = r1.f7562n
            P2.a r4 = p079P2.EnumC1152a.f3788d
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L61
            if (r3 == r8) goto L57
            if (r3 == r7) goto L49
            if (r3 != r6) goto L41
            java.lang.Object r3 = r1.f7559k
            f3.S r9 = r1.f7558j
            i3.D r10 = r1.f7557i
            i3.e r11 = r1.f7556h
            i3.C r12 = r1.f7555g
            p127Z2.AbstractC1784a.m3205S(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            goto L7e
        L3e:
            r0 = move-exception
            goto Lfb
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L49:
            java.lang.Object r3 = r1.f7559k
            f3.S r9 = r1.f7558j
            i3.D r10 = r1.f7557i
            i3.e r11 = r1.f7556h
            i3.C r12 = r1.f7555g
            p127Z2.AbstractC1784a.m3205S(r0)     // Catch: java.lang.Throwable -> L3e
            goto Lb4
        L57:
            i3.D r10 = r1.f7557i
            i3.e r3 = r1.f7556h
            i3.C r12 = r1.f7555g
            p127Z2.AbstractC1784a.m3205S(r0)     // Catch: java.lang.Throwable -> L3e
            goto L6e
        L61:
            p127Z2.AbstractC1784a.m3205S(r0)
            j3.d r0 = r2.m4233a()
            i3.D r0 = (p178i3.C2319D) r0
            r3 = r18
            r10 = r0
            r12 = r2
        L6e:
            O2.i r0 = r1.f3866e     // Catch: java.lang.Throwable -> L3e
            p117X2.AbstractC1665j.m2982b(r0)     // Catch: java.lang.Throwable -> L3e
            f3.q r9 = p160f3.C2155q.f7102e     // Catch: java.lang.Throwable -> L3e
            O2.g r0 = r0.mo1166C(r9)     // Catch: java.lang.Throwable -> L3e
            f3.S r0 = (p160f3.InterfaceC2115S) r0     // Catch: java.lang.Throwable -> L3e
            r9 = r0
            r11 = r3
            r0 = 0
        L7e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p178i3.C2318C.f7563i     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L92
            boolean r13 = r9.mo3904b()     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L8d
            goto L92
        L8d:
            java.util.concurrent.CancellationException r0 = r9.mo3907n()     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L92:
            if (r0 == 0) goto L9a
            boolean r13 = r0.equals(r3)     // Catch: java.lang.Throwable -> L3e
            if (r13 != 0) goto Lb5
        L9a:
            Y1.n r0 = p184j3.AbstractC2384c.f7730b     // Catch: java.lang.Throwable -> L3e
            if (r3 != r0) goto La0
            r0 = 0
            goto La1
        La0:
            r0 = r3
        La1:
            r1.f7555g = r12     // Catch: java.lang.Throwable -> L3e
            r1.f7556h = r11     // Catch: java.lang.Throwable -> L3e
            r1.f7557i = r10     // Catch: java.lang.Throwable -> L3e
            r1.f7558j = r9     // Catch: java.lang.Throwable -> L3e
            r1.f7559k = r3     // Catch: java.lang.Throwable -> L3e
            r1.f7562n = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r11.mo9c(r0, r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 != r4) goto Lb4
            goto Lfa
        Lb4:
            r0 = r3
        Lb5:
            java.util.concurrent.atomic.AtomicReference r3 = r10.f7565a     // Catch: java.lang.Throwable -> L3e
            Y1.n r13 = p178i3.AbstractC2339t.f7626b     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.getAndSet(r13)     // Catch: java.lang.Throwable -> L3e
            p117X2.AbstractC1665j.m2982b(r3)     // Catch: java.lang.Throwable -> L3e
            Y1.n r14 = p178i3.AbstractC2339t.f7627c     // Catch: java.lang.Throwable -> L3e
            if (r3 != r14) goto Lc5
            goto L7e
        Lc5:
            r1.f7555g = r12     // Catch: java.lang.Throwable -> L3e
            r1.f7556h = r11     // Catch: java.lang.Throwable -> L3e
            r1.f7557i = r10     // Catch: java.lang.Throwable -> L3e
            r1.f7558j = r9     // Catch: java.lang.Throwable -> L3e
            r1.f7559k = r0     // Catch: java.lang.Throwable -> L3e
            r1.f7562n = r6     // Catch: java.lang.Throwable -> L3e
            K2.q r3 = p056K2.C0891q.f2780a     // Catch: java.lang.Throwable -> L3e
            f3.g r14 = new f3.g     // Catch: java.lang.Throwable -> L3e
            O2.d r15 = com.bumptech.glide.AbstractC1923e.m3448G(r1)     // Catch: java.lang.Throwable -> L3e
            r14.<init>(r8, r15)     // Catch: java.lang.Throwable -> L3e
            r14.m3968t()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicReference r15 = r10.f7565a     // Catch: java.lang.Throwable -> L3e
        Le1:
            boolean r16 = r15.compareAndSet(r13, r14)     // Catch: java.lang.Throwable -> L3e
            if (r16 == 0) goto Le8
            goto Lf1
        Le8:
            java.lang.Object r5 = r15.get()     // Catch: java.lang.Throwable -> L3e
            if (r5 == r13) goto Le1
            r14.mo278i(r3)     // Catch: java.lang.Throwable -> L3e
        Lf1:
            java.lang.Object r5 = r14.m3967r()     // Catch: java.lang.Throwable -> L3e
            if (r5 != r4) goto Lf8
            r3 = r5
        Lf8:
            if (r3 != r4) goto L7e
        Lfa:
            return r4
        Lfb:
            r12.m4234e(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.C2318C.mo3119i(i3.e, O2.d):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p184j3.InterfaceC2394m
    /* JADX INFO: renamed from: n */
    public final InterfaceC2323d mo4148n(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        return ((((i5 < 0 || i5 >= 2) && i5 != -2) || enumC2241a != EnumC2241a.f7352e) && !((i5 == 0 || i5 == -3) && enumC2241a == EnumC2241a.f7351d)) ? new C2388g(this, interfaceC1051i, i5, enumC2241a) : this;
    }
}
