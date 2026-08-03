package Yue;

import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7533<E> implements Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Object f22795 = new Object();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f22796;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int[] f22797;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Object[] f22798;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f22799;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7533() {
        this(10);
    }

    public String toString() {
        if (m23579() <= 0) {
            return C6193.f15213;
        }
        StringBuilder sb = new StringBuilder(this.f22799 * 28);
        sb.append(C6193.f1884);
        for (int i = 0; i < this.f22799; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m23568(i));
            sb.append(SignatureVisitor.INSTANCEOF);
            E eM23580 = m23580(i);
            if (eM23580 != this) {
                sb.append(eM23580);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(C6193.f1885);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m23556(int i, E e) {
        int i2 = this.f22799;
        if (i2 != 0 && i <= this.f22797[i2 - 1]) {
            m23569(i, e);
            return;
        }
        if (this.f22796 && i2 >= this.f22797.length) {
            m23562();
        }
        int i3 = this.f22799;
        if (i3 >= this.f22797.length) {
            int iM12011 = C4146.m12011(i3 + 1);
            int[] iArr = new int[iM12011];
            Object[] objArr = new Object[iM12011];
            int[] iArr2 = this.f22797;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f22798;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f22797 = iArr;
            this.f22798 = objArr;
        }
        this.f22797[i3] = i;
        this.f22798[i3] = e;
        this.f22799 = i3 + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m23557() {
        int i = this.f22799;
        Object[] objArr = this.f22798;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f22799 = 0;
        this.f22796 = false;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C7533<E> clone() {
        try {
            C7533<E> c7533 = (C7533) super.clone();
            c7533.f22797 = (int[]) this.f22797.clone();
            c7533.f22798 = (Object[]) this.f22798.clone();
            return c7533;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m23559(int i) {
        return m23565(i) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m23560(E e) {
        return m23566(e) >= 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m23561(int i) {
        m23572(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m23562() {
        int i = this.f22799;
        int[] iArr = this.f22797;
        Object[] objArr = this.f22798;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f22795) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f22796 = false;
        this.f22799 = i2;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public E m23563(int i) {
        return m23564(i, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public E m23564(int i, E e) {
        E e2;
        int iM1100 = C4146.m1100(this.f22797, this.f22799, i);
        return (iM1100 < 0 || (e2 = (E) this.f22798[iM1100]) == f22795) ? e : e2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m23565(int i) {
        if (this.f22796) {
            m23562();
        }
        return C4146.m1100(this.f22797, this.f22799, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m23566(E e) {
        if (this.f22796) {
            m23562();
        }
        for (int i = 0; i < this.f22799; i++) {
            if (this.f22798[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m23567() {
        return m23579() == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m23568(int i) {
        if (this.f22796) {
            m23562();
        }
        return this.f22797[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m23569(int i, E e) {
        int iM1100 = C4146.m1100(this.f22797, this.f22799, i);
        if (iM1100 >= 0) {
            this.f22798[iM1100] = e;
            return;
        }
        int i2 = ~iM1100;
        int i3 = this.f22799;
        if (i2 < i3) {
            Object[] objArr = this.f22798;
            if (objArr[i2] == f22795) {
                this.f22797[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f22796 && i3 >= this.f22797.length) {
            m23562();
            i2 = ~C4146.m1100(this.f22797, this.f22799, i);
        }
        int i4 = this.f22799;
        if (i4 >= this.f22797.length) {
            int iM12011 = C4146.m12011(i4 + 1);
            int[] iArr = new int[iM12011];
            Object[] objArr2 = new Object[iM12011];
            int[] iArr2 = this.f22797;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f22798;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f22797 = iArr;
            this.f22798 = objArr2;
        }
        int i5 = this.f22799;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f22797;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f22798;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f22799 - i2);
        }
        this.f22797[i2] = i;
        this.f22798[i2] = e;
        this.f22799++;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m23570(@InterfaceC6391 C7533<? extends E> c7533) {
        int iM23579 = c7533.m23579();
        for (int i = 0; i < iM23579; i++) {
            m23569(c7533.m23568(i), c7533.m23580(i));
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public E m23571(int i, E e) {
        E eM23563 = m23563(i);
        if (eM23563 == null) {
            m23569(i, e);
        }
        return eM23563;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m23572(int i) {
        int iM1100 = C4146.m1100(this.f22797, this.f22799, i);
        if (iM1100 >= 0) {
            Object[] objArr = this.f22798;
            Object obj = objArr[iM1100];
            Object obj2 = f22795;
            if (obj != obj2) {
                objArr[iM1100] = obj2;
                this.f22796 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m23573(int i, Object obj) {
        int iM23565 = m23565(i);
        if (iM23565 < 0) {
            return false;
        }
        E eM23580 = m23580(iM23565);
        if (obj != eM23580 && (obj == null || !obj.equals(eM23580))) {
            return false;
        }
        m23574(iM23565);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m23574(int i) {
        Object[] objArr = this.f22798;
        Object obj = objArr[i];
        Object obj2 = f22795;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f22796 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m23575(int i, int i2) {
        int iMin = Math.min(this.f22799, i2 + i);
        while (i < iMin) {
            m23574(i);
            i++;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public E m23576(int i, E e) {
        int iM23565 = m23565(i);
        if (iM23565 < 0) {
            return null;
        }
        Object[] objArr = this.f22798;
        E e2 = (E) objArr[iM23565];
        objArr[iM23565] = e;
        return e2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m23577(int i, E e, E e2) {
        int iM23565 = m23565(i);
        if (iM23565 < 0) {
            return false;
        }
        Object obj = this.f22798[iM23565];
        if (obj != e && (e == null || !e.equals(obj))) {
            return false;
        }
        this.f22798[iM23565] = e2;
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m23578(int i, E e) {
        if (this.f22796) {
            m23562();
        }
        this.f22798[i] = e;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m23579() {
        if (this.f22796) {
            m23562();
        }
        return this.f22799;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public E m23580(int i) {
        if (this.f22796) {
            m23562();
        }
        return (E) this.f22798[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7533(int i) {
        this.f22796 = false;
        if (i == 0) {
            this.f22797 = C4146.f712;
            this.f22798 = C4146.f8480;
        } else {
            int iM12011 = C4146.m12011(i);
            this.f22797 = new int[iM12011];
            this.f22798 = new Object[iM12011];
        }
    }
}
