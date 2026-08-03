package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: O4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607O4 implements Collection, Set, InterfaceC0588Nm {

    /* JADX INFO: renamed from: a */
    public int[] f1945a;

    /* JADX INFO: renamed from: b */
    public Object[] f1946b;

    /* JADX INFO: renamed from: c */
    public int f1947c;

    public C0607O4() {
        this.f1945a = AbstractC0714Qj.f2294a;
        this.f1946b = AbstractC0714Qj.f2295b;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1186a(int r9) {
        int r0 = this.f1947c;
        Object[] r1 = this.f1946b;
        Object r2 = r1[r9];
        if (r0 > 1) goto L6;
        clear();
        return r2;
    L6:
        int r3 = r0 - 1;
        int[] r4 = this.f1945a;
        int r6 = 8;
        if (r4.length > 8) goto L9;
    L17:
        if (r9 >= r3) goto L19;
        int r12 = r9 + 1;
        AbstractC0650P4.m1309D(r9, r12, r4, r4, r0);
        Object[] r42 = this.f1946b;
        AbstractC0650P4.m1310E(r42, r42, r9, r12, r0);
    L19:
        this.f1946b[r3] = null;
    L21:
        if (r0 != this.f1947c) goto L25;
        this.f1947c = r3;
        return r2;
    L25:
        throw new ConcurrentModificationException();
    L9:
        if (r0 >= (r4.length / 3)) goto L17;
        if (r0 <= 8) goto L12;
        r6 = r0 + (r0 >> 1);
    L12:
        int[] r5 = new int[r6];
        this.f1945a = r5;
        this.f1946b = new Object[r6];
        if (r9 <= 0) goto L15;
        System.arraycopy(r4, 0, r5, 0, r9);
        AbstractC0650P4.m1311F(r1, this.f1946b, 0, r9, 6);
    L15:
        if (r9 >= r3) goto L21;
        int r62 = r9 + 1;
        AbstractC0650P4.m1309D(r9, r62, r4, this.f1945a, r0);
        AbstractC0650P4.m1310E(r1, this.f1946b, r9, r62, r0);
        goto L21
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object r10) {
        int r0 = this.f1947c;
        if (r10 != null) goto L5;
        int r2 = AbstractC0628Oj.m1223C(this, null, 0);
        int r3 = 0;
    L6:
        if (r2 < 0) goto L8;
        return false;
    L8:
        int r22 = ~r2;
        int[] r4 = this.f1945a;
        if (r0 < r4.length) goto L25;
        int r5 = 8;
        if (r0 < 8) goto L14;
        r5 = (r0 >> 1) + r0;
    L17:
        Object[] r6 = this.f1946b;
        int[] r7 = new int[r5];
        this.f1945a = r7;
        this.f1946b = new Object[r5];
        if (r0 != this.f1947c) goto L24;
        if (r7.length == 0) goto L25;
        System.arraycopy(r4, 0, r7, 0, r4.length);
        AbstractC0650P4.m1311F(r6, this.f1946b, 0, r6.length, 6);
        goto L25
    L24:
        throw new ConcurrentModificationException();
    L14:
        if (r0 >= 4) goto L17;
        r5 = 4;
    L25:
        if (r22 >= r0) goto L27;
        int[] r1 = this.f1945a;
        int r42 = r22 + 1;
        AbstractC0650P4.m1309D(r42, r22, r1, r1, r0);
        Object[] r12 = this.f1946b;
        AbstractC0650P4.m1310E(r12, r12, r42, r22, r0);
    L27:
        int r13 = this.f1947c;
        if (r0 != r13) goto L34;
        int[] r02 = this.f1945a;
        if (r22 >= r02.length) goto L34;
        r02[r22] = r3;
        this.f1946b[r22] = r10;
        this.f1947c = r13 + 1;
        return true;
    L34:
        throw new ConcurrentModificationException();
    L5:
        int r23 = r10.hashCode();
        r3 = r23;
        r2 = AbstractC0628Oj.m1223C(this, r10, r23);
        goto L6
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection r7) {
        int r0 = this.f1947c;
        int r1 = r7.size() + r0;
        int r02 = this.f1947c;
        int[] r2 = this.f1945a;
        boolean r4 = false;
        if (r2.length >= r1) goto L8;
        Object[] r3 = this.f1946b;
        int[] r5 = new int[r1];
        this.f1945a = r5;
        this.f1946b = new Object[r1];
        if (r02 <= 0) goto L8;
        System.arraycopy(r2, 0, r5, 0, r02);
        AbstractC0650P4.m1311F(r3, this.f1946b, 0, this.f1947c, 6);
    L8:
        if (this.f1947c != r02) goto L15;
        Iterator r72 = r7.iterator();
    L11:
        if (r72.hasNext() == false) goto L13;
        r4 = r4 | add(r72.next());
        goto L11
    L13:
        return r4;
    L15:
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1947c == 0) goto L6;
        this.f1945a = AbstractC0714Qj.f2294a;
        this.f1946b = AbstractC0714Qj.f2295b;
        this.f1947c = 0;
    L6:
        if (this.f1947c != 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        if (r3 != null) goto L5;
        int r32 = AbstractC0628Oj.m1223C(this, null, 0);
    L6:
        if (r32 < 0) goto L9;
        return true;
    L9:
        return false;
    L5:
        r32 = AbstractC0628Oj.m1223C(this, r3, r3.hashCode());
        goto L6
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

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if ((r7 instanceof Set) == true) goto L8;
    L17:
        return false;
    L8:
        if (this.f1947c == ((Set) r7).size()) goto L19;
        return false;
    L19:
        int r1 = this.f1947c;     // Catch: Throwable -> L18
        int r3 = 0;
    L11:
        if (r3 >= r1) goto L16;
        if (((Set) r7).contains(this.f1946b[r3]) == false) goto L14;
        r3 = r3 + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] r0 = this.f1945a;
        int r1 = this.f1947c;
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
        if (this.f1947c > 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0349I4(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object r3) {
        if (r3 != null) goto L5;
        int r32 = AbstractC0628Oj.m1223C(this, null, 0);
    L6:
        if (r32 < 0) goto L9;
        m1186a(r32);
        return true;
    L9:
        return false;
    L5:
        r32 = AbstractC0628Oj.m1223C(this, r3, r3.hashCode());
        goto L6
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
        int r0 = this.f1947c - 1;
        boolean r2 = false;
    L4:
        if ((-1) >= r0) goto L9;
        if (AbstractC2453ra.m4897g0(r5, this.f1946b[r0]) == true) goto L8;
        m1186a(r0);
        r2 = true;
    L8:
        r0 = r0 - 1;
        goto L4
    L9:
        return r2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1947c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] r0 = this.f1946b;
        int r1 = this.f1947c;
        int r2 = r0.length;
        if (r1 > r2) goto L7;
        return Arrays.copyOfRange(r0, 0, r1);
    L7:
        throw new IndexOutOfBoundsException("toIndex (" + r1 + ") is greater than size (" + r2 + ").");
    }

    public final String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.f1947c * 14);
        r1.append('{');
        int r0 = this.f1947c;
        int r2 = 0;
    L7:
        if (r2 >= r0) goto L15;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        Object r3 = this.f1946b[r2];
        if (r3 == this) goto L13;
        r1.append(r3);
    L14:
        r2 = r2 + 1;
        goto L7
    L13:
        r1.append("(this Set)");
        goto L14
    L15:
        r1.append('}');
        return r1.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] r4) {
        int r0 = this.f1947c;
        if (r4.length >= r0) goto L6;
        r4 = (Object[]) Array.newInstance(r4.getClass().getComponentType(), r0);
    L8:
        AbstractC0650P4.m1310E(this.f1946b, r4, 0, 0, this.f1947c);
        return r4;
    L6:
        if (r4.length <= r0) goto L8;
        r4[r0] = null;
        goto L8
    }
}
