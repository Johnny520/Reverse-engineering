package kotlin.text;

import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5979 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15036;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15037;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15038;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15039;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f15040;

    public C5979(String str) {
        this.f15040 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f15038;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f15036 < 0) {
            this.f15038 = 2;
            return false;
        }
        String str = this.f15040;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.f15039; i4 < length2; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f15038 = 1;
                this.f15036 = i;
                this.f15037 = length;
                return true;
            }
        }
        i = -1;
        this.f15038 = 1;
        this.f15036 = i;
        this.f15037 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C3466.m5896();
            return null;
        }
        this.f15038 = 0;
        int i = this.f15037;
        int i2 = this.f15039;
        this.f15039 = this.f15036 + i;
        return this.f15040.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
