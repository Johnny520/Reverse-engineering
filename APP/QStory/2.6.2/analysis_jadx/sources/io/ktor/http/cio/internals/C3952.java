package io.ktor.http.cio.internals;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import p007.AbstractC6136;
import p057.InterfaceC6850;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.http.cio.internals.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3952 implements CharSequence, Appendable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f12161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f12162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f12163;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f12164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ArrayList f12165;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public char[] f12166;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6850 f12167;

    public C3952() {
        InterfaceC6850 interfaceC6850 = AbstractC3950.f12160;
        interfaceC6850.getClass();
        this.f12167 = interfaceC6850;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] cArrM8348 = m8348();
            int length = cArrM8348.length;
            int i4 = this.f12163;
            int i5 = length - i4;
            int iMin = Math.min(i2 - i3, i4);
            for (int i6 = 0; i6 < iMin; i6++) {
                cArrM8348[i5 + i6] = charSequence.charAt(i3 + i6);
            }
            i3 += iMin;
            this.f12163 -= iMin;
        }
        this.f12162 = null;
        this.f12164 = (i2 - i) + this.f12164;
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "index is negative: "));
            return (char) 0;
        }
        if (i < this.f12164) {
            return m8349(i);
        }
        C5919.m11253(AbstractC0053.m154(AbstractC0053.m148(i, "index ", " is not in range [0, "), this.f12164, ')'));
        return (char) 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (this.f12164 == charSequence.length()) {
                int i = this.f12164;
                for (int i2 = 0; i2 < i; i2++) {
                    if (m8349(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12162;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f12164;
        int iM8349 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM8349 = (iM8349 * 31) + m8349(i2);
        }
        return iM8349;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12164;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + ')').toString());
        }
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "startIndex is negative: "));
            return null;
        }
        if (i2 <= this.f12164) {
            return new C3953(this, i, i2);
        }
        C5919.m11253(AbstractC0053.m154(AbstractC0053.m148(i2, "endIndex (", ") is greater than length ("), this.f12164, ')'));
        return null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f12162;
        if (str != null) {
            return str;
        }
        String string = m8350(0, this.f12164).toString();
        this.f12162 = string;
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8346(int i) {
        if (this.f12161) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not in range [0; ");
        char[] cArr = this.f12166;
        cArr.getClass();
        sb.append(cArr.length - this.f12163);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m8347() {
        ArrayList arrayList = this.f12165;
        InterfaceC6850 interfaceC6850 = this.f12167;
        if (arrayList != null) {
            this.f12166 = null;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                interfaceC6850.mo8344(arrayList.get(i));
            }
        } else {
            char[] cArr = this.f12166;
            if (cArr != null) {
                interfaceC6850.mo8344(cArr);
            }
            this.f12166 = null;
        }
        this.f12161 = true;
        this.f12165 = null;
        this.f12162 = null;
        this.f12164 = 0;
        this.f12163 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final char[] m8348() {
        if (this.f12163 != 0) {
            char[] cArr = this.f12166;
            cArr.getClass();
            return cArr;
        }
        char[] cArr2 = (char[]) this.f12167.mo8345();
        char[] cArr3 = this.f12166;
        this.f12166 = cArr2;
        this.f12163 = cArr2.length;
        this.f12161 = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.f12165;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f12165 = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final char m8349(int i) {
        char[] cArrM8351 = m8351(i);
        char[] cArr = this.f12166;
        cArr.getClass();
        return cArrM8351[i % cArr.length];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CharSequence m8350(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrM8351 = m8351(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb.append(cArrM8351[iMax]);
            }
        }
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final char[] m8351(int i) {
        ArrayList arrayList = this.f12165;
        if (arrayList != null) {
            char[] cArr = this.f12166;
            cArr.getClass();
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            m8346(i);
            throw null;
        }
        char[] cArr2 = this.f12166;
        if (cArr2 != null) {
            return cArr2;
        }
        m8346(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        char[] cArrM8348 = m8348();
        char[] cArr = this.f12166;
        cArr.getClass();
        int length = cArr.length;
        int i = this.f12163;
        cArrM8348[length - i] = c;
        this.f12162 = null;
        this.f12163 = i - 1;
        this.f12164++;
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
