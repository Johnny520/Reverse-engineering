package io.ktor.http.cio.internals;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import p025.AbstractC7012;
import p073.InterfaceC7680;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4785 implements CharSequence, Appendable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f12510;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f12511;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f12512;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f12513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ArrayList f12514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public char[] f12515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7680 f12516;

    public C4785() {
        InterfaceC7680 interfaceC7680 = AbstractC4783.f12509;
        interfaceC7680.getClass();
        this.f12516 = interfaceC7680;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] cArrM8897 = m8897();
            int length = cArrM8897.length;
            int i4 = this.f12512;
            int i5 = length - i4;
            int iMin = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < iMin; i6++) {
                cArrM8897[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += iMin;
            this.f12512 -= iMin;
        }
        this.f12511 = null;
        this.f12513 = (i2 - i) + this.f12513;
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "index is negative: "));
            return (char) 0;
        }
        if (i < this.f12513) {
            return m8898(i);
        }
        C6755.m11873(AbstractC0900.m716(AbstractC0900.m710(i, "index ", " is not in range [0, "), this.f12513, ')'));
        return (char) 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f12513 == charSequence.length()) {
                int i = this.f12513;
                for (int i2 = 0; i2 < i; i2++) {
                    if (m8898(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12511;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f12513;
        int iM8898 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM8898 = (iM8898 * 31) + m8898(i2);
        }
        return iM8898;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12513;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
        }
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "startIndex is negative: "));
            return null;
        }
        if (i2 <= this.f12513) {
            return new C4786(this, i, i2);
        }
        C6755.m11873(AbstractC0900.m716(AbstractC0900.m710(i2, "endIndex (", ") is greater than length ("), this.f12513, ')'));
        return null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f12511;
        if (str != null) {
            return str;
        }
        String string = m8899(0, this.f12513).toString();
        this.f12511 = string;
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8895(int i) {
        if (this.f12510) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.f12515;
        cArr.getClass();
        sb.append(cArr.length - this.f12512);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8896() {
        ArrayList arrayList = this.f12514;
        InterfaceC7680 interfaceC7680 = this.f12516;
        if (arrayList != null) {
            this.f12515 = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                interfaceC7680.mo8893(arrayList.get(i));
            }
        } else {
            char[] cArr = this.f12515;
            if (cArr != null) {
                interfaceC7680.mo8893(cArr);
            }
            this.f12515 = null;
        }
        this.f12510 = true;
        this.f12514 = null;
        this.f12511 = null;
        this.f12513 = 0;
        this.f12512 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final char[] m8897() {
        if (this.f12512 != 0) {
            char[] cArr = this.f12515;
            cArr.getClass();
            return cArr;
        }
        char[] cArr2 = (char[]) this.f12516.mo8894();
        char[] cArr3 = this.f12515;
        this.f12515 = cArr2;
        this.f12512 = cArr2.length;
        this.f12510 = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.f12514;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f12514 = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final char m8898(int i) {
        char[] cArrM8900 = m8900(i);
        char[] cArr = this.f12515;
        cArr.getClass();
        return cArrM8900[i % cArr.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CharSequence m8899(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrM8900 = m8900(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb.append(cArrM8900[iMax]);
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char[] m8900(int i) {
        ArrayList arrayList = this.f12514;
        if (arrayList != null) {
            char[] cArr = this.f12515;
            cArr.getClass();
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            m8895(i);
            throw null;
        }
        char[] cArr2 = this.f12515;
        if (cArr2 != null) {
            return cArr2;
        }
        m8895(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] cArrM8897 = m8897();
        char[] cArr = this.f12515;
        cArr.getClass();
        int length = cArr.length;
        int i = this.f12512;
        cArrM8897[length - i] = c;
        this.f12511 = null;
        this.f12512 = i - 1;
        this.f12513++;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
