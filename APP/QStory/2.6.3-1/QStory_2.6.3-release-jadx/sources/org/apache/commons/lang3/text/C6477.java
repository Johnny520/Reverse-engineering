package org.apache.commons.lang3.text;

import bsh.C3466;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.lang3.AbstractC6516;
import org.apache.commons.lang3.AbstractC6525;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6477 implements ListIterator, Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public AbstractC6478 f15875;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC6478 f15876 = AbstractC6478.f15886;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15877;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AbstractC6478 f15878;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC6478 f15879;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String[] f15880;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15881;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public char[] f15882;

    static {
        C6477 c6477 = new C6477();
        c6477.f15876 = AbstractC6478.f15888;
        C6473 c6473 = AbstractC6478.f15884;
        if (c6473 != null) {
            c6477.f15875 = c6473;
        }
        C6471 c6471 = AbstractC6478.f15883;
        if (c6471 != null) {
            c6477.f15878 = c6471;
        }
        C6471 c64712 = AbstractC6478.f15885;
        if (c64712 != null) {
            c6477.f15879 = c64712;
        }
        c6477.f15877 = false;
        C6477 c64772 = new C6477();
        c64772.f15876 = AbstractC6478.f15887;
        if (c6473 != null) {
            c64772.f15875 = c6473;
        }
        if (c6471 != null) {
            c64772.f15878 = c6471;
        }
        if (c64712 != null) {
            c64772.f15879 = c64712;
        }
        c64772.f15877 = false;
    }

    public C6477() {
        C6471 c6471 = AbstractC6478.f15883;
        this.f15875 = c6471;
        this.f15878 = c6471;
        this.f15879 = c6471;
        this.f15877 = true;
        this.f15882 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m11593(char[] cArr, int i, int i2, int i3, int i4) {
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
            C6477 c6477 = (C6477) super.clone();
            char[] cArr = c6477.f15882;
            if (cArr != null) {
                c6477.f15882 = (char[]) cArr.clone();
            }
            c6477.f15881 = 0;
            c6477.f15880 = null;
            return c6477;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        m11595();
        return this.f15881 < this.f15880.length;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m11595();
        return this.f15881 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        String[] strArr = this.f15880;
        int i = this.f15881;
        this.f15881 = i + 1;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15881;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C3466.m5896();
            return null;
        }
        String[] strArr = this.f15880;
        int i = this.f15881 - 1;
        this.f15881 = i;
        return strArr[i];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15881 - 1;
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
        if (this.f15880 == null) {
            return "StrTokenizer[not tokenized yet]";
        }
        StringBuilder sb = new StringBuilder("StrTokenizer");
        m11595();
        ArrayList arrayList = new ArrayList(this.f15880.length);
        arrayList.addAll(Arrays.asList(this.f15880));
        sb.append(arrayList);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public List mo11592(int i, char[] cArr) {
        C6477 c6477;
        int i2;
        char[] cArr2;
        int iM11594;
        if (AbstractC6516.m11611(cArr)) {
            return Collections.EMPTY_LIST;
        }
        StrBuilder strBuilder = new StrBuilder();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 >= 0 && i3 < i) {
            int i4 = i3;
            while (i4 < i) {
                int iMax = Math.max(this.f15878.mo11591(i4, cArr), this.f15879.mo11591(i4, cArr));
                if (iMax == 0 || this.f15876.mo11591(i4, cArr) > 0 || this.f15875.mo11591(i4, cArr) > 0) {
                    break;
                }
                i4 += iMax;
            }
            if (i4 >= i) {
                this.m11596("", arrayList);
                c6477 = this;
                iM11594 = -1;
                i2 = i;
                cArr2 = cArr;
            } else {
                int iMo11591 = this.f15876.mo11591(i4, cArr);
                if (iMo11591 > 0) {
                    this.m11596("", arrayList);
                    int i5 = i4 + iMo11591;
                    c6477 = this;
                    i2 = i;
                    cArr2 = cArr;
                    iM11594 = i5;
                } else {
                    int iMo115912 = this.f15875.mo11591(i4, cArr);
                    if (iMo115912 > 0) {
                        int i6 = i4;
                        c6477 = this;
                        i2 = i;
                        cArr2 = cArr;
                        iM11594 = c6477.m11594(cArr2, i6 + iMo115912, i2, strBuilder, arrayList, i6, iMo115912);
                    } else {
                        c6477 = this;
                        i2 = i;
                        cArr2 = cArr;
                        iM11594 = c6477.m11594(cArr2, i4, i2, strBuilder, arrayList, 0, 0);
                    }
                }
            }
            if (iM11594 >= i2) {
                c6477.m11596("", arrayList);
            }
            C6477 c64772 = c6477;
            i3 = iM11594;
            this = c64772;
            cArr = cArr2;
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m11594(char[] cArr, int i, int i2, StrBuilder strBuilder, ArrayList arrayList, int i3, int i4) {
        strBuilder.clear();
        boolean z = i4 > 0;
        int size = 0;
        while (i < i2) {
            if (!z) {
                int iMo11591 = this.f15876.mo11591(i, cArr);
                if (iMo11591 > 0) {
                    m11596(strBuilder.substring(0, size), arrayList);
                    return i + iMo11591;
                }
                if (i4 <= 0 || !m11593(cArr, i, i2, i3, i4)) {
                    int iMo115912 = this.f15878.mo11591(i, cArr);
                    if (iMo115912 <= 0) {
                        iMo115912 = this.f15879.mo11591(i, cArr);
                        if (iMo115912 > 0) {
                            strBuilder.append(cArr, i, iMo115912);
                        } else {
                            strBuilder.append(cArr[i]);
                            size = strBuilder.size();
                            i++;
                        }
                    }
                    i += iMo115912;
                } else {
                    i += i4;
                    z = true;
                }
            } else if (m11593(cArr, i, i2, i3, i4)) {
                int i5 = i + i4;
                if (m11593(cArr, i5, i2, i3, i4)) {
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
        m11596(strBuilder.substring(0, size), arrayList);
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11595() {
        if (this.f15880 == null) {
            char[] cArr = this.f15882;
            String[] strArr = AbstractC6516.f15962;
            if (cArr == null) {
                this.f15880 = (String[]) mo11592(0, null).toArray(strArr);
            } else {
                this.f15880 = (String[]) mo11592(cArr.length, cArr).toArray(strArr);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11596(String str, ArrayList arrayList) {
        if (AbstractC6525.m11618(str) && this.f15877) {
            return;
        }
        arrayList.add(str);
    }
}
