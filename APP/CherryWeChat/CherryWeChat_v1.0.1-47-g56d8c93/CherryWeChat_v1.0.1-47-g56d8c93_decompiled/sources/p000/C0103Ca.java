package p000;

/* JADX INFO: renamed from: Ca */
/* JADX INFO: loaded from: classes.dex */
public final class C0103Ca {

    /* JADX INFO: renamed from: a */
    public final Object f243a;

    /* JADX INFO: renamed from: b */
    public final C0394J6 f244b;

    /* JADX INFO: renamed from: c */
    public final C0373Im f245c;

    /* JADX INFO: renamed from: d */
    public final Object f246d;

    /* JADX INFO: renamed from: e */
    public final Throwable f247e;

    public C0103Ca(Object obj, C0394J6 c0394j6, C0373Im c0373Im, Object obj2, Throwable th) {
        this.f243a = obj;
        this.f244b = c0394j6;
        this.f245c = c0373Im;
        this.f246d = obj2;
        this.f247e = th;
    }

    /* JADX INFO: renamed from: a */
    public static C0103Ca m151a(C0103Ca c0103Ca, C0394J6 c0394j6, Throwable th, int i) {
        Object obj = c0103Ca.f243a;
        if ((i & 2) != 0) {
            c0394j6 = c0103Ca.f244b;
        }
        C0394J6 c0394j62 = c0394j6;
        C0373Im c0373Im = c0103Ca.f245c;
        Object obj2 = c0103Ca.f246d;
        if ((i & 16) != 0) {
            th = c0103Ca.f247e;
        }
        return new C0103Ca(obj, c0394j62, c0373Im, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0103Ca)) {
            return false;
        }
        C0103Ca c0103Ca = (C0103Ca) obj;
        return AbstractC0585Nj.m1134a(this.f243a, c0103Ca.f243a) && AbstractC0585Nj.m1134a(this.f244b, c0103Ca.f244b) && AbstractC0585Nj.m1134a(this.f245c, c0103Ca.f245c) && AbstractC0585Nj.m1134a(this.f246d, c0103Ca.f246d) && AbstractC0585Nj.m1134a(this.f247e, c0103Ca.f247e);
    }

    public final int hashCode() {
        Object obj = this.f243a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0394J6 c0394j6 = this.f244b;
        int iHashCode2 = (iHashCode + (c0394j6 == null ? 0 : c0394j6.hashCode())) * 31;
        C0373Im c0373Im = this.f245c;
        int iHashCode3 = (iHashCode2 + (c0373Im == null ? 0 : c0373Im.hashCode())) * 31;
        Object obj2 = this.f246d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f247e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f243a + ", cancelHandler=" + this.f244b + ", onCancellation=" + this.f245c + ", idempotentResume=" + this.f246d + ", cancelCause=" + this.f247e + ')';
    }

    public /* synthetic */ C0103Ca(Object obj, C0394J6 c0394j6, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : c0394j6, null, null, (i & 16) != 0 ? null : th);
    }
}
