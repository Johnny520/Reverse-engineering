package Yue;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3825 extends AbstractCollection {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f7226 = 1073741824;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f7227 = 256;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f7228;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f7229;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f7230;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f7231;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f7232;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f7233;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Object[] f7234;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3825() {
        this(256);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        if (this.f7228 == this.f7231 && !m10564()) {
            return false;
        }
        this.f7228++;
        Object[] objArr = this.f7234;
        int i = this.f7229;
        objArr[i] = obj;
        this.f7229 = this.f7233 & (i + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f7234, (Object) null);
        this.f7228 = 0;
        this.f7229 = 0;
        this.f7230 = 0;
    }

    public Object clone() {
        return new C3825(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f7228 == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C3824(this);
    }

    public Object peek() {
        if (this.f7228 == 0) {
            return null;
        }
        return this.f7234[this.f7230];
    }

    public Object remove() {
        int i = this.f7228;
        if (i == 0) {
            return null;
        }
        this.f7228 = i - 1;
        Object[] objArr = this.f7234;
        int i2 = this.f7230;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f7230 = this.f7233 & (i2 + 1);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f7228;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" - capacity: '");
        stringBuffer.append(m10563());
        stringBuffer.append("' size: '");
        stringBuffer.append(size());
        stringBuffer.append("'");
        StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.toString());
        if (this.f7228 > 0) {
            stringBuffer2.append(" elements:");
            for (int i = 0; i < this.f7228; i++) {
                stringBuffer2.append('\n');
                stringBuffer2.append('\t');
                stringBuffer2.append(this.f7234[(this.f7230 + i) & this.f7233].toString());
            }
        }
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m10563() {
        return this.f7231;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m10564() {
        int i = this.f7231;
        if (i == this.f7232) {
            return false;
        }
        Object[] objArr = this.f7234;
        int i2 = i + i;
        this.f7231 = i2;
        this.f7233 = i2 - 1;
        Object[] objArr2 = new Object[i2];
        this.f7234 = objArr2;
        int i3 = this.f7230;
        System.arraycopy(objArr, i3, objArr2, 0, i - i3);
        int i4 = this.f7230;
        if (i4 != 0) {
            System.arraycopy(objArr, 0, this.f7234, i - i4, i4);
        }
        this.f7230 = 0;
        this.f7229 = this.f7228;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3825(int i) {
        this(i, 1073741824);
    }

    public C3825(int i, int i2) {
        this.f7228 = 0;
        this.f7229 = 0;
        this.f7230 = 0;
        if (i > i2) {
            throw new IllegalArgumentException("Capacity greater than maximum");
        }
        if (i2 <= 1073741824) {
            this.f7231 = 1;
            while (true) {
                int i3 = this.f7231;
                if (i3 >= i) {
                    break;
                } else {
                    this.f7231 = i3 << 1;
                }
            }
            this.f7232 = 1;
            while (true) {
                int i4 = this.f7232;
                if (i4 >= i2) {
                    int i5 = this.f7231;
                    this.f7233 = i5 - 1;
                    this.f7234 = new Object[i5];
                    return;
                }
                this.f7232 = i4 << 1;
            }
        } else {
            throw new IllegalArgumentException("Maximum capacity greater than allowed");
        }
    }

    public C3825(C3825 c3825) {
        this.f7228 = 0;
        this.f7229 = 0;
        this.f7230 = 0;
        this.f7228 = c3825.f7228;
        this.f7229 = c3825.f7229;
        this.f7230 = c3825.f7230;
        this.f7231 = c3825.f7231;
        this.f7232 = c3825.f7232;
        this.f7233 = c3825.f7233;
        Object[] objArr = new Object[c3825.f7234.length];
        this.f7234 = objArr;
        System.arraycopy(c3825.f7234, 0, objArr, 0, objArr.length);
    }
}
