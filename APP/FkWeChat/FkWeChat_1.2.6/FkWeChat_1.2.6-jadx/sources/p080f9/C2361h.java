package p080f9;

import p024b9.AbstractC1043k;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5101q0;
import p283t8.AbstractC8205c;
import p376zd.C9987e;

/* JADX INFO: renamed from: f9.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2361h implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: t */
    public static final a f6487t = new a(null);

    /* JADX INFO: renamed from: q */
    public final int f6488q;

    /* JADX INFO: renamed from: r */
    public final int f6489r;

    /* JADX INFO: renamed from: s */
    public final int f6490s;

    public C2361h(int i10, int i11, int i12) {
        if (i12 == 0) {
            C9987e.m38645a("Step must be non-zero.");
            throw null;
        }
        if (i12 == Integer.MIN_VALUE) {
            C9987e.m38645a("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f6488q = i10;
        this.f6489r = AbstractC8205c.m31894c(i10, i11, i12);
        this.f6490s = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2361h)) {
            return false;
        }
        if (isEmpty() && ((C2361h) obj).isEmpty()) {
            return true;
        }
        C2361h c2361h = (C2361h) obj;
        return this.f6488q == c2361h.f6488q && this.f6489r == c2361h.f6489r && this.f6490s == c2361h.f6490s;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6488q * 31) + this.f6489r) * 31) + this.f6490s;
    }

    public boolean isEmpty() {
        int i10 = this.f6490s;
        int i11 = this.f6488q;
        return i10 > 0 ? i11 > this.f6489r : i11 < this.f6489r;
    }

    /* JADX INFO: renamed from: o */
    public final int m8560o() {
        return this.f6488q;
    }

    /* JADX INFO: renamed from: p */
    public final int m8561p() {
        return this.f6489r;
    }

    /* JADX INFO: renamed from: q */
    public final int m8562q() {
        return this.f6490s;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC5101q0 iterator() {
        return new C2362i(this.f6488q, this.f6489r, this.f6490s);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        int i11 = this.f6490s;
        int i12 = this.f6488q;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append("..");
            sb2.append(this.f6489r);
            sb2.append(" step ");
            i10 = this.f6490s;
        } else {
            sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(" downTo ");
            sb2.append(this.f6489r);
            sb2.append(" step ");
            i10 = -this.f6490s;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: f9.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2361h m8564a(int i10, int i11, int i12) {
            return new C2361h(i10, i11, i12);
        }

        public a() {
        }
    }
}
