package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: Dl */
/* JADX INFO: loaded from: classes.dex */
public class C0157Dl implements Iterable, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final int f432a;

    /* JADX INFO: renamed from: b */
    public final int f433b;

    /* JADX INFO: renamed from: c */
    public final int f434c;

    public C0157Dl(int r3, int r4, int r5) {
        if (r5 == 0) goto L46;
        if (r5 == Integer.MIN_VALUE) goto L44;
        this.f432a = r3;
        if (r5 <= 0) goto L23;
        if (r3 >= r4) goto L39;
        int r0 = r4 % r5;
        if (r0 >= 0) goto L14;
        r0 = r0 + r5;
    L14:
        int r32 = r3 % r5;
        if (r32 >= 0) goto L18;
        r32 = r32 + r5;
    L18:
        int r02 = (r0 - r32) % r5;
        if (r02 >= 0) goto L22;
        r02 = r02 + r5;
    L22:
        r4 = r4 - r02;
    L39:
        this.f433b = r4;
        this.f434c = r5;
        return;
    L23:
        if (r5 >= 0) goto L42;
        if (r3 <= r4) goto L39;
        int r03 = -r5;
        int r33 = r3 % r03;
        if (r33 >= 0) goto L30;
        r33 = r33 + r03;
    L30:
        int r1 = r4 % r03;
        if (r1 >= 0) goto L34;
        r1 = r1 + r03;
    L34:
        int r34 = (r33 - r1) % r03;
        if (r34 >= 0) goto L38;
        r34 = r34 + r03;
    L38:
        r4 = r4 + r34;
        goto L39
    L42:
        throw new IllegalArgumentException("Step is zero.");
    L44:
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    L46:
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof C0157Dl) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C0157Dl r32 = (C0157Dl) r3;
        int r0 = r32.f432a;
        if (this.f432a == r0) goto L11;
        return false;
    L11:
        if (this.f433b == r32.f433b) goto L13;
        return false;
    L13:
        if (this.f434c != r32.f434c) goto L21;
        return true;
    L21:
        return false;
    L7:
        if (((C0157Dl) r3).isEmpty() == false) goto L8;
        return true;
    }

    public int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (((this.f432a * 31) + this.f433b) * 31) + this.f434c;
    }

    public boolean isEmpty() {
        int r0 = this.f434c;
        int r3 = this.f433b;
        int r4 = this.f432a;
        if (r0 <= 0) goto L7;
        if (r4 <= r3) goto L6;
        return true;
    L6:
        return false;
    L7:
        if (r4 >= r3) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int r1 = this.f433b;
        int r2 = this.f434c;
        return new C0200El(this.f432a, r1, r2);
    }

    public String toString() {
        int r1 = this.f433b;
        int r2 = this.f432a;
        int r3 = this.f434c;
        if (r3 <= 0) goto L7;
        StringBuilder r4 = new StringBuilder();
        r4.append(r2);
        r4.append("..");
        r4.append(r1);
        r4.append(" step ");
        r4.append(r3);
    L6:
        return r4.toString();
    L7:
        r4 = new StringBuilder();
        r4.append(r2);
        r4.append(" downTo ");
        r4.append(r1);
        r4.append(" step ");
        r4.append(-r3);
        goto L6
    }
}
