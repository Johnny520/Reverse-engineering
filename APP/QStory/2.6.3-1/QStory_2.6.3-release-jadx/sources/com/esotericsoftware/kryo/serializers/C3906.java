package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;

/* JADX INFO: renamed from: com.esotericsoftware.kryo.serializers.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3906 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m7454(StringBuilder sb, Object obj, Throwable th) {
        sb.append(" (");
        sb.append(obj);
        sb.append(")");
        throw new KryoException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m7455(String str, Object obj, Throwable th) {
        throw new KryoException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m7456(Object obj, String str, Object obj2) {
        throw new KryoException(str + obj + ((Object) ".") + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m7457(Object obj, Object obj2, Throwable th) {
        throw new KryoException("Error accessing field: " + obj + ((Object) " (") + obj2 + ((Object) ")"), th);
    }
}
