package androidx.recyclerview.widget;

import Yue.C3528;
import Yue.InterfaceC5736;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8993<T> {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f30323 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f30324 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f30325 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f30326 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f30327 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f30328 = 4;

    /* JADX INFO: renamed from: ۥ */
    public T[] f3991;

    /* JADX INFO: renamed from: ۥ۟ */
    public T[] f3992;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f30329;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f30330;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f30331;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public AbstractC1787 f30332;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C1786 f30333;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f30334;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Class<T> f30335;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۦ$ۥ */
    public static class C1786<T2> extends AbstractC1787<T2> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final AbstractC1787<T2> f30336;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final C3528 f30337;

        public C1786(AbstractC1787<T2> abstractC1787) {
            this.f30336 = abstractC1787;
            this.f30337 = new C3528(abstractC1787);
        }

        @Override // androidx.recyclerview.widget.C8993.AbstractC1787, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.f30336.compare(t2, t22);
        }

        @Override // Yue.InterfaceC5736
        /* JADX INFO: renamed from: ۥ */
        public void mo595(int i, int i2) {
            this.f30337.mo595(i, i2);
        }

        @Override // Yue.InterfaceC5736
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo596(int i, int i2) {
            this.f30337.mo596(i, i2);
        }

        @Override // Yue.InterfaceC5736
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo9454(int i, int i2) {
            this.f30337.mo9454(i, i2);
        }

        @Override // androidx.recyclerview.widget.C8993.AbstractC1787, Yue.InterfaceC5736
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo9455(int i, int i2, Object obj) {
            this.f30337.mo9455(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.C8993.AbstractC1787
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo30775(T2 t2, T2 t22) {
            return this.f30336.mo30775(t2, t22);
        }

        @Override // androidx.recyclerview.widget.C8993.AbstractC1787
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean mo30776(T2 t2, T2 t22) {
            return this.f30336.mo30776(t2, t22);
        }

        @Override // androidx.recyclerview.widget.C8993.AbstractC1787
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Object mo30777(T2 t2, T2 t22) {
            return this.f30336.mo30777(t2, t22);
        }

        @Override // androidx.recyclerview.widget.C8993.AbstractC1787
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo30778(int i, int i2) {
            this.f30337.mo9455(i, i2, null);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m30779() {
            this.f30337.m9456();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۦ$ۥ۟ */
    public static abstract class AbstractC1787<T2> implements Comparator<T2>, InterfaceC5736 {
        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo9455(int i, int i2, Object obj) {
            mo30778(i, i2);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public abstract boolean mo30775(T2 t2, T2 t22);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public abstract boolean mo30776(T2 t2, T2 t22);

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public Object mo30777(T2 t2, T2 t22) {
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public abstract void mo30778(int i, int i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8993(@InterfaceC6391 Class<T> cls, @InterfaceC6391 AbstractC1787<T> abstractC1787) {
        this(cls, abstractC1787, 10);
    }

    /* JADX INFO: renamed from: ۥ */
    public int m5009(T t) {
        m30773();
        return m5010(t, true);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m5010(T t, boolean z) {
        int iM30754 = m30754(t, this.f3991, 0, this.f30334, 1);
        if (iM30754 == -1) {
            iM30754 = 0;
        } else if (iM30754 < this.f30334) {
            T t2 = this.f3991[iM30754];
            if (this.f30332.mo30776(t2, t)) {
                if (this.f30332.mo30775(t2, t)) {
                    this.f3991[iM30754] = t;
                    return iM30754;
                }
                this.f3991[iM30754] = t;
                AbstractC1787 abstractC1787 = this.f30332;
                abstractC1787.mo9455(iM30754, 1, abstractC1787.mo30777(t2, t));
                return iM30754;
            }
        }
        m30749(iM30754, t);
        if (z) {
            this.f30332.mo596(iM30754, 1);
        }
        return iM30754;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.ۥ۟۟۠ۦ<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m30745(@InterfaceC6391 Collection<T> collection) {
        m30747(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f30335, collection.size())), true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30746(@InterfaceC6391 T... tArr) {
        m30747(tArr, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30747(@InterfaceC6391 T[] tArr, boolean z) {
        m30773();
        if (tArr.length == 0) {
            return;
        }
        if (z) {
            m30748(tArr);
        } else {
            m30748(m30752(tArr));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30748(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iM30772 = m30772(tArr);
        if (this.f30334 != 0) {
            m30759(tArr, iM30772);
            return;
        }
        this.f3991 = tArr;
        this.f30334 = iM30772;
        this.f30332.mo596(0, iM30772);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30749(int i, T t) {
        int i2 = this.f30334;
        if (i > i2) {
            throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.f30334);
        }
        T[] tArr = this.f3991;
        if (i2 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f30335, tArr.length + 10));
            System.arraycopy(this.f3991, 0, tArr2, 0, i);
            tArr2[i] = t;
            System.arraycopy(this.f3991, i, tArr2, i + 1, this.f30334 - i);
            this.f3991 = tArr2;
        } else {
            System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
            this.f3991[i] = t;
        }
        this.f30334++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m30750() {
        m30773();
        AbstractC1787 abstractC1787 = this.f30332;
        if (abstractC1787 instanceof C1786) {
            return;
        }
        if (this.f30333 == null) {
            this.f30333 = new C1786(abstractC1787);
        }
        this.f30332 = this.f30333;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m30751() {
        m30773();
        int i = this.f30334;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.f3991, 0, i, (Object) null);
        this.f30334 = 0;
        this.f30332.mo9454(0, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final T[] m30752(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f30335, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m30753() {
        m30773();
        AbstractC1787 abstractC1787 = this.f30332;
        if (abstractC1787 instanceof C1786) {
            ((C1786) abstractC1787).m30779();
        }
        AbstractC1787 abstractC17872 = this.f30332;
        C1786 c1786 = this.f30333;
        if (abstractC17872 == c1786) {
            this.f30332 = c1786.f30336;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m30754(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int iCompare = this.f30332.compare(t2, t);
            if (iCompare < 0) {
                i = i4 + 1;
            } else {
                if (iCompare == 0) {
                    if (this.f30332.mo30776(t2, t)) {
                        return i4;
                    }
                    int iM30758 = m30758(t, i4, i, i2);
                    return (i3 == 1 && iM30758 == -1) ? i4 : iM30758;
                }
                i2 = i4;
            }
        }
        if (i3 == 1) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m30755(T t, T[] tArr, int i, int i2) {
        while (i < i2) {
            if (this.f30332.mo30776(tArr[i], t)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public T m30756(int i) throws IndexOutOfBoundsException {
        int i2;
        if (i < this.f30334 && i >= 0) {
            T[] tArr = this.f3992;
            return (tArr == null || i < (i2 = this.f30331)) ? this.f3991[i] : tArr[(i - i2) + this.f30329];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.f30334);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m30757(T t) {
        if (this.f3992 == null) {
            return m30754(t, this.f3991, 0, this.f30334, 4);
        }
        int iM30754 = m30754(t, this.f3991, 0, this.f30331, 4);
        if (iM30754 != -1) {
            return iM30754;
        }
        int iM307542 = m30754(t, this.f3992, this.f30329, this.f30330, 4);
        if (iM307542 != -1) {
            return (iM307542 - this.f30329) + this.f30331;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m30758(T t, int i, int i2, int i3) {
        T t2;
        for (int i4 = i - 1; i4 >= i2; i4--) {
            T t3 = this.f3991[i4];
            if (this.f30332.compare(t3, t) != 0) {
                break;
            }
            if (this.f30332.mo30776(t3, t)) {
                return i4;
            }
        }
        do {
            i++;
            if (i >= i3) {
                return -1;
            }
            t2 = this.f3991[i];
            if (this.f30332.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.f30332.mo30776(t2, t));
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m30759(T[] tArr, int i) {
        boolean z = !(this.f30332 instanceof C1786);
        if (z) {
            m30750();
        }
        this.f3992 = this.f3991;
        int i2 = 0;
        this.f30329 = 0;
        int i3 = this.f30334;
        this.f30330 = i3;
        this.f3991 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f30335, i3 + i + 10));
        this.f30331 = 0;
        while (true) {
            int i4 = this.f30329;
            int i5 = this.f30330;
            if (i4 >= i5 && i2 >= i) {
                break;
            }
            if (i4 == i5) {
                int i6 = i - i2;
                System.arraycopy(tArr, i2, this.f3991, this.f30331, i6);
                int i7 = this.f30331 + i6;
                this.f30331 = i7;
                this.f30334 += i6;
                this.f30332.mo596(i7 - i6, i6);
                break;
            }
            if (i2 == i) {
                int i8 = i5 - i4;
                System.arraycopy(this.f3992, i4, this.f3991, this.f30331, i8);
                this.f30331 += i8;
                break;
            }
            T t = this.f3992[i4];
            T t2 = tArr[i2];
            int iCompare = this.f30332.compare(t, t2);
            if (iCompare > 0) {
                T[] tArr2 = this.f3991;
                int i9 = this.f30331;
                this.f30331 = i9 + 1;
                tArr2[i9] = t2;
                this.f30334++;
                i2++;
                this.f30332.mo596(i9, 1);
            } else if (iCompare == 0 && this.f30332.mo30776(t, t2)) {
                T[] tArr3 = this.f3991;
                int i10 = this.f30331;
                this.f30331 = i10 + 1;
                tArr3[i10] = t2;
                i2++;
                this.f30329++;
                if (!this.f30332.mo30775(t, t2)) {
                    AbstractC1787 abstractC1787 = this.f30332;
                    abstractC1787.mo9455(this.f30331 - 1, 1, abstractC1787.mo30777(t, t2));
                }
            } else {
                T[] tArr4 = this.f3991;
                int i11 = this.f30331;
                this.f30331 = i11 + 1;
                tArr4[i11] = t;
                this.f30329++;
            }
        }
        this.f3992 = null;
        if (z) {
            m30753();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m30760(int i) {
        m30773();
        T tM30756 = m30756(i);
        m30764(i, false);
        int iM5010 = m5010(tM30756, false);
        if (i != iM5010) {
            this.f30332.mo595(i, iM5010);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m30761(T t) {
        m30773();
        return m30762(t, true);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m30762(T t, boolean z) {
        int iM30754 = m30754(t, this.f3991, 0, this.f30334, 2);
        if (iM30754 == -1) {
            return false;
        }
        m30764(iM30754, z);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public T m30763(int i) {
        m30773();
        T tM30756 = m30756(i);
        m30764(i, true);
        return tM30756;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m30764(int i, boolean z) {
        T[] tArr = this.f3991;
        System.arraycopy(tArr, i + 1, tArr, i, (this.f30334 - i) - 1);
        int i2 = this.f30334 - 1;
        this.f30334 = i2;
        this.f3991[i2] = null;
        if (z) {
            this.f30332.mo9454(i, 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.recyclerview.widget.ۥ۟۟۠ۦ<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m30765(@InterfaceC6391 Collection<T> collection) {
        m30767(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f30335, collection.size())), true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m30766(@InterfaceC6391 T... tArr) {
        m30767(tArr, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m30767(@InterfaceC6391 T[] tArr, boolean z) {
        m30773();
        if (z) {
            m30769(tArr);
        } else {
            m30769(m30752(tArr));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m30768(T t) {
        T[] tArr = this.f3991;
        int i = this.f30331;
        tArr[i] = t;
        this.f30331 = i + 1;
        this.f30334++;
        this.f30332.mo596(i, 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m30769(@InterfaceC6391 T[] tArr) {
        boolean z = !(this.f30332 instanceof C1786);
        if (z) {
            m30750();
        }
        this.f30329 = 0;
        this.f30330 = this.f30334;
        this.f3992 = this.f3991;
        this.f30331 = 0;
        int iM30772 = m30772(tArr);
        this.f3991 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f30335, iM30772));
        while (true) {
            int i = this.f30331;
            if (i >= iM30772 && this.f30329 >= this.f30330) {
                break;
            }
            int i2 = this.f30329;
            int i3 = this.f30330;
            if (i2 >= i3) {
                int i4 = iM30772 - i;
                System.arraycopy(tArr, i, this.f3991, i, i4);
                this.f30331 += i4;
                this.f30334 += i4;
                this.f30332.mo596(i, i4);
                break;
            }
            if (i >= iM30772) {
                int i5 = i3 - i2;
                this.f30334 -= i5;
                this.f30332.mo9454(i, i5);
                break;
            }
            T t = this.f3992[i2];
            T t2 = tArr[i];
            int iCompare = this.f30332.compare(t, t2);
            if (iCompare < 0) {
                m30770();
            } else if (iCompare > 0) {
                m30768(t2);
            } else if (this.f30332.mo30776(t, t2)) {
                T[] tArr2 = this.f3991;
                int i6 = this.f30331;
                tArr2[i6] = t2;
                this.f30329++;
                this.f30331 = i6 + 1;
                if (!this.f30332.mo30775(t, t2)) {
                    AbstractC1787 abstractC1787 = this.f30332;
                    abstractC1787.mo9455(this.f30331 - 1, 1, abstractC1787.mo30777(t, t2));
                }
            } else {
                m30770();
                m30768(t2);
            }
        }
        this.f3992 = null;
        if (z) {
            m30753();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m30770() {
        this.f30334--;
        this.f30329++;
        this.f30332.mo9454(this.f30331, 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int m30771() {
        return this.f30334;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final int m30772(@InterfaceC6391 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f30332);
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            if (this.f30332.compare(tArr[i], t) == 0) {
                int iM30755 = m30755(t, tArr, i, i2);
                if (iM30755 != -1) {
                    tArr[iM30755] = t;
                } else {
                    if (i2 != i3) {
                        tArr[i2] = t;
                    }
                    i2++;
                }
            } else {
                if (i2 != i3) {
                    tArr[i2] = t;
                }
                i = i2;
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m30773() {
        if (this.f3992 != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m30774(int i, T t) {
        m30773();
        T tM30756 = m30756(i);
        boolean z = tM30756 == t || !this.f30332.mo30775(tM30756, t);
        if (tM30756 != t && this.f30332.compare(tM30756, t) == 0) {
            this.f3991[i] = t;
            if (z) {
                AbstractC1787 abstractC1787 = this.f30332;
                abstractC1787.mo9455(i, 1, abstractC1787.mo30777(tM30756, t));
                return;
            }
            return;
        }
        if (z) {
            AbstractC1787 abstractC17872 = this.f30332;
            abstractC17872.mo9455(i, 1, abstractC17872.mo30777(tM30756, t));
        }
        m30764(i, false);
        int iM5010 = m5010(t, false);
        if (i != iM5010) {
            this.f30332.mo595(i, iM5010);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8993(@InterfaceC6391 Class<T> cls, @InterfaceC6391 AbstractC1787<T> abstractC1787, int i) {
        this.f30335 = cls;
        this.f3991 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i));
        this.f30332 = abstractC1787;
        this.f30334 = 0;
    }
}
