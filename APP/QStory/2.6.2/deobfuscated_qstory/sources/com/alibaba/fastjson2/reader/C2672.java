package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2672 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final long f8030;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long f8031;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long f8032;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long f8033;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final long f8034;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long f8035;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8036;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8037;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8038;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8039;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8040;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8041;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC2761 f8042;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2761 f8043;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2761 f8044;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2761 f8045;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2761 f8046;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8047;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final AbstractC2761 f8048;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final AbstractC2761 f8049;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final AbstractC2761 f8050;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final AbstractC2761 f8051;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final AbstractC2761 f8052;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC2761 f8053;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final long f8054;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final long f8055;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final long f8056;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final long f8057;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final long f8058;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final long f8059;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final long f8060;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final long f8061;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final long f8062;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final long f8063;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final long f8064;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final long f8065;

    public C2672(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2761... abstractC2761Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2761Arr);
        AbstractC2761 abstractC2761 = abstractC2761Arr[0];
        this.f8047 = abstractC2761;
        AbstractC2761 abstractC27612 = abstractC2761Arr[1];
        this.f8046 = abstractC27612;
        AbstractC2761 abstractC27613 = abstractC2761Arr[2];
        this.f8045 = abstractC27613;
        AbstractC2761 abstractC27614 = abstractC2761Arr[3];
        this.f8044 = abstractC27614;
        AbstractC2761 abstractC27615 = abstractC2761Arr[4];
        this.f8043 = abstractC27615;
        AbstractC2761 abstractC27616 = abstractC2761Arr[5];
        this.f8042 = abstractC27616;
        AbstractC2761 abstractC27617 = abstractC2761Arr[6];
        this.f8053 = abstractC27617;
        AbstractC2761 abstractC27618 = abstractC2761Arr[7];
        this.f8052 = abstractC27618;
        AbstractC2761 abstractC27619 = abstractC2761Arr[8];
        this.f8051 = abstractC27619;
        AbstractC2761 abstractC276110 = abstractC2761Arr[9];
        this.f8050 = abstractC276110;
        AbstractC2761 abstractC276111 = abstractC2761Arr[10];
        this.f8049 = abstractC276111;
        AbstractC2761 abstractC276112 = abstractC2761Arr[11];
        this.f8048 = abstractC276112;
        this.f8039 = abstractC2761.f8409;
        this.f8038 = abstractC27612.f8409;
        this.f8041 = abstractC27613.f8409;
        this.f8040 = abstractC27614.f8409;
        this.f8036 = abstractC27615.f8409;
        this.f8037 = abstractC27616.f8409;
        this.f8033 = abstractC27617.f8409;
        this.f8032 = abstractC27618.f8409;
        this.f8035 = abstractC27619.f8409;
        this.f8034 = abstractC276110.f8409;
        this.f8030 = abstractC276111.f8409;
        this.f8031 = abstractC276112.f8409;
        this.f8061 = abstractC2761.f8408;
        this.f8060 = abstractC27612.f8408;
        this.f8064 = abstractC27613.f8408;
        this.f8065 = abstractC27614.f8408;
        this.f8062 = abstractC27615.f8408;
        this.f8063 = abstractC27616.f8408;
        this.f8059 = abstractC27617.f8408;
        this.f8058 = abstractC27618.f8408;
        this.f8057 = abstractC27619.f8408;
        this.f8056 = abstractC276110.f8408;
        this.f8055 = abstractC276111.f8408;
        this.f8054 = abstractC276112.f8408;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2761 mo5419(long j) {
        if (j == this.f8061) {
            return this.f8047;
        }
        if (j == this.f8060) {
            return this.f8046;
        }
        if (j == this.f8064) {
            return this.f8045;
        }
        if (j == this.f8065) {
            return this.f8044;
        }
        if (j == this.f8062) {
            return this.f8043;
        }
        if (j == this.f8063) {
            return this.f8042;
        }
        if (j == this.f8059) {
            return this.f8053;
        }
        if (j == this.f8058) {
            return this.f8052;
        }
        if (j == this.f8057) {
            return this.f8051;
        }
        if (j == this.f8056) {
            return this.f8050;
        }
        if (j == this.f8055) {
            return this.f8049;
        }
        if (j == this.f8054) {
            return this.f8048;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2761 mo5420(long j) {
        if (j == this.f8039) {
            return this.f8047;
        }
        if (j == this.f8038) {
            return this.f8046;
        }
        if (j == this.f8041) {
            return this.f8045;
        }
        if (j == this.f8040) {
            return this.f8044;
        }
        if (j == this.f8036) {
            return this.f8043;
        }
        if (j == this.f8037) {
            return this.f8042;
        }
        if (j == this.f8033) {
            return this.f8053;
        }
        if (j == this.f8032) {
            return this.f8052;
        }
        if (j == this.f8035) {
            return this.f8051;
        }
        if (j == this.f8034) {
            return this.f8050;
        }
        if (j == this.f8030) {
            return this.f8049;
        }
        if (j == this.f8031) {
            return this.f8048;
        }
        return null;
    }
}
