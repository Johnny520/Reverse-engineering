package com.google.protobuf;

import bsh.C3466;
import com.google.protobuf.AbstractC4365;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4427 extends AbstractC4365 {
    private final C4512 fields;
    private int memoizedSize = -1;
    private final C4489[] oneofCases;
    private final C4495 type;
    private final C4536 unknownFields;

    public C4427(C4495 c4495, C4512 c4512, C4489[] c4489Arr, C4536 c4536) {
        this.type = c4495;
        this.fields = c4512;
        this.oneofCases = c4489Arr;
        this.unknownFields = c4536;
    }

    public static C4427 getDefaultInstance(C4495 c4495) {
        return new C4427(c4495, C4512.f11822, new C4489[c4495.f11723.getOneofDeclCount()], C4536.getDefaultInstance());
    }

    public static boolean isInitialized(C4495 c4495, C4512 c4512) {
        for (C4489 c4489 : c4495.m8434()) {
            if (c4489.m8413() && !c4512.m8479(c4489)) {
                return false;
            }
        }
        return c4512.m8477();
    }

    public static C4428 newBuilder(InterfaceC4285 interfaceC4285) {
        return new C4428(interfaceC4285.getDescriptorForType(), null).mergeFrom(interfaceC4285);
    }

    public static C4427 parseFrom(C4495 c4495, AbstractC4306 abstractC4306) {
        return ((C4428) newBuilder(c4495).mergeFrom(abstractC4306)).buildParsed();
    }

    private void verifyContainingType(C4489 c4489) {
        if (c4489.f11691 == this.type) {
            return;
        }
        C6755.m11869("FieldDescriptor does not match message type.");
    }

    private void verifyOneofContainingType(C4426 c4426) {
        if (c4426.f11572 == this.type) {
            return;
        }
        C6755.m11869("OneofDescriptor does not match message type.");
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public Map<C4489, Object> getAllFields() {
        return this.fields.m8481();
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4427 getDefaultInstanceForType() {
        return getDefaultInstance(this.type);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return this.type;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public Object getField(C4489 c4489) {
        verifyContainingType(c4489);
        Object objM8482 = this.fields.m8482(c4489);
        return objM8482 == null ? c4489.mo8365() ? Collections.EMPTY_LIST : c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? getDefaultInstance(c4489.m8417()) : c4489.m8423() : objM8482;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public C4489 getOneofFieldDescriptor(C4426 c4426) {
        verifyOneofContainingType(c4426);
        return this.oneofCases[c4426.f11576];
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return new C4430(this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public Object getRepeatedField(C4489 c4489, int i) {
        verifyContainingType(c4489);
        return this.fields.m8476(c4489, i);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int getRepeatedFieldCount(C4489 c4489) {
        verifyContainingType(c4489);
        return this.fields.m8475(c4489);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int iM8478;
        int serializedSize;
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean messageSetWireFormat = this.type.m8435().getMessageSetWireFormat();
        C4512 c4512 = this.fields;
        if (messageSetWireFormat) {
            iM8478 = c4512.m8480();
            serializedSize = this.unknownFields.getSerializedSizeAsMessageSet();
        } else {
            iM8478 = c4512.m8478();
            serializedSize = this.unknownFields.getSerializedSize();
        }
        int i2 = serializedSize + iM8478;
        this.memoizedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public C4536 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public boolean hasField(C4489 c4489) {
        verifyContainingType(c4489);
        return this.fields.m8479(c4489);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean hasOneof(C4426 c4426) {
        verifyOneofContainingType(c4426);
        return this.oneofCases[c4426.f11576] != null;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4428 newBuilderForType() {
        return new C4428(this.type, null);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4428 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC4285) this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        boolean messageSetWireFormat = this.type.m8435().getMessageSetWireFormat();
        C4512 c4512 = this.fields;
        int i = 0;
        if (messageSetWireFormat) {
            C4182 c4182 = c4512.f11825;
            int i2 = c4182.f11340;
            while (i < i2) {
                C4512.m8454(c4182.m7966(i), abstractC4294);
                i++;
            }
            Iterator it = c4182.m7965().iterator();
            while (it.hasNext()) {
                C4512.m8454((Map.Entry) it.next(), abstractC4294);
            }
            this.unknownFields.writeAsMessageSetTo(abstractC4294);
            return;
        }
        C4182 c41822 = c4512.f11825;
        int i3 = c41822.f11340;
        while (i < i3) {
            C4183 c4183M7966 = c41822.m7966(i);
            C4512.m8455((InterfaceC4513) c4183M7966.f11345, c4183M7966.f11343, abstractC4294);
            i++;
        }
        for (Map.Entry entry : c41822.m7965()) {
            C4512.m8455((InterfaceC4513) entry.getKey(), entry.getValue(), abstractC4294);
        }
        this.unknownFields.writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏兰哲子$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4428 extends AbstractC4365.AbstractC4366 {
        private C4517 fields;
        private final C4489[] oneofCases;
        private final C4495 type;
        private C4536 unknownFields;

        private C4428(C4495 c4495) {
            this.type = c4495;
            C4512 c4512 = C4512.f11822;
            this.fields = new C4517(C4182.m7962());
            this.unknownFields = C4536.getDefaultInstance();
            this.oneofCases = new C4489[c4495.f11723.getOneofDeclCount()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C4427 buildParsed() throws InvalidProtocolBufferException {
            if (isInitialized()) {
                return buildPartial();
            }
            C4495 c4495 = this.type;
            C4512 c4512M8494 = this.fields.m8494(false);
            C4489[] c4489Arr = this.oneofCases;
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) new C4427(c4495, c4512M8494, (C4489[]) Arrays.copyOf(c4489Arr, c4489Arr.length), this.unknownFields)).asInvalidProtocolBufferException();
        }

        private static InterfaceC4286 toMessageBuilder(Object obj) {
            if (obj instanceof InterfaceC4286) {
                return (InterfaceC4286) obj;
            }
            if (obj instanceof C4215) {
                obj = ((C4215) obj).m8047();
            }
            if (obj instanceof InterfaceC4285) {
                return ((InterfaceC4285) obj).toBuilder();
            }
            C3466.m5900(obj.getClass(), "Cannot convert ", " to Message.Builder");
            return null;
        }

        private void verifyContainingType(C4489 c4489) {
            if (c4489.f11691 == this.type) {
                return;
            }
            C6755.m11869("FieldDescriptor does not match message type.");
        }

        private void verifyOneofContainingType(C4426 c4426) {
            if (c4426.f11572 == this.type) {
                return;
            }
            C6755.m11869("OneofDescriptor does not match message type.");
        }

        private void verifySingularValueType(C4489 c4489, Object obj) {
            int i = AbstractC4429.f11578[c4489.m8416().ordinal()];
            if (i != 1) {
                if (i == 2 && (obj instanceof InterfaceC4286)) {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c4489.f11700.getNumber()), c4489.mo8366().getJavaType(), obj.getClass().getName()));
                }
            } else {
                obj.getClass();
                if (obj instanceof C4496) {
                    return;
                }
                C6755.m11869("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        }

        private void verifyType(C4489 c4489, Object obj) {
            if (!c4489.mo8365()) {
                verifySingularValueType(c4489, obj);
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                verifySingularValueType(c4489, it.next());
            }
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 addRepeatedField(C4489 c4489, Object obj) {
            verifyContainingType(c4489);
            verifySingularValueType(c4489, obj);
            this.fields.m8495(c4489, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4427 build() {
            if (isInitialized()) {
                return buildPartial();
            }
            C4495 c4495 = this.type;
            C4512 c4512M8494 = this.fields.m8494(false);
            C4489[] c4489Arr = this.oneofCases;
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) new C4427(c4495, c4512M8494, (C4489[]) Arrays.copyOf(c4489Arr, c4489Arr.length), this.unknownFields));
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4427 buildPartial() {
            if (this.type.m8435().getMapEntry()) {
                for (C4489 c4489 : this.type.m8434()) {
                    if (c4489.m8415() && !this.fields.m8504(c4489)) {
                        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaTypeM8422 = c4489.m8422();
                        Descriptors$FieldDescriptor$JavaType descriptors$FieldDescriptor$JavaType = Descriptors$FieldDescriptor$JavaType.MESSAGE;
                        C4517 c4517 = this.fields;
                        if (descriptors$FieldDescriptor$JavaTypeM8422 == descriptors$FieldDescriptor$JavaType) {
                            c4517.m8497(c4489, C4427.getDefaultInstance(c4489.m8417()));
                        } else {
                            c4517.m8497(c4489, c4489.m8423());
                        }
                    }
                }
            }
            C4495 c4495 = this.type;
            C4512 c4512M8494 = this.fields.m8494(true);
            C4489[] c4489Arr = this.oneofCases;
            return new C4427(c4495, c4512M8494, (C4489[]) Arrays.copyOf(c4489Arr, c4489Arr.length), this.unknownFields);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4428 mo7901clear() {
            C4512 c4512 = C4512.f11822;
            this.fields = new C4517(C4182.m7962());
            this.unknownFields = C4536.getDefaultInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 clearField(C4489 c4489) {
            verifyContainingType(c4489);
            C4426 c4426 = c4489.f11690;
            if (c4426 != null) {
                int i = c4426.f11576;
                C4489[] c4489Arr = this.oneofCases;
                if (c4489Arr[i] == c4489) {
                    c4489Arr[i] = null;
                }
            }
            this.fields.m8493(c4489);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 clearOneof(C4426 c4426) {
            verifyOneofContainingType(c4426);
            C4489 c4489 = this.oneofCases[c4426.f11576];
            if (c4489 != null) {
                clearField(c4489);
            }
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366
        /* JADX INFO: renamed from: clone */
        public C4428 mo7903clone() {
            C4428 c4428 = new C4428(this.type);
            c4428.fields.m8502(this.fields.m8494(false));
            c4428.mergeUnknownFields(this.unknownFields);
            C4489[] c4489Arr = this.oneofCases;
            System.arraycopy(c4489Arr, 0, c4428.oneofCases, 0, c4489Arr.length);
            return c4428;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Map<C4489, Object> getAllFields() {
            return this.fields.m8491();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4427 getDefaultInstanceForType() {
            return C4427.getDefaultInstance(this.type);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return this.type;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Object getField(C4489 c4489) {
            verifyContainingType(c4489);
            Object objM8490 = this.fields.m8490(c4489);
            return objM8490 == null ? c4489.mo8365() ? Collections.EMPTY_LIST : c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C4427.getDefaultInstance(c4489.m8417()) : c4489.m8423() : objM8490;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 getFieldBuilder(C4489 c4489) {
            verifyContainingType(c4489);
            if (c4489.m8418()) {
                C6755.m11867("Nested builder not supported for map fields.");
                return null;
            }
            if (c4489.m8422() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C6755.m11867("getFieldBuilder() called on a non-Message type.");
                return null;
            }
            Object objM8500 = this.fields.m8500(c4489);
            InterfaceC4286 c4428 = objM8500 == null ? new C4428(c4489.m8417()) : toMessageBuilder(objM8500);
            this.fields.m8497(c4489, c4428);
            return c4428;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4489 getOneofFieldDescriptor(C4426 c4426) {
            verifyOneofContainingType(c4426);
            return this.oneofCases[c4426.f11576];
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public Object getRepeatedField(C4489 c4489, int i) {
            verifyContainingType(c4489);
            C4517 c4517 = this.fields;
            if (c4517.f11829) {
                c4517.m8492();
            }
            return C4517.m8487(c4517.m8499(c4489, i), true);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 getRepeatedFieldBuilder(C4489 c4489, int i) {
            verifyContainingType(c4489);
            if (c4489.m8418()) {
                C6755.m11867("Map fields cannot be repeated");
                return null;
            }
            if (c4489.m8422() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C6755.m11867("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC4286 messageBuilder = toMessageBuilder(this.fields.m8499(c4489, i));
            this.fields.m8498(c4489, i, messageBuilder);
            return messageBuilder;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public int getRepeatedFieldCount(C4489 c4489) {
            verifyContainingType(c4489);
            return this.fields.m8503(c4489);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public C4536 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public boolean hasField(C4489 c4489) {
            verifyContainingType(c4489);
            return this.fields.m8504(c4489);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public boolean hasOneof(C4426 c4426) {
            verifyOneofContainingType(c4426);
            return this.oneofCases[c4426.f11576] != null;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public boolean isInitialized() {
            for (C4489 c4489 : this.type.m8434()) {
                if (c4489.m8413() && !this.fields.m8504(c4489)) {
                    return false;
                }
            }
            return this.fields.m8501();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (!(interfaceC4285 instanceof C4427)) {
                return (C4428) super.mergeFrom(interfaceC4285);
            }
            C4427 c4427 = (C4427) interfaceC4285;
            if (c4427.type != this.type) {
                C6755.m11869("mergeFrom(Message) can only merge messages of the same type.");
                return null;
            }
            this.fields.m8502(c4427.fields);
            mergeUnknownFields(c4427.unknownFields);
            int i = 0;
            while (true) {
                C4489[] c4489Arr = this.oneofCases;
                if (i >= c4489Arr.length) {
                    return this;
                }
                if (c4489Arr[i] == null) {
                    c4489Arr[i] = c4427.oneofCases[i];
                } else if (c4427.oneofCases[i] != null && this.oneofCases[i] != c4427.oneofCases[i]) {
                    this.fields.m8493(this.oneofCases[i]);
                    this.oneofCases[i] = c4427.oneofCases[i];
                }
                i++;
            }
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 mergeUnknownFields(C4536 c4536) {
            C4544 c4544NewBuilder = C4536.newBuilder(this.unknownFields);
            c4544NewBuilder.m8530(c4536);
            this.unknownFields = c4544NewBuilder.build();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 newBuilderForField(C4489 c4489) {
            verifyContainingType(c4489);
            if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                return new C4428(c4489.m8417());
            }
            C6755.m11869("newBuilderForField is only valid for fields with message type.");
            return null;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 setField(C4489 c4489, Object obj) {
            verifyContainingType(c4489);
            verifyType(c4489, obj);
            C4426 c4426 = c4489.f11690;
            if (c4426 != null) {
                int i = c4426.f11576;
                C4489 c44892 = this.oneofCases[i];
                if (c44892 != null && c44892 != c4489) {
                    this.fields.m8493(c44892);
                }
                this.oneofCases[i] = c4489;
            } else if (!c4489.m8419() && (!c4489.mo8365() ? obj.equals(c4489.m8423()) : ((List) obj).isEmpty())) {
                this.fields.m8493(c4489);
                return this;
            }
            this.fields.m8497(c4489, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 setRepeatedField(C4489 c4489, int i, Object obj) {
            verifyContainingType(c4489);
            verifySingularValueType(c4489, obj);
            this.fields.m8498(c4489, i, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4428 setUnknownFields(C4536 c4536) {
            this.unknownFields = c4536;
            return this;
        }

        public /* synthetic */ C4428(C4495 c4495, C4430 c4430) {
            this(c4495);
        }
    }

    public static C4428 newBuilder(C4495 c4495) {
        return new C4428(c4495, null);
    }

    public static C4427 parseFrom(C4495 c4495, AbstractC4306 abstractC4306, C4525 c4525) {
        return ((C4428) newBuilder(c4495).mergeFrom(abstractC4306, (C4529) c4525)).buildParsed();
    }

    public static C4427 parseFrom(C4495 c4495, ByteString byteString) {
        return ((C4428) newBuilder(c4495).mergeFrom(byteString)).buildParsed();
    }

    public static C4427 parseFrom(C4495 c4495, ByteString byteString, C4525 c4525) {
        return ((C4428) newBuilder(c4495).mergeFrom(byteString, (C4529) c4525)).buildParsed();
    }

    public static C4427 parseFrom(C4495 c4495, byte[] bArr) {
        return ((C4428) newBuilder(c4495).mergeFrom(bArr)).buildParsed();
    }

    public static C4427 parseFrom(C4495 c4495, byte[] bArr, C4525 c4525) {
        return ((C4428) newBuilder(c4495).mergeFrom(bArr, (C4529) c4525)).buildParsed();
    }

    public static C4427 parseFrom(C4495 c4495, InputStream inputStream) {
        return ((C4428) newBuilder(c4495).mergeFrom(inputStream)).buildParsed();
    }

    public static C4427 parseFrom(C4495 c4495, InputStream inputStream, C4525 c4525) {
        return ((C4428) newBuilder(c4495).mergeFrom(inputStream, (C4529) c4525)).buildParsed();
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public boolean isInitialized() {
        return isInitialized(this.type, this.fields);
    }
}
