package p350y1;

import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: y1.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9526n extends AbstractC9528p implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final String f32484q;

    /* JADX INFO: renamed from: r */
    public final float f32485r;

    /* JADX INFO: renamed from: s */
    public final float f32486s;

    /* JADX INFO: renamed from: t */
    public final float f32487t;

    /* JADX INFO: renamed from: u */
    public final float f32488u;

    /* JADX INFO: renamed from: v */
    public final float f32489v;

    /* JADX INFO: renamed from: w */
    public final float f32490w;

    /* JADX INFO: renamed from: x */
    public final float f32491x;

    /* JADX INFO: renamed from: y */
    public final List f32492y;

    /* JADX INFO: renamed from: z */
    public final List f32493z;

    /* JADX INFO: renamed from: y1.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f32494q;

        public a(C9526n c9526n) {
            this.f32494q = c9526n.f32493z.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC9528p next() {
            return (AbstractC9528p) this.f32494q.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32494q.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9526n(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2) {
        super(null);
        this.f32484q = str;
        this.f32485r = f10;
        this.f32486s = f11;
        this.f32487t = f12;
        this.f32488u = f13;
        this.f32489v = f14;
        this.f32490w = f15;
        this.f32491x = f16;
        this.f32492y = list;
        this.f32493z = list2;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC9528p m37267c(int i10) {
        return (AbstractC9528p) this.f32493z.get(i10);
    }

    /* JADX INFO: renamed from: e */
    public final List m37268e() {
        return this.f32492y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C9526n)) {
            C9526n c9526n = (C9526n) obj;
            return AbstractC1061t.m3842c(this.f32484q, c9526n.f32484q) && this.f32485r == c9526n.f32485r && this.f32486s == c9526n.f32486s && this.f32487t == c9526n.f32487t && this.f32488u == c9526n.f32488u && this.f32489v == c9526n.f32489v && this.f32490w == c9526n.f32490w && this.f32491x == c9526n.f32491x && AbstractC1061t.m3842c(this.f32492y, c9526n.f32492y) && AbstractC1061t.m3842c(this.f32493z, c9526n.f32493z);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.f32484q.hashCode() * 31) + Float.hashCode(this.f32485r)) * 31) + Float.hashCode(this.f32486s)) * 31) + Float.hashCode(this.f32487t)) * 31) + Float.hashCode(this.f32488u)) * 31) + Float.hashCode(this.f32489v)) * 31) + Float.hashCode(this.f32490w)) * 31) + Float.hashCode(this.f32491x)) * 31) + this.f32492y.hashCode()) * 31) + this.f32493z.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }

    /* JADX INFO: renamed from: l */
    public final String m37269l() {
        return this.f32484q;
    }

    /* JADX INFO: renamed from: o */
    public final float m37270o() {
        return this.f32486s;
    }

    /* JADX INFO: renamed from: p */
    public final float m37271p() {
        return this.f32487t;
    }

    /* JADX INFO: renamed from: q */
    public final float m37272q() {
        return this.f32485r;
    }

    /* JADX INFO: renamed from: r */
    public final float m37273r() {
        return this.f32488u;
    }

    /* JADX INFO: renamed from: s */
    public final float m37274s() {
        return this.f32489v;
    }

    /* JADX INFO: renamed from: t */
    public final int m37275t() {
        return this.f32493z.size();
    }

    /* JADX INFO: renamed from: u */
    public final float m37276u() {
        return this.f32490w;
    }

    /* JADX INFO: renamed from: v */
    public final float m37277v() {
        return this.f32491x;
    }
}
