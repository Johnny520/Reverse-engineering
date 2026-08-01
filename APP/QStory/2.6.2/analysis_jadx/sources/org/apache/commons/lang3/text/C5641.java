package org.apache.commons.lang3.text;

import java.util.Arrays;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5641 extends AbstractC5647 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final char[] f15523;

    public C5641(char[] cArr) {
        char[] cArr2 = (char[]) cArr.clone();
        Arrays.sort(cArr2);
        this.f15523 = cArr2;
    }

    @Override // org.apache.commons.lang3.text.AbstractC5647
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo10975(int i, char[] cArr) {
        return Arrays.binarySearch(this.f15523, cArr[i]) >= 0 ? 1 : 0;
    }
}
