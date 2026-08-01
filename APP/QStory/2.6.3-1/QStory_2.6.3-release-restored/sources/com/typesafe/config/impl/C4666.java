package com.typesafe.config.impl;

import com.typesafe.config.impl.SerializedConfigValue;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4666 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DataOutputStream f12384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteArrayOutputStream f12385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SerializedConfigValue.SerializedField f12386;

    public C4666(SerializedConfigValue.SerializedField serializedField) {
        this.f12386 = serializedField;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f12385 = byteArrayOutputStream;
        this.f12384 = new DataOutputStream(byteArrayOutputStream);
    }
}
