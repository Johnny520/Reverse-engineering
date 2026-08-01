package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import p259.C8243;
import p271.AbstractC8326;
import p271.C8314;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3256 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8243 c8243 = new C8243(stringWriter);
            c8243.m13761(Strictness.LENIENT);
            AbstractC8326.f22966.getClass();
            C8314.m13831(c8243, this);
            return stringWriter.toString();
        } catch (IOException e) {
            C5919.m11243(e);
            return null;
        }
    }
}
