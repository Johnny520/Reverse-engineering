package p166l2;

import p024b9.AbstractC1043k;
import p120i2.AbstractC3167a;
import p121i3.C3179i;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: l2.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4584s {

    /* JADX INFO: renamed from: f */
    public static final a f13463f = new a(null);

    /* JADX INFO: renamed from: a */
    public final float f13464a;

    /* JADX INFO: renamed from: b */
    public final float f13465b;

    /* JADX INFO: renamed from: c */
    public final float f13466c;

    /* JADX INFO: renamed from: d */
    public final float f13467d;

    /* JADX INFO: renamed from: e */
    public final boolean f13468e;

    public C4584s(float f10, float f11, float f12, float f13, boolean z10) {
        this.f13464a = f10;
        this.f13465b = f11;
        this.f13466c = f12;
        this.f13467d = f13;
        this.f13468e = z10;
        if (!(f10 >= 0.0f)) {
            AbstractC3167a.m11955a("Left must be non-negative");
        }
        if (!(f11 >= 0.0f)) {
            AbstractC3167a.m11955a("Top must be non-negative");
        }
        if (!(f12 >= 0.0f)) {
            AbstractC3167a.m11955a("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        AbstractC3167a.m11955a("Bottom must be non-negative");
    }

    /* JADX INFO: renamed from: a */
    public final long m18195a(InterfaceC3175e interfaceC3175e) {
        return AbstractC4544g2.m17796d(AbstractC4544g2.f13326a.m17804c(interfaceC3175e.mo1236x1(this.f13464a), interfaceC3175e.mo1236x1(this.f13465b), interfaceC3175e.mo1236x1(this.f13466c), interfaceC3175e.mo1236x1(this.f13467d), this.f13468e));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4584s)) {
            return false;
        }
        C4584s c4584s = (C4584s) obj;
        return C3179i.m12005m(this.f13464a, c4584s.f13464a) && C3179i.m12005m(this.f13465b, c4584s.f13465b) && C3179i.m12005m(this.f13466c, c4584s.f13466c) && C3179i.m12005m(this.f13467d, c4584s.f13467d) && this.f13468e == c4584s.f13468e;
    }

    public int hashCode() {
        return (((((((C3179i.m12006n(this.f13464a) * 31) + C3179i.m12006n(this.f13465b)) * 31) + C3179i.m12006n(this.f13466c)) * 31) + C3179i.m12006n(this.f13467d)) * 31) + Boolean.hashCode(this.f13468e);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) C3179i.m12007p(this.f13464a)) + ", top=" + ((Object) C3179i.m12007p(this.f13465b)) + ", end=" + ((Object) C3179i.m12007p(this.f13466c)) + ", bottom=" + ((Object) C3179i.m12007p(this.f13467d)) + ", isLayoutDirectionAware=" + this.f13468e + ')';
    }

    /* JADX INFO: renamed from: l2.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C4584s(float f10, float f11, float f12, float f13, boolean z10, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, z10);
    }
}
