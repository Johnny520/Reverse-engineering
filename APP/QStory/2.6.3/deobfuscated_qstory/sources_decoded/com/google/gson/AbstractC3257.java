package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import p259.C8244;
import p271.AbstractC8327;
import p271.C8315;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3257 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8244 c8244 = new C8244(stringWriter);
            c8244.m13775(Strictness.LENIENT);
            AbstractC8327.f22965.getClass();
            C8315.m13848(c8244, this);
            return stringWriter.toString();
        } catch (IOException e) {
            C5925.m11304(e);
            return null;
        }
    }
}
