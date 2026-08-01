package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;

/* JADX INFO: renamed from: com.esotericsoftware.kryo.serializers.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3073 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m6908(StringBuilder sb, Object obj, Throwable th) {
        sb.append(" (");
        sb.append(obj);
        sb.append(")");
        throw new KryoException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m6909(String str, Object obj, Throwable th) {
        throw new KryoException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m6910(Object obj, String str, Object obj2) {
        throw new KryoException(str + obj + ((Object) ".") + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m6911(Object obj, Object obj2, Throwable th) {
        throw new KryoException("Error accessing field: " + obj + ((Object) " (") + obj2 + ((Object) ")"), th);
    }
}
