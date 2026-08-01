package io.ktor.http.cio.internals;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import p009.AbstractC6183;
import p057.InterfaceC6851;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3953 implements CharSequence, Appendable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f12165;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f12166;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f12167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f12168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ArrayList f12169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public char[] f12170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6851 f12171;

    public C3953() {
        InterfaceC6851 interfaceC6851 = AbstractC3951.f12164;
        interfaceC6851.getClass();
        this.f12171 = interfaceC6851;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] cArrM8338 = m8338();
            int length = cArrM8338.length;
            int i4 = this.f12167;
            int i5 = length - i4;
            int iMin = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < iMin; i6++) {
                cArrM8338[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += iMin;
            this.f12167 -= iMin;
        }
        this.f12166 = null;
        this.f12168 = (i2 - i) + this.f12168;
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "index is negative: "));
            return (char) 0;
        }
        if (i < this.f12168) {
            return m8339(i);
        }
        C5925.m11314(AbstractC0053.m156(AbstractC0053.m150(i, "index ", " is not in range [0, "), this.f12168, ')'));
        return (char) 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f12168 == charSequence.length()) {
                int i = this.f12168;
                for (int i2 = 0; i2 < i; i2++) {
                    if (m8339(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12166;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f12168;
        int iM8339 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM8339 = (iM8339 * 31) + m8339(i2);
        }
        return iM8339;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12168;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
        }
        if (i < 0) {
            C5925.m11314(AbstractC6183.m11588(i, "startIndex is negative: "));
            return null;
        }
        if (i2 <= this.f12168) {
            return new C3954(this, i, i2);
        }
        C5925.m11314(AbstractC0053.m156(AbstractC0053.m150(i2, "endIndex (", ") is greater than length ("), this.f12168, ')'));
        return null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f12166;
        if (str != null) {
            return str;
        }
        String string = m8340(0, this.f12168).toString();
        this.f12166 = string;
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8336(int i) {
        if (this.f12165) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.f12170;
        cArr.getClass();
        sb.append(cArr.length - this.f12167);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8337() {
        ArrayList arrayList = this.f12169;
        InterfaceC6851 interfaceC6851 = this.f12171;
        if (arrayList != null) {
            this.f12170 = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                interfaceC6851.mo8334(arrayList.get(i));
            }
        } else {
            char[] cArr = this.f12170;
            if (cArr != null) {
                interfaceC6851.mo8334(cArr);
            }
            this.f12170 = null;
        }
        this.f12165 = true;
        this.f12169 = null;
        this.f12166 = null;
        this.f12168 = 0;
        this.f12167 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final char[] m8338() {
        if (this.f12167 != 0) {
            char[] cArr = this.f12170;
            cArr.getClass();
            return cArr;
        }
        char[] cArr2 = (char[]) this.f12171.mo8335();
        char[] cArr3 = this.f12170;
        this.f12170 = cArr2;
        this.f12167 = cArr2.length;
        this.f12165 = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.f12169;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f12169 = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final char m8339(int i) {
        char[] cArrM8341 = m8341(i);
        char[] cArr = this.f12170;
        cArr.getClass();
        return cArrM8341[i % cArr.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CharSequence m8340(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrM8341 = m8341(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb.append(cArrM8341[iMax]);
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char[] m8341(int i) {
        ArrayList arrayList = this.f12169;
        if (arrayList != null) {
            char[] cArr = this.f12170;
            cArr.getClass();
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            m8336(i);
            throw null;
        }
        char[] cArr2 = this.f12170;
        if (cArr2 != null) {
            return cArr2;
        }
        m8336(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] cArrM8338 = m8338();
        char[] cArr = this.f12170;
        cArr.getClass();
        int length = cArr.length;
        int i = this.f12167;
        cArrM8338[length - i] = c;
        this.f12166 = null;
        this.f12167 = i - 1;
        this.f12168++;
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
