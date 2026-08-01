package p119i1;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p364z0.AbstractC9823a;
import p364z0.InterfaceC9827e;

/* JADX INFO: renamed from: i1.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3126f0 {

    /* JADX INFO: renamed from: a */
    public static final Object f8329a = new Object();

    /* JADX INFO: renamed from: a */
    public static final SnapshotStateList m11720a(int i10, InterfaceC0184l interfaceC0184l) {
        if (i10 == 0) {
            return new SnapshotStateList();
        }
        InterfaceC9827e.a aVarBuilder = AbstractC9823a.m38173b().builder();
        for (int i11 = 0; i11 < i10; i11++) {
            aVarBuilder.add(interfaceC0184l.mo27m(Integer.valueOf(i11)));
        }
        return new SnapshotStateList(aVarBuilder.build());
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m11725f(C3148q0 c3148q0, int i10, InterfaceC9827e interfaceC9827e, boolean z10) {
        boolean z11;
        synchronized (f8329a) {
            try {
                if (c3148q0.m11854j() == i10) {
                    c3148q0.m11856l(interfaceC9827e);
                    z11 = true;
                    if (z10) {
                        c3148q0.m11858n(c3148q0.m11855k() + 1);
                    }
                    c3148q0.m11857m(c3148q0.m11854j() + 1);
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: g */
    public static final C3148q0 m11726g(SnapshotStateList snapshotStateList) {
        AbstractC3162x0 abstractC3162x0Mo1519e = snapshotStateList.mo1519e();
        abstractC3162x0Mo1519e.getClass();
        return (C3148q0) AbstractC3159w.m11897Z((C3148q0) abstractC3162x0Mo1519e, snapshotStateList);
    }

    /* JADX INFO: renamed from: h */
    public static final int m11727h(SnapshotStateList snapshotStateList) {
        AbstractC3162x0 abstractC3162x0Mo1519e = snapshotStateList.mo1519e();
        abstractC3162x0Mo1519e.getClass();
        return ((C3148q0) AbstractC3159w.m11880I((C3148q0) abstractC3162x0Mo1519e)).m11855k();
    }

    /* JADX INFO: renamed from: i */
    public static final Void m11728i() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: renamed from: j */
    public static final Void m11729j() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m11730k(SnapshotStateList snapshotStateList, InterfaceC0184l interfaceC0184l) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        Object objMo27m;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        do {
            synchronized (f8329a) {
                AbstractC3162x0 abstractC3162x0Mo1519e = snapshotStateList.mo1519e();
                abstractC3162x0Mo1519e.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) abstractC3162x0Mo1519e);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e.a aVarBuilder = interfaceC9827eM11853i.builder();
            objMo27m = interfaceC0184l.mo27m(aVarBuilder);
            InterfaceC9827e interfaceC9827eBuild = aVarBuilder.build();
            if (AbstractC1061t.m3842c(interfaceC9827eBuild, interfaceC9827eM11853i)) {
                break;
            }
            AbstractC3162x0 abstractC3162x0Mo1519e2 = snapshotStateList.mo1519e();
            abstractC3162x0Mo1519e2.getClass();
            C3148q0 c3148q02 = (C3148q0) abstractC3162x0Mo1519e2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, snapshotStateList, abstractC3137lM11764c), iM11854j, interfaceC9827eBuild, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, snapshotStateList);
        } while (!zM11725f);
        return ((Boolean) objMo27m).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC3162x0 m11731l(SnapshotStateList snapshotStateList, InterfaceC9827e interfaceC9827e) {
        AbstractC3137l abstractC3137lM11882K = AbstractC3159w.m11882K();
        C3148q0 c3148q0 = new C3148q0(abstractC3137lM11882K.mo11678i(), interfaceC9827e);
        if (!(abstractC3137lM11882K instanceof C3115b)) {
            c3148q0.m11942g(new C3148q0(AbstractC3149r.m11861c(1), interfaceC9827e));
        }
        return c3148q0;
    }

    /* JADX INFO: renamed from: m */
    public static final void m11732m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }
}
