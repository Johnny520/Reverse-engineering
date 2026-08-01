package p117i;

import java.util.Arrays;
import p024b9.AbstractC1043k;
import p132j.AbstractC3489a;
import p132j.AbstractC3492d;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3037a0 implements Cloneable {

    /* JADX INFO: renamed from: q */
    public /* synthetic */ boolean f8064q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ long[] f8065r;

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object[] f8066s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ int f8067t;

    public C3037a0(int i10) {
        if (i10 == 0) {
            this.f8065r = AbstractC3489a.f9694b;
            this.f8066s = AbstractC3489a.f9695c;
        } else {
            int iM13009f = AbstractC3489a.m13009f(i10);
            this.f8065r = new long[iM13009f];
            this.f8066s = new Object[iM13009f];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11220a() {
        int i10 = this.f8067t;
        Object[] objArr = this.f8066s;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f8067t = 0;
        this.f8064q = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3037a0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C3037a0 c3037a0 = (C3037a0) objClone;
        c3037a0.f8065r = (long[]) this.f8065r.clone();
        c3037a0.f8066s = (Object[]) this.f8066s.clone();
        return c3037a0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m11222c(long j10) {
        return m11224f(j10) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public Object m11223d(long j10) {
        int iM13005b = AbstractC3489a.m13005b(this.f8065r, this.f8067t, j10);
        if (iM13005b < 0 || this.f8066s[iM13005b] == AbstractC3040b0.f8069a) {
            return null;
        }
        return this.f8066s[iM13005b];
    }

    /* JADX INFO: renamed from: f */
    public int m11224f(long j10) {
        if (this.f8064q) {
            int i10 = this.f8067t;
            long[] jArr = this.f8065r;
            Object[] objArr = this.f8066s;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC3040b0.f8069a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f8064q = false;
            this.f8067t = i11;
        }
        return AbstractC3489a.m13005b(this.f8065r, this.f8067t, j10);
    }

    /* JADX INFO: renamed from: g */
    public boolean m11225g() {
        return m11229k() == 0;
    }

    /* JADX INFO: renamed from: h */
    public long m11226h(int i10) {
        if (!(i10 >= 0 && i10 < this.f8067t)) {
            AbstractC3492d.m13015a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f8064q) {
            int i11 = this.f8067t;
            long[] jArr = this.f8065r;
            Object[] objArr = this.f8066s;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC3040b0.f8069a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f8064q = false;
            this.f8067t = i12;
        }
        return this.f8065r[i10];
    }

    /* JADX INFO: renamed from: i */
    public void m11227i(long j10, Object obj) {
        int iM13005b = AbstractC3489a.m13005b(this.f8065r, this.f8067t, j10);
        if (iM13005b >= 0) {
            this.f8066s[iM13005b] = obj;
            return;
        }
        int i10 = ~iM13005b;
        if (i10 < this.f8067t && this.f8066s[i10] == AbstractC3040b0.f8069a) {
            this.f8065r[i10] = j10;
            this.f8066s[i10] = obj;
            return;
        }
        if (this.f8064q) {
            int i11 = this.f8067t;
            long[] jArr = this.f8065r;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f8066s;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj2 = objArr[i13];
                    if (obj2 != AbstractC3040b0.f8069a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj2;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f8064q = false;
                this.f8067t = i12;
                i10 = ~AbstractC3489a.m13005b(this.f8065r, i12, j10);
            }
        }
        int i14 = this.f8067t;
        if (i14 >= this.f8065r.length) {
            int iM13009f = AbstractC3489a.m13009f(i14 + 1);
            this.f8065r = Arrays.copyOf(this.f8065r, iM13009f);
            this.f8066s = Arrays.copyOf(this.f8066s, iM13009f);
        }
        int i15 = this.f8067t;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f8065r;
            int i16 = i10 + 1;
            AbstractC5102r.m20659k(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f8066s;
            AbstractC5102r.m20660l(objArr2, objArr2, i16, i10, this.f8067t);
        }
        this.f8065r[i10] = j10;
        this.f8066s[i10] = obj;
        this.f8067t++;
    }

    /* JADX INFO: renamed from: j */
    public void m11228j(long j10) {
        int iM13005b = AbstractC3489a.m13005b(this.f8065r, this.f8067t, j10);
        if (iM13005b < 0 || this.f8066s[iM13005b] == AbstractC3040b0.f8069a) {
            return;
        }
        this.f8066s[iM13005b] = AbstractC3040b0.f8069a;
        this.f8064q = true;
    }

    /* JADX INFO: renamed from: k */
    public int m11229k() {
        if (this.f8064q) {
            int i10 = this.f8067t;
            long[] jArr = this.f8065r;
            Object[] objArr = this.f8066s;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != AbstractC3040b0.f8069a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f8064q = false;
            this.f8067t = i11;
        }
        return this.f8067t;
    }

    /* JADX INFO: renamed from: l */
    public Object m11230l(int i10) {
        if (!(i10 >= 0 && i10 < this.f8067t)) {
            AbstractC3492d.m13015a("Expected index to be within 0..size()-1, but was " + i10);
        }
        if (this.f8064q) {
            int i11 = this.f8067t;
            long[] jArr = this.f8065r;
            Object[] objArr = this.f8066s;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != AbstractC3040b0.f8069a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f8064q = false;
            this.f8067t = i12;
        }
        return this.f8066s[i10];
    }

    public String toString() {
        if (m11229k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8067t * 28);
        sb2.append('{');
        int i10 = this.f8067t;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m11226h(i11));
            sb2.append('=');
            Object objM11230l = m11230l(i11);
            if (objM11230l != sb2) {
                sb2.append(objM11230l);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ C3037a0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
