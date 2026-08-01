package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.C0244;
import androidx.collection.C0246;
import androidx.collection.C0247;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.C1310;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import com.bumptech.glide.AbstractC3064;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1235 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0246 f3563;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public HashMap f3564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f3565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object[] f3566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f3567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1233 f3568;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3569;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0246 f3570;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f3571;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C0247 f3572;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f3573;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f3574;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f3575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1310 f3577;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1310 f3578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f3579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1310 f3580;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f3581;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3582;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3583;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3584;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f3585;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f3586;

    public C1235(C1233 c1233) {
        this.f3568 = c1233;
        int[] iArr = c1233.f3544;
        this.f3567 = iArr;
        Object[] objArr = c1233.f3547;
        this.f3566 = objArr;
        this.f3565 = c1233.f3540;
        this.f3564 = c1233.f3539;
        this.f3563 = c1233.f3538;
        int i = c1233.f3543;
        this.f3582 = i;
        this.f3581 = (iArr.length / 5) - i;
        int i2 = c1233.f3548;
        this.f3583 = i2;
        this.f3584 = objArr.length - i2;
        this.f3576 = i;
        this.f3580 = new C1310();
        this.f3577 = new C1310();
        this.f3578 = new C1310();
        this.f3573 = i;
        this.f3574 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m2079(C1235 c1235) {
        int i = c1235.f3574;
        int iM2118 = c1235.m2118(i);
        int[] iArr = c1235.f3567;
        int i2 = (iM2118 * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        c1235.m2084(c1235.m2102(iArr, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m2080(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f3569 + " end=" + this.f3573 + " size = " + m2120() + " gap=" + this.f3582 + SignatureVisitor.SUPER + (this.f3582 + this.f3581) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m2081(int i, Object obj) {
        int iM2118 = m2118(i);
        int[] iArr = this.f3567;
        if (iM2118 >= iArr.length || (iArr[(iM2118 * 5) + 1] & 1073741824) == 0) {
            AbstractC1374.m2497("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f3566[m2121(m2122(this.f3567, iM2118))] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C1230 m2082(int i) {
        ArrayList arrayList;
        int iM2127;
        if (i < 0 || i >= m2120() || (iM2127 = AbstractC1238.m2127((arrayList = this.f3565), i, m2120())) < 0) {
            return null;
        }
        return (C1230) arrayList.get(iM2127);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2083(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.f3574;
        Object[] objArr = this.f3575 > 0;
        this.f3578.m2297(this.f3579);
        C1353 c1353 = C1369.f3973;
        if (objArr == true) {
            int i4 = this.f3569;
            int iM2122 = m2122(this.f3567, m2118(i4));
            m2111(1);
            this.f3585 = iM2122;
            this.f3586 = iM2122;
            int iM2118 = m2118(i4);
            int i5 = obj != c1353 ? 1 : 0;
            int i6 = (z || obj2 == c1353) ? 0 : 1;
            int iM2080 = m2080(iM2122, this.f3583, this.f3584, this.f3566.length);
            if (iM2080 >= 0 && this.f3576 < i4) {
                iM2080 = -(((this.f3566.length - this.f3584) - iM2080) + 1);
            }
            int[] iArr = this.f3567;
            int i7 = this.f3574;
            int i8 = iM2118 * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM2080;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m2112(i9, i4);
                Object[] objArr2 = this.f3566;
                int i10 = this.f3585;
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
                this.f3585 = i10;
            }
            this.f3579 = 0;
            i2 = i4 + 1;
            this.f3574 = i4;
            this.f3569 = i2;
            if (i3 >= 0) {
                m2086(i3);
            }
        } else {
            this.f3580.m2297(i3);
            this.f3577.m2297((m2119() - this.f3581) - this.f3573);
            int i11 = this.f3569;
            int iM21182 = m2118(i11);
            if (!AbstractC4394.m8917(obj2, c1353)) {
                if (z) {
                    m2081(this.f3569, obj2);
                } else {
                    m2085(obj2);
                }
            }
            this.f3585 = m2090(this.f3567, iM21182);
            this.f3586 = m2122(this.f3567, m2118(this.f3569 + 1));
            int[] iArr2 = this.f3567;
            int i12 = iM21182 * 5;
            this.f3579 = iArr2[i12 + 1] & 67108863;
            this.f3574 = i11;
            this.f3569 = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f3573 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2084(int i) {
        if (i >= 0) {
            C0247 c0247 = this.f3572;
            if (c0247 == null) {
                c0247 = new C0247();
                this.f3572 = c0247;
            }
            AbstractC3064.m6770(c0247, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m2085(Object obj) {
        int iM2118 = m2118(this.f3569);
        int i = (iM2118 * 5) + 1;
        if ((this.f3567[i] & 268435456) == 0) {
            AbstractC1374.m2497("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f3566;
        int[] iArr = this.f3567;
        objArr[m2121(Integer.bitCount(iArr[i] >> 29) + m2122(iArr, iM2118))] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final AbstractC1229 m2086(int i) {
        C1230 c1230M2082;
        HashMap map = this.f3564;
        if (map == null || (c1230M2082 = m2082(i)) == null) {
            return null;
        }
        return (AbstractC1229) map.get(c1230M2082);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2087() {
        if (this.f3575 != 0) {
            AbstractC1374.m2497("Key must be supplied when inserting");
        }
        C1353 c1353 = C1369.f3973;
        m2083(0, c1353, c1353, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int m2088() {
        int iM2118 = m2118(this.f3569);
        int i = this.f3569;
        int[] iArr = this.f3567;
        int i2 = iM2118 * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f3569 = i3;
        this.f3585 = m2122(iArr, m2118(i3));
        int i4 = this.f3567[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Object m2089(Object obj, int i, int i2) {
        int iM2090 = m2090(this.f3567, m2118(i));
        int iM2122 = m2122(this.f3567, m2118(i + 1));
        int i3 = iM2090 + i2;
        if (i3 < iM2090 || i3 >= iM2122) {
            AbstractC1374.m2497("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM2121 = m2121(i3);
        Object[] objArr = this.f3566;
        Object obj2 = objArr[iM2121];
        objArr[iM2121] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int m2090(int[] iArr, int i) {
        if (i >= m2119()) {
            return this.f3566.length - this.f3584;
        }
        int iM2130 = AbstractC1238.m2130(iArr, i);
        return iM2130 < 0 ? (this.f3566.length - this.f3584) + iM2130 + 1 : iM2130;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2091() {
        int i = this.f3573;
        this.f3569 = i;
        this.f3585 = m2122(this.f3567, m2118(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2092(int i) {
        int iM2118 = m2118(i);
        int[] iArr = this.f3567;
        if ((iArr[(iM2118 * 5) + 1] & 1073741824) != 0) {
            return this.f3566[m2121(m2122(iArr, iM2118))];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m2093(int i, int i2) {
        int i3 = this.f3584;
        int i4 = this.f3583;
        int i5 = this.f3576;
        if (i4 != i) {
            Object[] objArr = this.f3566;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m2120());
        if (i5 != iMin) {
            int length = this.f3566.length - i3;
            if (iMin < i5) {
                int iM2118 = m2118(iMin);
                int iM21182 = m2118(i5);
                int i7 = this.f3582;
                while (iM2118 < iM21182) {
                    int i8 = (iM2118 * 5) + 4;
                    int i9 = this.f3567[i8];
                    if (i9 < 0) {
                        AbstractC1374.m2497("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f3567[i8] = -((length - i9) + 1);
                    iM2118++;
                    if (iM2118 == i7) {
                        iM2118 += this.f3581;
                    }
                }
            } else {
                int iM21183 = m2118(i5);
                int iM21184 = m2118(iMin);
                while (iM21183 < iM21184) {
                    int i10 = (iM21183 * 5) + 4;
                    int i11 = this.f3567[i10];
                    if (i11 >= 0) {
                        AbstractC1374.m2497("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f3567[i10] = i11 + length + 1;
                    iM21183++;
                    if (iM21183 == this.f3582) {
                        iM21183 += this.f3581;
                    }
                }
            }
            this.f3576 = iMin;
        }
        this.f3583 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m2094(int i) {
        C1230 c1230;
        int i2;
        C1230 c12302;
        int i3;
        int i4;
        int i5 = this.f3581;
        int i6 = this.f3582;
        if (i6 != i) {
            if (!this.f3565.isEmpty()) {
                int iM2119 = m2119() - this.f3581;
                ArrayList arrayList = this.f3565;
                if (i6 < i) {
                    for (int iM2131 = AbstractC1238.m2131(arrayList, i6, iM2119); iM2131 < this.f3565.size() && (i3 = (c12302 = (C1230) this.f3565.get(iM2131)).f3533) < 0 && (i4 = i3 + iM2119) < i; iM2131++) {
                        c12302.f3533 = i4;
                    }
                } else {
                    for (int iM21312 = AbstractC1238.m2131(arrayList, i, iM2119); iM21312 < this.f3565.size() && (i2 = (c1230 = (C1230) this.f3565.get(iM21312)).f3533) >= 0; iM21312++) {
                        c1230.f3533 = -(iM2119 - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f3567;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC4346.m8842(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    AbstractC4346.m8842(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM21192 = m2119();
            if (i6 >= iM21192) {
                AbstractC1374.m2497("Check failed");
            }
            while (i6 < iM21192) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f3567[i10];
                int iM2120 = i11 > -2 ? i11 : (m2120() + i11) - (-2);
                if (iM2120 >= i) {
                    iM2120 = -((m2120() - iM2120) - (-2));
                }
                if (iM2120 != i11) {
                    this.f3567[i10] = iM2120;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f3582 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m2095(C1233 c1233, int i) {
        if (this.f3575 <= 0) {
            AbstractC1374.m2497("Check failed");
        }
        if (i == 0 && this.f3569 == 0 && this.f3568.f3543 == 0) {
            int[] iArr = c1233.f3544;
            int i2 = iArr[(i * 5) + 3];
            int i3 = c1233.f3543;
            if (i2 == i3) {
                int[] iArr2 = this.f3567;
                Object[] objArr = this.f3566;
                ArrayList arrayList = this.f3565;
                HashMap map = this.f3564;
                C0246 c0246 = this.f3563;
                Object[] objArr2 = c1233.f3547;
                int i4 = c1233.f3548;
                HashMap map2 = c1233.f3539;
                C0246 c02462 = c1233.f3538;
                this.f3567 = iArr;
                this.f3566 = objArr2;
                this.f3565 = c1233.f3540;
                this.f3582 = i3;
                this.f3581 = (iArr.length / 5) - i3;
                this.f3583 = i4;
                this.f3584 = objArr2.length - i4;
                this.f3576 = i3;
                this.f3564 = map2;
                this.f3563 = c02462;
                c1233.f3544 = iArr2;
                c1233.f3543 = 0;
                c1233.f3547 = objArr;
                c1233.f3548 = 0;
                c1233.f3540 = arrayList;
                c1233.f3539 = map;
                c1233.f3538 = c0246;
                return;
            }
        }
        C1235 c1235M2053 = c1233.m2053();
        try {
            AbstractC3932.m8311(c1235M2053, i, this, true, true, false);
            c1235M2053.m2104(true);
        } catch (Throwable th) {
            c1235M2053.m2104(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m2096(int i) {
        return (this.f3567[(m2118(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m2097(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f3584;
            int i5 = i + i2;
            m2093(i5, i3);
            this.f3583 = i;
            this.f3584 = i4 + i2;
            Arrays.fill(this.f3566, i, i5, (Object) null);
            int i6 = this.f3586;
            if (i6 >= i) {
                this.f3586 = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean m2098(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f3565;
            m2094(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f3564;
                int i3 = i + i2;
                int iM2131 = AbstractC1238.m2131(this.f3565, i3, m2119() - this.f3581);
                if (iM2131 >= this.f3565.size()) {
                    iM2131--;
                }
                int i4 = iM2131 + 1;
                int i5 = 0;
                while (iM2131 >= 0) {
                    C1230 c1230 = (C1230) this.f3565.get(iM2131);
                    int iM2106 = m2106(c1230);
                    if (iM2106 < i) {
                        break;
                    }
                    if (iM2106 < i3) {
                        c1230.f3533 = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM2131 + 1;
                        }
                        i4 = iM2131;
                    }
                    iM2131--;
                }
                z = i4 < i5;
                if (z) {
                    this.f3565.subList(i4, i5).clear();
                }
            }
            this.f3582 = i;
            this.f3581 += i2;
            int i6 = this.f3576;
            if (i6 > i) {
                this.f3576 = Math.max(i, i6 - i2);
            }
            int i7 = this.f3573;
            if (i7 >= this.f3582) {
                this.f3573 = i7 - i2;
            }
            int i8 = this.f3574;
            if (i8 >= 0 && (this.f3567[(m2118(i8) * 5) + 1] & 67108864) != 0) {
                m2084(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean m2099() {
        if (this.f3575 != 0) {
            AbstractC1374.m2497("Cannot remove group while inserting");
        }
        int i = this.f3569;
        int i2 = this.f3585;
        int iM2122 = m2122(this.f3567, m2118(i));
        int iM2088 = m2088();
        m2086(this.f3574);
        C0247 c0247 = this.f3572;
        if (c0247 != null) {
            while (true) {
                int i3 = c0247.f985;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    C4210.m8627("IntList is empty.");
                    return false;
                }
                if (c0247.f986[0] < i) {
                    break;
                }
                AbstractC3064.m6782(c0247);
            }
        }
        boolean zM2098 = m2098(i, this.f3569 - i);
        m2097(iM2122, this.f3585 - iM2122, i - 1);
        this.f3569 = i;
        this.f3585 = i2;
        this.f3579 -= iM2088;
        return zM2098;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m2100() {
        int i;
        C0247 c0247 = this.f3572;
        if (c0247 != null) {
            while (c0247.f985 != 0) {
                int iM6782 = AbstractC3064.m6782(c0247);
                int iM2118 = m2118(iM6782);
                int iM2113 = iM6782 + 1;
                int iM21132 = m2113(iM6782) + iM6782;
                while (true) {
                    if (iM2113 >= iM21132) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f3567[(m2118(iM2113) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM2113 += m2113(iM2113);
                    }
                }
                int[] iArr = this.f3567;
                int i2 = (iM2118 * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM2102 = m2102(iArr, iM6782);
                    if (iM2102 >= 0) {
                        AbstractC3064.m6770(c0247, iM2102);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final Object m2101(Object obj) {
        if (this.f3575 > 0) {
            m2112(1, this.f3574);
        }
        Object[] objArr = this.f3566;
        int i = this.f3585;
        this.f3585 = i + 1;
        Object obj2 = objArr[m2121(i)];
        if (this.f3585 > this.f3586) {
            AbstractC1374.m2497("Writing to an invalid slot");
        }
        this.f3566[m2121(this.f3585 - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int m2102(int[] iArr, int i) {
        int i2 = iArr[(m2118(i) * 5) + 2];
        return i2 > -2 ? i2 : (m2120() + i2) - (-2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m2103(int i) {
        return m2122(this.f3567, m2118(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2104(boolean z) {
        this.f3571 = true;
        if (z && this.f3580.f3801 == 0) {
            m2094(m2120());
            m2093(this.f3566.length - this.f3584, this.f3582);
            int i = this.f3583;
            Arrays.fill(this.f3566, i, this.f3584 + i, (Object) null);
            m2100();
        }
        int[] iArr = this.f3567;
        int i2 = this.f3582;
        Object[] objArr = this.f3566;
        int i3 = this.f3583;
        ArrayList arrayList = this.f3565;
        HashMap map = this.f3564;
        C0246 c0246 = this.f3563;
        C1233 c1233 = this.f3568;
        if (!c1233.f3542) {
            AbstractC1392.m2528("Unexpected writer close()");
        }
        c1233.f3542 = false;
        c1233.f3544 = iArr;
        c1233.f3543 = i2;
        c1233.f3547 = objArr;
        c1233.f3548 = i3;
        c1233.f3540 = arrayList;
        c1233.f3539 = map;
        c1233.f3538 = c0246;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2105() {
        int i = this.f3575;
        this.f3575 = i + 1;
        if (i == 0) {
            this.f3577.m2297((m2119() - this.f3581) - this.f3573);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m2106(C1230 c1230) {
        int i = c1230.f3533;
        return i < 0 ? m2120() + i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1230 m2107(int i) {
        ArrayList arrayList = this.f3565;
        int iM2127 = AbstractC1238.m2127(arrayList, i, m2120());
        if (iM2127 >= 0) {
            return (C1230) arrayList.get(iM2127);
        }
        if (i > this.f3582) {
            i = -(m2120() - i);
        }
        C1230 c1230 = new C1230(i);
        arrayList.add(-(iM2127 + 1), c1230);
        return c1230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2108(int i) {
        if (i < 0) {
            AbstractC1374.m2497("Cannot seek backwards");
        }
        if (this.f3575 > 0) {
            AbstractC1392.m2527("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f3569 + i;
        if (i2 < this.f3574 || i2 > this.f3573) {
            AbstractC1374.m2497("Cannot seek outside the current group (" + this.f3574 + SignatureVisitor.SUPER + this.f3573 + ')');
        }
        this.f3569 = i2;
        int iM2122 = m2122(this.f3567, m2118(i2));
        this.f3585 = iM2122;
        this.f3586 = iM2122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object m2109(int i) {
        int iM2118 = m2118(i);
        int[] iArr = this.f3567;
        int i2 = iM2118 * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f3566[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m2110(int i) {
        return this.f3567[m2118(i) * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m2111(int i) {
        if (i > 0) {
            int i2 = this.f3569;
            m2094(i2);
            int i3 = this.f3582;
            int i4 = this.f3581;
            int[] iArr = this.f3567;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC4346.m8842(0, 0, i3 * 5, iArr, iArr2);
                AbstractC4346.m8842((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.f3567 = iArr2;
                i4 = i6;
            }
            int i7 = this.f3573;
            if (i7 >= i3) {
                this.f3573 = i7 + i;
            }
            int i8 = i3 + i;
            this.f3582 = i8;
            this.f3581 = i4 - i;
            int iM2080 = m2080(i5 > 0 ? m2103(i2 + i) : 0, this.f3576 >= i3 ? this.f3583 : 0, this.f3584, this.f3566.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f3567[(i9 * 5) + 4] = iM2080;
            }
            int i10 = this.f3576;
            if (i10 >= i3) {
                this.f3576 = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m2112(int i, int i2) {
        if (i > 0) {
            m2093(this.f3585, i2);
            int i3 = this.f3583;
            int i4 = this.f3584;
            if (i4 < i) {
                Object[] objArr = this.f3566;
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
                this.f3566 = objArr2;
                i4 = i7;
            }
            int i9 = this.f3586;
            if (i9 >= i3) {
                this.f3586 = i9 + i;
            }
            this.f3583 = i3 + i;
            this.f3584 = i4 - i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int m2113(int i) {
        return this.f3567[(m2118(i) * 5) + 3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m2114(int i, int i2) {
        int iM2119;
        int iM2113;
        if (i2 == this.f3574) {
            iM2119 = this.f3573;
        } else {
            C1310 c1310 = this.f3580;
            if (i2 > c1310.m2299(0)) {
                iM2113 = m2113(i2);
            } else {
                int[] iArr = c1310.f3802;
                int iMin = Math.min(iArr.length, c1310.f3801);
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
                    iM2113 = m2113(i2);
                } else {
                    iM2119 = (m2119() - this.f3581) - this.f3577.f3802[i3];
                }
            }
            iM2119 = iM2113 + i2;
        }
        return i > i2 && i < iM2119;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        p144.C7546.m12743("Index must be between 0 and size");
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
    public final void m2115(int r20, p052.InterfaceC6553 r21) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.gapbuffer.C1235.m2115(int, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2116(int i, int i2, int i3) {
        if (i >= this.f3582) {
            i = -((m2120() - i) + 2);
        }
        while (i3 < i2) {
            this.f3567[(m2118(i3) * 5) + 2] = i;
            int i4 = this.f3567[(m2118(i3) * 5) + 3] + i3;
            m2116(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object m2117(int i) {
        int iM2118 = m2118(i);
        int[] iArr = this.f3567;
        int i2 = (iM2118 * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C1369.f3973;
        }
        return this.f3566[Integer.bitCount(iArr[i2] >> 29) + m2122(iArr, iM2118)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m2118(int i) {
        return (this.f3581 * (i < this.f3582 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m2119() {
        return this.f3567.length / 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m2120() {
        return m2119() - this.f3581;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m2121(int i) {
        return (this.f3584 * (i < this.f3583 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m2122(int[] iArr, int i) {
        if (i >= m2119()) {
            return this.f3566.length - this.f3584;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f3566.length - this.f3584) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2123() {
        if (this.f3575 <= 0) {
            AbstractC1392.m2527("Unbalanced begin/end insert");
        }
        int i = this.f3575 - 1;
        this.f3575 = i;
        if (i == 0) {
            if (this.f3578.f3801 != this.f3580.f3801) {
                AbstractC1374.m2497("startGroup/endGroup mismatch while inserting");
            }
            this.f3573 = (m2119() - this.f3581) - this.f3577.m2298();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2124(int i) {
        boolean z = false;
        if (!(this.f3575 <= 0)) {
            AbstractC1374.m2497("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f3574;
        if (i2 != i) {
            if (i >= i2 && i < this.f3573) {
                z = true;
            }
            if (!z) {
                AbstractC1374.m2497("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f3569;
            int i4 = this.f3585;
            int i5 = this.f3586;
            this.f3569 = i;
            m2087();
            this.f3569 = i3;
            this.f3585 = i4;
            this.f3586 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2125() {
        C0244 c0244;
        boolean z = this.f3575 > 0;
        int i = this.f3569;
        int i2 = this.f3573;
        int i3 = this.f3574;
        int iM2118 = m2118(i3);
        int i4 = this.f3579;
        int i5 = i - i3;
        int i6 = iM2118 * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f3567[i7] & 1073741824) != 0;
        C1310 c1310 = this.f3578;
        if (z) {
            C0246 c0246 = this.f3570;
            if (c0246 != null && (c0244 = (C0244) c0246.m832(i3)) != null) {
                Object[] objArr = c0244.f1005;
                int i8 = c0244.f1004;
                for (int i9 = 0; i9 < i8; i9++) {
                    m2101(objArr[i9]);
                }
            }
            int[] iArr = this.f3567;
            iArr[i6 + 3] = i5;
            AbstractC1238.m2129(iArr, iM2118, i4);
            int iM2298 = c1310.m2298();
            if (z2) {
                i4 = 1;
            }
            this.f3579 = iM2298 + i4;
            int iM2102 = m2102(this.f3567, i3);
            this.f3574 = iM2102;
            int iM2120 = iM2102 < 0 ? m2120() : m2118(iM2102 + 1);
            int iM2122 = iM2120 >= 0 ? m2122(this.f3567, iM2120) : 0;
            this.f3585 = iM2122;
            this.f3586 = iM2122;
            return;
        }
        if (i != i2) {
            AbstractC1374.m2497("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f3567;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        AbstractC1238.m2129(iArr2, iM2118, i4);
        int iM22982 = this.f3580.m2298();
        this.f3573 = (m2119() - this.f3581) - this.f3577.m2298();
        this.f3574 = iM22982;
        int iM21022 = m2102(this.f3567, i3);
        int iM22983 = c1310.m2298();
        this.f3579 = iM22983;
        if (iM21022 == iM22982) {
            this.f3579 = iM22983 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM21022 != 0 && iM21022 != iM22982 && (i14 != 0 || i13 != 0)) {
                int iM21182 = m2118(iM21022);
                if (i13 != 0) {
                    int[] iArr3 = this.f3567;
                    int i15 = (iM21182 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f3567;
                    AbstractC1238.m2129(iArr4, iM21182, (iArr4[(iM21182 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.f3567;
                if ((iArr5[(iM21182 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM21022 = m2102(iArr5, iM21022);
            }
        }
        this.f3579 += i14;
    }
}
