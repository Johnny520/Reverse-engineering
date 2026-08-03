package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: oq */
/* JADX INFO: loaded from: classes.dex */
public final class C2332oq implements Map, Serializable, InterfaceC0631Om {

    /* JADX INFO: renamed from: n */
    public static final C2332oq f8180n = null;

    /* JADX INFO: renamed from: a */
    public Object[] f8181a;

    /* JADX INFO: renamed from: b */
    public Object[] f8182b;

    /* JADX INFO: renamed from: c */
    public int[] f8183c;

    /* JADX INFO: renamed from: d */
    public int[] f8184d;

    /* JADX INFO: renamed from: e */
    public int f8185e;

    /* JADX INFO: renamed from: f */
    public int f8186f;

    /* JADX INFO: renamed from: g */
    public int f8187g;

    /* JADX INFO: renamed from: h */
    public int f8188h;

    /* JADX INFO: renamed from: i */
    public int f8189i;

    /* JADX INFO: renamed from: j */
    public C2383pq f8190j;

    /* JADX INFO: renamed from: k */
    public C2426qq f8191k;

    /* JADX INFO: renamed from: l */
    public C2383pq f8192l;

    /* JADX INFO: renamed from: m */
    public boolean f8193m;

    static {
        C2332oq r0 = new C2332oq(0);
        r0.f8193m = true;
        f8180n = r0;
    }

