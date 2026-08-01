package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class k6 extends AbstractList implements List {
    public static final Object[] d = null;
    public int a;
    public Object[] b;
    public int c;

    static {
        d = new Object[0];
    }

    public k6() {
        this.b = d;
    }

    public final void a(int r5, Collection r6) {
        Iterator r0 = r6.iterator();
        int r1 = this.b.length;
    L3:
        if (r5 >= r1) goto L7;
        if (r0.hasNext() == false) goto L7;
        this.b[r5] = r0.next();
        r5 = r5 + 1;
    L7:
        int r52 = this.a;
        int r12 = 0;
    L8:
        if (r12 >= r52) goto L12;
        if (r0.hasNext() == false) goto L12;
        this.b[r12] = r0.next();
        r12 = r12 + 1;
    L12:
        int r53 = this.c;
        this.c = r6.size() + r53;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, Object r9) {
        int r0 = this.c;
        if (r8 < 0) goto L37;
        if (r8 > r0) goto L37;
        if (r8 != r0) goto L9;
        addLast(r9);
        return;
    L9:
        if (r8 != 0) goto L15;
        g();
        b(this.c + 1);
        int r82 = this.a;
        if (r82 != 0) goto L13;
        Object[] r83 = this.b;
        ip.o("<this>", r83);
        r82 = r83.length;
    L13:
        int r84 = r82 - 1;
        this.a = r84;
        this.b[r84] = r9;
        this.c++;
        return;
    L15:
        g();
        b(this.c + 1);
        int r2 = f(this.a + r8);
        int r3 = this.c;
        if (r8 >= ((r3 + 1) >> 1)) goto L29;
        if (r2 != 0) goto L19;
        Object[] r85 = this.b;
        ip.o("<this>", r85);
        int r86 = r85.length - 1;
    L20:
        int r22 = this.a;
        if (r22 != 0) goto L23;
        Object[] r23 = this.b;
        ip.o("<this>", r23);
        int r02 = r23.length - 1;
    L24:
        int r24 = this.a;
        if (r86 < r24) goto L27;
        Object[] r32 = this.b;
        r32[r02] = r32[r24];
        r6.b0(r32, r32, r24, r24 + 1, r86 + 1);
    L28:
        this.b[r86] = r9;
        this.a = r02;
    L34:
        this.c++;
        return;
    L27:
        Object[] r33 = this.b;
        r6.b0(r33, r33, r24 - 1, r24, r33.length);
        Object[] r25 = this.b;
        r25[r25.length - 1] = r25[0];
        r6.b0(r25, r25, 0, 1, r86 + 1);
        goto L28
    L23:
        r02 = r22 - 1;
        goto L24
    L19:
        r86 = r2 - 1;
        goto L20
    L29:
        int r87 = f(this.a + r3);
        if (r2 >= r87) goto L32;
        Object[] r03 = this.b;
        r6.b0(r03, r03, r2 + 1, r2, r87);
    L33:
        this.b[r2] = r9;
        goto L34
    L32:
        Object[] r04 = this.b;
        r6.b0(r04, r04, 1, 0, r87);
        Object[] r88 = this.b;
        r88[0] = r88[r88.length - 1];
        r6.b0(r88, r88, r2 + 1, r2, r88.length - 1);
    L37:
        throw new IndexOutOfBoundsException("index: " + r8 + ", size: " + r0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, Collection r10) {
        ip.o("elements", r10);
        int r0 = this.c;
        if (r9 < 0) goto L44;
        if (r9 > r0) goto L44;
        if (r10.isEmpty() == false) goto L9;
        return false;
    L9:
        if (r9 == this.c) goto L11;
        g();
        b(r10.size() + this.c);
        int r02 = f(this.a + this.c);
        int r2 = f(this.a + r9);
        int r3 = r10.size();
        if (r9 >= ((this.c + 1) >> 1)) goto L28;
        int r92 = this.a;
        int r03 = r92 - r3;
        if (r2 < r92) goto L22;
        if (r03 < 0) goto L18;
        Object[] r1 = this.b;
        r6.b0(r1, r1, r03, r92, r2);
    L26:
        this.a = r03;
        a(d(r2 - r3), r10);
        return true;
    L18:
        Object[] r4 = this.b;
        r03 = r03 + r4.length;
        int r6 = r2 - r92;
        int r7 = r4.length - r03;
        if (r7 < r6) goto L21;
        r6.b0(r4, r4, r03, r92, r2);
        goto L26
    L21:
        r6.b0(r4, r4, r03, r92, r92 + r7);
        Object[] r93 = this.b;
        r6.b0(r93, r93, 0, this.a + r7, r2);
        goto L26
    L22:
        Object[] r42 = this.b;
        r6.b0(r42, r42, r03, r92, r42.length);
        if (r3 < r2) goto L25;
        Object[] r94 = this.b;
        r6.b0(r94, r94, r94.length - r3, 0, r2);
        goto L26
    L25:
        Object[] r95 = this.b;
        r6.b0(r95, r95, r95.length - r3, 0, r3);
        Object[] r96 = this.b;
        r6.b0(r96, r96, 0, r3, r2);
        goto L26
    L28:
        int r97 = r2 + r3;
        if (r2 >= r02) goto L37;
        int r32 = r3 + r02;
        Object[] r43 = this.b;
        if (r32 > r43.length) goto L34;
        r6.b0(r43, r43, r97, r2, r02);
    L41:
        a(r2, r10);
        return true;
    L34:
        if (r97 < r43.length) goto L36;
        r6.b0(r43, r43, r97 - r43.length, r2, r02);
        goto L41
    L36:
        int r33 = r02 - (r32 - r43.length);
        r6.b0(r43, r43, 0, r33, r02);
        Object[] r04 = this.b;
        r6.b0(r04, r04, r97, r2, r33);
        goto L41
    L37:
        Object[] r44 = this.b;
        r6.b0(r44, r44, r3, 0, r02);
        Object[] r05 = this.b;
        if (r97 < r05.length) goto L40;
        r6.b0(r05, r05, r97 - r05.length, r2, r05.length);
        goto L41
    L40:
        r6.b0(r05, r05, 0, r05.length - r3, r05.length);
        Object[] r06 = this.b;
        r6.b0(r06, r06, r97, r2, r06.length - r3);
        goto L41
    L11:
        return addAll(r10);
    L44:
        throw new IndexOutOfBoundsException("index: " + r9 + ", size: " + r0);
    }

    public final void addLast(Object r4) {
        g();
        b(this.c + 1);
        this.b[f(this.a + this.c)] = r4;
        this.c++;
    }

    public final void b(int r5) {
        if (r5 < 0) goto L24;
        Object[] r0 = this.b;
        if (r5 > r0.length) goto L7;
        return;
    L7:
        if (r0 == d) goto L9;
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
        r6.b0(r0, r52, 0, this.a, r0.length);
        Object[] r02 = this.b;
        int r13 = r02.length;
        int r2 = this.a;
        r6.b0(r02, r52, r13 - r2, 0, r2);
        this.a = 0;
        this.b = r52;
        return;
    L9:
        if (r5 >= 10) goto L11;
        r5 = 10;
    L11:
        this.b = new Object[r5];
        return;
    L24:
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int r3) {
        ip.o("<this>", this.b);
        if (r3 != (r0.length - 1)) goto L7;
        return 0;
    L7:
        return r3 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (isEmpty() == true) goto L5;
        g();
        int r0 = f(this.a + this.c);
        e(this.a, r0);
    L5:
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r2) {
        if (indexOf(r2) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    public final int d(int r2) {
        if (r2 < 0) goto L4;
        return r2;
    L4:
        return r2 + this.b.length;
    }

    public final void e(int r5, int r6) {
        if (r5 >= r6) goto L6;
        Object[] r2 = this.b;
        ip.o("<this>", r2);
        Arrays.fill(r2, r5, r6, null);
        return;
    L6:
        Object[] r22 = this.b;
        Arrays.fill(r22, r5, r22.length, null);
        Object[] r52 = this.b;
        ip.o("<this>", r52);
        Arrays.fill(r52, 0, r6, null);
    }

    public final int f(int r3) {
        Object[] r0 = this.b;
        if (r3 >= r0.length) goto L5;
        return r3;
    L5:
        return r3 - r0.length;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        int r0 = this.c;
        if (r5 < 0) goto L8;
        if (r5 >= r0) goto L8;
        return this.b[f(this.a + r5)];
    L8:
        throw new IndexOutOfBoundsException("index: " + r5 + ", size: " + r0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        int r0 = f(this.a + this.c);
        int r1 = this.a;
        if (r1 >= r0) goto L11;
    L4:
        if (r1 >= r0) goto L32;
        if (ip.i(r5, this.b[r1]) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        int r52 = this.a;
    L9:
        return r1 - r52;
    L32:
        return -1;
    L11:
        if (r1 < r0) goto L24;
        int r2 = this.b.length;
    L13:
        if (r1 >= r2) goto L18;
        if (ip.i(r5, this.b[r1]) == true) goto L16;
        r1 = r1 + 1;
        goto L13
    L16:
        r52 = this.a;
        goto L9
    L18:
        int r12 = 0;
    L19:
        if (r12 >= r0) goto L33;
        if (ip.i(r5, this.b[r12]) == true) goto L22;
        r12 = r12 + 1;
        goto L19
    L22:
        r1 = r12 + this.b.length;
        r52 = this.a;
        goto L9
    L33:
        return -1;
    L24:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.c != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r5) {
        int r0 = f(this.a + this.c);
        int r1 = this.a;
        if (r1 >= r0) goto L13;
        int r02 = r0 - 1;
        if (r1 <= r02) goto L7;
    L27:
        return -1;
    L7:
        if (ip.i(r5, this.b[r02]) == true) goto L8;
        if (r02 == r1) goto L27;
        r02 = r02 - 1;
        goto L7
    L8:
        int r52 = this.a;
    L10:
        return r02 - r52;
    L13:
        if (r1 <= r0) goto L27;
        int r03 = r0 - 1;
    L15:
        if ((-1) >= r03) goto L20;
        if (ip.i(r5, this.b[r03]) == true) goto L18;
        r03 = r03 - 1;
        goto L15
    L18:
        r02 = r03 + this.b.length;
        r52 = this.a;
        goto L10
    L20:
        Object[] r04 = this.b;
        ip.o("<this>", r04);
        r02 = r04.length - 1;
        int r12 = this.a;
        if (r12 > r02) goto L27;
    L23:
        if (ip.i(r5, this.b[r02]) == true) goto L24;
        if (r02 == r12) goto L27;
        r02 = r02 - 1;
        goto L23
    L24:
        r52 = this.a;
        goto L10
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int r9) {
        int r0 = this.c;
        if (r9 < 0) goto L31;
        if (r9 >= r0) goto L31;
        if (r9 == (size() - 1)) goto L8;
        if (r9 == 0) goto L15;
        g();
        int r02 = f(this.a + r9);
        Object[] r3 = this.b;
        Object r4 = r3[r02];
        if (r9 >= (this.c >> 1)) goto L23;
        int r92 = this.a;
        if (r02 < r92) goto L21;
        r6.b0(r3, r3, r92 + 1, r92, r02);
    L22:
        Object[] r93 = this.b;
        int r03 = this.a;
        r93[r03] = null;
        this.a = c(r03);
    L28:
        this.c--;
        return r4;
    L21:
        r6.b0(r3, r3, 1, 0, r02);
        Object[] r94 = this.b;
        r94[0] = r94[r94.length - 1];
        int r04 = this.a;
        r6.b0(r94, r94, r04 + 1, r04, r94.length - 1);
        goto L22
    L23:
        int r95 = f((size() - 1) + this.a);
        if (r02 > r95) goto L26;
        Object[] r32 = this.b;
        r6.b0(r32, r32, r02, r02 + 1, r95 + 1);
    L27:
        this.b[r95] = null;
        goto L28
    L26:
        Object[] r33 = this.b;
        r6.b0(r33, r33, r02, r02 + 1, r33.length);
        Object[] r05 = this.b;
        r05[r05.length - 1] = r05[0];
        r6.b0(r05, r05, 0, 1, r95 + 1);
        goto L27
    L15:
        return removeFirst();
    L8:
        if (isEmpty() == true) goto L12;
        g();
        int r96 = f((size() - 1) + this.a);
        Object[] r06 = this.b;
        Object r34 = r06[r96];
        r06[r96] = null;
        this.c--;
        return r34;
    L12:
        throw new NoSuchElementException("ArrayDeque is empty.");
    L31:
        throw new IndexOutOfBoundsException("index: " + r9 + ", size: " + r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r12) {
        ip.o("elements", r12);
        boolean r1 = false;
        r1 = false;
        int r13 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L34:
        return r1;
    L5:
        if (this.b.length == 0) goto L34;
        int r0 = f(this.a + this.c);
        int r2 = this.a;
        if (r2 >= r0) goto L17;
        int r5 = r2;
    L10:
        if (r2 >= r0) goto L16;
        Object r6 = this.b[r2];
        if (r12.contains(r6) == true) goto L14;
        this.b[r5] = r6;
        r5 = r5 + 1;
    L15:
        r2 = r2 + 1;
        goto L10
    L14:
        r1 = true;
        goto L15
    L16:
        Object[] r122 = this.b;
        ip.o("<this>", r122);
        Arrays.fill(r122, r5, r0, null);
    L32:
        if (r1 == false) goto L34;
        g();
        this.c = d(r5 - this.a);
        goto L34
    L17:
        int r52 = this.b.length;
        boolean r7 = false;
        int r62 = r2;
    L18:
        if (r2 >= r52) goto L24;
        Object[] r8 = this.b;
        Object r9 = r8[r2];
        r8[r2] = null;
        if (r12.contains(r9) == true) goto L22;
        this.b[r62] = r9;
        r62 = r62 + 1;
    L23:
        r2 = r2 + 1;
        goto L18
    L22:
        r7 = true;
        goto L23
    L24:
        r5 = f(r62);
    L25:
        if (r13 >= r0) goto L31;
        Object[] r22 = this.b;
        Object r63 = r22[r13];
        r22[r13] = null;
        if (r12.contains(r63) == true) goto L29;
        this.b[r5] = r63;
        r5 = c(r5);
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
        g();
        Object[] r0 = this.b;
        int r1 = this.a;
        Object r2 = r0[r1];
        r0[r1] = null;
        this.a = c(r1);
        this.c--;
        return r2;
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
        a80.d(r8, r9, this.c);
        int r0 = r9 - r8;
        if (r0 != 0) goto L6;
        return;
    L6:
        if (r0 != this.c) goto L10;
        clear();
        return;
    L10:
        if (r0 != 1) goto L13;
        remove(r8);
        return;
    L13:
        g();
        if (r8 >= (this.c - r9)) goto L19;
        int r2 = f((r8 - 1) + this.a);
        int r92 = f((r9 - 1) + this.a);
    L16:
        if (r8 <= 0) goto L18;
        int r1 = r2 + 1;
        int r3 = Math.min(r8, Math.min(r1, r92 + 1));
        Object[] r4 = this.b;
        int r93 = r92 - r3;
        int r22 = r2 - r3;
        r6.b0(r4, r4, r93 + 1, r22 + 1, r1);
        r2 = d(r22);
        r92 = d(r93);
        r8 = r8 - r3;
        goto L16
    L18:
        int r82 = f(this.a + r0);
        e(this.a, r82);
        this.a = r82;
    L24:
        this.c -= r0;
        return;
    L19:
        int r12 = f(this.a + r9);
        int r83 = f(this.a + r8);
        int r23 = this.c;
    L20:
        r23 = r23 - r9;
        if (r23 <= 0) goto L23;
        Object[] r94 = this.b;
        r9 = Math.min(r23, Math.min(r94.length - r12, r94.length - r83));
        Object[] r32 = this.b;
        int r42 = r12 + r9;
        r6.b0(r32, r32, r83, r12, r42);
        r12 = f(r42);
        r83 = f(r83 + r9);
        goto L20
    L23:
        int r84 = f(this.a + this.c);
        e(d(r84 - r0), r84);
        goto L24
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r12) {
        ip.o("elements", r12);
        boolean r1 = false;
        r1 = false;
        int r13 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L34:
        return r1;
    L5:
        if (this.b.length == 0) goto L34;
        int r0 = f(this.a + this.c);
        int r2 = this.a;
        if (r2 >= r0) goto L17;
        int r5 = r2;
    L10:
        if (r2 >= r0) goto L16;
        Object r6 = this.b[r2];
        if (r12.contains(r6) == false) goto L14;
        this.b[r5] = r6;
        r5 = r5 + 1;
    L15:
        r2 = r2 + 1;
        goto L10
    L14:
        r1 = true;
        goto L15
    L16:
        Object[] r122 = this.b;
        ip.o("<this>", r122);
        Arrays.fill(r122, r5, r0, null);
    L32:
        if (r1 == false) goto L34;
        g();
        this.c = d(r5 - this.a);
        goto L34
    L17:
        int r52 = this.b.length;
        boolean r7 = false;
        int r62 = r2;
    L18:
        if (r2 >= r52) goto L24;
        Object[] r8 = this.b;
        Object r9 = r8[r2];
        r8[r2] = null;
        if (r12.contains(r9) == false) goto L22;
        this.b[r62] = r9;
        r62 = r62 + 1;
    L23:
        r2 = r2 + 1;
        goto L18
    L22:
        r7 = true;
        goto L23
    L24:
        r5 = f(r62);
    L25:
        if (r13 >= r0) goto L31;
        Object[] r22 = this.b;
        Object r63 = r22[r13];
        r22[r13] = null;
        if (r12.contains(r63) == false) goto L29;
        this.b[r5] = r63;
        r5 = c(r5);
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
        int r0 = this.c;
        if (r4 < 0) goto L8;
        if (r4 >= r0) goto L8;
        int r42 = f(this.a + r4);
        Object[] r02 = this.b;
        Object r1 = r02[r42];
        r02[r42] = r5;
        return r1;
    L8:
        throw new IndexOutOfBoundsException("index: " + r4 + ", size: " + r0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r6) {
        ip.o("array", r6);
        int r0 = r6.length;
        int r1 = this.c;
        if (r0 >= r1) goto L6;
        Object r62 = Array.newInstance(r6.getClass().getComponentType(), r1);
        ip.m("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", r62);
        r6 = (Object[]) r62;
    L6:
        int r02 = f(this.a + this.c);
        int r12 = this.a;
        if (r12 >= r02) goto L10;
        r6.b0(this.b, r6, 0, r12, r02);
    L12:
        int r03 = this.c;
        if (r03 >= r6.length) goto L15;
        r6[r03] = null;
    L15:
        return r6;
    L10:
        if (isEmpty() == true) goto L12;
        Object[] r13 = this.b;
        r6.b0(r13, r6, 0, this.a, r13.length);
        Object[] r14 = this.b;
        r6.b0(r14, r6, r14.length - this.a, 0, r02);
        goto L12
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r2) {
        int r22 = indexOf(r2);
        if (r22 != (-1)) goto L6;
        return false;
    L6:
        remove(r22);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r1) {
        addLast(r1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r3) {
        ip.o("elements", r3);
        if (r3.isEmpty() == false) goto L6;
        return false;
    L6:
        g();
        int r0 = this.c;
        b(r3.size() + r0);
        a(f(this.a + this.c), r3);
        return true;
    }
}
