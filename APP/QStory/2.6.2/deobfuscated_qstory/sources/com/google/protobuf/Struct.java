package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2632;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Struct extends GeneratedMessage implements InterfaceC3335 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private C3407 fields_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Struct");
        DEFAULT_INSTANCE = new Struct();
        PARSER = new C3352();
    }

    private Struct(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3336.f10955;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3407 internalGetFields() {
        C3407 c3407 = this.fields_;
        return c3407 == null ? new C3407(AbstractC3334.f10949, MapField$StorageMode.MAP, Collections.EMPTY_MAP) : c3407;
    }

    public static C3318 newBuilder(Struct struct) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) {
        return (Struct) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) {
        return (Struct) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3335
    public boolean containsFields(String str) {
        if (str != null) {
            return internalGetFields().m7525().containsKey(str);
        }
        C2632.m5298("map key");
        return false;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3336.f10955;
    }

    @Override // com.google.protobuf.InterfaceC3335
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // com.google.protobuf.InterfaceC3335
    public int getFieldsCount() {
        return internalGetFields().m7525().size();
    }

    @Override // com.google.protobuf.InterfaceC3335
    public Map<String, Value> getFieldsMap() {
        return internalGetFields().m7525();
    }

    @Override // com.google.protobuf.InterfaceC3335
    public Value getFieldsOrDefault(String str, Value value) {
        if (str != null) {
            Map mapM7525 = internalGetFields().m7525();
            return mapM7525.containsKey(str) ? (Value) mapM7525.get(str) : value;
        }
        C2632.m5298("map key");
        return null;
    }

    @Override // com.google.protobuf.InterfaceC3335
    public Value getFieldsOrThrow(String str) {
        if (str == null) {
            C2632.m5298("map key");
            return null;
        }
        Map mapM7525 = internalGetFields().m7525();
        if (mapM7525.containsKey(str)) {
            return (Value) mapM7525.get(str);
        }
        C5919.m11245();
        return null;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7652 = 0;
        for (Map.Entry entry : internalGetFields().m7525().entrySet()) {
            iM7652 += AbstractC3461.m7652(1, AbstractC3334.f10949.newBuilderForType().setKey((String) entry.getKey()).setValue((Value) entry.getValue()).buildPartial());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7652;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (!internalGetFields().m7525().isEmpty()) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + internalGetFields().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3336.f10954;
        c3618.m7840(Struct.class, C3318.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public AbstractC3446 internalGetMapFieldReflection(int i) {
        if (i == 1) {
            return internalGetFields();
        }
        C2632.m5294(AbstractC6136.m11556(i, "Invalid map field number: "));
        return null;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3318 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3318(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3318 toBuilder() {
        C3352 c3352 = null;
        return this == DEFAULT_INSTANCE ? new C3318(c3352) : new C3318(c3352).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        GeneratedMessage.serializeStringMapTo(abstractC3461, internalGetFields(), AbstractC3334.f10949, 1);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Struct$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3318 extends GeneratedMessage.AbstractC3304 implements InterfaceC3335 {
        private static final C3353 fieldsConverter = new C3353();
        private int bitField0_;
        private C3447 fields_;

        public /* synthetic */ C3318(InterfaceC3531 interfaceC3531, C3352 c3352) {
            this(interfaceC3531);
        }

        private void buildPartial0(Struct struct) {
            if ((this.bitField0_ & 1) != 0) {
                C3447 c3447InternalGetFields = internalGetFields();
                C3415 c3415 = AbstractC3334.f10949;
                Map mapM7634 = c3447InternalGetFields.m7634();
                C3407 c3407 = new C3407(c3415, MapField$StorageMode.MAP, new LinkedHashMap((int) Math.ceil(((double) mapM7634.size()) / 0.75d)));
                C3406 c3406M7524 = c3407.m7524();
                for (Map.Entry entry : ((LinkedHashMap) mapM7634).entrySet()) {
                    Object key = entry.getKey();
                    InterfaceC3448 interfaceC3448 = c3447InternalGetFields.f11118;
                    InterfaceC3441 interfaceC3441 = (InterfaceC3441) entry.getValue();
                    ((C3353) interfaceC3448).getClass();
                    c3406M7524.put(key, C3353.m7425((InterfaceC3721) interfaceC3441));
                }
                c3407.f11063 = false;
                struct.fields_ = c3407;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3336.f10955;
        }

        private C3447 internalGetFields() {
            C3447 c3447 = this.fields_;
            return c3447 == null ? new C3447(fieldsConverter) : c3447;
        }

        private C3447 internalGetMutableFields() {
            if (this.fields_ == null) {
                this.fields_ = new C3447(fieldsConverter);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this.fields_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Struct build() {
            Struct structBuildPartial = buildPartial();
            if (structBuildPartial.isInitialized()) {
                return structBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) structBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Struct buildPartial() {
            Struct struct = new Struct(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(struct);
            }
            onBuilt();
            return struct;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3318 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3447 c3447InternalGetMutableFields = internalGetMutableFields();
            c3447InternalGetMutableFields.getClass();
            c3447InternalGetMutableFields.f11121 = new LinkedHashMap();
            c3447InternalGetMutableFields.f11119 = null;
            c3447InternalGetMutableFields.f11120 = null;
            return this;
        }

        public C3318 clearFields() {
            this.bitField0_ &= -2;
            C3447 c3447InternalGetMutableFields = internalGetMutableFields();
            c3447InternalGetMutableFields.getClass();
            c3447InternalGetMutableFields.f11121 = new LinkedHashMap();
            c3447InternalGetMutableFields.f11119 = null;
            c3447InternalGetMutableFields.f11120 = null;
            return this;
        }

        @Override // com.google.protobuf.InterfaceC3335
        public boolean containsFields(String str) {
            if (str != null) {
                return internalGetFields().m7634().containsKey(str);
            }
            C2632.m5298("map key");
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3336.f10955;
        }

        @Override // com.google.protobuf.InterfaceC3335
        @Deprecated
        public Map<String, Value> getFields() {
            return getFieldsMap();
        }

        @Override // com.google.protobuf.InterfaceC3335
        public int getFieldsCount() {
            return internalGetFields().m7634().size();
        }

        @Override // com.google.protobuf.InterfaceC3335
        public Map<String, Value> getFieldsMap() {
            return new C3406(InterfaceC3369.f11012, internalGetFields().m7635());
        }

        @Override // com.google.protobuf.InterfaceC3335
        public Value getFieldsOrDefault(String str, Value value) {
            if (str == null) {
                C2632.m5298("map key");
                return null;
            }
            Map mapM7634 = internalGetMutableFields().m7634();
            if (!mapM7634.containsKey(str)) {
                return value;
            }
            C3353 c3353 = fieldsConverter;
            InterfaceC3721 interfaceC3721 = (InterfaceC3721) ((LinkedHashMap) mapM7634).get(str);
            c3353.getClass();
            return C3353.m7425(interfaceC3721);
        }

        @Override // com.google.protobuf.InterfaceC3335
        public Value getFieldsOrThrow(String str) {
            if (str == null) {
                C2632.m5298("map key");
                return null;
            }
            Map mapM7634 = internalGetMutableFields().m7634();
            if (!mapM7634.containsKey(str)) {
                C5919.m11245();
                return null;
            }
            C3353 c3353 = fieldsConverter;
            InterfaceC3721 interfaceC3721 = (InterfaceC3721) ((LinkedHashMap) mapM7634).get(str);
            c3353.getClass();
            return C3353.m7425(interfaceC3721);
        }

        @Deprecated
        public Map<String, Value> getMutableFields() {
            this.bitField0_ |= 1;
            C3447 c3447InternalGetMutableFields = internalGetMutableFields();
            Map<String, Value> mapM7635 = c3447InternalGetMutableFields.m7635();
            c3447InternalGetMutableFields.f11119 = mapM7635;
            c3447InternalGetMutableFields.f11121 = null;
            c3447InternalGetMutableFields.f11120 = null;
            return mapM7635;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3336.f10954;
            c3618.m7840(Struct.class, C3318.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public AbstractC3446 internalGetMapFieldReflection(int i) {
            if (i == 1) {
                return internalGetFields();
            }
            C2632.m5294(AbstractC6136.m11556(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public AbstractC3446 internalGetMutableMapFieldReflection(int i) {
            if (i == 1) {
                return internalGetMutableFields();
            }
            C2632.m5294(AbstractC6136.m11556(i, "Invalid map field number: "));
            return null;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3318 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                C3415 c3415 = (C3415) abstractC3473.mo7728(AbstractC3334.f10949.getParserForType(), c3696);
                                internalGetMutableFields().m7634().put((String) c3415.getKey(), (InterfaceC3721) c3415.getValue());
                                this.bitField0_ |= 1;
                            } else if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
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

        public C3318 putAllFields(Map<String, Value> map) {
            for (Map.Entry<String, Value> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw null;
                }
            }
            internalGetMutableFields().m7634().putAll(map);
            this.bitField0_ |= 1;
            return this;
        }

        public C3318 putFields(String str, Value value) {
            if (str == null) {
                C2632.m5298("map key");
                return null;
            }
            if (value == null) {
                C2632.m5298("map value");
                return null;
            }
            internalGetMutableFields().m7634().put(str, value);
            this.bitField0_ |= 1;
            return this;
        }

        public Value.C3323 putFieldsBuilderIfAbsent(String str) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) internalGetMutableFields().m7634();
            InterfaceC3441 builder = (InterfaceC3721) linkedHashMap.get(str);
            if (builder == null) {
                builder = Value.newBuilder();
                linkedHashMap.put(str, builder);
            }
            if (builder instanceof Value) {
                builder = ((Value) builder).toBuilder();
                linkedHashMap.put(str, builder);
            }
            return (Value.C3323) builder;
        }

        public C3318 removeFields(String str) {
            if (str != null) {
                internalGetMutableFields().m7634().remove(str);
                return this;
            }
            C2632.m5298("map key");
            return null;
        }

        public /* synthetic */ C3318(C3352 c3352) {
            this();
        }

        private C3318() {
        }

        private C3318(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Struct getDefaultInstanceForType() {
            return Struct.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3318 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Struct) {
                return mergeFrom((Struct) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        public C3318 mergeFrom(Struct struct) {
            if (struct == Struct.getDefaultInstance()) {
                return this;
            }
            internalGetMutableFields().m7634().putAll(MapFieldLite.copy(struct.internalGetFields().m7525()));
            this.bitField0_ |= 1;
            mergeUnknownFields(struct.getUnknownFields());
            onChanged();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Struct getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public /* synthetic */ Struct(GeneratedMessage.AbstractC3304 abstractC3304, C3352 c3352) {
        this(abstractC3304);
    }

    private Struct() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Struct) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3318 newBuilderForType() {
        return newBuilder();
    }

    public static C3318 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Struct) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Struct parseFrom(ByteString byteString) {
        return (Struct) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Struct parseFrom(ByteString byteString, C3696 c3696) {
        return (Struct) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Struct parseFrom(byte[] bArr) {
        return (Struct) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Struct parseFrom(byte[] bArr, C3696 c3696) {
        return (Struct) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Struct parseFrom(InputStream inputStream) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, C3696 c3696) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Struct parseFrom(AbstractC3473 abstractC3473) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Struct parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Struct) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
