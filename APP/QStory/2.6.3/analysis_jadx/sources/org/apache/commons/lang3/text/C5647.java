package org.apache.commons.lang3.text;

import bsh.C2633;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.lang3.AbstractC5686;
import org.apache.commons.lang3.AbstractC5695;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5647 implements ListIterator, Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public AbstractC5648 f15530;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC5648 f15531 = AbstractC5648.f15541;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC5648 f15533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC5648 f15534;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String[] f15535;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15536;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char[] f15537;

    static {
        C5647 c5647 = new C5647();
        c5647.f15531 = AbstractC5648.f15543;
        C5643 c5643 = AbstractC5648.f15539;
        if (c5643 != null) {
            c5647.f15530 = c5643;
        }
        C5641 c5641 = AbstractC5648.f15538;
        if (c5641 != null) {
            c5647.f15533 = c5641;
        }
        C5641 c56412 = AbstractC5648.f15540;
        if (c56412 != null) {
            c5647.f15534 = c56412;
        }
        c5647.f15532 = false;
        C5647 c56472 = new C5647();
        c56472.f15531 = AbstractC5648.f15542;
        if (c5643 != null) {
            c56472.f15530 = c5643;
        }
        if (c5641 != null) {
            c56472.f15533 = c5641;
        }
        if (c56412 != null) {
            c56472.f15534 = c56412;
        }
        c56472.f15532 = false;
    }

    public C5647() {
        C5641 c5641 = AbstractC5648.f15538;
        this.f15530 = c5641;
        this.f15533 = c5641;
        this.f15534 = c5641;
        this.f15532 = true;
        this.f15537 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m11034(char[] cArr, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            if (i6 >= i2 || cArr[i6] != cArr[i3 + i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("add() is unsupported");
    }

    public final Object clone() {
        try {
            C5647 c5647 = (C5647) super.clone();
            char[] cArr = c5647.f15537;
            if (cArr != null) {
                c5647.f15537 = (char[]) cArr.clone();
            }
            c5647.f15536 = 0;
            c5647.f15535 = null;
            return c5647;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        m11036();
        return this.f15536 < this.f15535.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m11036();
        return this.f15536 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2633.m5336();
            return null;
        }
        String[] strArr = this.f15535;
        int i = this.f15536;
        this.f15536 = i + 1;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15536;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C2633.m5336();
            return null;
        }
        String[] strArr = this.f15535;
        int i = this.f15536 - 1;
        this.f15536 = i;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15536 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove() is unsupported");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("set() is unsupported");
    }

    public final String toString() {
        if (this.f15535 == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        StringBuilder sb = new StringBuilder("StrTokenizer");
        m11036();
        ArrayList arrayList = new ArrayList(this.f15535.length);
        arrayList.addAll(Arrays.asList(this.f15535));
        sb.append(arrayList);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List mo11033(int i, char[] cArr) {
        C5647 c5647;
        int i2;
        char[] cArr2;
        int iM11035;
        if (AbstractC5686.m11052(cArr)) {
            return Collections.EMPTY_LIST;
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 >= 0 && i3 < i) {
            int i4 = i3;
            while (i4 < i) {
                int iMax = Math.max(this.f15533.mo11032(i4, cArr), this.f15534.mo11032(i4, cArr));
                if (iMax == 0 || this.f15531.mo11032(i4, cArr) > 0 || this.f15530.mo11032(i4, cArr) > 0) {
                    break;
                }
                i4 += iMax;
            }
            if (i4 >= i) {
                this.m11037("", arrayList);
                c5647 = this;
                iM11035 = -1;
                i2 = i;
                cArr2 = cArr;
            } else {
                int iMo11032 = this.f15531.mo11032(i4, cArr);
                if (iMo11032 > 0) {
                    this.m11037("", arrayList);
                    int i5 = i4 + iMo11032;
                    c5647 = this;
                    i2 = i;
                    cArr2 = cArr;
                    iM11035 = i5;
                } else {
                    int iMo110322 = this.f15530.mo11032(i4, cArr);
                    if (iMo110322 > 0) {
                        int i6 = i4;
                        c5647 = this;
                        i2 = i;
                        cArr2 = cArr;
                        iM11035 = c5647.m11035(cArr2, i6 + iMo110322, i2, strBuilder, arrayList, i6, iMo110322);
                    } else {
                        c5647 = this;
                        i2 = i;
                        cArr2 = cArr;
                        iM11035 = c5647.m11035(cArr2, i4, i2, strBuilder, arrayList, 0, 0);
                    }
                }
            }
            if (iM11035 >= i2) {
                c5647.m11037("", arrayList);
            }
            C5647 c56472 = c5647;
            i3 = iM11035;
            this = c56472;
            cArr = cArr2;
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m11035(char[] cArr, int i, int i2, StrBuilder strBuilder, ArrayList arrayList, int i3, int i4) {
        strBuilder.clear();
        boolean z = i4 > 0;
        int size = 0;
        while (i < i2) {
            if (!z) {
                int iMo11032 = this.f15531.mo11032(i, cArr);
                if (iMo11032 > 0) {
                    m11037(strBuilder.substring(0, size), arrayList);
                    return i + iMo11032;
                }
                if (i4 <= 0 || !m11034(cArr, i, i2, i3, i4)) {
                    int iMo110322 = this.f15533.mo11032(i, cArr);
                    if (iMo110322 <= 0) {
                        iMo110322 = this.f15534.mo11032(i, cArr);
                        if (iMo110322 > 0) {
                            strBuilder.append(cArr, i, iMo110322);
                        } else {
                            strBuilder.append(cArr[i]);
                            size = strBuilder.size();
                            i++;
                        }
                    }
                    i += iMo110322;
                } else {
                    i += i4;
                    z = true;
                }
            } else if (m11034(cArr, i, i2, i3, i4)) {
                int i5 = i + i4;
                if (m11034(cArr, i5, i2, i3, i4)) {
                    strBuilder.append(cArr, i, i4);
                    i += i4 * 2;
                    size = strBuilder.size();
                } else {
                    z = false;
                    i = i5;
                }
            } else {
                strBuilder.append(cArr[i]);
                size = strBuilder.size();
                i++;
            }
        }
        m11037(strBuilder.substring(0, size), arrayList);
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11036() {
        if (this.f15535 == null) {
            char[] cArr = this.f15537;
            String[] strArr = AbstractC5686.f15617;
            if (cArr == null) {
                this.f15535 = (String[]) mo11033(0, null).toArray(strArr);
            } else {
                this.f15535 = (String[]) mo11033(cArr.length, cArr).toArray(strArr);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11037(String str, ArrayList arrayList) {
        if (AbstractC5695.m11059(str) && this.f15532) {
            return;
        }
        arrayList.add(str);
    }
}
