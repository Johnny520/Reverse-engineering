package p023b8;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1064u0;
import p185m8.AbstractC5081g0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: b8.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1010c {

    /* JADX INFO: renamed from: e */
    public static final a f3148e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final List f3149f = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C1016i f3150a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1017j f3151b;

    /* JADX INFO: renamed from: c */
    public List f3152c;

    /* JADX INFO: renamed from: d */
    public boolean f3153d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1010c(C1016i c1016i, AbstractC1017j abstractC1017j) {
        c1016i.getClass();
        abstractC1017j.getClass();
        List list = f3149f;
        list.getClass();
        this(c1016i, abstractC1017j, AbstractC1064u0.m3855c(list));
        if (list.isEmpty()) {
            return;
        }
        C10010p0.m38820a("The shared empty array list has been modified");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3713a(InterfaceC0189q interfaceC0189q) {
        interfaceC0189q.getClass();
        if (this.f3153d) {
            m3717e();
        }
        this.f3152c.add(interfaceC0189q);
    }

    /* JADX INFO: renamed from: b */
    public final void m3714b(C1010c c1010c) {
        c1010c.getClass();
        if (m3721i()) {
            return;
        }
        if (c1010c.m3721i()) {
            c1010c.f3152c = m3722j();
            c1010c.f3153d = true;
        } else {
            if (c1010c.f3153d) {
                c1010c.m3717e();
            }
            m3715c(c1010c.f3152c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3715c(List list) {
        list.getClass();
        List list2 = this.f3152c;
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.ensureCapacity(arrayList.size() + list2.size());
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.add(list2.get(i10));
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m3716d() {
        return AbstractC5081g0.m20560a1(this.f3152c);
    }

    /* JADX INFO: renamed from: e */
    public final void m3717e() {
        this.f3152c = m3716d();
        this.f3153d = false;
    }

    /* JADX INFO: renamed from: f */
    public final C1016i m3718f() {
        return this.f3150a;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC1017j m3719g() {
        return this.f3151b;
    }

    /* JADX INFO: renamed from: h */
    public final int m3720h() {
        return this.f3152c.size();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3721i() {
        return this.f3152c.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public final List m3722j() {
        this.f3153d = true;
        return this.f3152c;
    }

    public String toString() {
        return "Phase `" + this.f3150a.m3756a() + "`, " + m3720h() + " handlers";
    }

    /* JADX INFO: renamed from: b8.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public C1010c(C1016i c1016i, AbstractC1017j abstractC1017j, List list) {
        c1016i.getClass();
        abstractC1017j.getClass();
        list.getClass();
        this.f3150a = c1016i;
        this.f3151b = abstractC1017j;
        this.f3152c = list;
        this.f3153d = true;
    }
}