    public C2332oq(int r5) {
        if (r5 < 0) goto L9;
        Object[] r0 = new Object[r5];
        int[] r1 = new int[r5];
        if (r5 >= 1) goto L6;
        r5 = 1;
    L6:
        int r52 = Integer.highestOneBit(r5 * 3);
        this.f8181a = r0;
        this.f8182b = null;
        this.f8183c = r1;
        this.f8184d = new int[r52];
        this.f8185e = 2;
        this.f8186f = 0;
        this.f8187g = Integer.numberOfLeadingZeros(r52) + 1;
        return;
    L9:
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    /* JADX INFO: renamed from: a */
    public final int m4728a(Object r8) {
        m4729b();
    L3:
        int r0 = m4733f(r8);
        int r1 = this.f8185e * 2;
        int r2 = this.f8184d.length / 2;
        if (r1 <= r2) goto L6;
        r1 = r2;
    L6:
        int r22 = 0;
    L7:
        int[] r3 = this.f8184d;
        int r4 = r3[r0];
        if (r4 <= 0) goto L9;
        if (AbstractC0585Nj.m1134a(this.f8181a[r4 - 1], r8) == true) goto L19;
        r22 = r22 + 1;
        if (r22 > r1) goto L22;
        int r32 = r0 - 1;
        if (r0 == 0) goto L25;
        r0 = r32;
        goto L7
    L25:
        r0 = this.f8184d.length - 1;
        goto L7
    L22:
        m4734g(this.f8184d.length * 2);
        goto L3
    L19:
        return -r4;
    L9:
        int r12 = this.f8186f;
        Object[] r42 = this.f8181a;
        if (r12 < r42.length) goto L12;
        m4731d(1);
        goto L3
    L12:
        int r6 = r12 + 1;
        this.f8186f = r6;
        r42[r12] = r8;
        this.f8183c[r12] = r0;
        r3[r0] = r6;
        this.f8189i++;
        this.f8188h++;
        if (r22 <= this.f8185e) goto L15;
        this.f8185e = r22;
    L15:
        return r12;
    }

    /* JADX INFO: renamed from: b */
    public final void m4729b() {
        if (this.f8193m == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public final void m4730c(boolean r8) {
        Object[] r0 = this.f8182b;
        int r1 = 0;
        int r2 = 0;
    L3:
        int r3 = this.f8186f;
        if (r1 >= r3) goto L14;
        int[] r32 = this.f8183c;
        int r4 = r32[r1];
        if (r4 < 0) goto L13;
        Object[] r5 = this.f8181a;
        r5[r2] = r5[r1];
        if (r0 == null) goto L10;
        r0[r2] = r0[r1];
    L10:
        if (r8 == false) goto L12;
        r32[r2] = r4;
        this.f8184d[r4] = r2 + 1;
    L12:
        r2 = r2 + 1;
    L13:
        r1 = r1 + 1;
        goto L3
    L14:
        Object[] r82 = this.f8181a;
        int r12 = r2;
    L16:
        if (r12 >= r3) goto L18;
        r82[r12] = null;
        r12 = r12 + 1;
        goto L16
    L18:
        if (r0 == null) goto L22;
        int r83 = this.f8186f;
        int r13 = r2;
    L20:
        if (r13 >= r83) goto L22;
        r0[r13] = null;
        r13 = r13 + 1;
    L22:
        this.f8186f = r2;
    }

    @Override // java.util.Map
    public final void clear() {
        m4729b();
        int r0 = this.f8186f - 1;
        if (r0 < 0) goto L10;
        int r2 = 0;
    L5:
        int[] r3 = this.f8183c;
        int r4 = r3[r2];
        if (r4 < 0) goto L8;
        this.f8184d[r4] = 0;
        r3[r2] = -1;
    L8:
        if (r2 == r0) goto L10;
        r2 = r2 + 1;
    L10:
        Object[] r02 = this.f8181a;
        int r22 = this.f8186f;
        int r32 = 0;
    L12:
        if (r32 >= r22) goto L14;
        r02[r32] = null;
        r32 = r32 + 1;
        goto L12
    L14:
        Object[] r03 = this.f8182b;
        if (r03 == null) goto L19;
        int r23 = this.f8186f;
        int r33 = 0;
    L17:
        if (r33 >= r23) goto L19;
        r03[r33] = null;
        r33 = r33 + 1;
    L19:
        this.f8189i = 0;
        this.f8186f = 0;
        this.f8188h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        if (m4732e(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r3) {
        int r0 = this.f8186f;
    L3:
        int r1 = -1;
        r0 = r0 - 1;
        if (r0 < 0) goto L10;
        if (this.f8183c[r0] < 0) goto L3;
        if (AbstractC0585Nj.m1134a(this.f8182b[r0], r3) == false) goto L3;
        r1 = r0;
    L10:
        if (r1 < 0) goto L13;
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m4731d(int r6) {
        Object[] r0 = this.f8181a;
        int r1 = r0.length;
        int r2 = this.f8186f;
        int r12 = r1 - r2;
        int r3 = r2 - this.f8189i;
        int r4 = 1;
        if (r12 < r6) goto L5;
    L10:
        int r22 = r2 + r6;
        if (r22 < 0) goto L35;
        if (r22 <= r0.length) goto L36;
        int r62 = r0.length;
        int r63 = r62 + (r62 >> 1);
        if ((r63 - r22) >= 0) goto L18;
        r63 = r22;
    L18:
        if ((r63 - 2147483639) <= 0) goto L22;
        if (r22 <= 2147483639) goto L21;
        r63 = Integer.MAX_VALUE;
        goto L22
    L21:
        r63 = 2147483639;
    L22:
        this.f8181a = Arrays.copyOf(r0, r63);
        Object[] r02 = this.f8182b;
        if (r02 == null) goto L25;
        Object[] r03 = Arrays.copyOf(r02, r63);
    L26:
        this.f8182b = r03;
        this.f8183c = Arrays.copyOf(this.f8183c, r63);
        if (r63 < 1) goto L30;
        r4 = r63;
    L30:
        int r64 = Integer.highestOneBit(r4 * 3);
        if (r64 <= this.f8184d.length) goto L37;
        m4734g(r64);
        return;
    L37:
        return;
    L25:
        r03 = null;
        goto L26
    L36:
        return;
    L35:
        throw new OutOfMemoryError();
    L5:
        if ((r12 + r3) < r6) goto L10;
        if (r3 < (r0.length / 4)) goto L10;
        m4730c(true);
    }

    /* JADX INFO: renamed from: e */
    public final int m4732e(Object r6) {
        int r0 = m4733f(r6);
        int r1 = this.f8185e;
    L3:
        int r2 = this.f8184d[r0];
        if (r2 == 0) goto L5;
        if (r2 <= 0) goto L10;
        int r22 = r2 - 1;
        if (AbstractC0585Nj.m1134a(this.f8181a[r22], r6) == false) goto L10;
        return r22;
    L10:
        r1 = r1 - 1;
        if (r1 < 0) goto L12;
        int r23 = r0 - 1;
        if (r0 == 0) goto L15;
        r0 = r23;
        goto L3
    L15:
        r0 = this.f8184d.length - 1;
        goto L3
    L12:
        return -1;
    L5:
        return -1;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2383pq r0 = this.f8192l;
        if (r0 != null) goto L6;
        C2383pq r02 = new C2383pq(this, 0);
        this.f8192l = r02;
        return r02;
    L6:
        return r0;
    }

    @Override // java.util.Map
    public final boolean equals(Object r6) {
        if (r6 != this) goto L5;
    L23:
        return true;
    L5:
        if ((r6 instanceof Map) == false) goto L22;
        Map r62 = (Map) r6;
        if (this.f8189i != r62.size()) goto L22;
        Iterator r63 = r62.entrySet().iterator();
    L10:
        if (r63.hasNext() == false) goto L19;
        Object r1 = r63.next();
        if (r1 == null) goto L18;
        Map.Entry r12 = (Map.Entry) r1;     // Catch: ClassCastException -> L24
        int r3 = m4732e(r12.getKey());     // Catch: ClassCastException -> L24
        if (r3 >= 0) goto L16;
        boolean r13 = false;
    L17:
        if (r13 == true) goto L10;
    L16:
        r13 = AbstractC0585Nj.m1134a(this.f8182b[r3], r12.getValue());     // Catch: ClassCastException -> L24
    L18:
        boolean r64 = false;
    L20:
        if (r64 == false) goto L22;
    L19:
        r64 = true;
    L22:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m4733f(Object r2) {
        if (r2 == null) goto L4;
        int r22 = r2.hashCode();
    L6:
        return (r22 * (-1640531527)) >>> this.f8187g;
    L4:
        r22 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final void m4734g(int r6) {
        this.f8188h++;
        int r2 = 0;
        if (this.f8186f <= this.f8189i) goto L5;
        m4730c(false);
    L5:
        this.f8184d = new int[r6];
        this.f8187g = Integer.numberOfLeadingZeros(r6) + 1;
    L7:
        if (r2 >= this.f8186f) goto L20;
        int r62 = r2 + 1;
        int r0 = m4733f(this.f8181a[r2]);
        int r1 = this.f8185e;
    L9:
        int[] r3 = this.f8184d;
        if (r3[r0] == 0) goto L11;
        r1 = r1 - 1;
        if (r1 < 0) goto L19;
        int r4 = r0 - 1;
        if (r0 == 0) goto L16;
        r0 = r4;
        goto L9
    L16:
        r0 = r3.length - 1;
        goto L9
    L19:
        throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
    L11:
        r3[r0] = r62;
        this.f8183c[r2] = r0;
        r2 = r62;
        goto L7
    }

    @Override // java.util.Map
    public final Object get(Object r2) {
        int r22 = m4732e(r2);
        if (r22 >= 0) goto L7;
        return null;
    L7:
        return this.f8182b[r22];
    }

    /* JADX INFO: renamed from: h */
    public final void m4735h(int r12) {
        this.f8181a[r12] = null;
        Object[] r0 = this.f8182b;
        if (r0 == null) goto L5;
        r0[r12] = null;
    L5:
        int r02 = this.f8183c[r12];
        int r1 = this.f8185e * 2;
        int r2 = this.f8184d.length / 2;
        if (r1 <= r2) goto L8;
        r1 = r2;
    L8:
        int r3 = r1;
        int r4 = 0;
        int r13 = r02;
    L9:
        int r5 = r02 - 1;
        if (r02 != 0) goto L12;
        r02 = this.f8184d.length - 1;
    L13:
        r4 = r4 + 1;
        if (r4 > this.f8185e) goto L15;
        int[] r52 = this.f8184d;
        int r7 = r52[r02];
        if (r7 == 0) goto L18;
        if (r7 >= 0) goto L22;
        r52[r13] = -1;
    L21:
        r13 = r02;
        r4 = 0;
    L25:
        r3 = r3 - 1;
        if (r3 >= 0) goto L9;
        this.f8184d[r13] = -1;
    L28:
        this.f8183c[r12] = -1;
        this.f8189i--;
        this.f8188h++;
        return;
    L22:
        int r8 = r7 - 1;
        int r53 = m4733f(this.f8181a[r8]) - r02;
        int[] r9 = this.f8184d;
        if ((r53 & (r9.length - 1)) < r4) goto L25;
        r9[r13] = r7;
        this.f8183c[r8] = r13;
        goto L21
    L18:
        r52[r13] = 0;
        goto L28
    L15:
        this.f8184d[r13] = 0;
        goto L28
    L12:
        r02 = r5;
        goto L13
    }

    @Override // java.util.Map
    public final int hashCode() {
        C2203lq r0 = new C2203lq(this, 0);
        int r2 = 0;
    L4:
        if (r0.hasNext() == false) goto L18;
        int r3 = r0.f8034a;
        C2332oq r4 = (C2332oq) r0.f8037d;
        if (r3 >= r4.f8186f) goto L17;
        r0.f8034a = r3 + 1;
        r0.f8035b = r3;
        Object r32 = r4.f8181a[r3];
        if (r32 == null) goto L10;
        int r33 = r32.hashCode();
    L11:
        Object r42 = r4.f8182b[r0.f8035b];
        if (r42 == null) goto L14;
        int r43 = r42.hashCode();
    L15:
        r0.m4626e();
        r2 = r2 + (r33 ^ r43);
        goto L4
    L14:
        r43 = 0;
        goto L15
    L10:
        r33 = 0;
        goto L11
    L17:
        throw new NoSuchElementException();
    L18:
        return r2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f8189i != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2383pq r0 = this.f8190j;
        if (r0 != null) goto L6;
        C2383pq r02 = new C2383pq(this, 1);
        this.f8190j = r02;
        return r02;
    L6:
        return r0;
    }

    @Override // java.util.Map
    public final Object put(Object r3, Object r4) {
        m4729b();
        int r32 = m4728a(r3);
        Object[] r0 = this.f8182b;
        if (r0 != null) goto L8;
        int r02 = this.f8181a.length;
        if (r02 < 0) goto L14;
        r0 = new Object[r02];
        this.f8182b = r0;
        goto L8
    L14:
        throw new IllegalArgumentException("capacity must be non-negative.");
    L8:
        if (r32 >= 0) goto L11;
        int r33 = (-r32) - 1;
        Object r1 = r0[r33];
        r0[r33] = r4;
        return r1;
    L11:
        r0[r32] = r4;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map r6) {
        m4729b();
        Set r62 = r6.entrySet();
        if (r62.isEmpty() == true) goto L21;
        m4731d(r62.size());
        Iterator r63 = r62.iterator();
    L7:
        if (r63.hasNext() == false) goto L31;
        Map.Entry r0 = (Map.Entry) r63.next();
        int r1 = m4728a(r0.getKey());
        Object[] r2 = this.f8182b;
        if (r2 != null) goto L14;
        int r22 = this.f8181a.length;
        if (r22 < 0) goto L20;
        r2 = new Object[r22];
        this.f8182b = r2;
        goto L14
    L20:
        throw new IllegalArgumentException("capacity must be non-negative.");
    L14:
        if (r1 >= 0) goto L15;
        int r12 = (-r1) - 1;
        if (AbstractC0585Nj.m1134a(r0.getValue(), r2[r12]) == true) goto L7;
        r2[r12] = r0.getValue();
        goto L7
    L15:
        r2[r1] = r0.getValue();
        goto L7
    L31:
        return;
    }

    @Override // java.util.Map
    public final Object remove(Object r2) {
        m4729b();
        int r22 = m4732e(r2);
        if (r22 >= 0) goto L6;
        return null;
    L6:
        Object r0 = this.f8182b[r22];
        m4735h(r22);
        return r0;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8189i;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder((this.f8189i * 3) + 2);
        r0.append("{");
        int r2 = 0;
        C2203lq r1 = new C2203lq(this, 0);
    L4:
        if (r1.hasNext() == false) goto L20;
        if (r2 <= 0) goto L7;
        r0.append(", ");
    L7:
        int r3 = r1.f8034a;
        C2332oq r4 = (C2332oq) r1.f8037d;
        if (r3 >= r4.f8186f) goto L19;
        r1.f8034a = r3 + 1;
        r1.f8035b = r3;
        Object r32 = r4.f8181a[r3];
        if (r32 != r4) goto L12;
        r0.append("(this Map)");
    L13:
        r0.append('=');
        Object r33 = r4.f8182b[r1.f8035b];
        if (r33 != r4) goto L16;
        r0.append("(this Map)");
    L17:
        r1.m4626e();
        r2 = r2 + 1;
        goto L4
    L16:
        r0.append(r33);
        goto L17
    L12:
        r0.append(r32);
        goto L13
    L19:
        throw new NoSuchElementException();
    L20:
        r0.append("}");
        return r0.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C2426qq r0 = this.f8191k;
        if (r0 != null) goto L6;
        C2426qq r02 = new C2426qq(this);
        this.f8191k = r02;
        return r02;
    L6:
        return r0;
    }
}
