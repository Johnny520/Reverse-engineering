package p264s0;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0498g2;
import androidx.compose.runtime.InterfaceC0512i2;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p102h1.AbstractC2819a0;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p185m8.AbstractC5114x;
import p264s0.C6877od;
import p376zd.C9987e;

/* JADX INFO: renamed from: s0.od */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6877od implements InterfaceC6829ld {

    /* JADX INFO: renamed from: e */
    public static final a f22350e = new a(null);

    /* JADX INFO: renamed from: a */
    public boolean f22351a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0512i2 f22352b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0498g2 f22353c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0498g2 f22354d;

    public C6877od(int i10, int i11, boolean z10) {
        if (i10 < 0 || i10 >= 24) {
            C9987e.m38645a("initialHour should in [0..23] range");
            throw null;
        }
        if (i11 < 0 || i11 >= 60) {
            C9987e.m38645a("initialMinute should be in [0..59] range");
            throw null;
        }
        this.f22351a = z10;
        this.f22352b = AbstractC0522j5.m1773e(C6813kd.m27004c(C6813kd.f21851b.m27011a()), null, 2, null);
        this.f22353c = AbstractC0570q4.m2141a(i10);
        this.f22354d = AbstractC0570q4.m2141a(i11);
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: a */
    public void mo26849a(int i10) {
        this.f22353c.mo1687j(i10);
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: b */
    public void mo26850b(int i10) {
        this.f22354d.mo1687j(i10);
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: c */
    public int mo26851c() {
        return this.f22354d.mo1686f();
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: d */
    public void mo26852d(int i10) {
        this.f22352b.setValue(C6813kd.m27004c(i10));
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: e */
    public int mo26853e() {
        return ((C6813kd) this.f22352b.getValue()).m27010i();
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: f */
    public boolean mo26854f() {
        return this.f22351a;
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: g */
    public int mo26855g() {
        return this.f22353c.mo1686f();
    }

    /* JADX INFO: renamed from: s0.od$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static List m27291a(InterfaceC2821b0 interfaceC2821b0, C6877od c6877od) {
            return AbstractC5114x.m20803r(Integer.valueOf(c6877od.mo26855g()), Integer.valueOf(c6877od.mo26851c()), Boolean.valueOf(c6877od.mo26854f()));
        }

        /* JADX INFO: renamed from: b */
        public static C6877od m27292b(List list) {
            Object obj = list.get(0);
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            obj2.getClass();
            int iIntValue2 = ((Integer) obj2).intValue();
            Object obj3 = list.get(2);
            obj3.getClass();
            return new C6877od(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC2843x m27293c() {
            return AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: s0.md
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C6877od.a.m27291a((InterfaceC2821b0) obj, (C6877od) obj2);
                }
            }, new InterfaceC0184l() { // from class: s0.nd
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C6877od.a.m27292b((List) obj);
                }
            });
        }

        public a() {
        }
    }
}
