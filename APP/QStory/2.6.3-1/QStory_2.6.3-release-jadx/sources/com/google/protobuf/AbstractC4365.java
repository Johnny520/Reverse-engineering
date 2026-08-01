package com.google.protobuf;

import androidx.collection.C1123;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4365 extends AbstractC4361 implements InterfaceC4285 {
    protected int memoizedSize = -1;

    private static boolean compareBytes(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : toByteString(obj).equals(toByteString(obj2));
    }

    public static boolean compareFields(Map<C4489, Object> map, Map<C4489, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C4489 c4489 : map.keySet()) {
            if (!map2.containsKey(c4489)) {
                return false;
            }
            Object obj = map.get(c4489);
            Object obj2 = map2.get(c4489);
            if (c4489.m8416() == Descriptors$FieldDescriptor$Type.BYTES) {
                if (c4489.mo8365()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!compareBytes(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                } else if (!compareBytes(obj, obj2)) {
                    return false;
                }
            } else if (c4489.m8418()) {
                if (!compareMapField(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareMapField(Object obj, Object obj2) {
        return MapFieldLite.equals(convertMapEntryListToMap((List) obj), convertMapEntryListToMap((List) obj2));
    }

    private static Map convertMapEntryListToMap(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        InterfaceC4285 interfaceC4285 = (InterfaceC4285) it.next();
        C4495 descriptorForType = interfaceC4285.getDescriptorForType();
        C4489 c4489M8436 = descriptorForType.m8436("key");
        C4489 c4489M84362 = descriptorForType.m8436("value");
        Object field = interfaceC4285.getField(c4489M84362);
        if (field instanceof C4496) {
            field = Integer.valueOf(((C4496) field).f11731.getNumber());
        }
        map.put(interfaceC4285.getField(c4489M8436), field);
        while (it.hasNext()) {
            InterfaceC4285 interfaceC42852 = (InterfaceC4285) it.next();
            Object field2 = interfaceC42852.getField(c4489M84362);
            if (field2 instanceof C4496) {
                field2 = Integer.valueOf(((C4496) field2).f11731.getNumber());
            }
            map.put(interfaceC42852.getField(c4489M8436), field2);
        }
        return map;
    }

    public static int hashFields(int i, Map<C4489, Object> map) {
        int iHashMapField;
        int i2;
        int iHashCode;
        for (Map.Entry<C4489, Object> entry : map.entrySet()) {
            C4489 key = entry.getKey();
            Object value = entry.getValue();
            int number = key.f11700.getNumber() + (i * 37);
            if (key.m8418()) {
                iHashMapField = (number * 53) + hashMapField(value);
            } else {
                if (key.m8416() != Descriptors$FieldDescriptor$Type.ENUM) {
                    i2 = number * 53;
                    iHashCode = value.hashCode();
                } else if (key.mo8365()) {
                    int i3 = number * 53;
                    Iterator it = ((List) value).iterator();
                    int number2 = 1;
                    while (it.hasNext()) {
                        number2 = (number2 * 31) + ((InterfaceC4231) it.next()).getNumber();
                    }
                    iHashMapField = i3 + number2;
                } else {
                    i2 = number * 53;
                    iHashCode = ((InterfaceC4231) value).getNumber();
                }
                i = iHashCode + i2;
            }
            i = iHashMapField;
        }
        return i;
    }

    private static int hashMapField(Object obj) {
        return MapFieldLite.calculateHashCodeForMap(convertMapEntryListToMap((List) obj));
    }

    private static ByteString toByteString(Object obj) {
        return obj instanceof byte[] ? ByteString.copyFrom((byte[]) obj) : (ByteString) obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC4285)) {
            return false;
        }
        InterfaceC4285 interfaceC4285 = (InterfaceC4285) obj;
        return getDescriptorForType() == interfaceC4285.getDescriptorForType() && compareFields(getAllFields(), interfaceC4285.getAllFields()) && getUnknownFields().equals(interfaceC4285.getUnknownFields());
    }

    @Override // com.google.protobuf.InterfaceC4285
    public List<String> findInitializationErrors() {
        ArrayList arrayList = new ArrayList();
        AbstractC4245.m8083(this, "", arrayList);
        return arrayList;
    }

    public abstract /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    public abstract /* synthetic */ C4495 getDescriptorForType();

    public abstract /* synthetic */ Object getField(C4489 c4489);

    @Override // com.google.protobuf.InterfaceC4285
    public String getInitializationErrorString() {
        return AbstractC4245.m8075(findInitializationErrors());
    }

    @Override // com.google.protobuf.AbstractC4361
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public C4489 getOneofFieldDescriptor(C4426 c4426) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4207 getParserForType();

    public abstract /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

    public abstract /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM8086 = AbstractC4245.m8086(this, getAllFields());
        this.memoizedSize = iM8086;
        return iM8086;
    }

    public abstract /* synthetic */ C4536 getUnknownFields();

    public abstract /* synthetic */ boolean hasField(C4489 c4489);

    public boolean hasOneof(C4426 c4426) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + (hashFields(getDescriptorForType().hashCode() + 779, getAllFields()) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public boolean isInitialized() {
        for (C4489 c4489 : getDescriptorForType().m8434()) {
            if (c4489.m8413() && !hasField(c4489)) {
                return false;
            }
        }
        for (Map.Entry entry : getAllFields().entrySet()) {
            C4489 c44892 = (C4489) entry.getKey();
            if (c44892.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c44892.mo8365()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC4285) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC4285) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4286 newBuilderForType();

    public InterfaceC4286 newBuilderForType(InterfaceC4364 interfaceC4364) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.google.protobuf.AbstractC4361
    public UninitializedMessageException newUninitializedMessageException() {
        return AbstractC4366.newUninitializedMessageException((InterfaceC4285) this);
    }

    @Override // com.google.protobuf.AbstractC4361
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4286 toBuilder();

    @Override // com.google.protobuf.InterfaceC4285
    public final String toString() {
        C4548 c4548M8535 = C4548.m8535();
        TextFormat$Printer$FieldReporterLevel textFormat$Printer$FieldReporterLevel = TextFormat$Printer$FieldReporterLevel.REPORT_ALL;
        return c4548M8535.m8536(this);
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        AbstractC4245.m8080(this, getAllFields(), abstractC4294);
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 newBuilderForType() {
        return super.newBuilderForType();
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC4366 extends AbstractC4362 implements InterfaceC4286 {
        public static UninitializedMessageException newUninitializedMessageException(InterfaceC4285 interfaceC4285) {
            ArrayList arrayList = new ArrayList();
            AbstractC4245.m8083(interfaceC4285, "", arrayList);
            return new UninitializedMessageException(arrayList);
        }

        public abstract /* synthetic */ InterfaceC4286 addRepeatedField(C4489 c4489, Object obj);

        @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 build() {
            return super.build();
        }

        @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 build();

        @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 buildPartial();

        @Override // com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public AbstractC4366 mo7901clear() {
            Iterator it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField((C4489) ((Map.Entry) it.next()).getKey());
            }
            return this;
        }

        public abstract /* synthetic */ InterfaceC4286 clearField(C4489 c4489);

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 clearOneof(C4426 c4426) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public AbstractC4366 mo7903clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.google.protobuf.InterfaceC4286
        public List<String> findInitializationErrors() {
            ArrayList arrayList = new ArrayList();
            AbstractC4245.m8083(this, "", arrayList);
            return arrayList;
        }

        public abstract /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

        public abstract /* synthetic */ C4495 getDescriptorForType();

        public abstract /* synthetic */ Object getField(C4489 c4489);

        public InterfaceC4286 getFieldBuilder(C4489 c4489) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.google.protobuf.InterfaceC4286
        public String getInitializationErrorString() {
            return AbstractC4245.m8075(findInitializationErrors());
        }

        public C4489 getOneofFieldDescriptor(C4426 c4426) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        public abstract /* synthetic */ Object getRepeatedField(C4489 c4489, int i);

        public InterfaceC4286 getRepeatedFieldBuilder(C4489 c4489, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        public abstract /* synthetic */ int getRepeatedFieldCount(C4489 c4489);

        public C4544 getUnknownFieldSetBuilder() {
            return C4536.newBuilder(getUnknownFields());
        }

        public abstract /* synthetic */ C4536 getUnknownFields();

        public abstract /* synthetic */ boolean hasField(C4489 c4489);

        public boolean hasOneof(C4426 c4426) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC4362
        public AbstractC4366 internalMergeFrom(AbstractC4361 abstractC4361) {
            return mergeFrom((InterfaceC4285) abstractC4361);
        }

        @Override // com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ boolean isInitialized();

        public void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public AbstractC4366 mergeFrom(InterfaceC4285 interfaceC4285, Map<C4489, Object> map) {
            if (interfaceC4285.getDescriptorForType() != getDescriptorForType()) {
                C6755.m11869("mergeFrom(Message) can only merge messages of the same type.");
                return null;
            }
            for (Map.Entry<C4489, Object> entry : map.entrySet()) {
                C4489 key = entry.getKey();
                if (key.mo8365()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        addRepeatedField(key, it.next());
                    }
                } else if (key.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                    InterfaceC4285 interfaceC42852 = (InterfaceC4285) getField(key);
                    if (interfaceC42852 == interfaceC42852.getDefaultInstanceForType()) {
                        setField(key, entry.getValue());
                    } else {
                        setField(key, interfaceC42852.newBuilderForType().mergeFrom(interfaceC42852).mergeFrom((InterfaceC4285) entry.getValue()).build());
                    }
                } else {
                    setField(key, entry.getValue());
                }
            }
            mergeUnknownFields(interfaceC4285.getUnknownFields());
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeUnknownFields(C4536 c4536) {
            C4544 c4544NewBuilder = C4536.newBuilder(getUnknownFields());
            c4544NewBuilder.m8530(c4536);
            setUnknownFields(c4544NewBuilder.build());
            return this;
        }

        public abstract /* synthetic */ InterfaceC4286 newBuilderForField(C4489 c4489);

        public abstract /* synthetic */ InterfaceC4286 setField(C4489 c4489, Object obj);

        public abstract /* synthetic */ InterfaceC4286 setRepeatedField(C4489 c4489, int i, Object obj);

        public void setUnknownFieldSetBuilder(C4544 c4544) {
            setUnknownFields(c4544.build());
        }

        public abstract /* synthetic */ InterfaceC4286 setUnknownFields(C4536 c4536);

        public String toString() {
            C4548 c4548M8535 = C4548.m8535();
            TextFormat$Printer$FieldReporterLevel textFormat$Printer$FieldReporterLevel = TextFormat$Printer$FieldReporterLevel.REPORT_ALL;
            return c4548M8535.m8536(this);
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                AbstractC4309 abstractC4309M8253 = AbstractC4306.m8253(bArr, i, i2, false);
                mergeFrom((AbstractC4306) abstractC4309M8253);
                abstractC4309M8253.mo8271(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C1123.m1408(m8316("byte array"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(byte[] bArr, int i, int i2, C4529 c4529) throws InvalidProtocolBufferException {
            try {
                AbstractC4309 abstractC4309M8253 = AbstractC4306.m8253(bArr, i, i2, false);
                mergeFrom((AbstractC4306) abstractC4309M8253, c4529);
                abstractC4309M8253.mo8271(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C1123.m1408(m8316("byte array"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                AbstractC4306 abstractC4306NewCodedInput = byteString.newCodedInput();
                mergeFrom(abstractC4306NewCodedInput);
                abstractC4306NewCodedInput.mo8271(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C1123.m1408(m8316("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC4282
        public AbstractC4366 mergeFrom(ByteString byteString, C4529 c4529) throws InvalidProtocolBufferException {
            try {
                AbstractC4306 abstractC4306NewCodedInput = byteString.newCodedInput();
                mergeFrom(abstractC4306NewCodedInput, c4529);
                abstractC4306NewCodedInput.mo8271(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C1123.m1408(m8316("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC4282
        public AbstractC4366 mergeFrom(byte[] bArr) {
            return (AbstractC4366) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(byte[] bArr, C4529 c4529) {
            return (AbstractC4366) mergeFrom(bArr, 0, bArr.length, c4529);
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(InputStream inputStream) {
            AbstractC4306 abstractC4306M8254 = AbstractC4306.m8254(inputStream);
            mergeFrom(abstractC4306M8254);
            abstractC4306M8254.mo8271(0);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4362, com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(InputStream inputStream, C4529 c4529) {
            AbstractC4306 abstractC4306M8254 = AbstractC4306.m8254(inputStream);
            mergeFrom(abstractC4306M8254, c4529);
            abstractC4306M8254.mo8271(0);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(InterfaceC4285 interfaceC4285) {
            return mergeFrom(interfaceC4285, (Map<C4489, Object>) interfaceC4285.getAllFields());
        }

        @Override // com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(AbstractC4306 abstractC4306) {
            return mergeFrom(abstractC4306, (C4529) C4525.f11837);
        }

        @Override // com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public AbstractC4366 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            abstractC4306.getClass();
            C4544 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
            C4271 c4271 = new C4271(this);
            C4495 descriptorForType = getDescriptorForType();
            while (true) {
                int iMo8264 = abstractC4306.mo8264();
                if (iMo8264 == 0) {
                    break;
                }
                AbstractC4306 abstractC43062 = abstractC4306;
                C4529 c45292 = c4529;
                if (!AbstractC4245.m8078(abstractC43062, unknownFieldSetBuilder, c45292, descriptorForType, c4271, iMo8264)) {
                    break;
                }
                abstractC4306 = abstractC43062;
                c4529 = c45292;
            }
            if (unknownFieldSetBuilder != null) {
                setUnknownFieldSetBuilder(unknownFieldSetBuilder);
            }
            return this;
        }
    }
}
