package Yue;

import Yue.InterfaceC7785;
import java.lang.Comparable;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5495
public class C7784<T extends InterfaceC7785 & Comparable<? super T>> {

    @InterfaceC6399
    private volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public T[] f3080;

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ */
    public final void m3883(@InterfaceC6399 T t) {
        t.mo1627(this);
        InterfaceC7785[] interfaceC7785ArrM24734 = m24734();
        int iM24731 = m24731();
        m24739(iM24731 + 1);
        interfaceC7785ArrM24734[iM24731] = t;
        t.mo14103(iM24731);
        m24741(iM24731);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3884(@InterfaceC6399 T t) {
        synchronized (this) {
            m3883(t);
            C8107 c8107 = C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m24727(@InterfaceC6399 T t, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        boolean z;
        synchronized (this) {
            try {
                if (interfaceC5124.invoke(m24730()).booleanValue()) {
                    m3883(t);
                    z = true;
                } else {
                    z = false;
                }
                C5437.m16930(1);
            } catch (Throwable th) {
                C5437.m16930(1);
                C5437.m16929(1);
                throw th;
            }
        }
        C5437.m16929(1);
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m24728() {
        synchronized (this) {
            try {
                T[] tArr = this.f3080;
                if (tArr != null) {
                    C3404.m7201(tArr, null, 0, 0, 6, null);
                }
                this._size = 0;
                C8107 c8107 = C8107.f3222;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final T m24729(@InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        T t;
        synchronized (this) {
            try {
                int iM24731 = m24731();
                int i = 0;
                while (true) {
                    t = null;
                    if (i >= iM24731) {
                        break;
                    }
                    T[] tArr = this.f3080;
                    if (tArr != null) {
                        t = (Object) tArr[i];
                    }
                    C5499.m17100(t);
                    if (interfaceC5124.invoke(t).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final T m24730() {
        T[] tArr = this.f3080;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m24731() {
        return this._size;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m24732() {
        return m24731() == 0;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final T m24733() {
        T t;
        synchronized (this) {
            t = (T) m24730();
        }
        return t;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final T[] m24734() {
        T[] tArr = this.f3080;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC7785[4];
            this.f3080 = tArr2;
            return tArr2;
        }
        if (m24731() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, m24731() * 2);
        C5499.m17102(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((InterfaceC7785[]) objArrCopyOf);
        this.f3080 = tArr3;
        return tArr3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m24735(@InterfaceC6399 T t) {
        boolean z;
        synchronized (this) {
            if (t.mo14102() == null) {
                z = false;
            } else {
                m24736(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T m24736(int i) {
        T[] tArr = this.f3080;
        C5499.m17100(tArr);
        m24739(m24731() - 1);
        if (i < m24731()) {
            m24742(i, m24731());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C5499.m17100(t);
                T t2 = tArr[i2];
                C5499.m17100(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m24742(i, i2);
                    m24741(i2);
                } else {
                    m24740(i);
                }
            }
        }
        T t3 = tArr[m24731()];
        C5499.m17100(t3);
        t3.mo1627(null);
        t3.mo14103(-1);
        tArr[m24731()] = null;
        return t3;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final T m24737(@InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        synchronized (this) {
            try {
                InterfaceC7785 interfaceC7785M24730 = m24730();
                T t = null;
                if (interfaceC7785M24730 == null) {
                    C5437.m16930(2);
                    C5437.m16929(2);
                    return null;
                }
                if (interfaceC5124.invoke(interfaceC7785M24730).booleanValue()) {
                    t = (T) m24736(0);
                }
                C5437.m16930(1);
                C5437.m16929(1);
                return t;
            } catch (Throwable th) {
                C5437.m16930(1);
                C5437.m16929(1);
                throw th;
            }
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final T m24738() {
        T t;
        synchronized (this) {
            t = m24731() > 0 ? (T) m24736(0) : null;
        }
        return t;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m24739(int i) {
        this._size = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m24740(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 >= m24731()) {
                return;
            }
            T[] tArr = this.f3080;
            C5499.m17100(tArr);
            int i4 = i2 + 2;
            if (i4 < m24731()) {
                T t = tArr[i4];
                C5499.m17100(t);
                T t2 = tArr[i3];
                C5499.m17100(t2);
                if (((Comparable) t).compareTo(t2) >= 0) {
                    i4 = i3;
                }
            }
            T t3 = tArr[i];
            C5499.m17100(t3);
            T t4 = tArr[i4];
            C5499.m17100(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m24742(i, i4);
            i = i4;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m24741(int i) {
        while (i > 0) {
            T[] tArr = this.f3080;
            C5499.m17100(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C5499.m17100(t);
            T t2 = tArr[i];
            C5499.m17100(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m24742(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m24742(int i, int i2) {
        T[] tArr = this.f3080;
        C5499.m17100(tArr);
        T t = tArr[i2];
        C5499.m17100(t);
        T t2 = tArr[i];
        C5499.m17100(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo14103(i);
        t2.mo14103(i2);
    }
}
