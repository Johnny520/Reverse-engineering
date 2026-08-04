package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import yyds.AbstractC0319;
import yyds.AbstractC0353;
import yyds.AbstractC1640;
import yyds.AbstractC2551;
import yyds.C0053;
import yyds.C0119;
import yyds.C0134;
import yyds.C0188;
import yyds.C0265;
import yyds.C0618;
import yyds.C0769;
import yyds.C1042;
import yyds.C1213;
import yyds.C1281;
import yyds.C1573;
import yyds.C2347;
import yyds.C2526;
import yyds.C2540;
import yyds.C2637;
import yyds.C2808;
import yyds.InterfaceC1180;
import yyds.RunnableC0871;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC2551 implements InterfaceC1180 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final int f345;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final RunnableC0871 f346;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public int[] f347;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final int f350;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final AbstractC0353 f351;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public boolean f353;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final C1281[] f354;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final C0769 f355;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public int f356;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final Rect f357;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final C0119 f358;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final C1573 f359;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public boolean f360;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public boolean f361;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final AbstractC0353 f362;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public C0265 f363;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final int f364;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final boolean f365;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final BitSet f366;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public boolean f349 = false;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public int f352 = -1;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public int f348 = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f364 = -1;
        this.f353 = false;
        C0119 c0119 = new C0119(11);
        this.f358 = c0119;
        this.f345 = 2;
        this.f357 = new Rect();
        this.f359 = new C1573(this);
        this.f365 = true;
        this.f346 = new RunnableC0871(15, this);
        C2540 c2540M4595 = AbstractC2551.m4595(context, attributeSet, i, i2);
        int i3 = c2540M4595.f12518;
        if (i3 != 0 && i3 != 1) {
            C0188.m798("invalid orientation.");
            throw null;
        }
        mo196(null);
        if (i3 != this.f350) {
            this.f350 = i3;
            AbstractC0353 abstractC0353 = this.f351;
            this.f351 = this.f362;
            this.f362 = abstractC0353;
            m4605();
        }
        int i4 = c2540M4595.f12519;
        mo196(null);
        if (i4 != this.f364) {
            c0119.m541();
            m4605();
            this.f364 = i4;
            this.f366 = new BitSet(this.f364);
            this.f354 = new C1281[this.f364];
            for (int i5 = 0; i5 < this.f364; i5++) {
                this.f354[i5] = new C1281(this, i5);
            }
            m4605();
        }
        boolean z = c2540M4595.f12520;
        mo196(null);
        C0265 c0265 = this.f363;
        if (c0265 != null && c0265.f1459 != z) {
            c0265.f1459 = z;
        }
        this.f353 = z;
        m4605();
        C0769 c0769 = new C0769();
        c0769.f3553 = true;
        c0769.f3557 = 0;
        c0769.f3555 = 0;
        this.f355 = c0769;
        this.f351 = AbstractC0353.m1035(this, this.f350);
        this.f362 = AbstractC0353.m1035(this, 1 - this.f350);
    }

    /* JADX INFO: renamed from: ᲀᛱᲁᲁ, reason: contains not printable characters */
    public static int m212(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX INFO: renamed from: ᛱᛱᛸᛷ, reason: contains not printable characters */
    public final void m213(C2808 c2808, int i) {
        for (int iM4613 = m4613() - 1; iM4613 >= 0; iM4613--) {
            View viewM4614 = m4614(iM4613);
            AbstractC0353 abstractC0353 = this.f351;
            if (abstractC0353.mo1046(viewM4614) < i || abstractC0353.mo1054(viewM4614) < i) {
                return;
            }
            C1042 c1042 = (C1042) viewM4614.getLayoutParams();
            c1042.getClass();
            if (((ArrayList) c1042.f4740.f5888).size() == 1) {
                return;
            }
            C1281 c1281 = c1042.f4740;
            ArrayList arrayList = (ArrayList) c1281.f5888;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C1042 c10422 = (C1042) view.getLayoutParams();
            c10422.f4740 = null;
            if (c10422.f12448.m774() || c10422.f12448.m782()) {
                c1281.f5889 -= ((StaggeredGridLayoutManager) c1281.f5886).f351.mo1040(view);
            }
            if (size == 1) {
                c1281.f5885 = Integer.MIN_VALUE;
            }
            c1281.f5887 = Integer.MIN_VALUE;
            m4627(viewM4614, c2808);
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final int mo128(C2637 c2637) {
        return m235(c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛵᛳᛳ */
    public final int mo129(int i, C2808 c2808, C2637 c2637) {
        return m238(i, c2808, c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᛸᲁᲇ */
    public final int mo130(C2808 c2808, C2637 c2637) {
        if (this.f350 == 0) {
            return Math.min(this.f364, c2637.m4742());
        }
        return -1;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final void mo214() {
        this.f358.m541();
        for (int i = 0; i < this.f364; i++) {
            this.f354[i].m2553();
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo171(int i, int i2, C2637 c2637, C2347 c2347) {
        C0769 c0769;
        int iM2550;
        if (this.f350 != 0) {
            i = i2;
        }
        if (m4613() == 0 || i == 0) {
            return;
        }
        m242(i, c2637);
        int[] iArr = this.f347;
        int i3 = this.f364;
        if (iArr == null || iArr.length < i3) {
            this.f347 = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            c0769 = this.f355;
            if (i4 >= i3) {
                break;
            }
            int i6 = c0769.f3558;
            C1281[] c1281Arr = this.f354;
            if (i6 == -1) {
                int i7 = c0769.f3557;
                iM2550 = i7 - c1281Arr[i4].m2555(i7);
            } else {
                iM2550 = c1281Arr[i4].m2550(c0769.f3555) - c0769.f3555;
            }
            if (iM2550 >= 0) {
                this.f347[i5] = iM2550;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.f347, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = c0769.f3556;
            if (i9 < 0 || i9 >= c2637.m4742()) {
                return;
            }
            c2347.m4361(c0769.f3556, this.f347[i8]);
            c0769.f3556 += c0769.f3558;
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛱᛵᛱ */
    public final boolean mo133() {
        return this.f363 == null;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final int mo172(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        boolean z = !this.f365;
        return AbstractC0319.m991(c2637, this.f351, m230(z), m220(z), this, this.f365);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛳᛵᛱ */
    public final void mo135(int i, int i2) {
        m217(i, i2, 2);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo174() {
        return this.f350 == 1;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ */
    public final int mo136(C2808 c2808, C2637 c2637) {
        if (this.f350 == 1) {
            return Math.min(this.f364, c2637.m4742());
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛲᛶᛵᛲ, reason: contains not printable characters */
    public final boolean m215(int i) {
        if (this.f350 == 0) {
            return (i == -1) != this.f349;
        }
        return ((i == -1) == this.f349) == m222();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public final void mo216(int i) {
        super.mo216(i);
        for (int i2 = 0; i2 < this.f364; i2++) {
            C1281 c1281 = this.f354[i2];
            int i3 = c1281.f5885;
            if (i3 != Integer.MIN_VALUE) {
                c1281.f5885 = i3 + i;
            }
            int i4 = c1281.f5887;
            if (i4 != Integer.MIN_VALUE) {
                c1281.f5887 = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ᛲᲁᛲᛸ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m217(int i, int i2, int i3) {
        int i4;
        int i5;
        C0119 c0119;
        int[] iArr;
        ArrayList arrayList;
        C0618 c0618;
        int i6;
        int iM226 = this.f349 ? m226() : m228();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                c0119 = this.f358;
                iArr = (int[]) c0119.f812;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) c0119.f810;
                    if (arrayList != null) {
                        i6 = -1;
                        int[] iArr2 = (int[]) c0119.f812;
                        if (i6 != -1) {
                            Arrays.fill(iArr2, i5, iArr2.length, -1);
                            int length = ((int[]) c0119.f812).length;
                        } else {
                            Arrays.fill((int[]) c0119.f812, i5, Math.min(i6 + 1, iArr2.length), -1);
                        }
                    } else {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                c0618 = null;
                                break;
                            }
                            c0618 = (C0618) ((ArrayList) c0119.f810).get(size);
                            if (c0618.f2986 == i5) {
                                break;
                            } else {
                                size--;
                            }
                        }
                        if (c0618 != null) {
                            ((ArrayList) c0119.f810).remove(c0618);
                        }
                        int size2 = ((ArrayList) c0119.f810).size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                i7 = -1;
                                break;
                            } else if (((C0618) ((ArrayList) c0119.f810).get(i7)).f2986 >= i5) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (i7 != -1) {
                            C0618 c06182 = (C0618) ((ArrayList) c0119.f810).get(i7);
                            ((ArrayList) c0119.f810).remove(i7);
                            i6 = c06182.f2986;
                        }
                        int[] iArr22 = (int[]) c0119.f812;
                        if (i6 != -1) {
                        }
                    }
                }
                if (i3 != 1) {
                    c0119.m544(i, i2);
                } else if (i3 == 2) {
                    c0119.m563(i, i2);
                } else if (i3 == 8) {
                    c0119.m563(i, 1);
                    c0119.m544(i2, 1);
                }
                if (i4 > iM226) {
                    return;
                }
                if (i5 <= (this.f349 ? m228() : m226())) {
                    m4605();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        c0119 = this.f358;
        iArr = (int[]) c0119.f812;
        if (iArr != null) {
            arrayList = (ArrayList) c0119.f810;
            if (arrayList != null) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > iM226) {
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲀᛲ, reason: contains not printable characters */
    public final void m218(C2808 c2808, C0769 c0769) {
        if (!c0769.f3553 || c0769.f3551) {
            return;
        }
        int i = c0769.f3554;
        int i2 = c0769.f3552;
        if (i == 0) {
            if (i2 == -1) {
                m213(c2808, c0769.f3555);
                return;
            } else {
                m234(c2808, c0769.f3557);
                return;
            }
        }
        int i3 = this.f364;
        C1281[] c1281Arr = this.f354;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = c0769.f3557;
            int iM2555 = c1281Arr[0].m2555(i5);
            while (i4 < i3) {
                int iM25552 = c1281Arr[i4].m2555(i5);
                if (iM25552 > iM2555) {
                    iM2555 = iM25552;
                }
                i4++;
            }
            int i6 = i5 - iM2555;
            int iMin = c0769.f3555;
            if (i6 >= 0) {
                iMin -= Math.min(i6, c0769.f3554);
            }
            m213(c2808, iMin);
            return;
        }
        int i7 = c0769.f3555;
        int iM2550 = c1281Arr[0].m2550(i7);
        while (i4 < i3) {
            int iM25502 = c1281Arr[i4].m2550(i7);
            if (iM25502 < iM2550) {
                iM2550 = iM25502;
            }
            i4++;
        }
        int i8 = iM2550 - c0769.f3555;
        int iMin2 = c0769.f3557;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, c0769.f3554);
        }
        m234(c2808, iMin2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // yyds.InterfaceC1180
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF mo176(int i) {
        int i2 = -1;
        if (m4613() != 0) {
            if ((i < m228()) == this.f349) {
            }
        } else if (this.f349) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f350 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e8  */
    /* JADX INFO: renamed from: ᛲᲈᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m219(C2808 c2808, C2637 c2637, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        C0265 c0265;
        int iM4603;
        boolean z4;
        int i2;
        boolean z5;
        C0265 c02652 = this.f363;
        C1573 c1573 = this.f359;
        if (!(c02652 == null && this.f352 == -1) && c2637.m4742() == 0) {
            m4607(c2808);
            c1573.m3216();
            return;
        }
        boolean z6 = c1573.f7971;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c1573.f7974;
        boolean z7 = (z6 && this.f352 == -1 && this.f363 == null) ? false : true;
        C1281[] c1281Arr = this.f354;
        int i3 = this.f364;
        C0119 c0119 = this.f358;
        if (z7) {
            c1573.m3216();
            C0265 c02653 = this.f363;
            AbstractC0353 abstractC0353 = this.f351;
            if (c02653 != null) {
                int i4 = c02653.f1455;
                if (i4 > 0) {
                    if (i4 == i3) {
                        for (int i5 = 0; i5 < i3; i5++) {
                            c1281Arr[i5].m2553();
                            C0265 c02654 = this.f363;
                            int iMo1039 = c02654.f1461[i5];
                            if (iMo1039 != Integer.MIN_VALUE) {
                                iMo1039 += c02654.f1457 ? abstractC0353.mo1039() : abstractC0353.mo1038();
                            }
                            C1281 c1281 = c1281Arr[i5];
                            c1281.f5885 = iMo1039;
                            c1281.f5887 = iMo1039;
                        }
                    } else {
                        c02653.f1461 = null;
                        c02653.f1455 = 0;
                        c02653.f1456 = 0;
                        c02653.f1453 = null;
                        c02653.f1454 = null;
                        c02653.f1460 = c02653.f1462;
                    }
                }
                C0265 c02655 = this.f363;
                this.f361 = c02655.f1458;
                boolean z8 = c02655.f1459;
                mo196(null);
                C0265 c02656 = this.f363;
                if (c02656 != null && c02656.f1459 != z8) {
                    c02656.f1459 = z8;
                }
                this.f353 = z8;
                m4605();
                m224();
                C0265 c02657 = this.f363;
                int i6 = c02657.f1460;
                if (i6 != -1) {
                    this.f352 = i6;
                    c1573.f7975 = c02657.f1457;
                } else {
                    c1573.f7975 = this.f349;
                }
                if (c02657.f1456 > 1) {
                    c0119.f812 = c02657.f1453;
                    c0119.f810 = c02657.f1454;
                }
            } else {
                m224();
                c1573.f7975 = this.f349;
            }
            if (c2637.f12977 || (i2 = this.f352) == -1) {
                if (this.f360) {
                    int iM4742 = c2637.m4742();
                    int iM4613 = m4613();
                    for (int i7 = 0; i7 < iM4613; i7++) {
                        int iM46032 = AbstractC2551.m4603(m4614(i7));
                        if (iM46032 >= 0 && iM46032 < iM4742) {
                            iM4603 = iM46032;
                            break;
                        }
                    }
                    iM4603 = 0;
                    c1573.f7972 = iM4603;
                    c1573.f7973 = Integer.MIN_VALUE;
                    z4 = true;
                    c1573.f7971 = z4;
                } else {
                    int iM47422 = c2637.m4742();
                    for (int iM46132 = m4613() - 1; iM46132 >= 0; iM46132--) {
                        iM4603 = AbstractC2551.m4603(m4614(iM46132));
                        if (iM4603 >= 0 && iM4603 < iM47422) {
                            break;
                        }
                    }
                    iM4603 = 0;
                    c1573.f7972 = iM4603;
                    c1573.f7973 = Integer.MIN_VALUE;
                    z4 = true;
                    c1573.f7971 = z4;
                }
            } else if (i2 < 0 || i2 >= c2637.m4742()) {
                this.f352 = -1;
                this.f348 = Integer.MIN_VALUE;
                if (this.f360) {
                }
            } else {
                C0265 c02658 = this.f363;
                if (c02658 == null || c02658.f1460 == -1 || c02658.f1455 < 1) {
                    View viewMo187 = mo187(this.f352);
                    if (viewMo187 != null) {
                        c1573.f7972 = this.f349 ? m226() : m228();
                        if (this.f348 != Integer.MIN_VALUE) {
                            if (c1573.f7975) {
                                c1573.f7973 = (abstractC0353.mo1039() - this.f348) - abstractC0353.mo1056(viewMo187);
                            } else {
                                c1573.f7973 = (abstractC0353.mo1038() + this.f348) - abstractC0353.mo1046(viewMo187);
                            }
                        } else if (abstractC0353.mo1040(viewMo187) > abstractC0353.mo1036()) {
                            c1573.f7973 = c1573.f7975 ? abstractC0353.mo1039() : abstractC0353.mo1038();
                        } else {
                            int iMo1046 = abstractC0353.mo1046(viewMo187) - abstractC0353.mo1038();
                            if (iMo1046 < 0) {
                                c1573.f7973 = -iMo1046;
                            } else {
                                int iMo10392 = abstractC0353.mo1039() - abstractC0353.mo1056(viewMo187);
                                if (iMo10392 < 0) {
                                    c1573.f7973 = iMo10392;
                                } else {
                                    c1573.f7973 = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i8 = this.f352;
                        c1573.f7972 = i8;
                        int i9 = this.f348;
                        if (i9 == Integer.MIN_VALUE) {
                            if (m4613() == 0) {
                                z5 = this.f349;
                            } else if ((i8 < m228()) != this.f349) {
                            }
                            c1573.f7975 = z5;
                            AbstractC0353 abstractC03532 = staggeredGridLayoutManager.f351;
                            c1573.f7973 = z5 ? abstractC03532.mo1039() : abstractC03532.mo1038();
                        } else {
                            boolean z9 = c1573.f7975;
                            AbstractC0353 abstractC03533 = staggeredGridLayoutManager.f351;
                            if (z9) {
                                c1573.f7973 = abstractC03533.mo1039() - i9;
                            } else {
                                c1573.f7973 = abstractC03533.mo1038() + i9;
                            }
                        }
                        z4 = true;
                        c1573.f7977 = true;
                        c1573.f7971 = z4;
                    }
                } else {
                    c1573.f7973 = Integer.MIN_VALUE;
                    c1573.f7972 = this.f352;
                }
                z4 = true;
                c1573.f7971 = z4;
            }
        }
        if (this.f363 == null && this.f352 == -1 && !(c1573.f7975 == this.f360 && m222() == this.f361)) {
            c0119.m541();
            i = 1;
            c1573.f7977 = true;
        } else {
            i = 1;
        }
        if (m4613() > 0 && ((c0265 = this.f363) == null || c0265.f1455 < i)) {
            if (c1573.f7977) {
                for (int i10 = 0; i10 < i3; i10++) {
                    c1281Arr[i10].m2553();
                    int i11 = c1573.f7973;
                    if (i11 != Integer.MIN_VALUE) {
                        C1281 c12812 = c1281Arr[i10];
                        c12812.f5885 = i11;
                        c12812.f5887 = i11;
                    }
                }
            } else if (z7 || c1573.f7976 == null) {
                for (int i12 = 0; i12 < i3; i12++) {
                    C1281 c12813 = c1281Arr[i12];
                    boolean z10 = this.f349;
                    int i13 = c1573.f7973;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c12813.f5886;
                    int iM2550 = z10 ? c12813.m2550(Integer.MIN_VALUE) : c12813.m2555(Integer.MIN_VALUE);
                    c12813.m2553();
                    if (iM2550 != Integer.MIN_VALUE && ((!z10 || iM2550 >= staggeredGridLayoutManager2.f351.mo1039()) && (z10 || iM2550 <= staggeredGridLayoutManager2.f351.mo1038()))) {
                        if (i13 != Integer.MIN_VALUE) {
                            iM2550 += i13;
                        }
                        c12813.f5887 = iM2550;
                        c12813.f5885 = iM2550;
                    }
                }
                int length = c1281Arr.length;
                int[] iArr = c1573.f7976;
                if (iArr == null || iArr.length < length) {
                    c1573.f7976 = new int[staggeredGridLayoutManager.f354.length];
                }
                for (int i14 = 0; i14 < length; i14++) {
                    c1573.f7976[i14] = c1281Arr[i14].m2555(Integer.MIN_VALUE);
                }
            } else {
                for (int i15 = 0; i15 < i3; i15++) {
                    C1281 c12814 = c1281Arr[i15];
                    c12814.m2553();
                    int i16 = c1573.f7976[i15];
                    c12814.f5885 = i16;
                    c12814.f5887 = i16;
                }
            }
        }
        m4626(c2808);
        C0769 c0769 = this.f355;
        c0769.f3553 = false;
        AbstractC0353 abstractC03534 = this.f362;
        int iMo1036 = abstractC03534.mo1036();
        this.f356 = iMo1036 / i3;
        View.MeasureSpec.makeMeasureSpec(iMo1036, abstractC03534.mo1049());
        m240(c1573.f7972, c2637);
        if (c1573.f7975) {
            m232(-1);
            m233(c2808, c0769, c2637);
            m232(1);
            c0769.f3556 = c1573.f7972 + c0769.f3558;
            m233(c2808, c0769, c2637);
        } else {
            m232(1);
            m233(c2808, c0769, c2637);
            m232(-1);
            c0769.f3556 = c1573.f7972 + c0769.f3558;
            m233(c2808, c0769, c2637);
        }
        if (abstractC03534.mo1049() != 1073741824) {
            int iM46133 = m4613();
            float fMax = 0.0f;
            for (int i17 = 0; i17 < iM46133; i17++) {
                View viewM4614 = m4614(i17);
                float fMo1040 = abstractC03534.mo1040(viewM4614);
                if (fMo1040 >= fMax) {
                    ((C1042) viewM4614.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo1040);
                }
            }
            int i18 = this.f356;
            int iRound = Math.round(fMax * i3);
            if (abstractC03534.mo1049() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, abstractC03534.mo1036());
            }
            this.f356 = iRound / i3;
            View.MeasureSpec.makeMeasureSpec(iRound, abstractC03534.mo1049());
            if (this.f356 != i18) {
                for (int i19 = 0; i19 < iM46133; i19++) {
                    View viewM46142 = m4614(i19);
                    C1042 c1042 = (C1042) viewM46142.getLayoutParams();
                    c1042.getClass();
                    boolean zM222 = m222();
                    int i20 = this.f350;
                    if (zM222 && i20 == 1) {
                        int i21 = -((i3 - 1) - c1042.f4740.f5883);
                        viewM46142.offsetLeftAndRight((this.f356 * i21) - (i21 * i18));
                    } else {
                        int i22 = c1042.f4740.f5883;
                        int i23 = this.f356 * i22;
                        int i24 = i22 * i18;
                        if (i20 == 1) {
                            viewM46142.offsetLeftAndRight(i23 - i24);
                        } else {
                            viewM46142.offsetTopAndBottom(i23 - i24);
                        }
                    }
                }
            }
        }
        if (m4613() <= 0) {
            z2 = true;
        } else if (this.f349) {
            z2 = true;
            m239(c2808, c2637, true);
            m223(c2808, c2637, false);
        } else {
            z2 = true;
            m223(c2808, c2637, true);
            m239(c2808, c2637, false);
        }
        if (!z || c2637.f12977 || this.f345 == 0 || m4613() <= 0 || m237() == null) {
            z3 = false;
        } else {
            C1213 c1213 = this.f12600;
            if (c1213 != null) {
                c1213.removeCallbacks(this.f346);
            }
            if (m225()) {
                z3 = z2;
            }
        }
        if (c2637.f12977) {
            c1573.m3216();
        }
        this.f360 = c1573.f7975;
        this.f361 = m222();
        if (z3) {
            c1573.m3216();
            m219(c2808, c2637, false);
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᛴᲇᛶ */
    public final void mo141(C2808 c2808, C2637 c2637, View view, C0134 c0134) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0134.f833;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1042)) {
            m4610(view, c0134);
            return;
        }
        C1281 c1281 = ((C1042) layoutParams).f4740;
        if (this.f350 == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c1281 != null ? c1281.f5883 : -1, 1, -1, -1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(-1, -1, c1281 != null ? c1281.f5883 : -1, 1, false, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᛷᛶᛲ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo142(View view, int i, C2808 c2808, C2637 c2637) {
        View viewM2458;
        int i2;
        if (m4613() != 0) {
            C1213 c1213 = this.f12600;
            if (c1213 == null || (viewM2458 = c1213.m2458(view)) == null || ((ArrayList) this.f12598.f13647).contains(viewM2458)) {
                viewM2458 = null;
            }
            if (viewM2458 != null) {
                m224();
                int i3 = this.f350;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 != 0) {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && m222()) {
                    }
                } else if (i3 != 1 && m222()) {
                }
                if (i2 != Integer.MIN_VALUE) {
                    C1042 c1042 = (C1042) viewM2458.getLayoutParams();
                    c1042.getClass();
                    C1281 c1281 = c1042.f4740;
                    int iM226 = i2 == 1 ? m226() : m228();
                    m240(iM226, c2637);
                    m232(i2);
                    C0769 c0769 = this.f355;
                    c0769.f3556 = c0769.f3558 + iM226;
                    c0769.f3554 = (int) (this.f351.mo1036() * 0.33333334f);
                    c0769.f3550 = true;
                    c0769.f3553 = false;
                    m233(c2808, c0769, c2637);
                    this.f360 = this.f349;
                    View viewM2557 = c1281.m2557(iM226, i2);
                    if (viewM2557 != null && viewM2557 != viewM2458) {
                        return viewM2557;
                    }
                    boolean zM215 = m215(i2);
                    C1281[] c1281Arr = this.f354;
                    int i4 = this.f364;
                    if (zM215) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewM25572 = c1281Arr[i5].m2557(iM226, i2);
                            if (viewM25572 != null && viewM25572 != viewM2458) {
                                return viewM25572;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewM25573 = c1281Arr[i6].m2557(iM226, i2);
                            if (viewM25573 != null && viewM25573 != viewM2458) {
                                return viewM25573;
                            }
                        }
                    }
                    boolean z = (this.f353 ^ true) == (i2 == -1);
                    View viewMo187 = mo187(z ? c1281.m2551() : c1281.m2558());
                    if (viewMo187 != null && viewMo187 != viewM2458) {
                        return viewMo187;
                    }
                    if (m215(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != c1281.f5883) {
                                View viewMo1872 = mo187(z ? c1281Arr[i7].m2551() : c1281Arr[i7].m2558());
                                if (viewMo1872 != null && viewMo1872 != viewM2458) {
                                    return viewMo1872;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewMo1873 = mo187(z ? c1281Arr[i8].m2551() : c1281Arr[i8].m2558());
                            if (viewMo1873 != null && viewMo1873 != viewM2458) {
                                return viewMo1873;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛵ, reason: contains not printable characters */
    public final View m220(boolean z) {
        AbstractC0353 abstractC0353 = this.f351;
        int iMo1038 = abstractC0353.mo1038();
        int iMo1039 = abstractC0353.mo1039();
        View view = null;
        for (int iM4613 = m4613() - 1; iM4613 >= 0; iM4613--) {
            View viewM4614 = m4614(iM4613);
            int iMo1046 = abstractC0353.mo1046(viewM4614);
            int iMo1056 = abstractC0353.mo1056(viewM4614);
            if (iMo1056 > iMo1038 && iMo1046 < iMo1039) {
                if (iMo1056 <= iMo1039 || !z) {
                    return viewM4614;
                }
                if (view == null) {
                    view = viewM4614;
                }
            }
        }
        return view;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public final C2526 mo143(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1042((ViewGroup.MarginLayoutParams) layoutParams) : new C1042(layoutParams);
    }

    /* JADX INFO: renamed from: ᛳᲁᲀᛷ, reason: contains not printable characters */
    public final void m221(View view, int i, int i2) {
        C1213 c1213 = this.f12600;
        Rect rect = this.f357;
        if (c1213 == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(c1213.m2450(view));
        }
        C1042 c1042 = (C1042) view.getLayoutParams();
        int iM212 = m212(i, ((ViewGroup.MarginLayoutParams) c1042).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1042).rightMargin + rect.right);
        int iM2122 = m212(i2, ((ViewGroup.MarginLayoutParams) c1042).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1042).bottomMargin + rect.bottom);
        if (m4622(view, iM212, iM2122, c1042)) {
            view.measure(iM212, iM2122);
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final int mo144(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        boolean z = !this.f365;
        return AbstractC0319.m980(c2637, this.f351, m230(z), m220(z), this, this.f365);
    }

    /* JADX INFO: renamed from: ᛴᛶᛳᛸ, reason: contains not printable characters */
    public final boolean m222() {
        return this.f12600.getLayoutDirection() == 1;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛴᛸᛴᛸ */
    public final void mo181(AccessibilityEvent accessibilityEvent) {
        super.mo181(accessibilityEvent);
        if (m4613() > 0) {
            View viewM230 = m230(false);
            View viewM220 = m220(false);
            if (viewM230 == null || viewM220 == null) {
                return;
            }
            int iM4603 = AbstractC2551.m4603(viewM230);
            int iM46032 = AbstractC2551.m4603(viewM220);
            if (iM4603 < iM46032) {
                accessibilityEvent.setFromIndex(iM4603);
                accessibilityEvent.setToIndex(iM46032);
            } else {
                accessibilityEvent.setFromIndex(iM46032);
                accessibilityEvent.setToIndex(iM4603);
            }
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛴᛸᲁᛵ */
    public final void mo147(int i, int i2) {
        m217(i, i2, 4);
    }

    /* JADX INFO: renamed from: ᛴᲇᛵᛸ, reason: contains not printable characters */
    public final void m223(C2808 c2808, C2637 c2637, boolean z) {
        int iMo1038;
        int iM236 = m236(Integer.MAX_VALUE);
        if (iM236 != Integer.MAX_VALUE && (iMo1038 = iM236 - this.f351.mo1038()) > 0) {
            int iM238 = iMo1038 - m238(iMo1038, c2808, c2637);
            if (!z || iM238 <= 0) {
                return;
            }
            this.f351.mo1045(-iM238);
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᛲᛵᲁ */
    public final void mo149() {
        this.f358.m541();
        m4605();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᛵᛷᲀ */
    public final void mo183(int i) {
        C0265 c0265 = this.f363;
        if (c0265 != null && c0265.f1460 != i) {
            c0265.f1461 = null;
            c0265.f1455 = 0;
            c0265.f1460 = -1;
            c0265.f1462 = -1;
        }
        this.f352 = i;
        this.f348 = Integer.MIN_VALUE;
        m4605();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public final C2526 mo150() {
        return this.f350 == 0 ? new C1042(-2, -1) : new C1042(-1, -2);
    }

    /* JADX INFO: renamed from: ᛵᛶᛸᲇ, reason: contains not printable characters */
    public final void m224() {
        if (this.f350 == 1 || !m222()) {
            this.f349 = this.f353;
        } else {
            this.f349 = !this.f353;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᲈᛷ, reason: contains not printable characters */
    public final boolean m225() {
        int iM228;
        if (m4613() != 0 && this.f345 != 0 && this.f12601) {
            if (this.f349) {
                iM228 = m226();
                m228();
            } else {
                iM228 = m228();
                m226();
            }
            if (iM228 == 0 && m237() != null) {
                this.f358.m541();
                this.f12606 = true;
                m4605();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᲁᛴᛴ, reason: contains not printable characters */
    public final int m226() {
        int iM4613 = m4613();
        if (iM4613 == 0) {
            return 0;
        }
        return AbstractC2551.m4603(m4614(iM4613 - 1));
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛵᲈᲇᛵ */
    public final void mo152(C2808 c2808, C2637 c2637, C0134 c0134) {
        super.mo152(c2808, c2637, c0134);
        c0134.f833.setClassName("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public final void mo227(int i) {
        super.mo227(i);
        for (int i2 = 0; i2 < this.f364; i2++) {
            C1281 c1281 = this.f354[i2];
            int i3 = c1281.f5885;
            if (i3 != Integer.MIN_VALUE) {
                c1281.f5885 = i3 + i;
            }
            int i4 = c1281.f5887;
            if (i4 != Integer.MIN_VALUE) {
                c1281.f5887 = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: ᛶᛴᛲᛸ, reason: contains not printable characters */
    public final int m228() {
        if (m4613() == 0) {
            return 0;
        }
        return AbstractC2551.m4603(m4614(0));
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᛵᛸᛳ */
    public final void mo189(C1213 c1213, int i) {
        C0053 c0053 = new C0053(c1213.getContext());
        c0053.f557 = i;
        m4612(c0053);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᛸᛱᲁ */
    public final void mo153(Rect rect, int i, int i2) {
        int iM4600;
        int iM46002;
        int iM4615 = m4615() + m4621();
        int iM4620 = m4620() + m4616();
        int i3 = this.f350;
        int i4 = this.f364;
        if (i3 == 1) {
            int iHeight = rect.height() + iM4620;
            C1213 c1213 = this.f12600;
            WeakHashMap weakHashMap = AbstractC1640.f8352;
            iM46002 = AbstractC2551.m4600(i2, iHeight, c1213.getMinimumHeight());
            iM4600 = AbstractC2551.m4600(i, (this.f356 * i4) + iM4615, this.f12600.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM4615;
            C1213 c12132 = this.f12600;
            WeakHashMap weakHashMap2 = AbstractC1640.f8352;
            iM4600 = AbstractC2551.m4600(i, iWidth, c12132.getMinimumWidth());
            iM46002 = AbstractC2551.m4600(i2, (this.f356 * i4) + iM4620, this.f12600.getMinimumHeight());
        }
        this.f12600.setMeasuredDimension(iM4600, iM46002);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛶᲀᲈᲇ */
    public final boolean mo190() {
        return this.f353;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final int mo154(C2637 c2637) {
        return m235(c2637);
    }

    /* JADX INFO: renamed from: ᛷᛴᛶᛳ, reason: contains not printable characters */
    public final int m229(int i) {
        int iM2550 = this.f354[0].m2550(i);
        for (int i2 = 1; i2 < this.f364; i2++) {
            int iM25502 = this.f354[i2].m2550(i);
            if (iM25502 > iM2550) {
                iM2550 = iM25502;
            }
        }
        return iM2550;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final int mo155(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        boolean z = !this.f365;
        return AbstractC0319.m980(c2637, this.f351, m230(z), m220(z), this, this.f365);
    }

    /* JADX INFO: renamed from: ᛷᛶᛱᛸ, reason: contains not printable characters */
    public final View m230(boolean z) {
        AbstractC0353 abstractC0353 = this.f351;
        int iMo1038 = abstractC0353.mo1038();
        int iMo1039 = abstractC0353.mo1039();
        int iM4613 = m4613();
        View view = null;
        for (int i = 0; i < iM4613; i++) {
            View viewM4614 = m4614(i);
            int iMo1046 = abstractC0353.mo1046(viewM4614);
            if (abstractC0353.mo1056(viewM4614) > iMo1038 && iMo1046 < iMo1039) {
                if (iMo1046 >= iMo1038 || !z) {
                    return viewM4614;
                }
                if (view == null) {
                    view = viewM4614;
                }
            }
        }
        return view;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᲈᛳᛲ */
    public final void mo157(C2808 c2808, C2637 c2637) {
        m219(c2808, c2637, true);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final int mo193(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        boolean z = !this.f365;
        return AbstractC0319.m991(c2637, this.f351, m230(z), m220(z), this, this.f365);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛸᲀᛷᛲ */
    public final void mo194(Parcelable parcelable) {
        if (parcelable instanceof C0265) {
            C0265 c0265 = (C0265) parcelable;
            this.f363 = c0265;
            if (this.f352 != -1) {
                c0265.f1460 = -1;
                c0265.f1462 = -1;
                c0265.f1461 = null;
                c0265.f1455 = 0;
                c0265.f1456 = 0;
                c0265.f1453 = null;
                c0265.f1454 = null;
            }
            m4605();
        }
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᛸᲇᛱᲇ */
    public final int mo159(int i, C2808 c2808, C2637 c2637) {
        return m238(i, c2808, c2637);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public final C2526 mo160(Context context, AttributeSet attributeSet) {
        return new C1042(context, attributeSet);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo196(String str) {
        C1213 c1213;
        if (this.f363 != null || (c1213 = this.f12600) == null) {
            return;
        }
        c1213.m2457(str);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲀᛳᛷᛷ, reason: contains not printable characters */
    public final void mo231(int i) {
        if (i == 0) {
            m225();
        }
    }

    /* JADX INFO: renamed from: ᲀᛴᛸᛷ, reason: contains not printable characters */
    public final void m232(int i) {
        C0769 c0769 = this.f355;
        c0769.f3552 = i;
        c0769.f3558 = this.f349 != (i == -1) ? -1 : 1;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲀᛸᲈᲁ */
    public final Parcelable mo198() {
        int iM2555;
        int iMo1038;
        int[] iArr;
        C0265 c0265 = this.f363;
        if (c0265 != null) {
            C0265 c02652 = new C0265();
            c02652.f1455 = c0265.f1455;
            c02652.f1460 = c0265.f1460;
            c02652.f1462 = c0265.f1462;
            c02652.f1461 = c0265.f1461;
            c02652.f1456 = c0265.f1456;
            c02652.f1453 = c0265.f1453;
            c02652.f1459 = c0265.f1459;
            c02652.f1457 = c0265.f1457;
            c02652.f1458 = c0265.f1458;
            c02652.f1454 = c0265.f1454;
            return c02652;
        }
        C0265 c02653 = new C0265();
        c02653.f1459 = this.f353;
        c02653.f1457 = this.f360;
        c02653.f1458 = this.f361;
        C0119 c0119 = this.f358;
        if (c0119 == null || (iArr = (int[]) c0119.f812) == null) {
            c02653.f1456 = 0;
        } else {
            c02653.f1453 = iArr;
            c02653.f1456 = iArr.length;
            c02653.f1454 = (ArrayList) c0119.f810;
        }
        if (m4613() <= 0) {
            c02653.f1460 = -1;
            c02653.f1462 = -1;
            c02653.f1455 = 0;
            return c02653;
        }
        c02653.f1460 = this.f360 ? m226() : m228();
        View viewM220 = this.f349 ? m220(true) : m230(true);
        c02653.f1462 = viewM220 != null ? AbstractC2551.m4603(viewM220) : -1;
        int i = this.f364;
        c02653.f1455 = i;
        c02653.f1461 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.f360;
            AbstractC0353 abstractC0353 = this.f351;
            C1281[] c1281Arr = this.f354;
            if (z) {
                iM2555 = c1281Arr[i2].m2550(Integer.MIN_VALUE);
                if (iM2555 != Integer.MIN_VALUE) {
                    iMo1038 = abstractC0353.mo1039();
                    iM2555 -= iMo1038;
                }
            } else {
                iM2555 = c1281Arr[i2].m2555(Integer.MIN_VALUE);
                if (iM2555 != Integer.MIN_VALUE) {
                    iMo1038 = abstractC0353.mo1038();
                    iM2555 -= iMo1038;
                }
            }
            c02653.f1461[i2] = iM2555;
        }
        return c02653;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲁᛵᲁᲁ */
    public final void mo199(C1213 c1213) {
        C1213 c12132 = this.f12600;
        if (c12132 != null) {
            c12132.removeCallbacks(this.f346);
        }
        for (int i = 0; i < this.f364; i++) {
            this.f354[i].m2553();
        }
        c1213.requestLayout();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲁᛶᛴᛸ */
    public final boolean mo200() {
        return this.f345 != 0;
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX INFO: renamed from: ᲁᛸᛲᲈ, reason: contains not printable characters */
    public final int m233(C2808 c2808, C0769 c0769, C2637 c2637) {
        int i;
        int i2;
        C1281[] c1281Arr;
        BitSet bitSet;
        int i3;
        C1281[] c1281Arr2;
        C1281 c1281;
        ?? r5;
        int iM2555;
        int iMo1040;
        int iMo10402;
        int iMo1039;
        BitSet bitSet2;
        int i4;
        int i5;
        C2808 c28082 = c2808;
        BitSet bitSet3 = this.f366;
        int i6 = this.f364;
        bitSet3.set(0, i6, true);
        C0769 c07692 = this.f355;
        if (c07692.f3551) {
            i = c0769.f3552;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = c0769.f3552;
            i2 = i == 1 ? c0769.f3555 + c0769.f3554 : c0769.f3557 - c0769.f3554;
        }
        int i7 = 0;
        while (true) {
            c1281Arr = this.f354;
            if (i7 >= i6) {
                break;
            }
            if (!((ArrayList) c1281Arr[i7].f5888).isEmpty()) {
                m241(c1281Arr[i7], i, i2);
            }
            i7++;
        }
        boolean z = this.f349;
        AbstractC0353 abstractC0353 = this.f351;
        int iMo10392 = z ? abstractC0353.mo1039() : abstractC0353.mo1038();
        boolean z2 = false;
        while (true) {
            int i8 = c0769.f3556;
            if (i8 < 0 || i8 >= c2637.m4742() || (!c07692.f3551 && bitSet3.isEmpty())) {
                break;
            }
            View view = c28082.m4934(c0769.f3556, Long.MAX_VALUE).f1093;
            c0769.f3556 += c0769.f3558;
            C1042 c1042 = (C1042) view.getLayoutParams();
            int iM787 = c1042.f12448.m787();
            C0119 c0119 = this.f358;
            int[] iArr = (int[]) c0119.f812;
            int i9 = (iArr == null || iM787 >= iArr.length) ? -1 : iArr[iM787];
            if (i9 == -1) {
                if (m215(c0769.f3552)) {
                    i3 = i6;
                    i5 = i6 - 1;
                    i6 = -1;
                    i4 = -1;
                } else {
                    i3 = i6;
                    i4 = 1;
                    i5 = 0;
                }
                C1281 c12812 = null;
                int i10 = i4;
                if (c0769.f3552 == 1) {
                    int iMo1038 = abstractC0353.mo1038();
                    c1281Arr2 = c1281Arr;
                    int i11 = i5;
                    int i12 = Integer.MAX_VALUE;
                    while (i11 != i6) {
                        int i13 = i11;
                        C1281 c12813 = c1281Arr2[i13];
                        BitSet bitSet4 = bitSet3;
                        int iM2550 = c12813.m2550(iMo1038);
                        if (iM2550 < i12) {
                            i12 = iM2550;
                            c12812 = c12813;
                        }
                        i11 = i13 + i10;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    c1281Arr2 = c1281Arr;
                    int iMo10393 = abstractC0353.mo1039();
                    int i14 = i5;
                    int i15 = Integer.MIN_VALUE;
                    while (i14 != i6) {
                        C1281 c12814 = c1281Arr2[i14];
                        int i16 = i6;
                        int iM25552 = c12814.m2555(iMo10393);
                        if (iM25552 > i15) {
                            i15 = iM25552;
                            c12812 = c12814;
                        }
                        i14 += i10;
                        i6 = i16;
                    }
                }
                c1281 = c12812;
                c0119.m539(iM787);
                ((int[]) c0119.f812)[iM787] = c1281.f5883;
            } else {
                bitSet = bitSet3;
                i3 = i6;
                c1281Arr2 = c1281Arr;
                c1281 = c1281Arr2[i9];
            }
            c1042.f4740 = c1281;
            if (c0769.f3552 == 1) {
                r5 = 0;
                m4609(view, -1, false);
            } else {
                r5 = 0;
                m4609(view, 0, false);
            }
            int i17 = this.f350;
            if (i17 == 1) {
                m221(view, AbstractC2551.m4599(r5, this.f356, this.f12603, r5, ((ViewGroup.MarginLayoutParams) c1042).width), AbstractC2551.m4599(true, this.f12599, this.f12595, m4620() + m4616(), ((ViewGroup.MarginLayoutParams) c1042).height));
            } else {
                m221(view, AbstractC2551.m4599(true, this.f12593, this.f12603, m4615() + m4621(), ((ViewGroup.MarginLayoutParams) c1042).width), AbstractC2551.m4599(false, this.f356, this.f12595, 0, ((ViewGroup.MarginLayoutParams) c1042).height));
            }
            if (c0769.f3552 == 1) {
                iMo1040 = c1281.m2550(iMo10392);
                iM2555 = abstractC0353.mo1040(view) + iMo1040;
            } else {
                iM2555 = c1281.m2555(iMo10392);
                iMo1040 = iM2555 - abstractC0353.mo1040(view);
            }
            int i18 = c0769.f3552;
            C1281 c12815 = c1042.f4740;
            if (i18 == 1) {
                c12815.getClass();
                C1042 c10422 = (C1042) view.getLayoutParams();
                c10422.f4740 = c12815;
                ArrayList arrayList = (ArrayList) c12815.f5888;
                arrayList.add(view);
                c12815.f5887 = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c12815.f5885 = Integer.MIN_VALUE;
                }
                if (c10422.f12448.m774() || c10422.f12448.m782()) {
                    c12815.f5889 = ((StaggeredGridLayoutManager) c12815.f5886).f351.mo1040(view) + c12815.f5889;
                }
            } else {
                c12815.getClass();
                C1042 c10423 = (C1042) view.getLayoutParams();
                c10423.f4740 = c12815;
                ArrayList arrayList2 = (ArrayList) c12815.f5888;
                arrayList2.add(0, view);
                c12815.f5885 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c12815.f5887 = Integer.MIN_VALUE;
                }
                if (c10423.f12448.m774() || c10423.f12448.m782()) {
                    c12815.f5889 = ((StaggeredGridLayoutManager) c12815.f5886).f351.mo1040(view) + c12815.f5889;
                }
            }
            boolean zM222 = m222();
            AbstractC0353 abstractC03532 = this.f362;
            if (zM222 && i17 == 1) {
                iMo1039 = abstractC03532.mo1039() - (((i3 - 1) - c1281.f5883) * this.f356);
                iMo10402 = iMo1039 - abstractC03532.mo1040(view);
            } else {
                int iMo10382 = (c1281.f5883 * this.f356) + abstractC03532.mo1038();
                int iMo10403 = abstractC03532.mo1040(view) + iMo10382;
                iMo10402 = iMo10382;
                iMo1039 = iMo10403;
            }
            z2 = true;
            if (i17 == 1) {
                AbstractC2551.m4601(view, iMo10402, iMo1040, iMo1039, iM2555);
            } else {
                AbstractC2551.m4601(view, iMo1040, iMo10402, iM2555, iMo1039);
            }
            m241(c1281, c07692.f3552, i2);
            c28082 = c2808;
            m218(c28082, c07692);
            if (c07692.f3550 && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(c1281.f5883, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i6 = i3;
            c1281Arr = c1281Arr2;
        }
        if (!z2) {
            m218(c28082, c07692);
        }
        int iMo10383 = c07692.f3552 == -1 ? abstractC0353.mo1038() - m236(abstractC0353.mo1038()) : m229(abstractC0353.mo1039()) - abstractC0353.mo1039();
        if (iMo10383 > 0) {
            return Math.min(c0769.f3554, iMo10383);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᲇᛱᛷᲇ, reason: contains not printable characters */
    public final void m234(C2808 c2808, int i) {
        while (m4613() > 0) {
            View viewM4614 = m4614(0);
            AbstractC0353 abstractC0353 = this.f351;
            if (abstractC0353.mo1056(viewM4614) > i || abstractC0353.mo1043(viewM4614) > i) {
                return;
            }
            C1042 c1042 = (C1042) viewM4614.getLayoutParams();
            c1042.getClass();
            if (((ArrayList) c1042.f4740.f5888).size() == 1) {
                return;
            }
            C1281 c1281 = c1042.f4740;
            ArrayList arrayList = (ArrayList) c1281.f5888;
            View view = (View) arrayList.remove(0);
            C1042 c10422 = (C1042) view.getLayoutParams();
            c10422.f4740 = null;
            if (arrayList.size() == 0) {
                c1281.f5887 = Integer.MIN_VALUE;
            }
            if (c10422.f12448.m774() || c10422.f12448.m782()) {
                c1281.f5889 -= ((StaggeredGridLayoutManager) c1281.f5886).f351.mo1040(view);
            }
            c1281.f5885 = Integer.MIN_VALUE;
            m4627(viewM4614, c2808);
        }
    }

    /* JADX INFO: renamed from: ᲇᛳᛱ, reason: contains not printable characters */
    public final int m235(C2637 c2637) {
        if (m4613() == 0) {
            return 0;
        }
        boolean z = !this.f365;
        return AbstractC0319.m986(c2637, this.f351, m230(z), m220(z), this, this.f365, this.f349);
    }

    /* JADX INFO: renamed from: ᲇᛸᛴᛱ, reason: contains not printable characters */
    public final int m236(int i) {
        int iM2555 = this.f354[0].m2555(i);
        for (int i2 = 1; i2 < this.f364; i2++) {
            int iM25552 = this.f354[i2].m2555(i);
            if (iM25552 < iM2555) {
                iM2555 = iM25552;
            }
        }
        return iM2555;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final boolean mo163(C2526 c2526) {
        return c2526 instanceof C1042;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲇᲇᲈᲀ */
    public final void mo164(int i, int i2) {
        m217(i, i2, 1);
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo206() {
        return this.f350 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᲈᛱᛶᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m237() {
        int iM4613 = m4613();
        int i = iM4613 - 1;
        int i2 = this.f364;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.f350 == 1 && m222()) ? (byte) 1 : (byte) -1;
        if (this.f349) {
            iM4613 = -1;
        } else {
            i = 0;
        }
        int i3 = i < iM4613 ? 1 : -1;
        while (i != iM4613) {
            View viewM4614 = m4614(i);
            C1042 c1042 = (C1042) viewM4614.getLayoutParams();
            boolean z = bitSet.get(c1042.f4740.f5883);
            AbstractC0353 abstractC0353 = this.f351;
            if (z) {
                C1281 c1281 = c1042.f4740;
                if (this.f349) {
                    int i4 = c1281.f5887;
                    if (i4 == Integer.MIN_VALUE) {
                        c1281.m2552();
                        i4 = c1281.f5887;
                    }
                    if (i4 < abstractC0353.mo1039()) {
                        ArrayList arrayList = (ArrayList) c1281.f5888;
                        ((C1042) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewM4614;
                    }
                } else {
                    int i5 = c1281.f5885;
                    ArrayList arrayList2 = (ArrayList) c1281.f5888;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        C1042 c10422 = (C1042) view.getLayoutParams();
                        c1281.f5885 = ((StaggeredGridLayoutManager) c1281.f5886).f351.mo1046(view);
                        c10422.getClass();
                        i5 = c1281.f5885;
                    }
                    if (i5 > abstractC0353.mo1038()) {
                        ((C1042) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return viewM4614;
                    }
                }
                bitSet.clear(c1042.f4740.f5883);
            }
            i += i3;
            if (i != iM4613) {
                View viewM46142 = m4614(i);
                if (this.f349) {
                    int iMo1056 = abstractC0353.mo1056(viewM4614);
                    int iMo10562 = abstractC0353.mo1056(viewM46142);
                    if (iMo1056 < iMo10562) {
                        return viewM4614;
                    }
                    if (iMo1056 == iMo10562) {
                        if ((c1042.f4740.f5883 - ((C1042) viewM46142.getLayoutParams()).f4740.f5883 >= 0) == (b >= 0)) {
                            return viewM4614;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo1046 = abstractC0353.mo1046(viewM4614);
                    int iMo10462 = abstractC0353.mo1046(viewM46142);
                    if (iMo1046 > iMo10462) {
                        return viewM4614;
                    }
                    if (iMo1046 == iMo10462) {
                        if ((c1042.f4740.f5883 - ((C1042) viewM46142.getLayoutParams()).f4740.f5883 >= 0) == (b >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲈᛳ */
    public final void mo0(C2637 c2637) {
        this.f352 = -1;
        this.f348 = Integer.MIN_VALUE;
        this.f363 = null;
        this.f359.m3216();
    }

    @Override // yyds.AbstractC2551
    /* JADX INFO: renamed from: ᲈᛳᛵᛴ */
    public final void mo165(int i, int i2) {
        m217(i, i2, 8);
    }

    /* JADX INFO: renamed from: ᲈᛳᲀᲈ, reason: contains not printable characters */
    public final int m238(int i, C2808 c2808, C2637 c2637) {
        if (m4613() == 0 || i == 0) {
            return 0;
        }
        m242(i, c2637);
        C0769 c0769 = this.f355;
        int iM233 = m233(c2808, c0769, c2637);
        if (c0769.f3554 >= iM233) {
            i = i < 0 ? -iM233 : iM233;
        }
        this.f351.mo1045(-i);
        this.f360 = this.f349;
        c0769.f3554 = 0;
        m218(c2808, c0769);
        return i;
    }

    /* JADX INFO: renamed from: ᲈᛵᛶᛲ, reason: contains not printable characters */
    public final void m239(C2808 c2808, C2637 c2637, boolean z) {
        int iMo1039;
        int iM229 = m229(Integer.MIN_VALUE);
        if (iM229 != Integer.MIN_VALUE && (iMo1039 = this.f351.mo1039() - iM229) > 0) {
            int i = iMo1039 - (-m238(-iMo1039, c2808, c2637));
            if (!z || i <= 0) {
                return;
            }
            this.f351.mo1045(i);
        }
    }

    /* JADX INFO: renamed from: ᲈᛶᛲᛶ, reason: contains not printable characters */
    public final void m240(int i, C2637 c2637) {
        int iMo1036;
        int iMo10362;
        int i2;
        C0769 c0769 = this.f355;
        boolean z = false;
        c0769.f3554 = 0;
        c0769.f3556 = i;
        C0053 c0053 = this.f12597;
        AbstractC0353 abstractC0353 = this.f351;
        if (c0053 == null || !c0053.f556 || (i2 = c2637.f12975) == -1) {
            iMo1036 = 0;
            iMo10362 = 0;
        } else {
            if (this.f349 == (i2 < i)) {
                iMo1036 = abstractC0353.mo1036();
                iMo10362 = 0;
            } else {
                iMo10362 = abstractC0353.mo1036();
                iMo1036 = 0;
            }
        }
        C1213 c1213 = this.f12600;
        if (c1213 == null || !c1213.f5565) {
            c0769.f3555 = abstractC0353.mo1037() + iMo1036;
            c0769.f3557 = -iMo10362;
        } else {
            c0769.f3557 = abstractC0353.mo1038() - iMo10362;
            c0769.f3555 = abstractC0353.mo1039() + iMo1036;
        }
        c0769.f3550 = false;
        c0769.f3553 = true;
        if (abstractC0353.mo1049() == 0 && abstractC0353.mo1037() == 0) {
            z = true;
        }
        c0769.f3551 = z;
    }

    /* JADX INFO: renamed from: ᲈᲁᛶᛸ, reason: contains not printable characters */
    public final void m241(C1281 c1281, int i, int i2) {
        int i3 = c1281.f5889;
        int i4 = c1281.f5883;
        BitSet bitSet = this.f366;
        if (i != -1) {
            int i5 = c1281.f5887;
            if (i5 == Integer.MIN_VALUE) {
                c1281.m2552();
                i5 = c1281.f5887;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c1281.f5885;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c1281.f5888).get(0);
            C1042 c1042 = (C1042) view.getLayoutParams();
            c1281.f5885 = ((StaggeredGridLayoutManager) c1281.f5886).f351.mo1046(view);
            c1042.getClass();
            i6 = c1281.f5885;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    /* JADX INFO: renamed from: ᲈᲁᛷᛶ, reason: contains not printable characters */
    public final void m242(int i, C2637 c2637) {
        int iM228;
        int i2;
        if (i > 0) {
            iM228 = m226();
            i2 = 1;
        } else {
            iM228 = m228();
            i2 = -1;
        }
        C0769 c0769 = this.f355;
        c0769.f3553 = true;
        m240(iM228, c2637);
        m232(i2);
        c0769.f3556 = iM228 + c0769.f3558;
        c0769.f3554 = Math.abs(i);
    }
}
