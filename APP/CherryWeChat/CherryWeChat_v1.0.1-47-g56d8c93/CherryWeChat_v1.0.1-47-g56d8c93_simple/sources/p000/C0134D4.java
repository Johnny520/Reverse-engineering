package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: D4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0134D4 extends AbstractList implements List, InterfaceC0588Nm {

    /* JADX INFO: renamed from: d */
    public static final Object[] f345d = null;

    /* JADX INFO: renamed from: a */
    public int f346a;

    /* JADX INFO: renamed from: b */
    public Object[] f347b;

    /* JADX INFO: renamed from: c */
    public int f348c;

    static {
        f345d = new Object[0];
    }

    public C0134D4() {
        this.f347b = f345d;
    }

    /* JADX INFO: renamed from: a */
    public final void m252a(int r5, Collection r6) {
        Iterator r0 = r6.iterator();
        int r1 = this.f347b.length;
    L3:
        if (r5 >= r1) goto L7;
        if (r0.hasNext() == false) goto L7;
        this.f347b[r5] = r0.next();
        r5 = r5 + 1;
    L7:
        int r52 = this.f346a;
        int r12 = 0;
    L8:
        if (r12 >= r52) goto L12;
        if (r0.hasNext() == false) goto L12;
        this.f347b[r12] = r0.next();
        r12 = r12 + 1;
    L12:
        int r53 = this.f348c;
        this.f348c = r6.size() + r53;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, Object r9) {
        int r0 = this.f348c;
        if (r8 < 0) goto L32;
        if (r8 > r0) goto L32;
        if (r8 != r0) goto L8;
        addLast(r9);
        return;
    L8:
        if (r8 != 0) goto L11;
        addFirst(r9);
        return;
    L11:
        m258j();
        m253b(this.f348c + 1);
        int r02 = m257h(this.f346a + r8);
        int r2 = this.f348c;
        if (r8 >= ((r2 + 1) >> 1)) goto L24;
        if (r02 != 0) goto L15;
        int r82 = this.f347b.length - 1;
    L16:
        int r03 = this.f346a;
        if (r03 != 0) goto L19;
        int r22 = this.f347b.length - 1;
    L20:
        if (r82 < r03) goto L22;
        Object[] r3 = this.f347b;
        r3[r22] = r3[r03];
        AbstractC0650P4.m1310E(r3, r3, r03, r03 + 1, r82 + 1);
    L23:
        this.f347b[r82] = r9;
        this.f346a = r22;
    L29:
        this.f348c++;
        return;
    L22:
        Object[] r32 = this.f347b;
        AbstractC0650P4.m1310E(r32, r32, r03 - 1, r03, r32.length);
        Object[] r04 = this.f347b;
        r04[r04.length - 1] = r04[0];
        AbstractC0650P4.m1310E(r04, r04, 0, 1, r82 + 1);
        goto L23
    L19:
        r22 = r03 - 1;
        goto L20
    L15:
        r82 = r02 - 1;
        goto L16
    L24:
        int r83 = m257h(this.f346a + r2);
        if (r02 >= r83) goto L27;
        Object[] r23 = this.f347b;
        AbstractC0650P4.m1310E(r23, r23, r02 + 1, r02, r83);
    L28:
        this.f347b[r02] = r9;
        goto L29
    L27:
        Object[] r24 = this.f347b;
        AbstractC0650P4.m1310E(r24, r24, 1, 0, r83);
        Object[] r84 = this.f347b;
        r84[0] = r84[r84.length - 1];
        AbstractC0650P4.m1310E(r84, r84, r02 + 1, r02, r84.length - 1);
    L32:
        throw new IndexOutOfBoundsException("index: " + r8 + ", size: " + r0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, Collection r10) {
        int r0 = this.f348c;
        if (r9 < 0) goto L44;
        if (r9 > r0) goto L44;
        if (r10.isEmpty() == false) goto L9;
        return false;
    L9:
        if (r9 == this.f348c) goto L11;
        m258j();
        m253b(r10.size() + this.f348c);
        int r02 = m257h(this.f346a + this.f348c);
        int r2 = m257h(this.f346a + r9);
        int r3 = r10.size();
        if (r9 >= ((this.f348c + 1) >> 1)) goto L28;
        int r92 = this.f346a;
        int r03 = r92 - r3;
        if (r2 < r92) goto L22;
        if (r03 < 0) goto L18;
        Object[] r1 = this.f347b;
        AbstractC0650P4.m1310E(r1, r1, r03, r92, r2);
    L26:
        this.f346a = r03;
        m252a(m255e(r2 - r3), r10);
        return true;
    L18:
        Object[] r4 = this.f347b;
        r03 = r03 + r4.length;
        int r6 = r2 - r92;
        int r7 = r4.length - r03;
        if (r7 < r6) goto L21;
        AbstractC0650P4.m1310E(r4, r4, r03, r92, r2);
        goto L26
    L21:
        AbstractC0650P4.m1310E(r4, r4, r03, r92, r92 + r7);
        Object[] r93 = this.f347b;
        AbstractC0650P4.m1310E(r93, r93, 0, this.f346a + r7, r2);
        goto L26
    L22:
        Object[] r42 = this.f347b;
        AbstractC0650P4.m1310E(r42, r42, r03, r92, r42.length);
        if (r3 < r2) goto L25;
        Object[] r94 = this.f347b;
        AbstractC0650P4.m1310E(r94, r94, r94.length - r3, 0, r2);
        goto L26
    L25:
        Object[] r95 = this.f347b;
        AbstractC0650P4.m1310E(r95, r95, r95.length - r3, 0, r3);
        Object[] r96 = this.f347b;
        AbstractC0650P4.m1310E(r96, r96, 0, r3, r2);
        goto L26
    L28:
        int r97 = r2 + r3;
        if (r2 >= r02) goto L37;
        int r32 = r3 + r02;
        Object[] r43 = this.f347b;
        if (r32 > r43.length) goto L34;
        AbstractC0650P4.m1310E(r43, r43, r97, r2, r02);
    L41:
        m252a(r2, r10);
        return true;
    L34:
        if (r97 < r43.length) goto L36;
        AbstractC0650P4.m1310E(r43, r43, r97 - r43.length, r2, r02);
        goto L41
    L36:
        int r33 = r02 - (r32 - r43.length);
        AbstractC0650P4.m1310E(r43, r43, 0, r33, r02);
        Object[] r04 = this.f347b;
        AbstractC0650P4.m1310E(r04, r04, r97, r2, r33);
        goto L41
    L37:
        Object[] r44 = this.f347b;
        AbstractC0650P4.m1310E(r44, r44, r3, 0, r02);
        Object[] r05 = this.f347b;
        if (r97 < r05.length) goto L40;
        AbstractC0650P4.m1310E(r05, r05, r97 - r05.length, r2, r05.length);
        goto L41
    L40:
        AbstractC0650P4.m1310E(r05, r05, 0, r05.length - r3, r05.length);
        Object[] r06 = this.f347b;
        AbstractC0650P4.m1310E(r06, r06, r97, r2, r06.length - r3);
        goto L41
    L11:
        return addAll(r10);
    L44:
        throw new IndexOutOfBoundsException("index: " + r9 + ", size: " + r0);
    }

    public final void addFirst(Object r3) {
        m258j();
        m253b(this.f348c + 1);
        int r0 = this.f346a;
        if (r0 != 0) goto L5;
        r0 = this.f347b.length;
    L5:
        int r02 = r0 - 1;
        this.f346a = r02;
        this.f347b[r02] = r3;
        this.f348c++;
    }

    public final void addLast(Object r4) {
        m258j();
        m253b(this.f348c + 1);
        this.f347b[m257h(this.f346a + this.f348c)] = r4;
        this.f348c++;
    }

    /* JADX INFO: renamed from: b */
    public final void m253b(int r5) {
        if (r5 < 0) goto L24;
        Object[] r0 = this.f347b;
        if (r5 > r0.length) goto L7;
        return;
    L7:
        if (r0 == f345d) goto L9;
        int r1 = r0.length;
        int r12 = r1 + (r1 >> 1);
        if ((r12 - r5) >= 0) goto L17;
        r12 = r5;
    L17:
        if ((r12 - 2147483639) <= 0) goto L21;
        if (r5 <= 2147483639) goto L20;
        r12 = Integer.MAX_VALUE;
        goto L21
    L20:
        r12 = 2147483639;
    L21:
        Object[] r52 = new Object[r12];
        AbstractC0650P4.m1310E(r0, r52, 0, this.f346a, r0.length);
        Object[] r02 = this.f347b;
        int r13 = r02.length;
        int r2 = this.f346a;
        AbstractC0650P4.m1310E(r02, r52, r13 - r2, 0, r2);
        this.f346a = 0;
        this.f347b = r52;
        return;
    L9:
        if (r5 >= 10) goto L11;
        r5 = 10;
    L11:
        this.f347b = new Object[r5];
        return;
    L24:
        throw new IllegalStateException("Deque is too big.");
    }

    /* JADX INFO: renamed from: c */
    public final int m254c(int r2) {
        if (r2 != (this.f347b.length - 1)) goto L7;
        return 0;
    L7:
        return r2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (isEmpty() == true) goto L5;
        m258j();
        int r0 = m257h(this.f346a + this.f348c);
        m256g(this.f346a, r0);
    L5:
        this.f346a = 0;
        this.f348c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r2) {
        if (indexOf(r2) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final int m255e(int r2) {
        if (r2 < 0) goto L4;
        return r2;
    L4:
        return r2 + this.f347b.length;
    }

    /* JADX INFO: renamed from: g */
    public final void m256g(int r4, int r5) {
        if (r4 >= r5) goto L6;
        Arrays.fill(this.f347b, r4, r5, null);
        return;
    L6:
        Object[] r1 = this.f347b;
        Arrays.fill(r1, r4, r1.length, null);
        Arrays.fill(this.f347b, 0, r5, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        int r0 = this.f348c;
        if (r5 < 0) goto L8;
        if (r5 >= r0) goto L8;
        return this.f347b[m257h(this.f346a + r5)];
    L8:
        throw new IndexOutOfBoundsException("index: " + r5 + ", size: " + r0);
    }

    /* JADX INFO: renamed from: h */
    public final int m257h(int r3) {
        Object[] r0 = this.f347b;
        if (r3 >= r0.length) goto L5;
        return r3;
    L5:
        return r3 - r0.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        int r0 = m257h(this.f346a + this.f348c);
        int r1 = this.f346a;
        if (r1 >= r0) goto L11;
    L4:
        if (r1 >= r0) goto L32;
        if (AbstractC0585Nj.m1134a(r5, this.f347b[r1]) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        int r52 = this.f346a;
    L9:
        return r1 - r52;
    L32:
        return -1;
    L11:
        if (r1 < r0) goto L24;
        int r2 = this.f347b.length;
    L13:
        if (r1 >= r2) goto L18;
        if (AbstractC0585Nj.m1134a(r5, this.f347b[r1]) == true) goto L16;
        r1 = r1 + 1;
        goto L13
    L16:
        r52 = this.f346a;
        goto L9
    L18:
        int r12 = 0;
    L19:
        if (r12 >= r0) goto L33;
        if (AbstractC0585Nj.m1134a(r5, this.f347b[r12]) == true) goto L22;
        r12 = r12 + 1;
        goto L19
    L22:
        r1 = r12 + this.f347b.length;
        r52 = this.f346a;
        goto L9
    L33:
        return -1;
    L24:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f348c != 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m258j() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: k */
    public final Object m259k(int r9) {
        int r0 = this.f348c;
        if (r9 < 0) goto L27;
        if (r9 >= r0) goto L27;
        if (r9 == AbstractC2496sa.m4976a0(this)) goto L8;
        if (r9 == 0) goto L11;
        m258j();
        int r02 = m257h(this.f346a + r9);
        Object[] r1 = this.f347b;
        Object r2 = r1[r02];
        if (r9 >= (this.f348c >> 1)) goto L19;
        int r92 = this.f346a;
        if (r02 < r92) goto L17;
        AbstractC0650P4.m1310E(r1, r1, r92 + 1, r92, r02);
    L18:
        Object[] r93 = this.f347b;
        int r03 = this.f346a;
        r93[r03] = null;
        this.f346a = m254c(r03);
    L24:
        this.f348c--;
        return r2;
    L17:
        AbstractC0650P4.m1310E(r1, r1, 1, 0, r02);
        Object[] r94 = this.f347b;
        r94[0] = r94[r94.length - 1];
        int r04 = this.f346a;
        AbstractC0650P4.m1310E(r94, r94, r04 + 1, r04, r94.length - 1);
        goto L18
    L19:
        int r95 = m257h(AbstractC2496sa.m4976a0(this) + this.f346a);
        if (r02 > r95) goto L22;
        Object[] r12 = this.f347b;
        AbstractC0650P4.m1310E(r12, r12, r02, r02 + 1, r95 + 1);
    L23:
        this.f347b[r95] = null;
        goto L24
    L22:
        Object[] r13 = this.f347b;
        AbstractC0650P4.m1310E(r13, r13, r02, r02 + 1, r13.length);
        Object[] r05 = this.f347b;
        r05[r05.length - 1] = r05[0];
        AbstractC0650P4.m1310E(r05, r05, 0, 1, r95 + 1);
        goto L23
    L11:
        return removeFirst();
    L8:
        return removeLast();
    L27:
        throw new IndexOutOfBoundsException("index: " + r9 + ", size: " + r0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r5) {
        int r0 = m257h(this.f346a + this.f348c);
        int r1 = this.f346a;
        if (r1 >= r0) goto L13;
        int r02 = r0 - 1;
        if (r1 <= r02) goto L7;
    L27:
        return -1;
    L7:
        if (AbstractC0585Nj.m1134a(r5, this.f347b[r02]) == true) goto L8;
        if (r02 == r1) goto L27;
        r02 = r02 - 1;
        goto L7
    L8:
        int r52 = this.f346a;
    L10:
        return r02 - r52;
    L13:
        if (r1 <= r0) goto L27;
        int r03 = r0 - 1;
    L15:
        if ((-1) >= r03) goto L20;
        if (AbstractC0585Nj.m1134a(r5, this.f347b[r03]) == true) goto L18;
        r03 = r03 - 1;
        goto L15
    L18:
        r02 = r03 + this.f347b.length;
        r52 = this.f346a;
        goto L10
    L20:
        r02 = this.f347b.length - 1;
        int r12 = this.f346a;
        if (r12 > r02) goto L27;
    L23:
        if (AbstractC0585Nj.m1134a(r5, this.f347b[r02]) == true) goto L24;
        if (r02 == r12) goto L27;
        r02 = r02 - 1;
        goto L23
    L24:
        r52 = this.f346a;
        goto L10
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int r1) {
        return m259k(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r12) {
        boolean r1 = false;
        r1 = false;
        int r13 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L34:
        return r1;
    L5:
        if (this.f347b.length == 0) goto L34;
        int r0 = m257h(this.f346a + this.f348c);
        int r2 = this.f346a;
        if (r2 >= r0) goto L17;
        int r5 = r2;
    L10:
        if (r2 >= r0) goto L16;
        Object r6 = this.f347b[r2];
        if (r12.contains(r6) == true) goto L14;
        this.f347b[r5] = r6;
        r5 = r5 + 1;
    L15:
        r2 = r2 + 1;
        goto L10
    L14:
        r1 = true;
        goto L15
    L16:
        Arrays.fill(this.f347b, r5, r0, null);
    L32:
        if (r1 == false) goto L34;
        m258j();
        this.f348c = m255e(r5 - this.f346a);
        goto L34
    L17:
        int r52 = this.f347b.length;
        boolean r7 = false;
        int r62 = r2;
    L18:
        if (r2 >= r52) goto L24;
        Object[] r8 = this.f347b;
        Object r9 = r8[r2];
        r8[r2] = null;
        if (r12.contains(r9) == true) goto L22;
        this.f347b[r62] = r9;
        r62 = r62 + 1;
    L23:
        r2 = r2 + 1;
        goto L18
    L22:
        r7 = true;
        goto L23
    L24:
        r5 = m257h(r62);
    L25:
        if (r13 >= r0) goto L31;
        Object[] r22 = this.f347b;
        Object r63 = r22[r13];
        r22[r13] = null;
        if (r12.contains(r63) == true) goto L29;
        this.f347b[r5] = r63;
        r5 = m254c(r5);
    L30:
        r13 = r13 + 1;
        goto L25
    L29:
        r7 = true;
        goto L30
    L31:
        r1 = r7;
        goto L32
    }

    public final Object removeFirst() {
        if (isEmpty() == true) goto L7;
        m258j();
        Object[] r0 = this.f347b;
        int r1 = this.f346a;
        Object r2 = r0[r1];
        r0[r1] = null;
        this.f346a = m254c(r1);
        this.f348c--;
        return r2;
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (isEmpty() == true) goto L7;
        m258j();
        int r0 = m257h(AbstractC2496sa.m4976a0(this) + this.f346a);
        Object[] r1 = this.f347b;
        Object r2 = r1[r0];
        r1[r0] = null;
        this.f348c--;
        return r2;
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
        AbstractC0585Nj.m1136d(r8, r9, this.f348c);
        int r0 = r9 - r8;
        if (r0 != 0) goto L6;
        return;
    L6:
        if (r0 != this.f348c) goto L10;
        clear();
        return;
    L10:
        if (r0 != 1) goto L13;
        m259k(r8);
        return;
    L13:
        m258j();
        if (r8 >= (this.f348c - r9)) goto L19;
        int r2 = m257h(this.f346a + (r8 - 1));
        int r92 = m257h(this.f346a + (r9 - 1));
    L16:
        if (r8 <= 0) goto L18;
        int r1 = r2 + 1;
        int r3 = Math.min(r8, Math.min(r1, r92 + 1));
        Object[] r4 = this.f347b;
        int r93 = r92 - r3;
        int r22 = r2 - r3;
        AbstractC0650P4.m1310E(r4, r4, r93 + 1, r22 + 1, r1);
        r2 = m255e(r22);
        r92 = m255e(r93);
        r8 = r8 - r3;
        goto L16
    L18:
        int r82 = m257h(this.f346a + r0);
        m256g(this.f346a, r82);
        this.f346a = r82;
    L24:
        this.f348c -= r0;
        return;
    L19:
        int r12 = m257h(this.f346a + r9);
        int r83 = m257h(this.f346a + r8);
        int r23 = this.f348c;
    L20:
        r23 = r23 - r9;
        if (r23 <= 0) goto L23;
        Object[] r94 = this.f347b;
        r9 = Math.min(r23, Math.min(r94.length - r12, r94.length - r83));
        Object[] r32 = this.f347b;
        int r42 = r12 + r9;
        AbstractC0650P4.m1310E(r32, r32, r83, r12, r42);
        r12 = m257h(r42);
        r83 = m257h(r83 + r9);
        goto L20
    L23:
        int r84 = m257h(this.f346a + this.f348c);
        m256g(m255e(r84 - r0), r84);
        goto L24
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r12) {
        boolean r1 = false;
        r1 = false;
        int r13 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L34:
        return r1;
    L5:
        if (this.f347b.length == 0) goto L34;
        int r0 = m257h(this.f346a + this.f348c);
        int r2 = this.f346a;
        if (r2 >= r0) goto L17;
        int r5 = r2;
    L10:
        if (r2 >= r0) goto L16;
        Object r6 = this.f347b[r2];
        if (r12.contains(r6) == false) goto L14;
        this.f347b[r5] = r6;
        r5 = r5 + 1;
    L15:
        r2 = r2 + 1;
        goto L10
    L14:
        r1 = true;
        goto L15
    L16:
        Arrays.fill(this.f347b, r5, r0, null);
    L32:
        if (r1 == false) goto L34;
        m258j();
        this.f348c = m255e(r5 - this.f346a);
        goto L34
    L17:
        int r52 = this.f347b.length;
        boolean r7 = false;
        int r62 = r2;
    L18:
        if (r2 >= r52) goto L24;
        Object[] r8 = this.f347b;
        Object r9 = r8[r2];
        r8[r2] = null;
        if (r12.contains(r9) == false) goto L22;
        this.f347b[r62] = r9;
        r62 = r62 + 1;
    L23:
        r2 = r2 + 1;
        goto L18
    L22:
        r7 = true;
        goto L23
    L24:
        r5 = m257h(r62);
    L25:
        if (r13 >= r0) goto L31;
        Object[] r22 = this.f347b;
        Object r63 = r22[r13];
        r22[r13] = null;
        if (r12.contains(r63) == false) goto L29;
        this.f347b[r5] = r63;
        r5 = m254c(r5);
    L30:
        r13 = r13 + 1;
        goto L25
    L29:
        r7 = true;
        goto L30
    L31:
        r1 = r7;
        goto L32
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object r5) {
        int r0 = this.f348c;
        if (r4 < 0) goto L8;
        if (r4 >= r0) goto L8;
        int r42 = m257h(this.f346a + r4);
        Object[] r02 = this.f347b;
        Object r1 = r02[r42];
        r02[r42] = r5;
        return r1;
    L8:
        throw new IndexOutOfBoundsException("index: " + r4 + ", size: " + r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f348c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f348c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r2) {
        int r22 = indexOf(r2);
        if (r22 != (-1)) goto L6;
        return false;
    L6:
        m259k(r22);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r6) {
        int r0 = r6.length;
        int r1 = this.f348c;
        if (r0 >= r1) goto L6;
        r6 = (Object[]) Array.newInstance(r6.getClass().getComponentType(), r1);
    L6:
        int r02 = m257h(this.f346a + this.f348c);
        int r12 = this.f346a;
        if (r12 >= r02) goto L10;
        AbstractC0650P4.m1311F(this.f347b, r6, r12, r02, 2);
    L12:
        int r03 = this.f348c;
        if (r03 >= r6.length) goto L15;
        r6[r03] = null;
    L15:
        return r6;
    L10:
        if (isEmpty() == true) goto L12;
        Object[] r13 = this.f347b;
        AbstractC0650P4.m1310E(r13, r6, 0, this.f346a, r13.length);
        Object[] r14 = this.f347b;
        AbstractC0650P4.m1310E(r14, r6, r14.length - this.f346a, 0, r02);
        goto L12
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r1) {
        addLast(r1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r3) {
        if (r3.isEmpty() == false) goto L6;
        return false;
    L6:
        m258j();
        int r0 = this.f348c;
        m253b(r3.size() + r0);
        m252a(m257h(this.f346a + this.f348c), r3);
        return true;
    }
}
