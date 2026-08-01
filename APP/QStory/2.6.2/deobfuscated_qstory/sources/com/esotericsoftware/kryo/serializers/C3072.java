package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.serializers.RecordSerializer;
import java.util.function.Function;

/* JADX INFO: renamed from: com.esotericsoftware.kryo.serializers.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3072 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9826;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        RecordSerializer.RecordComponent recordComponent = (RecordSerializer.RecordComponent) obj;
        switch (this.f9826) {
            case 0:
                return recordComponent.type();
            case 1:
                return Integer.valueOf(recordComponent.index());
            default:
                return recordComponent.name();
        }
    }
}
