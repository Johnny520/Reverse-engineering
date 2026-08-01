package p123;

import androidx.compose.runtime.AbstractC1392;
import com.alibaba.fastjson2.AbstractC2904;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import p048.C6511;
import p115.C7335;
import p115.C7336;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7406 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7406 f20081 = new C7406(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object[] f20082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7335 f20083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f20084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f20085;

    public C7406(int i, int i2, Object[] objArr, C7335 c7335) {
        this.f20085 = i;
        this.f20084 = i2;
        this.f20083 = c7335;
        this.f20082 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C7406 m12546(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C7335 c7335) {
        if (i3 > 30) {
            return new C7406(0, 0, new Object[]{obj, obj2, obj3, obj4}, c7335);
        }
        int iM6243 = AbstractC2904.m6243(i, i3);
        int iM62432 = AbstractC2904.m6243(i2, i3);
        if (iM6243 != iM62432) {
            return new C7406((1 << iM6243) | (1 << iM62432), 0, iM6243 < iM62432 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c7335);
        }
        return new C7406(0, 1 << iM6243, new Object[]{m12546(i, obj, obj2, i2, obj3, obj4, i3 + 5, c7335)}, c7335);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m12547(int i) {
        return Integer.bitCount(this.f20085 & (i - 1)) * 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m12548(C7406 c7406) {
        if (this == c7406) {
            return true;
        }
        if (this.f20084 == c7406.f20084 && this.f20085 == c7406.f20085) {
            int length = this.f20082.length;
            for (int i = 0; i < length; i++) {
                if (this.f20082[i] == c7406.f20082[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m12549(Object obj, int i, int i2) {
        int iM6243 = 1 << AbstractC2904.m6243(i, i2);
        if (m12565(iM6243)) {
            return AbstractC4394.m8917(obj, this.f20082[m12547(iM6243)]);
        }
        if (!m12569(iM6243)) {
            return false;
        }
        C7406 c7406M12554 = m12554(m12553(iM6243));
        return i2 == 30 ? c7406M12554.m12550(obj) : c7406M12554.m12549(obj, i, i2 + 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m12550(Object obj) {
        C6511 c6511M11427 = AbstractC6087.m11427(AbstractC6087.m11422(0, this.f20082.length), 2);
        int i = c6511M11427.f17822;
        int i2 = c6511M11427.f17820;
        int i3 = c6511M11427.f17821;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC4394.m8917(obj, this.f20082[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12551() {
        if (this.f20084 == 0) {
            return this.f20082.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f20085);
        int length = this.f20082.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m12554(i).m12551();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] m12552(int i, int i2, int i3, Object obj, Object obj2, int i4, C7335 c7335) {
        Object obj3 = this.f20082[i];
        C7406 c7406M12546 = m12546(obj3 != null ? obj3.hashCode() : 0, obj3, m12556(i), i3, obj, obj2, i4 + 5, c7335);
        int iM12553 = m12553(i2);
        int i5 = iM12553 + 1;
        Object[] objArr = this.f20082;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC4346.m8837(0, i, objArr, 6, objArr2);
        AbstractC4346.m8839(i, i + 2, objArr, i5, objArr2);
        objArr2[iM12553 - 1] = c7406M12546;
        AbstractC4346.m8839(iM12553, i5, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int m12553(int i) {
        return (this.f20082.length - 1) - Integer.bitCount(this.f20084 & (i - 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7406 m12554(int i) {
        Object obj = this.f20082[i];
        obj.getClass();
        return (C7406) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C7406 m12555(int i, int i2, C7406 c7406) {
        Object[] objArr = c7406.f20082;
        if (objArr.length != 2 || c7406.f20084 != 0) {
            Object[] objArr2 = this.f20082;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = c7406;
            return new C7406(this.f20085, this.f20084, objArrCopyOf, null);
        }
        if (this.f20082.length == 1) {
            c7406.f20085 = this.f20084;
            return c7406;
        }
        int iM12547 = m12547(i2);
        Object[] objArr3 = this.f20082;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC4346.m8839(i + 2, i + 1, objArrCopyOf2, objArr3.length, objArrCopyOf2);
        AbstractC4346.m8839(iM12547 + 2, iM12547, objArrCopyOf2, i, objArrCopyOf2);
        objArrCopyOf2[iM12547] = obj;
        objArrCopyOf2[iM12547 + 1] = obj2;
        return new C7406(this.f20085 ^ i2, this.f20084 ^ i2, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object m12556(int i) {
        return this.f20082[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.f315 = m12555(r7, r2, (p123.C7406) r14.f315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.app.C0107 m12557(int r14, int r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123.C7406.m12557(int, int, java.lang.Object, java.lang.Object):androidx.appcompat.app.飘花落叶言子楪苏哲兰世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7406 m12558(Object obj, int i, int i2) {
        C7406 c7406M12558;
        int iM6243 = 1 << AbstractC2904.m6243(i, i2);
        if (m12565(iM6243)) {
            int iM12547 = m12547(iM6243);
            if (!AbstractC4394.m8917(obj, this.f20082[iM12547])) {
                return this;
            }
            Object[] objArr = this.f20082;
            if (objArr.length != 2) {
                return new C7406(this.f20085 ^ iM6243, this.f20084, AbstractC2904.m6255(iM12547, objArr), null);
            }
        } else {
            if (!m12569(iM6243)) {
                return this;
            }
            int iM12553 = m12553(iM6243);
            C7406 c7406M12554 = m12554(iM12553);
            if (i2 == 30) {
                C6511 c6511M11427 = AbstractC6087.m11427(AbstractC6087.m11422(0, c7406M12554.f20082.length), 2);
                int i3 = c6511M11427.f17822;
                int i4 = c6511M11427.f17820;
                int i5 = c6511M11427.f17821;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    c7406M12558 = c7406M12554;
                    break;
                }
                while (!AbstractC4394.m8917(obj, c7406M12554.f20082[i3])) {
                    if (i3 == i4) {
                        c7406M12558 = c7406M12554;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = c7406M12554.f20082;
                c7406M12558 = objArr2.length == 2 ? null : new C7406(0, 0, AbstractC2904.m6255(i3, objArr2), null);
            } else {
                c7406M12558 = c7406M12554.m12558(obj, i, i2 + 5);
            }
            if (c7406M12558 != null) {
                return c7406M12554 != c7406M12558 ? m12555(iM12553, iM6243, c7406M12558) : this;
            }
            Object[] objArr3 = this.f20082;
            if (objArr3.length != 1) {
                return new C7406(this.f20085, this.f20084 ^ iM6243, AbstractC2904.m6254(iM12553, objArr3), null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7406 m12559(int i, Object obj, int i2, C7398 c7398) {
        C7406 c7406M12559;
        int iM6243 = 1 << AbstractC2904.m6243(i, i2);
        if (m12565(iM6243)) {
            int iM12547 = m12547(iM6243);
            if (AbstractC4394.m8917(obj, this.f20082[iM12547])) {
                return m12564(iM12547, iM6243, c7398);
            }
        } else if (m12569(iM6243)) {
            int iM12553 = m12553(iM6243);
            C7406 c7406M12554 = m12554(iM12553);
            if (i2 == 30) {
                C6511 c6511M11427 = AbstractC6087.m11427(AbstractC6087.m11422(0, c7406M12554.f20082.length), 2);
                int i3 = c6511M11427.f17822;
                int i4 = c6511M11427.f17820;
                int i5 = c6511M11427.f17821;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    c7406M12559 = c7406M12554;
                    break;
                }
                while (!AbstractC4394.m8917(obj, c7406M12554.f20082[i3])) {
                    if (i3 == i4) {
                        c7406M12559 = c7406M12554;
                        break;
                    }
                    i3 += i5;
                }
                c7406M12559 = c7406M12554.m12567(i3, c7398);
            } else {
                c7406M12559 = c7406M12554.m12559(i, obj, i2 + 5, c7398);
            }
            return m12561(c7406M12554, c7406M12559, iM12553, iM6243, c7398.f20067);
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7406 m12560(C7406 c7406, int i, C7336 c7336, C7398 c7398) {
        Object[] objArr;
        C7406 c7406M12546;
        if (this == c7406) {
            c7336.f19554 += m12551();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C7335 c7335 = c7398.f20067;
            int i3 = c7406.f20084;
            Object[] objArr2 = this.f20082;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c7406.f20082.length);
            int length = this.f20082.length;
            C6511 c6511M11427 = AbstractC6087.m11427(AbstractC6087.m11422(0, c7406.f20082.length), 2);
            int i4 = c6511M11427.f17822;
            int i5 = c6511M11427.f17820;
            int i6 = c6511M11427.f17821;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m12550(c7406.f20082[i4])) {
                        c7336.f19554++;
                    } else {
                        Object[] objArr3 = c7406.f20082;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.f20082.length) {
                return length == c7406.f20082.length ? c7406 : length == objArrCopyOf.length ? new C7406(0, 0, objArrCopyOf, c7335) : new C7406(0, 0, Arrays.copyOf(objArrCopyOf, length), c7335);
            }
        } else {
            int i7 = this.f20084 | c7406.f20084;
            int i8 = this.f20085;
            int i9 = c7406.f20085;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (AbstractC4394.m8917(this.f20082[m12547(iLowestOneBit)], c7406.f20082[c7406.m12547(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                AbstractC1392.m2527("Check failed.");
            }
            C7406 c74062 = (AbstractC4394.m8917(this.f20083, c7398.f20067) && this.f20085 == i12 && this.f20084 == i7) ? this : new C7406(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = c74062.f20082;
                int length2 = (objArr4.length - 1) - i14;
                if (m12569(iLowestOneBit2)) {
                    c7406M12546 = m12554(m12553(iLowestOneBit2));
                    if (c7406.m12569(iLowestOneBit2)) {
                        c7406M12546 = c7406M12546.m12560(c7406.m12554(c7406.m12553(iLowestOneBit2)), i + 5, c7336, c7398);
                        objArr = objArr4;
                    } else if (c7406.m12565(iLowestOneBit2)) {
                        int iM12547 = c7406.m12547(iLowestOneBit2);
                        Object obj = c7406.f20082[iM12547];
                        Object objM12556 = c7406.m12556(iM12547);
                        int i15 = c7398.f20066;
                        objArr = objArr4;
                        c7406M12546 = c7406M12546.m12568(obj != null ? obj.hashCode() : i2, obj, objM12556, i + 5, c7398);
                        if (c7398.f20066 == i15) {
                            c7336.f19554++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c7406.m12569(iLowestOneBit2)) {
                        C7406 c7406M12554 = c7406.m12554(c7406.m12553(iLowestOneBit2));
                        if (m12565(iLowestOneBit2)) {
                            int iM125472 = m12547(iLowestOneBit2);
                            Object obj2 = this.f20082[iM125472];
                            int i16 = i + 5;
                            if (c7406M12554.m12549(obj2, obj2 != null ? obj2.hashCode() : 0, i16)) {
                                c7336.f19554++;
                                c7406M12546 = c7406M12554;
                            } else {
                                c7406M12546 = c7406M12554.m12568(obj2 != null ? obj2.hashCode() : 0, obj2, m12556(iM125472), i16, c7398);
                            }
                        } else {
                            c7406M12546 = c7406M12554;
                        }
                    } else {
                        int iM125473 = m12547(iLowestOneBit2);
                        Object obj3 = this.f20082[iM125473];
                        Object objM125562 = m12556(iM125473);
                        int iM125474 = c7406.m12547(iLowestOneBit2);
                        Object obj4 = c7406.f20082[iM125474];
                        c7406M12546 = m12546(obj3 != null ? obj3.hashCode() : 0, obj3, objM125562, obj4 != null ? obj4.hashCode() : 0, obj4, c7406.m12556(iM125474), i + 5, c7398.f20067);
                    }
                }
                objArr[length2] = c7406M12546;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (c7406.m12565(iLowestOneBit3)) {
                    int iM125475 = c7406.m12547(iLowestOneBit3);
                    Object[] objArr5 = c74062.f20082;
                    objArr5[i18] = c7406.f20082[iM125475];
                    objArr5[i18 + 1] = c7406.m12556(iM125475);
                    if (m12565(iLowestOneBit3)) {
                        c7336.f19554++;
                    }
                } else {
                    int iM125476 = m12547(iLowestOneBit3);
                    Object[] objArr6 = c74062.f20082;
                    objArr6[i18] = this.f20082[iM125476];
                    objArr6[i18 + 1] = m12556(iM125476);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!m12548(c74062)) {
                return c7406.m12548(c74062) ? c7406 : c74062;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7406 m12561(C7406 c7406, C7406 c74062, int i, int i2, C7335 c7335) {
        C7335 c73352 = this.f20083;
        if (c74062 != null) {
            return (c73352 == c7335 || c7406 != c74062) ? m12562(i, c74062, c7335) : this;
        }
        Object[] objArr = this.f20082;
        if (objArr.length == 1) {
            return null;
        }
        if (c73352 != c7335) {
            return new C7406(this.f20085, this.f20084 ^ i2, AbstractC2904.m6254(i, objArr), c7335);
        }
        this.f20082 = AbstractC2904.m6254(i, objArr);
        this.f20084 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7406 m12562(int i, C7406 c7406, C7335 c7335) {
        Object[] objArr = this.f20082;
        if (objArr.length == 1 && c7406.f20082.length == 2 && c7406.f20084 == 0) {
            c7406.f20085 = this.f20084;
            return c7406;
        }
        if (this.f20083 == c7335) {
            objArr[i] = c7406;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c7406;
        return new C7406(this.f20085, this.f20084, objArrCopyOf, c7335);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7406 m12563(int i, Object obj, Object obj2, int i2, C7398 c7398) {
        C7398 c73982;
        C7406 c7406M12563;
        int iM6243 = 1 << AbstractC2904.m6243(i, i2);
        if (m12565(iM6243)) {
            int iM12547 = m12547(iM6243);
            return (AbstractC4394.m8917(obj, this.f20082[iM12547]) && AbstractC4394.m8917(obj2, m12556(iM12547))) ? m12564(iM12547, iM6243, c7398) : this;
        }
        if (!m12569(iM6243)) {
            return this;
        }
        int iM12553 = m12553(iM6243);
        C7406 c7406M12554 = m12554(iM12553);
        if (i2 == 30) {
            C6511 c6511M11427 = AbstractC6087.m11427(AbstractC6087.m11422(0, c7406M12554.f20082.length), 2);
            int i3 = c6511M11427.f17822;
            int i4 = c6511M11427.f17820;
            int i5 = c6511M11427.f17821;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                c7406M12563 = c7406M12554;
                c73982 = c7398;
            } else {
                while (true) {
                    if (!AbstractC4394.m8917(obj, c7406M12554.f20082[i3]) || !AbstractC4394.m8917(obj2, c7406M12554.m12556(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        c7406M12563 = c7406M12554.m12567(i3, c7398);
                        break;
                    }
                }
                c7406M12563 = c7406M12554;
                c73982 = c7398;
            }
        } else {
            c73982 = c7398;
            c7406M12563 = c7406M12554.m12563(i, obj, obj2, i2 + 5, c73982);
        }
        return m12561(c7406M12554, c7406M12563, iM12553, iM6243, c73982.f20067);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7406 m12564(int i, int i2, C7398 c7398) {
        c7398.m12542(c7398.f20066 - 1);
        c7398.f20065 = m12556(i);
        Object[] objArr = this.f20082;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f20083 != c7398.f20067) {
            return new C7406(i2 ^ this.f20085, this.f20084, AbstractC2904.m6255(i, objArr), c7398.f20067);
        }
        this.f20082 = AbstractC2904.m6255(i, objArr);
        this.f20085 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12565(int i) {
        return (this.f20085 & i) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m12566(Object obj, int i, int i2) {
        int iM6243 = 1 << AbstractC2904.m6243(i, i2);
        if (m12565(iM6243)) {
            int iM12547 = m12547(iM6243);
            if (AbstractC4394.m8917(obj, this.f20082[iM12547])) {
                return m12556(iM12547);
            }
            return null;
        }
        if (!m12569(iM6243)) {
            return null;
        }
        C7406 c7406M12554 = m12554(m12553(iM6243));
        if (i2 != 30) {
            return c7406M12554.m12566(obj, i, i2 + 5);
        }
        C6511 c6511M11427 = AbstractC6087.m11427(AbstractC6087.m11422(0, c7406M12554.f20082.length), 2);
        int i3 = c6511M11427.f17822;
        int i4 = c6511M11427.f17820;
        int i5 = c6511M11427.f17821;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!AbstractC4394.m8917(obj, c7406M12554.f20082[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return c7406M12554.m12556(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7406 m12567(int i, C7398 c7398) {
        c7398.m12542(c7398.f20066 - 1);
        c7398.f20065 = m12556(i);
        Object[] objArr = this.f20082;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f20083 != c7398.f20067) {
            return new C7406(0, 0, AbstractC2904.m6255(i, objArr), c7398.f20067);
        }
        this.f20082 = AbstractC2904.m6255(i, objArr);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7406 m12568(int i, Object obj, Object obj2, int i2, C7398 c7398) {
        C7398 c73982;
        C7406 c7406M12568;
        int iM6243 = 1 << AbstractC2904.m6243(i, i2);
        boolean zM12565 = m12565(iM6243);
        C7335 c7335 = this.f20083;
        if (zM12565) {
            int iM12547 = m12547(iM6243);
            if (!AbstractC4394.m8917(obj, this.f20082[iM12547])) {
                c7398.m12542(c7398.f20066 + 1);
                C7335 c73352 = c7398.f20067;
                if (c7335 != c73352) {
                    return new C7406(this.f20085 ^ iM6243, this.f20084 | iM6243, m12552(iM12547, iM6243, i, obj, obj2, i2, c73352), c73352);
                }
                this.f20082 = m12552(iM12547, iM6243, i, obj, obj2, i2, c73352);
                this.f20085 ^= iM6243;
                this.f20084 |= iM6243;
                return this;
            }
            c7398.f20065 = m12556(iM12547);
            if (m12556(iM12547) == obj2) {
                return this;
            }
            if (c7335 == c7398.f20067) {
                this.f20082[iM12547 + 1] = obj2;
                return this;
            }
            c7398.f20064++;
            Object[] objArr = this.f20082;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM12547 + 1] = obj2;
            return new C7406(this.f20085, this.f20084, objArrCopyOf, c7398.f20067);
        }
        if (!m12569(iM6243)) {
            c7398.m12542(c7398.f20066 + 1);
            C7335 c73353 = c7398.f20067;
            int iM125472 = m12547(iM6243);
            Object[] objArr2 = this.f20082;
            if (c7335 != c73353) {
                return new C7406(this.f20085 | iM6243, this.f20084, AbstractC2904.m6256(objArr2, iM125472, obj, obj2), c73353);
            }
            this.f20082 = AbstractC2904.m6256(objArr2, iM125472, obj, obj2);
            this.f20085 |= iM6243;
            return this;
        }
        int iM12553 = m12553(iM6243);
        C7406 c7406M12554 = m12554(iM12553);
        if (i2 == 30) {
            C6511 c6511M11427 = AbstractC6087.m11427(AbstractC6087.m11422(0, c7406M12554.f20082.length), 2);
            int i3 = c6511M11427.f17822;
            int i4 = c6511M11427.f17820;
            int i5 = c6511M11427.f17821;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                c7398.m12542(c7398.f20066 + 1);
                c7406M12568 = new C7406(0, 0, AbstractC2904.m6256(c7406M12554.f20082, 0, obj, obj2), c7398.f20067);
                c73982 = c7398;
            } else {
                while (!AbstractC4394.m8917(obj, c7406M12554.f20082[i3])) {
                    if (i3 == i4) {
                        c7398.m12542(c7398.f20066 + 1);
                        c7406M12568 = new C7406(0, 0, AbstractC2904.m6256(c7406M12554.f20082, 0, obj, obj2), c7398.f20067);
                        break;
                    }
                    i3 += i5;
                }
                c7398.f20065 = c7406M12554.m12556(i3);
                if (c7406M12554.f20083 == c7398.f20067) {
                    c7406M12554.f20082[i3 + 1] = obj2;
                    c7406M12568 = c7406M12554;
                } else {
                    c7398.f20064++;
                    Object[] objArr3 = c7406M12554.f20082;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    c7406M12568 = new C7406(0, 0, objArrCopyOf2, c7398.f20067);
                }
                c73982 = c7398;
            }
        } else {
            c73982 = c7398;
            c7406M12568 = c7406M12554.m12568(i, obj, obj2, i2 + 5, c73982);
        }
        return c7406M12554 == c7406M12568 ? this : m12562(iM12553, c7406M12568, c73982.f20067);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m12569(int i) {
        return (this.f20084 & i) != 0;
    }
}
