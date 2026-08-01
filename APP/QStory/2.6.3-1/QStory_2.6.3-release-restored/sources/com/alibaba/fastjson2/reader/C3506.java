package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3506 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final long f8377;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long f8378;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long f8379;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long f8380;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final long f8381;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long f8382;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8383;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8384;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8385;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8386;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8387;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8388;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC3595 f8389;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC3595 f8390;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC3595 f8391;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC3595 f8392;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC3595 f8393;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8394;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final AbstractC3595 f8395;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final AbstractC3595 f8396;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final AbstractC3595 f8397;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final AbstractC3595 f8398;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final AbstractC3595 f8399;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC3595 f8400;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final long f8401;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final long f8402;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final long f8403;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final long f8404;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final long f8405;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final long f8406;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final long f8407;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final long f8408;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final long f8409;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final long f8410;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final long f8411;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final long f8412;

    public C3506(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC3595... abstractC3595Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC3595Arr);
        AbstractC3595 abstractC3595 = abstractC3595Arr[0];
        this.f8394 = abstractC3595;
        AbstractC3595 abstractC35952 = abstractC3595Arr[1];
        this.f8393 = abstractC35952;
        AbstractC3595 abstractC35953 = abstractC3595Arr[2];
        this.f8392 = abstractC35953;
        AbstractC3595 abstractC35954 = abstractC3595Arr[3];
        this.f8391 = abstractC35954;
        AbstractC3595 abstractC35955 = abstractC3595Arr[4];
        this.f8390 = abstractC35955;
        AbstractC3595 abstractC35956 = abstractC3595Arr[5];
        this.f8389 = abstractC35956;
        AbstractC3595 abstractC35957 = abstractC3595Arr[6];
        this.f8400 = abstractC35957;
        AbstractC3595 abstractC35958 = abstractC3595Arr[7];
        this.f8399 = abstractC35958;
        AbstractC3595 abstractC35959 = abstractC3595Arr[8];
        this.f8398 = abstractC35959;
        AbstractC3595 abstractC359510 = abstractC3595Arr[9];
        this.f8397 = abstractC359510;
        AbstractC3595 abstractC359511 = abstractC3595Arr[10];
        this.f8396 = abstractC359511;
        AbstractC3595 abstractC359512 = abstractC3595Arr[11];
        this.f8395 = abstractC359512;
        this.f8386 = abstractC3595.f8756;
        this.f8385 = abstractC35952.f8756;
        this.f8388 = abstractC35953.f8756;
        this.f8387 = abstractC35954.f8756;
        this.f8383 = abstractC35955.f8756;
        this.f8384 = abstractC35956.f8756;
        this.f8380 = abstractC35957.f8756;
        this.f8379 = abstractC35958.f8756;
        this.f8382 = abstractC35959.f8756;
        this.f8381 = abstractC359510.f8756;
        this.f8377 = abstractC359511.f8756;
        this.f8378 = abstractC359512.f8756;
        this.f8408 = abstractC3595.f8755;
        this.f8407 = abstractC35952.f8755;
        this.f8411 = abstractC35953.f8755;
        this.f8412 = abstractC35954.f8755;
        this.f8409 = abstractC35955.f8755;
        this.f8410 = abstractC35956.f8755;
        this.f8406 = abstractC35957.f8755;
        this.f8405 = abstractC35958.f8755;
        this.f8404 = abstractC35959.f8755;
        this.f8403 = abstractC359510.f8755;
        this.f8402 = abstractC359511.f8755;
        this.f8401 = abstractC359512.f8755;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3595 mo6024(long j) {
        if (j == this.f8408) {
            return this.f8394;
        }
        if (j == this.f8407) {
            return this.f8393;
        }
        if (j == this.f8411) {
            return this.f8392;
        }
        if (j == this.f8412) {
            return this.f8391;
        }
        if (j == this.f8409) {
            return this.f8390;
        }
        if (j == this.f8410) {
            return this.f8389;
        }
        if (j == this.f8406) {
            return this.f8400;
        }
        if (j == this.f8405) {
            return this.f8399;
        }
        if (j == this.f8404) {
            return this.f8398;
        }
        if (j == this.f8403) {
            return this.f8397;
        }
        if (j == this.f8402) {
            return this.f8396;
        }
        if (j == this.f8401) {
            return this.f8395;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC3595 mo6025(long j) {
        if (j == this.f8386) {
            return this.f8394;
        }
        if (j == this.f8385) {
            return this.f8393;
        }
        if (j == this.f8388) {
            return this.f8392;
        }
        if (j == this.f8387) {
            return this.f8391;
        }
        if (j == this.f8383) {
            return this.f8390;
        }
        if (j == this.f8384) {
            return this.f8389;
        }
        if (j == this.f8380) {
            return this.f8400;
        }
        if (j == this.f8379) {
            return this.f8399;
        }
        if (j == this.f8382) {
            return this.f8398;
        }
        if (j == this.f8381) {
            return this.f8397;
        }
        if (j == this.f8377) {
            return this.f8396;
        }
        if (j == this.f8378) {
            return this.f8395;
        }
        return null;
    }
}
