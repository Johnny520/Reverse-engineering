package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.C0244;
import androidx.collection.C0246;
import androidx.collection.C0247;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.C1310;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import com.bumptech.glide.AbstractC3065;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1235 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0246 f3564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public HashMap f3565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f3566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object[] f3567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f3568;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1233 f3569;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3570;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0246 f3571;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f3572;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C0247 f3573;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f3574;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f3575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f3576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1310 f3578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1310 f3579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f3580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1310 f3581;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f3582;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3583;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3584;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3585;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f3586;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f3587;

    public C1235(C1233 c1233) {
        this.f3569 = c1233;
        int[] iArr = c1233.f3545;
        this.f3568 = iArr;
        Object[] objArr = c1233.f3548;
        this.f3567 = objArr;
        this.f3566 = c1233.f3541;
        this.f3565 = c1233.f3540;
        this.f3564 = c1233.f3539;
        int i = c1233.f3544;
        this.f3583 = i;
        this.f3582 = (iArr.length / 5) - i;
        int i2 = c1233.f3549;
        this.f3584 = i2;
        this.f3585 = objArr.length - i2;
        this.f3577 = i;
        this.f3581 = new C1310();
        this.f3578 = new C1310();
        this.f3579 = new C1310();
        this.f3574 = i;
        this.f3575 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m2089(C1235 c1235) {
        int i = c1235.f3575;
        int iM2128 = c1235.m2128(i);
        int[] iArr = c1235.f3568;
        int i2 = (iM2128 * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        c1235.m2094(c1235.m2112(iArr, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m2090(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f3570 + " end=" + this.f3574 + " size = " + m2130() + " gap=" + this.f3583 + SignatureVisitor.SUPER + (this.f3583 + this.f3582) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m2091(int i, Object obj) {
        int iM2128 = m2128(i);
        int[] iArr = this.f3568;
        if (iM2128 >= iArr.length || (iArr[(iM2128 * 5) + 1] & 1073741824) == 0) {
            AbstractC1374.m2507("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f3567[m2131(m2132(this.f3568, iM2128))] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C1230 m2092(int i) {
        ArrayList arrayList;
        int iM2137;
        if (i < 0 || i >= m2130() || (iM2137 = AbstractC1238.m2137((arrayList = this.f3566), i, m2130())) < 0) {
            return null;
        }
        return (C1230) arrayList.get(iM2137);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2093(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.f3575;
        Object[] objArr = this.f3576 > 0;
        this.f3579.m2307(this.f3580);
        C1353 c1353 = C1369.f3974;
        if (objArr == true) {
            int i4 = this.f3570;
            int iM2132 = m2132(this.f3568, m2128(i4));
            m2121(1);
            this.f3586 = iM2132;
            this.f3587 = iM2132;
            int iM2128 = m2128(i4);
            int i5 = obj != c1353 ? 1 : 0;
            int i6 = (z || obj2 == c1353) ? 0 : 1;
            int iM2090 = m2090(iM2132, this.f3584, this.f3585, this.f3567.length);
            if (iM2090 >= 0 && this.f3577 < i4) {
                iM2090 = -(((this.f3567.length - this.f3585) - iM2090) + 1);
            }
            int[] iArr = this.f3568;
            int i7 = this.f3575;
            int i8 = iM2128 * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM2090;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m2122(i9, i4);
                Object[] objArr2 = this.f3567;
                int i10 = this.f3586;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.f3586 = i10;
            }
            this.f3580 = 0;
            i2 = i4 + 1;
            this.f3575 = i4;
            this.f3570 = i2;
            if (i3 >= 0) {
                m2096(i3);
            }
        } else {
            this.f3581.m2307(i3);
            this.f3578.m2307((m2129() - this.f3582) - this.f3574);
            int i11 = this.f3570;
            int iM21282 = m2128(i11);
            if (!AbstractC4395.m8907(obj2, c1353)) {
                if (z) {
                    m2091(this.f3570, obj2);
                } else {
                    m2095(obj2);
                }
            }
            this.f3586 = m2100(this.f3568, iM21282);
            this.f3587 = m2132(this.f3568, m2128(this.f3570 + 1));
            int[] iArr2 = this.f3568;
            int i12 = iM21282 * 5;
            this.f3580 = iArr2[i12 + 1] & 67108863;
            this.f3575 = i11;
            this.f3570 = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f3574 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2094(int i) {
        if (i >= 0) {
            C0247 c0247 = this.f3573;
            if (c0247 == null) {
                c0247 = new C0247();
                this.f3573 = c0247;
            }
            AbstractC3065.m6819(c0247, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m2095(Object obj) {
        int iM2128 = m2128(this.f3570);
        int i = (iM2128 * 5) + 1;
        if ((this.f3568[i] & 268435456) == 0) {
            AbstractC1374.m2507("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f3567;
        int[] iArr = this.f3568;
        objArr[m2131(Integer.bitCount(iArr[i] >> 29) + m2132(iArr, iM2128))] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final AbstractC1229 m2096(int i) {
        C1230 c1230M2092;
        HashMap map = this.f3565;
        if (map == null || (c1230M2092 = m2092(i)) == null) {
            return null;
        }
        return (AbstractC1229) map.get(c1230M2092);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2097() {
        if (this.f3576 != 0) {
            AbstractC1374.m2507("Key must be supplied when inserting");
        }
        C1353 c1353 = C1369.f3974;
        m2093(0, c1353, c1353, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int m2098() {
        int iM2128 = m2128(this.f3570);
        int i = this.f3570;
        int[] iArr = this.f3568;
        int i2 = iM2128 * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f3570 = i3;
        this.f3586 = m2132(iArr, m2128(i3));
        int i4 = this.f3568[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Object m2099(Object obj, int i, int i2) {
        int iM2100 = m2100(this.f3568, m2128(i));
        int iM2132 = m2132(this.f3568, m2128(i + 1));
        int i3 = iM2100 + i2;
        if (i3 < iM2100 || i3 >= iM2132) {
            AbstractC1374.m2507("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM2131 = m2131(i3);
        Object[] objArr = this.f3567;
        Object obj2 = objArr[iM2131];
        objArr[iM2131] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int m2100(int[] iArr, int i) {
        if (i >= m2129()) {
            return this.f3567.length - this.f3585;
        }
        int iM2140 = AbstractC1238.m2140(iArr, i);
        return iM2140 < 0 ? (this.f3567.length - this.f3585) + iM2140 + 1 : iM2140;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2101() {
        int i = this.f3574;
        this.f3570 = i;
        this.f3586 = m2132(this.f3568, m2128(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2102(int i) {
        int iM2128 = m2128(i);
        int[] iArr = this.f3568;
        if ((iArr[(iM2128 * 5) + 1] & 1073741824) != 0) {
            return this.f3567[m2131(m2132(iArr, iM2128))];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m2103(int i, int i2) {
        int i3 = this.f3585;
        int i4 = this.f3584;
        int i5 = this.f3577;
        if (i4 != i) {
            Object[] objArr = this.f3567;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m2130());
        if (i5 != iMin) {
            int length = this.f3567.length - i3;
            if (iMin < i5) {
                int iM2128 = m2128(iMin);
                int iM21282 = m2128(i5);
                int i7 = this.f3583;
                while (iM2128 < iM21282) {
                    int i8 = (iM2128 * 5) + 4;
                    int i9 = this.f3568[i8];
                    if (i9 < 0) {
                        AbstractC1374.m2507("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f3568[i8] = -((length - i9) + 1);
                    iM2128++;
                    if (iM2128 == i7) {
                        iM2128 += this.f3582;
                    }
                }
            } else {
                int iM21283 = m2128(i5);
                int iM21284 = m2128(iMin);
                while (iM21283 < iM21284) {
                    int i10 = (iM21283 * 5) + 4;
                    int i11 = this.f3568[i10];
                    if (i11 >= 0) {
                        AbstractC1374.m2507("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f3568[i10] = i11 + length + 1;
                    iM21283++;
                    if (iM21283 == this.f3583) {
                        iM21283 += this.f3582;
                    }
                }
            }
            this.f3577 = iMin;
        }
        this.f3584 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m2104(int i) {
        C1230 c1230;
        int i2;
        C1230 c12302;
        int i3;
        int i4;
        int i5 = this.f3582;
        int i6 = this.f3583;
        if (i6 != i) {
            if (!this.f3566.isEmpty()) {
                int iM2129 = m2129() - this.f3582;
                ArrayList arrayList = this.f3566;
                if (i6 < i) {
                    for (int iM2141 = AbstractC1238.m2141(arrayList, i6, iM2129); iM2141 < this.f3566.size() && (i3 = (c12302 = (C1230) this.f3566.get(iM2141)).f3534) < 0 && (i4 = i3 + iM2129) < i; iM2141++) {
                        c12302.f3534 = i4;
                    }
                } else {
                    for (int iM21412 = AbstractC1238.m2141(arrayList, i, iM2129); iM21412 < this.f3566.size() && (i2 = (c1230 = (C1230) this.f3566.get(iM21412)).f3534) >= 0; iM21412++) {
                        c1230.f3534 = -(iM2129 - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f3568;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC4347.m8836(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    AbstractC4347.m8836(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM21292 = m2129();
            if (i6 >= iM21292) {
                AbstractC1374.m2507("Check failed");
            }
            while (i6 < iM21292) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f3568[i10];
                int iM2130 = i11 > -2 ? i11 : (m2130() + i11) - (-2);
                if (iM2130 >= i) {
                    iM2130 = -((m2130() - iM2130) - (-2));
                }
                if (iM2130 != i11) {
                    this.f3568[i10] = iM2130;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f3583 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m2105(C1233 c1233, int i) {
        if (this.f3576 <= 0) {
            AbstractC1374.m2507("Check failed");
        }
        if (i == 0 && this.f3570 == 0 && this.f3569.f3544 == 0) {
            int[] iArr = c1233.f3545;
            int i2 = iArr[(i * 5) + 3];
            int i3 = c1233.f3544;
            if (i2 == i3) {
                int[] iArr2 = this.f3568;
                Object[] objArr = this.f3567;
                ArrayList arrayList = this.f3566;
                HashMap map = this.f3565;
                C0246 c0246 = this.f3564;
                Object[] objArr2 = c1233.f3548;
                int i4 = c1233.f3549;
                HashMap map2 = c1233.f3540;
                C0246 c02462 = c1233.f3539;
                this.f3568 = iArr;
                this.f3567 = objArr2;
                this.f3566 = c1233.f3541;
                this.f3583 = i3;
                this.f3582 = (iArr.length / 5) - i3;
                this.f3584 = i4;
                this.f3585 = objArr2.length - i4;
                this.f3577 = i3;
                this.f3565 = map2;
                this.f3564 = c02462;
                c1233.f3545 = iArr2;
                c1233.f3544 = 0;
                c1233.f3548 = objArr;
                c1233.f3549 = 0;
                c1233.f3541 = arrayList;
                c1233.f3540 = map;
                c1233.f3539 = c0246;
                return;
            }
        }
        C1235 c1235M2063 = c1233.m2063();
        try {
            AbstractC3933.m8296(c1235M2063, i, this, true, true, false);
            c1235M2063.m2114(true);
        } catch (Throwable th) {
            c1235M2063.m2114(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m2106(int i) {
        return (this.f3568[(m2128(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m2107(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f3585;
            int i5 = i + i2;
            m2103(i5, i3);
            this.f3584 = i;
            this.f3585 = i4 + i2;
            Arrays.fill(this.f3567, i, i5, (Object) null);
            int i6 = this.f3587;
            if (i6 >= i) {
                this.f3587 = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean m2108(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f3566;
            m2104(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f3565;
                int i3 = i + i2;
                int iM2141 = AbstractC1238.m2141(this.f3566, i3, m2129() - this.f3582);
                if (iM2141 >= this.f3566.size()) {
                    iM2141--;
                }
                int i4 = iM2141 + 1;
                int i5 = 0;
                while (iM2141 >= 0) {
                    C1230 c1230 = (C1230) this.f3566.get(iM2141);
                    int iM2116 = m2116(c1230);
                    if (iM2116 < i) {
                        break;
                    }
                    if (iM2116 < i3) {
                        c1230.f3534 = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM2141 + 1;
                        }
                        i4 = iM2141;
                    }
                    iM2141--;
                }
                z = i4 < i5;
                if (z) {
                    this.f3566.subList(i4, i5).clear();
                }
            }
            this.f3583 = i;
            this.f3582 += i2;
            int i6 = this.f3577;
            if (i6 > i) {
                this.f3577 = Math.max(i, i6 - i2);
            }
            int i7 = this.f3574;
            if (i7 >= this.f3583) {
                this.f3574 = i7 - i2;
            }
            int i8 = this.f3575;
            if (i8 >= 0 && (this.f3568[(m2128(i8) * 5) + 1] & 67108864) != 0) {
                m2094(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean m2109() {
        if (this.f3576 != 0) {
            AbstractC1374.m2507("Cannot remove group while inserting");
        }
        int i = this.f3570;
        int i2 = this.f3586;
        int iM2132 = m2132(this.f3568, m2128(i));
        int iM2098 = m2098();
        m2096(this.f3575);
        C0247 c0247 = this.f3573;
        if (c0247 != null) {
            while (true) {
                int i3 = c0247.f985;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    C4211.m8617("IntList is empty.");
                    return false;
                }
                if (c0247.f986[0] < i) {
                    break;
                }
                AbstractC3065.m6808(c0247);
            }
        }
        boolean zM2108 = m2108(i, this.f3570 - i);
        m2107(iM2132, this.f3586 - iM2132, i - 1);
        this.f3570 = i;
        this.f3586 = i2;
        this.f3580 -= iM2098;
        return zM2108;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m2110() {
        int i;
        C0247 c0247 = this.f3573;
        if (c0247 != null) {
            while (c0247.f985 != 0) {
                int iM6808 = AbstractC3065.m6808(c0247);
                int iM2128 = m2128(iM6808);
                int iM2123 = iM6808 + 1;
                int iM21232 = m2123(iM6808) + iM6808;
                while (true) {
                    if (iM2123 >= iM21232) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f3568[(m2128(iM2123) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM2123 += m2123(iM2123);
                    }
                }
                int[] iArr = this.f3568;
                int i2 = (iM2128 * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM2112 = m2112(iArr, iM6808);
                    if (iM2112 >= 0) {
                        AbstractC3065.m6819(c0247, iM2112);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final Object m2111(Object obj) {
        if (this.f3576 > 0) {
            m2122(1, this.f3575);
        }
        Object[] objArr = this.f3567;
        int i = this.f3586;
        this.f3586 = i + 1;
        Object obj2 = objArr[m2131(i)];
        if (this.f3586 > this.f3587) {
            AbstractC1374.m2507("Writing to an invalid slot");
        }
        this.f3567[m2131(this.f3586 - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int m2112(int[] iArr, int i) {
        int i2 = iArr[(m2128(i) * 5) + 2];
        return i2 > -2 ? i2 : (m2130() + i2) - (-2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m2113(int i) {
        return m2132(this.f3568, m2128(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2114(boolean z) {
        this.f3572 = true;
        if (z && this.f3581.f3802 == 0) {
            m2104(m2130());
            m2103(this.f3567.length - this.f3585, this.f3583);
            int i = this.f3584;
            Arrays.fill(this.f3567, i, this.f3585 + i, (Object) null);
            m2110();
        }
        int[] iArr = this.f3568;
        int i2 = this.f3583;
        Object[] objArr = this.f3567;
        int i3 = this.f3584;
        ArrayList arrayList = this.f3566;
        HashMap map = this.f3565;
        C0246 c0246 = this.f3564;
        C1233 c1233 = this.f3569;
        if (!c1233.f3543) {
            AbstractC1392.m2538("Unexpected writer close()");
        }
        c1233.f3543 = false;
        c1233.f3545 = iArr;
        c1233.f3544 = i2;
        c1233.f3548 = objArr;
        c1233.f3549 = i3;
        c1233.f3541 = arrayList;
        c1233.f3540 = map;
        c1233.f3539 = c0246;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2115() {
        int i = this.f3576;
        this.f3576 = i + 1;
        if (i == 0) {
            this.f3578.m2307((m2129() - this.f3582) - this.f3574);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m2116(C1230 c1230) {
        int i = c1230.f3534;
        return i < 0 ? m2130() + i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1230 m2117(int i) {
        ArrayList arrayList = this.f3566;
        int iM2137 = AbstractC1238.m2137(arrayList, i, m2130());
        if (iM2137 >= 0) {
            return (C1230) arrayList.get(iM2137);
        }
        if (i > this.f3583) {
            i = -(m2130() - i);
        }
        C1230 c1230 = new C1230(i);
        arrayList.add(-(iM2137 + 1), c1230);
        return c1230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2118(int i) {
        if (i < 0) {
            AbstractC1374.m2507("Cannot seek backwards");
        }
        if (this.f3576 > 0) {
            AbstractC1392.m2537("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f3570 + i;
        if (i2 < this.f3575 || i2 > this.f3574) {
            AbstractC1374.m2507("Cannot seek outside the current group (" + this.f3575 + SignatureVisitor.SUPER + this.f3574 + ')');
        }
        this.f3570 = i2;
        int iM2132 = m2132(this.f3568, m2128(i2));
        this.f3586 = iM2132;
        this.f3587 = iM2132;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object m2119(int i) {
        int iM2128 = m2128(i);
        int[] iArr = this.f3568;
        int i2 = iM2128 * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f3567[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m2120(int i) {
        return this.f3568[m2128(i) * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m2121(int i) {
        if (i > 0) {
            int i2 = this.f3570;
            m2104(i2);
            int i3 = this.f3583;
            int i4 = this.f3582;
            int[] iArr = this.f3568;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC4347.m8836(0, 0, i3 * 5, iArr, iArr2);
                AbstractC4347.m8836((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.f3568 = iArr2;
                i4 = i6;
            }
            int i7 = this.f3574;
            if (i7 >= i3) {
                this.f3574 = i7 + i;
            }
            int i8 = i3 + i;
            this.f3583 = i8;
            this.f3582 = i4 - i;
            int iM2090 = m2090(i5 > 0 ? m2113(i2 + i) : 0, this.f3577 >= i3 ? this.f3584 : 0, this.f3585, this.f3567.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f3568[(i9 * 5) + 4] = iM2090;
            }
            int i10 = this.f3577;
            if (i10 >= i3) {
                this.f3577 = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m2122(int i, int i2) {
        if (i > 0) {
            m2103(this.f3586, i2);
            int i3 = this.f3584;
            int i4 = this.f3585;
            if (i4 < i) {
                Object[] objArr = this.f3567;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f3567 = objArr2;
                i4 = i7;
            }
            int i9 = this.f3587;
            if (i9 >= i3) {
                this.f3587 = i9 + i;
            }
            this.f3584 = i3 + i;
            this.f3585 = i4 - i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int m2123(int i) {
        return this.f3568[(m2128(i) * 5) + 3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m2124(int i, int i2) {
        int iM2129;
        int iM2123;
        if (i2 == this.f3575) {
            iM2129 = this.f3574;
        } else {
            C1310 c1310 = this.f3581;
            if (i2 > c1310.m2309(0)) {
                iM2123 = m2123(i2);
            } else {
                int[] iArr = c1310.f3803;
                int iMin = Math.min(iArr.length, c1310.f3802);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iM2123 = m2123(i2);
                } else {
                    iM2129 = (m2129() - this.f3582) - this.f3578.f3803[i3];
                }
            }
            iM2129 = iM2123 + i2;
        }
        return i > i2 && i < iM2129;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        p144.C7547.m12772("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2125(int r20, p052.InterfaceC6554 r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.gapbuffer.C1235.m2125(int, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2126(int i, int i2, int i3) {
        if (i >= this.f3583) {
            i = -((m2130() - i) + 2);
        }
        while (i3 < i2) {
            this.f3568[(m2128(i3) * 5) + 2] = i;
            int i4 = this.f3568[(m2128(i3) * 5) + 3] + i3;
            m2126(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object m2127(int i) {
        int iM2128 = m2128(i);
        int[] iArr = this.f3568;
        int i2 = (iM2128 * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C1369.f3974;
        }
        return this.f3567[Integer.bitCount(iArr[i2] >> 29) + m2132(iArr, iM2128)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m2128(int i) {
        return (this.f3582 * (i < this.f3583 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m2129() {
        return this.f3568.length / 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m2130() {
        return m2129() - this.f3582;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m2131(int i) {
        return (this.f3585 * (i < this.f3584 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m2132(int[] iArr, int i) {
        if (i >= m2129()) {
            return this.f3567.length - this.f3585;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f3567.length - this.f3585) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2133() {
        if (this.f3576 <= 0) {
            AbstractC1392.m2537("Unbalanced begin/end insert");
        }
        int i = this.f3576 - 1;
        this.f3576 = i;
        if (i == 0) {
            if (this.f3579.f3802 != this.f3581.f3802) {
                AbstractC1374.m2507("startGroup/endGroup mismatch while inserting");
            }
            this.f3574 = (m2129() - this.f3582) - this.f3578.m2308();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2134(int i) {
        boolean z = false;
        if (!(this.f3576 <= 0)) {
            AbstractC1374.m2507("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f3575;
        if (i2 != i) {
            if (i >= i2 && i < this.f3574) {
                z = true;
            }
            if (!z) {
                AbstractC1374.m2507("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f3570;
            int i4 = this.f3586;
            int i5 = this.f3587;
            this.f3570 = i;
            m2097();
            this.f3570 = i3;
            this.f3586 = i4;
            this.f3587 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2135() {
        C0244 c0244;
        boolean z = this.f3576 > 0;
        int i = this.f3570;
        int i2 = this.f3574;
        int i3 = this.f3575;
        int iM2128 = m2128(i3);
        int i4 = this.f3580;
        int i5 = i - i3;
        int i6 = iM2128 * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f3568[i7] & 1073741824) != 0;
        C1310 c1310 = this.f3579;
        if (z) {
            C0246 c0246 = this.f3571;
            if (c0246 != null && (c0244 = (C0244) c0246.m833(i3)) != null) {
                Object[] objArr = c0244.f1005;
                int i8 = c0244.f1004;
                for (int i9 = 0; i9 < i8; i9++) {
                    m2111(objArr[i9]);
                }
            }
            int[] iArr = this.f3568;
            iArr[i6 + 3] = i5;
            AbstractC1238.m2139(iArr, iM2128, i4);
            int iM2308 = c1310.m2308();
            if (z2) {
                i4 = 1;
            }
            this.f3580 = iM2308 + i4;
            int iM2112 = m2112(this.f3568, i3);
            this.f3575 = iM2112;
            int iM2130 = iM2112 < 0 ? m2130() : m2128(iM2112 + 1);
            int iM2132 = iM2130 >= 0 ? m2132(this.f3568, iM2130) : 0;
            this.f3586 = iM2132;
            this.f3587 = iM2132;
            return;
        }
        if (i != i2) {
            AbstractC1374.m2507("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f3568;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        AbstractC1238.m2139(iArr2, iM2128, i4);
        int iM23082 = this.f3581.m2308();
        this.f3574 = (m2129() - this.f3582) - this.f3578.m2308();
        this.f3575 = iM23082;
        int iM21122 = m2112(this.f3568, i3);
        int iM23083 = c1310.m2308();
        this.f3580 = iM23083;
        if (iM21122 == iM23082) {
            this.f3580 = iM23083 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM21122 != 0 && iM21122 != iM23082 && (i14 != 0 || i13 != 0)) {
                int iM21282 = m2128(iM21122);
                if (i13 != 0) {
                    int[] iArr3 = this.f3568;
                    int i15 = (iM21282 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f3568;
                    AbstractC1238.m2139(iArr4, iM21282, (iArr4[(iM21282 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.f3568;
                if ((iArr5[(iM21282 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM21122 = m2112(iArr5, iM21122);
            }
        }
        this.f3580 += i14;
    }
}
