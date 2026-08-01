package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ub */
/* JADX INFO: loaded from: classes.dex */
public final class C0775ub {

    /* JADX INFO: renamed from: a */
    public final Object f4675a;

    /* JADX INFO: renamed from: b */
    public final C0104ch f4676b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0786um f4677c;

    /* JADX INFO: renamed from: d */
    public final Object f4678d;

    /* JADX INFO: renamed from: e */
    public final Throwable f4679e;

    public C0775ub(Object obj, C0104ch c0104ch, InterfaceC0786um interfaceC0786um, Object obj2, Throwable th) {
        this.f4675a = obj;
        this.f4676b = c0104ch;
        this.f4677c = interfaceC0786um;
        this.f4678d = obj2;
        this.f4679e = th;
    }

    /* JADX INFO: renamed from: a */
    public static C0775ub m2450a(C0775ub c0775ub, C0104ch c0104ch, CancellationException cancellationException, int i) {
        Object obj = c0775ub.f4675a;
        if ((i & 2) != 0) {
            c0104ch = c0775ub.f4676b;
        }
        C0104ch c0104ch2 = c0104ch;
        InterfaceC0786um interfaceC0786um = c0775ub.f4677c;
        Object obj2 = c0775ub.f4678d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c0775ub.f4679e;
        }
        return new C0775ub(obj, c0104ch2, interfaceC0786um, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0775ub)) {
            return false;
        }
        C0775ub c0775ub = (C0775ub) obj;
        return AbstractC0493mp.m1853c(this.f4675a, c0775ub.f4675a) && AbstractC0493mp.m1853c(this.f4676b, c0775ub.f4676b) && AbstractC0493mp.m1853c(this.f4677c, c0775ub.f4677c) && AbstractC0493mp.m1853c(this.f4678d, c0775ub.f4678d) && AbstractC0493mp.m1853c(this.f4679e, c0775ub.f4679e);
    }

    public final int hashCode() {
        Object obj = this.f4675a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0104ch c0104ch = this.f4676b;
        int iHashCode2 = (iHashCode + (c0104ch == null ? 0 : c0104ch.hashCode())) * 31;
        InterfaceC0786um interfaceC0786um = this.f4677c;
        int iHashCode3 = (iHashCode2 + (interfaceC0786um == null ? 0 : interfaceC0786um.hashCode())) * 31;
        Object obj2 = this.f4678d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4679e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4675a + ", cancelHandler=" + this.f4676b + ", onCancellation=" + this.f4677c + ", idempotentResume=" + this.f4678d + ", cancelCause=" + this.f4679e + ')';
    }

    public /* synthetic */ C0775ub(Object obj, C0104ch c0104ch, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c0104ch, null, null, (i & 16) != 0 ? null : cancellationException);
    }
}
