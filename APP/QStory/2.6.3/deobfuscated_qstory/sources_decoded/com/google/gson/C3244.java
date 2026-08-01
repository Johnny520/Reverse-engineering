package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3244 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10914;

    public /* synthetic */ C3244(int i) {
        this.f10914 = i;
    }

    public String toString() {
        switch (this.f10914) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        switch (this.f10914) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C3253.m7336(dDoubleValue);
                    c8244.m13777(dDoubleValue);
                } else {
                    c8244.m13778();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C3253.m7336(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c8244.m13768(numberValueOf);
                } else {
                    c8244.m13778();
                }
                break;
            default:
                c8244.m13778();
                break;
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        switch (this.f10914) {
            case 0:
                if (c8245.m13787() != JsonToken.NULL) {
                    return Double.valueOf(c8245.m13799());
                }
                c8245.m13793();
                return null;
            case 1:
                if (c8245.m13787() != JsonToken.NULL) {
                    return Float.valueOf((float) c8245.m13799());
                }
                c8245.m13793();
                return null;
            default:
                c8245.m13811();
                return null;
        }
    }
}
