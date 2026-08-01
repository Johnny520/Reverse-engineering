package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import p275.C9073;
import p287.AbstractC9156;
import p287.C9144;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4089 {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C9073 c9073 = new C9073(stringWriter);
            c9073.m14334(Strictness.LENIENT);
            AbstractC9156.f23310.getClass();
            C9144.m14407(c9073, this);
            return stringWriter.toString();
        } catch (IOException e) {
            C6755.m11863(e);
            return null;
        }
    }
}
