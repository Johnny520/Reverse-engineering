package p119i1;

import java.util.Iterator;
import java.util.Map;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1404e;
import p117i.C3039b;

/* JADX INFO: renamed from: i1.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3150r0 extends AbstractC3152s0 implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: i1.r0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Map.Entry, InterfaceC1404e.a {

        /* JADX INFO: renamed from: q */
        public final Object f8410q;

        /* JADX INFO: renamed from: r */
        public Object f8411r;

        public a() {
            Map.Entry entryM11869v = C3150r0.this.m11869v();
            entryM11869v.getClass();
            this.f8410q = entryM11869v.getKey();
            Map.Entry entryM11869v2 = C3150r0.this.m11869v();
            entryM11869v2.getClass();
            this.f8411r = entryM11869v2.getValue();
        }

        /* JADX INFO: renamed from: a */
        public void m11865a(Object obj) {
            this.f8411r = obj;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f8410q;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f8411r;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            C3150r0 c3150r0 = C3150r0.this;
            if (c3150r0.m11870x().m11739n() != c3150r0.f8415s) {
                C3039b.m11232a();
                return null;
            }
            Object value = getValue();
            c3150r0.m11870x().put(getKey(), obj);
            m11865a(obj);
            return value;
        }
    }

    public C3150r0(C3128g0 c3128g0, Iterator it) {
        super(c3128g0, it);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        m11868o();
        if (m11869v() != null) {
            return new a();
        }
        throw new IllegalStateException();
    }
}
