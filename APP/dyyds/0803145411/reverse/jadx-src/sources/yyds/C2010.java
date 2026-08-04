package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲀᛵᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2010 implements Cloneable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public /* synthetic */ Object[] f10066;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public /* synthetic */ boolean f10067;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public /* synthetic */ int f10068;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public /* synthetic */ long[] f10069;

    public C2010() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f10069 = new long[i4];
        this.f10066 = new Object[i4];
    }

    public final Object clone() {
        C2010 c2010 = (C2010) super.clone();
        c2010.f10069 = (long[]) this.f10069.clone();
        c2010.f10066 = (Object[]) this.f10066.clone();
        return c2010;
    }

    public final String toString() {
        int i;
        if (m3887() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10068 * 28);
        sb.append('{');
        int i2 = this.f10068;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (i3 < 0 || i3 >= (i = this.f10068)) {
                AbstractC0024.m3301("Expected index to be within 0..size()-1, but was " + i3);
                throw null;
            }
            if (this.f10067) {
                long[] jArr = this.f10069;
                Object[] objArr = this.f10066;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    if (obj != AbstractC0902.f4114) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr[i4] = obj;
                            objArr[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f10067 = false;
                this.f10068 = i4;
            }
            sb.append(this.f10069[i3]);
            sb.append('=');
            Object objM3883 = m3883(i3);
            if (objM3883 != sb) {
                sb.append(objM3883);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object m3883(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f10068)) {
            AbstractC0024.m3301("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f10067) {
            long[] jArr = this.f10069;
            Object[] objArr = this.f10066;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0902.f4114) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f10067 = false;
            this.f10068 = i3;
        }
        return this.f10066[i];
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3884() {
        int i = this.f10068;
        Object[] objArr = this.f10066;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f10068 = 0;
        this.f10067 = false;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object m3885(long j) {
        Object obj;
        int iM3303 = AbstractC0024.m3303(this.f10069, this.f10068, j);
        if (iM3303 < 0 || (obj = this.f10066[iM3303]) == AbstractC0902.f4114) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3886(long j, Object obj) {
        int iM3303 = AbstractC0024.m3303(this.f10069, this.f10068, j);
        if (iM3303 >= 0) {
            this.f10066[iM3303] = obj;
            return;
        }
        int i = ~iM3303;
        int i2 = this.f10068;
        Object obj2 = AbstractC0902.f4114;
        if (i < i2) {
            Object[] objArr = this.f10066;
            if (objArr[i] == obj2) {
                this.f10069[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f10067) {
            long[] jArr = this.f10069;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.f10066;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f10067 = false;
                this.f10068 = i3;
                i = ~AbstractC0024.m3303(this.f10069, i3, j);
            }
        }
        int i5 = this.f10068;
        if (i5 >= this.f10069.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.f10069 = Arrays.copyOf(this.f10069, i9);
            this.f10066 = Arrays.copyOf(this.f10066, i9);
        }
        int i10 = this.f10068 - i;
        if (i10 != 0) {
            long[] jArr2 = this.f10069;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.f10066;
            AbstractC2070.m3939(i11, i, this.f10068, objArr3, objArr3);
        }
        this.f10069[i] = j;
        this.f10066[i] = obj;
        this.f10068++;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m3887() {
        if (this.f10067) {
            int i = this.f10068;
            long[] jArr = this.f10069;
            Object[] objArr = this.f10066;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC0902.f4114) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f10067 = false;
            this.f10068 = i2;
        }
        return this.f10068;
    }
}
