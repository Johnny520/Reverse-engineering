package p009E0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0178i extends AbstractC0176g {

    /* JADX INFO: renamed from: d */
    public static final Object[] f393d = null;

    /* JADX INFO: renamed from: a */
    public int f394a;

    /* JADX INFO: renamed from: b */
    public Object[] f395b;

    /* JADX INFO: renamed from: c */
    public int f396c;

    static {
        f393d = new Object[0];
    }

    public C0178i() {
        this.f395b = f393d;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: a */
    public final int mo521a() {
        return this.f396c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, Object r9) {
        int r02 = this.f396c;
        if (r8 < 0) goto L33;
        if (r8 > r02) goto L33;
        if (r8 != r02) goto L8;
        addLast(r9);
        return;
    L8:
        if (r8 != 0) goto L11;
        addFirst(r9);
        return;
    L11:
        m529i();
        m524d(this.f396c + 1);
        int r03 = m528h(this.f394a + r8);
        int r2 = this.f396c;
        if (r8 < ((r2 + 1) >> 1)) goto L14;
        int r82 = m528h(r2 + this.f394a);
        if (r03 >= r82) goto L28;
        Object[] r22 = this.f395b;
        AbstractC0179j.m533j0(r22, r22, r03 + 1, r03, r82);
    L29:
        this.f395b[r03] = r9;
    L30:
        this.f396c++;
        return;
    L28:
        Object[] r23 = this.f395b;
        AbstractC0179j.m533j0(r23, r23, 1, 0, r82);
        Object[] r83 = this.f395b;
        r83[0] = r83[r83.length - 1];
        AbstractC0179j.m533j0(r83, r83, r03 + 1, r03, r83.length - 1);
        goto L29
    L14:
        if (r03 != 0) goto L16;
        Object[] r04 = this.f395b;
        AbstractC0307g.m703e(r04, "<this>");
        r03 = r04.length;
    L16:
        int r05 = r03 - 1;
        int r24 = this.f394a;
        if (r24 != 0) goto L19;
        Object[] r25 = this.f395b;
        AbstractC0307g.m703e(r25, "<this>");
        int r84 = r25.length - 1;
    L20:
        int r26 = this.f394a;
        if (r05 < r26) goto L23;
        Object[] r3 = this.f395b;
        r3[r84] = r3[r26];
        AbstractC0179j.m533j0(r3, r3, r26, r26 + 1, r05 + 1);
    L24:
        this.f395b[r05] = r9;
        this.f394a = r84;
        goto L30
    L23:
        Object[] r32 = this.f395b;
        AbstractC0179j.m533j0(r32, r32, r26 - 1, r26, r32.length);
        Object[] r27 = this.f395b;
        r27[r27.length - 1] = r27[0];
        AbstractC0179j.m533j0(r27, r27, 0, 1, r05 + 1);
        goto L24
    L19:
        r84 = r24 - 1;
    L33:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r8, ", size: ", r02));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, Collection r10) {
        AbstractC0307g.m703e(r10, "elements");
        int r02 = this.f396c;
        if (r9 < 0) goto L43;
        if (r9 > r02) goto L43;
        if (r10.isEmpty() == false) goto L9;
        return false;
    L9:
        if (r9 == this.f396c) goto L11;
        m529i();
        int r03 = this.f396c;
        m524d(r10.size() + r03);
        int r04 = this.f394a;
        int r05 = m528h(this.f396c + r04);
        int r2 = m528h(this.f394a + r9);
        int r3 = r10.size();
        if (r9 >= ((this.f396c + 1) >> 1)) goto L27;
        int r92 = this.f394a;
        int r06 = r92 - r3;
        if (r2 < r92) goto L22;
        if (r06 < 0) goto L18;
        Object[] r1 = this.f395b;
        AbstractC0179j.m533j0(r1, r1, r06, r92, r2);
    L26:
        this.f394a = r06;
        m523c(m526f(r2 - r3), r10);
    L41:
        return true;
    L18:
        Object[] r4 = this.f395b;
        r06 = r06 + r4.length;
        int r6 = r2 - r92;
        int r7 = r4.length - r06;
        if (r7 < r6) goto L21;
        AbstractC0179j.m533j0(r4, r4, r06, r92, r2);
        goto L26
    L21:
        AbstractC0179j.m533j0(r4, r4, r06, r92, r92 + r7);
        Object[] r93 = this.f395b;
        AbstractC0179j.m533j0(r93, r93, 0, this.f394a + r7, r2);
        goto L26
    L22:
        Object[] r42 = this.f395b;
        AbstractC0179j.m533j0(r42, r42, r06, r92, r42.length);
        if (r3 < r2) goto L25;
        Object[] r94 = this.f395b;
        AbstractC0179j.m533j0(r94, r94, r94.length - r3, 0, r2);
        goto L26
    L25:
        Object[] r95 = this.f395b;
        AbstractC0179j.m533j0(r95, r95, r95.length - r3, 0, r3);
        Object[] r96 = this.f395b;
        AbstractC0179j.m533j0(r96, r96, 0, r3, r2);
        goto L26
    L27:
        int r97 = r2 + r3;
        if (r2 >= r05) goto L36;
        int r32 = r3 + r05;
        Object[] r43 = this.f395b;
        if (r32 > r43.length) goto L33;
        AbstractC0179j.m533j0(r43, r43, r97, r2, r05);
    L40:
        m523c(r2, r10);
        goto L41
    L33:
        if (r97 < r43.length) goto L35;
        AbstractC0179j.m533j0(r43, r43, r97 - r43.length, r2, r05);
        goto L40
    L35:
        int r33 = r05 - (r32 - r43.length);
        AbstractC0179j.m533j0(r43, r43, 0, r33, r05);
        Object[] r07 = this.f395b;
        AbstractC0179j.m533j0(r07, r07, r97, r2, r33);
        goto L40
    L36:
        Object[] r44 = this.f395b;
        AbstractC0179j.m533j0(r44, r44, r3, 0, r05);
        Object[] r08 = this.f395b;
        if (r97 < r08.length) goto L39;
        AbstractC0179j.m533j0(r08, r08, r97 - r08.length, r2, r08.length);
        goto L40
    L39:
        AbstractC0179j.m533j0(r08, r08, 0, r08.length - r3, r08.length);
        Object[] r09 = this.f395b;
        AbstractC0179j.m533j0(r09, r09, r97, r2, r09.length - r3);
        goto L40
    L11:
        return addAll(r10);
    L43:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r9, ", size: ", r02));
    }

    public final void addFirst(Object r3) {
        m529i();
        m524d(this.f396c + 1);
        int r02 = this.f394a;
        if (r02 != 0) goto L5;
        Object[] r03 = this.f395b;
        AbstractC0307g.m703e(r03, "<this>");
        r02 = r03.length;
    L5:
        int r04 = r02 - 1;
        this.f394a = r04;
        this.f395b[r04] = r3;
        this.f396c++;
    }

    public final void addLast(Object r4) {
        m529i();
        m524d(mo521a() + 1);
        Object[] r02 = this.f395b;
        int r1 = this.f394a;
        r02[m528h(mo521a() + r1)] = r4;
        this.f396c = mo521a() + 1;
    }

    @Override // p009E0.AbstractC0176g
    /* JADX INFO: renamed from: b */
    public final Object mo522b(int r9) {
        int r02 = this.f396c;
        if (r9 < 0) goto L27;
        if (r9 >= r02) goto L27;
        if (r9 == AbstractC0182m.m555g0(this)) goto L8;
        if (r9 == 0) goto L11;
        m529i();
        int r03 = m528h(this.f394a + r9);
        Object[] r1 = this.f395b;
        Object r2 = r1[r03];
        if (r9 >= (this.f396c >> 1)) goto L19;
        int r92 = this.f394a;
        if (r03 < r92) goto L17;
        AbstractC0179j.m533j0(r1, r1, r92 + 1, r92, r03);
    L18:
        Object[] r93 = this.f395b;
        int r04 = this.f394a;
        r93[r04] = null;
        this.f394a = m525e(r04);
    L24:
        this.f396c--;
        return r2;
    L17:
        AbstractC0179j.m533j0(r1, r1, 1, 0, r03);
        Object[] r94 = this.f395b;
        r94[0] = r94[r94.length - 1];
        int r05 = this.f394a;
        AbstractC0179j.m533j0(r94, r94, r05 + 1, r05, r94.length - 1);
        goto L18
    L19:
        int r95 = m528h(AbstractC0182m.m555g0(this) + this.f394a);
        if (r03 > r95) goto L22;
        Object[] r12 = this.f395b;
        AbstractC0179j.m533j0(r12, r12, r03, r03 + 1, r95 + 1);
    L23:
        this.f395b[r95] = null;
        goto L24
    L22:
        Object[] r13 = this.f395b;
        AbstractC0179j.m533j0(r13, r13, r03, r03 + 1, r13.length);
        Object[] r06 = this.f395b;
        r06[r06.length - 1] = r06[0];
        AbstractC0179j.m533j0(r06, r06, 0, 1, r95 + 1);
        goto L23
    L11:
        return removeFirst();
    L8:
        return removeLast();
    L27:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r9, ", size: ", r02));
    }

    /* JADX INFO: renamed from: c */
    public final void m523c(int r5, Collection r6) {
        Iterator r02 = r6.iterator();
        int r1 = this.f395b.length;
    L3:
        if (r5 >= r1) goto L7;
        if (r02.hasNext() == false) goto L7;
        this.f395b[r5] = r02.next();
        r5 = r5 + 1;
    L7:
        int r52 = this.f394a;
        int r12 = 0;
    L8:
        if (r12 >= r52) goto L12;
        if (r02.hasNext() == false) goto L12;
        this.f395b[r12] = r02.next();
        r12 = r12 + 1;
    L12:
        int r53 = mo521a();
        this.f396c = r6.size() + r53;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if ((!isEmpty()) == false) goto L5;
        m529i();
        m527g(this.f394a, m528h(mo521a() + this.f394a));
    L5:
        this.f394a = 0;
        this.f396c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r2) {
        if (indexOf(r2) == (-1)) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m524d(int r5) {
        if (r5 < 0) goto L24;
        Object[] r02 = this.f395b;
        if (r5 > r02.length) goto L7;
        return;
    L7:
        if (r02 == f393d) goto L9;
        int r1 = r02.length;
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
        AbstractC0179j.m533j0(r02, r52, 0, this.f394a, r02.length);
        Object[] r03 = this.f395b;
        int r13 = r03.length;
        int r2 = this.f394a;
        AbstractC0179j.m533j0(r03, r52, r13 - r2, 0, r2);
        this.f394a = 0;
        this.f395b = r52;
        return;
    L9:
        if (r5 >= 10) goto L11;
        r5 = 10;
    L11:
        this.f395b = new Object[r5];
        return;
    L24:
        throw new IllegalStateException("Deque is too big.");
    }

    /* JADX INFO: renamed from: e */
    public final int m525e(int r3) {
        AbstractC0307g.m703e(this.f395b, "<this>");
        if (r3 != (r0.length - 1)) goto L6;
        return 0;
    L6:
        return r3 + 1;
    }

    /* JADX INFO: renamed from: f */
    public final int m526f(int r2) {
        if (r2 < 0) goto L4;
        return r2;
    L4:
        return r2 + this.f395b.length;
    }

    /* JADX INFO: renamed from: g */
    public final void m527g(int r3, int r4) {
        if (r3 >= r4) goto L4;
        AbstractC0179j.m534k0(this.f395b, r3, r4);
        return;
    L4:
        Object[] r02 = this.f395b;
        AbstractC0179j.m534k0(r02, r3, r02.length);
        AbstractC0179j.m534k0(this.f395b, 0, r4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        int r02 = mo521a();
        if (r5 < 0) goto L8;
        if (r5 >= r02) goto L8;
        return this.f395b[m528h(this.f394a + r5)];
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }

    /* JADX INFO: renamed from: h */
    public final int m528h(int r3) {
        Object[] r02 = this.f395b;
        if (r3 >= r02.length) goto L5;
        return r3;
    L5:
        return r3 - r02.length;
    }

    /* JADX INFO: renamed from: i */
    public final void m529i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        int r02 = this.f394a;
        int r03 = m528h(mo521a() + r02);
        int r1 = this.f394a;
        if (r1 >= r03) goto L11;
    L4:
        if (r1 >= r03) goto L32;
        if (AbstractC0307g.m699a(r5, this.f395b[r1]) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        int r52 = this.f394a;
    L9:
        return r1 - r52;
    L32:
        return -1;
    L11:
        if (r1 < r03) goto L24;
        int r2 = this.f395b.length;
    L13:
        if (r1 >= r2) goto L18;
        if (AbstractC0307g.m699a(r5, this.f395b[r1]) == true) goto L16;
        r1 = r1 + 1;
        goto L13
    L16:
        r52 = this.f394a;
        goto L9
    L18:
        int r12 = 0;
    L19:
        if (r12 >= r03) goto L33;
        if (AbstractC0307g.m699a(r5, this.f395b[r12]) == true) goto L22;
        r12 = r12 + 1;
        goto L19
    L22:
        r1 = r12 + this.f395b.length;
        r52 = this.f394a;
        goto L9
    L33:
        return -1;
    L24:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (mo521a() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r5) {
        int r02 = m528h(this.f396c + this.f394a);
        int r1 = this.f394a;
        if (r1 >= r02) goto L13;
        int r03 = r02 - 1;
        if (r1 <= r03) goto L7;
    L27:
        return -1;
    L7:
        if (AbstractC0307g.m699a(r5, this.f395b[r03]) == true) goto L8;
        if (r03 == r1) goto L27;
        r03 = r03 - 1;
        goto L7
    L8:
        int r52 = this.f394a;
    L10:
        return r03 - r52;
    L13:
        if (r1 <= r02) goto L27;
        int r04 = r02 - 1;
    L15:
        if ((-1) >= r04) goto L20;
        if (AbstractC0307g.m699a(r5, this.f395b[r04]) == true) goto L18;
        r04 = r04 - 1;
        goto L15
    L18:
        r03 = r04 + this.f395b.length;
        r52 = this.f394a;
        goto L10
    L20:
        Object[] r05 = this.f395b;
        AbstractC0307g.m703e(r05, "<this>");
        r03 = r05.length - 1;
        int r12 = this.f394a;
        if (r12 > r03) goto L27;
    L23:
        if (AbstractC0307g.m699a(r5, this.f395b[r03]) == true) goto L24;
        if (r03 == r12) goto L27;
        r03 = r03 - 1;
        goto L23
    L24:
        r52 = this.f394a;
        goto L10
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r2) {
        int r22 = indexOf(r2);
        if (r22 != (-1)) goto L6;
        return false;
    L6:
        mo522b(r22);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r11) {
        AbstractC0307g.m703e(r11, "elements");
        boolean r1 = false;
        r1 = false;
        int r12 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L35:
        return r1;
    L5:
        if (this.f395b.length == 0) goto L35;
        int r02 = m528h(this.f396c + this.f394a);
        int r2 = this.f394a;
        if (r2 >= r02) goto L17;
        int r4 = r2;
    L10:
        if (r2 >= r02) goto L16;
        Object r5 = this.f395b[r2];
        if ((!r11.contains(r5)) == false) goto L14;
        this.f395b[r4] = r5;
        r4 = r4 + 1;
    L15:
        r2 = r2 + 1;
        goto L10
    L14:
        r1 = true;
        goto L15
    L16:
        AbstractC0179j.m534k0(this.f395b, r4, r02);
    L33:
        if (r1 == false) goto L35;
        m529i();
        this.f396c = m526f(r4 - this.f394a);
        goto L35
    L17:
        int r42 = this.f395b.length;
        boolean r6 = false;
        int r52 = r2;
    L19:
        if (r2 >= r42) goto L25;
        Object[] r8 = this.f395b;
        Object r9 = r8[r2];
        r8[r2] = null;
        if ((!r11.contains(r9)) == false) goto L23;
        this.f395b[r52] = r9;
        r52 = r52 + 1;
    L24:
        r2 = r2 + 1;
        goto L19
    L23:
        r6 = true;
        goto L24
    L25:
        r4 = m528h(r52);
    L26:
        if (r12 >= r02) goto L32;
        Object[] r22 = this.f395b;
        Object r53 = r22[r12];
        r22[r12] = null;
        if ((!r11.contains(r53)) == false) goto L30;
        this.f395b[r4] = r53;
        r4 = m525e(r4);
    L31:
        r12 = r12 + 1;
        goto L26
    L30:
        r6 = true;
        goto L31
    L32:
        r1 = r6;
        goto L33
    }

    public final Object removeFirst() {
        if (isEmpty() == true) goto L7;
        m529i();
        Object[] r02 = this.f395b;
        int r1 = this.f394a;
        Object r2 = r02[r1];
        r02[r1] = null;
        this.f394a = m525e(r1);
        this.f396c = mo521a() - 1;
        return r2;
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (isEmpty() == true) goto L7;
        m529i();
        int r02 = m528h(AbstractC0182m.m555g0(this) + this.f394a);
        Object[] r1 = this.f395b;
        Object r2 = r1[r02];
        r1[r02] = null;
        this.f396c = mo521a() - 1;
        return r2;
    L7:
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
        AbstractC0040p.m107j(r8, r9, this.f396c);
        int r02 = r9 - r8;
        if (r02 != 0) goto L6;
        return;
    L6:
        if (r02 != this.f396c) goto L10;
        clear();
        return;
    L10:
        if (r02 != 1) goto L13;
        mo522b(r8);
        return;
    L13:
        m529i();
        if (r8 >= (this.f396c - r9)) goto L19;
        int r2 = m528h((r8 - 1) + this.f394a);
        int r92 = m528h((r9 - 1) + this.f394a);
    L16:
        if (r8 <= 0) goto L18;
        int r1 = r2 + 1;
        int r3 = Math.min(r8, Math.min(r1, r92 + 1));
        Object[] r4 = this.f395b;
        int r93 = r92 - r3;
        int r22 = r2 - r3;
        AbstractC0179j.m533j0(r4, r4, r93 + 1, r22 + 1, r1);
        r2 = m526f(r22);
        r92 = m526f(r93);
        r8 = r8 - r3;
        goto L16
    L18:
        int r82 = m528h(this.f394a + r02);
        m527g(this.f394a, r82);
        this.f394a = r82;
    L24:
        this.f396c -= r02;
        return;
    L19:
        int r12 = m528h(this.f394a + r9);
        int r83 = m528h(this.f394a + r8);
        int r23 = this.f396c;
    L20:
        r23 = r23 - r9;
        if (r23 <= 0) goto L23;
        Object[] r94 = this.f395b;
        r9 = Math.min(r23, Math.min(r94.length - r12, r94.length - r83));
        Object[] r32 = this.f395b;
        int r42 = r12 + r9;
        AbstractC0179j.m533j0(r32, r32, r83, r12, r42);
        r12 = m528h(r42);
        r83 = m528h(r83 + r9);
        goto L20
    L23:
        int r84 = m528h(this.f396c + this.f394a);
        m527g(m526f(r84 - r02), r84);
        goto L24
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r11) {
        AbstractC0307g.m703e(r11, "elements");
        boolean r1 = false;
        r1 = false;
        int r12 = 0;
        r1 = false;
        if (isEmpty() == false) goto L5;
    L35:
        return r1;
    L5:
        if (this.f395b.length == 0) goto L35;
        int r02 = m528h(this.f396c + this.f394a);
        int r2 = this.f394a;
        if (r2 >= r02) goto L17;
        int r4 = r2;
    L10:
        if (r2 >= r02) goto L16;
        Object r5 = this.f395b[r2];
        if (r11.contains(r5) == false) goto L14;
        this.f395b[r4] = r5;
        r4 = r4 + 1;
    L15:
        r2 = r2 + 1;
        goto L10
    L14:
        r1 = true;
        goto L15
    L16:
        AbstractC0179j.m534k0(this.f395b, r4, r02);
    L33:
        if (r1 == false) goto L35;
        m529i();
        this.f396c = m526f(r4 - this.f394a);
        goto L35
    L17:
        int r42 = this.f395b.length;
        boolean r6 = false;
        int r52 = r2;
    L19:
        if (r2 >= r42) goto L25;
        Object[] r8 = this.f395b;
        Object r9 = r8[r2];
        r8[r2] = null;
        if (r11.contains(r9) == false) goto L23;
        this.f395b[r52] = r9;
        r52 = r52 + 1;
    L24:
        r2 = r2 + 1;
        goto L19
    L23:
        r6 = true;
        goto L24
    L25:
        r4 = m528h(r52);
    L26:
        if (r12 >= r02) goto L32;
        Object[] r22 = this.f395b;
        Object r53 = r22[r12];
        r22[r12] = null;
        if (r11.contains(r53) == false) goto L30;
        this.f395b[r4] = r53;
        r4 = m525e(r4);
    L31:
        r12 = r12 + 1;
        goto L26
    L30:
        r6 = true;
        goto L31
    L32:
        r1 = r6;
        goto L33
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object r5) {
        int r02 = mo521a();
        if (r4 < 0) goto L8;
        if (r4 >= r02) goto L8;
        int r42 = m528h(this.f394a + r4);
        Object[] r03 = this.f395b;
        Object r1 = r03[r42];
        r03[r42] = r5;
        return r1;
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r4, ", size: ", r02));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo521a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r7) {
        AbstractC0307g.m703e(r7, "array");
        int r02 = r7.length;
        int r1 = this.f396c;
        if (r02 >= r1) goto L6;
        Object r72 = Array.newInstance(r7.getClass().getComponentType(), r1);
        AbstractC0307g.m701c(r72, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        r7 = (Object[]) r72;
    L6:
        int r03 = m528h(this.f396c + this.f394a);
        int r12 = this.f394a;
        if (r12 >= r03) goto L16;
        Object[] r2 = this.f395b;
        if ((2 & 4) == 0) goto L12;
        r12 = 0;
    L12:
        if ((2 & 8) == 0) goto L14;
        r03 = r2.length;
    L14:
        AbstractC0179j.m533j0(r2, r7, 0, r12, r03);
    L18:
        AbstractC0040p.m95a0(this.f396c, r7);
        return r7;
    L16:
        if ((!isEmpty()) == false) goto L18;
        Object[] r13 = this.f395b;
        AbstractC0179j.m533j0(r13, r7, 0, this.f394a, r13.length);
        Object[] r14 = this.f395b;
        AbstractC0179j.m533j0(r14, r7, r14.length - this.f394a, 0, r03);
        goto L18
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r1) {
        addLast(r1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r3) {
        AbstractC0307g.m703e(r3, "elements");
        if (r3.isEmpty() == false) goto L6;
        return false;
    L6:
        m529i();
        int r02 = mo521a();
        m524d(r3.size() + r02);
        int r03 = this.f394a;
        m523c(m528h(mo521a() + r03), r3);
        return true;
    }
}
