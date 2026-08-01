package p117i;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p132j.AbstractC3489a;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3062i1 implements Cloneable {

    /* JADX INFO: renamed from: q */
    public /* synthetic */ boolean f8125q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ int[] f8126r;

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object[] f8127s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ int f8128t;

    public C3062i1(int i10) {
        if (i10 == 0) {
            this.f8126r = AbstractC3489a.f9693a;
            this.f8127s = AbstractC3489a.f9695c;
        } else {
            int iM13008e = AbstractC3489a.m13008e(i10);
            this.f8126r = new int[iM13008e];
            this.f8127s = new Object[iM13008e];
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3062i1 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C3062i1 c3062i1 = (C3062i1) objClone;
        c3062i1.f8126r = (int[]) this.f8126r.clone();
        c3062i1.f8127s = (Object[]) this.f8127s.clone();
        return c3062i1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m11353b(int i10) {
        return m11355d(i10) >= 0;
    }

    /* JADX INFO: renamed from: c */
    public Object m11354c(int i10) {
        return AbstractC3065j1.m11378c(this, i10);
    }

    /* JADX INFO: renamed from: d */
    public int m11355d(int i10) {
        if (this.f8125q) {
            AbstractC3065j1.m11379d(this);
        }
        return AbstractC3489a.m13004a(this.f8126r, this.f8128t, i10);
    }

    /* JADX INFO: renamed from: f */
    public int m11356f(int i10) {
        if (this.f8125q) {
            AbstractC3065j1.m11379d(this);
        }
        return this.f8126r[i10];
    }

    /* JADX INFO: renamed from: g */
    public void m11357g(int i10, Object obj) {
        int iM13004a = AbstractC3489a.m13004a(this.f8126r, this.f8128t, i10);
        if (iM13004a >= 0) {
            this.f8127s[iM13004a] = obj;
            return;
        }
        int i11 = ~iM13004a;
        if (i11 < this.f8128t && this.f8127s[i11] == AbstractC3065j1.f8135a) {
            this.f8126r[i11] = i10;
            this.f8127s[i11] = obj;
            return;
        }
        if (this.f8125q && this.f8128t >= this.f8126r.length) {
            AbstractC3065j1.m11379d(this);
            i11 = ~AbstractC3489a.m13004a(this.f8126r, this.f8128t, i10);
        }
        int i12 = this.f8128t;
        if (i12 >= this.f8126r.length) {
            int iM13008e = AbstractC3489a.m13008e(i12 + 1);
            this.f8126r = Arrays.copyOf(this.f8126r, iM13008e);
            this.f8127s = Arrays.copyOf(this.f8127s, iM13008e);
        }
        int i13 = this.f8128t;
        if (i13 - i11 != 0) {
            int[] iArr = this.f8126r;
            int i14 = i11 + 1;
            AbstractC5102r.m20658j(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f8127s;
            AbstractC5102r.m20660l(objArr, objArr, i14, i11, this.f8128t);
        }
        this.f8126r[i11] = i10;
        this.f8127s[i11] = obj;
        this.f8128t++;
    }

    /* JADX INFO: renamed from: h */
    public int m11358h() {
        if (this.f8125q) {
            AbstractC3065j1.m11379d(this);
        }
        return this.f8128t;
    }

    /* JADX INFO: renamed from: i */
    public Object m11359i(int i10) {
        if (this.f8125q) {
            AbstractC3065j1.m11379d(this);
        }
        Object[] objArr = this.f8127s;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        C3051f c3051f = C3051f.f8102a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (m11358h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8128t * 28);
        sb2.append('{');
        int i10 = this.f8128t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m11356f(i11));
            sb2.append('=');
            Object objM11359i = m11359i(i11);
            if (objM11359i != this) {
                sb2.append(objM11359i);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ C3062i1(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
