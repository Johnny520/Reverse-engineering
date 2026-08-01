package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lb */
/* JADX INFO: loaded from: classes.dex */
public final class C0442lb {

    /* JADX INFO: renamed from: a */
    public final Object f3034a;

    /* JADX INFO: renamed from: b */
    public final C0018ah f3035b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0713sm f3036c;

    /* JADX INFO: renamed from: d */
    public final Object f3037d;

    /* JADX INFO: renamed from: e */
    public final Throwable f3038e;

    public C0442lb(Object obj, C0018ah c0018ah, InterfaceC0713sm interfaceC0713sm, Object obj2, Throwable th) {
        this.f3034a = obj;
        this.f3035b = c0018ah;
        this.f3036c = interfaceC0713sm;
        this.f3037d = obj2;
        this.f3038e = th;
    }

    /* JADX INFO: renamed from: a */
    public static C0442lb m1756a(C0442lb c0442lb, C0018ah c0018ah, CancellationException cancellationException, int i) {
        Object obj = c0442lb.f3034a;
        if ((i & 2) != 0) {
            c0018ah = c0442lb.f3035b;
        }
        C0018ah c0018ah2 = c0018ah;
        InterfaceC0713sm interfaceC0713sm = c0442lb.f3036c;
        Object obj2 = c0442lb.f3037d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c0442lb.f3038e;
        }
        return new C0442lb(obj, c0018ah2, interfaceC0713sm, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0442lb)) {
            return false;
        }
        C0442lb c0442lb = (C0442lb) obj;
        return AbstractC0346ip.m1497i(this.f3034a, c0442lb.f3034a) && AbstractC0346ip.m1497i(this.f3035b, c0442lb.f3035b) && AbstractC0346ip.m1497i(this.f3036c, c0442lb.f3036c) && AbstractC0346ip.m1497i(this.f3037d, c0442lb.f3037d) && AbstractC0346ip.m1497i(this.f3038e, c0442lb.f3038e);
    }

    public final int hashCode() {
        Object obj = this.f3034a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0018ah c0018ah = this.f3035b;
        int iHashCode2 = (iHashCode + (c0018ah == null ? 0 : c0018ah.hashCode())) * 31;
        InterfaceC0713sm interfaceC0713sm = this.f3036c;
        int iHashCode3 = (iHashCode2 + (interfaceC0713sm == null ? 0 : interfaceC0713sm.hashCode())) * 31;
        Object obj2 = this.f3037d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3038e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3034a + ", cancelHandler=" + this.f3035b + ", onCancellation=" + this.f3036c + ", idempotentResume=" + this.f3037d + ", cancelCause=" + this.f3038e + ')';
    }

    public /* synthetic */ C0442lb(Object obj, C0018ah c0018ah, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c0018ah, null, null, (i & 16) != 0 ? null : cancellationException);
    }
}
