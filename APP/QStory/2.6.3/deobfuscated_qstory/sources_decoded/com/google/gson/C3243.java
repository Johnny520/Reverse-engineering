package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3243 extends AbstractC3251 {
    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c8244.m13778();
        } else {
            c8244.m13771(number.toString());
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) {
        if (c8245.m13787() != JsonToken.NULL) {
            return Long.valueOf(c8245.m13792());
        }
        c8245.m13793();
        return null;
    }
}
