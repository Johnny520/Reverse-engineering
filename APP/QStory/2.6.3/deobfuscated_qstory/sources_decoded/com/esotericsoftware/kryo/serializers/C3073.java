package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.serializers.RecordSerializer;
import java.util.function.Function;

/* JADX INFO: renamed from: com.esotericsoftware.kryo.serializers.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3073 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9831;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        RecordSerializer.RecordComponent recordComponent = (RecordSerializer.RecordComponent) obj;
        switch (this.f9831) {
            case 0:
                return recordComponent.type();
            case 1:
                return Integer.valueOf(recordComponent.index());
            default:
                return recordComponent.name();
        }
    }
}
