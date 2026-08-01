package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Struct extends GeneratedMessage implements InterfaceC4168 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private C4240 fields_;
    private byte memoizedIsInitialized;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Struct");
        DEFAULT_INSTANCE = new Struct();
        PARSER = new C4185();
    }

    private Struct(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4169.f11305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4240 internalGetFields() {
        C4240 c4240 = this.fields_;
        return c4240 == null ? new C4240(AbstractC4167.f11299, MapField$StorageMode.MAP, Collections.EMPTY_MAP) : c4240;
    }

    public static C4151 newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) {
        return (Struct) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) {
        return (Struct) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4168
    public boolean containsFields(String str) {
        if (str != null) {
            return internalGetFields().m8071().containsKey(str);
        }
        C3466.m5903("map key");
        return false;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Struct)) {
            return super.equals(obj);
        }
        Struct struct = (Struct) obj;
        return internalGetFields().equals(struct.internalGetFields()) && getUnknownFields().equals(struct.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4169.f11305;
    }

    @Override // com.google.protobuf.InterfaceC4168
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.InterfaceC4168
    public int getFieldsCount() {
        return internalGetFields().m8071().size();
    }

    @Override // com.google.protobuf.InterfaceC4168
    public Map<String, Value> getFieldsMap() {
        return internalGetFields().m8071();
    }

    @Override // com.google.protobuf.InterfaceC4168
    public Value getFieldsOrDefault(String str, Value value) {
        if (str != null) {
            Map mapM8071 = internalGetFields().m8071();
            return mapM8071.containsKey(str) ? (Value) mapM8071.get(str) : value;
        }
        C3466.m5903("map key");
        return null;
    }

    @Override // com.google.protobuf.InterfaceC4168
    public Value getFieldsOrThrow(String str) {
        if (str == null) {
            C3466.m5903("map key");
            return null;
        }
        Map mapM8071 = internalGetFields().m8071();
        if (mapM8071.containsKey(str)) {
            return (Value) mapM8071.get(str);
        }
        C6755.m11865();
        return null;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM8198 = 0;
        for (Map.Entry entry : internalGetFields().m8071().entrySet()) {
            iM8198 += AbstractC4294.m8198(1, AbstractC4167.f11299.newBuilderForType().setKey((String) entry.getKey()).setValue((Value) entry.getValue()).buildPartial());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8198;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (!internalGetFields().m8071().isEmpty()) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4169.f11304;
        c4451.m8386(Struct.class, C4151.class);
        return c4451;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public AbstractC4279 internalGetMapFieldReflection(int i) {
        if (i == 1) {
            return internalGetFields();
        }
        C3466.m5899(AbstractC7012.m12147(i, "Invalid map field number: "));
        return null;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4151 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4151(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4151 toBuilder() {
        C4185 c4185 = null;
        return this == DEFAULT_INSTANCE ? new C4151(c4185) : new C4151(c4185).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        GeneratedMessage.serializeStringMapTo(abstractC4294, internalGetFields(), AbstractC4167.f11299, 1);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Struct$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4151 extends GeneratedMessage.AbstractC4137 implements InterfaceC4168 {
        private static final C4186 fieldsConverter = new C4186();
        private int bitField0_;
        private C4280 fields_;

        public /* synthetic */ C4151(InterfaceC4364 interfaceC4364, C4185 c4185) {
            this(interfaceC4364);
        }

        private void buildPartial0(Struct struct) {
            if ((this.bitField0_ & 1) != 0) {
                C4280 c4280InternalGetFields = internalGetFields();
                C4248 c4248 = AbstractC4167.f11299;
                Map mapM8180 = c4280InternalGetFields.m8180();
                C4240 c4240 = new C4240(c4248, MapField$StorageMode.MAP, new LinkedHashMap((int) Math.ceil(((double) mapM8180.size()) / 0.75d)));
                C4239 c4239M8070 = c4240.m8070();
                for (Map.Entry entry : ((LinkedHashMap) mapM8180).entrySet()) {
                    Object key = entry.getKey();
                    InterfaceC4281 interfaceC4281 = c4280InternalGetFields.f11468;
                    InterfaceC4274 interfaceC4274 = (InterfaceC4274) entry.getValue();
                    ((C4186) interfaceC4281).getClass();
                    c4239M8070.put(key, C4186.m7971((InterfaceC4554) interfaceC4274));
                }
                c4240.f11413 = false;
                struct.fields_ = c4240;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4169.f11305;
        }

        private C4280 internalGetFields() {
            C4280 c4280 = this.fields_;
            return c4280 == null ? new C4280(fieldsConverter) : c4280;
        }

        private C4280 internalGetMutableFields() {
            if (this.fields_ == null) {
                this.fields_ = new C4280(fieldsConverter);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this.fields_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) structBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Struct buildPartial() {
            Struct struct = new Struct(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(struct);
            }
            onBuilt();
            return struct;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4151 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4280 c4280InternalGetMutableFields = internalGetMutableFields();
            c4280InternalGetMutableFields.getClass();
            c4280InternalGetMutableFields.f11471 = new LinkedHashMap();
            c4280InternalGetMutableFields.f11469 = null;
            c4280InternalGetMutableFields.f11470 = null;
            return this;
        }

        public C4151 clearFields() {
            this.bitField0_ &= -2;
            C4280 c4280InternalGetMutableFields = internalGetMutableFields();
            c4280InternalGetMutableFields.getClass();
            c4280InternalGetMutableFields.f11471 = new LinkedHashMap();
            c4280InternalGetMutableFields.f11469 = null;
            c4280InternalGetMutableFields.f11470 = null;
            return this;
        }

        @Override // com.google.protobuf.InterfaceC4168
        public boolean containsFields(String str) {
            if (str != null) {
                return internalGetFields().m8180().containsKey(str);
            }
            C3466.m5903("map key");
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4169.f11305;
        }

        @Override // com.google.protobuf.InterfaceC4168
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // com.google.protobuf.InterfaceC4168
        public int getFieldsCount() {
            return internalGetFields().m8180().size();
        }

        @Override // com.google.protobuf.InterfaceC4168
        public Map<String, Value> getFieldsMap() {
            return new C4239(InterfaceC4202.f11362, internalGetFields().m8181());
        }

        @Override // com.google.protobuf.InterfaceC4168
        public Value getFieldsOrDefault(String str, Value value) {
            if (str == null) {
                C3466.m5903("map key");
                return null;
            }
            Map mapM8180 = internalGetMutableFields().m8180();
            if (!mapM8180.containsKey(str)) {
                return value;
            }
            C4186 c4186 = fieldsConverter;
            InterfaceC4554 interfaceC4554 = (InterfaceC4554) ((LinkedHashMap) mapM8180).get(str);
            c4186.getClass();
            return C4186.m7971(interfaceC4554);
        }

        @Override // com.google.protobuf.InterfaceC4168
        public Value getFieldsOrThrow(String str) {
            if (str == null) {
                C3466.m5903("map key");
                return null;
            }
            Map mapM8180 = internalGetMutableFields().m8180();
            if (!mapM8180.containsKey(str)) {
                C6755.m11865();
                return null;
            }
            C4186 c4186 = fieldsConverter;
            InterfaceC4554 interfaceC4554 = (InterfaceC4554) ((LinkedHashMap) mapM8180).get(str);
            c4186.getClass();
            return C4186.m7971(interfaceC4554);
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            this.bitField0_ |= 1;
            C4280 c4280InternalGetMutableFields = internalGetMutableFields();
            Map<String, Value> mapM8181 = c4280InternalGetMutableFields.m8181();
            c4280InternalGetMutableFields.f11469 = mapM8181;
            c4280InternalGetMutableFields.f11471 = null;
            c4280InternalGetMutableFields.f11470 = null;
            return mapM8181;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4169.f11304;
            c4451.m8386(Struct.class, C4151.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public AbstractC4279 internalGetMapFieldReflection(int i) {
            if (i == 1) {
                return internalGetFields();
            }
            C3466.m5899(AbstractC7012.m12147(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public AbstractC4279 internalGetMutableMapFieldReflection(int i) {
            if (i == 1) {
                return internalGetMutableFields();
            }
            C3466.m5899(AbstractC7012.m12147(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4151 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                C4248 c4248 = (C4248) abstractC4306.mo8274(AbstractC4167.f11299.getParserForType(), c4529);
                                internalGetMutableFields().m8180().put((String) c4248.getKey(), (InterfaceC4554) c4248.getValue());
                                this.bitField0_ |= 1;
                            } else if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }

        public C4151 putAllFields(Map<String, Value> map) {
            for (Map.Entry<String, Value> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw null;
                }
            }
            internalGetMutableFields().m8180().putAll(map);
            this.bitField0_ |= 1;
            return this;
        }

        public C4151 putFields(String str, Value value) {
            if (str == null) {
                C3466.m5903("map key");
                return null;
            }
            if (value == null) {
                C3466.m5903("map value");
                return null;
            }
            internalGetMutableFields().m8180().put(str, value);
            this.bitField0_ |= 1;
            return this;
        }

        public Value.C4156 putFieldsBuilderIfAbsent(String str) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) internalGetMutableFields().m8180();
            InterfaceC4274 builder = (InterfaceC4554) linkedHashMap.get(str);
            if (builder == null) {
                builder = Value.newBuilder();
                linkedHashMap.put(str, builder);
            }
            if (builder instanceof Value) {
                builder = ((Value) builder).toBuilder();
                linkedHashMap.put(str, builder);
            }
            return (Value.C4156) builder;
        }

        public C4151 removeFields(String str) {
            if (str != null) {
                internalGetMutableFields().m8180().remove(str);
                return this;
            }
            C3466.m5903("map key");
            return null;
        }

        public /* synthetic */ C4151(C4185 c4185) {
            this();
        }

        private C4151() {
        }

        private C4151(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Struct getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4151 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Struct) {
                return mergeFrom((Struct) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        public C4151 mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().m8180().putAll(MapFieldLite.copy(struct.internalGetFields().m8071()));
            this.bitField0_ |= 1;
            mergeUnknownFields(struct.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Struct getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public /* synthetic */ Struct(GeneratedMessage.AbstractC4137 abstractC4137, C4185 c4185) {
        this(abstractC4137);
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Struct) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4151 newBuilderForType() {
        return newBuilder();
    }

    public static C4151 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Struct) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Struct parseFrom(ByteString byteString) {
        return (Struct) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Struct parseFrom(ByteString byteString, C4529 c4529) {
        return (Struct) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Struct parseFrom(byte[] bArr) {
        return (Struct) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Struct parseFrom(byte[] bArr, C4529 c4529) {
        return (Struct) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Struct parseFrom(InputStream inputStream) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, C4529 c4529) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Struct parseFrom(AbstractC4306 abstractC4306) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Struct parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
