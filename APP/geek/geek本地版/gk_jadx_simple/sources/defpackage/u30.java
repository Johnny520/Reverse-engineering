package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u30 {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;
    public int[] a;
    public Object[] b;
    public int c;

    public u30() {
        this.a = ff.k;
        this.b = ff.l;
        this.c = 0;
    }

    public static void c(int[] r7, Object[] r8, int r9) {
        if (r7.length != 8) goto L19;
        monitor-enter(u30.class);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (g >= 10) goto L14;
        r8[0] = f;     // Catch: Throwable -> L11
        r8[1] = r7;     // Catch: Throwable -> L11
        int r72 = (r9 << 1) - 1;     // Catch: Throwable -> L11
    L9:
        if (r72 < 2) goto L13;
        r8[r72] = null;     // Catch: Throwable -> L11
        r72 = r72 - 1;
        goto L9
    L13:
        f = r8;     // Catch: Throwable -> L11
        g++;
    L14:
        monitor-exit(u30.class);     // Catch: Throwable -> L11
        return;
    L19:
        if (r7.length == 4) goto L21;
        return;
    L21:
        monitor-enter(u30.class);
    L27:
        th = move-exception;
        throw th;
    L23:
        if (e >= 10) goto L30;
        r8[0] = d;     // Catch: Throwable -> L27
        r8[1] = r7;     // Catch: Throwable -> L27
        int r73 = (r9 << 1) - 1;     // Catch: Throwable -> L27
    L25:
        if (r73 < 2) goto L29;
        r8[r73] = null;     // Catch: Throwable -> L27
        r73 = r73 - 1;
        goto L25
    L29:
        d = r8;     // Catch: Throwable -> L27
        e++;
    L30:
        monitor-exit(u30.class);     // Catch: Throwable -> L27
    }

    public final void a(int r6) {
        if (r6 != 8) goto L18;
        monitor-enter(u30.class);
        Object[] r4 = f;     // Catch: Throwable -> L11
        if (r4 == null) goto L13;
        this.b = r4;     // Catch: Throwable -> L11
        f = (Object[]) r4[0];     // Catch: Throwable -> L11
        this.a = (int[]) r4[1];     // Catch: Throwable -> L11
        r4[1] = null;     // Catch: Throwable -> L11
        r4[0] = null;     // Catch: Throwable -> L11
        g--;
        monitor-exit(u30.class);     // Catch: Throwable -> L11
        return;
    L13:
        monitor-exit(u30.class);     // Catch: Throwable -> L11
    L32:
        this.a = new int[r6];
        this.b = new Object[r6 << 1];
        return;
    L11:
        th = move-exception;
        throw th;
    L18:
        if (r6 != 4) goto L32;
        monitor-enter(u30.class);
        Object[] r42 = d;     // Catch: Throwable -> L26
        if (r42 == null) goto L28;
        this.b = r42;     // Catch: Throwable -> L26
        d = (Object[]) r42[0];     // Catch: Throwable -> L26
        this.a = (int[]) r42[1];     // Catch: Throwable -> L26
        r42[1] = null;     // Catch: Throwable -> L26
        r42[0] = null;     // Catch: Throwable -> L26
        e--;
        monitor-exit(u30.class);     // Catch: Throwable -> L26
        return;
    L28:
        monitor-exit(u30.class);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        throw th;
    }

    public final void b(int r6) {
        int r0 = this.c;
        int[] r1 = this.a;
        if (r1.length >= r6) goto L9;
        Object[] r2 = this.b;
        a(r6);
        if (this.c <= 0) goto L7;
        System.arraycopy(r1, 0, this.a, 0, r0);
        System.arraycopy(r2, 0, this.b, 0, r0 << 1);
    L7:
        c(r1, r2, r0);
    L9:
        if (this.c != r0) goto L12;
        return;
    L12:
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        int r0 = this.c;
        if (r0 <= 0) goto L6;
        int[] r1 = this.a;
        Object[] r2 = this.b;
        this.a = ff.k;
        this.b = ff.l;
        this.c = 0;
        c(r1, r2, r0);
    L6:
        if (this.c > 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object r1) {
        if (e(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean containsValue(Object r1) {
        if (g(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final int d(int r6, Object r7) {
        int r0 = this.c;
        if (r0 != 0) goto L33;
        return -1;
    L33:
        int r1 = ff.c(r0, r6, this.a);     // Catch: ArrayIndexOutOfBoundsException -> L31
        if (r1 >= 0) goto L11;
    L12:
        return r1;
    L11:
        if (r7.equals(this.b[r1 << 1]) == true) goto L12;
        int r2 = r1 + 1;
    L14:
        if (r2 >= r0) goto L21;
        if (this.a[r2] != r6) goto L21;
        if (r7.equals(this.b[r2 << 1]) == true) goto L19;
        r2 = r2 + 1;
        goto L14
    L19:
        return r2;
    L21:
        int r12 = r1 - 1;
    L22:
        if (r12 < 0) goto L30;
        if (this.a[r12] != r6) goto L30;
        if (r7.equals(this.b[r12 << 1]) == true) goto L27;
        r12 = r12 - 1;
        goto L22
    L27:
        return r12;
    L30:
        return ~r2;
    L32:
        throw new ConcurrentModificationException();
    }

    public final int e(Object r2) {
        if (r2 != null) goto L6;
        return f();
    L6:
        return d(r2.hashCode(), r2);
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof u30) == false) goto L26;
        u30 r72 = (u30) r7;
        if (this.c == r72.c) goto L10;
        return false;
    L10:
        int r1 = 0;
    L48:
        if (r1 >= this.c) goto L23;
        Object r3 = h(r1);     // Catch: Throwable -> L24
        Object r4 = j(r1);     // Catch: Throwable -> L24
        Object r5 = r72.getOrDefault(r3, null);     // Catch: Throwable -> L24
        if (r4 != null) goto L20;
        if (r5 != null) goto L18;
        if (r72.containsKey(r3) == false) goto L18;
    L22:
        r1 = r1 + 1;
    L18:
        return false;
    L20:
        if (r4.equals(r5) == true) goto L22;
        return false;
    L23:
        return true;
    L24:
        return false;
    L26:
        if ((r7 instanceof Map) == false) goto L44;
        Map r73 = (Map) r7;
        if (this.c == r73.size()) goto L30;
        return false;
    L30:
        int r12 = 0;
    L46:
        if (r12 >= this.c) goto L43;
        Object r32 = h(r12);     // Catch: Throwable -> L45
        Object r42 = j(r12);     // Catch: Throwable -> L45
        Object r52 = r73.get(r32);     // Catch: Throwable -> L45
        if (r42 != null) goto L40;
        if (r52 != null) goto L38;
        if (r73.containsKey(r32) == false) goto L38;
    L42:
        r12 = r12 + 1;
    L38:
        return false;
    L40:
        if (r42.equals(r52) == true) goto L42;
        return false;
    L43:
        return true;
    L44:
        return false;
    }

    public final int f() {
        int r0 = this.c;
        if (r0 != 0) goto L33;
        return -1;
    L33:
        int r1 = ff.c(r0, 0, this.a);     // Catch: ArrayIndexOutOfBoundsException -> L31
        if (r1 >= 0) goto L11;
    L12:
        return r1;
    L11:
        if (this.b[r1 << 1] == null) goto L12;
        int r2 = r1 + 1;
    L14:
        if (r2 >= r0) goto L21;
        if (this.a[r2] != 0) goto L21;
        if (this.b[r2 << 1] == null) goto L19;
        r2 = r2 + 1;
        goto L14
    L19:
        return r2;
    L21:
        int r12 = r1 - 1;
    L22:
        if (r12 < 0) goto L30;
        if (this.a[r12] != 0) goto L30;
        if (this.b[r12 << 1] == null) goto L27;
        r12 = r12 - 1;
        goto L22
    L27:
        return r12;
    L30:
        return ~r2;
    L32:
        throw new ConcurrentModificationException();
    }

    public final int g(Object r6) {
        int r0 = this.c * 2;
        Object[] r1 = this.b;
        if (r6 != null) goto L11;
        int r62 = 1;
    L5:
        if (r62 >= r0) goto L18;
        if (r1[r62] == null) goto L9;
        r62 = r62 + 2;
        goto L5
    L9:
        return r62 >> 1;
    L18:
        return -1;
    L11:
        int r3 = 1;
    L12:
        if (r3 >= r0) goto L24;
        if (r6.equals(r1[r3]) == true) goto L16;
        r3 = r3 + 2;
        goto L12
    L16:
        return r3 >> 1;
    L24:
        return -1;
    }

    public final Object get(Object r2) {
        return getOrDefault(r2, null);
    }

    public final Object getOrDefault(Object r1, Object r2) {
        int r12 = e(r1);
        if (r12 >= 0) goto L5;
        return r2;
    L5:
        return this.b[(r12 << 1) + 1];
    }

    public final Object h(int r2) {
        return this.b[r2 << 1];
    }

    public final int hashCode() {
        int[] r0 = this.a;
        Object[] r1 = this.b;
        int r2 = this.c;
        int r4 = 1;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r5 >= r2) goto L9;
        Object r7 = r1[r4];
        int r8 = r0[r5];
        if (r7 != null) goto L7;
        int r72 = 0;
    L8:
        r6 = r6 + (r72 ^ r8);
        r5 = r5 + 1;
        r4 = r4 + 2;
        goto L3
    L7:
        r72 = r7.hashCode();
        goto L8
    L9:
        return r6;
    }

    public final Object i(int r11) {
        Object[] r0 = this.b;
        int r1 = r11 << 1;
        Object r2 = r0[r1 + 1];
        int r3 = this.c;
        int r4 = 0;
        if (r3 > 1) goto L5;
        c(this.a, r0, r3);
        this.a = ff.k;
        this.b = ff.l;
    L24:
        if (r3 != this.c) goto L28;
        this.c = r4;
        return r2;
    L28:
        throw new ConcurrentModificationException();
    L5:
        int r6 = r3 - 1;
        int[] r7 = this.a;
        int r9 = 8;
        if (r7.length > 8) goto L8;
    L19:
        if (r11 >= r6) goto L21;
        int r02 = r11 + 1;
        int r42 = r6 - r11;
        System.arraycopy(r7, r02, r7, r11, r42);
        Object[] r112 = this.b;
        System.arraycopy(r112, r02 << 1, r112, r1, r42 << 1);
    L21:
        Object[] r113 = this.b;
        int r03 = r6 << 1;
        r113[r03] = null;
        r113[r03 + 1] = null;
    L22:
        r4 = r6;
        goto L24
    L8:
        if (r3 >= (r7.length / 3)) goto L19;
        if (r3 <= 8) goto L11;
        r9 = r3 + (r3 >> 1);
    L11:
        a(r9);
        if (r3 != this.c) goto L18;
        if (r11 <= 0) goto L15;
        System.arraycopy(r7, 0, this.a, 0, r11);
        System.arraycopy(r0, 0, this.b, 0, r1);
    L15:
        if (r11 >= r6) goto L22;
        int r43 = r11 + 1;
        int r92 = r6 - r11;
        System.arraycopy(r7, r43, this.a, r11, r92);
        System.arraycopy(r0, r43 << 1, this.b, r1, r92 << 1);
        goto L22
    L18:
        throw new ConcurrentModificationException();
    }

    public final boolean isEmpty() {
        if (this.c > 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final Object j(int r2) {
        return this.b[(r2 << 1) + 1];
    }

    public final Object put(Object r10, Object r11) {
        int r0 = this.c;
        if (r10 != null) goto L5;
        int r2 = f();
        int r3 = 0;
    L6:
        if (r2 < 0) goto L9;
        int r102 = (r2 << 1) + 1;
        Object[] r02 = this.b;
        Object r1 = r02[r102];
        r02[r102] = r11;
        return r1;
    L9:
        int r22 = ~r2;
        int[] r4 = this.a;
        if (r0 < r4.length) goto L26;
        int r5 = 8;
        if (r0 < 8) goto L15;
        r5 = (r0 >> 1) + r0;
    L18:
        Object[] r6 = this.b;
        a(r5);
        if (r0 != this.c) goto L25;
        int[] r52 = this.a;
        if (r52.length <= 0) goto L23;
        System.arraycopy(r4, 0, r52, 0, r4.length);
        System.arraycopy(r6, 0, this.b, 0, r6.length);
    L23:
        c(r4, r6, r0);
        goto L26
    L25:
        throw new ConcurrentModificationException();
    L15:
        if (r0 >= 4) goto L18;
        r5 = 4;
    L26:
        if (r22 >= r0) goto L28;
        int[] r12 = this.a;
        int r42 = r22 + 1;
        System.arraycopy(r12, r22, r12, r42, r0 - r22);
        Object[] r13 = this.b;
        System.arraycopy(r13, r22 << 1, r13, r42 << 1, (this.c - r22) << 1);
    L28:
        int r14 = this.c;
        if (r0 != r14) goto L35;
        int[] r03 = this.a;
        if (r22 >= r03.length) goto L35;
        r03[r22] = r3;
        Object[] r04 = this.b;
        int r23 = r22 << 1;
        r04[r23] = r10;
        r04[r23 + 1] = r11;
        this.c = r14 + 1;
        return null;
    L35:
        throw new ConcurrentModificationException();
    L5:
        int r24 = r10.hashCode();
        r3 = r24;
        r2 = d(r24, r10);
        goto L6
    }

    public final Object putIfAbsent(Object r2, Object r3) {
        Object r0 = getOrDefault(r2, null);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return put(r2, r3);
    }

    public final Object remove(Object r1) {
        int r12 = e(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return i(r12);
    }

    public final Object replace(Object r3, Object r4) {
        int r32 = e(r3);
        if (r32 < 0) goto L6;
        int r33 = (r32 << 1) + 1;
        Object[] r0 = this.b;
        Object r1 = r0[r33];
        r0[r33] = r4;
        return r1;
    L6:
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r0 = new StringBuilder(this.c * 28);
        r0.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.c) goto L20;
        if (r1 <= 0) goto L11;
        r0.append(", ");
    L11:
        Object r2 = h(r1);
        if (r2 == this) goto L14;
        r0.append(r2);
    L15:
        r0.append('=');
        Object r22 = j(r1);
        if (r22 == this) goto L18;
        r0.append(r22);
    L19:
        r1 = r1 + 1;
        goto L8
    L18:
        r0.append("(this Map)");
        goto L19
    L14:
        r0.append("(this Map)");
        goto L15
    L20:
        r0.append('}');
        return r0.toString();
    }

    public final boolean remove(Object r2, Object r3) {
        int r22 = e(r2);
        if (r22 < 0) goto L11;
        Object r0 = j(r22);
        if (r3 == r0) goto L9;
        if (r3 != null) goto L8;
        return false;
    L8:
        if (r3.equals(r0) == true) goto L9;
        return false;
    L9:
        i(r22);
        return true;
    L11:
        return false;
    }

    public final boolean replace(Object r3, Object r4, Object r5) {
        int r32 = e(r3);
        if (r32 < 0) goto L11;
        Object r0 = j(r32);
        if (r0 == r4) goto L9;
        if (r4 != null) goto L8;
        return false;
    L8:
        if (r4.equals(r0) == true) goto L9;
        return false;
    L9:
        int r33 = (r32 << 1) + 1;
        Object[] r02 = this.b;
        Object r1 = r02[r33];
        r02[r33] = r5;
        return true;
    L11:
        return false;
    }
}
