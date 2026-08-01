package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ListValue extends GeneratedMessage implements InterfaceC3430 {
    private static final ListValue DEFAULT_INSTANCE;
    private static final InterfaceC3374 PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "ListValue");
        DEFAULT_INSTANCE = new ListValue();
        PARSER = new C3419();
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.EMPTY_LIST;
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3336.f10950;
    }

    public static C3312 newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return (ListValue) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListValue)) {
            return super.equals(obj);
        }
        ListValue listValue = (ListValue) obj;
        return getValuesList().equals(listValue.getValuesList()) && getUnknownFields().equals(listValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3336.f10950;
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
        int size = this.values_.size();
        int iM7656 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7656 += AbstractC3461.m7656(this.values_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7656 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3430
    public Value getValues(int i) {
        return this.values_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3430
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.InterfaceC3430
    public List<Value> getValuesList() {
        return this.values_;
    }

    @Override // com.google.protobuf.InterfaceC3430
    public InterfaceC3721 getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3430
    public List<? extends InterfaceC3721> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getValuesCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getValuesList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3336.f10957;
        c3618.m7840(ListValue.class, C3312.class);
        return c3618;
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
    public C3312 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3312(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3312 toBuilder() {
        C3419 c3419 = null;
        return this == DEFAULT_INSTANCE ? new C3312(c3419) : new C3312(c3419).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        for (int i = 0; i < this.values_.size(); i++) {
            abstractC3461.mo7662(1, this.values_.get(i));
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.ListValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3312 extends GeneratedMessage.AbstractC3304 implements InterfaceC3430 {
        private int bitField0_;
        private C3362 valuesBuilder_;
        private List<Value> values_;

        private C3312() {
            this.values_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(ListValue listValue) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 != null) {
                listValue.values_ = c3362.m7485();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.values_ = Collections.unmodifiableList(this.values_);
                this.bitField0_ &= -2;
            }
            listValue.values_ = this.values_;
        }

        private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.values_ = new ArrayList(this.values_);
                this.bitField0_ |= 1;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3336.f10950;
        }

        private C3362 internalGetValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                this.valuesBuilder_ = new C3362(this.values_, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        public C3312 addAllValues(Iterable<? extends Value> iterable) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureValuesIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.values_);
            onChanged();
            return this;
        }

        public C3312 addValues(Value.C3323 c3323) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3323.build());
                return this;
            }
            ensureValuesIsMutable();
            this.values_.add(c3323.build());
            onChanged();
            return this;
        }

        public Value.C3323 addValuesBuilder() {
            return (Value.C3323) internalGetValuesFieldBuilder().m7473(Value.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) listValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this, null);
            buildPartialRepeatedFields(listValue);
            if (this.bitField0_ != 0) {
                buildPartial0(listValue);
            }
            onBuilt();
            return listValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3312 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 == null) {
                this.values_ = Collections.EMPTY_LIST;
            } else {
                this.values_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public C3312 clearValues() {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.values_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3336.f10950;
        }

        @Override // com.google.protobuf.InterfaceC3430
        public Value getValues(int i) {
            C3362 c3362 = this.valuesBuilder_;
            return c3362 == null ? this.values_.get(i) : (Value) c3362.m7479(i, false);
        }

        public Value.C3323 getValuesBuilder(int i) {
            return (Value.C3323) internalGetValuesFieldBuilder().m7486(i);
        }

        public List<Value.C3323> getValuesBuilderList() {
            return internalGetValuesFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3430
        public int getValuesCount() {
            C3362 c3362 = this.valuesBuilder_;
            return c3362 == null ? this.values_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3430
        public List<Value> getValuesList() {
            C3362 c3362 = this.valuesBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.values_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3430
        public InterfaceC3721 getValuesOrBuilder(int i) {
            C3362 c3362 = this.valuesBuilder_;
            return c3362 == null ? this.values_.get(i) : (InterfaceC3721) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3430
        public List<? extends InterfaceC3721> getValuesOrBuilderList() {
            C3362 c3362 = this.valuesBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.values_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3336.f10957;
            c3618.m7840(ListValue.class, C3312.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3312 mergeFrom(ListValue listValue) {
            if (listValue == ListValue.getDefaultInstance()) {
                return this;
            }
            if (this.valuesBuilder_ == null) {
                if (!listValue.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = listValue.values_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(listValue.values_);
                    }
                    onChanged();
                }
            } else if (!listValue.values_.isEmpty()) {
                boolean zIsEmpty = this.valuesBuilder_.f11007.isEmpty();
                C3362 c3362 = this.valuesBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    this.valuesBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetValuesFieldBuilder() : null;
                } else {
                    c3362.m7475(listValue.values_);
                }
            }
            mergeUnknownFields(listValue.getUnknownFields());
            onChanged();
            return this;
        }

        public C3312 removeValues(int i) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureValuesIsMutable();
            this.values_.remove(i);
            onChanged();
            return this;
        }

        public C3312 setValues(int i, Value.C3323 c3323) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3323.build());
                return this;
            }
            ensureValuesIsMutable();
            this.values_.set(i, c3323.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
        }

        public /* synthetic */ C3312(C3419 c3419) {
            this();
        }

        public /* synthetic */ C3312(InterfaceC3531 interfaceC3531, C3419 c3419) {
            this(interfaceC3531);
        }

        private C3312(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.values_ = Collections.EMPTY_LIST;
        }

        public Value.C3323 addValuesBuilder(int i) {
            return (Value.C3323) internalGetValuesFieldBuilder().m7474(i, Value.getDefaultInstance());
        }

        private void buildPartial0(ListValue listValue) {
        }

        public C3312 addValues(int i, Value value) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(i, value);
                onChanged();
                return this;
            }
            c3362.m7472(i, value);
            return this;
        }

        public C3312 setValues(int i, Value value) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.set(i, value);
                onChanged();
                return this;
            }
            c3362.m7476(i, value);
            return this;
        }

        public C3312 addValues(Value value) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(value);
                onChanged();
                return this;
            }
            c3362.m7471(value);
            return this;
        }

        public C3312 addValues(int i, Value.C3323 c3323) {
            C3362 c3362 = this.valuesBuilder_;
            if (c3362 == null) {
                ensureValuesIsMutable();
                this.values_.add(i, c3323.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3323.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3312 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof ListValue) {
                return mergeFrom((ListValue) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3312 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 != 10) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                Value value = (Value) abstractC3473.mo7728(Value.parser(), c3696);
                                C3362 c3362 = this.valuesBuilder_;
                                if (c3362 == null) {
                                    ensureValuesIsMutable();
                                    this.values_.add(value);
                                } else {
                                    c3362.m7471(value);
                                }
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
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3312 newBuilderForType() {
        return newBuilder();
    }

    private ListValue(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3312 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public /* synthetic */ ListValue(GeneratedMessage.AbstractC3304 abstractC3304, C3419 c3419) {
        this(abstractC3304);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (ListValue) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static ListValue parseFrom(ByteString byteString) {
        return (ListValue) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static ListValue parseFrom(ByteString byteString, C3696 c3696) {
        return (ListValue) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static ListValue parseFrom(byte[] bArr) {
        return (ListValue) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static ListValue parseFrom(byte[] bArr, C3696 c3696) {
        return (ListValue) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static ListValue parseFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, C3696 c3696) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static ListValue parseFrom(AbstractC3473 abstractC3473) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static ListValue parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
