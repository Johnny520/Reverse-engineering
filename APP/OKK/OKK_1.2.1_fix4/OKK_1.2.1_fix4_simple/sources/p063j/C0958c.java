package p063j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0958c implements Collection, Set {

    /* JADX INFO: renamed from: e */
    public static final int[] f3392e = null;

    /* JADX INFO: renamed from: f */
    public static final Object[] f3393f = null;

    /* JADX INFO: renamed from: g */
    public static Object[] f3394g;

    /* JADX INFO: renamed from: h */
    public static int f3395h;

    /* JADX INFO: renamed from: i */
    public static Object[] f3396i;

    /* JADX INFO: renamed from: j */
    public static int f3397j;

    /* JADX INFO: renamed from: a */
    public int[] f3398a;

    /* JADX INFO: renamed from: b */
    public Object[] f3399b;

    /* JADX INFO: renamed from: c */
    public int f3400c;

    /* JADX INFO: renamed from: d */
    public C0956a f3401d;

    static {
        f3392e = new int[0];
        f3393f = new Object[0];
    }

    /* JADX INFO: renamed from: b */
    public static void m2299b(int[] r7, Object[] r8, int r9) {
        if (r7.length != 8) goto L19;
        monitor-enter(C0958c.class);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (f3397j >= 10) goto L14;
        r8[0] = f3396i;     // Catch: Throwable -> L11
        r8[1] = r7;     // Catch: Throwable -> L11
        int r92 = r9 - 1;     // Catch: Throwable -> L11
    L9:
        if (r92 < 2) goto L13;
        r8[r92] = null;     // Catch: Throwable -> L11
        r92 = r92 - 1;
        goto L9
    L13:
        f3396i = r8;     // Catch: Throwable -> L11
        f3397j++;
    L14:
        monitor-exit(C0958c.class);     // Catch: Throwable -> L11
        return;
    L19:
        if (r7.length == 4) goto L21;
        return;
    L21:
        monitor-enter(C0958c.class);
    L27:
        th = move-exception;
        throw th;
    L23:
        if (f3395h >= 10) goto L30;
        r8[0] = f3394g;     // Catch: Throwable -> L27
        r8[1] = r7;     // Catch: Throwable -> L27
        int r93 = r9 - 1;     // Catch: Throwable -> L27
    L25:
        if (r93 < 2) goto L29;
        r8[r93] = null;     // Catch: Throwable -> L27
        r93 = r93 - 1;
        goto L25
    L29:
        f3394g = r8;     // Catch: Throwable -> L27
        f3395h++;
    L30:
        monitor-exit(C0958c.class);     // Catch: Throwable -> L27
    }

    /* JADX INFO: renamed from: a */
    public final void m2300a(int r6) {
        if (r6 != 8) goto L18;
        monitor-enter(C0958c.class);
        Object[] r4 = f3396i;     // Catch: Throwable -> L11
        if (r4 == null) goto L13;
        this.f3399b = r4;     // Catch: Throwable -> L11
        f3396i = (Object[]) r4[0];     // Catch: Throwable -> L11
        this.f3398a = (int[]) r4[1];     // Catch: Throwable -> L11
        r4[1] = null;     // Catch: Throwable -> L11
        r4[0] = null;     // Catch: Throwable -> L11
        f3397j--;
        monitor-exit(C0958c.class);     // Catch: Throwable -> L11
        return;
    L13:
        monitor-exit(C0958c.class);     // Catch: Throwable -> L11
    L32:
        this.f3398a = new int[r6];
        this.f3399b = new Object[r6];
        return;
    L11:
        th = move-exception;
        throw th;
    L18:
        if (r6 != 4) goto L32;
        monitor-enter(C0958c.class);
        Object[] r42 = f3394g;     // Catch: Throwable -> L26
        if (r42 == null) goto L28;
        this.f3399b = r42;     // Catch: Throwable -> L26
        f3394g = (Object[]) r42[0];     // Catch: Throwable -> L26
        this.f3398a = (int[]) r42[1];     // Catch: Throwable -> L26
        r42[1] = null;     // Catch: Throwable -> L26
        r42[0] = null;     // Catch: Throwable -> L26
        f3395h--;
        monitor-exit(C0958c.class);     // Catch: Throwable -> L26
        return;
    L28:
        monitor-exit(C0958c.class);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        throw th;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object r9) {
        if (r9 != null) goto L5;
        int r1 = m2302d();
        int r2 = 0;
    L6:
        if (r1 < 0) goto L8;
        return false;
    L8:
        int r12 = ~r1;
        int r3 = this.f3400c;
        int[] r4 = this.f3398a;
        if (r3 < r4.length) goto L21;
        int r5 = 8;
        if (r3 < 8) goto L14;
        r5 = (r3 >> 1) + r3;
    L17:
        Object[] r32 = this.f3399b;
        m2300a(r5);
        int[] r52 = this.f3398a;
        if (r52.length <= 0) goto L20;
        System.arraycopy(r4, 0, r52, 0, r4.length);
        System.arraycopy(r32, 0, this.f3399b, 0, r32.length);
    L20:
        m2299b(r4, r32, this.f3400c);
        goto L21
    L14:
        if (r3 >= 4) goto L17;
        r5 = 4;
    L21:
        int r02 = this.f3400c;
        if (r12 >= r02) goto L24;
        int[] r33 = this.f3398a;
        int r42 = r12 + 1;
        System.arraycopy(r33, r12, r33, r42, r02 - r12);
        Object[] r03 = this.f3399b;
        System.arraycopy(r03, r12, r03, r42, this.f3400c - r12);
    L24:
        this.f3398a[r12] = r2;
        this.f3399b[r12] = r9;
        this.f3400c++;
        return true;
    L5:
        int r13 = r9.hashCode();
        r2 = r13;
        r1 = m2301c(r13, r9);
        goto L6
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection r6) {
        int r02 = this.f3400c;
        int r1 = r6.size() + r02;
        int[] r03 = this.f3398a;
        boolean r3 = false;
        if (r03.length >= r1) goto L8;
        Object[] r2 = this.f3399b;
        m2300a(r1);
        int r12 = this.f3400c;
        if (r12 <= 0) goto L7;
        System.arraycopy(r03, 0, this.f3398a, 0, r12);
        System.arraycopy(r2, 0, this.f3399b, 0, this.f3400c);
    L7:
        m2299b(r03, r2, this.f3400c);
    L8:
        Iterator r62 = r6.iterator();
    L10:
        if (r62.hasNext() == false) goto L12;
        r3 = r3 | add(r62.next());
        goto L10
    L12:
        return r3;
    }

    /* JADX INFO: renamed from: c */
    public final int m2301c(int r5, Object r6) {
        int r02 = this.f3400c;
        if (r02 != 0) goto L6;
        return -1;
    L6:
        int r1 = AbstractC0959d.m2304a(r02, r5, this.f3398a);
        if (r1 >= 0) goto L10;
        return r1;
    L10:
        if (r6.equals(this.f3399b[r1]) == false) goto L12;
        return r1;
    L12:
        int r2 = r1 + 1;
    L13:
        if (r2 >= r02) goto L20;
        if (this.f3398a[r2] != r5) goto L20;
        if (r6.equals(this.f3399b[r2]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f3398a[r12] != r5) goto L29;
        if (r6.equals(this.f3399b[r12]) == true) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int r02 = this.f3400c;
        if (r02 == 0) goto L6;
        m2299b(this.f3398a, this.f3399b, r02);
        this.f3398a = f3392e;
        this.f3399b = f3393f;
        this.f3400c = 0;
        return;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object r1) {
        if (indexOf(r1) < 0) goto L5;
        return true;
    L5:
        return false;
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

    /* JADX INFO: renamed from: d */
    public final int m2302d() {
        int r02 = this.f3400c;
        if (r02 != 0) goto L6;
        return -1;
    L6:
        int r1 = AbstractC0959d.m2304a(r02, 0, this.f3398a);
        if (r1 >= 0) goto L10;
        return r1;
    L10:
        if (this.f3399b[r1] != null) goto L12;
        return r1;
    L12:
        int r2 = r1 + 1;
    L13:
        if (r2 >= r02) goto L20;
        if (this.f3398a[r2] != 0) goto L20;
        if (this.f3399b[r2] == null) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f3398a[r12] != 0) goto L29;
        if (this.f3399b[r12] == null) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    /* JADX INFO: renamed from: e */
    public final void m2303e(int r8) {
        Object[] r02 = this.f3399b;
        Object r1 = r02[r8];
        int r12 = this.f3400c;
        if (r12 > 1) goto L5;
        m2299b(this.f3398a, r02, r12);
        this.f3398a = f3392e;
        this.f3399b = f3393f;
        this.f3400c = 0;
        return;
    L5:
        int[] r4 = this.f3398a;
        int r6 = 8;
        if (r4.length > 8) goto L8;
    L17:
        int r13 = r12 - 1;
        this.f3400c = r13;
        if (r8 >= r13) goto L20;
        int r03 = r8 + 1;
        System.arraycopy(r4, r03, r4, r8, r13 - r8);
        Object[] r14 = this.f3399b;
        System.arraycopy(r14, r03, r14, r8, this.f3400c - r8);
    L20:
        this.f3399b[this.f3400c] = null;
        return;
    L8:
        if (r12 >= (r4.length / 3)) goto L17;
        if (r12 <= 8) goto L11;
        r6 = r12 + (r12 >> 1);
    L11:
        m2300a(r6);
        this.f3400c--;
        if (r8 <= 0) goto L14;
        System.arraycopy(r4, 0, this.f3398a, 0, r8);
        System.arraycopy(r02, 0, this.f3399b, 0, r8);
    L14:
        int r15 = this.f3400c;
        if (r8 >= r15) goto L23;
        int r2 = r8 + 1;
        System.arraycopy(r4, r2, this.f3398a, r8, r15 - r8);
        System.arraycopy(r02, r2, this.f3399b, r8, this.f3400c - r8);
        return;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Set) == false) goto L18;
        Set r52 = (Set) r5;
        if (this.f3400c == r52.size()) goto L10;
        return false;
    L10:
        int r1 = 0;
    L20:
        if (r1 >= this.f3400c) goto L17;
        if (r52.contains(this.f3399b[r1]) == false) goto L15;
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
        int[] r02 = this.f3398a;
        int r1 = this.f3400c;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 + r02[r2];
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    public final int indexOf(Object r2) {
        if (r2 != null) goto L5;
        return m2302d();
    L5:
        return m2301c(r2.hashCode(), r2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f3400c > 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f3401d != null) goto L5;
        this.f3401d = new C0956a(1, this);
    L5:
        C0956a r02 = this.f3401d;
        if (r02.f3387b != null) goto L9;
        r02.f3387b = new C0963h(r02, 1);
    L9:
        return r02.f3387b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object r1) {
        int r12 = indexOf(r1);
        if (r12 < 0) goto L6;
        m2303e(r12);
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection r3) {
        Iterator r32 = r3.iterator();
        boolean r02 = false;
    L4:
        if (r32.hasNext() == false) goto L6;
        r02 = r02 | remove(r32.next());
        goto L4
    L6:
        return r02;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection r5) {
        int r02 = this.f3400c - 1;
        boolean r2 = false;
    L3:
        if (r02 < 0) goto L8;
        if (r5.contains(this.f3399b[r02]) == true) goto L7;
        m2303e(r02);
        r2 = true;
    L7:
        r02 = r02 - 1;
        goto L3
    L8:
        return r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3400c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int r02 = this.f3400c;
        Object[] r1 = new Object[r02];
        System.arraycopy(this.f3399b, 0, r1, 0, r02);
        return r1;
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r02 = new StringBuilder(this.f3400c * 14);
        r02.append('{');
        int r1 = 0;
    L8:
        if (r1 >= this.f3400c) goto L16;
        if (r1 <= 0) goto L11;
        r02.append(", ");
    L11:
        Object r2 = this.f3399b[r1];
        if (r2 == this) goto L14;
        r02.append(r2);
    L15:
        r1 = r1 + 1;
        goto L8
    L14:
        r02.append("(this Set)");
        goto L15
    L16:
        r02.append('}');
        return r02.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] r4) {
        if (r4.length >= this.f3400c) goto L5;
        r4 = (Object[]) Array.newInstance(r4.getClass().getComponentType(), this.f3400c);
    L5:
        System.arraycopy(this.f3399b, 0, r4, 0, this.f3400c);
        int r02 = r4.length;
        int r1 = this.f3400c;
        if (r02 <= r1) goto L8;
        r4[r1] = null;
    L8:
        return r4;
    }
}
