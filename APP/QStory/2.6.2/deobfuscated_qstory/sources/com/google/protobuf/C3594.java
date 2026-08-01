package com.google.protobuf;

import bsh.C2632;
import com.google.protobuf.AbstractC3532;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3594 extends AbstractC3532 {
    private final C3679 fields;
    private int memoizedSize = -1;
    private final C3656[] oneofCases;
    private final C3662 type;
    private final C3703 unknownFields;

    public C3594(C3662 c3662, C3679 c3679, C3656[] c3656Arr, C3703 c3703) {
        this.type = c3662;
        this.fields = c3679;
        this.oneofCases = c3656Arr;
        this.unknownFields = c3703;
    }

    public static C3594 getDefaultInstance(C3662 c3662) {
        return new C3594(c3662, C3679.f11472, new C3656[c3662.f11373.getOneofDeclCount()], C3703.getDefaultInstance());
    }

    public static boolean isInitialized(C3662 c3662, C3679 c3679) {
        for (C3656 c3656 : c3662.m7888()) {
            if (c3656.m7867() && !c3679.m7933(c3656)) {
                return false;
            }
        }
        return c3679.m7931();
    }

    public static C3595 newBuilder(InterfaceC3452 interfaceC3452) {
        return new C3595(interfaceC3452.getDescriptorForType(), null).mergeFrom(interfaceC3452);
    }

    public static C3594 parseFrom(C3662 c3662, AbstractC3473 abstractC3473) {
        return ((C3595) newBuilder(c3662).mergeFrom(abstractC3473)).buildParsed();
    }

    private void verifyContainingType(C3656 c3656) {
        if (c3656.f11341 == this.type) {
            return;
        }
        C5919.m11249("FieldDescriptor does not match message type.");
    }

    private void verifyOneofContainingType(C3593 c3593) {
        if (c3593.f11222 == this.type) {
            return;
        }
        C5919.m11249("OneofDescriptor does not match message type.");
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public Map<C3656, Object> getAllFields() {
        return this.fields.m7935();
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3594 getDefaultInstanceForType() {
        return getDefaultInstance(this.type);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return this.type;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public Object getField(C3656 c3656) {
        verifyContainingType(c3656);
        Object objM7936 = this.fields.m7936(c3656);
        return objM7936 == null ? c3656.mo7819() ? Collections.EMPTY_LIST : c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? getDefaultInstance(c3656.m7871()) : c3656.m7877() : objM7936;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public C3656 getOneofFieldDescriptor(C3593 c3593) {
        verifyOneofContainingType(c3593);
        return this.oneofCases[c3593.f11226];
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return new C3597(this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public Object getRepeatedField(C3656 c3656, int i) {
        verifyContainingType(c3656);
        return this.fields.m7930(c3656, i);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int getRepeatedFieldCount(C3656 c3656) {
        verifyContainingType(c3656);
        return this.fields.m7929(c3656);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int iM7932;
        int serializedSize;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean messageSetWireFormat = this.type.m7889().getMessageSetWireFormat();
        C3679 c3679 = this.fields;
        if (messageSetWireFormat) {
            iM7932 = c3679.m7934();
            serializedSize = this.unknownFields.getSerializedSizeAsMessageSet();
        } else {
            iM7932 = c3679.m7932();
            serializedSize = this.unknownFields.getSerializedSize();
        }
        int i2 = serializedSize + iM7932;
        this.memoizedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public C3703 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public boolean hasField(C3656 c3656) {
        verifyContainingType(c3656);
        return this.fields.m7933(c3656);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean hasOneof(C3593 c3593) {
        verifyOneofContainingType(c3593);
        return this.oneofCases[c3593.f11226] != null;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3595 newBuilderForType() {
        return new C3595(this.type, null);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3595 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC3452) this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        boolean messageSetWireFormat = this.type.m7889().getMessageSetWireFormat();
        C3679 c3679 = this.fields;
        int i = 0;
        if (messageSetWireFormat) {
            C3349 c3349 = c3679.f11475;
            int i2 = c3349.f10990;
            while (i < i2) {
                C3679.m7908(c3349.m7420(i), abstractC3461);
                i++;
            }
            Iterator it = c3349.m7419().iterator();
            while (it.hasNext()) {
                C3679.m7908((Map.Entry) it.next(), abstractC3461);
            }
            this.unknownFields.writeAsMessageSetTo(abstractC3461);
            return;
        }
        C3349 c33492 = c3679.f11475;
        int i3 = c33492.f10990;
        while (i < i3) {
            C3350 c3350M7420 = c33492.m7420(i);
            C3679.m7909((InterfaceC3680) c3350M7420.f10995, c3350M7420.f10993, abstractC3461);
            i++;
        }
        for (Map.Entry entry : c33492.m7419()) {
            C3679.m7909((InterfaceC3680) entry.getKey(), entry.getValue(), abstractC3461);
        }
        this.unknownFields.writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏兰哲子$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3595 extends AbstractC3532.AbstractC3533 {
        private C3684 fields;
        private final C3656[] oneofCases;
        private final C3662 type;
        private C3703 unknownFields;

        private C3595(C3662 c3662) {
            this.type = c3662;
            C3679 c3679 = C3679.f11472;
            this.fields = new C3684(C3349.m7416());
            this.unknownFields = C3703.getDefaultInstance();
            this.oneofCases = new C3656[c3662.f11373.getOneofDeclCount()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3594 buildParsed() throws InvalidProtocolBufferException {
            if (isInitialized()) {
                return buildPartial();
            }
            C3662 c3662 = this.type;
            C3679 c3679M7948 = this.fields.m7948(false);
            C3656[] c3656Arr = this.oneofCases;
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) new C3594(c3662, c3679M7948, (C3656[]) Arrays.copyOf(c3656Arr, c3656Arr.length), this.unknownFields)).asInvalidProtocolBufferException();
        }

        private static InterfaceC3453 toMessageBuilder(Object obj) {
            if (obj instanceof InterfaceC3453) {
                return (InterfaceC3453) obj;
            }
            if (obj instanceof C3382) {
                obj = ((C3382) obj).m7501();
            }
            if (obj instanceof InterfaceC3452) {
                return ((InterfaceC3452) obj).toBuilder();
            }
            C2632.m5295(obj.getClass(), "Cannot convert ", " to Message.Builder");
            return null;
        }

        private void verifyContainingType(C3656 c3656) {
            if (c3656.f11341 == this.type) {
                return;
            }
            C5919.m11249("FieldDescriptor does not match message type.");
        }

        private void verifyOneofContainingType(C3593 c3593) {
            if (c3593.f11222 == this.type) {
                return;
            }
            C5919.m11249("OneofDescriptor does not match message type.");
        }

        private void verifySingularValueType(C3656 c3656, Object obj) {
            int i = AbstractC3596.f11228[c3656.m7870().ordinal()];
            if (i != 1) {
                if (i == 2 && (obj instanceof InterfaceC3453)) {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c3656.f11350.getNumber()), c3656.mo7820().getJavaType(), obj.getClass().getName()));
                }
            } else {
                obj.getClass();
                if (obj instanceof C3663) {
                    return;
                }
                C5919.m11249("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        private void verifyType(C3656 c3656, Object obj) {
            if (!c3656.mo7819()) {
                verifySingularValueType(c3656, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                verifySingularValueType(c3656, it.next());
            }
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 addRepeatedField(C3656 c3656, Object obj) {
            verifyContainingType(c3656);
            verifySingularValueType(c3656, obj);
            this.fields.m7949(c3656, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3594 build() {
            if (isInitialized()) {
                return buildPartial();
            }
            C3662 c3662 = this.type;
            C3679 c3679M7948 = this.fields.m7948(false);
            C3656[] c3656Arr = this.oneofCases;
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) new C3594(c3662, c3679M7948, (C3656[]) Arrays.copyOf(c3656Arr, c3656Arr.length), this.unknownFields));
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3594 buildPartial() {
            if (this.type.m7889().getMapEntry()) {
                for (C3656 c3656 : this.type.m7888()) {
                    if (c3656.m7869() && !this.fields.m7958(c3656)) {
                        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM7876 = c3656.m7876();
                        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.MESSAGE;
                        C3684 c3684 = this.fields;
                        if (descriptors$FieldDescriptor$JavaTypeM7876 == descriptors$FieldDescriptor$JavaType) {
                            c3684.m7951(c3656, C3594.getDefaultInstance(c3656.m7871()));
                        } else {
                            c3684.m7951(c3656, c3656.m7877());
                        }
                    }
                }
            }
            C3662 c3662 = this.type;
            C3679 c3679M7948 = this.fields.m7948(true);
            C3656[] c3656Arr = this.oneofCases;
            return new C3594(c3662, c3679M7948, (C3656[]) Arrays.copyOf(c3656Arr, c3656Arr.length), this.unknownFields);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3595 mo7355clear() {
            C3679 c3679 = C3679.f11472;
            this.fields = new C3684(C3349.m7416());
            this.unknownFields = C3703.getDefaultInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 clearField(C3656 c3656) {
            verifyContainingType(c3656);
            C3593 c3593 = c3656.f11340;
            if (c3593 != null) {
                int i = c3593.f11226;
                C3656[] c3656Arr = this.oneofCases;
                if (c3656Arr[i] == c3656) {
                    c3656Arr[i] = null;
                }
            }
            this.fields.m7947(c3656);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 clearOneof(C3593 c3593) {
            verifyOneofContainingType(c3593);
            C3656 c3656 = this.oneofCases[c3593.f11226];
            if (c3656 != null) {
                clearField(c3656);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533
        /* JADX INFO: renamed from: clone */
        public C3595 mo7357clone() {
            C3595 c3595 = new C3595(this.type);
            c3595.fields.m7956(this.fields.m7948(false));
            c3595.mergeUnknownFields(this.unknownFields);
            C3656[] c3656Arr = this.oneofCases;
            System.arraycopy(c3656Arr, 0, c3595.oneofCases, 0, c3656Arr.length);
            return c3595;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Map<C3656, Object> getAllFields() {
            return this.fields.m7945();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3594 getDefaultInstanceForType() {
            return C3594.getDefaultInstance(this.type);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return this.type;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Object getField(C3656 c3656) {
            verifyContainingType(c3656);
            Object objM7944 = this.fields.m7944(c3656);
            return objM7944 == null ? c3656.mo7819() ? Collections.EMPTY_LIST : c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C3594.getDefaultInstance(c3656.m7871()) : c3656.m7877() : objM7944;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 getFieldBuilder(C3656 c3656) {
            verifyContainingType(c3656);
            if (c3656.m7872()) {
                C5919.m11247("Nested builder not supported for map fields.");
                return null;
            }
            if (c3656.m7876() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5919.m11247("getFieldBuilder() called on a non-Message type.");
                return null;
            }
            Object objM7954 = this.fields.m7954(c3656);
            InterfaceC3453 c3595 = objM7954 == null ? new C3595(c3656.m7871()) : toMessageBuilder(objM7954);
            this.fields.m7951(c3656, c3595);
            return c3595;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3656 getOneofFieldDescriptor(C3593 c3593) {
            verifyOneofContainingType(c3593);
            return this.oneofCases[c3593.f11226];
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public Object getRepeatedField(C3656 c3656, int i) {
            verifyContainingType(c3656);
            C3684 c3684 = this.fields;
            if (c3684.f11479) {
                c3684.m7946();
            }
            return C3684.m7941(c3684.m7953(c3656, i), true);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 getRepeatedFieldBuilder(C3656 c3656, int i) {
            verifyContainingType(c3656);
            if (c3656.m7872()) {
                C5919.m11247("Map fields cannot be repeated");
                return null;
            }
            if (c3656.m7876() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5919.m11247("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC3453 messageBuilder = toMessageBuilder(this.fields.m7953(c3656, i));
            this.fields.m7952(c3656, i, messageBuilder);
            return messageBuilder;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public int getRepeatedFieldCount(C3656 c3656) {
            verifyContainingType(c3656);
            return this.fields.m7957(c3656);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public C3703 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public boolean hasField(C3656 c3656) {
            verifyContainingType(c3656);
            return this.fields.m7958(c3656);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public boolean hasOneof(C3593 c3593) {
            verifyOneofContainingType(c3593);
            return this.oneofCases[c3593.f11226] != null;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public boolean isInitialized() {
            for (C3656 c3656 : this.type.m7888()) {
                if (c3656.m7867() && !this.fields.m7958(c3656)) {
                    return false;
                }
            }
            return this.fields.m7955();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (!(interfaceC3452 instanceof C3594)) {
                return (C3595) super.mergeFrom(interfaceC3452);
            }
            C3594 c3594 = (C3594) interfaceC3452;
            if (c3594.type != this.type) {
                C5919.m11249("mergeFrom(Message) can only merge messages of the same type.");
                return null;
            }
            this.fields.m7956(c3594.fields);
            mergeUnknownFields(c3594.unknownFields);
            int i = 0;
            while (true) {
                C3656[] c3656Arr = this.oneofCases;
                if (i >= c3656Arr.length) {
                    return this;
                }
                if (c3656Arr[i] == null) {
                    c3656Arr[i] = c3594.oneofCases[i];
                } else if (c3594.oneofCases[i] != null && this.oneofCases[i] != c3594.oneofCases[i]) {
                    this.fields.m7947(this.oneofCases[i]);
                    this.oneofCases[i] = c3594.oneofCases[i];
                }
                i++;
            }
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 mergeUnknownFields(C3703 c3703) {
            C3711 c3711NewBuilder = C3703.newBuilder(this.unknownFields);
            c3711NewBuilder.m7984(c3703);
            this.unknownFields = c3711NewBuilder.build();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 newBuilderForField(C3656 c3656) {
            verifyContainingType(c3656);
            if (c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                return new C3595(c3656.m7871());
            }
            C5919.m11249("newBuilderForField is only valid for fields with message type.");
            return null;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 setField(C3656 c3656, Object obj) {
            verifyContainingType(c3656);
            verifyType(c3656, obj);
            C3593 c3593 = c3656.f11340;
            if (c3593 != null) {
                int i = c3593.f11226;
                C3656 c36562 = this.oneofCases[i];
                if (c36562 != null && c36562 != c3656) {
                    this.fields.m7947(c36562);
                }
                this.oneofCases[i] = c3656;
            } else if (!c3656.m7873() && (!c3656.mo7819() ? obj.equals(c3656.m7877()) : ((List) obj).isEmpty())) {
                this.fields.m7947(c3656);
                return this;
            }
            this.fields.m7951(c3656, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 setRepeatedField(C3656 c3656, int i, Object obj) {
            verifyContainingType(c3656);
            verifySingularValueType(c3656, obj);
            this.fields.m7952(c3656, i, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3595 setUnknownFields(C3703 c3703) {
            this.unknownFields = c3703;
            return this;
        }

        public /* synthetic */ C3595(C3662 c3662, C3597 c3597) {
            this(c3662);
        }
    }

    public static C3595 newBuilder(C3662 c3662) {
        return new C3595(c3662, null);
    }

    public static C3594 parseFrom(C3662 c3662, AbstractC3473 abstractC3473, C3692 c3692) {
        return ((C3595) newBuilder(c3662).mergeFrom(abstractC3473, (C3696) c3692)).buildParsed();
    }

    public static C3594 parseFrom(C3662 c3662, ByteString byteString) {
        return ((C3595) newBuilder(c3662).mergeFrom(byteString)).buildParsed();
    }

    public static C3594 parseFrom(C3662 c3662, ByteString byteString, C3692 c3692) {
        return ((C3595) newBuilder(c3662).mergeFrom(byteString, (C3696) c3692)).buildParsed();
    }

    public static C3594 parseFrom(C3662 c3662, byte[] bArr) {
        return ((C3595) newBuilder(c3662).mergeFrom(bArr)).buildParsed();
    }

    public static C3594 parseFrom(C3662 c3662, byte[] bArr, C3692 c3692) {
        return ((C3595) newBuilder(c3662).mergeFrom(bArr, (C3696) c3692)).buildParsed();
    }

    public static C3594 parseFrom(C3662 c3662, InputStream inputStream) {
        return ((C3595) newBuilder(c3662).mergeFrom(inputStream)).buildParsed();
    }

    public static C3594 parseFrom(C3662 c3662, InputStream inputStream, C3692 c3692) {
        return ((C3595) newBuilder(c3662).mergeFrom(inputStream, (C3696) c3692)).buildParsed();
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public boolean isInitialized() {
        return isInitialized(this.type, this.fields);
    }
}
