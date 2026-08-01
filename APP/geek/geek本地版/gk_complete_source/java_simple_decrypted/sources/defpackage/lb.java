package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class lb {
    public final Object a;
    public final ah b;
    public final sm c;
    public final Object d;
    public final Throwable e;

    public lb(Object r1, ah r2, sm r3, Object r4, Throwable r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    public static lb a(lb r6, ah r7, CancellationException r8, int r9) {
        Object r1 = r6.a;
        if ((r9 & 2) == 0) goto L5;
        r7 = r6.b;
    L5:
        ah r2 = r7;
        sm r3 = r6.c;
        Object r4 = r6.d;
        Throwable r82 = r8;
        if ((r9 & 16) == 0) goto L9;
        r82 = r6.e;
    L9:
        return new lb(r1, r2, r3, r4, r82);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof lb) == true) goto L8;
        return false;
    L8:
        lb r52 = (lb) r5;
        if (ip.i(this.a, r52.a) == true) goto L12;
        return false;
    L12:
        if (ip.i(this.b, r52.b) == true) goto L15;
        return false;
    L15:
        if (ip.i(this.c, r52.c) == true) goto L18;
        return false;
    L18:
        if (ip.i(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (ip.i(this.e, r52.e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        Object r1 = this.a;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r13 = r12 * 31;
        ah r2 = this.b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r14 = (r13 + r22) * 31;
        sm r23 = this.c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r15 = (r14 + r24) * 31;
        Object r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r16 = (r15 + r26) * 31;
        Throwable r27 = this.e;
        if (r27 == null) goto L23;
        r0 = r27.hashCode();
    L23:
        return r16 + r0;
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ lb(Object r9, ah r10, CancellationException r11, int r12) {
        if ((r12 & 2) == 0) goto L5;
        ah r4 = null;
    L7:
        if ((r12 & 16) == 0) goto L9;
        CancellationException r7 = null;
    L10:
        this(r9, r4, null, null, r7);
        return;
    L9:
        r7 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }
}
