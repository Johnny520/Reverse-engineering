package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: sy */
/* JADX INFO: loaded from: classes.dex */
public class C2520sy {

    /* JADX INFO: renamed from: a */
    public int[] f8816a;

    /* JADX INFO: renamed from: b */
    public Object[] f8817b;

    /* JADX INFO: renamed from: c */
    public int f8818c;

    public C2520sy(int r2) {
        if (r2 != 0) goto L5;
        int[] r0 = AbstractC0714Qj.f2294a;
    L6:
        this.f8816a = r0;
        if (r2 != 0) goto L9;
        Object[] r22 = AbstractC0714Qj.f2295b;
    L10:
        this.f8817b = r22;
        return;
    L9:
        r22 = new Object[r2 << 1];
        goto L10
    L5:
        r0 = new int[r2];
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final int m4997a(Object r6) {
        int r0 = this.f8818c * 2;
        Object[] r1 = this.f8817b;
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

    /* JADX INFO: renamed from: b */
    public final void m4998b(int r4) {
        int r0 = this.f8818c;
        int[] r1 = this.f8816a;
        if (r1.length >= r4) goto L6;
        this.f8816a = Arrays.copyOf(r1, r4);
        this.f8817b = Arrays.copyOf(this.f8817b, r4 * 2);
    L6:
        if (this.f8818c != r0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: c */
    public final int m4999c(int r6, Object r7) {
        int r0 = this.f8818c;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = AbstractC0714Qj.m1482d(r0, r6, this.f8816a);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (AbstractC0585Nj.m1134a(r7, this.f8817b[r1 << 1]) == true) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.f8816a[r2] != r6) goto L20;
        if (AbstractC0585Nj.m1134a(r7, this.f8817b[r2 << 1]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f8816a[r12] != r6) goto L29;
        if (AbstractC0585Nj.m1134a(r7, this.f8817b[r12 << 1]) == true) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    public void clear() {
        if (this.f8818c <= 0) goto L6;
        this.f8816a = AbstractC0714Qj.f2294a;
        this.f8817b = AbstractC0714Qj.f2295b;
        this.f8818c = 0;
    L6:
        if (this.f8818c > 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object r1) {
        if (m5000d(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean containsValue(Object r1) {
        if (m4997a(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m5000d(Object r2) {
        if (r2 != null) goto L6;
        return m5001e();
    L6:
        return m4999c(r2.hashCode(), r2);
    }

    /* JADX INFO: renamed from: e */
    public final int m5001e() {
        int r0 = this.f8818c;
        if (r0 != 0) goto L6;
        return -1;
    L6:
        int r1 = AbstractC0714Qj.m1482d(r0, 0, this.f8816a);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (this.f8817b[r1 << 1] == null) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r0) goto L20;
        if (this.f8816a[r2] != 0) goto L20;
        if (this.f8817b[r2 << 1] == null) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f8816a[r12] != 0) goto L29;
        if (this.f8817b[r12 << 1] == null) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L44;
        return true;
    L44:
        if ((r8 instanceof C2520sy) == false) goto L25;
        int r2 = this.f8818c;     // Catch: Throwable -> L43
        if (r2 == ((C2520sy) r8).f8818c) goto L11;
        return false;
    L11:
        C2520sy r82 = (C2520sy) r8;     // Catch: Throwable -> L43
        int r3 = 0;
    L12:
        if (r3 >= r2) goto L23;
        Object r4 = m5002f(r3);     // Catch: Throwable -> L43
        Object r5 = m5003j(r3);     // Catch: Throwable -> L43
        Object r6 = r82.get(r4);     // Catch: Throwable -> L43
        if (r5 != null) goto L20;
        if (r6 != null) goto L18;
        if (r82.containsKey(r4) == false) goto L18;
    L22:
        r3 = r3 + 1;     // Catch: Throwable -> L43
    L18:
        return false;
    L20:
        if (r5.equals(r6) == true) goto L22;
        return false;
    L23:
        return true;
    L25:
        if ((r8 instanceof Map) == false) goto L42;
        if (this.f8818c == ((Map) r8).size()) goto L29;
        return false;
    L29:
        int r22 = this.f8818c;     // Catch: Throwable -> L43
        int r32 = 0;
    L30:
        if (r32 >= r22) goto L41;
        Object r42 = m5002f(r32);     // Catch: Throwable -> L43
        Object r52 = m5003j(r32);     // Catch: Throwable -> L43
        Object r62 = ((Map) r8).get(r42);     // Catch: Throwable -> L43
        if (r52 != null) goto L38;
        if (r62 != null) goto L36;
        if (((Map) r8).containsKey(r42) == false) goto L36;
    L40:
        r32 = r32 + 1;
    L36:
        return false;
    L38:
        if (r52.equals(r62) == true) goto L40;
        return false;
    L41:
        return true;
    L42:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m5002f(int r2) {
        if (r2 < 0) goto L8;
        if (r2 >= this.f8818c) goto L8;
        return this.f8817b[r2 << 1];
    L8:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r2, "Expected index to be within 0..size()-1, but was ").toString());
    }

    /* JADX INFO: renamed from: g */
    public void mo3g(C0521M4 r5) {
        int r0 = r5.f8818c;
        m4998b(this.f8818c + r0);
        int r2 = 0;
        if (this.f8818c != 0) goto L7;
        if (r0 <= 0) goto L9;
        AbstractC0650P4.m1309D(0, 0, r5.f8816a, this.f8816a, r0);
        AbstractC0650P4.m1310E(r5.f8817b, this.f8817b, 0, 0, r0 << 1);
        this.f8818c = r0;
        return;
    L9:
        return;
    L7:
        if (r2 >= r0) goto L11;
        put(r5.m5002f(r2), r5.m5003j(r2));
        r2 = r2 + 1;
        goto L7
    }

    public Object get(Object r2) {
        int r22 = m5000d(r2);
        if (r22 >= 0) goto L5;
        return null;
    L5:
        return this.f8817b[(r22 << 1) + 1];
    }

    public final Object getOrDefault(Object r1, Object r2) {
        int r12 = m5000d(r1);
        if (r12 >= 0) goto L5;
        return r2;
    L5:
        return this.f8817b[(r12 << 1) + 1];
    }

    /* JADX INFO: renamed from: h */
    public Object mo4h(int r10) {
        if (r10 < 0) goto L33;
        int r0 = this.f8818c;
        if (r10 >= r0) goto L33;
        Object[] r1 = this.f8817b;
        int r2 = r10 << 1;
        Object r3 = r1[r2 + 1];
        if (r0 > 1) goto L9;
        clear();
        return r3;
    L9:
        int r5 = r0 - 1;
        int[] r6 = this.f8816a;
        int r8 = 8;
        if (r6.length > 8) goto L12;
    L23:
        if (r10 >= r5) goto L25;
        int r12 = r10 + 1;
        AbstractC0650P4.m1309D(r10, r12, r6, r6, r0);
        Object[] r102 = this.f8817b;
        AbstractC0650P4.m1310E(r102, r102, r2, r12 << 1, r0 << 1);
    L25:
        Object[] r103 = this.f8817b;
        int r13 = r5 << 1;
        r103[r13] = null;
        r103[r13 + 1] = null;
    L27:
        if (r0 != this.f8818c) goto L31;
        this.f8818c = r5;
        return r3;
    L31:
        throw new ConcurrentModificationException();
    L12:
        if (r0 >= (r6.length / 3)) goto L23;
        if (r0 <= 8) goto L15;
        r8 = r0 + (r0 >> 1);
    L15:
        this.f8816a = Arrays.copyOf(r6, r8);
        this.f8817b = Arrays.copyOf(this.f8817b, r8 << 1);
        if (r0 != this.f8818c) goto L22;
        if (r10 <= 0) goto L19;
        AbstractC0650P4.m1309D(0, 0, r6, this.f8816a, r10);
        AbstractC0650P4.m1310E(r1, this.f8817b, 0, 0, r2);
    L19:
        if (r10 >= r5) goto L27;
        int r82 = r10 + 1;
        AbstractC0650P4.m1309D(r10, r82, r6, this.f8816a, r0);
        AbstractC0650P4.m1310E(r1, this.f8817b, r2, r82 << 1, r0 << 1);
        goto L27
    L22:
        throw new ConcurrentModificationException();
    L33:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r10, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public int hashCode() {
        int[] r0 = this.f8816a;
        Object[] r1 = this.f8817b;
        int r2 = this.f8818c;
        int r4 = 1;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r5 >= r2) goto L9;
        Object r7 = r1[r4];
        int r8 = r0[r5];
        if (r7 == null) goto L7;
        int r72 = r7.hashCode();
    L8:
        r6 = r6 + (r72 ^ r8);
        r5 = r5 + 1;
        r4 = r4 + 2;
        goto L3
    L7:
        r72 = 0;
        goto L8
    L9:
        return r6;
    }

    /* JADX INFO: renamed from: i */
    public Object mo5i(int r3, Object r4) {
        if (r3 < 0) goto L8;
        if (r3 >= this.f8818c) goto L8;
        int r32 = (r3 << 1) + 1;
        Object[] r0 = this.f8817b;
        Object r1 = r0[r32];
        r0[r32] = r4;
        return r1;
    L8:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r3, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean isEmpty() {
        if (this.f8818c > 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final Object m5003j(int r2) {
        if (r2 < 0) goto L8;
        if (r2 >= this.f8818c) goto L8;
        return this.f8817b[(r2 << 1) + 1];
    L8:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r2, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object put(Object r8, Object r9) {
        int r0 = this.f8818c;
        if (r8 == null) goto L5;
        int r1 = r8.hashCode();
    L6:
        if (r8 == null) goto L8;
        int r2 = m4999c(r1, r8);
    L9:
        if (r2 < 0) goto L12;
        int r82 = (r2 << 1) + 1;
        Object[] r02 = this.f8817b;
        Object r12 = r02[r82];
        r02[r82] = r9;
        return r12;
    L12:
        int r22 = ~r2;
        int[] r3 = this.f8816a;
        if (r0 < r3.length) goto L26;
        int r4 = 8;
        if (r0 < 8) goto L18;
        r4 = (r0 >> 1) + r0;
    L21:
        this.f8816a = Arrays.copyOf(r3, r4);
        this.f8817b = Arrays.copyOf(this.f8817b, r4 << 1);
        if (r0 == this.f8818c) goto L26;
        throw new ConcurrentModificationException();
    L18:
        if (r0 >= 4) goto L21;
        r4 = 4;
    L26:
        if (r22 >= r0) goto L28;
        int[] r32 = this.f8816a;
        int r42 = r22 + 1;
        AbstractC0650P4.m1309D(r42, r22, r32, r32, r0);
        Object[] r33 = this.f8817b;
        AbstractC0650P4.m1310E(r33, r33, r42 << 1, r22 << 1, this.f8818c << 1);
    L28:
        int r34 = this.f8818c;
        if (r0 != r34) goto L35;
        int[] r03 = this.f8816a;
        if (r22 >= r03.length) goto L35;
        r03[r22] = r1;
        Object[] r04 = this.f8817b;
        int r13 = r22 << 1;
        r04[r13] = r8;
        r04[r13 + 1] = r9;
        this.f8818c = r34 + 1;
        return null;
    L35:
        throw new ConcurrentModificationException();
    L8:
        r2 = m5001e();
        goto L9
    L5:
        r1 = 0;
        goto L6
    }

    public final Object putIfAbsent(Object r2, Object r3) {
        Object r0 = get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return put(r2, r3);
    }

    public Object remove(Object r1) {
        int r12 = m5000d(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return mo4h(r12);
    }

    public final Object replace(Object r1, Object r2) {
        int r12 = m5000d(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return mo5i(r12, r2);
    }

    public final int size() {
        return this.f8818c;
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.f8818c * 28);
        r1.append('{');
        int r0 = this.f8818c;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L19;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        Object r3 = m5002f(r2);
        if (r3 == r1) goto L13;
        r1.append(r3);
    L14:
        r1.append('=');
        Object r32 = m5003j(r2);
        if (r32 == r1) goto L17;
        r1.append(r32);
    L18:
        r2 = r2 + 1;
        goto L7
    L17:
        r1.append("(this Map)");
        goto L18
    L13:
        r1.append("(this Map)");
        goto L14
    L19:
        r1.append('}');
        return r1.toString();
    }

    public final boolean remove(Object r2, Object r3) {
        int r22 = m5000d(r2);
        if (r22 >= 0) goto L5;
        return false;
    L5:
        if (AbstractC0585Nj.m1134a(r3, m5003j(r22)) == false) goto L10;
        mo4h(r22);
        return true;
    L10:
        return false;
    }

    public final boolean replace(Object r2, Object r3, Object r4) {
        int r22 = m5000d(r2);
        if (r22 >= 0) goto L5;
        return false;
    L5:
        if (AbstractC0585Nj.m1134a(r3, m5003j(r22)) == false) goto L10;
        mo5i(r22, r4);
        return true;
    L10:
        return false;
    }
}
