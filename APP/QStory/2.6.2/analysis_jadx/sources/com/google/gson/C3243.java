package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3243 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10909;

    public /* synthetic */ C3243(int i) {
        this.f10909 = i;
    }

    public String toString() {
        switch (this.f10909) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        switch (this.f10909) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C3252.m7349(dDoubleValue);
                    c8243.m13760(dDoubleValue);
                } else {
                    c8243.m13762();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C3252.m7349(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c8243.m13751(numberValueOf);
                } else {
                    c8243.m13762();
                }
                break;
            default:
                c8243.m13762();
                break;
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        switch (this.f10909) {
            case 0:
                if (c8244.m13770() != JsonToken.NULL) {
                    return Double.valueOf(c8244.m13781());
                }
                c8244.m13775();
                return null;
            case 1:
                if (c8244.m13770() != JsonToken.NULL) {
                    return Float.valueOf((float) c8244.m13781());
                }
                c8244.m13775();
                return null;
            default:
                c8244.m13793();
                return null;
        }
    }
}
