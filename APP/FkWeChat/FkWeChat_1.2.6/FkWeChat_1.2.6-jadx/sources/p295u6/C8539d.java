package p295u6;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p036c9.InterfaceC1400a;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5112w;
import p281t6.InterfaceC8163p;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: u6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8539d implements InterfaceC8163p {

    /* JADX INFO: renamed from: c */
    public final C8552q f28467c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4705l f28468d;

    /* JADX INFO: renamed from: u6.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements Map.Entry, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final int f28469q;

        public a(int i10) {
            this.f28469q = i10;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return C8539d.this.f28467c.m32911h(this.f28469q).toString();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List getValue() {
            return AbstractC5112w.m20789e(C8539d.this.f28467c.m32917n(this.f28469q).toString());
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8539d(C8552q c8552q) {
        c8552q.getClass();
        this.f28467c = c8552q;
        this.f28468d = AbstractC4706m.m18788b(EnumC4708o.f13923s, new InterfaceC0173a() { // from class: u6.a
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C8539d.m32856h(this.f28461q);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static a m32854f(C8539d c8539d, int i10) {
        return c8539d.new a(i10);
    }

    /* JADX INFO: renamed from: g */
    public static String m32855g(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.toString();
    }

    /* JADX INFO: renamed from: h */
    public static LinkedHashSet m32856h(C8539d c8539d) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c8539d.f28467c.m32909f());
        Iterator it = c8539d.f28467c.m32912i().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(c8539d.f28467c.m32911h(((Number) it.next()).intValue()).toString());
        }
        return linkedHashSet;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: a */
    public Set mo7356a() {
        return AbstractC7294t.m28910R(AbstractC7294t.m28901I(this.f28467c.m32912i(), new InterfaceC0184l() { // from class: u6.b
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8539d.m32854f(this.f28462q, ((Integer) obj).intValue());
            }
        }));
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: b */
    public boolean mo7357b() {
        return true;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: c */
    public void mo7358c(InterfaceC0188p interfaceC0188p) {
        InterfaceC8163p.b.m31654a(this, interfaceC0188p);
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: d */
    public List mo7359d(String str) {
        str.getClass();
        List listM28908P = AbstractC7294t.m28908P(AbstractC7294t.m28901I(this.f28467c.m32908e(str), new InterfaceC0184l() { // from class: u6.c
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C8539d.m32855g((CharSequence) obj);
            }
        }));
        if (listM28908P.isEmpty()) {
            return null;
        }
        return listM28908P;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: e */
    public String mo12334e(String str) {
        str.getClass();
        CharSequence charSequenceM32907d = this.f28467c.m32907d(str);
        if (charSequenceM32907d != null) {
            return charSequenceM32907d.toString();
        }
        return null;
    }
}
