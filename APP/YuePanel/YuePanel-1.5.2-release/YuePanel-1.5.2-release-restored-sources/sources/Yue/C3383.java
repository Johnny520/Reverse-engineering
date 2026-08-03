package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.4")
@InterfaceC8405(markerClass = {InterfaceC4772.class})
@InterfaceC7507({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,583:1\n467#1,51:586\n467#1,51:637\n37#2,2:584\n26#3:688\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n462#1:586,51\n464#1:637,51\n47#1:584,2\n562#1:688\n*E\n"})
public final class C3383<E> extends AbstractC2996<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0127 f5433 = new C0127(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final Object[] f5434 = new Object[0];

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f5435 = 2147483639;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f5436 = 10;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f5437;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public Object[] f5438;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f5439;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۧۡ$ۥ */
    public static final class C0127 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۡۧۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0127(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m468(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - C3383.f5435 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return Integer.MAX_VALUE;
            }
            return C3383.f5435;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0127() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3383(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f5434;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i);
            }
            objArr = new Object[i];
        }
        this.f5438 = objArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private final void m6960(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f5438;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f5434) {
            this.f5438 = new Object[C7007.m21661(i, 10)];
        } else {
            m6962(f5433.m468(objArr.length, i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@InterfaceC6399 Collection<? extends E> collection) {
        C5499.m17103(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m6960(size() + collection.size());
        m6961(m6974(this.f5437 + size()), collection);
        return true;
    }

    public final void addFirst(E e) {
        m6960(size() + 1);
        int iM6963 = m6963(this.f5437);
        this.f5437 = iM6963;
        this.f5438[iM6963] = e;
        this.f5439 = size() + 1;
    }

    public final void addLast(E e) {
        m6960(size() + 1);
        this.f5438[m6974(this.f5437 + size())] = e;
        this.f5439 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int iM6974 = m6974(this.f5437 + size());
        int i = this.f5437;
        if (i < iM6974) {
            C3404.m7192(this.f5438, null, i, iM6974);
        } else if (!isEmpty()) {
            Object[] objArr = this.f5438;
            C3404.m7192(objArr, null, this.f5437, objArr.length);
            C3404.m7192(this.f5438, null, 0, iM6974);
        }
        this.f5437 = 0;
        this.f5439 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractC2986.f4328.m52(i, size());
        return (E) this.f5438[m6974(this.f5437 + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int iM6974 = m6974(this.f5437 + size());
        int length = this.f5437;
        if (length < iM6974) {
            while (length < iM6974) {
                if (C5499.m17094(obj, this.f5438[length])) {
                    i = this.f5437;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM6974) {
            return -1;
        }
        int length2 = this.f5438.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iM6974; i2++) {
                    if (C5499.m17094(obj, this.f5438[i2])) {
                        length = i2 + this.f5438.length;
                        i = this.f5437;
                    }
                }
                return -1;
            }
            if (C5499.m17094(obj, this.f5438[length])) {
                i = this.f5437;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iM7876;
        int i;
        int iM6974 = m6974(this.f5437 + size());
        int i2 = this.f5437;
        if (i2 < iM6974) {
            iM7876 = iM6974 - 1;
            if (i2 <= iM7876) {
                while (!C5499.m17094(obj, this.f5438[iM7876])) {
                    if (iM7876 != i2) {
                        iM7876--;
                    }
                }
                i = this.f5437;
                return iM7876 - i;
            }
            return -1;
        }
        if (i2 > iM6974) {
            int i3 = iM6974 - 1;
            while (true) {
                if (-1 >= i3) {
                    iM7876 = C3411.m7876(this.f5438);
                    int i4 = this.f5437;
                    if (i4 <= iM7876) {
                        while (!C5499.m17094(obj, this.f5438[iM7876])) {
                            if (iM7876 != i4) {
                                iM7876--;
                            }
                        }
                        i = this.f5437;
                    }
                } else {
                    if (C5499.m17094(obj, this.f5438[i3])) {
                        iM7876 = i3 + this.f5438.length;
                        i = this.f5437;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@InterfaceC6399 Collection<? extends Object> collection) {
        int iM6974;
        C5499.m17103(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f5438.length != 0) {
            int iM69742 = m6974(this.f5437 + size());
            int i = this.f5437;
            if (i < iM69742) {
                iM6974 = i;
                while (i < iM69742) {
                    Object obj = this.f5438[i];
                    if (!collection.contains(obj)) {
                        this.f5438[iM6974] = obj;
                        iM6974++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C3404.m7192(this.f5438, null, iM6974, iM69742);
            } else {
                int length = this.f5438.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f5438;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.f5438[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM6974 = m6974(i2);
                for (int i3 = 0; i3 < iM69742; i3++) {
                    Object[] objArr2 = this.f5438;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.f5438[iM6974] = obj3;
                        iM6974 = m6967(iM6974);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f5439 = m6973(iM6974 - this.f5437);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f5438;
        int i = this.f5437;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.f5437 = m6967(i);
        this.f5439 = size() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iM6974 = m6974(this.f5437 + C3880.m10737(this));
        Object[] objArr = this.f5438;
        E e = (E) objArr[iM6974];
        objArr[iM6974] = null;
        this.f5439 = size() - 1;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@InterfaceC6399 Collection<? extends Object> collection) {
        int iM6974;
        C5499.m17103(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f5438.length != 0) {
            int iM69742 = m6974(this.f5437 + size());
            int i = this.f5437;
            if (i < iM69742) {
                iM6974 = i;
                while (i < iM69742) {
                    Object obj = this.f5438[i];
                    if (collection.contains(obj)) {
                        this.f5438[iM6974] = obj;
                        iM6974++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C3404.m7192(this.f5438, null, iM6974, iM69742);
            } else {
                int length = this.f5438.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f5438;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f5438[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM6974 = m6974(i2);
                for (int i3 = 0; i3 < iM69742; i3++) {
                    Object[] objArr2 = this.f5438;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f5438[iM6974] = obj3;
                        iM6974 = m6967(iM6974);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f5439 = m6973(iM6974 - this.f5437);
            }
        }
        return z;
    }

    @Override // Yue.AbstractC2996, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractC2986.f4328.m52(i, size());
        int iM6974 = m6974(this.f5437 + i);
        Object[] objArr = this.f5438;
        E e2 = (E) objArr[iM6974];
        objArr[iM6974] = e;
        return e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC6399
    public <T> T[] toArray(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) C3402.m489(tArr, size());
        }
        int iM6974 = m6974(this.f5437 + size());
        int i = this.f5437;
        if (i < iM6974) {
            C3404.m7138(this.f5438, tArr, 0, i, iM6974, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f5438;
            C3404.m7129(objArr, tArr, 0, this.f5437, objArr.length);
            Object[] objArr2 = this.f5438;
            C3404.m7129(objArr2, tArr, objArr2.length - this.f5437, 0, iM6974);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    @Override // Yue.AbstractC2996
    /* JADX INFO: renamed from: ۥ */
    public int mo62() {
        return this.f5439;
    }

    @Override // Yue.AbstractC2996
    /* JADX INFO: renamed from: ۥ۟ */
    public E mo63(int i) {
        AbstractC2986.f4328.m52(i, size());
        if (i == C3880.m10737(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int iM6974 = m6974(this.f5437 + i);
        E e = (E) this.f5438[iM6974];
        if (i < (size() >> 1)) {
            int i2 = this.f5437;
            if (iM6974 >= i2) {
                Object[] objArr = this.f5438;
                C3404.m7129(objArr, objArr, i2 + 1, i2, iM6974);
            } else {
                Object[] objArr2 = this.f5438;
                C3404.m7129(objArr2, objArr2, 1, 0, iM6974);
                Object[] objArr3 = this.f5438;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f5437;
                C3404.m7129(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f5438;
            int i4 = this.f5437;
            objArr4[i4] = null;
            this.f5437 = m6967(i4);
        } else {
            int iM69742 = m6974(this.f5437 + C3880.m10737(this));
            if (iM6974 <= iM69742) {
                Object[] objArr5 = this.f5438;
                C3404.m7129(objArr5, objArr5, iM6974, iM6974 + 1, iM69742 + 1);
            } else {
                Object[] objArr6 = this.f5438;
                C3404.m7129(objArr6, objArr6, iM6974, iM6974 + 1, objArr6.length);
                Object[] objArr7 = this.f5438;
                objArr7[objArr7.length - 1] = objArr7[0];
                C3404.m7129(objArr7, objArr7, 0, 1, iM69742 + 1);
            }
            this.f5438[iM69742] = null;
        }
        this.f5439 = size() - 1;
        return e;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m6961(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f5438.length;
        while (i < length && it.hasNext()) {
            this.f5438[i] = it.next();
            i++;
        }
        int i2 = this.f5437;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f5438[i3] = it.next();
        }
        this.f5439 = size() + collection.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m6962(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f5438;
        C3404.m7129(objArr2, objArr, 0, this.f5437, objArr2.length);
        Object[] objArr3 = this.f5438;
        int length = objArr3.length;
        int i2 = this.f5437;
        C3404.m7129(objArr3, objArr, length - i2, 0, i2);
        this.f5437 = 0;
        this.f5438 = objArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m6963(int i) {
        return i == 0 ? C3411.m7876(this.f5438) : i - 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m6964(InterfaceC5124<? super E, Boolean> interfaceC5124) {
        int iM6974;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f5438.length != 0) {
            int iM69742 = m6974(this.f5437 + size());
            int i = this.f5437;
            if (i < iM69742) {
                iM6974 = i;
                while (i < iM69742) {
                    Object obj = this.f5438[i];
                    if (interfaceC5124.invoke(obj).booleanValue()) {
                        this.f5438[iM6974] = obj;
                        iM6974++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C3404.m7192(this.f5438, null, iM6974, iM69742);
            } else {
                int length = this.f5438.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f5438;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (interfaceC5124.invoke(obj2).booleanValue()) {
                        this.f5438[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM6974 = m6974(i2);
                for (int i3 = 0; i3 < iM69742; i3++) {
                    Object[] objArr2 = this.f5438;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (interfaceC5124.invoke(obj3).booleanValue()) {
                        this.f5438[iM6974] = obj3;
                        iM6974 = m6967(iM6974);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.f5439 = m6973(iM6974 - this.f5437);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final E m6965() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f5438[this.f5437];
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final E m6966() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f5438[this.f5437];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m6967(int i) {
        if (i == C3411.m7876(this.f5438)) {
            return 0;
        }
        return i + 1;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final E m6968(int i) {
        return (E) this.f5438[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m6969(int i) {
        return m6974(this.f5437 + i);
    }

    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: ? super java.lang.Object[] */
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m6970(@InterfaceC6399 InterfaceC5138<? super Integer, ? super Object[], C8107> interfaceC5138) {
        int i;
        C5499.m17103(interfaceC5138, "structure");
        interfaceC5138.invoke(Integer.valueOf((isEmpty() || (i = this.f5437) < m6974(this.f5437 + size())) ? this.f5437 : i - this.f5438.length), toArray());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final E m6971() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f5438[m6974(this.f5437 + C3880.m10737(this))];
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final E m6972() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f5438[m6974(this.f5437 + C3880.m10737(this))];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m6973(int i) {
        return i < 0 ? i + this.f5438.length : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m6974(int i) {
        Object[] objArr = this.f5438;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final E m6975() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final E m6976() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Object[] m6977() {
        return toArray();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final <T> T[] m6978(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "array");
        return (T[]) toArray(tArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.AbstractC2996, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        AbstractC2986.f4328.m5791(i, size());
        if (i == size()) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        m6960(size() + 1);
        int iM6974 = m6974(this.f5437 + i);
        if (i < ((size() + 1) >> 1)) {
            int iM6963 = m6963(iM6974);
            int iM69632 = m6963(this.f5437);
            int i2 = this.f5437;
            if (iM6963 >= i2) {
                Object[] objArr = this.f5438;
                objArr[iM69632] = objArr[i2];
                C3404.m7129(objArr, objArr, i2, i2 + 1, iM6963 + 1);
            } else {
                Object[] objArr2 = this.f5438;
                C3404.m7129(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.f5438;
                objArr3[objArr3.length - 1] = objArr3[0];
                C3404.m7129(objArr3, objArr3, 0, 1, iM6963 + 1);
            }
            this.f5438[iM6963] = e;
            this.f5437 = iM69632;
        } else {
            int iM69742 = m6974(this.f5437 + size());
            if (iM6974 < iM69742) {
                Object[] objArr4 = this.f5438;
                C3404.m7129(objArr4, objArr4, iM6974 + 1, iM6974, iM69742);
            } else {
                Object[] objArr5 = this.f5438;
                C3404.m7129(objArr5, objArr5, 1, 0, iM69742);
                Object[] objArr6 = this.f5438;
                objArr6[0] = objArr6[objArr6.length - 1];
                C3404.m7129(objArr6, objArr6, iM6974 + 1, iM6974, objArr6.length - 1);
            }
            this.f5438[iM6974] = e;
        }
        this.f5439 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @InterfaceC6399 Collection<? extends E> collection) {
        C5499.m17103(collection, "elements");
        AbstractC2986.f4328.m5791(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m6960(size() + collection.size());
        int iM6974 = m6974(this.f5437 + size());
        int iM69742 = m6974(this.f5437 + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f5437;
            int length = i2 - size;
            if (iM69742 < i2) {
                Object[] objArr = this.f5438;
                C3404.m7129(objArr, objArr, length, i2, objArr.length);
                if (size >= iM69742) {
                    Object[] objArr2 = this.f5438;
                    C3404.m7129(objArr2, objArr2, objArr2.length - size, 0, iM69742);
                } else {
                    Object[] objArr3 = this.f5438;
                    C3404.m7129(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f5438;
                    C3404.m7129(objArr4, objArr4, 0, size, iM69742);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f5438;
                C3404.m7129(objArr5, objArr5, length, i2, iM69742);
            } else {
                Object[] objArr6 = this.f5438;
                length += objArr6.length;
                int i3 = iM69742 - i2;
                int length2 = objArr6.length - length;
                if (length2 >= i3) {
                    C3404.m7129(objArr6, objArr6, length, i2, iM69742);
                } else {
                    C3404.m7129(objArr6, objArr6, length, i2, i2 + length2);
                    Object[] objArr7 = this.f5438;
                    C3404.m7129(objArr7, objArr7, 0, this.f5437 + length2, iM69742);
                }
            }
            this.f5437 = length;
            m6961(m6973(iM69742 - size), collection);
        } else {
            int i4 = iM69742 + size;
            if (iM69742 < iM6974) {
                int i5 = size + iM6974;
                Object[] objArr8 = this.f5438;
                if (i5 <= objArr8.length) {
                    C3404.m7129(objArr8, objArr8, i4, iM69742, iM6974);
                } else if (i4 >= objArr8.length) {
                    C3404.m7129(objArr8, objArr8, i4 - objArr8.length, iM69742, iM6974);
                } else {
                    int length3 = iM6974 - (i5 - objArr8.length);
                    C3404.m7129(objArr8, objArr8, 0, length3, iM6974);
                    Object[] objArr9 = this.f5438;
                    C3404.m7129(objArr9, objArr9, i4, iM69742, length3);
                }
            } else {
                Object[] objArr10 = this.f5438;
                C3404.m7129(objArr10, objArr10, size, 0, iM6974);
                Object[] objArr11 = this.f5438;
                if (i4 >= objArr11.length) {
                    C3404.m7129(objArr11, objArr11, i4 - objArr11.length, iM69742, objArr11.length);
                } else {
                    C3404.m7129(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f5438;
                    C3404.m7129(objArr12, objArr12, i4, iM69742, objArr12.length - size);
                }
            }
            m6961(iM69742, collection);
        }
        return true;
    }

    public C3383() {
        this.f5438 = f5434;
    }

    public C3383(@InterfaceC6399 Collection<? extends E> collection) {
        C5499.m17103(collection, "elements");
        Object[] array = collection.toArray(new Object[0]);
        this.f5438 = array;
        this.f5439 = array.length;
        if (array.length == 0) {
            this.f5438 = f5434;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @InterfaceC6399
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
