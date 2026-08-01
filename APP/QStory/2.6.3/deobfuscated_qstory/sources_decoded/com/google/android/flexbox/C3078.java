package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3078 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long[] f9895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long[] f9896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f9897;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean[] f9898;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3082 f9899;

    public C3078(InterfaceC3082 interfaceC3082) {
        this.f9899 = interfaceC3082;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m6962(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        C3081 c3081 = new C3081();
        c3081.f9917 = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c3081);
            }
            arrayList.add((C3081) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c3081);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int[] m6963(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C3079 c3079 = (C3079) it.next();
            int i3 = c3079.f9901;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c3079.f9900);
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList m6964(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f9899.mo6919(i2).getLayoutParams();
            C3079 c3079 = new C3079();
            c3079.f9900 = flexItem.getOrder();
            c3079.f9901 = i2;
            arrayList.add(c3079);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6965(int i, List list) {
        int i2 = this.f9897[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f9897;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f9896;
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
    public final void m6966(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo6918()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.mo6918()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.mo6902()
            if (r1 <= r3) goto L26
            int r1 = r0.mo6902()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.mo6907()
            if (r2 >= r5) goto L32
            int r2 = r0.mo6907()
            goto L3e
        L32:
            int r5 = r0.mo6903()
            if (r2 <= r5) goto L3d
            int r2 = r0.mo6903()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m6972(r8, r1, r0, r7)
            com.google.android.flexbox.飘花落叶言子楪世苏哲兰 r6 = r6.f9899
            r6.mo6938(r7, r8)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C3078.m6966(android.view.View, int):void");
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
    public final void m6967(com.google.android.flexbox.C3080 r28, int r29, int r30, int r31, int r32, int r33, java.util.List r34) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C3078.m6967(com.google.android.flexbox.飘花落叶言子楪世哲苏兰, int, int, int, int, int, java.util.List):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6968(List list, C3081 c3081, int i, int i2) {
        c3081.f9911 = i2;
        this.f9899.mo6922(c3081);
        c3081.f9915 = i;
        list.add(c3081);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m6969(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMo6913 = (i - flexItem.mo6913()) - flexItem.mo6916();
        InterfaceC3082 interfaceC3082 = this.f9899;
        int iMin = Math.min(Math.max(iMo6913 - interfaceC3082.mo6936(view), flexItem.mo6907()), flexItem.mo6903());
        long[] jArr = this.f9895;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        m6972(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        interfaceC3082.mo6938(view, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m6970(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMo6911 = (i - flexItem.mo6911()) - flexItem.mo6908();
        InterfaceC3082 interfaceC3082 = this.f9899;
        int iMin = Math.min(Math.max(iMo6911 - interfaceC3082.mo6936(view), flexItem.mo6918()), flexItem.mo6902());
        long[] jArr = this.f9895;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        m6972(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        interfaceC3082.mo6938(view, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m6971(int i) {
        View viewMo6921;
        InterfaceC3082 interfaceC3082 = this.f9899;
        if (i >= interfaceC3082.getFlexItemCount()) {
            return;
        }
        int flexDirection = interfaceC3082.getFlexDirection();
        if (interfaceC3082.getAlignItems() != 4) {
            for (C3081 c3081 : interfaceC3082.getFlexLinesInternal()) {
                for (Integer num : c3081.f9910) {
                    View viewMo69212 = interfaceC3082.mo6921(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        m6969(viewMo69212, c3081.f9917, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            C5925.m11310(AbstractC6183.m11588(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        m6970(viewMo69212, c3081.f9917, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f9897;
        List flexLinesInternal = interfaceC3082.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            C3081 c30812 = (C3081) flexLinesInternal.get(i2);
            int i3 = c30812.f9916;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = c30812.f9914 + i4;
                if (i4 < interfaceC3082.getFlexItemCount() && (viewMo6921 = interfaceC3082.mo6921(i5)) != null && viewMo6921.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewMo6921.getLayoutParams();
                    if (flexItem.mo6914() == -1 || flexItem.mo6914() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            m6969(viewMo6921, c30812.f9917, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                C5925.m11310(AbstractC6183.m11588(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            m6970(viewMo6921, c30812.f9917, i5);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m6972(int i, int i2, int i3, View view) {
        long[] jArr = this.f9896;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f9895;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m6973(int i, FlexItem flexItem, int i2) {
        InterfaceC3082 interfaceC3082 = this.f9899;
        int iMo6920 = interfaceC3082.mo6920(i, interfaceC3082.getPaddingRight() + interfaceC3082.getPaddingLeft() + flexItem.mo6911() + flexItem.mo6908() + i2, flexItem.mo6909());
        int size = View.MeasureSpec.getSize(iMo6920);
        return size > flexItem.mo6902() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6902(), View.MeasureSpec.getMode(iMo6920)) : size < flexItem.mo6918() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6918(), View.MeasureSpec.getMode(iMo6920)) : iMo6920;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m6974(int i, FlexItem flexItem, int i2) {
        InterfaceC3082 interfaceC3082 = this.f9899;
        int iMo6934 = interfaceC3082.mo6934(i, interfaceC3082.getPaddingBottom() + interfaceC3082.getPaddingTop() + flexItem.mo6913() + flexItem.mo6916() + i2, flexItem.mo6910());
        int size = View.MeasureSpec.getSize(iMo6934);
        return size > flexItem.mo6903() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6903(), View.MeasureSpec.getMode(iMo6934)) : size < flexItem.mo6907() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6907(), View.MeasureSpec.getMode(iMo6934)) : iMo6934;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m6975(int i, int i2, C3081 c3081, int i3, int i4, boolean z) {
        float f;
        float f2;
        int iMax;
        int iMo6918;
        int iMo6907;
        int i5 = c3081.f9905;
        float f3 = c3081.f9918;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        c3081.f9905 = i4 + c3081.f9904;
        if (!z) {
            c3081.f9917 = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < c3081.f9916) {
            int i8 = c3081.f9914 + i6;
            InterfaceC3082 interfaceC3082 = this.f9899;
            View viewMo6921 = interfaceC3082.mo6921(i8);
            if (viewMo6921 == null || viewMo6921.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                FlexItem flexItem = (FlexItem) viewMo6921.getLayoutParams();
                int flexDirection = interfaceC3082.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f5;
                    int measuredWidth = viewMo6921.getMeasuredWidth();
                    long[] jArr = this.f9895;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewMo6921.getMeasuredHeight();
                    long[] jArr2 = this.f9895;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.f9898[i8] && flexItem.mo6917() > f) {
                        float fMo6917 = measuredWidth - (f2 * flexItem.mo6917());
                        if (i6 == c3081.f9916 - 1) {
                            fMo6917 += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fMo6917);
                        if (iRound < flexItem.mo6918()) {
                            iMo6918 = flexItem.mo6918();
                            this.f9898[i8] = true;
                            c3081.f9918 -= flexItem.mo6917();
                            z2 = true;
                        } else {
                            float f7 = (fMo6917 - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iMo6918 = iRound + 1;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iMo6918 = iRound - 1;
                                f7 += 1.0f;
                            } else {
                                iMo6918 = iRound;
                            }
                            f6 = f7;
                        }
                        int iM6974 = m6974(i2, flexItem, c3081.f9911);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMo6918, 1073741824);
                        viewMo6921.measure(iMakeMeasureSpec, iM6974);
                        int measuredWidth2 = viewMo6921.getMeasuredWidth();
                        int measuredHeight2 = viewMo6921.getMeasuredHeight();
                        m6972(i8, iMakeMeasureSpec, iM6974, viewMo6921);
                        interfaceC3082.mo6938(viewMo6921, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, interfaceC3082.mo6936(viewMo6921) + measuredHeight + flexItem.mo6913() + flexItem.mo6916());
                    c3081.f9905 = measuredWidth + flexItem.mo6911() + flexItem.mo6908() + c3081.f9905;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo6921.getMeasuredHeight();
                    long[] jArr3 = this.f9895;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewMo6921.getMeasuredWidth();
                    long[] jArr4 = this.f9895;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.f9898[i8] || flexItem.mo6917() <= f) {
                        f2 = f5;
                    } else {
                        float fMo69172 = measuredHeight3 - (flexItem.mo6917() * f5);
                        if (i6 == c3081.f9916 - 1) {
                            fMo69172 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fMo69172);
                        if (iRound2 < flexItem.mo6907()) {
                            iMo6907 = flexItem.mo6907();
                            this.f9898[i8] = true;
                            c3081.f9918 -= flexItem.mo6917();
                            z2 = true;
                            f2 = f5;
                        } else {
                            float f8 = (fMo69172 - iRound2) + f6;
                            f2 = f5;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iMo6907 = iRound2 + 1;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iMo6907 = iRound2 - 1;
                                f8 += 1.0f;
                            } else {
                                iMo6907 = iRound2;
                            }
                            f6 = f8;
                        }
                        int iM6973 = m6973(i, flexItem, c3081.f9911);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMo6907, 1073741824);
                        viewMo6921.measure(iM6973, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo6921.getMeasuredWidth();
                        int measuredHeight4 = viewMo6921.getMeasuredHeight();
                        m6972(i8, iM6973, iMakeMeasureSpec2, viewMo6921);
                        interfaceC3082.mo6938(viewMo6921, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, interfaceC3082.mo6936(viewMo6921) + measuredWidth3 + flexItem.mo6911() + flexItem.mo6908());
                    c3081.f9905 = measuredHeight3 + flexItem.mo6913() + flexItem.mo6916() + c3081.f9905;
                }
                c3081.f9917 = Math.max(c3081.f9917, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            f5 = f2;
        }
        if (!z2 || i5 == c3081.f9905) {
            return;
        }
        m6975(i, i2, c3081, i3, i4, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m6976(View view, C3081 c3081, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        InterfaceC3082 interfaceC3082 = this.f9899;
        int alignItems = interfaceC3082.getAlignItems();
        if (flexItem.mo6914() != -1) {
            alignItems = flexItem.mo6914();
        }
        int i5 = c3081.f9917;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (interfaceC3082.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.mo6916(), i3, i6 - flexItem.mo6916());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.mo6913(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.mo6913());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo6913()) - flexItem.mo6916()) / 2;
                if (interfaceC3082.getFlexWrap() != 2) {
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
                int flexWrap = interfaceC3082.getFlexWrap();
                int i9 = c3081.f9919;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), flexItem.mo6913());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), flexItem.mo6916());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (interfaceC3082.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo6913(), i3, i4 + flexItem.mo6913());
        } else {
            view.layout(i, i2 - flexItem.mo6916(), i3, i4 - flexItem.mo6916());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m6977(View view, C3081 c3081, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f9899.getAlignItems();
        if (flexItem.mo6914() != -1) {
            alignItems = flexItem.mo6914();
        }
        int i5 = c3081.f9917;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo6908(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo6908(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.mo6911(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.mo6911(), i4);
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
            view.layout(i - flexItem.mo6908(), i2, i3 - flexItem.mo6908(), i4);
        } else {
            view.layout(i + flexItem.mo6911(), i2, i3 + flexItem.mo6911(), i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m6978(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        C3078 c3078;
        int i4;
        int i5;
        InterfaceC3082 interfaceC3082 = this.f9899;
        int flexItemCount = interfaceC3082.getFlexItemCount();
        boolean[] zArr = this.f9898;
        if (zArr == null) {
            this.f9898 = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f9898 = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= interfaceC3082.getFlexItemCount()) {
            return;
        }
        int flexDirection = interfaceC3082.getFlexDirection();
        int flexDirection2 = interfaceC3082.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = interfaceC3082.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = interfaceC3082.getPaddingLeft();
            paddingRight = interfaceC3082.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                C5925.m11310(AbstractC6183.m11588(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = interfaceC3082.getLargestMainSize();
            }
            paddingLeft = interfaceC3082.getPaddingTop();
            paddingRight = interfaceC3082.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.f9897;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = interfaceC3082.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            C3081 c3081 = (C3081) flexLinesInternal.get(i8);
            int i9 = c3081.f9905;
            if (i9 >= i7 || !c3081.f9912) {
                c3078 = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && c3081.f9913) {
                    c3078.m6975(i4, i5, c3081, i7, i6, false);
                }
            } else {
                c3078 = this;
                i4 = i;
                i5 = i2;
                c3078.m6981(i4, i5, c3081, i7, i6, false);
            }
            i8++;
            this = c3078;
            i = i4;
            i2 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m6979(int i, int i2, int i3) {
        int mode;
        int size;
        InterfaceC3082 interfaceC3082 = this.f9899;
        int flexDirection = interfaceC3082.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            C5925.m11310(AbstractC6183.m11588(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<C3081> flexLinesInternal = interfaceC3082.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = interfaceC3082.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C3081) flexLinesInternal.get(0)).f9917 = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = interfaceC3082.getAlignContent();
                if (alignContent == 1) {
                    C3081 c3081 = new C3081();
                    c3081.f9917 = size - sumOfCrossSize;
                    flexLinesInternal.add(0, c3081);
                    return;
                }
                if (alignContent == 2) {
                    interfaceC3082.setFlexLines(m6962(flexLinesInternal, size, sumOfCrossSize));
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
                        arrayList.add((C3081) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            C3081 c30812 = new C3081();
                            if (i4 == flexLinesInternal.size() - 2) {
                                c30812.f9917 = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                c30812.f9917 = Math.round(size3);
                            }
                            int i5 = c30812.f9917;
                            float f2 = (size3 - i5) + f;
                            if (f2 > 1.0f) {
                                c30812.f9917 = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                c30812.f9917 = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(c30812);
                        }
                        i4++;
                    }
                    interfaceC3082.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        interfaceC3082.setFlexLines(m6962(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    C3081 c30813 = new C3081();
                    c30813.f9917 = size5;
                    for (C3081 c30814 : flexLinesInternal) {
                        arrayList2.add(c30813);
                        arrayList2.add(c30814);
                        arrayList2.add(c30813);
                    }
                    interfaceC3082.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        C3081 c30815 = (C3081) flexLinesInternal.get(i4);
                        float f4 = c30815.f9917 + size6;
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
                        c30815.f9917 = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m6980(int i) {
        long[] jArr = this.f9895;
        if (jArr == null) {
            this.f9895 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f9895 = Arrays.copyOf(this.f9895, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6981(int i, int i2, C3081 c3081, int i3, int i4, boolean z) {
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
        float f4 = c3081.f9921;
        float f5 = 0.0f;
        if (f4 <= 0.0f || i3 < (i5 = c3081.f9905)) {
            return;
        }
        float f6 = (i3 - i5) / f4;
        c3081.f9905 = i4 + c3081.f9904;
        if (!z) {
            c3081.f9917 = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        float f7 = 0.0f;
        while (i8 < c3081.f9916) {
            int i10 = c3081.f9914 + i8;
            InterfaceC3082 interfaceC3082 = this.f9899;
            View viewMo6921 = interfaceC3082.mo6921(i10);
            if (viewMo6921 == null || viewMo6921.getVisibility() == 8) {
                f = f5;
                i6 = i5;
                f2 = f6;
                z2 = z5;
                i7 = i8;
            } else {
                FlexItem flexItem = (FlexItem) viewMo6921.getLayoutParams();
                int flexDirection = interfaceC3082.getFlexDirection();
                f = f5;
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i5;
                    float f8 = f6;
                    z2 = z5;
                    int measuredWidth = viewMo6921.getMeasuredWidth();
                    long[] jArr = this.f9895;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = viewMo6921.getMeasuredHeight();
                    long[] jArr2 = this.f9895;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i10] >> 32);
                    }
                    if (this.f9898[i10] || flexItem.mo6905() <= f) {
                        i7 = i8;
                        f2 = f8;
                    } else {
                        float fMo6905 = (f8 * flexItem.mo6905()) + measuredWidth;
                        if (i8 == c3081.f9916 - 1) {
                            fMo6905 += f7;
                            f7 = f;
                        }
                        int iRound = Math.round(fMo6905);
                        if (iRound > flexItem.mo6902()) {
                            iRound = flexItem.mo6902();
                            this.f9898[i10] = true;
                            c3081.f9921 -= flexItem.mo6905();
                            z2 = true;
                            i7 = i8;
                            f2 = f8;
                        } else {
                            float f9 = (fMo6905 - iRound) + f7;
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
                        int iM6974 = m6974(i2, flexItem, c3081.f9911);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMo6921.measure(iMakeMeasureSpec, iM6974);
                        int measuredWidth2 = viewMo6921.getMeasuredWidth();
                        int measuredHeight2 = viewMo6921.getMeasuredHeight();
                        m6972(i10, iMakeMeasureSpec, iM6974, viewMo6921);
                        interfaceC3082.mo6938(viewMo6921, i10);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, interfaceC3082.mo6936(viewMo6921) + measuredHeight + flexItem.mo6913() + flexItem.mo6916());
                    c3081.f9905 = measuredWidth + flexItem.mo6911() + flexItem.mo6908() + c3081.f9905;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo6921.getMeasuredHeight();
                    long[] jArr3 = this.f9895;
                    if (jArr3 != null) {
                        long j = jArr3[i10];
                        f3 = f6;
                        z3 = z5;
                        measuredHeight3 = (int) (j >> 32);
                    } else {
                        f3 = f6;
                        z3 = z5;
                    }
                    int measuredWidth3 = viewMo6921.getMeasuredWidth();
                    long[] jArr4 = this.f9895;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (this.f9898[i10] || flexItem.mo6905() <= f) {
                        i6 = i5;
                        z4 = z3;
                    } else {
                        float fMo69052 = (flexItem.mo6905() * f3) + measuredHeight3;
                        if (i8 == c3081.f9916 - 1) {
                            fMo69052 += f7;
                            f7 = f;
                        }
                        int iRound2 = Math.round(fMo69052);
                        if (iRound2 > flexItem.mo6903()) {
                            iRound2 = flexItem.mo6903();
                            this.f9898[i10] = true;
                            c3081.f9921 -= flexItem.mo6905();
                            z4 = true;
                            i6 = i5;
                        } else {
                            float f10 = (fMo69052 - iRound2) + f7;
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
                        int iM6973 = m6973(i, flexItem, c3081.f9911);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMo6921.measure(iM6973, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo6921.getMeasuredWidth();
                        int measuredHeight4 = viewMo6921.getMeasuredHeight();
                        m6972(i10, iM6973, iMakeMeasureSpec2, viewMo6921);
                        interfaceC3082.mo6938(viewMo6921, i10);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, interfaceC3082.mo6936(viewMo6921) + measuredWidth3 + flexItem.mo6911() + flexItem.mo6908());
                    c3081.f9905 = measuredHeight3 + flexItem.mo6913() + flexItem.mo6916() + c3081.f9905;
                    f2 = f3;
                    z2 = z4;
                    i7 = i8;
                }
                c3081.f9917 = Math.max(c3081.f9917, iMax);
                i9 = iMax;
            }
            i8 = i7 + 1;
            f6 = f2;
            f5 = f;
            i5 = i6;
            z5 = z2;
        }
        int i11 = i5;
        if (!z5 || i11 == c3081.f9905) {
            return;
        }
        m6981(i, i2, c3081, i3, i4, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m6982(int i) {
        int[] iArr = this.f9897;
        if (iArr == null) {
            this.f9897 = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f9897 = Arrays.copyOf(this.f9897, Math.max(iArr.length * 2, i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m6983(int i) {
        long[] jArr = this.f9896;
        if (jArr == null) {
            this.f9896 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f9896 = Arrays.copyOf(this.f9896, Math.max(jArr.length * 2, i));
        }
    }
}
