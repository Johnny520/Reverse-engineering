package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class EnumMapSerializer extends MapSerializer<EnumMap> {
    private final Class<? extends Enum> enumType;

    public EnumMapSerializer(Class<? extends Enum> cls) {
        this.enumType = cls;
    }

    @Override // com.esotericsoftware.kryo.serializers.MapSerializer
    public EnumMap create(Kryo kryo, Input input, Class<? extends EnumMap> cls, int i) {
        return new EnumMap(this.enumType);
    }

    @Override // com.esotericsoftware.kryo.serializers.MapSerializer
    public EnumMap createCopy(Kryo kryo, EnumMap enumMap) {
        return new EnumMap(enumMap);
    }

    @Override // com.esotericsoftware.kryo.serializers.MapSerializer
    public /* bridge */ /* synthetic */ Map create(Kryo kryo, Input input, Class cls, int i) {
        return create(kryo, input, (Class<? extends EnumMap>) cls, i);
    }
}
