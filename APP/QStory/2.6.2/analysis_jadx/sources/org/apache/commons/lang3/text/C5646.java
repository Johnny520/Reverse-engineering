package org.apache.commons.lang3.text;

import bsh.C2632;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.lang3.AbstractC5685;
import org.apache.commons.lang3.AbstractC5694;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5646 implements ListIterator, Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public AbstractC5647 f15530;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC5647 f15531 = AbstractC5647.f15541;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC5647 f15533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC5647 f15534;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String[] f15535;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15536;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char[] f15537;

    static {
        C5646 c5646 = new C5646();
        c5646.f15531 = AbstractC5647.f15543;
        C5642 c5642 = AbstractC5647.f15539;
        if (c5642 != null) {
            c5646.f15530 = c5642;
        }
        C5640 c5640 = AbstractC5647.f15538;
        if (c5640 != null) {
            c5646.f15533 = c5640;
        }
        C5640 c56402 = AbstractC5647.f15540;
        if (c56402 != null) {
            c5646.f15534 = c56402;
        }
        c5646.f15532 = false;
        C5646 c56462 = new C5646();
        c56462.f15531 = AbstractC5647.f15542;
        if (c5642 != null) {
            c56462.f15530 = c5642;
        }
        if (c5640 != null) {
            c56462.f15533 = c5640;
        }
        if (c56402 != null) {
            c56462.f15534 = c56402;
        }
        c56462.f15532 = false;
    }

    public C5646() {
        C5640 c5640 = AbstractC5647.f15538;
        this.f15530 = c5640;
        this.f15533 = c5640;
        this.f15534 = c5640;
        this.f15532 = true;
        this.f15537 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m10977(char[] cArr, int i, int i2, int i3, int i4) {
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
            C5646 c5646 = (C5646) super.clone();
            char[] cArr = c5646.f15537;
            if (cArr != null) {
                c5646.f15537 = (char[]) cArr.clone();
            }
            c5646.f15536 = 0;
            c5646.f15535 = null;
            return c5646;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        m10979();
        return this.f15536 < this.f15535.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m10979();
        return this.f15536 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C2632.m5291();
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
            C2632.m5291();
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
        m10979();
        ArrayList arrayList = new ArrayList(this.f15535.length);
        arrayList.addAll(Arrays.asList(this.f15535));
        sb.append(arrayList);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List mo10976(int i, char[] cArr) {
        C5646 c5646;
        int i2;
        char[] cArr2;
        int iM10978;
        if (AbstractC5685.m10995(cArr)) {
            return Collections.EMPTY_LIST;
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 >= 0 && i3 < i) {
            int i4 = i3;
            while (i4 < i) {
                int iMax = Math.max(this.f15533.mo10975(i4, cArr), this.f15534.mo10975(i4, cArr));
                if (iMax == 0 || this.f15531.mo10975(i4, cArr) > 0 || this.f15530.mo10975(i4, cArr) > 0) {
                    break;
                }
                i4 += iMax;
            }
            if (i4 >= i) {
                this.m10980("", arrayList);
                c5646 = this;
                iM10978 = -1;
                i2 = i;
                cArr2 = cArr;
            } else {
                int iMo10975 = this.f15531.mo10975(i4, cArr);
                if (iMo10975 > 0) {
                    this.m10980("", arrayList);
                    int i5 = i4 + iMo10975;
                    c5646 = this;
                    i2 = i;
                    cArr2 = cArr;
                    iM10978 = i5;
                } else {
                    int iMo109752 = this.f15530.mo10975(i4, cArr);
                    if (iMo109752 > 0) {
                        int i6 = i4;
                        c5646 = this;
                        i2 = i;
                        cArr2 = cArr;
                        iM10978 = c5646.m10978(cArr2, i6 + iMo109752, i2, strBuilder, arrayList, i6, iMo109752);
                    } else {
                        c5646 = this;
                        i2 = i;
                        cArr2 = cArr;
                        iM10978 = c5646.m10978(cArr2, i4, i2, strBuilder, arrayList, 0, 0);
                    }
                }
            }
            if (iM10978 >= i2) {
                c5646.m10980("", arrayList);
            }
            C5646 c56462 = c5646;
            i3 = iM10978;
            this = c56462;
            cArr = cArr2;
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m10978(char[] cArr, int i, int i2, StrBuilder strBuilder, ArrayList arrayList, int i3, int i4) {
        strBuilder.clear();
        boolean z = i4 > 0;
        int size = 0;
        while (i < i2) {
            if (!z) {
                int iMo10975 = this.f15531.mo10975(i, cArr);
                if (iMo10975 > 0) {
                    m10980(strBuilder.substring(0, size), arrayList);
                    return i + iMo10975;
                }
                if (i4 <= 0 || !m10977(cArr, i, i2, i3, i4)) {
                    int iMo109752 = this.f15533.mo10975(i, cArr);
                    if (iMo109752 <= 0) {
                        iMo109752 = this.f15534.mo10975(i, cArr);
                        if (iMo109752 > 0) {
                            strBuilder.append(cArr, i, iMo109752);
                        } else {
                            strBuilder.append(cArr[i]);
                            size = strBuilder.size();
                            i++;
                        }
                    }
                    i += iMo109752;
                } else {
                    i += i4;
                    z = true;
                }
            } else if (m10977(cArr, i, i2, i3, i4)) {
                int i5 = i + i4;
                if (m10977(cArr, i5, i2, i3, i4)) {
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
        m10980(strBuilder.substring(0, size), arrayList);
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m10979() {
        if (this.f15535 == null) {
            char[] cArr = this.f15537;
            String[] strArr = AbstractC5685.f15617;
            if (cArr == null) {
                this.f15535 = (String[]) mo10976(0, null).toArray(strArr);
            } else {
                this.f15535 = (String[]) mo10976(cArr.length, cArr).toArray(strArr);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m10980(String str, ArrayList arrayList) {
        if (AbstractC5694.m11002(str) && this.f15532) {
            return;
        }
        arrayList.add(str);
    }
}
