package tg;

import gg.AbstractC1416l;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p162l3.C2463q;
import p249qg.C3564g;
import p276sf.C3967n;
import ug.AbstractC4337b;
import ug.AbstractC4338c;
import ug.AbstractC4339d;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4183b0 extends AbstractC4337b implements InterfaceC4186d, InterfaceC4208z, InterfaceC4196n {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13733l = AtomicReferenceFieldUpdater.newUpdater(C4183b0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: k */
    public int f13734k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4183b0(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:59:0x00f6) to fix multi-entry loop: BACK_EDGE: B:59:0x00f6 -> B:28:0x007c */
    /* JADX WARN: Path cross not found for [B:58:0x00f5, B:59:0x00f6], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007c, B:30:0x0084, B:33:0x008b, B:34:0x008f, B:36:0x0092, B:46:0x00b3, B:49:0x00c3, B:50:0x00df, B:56:0x00ef, B:53:0x00e6, B:55:0x00ec, B:38:0x0098, B:42:0x009f, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007c, B:30:0x0084, B:33:0x008b, B:34:0x008f, B:36:0x0092, B:46:0x00b3, B:49:0x00c3, B:50:0x00df, B:56:0x00ef, B:53:0x00e6, B:55:0x00ec, B:38:0x0098, B:42:0x009f, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007c, B:30:0x0084, B:33:0x008b, B:34:0x008f, B:36:0x0092, B:46:0x00b3, B:49:0x00c3, B:50:0x00df, B:56:0x00ef, B:53:0x00e6, B:55:0x00ec, B:38:0x0098, B:42:0x009f, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c2 -> B:28:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // tg.InterfaceC4186d
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo6025b(tg.InterfaceC4187e r18, wf.InterfaceC5557c r19) {
        /*
            r17 = this;
            r0 = r19
            boolean r1 = r0 instanceof tg.C4181a0
            if (r1 == 0) goto L17
            r1 = r0
            tg.a0 r1 = (tg.C4181a0) r1
            int r2 = r1.f13729n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f13729n = r2
            r2 = r17
            goto L1e
        L17:
            tg.a0 r1 = new tg.a0
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.f13727l
            int r3 = r1.f13729n
            xf.a r4 = p352xf.EnumC5799a.f23547g
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L60
            if (r3 == r8) goto L56
            if (r3 == r7) goto L48
            if (r3 != r6) goto L41
            java.lang.Object r3 = r1.f13726k
            qg.r0 r9 = r1.f13725j
            tg.c0 r10 = r1.f13724i
            tg.e r11 = r1.f13723h
            tg.b0 r12 = r1.f13722g
            p077f8.AbstractC1089i.m2732I0(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            goto L7c
        L3e:
            r0 = move-exception
            goto Lf9
        L41:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r0 = 0
            return r0
        L48:
            java.lang.Object r3 = r1.f13726k
            qg.r0 r9 = r1.f13725j
            tg.c0 r10 = r1.f13724i
            tg.e r11 = r1.f13723h
            tg.b0 r12 = r1.f13722g
            p077f8.AbstractC1089i.m2732I0(r0)     // Catch: java.lang.Throwable -> L3e
            goto Lb2
        L56:
            tg.c0 r10 = r1.f13724i
            tg.e r3 = r1.f13723h
            tg.b0 r12 = r1.f13722g
            p077f8.AbstractC1089i.m2732I0(r0)     // Catch: java.lang.Throwable -> L3e
            goto L6d
        L60:
            p077f8.AbstractC1089i.m2732I0(r0)
            ug.d r0 = r2.m8790a()
            tg.c0 r0 = (tg.C4185c0) r0
            r3 = r18
            r10 = r0
            r12 = r2
        L6d:
            wf.g r0 = r1.getContext()     // Catch: java.lang.Throwable -> L3e
            qg.q r9 = p249qg.C3593q.f11607h     // Catch: java.lang.Throwable -> L3e
            wf.e r0 = r0.mo2062s(r9)     // Catch: java.lang.Throwable -> L3e
            qg.r0 r0 = (p249qg.InterfaceC3596r0) r0     // Catch: java.lang.Throwable -> L3e
            r9 = r0
            r11 = r3
            r0 = 0
        L7c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = tg.C4183b0.f13733l     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L90
            boolean r13 = r9.mo7486b()     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L8b
            goto L90
        L8b:
            java.util.concurrent.CancellationException r0 = r9.mo7489h()     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L90:
            if (r0 == 0) goto L98
            boolean r13 = r0.equals(r3)     // Catch: java.lang.Throwable -> L3e
            if (r13 != 0) goto Lb3
        L98:
            l3.q r0 = ug.AbstractC4338c.f14500b     // Catch: java.lang.Throwable -> L3e
            if (r3 != r0) goto L9e
            r0 = 0
            goto L9f
        L9e:
            r0 = r3
        L9f:
            r1.f13722g = r12     // Catch: java.lang.Throwable -> L3e
            r1.f13723h = r11     // Catch: java.lang.Throwable -> L3e
            r1.f13724i = r10     // Catch: java.lang.Throwable -> L3e
            r1.f13725j = r9     // Catch: java.lang.Throwable -> L3e
            r1.f13726k = r3     // Catch: java.lang.Throwable -> L3e
            r1.f13729n = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r11.mo1602e(r0, r1)     // Catch: java.lang.Throwable -> L3e
            if (r0 != r4) goto Lb2
            goto Lf8
        Lb2:
            r0 = r3
        Lb3:
            java.util.concurrent.atomic.AtomicReference r3 = r10.f13736a     // Catch: java.lang.Throwable -> L3e
            l3.q r13 = tg.AbstractC4201s.f13789b     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r3.getAndSet(r13)     // Catch: java.lang.Throwable -> L3e
            r3.getClass()     // Catch: java.lang.Throwable -> L3e
            l3.q r14 = tg.AbstractC4201s.f13790c     // Catch: java.lang.Throwable -> L3e
            if (r3 != r14) goto Lc3
            goto L7c
        Lc3:
            r1.f13722g = r12     // Catch: java.lang.Throwable -> L3e
            r1.f13723h = r11     // Catch: java.lang.Throwable -> L3e
            r1.f13724i = r10     // Catch: java.lang.Throwable -> L3e
            r1.f13725j = r9     // Catch: java.lang.Throwable -> L3e
            r1.f13726k = r0     // Catch: java.lang.Throwable -> L3e
            r1.f13729n = r6     // Catch: java.lang.Throwable -> L3e
            sf.n r3 = p276sf.C3967n.f12976a     // Catch: java.lang.Throwable -> L3e
            qg.g r14 = new qg.g     // Catch: java.lang.Throwable -> L3e
            wf.c r15 = p080fb.AbstractC1184v0.m3214x(r1)     // Catch: java.lang.Throwable -> L3e
            r14.<init>(r8, r15)     // Catch: java.lang.Throwable -> L3e
            r14.m7513p()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicReference r15 = r10.f13736a     // Catch: java.lang.Throwable -> L3e
        Ldf:
            boolean r16 = r15.compareAndSet(r13, r14)     // Catch: java.lang.Throwable -> L3e
            if (r16 == 0) goto Le6
            goto Lef
        Le6:
            java.lang.Object r5 = r15.get()     // Catch: java.lang.Throwable -> L3e
            if (r5 == r13) goto Ldf
            r14.resumeWith(r3)     // Catch: java.lang.Throwable -> L3e
        Lef:
            java.lang.Object r5 = r14.m7512o()     // Catch: java.lang.Throwable -> L3e
            if (r5 != r4) goto Lf6
            r3 = r5
        Lf6:
            if (r3 != r4) goto L7c
        Lf8:
            return r4
        Lf9:
            r12.m8791f(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.C4183b0.mo6025b(tg.e, wf.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4337b
    /* JADX INFO: renamed from: c */
    public final AbstractC4339d mo8444c() {
        return new C4185c0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4337b
    /* JADX INFO: renamed from: d */
    public final AbstractC4339d[] mo8445d() {
        return new C4185c0[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) {
        if (obj == null) {
            obj = AbstractC4338c.f14500b;
        }
        m8446h(null, obj);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4208z
    public final Object getValue() {
        C2463q c2463q = AbstractC4338c.f14500b;
        Object obj = f13733l.get(this);
        if (obj == c2463q) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m8446h(Object obj, Object obj2) {
        int i9;
        AbstractC4339d[] abstractC4339dArr;
        C2463q c2463q;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13733l;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC1416l.m3825a(obj3, obj)) {
                return false;
            }
            if (AbstractC1416l.m3825a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f13734k;
            if ((i10 & 1) != 0) {
                this.f13734k = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f13734k = i11;
            AbstractC4339d[] abstractC4339dArr2 = this.f14495g;
            while (true) {
                C4185c0[] c4185c0Arr = (C4185c0[]) abstractC4339dArr2;
                if (c4185c0Arr != null) {
                    for (C4185c0 c4185c0 : c4185c0Arr) {
                        if (c4185c0 != null) {
                            AtomicReference atomicReference = c4185c0.f13736a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c2463q = AbstractC4201s.f13790c)) {
                                    C2463q c2463q2 = AbstractC4201s.f13789b;
                                    if (obj4 != c2463q2) {
                                        while (!atomicReference.compareAndSet(obj4, c2463q2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C3564g) obj4).resumeWith(C3967n.f12976a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c2463q)) {
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
                    i9 = this.f13734k;
                    if (i9 == i11) {
                        this.f13734k = i11 + 1;
                        return true;
                    }
                    abstractC4339dArr = this.f14495g;
                }
                abstractC4339dArr2 = abstractC4339dArr;
                i11 = i9;
            }
        }
    }
}
