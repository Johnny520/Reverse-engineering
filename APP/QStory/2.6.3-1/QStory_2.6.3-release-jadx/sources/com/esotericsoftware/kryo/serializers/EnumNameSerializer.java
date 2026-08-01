package com.esotericsoftware.kryo.serializers;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.p006io.Input;
import com.esotericsoftware.kryo.p006io.Output;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class EnumNameSerializer extends ImmutableSerializer<Enum> {
    private final Class<? extends Enum> enumType;

    public EnumNameSerializer(Class<? extends Enum> cls) {
        this.enumType = cls;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Enum read(Kryo kryo, Input input, Class cls) {
        String string = input.readString();
        try {
            return Enum.valueOf(this.enumType, string);
        } catch (IllegalArgumentException e) {
            throw new KryoException(AbstractC0900.m717("Enum value not found with name: ", string), e);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Enum r3) {
        output.writeString(r3.name());
    }
}
