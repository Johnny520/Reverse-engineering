package org.apache.commons.compress.compressors.deflate64;

import androidx.compose.ui.text.input.C2019;
import com.bumptech.glide.AbstractC3057;
import p379.AbstractC8996;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5622 extends AbstractC3057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2019 f15497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2019 f15498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HuffmanState f15499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f15500;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public byte[] f15501 = AbstractC8996.f25259;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f15502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f15503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C5619 f15504;

    public C5622(C5619 c5619, HuffmanState huffmanState, int[] iArr, int[] iArr2) {
        this.f15504 = c5619;
        this.f15499 = huffmanState;
        this.f15498 = C5619.m10979(iArr);
        this.f15497 = C5619.m10979(iArr2);
    }

    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final HuffmanState mo6760() {
        return this.f15500 ? HuffmanState.INITIAL : this.f15499;
    }

    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo6761() {
        return this.f15503 - this.f15502;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        return r5;
     */
    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo6762(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.deflate64.C5622.mo6762(byte[], int, int):int");
    }

    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo6763() {
        return !this.f15500;
    }
}
