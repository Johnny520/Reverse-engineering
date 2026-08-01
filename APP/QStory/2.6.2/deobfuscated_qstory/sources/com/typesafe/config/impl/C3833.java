package com.typesafe.config.impl;

import com.typesafe.config.impl.SerializedConfigValue;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3833 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final DataOutputStream f12034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteArrayOutputStream f12035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SerializedConfigValue.SerializedField f12036;

    public C3833(SerializedConfigValue.SerializedField serializedField) {
        this.f12036 = serializedField;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f12035 = byteArrayOutputStream;
        this.f12034 = new DataOutputStream(byteArrayOutputStream);
    }
}
