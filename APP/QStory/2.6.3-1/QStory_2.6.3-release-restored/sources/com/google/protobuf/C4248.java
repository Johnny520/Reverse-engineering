package com.google.protobuf;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.google.protobuf.AbstractC4365;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲子苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4248 extends AbstractC4365 {
    private volatile int cachedSerializedSize;
    private final Object key;
    private final C4251 metadata;
    private final Object value;

    private C4248(C4251 c4251, AbstractC4306 abstractC4306, C4529 c4529) throws InvalidProtocolBufferException {
        this.cachedSerializedSize = -1;
        try {
            this.metadata = c4251;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntryM8081 = AbstractC4245.m8081(c4251, abstractC4306, c4529);
            this.key = simpleImmutableEntryM8081.getKey();
            this.value = simpleImmutableEntryM8081.getValue();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }

    private void checkFieldDescriptor(C4489 c4489) {
        if (c4489.f11691 == this.metadata.f11425) {
            return;
        }
        C4515.m8483("Wrong FieldDescriptor \"", c4489.f11693, "\" used in message \"", this.metadata.f11425.f11718);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> boolean isInitialized(C4251 c4251, V v) {
        if (c4251.f11427.getJavaType() == WireFormat$JavaType.MESSAGE) {
            return ((InterfaceC4273) v).isInitialized();
        }
        return true;
    }

    public static <K, V> C4248 newDefaultInstance(C4495 c4495, WireFormat$FieldType wireFormat$FieldType, K k, WireFormat$FieldType wireFormat$FieldType2, V v) {
        return new C4248(c4495, wireFormat$FieldType, k, wireFormat$FieldType2, v);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public Map<C4489, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (C4489 c4489 : this.metadata.f11425.m8434()) {
            if (hasField(c4489)) {
                treeMap.put(c4489, getField(c4489));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4248 getDefaultInstanceForType() {
        C4251 c4251 = this.metadata;
        return new C4248(c4251, c4251.f11428, c4251.f11426);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return this.metadata.f11425;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public Object getField(C4489 c4489) {
        checkFieldDescriptor(c4489);
        Object key = c4489.f11700.getNumber() == 1 ? getKey() : getValue();
        return c4489.m8416() == Descriptors$FieldDescriptor$Type.ENUM ? c4489.m8424().m8441(((Integer) key).intValue()) : key;
    }

    public Object getKey() {
        return this.key;
    }

    public final C4251 getMetadata() {
        return this.metadata;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return this.metadata.f11424;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public Object getRepeatedField(C4489 c4489, int i) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int getRepeatedFieldCount(C4489 c4489) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        if (this.cachedSerializedSize != -1) {
            return this.cachedSerializedSize;
        }
        int iM8076 = AbstractC4245.m8076(this.metadata, this.key, this.value);
        this.cachedSerializedSize = iM8076;
        return iM8076;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public C4536 getUnknownFields() {
        return C4536.getDefaultInstance();
    }

    public Object getValue() {
        return this.value;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public boolean hasField(C4489 c4489) {
        checkFieldDescriptor(c4489);
        return true;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4249 newBuilderForType() {
        return new C4249(this.metadata);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4249 toBuilder() {
        return new C4249(this.metadata, this.key, this.value, true, true);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        AbstractC4245.m8077(abstractC4294, this.metadata, this.key, this.value);
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class C4249 extends AbstractC4365.AbstractC4366 {
        private boolean hasKey;
        private boolean hasValue;
        private Object key;
        private final C4251 metadata;
        private Object value;

        private C4249(C4251 c4251, Object obj, Object obj2, boolean z, boolean z2) {
            this.metadata = c4251;
            this.key = obj;
            this.value = obj2;
            this.hasKey = z;
            this.hasValue = z2;
        }

        private void checkFieldDescriptor(C4489 c4489) {
            if (c4489.f11691 == this.metadata.f11425) {
                return;
            }
            C4515.m8483("Wrong FieldDescriptor \"", c4489.f11693, "\" used in message \"", this.metadata.f11425.f11718);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4249 addRepeatedField(C4489 c4489, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4248 build() {
            C4248 c4248BuildPartial = buildPartial();
            if (c4248BuildPartial.isInitialized()) {
                return c4248BuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) c4248BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4248 buildPartial() {
            return new C4248(this.metadata, this.key, this.value);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4249 clearField(C4489 c4489) {
            checkFieldDescriptor(c4489);
            if (c4489.f11700.getNumber() == 1) {
                clearKey();
                return this;
            }
            clearValue();
            return this;
        }

        public C4249 clearKey() {
            this.key = this.metadata.f11428;
            this.hasKey = false;
            return this;
        }

        public C4249 clearValue() {
            this.value = this.metadata.f11426;
            this.hasValue = false;
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C4249 mo7903clone() {
            return new C4249(this.metadata, this.key, this.value, this.hasKey, this.hasValue);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Map<C4489, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (C4489 c4489 : this.metadata.f11425.m8434()) {
                if (hasField(c4489)) {
                    treeMap.put(c4489, getField(c4489));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4248 getDefaultInstanceForType() {
            C4251 c4251 = this.metadata;
            return new C4248(c4251, c4251.f11428, c4251.f11426);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return this.metadata.f11425;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Object getField(C4489 c4489) {
            checkFieldDescriptor(c4489);
            Object key = c4489.f11700.getNumber() == 1 ? getKey() : getValue();
            return c4489.m8416() == Descriptors$FieldDescriptor$Type.ENUM ? c4489.m8424().m8441(((Integer) key).intValue()) : key;
        }

        public Object getKey() {
            return this.key;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public Object getRepeatedField(C4489 c4489, int i) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public int getRepeatedFieldCount(C4489 c4489) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public C4536 getUnknownFields() {
            return C4536.getDefaultInstance();
        }

        public Object getValue() {
            return this.value;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public boolean hasField(C4489 c4489) {
            checkFieldDescriptor(c4489);
            return c4489.f11700.getNumber() == 1 ? this.hasKey : this.hasValue;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public boolean isInitialized() {
            return C4248.isInitialized(this.metadata, this.value);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 newBuilderForField(C4489 c4489) {
            checkFieldDescriptor(c4489);
            if (c4489.f11700.getNumber() == 2 && c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                return ((InterfaceC4285) this.value).newBuilderForType();
            }
            C3466.m5899(AbstractC0900.m711(new StringBuilder("\""), c4489.f11693, "\" is not a message value field."));
            return null;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4249 setField(C4489 c4489, Object obj) {
            checkFieldDescriptor(c4489);
            if (obj == null) {
                C3466.m5903(AbstractC0900.m711(new StringBuilder(), c4489.f11693, " is null"));
                return null;
            }
            if (c4489.f11700.getNumber() == 1) {
                setKey(obj);
                return this;
            }
            if (c4489.m8416() == Descriptors$FieldDescriptor$Type.ENUM) {
                obj = Integer.valueOf(((C4496) obj).f11731.getNumber());
            } else if (c4489.m8416() == Descriptors$FieldDescriptor$Type.MESSAGE && !this.metadata.f11426.getClass().isInstance(obj)) {
                obj = ((InterfaceC4285) this.metadata.f11426).toBuilder().mergeFrom((InterfaceC4285) obj).build();
            }
            setValue(obj);
            return this;
        }

        public C4249 setKey(Object obj) {
            this.key = obj;
            this.hasKey = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4249 setRepeatedField(C4489 c4489, int i, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public C4249 setValue(Object obj) {
            this.value = obj;
            this.hasValue = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4249 setUnknownFields(C4536 c4536) {
            return this;
        }

        private C4249(C4251 c4251) {
            this(c4251, c4251.f11428, c4251.f11426, false, false);
        }
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public boolean isInitialized() {
        return isInitialized(this.metadata, this.value);
    }

    private C4248(C4495 c4495, WireFormat$FieldType wireFormat$FieldType, Object obj, WireFormat$FieldType wireFormat$FieldType2, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = new C4251(c4495, this, wireFormat$FieldType, wireFormat$FieldType2);
    }

    private C4248(C4251 c4251, Object obj, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = c4251;
    }
}
