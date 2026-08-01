package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3622 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long f8932;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long f8933;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long f8934;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8935;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8936;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8937;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8938;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8939;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8940;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC3595 f8941;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC3595 f8942;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC3595 f8943;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3595 f8944;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3595 f8945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8946;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final long f8947;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long f8948;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final long f8949;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long f8950;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final long f8951;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8952;

    public C3622(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC3595... abstractC3595Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC3595Arr);
        AbstractC3595 abstractC3595 = abstractC3595Arr[0];
        this.f8946 = abstractC3595;
        AbstractC3595 abstractC35952 = abstractC3595Arr[1];
        this.f8945 = abstractC35952;
        AbstractC3595 abstractC35953 = abstractC3595Arr[2];
        this.f8944 = abstractC35953;
        AbstractC3595 abstractC35954 = abstractC3595Arr[3];
        this.f8943 = abstractC35954;
        AbstractC3595 abstractC35955 = abstractC3595Arr[4];
        this.f8942 = abstractC35955;
        AbstractC3595 abstractC35956 = abstractC3595Arr[5];
        this.f8941 = abstractC35956;
        AbstractC3595 abstractC35957 = abstractC3595Arr[6];
        this.f8952 = abstractC35957;
        this.f8951 = abstractC3595.f8756;
        this.f8950 = abstractC35952.f8756;
        this.f8949 = abstractC35953.f8756;
        this.f8948 = abstractC35954.f8756;
        this.f8947 = abstractC35955.f8756;
        this.f8938 = abstractC35956.f8756;
        this.f8937 = abstractC35957.f8756;
        this.f8940 = abstractC3595.f8755;
        this.f8939 = abstractC35952.f8755;
        this.f8935 = abstractC35953.f8755;
        this.f8936 = abstractC35954.f8755;
        this.f8933 = abstractC35955.f8755;
        this.f8932 = abstractC35956.f8755;
        this.f8934 = abstractC35957.f8755;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3595 mo6024(long j) {
        if (j == this.f8940) {
            return this.f8946;
        }
        if (j == this.f8939) {
            return this.f8945;
        }
        if (j == this.f8935) {
            return this.f8944;
        }
        if (j == this.f8936) {
            return this.f8943;
        }
        if (j == this.f8933) {
            return this.f8942;
        }
        if (j == this.f8932) {
            return this.f8941;
        }
        if (j == this.f8934) {
            return this.f8952;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC3595 mo6025(long j) {
        if (j == this.f8951) {
            return this.f8946;
        }
        if (j == this.f8950) {
            return this.f8945;
        }
        if (j == this.f8949) {
            return this.f8944;
        }
        if (j == this.f8948) {
            return this.f8943;
        }
        if (j == this.f8947) {
            return this.f8942;
        }
        if (j == this.f8938) {
            return this.f8941;
        }
        if (j == this.f8937) {
            return this.f8952;
        }
        return null;
    }
}
