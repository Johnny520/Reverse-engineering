package p244u;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.M */
/* JADX INFO: loaded from: classes.dex */
public final class C3244M extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final float f10044a;

    /* JADX INFO: renamed from: b */
    public final boolean f10045b;

    public C3244M(float f2, boolean z5) {
        this.f10044a = f2;
        this.f10045b = z5;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3245N c3245n = new C3245N();
        c3245n.f10046r = this.f10044a;
        c3245n.f10047s = this.f10045b;
        return c3245n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3244M c3244m = obj instanceof C3244M ? (C3244M) obj : null;
        return c3244m != null && this.f10044a == c3244m.f10044a && this.f10045b == c3244m.f10045b;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3245N c3245n = (C3245N) abstractC2206o;
        c3245n.f10046r = this.f10044a;
        c3245n.f10047s = this.f10045b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10045b) + (Float.hashCode(this.f10044a) * 31);
    }
}
