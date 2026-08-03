package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: x6 */
/* JADX INFO: loaded from: classes.dex */
public class C2701x6 extends AbstractC2744y6 {

    /* JADX INFO: renamed from: d */
    public final byte[] f9275d;

    public C2701x6(byte[] bArr) {
        this.f9371a = 0;
        bArr.getClass();
        this.f9275d = bArr;
    }

    @Override // p000.AbstractC2744y6
    /* JADX INFO: renamed from: a */
    public byte mo5220a(int i) {
        return this.f9275d[i];
    }

    @Override // p000.AbstractC2744y6
    /* JADX INFO: renamed from: e */
    public void mo5221e(int i, byte[] bArr) {
        System.arraycopy(this.f9275d, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2744y6) || size() != ((AbstractC2744y6) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C2701x6)) {
            return obj.equals(this);
        }
        C2701x6 c2701x6 = (C2701x6) obj;
        int i = this.f9371a;
        int i2 = c2701x6.f9371a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c2701x6.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c2701x6.size()) {
            StringBuilder sbM4816m = AbstractC2374ph.m4816m(size, "Ran off end of other: 0, ", ", ");
            sbM4816m.append(c2701x6.size());
            throw new IllegalArgumentException(sbM4816m.toString());
        }
        byte[] bArr = c2701x6.f9275d;
        int iMo5222h = mo5222h() + size;
        int iMo5222h2 = mo5222h();
        int iMo5222h3 = c2701x6.mo5222h();
        while (iMo5222h2 < iMo5222h) {
            if (this.f9275d[iMo5222h2] != bArr[iMo5222h3]) {
                return false;
            }
            iMo5222h2++;
            iMo5222h3++;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public int mo5222h() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2615v6(this);
    }

    /* JADX INFO: renamed from: j */
    public byte mo5223j(int i) {
        return this.f9275d[i];
    }

    @Override // p000.AbstractC2744y6
    public int size() {
        return this.f9275d.length;
    }
}
