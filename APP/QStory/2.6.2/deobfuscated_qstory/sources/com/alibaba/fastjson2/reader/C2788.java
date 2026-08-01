package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2788 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long f8585;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long f8586;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long f8587;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8588;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8589;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8590;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8591;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8592;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8593;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC2761 f8594;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2761 f8595;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2761 f8596;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2761 f8597;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2761 f8598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8599;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8600;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8601;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8602;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8603;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8604;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8605;

    public C2788(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761... abstractC2761Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2761Arr);
        AbstractC2761 abstractC2761 = abstractC2761Arr[0];
        this.f8599 = abstractC2761;
        AbstractC2761 abstractC27612 = abstractC2761Arr[1];
        this.f8598 = abstractC27612;
        AbstractC2761 abstractC27613 = abstractC2761Arr[2];
        this.f8597 = abstractC27613;
        AbstractC2761 abstractC27614 = abstractC2761Arr[3];
        this.f8596 = abstractC27614;
        AbstractC2761 abstractC27615 = abstractC2761Arr[4];
        this.f8595 = abstractC27615;
        AbstractC2761 abstractC27616 = abstractC2761Arr[5];
        this.f8594 = abstractC27616;
        AbstractC2761 abstractC27617 = abstractC2761Arr[6];
        this.f8605 = abstractC27617;
        this.f8604 = abstractC2761.f8409;
        this.f8603 = abstractC27612.f8409;
        this.f8602 = abstractC27613.f8409;
        this.f8601 = abstractC27614.f8409;
        this.f8600 = abstractC27615.f8409;
        this.f8591 = abstractC27616.f8409;
        this.f8590 = abstractC27617.f8409;
        this.f8593 = abstractC2761.f8408;
        this.f8592 = abstractC27612.f8408;
        this.f8588 = abstractC27613.f8408;
        this.f8589 = abstractC27614.f8408;
        this.f8586 = abstractC27615.f8408;
        this.f8585 = abstractC27616.f8408;
        this.f8587 = abstractC27617.f8408;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2761 mo5419(long j) {
        if (j == this.f8593) {
            return this.f8599;
        }
        if (j == this.f8592) {
            return this.f8598;
        }
        if (j == this.f8588) {
            return this.f8597;
        }
        if (j == this.f8589) {
            return this.f8596;
        }
        if (j == this.f8586) {
            return this.f8595;
        }
        if (j == this.f8585) {
            return this.f8594;
        }
        if (j == this.f8587) {
            return this.f8605;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2761 mo5420(long j) {
        if (j == this.f8604) {
            return this.f8599;
        }
        if (j == this.f8603) {
            return this.f8598;
        }
        if (j == this.f8602) {
            return this.f8597;
        }
        if (j == this.f8601) {
            return this.f8596;
        }
        if (j == this.f8600) {
            return this.f8595;
        }
        if (j == this.f8591) {
            return this.f8594;
        }
        if (j == this.f8590) {
            return this.f8605;
        }
        return null;
    }
}
