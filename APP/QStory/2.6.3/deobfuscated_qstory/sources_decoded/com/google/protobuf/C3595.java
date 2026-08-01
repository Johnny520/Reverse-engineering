package com.google.protobuf;

import bsh.C2633;
import com.google.protobuf.AbstractC3533;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3595 extends AbstractC3533 {
    private final C3680 fields;
    private int memoizedSize = -1;
    private final C3657[] oneofCases;
    private final C3663 type;
    private final C3704 unknownFields;

    public C3595(C3663 c3663, C3680 c3680, C3657[] c3657Arr, C3704 c3704) {
        this.type = c3663;
        this.fields = c3680;
        this.oneofCases = c3657Arr;
        this.unknownFields = c3704;
    }

    public static C3595 getDefaultInstance(C3663 c3663) {
        return new C3595(c3663, C3680.f11477, new C3657[c3663.f11378.getOneofDeclCount()], C3704.getDefaultInstance());
    }

    public static boolean isInitialized(C3663 c3663, C3680 c3680) {
        for (C3657 c3657 : c3663.m7875()) {
            if (c3657.m7854() && !c3680.m7920(c3657)) {
                return false;
            }
        }
        return c3680.m7918();
    }

    public static C3596 newBuilder(InterfaceC3453 interfaceC3453) {
        return new C3596(interfaceC3453.getDescriptorForType(), null).mergeFrom(interfaceC3453);
    }

    public static C3595 parseFrom(C3663 c3663, AbstractC3474 abstractC3474) {
        return ((C3596) newBuilder(c3663).mergeFrom(abstractC3474)).buildParsed();
    }

    private void verifyContainingType(C3657 c3657) {
        if (c3657.f11346 == this.type) {
            return;
        }
        C5925.m11310("FieldDescriptor does not match message type.");
    }

    private void verifyOneofContainingType(C3594 c3594) {
        if (c3594.f11227 == this.type) {
            return;
        }
        C5925.m11310("OneofDescriptor does not match message type.");
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public Map<C3657, Object> getAllFields() {
        return this.fields.m7922();
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3595 getDefaultInstanceForType() {
        return getDefaultInstance(this.type);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return this.type;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public Object getField(C3657 c3657) {
        verifyContainingType(c3657);
        Object objM7923 = this.fields.m7923(c3657);
        return objM7923 == null ? c3657.mo7806() ? Collections.EMPTY_LIST : c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? getDefaultInstance(c3657.m7858()) : c3657.m7864() : objM7923;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public C3657 getOneofFieldDescriptor(C3594 c3594) {
        verifyOneofContainingType(c3594);
        return this.oneofCases[c3594.f11231];
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return new C3598(this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public Object getRepeatedField(C3657 c3657, int i) {
        verifyContainingType(c3657);
        return this.fields.m7917(c3657, i);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int getRepeatedFieldCount(C3657 c3657) {
        verifyContainingType(c3657);
        return this.fields.m7916(c3657);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int iM7919;
        int serializedSize;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean messageSetWireFormat = this.type.m7876().getMessageSetWireFormat();
        C3680 c3680 = this.fields;
        if (messageSetWireFormat) {
            iM7919 = c3680.m7921();
            serializedSize = this.unknownFields.getSerializedSizeAsMessageSet();
        } else {
            iM7919 = c3680.m7919();
            serializedSize = this.unknownFields.getSerializedSize();
        }
        int i2 = serializedSize + iM7919;
        this.memoizedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public C3704 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public boolean hasField(C3657 c3657) {
        verifyContainingType(c3657);
        return this.fields.m7920(c3657);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean hasOneof(C3594 c3594) {
        verifyOneofContainingType(c3594);
        return this.oneofCases[c3594.f11231] != null;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3596 newBuilderForType() {
        return new C3596(this.type, null);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3596 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC3453) this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        boolean messageSetWireFormat = this.type.m7876().getMessageSetWireFormat();
        C3680 c3680 = this.fields;
        int i = 0;
        if (messageSetWireFormat) {
            C3350 c3350 = c3680.f11480;
            int i2 = c3350.f10995;
            while (i < i2) {
                C3680.m7895(c3350.m7407(i), abstractC3462);
                i++;
            }
            Iterator it = c3350.m7406().iterator();
            while (it.hasNext()) {
                C3680.m7895((Map.Entry) it.next(), abstractC3462);
            }
            this.unknownFields.writeAsMessageSetTo(abstractC3462);
            return;
        }
        C3350 c33502 = c3680.f11480;
        int i3 = c33502.f10995;
        while (i < i3) {
            C3351 c3351M7407 = c33502.m7407(i);
            C3680.m7896((InterfaceC3681) c3351M7407.f11000, c3351M7407.f10998, abstractC3462);
            i++;
        }
        for (Map.Entry entry : c33502.m7406()) {
            C3680.m7896((InterfaceC3681) entry.getKey(), entry.getValue(), abstractC3462);
        }
        this.unknownFields.writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏兰哲子$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3596 extends AbstractC3533.AbstractC3534 {
        private C3685 fields;
        private final C3657[] oneofCases;
        private final C3663 type;
        private C3704 unknownFields;

        private C3596(C3663 c3663) {
            this.type = c3663;
            C3680 c3680 = C3680.f11477;
            this.fields = new C3685(C3350.m7403());
            this.unknownFields = C3704.getDefaultInstance();
            this.oneofCases = new C3657[c3663.f11378.getOneofDeclCount()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3595 buildParsed() throws InvalidProtocolBufferException {
            if (isInitialized()) {
                return buildPartial();
            }
            C3663 c3663 = this.type;
            C3680 c3680M7935 = this.fields.m7935(false);
            C3657[] c3657Arr = this.oneofCases;
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) new C3595(c3663, c3680M7935, (C3657[]) Arrays.copyOf(c3657Arr, c3657Arr.length), this.unknownFields)).asInvalidProtocolBufferException();
        }

        private static InterfaceC3454 toMessageBuilder(Object obj) {
            if (obj instanceof InterfaceC3454) {
                return (InterfaceC3454) obj;
            }
            if (obj instanceof C3383) {
                obj = ((C3383) obj).m7488();
            }
            if (obj instanceof InterfaceC3453) {
                return ((InterfaceC3453) obj).toBuilder();
            }
            C2633.m5340(obj.getClass(), "Cannot convert ", " to Message.Builder");
            return null;
        }

        private void verifyContainingType(C3657 c3657) {
            if (c3657.f11346 == this.type) {
                return;
            }
            C5925.m11310("FieldDescriptor does not match message type.");
        }

        private void verifyOneofContainingType(C3594 c3594) {
            if (c3594.f11227 == this.type) {
                return;
            }
            C5925.m11310("OneofDescriptor does not match message type.");
        }

        private void verifySingularValueType(C3657 c3657, Object obj) {
            int i = AbstractC3597.f11233[c3657.m7857().ordinal()];
            if (i != 1) {
                if (i == 2 && (obj instanceof InterfaceC3454)) {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c3657.f11355.getNumber()), c3657.mo7807().getJavaType(), obj.getClass().getName()));
                }
            } else {
                obj.getClass();
                if (obj instanceof C3664) {
                    return;
                }
                C5925.m11310("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        private void verifyType(C3657 c3657, Object obj) {
            if (!c3657.mo7806()) {
                verifySingularValueType(c3657, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                verifySingularValueType(c3657, it.next());
            }
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 addRepeatedField(C3657 c3657, Object obj) {
            verifyContainingType(c3657);
            verifySingularValueType(c3657, obj);
            this.fields.m7936(c3657, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3595 build() {
            if (isInitialized()) {
                return buildPartial();
            }
            C3663 c3663 = this.type;
            C3680 c3680M7935 = this.fields.m7935(false);
            C3657[] c3657Arr = this.oneofCases;
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) new C3595(c3663, c3680M7935, (C3657[]) Arrays.copyOf(c3657Arr, c3657Arr.length), this.unknownFields));
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3595 buildPartial() {
            if (this.type.m7876().getMapEntry()) {
                for (C3657 c3657 : this.type.m7875()) {
                    if (c3657.m7856() && !this.fields.m7945(c3657)) {
                        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM7863 = c3657.m7863();
                        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.MESSAGE;
                        C3685 c3685 = this.fields;
                        if (descriptors$FieldDescriptor$JavaTypeM7863 == descriptors$FieldDescriptor$JavaType) {
                            c3685.m7938(c3657, C3595.getDefaultInstance(c3657.m7858()));
                        } else {
                            c3685.m7938(c3657, c3657.m7864());
                        }
                    }
                }
            }
            C3663 c3663 = this.type;
            C3680 c3680M7935 = this.fields.m7935(true);
            C3657[] c3657Arr = this.oneofCases;
            return new C3595(c3663, c3680M7935, (C3657[]) Arrays.copyOf(c3657Arr, c3657Arr.length), this.unknownFields);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3596 mo7342clear() {
            C3680 c3680 = C3680.f11477;
            this.fields = new C3685(C3350.m7403());
            this.unknownFields = C3704.getDefaultInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 clearField(C3657 c3657) {
            verifyContainingType(c3657);
            C3594 c3594 = c3657.f11345;
            if (c3594 != null) {
                int i = c3594.f11231;
                C3657[] c3657Arr = this.oneofCases;
                if (c3657Arr[i] == c3657) {
                    c3657Arr[i] = null;
                }
            }
            this.fields.m7934(c3657);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 clearOneof(C3594 c3594) {
            verifyOneofContainingType(c3594);
            C3657 c3657 = this.oneofCases[c3594.f11231];
            if (c3657 != null) {
                clearField(c3657);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534
        /* JADX INFO: renamed from: clone */
        public C3596 mo7344clone() {
            C3596 c3596 = new C3596(this.type);
            c3596.fields.m7943(this.fields.m7935(false));
            c3596.mergeUnknownFields(this.unknownFields);
            C3657[] c3657Arr = this.oneofCases;
            System.arraycopy(c3657Arr, 0, c3596.oneofCases, 0, c3657Arr.length);
            return c3596;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Map<C3657, Object> getAllFields() {
            return this.fields.m7932();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3595 getDefaultInstanceForType() {
            return C3595.getDefaultInstance(this.type);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return this.type;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Object getField(C3657 c3657) {
            verifyContainingType(c3657);
            Object objM7931 = this.fields.m7931(c3657);
            return objM7931 == null ? c3657.mo7806() ? Collections.EMPTY_LIST : c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C3595.getDefaultInstance(c3657.m7858()) : c3657.m7864() : objM7931;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 getFieldBuilder(C3657 c3657) {
            verifyContainingType(c3657);
            if (c3657.m7859()) {
                C5925.m11308("Nested builder not supported for map fields.");
                return null;
            }
            if (c3657.m7863() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5925.m11308("getFieldBuilder() called on a non-Message type.");
                return null;
            }
            Object objM7941 = this.fields.m7941(c3657);
            InterfaceC3454 c3596 = objM7941 == null ? new C3596(c3657.m7858()) : toMessageBuilder(objM7941);
            this.fields.m7938(c3657, c3596);
            return c3596;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3657 getOneofFieldDescriptor(C3594 c3594) {
            verifyOneofContainingType(c3594);
            return this.oneofCases[c3594.f11231];
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public Object getRepeatedField(C3657 c3657, int i) {
            verifyContainingType(c3657);
            C3685 c3685 = this.fields;
            if (c3685.f11484) {
                c3685.m7933();
            }
            return C3685.m7928(c3685.m7940(c3657, i), true);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 getRepeatedFieldBuilder(C3657 c3657, int i) {
            verifyContainingType(c3657);
            if (c3657.m7859()) {
                C5925.m11308("Map fields cannot be repeated");
                return null;
            }
            if (c3657.m7863() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5925.m11308("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC3454 messageBuilder = toMessageBuilder(this.fields.m7940(c3657, i));
            this.fields.m7939(c3657, i, messageBuilder);
            return messageBuilder;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public int getRepeatedFieldCount(C3657 c3657) {
            verifyContainingType(c3657);
            return this.fields.m7944(c3657);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public C3704 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public boolean hasField(C3657 c3657) {
            verifyContainingType(c3657);
            return this.fields.m7945(c3657);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public boolean hasOneof(C3594 c3594) {
            verifyOneofContainingType(c3594);
            return this.oneofCases[c3594.f11231] != null;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public boolean isInitialized() {
            for (C3657 c3657 : this.type.m7875()) {
                if (c3657.m7854() && !this.fields.m7945(c3657)) {
                    return false;
                }
            }
            return this.fields.m7942();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (!(interfaceC3453 instanceof C3595)) {
                return (C3596) super.mergeFrom(interfaceC3453);
            }
            C3595 c3595 = (C3595) interfaceC3453;
            if (c3595.type != this.type) {
                C5925.m11310("mergeFrom(Message) can only merge messages of the same type.");
                return null;
            }
            this.fields.m7943(c3595.fields);
            mergeUnknownFields(c3595.unknownFields);
            int i = 0;
            while (true) {
                C3657[] c3657Arr = this.oneofCases;
                if (i >= c3657Arr.length) {
                    return this;
                }
                if (c3657Arr[i] == null) {
                    c3657Arr[i] = c3595.oneofCases[i];
                } else if (c3595.oneofCases[i] != null && this.oneofCases[i] != c3595.oneofCases[i]) {
                    this.fields.m7934(this.oneofCases[i]);
                    this.oneofCases[i] = c3595.oneofCases[i];
                }
                i++;
            }
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 mergeUnknownFields(C3704 c3704) {
            C3712 c3712NewBuilder = C3704.newBuilder(this.unknownFields);
            c3712NewBuilder.m7971(c3704);
            this.unknownFields = c3712NewBuilder.build();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 newBuilderForField(C3657 c3657) {
            verifyContainingType(c3657);
            if (c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                return new C3596(c3657.m7858());
            }
            C5925.m11310("newBuilderForField is only valid for fields with message type.");
            return null;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 setField(C3657 c3657, Object obj) {
            verifyContainingType(c3657);
            verifyType(c3657, obj);
            C3594 c3594 = c3657.f11345;
            if (c3594 != null) {
                int i = c3594.f11231;
                C3657 c36572 = this.oneofCases[i];
                if (c36572 != null && c36572 != c3657) {
                    this.fields.m7934(c36572);
                }
                this.oneofCases[i] = c3657;
            } else if (!c3657.m7860() && (!c3657.mo7806() ? obj.equals(c3657.m7864()) : ((List) obj).isEmpty())) {
                this.fields.m7934(c3657);
                return this;
            }
            this.fields.m7938(c3657, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 setRepeatedField(C3657 c3657, int i, Object obj) {
            verifyContainingType(c3657);
            verifySingularValueType(c3657, obj);
            this.fields.m7939(c3657, i, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3596 setUnknownFields(C3704 c3704) {
            this.unknownFields = c3704;
            return this;
        }

        public /* synthetic */ C3596(C3663 c3663, C3598 c3598) {
            this(c3663);
        }
    }

    public static C3596 newBuilder(C3663 c3663) {
        return new C3596(c3663, null);
    }

    public static C3595 parseFrom(C3663 c3663, AbstractC3474 abstractC3474, C3693 c3693) {
        return ((C3596) newBuilder(c3663).mergeFrom(abstractC3474, (C3697) c3693)).buildParsed();
    }

    public static C3595 parseFrom(C3663 c3663, ByteString byteString) {
        return ((C3596) newBuilder(c3663).mergeFrom(byteString)).buildParsed();
    }

    public static C3595 parseFrom(C3663 c3663, ByteString byteString, C3693 c3693) {
        return ((C3596) newBuilder(c3663).mergeFrom(byteString, (C3697) c3693)).buildParsed();
    }

    public static C3595 parseFrom(C3663 c3663, byte[] bArr) {
        return ((C3596) newBuilder(c3663).mergeFrom(bArr)).buildParsed();
    }

    public static C3595 parseFrom(C3663 c3663, byte[] bArr, C3693 c3693) {
        return ((C3596) newBuilder(c3663).mergeFrom(bArr, (C3697) c3693)).buildParsed();
    }

    public static C3595 parseFrom(C3663 c3663, InputStream inputStream) {
        return ((C3596) newBuilder(c3663).mergeFrom(inputStream)).buildParsed();
    }

    public static C3595 parseFrom(C3663 c3663, InputStream inputStream, C3693 c3693) {
        return ((C3596) newBuilder(c3663).mergeFrom(inputStream, (C3697) c3693)).buildParsed();
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public boolean isInitialized() {
        return isInitialized(this.type, this.fields);
    }
}
