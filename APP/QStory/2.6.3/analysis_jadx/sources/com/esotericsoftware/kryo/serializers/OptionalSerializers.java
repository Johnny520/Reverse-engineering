package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class OptionalSerializers {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OptionalDoubleSerializer extends ImmutableSerializer<OptionalDouble> {
        @Override // com.esotericsoftware.kryo.Serializer
        public OptionalDouble read(Kryo kryo, Input input, Class cls) {
            return input.readBoolean() ? OptionalDouble.of(input.readDouble()) : OptionalDouble.empty();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, OptionalDouble optionalDouble) {
            output.writeBoolean(optionalDouble.isPresent());
            if (optionalDouble.isPresent()) {
                output.writeDouble(optionalDouble.getAsDouble());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OptionalIntSerializer extends ImmutableSerializer<OptionalInt> {
        @Override // com.esotericsoftware.kryo.Serializer
        public OptionalInt read(Kryo kryo, Input input, Class cls) {
            return input.readBoolean() ? OptionalInt.of(input.readInt()) : OptionalInt.empty();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, OptionalInt optionalInt) {
            output.writeBoolean(optionalInt.isPresent());
            if (optionalInt.isPresent()) {
                output.writeInt(optionalInt.getAsInt());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OptionalLongSerializer extends ImmutableSerializer<OptionalLong> {
        @Override // com.esotericsoftware.kryo.Serializer
        public OptionalLong read(Kryo kryo, Input input, Class cls) {
            return input.readBoolean() ? OptionalLong.of(input.readLong()) : OptionalLong.empty();
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, OptionalLong optionalLong) {
            output.writeBoolean(optionalLong.isPresent());
            if (optionalLong.isPresent()) {
                output.writeLong(optionalLong.getAsLong());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OptionalSerializer extends Serializer<Optional> {
        public OptionalSerializer() {
            setAcceptsNull(false);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Optional copy(Kryo kryo, Optional optional) {
            return optional.isPresent() ? Optional.of(kryo.copy(optional.get())) : optional;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Optional read(Kryo kryo, Input input, Class<? extends Optional> cls) {
            return Optional.ofNullable(kryo.readClassAndObject(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Optional optional) {
            kryo.writeClassAndObject(output, optional.isPresent() ? optional.get() : null);
        }
    }

    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.util.Optional")) {
            kryo.addDefaultSerializer(Optional.class, OptionalSerializer.class);
        }
        if (Util.isClassAvailable("java.util.OptionalInt")) {
            kryo.addDefaultSerializer(OptionalInt.class, OptionalIntSerializer.class);
        }
        if (Util.isClassAvailable("java.util.OptionalLong")) {
            kryo.addDefaultSerializer(OptionalLong.class, OptionalLongSerializer.class);
        }
        if (Util.isClassAvailable("java.util.OptionalDouble")) {
            kryo.addDefaultSerializer(OptionalDouble.class, OptionalDoubleSerializer.class);
        }
    }
}
