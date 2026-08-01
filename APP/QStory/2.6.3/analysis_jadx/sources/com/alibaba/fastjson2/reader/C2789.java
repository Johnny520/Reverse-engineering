package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2789 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long f8587;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long f8588;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long f8589;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8590;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8591;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8592;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8593;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8594;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8595;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC2762 f8596;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2762 f8597;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2762 f8598;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2762 f8599;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8601;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8602;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8603;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8604;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8605;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8606;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8607;

    public C2789(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762... abstractC2762Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        AbstractC2762 abstractC2762 = abstractC2762Arr[0];
        this.f8601 = abstractC2762;
        AbstractC2762 abstractC27622 = abstractC2762Arr[1];
        this.f8600 = abstractC27622;
        AbstractC2762 abstractC27623 = abstractC2762Arr[2];
        this.f8599 = abstractC27623;
        AbstractC2762 abstractC27624 = abstractC2762Arr[3];
        this.f8598 = abstractC27624;
        AbstractC2762 abstractC27625 = abstractC2762Arr[4];
        this.f8597 = abstractC27625;
        AbstractC2762 abstractC27626 = abstractC2762Arr[5];
        this.f8596 = abstractC27626;
        AbstractC2762 abstractC27627 = abstractC2762Arr[6];
        this.f8607 = abstractC27627;
        this.f8606 = abstractC2762.f8411;
        this.f8605 = abstractC27622.f8411;
        this.f8604 = abstractC27623.f8411;
        this.f8603 = abstractC27624.f8411;
        this.f8602 = abstractC27625.f8411;
        this.f8593 = abstractC27626.f8411;
        this.f8592 = abstractC27627.f8411;
        this.f8595 = abstractC2762.f8410;
        this.f8594 = abstractC27622.f8410;
        this.f8590 = abstractC27623.f8410;
        this.f8591 = abstractC27624.f8410;
        this.f8588 = abstractC27625.f8410;
        this.f8587 = abstractC27626.f8410;
        this.f8589 = abstractC27627.f8410;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2762 mo5464(long j) {
        if (j == this.f8595) {
            return this.f8601;
        }
        if (j == this.f8594) {
            return this.f8600;
        }
        if (j == this.f8590) {
            return this.f8599;
        }
        if (j == this.f8591) {
            return this.f8598;
        }
        if (j == this.f8588) {
            return this.f8597;
        }
        if (j == this.f8587) {
            return this.f8596;
        }
        if (j == this.f8589) {
            return this.f8607;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2762 mo5465(long j) {
        if (j == this.f8606) {
            return this.f8601;
        }
        if (j == this.f8605) {
            return this.f8600;
        }
        if (j == this.f8604) {
            return this.f8599;
        }
        if (j == this.f8603) {
            return this.f8598;
        }
        if (j == this.f8602) {
            return this.f8597;
        }
        if (j == this.f8593) {
            return this.f8596;
        }
        if (j == this.f8592) {
            return this.f8607;
        }
        return null;
    }
}
