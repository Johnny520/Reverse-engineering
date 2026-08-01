package p139;

import androidx.appcompat.app.C0954;
import androidx.compose.runtime.AbstractC2227;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3897;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import p064.C7341;
import p131.C8165;
import p131.C8166;

/* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8236 f20421 = new C8236(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object[] f20422;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8165 f20423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f20424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f20425;

    public C8236(int i, int i2, Object[] objArr, C8165 c8165) {
        this.f20425 = i;
        this.f20424 = i2;
        this.f20423 = c8165;
        this.f20422 = objArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C8236 m13132(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C8165 c8165) {
        if (i3 > 30) {
            return new C8236(0, 0, new Object[]{obj, obj2, obj3, obj4}, c8165);
        }
        int iM7371 = AbstractC3897.m7371(i, i3);
        int iM73712 = AbstractC3897.m7371(i2, i3);
        if (iM7371 != iM73712) {
            return new C8236((1 << iM7371) | (1 << iM73712), 0, iM7371 < iM73712 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c8165);
        }
        return new C8236(0, 1 << iM7371, new Object[]{m13132(i, obj, obj2, i2, obj3, obj4, i3 + 5, c8165)}, c8165);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m13133(int i) {
        return Integer.bitCount(this.f20425 & (i - 1)) * 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13134(C8236 c8236) {
        if (this == c8236) {
            return true;
        }
        if (this.f20424 == c8236.f20424 && this.f20425 == c8236.f20425) {
            int length = this.f20422.length;
            for (int i = 0; i < length; i++) {
                if (this.f20422[i] == c8236.f20422[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m13135(Object obj, int i, int i2) {
        int iM7371 = 1 << AbstractC3897.m7371(i, i2);
        if (m13151(iM7371)) {
            return AbstractC5227.m9466(obj, this.f20422[m13133(iM7371)]);
        }
        if (!m13155(iM7371)) {
            return false;
        }
        C8236 c8236M13140 = m13140(m13139(iM7371));
        return i2 == 30 ? c8236M13140.m13136(obj) : c8236M13140.m13135(obj, i, i2 + 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m13136(Object obj) {
        C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, this.f20422.length), 2);
        int i = c7341M5628.f18163;
        int i2 = c7341M5628.f18161;
        int i3 = c7341M5628.f18162;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC5227.m9466(obj, this.f20422[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13137() {
        if (this.f20424 == 0) {
            return this.f20422.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f20425);
        int length = this.f20422.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m13140(i).m13137();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object[] m13138(int i, int i2, int i3, Object obj, Object obj2, int i4, C8165 c8165) {
        Object obj3 = this.f20422[i];
        C8236 c8236M13132 = m13132(obj3 != null ? obj3.hashCode() : 0, obj3, m13142(i), i3, obj, obj2, i4 + 5, c8165);
        int iM13139 = m13139(i2);
        int i5 = iM13139 + 1;
        Object[] objArr = this.f20422;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC5179.m9399(0, i, objArr, 6, objArr2);
        AbstractC5179.m9394(i, i + 2, objArr, i5, objArr2);
        objArr2[iM13139 - 1] = c8236M13132;
        AbstractC5179.m9394(iM13139, i5, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int m13139(int i) {
        return (this.f20422.length - 1) - Integer.bitCount(this.f20424 & (i - 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8236 m13140(int i) {
        Object obj = this.f20422[i];
        obj.getClass();
        return (C8236) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C8236 m13141(int i, int i2, C8236 c8236) {
        Object[] objArr = c8236.f20422;
        if (objArr.length != 2 || c8236.f20424 != 0) {
            Object[] objArr2 = this.f20422;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = c8236;
            return new C8236(this.f20425, this.f20424, objArrCopyOf, null);
        }
        if (this.f20422.length == 1) {
            c8236.f20425 = this.f20424;
            return c8236;
        }
        int iM13133 = m13133(i2);
        Object[] objArr3 = this.f20422;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC5179.m9394(i + 2, i + 1, objArrCopyOf2, objArr3.length, objArrCopyOf2);
        AbstractC5179.m9394(iM13133 + 2, iM13133, objArrCopyOf2, i, objArrCopyOf2);
        objArrCopyOf2[iM13133] = obj;
        objArrCopyOf2[iM13133 + 1] = obj2;
        return new C8236(this.f20425 ^ i2, this.f20424 ^ i2, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object m13142(int i) {
        return this.f20422[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.f660 = m13141(r7, r2, (p139.C8236) r14.f660);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0954 m13143(int i, int i2, Object obj, Object obj2) {
        C0954 c0954M13143;
        int i3 = 1;
        int iM7371 = 1 << AbstractC3897.m7371(i, i2);
        int i4 = 11;
        int i5 = 0;
        if (m13151(iM7371)) {
            int iM13133 = m13133(iM7371);
            if (!AbstractC5227.m9466(obj, this.f20422[iM13133])) {
                return new C0954(new C8236(this.f20425 ^ iM7371, this.f20424 | iM7371, m13138(iM13133, iM7371, i, obj, obj2, i2, null), null), i3, i4);
            }
            if (m13142(iM13133) != obj2) {
                Object[] objArr = this.f20422;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM13133 + 1] = obj2;
                return new C0954(new C8236(this.f20425, this.f20424, objArrCopyOf, null), i5, i4);
            }
        } else {
            if (!m13155(iM7371)) {
                return new C0954(new C8236(iM7371 | this.f20425, this.f20424, AbstractC3897.m7382(this.f20422, m13133(iM7371), obj, obj2), null), i3, i4);
            }
            int iM13139 = m13139(iM7371);
            C8236 c8236M13140 = m13140(iM13139);
            if (i2 == 30) {
                C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, c8236M13140.f20422.length), 2);
                int i6 = c7341M5628.f18163;
                int i7 = c7341M5628.f18161;
                int i8 = c7341M5628.f18162;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!AbstractC5227.m9466(obj, c8236M13140.f20422[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    if (obj2 == c8236M13140.m13142(i6)) {
                        c0954M13143 = null;
                    } else {
                        Object[] objArr2 = c8236M13140.f20422;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[i6 + 1] = obj2;
                        c0954M13143 = new C0954(new C8236(0, 0, objArrCopyOf2, null), i5, i4);
                    }
                }
                c0954M13143 = new C0954(new C8236(0, 0, AbstractC3897.m7382(c8236M13140.f20422, 0, obj, obj2), null), i3, i4);
                break;
            }
            c0954M13143 = c8236M13140.m13143(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8236 m13144(Object obj, int i, int i2) {
        C8236 c8236M13144;
        int iM7371 = 1 << AbstractC3897.m7371(i, i2);
        if (m13151(iM7371)) {
            int iM13133 = m13133(iM7371);
            if (!AbstractC5227.m9466(obj, this.f20422[iM13133])) {
                return this;
            }
            Object[] objArr = this.f20422;
            if (objArr.length != 2) {
                return new C8236(this.f20425 ^ iM7371, this.f20424, AbstractC3897.m7381(iM13133, objArr), null);
            }
        } else {
            if (!m13155(iM7371)) {
                return this;
            }
            int iM13139 = m13139(iM7371);
            C8236 c8236M13140 = m13140(iM13139);
            if (i2 == 30) {
                C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, c8236M13140.f20422.length), 2);
                int i3 = c7341M5628.f18163;
                int i4 = c7341M5628.f18161;
                int i5 = c7341M5628.f18162;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    c8236M13144 = c8236M13140;
                    break;
                }
                while (!AbstractC5227.m9466(obj, c8236M13140.f20422[i3])) {
                    if (i3 == i4) {
                        c8236M13144 = c8236M13140;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = c8236M13140.f20422;
                c8236M13144 = objArr2.length == 2 ? null : new C8236(0, 0, AbstractC3897.m7381(i3, objArr2), null);
            } else {
                c8236M13144 = c8236M13140.m13144(obj, i, i2 + 5);
            }
            if (c8236M13144 != null) {
                return c8236M13140 != c8236M13144 ? m13141(iM13139, iM7371, c8236M13144) : this;
            }
            Object[] objArr3 = this.f20422;
            if (objArr3.length != 1) {
                return new C8236(this.f20425, this.f20424 ^ iM7371, AbstractC3897.m7380(iM13139, objArr3), null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C8236 m13145(int i, Object obj, int i2, C8228 c8228) {
        C8236 c8236M13145;
        int iM7371 = 1 << AbstractC3897.m7371(i, i2);
        if (m13151(iM7371)) {
            int iM13133 = m13133(iM7371);
            if (AbstractC5227.m9466(obj, this.f20422[iM13133])) {
                return m13150(iM13133, iM7371, c8228);
            }
        } else if (m13155(iM7371)) {
            int iM13139 = m13139(iM7371);
            C8236 c8236M13140 = m13140(iM13139);
            if (i2 == 30) {
                C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, c8236M13140.f20422.length), 2);
                int i3 = c7341M5628.f18163;
                int i4 = c7341M5628.f18161;
                int i5 = c7341M5628.f18162;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    c8236M13145 = c8236M13140;
                    break;
                }
                while (!AbstractC5227.m9466(obj, c8236M13140.f20422[i3])) {
                    if (i3 == i4) {
                        c8236M13145 = c8236M13140;
                        break;
                    }
                    i3 += i5;
                }
                c8236M13145 = c8236M13140.m13153(i3, c8228);
            } else {
                c8236M13145 = c8236M13140.m13145(i, obj, i2 + 5, c8228);
            }
            return m13147(c8236M13140, c8236M13145, iM13139, iM7371, c8228.f20407);
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8236 m13146(C8236 c8236, int i, C8166 c8166, C8228 c8228) {
        Object[] objArr;
        C8236 c8236M13132;
        if (this == c8236) {
            c8166.f19894 += m13137();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C8165 c8165 = c8228.f20407;
            int i3 = c8236.f20424;
            Object[] objArr2 = this.f20422;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c8236.f20422.length);
            int length = this.f20422.length;
            C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, c8236.f20422.length), 2);
            int i4 = c7341M5628.f18163;
            int i5 = c7341M5628.f18161;
            int i6 = c7341M5628.f18162;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m13136(c8236.f20422[i4])) {
                        c8166.f19894++;
                    } else {
                        Object[] objArr3 = c8236.f20422;
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
            if (length != this.f20422.length) {
                return length == c8236.f20422.length ? c8236 : length == objArrCopyOf.length ? new C8236(0, 0, objArrCopyOf, c8165) : new C8236(0, 0, Arrays.copyOf(objArrCopyOf, length), c8165);
            }
        } else {
            int i7 = this.f20424 | c8236.f20424;
            int i8 = this.f20425;
            int i9 = c8236.f20425;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (AbstractC5227.m9466(this.f20422[m13133(iLowestOneBit)], c8236.f20422[c8236.m13133(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                AbstractC2227.m3097("Check failed.");
            }
            C8236 c82362 = (AbstractC5227.m9466(this.f20423, c8228.f20407) && this.f20425 == i12 && this.f20424 == i7) ? this : new C8236(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = c82362.f20422;
                int length2 = (objArr4.length - 1) - i14;
                if (m13155(iLowestOneBit2)) {
                    c8236M13132 = m13140(m13139(iLowestOneBit2));
                    if (c8236.m13155(iLowestOneBit2)) {
                        c8236M13132 = c8236M13132.m13146(c8236.m13140(c8236.m13139(iLowestOneBit2)), i + 5, c8166, c8228);
                        objArr = objArr4;
                    } else if (c8236.m13151(iLowestOneBit2)) {
                        int iM13133 = c8236.m13133(iLowestOneBit2);
                        Object obj = c8236.f20422[iM13133];
                        Object objM13142 = c8236.m13142(iM13133);
                        int i15 = c8228.f20406;
                        objArr = objArr4;
                        c8236M13132 = c8236M13132.m13154(obj != null ? obj.hashCode() : i2, obj, objM13142, i + 5, c8228);
                        if (c8228.f20406 == i15) {
                            c8166.f19894++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c8236.m13155(iLowestOneBit2)) {
                        C8236 c8236M13140 = c8236.m13140(c8236.m13139(iLowestOneBit2));
                        if (m13151(iLowestOneBit2)) {
                            int iM131332 = m13133(iLowestOneBit2);
                            Object obj2 = this.f20422[iM131332];
                            int i16 = i + 5;
                            if (c8236M13140.m13135(obj2, obj2 != null ? obj2.hashCode() : 0, i16)) {
                                c8166.f19894++;
                                c8236M13132 = c8236M13140;
                            } else {
                                c8236M13132 = c8236M13140.m13154(obj2 != null ? obj2.hashCode() : 0, obj2, m13142(iM131332), i16, c8228);
                            }
                        } else {
                            c8236M13132 = c8236M13140;
                        }
                    } else {
                        int iM131333 = m13133(iLowestOneBit2);
                        Object obj3 = this.f20422[iM131333];
                        Object objM131422 = m13142(iM131333);
                        int iM131334 = c8236.m13133(iLowestOneBit2);
                        Object obj4 = c8236.f20422[iM131334];
                        c8236M13132 = m13132(obj3 != null ? obj3.hashCode() : 0, obj3, objM131422, obj4 != null ? obj4.hashCode() : 0, obj4, c8236.m13142(iM131334), i + 5, c8228.f20407);
                    }
                }
                objArr[length2] = c8236M13132;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (c8236.m13151(iLowestOneBit3)) {
                    int iM131335 = c8236.m13133(iLowestOneBit3);
                    Object[] objArr5 = c82362.f20422;
                    objArr5[i18] = c8236.f20422[iM131335];
                    objArr5[i18 + 1] = c8236.m13142(iM131335);
                    if (m13151(iLowestOneBit3)) {
                        c8166.f19894++;
                    }
                } else {
                    int iM131336 = m13133(iLowestOneBit3);
                    Object[] objArr6 = c82362.f20422;
                    objArr6[i18] = this.f20422[iM131336];
                    objArr6[i18 + 1] = m13142(iM131336);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!m13134(c82362)) {
                return c8236.m13134(c82362) ? c8236 : c82362;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8236 m13147(C8236 c8236, C8236 c82362, int i, int i2, C8165 c8165) {
        C8165 c81652 = this.f20423;
        if (c82362 != null) {
            return (c81652 == c8165 || c8236 != c82362) ? m13148(i, c82362, c8165) : this;
        }
        Object[] objArr = this.f20422;
        if (objArr.length == 1) {
            return null;
        }
        if (c81652 != c8165) {
            return new C8236(this.f20425, this.f20424 ^ i2, AbstractC3897.m7380(i, objArr), c8165);
        }
        this.f20422 = AbstractC3897.m7380(i, objArr);
        this.f20424 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8236 m13148(int i, C8236 c8236, C8165 c8165) {
        Object[] objArr = this.f20422;
        if (objArr.length == 1 && c8236.f20422.length == 2 && c8236.f20424 == 0) {
            c8236.f20425 = this.f20424;
            return c8236;
        }
        if (this.f20423 == c8165) {
            objArr[i] = c8236;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = c8236;
        return new C8236(this.f20425, this.f20424, objArrCopyOf, c8165);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C8236 m13149(int i, Object obj, Object obj2, int i2, C8228 c8228) {
        C8228 c82282;
        C8236 c8236M13149;
        int iM7371 = 1 << AbstractC3897.m7371(i, i2);
        if (m13151(iM7371)) {
            int iM13133 = m13133(iM7371);
            return (AbstractC5227.m9466(obj, this.f20422[iM13133]) && AbstractC5227.m9466(obj2, m13142(iM13133))) ? m13150(iM13133, iM7371, c8228) : this;
        }
        if (!m13155(iM7371)) {
            return this;
        }
        int iM13139 = m13139(iM7371);
        C8236 c8236M13140 = m13140(iM13139);
        if (i2 == 30) {
            C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, c8236M13140.f20422.length), 2);
            int i3 = c7341M5628.f18163;
            int i4 = c7341M5628.f18161;
            int i5 = c7341M5628.f18162;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                c8236M13149 = c8236M13140;
                c82282 = c8228;
            } else {
                while (true) {
                    if (!AbstractC5227.m9466(obj, c8236M13140.f20422[i3]) || !AbstractC5227.m9466(obj2, c8236M13140.m13142(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        c8236M13149 = c8236M13140.m13153(i3, c8228);
                        break;
                    }
                }
                c8236M13149 = c8236M13140;
                c82282 = c8228;
            }
        } else {
            c82282 = c8228;
            c8236M13149 = c8236M13140.m13149(i, obj, obj2, i2 + 5, c82282);
        }
        return m13147(c8236M13140, c8236M13149, iM13139, iM7371, c82282.f20407);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8236 m13150(int i, int i2, C8228 c8228) {
        c8228.m13128(c8228.f20406 - 1);
        c8228.f20405 = m13142(i);
        Object[] objArr = this.f20422;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f20423 != c8228.f20407) {
            return new C8236(i2 ^ this.f20425, this.f20424, AbstractC3897.m7381(i, objArr), c8228.f20407);
        }
        this.f20422 = AbstractC3897.m7381(i, objArr);
        this.f20425 ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13151(int i) {
        return (this.f20425 & i) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m13152(Object obj, int i, int i2) {
        int iM7371 = 1 << AbstractC3897.m7371(i, i2);
        if (m13151(iM7371)) {
            int iM13133 = m13133(iM7371);
            if (AbstractC5227.m9466(obj, this.f20422[iM13133])) {
                return m13142(iM13133);
            }
            return null;
        }
        if (!m13155(iM7371)) {
            return null;
        }
        C8236 c8236M13140 = m13140(m13139(iM7371));
        if (i2 != 30) {
            return c8236M13140.m13152(obj, i, i2 + 5);
        }
        C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, c8236M13140.f20422.length), 2);
        int i3 = c7341M5628.f18163;
        int i4 = c7341M5628.f18161;
        int i5 = c7341M5628.f18162;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!AbstractC5227.m9466(obj, c8236M13140.f20422[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return c8236M13140.m13142(i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C8236 m13153(int i, C8228 c8228) {
        c8228.m13128(c8228.f20406 - 1);
        c8228.f20405 = m13142(i);
        Object[] objArr = this.f20422;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f20423 != c8228.f20407) {
            return new C8236(0, 0, AbstractC3897.m7381(i, objArr), c8228.f20407);
        }
        this.f20422 = AbstractC3897.m7381(i, objArr);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C8236 m13154(int i, Object obj, Object obj2, int i2, C8228 c8228) {
        C8228 c82282;
        C8236 c8236M13154;
        int iM7371 = 1 << AbstractC3897.m7371(i, i2);
        boolean zM13151 = m13151(iM7371);
        C8165 c8165 = this.f20423;
        if (zM13151) {
            int iM13133 = m13133(iM7371);
            if (!AbstractC5227.m9466(obj, this.f20422[iM13133])) {
                c8228.m13128(c8228.f20406 + 1);
                C8165 c81652 = c8228.f20407;
                if (c8165 != c81652) {
                    return new C8236(this.f20425 ^ iM7371, this.f20424 | iM7371, m13138(iM13133, iM7371, i, obj, obj2, i2, c81652), c81652);
                }
                this.f20422 = m13138(iM13133, iM7371, i, obj, obj2, i2, c81652);
                this.f20425 ^= iM7371;
                this.f20424 |= iM7371;
                return this;
            }
            c8228.f20405 = m13142(iM13133);
            if (m13142(iM13133) == obj2) {
                return this;
            }
            if (c8165 == c8228.f20407) {
                this.f20422[iM13133 + 1] = obj2;
                return this;
            }
            c8228.f20404++;
            Object[] objArr = this.f20422;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM13133 + 1] = obj2;
            return new C8236(this.f20425, this.f20424, objArrCopyOf, c8228.f20407);
        }
        if (!m13155(iM7371)) {
            c8228.m13128(c8228.f20406 + 1);
            C8165 c81653 = c8228.f20407;
            int iM131332 = m13133(iM7371);
            Object[] objArr2 = this.f20422;
            if (c8165 != c81653) {
                return new C8236(this.f20425 | iM7371, this.f20424, AbstractC3897.m7382(objArr2, iM131332, obj, obj2), c81653);
            }
            this.f20422 = AbstractC3897.m7382(objArr2, iM131332, obj, obj2);
            this.f20425 |= iM7371;
            return this;
        }
        int iM13139 = m13139(iM7371);
        C8236 c8236M13140 = m13140(iM13139);
        if (i2 == 30) {
            C7341 c7341M5628 = AbstractC3400.m5628(AbstractC3400.m5627(0, c8236M13140.f20422.length), 2);
            int i3 = c7341M5628.f18163;
            int i4 = c7341M5628.f18161;
            int i5 = c7341M5628.f18162;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                c8228.m13128(c8228.f20406 + 1);
                c8236M13154 = new C8236(0, 0, AbstractC3897.m7382(c8236M13140.f20422, 0, obj, obj2), c8228.f20407);
                c82282 = c8228;
            } else {
                while (!AbstractC5227.m9466(obj, c8236M13140.f20422[i3])) {
                    if (i3 == i4) {
                        c8228.m13128(c8228.f20406 + 1);
                        c8236M13154 = new C8236(0, 0, AbstractC3897.m7382(c8236M13140.f20422, 0, obj, obj2), c8228.f20407);
                        break;
                    }
                    i3 += i5;
                }
                c8228.f20405 = c8236M13140.m13142(i3);
                if (c8236M13140.f20423 == c8228.f20407) {
                    c8236M13140.f20422[i3 + 1] = obj2;
                    c8236M13154 = c8236M13140;
                } else {
                    c8228.f20404++;
                    Object[] objArr3 = c8236M13140.f20422;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    c8236M13154 = new C8236(0, 0, objArrCopyOf2, c8228.f20407);
                }
                c82282 = c8228;
            }
        } else {
            c82282 = c8228;
            c8236M13154 = c8236M13140.m13154(i, obj, obj2, i2 + 5, c82282);
        }
        return c8236M13140 == c8236M13154 ? this : m13148(iM13139, c8236M13154, c82282.f20407);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m13155(int i) {
        return (this.f20424 & i) != 0;
    }
}
