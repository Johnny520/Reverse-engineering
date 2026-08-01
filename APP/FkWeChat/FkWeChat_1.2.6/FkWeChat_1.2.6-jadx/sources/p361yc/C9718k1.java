package p361yc;

import java.util.Map;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p172l8.C4700i0;
import p300uc.InterfaceC8647b;
import p329wc.AbstractC9223k;
import p329wc.AbstractC9225m;
import p329wc.C9213a;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: yc.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9718k1 extends AbstractC9668a1 {

    /* JADX INFO: renamed from: c */
    public final InterfaceC9218f f32982c;

    /* JADX INFO: renamed from: yc.k1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Map.Entry, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Object f32983q;

        /* JADX INFO: renamed from: r */
        public final Object f32984r;

        public a(Object obj, Object obj2) {
            this.f32983q = obj;
            this.f32984r = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f32983q, aVar.f32983q) && AbstractC1061t.m3842c(this.f32984r, aVar.f32984r);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f32983q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f32984r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f32983q;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f32984r;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f32983q + ", value=" + this.f32984r + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9718k1(final InterfaceC8647b interfaceC8647b, final InterfaceC8647b interfaceC8647b2) {
        super(interfaceC8647b, interfaceC8647b2, null);
        interfaceC8647b.getClass();
        interfaceC8647b2.getClass();
        this.f32982c = AbstractC9223k.m35908d("kotlin.collections.Map.Entry", AbstractC9225m.c.f31488a, new InterfaceC9218f[0], new InterfaceC0184l() { // from class: yc.j1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C9718k1.m37953l(interfaceC8647b, interfaceC8647b2, (C9213a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C4700i0 m37953l(InterfaceC8647b interfaceC8647b, InterfaceC8647b interfaceC8647b2, C9213a c9213a) {
        c9213a.getClass();
        C9213a.m35877b(c9213a, "key", interfaceC8647b.mo15953a(), null, false, 12, null);
        C9213a.m35877b(c9213a, "value", interfaceC8647b2.mo15953a(), null, false, 12, null);
        return C4700i0.f13910a;
    }

    @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: a */
    public InterfaceC9218f mo15953a() {
        return this.f32982c;
    }

    @Override // p361yc.AbstractC9668a1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Object mo37801g(Map.Entry entry) {
        entry.getClass();
        return entry.getKey();
    }

    @Override // p361yc.AbstractC9668a1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object mo37803i(Map.Entry entry) {
        entry.getClass();
        return entry.getValue();
    }

    @Override // p361yc.AbstractC9668a1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Map.Entry mo37805k(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
