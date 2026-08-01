package ec;

import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: ec.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2106a0 {

    /* JADX INFO: renamed from: a */
    public final Object f5906a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2152l f5907b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0189q f5908c;

    /* JADX INFO: renamed from: d */
    public final Object f5909d;

    /* JADX INFO: renamed from: e */
    public final Throwable f5910e;

    public /* synthetic */ C2106a0(Object obj, InterfaceC2152l interfaceC2152l, InterfaceC0189q interfaceC0189q, Object obj2, Throwable th, int i10, AbstractC1043k abstractC1043k) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC2152l, (i10 & 4) != 0 ? null : interfaceC0189q, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2106a0 m7592b(C2106a0 c2106a0, Object obj, InterfaceC2152l interfaceC2152l, InterfaceC0189q interfaceC0189q, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c2106a0.f5906a;
        }
        if ((i10 & 2) != 0) {
            interfaceC2152l = c2106a0.f5907b;
        }
        if ((i10 & 4) != 0) {
            interfaceC0189q = c2106a0.f5908c;
        }
        if ((i10 & 8) != 0) {
            obj2 = c2106a0.f5909d;
        }
        if ((i10 & 16) != 0) {
            th = c2106a0.f5910e;
        }
        Throwable th2 = th;
        InterfaceC0189q interfaceC0189q2 = interfaceC0189q;
        return c2106a0.m7593a(obj, interfaceC2152l, interfaceC0189q2, obj2, th2);
    }

    /* JADX INFO: renamed from: a */
    public final C2106a0 m7593a(Object obj, InterfaceC2152l interfaceC2152l, InterfaceC0189q interfaceC0189q, Object obj2, Throwable th) {
        return new C2106a0(obj, interfaceC2152l, interfaceC0189q, obj2, th);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7594c() {
        return this.f5910e != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m7595d(C2164o c2164o, Throwable th) {
        InterfaceC2152l interfaceC2152l = this.f5907b;
        if (interfaceC2152l != null) {
            c2164o.m7867k(interfaceC2152l, th);
        }
        InterfaceC0189q interfaceC0189q = this.f5908c;
        if (interfaceC0189q != null) {
            c2164o.m7868m(interfaceC0189q, th, this.f5906a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2106a0)) {
            return false;
        }
        C2106a0 c2106a0 = (C2106a0) obj;
        return AbstractC1061t.m3842c(this.f5906a, c2106a0.f5906a) && AbstractC1061t.m3842c(this.f5907b, c2106a0.f5907b) && AbstractC1061t.m3842c(this.f5908c, c2106a0.f5908c) && AbstractC1061t.m3842c(this.f5909d, c2106a0.f5909d) && AbstractC1061t.m3842c(this.f5910e, c2106a0.f5910e);
    }

    public int hashCode() {
        Object obj = this.f5906a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC2152l interfaceC2152l = this.f5907b;
        int iHashCode2 = (iHashCode + (interfaceC2152l == null ? 0 : interfaceC2152l.hashCode())) * 31;
        InterfaceC0189q interfaceC0189q = this.f5908c;
        int iHashCode3 = (iHashCode2 + (interfaceC0189q == null ? 0 : interfaceC0189q.hashCode())) * 31;
        Object obj2 = this.f5909d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5910e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f5906a + ", cancelHandler=" + this.f5907b + ", onCancellation=" + this.f5908c + ", idempotentResume=" + this.f5909d + ", cancelCause=" + this.f5910e + ')';
    }

    public C2106a0(Object obj, InterfaceC2152l interfaceC2152l, InterfaceC0189q interfaceC0189q, Object obj2, Throwable th) {
        this.f5906a = obj;
        this.f5907b = interfaceC2152l;
        this.f5908c = interfaceC0189q;
        this.f5909d = obj2;
        this.f5910e = th;
    }
}
