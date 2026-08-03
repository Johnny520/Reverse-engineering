package Yue;

import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5885<E> implements Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Object f14596 = new Object();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f14597;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public long[] f14598;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Object[] f14599;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f14600;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5885() {
        this(10);
    }

    public String toString() {
        if (m18231() <= 0) {
            return C6193.f15213;
        }
        StringBuilder sb = new StringBuilder(this.f14600 * 28);
        sb.append(C6193.f1884);
        for (int i = 0; i < this.f14600; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m18221(i));
            sb.append(SignatureVisitor.INSTANCEOF);
            E eM18232 = m18232(i);
            if (eM18232 != this) {
                sb.append(eM18232);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(C6193.f1885);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m18209(long j, E e) {
        int i = this.f14600;
        if (i != 0 && j <= this.f14598[i - 1]) {
            m18222(j, e);
            return;
        }
        if (this.f14597 && i >= this.f14598.length) {
            m18215();
        }
        int i2 = this.f14600;
        if (i2 >= this.f14598.length) {
            int iM12012 = C4146.m12012(i2 + 1);
            long[] jArr = new long[iM12012];
            Object[] objArr = new Object[iM12012];
            long[] jArr2 = this.f14598;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f14599;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f14598 = jArr;
            this.f14599 = objArr;
        }
        this.f14598[i2] = j;
        this.f14599[i2] = e;
        this.f14600 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m18210() {
        int i = this.f14600;
        Object[] objArr = this.f14599;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f14600 = 0;
        this.f14597 = false;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C5885<E> clone() {
        try {
            C5885<E> c5885 = (C5885) super.clone();
            c5885.f14598 = (long[]) this.f14598.clone();
            c5885.f14599 = (Object[]) this.f14599.clone();
            return c5885;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m18212(long j) {
        return m18218(j) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m18213(E e) {
        return m18219(e) >= 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m18214(long j) {
        m18225(j);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m18215() {
        int i = this.f14600;
        long[] jArr = this.f14598;
        Object[] objArr = this.f14599;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f14596) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f14597 = false;
        this.f14600 = i2;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public E m18216(long j) {
        return m18217(j, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public E m18217(long j, E e) {
        E e2;
        int iM1101 = C4146.m1101(this.f14598, this.f14600, j);
        return (iM1101 < 0 || (e2 = (E) this.f14599[iM1101]) == f14596) ? e : e2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m18218(long j) {
        if (this.f14597) {
            m18215();
        }
        return C4146.m1101(this.f14598, this.f14600, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m18219(E e) {
        if (this.f14597) {
            m18215();
        }
        for (int i = 0; i < this.f14600; i++) {
            if (this.f14599[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m18220() {
        return m18231() == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public long m18221(int i) {
        if (this.f14597) {
            m18215();
        }
        return this.f14598[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m18222(long j, E e) {
        int iM1101 = C4146.m1101(this.f14598, this.f14600, j);
        if (iM1101 >= 0) {
            this.f14599[iM1101] = e;
            return;
        }
        int i = ~iM1101;
        int i2 = this.f14600;
        if (i < i2) {
            Object[] objArr = this.f14599;
            if (objArr[i] == f14596) {
                this.f14598[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f14597 && i2 >= this.f14598.length) {
            m18215();
            i = ~C4146.m1101(this.f14598, this.f14600, j);
        }
        int i3 = this.f14600;
        if (i3 >= this.f14598.length) {
            int iM12012 = C4146.m12012(i3 + 1);
            long[] jArr = new long[iM12012];
            Object[] objArr2 = new Object[iM12012];
            long[] jArr2 = this.f14598;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f14599;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f14598 = jArr;
            this.f14599 = objArr2;
        }
        int i4 = this.f14600;
        if (i4 - i != 0) {
            long[] jArr3 = this.f14598;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f14599;
            System.arraycopy(objArr4, i, objArr4, i5, this.f14600 - i);
        }
        this.f14598[i] = j;
        this.f14599[i] = e;
        this.f14600++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m18223(@InterfaceC6391 C5885<? extends E> c5885) {
        int iM18231 = c5885.m18231();
        for (int i = 0; i < iM18231; i++) {
            m18222(c5885.m18221(i), c5885.m18232(i));
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public E m18224(long j, E e) {
        E eM18216 = m18216(j);
        if (eM18216 == null) {
            m18222(j, e);
        }
        return eM18216;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m18225(long j) {
        int iM1101 = C4146.m1101(this.f14598, this.f14600, j);
        if (iM1101 >= 0) {
            Object[] objArr = this.f14599;
            Object obj = objArr[iM1101];
            Object obj2 = f14596;
            if (obj != obj2) {
                objArr[iM1101] = obj2;
                this.f14597 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m18226(long j, Object obj) {
        int iM18218 = m18218(j);
        if (iM18218 < 0) {
            return false;
        }
        E eM18232 = m18232(iM18218);
        if (obj != eM18232 && (obj == null || !obj.equals(eM18232))) {
            return false;
        }
        m18227(iM18218);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m18227(int i) {
        Object[] objArr = this.f14599;
        Object obj = objArr[i];
        Object obj2 = f14596;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f14597 = true;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public E m18228(long j, E e) {
        int iM18218 = m18218(j);
        if (iM18218 < 0) {
            return null;
        }
        Object[] objArr = this.f14599;
        E e2 = (E) objArr[iM18218];
        objArr[iM18218] = e;
        return e2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m18229(long j, E e, E e2) {
        int iM18218 = m18218(j);
        if (iM18218 < 0) {
            return false;
        }
        Object obj = this.f14599[iM18218];
        if (obj != e && (e == null || !e.equals(obj))) {
            return false;
        }
        this.f14599[iM18218] = e2;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m18230(int i, E e) {
        if (this.f14597) {
            m18215();
        }
        this.f14599[i] = e;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m18231() {
        if (this.f14597) {
            m18215();
        }
        return this.f14600;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public E m18232(int i) {
        if (this.f14597) {
            m18215();
        }
        return (E) this.f14599[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5885(int i) {
        this.f14597 = false;
        if (i == 0) {
            this.f14598 = C4146.f713;
            this.f14599 = C4146.f8480;
        } else {
            int iM12012 = C4146.m12012(i);
            this.f14598 = new long[iM12012];
            this.f14599 = new Object[iM12012];
        }
    }
}
