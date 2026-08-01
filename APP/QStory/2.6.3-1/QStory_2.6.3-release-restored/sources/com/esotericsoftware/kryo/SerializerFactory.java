package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.serializers.TaggedFieldSerializer;
import com.esotericsoftware.kryo.serializers.VersionFieldSerializer;
import com.esotericsoftware.kryo.util.C3908;
import com.esotericsoftware.kryo.util.Util;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface SerializerFactory<T extends Serializer> {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class BaseSerializerFactory<T extends Serializer> implements SerializerFactory<T> {
        @Override // com.esotericsoftware.kryo.SerializerFactory
        public boolean isSupported(Class cls) {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class SingletonSerializerFactory<T extends Serializer> extends BaseSerializerFactory<T> {
        private final T serializer;

        public SingletonSerializerFactory(T t) {
            this.serializer = t;
        }

        @Override // com.esotericsoftware.kryo.SerializerFactory
        public T newSerializer(Kryo kryo, Class cls) {
            return this.serializer;
        }
    }

    boolean isSupported(Class cls);

    T newSerializer(Kryo kryo, Class cls);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class CompatibleFieldSerializerFactory extends BaseSerializerFactory<CompatibleFieldSerializer> {
        private final CompatibleFieldSerializer.CompatibleFieldSerializerConfig config;

        public CompatibleFieldSerializerFactory() {
            this.config = new CompatibleFieldSerializer.CompatibleFieldSerializerConfig();
        }

        public CompatibleFieldSerializer.CompatibleFieldSerializerConfig getConfig() {
            return this.config;
        }

        @Override // com.esotericsoftware.kryo.SerializerFactory
        public CompatibleFieldSerializer newSerializer(Kryo kryo, Class cls) {
            return new CompatibleFieldSerializer(kryo, cls, this.config.mo7452clone());
        }

        public CompatibleFieldSerializerFactory(CompatibleFieldSerializer.CompatibleFieldSerializerConfig compatibleFieldSerializerConfig) {
            this.config = compatibleFieldSerializerConfig;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class FieldSerializerFactory extends BaseSerializerFactory<FieldSerializer> {
        private final FieldSerializer.FieldSerializerConfig config;

        public FieldSerializerFactory() {
            this.config = new FieldSerializer.FieldSerializerConfig();
        }

        public FieldSerializer.FieldSerializerConfig getConfig() {
            return this.config;
        }

        @Override // com.esotericsoftware.kryo.SerializerFactory
        public FieldSerializer newSerializer(Kryo kryo, Class cls) {
            return new FieldSerializer(kryo, cls, this.config.mo7452clone());
        }

        public FieldSerializerFactory(FieldSerializer.FieldSerializerConfig fieldSerializerConfig) {
            this.config = fieldSerializerConfig;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class TaggedFieldSerializerFactory extends BaseSerializerFactory<TaggedFieldSerializer> {
        private final TaggedFieldSerializer.TaggedFieldSerializerConfig config;

        public TaggedFieldSerializerFactory() {
            this.config = new TaggedFieldSerializer.TaggedFieldSerializerConfig();
        }

        public TaggedFieldSerializer.TaggedFieldSerializerConfig getConfig() {
            return this.config;
        }

        @Override // com.esotericsoftware.kryo.SerializerFactory
        public TaggedFieldSerializer newSerializer(Kryo kryo, Class cls) {
            return new TaggedFieldSerializer(kryo, cls, this.config.mo7452clone());
        }

        public TaggedFieldSerializerFactory(TaggedFieldSerializer.TaggedFieldSerializerConfig taggedFieldSerializerConfig) {
            this.config = taggedFieldSerializerConfig;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class VersionFieldSerializerFactory extends BaseSerializerFactory<VersionFieldSerializer> {
        private final VersionFieldSerializer.VersionFieldSerializerConfig config;

        public VersionFieldSerializerFactory() {
            this.config = new VersionFieldSerializer.VersionFieldSerializerConfig();
        }

        public VersionFieldSerializer.VersionFieldSerializerConfig getConfig() {
            return this.config;
        }

        @Override // com.esotericsoftware.kryo.SerializerFactory
        public VersionFieldSerializer newSerializer(Kryo kryo, Class cls) {
            return new VersionFieldSerializer(kryo, cls, this.config.mo7452clone());
        }

        public VersionFieldSerializerFactory(VersionFieldSerializer.VersionFieldSerializerConfig versionFieldSerializerConfig) {
            this.config = versionFieldSerializerConfig;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ReflectionSerializerFactory<T extends Serializer> extends BaseSerializerFactory<T> {
        private final Class<T> serializerClass;

        public ReflectionSerializerFactory(Class<T> cls) {
            this.serializerClass = cls;
        }

        public static <T extends Serializer> T newSerializer(Kryo kryo, Class<T> cls, Class cls2) {
            try {
                try {
                    try {
                        try {
                            return cls.getConstructor(Kryo.class, Class.class).newInstance(kryo, cls2);
                        } catch (NoSuchMethodException unused) {
                            return cls.getConstructor(Kryo.class).newInstance(kryo);
                        }
                    } catch (NoSuchMethodException unused2) {
                        return cls.getConstructor(Class.class).newInstance(cls2);
                    }
                } catch (NoSuchMethodException unused3) {
                    return cls.newInstance();
                }
            } catch (Exception e) {
                C3908.m7459("Unable to create serializer \"", cls.getName(), "\" for class: ", Util.className(cls2), e);
                return null;
            }
        }

        @Override // com.esotericsoftware.kryo.SerializerFactory
        public T newSerializer(Kryo kryo, Class cls) {
            return (T) newSerializer(kryo, this.serializerClass, cls);
        }
    }
}
