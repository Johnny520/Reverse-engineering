package p036T0;

import java.util.Iterator;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public class C0338a implements Iterable, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final int f657a;

    /* JADX INFO: renamed from: b */
    public final int f658b;

    /* JADX INFO: renamed from: c */
    public final int f659c;

    public C0338a(int r3, int r4, int r5) {
        if (r5 == 0) goto L46;
        if (r5 == Integer.MIN_VALUE) goto L44;
        this.f657a = r3;
        if (r5 <= 0) goto L23;
        if (r3 >= r4) goto L39;
        int r02 = r4 % r5;
        if (r02 >= 0) goto L14;
        r02 = r02 + r5;
    L14:
        int r32 = r3 % r5;
        if (r32 >= 0) goto L18;
        r32 = r32 + r5;
    L18:
        int r03 = (r02 - r32) % r5;
        if (r03 >= 0) goto L22;
        r03 = r03 + r5;
    L22:
        r4 = r4 - r03;
    L39:
        this.f658b = r4;
        this.f659c = r5;
        return;
    L23:
        if (r5 >= 0) goto L42;
        if (r3 <= r4) goto L39;
        int r04 = -r5;
        int r33 = r3 % r04;
        if (r33 >= 0) goto L30;
        r33 = r33 + r04;
    L30:
        int r1 = r4 % r04;
        if (r1 >= 0) goto L34;
        r1 = r1 + r04;
    L34:
        int r34 = (r33 - r1) % r04;
        if (r34 >= 0) goto L38;
        r34 = r34 + r04;
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
        if ((r3 instanceof C0338a) == true) goto L5;
    L15:
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C0338a r32 = (C0338a) r3;
        int r02 = r32.f657a;
        if (this.f657a != r02) goto L15;
        if (this.f658b != r32.f658b) goto L15;
        if (this.f659c != r32.f659c) goto L15;
    L14:
        return true;
    L7:
        if (((C0338a) r3).isEmpty() == true) goto L14;
        goto L8
    }

    public int hashCode() {
        if (isEmpty() == false) goto L6;
        return -1;
    L6:
        return (((this.f657a * 31) + this.f658b) * 31) + this.f659c;
    }

    public boolean isEmpty() {
        int r02 = this.f659c;
        int r3 = this.f658b;
        int r4 = this.f657a;
        if (r02 <= 0) goto L6;
        if (r4 > r3) goto L9;
        return false;
    L9:
        return true;
    L6:
        if (r4 < r3) goto L9;
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int r1 = this.f659c;
        return new C0339b(this.f657a, this.f658b, r1);
    }

    public String toString() {
        int r1 = this.f658b;
        int r2 = this.f657a;
        int r3 = this.f659c;
        if (r3 <= 0) goto L6;
        StringBuilder r4 = new StringBuilder();
        r4.append(r2);
        r4.append("..");
        r4.append(r1);
        r4.append(" step ");
        r4.append(r3);
    L7:
        return r4.toString();
    L6:
        r4 = new StringBuilder();
        r4.append(r2);
        r4.append(" downTo ");
        r4.append(r1);
        r4.append(" step ");
        r4.append(-r3);
        goto L7
    }
}
