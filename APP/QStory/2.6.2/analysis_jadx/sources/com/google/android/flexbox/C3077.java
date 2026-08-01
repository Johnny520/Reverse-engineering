package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3077 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long[] f9890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long[] f9891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f9892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean[] f9893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3081 f9894;

    public C3077(InterfaceC3081 interfaceC3081) {
        this.f9894 = interfaceC3081;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m6975(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        C3080 c3080 = new C3080();
        c3080.f9912 = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c3080);
            }
            arrayList.add((C3080) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c3080);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int[] m6976(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C3078 c3078 = (C3078) it.next();
            int i3 = c3078.f9896;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c3078.f9895);
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList m6977(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f9894.mo6932(i2).getLayoutParams();
            C3078 c3078 = new C3078();
            c3078.f9895 = flexItem.getOrder();
            c3078.f9896 = i2;
            arrayList.add(c3078);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6978(int i, List list) {
        int i2 = this.f9892[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f9892;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f9891;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6979(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo6931()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.mo6931()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.mo6915()
            if (r1 <= r3) goto L26
            int r1 = r0.mo6915()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.mo6920()
            if (r2 >= r5) goto L32
            int r2 = r0.mo6920()
            goto L3e
        L32:
            int r5 = r0.mo6916()
            if (r2 <= r5) goto L3d
            int r2 = r0.mo6916()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m6985(r8, r1, r0, r7)
            com.google.android.flexbox.飘花落叶言子楪世苏哲兰 r6 = r6.f9894
            r6.mo6951(r7, r8)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C3077.m6979(android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x039b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6980(com.google.android.flexbox.C3079 r28, int r29, int r30, int r31, int r32, int r33, java.util.List r34) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C3077.m6980(com.google.android.flexbox.飘花落叶言子楪世哲苏兰, int, int, int, int, int, java.util.List):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6981(List list, C3080 c3080, int i, int i2) {
        c3080.f9906 = i2;
        this.f9894.mo6935(c3080);
        c3080.f9910 = i;
        list.add(c3080);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m6982(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMo6926 = (i - flexItem.mo6926()) - flexItem.mo6929();
        InterfaceC3081 interfaceC3081 = this.f9894;
        int iMin = Math.min(Math.max(iMo6926 - interfaceC3081.mo6949(view), flexItem.mo6920()), flexItem.mo6916());
        long[] jArr = this.f9890;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        m6985(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        interfaceC3081.mo6951(view, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m6983(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMo6924 = (i - flexItem.mo6924()) - flexItem.mo6921();
        InterfaceC3081 interfaceC3081 = this.f9894;
        int iMin = Math.min(Math.max(iMo6924 - interfaceC3081.mo6949(view), flexItem.mo6931()), flexItem.mo6915());
        long[] jArr = this.f9890;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        m6985(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        interfaceC3081.mo6951(view, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m6984(int i) {
        View viewMo6934;
        InterfaceC3081 interfaceC3081 = this.f9894;
        if (i >= interfaceC3081.getFlexItemCount()) {
            return;
        }
        int flexDirection = interfaceC3081.getFlexDirection();
        if (interfaceC3081.getAlignItems() != 4) {
            for (C3080 c3080 : interfaceC3081.getFlexLinesInternal()) {
                for (Integer num : c3080.f9905) {
                    View viewMo69342 = interfaceC3081.mo6934(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        m6982(viewMo69342, c3080.f9912, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            C5919.m11249(AbstractC6136.m11556(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        m6983(viewMo69342, c3080.f9912, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f9892;
        List flexLinesInternal = interfaceC3081.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            C3080 c30802 = (C3080) flexLinesInternal.get(i2);
            int i3 = c30802.f9911;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = c30802.f9909 + i4;
                if (i4 < interfaceC3081.getFlexItemCount() && (viewMo6934 = interfaceC3081.mo6934(i5)) != null && viewMo6934.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewMo6934.getLayoutParams();
                    if (flexItem.mo6927() == -1 || flexItem.mo6927() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            m6982(viewMo6934, c30802.f9912, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                C5919.m11249(AbstractC6136.m11556(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            m6983(viewMo6934, c30802.f9912, i5);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m6985(int i, int i2, int i3, View view) {
        long[] jArr = this.f9891;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f9890;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m6986(int i, FlexItem flexItem, int i2) {
        InterfaceC3081 interfaceC3081 = this.f9894;
        int iMo6933 = interfaceC3081.mo6933(i, interfaceC3081.getPaddingRight() + interfaceC3081.getPaddingLeft() + flexItem.mo6924() + flexItem.mo6921() + i2, flexItem.mo6922());
        int size = View.MeasureSpec.getSize(iMo6933);
        return size > flexItem.mo6915() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6915(), View.MeasureSpec.getMode(iMo6933)) : size < flexItem.mo6931() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6931(), View.MeasureSpec.getMode(iMo6933)) : iMo6933;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m6987(int i, FlexItem flexItem, int i2) {
        InterfaceC3081 interfaceC3081 = this.f9894;
        int iMo6947 = interfaceC3081.mo6947(i, interfaceC3081.getPaddingBottom() + interfaceC3081.getPaddingTop() + flexItem.mo6926() + flexItem.mo6929() + i2, flexItem.mo6923());
        int size = View.MeasureSpec.getSize(iMo6947);
        return size > flexItem.mo6916() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6916(), View.MeasureSpec.getMode(iMo6947)) : size < flexItem.mo6920() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6920(), View.MeasureSpec.getMode(iMo6947)) : iMo6947;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m6988(int i, int i2, C3080 c3080, int i3, int i4, boolean z) {
        float f;
        float f2;
        int iMax;
        int iMo6931;
        int iMo6920;
        int i5 = c3080.f9900;
        float f3 = c3080.f9913;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        c3080.f9900 = i4 + c3080.f9899;
        if (!z) {
            c3080.f9912 = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < c3080.f9911) {
            int i8 = c3080.f9909 + i6;
            InterfaceC3081 interfaceC3081 = this.f9894;
            View viewMo6934 = interfaceC3081.mo6934(i8);
            if (viewMo6934 == null || viewMo6934.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                FlexItem flexItem = (FlexItem) viewMo6934.getLayoutParams();
                int flexDirection = interfaceC3081.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f5;
                    int measuredWidth = viewMo6934.getMeasuredWidth();
                    long[] jArr = this.f9890;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewMo6934.getMeasuredHeight();
                    long[] jArr2 = this.f9890;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.f9893[i8] && flexItem.mo6930() > f) {
                        float fMo6930 = measuredWidth - (f2 * flexItem.mo6930());
                        if (i6 == c3080.f9911 - 1) {
                            fMo6930 += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fMo6930);
                        if (iRound < flexItem.mo6931()) {
                            iMo6931 = flexItem.mo6931();
                            this.f9893[i8] = true;
                            c3080.f9913 -= flexItem.mo6930();
                            z2 = true;
                        } else {
                            float f7 = (fMo6930 - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iMo6931 = iRound + 1;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iMo6931 = iRound - 1;
                                f7 += 1.0f;
                            } else {
                                iMo6931 = iRound;
                            }
                            f6 = f7;
                        }
                        int iM6987 = m6987(i2, flexItem, c3080.f9906);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMo6931, 1073741824);
                        viewMo6934.measure(iMakeMeasureSpec, iM6987);
                        int measuredWidth2 = viewMo6934.getMeasuredWidth();
                        int measuredHeight2 = viewMo6934.getMeasuredHeight();
                        m6985(i8, iMakeMeasureSpec, iM6987, viewMo6934);
                        interfaceC3081.mo6951(viewMo6934, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, interfaceC3081.mo6949(viewMo6934) + measuredHeight + flexItem.mo6926() + flexItem.mo6929());
                    c3080.f9900 = measuredWidth + flexItem.mo6924() + flexItem.mo6921() + c3080.f9900;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo6934.getMeasuredHeight();
                    long[] jArr3 = this.f9890;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewMo6934.getMeasuredWidth();
                    long[] jArr4 = this.f9890;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.f9893[i8] || flexItem.mo6930() <= f) {
                        f2 = f5;
                    } else {
                        float fMo69302 = measuredHeight3 - (flexItem.mo6930() * f5);
                        if (i6 == c3080.f9911 - 1) {
                            fMo69302 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fMo69302);
                        if (iRound2 < flexItem.mo6920()) {
                            iMo6920 = flexItem.mo6920();
                            this.f9893[i8] = true;
                            c3080.f9913 -= flexItem.mo6930();
                            z2 = true;
                            f2 = f5;
                        } else {
                            float f8 = (fMo69302 - iRound2) + f6;
                            f2 = f5;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iMo6920 = iRound2 + 1;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iMo6920 = iRound2 - 1;
                                f8 += 1.0f;
                            } else {
                                iMo6920 = iRound2;
                            }
                            f6 = f8;
                        }
                        int iM6986 = m6986(i, flexItem, c3080.f9906);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMo6920, 1073741824);
                        viewMo6934.measure(iM6986, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo6934.getMeasuredWidth();
                        int measuredHeight4 = viewMo6934.getMeasuredHeight();
                        m6985(i8, iM6986, iMakeMeasureSpec2, viewMo6934);
                        interfaceC3081.mo6951(viewMo6934, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, interfaceC3081.mo6949(viewMo6934) + measuredWidth3 + flexItem.mo6924() + flexItem.mo6921());
                    c3080.f9900 = measuredHeight3 + flexItem.mo6926() + flexItem.mo6929() + c3080.f9900;
                }
                c3080.f9912 = Math.max(c3080.f9912, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            f5 = f2;
        }
        if (!z2 || i5 == c3080.f9900) {
            return;
        }
        m6988(i, i2, c3080, i3, i4, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m6989(View view, C3080 c3080, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        InterfaceC3081 interfaceC3081 = this.f9894;
        int alignItems = interfaceC3081.getAlignItems();
        if (flexItem.mo6927() != -1) {
            alignItems = flexItem.mo6927();
        }
        int i5 = c3080.f9912;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (interfaceC3081.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.mo6929(), i3, i6 - flexItem.mo6929());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.mo6926(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.mo6926());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo6926()) - flexItem.mo6929()) / 2;
                if (interfaceC3081.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = interfaceC3081.getFlexWrap();
                int i9 = c3080.f9914;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), flexItem.mo6926());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), flexItem.mo6929());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (interfaceC3081.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo6926(), i3, i4 + flexItem.mo6926());
        } else {
            view.layout(i, i2 - flexItem.mo6929(), i3, i4 - flexItem.mo6929());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m6990(View view, C3080 c3080, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f9894.getAlignItems();
        if (flexItem.mo6927() != -1) {
            alignItems = flexItem.mo6927();
        }
        int i5 = c3080.f9912;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo6921(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo6921(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.mo6924(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.mo6924(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.mo6921(), i2, i3 - flexItem.mo6921(), i4);
        } else {
            view.layout(i + flexItem.mo6924(), i2, i3 + flexItem.mo6924(), i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m6991(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        C3077 c3077;
        int i4;
        int i5;
        InterfaceC3081 interfaceC3081 = this.f9894;
        int flexItemCount = interfaceC3081.getFlexItemCount();
        boolean[] zArr = this.f9893;
        if (zArr == null) {
            this.f9893 = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f9893 = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= interfaceC3081.getFlexItemCount()) {
            return;
        }
        int flexDirection = interfaceC3081.getFlexDirection();
        int flexDirection2 = interfaceC3081.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = interfaceC3081.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = interfaceC3081.getPaddingLeft();
            paddingRight = interfaceC3081.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                C5919.m11249(AbstractC6136.m11556(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = interfaceC3081.getLargestMainSize();
            }
            paddingLeft = interfaceC3081.getPaddingTop();
            paddingRight = interfaceC3081.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.f9892;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = interfaceC3081.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            C3080 c3080 = (C3080) flexLinesInternal.get(i8);
            int i9 = c3080.f9900;
            if (i9 >= i7 || !c3080.f9907) {
                c3077 = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && c3080.f9908) {
                    c3077.m6988(i4, i5, c3080, i7, i6, false);
                }
            } else {
                c3077 = this;
                i4 = i;
                i5 = i2;
                c3077.m6994(i4, i5, c3080, i7, i6, false);
            }
            i8++;
            this = c3077;
            i = i4;
            i2 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m6992(int i, int i2, int i3) {
        int mode;
        int size;
        InterfaceC3081 interfaceC3081 = this.f9894;
        int flexDirection = interfaceC3081.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            C5919.m11249(AbstractC6136.m11556(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<C3080> flexLinesInternal = interfaceC3081.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = interfaceC3081.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C3080) flexLinesInternal.get(0)).f9912 = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = interfaceC3081.getAlignContent();
                if (alignContent == 1) {
                    C3080 c3080 = new C3080();
                    c3080.f9912 = size - sumOfCrossSize;
                    flexLinesInternal.add(0, c3080);
                    return;
                }
                if (alignContent == 2) {
                    interfaceC3081.setFlexLines(m6975(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((C3080) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            C3080 c30802 = new C3080();
                            if (i4 == flexLinesInternal.size() - 2) {
                                c30802.f9912 = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                c30802.f9912 = Math.round(size3);
                            }
                            int i5 = c30802.f9912;
                            float f2 = (size3 - i5) + f;
                            if (f2 > 1.0f) {
                                c30802.f9912 = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                c30802.f9912 = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(c30802);
                        }
                        i4++;
                    }
                    interfaceC3081.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        interfaceC3081.setFlexLines(m6975(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    C3080 c30803 = new C3080();
                    c30803.f9912 = size5;
                    for (C3080 c30804 : flexLinesInternal) {
                        arrayList2.add(c30803);
                        arrayList2.add(c30804);
                        arrayList2.add(c30803);
                    }
                    interfaceC3081.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        C3080 c30805 = (C3080) flexLinesInternal.get(i4);
                        float f4 = c30805.f9912 + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        float f5 = (f4 - iRound) + f3;
                        if (f5 > 1.0f) {
                            iRound++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        c30805.f9912 = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m6993(int i) {
        long[] jArr = this.f9890;
        if (jArr == null) {
            this.f9890 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f9890 = Arrays.copyOf(this.f9890, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6994(int i, int i2, C3080 c3080, int i3, int i4, boolean z) {
        int i5;
        float f;
        int i6;
        float f2;
        boolean z2;
        int i7;
        int iMax;
        double d;
        float f3;
        boolean z3;
        boolean z4;
        double d2;
        float f4 = c3080.f9916;
        float f5 = 0.0f;
        if (f4 <= 0.0f || i3 < (i5 = c3080.f9900)) {
            return;
        }
        float f6 = (i3 - i5) / f4;
        c3080.f9900 = i4 + c3080.f9899;
        if (!z) {
            c3080.f9912 = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        float f7 = 0.0f;
        while (i8 < c3080.f9911) {
            int i10 = c3080.f9909 + i8;
            InterfaceC3081 interfaceC3081 = this.f9894;
            View viewMo6934 = interfaceC3081.mo6934(i10);
            if (viewMo6934 == null || viewMo6934.getVisibility() == 8) {
                f = f5;
                i6 = i5;
                f2 = f6;
                z2 = z5;
                i7 = i8;
            } else {
                FlexItem flexItem = (FlexItem) viewMo6934.getLayoutParams();
                int flexDirection = interfaceC3081.getFlexDirection();
                f = f5;
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i5;
                    float f8 = f6;
                    z2 = z5;
                    int measuredWidth = viewMo6934.getMeasuredWidth();
                    long[] jArr = this.f9890;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = viewMo6934.getMeasuredHeight();
                    long[] jArr2 = this.f9890;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i10] >> 32);
                    }
                    if (this.f9893[i10] || flexItem.mo6919() <= f) {
                        i7 = i8;
                        f2 = f8;
                    } else {
                        float fMo6919 = (f8 * flexItem.mo6919()) + measuredWidth;
                        if (i8 == c3080.f9911 - 1) {
                            fMo6919 += f7;
                            f7 = f;
                        }
                        int iRound = Math.round(fMo6919);
                        if (iRound > flexItem.mo6915()) {
                            iRound = flexItem.mo6915();
                            this.f9893[i10] = true;
                            c3080.f9916 -= flexItem.mo6919();
                            z2 = true;
                            i7 = i8;
                            f2 = f8;
                        } else {
                            float f9 = (fMo6919 - iRound) + f7;
                            i7 = i8;
                            f2 = f8;
                            double d3 = f9;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            } else {
                                f7 = f9;
                            }
                            f7 = (float) d;
                        }
                        int iM6987 = m6987(i2, flexItem, c3080.f9906);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMo6934.measure(iMakeMeasureSpec, iM6987);
                        int measuredWidth2 = viewMo6934.getMeasuredWidth();
                        int measuredHeight2 = viewMo6934.getMeasuredHeight();
                        m6985(i10, iMakeMeasureSpec, iM6987, viewMo6934);
                        interfaceC3081.mo6951(viewMo6934, i10);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, interfaceC3081.mo6949(viewMo6934) + measuredHeight + flexItem.mo6926() + flexItem.mo6929());
                    c3080.f9900 = measuredWidth + flexItem.mo6924() + flexItem.mo6921() + c3080.f9900;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo6934.getMeasuredHeight();
                    long[] jArr3 = this.f9890;
                    if (jArr3 != null) {
                        long j = jArr3[i10];
                        f3 = f6;
                        z3 = z5;
                        measuredHeight3 = (int) (j >> 32);
                    } else {
                        f3 = f6;
                        z3 = z5;
                    }
                    int measuredWidth3 = viewMo6934.getMeasuredWidth();
                    long[] jArr4 = this.f9890;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (this.f9893[i10] || flexItem.mo6919() <= f) {
                        i6 = i5;
                        z4 = z3;
                    } else {
                        float fMo69192 = (flexItem.mo6919() * f3) + measuredHeight3;
                        if (i8 == c3080.f9911 - 1) {
                            fMo69192 += f7;
                            f7 = f;
                        }
                        int iRound2 = Math.round(fMo69192);
                        if (iRound2 > flexItem.mo6916()) {
                            iRound2 = flexItem.mo6916();
                            this.f9893[i10] = true;
                            c3080.f9916 -= flexItem.mo6919();
                            z4 = true;
                            i6 = i5;
                        } else {
                            float f10 = (fMo69192 - iRound2) + f7;
                            i6 = i5;
                            double d4 = f10;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            } else {
                                f7 = f10;
                                z4 = z3;
                            }
                            f7 = (float) d2;
                            z4 = z3;
                        }
                        int iM6986 = m6986(i, flexItem, c3080.f9906);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMo6934.measure(iM6986, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo6934.getMeasuredWidth();
                        int measuredHeight4 = viewMo6934.getMeasuredHeight();
                        m6985(i10, iM6986, iMakeMeasureSpec2, viewMo6934);
                        interfaceC3081.mo6951(viewMo6934, i10);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, interfaceC3081.mo6949(viewMo6934) + measuredWidth3 + flexItem.mo6924() + flexItem.mo6921());
                    c3080.f9900 = measuredHeight3 + flexItem.mo6926() + flexItem.mo6929() + c3080.f9900;
                    f2 = f3;
                    z2 = z4;
                    i7 = i8;
                }
                c3080.f9912 = Math.max(c3080.f9912, iMax);
                i9 = iMax;
            }
            i8 = i7 + 1;
            f6 = f2;
            f5 = f;
            i5 = i6;
            z5 = z2;
        }
        int i11 = i5;
        if (!z5 || i11 == c3080.f9900) {
            return;
        }
        m6994(i, i2, c3080, i3, i4, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m6995(int i) {
        int[] iArr = this.f9892;
        if (iArr == null) {
            this.f9892 = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f9892 = Arrays.copyOf(this.f9892, Math.max(iArr.length * 2, i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m6996(int i) {
        long[] jArr = this.f9891;
        if (jArr == null) {
            this.f9891 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f9891 = Arrays.copyOf(this.f9891, Math.max(jArr.length * 2, i));
        }
    }
}
