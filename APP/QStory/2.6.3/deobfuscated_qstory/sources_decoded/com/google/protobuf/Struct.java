package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2633;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Struct extends GeneratedMessage implements InterfaceC3336 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private C3408 fields_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Struct");
        DEFAULT_INSTANCE = new Struct();
        PARSER = new C3353();
    }

    private Struct(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3337.f10960;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3408 internalGetFields() {
        C3408 c3408 = this.fields_;
        return c3408 == null ? new C3408(AbstractC3335.f10954, MapField$StorageMode.MAP, Collections.EMPTY_MAP) : c3408;
    }

    public static C3319 newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) {
        return (Struct) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) {
        return (Struct) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3336
    public boolean containsFields(String str) {
        if (str != null) {
            return internalGetFields().m7512().containsKey(str);
        }
        C2633.m5343("map key");
        return false;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3337.f10960;
    }

    @Override // com.google.protobuf.InterfaceC3336
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.InterfaceC3336
    public int getFieldsCount() {
        return internalGetFields().m7512().size();
    }

    @Override // com.google.protobuf.InterfaceC3336
    public Map<String, Value> getFieldsMap() {
        return internalGetFields().m7512();
    }

    @Override // com.google.protobuf.InterfaceC3336
    public Value getFieldsOrDefault(String str, Value value) {
        if (str != null) {
            Map mapM7512 = internalGetFields().m7512();
            return mapM7512.containsKey(str) ? (Value) mapM7512.get(str) : value;
        }
        C2633.m5343("map key");
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3336
    public Value getFieldsOrThrow(String str) {
        if (str == null) {
            C2633.m5343("map key");
            return null;
        }
        Map mapM7512 = internalGetFields().m7512();
        if (mapM7512.containsKey(str)) {
            return (Value) mapM7512.get(str);
        }
        C5925.m11306();
        return null;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7639 = 0;
        for (Map.Entry entry : internalGetFields().m7512().entrySet()) {
            iM7639 += AbstractC3462.m7639(1, AbstractC3335.f10954.newBuilderForType().setKey((String) entry.getKey()).setValue((Value) entry.getValue()).buildPartial());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7639;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (!internalGetFields().m7512().isEmpty()) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3337.f10959;
        c3619.m7827(Struct.class, C3319.class);
        return c3619;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public AbstractC3447 internalGetMapFieldReflection(int i) {
        if (i == 1) {
            return internalGetFields();
        }
        C2633.m5339(AbstractC6183.m11588(i, "Invalid map field number: "));
        return null;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

    @Override // com.google.protobuf.AbstractC3533
    public C3319 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3319(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3319 toBuilder() {
        C3353 c3353 = null;
        return this == DEFAULT_INSTANCE ? new C3319(c3353) : new C3319(c3353).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        GeneratedMessage.serializeStringMapTo(abstractC3462, internalGetFields(), AbstractC3335.f10954, 1);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Struct$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3319 extends GeneratedMessage.AbstractC3305 implements InterfaceC3336 {
        private static final C3354 fieldsConverter = new C3354();
        private int bitField0_;
        private C3448 fields_;

        public /* synthetic */ C3319(InterfaceC3532 interfaceC3532, C3353 c3353) {
            this(interfaceC3532);
        }

        private void buildPartial0(Struct struct) {
            if ((this.bitField0_ & 1) != 0) {
                C3448 c3448InternalGetFields = internalGetFields();
                C3416 c3416 = AbstractC3335.f10954;
                Map mapM7621 = c3448InternalGetFields.m7621();
                C3408 c3408 = new C3408(c3416, MapField$StorageMode.MAP, new LinkedHashMap((int) Math.ceil(((double) mapM7621.size()) / 0.75d)));
                C3407 c3407M7511 = c3408.m7511();
                for (Map.Entry entry : ((LinkedHashMap) mapM7621).entrySet()) {
                    Object key = entry.getKey();
                    InterfaceC3449 interfaceC3449 = c3448InternalGetFields.f11123;
                    InterfaceC3442 interfaceC3442 = (InterfaceC3442) entry.getValue();
                    ((C3354) interfaceC3449).getClass();
                    c3407M7511.put(key, C3354.m7412((InterfaceC3722) interfaceC3442));
                }
                c3408.f11068 = false;
                struct.fields_ = c3408;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3337.f10960;
        }

        private C3448 internalGetFields() {
            C3448 c3448 = this.fields_;
            return c3448 == null ? new C3448(fieldsConverter) : c3448;
        }

        private C3448 internalGetMutableFields() {
            if (this.fields_ == null) {
                this.fields_ = new C3448(fieldsConverter);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this.fields_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) structBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Struct buildPartial() {
            Struct struct = new Struct(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(struct);
            }
            onBuilt();
            return struct;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3319 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3448 c3448InternalGetMutableFields = internalGetMutableFields();
            c3448InternalGetMutableFields.getClass();
            c3448InternalGetMutableFields.f11126 = new LinkedHashMap();
            c3448InternalGetMutableFields.f11124 = null;
            c3448InternalGetMutableFields.f11125 = null;
            return this;
        }

        public C3319 clearFields() {
            this.bitField0_ &= -2;
            C3448 c3448InternalGetMutableFields = internalGetMutableFields();
            c3448InternalGetMutableFields.getClass();
            c3448InternalGetMutableFields.f11126 = new LinkedHashMap();
            c3448InternalGetMutableFields.f11124 = null;
            c3448InternalGetMutableFields.f11125 = null;
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3336
        public boolean containsFields(String str) {
            if (str != null) {
                return internalGetFields().m7621().containsKey(str);
            }
            C2633.m5343("map key");
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3337.f10960;
        }

        @Override // com.google.protobuf.InterfaceC3336
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // com.google.protobuf.InterfaceC3336
        public int getFieldsCount() {
            return internalGetFields().m7621().size();
        }

        @Override // com.google.protobuf.InterfaceC3336
        public Map<String, Value> getFieldsMap() {
            return new C3407(InterfaceC3370.f11017, internalGetFields().m7622());
        }

        @Override // com.google.protobuf.InterfaceC3336
        public Value getFieldsOrDefault(String str, Value value) {
            if (str == null) {
                C2633.m5343("map key");
                return null;
            }
            Map mapM7621 = internalGetMutableFields().m7621();
            if (!mapM7621.containsKey(str)) {
                return value;
            }
            C3354 c3354 = fieldsConverter;
            InterfaceC3722 interfaceC3722 = (InterfaceC3722) ((LinkedHashMap) mapM7621).get(str);
            c3354.getClass();
            return C3354.m7412(interfaceC3722);
        }

        @Override // com.google.protobuf.InterfaceC3336
        public Value getFieldsOrThrow(String str) {
            if (str == null) {
                C2633.m5343("map key");
                return null;
            }
            Map mapM7621 = internalGetMutableFields().m7621();
            if (!mapM7621.containsKey(str)) {
                C5925.m11306();
                return null;
            }
            C3354 c3354 = fieldsConverter;
            InterfaceC3722 interfaceC3722 = (InterfaceC3722) ((LinkedHashMap) mapM7621).get(str);
            c3354.getClass();
            return C3354.m7412(interfaceC3722);
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            this.bitField0_ |= 1;
            C3448 c3448InternalGetMutableFields = internalGetMutableFields();
            Map<String, Value> mapM7622 = c3448InternalGetMutableFields.m7622();
            c3448InternalGetMutableFields.f11124 = mapM7622;
            c3448InternalGetMutableFields.f11126 = null;
            c3448InternalGetMutableFields.f11125 = null;
            return mapM7622;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3337.f10959;
            c3619.m7827(Struct.class, C3319.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public AbstractC3447 internalGetMapFieldReflection(int i) {
            if (i == 1) {
                return internalGetFields();
            }
            C2633.m5339(AbstractC6183.m11588(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public AbstractC3447 internalGetMutableMapFieldReflection(int i) {
            if (i == 1) {
                return internalGetMutableFields();
            }
            C2633.m5339(AbstractC6183.m11588(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3319 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                C3416 c3416 = (C3416) abstractC3474.mo7715(AbstractC3335.f10954.getParserForType(), c3697);
                                internalGetMutableFields().m7621().put((String) c3416.getKey(), (InterfaceC3722) c3416.getValue());
                                this.bitField0_ |= 1;
                            } else if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
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

        public C3319 putAllFields(Map<String, Value> map) {
            for (Map.Entry<String, Value> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw null;
                }
            }
            internalGetMutableFields().m7621().putAll(map);
            this.bitField0_ |= 1;
            return this;
        }

        public C3319 putFields(String str, Value value) {
            if (str == null) {
                C2633.m5343("map key");
                return null;
            }
            if (value == null) {
                C2633.m5343("map value");
                return null;
            }
            internalGetMutableFields().m7621().put(str, value);
            this.bitField0_ |= 1;
            return this;
        }

        public Value.C3324 putFieldsBuilderIfAbsent(String str) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) internalGetMutableFields().m7621();
            InterfaceC3442 builder = (InterfaceC3722) linkedHashMap.get(str);
            if (builder == null) {
                builder = Value.newBuilder();
                linkedHashMap.put(str, builder);
            }
            if (builder instanceof Value) {
                builder = ((Value) builder).toBuilder();
                linkedHashMap.put(str, builder);
            }
            return (Value.C3324) builder;
        }

        public C3319 removeFields(String str) {
            if (str != null) {
                internalGetMutableFields().m7621().remove(str);
                return this;
            }
            C2633.m5343("map key");
            return null;
        }

        public /* synthetic */ C3319(C3353 c3353) {
            this();
        }

        private C3319() {
        }

        private C3319(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Struct getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3319 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Struct) {
                return mergeFrom((Struct) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        public C3319 mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().m7621().putAll(MapFieldLite.copy(struct.internalGetFields().m7512()));
            this.bitField0_ |= 1;
            mergeUnknownFields(struct.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Struct getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public /* synthetic */ Struct(GeneratedMessage.AbstractC3305 abstractC3305, C3353 c3353) {
        this(abstractC3305);
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Struct) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3319 newBuilderForType() {
        return newBuilder();
    }

    public static C3319 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Struct) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Struct parseFrom(ByteString byteString) {
        return (Struct) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Struct parseFrom(ByteString byteString, C3697 c3697) {
        return (Struct) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Struct parseFrom(byte[] bArr) {
        return (Struct) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Struct parseFrom(byte[] bArr, C3697 c3697) {
        return (Struct) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Struct parseFrom(InputStream inputStream) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, C3697 c3697) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Struct parseFrom(AbstractC3474 abstractC3474) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Struct parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
