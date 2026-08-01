package p057e1;

import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0520j3;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p010a9.InterfaceC0190r;
import p010a9.InterfaceC0191s;
import p010a9.InterfaceC0192t;
import p024b9.AbstractC1023a;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: e1.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1983k implements InterfaceC1978f {

    /* JADX INFO: renamed from: q */
    public final int f5513q;

    /* JADX INFO: renamed from: r */
    public final boolean f5514r;

    /* JADX INFO: renamed from: s */
    public Object f5515s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0520j3 f5516t;

    /* JADX INFO: renamed from: u */
    public List f5517u;

    /* JADX INFO: renamed from: e1.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a extends AbstractC1023a implements InterfaceC0188p {
        public a(Object obj) {
            super(2, obj, C1983k.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        /* JADX INFO: renamed from: a */
        public final void m7160a(InterfaceC0572r interfaceC0572r, int i10) {
            ((C1983k) this.f3175q).m7152g(interfaceC0572r, i10);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7160a((InterfaceC0572r) obj, ((Number) obj2).intValue());
            return C4700i0.f13910a;
        }
    }

    public C1983k(int i10, boolean z10, Object obj) {
        this.f5513q = i10;
        this.f5514r = z10;
        this.f5515s = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m7148a(C1983k c1983k, Object obj, Object obj2, Object obj3, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c1983k.m7155o(obj, obj2, obj3, interfaceC0572r, AbstractC0541m3.m1929a(i10) | 1);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m7149c(C1983k c1983k, Object obj, Object obj2, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c1983k.m7154l(obj, obj2, interfaceC0572r, AbstractC0541m3.m1929a(i10) | 1);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public static C4700i0 m7150d(C1983k c1983k, Object obj, Object obj2, Object obj3, Object obj4, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c1983k.m7156r(obj, obj2, obj3, obj4, interfaceC0572r, AbstractC0541m3.m1929a(i10) | 1);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public static C4700i0 m7151f(C1983k c1983k, Object obj, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c1983k.m7153j(obj, interfaceC0572r, AbstractC0541m3.m1929a(i10) | 1);
        return C4700i0.f13910a;
    }

    @Override // p010a9.InterfaceC0189q
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
        return m7153j(obj, (InterfaceC0572r) obj2, ((Number) obj3).intValue());
    }

    /* JADX INFO: renamed from: g */
    public Object m7152g(InterfaceC0572r interfaceC0572r, int i10) {
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(this.f5513q);
        m7157v(interfaceC0572rMo2181q);
        int iM7163c = i10 | (interfaceC0572rMo2181q.mo2162U(this) ? AbstractC1984l.m7163c(0) : AbstractC1984l.m7166f(0));
        Object obj = this.f5515s;
        obj.getClass();
        Object objInvoke = ((InterfaceC0188p) AbstractC1064u0.m3858f(obj, 2)).invoke(interfaceC0572rMo2181q, Integer.valueOf(iM7163c));
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new a(this));
        }
        return objInvoke;
    }

    @Override // p010a9.InterfaceC0188p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m7152g((InterfaceC0572r) obj, ((Number) obj2).intValue());
    }

    /* JADX INFO: renamed from: j */
    public Object m7153j(final Object obj, InterfaceC0572r interfaceC0572r, final int i10) {
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(this.f5513q);
        m7157v(interfaceC0572rMo2181q);
        int iM7163c = interfaceC0572rMo2181q.mo2162U(this) ? AbstractC1984l.m7163c(1) : AbstractC1984l.m7166f(1);
        Object obj2 = this.f5515s;
        obj2.getClass();
        Object objMo236e = ((InterfaceC0189q) AbstractC1064u0.m3858f(obj2, 3)).mo236e(obj, interfaceC0572rMo2181q, Integer.valueOf(iM7163c | i10));
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: e1.i
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj3, Object obj4) {
                    return C1983k.m7151f(this.f5506q, obj, i10, (InterfaceC0572r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
        return objMo236e;
    }

    /* JADX INFO: renamed from: l */
    public Object m7154l(final Object obj, final Object obj2, InterfaceC0572r interfaceC0572r, final int i10) {
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(this.f5513q);
        m7157v(interfaceC0572rMo2181q);
        int iM7163c = interfaceC0572rMo2181q.mo2162U(this) ? AbstractC1984l.m7163c(2) : AbstractC1984l.m7166f(2);
        Object obj3 = this.f5515s;
        obj3.getClass();
        Object objMo284p = ((InterfaceC0190r) AbstractC1064u0.m3858f(obj3, 4)).mo284p(obj, obj2, interfaceC0572rMo2181q, Integer.valueOf(iM7163c | i10));
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: e1.j
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj4, Object obj5) {
                    return C1983k.m7149c(this.f5509q, obj, obj2, i10, (InterfaceC0572r) obj4, ((Integer) obj5).intValue());
                }
            });
        }
        return objMo284p;
    }

    /* JADX INFO: renamed from: o */
    public Object m7155o(final Object obj, final Object obj2, final Object obj3, InterfaceC0572r interfaceC0572r, final int i10) {
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(this.f5513q);
        m7157v(interfaceC0572rMo2181q);
        int iM7163c = interfaceC0572rMo2181q.mo2162U(this) ? AbstractC1984l.m7163c(3) : AbstractC1984l.m7166f(3);
        Object obj4 = this.f5515s;
        obj4.getClass();
        Object objMo231t = ((InterfaceC0191s) AbstractC1064u0.m3858f(obj4, 5)).mo231t(obj, obj2, obj3, interfaceC0572rMo2181q, Integer.valueOf(iM7163c | i10));
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: e1.g
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj5, Object obj6) {
                    return C1983k.m7148a(this.f5495q, obj, obj2, obj3, i10, (InterfaceC0572r) obj5, ((Integer) obj6).intValue());
                }
            });
        }
        return objMo231t;
    }

    @Override // p010a9.InterfaceC0190r
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ Object mo284p(Object obj, Object obj2, Object obj3, Object obj4) {
        return m7154l(obj, obj2, (InterfaceC0572r) obj3, ((Number) obj4).intValue());
    }

    /* JADX INFO: renamed from: r */
    public Object m7156r(final Object obj, final Object obj2, final Object obj3, final Object obj4, InterfaceC0572r interfaceC0572r, final int i10) {
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(this.f5513q);
        m7157v(interfaceC0572rMo2181q);
        int iM7163c = interfaceC0572rMo2181q.mo2162U(this) ? AbstractC1984l.m7163c(4) : AbstractC1984l.m7166f(4);
        Object obj5 = this.f5515s;
        obj5.getClass();
        Object objMo361s = ((InterfaceC0192t) AbstractC1064u0.m3858f(obj5, 6)).mo361s(obj, obj2, obj3, obj4, interfaceC0572rMo2181q, Integer.valueOf(iM7163c | i10));
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: e1.h
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj6, Object obj7) {
                    return C1983k.m7150d(this.f5500q, obj, obj2, obj3, obj4, i10, (InterfaceC0572r) obj6, ((Integer) obj7).intValue());
                }
            });
        }
        return objMo361s;
    }

    @Override // p010a9.InterfaceC0192t
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ Object mo361s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m7156r(obj, obj2, obj3, obj4, (InterfaceC0572r) obj5, ((Number) obj6).intValue());
    }

    @Override // p010a9.InterfaceC0191s
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ Object mo231t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m7155o(obj, obj2, obj3, (InterfaceC0572r) obj4, ((Number) obj5).intValue());
    }

    /* JADX INFO: renamed from: v */
    public final void m7157v(InterfaceC0572r interfaceC0572r) {
        InterfaceC0520j3 interfaceC0520j3Mo2166b;
        if (!this.f5514r || (interfaceC0520j3Mo2166b = interfaceC0572r.mo2166b()) == null) {
            return;
        }
        interfaceC0572r.mo2150I(interfaceC0520j3Mo2166b);
        if (AbstractC1984l.m7165e(this.f5516t, interfaceC0520j3Mo2166b)) {
            this.f5516t = interfaceC0520j3Mo2166b;
            return;
        }
        List list = this.f5517u;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f5517u = arrayList;
            arrayList.add(interfaceC0520j3Mo2166b);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC1984l.m7165e((InterfaceC0520j3) list.get(i10), interfaceC0520j3Mo2166b)) {
                list.set(i10, interfaceC0520j3Mo2166b);
                return;
            }
        }
        list.add(interfaceC0520j3Mo2166b);
    }

    /* JADX INFO: renamed from: w */
    public final void m7158w() {
        if (this.f5514r) {
            InterfaceC0520j3 interfaceC0520j3 = this.f5516t;
            if (interfaceC0520j3 != null) {
                interfaceC0520j3.invalidate();
                this.f5516t = null;
            }
            List list = this.f5517u;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC0520j3) list.get(i10)).invalidate();
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7159x(Object obj) {
        if (AbstractC1061t.m3842c(this.f5515s, obj)) {
            return;
        }
        boolean z10 = this.f5515s == null;
        this.f5515s = obj;
        if (z10) {
            return;
        }
        m7158w();
    }
}
