package com.google.protobuf;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import com.google.protobuf.AbstractC3532;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲子苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3415 extends AbstractC3532 {
    private volatile int cachedSerializedSize;
    private final Object key;
    private final C3418 metadata;
    private final Object value;

    private C3415(C3418 c3418, AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        this.cachedSerializedSize = -1;
        try {
            this.metadata = c3418;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntryM7535 = AbstractC3412.m7535(c3418, abstractC3473, c3696);
            this.key = simpleImmutableEntryM7535.getKey();
            this.value = simpleImmutableEntryM7535.getValue();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
        }
    }

    private void checkFieldDescriptor(C3656 c3656) {
        if (c3656.f11341 == this.metadata.f11075) {
            return;
        }
        C3682.m7937("Wrong FieldDescriptor \"", c3656.f11343, "\" used in message \"", this.metadata.f11075.f11368);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> boolean isInitialized(C3418 c3418, V v) {
        if (c3418.f11077.getJavaType() == WireFormat$JavaType.MESSAGE) {
            return ((InterfaceC3440) v).isInitialized();
        }
        return true;
    }

    public static <K, V> C3415 newDefaultInstance(C3662 c3662, WireFormat$FieldType wireFormat$FieldType, K k, WireFormat$FieldType wireFormat$FieldType2, V v) {
        return new C3415(c3662, wireFormat$FieldType, k, wireFormat$FieldType2, v);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public Map<C3656, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (C3656 c3656 : this.metadata.f11075.m7888()) {
            if (hasField(c3656)) {
                treeMap.put(c3656, getField(c3656));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3415 getDefaultInstanceForType() {
        C3418 c3418 = this.metadata;
        return new C3415(c3418, c3418.f11078, c3418.f11076);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return this.metadata.f11075;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public Object getField(C3656 c3656) {
        checkFieldDescriptor(c3656);
        Object key = c3656.f11350.getNumber() == 1 ? getKey() : getValue();
        return c3656.m7870() == Descriptors$FieldDescriptor$Type.ENUM ? c3656.m7878().m7895(((Integer) key).intValue()) : key;
    }

    public Object getKey() {
        return this.key;
    }

    public final C3418 getMetadata() {
        return this.metadata;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return this.metadata.f11074;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public Object getRepeatedField(C3656 c3656, int i) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int getRepeatedFieldCount(C3656 c3656) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        if (this.cachedSerializedSize != -1) {
            return this.cachedSerializedSize;
        }
        int iM7530 = AbstractC3412.m7530(this.metadata, this.key, this.value);
        this.cachedSerializedSize = iM7530;
        return iM7530;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public C3703 getUnknownFields() {
        return C3703.getDefaultInstance();
    }

    public Object getValue() {
        return this.value;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public boolean hasField(C3656 c3656) {
        checkFieldDescriptor(c3656);
        return true;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3416 newBuilderForType() {
        return new C3416(this.metadata);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3416 toBuilder() {
        return new C3416(this.metadata, this.key, this.value, true, true);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        AbstractC3412.m7531(abstractC3461, this.metadata, this.key, this.value);
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪哲子苏兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class C3416 extends AbstractC3532.AbstractC3533 {
        private boolean hasKey;
        private boolean hasValue;
        private Object key;
        private final C3418 metadata;
        private Object value;

        private C3416(C3418 c3418, Object obj, Object obj2, boolean z, boolean z2) {
            this.metadata = c3418;
            this.key = obj;
            this.value = obj2;
            this.hasKey = z;
            this.hasValue = z2;
        }

        private void checkFieldDescriptor(C3656 c3656) {
            if (c3656.f11341 == this.metadata.f11075) {
                return;
            }
            C3682.m7937("Wrong FieldDescriptor \"", c3656.f11343, "\" used in message \"", this.metadata.f11075.f11368);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3416 addRepeatedField(C3656 c3656, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3415 build() {
            C3415 c3415BuildPartial = buildPartial();
            if (c3415BuildPartial.isInitialized()) {
                return c3415BuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) c3415BuildPartial);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3415 buildPartial() {
            return new C3415(this.metadata, this.key, this.value);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3416 clearField(C3656 c3656) {
            checkFieldDescriptor(c3656);
            if (c3656.f11350.getNumber() == 1) {
                clearKey();
                return this;
            }
            clearValue();
            return this;
        }

        public C3416 clearKey() {
            this.key = this.metadata.f11078;
            this.hasKey = false;
            return this;
        }

        public C3416 clearValue() {
            this.value = this.metadata.f11076;
            this.hasValue = false;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C3416 mo7357clone() {
            return new C3416(this.metadata, this.key, this.value, this.hasKey, this.hasValue);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Map<C3656, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (C3656 c3656 : this.metadata.f11075.m7888()) {
                if (hasField(c3656)) {
                    treeMap.put(c3656, getField(c3656));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3415 getDefaultInstanceForType() {
            C3418 c3418 = this.metadata;
            return new C3415(c3418, c3418.f11078, c3418.f11076);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return this.metadata.f11075;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Object getField(C3656 c3656) {
            checkFieldDescriptor(c3656);
            Object key = c3656.f11350.getNumber() == 1 ? getKey() : getValue();
            return c3656.m7870() == Descriptors$FieldDescriptor$Type.ENUM ? c3656.m7878().m7895(((Integer) key).intValue()) : key;
        }

        public Object getKey() {
            return this.key;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public Object getRepeatedField(C3656 c3656, int i) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public int getRepeatedFieldCount(C3656 c3656) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public C3703 getUnknownFields() {
            return C3703.getDefaultInstance();
        }

        public Object getValue() {
            return this.value;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public boolean hasField(C3656 c3656) {
            checkFieldDescriptor(c3656);
            return c3656.f11350.getNumber() == 1 ? this.hasKey : this.hasValue;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public boolean isInitialized() {
            return C3415.isInitialized(this.metadata, this.value);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 newBuilderForField(C3656 c3656) {
            checkFieldDescriptor(c3656);
            if (c3656.f11350.getNumber() == 2 && c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                return ((InterfaceC3452) this.value).newBuilderForType();
            }
            C2632.m5294(AbstractC0053.m146(new StringBuilder("\""), c3656.f11343, "\" is not a message value field."));
            return null;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3416 setField(C3656 c3656, Object obj) {
            checkFieldDescriptor(c3656);
            if (obj == null) {
                C2632.m5298(AbstractC0053.m146(new StringBuilder(), c3656.f11343, " is null"));
                return null;
            }
            if (c3656.f11350.getNumber() == 1) {
                setKey(obj);
                return this;
            }
            if (c3656.m7870() == Descriptors$FieldDescriptor$Type.ENUM) {
                obj = Integer.valueOf(((C3663) obj).f11381.getNumber());
            } else if (c3656.m7870() == Descriptors$FieldDescriptor$Type.MESSAGE && !this.metadata.f11076.getClass().isInstance(obj)) {
                obj = ((InterfaceC3452) this.metadata.f11076).toBuilder().mergeFrom((InterfaceC3452) obj).build();
            }
            setValue(obj);
            return this;
        }

        public C3416 setKey(Object obj) {
            this.key = obj;
            this.hasKey = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3416 setRepeatedField(C3656 c3656, int i, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public C3416 setValue(Object obj) {
            this.value = obj;
            this.hasValue = true;
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3416 setUnknownFields(C3703 c3703) {
            return this;
        }

        private C3416(C3418 c3418) {
            this(c3418, c3418.f11078, c3418.f11076, false, false);
        }
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public boolean isInitialized() {
        return isInitialized(this.metadata, this.value);
    }

    private C3415(C3662 c3662, WireFormat$FieldType wireFormat$FieldType, Object obj, WireFormat$FieldType wireFormat$FieldType2, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = new C3418(c3662, this, wireFormat$FieldType, wireFormat$FieldType2);
    }

    private C3415(C3418 c3418, Object obj, Object obj2) {
        this.cachedSerializedSize = -1;
        this.key = obj;
        this.value = obj2;
        this.metadata = c3418;
    }
}
