package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.AbstractC6522;
import org.apache.commons.lang3.ObjectUtils$Null;

/* JADX INFO: renamed from: org.apache.commons.lang3.builder.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f15866 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m11586(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.f15866 == 0 && obj != obj2) {
            if (obj == null) {
                this.f15866 = -1;
                return;
            }
            if (obj2 == null) {
                this.f15866 = 1;
                return;
            }
            ObjectUtils$Null objectUtils$Null = AbstractC6522.f15970;
            if (!obj.getClass().isArray()) {
                this.f15866 = ((Comparable) obj).compareTo(obj2);
                return;
            }
            int i9 = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (this.f15866 == 0 && jArr != jArr2) {
                    if (jArr.length != jArr2.length) {
                        this.f15866 = jArr.length >= jArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < jArr.length && (i8 = this.f15866) == 0) {
                        long j = jArr[i9];
                        long j2 = jArr2[i9];
                        if (i8 == 0) {
                            this.f15866 = Long.compare(j, j2);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (this.f15866 == 0 && iArr != iArr2) {
                    if (iArr.length != iArr2.length) {
                        this.f15866 = iArr.length >= iArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < iArr.length && (i7 = this.f15866) == 0) {
                        int i10 = iArr[i9];
                        int i11 = iArr2[i9];
                        if (i7 == 0) {
                            this.f15866 = Integer.compare(i10, i11);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (this.f15866 == 0 && sArr != sArr2) {
                    if (sArr.length != sArr2.length) {
                        this.f15866 = sArr.length >= sArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < sArr.length && (i6 = this.f15866) == 0) {
                        short s = sArr[i9];
                        short s2 = sArr2[i9];
                        if (i6 == 0) {
                            this.f15866 = Short.compare(s, s2);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (this.f15866 == 0 && cArr != cArr2) {
                    if (cArr.length != cArr2.length) {
                        this.f15866 = cArr.length >= cArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < cArr.length && (i5 = this.f15866) == 0) {
                        char c = cArr[i9];
                        char c2 = cArr2[i9];
                        if (i5 == 0) {
                            this.f15866 = Character.compare(c, c2);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (this.f15866 == 0 && bArr != bArr2) {
                    if (bArr.length != bArr2.length) {
                        this.f15866 = bArr.length >= bArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < bArr.length && (i4 = this.f15866) == 0) {
                        byte b = bArr[i9];
                        byte b2 = bArr2[i9];
                        if (i4 == 0) {
                            this.f15866 = Byte.compare(b, b2);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (this.f15866 == 0 && dArr != dArr2) {
                    if (dArr.length != dArr2.length) {
                        this.f15866 = dArr.length >= dArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < dArr.length && (i3 = this.f15866) == 0) {
                        double d = dArr[i9];
                        double d2 = dArr2[i9];
                        if (i3 == 0) {
                            this.f15866 = Double.compare(d, d2);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (this.f15866 == 0 && fArr != fArr2) {
                    if (fArr.length != fArr2.length) {
                        this.f15866 = fArr.length >= fArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < fArr.length && (i2 = this.f15866) == 0) {
                        float f = fArr[i9];
                        float f2 = fArr2[i9];
                        if (i2 == 0) {
                            this.f15866 = Float.compare(f, f2);
                        }
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (!(obj instanceof boolean[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.f15866 == 0 && objArr != objArr2) {
                    if (objArr.length != objArr2.length) {
                        this.f15866 = objArr.length >= objArr2.length ? 1 : -1;
                        return;
                    }
                    while (i9 < objArr.length && this.f15866 == 0) {
                        m11586(objArr[i9], objArr2[i9]);
                        i9++;
                    }
                    return;
                }
                return;
            }
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (this.f15866 == 0 && zArr != zArr2) {
                if (zArr.length != zArr2.length) {
                    this.f15866 = zArr.length >= zArr2.length ? 1 : -1;
                    return;
                }
                while (i9 < zArr.length && (i = this.f15866) == 0) {
                    boolean z = zArr[i9];
                    boolean z2 = zArr2[i9];
                    if (i == 0 && z != z2) {
                        if (z) {
                            this.f15866 = 1;
                        } else {
                            this.f15866 = -1;
                        }
                    }
                    i9++;
                }
            }
        }
    }
}
