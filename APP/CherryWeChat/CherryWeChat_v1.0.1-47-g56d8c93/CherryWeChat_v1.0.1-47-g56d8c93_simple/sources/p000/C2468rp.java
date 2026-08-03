package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: rp */
/* JADX INFO: loaded from: classes.dex */
public class C2468rp implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final long f8689a;

    /* JADX INFO: renamed from: b */
    public final long f8690b;

    /* JADX INFO: renamed from: c */
    public final long f8691c;

    public C2468rp(long r8, long r10, long r12) {
        if (r12 == 0) goto L48;
        if (r12 == Long.MIN_VALUE) goto L46;
        this.f8689a = r8;
        if (r12 > 0) goto L9;
        if (r12 >= 0) goto L44;
        if (r8 <= r10) goto L41;
        long r2 = -r12;
        long r82 = r8 % r2;
        if (r82 >= 0) goto L32;
        r82 = r82 + r2;
    L32:
        long r4 = r10 % r2;
        if (r4 >= 0) goto L36;
        r4 = r4 + r2;
    L36:
        long r83 = (r82 - r4) % r2;
        if (r83 >= 0) goto L40;
        r83 = r83 + r2;
    L40:
        r10 = r10 + r83;
    L41:
        this.f8690b = r10;
        this.f8691c = r12;
        return;
    L44:
        throw new IllegalArgumentException("Step is zero.");
    L9:
        if (r8 >= r10) goto L41;
        long r22 = r10 % r12;
        if (r22 >= 0) goto L15;
        r22 = r22 + r12;
    L15:
        long r84 = r8 % r12;
        if (r84 >= 0) goto L19;
        r84 = r84 + r12;
    L19:
        long r23 = (r22 - r84) % r12;
        if (r23 >= 0) goto L23;
        r23 = r23 + r12;
    L23:
        r10 = r10 - r23;
        goto L41
    L46:
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    L48:
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object r5) {
        if ((r5 instanceof C2468rp) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C2468rp r52 = (C2468rp) r5;
        long r0 = r52.f8689a;
        if (this.f8689a == r0) goto L11;
        return false;
    L11:
        if (this.f8690b == r52.f8690b) goto L13;
        return false;
    L13:
        if (this.f8691c != r52.f8691c) goto L21;
        return true;
    L21:
        return false;
    L7:
        if (((C2468rp) r5).isEmpty() == false) goto L8;
        return true;
    }

    public int hashCode() {
        if (isEmpty() == false) goto L6;
        return -1;
    L6:
        long r0 = 31;
        long r2 = this.f8689a;
        long r5 = this.f8690b;
        long r22 = (((r2 ^ (r2 >>> 32)) * r0) + (r5 ^ (r5 >>> 32))) * r0;
        long r02 = this.f8691c;
        return (int) (r22 + (r02 ^ (r02 >>> 32)));
    }

    public boolean isEmpty() {
        long r0 = this.f8691c;
        long r3 = this.f8690b;
        long r5 = this.f8689a;
        if (r0 <= 0) goto L9;
        if (r5 <= r3) goto L7;
        return true;
    L7:
        return false;
    L9:
        if (r5 >= r3) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        long r3 = this.f8690b;
        long r5 = this.f8691c;
        return new C2511sp(this.f8689a, r3, r5);
    }

    public String toString() {
        long r2 = this.f8691c;
        long r4 = this.f8690b;
        long r6 = this.f8689a;
        if (r2 <= 0) goto L7;
        StringBuilder r0 = new StringBuilder();
        r0.append(r6);
        r0.append("..");
        r0.append(r4);
        r0.append(" step ");
        r0.append(r2);
    L6:
        return r0.toString();
    L7:
        r0 = new StringBuilder();
        r0.append(r6);
        r0.append(" downTo ");
        r0.append(r4);
        r0.append(" step ");
        r0.append(-r2);
        goto L6
    }
}
