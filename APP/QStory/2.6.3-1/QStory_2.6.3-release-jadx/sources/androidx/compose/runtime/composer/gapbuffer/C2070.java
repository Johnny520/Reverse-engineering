package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.AbstractC1121;
import androidx.collection.C1091;
import androidx.collection.C1092;
import androidx.collection.C1093;
import androidx.collection.C1094;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.AbstractC2227;
import androidx.compose.runtime.C2145;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import com.bumptech.glide.AbstractC3897;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2070 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1093 f3909;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public HashMap f3910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f3911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object[] f3912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f3913;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f3914;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3915;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1093 f3916;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f3917;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C1094 f3918;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f3919;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f3920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f3921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3922;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2145 f3923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2145 f3924;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f3925;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2145 f3926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f3927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3928;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3930;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f3931;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f3932;

    public C2070(C2068 c2068) {
        this.f3914 = c2068;
        int[] iArr = c2068.f3890;
        this.f3913 = iArr;
        Object[] objArr = c2068.f3893;
        this.f3912 = objArr;
        this.f3911 = c2068.f3886;
        this.f3910 = c2068.f3885;
        this.f3909 = c2068.f3884;
        int i = c2068.f3889;
        this.f3928 = i;
        this.f3927 = (iArr.length / 5) - i;
        int i2 = c2068.f3894;
        this.f3929 = i2;
        this.f3930 = objArr.length - i2;
        this.f3922 = i;
        this.f3926 = new C2145();
        this.f3923 = new C2145();
        this.f3924 = new C2145();
        this.f3919 = i;
        this.f3920 = -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m2649(C2070 c2070) {
        int i = c2070.f3920;
        int iM2688 = c2070.m2688(i);
        int[] iArr = c2070.f3913;
        int i2 = (iM2688 * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        c2070.m2654(c2070.m2672(iArr, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m2650(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f3915 + " end=" + this.f3919 + " size = " + m2690() + " gap=" + this.f3928 + SignatureVisitor.SUPER + (this.f3928 + this.f3927) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m2651(int i, Object obj) {
        int iM2688 = m2688(i);
        int[] iArr = this.f3913;
        if (iM2688 >= iArr.length || (iArr[(iM2688 * 5) + 1] & 1073741824) == 0) {
            AbstractC2209.m3067("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.f3912[m2691(m2692(this.f3913, iM2688))] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C2065 m2652(int i) {
        ArrayList arrayList;
        int iM2697;
        if (i < 0 || i >= m2690() || (iM2697 = AbstractC2073.m2697((arrayList = this.f3911), i, m2690())) < 0) {
            return null;
        }
        return (C2065) arrayList.get(iM2697);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2653(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.f3920;
        Object[] objArr = this.f3921 > 0;
        this.f3924.m2867(this.f3925);
        C2188 c2188 = C2204.f4319;
        if (objArr == true) {
            int i4 = this.f3915;
            int iM2692 = m2692(this.f3913, m2688(i4));
            m2681(1);
            this.f3931 = iM2692;
            this.f3932 = iM2692;
            int iM2688 = m2688(i4);
            int i5 = obj != c2188 ? 1 : 0;
            int i6 = (z || obj2 == c2188) ? 0 : 1;
            int iM2650 = m2650(iM2692, this.f3929, this.f3930, this.f3912.length);
            if (iM2650 >= 0 && this.f3922 < i4) {
                iM2650 = -(((this.f3912.length - this.f3930) - iM2650) + 1);
            }
            int[] iArr = this.f3913;
            int i7 = this.f3920;
            int i8 = iM2688 * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iM2650;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                m2682(i9, i4);
                Object[] objArr2 = this.f3912;
                int i10 = this.f3931;
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
                this.f3931 = i10;
            }
            this.f3925 = 0;
            i2 = i4 + 1;
            this.f3920 = i4;
            this.f3915 = i2;
            if (i3 >= 0) {
                m2656(i3);
            }
        } else {
            this.f3926.m2867(i3);
            this.f3923.m2867((m2689() - this.f3927) - this.f3919);
            int i11 = this.f3915;
            int iM26882 = m2688(i11);
            if (!AbstractC5227.m9466(obj2, c2188)) {
                if (z) {
                    m2651(this.f3915, obj2);
                } else {
                    m2655(obj2);
                }
            }
            this.f3931 = m2660(this.f3913, iM26882);
            this.f3932 = m2692(this.f3913, m2688(this.f3915 + 1));
            int[] iArr2 = this.f3913;
            int i12 = iM26882 * 5;
            this.f3925 = iArr2[i12 + 1] & 67108863;
            this.f3920 = i11;
            this.f3915 = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.f3919 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2654(int i) {
        if (i >= 0) {
            C1094 c1094 = this.f3918;
            if (c1094 == null) {
                c1094 = new C1094();
                this.f3918 = c1094;
            }
            AbstractC3897.m7379(c1094, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m2655(Object obj) {
        int iM2688 = m2688(this.f3915);
        int i = (iM2688 * 5) + 1;
        if ((this.f3913[i] & 268435456) == 0) {
            AbstractC2209.m3067("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f3912;
        int[] iArr = this.f3913;
        objArr[m2691(Integer.bitCount(iArr[i] >> 29) + m2692(iArr, iM2688))] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final AbstractC2064 m2656(int i) {
        C2065 c2065M2652;
        HashMap map = this.f3910;
        if (map == null || (c2065M2652 = m2652(i)) == null) {
            return null;
        }
        return (AbstractC2064) map.get(c2065M2652);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2657() {
        if (this.f3921 != 0) {
            AbstractC2209.m3067("Key must be supplied when inserting");
        }
        C2188 c2188 = C2204.f4319;
        m2653(0, c2188, c2188, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final int m2658() {
        int iM2688 = m2688(this.f3915);
        int i = this.f3915;
        int[] iArr = this.f3913;
        int i2 = iM2688 * 5;
        int i3 = iArr[i2 + 3] + i;
        this.f3915 = i3;
        this.f3931 = m2692(iArr, m2688(i3));
        int i4 = this.f3913[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Object m2659(Object obj, int i, int i2) {
        int iM2660 = m2660(this.f3913, m2688(i));
        int iM2692 = m2692(this.f3913, m2688(i + 1));
        int i3 = iM2660 + i2;
        if (i3 < iM2660 || i3 >= iM2692) {
            AbstractC2209.m3067("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iM2691 = m2691(i3);
        Object[] objArr = this.f3912;
        Object obj2 = objArr[iM2691];
        objArr[iM2691] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int m2660(int[] iArr, int i) {
        if (i >= m2689()) {
            return this.f3912.length - this.f3930;
        }
        int iM2700 = AbstractC2073.m2700(iArr, i);
        return iM2700 < 0 ? (this.f3912.length - this.f3930) + iM2700 + 1 : iM2700;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2661() {
        int i = this.f3919;
        this.f3915 = i;
        this.f3931 = m2692(this.f3913, m2688(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2662(int i) {
        int iM2688 = m2688(i);
        int[] iArr = this.f3913;
        if ((iArr[(iM2688 * 5) + 1] & 1073741824) != 0) {
            return this.f3912[m2691(m2692(iArr, iM2688))];
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m2663(int i, int i2) {
        int i3 = this.f3930;
        int i4 = this.f3929;
        int i5 = this.f3922;
        if (i4 != i) {
            Object[] objArr = this.f3912;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, m2690());
        if (i5 != iMin) {
            int length = this.f3912.length - i3;
            if (iMin < i5) {
                int iM2688 = m2688(iMin);
                int iM26882 = m2688(i5);
                int i7 = this.f3928;
                while (iM2688 < iM26882) {
                    int i8 = (iM2688 * 5) + 4;
                    int i9 = this.f3913[i8];
                    if (i9 < 0) {
                        AbstractC2209.m3067("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f3913[i8] = -((length - i9) + 1);
                    iM2688++;
                    if (iM2688 == i7) {
                        iM2688 += this.f3927;
                    }
                }
            } else {
                int iM26883 = m2688(i5);
                int iM26884 = m2688(iMin);
                while (iM26883 < iM26884) {
                    int i10 = (iM26883 * 5) + 4;
                    int i11 = this.f3913[i10];
                    if (i11 >= 0) {
                        AbstractC2209.m3067("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f3913[i10] = i11 + length + 1;
                    iM26883++;
                    if (iM26883 == this.f3928) {
                        iM26883 += this.f3927;
                    }
                }
            }
            this.f3922 = iMin;
        }
        this.f3929 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m2664(int i) {
        C2065 c2065;
        int i2;
        C2065 c20652;
        int i3;
        int i4;
        int i5 = this.f3927;
        int i6 = this.f3928;
        if (i6 != i) {
            if (!this.f3911.isEmpty()) {
                int iM2689 = m2689() - this.f3927;
                ArrayList arrayList = this.f3911;
                if (i6 < i) {
                    for (int iM2701 = AbstractC2073.m2701(arrayList, i6, iM2689); iM2701 < this.f3911.size() && (i3 = (c20652 = (C2065) this.f3911.get(iM2701)).f3879) < 0 && (i4 = i3 + iM2689) < i; iM2701++) {
                        c20652.f3879 = i4;
                    }
                } else {
                    for (int iM27012 = AbstractC2073.m2701(arrayList, i, iM2689); iM27012 < this.f3911.size() && (i2 = (c2065 = (C2065) this.f3911.get(iM27012)).f3879) >= 0; iM27012++) {
                        c2065.f3879 = -(iM2689 - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.f3913;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC5179.m9395(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    AbstractC5179.m9395(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM26892 = m2689();
            if (i6 >= iM26892) {
                AbstractC2209.m3067("Check failed");
            }
            while (i6 < iM26892) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.f3913[i10];
                int iM2690 = i11 > -2 ? i11 : (m2690() + i11) - (-2);
                if (iM2690 >= i) {
                    iM2690 = -((m2690() - iM2690) - (-2));
                }
                if (iM2690 != i11) {
                    this.f3913[i10] = iM2690;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.f3928 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m2665(C2068 c2068, int i) {
        if (this.f3921 <= 0) {
            AbstractC2209.m3067("Check failed");
        }
        if (i == 0 && this.f3915 == 0 && this.f3914.f3889 == 0) {
            int[] iArr = c2068.f3890;
            int i2 = iArr[(i * 5) + 3];
            int i3 = c2068.f3889;
            if (i2 == i3) {
                int[] iArr2 = this.f3913;
                Object[] objArr = this.f3912;
                ArrayList arrayList = this.f3911;
                HashMap map = this.f3910;
                C1093 c1093 = this.f3909;
                Object[] objArr2 = c2068.f3893;
                int i4 = c2068.f3894;
                HashMap map2 = c2068.f3885;
                C1093 c10932 = c2068.f3884;
                this.f3913 = iArr;
                this.f3912 = objArr2;
                this.f3911 = c2068.f3886;
                this.f3928 = i3;
                this.f3927 = (iArr.length / 5) - i3;
                this.f3929 = i4;
                this.f3930 = objArr2.length - i4;
                this.f3922 = i3;
                this.f3910 = map2;
                this.f3909 = c10932;
                c2068.f3890 = iArr2;
                c2068.f3889 = 0;
                c2068.f3893 = objArr;
                c2068.f3894 = 0;
                c2068.f3886 = arrayList;
                c2068.f3885 = map;
                c2068.f3884 = c1093;
                return;
            }
        }
        C2070 c2070M2623 = c2068.m2623();
        try {
            AbstractC4765.m8855(c2070M2623, i, this, true, true, false);
            c2070M2623.m2674(true);
        } catch (Throwable th) {
            c2070M2623.m2674(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m2666(int i) {
        return (this.f3913[(m2688(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m2667(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f3930;
            int i5 = i + i2;
            m2663(i5, i3);
            this.f3929 = i;
            this.f3930 = i4 + i2;
            Arrays.fill(this.f3912, i, i5, (Object) null);
            int i6 = this.f3932;
            if (i6 >= i) {
                this.f3932 = i6 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean m2668(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.f3911;
            m2664(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f3910;
                int i3 = i + i2;
                int iM2701 = AbstractC2073.m2701(this.f3911, i3, m2689() - this.f3927);
                if (iM2701 >= this.f3911.size()) {
                    iM2701--;
                }
                int i4 = iM2701 + 1;
                int i5 = 0;
                while (iM2701 >= 0) {
                    C2065 c2065 = (C2065) this.f3911.get(iM2701);
                    int iM2676 = m2676(c2065);
                    if (iM2676 < i) {
                        break;
                    }
                    if (iM2676 < i3) {
                        c2065.f3879 = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iM2701 + 1;
                        }
                        i4 = iM2701;
                    }
                    iM2701--;
                }
                z = i4 < i5;
                if (z) {
                    this.f3911.subList(i4, i5).clear();
                }
            }
            this.f3928 = i;
            this.f3927 += i2;
            int i6 = this.f3922;
            if (i6 > i) {
                this.f3922 = Math.max(i, i6 - i2);
            }
            int i7 = this.f3919;
            if (i7 >= this.f3928) {
                this.f3919 = i7 - i2;
            }
            int i8 = this.f3920;
            if (i8 >= 0 && (this.f3913[(m2688(i8) * 5) + 1] & 67108864) != 0) {
                m2654(i8);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean m2669() {
        if (this.f3921 != 0) {
            AbstractC2209.m3067("Cannot remove group while inserting");
        }
        int i = this.f3915;
        int i2 = this.f3931;
        int iM2692 = m2692(this.f3913, m2688(i));
        int iM2658 = m2658();
        m2656(this.f3920);
        C1094 c1094 = this.f3918;
        if (c1094 != null) {
            while (true) {
                int i3 = c1094.f1330;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    C5043.m9176("IntList is empty.");
                    return false;
                }
                if (c1094.f1331[0] < i) {
                    break;
                }
                AbstractC3897.m7368(c1094);
            }
        }
        boolean zM2668 = m2668(i, this.f3915 - i);
        m2667(iM2692, this.f3931 - iM2692, i - 1);
        this.f3915 = i;
        this.f3931 = i2;
        this.f3925 -= iM2658;
        return zM2668;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m2670() {
        int i;
        C1094 c1094 = this.f3918;
        if (c1094 != null) {
            while (c1094.f1330 != 0) {
                int iM7368 = AbstractC3897.m7368(c1094);
                int iM2688 = m2688(iM7368);
                int iM2683 = iM7368 + 1;
                int iM26832 = m2683(iM7368) + iM7368;
                while (true) {
                    if (iM2683 >= iM26832) {
                        i = 0;
                        break;
                    } else {
                        if ((this.f3913[(m2688(iM2683) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iM2683 += m2683(iM2683);
                    }
                }
                int[] iArr = this.f3913;
                int i2 = (iM2688 * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iM2672 = m2672(iArr, iM7368);
                    if (iM2672 >= 0) {
                        AbstractC3897.m7379(c1094, iM2672);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final Object m2671(Object obj) {
        if (this.f3921 > 0) {
            m2682(1, this.f3920);
        }
        Object[] objArr = this.f3912;
        int i = this.f3931;
        this.f3931 = i + 1;
        Object obj2 = objArr[m2691(i)];
        if (this.f3931 > this.f3932) {
            AbstractC2209.m3067("Writing to an invalid slot");
        }
        this.f3912[m2691(this.f3931 - 1)] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int m2672(int[] iArr, int i) {
        int i2 = iArr[(m2688(i) * 5) + 2];
        return i2 > -2 ? i2 : (m2690() + i2) - (-2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m2673(int i) {
        return m2692(this.f3913, m2688(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2674(boolean z) {
        this.f3917 = true;
        if (z && this.f3926.f4147 == 0) {
            m2664(m2690());
            m2663(this.f3912.length - this.f3930, this.f3928);
            int i = this.f3929;
            Arrays.fill(this.f3912, i, this.f3930 + i, (Object) null);
            m2670();
        }
        int[] iArr = this.f3913;
        int i2 = this.f3928;
        Object[] objArr = this.f3912;
        int i3 = this.f3929;
        ArrayList arrayList = this.f3911;
        HashMap map = this.f3910;
        C1093 c1093 = this.f3909;
        C2068 c2068 = this.f3914;
        if (!c2068.f3888) {
            AbstractC2227.m3098("Unexpected writer close()");
        }
        c2068.f3888 = false;
        c2068.f3890 = iArr;
        c2068.f3889 = i2;
        c2068.f3893 = objArr;
        c2068.f3894 = i3;
        c2068.f3886 = arrayList;
        c2068.f3885 = map;
        c2068.f3884 = c1093;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2675() {
        int i = this.f3921;
        this.f3921 = i + 1;
        if (i == 0) {
            this.f3923.m2867((m2689() - this.f3927) - this.f3919);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m2676(C2065 c2065) {
        int i = c2065.f3879;
        return i < 0 ? m2690() + i : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2065 m2677(int i) {
        ArrayList arrayList = this.f3911;
        int iM2697 = AbstractC2073.m2697(arrayList, i, m2690());
        if (iM2697 >= 0) {
            return (C2065) arrayList.get(iM2697);
        }
        if (i > this.f3928) {
            i = -(m2690() - i);
        }
        C2065 c2065 = new C2065(i);
        arrayList.add(-(iM2697 + 1), c2065);
        return c2065;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2678(int i) {
        if (i < 0) {
            AbstractC2209.m3067("Cannot seek backwards");
        }
        if (this.f3921 > 0) {
            AbstractC2227.m3097("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f3915 + i;
        if (i2 < this.f3920 || i2 > this.f3919) {
            AbstractC2209.m3067("Cannot seek outside the current group (" + this.f3920 + SignatureVisitor.SUPER + this.f3919 + ')');
        }
        this.f3915 = i2;
        int iM2692 = m2692(this.f3913, m2688(i2));
        this.f3931 = iM2692;
        this.f3932 = iM2692;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object m2679(int i) {
        int iM2688 = m2688(i);
        int[] iArr = this.f3913;
        int i2 = iM2688 * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f3912[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int m2680(int i) {
        return this.f3913[m2688(i) * 5];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m2681(int i) {
        if (i > 0) {
            int i2 = this.f3915;
            m2664(i2);
            int i3 = this.f3928;
            int i4 = this.f3927;
            int[] iArr = this.f3913;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC5179.m9395(0, 0, i3 * 5, iArr, iArr2);
                AbstractC5179.m9395((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.f3913 = iArr2;
                i4 = i6;
            }
            int i7 = this.f3919;
            if (i7 >= i3) {
                this.f3919 = i7 + i;
            }
            int i8 = i3 + i;
            this.f3928 = i8;
            this.f3927 = i4 - i;
            int iM2650 = m2650(i5 > 0 ? m2673(i2 + i) : 0, this.f3922 >= i3 ? this.f3929 : 0, this.f3930, this.f3912.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.f3913[(i9 * 5) + 4] = iM2650;
            }
            int i10 = this.f3922;
            if (i10 >= i3) {
                this.f3922 = i10 + i;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m2682(int i, int i2) {
        if (i > 0) {
            m2663(this.f3931, i2);
            int i3 = this.f3929;
            int i4 = this.f3930;
            if (i4 < i) {
                Object[] objArr = this.f3912;
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
                this.f3912 = objArr2;
                i4 = i7;
            }
            int i9 = this.f3932;
            if (i9 >= i3) {
                this.f3932 = i9 + i;
            }
            this.f3929 = i3 + i;
            this.f3930 = i4 - i;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int m2683(int i) {
        return this.f3913[(m2688(i) * 5) + 3];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m2684(int i, int i2) {
        int iM2689;
        int iM2683;
        if (i2 == this.f3920) {
            iM2689 = this.f3919;
        } else {
            C2145 c2145 = this.f3926;
            if (i2 > c2145.m2869(0)) {
                iM2683 = m2683(i2);
            } else {
                int[] iArr = c2145.f4148;
                int iMin = Math.min(iArr.length, c2145.f4147);
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
                    iM2683 = m2683(i2);
                } else {
                    iM2689 = (m2689() - this.f3927) - this.f3923.f4148[i3];
                }
            }
            iM2689 = iM2683 + i2;
        }
        return i > i2 && i < iM2689;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        p160.C8376.m13331("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2685(int i, InterfaceC7383 interfaceC7383) {
        int i2;
        int i3;
        int i4;
        InterfaceC7383 interfaceC73832 = interfaceC7383;
        int iM2672 = m2672(this.f3913, i);
        int iM2690 = m2690();
        int iM2683 = m2683(i) + i;
        int i5 = i;
        C1092 c1092 = null;
        C1094 c1094 = null;
        loop0: while (i5 < iM2683) {
            int iM2673 = m2673(i5);
            int i6 = i5 + 1;
            int iM26732 = m2673(i6);
            while (iM2673 < iM26732) {
                Object obj = this.f3912[m2691(iM2673)];
                if (obj instanceof C2155) {
                    C2155 c2155 = (C2155) obj;
                    if (!(c2155 instanceof C2155)) {
                        c2155 = null;
                    }
                    if (c2155 == null) {
                        AbstractC2209.m3066("Inconsistent composition");
                        C5043.m9161();
                        return;
                    }
                    int i7 = c2155.f4168;
                    if (i7 >= 0) {
                        int iM26832 = m2683(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iM26832 && i9 < i7) {
                            int iM2688 = m2688(i8);
                            int i10 = iM2672;
                            int[] iArr = this.f3913;
                            int i11 = iM2688 * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iM26832 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iM2672 = i10;
                        }
                        i4 = iM2672;
                        if (c1092 == null) {
                            int[] iArr2 = AbstractC1121.f1324;
                            c1092 = new C1092();
                        }
                        if (c1094 == null) {
                            c1094 = new C1094();
                        }
                        c1092.m1345(i8);
                        c1094.m1355(i8);
                        c1094.m1355(iM2673);
                    } else {
                        i4 = iM2672;
                        interfaceC73832.invoke(Integer.valueOf(iM2673), obj);
                    }
                }
                iM2673++;
                iM2672 = i4;
            }
            int i12 = iM2672;
            iM2672 = i6 < iM2690 ? m2672(this.f3913, i6) : -1;
            if (iM2672 != i5) {
                int iM26722 = i12;
                while (true) {
                    if (c1094 == null || c1092 == null || !c1092.m1341(i5)) {
                        i2 = iM2690;
                    } else {
                        int i13 = c1094.f1330;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iM2690;
                            int iM1416 = c1094.m1416(i17);
                            if (iM1416 == i5) {
                                int iM14162 = c1094.m1416(i17 + 1);
                                interfaceC73832.invoke(Integer.valueOf(iM14162), this.f3912[m2691(iM14162)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                c1094.m1352(i16, iM1416);
                                i16 += 2;
                                c1094.m1352(i19, c1094.m1416(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            interfaceC73832 = interfaceC7383;
                            iM2690 = i18;
                        }
                        i2 = iM2690;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = c1094.f1330) || i13 < 0 || i13 > i3) {
                                break loop0;
                            }
                            if (i13 < i16) {
                                C6755.m11869("The end index must be < start index");
                                return;
                            } else if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = c1094.f1331;
                                    AbstractC5179.m9395(i16, i13, i3, iArr3, iArr3);
                                }
                                c1094.f1330 -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iM26722 == iM2672) {
                        break;
                    }
                    i5 = iM26722;
                    iM2690 = i2;
                    iM26722 = m2672(this.f3913, iM26722);
                    interfaceC73832 = interfaceC7383;
                }
            } else {
                i2 = iM2690;
            }
            interfaceC73832 = interfaceC7383;
            i5 = i6;
            iM2690 = i2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2686(int i, int i2, int i3) {
        if (i >= this.f3928) {
            i = -((m2690() - i) + 2);
        }
        while (i3 < i2) {
            this.f3913[(m2688(i3) * 5) + 2] = i;
            int i4 = this.f3913[(m2688(i3) * 5) + 3] + i3;
            m2686(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object m2687(int i) {
        int iM2688 = m2688(i);
        int[] iArr = this.f3913;
        int i2 = (iM2688 * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C2204.f4319;
        }
        return this.f3912[Integer.bitCount(iArr[i2] >> 29) + m2692(iArr, iM2688)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m2688(int i) {
        return (this.f3927 * (i < this.f3928 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m2689() {
        return this.f3913.length / 5;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int m2690() {
        return m2689() - this.f3927;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m2691(int i) {
        return (this.f3930 * (i < this.f3929 ? 0 : 1)) + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m2692(int[] iArr, int i) {
        if (i >= m2689()) {
            return this.f3912.length - this.f3930;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f3912.length - this.f3930) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2693() {
        if (this.f3921 <= 0) {
            AbstractC2227.m3097("Unbalanced begin/end insert");
        }
        int i = this.f3921 - 1;
        this.f3921 = i;
        if (i == 0) {
            if (this.f3924.f4147 != this.f3926.f4147) {
                AbstractC2209.m3067("startGroup/endGroup mismatch while inserting");
            }
            this.f3919 = (m2689() - this.f3927) - this.f3923.m2868();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m2694(int i) {
        boolean z = false;
        if (!(this.f3921 <= 0)) {
            AbstractC2209.m3067("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.f3920;
        if (i2 != i) {
            if (i >= i2 && i < this.f3919) {
                z = true;
            }
            if (!z) {
                AbstractC2209.m3067("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.f3915;
            int i4 = this.f3931;
            int i5 = this.f3932;
            this.f3915 = i;
            m2657();
            this.f3915 = i3;
            this.f3931 = i4;
            this.f3932 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2695() {
        C1091 c1091;
        boolean z = this.f3921 > 0;
        int i = this.f3915;
        int i2 = this.f3919;
        int i3 = this.f3920;
        int iM2688 = m2688(i3);
        int i4 = this.f3925;
        int i5 = i - i3;
        int i6 = iM2688 * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.f3913[i7] & 1073741824) != 0;
        C2145 c2145 = this.f3924;
        if (z) {
            C1093 c1093 = this.f3916;
            if (c1093 != null && (c1091 = (C1091) c1093.m1393(i3)) != null) {
                Object[] objArr = c1091.f1350;
                int i8 = c1091.f1349;
                for (int i9 = 0; i9 < i8; i9++) {
                    m2671(objArr[i9]);
                }
            }
            int[] iArr = this.f3913;
            iArr[i6 + 3] = i5;
            AbstractC2073.m2699(iArr, iM2688, i4);
            int iM2868 = c2145.m2868();
            if (z2) {
                i4 = 1;
            }
            this.f3925 = iM2868 + i4;
            int iM2672 = m2672(this.f3913, i3);
            this.f3920 = iM2672;
            int iM2690 = iM2672 < 0 ? m2690() : m2688(iM2672 + 1);
            int iM2692 = iM2690 >= 0 ? m2692(this.f3913, iM2690) : 0;
            this.f3931 = iM2692;
            this.f3932 = iM2692;
            return;
        }
        if (i != i2) {
            AbstractC2209.m3067("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f3913;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        AbstractC2073.m2699(iArr2, iM2688, i4);
        int iM28682 = this.f3926.m2868();
        this.f3919 = (m2689() - this.f3927) - this.f3923.m2868();
        this.f3920 = iM28682;
        int iM26722 = m2672(this.f3913, i3);
        int iM28683 = c2145.m2868();
        this.f3925 = iM28683;
        if (iM26722 == iM28682) {
            this.f3925 = iM28683 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iM26722 != 0 && iM26722 != iM28682 && (i14 != 0 || i13 != 0)) {
                int iM26882 = m2688(iM26722);
                if (i13 != 0) {
                    int[] iArr3 = this.f3913;
                    int i15 = (iM26882 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.f3913;
                    AbstractC2073.m2699(iArr4, iM26882, (iArr4[(iM26882 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.f3913;
                if ((iArr5[(iM26882 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iM26722 = m2672(iArr5, iM26722);
            }
        }
        this.f3925 += i14;
    }
}
