package com.google.protobuf;

import androidx.collection.C0276;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3532 extends AbstractC3528 implements InterfaceC3452 {
    protected int memoizedSize = -1;

    private static boolean compareBytes(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : toByteString(obj).equals(toByteString(obj2));
    }

    public static boolean compareFields(Map<C3656, Object> map, Map<C3656, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C3656 c3656 : map.keySet()) {
            if (!map2.containsKey(c3656)) {
                return false;
            }
            Object obj = map.get(c3656);
            Object obj2 = map2.get(c3656);
            if (c3656.m7870() == Descriptors$FieldDescriptor$Type.BYTES) {
                if (c3656.mo7819()) {
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
            } else if (c3656.m7872()) {
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
        InterfaceC3452 interfaceC3452 = (InterfaceC3452) it.next();
        C3662 descriptorForType = interfaceC3452.getDescriptorForType();
        C3656 c3656M7890 = descriptorForType.m7890("key");
        C3656 c3656M78902 = descriptorForType.m7890("value");
        Object field = interfaceC3452.getField(c3656M78902);
        if (field instanceof C3663) {
            field = Integer.valueOf(((C3663) field).f11381.getNumber());
        }
        map.put(interfaceC3452.getField(c3656M7890), field);
        while (it.hasNext()) {
            InterfaceC3452 interfaceC34522 = (InterfaceC3452) it.next();
            Object field2 = interfaceC34522.getField(c3656M78902);
            if (field2 instanceof C3663) {
                field2 = Integer.valueOf(((C3663) field2).f11381.getNumber());
            }
            map.put(interfaceC34522.getField(c3656M7890), field2);
        }
        return map;
    }

    public static int hashFields(int i, Map<C3656, Object> map) {
        int iHashMapField;
        int i2;
        int iHashCode;
        for (Map.Entry<C3656, Object> entry : map.entrySet()) {
            C3656 key = entry.getKey();
            Object value = entry.getValue();
            int number = key.f11350.getNumber() + (i * 37);
            if (key.m7872()) {
                iHashMapField = (number * 53) + hashMapField(value);
            } else {
                if (key.m7870() != Descriptors$FieldDescriptor$Type.ENUM) {
                    i2 = number * 53;
                    iHashCode = value.hashCode();
                } else if (key.mo7819()) {
                    int i3 = number * 53;
                    Iterator it = ((List) value).iterator();
                    int number2 = 1;
                    while (it.hasNext()) {
                        number2 = (number2 * 31) + ((InterfaceC3398) it.next()).getNumber();
                    }
                    iHashMapField = i3 + number2;
                } else {
                    i2 = number * 53;
                    iHashCode = ((InterfaceC3398) value).getNumber();
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
        if (!(obj instanceof InterfaceC3452)) {
            return false;
        }
        InterfaceC3452 interfaceC3452 = (InterfaceC3452) obj;
        return getDescriptorForType() == interfaceC3452.getDescriptorForType() && compareFields(getAllFields(), interfaceC3452.getAllFields()) && getUnknownFields().equals(interfaceC3452.getUnknownFields());
    }

    @Override // com.google.protobuf.InterfaceC3452
    public List<String> findInitializationErrors() {
        ArrayList arrayList = new ArrayList();
        AbstractC3412.m7537(this, "", arrayList);
        return arrayList;
    }

    public abstract /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    public abstract /* synthetic */ C3662 getDescriptorForType();

    public abstract /* synthetic */ Object getField(C3656 c3656);

    @Override // com.google.protobuf.InterfaceC3452
    public String getInitializationErrorString() {
        return AbstractC3412.m7529(findInitializationErrors());
    }

    @Override // com.google.protobuf.AbstractC3528
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public C3656 getOneofFieldDescriptor(C3593 c3593) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3374 getParserForType();

    public abstract /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    public abstract /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7540 = AbstractC3412.m7540(this, getAllFields());
        this.memoizedSize = iM7540;
        return iM7540;
    }

    public abstract /* synthetic */ C3703 getUnknownFields();

    public abstract /* synthetic */ boolean hasField(C3656 c3656);

    public boolean hasOneof(C3593 c3593) {
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

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public boolean isInitialized() {
        for (C3656 c3656 : getDescriptorForType().m7888()) {
            if (c3656.m7867() && !hasField(c3656)) {
                return false;
            }
        }
        for (Map.Entry entry : getAllFields().entrySet()) {
            C3656 c36562 = (C3656) entry.getKey();
            if (c36562.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c36562.mo7819()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC3452) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC3452) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3453 newBuilderForType();

    public InterfaceC3453 newBuilderForType(InterfaceC3531 interfaceC3531) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.google.protobuf.AbstractC3528
    public UninitializedMessageException newUninitializedMessageException() {
        return AbstractC3533.newUninitializedMessageException((InterfaceC3452) this);
    }

    @Override // com.google.protobuf.AbstractC3528
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3453 toBuilder();

    @Override // com.google.protobuf.InterfaceC3452
    public final String toString() {
        C3715 c3715M7989 = C3715.m7989();
        TextFormat$Printer$FieldReporterLevel textFormat$Printer$FieldReporterLevel = TextFormat$Printer$FieldReporterLevel.REPORT_ALL;
        return c3715M7989.m7990(this);
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        AbstractC3412.m7534(this, getAllFields(), abstractC3461);
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 newBuilderForType() {
        return super.newBuilderForType();
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractC3533 extends AbstractC3529 implements InterfaceC3453 {
        public static UninitializedMessageException newUninitializedMessageException(InterfaceC3452 interfaceC3452) {
            ArrayList arrayList = new ArrayList();
            AbstractC3412.m7537(interfaceC3452, "", arrayList);
            return new UninitializedMessageException(arrayList);
        }

        public abstract /* synthetic */ InterfaceC3453 addRepeatedField(C3656 c3656, Object obj);

        @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 build() {
            return super.build();
        }

        @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 build();

        @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 buildPartial();

        @Override // com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public AbstractC3533 mo7355clear() {
            Iterator it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField((C3656) ((Map.Entry) it.next()).getKey());
            }
            return this;
        }

        public abstract /* synthetic */ InterfaceC3453 clearField(C3656 c3656);

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 clearOneof(C3593 c3593) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public AbstractC3533 mo7357clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.google.protobuf.InterfaceC3453
        public List<String> findInitializationErrors() {
            ArrayList arrayList = new ArrayList();
            AbstractC3412.m7537(this, "", arrayList);
            return arrayList;
        }

        public abstract /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

        public abstract /* synthetic */ C3662 getDescriptorForType();

        public abstract /* synthetic */ Object getField(C3656 c3656);

        public InterfaceC3453 getFieldBuilder(C3656 c3656) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.google.protobuf.InterfaceC3453
        public String getInitializationErrorString() {
            return AbstractC3412.m7529(findInitializationErrors());
        }

        public C3656 getOneofFieldDescriptor(C3593 c3593) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        public abstract /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

        public InterfaceC3453 getRepeatedFieldBuilder(C3656 c3656, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        public abstract /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

        public C3711 getUnknownFieldSetBuilder() {
            return C3703.newBuilder(getUnknownFields());
        }

        public abstract /* synthetic */ C3703 getUnknownFields();

        public abstract /* synthetic */ boolean hasField(C3656 c3656);

        public boolean hasOneof(C3593 c3593) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC3529
        public AbstractC3533 internalMergeFrom(AbstractC3528 abstractC3528) {
            return mergeFrom((InterfaceC3452) abstractC3528);
        }

        @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ boolean isInitialized();

        public void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public AbstractC3533 mergeFrom(InterfaceC3452 interfaceC3452, Map<C3656, Object> map) {
            if (interfaceC3452.getDescriptorForType() != getDescriptorForType()) {
                C5919.m11249("mergeFrom(Message) can only merge messages of the same type.");
                return null;
            }
            for (Map.Entry<C3656, Object> entry : map.entrySet()) {
                C3656 key = entry.getKey();
                if (key.mo7819()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        addRepeatedField(key, it.next());
                    }
                } else if (key.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                    InterfaceC3452 interfaceC34522 = (InterfaceC3452) getField(key);
                    if (interfaceC34522 == interfaceC34522.getDefaultInstanceForType()) {
                        setField(key, entry.getValue());
                    } else {
                        setField(key, interfaceC34522.newBuilderForType().mergeFrom(interfaceC34522).mergeFrom((InterfaceC3452) entry.getValue()).build());
                    }
                } else {
                    setField(key, entry.getValue());
                }
            }
            mergeUnknownFields(interfaceC3452.getUnknownFields());
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeUnknownFields(C3703 c3703) {
            C3711 c3711NewBuilder = C3703.newBuilder(getUnknownFields());
            c3711NewBuilder.m7984(c3703);
            setUnknownFields(c3711NewBuilder.build());
            return this;
        }

        public abstract /* synthetic */ InterfaceC3453 newBuilderForField(C3656 c3656);

        public abstract /* synthetic */ InterfaceC3453 setField(C3656 c3656, Object obj);

        public abstract /* synthetic */ InterfaceC3453 setRepeatedField(C3656 c3656, int i, Object obj);

        public void setUnknownFieldSetBuilder(C3711 c3711) {
            setUnknownFields(c3711.build());
        }

        public abstract /* synthetic */ InterfaceC3453 setUnknownFields(C3703 c3703);

        public String toString() {
            C3715 c3715M7989 = C3715.m7989();
            TextFormat$Printer$FieldReporterLevel textFormat$Printer$FieldReporterLevel = TextFormat$Printer$FieldReporterLevel.REPORT_ALL;
            return c3715M7989.m7990(this);
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                AbstractC3476 abstractC3476M7707 = AbstractC3473.m7707(bArr, i, i2, false);
                mergeFrom((AbstractC3473) abstractC3476M7707);
                abstractC3476M7707.mo7725(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m847(m7770("byte array"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(byte[] bArr, int i, int i2, C3696 c3696) throws InvalidProtocolBufferException {
            try {
                AbstractC3476 abstractC3476M7707 = AbstractC3473.m7707(bArr, i, i2, false);
                mergeFrom((AbstractC3473) abstractC3476M7707, c3696);
                abstractC3476M7707.mo7725(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m847(m7770("byte array"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                AbstractC3473 abstractC3473NewCodedInput = byteString.newCodedInput();
                mergeFrom(abstractC3473NewCodedInput);
                abstractC3473NewCodedInput.mo7725(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m847(m7770("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3449
        public AbstractC3533 mergeFrom(ByteString byteString, C3696 c3696) throws InvalidProtocolBufferException {
            try {
                AbstractC3473 abstractC3473NewCodedInput = byteString.newCodedInput();
                mergeFrom(abstractC3473NewCodedInput, c3696);
                abstractC3473NewCodedInput.mo7725(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m847(m7770("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3449
        public AbstractC3533 mergeFrom(byte[] bArr) {
            return (AbstractC3533) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(byte[] bArr, C3696 c3696) {
            return (AbstractC3533) mergeFrom(bArr, 0, bArr.length, c3696);
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(InputStream inputStream) {
            AbstractC3473 abstractC3473M7708 = AbstractC3473.m7708(inputStream);
            mergeFrom(abstractC3473M7708);
            abstractC3473M7708.mo7725(0);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(InputStream inputStream, C3696 c3696) {
            AbstractC3473 abstractC3473M7708 = AbstractC3473.m7708(inputStream);
            mergeFrom(abstractC3473M7708, c3696);
            abstractC3473M7708.mo7725(0);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(InterfaceC3452 interfaceC3452) {
            return mergeFrom(interfaceC3452, (Map<C3656, Object>) interfaceC3452.getAllFields());
        }

        @Override // com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(AbstractC3473 abstractC3473) {
            return mergeFrom(abstractC3473, (C3696) C3692.f11487);
        }

        @Override // com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public AbstractC3533 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            abstractC3473.getClass();
            C3711 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
            C3438 c3438 = new C3438(this);
            C3662 descriptorForType = getDescriptorForType();
            while (true) {
                int iMo7718 = abstractC3473.mo7718();
                if (iMo7718 == 0) {
                    break;
                }
                AbstractC3473 abstractC34732 = abstractC3473;
                C3696 c36962 = c3696;
                if (!AbstractC3412.m7532(abstractC34732, unknownFieldSetBuilder, c36962, descriptorForType, c3438, iMo7718)) {
                    break;
                }
                abstractC3473 = abstractC34732;
                c3696 = c36962;
            }
            if (unknownFieldSetBuilder != null) {
                setUnknownFieldSetBuilder(unknownFieldSetBuilder);
            }
            return this;
        }
    }
}
