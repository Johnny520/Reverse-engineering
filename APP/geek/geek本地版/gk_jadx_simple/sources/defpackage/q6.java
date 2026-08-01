package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class q6 implements Collection, Set {
    public static final int[] e = null;
    public static final Object[] f = null;
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;
    public int[] a;
    public Object[] b;
    public int c;
    public m6 d;

    static {
        e = new int[0];
        f = new Object[0];
    }

    public q6() {
        this.a = e;
        this.b = f;
        this.c = 0;
    }

    public static void b(int[] r7, Object[] r8, int r9) {
        if (r7.length != 8) goto L19;
        monitor-enter(q6.class);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (j >= 10) goto L14;
        r8[0] = i;     // Catch: Throwable -> L11
        r8[1] = r7;     // Catch: Throwable -> L11
        int r92 = r9 - 1;     // Catch: Throwable -> L11
    L9:
        if (r92 < 2) goto L13;
        r8[r92] = null;     // Catch: Throwable -> L11
        r92 = r92 - 1;
        goto L9
    L13:
        i = r8;     // Catch: Throwable -> L11
        j++;
    L14:
        monitor-exit(q6.class);     // Catch: Throwable -> L11
        return;
    L19:
        if (r7.length == 4) goto L21;
        return;
    L21:
        monitor-enter(q6.class);
    L27:
        th = move-exception;
        throw th;
    L23:
        if (h >= 10) goto L30;
        r8[0] = g;     // Catch: Throwable -> L27
        r8[1] = r7;     // Catch: Throwable -> L27
        int r93 = r9 - 1;     // Catch: Throwable -> L27
    L25:
        if (r93 < 2) goto L29;
        r8[r93] = null;     // Catch: Throwable -> L27
        r93 = r93 - 1;
        goto L25
    L29:
        g = r8;     // Catch: Throwable -> L27
        h++;
    L30:
        monitor-exit(q6.class);     // Catch: Throwable -> L27
    }

    public final void a(int r6) {
        if (r6 != 8) goto L18;
        monitor-enter(q6.class);
        Object[] r4 = i;     // Catch: Throwable -> L11
        if (r4 == null) goto L13;
        this.b = r4;     // Catch: Throwable -> L11
        i = (Object[]) r4[0];     // Catch: Throwable -> L11
        this.a = (int[]) r4[1];     // Catch: Throwable -> L11
        r4[1] = null;     // Catch: Throwable -> L11
        r4[0] = null;     // Catch: Throwable -> L11
        j--;
        monitor-exit(q6.class);     // Catch: Throwable -> L11
        return;
    L13:
        monitor-exit(q6.class);     // Catch: Throwable -> L11
    L32:
        this.a = new int[r6];
        this.b = new Object[r6];
        return;
    L11:
        th = move-exception;
        throw th;
    L18:
        if (r6 != 4) goto L32;
        monitor-enter(q6.class);
        Object[] r42 = g;     // Catch: Throwable -> L26
        if (r42 == null) goto L28;
        this.b = r42;     // Catch: Throwable -> L26
        g = (Object[]) r42[0];     // Catch: Throwable -> L26
        this.a = (int[]) r42[1];     // Catch: Throwable -> L26
        r42[1] = null;     // Catch: Throwable -> L26
        r42[0] = null;     // Catch: Throwable -> L26
        h--;
        monitor-exit(q6.class);     // Catch: Throwable -> L26
        return;
    L28:
        monitor-exit(q6.class);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object r9) {
        if (r9 != null) goto L5;
        int r1 = d();
        int r2 = 0;
    L6:
        if (r1 < 0) goto L8;
        return false;
    L8:
        int r12 = ~r1;
        int r3 = this.c;
        int[] r4 = this.a;
        if (r3 < r4.length) goto L21;
        int r5 = 8;
        if (r3 < 8) goto L14;
        r5 = (r3 >> 1) + r3;
    L17:
        Object[] r32 = this.b;
        a(r5);
        int[] r52 = this.a;
        if (r52.length <= 0) goto L20;
        System.arraycopy(r4, 0, r52, 0, r4.length);
        System.arraycopy(r32, 0, this.b, 0, r32.length);
    L20:
        b(r4, r32, this.c);
        goto L21
    L14:
        if (r3 >= 4) goto L17;
        r5 = 4;
    L21:
        int r0 = this.c;
        if (r12 >= r0) goto L24;
        int[] r33 = this.a;
        int r42 = r12 + 1;
        System.arraycopy(r33, r12, r33, r42, r0 - r12);
        Object[] r02 = this.b;
        System.arraycopy(r02, r12, r02, r42, this.c - r12);
    L24:
        this.a[r12] = r2;
        this.b[r12] = r9;
        this.c++;
        return true;
    L5:
        int r13 = r9.hashCode();
        r2 = r13;
        r1 = c(r13, r9);
        goto L6
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection r6) {
        int r0 = this.c;
        int r1 = r6.size() + r0;
        int[] r02 = this.a;
        boolean r3 = false;
        if (r02.length >= r1) goto L8;
        Object[] r2 = this.b;
        a(r1);
        int r12 = this.c;
        if (r12 <= 0) goto L7;
        System.arraycopy(r02, 0, this.a, 0, r12);
        System.arraycopy(r2, 0, this.b, 0, this.c);
    L7:
        b(r02, r2, this.c);
    L8:
        Iterator r62 = r6.iterator();
    L10:
        if (r62.hasNext() == false) goto L12;
        r3 = r3 | add(r62.next());
        goto L10
    L12:
        return r3;
    }

    public final int c(int r5, Object r6) {
        int r0 = this.c;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = ff.c(r0, r5, this.a);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (r6.equals(this.b[r1]) == true) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.a[r2] != r5) goto L20;
        if (r6.equals(this.b[r2]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.a[r12] != r5) goto L29;
        if (r6.equals(this.b[r12]) == true) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int r0 = this.c;
        if (r0 == 0) goto L6;
        b(this.a, this.b, r0);
        this.a = e;
        this.b = f;
        this.c = 0;
        return;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object r2) {
        if (r2 != null) goto L4;
        int r22 = d();
    L5:
        if (r22 < 0) goto L8;
        return true;
    L8:
        return false;
    L4:
        r22 = c(r2.hashCode(), r2);
        goto L5
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (contains(r22.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    public final int d() {
        int r0 = this.c;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = ff.c(r0, 0, this.a);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (this.b[r1] == null) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.a[r2] != 0) goto L20;
        if (this.b[r2] == null) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.a[r12] != 0) goto L29;
        if (this.b[r12] == null) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    public final void e(int r8) {
        Object[] r0 = this.b;
        Object r1 = r0[r8];
        int r12 = this.c;
        if (r12 > 1) goto L6;
        b(this.a, r0, r12);
        this.a = e;
        this.b = f;
        this.c = 0;
        return;
    L6:
        int[] r4 = this.a;
        int r6 = 8;
        if (r4.length > 8) goto L9;
    L19:
        int r13 = r12 - 1;
        this.c = r13;
        if (r8 >= r13) goto L22;
        int r02 = r8 + 1;
        System.arraycopy(r4, r02, r4, r8, r13 - r8);
        Object[] r14 = this.b;
        System.arraycopy(r14, r02, r14, r8, this.c - r8);
    L22:
        this.b[this.c] = null;
        return;
    L9:
        if (r12 >= (r4.length / 3)) goto L19;
        if (r12 <= 8) goto L12;
        r6 = r12 + (r12 >> 1);
    L12:
        a(r6);
        this.c--;
        if (r8 <= 0) goto L15;
        System.arraycopy(r4, 0, this.a, 0, r8);
        System.arraycopy(r0, 0, this.b, 0, r8);
    L15:
        int r15 = this.c;
        if (r8 >= r15) goto L24;
        int r2 = r8 + 1;
        System.arraycopy(r4, r2, this.a, r8, r15 - r8);
        System.arraycopy(r0, r2, this.b, r8, this.c - r8);
        return;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Set) == false) goto L18;
        Set r52 = (Set) r5;
        if (this.c == r52.size()) goto L10;
        return false;
    L10:
        int r1 = 0;
    L20:
        if (r1 >= this.c) goto L17;
        if (r52.contains(this.b[r1]) == false) goto L15;
        r1 = r1 + 1;
        goto L20
    L15:
        return false;
    L17:
        return true;
    L18:
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] r0 = this.a;
        int r1 = this.c;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 + r0[r2];
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.c > 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.d != null) goto L5;
        this.d = new m6(1, this);
    L5:
        m6 r0 = this.d;
        if (r0.b != null) goto L9;
        r0.b = new ts(r0, 1);
    L9:
        return r0.b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object r2) {
        if (r2 != null) goto L4;
        int r22 = d();
    L5:
        if (r22 < 0) goto L8;
        e(r22);
        return true;
    L8:
        return false;
    L4:
        r22 = c(r2.hashCode(), r2);
        goto L5
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r3) {
        Iterator r32 = r3.iterator();
        boolean r0 = false;
    L4:
        if (r32.hasNext() == false) goto L6;
        r0 = r0 | remove(r32.next());
        goto L4
    L6:
        return r0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r5) {
        int r0 = this.c - 1;
        boolean r2 = false;
    L3:
        if (r0 < 0) goto L8;
        if (r5.contains(this.b[r0]) == true) goto L7;
        e(r0);
        r2 = true;
    L7:
        r0 = r0 - 1;
        goto L3
    L8:
        return r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int r0 = this.c;
        Object[] r1 = new Object[r0];
        System.arraycopy(this.b, 0, r1, 0, r0);
        return r1;
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r0 = new StringBuilder(this.c * 14);
        r0.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.c) goto L16;
        if (r1 <= 0) goto L11;
        r0.append(", ");
    L11:
        Object r2 = this.b[r1];
        if (r2 == this) goto L14;
        r0.append(r2);
    L15:
        r1 = r1 + 1;
        goto L8
    L14:
        r0.append("(this Set)");
        goto L15
    L16:
        r0.append('}');
        return r0.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] r4) {
        if (r4.length >= this.c) goto L5;
        r4 = (Object[]) Array.newInstance(r4.getClass().getComponentType(), this.c);
    L5:
        System.arraycopy(this.b, 0, r4, 0, this.c);
        int r0 = r4.length;
        int r1 = this.c;
        if (r0 <= r1) goto L8;
        r4[r1] = null;
    L8:
        return r4;
    }
}
