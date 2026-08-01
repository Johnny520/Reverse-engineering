package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2673 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final long f8032;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final long f8033;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final long f8034;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final long f8035;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final long f8036;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final long f8037;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final long f8038;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final long f8039;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final long f8040;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final long f8041;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long f8042;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long f8043;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final AbstractC2762 f8044;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final AbstractC2762 f8045;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final AbstractC2762 f8046;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final AbstractC2762 f8047;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8048;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8049;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final AbstractC2762 f8050;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final AbstractC2762 f8051;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final AbstractC2762 f8052;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final AbstractC2762 f8053;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final AbstractC2762 f8054;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final AbstractC2762 f8055;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final long f8056;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final long f8057;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final long f8058;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final long f8059;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final long f8060;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final long f8061;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final long f8062;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final long f8063;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final long f8064;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final long f8065;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final long f8066;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final long f8067;

    public C2673(Class cls, long j, JSONSchema jSONSchema, Supplier supplier, Function function, AbstractC2762... abstractC2762Arr) {
        super(cls, null, null, j, jSONSchema, supplier, function, abstractC2762Arr);
        AbstractC2762 abstractC2762 = abstractC2762Arr[0];
        this.f8049 = abstractC2762;
        AbstractC2762 abstractC27622 = abstractC2762Arr[1];
        this.f8048 = abstractC27622;
        AbstractC2762 abstractC27623 = abstractC2762Arr[2];
        this.f8047 = abstractC27623;
        AbstractC2762 abstractC27624 = abstractC2762Arr[3];
        this.f8046 = abstractC27624;
        AbstractC2762 abstractC27625 = abstractC2762Arr[4];
        this.f8045 = abstractC27625;
        AbstractC2762 abstractC27626 = abstractC2762Arr[5];
        this.f8044 = abstractC27626;
        AbstractC2762 abstractC27627 = abstractC2762Arr[6];
        this.f8055 = abstractC27627;
        AbstractC2762 abstractC27628 = abstractC2762Arr[7];
        this.f8054 = abstractC27628;
        AbstractC2762 abstractC27629 = abstractC2762Arr[8];
        this.f8053 = abstractC27629;
        AbstractC2762 abstractC276210 = abstractC2762Arr[9];
        this.f8052 = abstractC276210;
        AbstractC2762 abstractC276211 = abstractC2762Arr[10];
        this.f8051 = abstractC276211;
        AbstractC2762 abstractC276212 = abstractC2762Arr[11];
        this.f8050 = abstractC276212;
        this.f8041 = abstractC2762.f8411;
        this.f8040 = abstractC27622.f8411;
        this.f8043 = abstractC27623.f8411;
        this.f8042 = abstractC27624.f8411;
        this.f8038 = abstractC27625.f8411;
        this.f8039 = abstractC27626.f8411;
        this.f8035 = abstractC27627.f8411;
        this.f8034 = abstractC27628.f8411;
        this.f8037 = abstractC27629.f8411;
        this.f8036 = abstractC276210.f8411;
        this.f8032 = abstractC276211.f8411;
        this.f8033 = abstractC276212.f8411;
        this.f8063 = abstractC2762.f8410;
        this.f8062 = abstractC27622.f8410;
        this.f8066 = abstractC27623.f8410;
        this.f8067 = abstractC27624.f8410;
        this.f8064 = abstractC27625.f8410;
        this.f8065 = abstractC27626.f8410;
        this.f8061 = abstractC27627.f8410;
        this.f8060 = abstractC27628.f8410;
        this.f8059 = abstractC27629.f8410;
        this.f8058 = abstractC276210.f8410;
        this.f8057 = abstractC276211.f8410;
        this.f8056 = abstractC276212.f8410;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC2762 mo5464(long j) {
        if (j == this.f8063) {
            return this.f8049;
        }
        if (j == this.f8062) {
            return this.f8048;
        }
        if (j == this.f8066) {
            return this.f8047;
        }
        if (j == this.f8067) {
            return this.f8046;
        }
        if (j == this.f8064) {
            return this.f8045;
        }
        if (j == this.f8065) {
            return this.f8044;
        }
        if (j == this.f8061) {
            return this.f8055;
        }
        if (j == this.f8060) {
            return this.f8054;
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
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC2762 mo5465(long j) {
        if (j == this.f8041) {
            return this.f8049;
        }
        if (j == this.f8040) {
            return this.f8048;
        }
        if (j == this.f8043) {
            return this.f8047;
        }
        if (j == this.f8042) {
            return this.f8046;
        }
        if (j == this.f8038) {
            return this.f8045;
        }
        if (j == this.f8039) {
            return this.f8044;
        }
        if (j == this.f8035) {
            return this.f8055;
        }
        if (j == this.f8034) {
            return this.f8054;
        }
        if (j == this.f8037) {
            return this.f8053;
        }
        if (j == this.f8036) {
            return this.f8052;
        }
        if (j == this.f8032) {
            return this.f8051;
        }
        if (j == this.f8033) {
            return this.f8050;
        }
        return null;
    }
}
