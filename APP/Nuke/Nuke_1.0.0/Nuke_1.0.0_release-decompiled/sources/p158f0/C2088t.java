package p158f0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p000A.C0002B;
import p000A.C0049a;
import p027E4.C0330q;
import p061L2.AbstractC0973m;
import p095T.AbstractC1387t;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p135b.C1836x;

/* JADX INFO: renamed from: f0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2088t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f6996a;

    /* JADX INFO: renamed from: c */
    public boolean f6998c;

    /* JADX INFO: renamed from: h */
    public C1836x f7003h;

    /* JADX INFO: renamed from: i */
    public C2087s f7004i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f6997b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C0002B f6999d = new C0002B(16, this);

    /* JADX INFO: renamed from: e */
    public final C0049a f7000e = new C0049a(20, this);

    /* JADX INFO: renamed from: f */
    public final C1483e f7001f = new C1483e(new C2087s[16]);

    /* JADX INFO: renamed from: g */
    public final Object f7002g = new Object();

    /* JADX INFO: renamed from: j */
    public long f7005j = -1;

    public C2088t(InterfaceC1601c interfaceC1601c) {
        this.f6996a = interfaceC1601c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3865a() {
        synchronized (this.f7002g) {
            C1483e c1483e = this.f7001f;
            Object[] objArr = c1483e.f5181d;
            int i5 = c1483e.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C2087s c2087s = (C2087s) objArr[i6];
                c2087s.f6987e.m4266a();
                c2087s.f6988f.m4266a();
                c2087s.f6994l.m4266a();
                c2087s.f6995m.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3866b() {
        boolean z5;
        Set set;
        Set set2;
        synchronized (this.f7002g) {
            z5 = this.f6998c;
        }
        if (z5) {
            return false;
        }
        boolean z6 = false;
        while (true) {
            AtomicReference atomicReference = this.f6997b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC1387t.m2639b("Unexpected notification");
                        throw new C0330q();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z6;
            }
            synchronized (this.f7002g) {
                C1483e c1483e = this.f7001f;
                Object[] objArr = c1483e.f5181d;
                int i5 = c1483e.f5183f;
                for (int i6 = 0; i6 < i5; i6++) {
                    z6 = ((C2087s) objArr[i6]).m3861a(set) || z6;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3867c(java.lang.Object r24, p112W2.InterfaceC1601c r25, p112W2.InterfaceC1599a r26) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.C2088t.m3867c(java.lang.Object, W2.c, W2.a):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: d */
    public final void m3868d() {
        C0002B c0002b = this.f6999d;
        AbstractC2082n.m3829e(AbstractC2082n.f6970a);
        synchronized (AbstractC2082n.f6972c) {
            AbstractC2082n.f6977h = AbstractC0973m.m2020a0(AbstractC2082n.f6977h, c0002b);
        }
        this.f7003h = new C1836x(2, c0002b);
    }
}
