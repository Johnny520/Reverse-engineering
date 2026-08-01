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

    public C2318C(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p184j3.AbstractC2383b
    /* JADX INFO: renamed from: b */
    public final AbstractC2385d mo4145b() {
        return new C2319D();
    }

    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        if (obj == null) {
            obj = AbstractC2384c.f7730b;
        }
        m4147g(null, obj);
        return C0891q.f2780a;
    }

    @Override // p184j3.AbstractC2383b
    /* JADX INFO: renamed from: d */
    public final AbstractC2385d[] mo4146d() {
        return new C2319D[2];
    }

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

    @Override // p178i3.InterfaceC2316A
    public final Object getValue() {
        C1753n c1753n = AbstractC2384c.f7730b;
        Object obj = f7563i.get(this);
        if (obj == c1753n) {
            return null;
        }
        return obj;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3119i(p178i3.InterfaceC2324e r18, p074O2.InterfaceC1046d r19) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.C2318C.mo3119i(i3.e, O2.d):java.lang.Object");
    }

    @Override // p184j3.InterfaceC2394m
    /* JADX INFO: renamed from: n */
    public final InterfaceC2323d mo4148n(InterfaceC1051i interfaceC1051i, int i5, EnumC2241a enumC2241a) {
        return ((((i5 < 0 || i5 >= 2) && i5 != -2) || enumC2241a != EnumC2241a.f7352e) && !((i5 == 0 || i5 == -3) && enumC2241a == EnumC2241a.f7351d)) ? new C2388g(this, interfaceC1051i, i5, enumC2241a) : this;
    }
}
