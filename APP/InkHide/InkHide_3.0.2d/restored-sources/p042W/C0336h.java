package p042W;

import androidx.fragment.app.AbstractC0421L;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p022L.AbstractC0174d;
import p037T.C0263n;
import p037T.C0266q;
import p037T.C0267r;
import p037T.C0268s;
import p041V.C0320m;
import p051b0.C0493b;
import p051b0.C0495d;

/* JADX INFO: renamed from: W.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0336h extends C0493b {

    /* JADX INFO: renamed from: t */
    public static final C0335g f745t = new C0335g();

    /* JADX INFO: renamed from: u */
    public static final Object f746u = new Object();

    /* JADX INFO: renamed from: p */
    public Object[] f747p;

    /* JADX INFO: renamed from: q */
    public int f748q;

    /* JADX INFO: renamed from: r */
    public String[] f749r;

    /* JADX INFO: renamed from: s */
    public int[] f750s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: D */
    public final void mo563D() {
        int iM816d = AbstractC0421L.m816d(mo585x());
        if (iM816d == 1) {
            mo573e();
            return;
        }
        if (iM816d != 9) {
            if (iM816d == 3) {
                mo574f();
                return;
            }
            if (iM816d == 4) {
                m567I(true);
                return;
            }
            m569K();
            int i2 = this.f748q;
            if (i2 > 0) {
                int[] iArr = this.f750s;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m564F(int i2) {
        if (mo585x() == i2) {
            return;
        }
        throw new IllegalStateException("Expected " + AbstractC0174d.m361q(i2) + " but was " + AbstractC0174d.m361q(mo585x()) + m566H());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final String m565G(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.f748q;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.f747p;
            Object obj = objArr[i2];
            if (obj instanceof C0263n) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i4 = this.f750s[i2];
                    if (z2 && i4 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
            } else if ((obj instanceof C0267r) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append('.');
                String str = this.f749r[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final String m566H() {
        return " at path " + m565G(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final String m567I(boolean z2) {
        m564F(5);
        Map.Entry entry = (Map.Entry) ((Iterator) m568J()).next();
        String str = (String) entry.getKey();
        this.f749r[this.f748q - 1] = z2 ? "<skipped>" : str;
        m570L(entry.getValue());
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final Object m568J() {
        return this.f747p[this.f748q - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final Object m569K() {
        Object[] objArr = this.f747p;
        int i2 = this.f748q - 1;
        this.f748q = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m570L(Object obj) {
        int i2 = this.f748q;
        Object[] objArr = this.f747p;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.f747p = Arrays.copyOf(objArr, i3);
            this.f750s = Arrays.copyOf(this.f750s, i3);
            this.f749r = (String[]) Arrays.copyOf(this.f749r, i3);
        }
        Object[] objArr2 = this.f747p;
        int i4 = this.f748q;
        this.f748q = i4 + 1;
        objArr2[i4] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: a */
    public final void mo571a() {
        m564F(1);
        m570L(((C0263n) m568J()).f635a.iterator());
        this.f750s[this.f748q - 1] = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: b */
    public final void mo572b() {
        m564F(3);
        m570L(((C0320m) ((C0267r) m568J()).f637a.entrySet()).iterator());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f747p = new Object[]{f746u};
        this.f748q = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: e */
    public final void mo573e() {
        m564F(2);
        m569K();
        m569K();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: f */
    public final void mo574f() {
        m564F(4);
        this.f749r[this.f748q - 1] = null;
        m569K();
        m569K();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: h */
    public final String mo575h() {
        return m565G(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: j */
    public final String mo576j() {
        return m565G(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: k */
    public final boolean mo577k() {
        int iMo585x = mo585x();
        return (iMo585x == 4 || iMo585x == 2 || iMo585x == 10) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: n */
    public final boolean mo578n() {
        m564F(8);
        boolean zM489b = ((C0268s) m569K()).m489b();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zM489b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: o */
    public final double mo579o() throws C0495d {
        int iMo585x = mo585x();
        if (iMo585x != 7 && iMo585x != 6) {
            throw new IllegalStateException("Expected " + AbstractC0174d.m361q(7) + " but was " + AbstractC0174d.m361q(iMo585x) + m566H());
        }
        C0268s c0268s = (C0268s) m568J();
        double dDoubleValue = c0268s.f638a instanceof Number ? c0268s.m490c().doubleValue() : Double.parseDouble(c0268s.m491d());
        if (!this.f1547b && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new C0495d("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        m569K();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dDoubleValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: p */
    public final int mo580p() {
        int iMo585x = mo585x();
        if (iMo585x != 7 && iMo585x != 6) {
            throw new IllegalStateException("Expected " + AbstractC0174d.m361q(7) + " but was " + AbstractC0174d.m361q(iMo585x) + m566H());
        }
        int iMo487a = ((C0268s) m568J()).mo487a();
        m569K();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iMo487a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: q */
    public final long mo581q() {
        int iMo585x = mo585x();
        if (iMo585x != 7 && iMo585x != 6) {
            throw new IllegalStateException("Expected " + AbstractC0174d.m361q(7) + " but was " + AbstractC0174d.m361q(iMo585x) + m566H());
        }
        C0268s c0268s = (C0268s) m568J();
        long jLongValue = c0268s.f638a instanceof Number ? c0268s.m490c().longValue() : Long.parseLong(c0268s.m491d());
        m569K();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jLongValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: r */
    public final String mo582r() {
        return m567I(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: t */
    public final void mo583t() {
        m564F(9);
        m569K();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    public final String toString() {
        return C0336h.class.getSimpleName() + m566H();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: v */
    public final String mo584v() {
        int iMo585x = mo585x();
        if (iMo585x != 6 && iMo585x != 7) {
            throw new IllegalStateException("Expected " + AbstractC0174d.m361q(6) + " but was " + AbstractC0174d.m361q(iMo585x) + m566H());
        }
        String strM491d = ((C0268s) m569K()).m491d();
        int i2 = this.f748q;
        if (i2 > 0) {
            int[] iArr = this.f750s;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return strM491d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p051b0.C0493b
    /* JADX INFO: renamed from: x */
    public final int mo585x() {
        if (this.f748q == 0) {
            return 10;
        }
        Object objM568J = m568J();
        if (objM568J instanceof Iterator) {
            boolean z2 = this.f747p[this.f748q - 2] instanceof C0267r;
            Iterator it = (Iterator) objM568J;
            if (!it.hasNext()) {
                return z2 ? 4 : 2;
            }
            if (z2) {
                return 5;
            }
            m570L(it.next());
            return mo585x();
        }
        if (objM568J instanceof C0267r) {
            return 3;
        }
        if (objM568J instanceof C0263n) {
            return 1;
        }
        if (objM568J instanceof C0268s) {
            Serializable serializable = ((C0268s) objM568J).f638a;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objM568J instanceof C0266q) {
            return 9;
        }
        if (objM568J == f746u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new C0495d("Custom JsonElement subclass " + objM568J.getClass().getName() + " is not supported");
    }
}
