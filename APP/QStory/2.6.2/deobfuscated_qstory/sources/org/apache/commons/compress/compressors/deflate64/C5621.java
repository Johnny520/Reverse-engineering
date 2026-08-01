package org.apache.commons.compress.compressors.deflate64;

import androidx.compose.ui.text.input.C2019;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p376.AbstractC8977;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5621 extends AbstractC4921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final HuffmanState f15497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f15498;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2019 f15499;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2019 f15500;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f15501;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final /* synthetic */ C5618 f15502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f15503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public byte[] f15504;

    public C5621(C5618 c5618, HuffmanState huffmanState, int[] iArr, int[] iArr2) {
        super(8);
        this.f15502 = c5618;
        this.f15504 = AbstractC8977.f25219;
        this.f15497 = huffmanState;
        this.f15500 = C5618.m10922(iArr);
        this.f15499 = C5618.m10922(iArr2);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final HuffmanState mo9905() {
        return this.f15498 ? HuffmanState.INITIAL : this.f15497;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        return r5;
     */
    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo9906(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.compressors.deflate64.C5621.mo9906(byte[], int, int):int");
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9907() {
        return !this.f15498;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo9912() {
        return this.f15501 - this.f15503;
    }
}
