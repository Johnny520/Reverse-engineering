package kotlin.collections;

import java.util.RandomAccess;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4343 extends AbstractC4330 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int[] f12927;

    public C4343(int[] iArr) {
        this.f12927 = iArr;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f12927;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (iIntValue == iArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.f12927[i]);
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        return this.f12927.length;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f12927;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection
    public final boolean isEmpty() {
        return this.f12927.length == 0;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            int[] iArr = this.f12927;
            int length = iArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (iIntValue == iArr[length]) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        }
        return -1;
    }
}
