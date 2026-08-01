package p119i1;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p364z0.InterfaceC9829g;
import p376zd.C10010p0;

/* JADX INFO: renamed from: i1.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3142n0 {

    /* JADX INFO: renamed from: a */
    public static final Object f8381a = new Object();

    /* JADX INFO: renamed from: b */
    public static final boolean m11816b(C3166z0 c3166z0, int i10, InterfaceC9829g interfaceC9829g) {
        boolean z10;
        synchronized (f8381a) {
            if (c3166z0.m11951i() == i10) {
                c3166z0.m11954l(interfaceC9829g);
                z10 = true;
                c3166z0.m11953k(c3166z0.m11951i() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public static final int m11817c(SnapshotStateSet snapshotStateSet) {
        AbstractC3162x0 abstractC3162x0Mo1519e = snapshotStateSet.mo1519e();
        abstractC3162x0Mo1519e.getClass();
        return ((C3166z0) AbstractC3159w.m11880I((C3166z0) abstractC3162x0Mo1519e)).m11951i();
    }

    /* JADX INFO: renamed from: d */
    public static final C3166z0 m11818d(SnapshotStateSet snapshotStateSet) {
        AbstractC3162x0 abstractC3162x0Mo1519e = snapshotStateSet.mo1519e();
        abstractC3162x0Mo1519e.getClass();
        return (C3166z0) AbstractC3159w.m11897Z((C3166z0) abstractC3162x0Mo1519e, snapshotStateSet);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m11819e(SnapshotStateSet snapshotStateSet, InterfaceC0184l interfaceC0184l) {
        int iM11951i;
        InterfaceC9829g interfaceC9829gM11952j;
        InterfaceC9829g.a aVarBuilder;
        Object objMo27m;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11816b;
        do {
            synchronized (f8381a) {
                AbstractC3162x0 abstractC3162x0Mo1519e = snapshotStateSet.mo1519e();
                abstractC3162x0Mo1519e.getClass();
                C3166z0 c3166z0 = (C3166z0) AbstractC3159w.m11880I((C3166z0) abstractC3162x0Mo1519e);
                iM11951i = c3166z0.m11951i();
                interfaceC9829gM11952j = c3166z0.m11952j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            if (interfaceC9829gM11952j != null && (aVarBuilder = interfaceC9829gM11952j.builder()) != null) {
                objMo27m = interfaceC0184l.mo27m(aVarBuilder);
                InterfaceC9829g interfaceC9829gBuild = aVarBuilder.build();
                if (AbstractC1061t.m3842c(interfaceC9829gBuild, interfaceC9829gM11952j)) {
                    break;
                }
                AbstractC3162x0 abstractC3162x0Mo1519e2 = snapshotStateSet.mo1519e();
                abstractC3162x0Mo1519e2.getClass();
                C3166z0 c3166z02 = (C3166z0) abstractC3162x0Mo1519e2;
                synchronized (AbstractC3159w.m11883L()) {
                    abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                    zM11816b = m11816b((C3166z0) AbstractC3159w.m11917j0(c3166z02, snapshotStateSet, abstractC3137lM11764c), iM11951i, interfaceC9829gBuild);
                }
                AbstractC3159w.m11890S(abstractC3137lM11764c, snapshotStateSet);
            } else {
                C10010p0.m38820a("No set to mutate");
                return false;
            }
        } while (!zM11816b);
        return ((Boolean) objMo27m).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC3162x0 m11820f(SnapshotStateSet snapshotStateSet, InterfaceC9829g interfaceC9829g) {
        C3166z0 c3166z0 = new C3166z0(AbstractC3159w.m11882K().mo11678i(), interfaceC9829g);
        if (AbstractC3137l.f8345e.m11766e()) {
            c3166z0.m11942g(new C3166z0(AbstractC3149r.m11861c(1), interfaceC9829g));
        }
        return c3166z0;
    }
}
