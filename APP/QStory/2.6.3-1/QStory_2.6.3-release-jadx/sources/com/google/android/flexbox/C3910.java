package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3910 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long[] f10240;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long[] f10241;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f10242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean[] f10243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3914 f10244;

    public C3910(InterfaceC3914 interfaceC3914) {
        this.f10244 = interfaceC3914;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static ArrayList m7521(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        C3913 c3913 = new C3913();
        c3913.f10262 = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c3913);
            }
            arrayList.add((C3913) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c3913);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int[] m7522(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C3911 c3911 = (C3911) it.next();
            int i3 = c3911.f10246;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c3911.f10245);
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList m7523(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f10244.mo7478(i2).getLayoutParams();
            C3911 c3911 = new C3911();
            c3911.f10245 = flexItem.getOrder();
            c3911.f10246 = i2;
            arrayList.add(c3911);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7524(int i, List list) {
        int i2 = this.f10242[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f10242;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f10241;
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
    */
    public final void m7525(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.mo7477()) {
            measuredWidth = flexItem.mo7477();
        } else {
            if (measuredWidth <= flexItem.mo7461()) {
                z = false;
                if (measuredHeight >= flexItem.mo7466()) {
                    measuredHeight = flexItem.mo7466();
                } else if (measuredHeight > flexItem.mo7462()) {
                    measuredHeight = flexItem.mo7462();
                } else {
                    z2 = z;
                }
                if (z2) {
                    return;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                m7531(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f10244.mo7497(view, i);
                return;
            }
            measuredWidth = flexItem.mo7461();
        }
        z = true;
        if (measuredHeight >= flexItem.mo7466()) {
        }
        if (z2) {
        }
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
    */
    public final void m7526(C3912 c3912, int i, int i2, int i3, int i4, int i5, List list) {
        List list2;
        int i6;
        int iMo7493;
        FlexItem flexItem;
        int i7;
        int[] iArr;
        boolean z;
        int i8 = i;
        InterfaceC3914 interfaceC3914 = this.f10244;
        boolean zMo7498 = interfaceC3914.mo7498();
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        List arrayList = list == null ? new ArrayList() : list;
        c3912.f10247 = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zMo7498 ? interfaceC3914.getPaddingStart() : interfaceC3914.getPaddingTop();
        int paddingEnd = zMo7498 ? interfaceC3914.getPaddingEnd() : interfaceC3914.getPaddingBottom();
        int paddingTop = zMo7498 ? interfaceC3914.getPaddingTop() : interfaceC3914.getPaddingStart();
        int paddingBottom = zMo7498 ? interfaceC3914.getPaddingBottom() : interfaceC3914.getPaddingEnd();
        C3913 c3913 = new C3913();
        int i9 = i4;
        int i10 = 1;
        c3913.f10259 = i9;
        int i11 = paddingStart + paddingEnd;
        c3913.f10250 = i11;
        int flexItemCount = interfaceC3914.getFlexItemCount();
        boolean z3 = z2;
        int i12 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i13 = 0;
        int i14 = 0;
        while (i9 < flexItemCount) {
            int i15 = flexItemCount;
            View viewMo7480 = interfaceC3914.mo7480(i9);
            if (viewMo7480 == null) {
                if (i9 == i15 - 1 && c3913.m7544() != 0) {
                    m7527(arrayList, c3913, i9, i13);
                }
            } else if (viewMo7480.getVisibility() == 8) {
                c3913.f10265++;
                c3913.f10261++;
                if (i9 == i15 - 1 && c3913.m7544() != 0) {
                    m7527(arrayList, c3913, i9, i13);
                }
            } else {
                if (viewMo7480 instanceof CompoundButton) {
                    CompoundButton compoundButton = (CompoundButton) viewMo7480;
                    FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                    int iMo7477 = flexItem2.mo7477();
                    i6 = i11;
                    int iMo7466 = flexItem2.mo7466();
                    Drawable buttonDrawable = compoundButton.getButtonDrawable();
                    int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                    int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                    list2 = arrayList;
                    if (iMo7477 == -1) {
                        iMo7477 = minimumWidth;
                    }
                    flexItem2.mo7474(iMo7477);
                    if (iMo7466 == -1) {
                        iMo7466 = minimumHeight;
                    }
                    flexItem2.mo7471(iMo7466);
                } else {
                    list2 = arrayList;
                    i6 = i11;
                }
                FlexItem flexItem3 = (FlexItem) viewMo7480.getLayoutParams();
                if (flexItem3.mo7473() == 4) {
                    c3913.f10255.add(Integer.valueOf(i9));
                }
                int iMo7468 = zMo7498 ? flexItem3.mo7468() : flexItem3.mo7469();
                if (flexItem3.mo7463() != -1.0f && mode == 1073741824) {
                    iMo7468 = Math.round(size * flexItem3.mo7463());
                }
                if (zMo7498) {
                    iMo7493 = interfaceC3914.mo7479(i8, i6 + flexItem3.mo7470() + flexItem3.mo7467(), iMo7468);
                    int iMo74932 = interfaceC3914.mo7493(i2, paddingTop + paddingBottom + flexItem3.mo7472() + flexItem3.mo7475() + i13, flexItem3.mo7469());
                    viewMo7480.measure(iMo7493, iMo74932);
                    m7531(i9, iMo7493, iMo74932, viewMo7480);
                } else {
                    int iMo7479 = interfaceC3914.mo7479(i2, paddingTop + paddingBottom + flexItem3.mo7470() + flexItem3.mo7467() + i13, flexItem3.mo7468());
                    iMo7493 = interfaceC3914.mo7493(i8, i6 + flexItem3.mo7472() + flexItem3.mo7475(), iMo7468);
                    viewMo7480.measure(iMo7479, iMo7493);
                    m7531(i9, iMo7479, iMo7493, viewMo7480);
                }
                interfaceC3914.mo7497(viewMo7480, i9);
                m7525(viewMo7480, i9);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewMo7480.getMeasuredState());
                int i16 = c3913.f10250;
                int measuredWidth = (zMo7498 ? viewMo7480.getMeasuredWidth() : viewMo7480.getMeasuredHeight()) + (zMo7498 ? flexItem3.mo7470() : flexItem3.mo7472()) + (zMo7498 ? flexItem3.mo7467() : flexItem3.mo7475());
                int size2 = list2.size();
                if (interfaceC3914.getFlexWrap() != 0) {
                    if (flexItem3.mo7465()) {
                        flexItem = flexItem3;
                    } else {
                        if (mode != 0) {
                            flexItem = flexItem3;
                            int maxLine = interfaceC3914.getMaxLine();
                            if (maxLine == -1 || maxLine > size2 + 1) {
                                int iMo7494 = interfaceC3914.mo7494(viewMo7480, i9, i14);
                                if (iMo7494 > 0) {
                                    measuredWidth += iMo7494;
                                }
                                if (size < i16 + measuredWidth) {
                                }
                                c3913.f10257 |= flexItem.mo7464() == 0.0f;
                                c3913.f10258 |= flexItem.mo7476() == 0.0f;
                                iArr = this.f10242;
                                if (iArr != null) {
                                    iArr[i9] = arrayList.size();
                                }
                                c3913.f10250 = (!zMo7498 ? viewMo7480.getMeasuredWidth() : viewMo7480.getMeasuredHeight()) + (!zMo7498 ? flexItem.mo7470() : flexItem.mo7472()) + (!zMo7498 ? flexItem.mo7467() : flexItem.mo7475()) + c3913.f10250;
                                c3913.f10266 += flexItem.mo7464();
                                c3913.f10263 += flexItem.mo7476();
                                interfaceC3914.mo7482(viewMo7480, i9, i14, c3913);
                                int iMax = Math.max(i7, interfaceC3914.mo7495(viewMo7480) + (!zMo7498 ? viewMo7480.getMeasuredHeight() : viewMo7480.getMeasuredWidth()) + (!zMo7498 ? flexItem.mo7472() : flexItem.mo7470()) + (!zMo7498 ? flexItem.mo7475() : flexItem.mo7467()));
                                c3913.f10262 = Math.max(c3913.f10262, iMax);
                                if (zMo7498) {
                                    i12 = iMax;
                                } else {
                                    int flexWrap = interfaceC3914.getFlexWrap();
                                    int i17 = c3913.f10264;
                                    i12 = iMax;
                                    if (flexWrap != 2) {
                                        c3913.f10264 = Math.max(i17, viewMo7480.getBaseline() + flexItem.mo7472());
                                    } else {
                                        c3913.f10264 = Math.max(i17, (viewMo7480.getMeasuredHeight() - viewMo7480.getBaseline()) + flexItem.mo7475());
                                    }
                                }
                                if (i9 == i15 - 1 && c3913.m7544() != 0) {
                                    m7527(arrayList, c3913, i9, i13);
                                    i13 += c3913.f10262;
                                }
                                if (i5 == -1 && arrayList.size() > 0) {
                                    i10 = 1;
                                    if (((C3913) arrayList.get(arrayList.size() - 1)).f10260 >= i5 && i9 >= i5 && !z3) {
                                        i13 = -c3913.f10262;
                                        z = true;
                                    }
                                    if (i13 <= i3 && z) {
                                        break;
                                    }
                                    i9++;
                                    i8 = i;
                                    z3 = z;
                                    flexItemCount = i15;
                                } else {
                                    i10 = 1;
                                }
                                z = z3;
                                if (i13 <= i3) {
                                    continue;
                                }
                                i9++;
                                i8 = i;
                                z3 = z;
                                flexItemCount = i15;
                            }
                        }
                        i11 = i6;
                        arrayList = list2;
                        c3913.f10261 += i10;
                        i14++;
                        i7 = i12;
                        c3913.f10257 |= flexItem.mo7464() == 0.0f;
                        c3913.f10258 |= flexItem.mo7476() == 0.0f;
                        iArr = this.f10242;
                        if (iArr != null) {
                        }
                        c3913.f10250 = (!zMo7498 ? viewMo7480.getMeasuredWidth() : viewMo7480.getMeasuredHeight()) + (!zMo7498 ? flexItem.mo7470() : flexItem.mo7472()) + (!zMo7498 ? flexItem.mo7467() : flexItem.mo7475()) + c3913.f10250;
                        c3913.f10266 += flexItem.mo7464();
                        c3913.f10263 += flexItem.mo7476();
                        interfaceC3914.mo7482(viewMo7480, i9, i14, c3913);
                        int iMax2 = Math.max(i7, interfaceC3914.mo7495(viewMo7480) + (!zMo7498 ? viewMo7480.getMeasuredHeight() : viewMo7480.getMeasuredWidth()) + (!zMo7498 ? flexItem.mo7472() : flexItem.mo7470()) + (!zMo7498 ? flexItem.mo7475() : flexItem.mo7467()));
                        c3913.f10262 = Math.max(c3913.f10262, iMax2);
                        if (zMo7498) {
                        }
                        if (i9 == i15 - 1) {
                            m7527(arrayList, c3913, i9, i13);
                            i13 += c3913.f10262;
                        }
                        if (i5 == -1) {
                        }
                        i10 = 1;
                        z = z3;
                        if (i13 <= i3) {
                        }
                        i9++;
                        i8 = i;
                        z3 = z;
                        flexItemCount = i15;
                    }
                    if (c3913.m7544() > 0) {
                        arrayList = list2;
                        m7527(arrayList, c3913, i9 > 0 ? i9 - 1 : 0, i13);
                        i13 += c3913.f10262;
                    } else {
                        arrayList = list2;
                    }
                    if (zMo7498) {
                        if (flexItem.mo7469() == -1) {
                            viewMo7480.measure(iMo7493, interfaceC3914.mo7493(i2, interfaceC3914.getPaddingBottom() + interfaceC3914.getPaddingTop() + flexItem.mo7472() + flexItem.mo7475() + i13, flexItem.mo7469()));
                            m7525(viewMo7480, i9);
                        }
                    } else if (flexItem.mo7468() == -1) {
                        viewMo7480.measure(interfaceC3914.mo7479(i2, interfaceC3914.getPaddingRight() + interfaceC3914.getPaddingLeft() + flexItem.mo7470() + flexItem.mo7467() + i13, flexItem.mo7468()), iMo7493);
                        m7525(viewMo7480, i9);
                    }
                    c3913 = new C3913();
                    c3913.f10261 = i10;
                    i11 = i6;
                    c3913.f10250 = i11;
                    c3913.f10259 = i9;
                    i7 = Integer.MIN_VALUE;
                    i14 = 0;
                    c3913.f10257 |= flexItem.mo7464() == 0.0f;
                    c3913.f10258 |= flexItem.mo7476() == 0.0f;
                    iArr = this.f10242;
                    if (iArr != null) {
                    }
                    c3913.f10250 = (!zMo7498 ? viewMo7480.getMeasuredWidth() : viewMo7480.getMeasuredHeight()) + (!zMo7498 ? flexItem.mo7470() : flexItem.mo7472()) + (!zMo7498 ? flexItem.mo7467() : flexItem.mo7475()) + c3913.f10250;
                    c3913.f10266 += flexItem.mo7464();
                    c3913.f10263 += flexItem.mo7476();
                    interfaceC3914.mo7482(viewMo7480, i9, i14, c3913);
                    int iMax22 = Math.max(i7, interfaceC3914.mo7495(viewMo7480) + (!zMo7498 ? viewMo7480.getMeasuredHeight() : viewMo7480.getMeasuredWidth()) + (!zMo7498 ? flexItem.mo7472() : flexItem.mo7470()) + (!zMo7498 ? flexItem.mo7475() : flexItem.mo7467()));
                    c3913.f10262 = Math.max(c3913.f10262, iMax22);
                    if (zMo7498) {
                    }
                    if (i9 == i15 - 1) {
                    }
                    if (i5 == -1) {
                    }
                    i10 = 1;
                    z = z3;
                    if (i13 <= i3) {
                    }
                    i9++;
                    i8 = i;
                    z3 = z;
                    flexItemCount = i15;
                }
                flexItem = flexItem3;
                i11 = i6;
                arrayList = list2;
                c3913.f10261 += i10;
                i14++;
                i7 = i12;
                c3913.f10257 |= flexItem.mo7464() == 0.0f;
                c3913.f10258 |= flexItem.mo7476() == 0.0f;
                iArr = this.f10242;
                if (iArr != null) {
                }
                c3913.f10250 = (!zMo7498 ? viewMo7480.getMeasuredWidth() : viewMo7480.getMeasuredHeight()) + (!zMo7498 ? flexItem.mo7470() : flexItem.mo7472()) + (!zMo7498 ? flexItem.mo7467() : flexItem.mo7475()) + c3913.f10250;
                c3913.f10266 += flexItem.mo7464();
                c3913.f10263 += flexItem.mo7476();
                interfaceC3914.mo7482(viewMo7480, i9, i14, c3913);
                int iMax222 = Math.max(i7, interfaceC3914.mo7495(viewMo7480) + (!zMo7498 ? viewMo7480.getMeasuredHeight() : viewMo7480.getMeasuredWidth()) + (!zMo7498 ? flexItem.mo7472() : flexItem.mo7470()) + (!zMo7498 ? flexItem.mo7475() : flexItem.mo7467()));
                c3913.f10262 = Math.max(c3913.f10262, iMax222);
                if (zMo7498) {
                }
                if (i9 == i15 - 1) {
                }
                if (i5 == -1) {
                }
                i10 = 1;
                z = z3;
                if (i13 <= i3) {
                }
                i9++;
                i8 = i;
                z3 = z;
                flexItemCount = i15;
            }
            z = z3;
            i9++;
            i8 = i;
            z3 = z;
            flexItemCount = i15;
        }
        c3912.f10248 = iCombineMeasuredStates;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7527(List list, C3913 c3913, int i, int i2) {
        c3913.f10256 = i2;
        this.f10244.mo7481(c3913);
        c3913.f10260 = i;
        list.add(c3913);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m7528(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMo7472 = (i - flexItem.mo7472()) - flexItem.mo7475();
        InterfaceC3914 interfaceC3914 = this.f10244;
        int iMin = Math.min(Math.max(iMo7472 - interfaceC3914.mo7495(view), flexItem.mo7466()), flexItem.mo7462());
        long[] jArr = this.f10240;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        m7531(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        interfaceC3914.mo7497(view, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m7529(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMo7470 = (i - flexItem.mo7470()) - flexItem.mo7467();
        InterfaceC3914 interfaceC3914 = this.f10244;
        int iMin = Math.min(Math.max(iMo7470 - interfaceC3914.mo7495(view), flexItem.mo7477()), flexItem.mo7461());
        long[] jArr = this.f10240;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        m7531(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        interfaceC3914.mo7497(view, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m7530(int i) {
        View viewMo7480;
        InterfaceC3914 interfaceC3914 = this.f10244;
        if (i >= interfaceC3914.getFlexItemCount()) {
            return;
        }
        int flexDirection = interfaceC3914.getFlexDirection();
        if (interfaceC3914.getAlignItems() != 4) {
            for (C3913 c3913 : interfaceC3914.getFlexLinesInternal()) {
                for (Integer num : c3913.f10255) {
                    View viewMo74802 = interfaceC3914.mo7480(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        m7528(viewMo74802, c3913.f10262, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            C6755.m11869(AbstractC7012.m12147(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        m7529(viewMo74802, c3913.f10262, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f10242;
        List flexLinesInternal = interfaceC3914.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            C3913 c39132 = (C3913) flexLinesInternal.get(i2);
            int i3 = c39132.f10261;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = c39132.f10259 + i4;
                if (i4 < interfaceC3914.getFlexItemCount() && (viewMo7480 = interfaceC3914.mo7480(i5)) != null && viewMo7480.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewMo7480.getLayoutParams();
                    if (flexItem.mo7473() == -1 || flexItem.mo7473() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            m7528(viewMo7480, c39132.f10262, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                C6755.m11869(AbstractC7012.m12147(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            m7529(viewMo7480, c39132.f10262, i5);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m7531(int i, int i2, int i3, View view) {
        long[] jArr = this.f10241;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f10240;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m7532(int i, FlexItem flexItem, int i2) {
        InterfaceC3914 interfaceC3914 = this.f10244;
        int iMo7479 = interfaceC3914.mo7479(i, interfaceC3914.getPaddingRight() + interfaceC3914.getPaddingLeft() + flexItem.mo7470() + flexItem.mo7467() + i2, flexItem.mo7468());
        int size = View.MeasureSpec.getSize(iMo7479);
        return size > flexItem.mo7461() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo7461(), View.MeasureSpec.getMode(iMo7479)) : size < flexItem.mo7477() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo7477(), View.MeasureSpec.getMode(iMo7479)) : iMo7479;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m7533(int i, FlexItem flexItem, int i2) {
        InterfaceC3914 interfaceC3914 = this.f10244;
        int iMo7493 = interfaceC3914.mo7493(i, interfaceC3914.getPaddingBottom() + interfaceC3914.getPaddingTop() + flexItem.mo7472() + flexItem.mo7475() + i2, flexItem.mo7469());
        int size = View.MeasureSpec.getSize(iMo7493);
        return size > flexItem.mo7462() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo7462(), View.MeasureSpec.getMode(iMo7493)) : size < flexItem.mo7466() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo7466(), View.MeasureSpec.getMode(iMo7493)) : iMo7493;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m7534(int i, int i2, C3913 c3913, int i3, int i4, boolean z) {
        float f;
        float f2;
        int iMax;
        int iMo7477;
        int iMo7466;
        int i5 = c3913.f10250;
        float f3 = c3913.f10263;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        c3913.f10250 = i4 + c3913.f10249;
        if (!z) {
            c3913.f10262 = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < c3913.f10261) {
            int i8 = c3913.f10259 + i6;
            InterfaceC3914 interfaceC3914 = this.f10244;
            View viewMo7480 = interfaceC3914.mo7480(i8);
            if (viewMo7480 == null || viewMo7480.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                FlexItem flexItem = (FlexItem) viewMo7480.getLayoutParams();
                int flexDirection = interfaceC3914.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    f2 = f5;
                    int measuredWidth = viewMo7480.getMeasuredWidth();
                    long[] jArr = this.f10240;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewMo7480.getMeasuredHeight();
                    long[] jArr2 = this.f10240;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.f10243[i8] && flexItem.mo7476() > f) {
                        float fMo7476 = measuredWidth - (f2 * flexItem.mo7476());
                        if (i6 == c3913.f10261 - 1) {
                            fMo7476 += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fMo7476);
                        if (iRound < flexItem.mo7477()) {
                            iMo7477 = flexItem.mo7477();
                            this.f10243[i8] = true;
                            c3913.f10263 -= flexItem.mo7476();
                            z2 = true;
                        } else {
                            float f7 = (fMo7476 - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iMo7477 = iRound + 1;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iMo7477 = iRound - 1;
                                f7 += 1.0f;
                            } else {
                                iMo7477 = iRound;
                            }
                            f6 = f7;
                        }
                        int iM7533 = m7533(i2, flexItem, c3913.f10256);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMo7477, 1073741824);
                        viewMo7480.measure(iMakeMeasureSpec, iM7533);
                        int measuredWidth2 = viewMo7480.getMeasuredWidth();
                        int measuredHeight2 = viewMo7480.getMeasuredHeight();
                        m7531(i8, iMakeMeasureSpec, iM7533, viewMo7480);
                        interfaceC3914.mo7497(viewMo7480, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, interfaceC3914.mo7495(viewMo7480) + measuredHeight + flexItem.mo7472() + flexItem.mo7475());
                    c3913.f10250 = measuredWidth + flexItem.mo7470() + flexItem.mo7467() + c3913.f10250;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo7480.getMeasuredHeight();
                    long[] jArr3 = this.f10240;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewMo7480.getMeasuredWidth();
                    long[] jArr4 = this.f10240;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.f10243[i8] || flexItem.mo7476() <= f) {
                        f2 = f5;
                    } else {
                        float fMo74762 = measuredHeight3 - (flexItem.mo7476() * f5);
                        if (i6 == c3913.f10261 - 1) {
                            fMo74762 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fMo74762);
                        if (iRound2 < flexItem.mo7466()) {
                            iMo7466 = flexItem.mo7466();
                            this.f10243[i8] = true;
                            c3913.f10263 -= flexItem.mo7476();
                            z2 = true;
                            f2 = f5;
                        } else {
                            float f8 = (fMo74762 - iRound2) + f6;
                            f2 = f5;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iMo7466 = iRound2 + 1;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iMo7466 = iRound2 - 1;
                                f8 += 1.0f;
                            } else {
                                iMo7466 = iRound2;
                            }
                            f6 = f8;
                        }
                        int iM7532 = m7532(i, flexItem, c3913.f10256);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMo7466, 1073741824);
                        viewMo7480.measure(iM7532, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo7480.getMeasuredWidth();
                        int measuredHeight4 = viewMo7480.getMeasuredHeight();
                        m7531(i8, iM7532, iMakeMeasureSpec2, viewMo7480);
                        interfaceC3914.mo7497(viewMo7480, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, interfaceC3914.mo7495(viewMo7480) + measuredWidth3 + flexItem.mo7470() + flexItem.mo7467());
                    c3913.f10250 = measuredHeight3 + flexItem.mo7472() + flexItem.mo7475() + c3913.f10250;
                }
                c3913.f10262 = Math.max(c3913.f10262, iMax);
                i7 = iMax;
            }
            i6++;
            f4 = f;
            f5 = f2;
        }
        if (!z2 || i5 == c3913.f10250) {
            return;
        }
        m7534(i, i2, c3913, i3, i4, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m7535(View view, C3913 c3913, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        InterfaceC3914 interfaceC3914 = this.f10244;
        int alignItems = interfaceC3914.getAlignItems();
        if (flexItem.mo7473() != -1) {
            alignItems = flexItem.mo7473();
        }
        int i5 = c3913.f10262;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (interfaceC3914.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.mo7475(), i3, i6 - flexItem.mo7475());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.mo7472(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.mo7472());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo7472()) - flexItem.mo7475()) / 2;
                if (interfaceC3914.getFlexWrap() != 2) {
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
                int flexWrap = interfaceC3914.getFlexWrap();
                int i9 = c3913.f10264;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), flexItem.mo7472());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), flexItem.mo7475());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (interfaceC3914.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.mo7472(), i3, i4 + flexItem.mo7472());
        } else {
            view.layout(i, i2 - flexItem.mo7475(), i3, i4 - flexItem.mo7475());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m7536(View view, C3913 c3913, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f10244.getAlignItems();
        if (flexItem.mo7473() != -1) {
            alignItems = flexItem.mo7473();
        }
        int i5 = c3913.f10262;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo7467(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo7467(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.mo7470(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.mo7470(), i4);
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
            view.layout(i - flexItem.mo7467(), i2, i3 - flexItem.mo7467(), i4);
        } else {
            view.layout(i + flexItem.mo7470(), i2, i3 + flexItem.mo7470(), i4);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7537(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        C3910 c3910;
        int i4;
        int i5;
        InterfaceC3914 interfaceC3914 = this.f10244;
        int flexItemCount = interfaceC3914.getFlexItemCount();
        boolean[] zArr = this.f10243;
        if (zArr == null) {
            this.f10243 = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f10243 = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= interfaceC3914.getFlexItemCount()) {
            return;
        }
        int flexDirection = interfaceC3914.getFlexDirection();
        int flexDirection2 = interfaceC3914.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = interfaceC3914.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = interfaceC3914.getPaddingLeft();
            paddingRight = interfaceC3914.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                C6755.m11869(AbstractC7012.m12147(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = interfaceC3914.getLargestMainSize();
            }
            paddingLeft = interfaceC3914.getPaddingTop();
            paddingRight = interfaceC3914.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.f10242;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = interfaceC3914.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            C3913 c3913 = (C3913) flexLinesInternal.get(i8);
            int i9 = c3913.f10250;
            if (i9 >= i7 || !c3913.f10257) {
                c3910 = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && c3913.f10258) {
                    c3910.m7534(i4, i5, c3913, i7, i6, false);
                }
            } else {
                c3910 = this;
                i4 = i;
                i5 = i2;
                c3910.m7540(i4, i5, c3913, i7, i6, false);
            }
            i8++;
            this = c3910;
            i = i4;
            i2 = i5;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7538(int i, int i2, int i3) {
        int mode;
        int size;
        InterfaceC3914 interfaceC3914 = this.f10244;
        int flexDirection = interfaceC3914.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            C6755.m11869(AbstractC7012.m12147(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<C3913> flexLinesInternal = interfaceC3914.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = interfaceC3914.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C3913) flexLinesInternal.get(0)).f10262 = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = interfaceC3914.getAlignContent();
                if (alignContent == 1) {
                    C3913 c3913 = new C3913();
                    c3913.f10262 = size - sumOfCrossSize;
                    flexLinesInternal.add(0, c3913);
                    return;
                }
                if (alignContent == 2) {
                    interfaceC3914.setFlexLines(m7521(flexLinesInternal, size, sumOfCrossSize));
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
                        arrayList.add((C3913) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            C3913 c39132 = new C3913();
                            if (i4 == flexLinesInternal.size() - 2) {
                                c39132.f10262 = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                c39132.f10262 = Math.round(size3);
                            }
                            int i5 = c39132.f10262;
                            float f2 = (size3 - i5) + f;
                            if (f2 > 1.0f) {
                                c39132.f10262 = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                c39132.f10262 = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(c39132);
                        }
                        i4++;
                    }
                    interfaceC3914.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        interfaceC3914.setFlexLines(m7521(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    C3913 c39133 = new C3913();
                    c39133.f10262 = size5;
                    for (C3913 c39134 : flexLinesInternal) {
                        arrayList2.add(c39133);
                        arrayList2.add(c39134);
                        arrayList2.add(c39133);
                    }
                    interfaceC3914.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        C3913 c39135 = (C3913) flexLinesInternal.get(i4);
                        float f4 = c39135.f10262 + size6;
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
                        c39135.f10262 = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m7539(int i) {
        long[] jArr = this.f10240;
        if (jArr == null) {
            this.f10240 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f10240 = Arrays.copyOf(this.f10240, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7540(int i, int i2, C3913 c3913, int i3, int i4, boolean z) {
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
        float f4 = c3913.f10266;
        float f5 = 0.0f;
        if (f4 <= 0.0f || i3 < (i5 = c3913.f10250)) {
            return;
        }
        float f6 = (i3 - i5) / f4;
        c3913.f10250 = i4 + c3913.f10249;
        if (!z) {
            c3913.f10262 = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        float f7 = 0.0f;
        while (i8 < c3913.f10261) {
            int i10 = c3913.f10259 + i8;
            InterfaceC3914 interfaceC3914 = this.f10244;
            View viewMo7480 = interfaceC3914.mo7480(i10);
            if (viewMo7480 == null || viewMo7480.getVisibility() == 8) {
                f = f5;
                i6 = i5;
                f2 = f6;
                z2 = z5;
                i7 = i8;
            } else {
                FlexItem flexItem = (FlexItem) viewMo7480.getLayoutParams();
                int flexDirection = interfaceC3914.getFlexDirection();
                f = f5;
                if (flexDirection == 0 || flexDirection == 1) {
                    i6 = i5;
                    float f8 = f6;
                    z2 = z5;
                    int measuredWidth = viewMo7480.getMeasuredWidth();
                    long[] jArr = this.f10240;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = viewMo7480.getMeasuredHeight();
                    long[] jArr2 = this.f10240;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i10] >> 32);
                    }
                    if (this.f10243[i10] || flexItem.mo7464() <= f) {
                        i7 = i8;
                        f2 = f8;
                    } else {
                        float fMo7464 = (f8 * flexItem.mo7464()) + measuredWidth;
                        if (i8 == c3913.f10261 - 1) {
                            fMo7464 += f7;
                            f7 = f;
                        }
                        int iRound = Math.round(fMo7464);
                        if (iRound > flexItem.mo7461()) {
                            iRound = flexItem.mo7461();
                            this.f10243[i10] = true;
                            c3913.f10266 -= flexItem.mo7464();
                            z2 = true;
                            i7 = i8;
                            f2 = f8;
                        } else {
                            float f9 = (fMo7464 - iRound) + f7;
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
                        int iM7533 = m7533(i2, flexItem, c3913.f10256);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMo7480.measure(iMakeMeasureSpec, iM7533);
                        int measuredWidth2 = viewMo7480.getMeasuredWidth();
                        int measuredHeight2 = viewMo7480.getMeasuredHeight();
                        m7531(i10, iMakeMeasureSpec, iM7533, viewMo7480);
                        interfaceC3914.mo7497(viewMo7480, i10);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, interfaceC3914.mo7495(viewMo7480) + measuredHeight + flexItem.mo7472() + flexItem.mo7475());
                    c3913.f10250 = measuredWidth + flexItem.mo7470() + flexItem.mo7467() + c3913.f10250;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo7480.getMeasuredHeight();
                    long[] jArr3 = this.f10240;
                    if (jArr3 != null) {
                        long j = jArr3[i10];
                        f3 = f6;
                        z3 = z5;
                        measuredHeight3 = (int) (j >> 32);
                    } else {
                        f3 = f6;
                        z3 = z5;
                    }
                    int measuredWidth3 = viewMo7480.getMeasuredWidth();
                    long[] jArr4 = this.f10240;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (this.f10243[i10] || flexItem.mo7464() <= f) {
                        i6 = i5;
                        z4 = z3;
                    } else {
                        float fMo74642 = (flexItem.mo7464() * f3) + measuredHeight3;
                        if (i8 == c3913.f10261 - 1) {
                            fMo74642 += f7;
                            f7 = f;
                        }
                        int iRound2 = Math.round(fMo74642);
                        if (iRound2 > flexItem.mo7462()) {
                            iRound2 = flexItem.mo7462();
                            this.f10243[i10] = true;
                            c3913.f10266 -= flexItem.mo7464();
                            z4 = true;
                            i6 = i5;
                        } else {
                            float f10 = (fMo74642 - iRound2) + f7;
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
                        int iM7532 = m7532(i, flexItem, c3913.f10256);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMo7480.measure(iM7532, iMakeMeasureSpec2);
                        int measuredWidth4 = viewMo7480.getMeasuredWidth();
                        int measuredHeight4 = viewMo7480.getMeasuredHeight();
                        m7531(i10, iM7532, iMakeMeasureSpec2, viewMo7480);
                        interfaceC3914.mo7497(viewMo7480, i10);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, interfaceC3914.mo7495(viewMo7480) + measuredWidth3 + flexItem.mo7470() + flexItem.mo7467());
                    c3913.f10250 = measuredHeight3 + flexItem.mo7472() + flexItem.mo7475() + c3913.f10250;
                    f2 = f3;
                    z2 = z4;
                    i7 = i8;
                }
                c3913.f10262 = Math.max(c3913.f10262, iMax);
                i9 = iMax;
            }
            i8 = i7 + 1;
            f6 = f2;
            f5 = f;
            i5 = i6;
            z5 = z2;
        }
        int i11 = i5;
        if (!z5 || i11 == c3913.f10250) {
            return;
        }
        m7540(i, i2, c3913, i3, i4, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7541(int i) {
        int[] iArr = this.f10242;
        if (iArr == null) {
            this.f10242 = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f10242 = Arrays.copyOf(this.f10242, Math.max(iArr.length * 2, i));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m7542(int i) {
        long[] jArr = this.f10241;
        if (jArr == null) {
            this.f10241 = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f10241 = Arrays.copyOf(this.f10241, Math.max(jArr.length * 2, i));
        }
    }
}
