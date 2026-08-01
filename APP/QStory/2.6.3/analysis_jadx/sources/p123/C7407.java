package p123;

import androidx.compose.runtime.AbstractC1392;
import androidx.window.area.AbstractC2567;
import com.bumptech.glide.AbstractC3065;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import p048.C6512;
import p115.C7336;
import p115.C7337;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7407 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7407 f20076 = new C7407(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object[] f20077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7336 f20078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f20079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f20080;

    public C7407(int i, int i2, Object[] objArr, C7336 c7336) {
        this.f20080 = i;
        this.f20079 = i2;
        this.f20078 = c7336;
        this.f20077 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C7407 m12573(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C7336 c7336) {
        if (i3 > 30) {
            return new C7407(0, 0, new Object[]{obj, obj2, obj3, obj4}, c7336);
        }
        int iM6811 = AbstractC3065.m6811(i, i3);
        int iM68112 = AbstractC3065.m6811(i2, i3);
        if (iM6811 != iM68112) {
            return new C7407((1 << iM6811) | (1 << iM68112), 0, iM6811 < iM68112 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c7336);
        }
        return new C7407(0, 1 << iM6811, new Object[]{m12573(i, obj, obj2, i2, obj3, obj4, i3 + 5, c7336)}, c7336);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m12574(int i) {
        return Integer.bitCount(this.f20080 & (i - 1)) * 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m12575(C7407 c7407) {
        if (this == c7407) {
            return true;
        }
        if (this.f20079 == c7407.f20079 && this.f20080 == c7407.f20080) {
            int length = this.f20077.length;
            for (int i = 0; i < length; i++) {
                if (this.f20077[i] == c7407.f20077[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m12576(Object obj, int i, int i2) {
        int iM6811 = 1 << AbstractC3065.m6811(i, i2);
        if (m12592(iM6811)) {
            return AbstractC4395.m8907(obj, this.f20077[m12574(iM6811)]);
        }
        if (!m12596(iM6811)) {
            return false;
        }
        C7407 c7407M12581 = m12581(m12580(iM6811));
        return i2 == 30 ? c7407M12581.m12577(obj) : c7407M12581.m12576(obj, i, i2 + 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m12577(Object obj) {
        C6512 c6512M5068 = AbstractC2567.m5068(AbstractC2567.m5067(0, this.f20077.length), 2);
        int i = c6512M5068.f17818;
        int i2 = c6512M5068.f17816;
        int i3 = c6512M5068.f17817;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC4395.m8907(obj, this.f20077[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12578() {
        if (this.f20079 == 0) {
            return this.f20077.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f20080);
        int length = this.f20077.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m12581(i).m12578();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] m12579(int i, int i2, int i3, Object obj, Object obj2, int i4, C7336 c7336) {
        Object obj3 = this.f20077[i];
        C7407 c7407M12573 = m12573(obj3 != null ? obj3.hashCode() : 0, obj3, m12583(i), i3, obj, obj2, i4 + 5, c7336);
        int iM12580 = m12580(i2);
        int i5 = iM12580 + 1;
        Object[] objArr = this.f20077;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC4347.m8840(0, i, objArr, 6, objArr2);
        AbstractC4347.m8835(i, i + 2, objArr, i5, objArr2);
        objArr2[iM12580 - 1] = c7407M12573;
        AbstractC4347.m8835(iM12580, i5, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int m12580(int i) {
        return (this.f20077.length - 1) - Integer.bitCount(this.f20079 & (i - 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7407 m12581(int i) {
        Object obj = this.f20077[i];
        obj.getClass();
        return (C7407) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C7407 m12582(int i, int i2, C7407 c7407) {
        Object[] objArr = c7407.f20077;
        if (objArr.length != 2 || c7407.f20079 != 0) {
            Object[] objArr2 = this.f20077;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = c7407;
            return new C7407(this.f20080, this.f20079, objArrCopyOf, null);
        }
        if (this.f20077.length == 1) {
            c7407.f20080 = this.f20079;
            return c7407;
        }
        int iM12574 = m12574(i2);
        Object[] objArr3 = this.f20077;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC4347.m8835(i + 2, i + 1, objArrCopyOf2, objArr3.length, objArrCopyOf2);
        AbstractC4347.m8835(iM12574 + 2, iM12574, objArrCopyOf2, i, objArrCopyOf2);
        objArrCopyOf2[iM12574] = obj;
        objArrCopyOf2[iM12574 + 1] = obj2;
        return new C7407(this.f20080 ^ i2, this.f20079 ^ i2, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object m12583(int i) {
        return this.f20077[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.f315 = m12582(r7, r2, (p123.C7407) r14.f315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.app.C0107 m12584(int r14, int r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123.C7407.m12584(int, int, java.lang.Object, java.lang.Object):androidx.appcompat.app.飘花落叶言子楪苏哲兰世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7407 m12585(Object obj, int i, int i2) {
        C7407 c7407M12585;
        int iM6811 = 1 << AbstractC3065.m6811(i, i2);
        if (m12592(iM6811)) {
            int iM12574 = m12574(iM6811);
            if (!AbstractC4395.m8907(obj, this.f20077[iM12574])) {
                return this;
            }
            Object[] objArr = this.f20077;
            if (objArr.length != 2) {
                return new C7407(this.f20080 ^ iM6811, this.f20079, AbstractC3065.m6821(iM12574, objArr), null);
            }
        } else {
            if (!m12596(iM6811)) {
                return this;
            }
            int iM12580 = m12580(iM6811);
            C7407 c7407M12581 = m12581(iM12580);
            if (i2 == 30) {
                C6512 c6512M5068 = AbstractC2567.m5068(AbstractC2567.m5067(0, c7407M12581.f20077.length), 2);
                int i3 = c6512M5068.f17818;
                int i4 = c6512M5068.f17816;
                int i5 = c6512M5068.f17817;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    c7407M12585 = c7407M12581;
                    break;
                }
                while (!AbstractC4395.m8907(obj, c7407M12581.f20077[i3])) {
                    if (i3 == i4) {
                        c7407M12585 = c7407M12581;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = c7407M12581.f20077;
                c7407M12585 = objArr2.length == 2 ? null : new C7407(0, 0, AbstractC3065.m6821(i3, objArr2), null);
            } else {
                c7407M12585 = c7407M12581.m12585(obj, i, i2 + 5);
            }
            if (c7407M12585 != null) {
                return c7407M12581 != c7407M12585 ? m12582(iM12580, iM6811, c7407M12585) : this;
            }
            Object[] objArr3 = this.f20077;
            if (objArr3.length != 1) {
                return new C7407(this.f20080, this.f20079 ^ iM6811, AbstractC3065.m6820(iM12580, objArr3), null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7407 m12586(int i, Object obj, int i2, C7399 c7399) {
        C7407 c7407M12586;
        int iM6811 = 1 << AbstractC3065.m6811(i, i2);
        if (m12592(iM6811)) {
            int iM12574 = m12574(iM6811);
            if (AbstractC4395.m8907(obj, this.f20077[iM12574])) {
                return m12591(iM12574, iM6811, c7399);
            }
        } else if (m12596(iM6811)) {
            int iM12580 = m12580(iM6811);
            C7407 c7407M12581 = m12581(iM12580);
            if (i2 == 30) {
                C6512 c6512M5068 = AbstractC2567.m5068(AbstractC2567.m5067(0, c7407M12581.f20077.length), 2);
                int i3 = c6512M5068.f17818;
                int i4 = c6512M5068.f17816;
                int i5 = c6512M5068.f17817;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    c7407M12586 = c7407M12581;
                    break;
                }
                while (!AbstractC4395.m8907(obj, c7407M12581.f20077[i3])) {
                    if (i3 == i4) {
                        c7407M12586 = c7407M12581;
                        break;
                    }
                    i3 += i5;
                }
                c7407M12586 = c7407M12581.m12594(i3, c7399);
            } else {
                c7407M12586 = c7407M12581.m12586(i, obj, i2 + 5, c7399);
            }
            return m12588(c7407M12581, c7407M12586, iM12580, iM6811, c7399.f20062);
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7407 m12587(C7407 c7407, int i, C7337 c7337, C7399 c7399) {
        Object[] objArr;
        C7407 c7407M12573;
        if (this == c7407) {
            c7337.f19549 += m12578();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C7336 c7336 = c7399.f20062;
            int i3 = c7407.f20079;
            Object[] objArr2 = this.f20077;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c7407.f20077.length);
            int length = this.f20077.length;
            C6512 c6512M5068 = AbstractC2567.m5068(AbstractC2567.m5067(0, c7407.f20077.length), 2);
            int i4 = c6512M5068.f17818;
            int i5 = c6512M5068.f17816;
            int i6 = c6512M5068.f17817;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m12577(c7407.f20077[i4])) {
                        c7337.f19549++;
                    } else {
                        Object[] objArr3 = c7407.f20077;
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
            if (length != this.f20077.length) {
                return length == c7407.f20077.length ? c7407 : length == objArrCopyOf.length ? new C7407(0, 0, objArrCopyOf, c7336) : new C7407(0, 0, Arrays.copyOf(objArrCopyOf, length), c7336);
            }
        } else {
            int i7 = this.f20079 | c7407.f20079;
            int i8 = this.f20080;
            int i9 = c7407.f20080;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (AbstractC4395.m8907(this.f20077[m12574(iLowestOneBit)], c7407.f20077[c7407.m12574(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                AbstractC1392.m2537("Check failed.");
            }
            C7407 c74072 = (AbstractC4395.m8907(this.f20078, c7399.f20062) && this.f20080 == i12 && this.f20079 == i7) ? this : new C7407(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = c74072.f20077;
                int length2 = (objArr4.length - 1) - i14;
                if (m12596(iLowestOneBit2)) {
                    c7407M12573 = m12581(m12580(iLowestOneBit2));
                    if (c7407.m12596(iLowestOneBit2)) {
                        c7407M12573 = c7407M12573.m12587(c7407.m12581(c7407.m12580(iLowestOneBit2)), i + 5, c7337, c7399);
                        objArr = objArr4;
                    } else if (c7407.m12592(iLowestOneBit2)) {
                        int iM12574 = c7407.m12574(iLowestOneBit2);
                        Object obj = c7407.f20077[iM12574];
                        Object objM12583 = c7407.m12583(iM12574);
                        int i15 = c7399.f20061;
                        objArr = objArr4;
                        c7407M12573 = c7407M12573.m12595(obj != null ? obj.hashCode() : i2, obj, objM12583, i + 5, c7399);
                        if (c7399.f20061 == i15) {
                            c7337.f19549++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c7407.m12596(iLowestOneBit2)) {
                        C7407 c7407M12581 = c7407.m12581(c7407.m12580(iLowestOneBit2));
                        if (m12592(iLowestOneBit2)) {
                            int iM125742 = m12574(iLowestOneBit2);
                            Object obj2 = this.f20077[iM125742];
                            int i16 = i + 5;
                            if (c7407M12581.m12576(obj2, obj2 != null ? obj2.hashCode() : 0, i16)) {
                                c7337.f19549++;
                                c7407M12573 = c7407M12581;
                            } else {
                                c7407M12573 = c7407M12581.m12595(obj2 != null ? obj2.hashCode() : 0, obj2, m12583(iM125742), i16, c7399);
                            }
                        } else {
                            c7407M12573 = c7407M12581;
                        }
                    } else {
                        int iM125743 = m12574(iLowestOneBit2);
                        Object obj3 = this.f20077[iM125743];
                        Object objM125832 = m12583(iM125743);
                        int iM125744 = c7407.m12574(iLowestOneBit2);
                        Object obj4 = c7407.f20077[iM125744];
                        c7407M12573 = m12573(obj3 != null ? obj3.hashCode() : 0, obj3, objM125832, obj4 != null ? obj4.hashCode() : 0, obj4, c7407.m12583(iM125744), i + 5, c7399.f20062);
                    }
                }
                objArr[length2] = c7407M12573;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (c7407.m12592(iLowestOneBit3)) {
                    int iM125745 = c7407.m12574(iLowestOneBit3);
                    Object[] objArr5 = c74072.f20077;
                    objArr5[i18] = c7407.f20077[iM125745];
                    objArr5[i18 + 1] = c7407.m12583(iM125745);
                    if (m12592(iLowestOneBit3)) {
                        c7337.f19549++;
                    }
                } else {
                    int iM125746 = m12574(iLowestOneBit3);
                    Object[] objArr6 = c74072.f20077;
                    objArr6[i18] = this.f20077[iM125746];
                    objArr6[i18 + 1] = m12583(iM125746);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!m12575(c74072)) {
                return c7407.m12575(c74072) ? c7407 : c74072;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7407 m12588(C7407 c7407, C7407 c74072, int i, int i2, C7336 c7336) {
        C7336 c73362 = this.f20078;
        if (c74072 != null) {
            return (c73362 == c7336 || c7407 != c74072) ? m12589(i, c74072, c7336) : this;
        }
        Object[] objArr = this.f20077;
        if (objArr.length == 1) {
            return null;
        }
        if (c73362 != c7336) {
            return new C7407(this.f20080, this.f20079 ^ i2, AbstractC3065.m6820(i, objArr), c7336);
        }
        this.f20077 = AbstractC3065.m6820(i, objArr);
        this.f20079 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7407 m12589(int i, C7407 c7407, C7336 c7336) {
        Object[] objArr = this.f20077;
        if (objArr.length == 1 && c7407.f20077.length == 2 && c7407.f20079 == 0) {
            c7407.f20080 = this.f20079;
            return c7407;
        }
        if (this.f20078 == c7336) {
            objArr[i] = c7407;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c7407;
        return new C7407(this.f20080, this.f20079, objArrCopyOf, c7336);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C7407 m12590(int i, Object obj, Object obj2, int i2, C7399 c7399) {
        C7399 c73992;
        C7407 c7407M12590;
        int iM6811 = 1 << AbstractC3065.m6811(i, i2);
        if (m12592(iM6811)) {
            int iM12574 = m12574(iM6811);
            return (AbstractC4395.m8907(obj, this.f20077[iM12574]) && AbstractC4395.m8907(obj2, m12583(iM12574))) ? m12591(iM12574, iM6811, c7399) : this;
        }
        if (!m12596(iM6811)) {
            return this;
        }
        int iM12580 = m12580(iM6811);
        C7407 c7407M12581 = m12581(iM12580);
        if (i2 == 30) {
            C6512 c6512M5068 = AbstractC2567.m5068(AbstractC2567.m5067(0, c7407M12581.f20077.length), 2);
            int i3 = c6512M5068.f17818;
            int i4 = c6512M5068.f17816;
            int i5 = c6512M5068.f17817;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                c7407M12590 = c7407M12581;
                c73992 = c7399;
            } else {
                while (true) {
                    if (!AbstractC4395.m8907(obj, c7407M12581.f20077[i3]) || !AbstractC4395.m8907(obj2, c7407M12581.m12583(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        c7407M12590 = c7407M12581.m12594(i3, c7399);
                        break;
                    }
                }
                c7407M12590 = c7407M12581;
                c73992 = c7399;
            }
        } else {
            c73992 = c7399;
            c7407M12590 = c7407M12581.m12590(i, obj, obj2, i2 + 5, c73992);
        }
        return m12588(c7407M12581, c7407M12590, iM12580, iM6811, c73992.f20062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7407 m12591(int i, int i2, C7399 c7399) {
        c7399.m12569(c7399.f20061 - 1);
        c7399.f20060 = m12583(i);
        Object[] objArr = this.f20077;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f20078 != c7399.f20062) {
            return new C7407(i2 ^ this.f20080, this.f20079, AbstractC3065.m6821(i, objArr), c7399.f20062);
        }
        this.f20077 = AbstractC3065.m6821(i, objArr);
        this.f20080 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12592(int i) {
        return (this.f20080 & i) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m12593(Object obj, int i, int i2) {
        int iM6811 = 1 << AbstractC3065.m6811(i, i2);
        if (m12592(iM6811)) {
            int iM12574 = m12574(iM6811);
            if (AbstractC4395.m8907(obj, this.f20077[iM12574])) {
                return m12583(iM12574);
            }
            return null;
        }
        if (!m12596(iM6811)) {
            return null;
        }
        C7407 c7407M12581 = m12581(m12580(iM6811));
        if (i2 != 30) {
            return c7407M12581.m12593(obj, i, i2 + 5);
        }
        C6512 c6512M5068 = AbstractC2567.m5068(AbstractC2567.m5067(0, c7407M12581.f20077.length), 2);
        int i3 = c6512M5068.f17818;
        int i4 = c6512M5068.f17816;
        int i5 = c6512M5068.f17817;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!AbstractC4395.m8907(obj, c7407M12581.f20077[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return c7407M12581.m12583(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7407 m12594(int i, C7399 c7399) {
        c7399.m12569(c7399.f20061 - 1);
        c7399.f20060 = m12583(i);
        Object[] objArr = this.f20077;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f20078 != c7399.f20062) {
            return new C7407(0, 0, AbstractC3065.m6821(i, objArr), c7399.f20062);
        }
        this.f20077 = AbstractC3065.m6821(i, objArr);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7407 m12595(int i, Object obj, Object obj2, int i2, C7399 c7399) {
        C7399 c73992;
        C7407 c7407M12595;
        int iM6811 = 1 << AbstractC3065.m6811(i, i2);
        boolean zM12592 = m12592(iM6811);
        C7336 c7336 = this.f20078;
        if (zM12592) {
            int iM12574 = m12574(iM6811);
            if (!AbstractC4395.m8907(obj, this.f20077[iM12574])) {
                c7399.m12569(c7399.f20061 + 1);
                C7336 c73362 = c7399.f20062;
                if (c7336 != c73362) {
                    return new C7407(this.f20080 ^ iM6811, this.f20079 | iM6811, m12579(iM12574, iM6811, i, obj, obj2, i2, c73362), c73362);
                }
                this.f20077 = m12579(iM12574, iM6811, i, obj, obj2, i2, c73362);
                this.f20080 ^= iM6811;
                this.f20079 |= iM6811;
                return this;
            }
            c7399.f20060 = m12583(iM12574);
            if (m12583(iM12574) == obj2) {
                return this;
            }
            if (c7336 == c7399.f20062) {
                this.f20077[iM12574 + 1] = obj2;
                return this;
            }
            c7399.f20059++;
            Object[] objArr = this.f20077;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM12574 + 1] = obj2;
            return new C7407(this.f20080, this.f20079, objArrCopyOf, c7399.f20062);
        }
        if (!m12596(iM6811)) {
            c7399.m12569(c7399.f20061 + 1);
            C7336 c73363 = c7399.f20062;
            int iM125742 = m12574(iM6811);
            Object[] objArr2 = this.f20077;
            if (c7336 != c73363) {
                return new C7407(this.f20080 | iM6811, this.f20079, AbstractC3065.m6822(objArr2, iM125742, obj, obj2), c73363);
            }
            this.f20077 = AbstractC3065.m6822(objArr2, iM125742, obj, obj2);
            this.f20080 |= iM6811;
            return this;
        }
        int iM12580 = m12580(iM6811);
        C7407 c7407M12581 = m12581(iM12580);
        if (i2 == 30) {
            C6512 c6512M5068 = AbstractC2567.m5068(AbstractC2567.m5067(0, c7407M12581.f20077.length), 2);
            int i3 = c6512M5068.f17818;
            int i4 = c6512M5068.f17816;
            int i5 = c6512M5068.f17817;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                c7399.m12569(c7399.f20061 + 1);
                c7407M12595 = new C7407(0, 0, AbstractC3065.m6822(c7407M12581.f20077, 0, obj, obj2), c7399.f20062);
                c73992 = c7399;
            } else {
                while (!AbstractC4395.m8907(obj, c7407M12581.f20077[i3])) {
                    if (i3 == i4) {
                        c7399.m12569(c7399.f20061 + 1);
                        c7407M12595 = new C7407(0, 0, AbstractC3065.m6822(c7407M12581.f20077, 0, obj, obj2), c7399.f20062);
                        break;
                    }
                    i3 += i5;
                }
                c7399.f20060 = c7407M12581.m12583(i3);
                if (c7407M12581.f20078 == c7399.f20062) {
                    c7407M12581.f20077[i3 + 1] = obj2;
                    c7407M12595 = c7407M12581;
                } else {
                    c7399.f20059++;
                    Object[] objArr3 = c7407M12581.f20077;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    c7407M12595 = new C7407(0, 0, objArrCopyOf2, c7399.f20062);
                }
                c73992 = c7399;
            }
        } else {
            c73992 = c7399;
            c7407M12595 = c7407M12581.m12595(i, obj, obj2, i2 + 5, c73992);
        }
        return c7407M12581 == c7407M12595 ? this : m12589(iM12580, c7407M12595, c73992.f20062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m12596(int i) {
        return (this.f20079 & i) != 0;
    }
}
