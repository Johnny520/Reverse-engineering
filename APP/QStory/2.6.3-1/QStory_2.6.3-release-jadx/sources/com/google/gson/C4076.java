package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4076 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11259;

    public /* synthetic */ C4076(int i) {
        this.f11259 = i;
    }

    public String toString() {
        switch (this.f11259) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        switch (this.f11259) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C4085.m7895(dDoubleValue);
                    c9073.m14336(dDoubleValue);
                } else {
                    c9073.m14337();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C4085.m7895(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c9073.m14327(numberValueOf);
                } else {
                    c9073.m14337();
                }
                break;
            default:
                c9073.m14337();
                break;
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        switch (this.f11259) {
            case 0:
                if (c9074.m14346() != JsonToken.NULL) {
                    return Double.valueOf(c9074.m14358());
                }
                c9074.m14352();
                return null;
            case 1:
                if (c9074.m14346() != JsonToken.NULL) {
                    return Float.valueOf((float) c9074.m14358());
                }
                c9074.m14352();
                return null;
            default:
                c9074.m14370();
                return null;
        }
    }
}
