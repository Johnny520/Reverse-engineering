package Yue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥۡۧ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
public final class C7177<T> extends AbstractC2986<T> implements RandomAccess {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Object[] f21628;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f21629;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f21630;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f21631;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟ۧ$ۥ */
    @InterfaceC7507({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"})
    public static final class C1198 extends AbstractC2985<T> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f21632;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f21633;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ C7177<T> f21634;

        public C1198(C7177<T> c7177) {
            this.f21634 = c7177;
            this.f21632 = c7177.size();
            this.f21633 = c7177.f21630;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۧ۟ۧ$ۥ */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yue.AbstractC2985
        /* JADX INFO: renamed from: ۥ */
        public void mo49() {
            if (this.f21632 == 0) {
                m50();
                return;
            }
            m5789(this.f21634.f21628[this.f21633]);
            this.f21633 = (this.f21633 + 1) % this.f21634.f21629;
            this.f21632--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7177(@InterfaceC6399 Object[] objArr, int i) {
        C5499.m17103(objArr, "buffer");
        this.f21628 = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i <= objArr.length) {
            this.f21629 = objArr.length;
            this.f21631 = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    @Override // Yue.AbstractC2986, java.util.List
    public T get(int i) {
        AbstractC2986.f4328.m52(i, size());
        return (T) this.f21628[(this.f21630 + i) % this.f21629];
    }

    @Override // Yue.AbstractC2986, Yue.AbstractC2979, java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C1198(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.AbstractC2979, java.util.Collection
    @InterfaceC6399
    public <T> T[] toArray(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            C5499.m17102(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.f21630; i2 < size && i3 < this.f21629; i3++) {
            tArr[i2] = this.f21628[i3];
            i2++;
        }
        while (i2 < size) {
            tArr[i2] = this.f21628[i];
            i2++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    @Override // Yue.AbstractC2986, Yue.AbstractC2979
    /* JADX INFO: renamed from: ۥ */
    public int mo41() {
        return this.f21631;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22454(T t) {
        if (m22457()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f21628[(this.f21630 + size()) % this.f21629] = t;
        this.f21631 = size() + 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۧ۟ۧ<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C7177<T> m22455(int i) {
        Object[] array;
        int i2 = this.f21629;
        int iM21668 = C7007.m21668(i2 + (i2 >> 1) + 1, i);
        if (this.f21630 == 0) {
            array = Arrays.copyOf(this.f21628, iM21668);
            C5499.m17102(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[iM21668]);
        }
        return new C7177<>(array, size());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m22456(int i, int i2) {
        return (i + i2) % this.f21629;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m22457() {
        return size() == this.f21629;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m22458(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (i > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i2 = this.f21630;
            int i3 = (i2 + i) % this.f21629;
            if (i2 > i3) {
                C3404.m7192(this.f21628, null, i2, this.f21629);
                C3404.m7192(this.f21628, null, 0, i3);
            } else {
                C3404.m7192(this.f21628, null, i2, i3);
            }
            this.f21630 = i3;
            this.f21631 = size() - i;
        }
    }

    public C7177(int i) {
        this(new Object[i], 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۧ۟ۧ<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.AbstractC2979, java.util.Collection
    @InterfaceC6399
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
