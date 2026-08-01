package org.apache.commons.lang3.text;

import java.util.Arrays;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6472 extends AbstractC6478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final char[] f15868;

    public C6472(char[] cArr) {
        char[] cArr2 = (char[]) cArr.clone();
        Arrays.sort(cArr2);
        this.f15868 = cArr2;
    }

    @Override // org.apache.commons.lang3.text.AbstractC6478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11591(int i, char[] cArr) {
        return Arrays.binarySearch(this.f15868, cArr[i]) >= 0 ? 1 : 0;
    }
}
