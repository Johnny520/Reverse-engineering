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
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3533 extends AbstractC3529 implements InterfaceC3453 {
    protected int memoizedSize = -1;

    private static boolean compareBytes(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : toByteString(obj).equals(toByteString(obj2));
    }

    public static boolean compareFields(Map<C3657, Object> map, Map<C3657, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C3657 c3657 : map.keySet()) {
            if (!map2.containsKey(c3657)) {
                return false;
            }
            Object obj = map.get(c3657);
            Object obj2 = map2.get(c3657);
            if (c3657.m7857() == Descriptors$FieldDescriptor$Type.BYTES) {
                if (c3657.mo7806()) {
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
            } else if (c3657.m7859()) {
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
        InterfaceC3453 interfaceC3453 = (InterfaceC3453) it.next();
        C3663 descriptorForType = interfaceC3453.getDescriptorForType();
        C3657 c3657M7877 = descriptorForType.m7877("key");
        C3657 c3657M78772 = descriptorForType.m7877("value");
        Object field = interfaceC3453.getField(c3657M78772);
        if (field instanceof C3664) {
            field = Integer.valueOf(((C3664) field).f11386.getNumber());
        }
        map.put(interfaceC3453.getField(c3657M7877), field);
        while (it.hasNext()) {
            InterfaceC3453 interfaceC34532 = (InterfaceC3453) it.next();
            Object field2 = interfaceC34532.getField(c3657M78772);
            if (field2 instanceof C3664) {
                field2 = Integer.valueOf(((C3664) field2).f11386.getNumber());
            }
            map.put(interfaceC34532.getField(c3657M7877), field2);
        }
        return map;
    }

    public static int hashFields(int i, Map<C3657, Object> map) {
        int iHashMapField;
        int i2;
        int iHashCode;
        for (Map.Entry<C3657, Object> entry : map.entrySet()) {
            C3657 key = entry.getKey();
            Object value = entry.getValue();
            int number = key.f11355.getNumber() + (i * 37);
            if (key.m7859()) {
                iHashMapField = (number * 53) + hashMapField(value);
            } else {
                if (key.m7857() != Descriptors$FieldDescriptor$Type.ENUM) {
                    i2 = number * 53;
                    iHashCode = value.hashCode();
                } else if (key.mo7806()) {
                    int i3 = number * 53;
                    Iterator it = ((List) value).iterator();
                    int number2 = 1;
                    while (it.hasNext()) {
                        number2 = (number2 * 31) + ((InterfaceC3399) it.next()).getNumber();
                    }
                    iHashMapField = i3 + number2;
                } else {
                    i2 = number * 53;
                    iHashCode = ((InterfaceC3399) value).getNumber();
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
        if (!(obj instanceof InterfaceC3453)) {
            return false;
        }
        InterfaceC3453 interfaceC3453 = (InterfaceC3453) obj;
        return getDescriptorForType() == interfaceC3453.getDescriptorForType() && compareFields(getAllFields(), interfaceC3453.getAllFields()) && getUnknownFields().equals(interfaceC3453.getUnknownFields());
    }

    @Override // com.google.protobuf.InterfaceC3453
    public List<String> findInitializationErrors() {
        ArrayList arrayList = new ArrayList();
        AbstractC3413.m7524(this, "", arrayList);
        return arrayList;
    }

    public abstract /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    public abstract /* synthetic */ C3663 getDescriptorForType();

    public abstract /* synthetic */ Object getField(C3657 c3657);

    @Override // com.google.protobuf.InterfaceC3453
    public String getInitializationErrorString() {
        return AbstractC3413.m7516(findInitializationErrors());
    }

    @Override // com.google.protobuf.AbstractC3529
    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public C3657 getOneofFieldDescriptor(C3594 c3594) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3375 getParserForType();

    public abstract /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

    public abstract /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7527 = AbstractC3413.m7527(this, getAllFields());
        this.memoizedSize = iM7527;
        return iM7527;
    }

    public abstract /* synthetic */ C3704 getUnknownFields();

    public abstract /* synthetic */ boolean hasField(C3657 c3657);

    public boolean hasOneof(C3594 c3594) {
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

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public boolean isInitialized() {
        for (C3657 c3657 : getDescriptorForType().m7875()) {
            if (c3657.m7854() && !hasField(c3657)) {
                return false;
            }
        }
        for (Map.Entry entry : getAllFields().entrySet()) {
            C3657 c36572 = (C3657) entry.getKey();
            if (c36572.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c36572.mo7806()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC3453) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (!((InterfaceC3453) entry.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3454 newBuilderForType();

    public InterfaceC3454 newBuilderForType(InterfaceC3532 interfaceC3532) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    @Override // com.google.protobuf.AbstractC3529
    public UninitializedMessageException newUninitializedMessageException() {
        return AbstractC3534.newUninitializedMessageException((InterfaceC3453) this);
    }

    @Override // com.google.protobuf.AbstractC3529
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3454 toBuilder();

    @Override // com.google.protobuf.InterfaceC3453
    public final String toString() {
        C3716 c3716M7976 = C3716.m7976();
        TextFormat$Printer$FieldReporterLevel textFormat$Printer$FieldReporterLevel = TextFormat$Printer$FieldReporterLevel.REPORT_ALL;
        return c3716M7976.m7977(this);
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        AbstractC3413.m7521(this, getAllFields(), abstractC3462);
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 newBuilderForType() {
        return super.newBuilderForType();
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世苏哲兰$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC3534 extends AbstractC3530 implements InterfaceC3454 {
        public static UninitializedMessageException newUninitializedMessageException(InterfaceC3453 interfaceC3453) {
            ArrayList arrayList = new ArrayList();
            AbstractC3413.m7524(interfaceC3453, "", arrayList);
            return new UninitializedMessageException(arrayList);
        }

        public abstract /* synthetic */ InterfaceC3454 addRepeatedField(C3657 c3657, Object obj);

        @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 build() {
            return super.build();
        }

        @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 build();

        @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 buildPartial();

        @Override // com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public AbstractC3534 mo7342clear() {
            Iterator it = getAllFields().entrySet().iterator();
            while (it.hasNext()) {
                clearField((C3657) ((Map.Entry) it.next()).getKey());
            }
            return this;
        }

        public abstract /* synthetic */ InterfaceC3454 clearField(C3657 c3657);

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 clearOneof(C3594 c3594) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public AbstractC3534 mo7344clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        @Override // com.google.protobuf.InterfaceC3454
        public List<String> findInitializationErrors() {
            ArrayList arrayList = new ArrayList();
            AbstractC3413.m7524(this, "", arrayList);
            return arrayList;
        }

        public abstract /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

        public abstract /* synthetic */ C3663 getDescriptorForType();

        public abstract /* synthetic */ Object getField(C3657 c3657);

        public InterfaceC3454 getFieldBuilder(C3657 c3657) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        @Override // com.google.protobuf.InterfaceC3454
        public String getInitializationErrorString() {
            return AbstractC3413.m7516(findInitializationErrors());
        }

        public C3657 getOneofFieldDescriptor(C3594 c3594) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        public abstract /* synthetic */ Object getRepeatedField(C3657 c3657, int i);

        public InterfaceC3454 getRepeatedFieldBuilder(C3657 c3657, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        public abstract /* synthetic */ int getRepeatedFieldCount(C3657 c3657);

        public C3712 getUnknownFieldSetBuilder() {
            return C3704.newBuilder(getUnknownFields());
        }

        public abstract /* synthetic */ C3704 getUnknownFields();

        public abstract /* synthetic */ boolean hasField(C3657 c3657);

        public boolean hasOneof(C3594 c3594) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractC3530
        public AbstractC3534 internalMergeFrom(AbstractC3529 abstractC3529) {
            return mergeFrom((InterfaceC3453) abstractC3529);
        }

        @Override // com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ boolean isInitialized();

        public void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public AbstractC3534 mergeFrom(InterfaceC3453 interfaceC3453, Map<C3657, Object> map) {
            if (interfaceC3453.getDescriptorForType() != getDescriptorForType()) {
                C5925.m11310("mergeFrom(Message) can only merge messages of the same type.");
                return null;
            }
            for (Map.Entry<C3657, Object> entry : map.entrySet()) {
                C3657 key = entry.getKey();
                if (key.mo7806()) {
                    Iterator it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        addRepeatedField(key, it.next());
                    }
                } else if (key.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                    InterfaceC3453 interfaceC34532 = (InterfaceC3453) getField(key);
                    if (interfaceC34532 == interfaceC34532.getDefaultInstanceForType()) {
                        setField(key, entry.getValue());
                    } else {
                        setField(key, interfaceC34532.newBuilderForType().mergeFrom(interfaceC34532).mergeFrom((InterfaceC3453) entry.getValue()).build());
                    }
                } else {
                    setField(key, entry.getValue());
                }
            }
            mergeUnknownFields(interfaceC3453.getUnknownFields());
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeUnknownFields(C3704 c3704) {
            C3712 c3712NewBuilder = C3704.newBuilder(getUnknownFields());
            c3712NewBuilder.m7971(c3704);
            setUnknownFields(c3712NewBuilder.build());
            return this;
        }

        public abstract /* synthetic */ InterfaceC3454 newBuilderForField(C3657 c3657);

        public abstract /* synthetic */ InterfaceC3454 setField(C3657 c3657, Object obj);

        public abstract /* synthetic */ InterfaceC3454 setRepeatedField(C3657 c3657, int i, Object obj);

        public void setUnknownFieldSetBuilder(C3712 c3712) {
            setUnknownFields(c3712.build());
        }

        public abstract /* synthetic */ InterfaceC3454 setUnknownFields(C3704 c3704);

        public String toString() {
            C3716 c3716M7976 = C3716.m7976();
            TextFormat$Printer$FieldReporterLevel textFormat$Printer$FieldReporterLevel = TextFormat$Printer$FieldReporterLevel.REPORT_ALL;
            return c3716M7976.m7977(this);
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                AbstractC3477 abstractC3477M7694 = AbstractC3474.m7694(bArr, i, i2, false);
                mergeFrom((AbstractC3474) abstractC3477M7694);
                abstractC3477M7694.mo7712(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m848(m7757("byte array"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(byte[] bArr, int i, int i2, C3697 c3697) throws InvalidProtocolBufferException {
            try {
                AbstractC3477 abstractC3477M7694 = AbstractC3474.m7694(bArr, i, i2, false);
                mergeFrom((AbstractC3474) abstractC3477M7694, c3697);
                abstractC3477M7694.mo7712(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m848(m7757("byte array"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                AbstractC3474 abstractC3474NewCodedInput = byteString.newCodedInput();
                mergeFrom(abstractC3474NewCodedInput);
                abstractC3474NewCodedInput.mo7712(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m848(m7757("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3450
        public AbstractC3534 mergeFrom(ByteString byteString, C3697 c3697) throws InvalidProtocolBufferException {
            try {
                AbstractC3474 abstractC3474NewCodedInput = byteString.newCodedInput();
                mergeFrom(abstractC3474NewCodedInput, c3697);
                abstractC3474NewCodedInput.mo7712(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                C0276.m848(m7757("ByteString"), e2);
                return null;
            }
        }

        @Override // com.google.protobuf.InterfaceC3450
        public AbstractC3534 mergeFrom(byte[] bArr) {
            return (AbstractC3534) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(byte[] bArr, C3697 c3697) {
            return (AbstractC3534) mergeFrom(bArr, 0, bArr.length, c3697);
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(InputStream inputStream) {
            AbstractC3474 abstractC3474M7695 = AbstractC3474.m7695(inputStream);
            mergeFrom(abstractC3474M7695);
            abstractC3474M7695.mo7712(0);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3530, com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(InputStream inputStream, C3697 c3697) {
            AbstractC3474 abstractC3474M7695 = AbstractC3474.m7695(inputStream);
            mergeFrom(abstractC3474M7695, c3697);
            abstractC3474M7695.mo7712(0);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(InterfaceC3453 interfaceC3453) {
            return mergeFrom(interfaceC3453, (Map<C3657, Object>) interfaceC3453.getAllFields());
        }

        @Override // com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(AbstractC3474 abstractC3474) {
            return mergeFrom(abstractC3474, (C3697) C3693.f11492);
        }

        @Override // com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public AbstractC3534 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            abstractC3474.getClass();
            C3712 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
            C3439 c3439 = new C3439(this);
            C3663 descriptorForType = getDescriptorForType();
            while (true) {
                int iMo7705 = abstractC3474.mo7705();
                if (iMo7705 == 0) {
                    break;
                }
                AbstractC3474 abstractC34742 = abstractC3474;
                C3697 c36972 = c3697;
                if (!AbstractC3413.m7519(abstractC34742, unknownFieldSetBuilder, c36972, descriptorForType, c3439, iMo7705)) {
                    break;
                }
                abstractC3474 = abstractC34742;
                c3697 = c36972;
            }
            if (unknownFieldSetBuilder != null) {
                setUnknownFieldSetBuilder(unknownFieldSetBuilder);
            }
            return this;
        }
    }
}
