package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.google.protobuf.AbstractC3533;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲子苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3416 extends AbstractC3533 {
    private volatile int cachedSerializedSize;
    private final Object key;
    private final C3419 metadata;
    private final Object value;

    private C3416(C3419 c3419, AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        this.cachedSerializedSize = -1;
        try {
            this.metadata = c3419;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntryM7522 = AbstractC3413.m7522(c3419, abstractC3474, c3697);
            this.key = simpleImmutableEntryM7522.getKey();
            this.value = simpleImmutableEntryM7522.getValue();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }

    private void checkFieldDescriptor(C3657 c3657) {
        if (c3657.f11346 == this.metadata.f11080) {
            return;
        }
        C3683.m7924("Wrong FieldDescriptor \"", c3657.f11348, "\" used in message \"", this.metadata.f11080.f11373);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> boolean isInitialized(C3419 c3419, V v) {
        if (c3419.f11082.getJavaType() == WireFormat$JavaType.MESSAGE) {
            return ((InterfaceC3441) v).isInitialized();
        }
        return true;
    }

    public static <K, V> C3416 newDefaultInstance(C3663 c3663, WireFormat$FieldType wireFormat$FieldType, K k, WireFormat$FieldType wireFormat$FieldType2, V v) {
        return new C3416(c3663, wireFormat$FieldType, k, wireFormat$FieldType2, v);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public Map<C3657, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (C3657 c3657 : this.metadata.f11080.m7875()) {
            if (hasField(c3657)) {
                treeMap.put(c3657, getField(c3657));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3416 getDefaultInstanceForType() {
        C3419 c3419 = this.metadata;
        return new C3416(c3419, c3419.f11083, c3419.f11081);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return this.metadata.f11080;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public Object getField(C3657 c3657) {
        checkFieldDescriptor(c3657);
        Object key = c3657.f11355.getNumber() == 1 ? getKey() : getValue();
        return c3657.m7857() == Descriptors$FieldDescriptor$Type.ENUM ? c3657.m7865().m7882(((Integer) key).intValue()) : key;
    }

    public Object getKey() {
        return this.key;
    }

    public final C3419 getMetadata() {
        return this.metadata;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return this.metadata.f11079;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public Object getRepeatedField(C3657 c3657, int i) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int getRepeatedFieldCount(C3657 c3657) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        if (this.cachedSerializedSize != -1) {
            return this.cachedSerializedSize;
        }
        int iM7517 = AbstractC3413.m7517(this.metadata, this.key, this.value);
        this.cachedSerializedSize = iM7517;
        return iM7517;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public C3704 getUnknownFields() {
        return C3704.getDefaultInstance();
    }

    public Object getValue() {
        return this.value;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public boolean hasField(C3657 c3657) {
        checkFieldDescriptor(c3657);
        return true;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3417 newBuilderForType() {
        return new C3417(this.metadata);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3417 toBuilder() {
        return new C3417(this.metadata, this.key, this.value, true, true);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        AbstractC3413.m7518(abstractC3462, this.metadata, this.key, this.value);
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class C3417 extends AbstractC3533.AbstractC3534 {
        private boolean hasKey;
        private boolean hasValue;
        private Object key;
        private final C3419 metadata;
        private Object value;

        private C3417(C3419 c3419, Object obj, Object obj2, boolean z, boolean z2) {
            this.metadata = c3419;
            this.key = obj;
            this.value = obj2;
            this.hasKey = z;
            this.hasValue = z2;
        }

        private void checkFieldDescriptor(C3657 c3657) {
            if (c3657.f11346 == this.metadata.f11080) {
                return;
            }
            C3683.m7924("Wrong FieldDescriptor \"", c3657.f11348, "\" used in message \"", this.metadata.f11080.f11373);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3417 addRepeatedField(C3657 c3657, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3416 build() {
            C3416 c3416BuildPartial = buildPartial();
            if (c3416BuildPartial.isInitialized()) {
                return c3416BuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) c3416BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3416 buildPartial() {
            return new C3416(this.metadata, this.key, this.value);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3417 clearField(C3657 c3657) {
            checkFieldDescriptor(c3657);
            if (c3657.f11355.getNumber() == 1) {
                clearKey();
                return this;
            }
            clearValue();
            return this;
        }

        public C3417 clearKey() {
            this.key = this.metadata.f11083;
            this.hasKey = false;
            return this;
        }

        public C3417 clearValue() {
            this.value = this.metadata.f11081;
            this.hasValue = false;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C3417 mo7344clone() {
            return new C3417(this.metadata, this.key, this.value, this.hasKey, this.hasValue);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Map<C3657, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (C3657 c3657 : this.metadata.f11080.m7875()) {
                if (hasField(c3657)) {
                    treeMap.put(c3657, getField(c3657));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3416 getDefaultInstanceForType() {
            C3419 c3419 = this.metadata;
            return new C3416(c3419, c3419.f11083, c3419.f11081);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return this.metadata.f11080;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Object getField(C3657 c3657) {
            checkFieldDescriptor(c3657);
            Object key = c3657.f11355.getNumber() == 1 ? getKey() : getValue();
            return c3657.m7857() == Descriptors$FieldDescriptor$Type.ENUM ? c3657.m7865().m7882(((Integer) key).intValue()) : key;
        }

        public Object getKey() {
            return this.key;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public Object getRepeatedField(C3657 c3657, int i) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public int getRepeatedFieldCount(C3657 c3657) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public C3704 getUnknownFields() {
            return C3704.getDefaultInstance();
        }

        public Object getValue() {
            return this.value;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public boolean hasField(C3657 c3657) {
            checkFieldDescriptor(c3657);
            return c3657.f11355.getNumber() == 1 ? this.hasKey : this.hasValue;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public boolean isInitialized() {
            return C3416.isInitialized(this.metadata, this.value);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 newBuilderForField(C3657 c3657) {
            checkFieldDescriptor(c3657);
            if (c3657.f11355.getNumber() == 2 && c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                return ((InterfaceC3453) this.value).newBuilderForType();
            }
            C2633.m5339(AbstractC0053.m151(new StringBuilder("\""), c3657.f11348, "\" is not a message value field."));
            return null;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3417 setField(C3657 c3657, Object obj) {
            checkFieldDescriptor(c3657);
            if (obj == null) {
                C2633.m5343(AbstractC0053.m151(new StringBuilder(), c3657.f11348, " is null"));
                return null;
            }
            if (c3657.f11355.getNumber() == 1) {
                setKey(obj);
                return this;
            }
            if (c3657.m7857() == Descriptors$FieldDescriptor$Type.ENUM) {
                obj = Integer.valueOf(((C3664) obj).f11386.getNumber());
            } else if (c3657.m7857() == Descriptors$FieldDescriptor$Type.MESSAGE && !this.metadata.f11081.getClass().isInstance(obj)) {
                obj = ((InterfaceC3453) this.metadata.f11081).toBuilder().mergeFrom((InterfaceC3453) obj).build();
            }
            setValue(obj);
            return this;
        }

        public C3417 setKey(Object obj) {
            this.key = obj;
            this.hasKey = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3417 setRepeatedField(C3657 c3657, int i, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public C3417 setValue(Object obj) {
            this.value = obj;
            this.hasValue = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3417 setUnknownFields(C3704 c3704) {
            return this;
        }

        private C3417(C3419 c3419) {
            this(c3419, c3419.f11083, c3419.f11081, false, false);
        }
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public boolean isInitialized() {
        return isInitialized(this.metadata, this.value);
    }

    private C3416(C3663 c3663, WireFormat$FieldType wireFormat$FieldType, Object obj, WireFormat$FieldType wireFormat$FieldType2, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = new C3419(c3663, this, wireFormat$FieldType, wireFormat$FieldType2);
    }

    private C3416(C3419 c3419, Object obj, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = c3419;
    }
}
