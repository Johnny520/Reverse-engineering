package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏子兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4276 implements InterfaceC4278 {
    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object mo8171(Object obj) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo8172(Object obj, int i, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        if (obj2 != null) {
            C3775.m6954();
            return 0;
        }
        if (!mapFieldLite.isEmpty()) {
            Iterator it = mapFieldLite.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Map mo8173(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4251 mo8174(Object obj) {
        throw AbstractC0900.m719(obj);
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo8175(Object obj) {
        ((MapFieldLite) obj).makeImmutable();
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo8176(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteMutableCopy = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Map mo8177(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo8178(Object obj) {
        return !((MapFieldLite) obj).isMutable();
    }
}
