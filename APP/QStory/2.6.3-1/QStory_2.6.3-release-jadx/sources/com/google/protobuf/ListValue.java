package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ListValue extends GeneratedMessage implements InterfaceC4263 {
    private static final ListValue DEFAULT_INSTANCE;
    private static final InterfaceC4207 PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "ListValue");
        DEFAULT_INSTANCE = new ListValue();
        PARSER = new C4252();
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.EMPTY_LIST;
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4169.f11300;
    }

    public static C4145 newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return (ListValue) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4169.f11300;
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
        int size = this.values_.size();
        int iM8202 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM8202 += AbstractC4294.m8202(this.values_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM8202 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4263
    public Value getValues(int i) {
        return this.values_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4263
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.InterfaceC4263
    public List<Value> getValuesList() {
        return this.values_;
    }

    @Override // com.google.protobuf.InterfaceC4263
    public InterfaceC4554 getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4263
    public List<? extends InterfaceC4554> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getValuesCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getValuesList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4169.f11307;
        c4451.m8386(ListValue.class, C4145.class);
        return c4451;
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
    public C4145 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4145(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4145 toBuilder() {
        C4252 c4252 = null;
        return this == DEFAULT_INSTANCE ? new C4145(c4252) : new C4145(c4252).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        for (int i = 0; i < this.values_.size(); i++) {
            abstractC4294.mo8208(1, this.values_.get(i));
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.ListValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4145 extends GeneratedMessage.AbstractC4137 implements InterfaceC4263 {
        private int bitField0_;
        private C4195 valuesBuilder_;
        private List<Value> values_;

        private C4145() {
            this.values_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(ListValue listValue) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 != null) {
                listValue.values_ = c4195.m8031();
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

        public static final C4495 getDescriptor() {
            return AbstractC4169.f11300;
        }

        private C4195 internalGetValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                this.valuesBuilder_ = new C4195(this.values_, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        public C4145 addAllValues(Iterable<? extends Value> iterable) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureValuesIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.values_);
            onChanged();
            return this;
        }

        public C4145 addValues(Value.C4156 c4156) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4156.build());
                return this;
            }
            ensureValuesIsMutable();
            this.values_.add(c4156.build());
            onChanged();
            return this;
        }

        public Value.C4156 addValuesBuilder() {
            return (Value.C4156) internalGetValuesFieldBuilder().m8019(Value.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) listValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this, null);
            buildPartialRepeatedFields(listValue);
            if (this.bitField0_ != 0) {
                buildPartial0(listValue);
            }
            onBuilt();
            return listValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4145 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 == null) {
                this.values_ = Collections.EMPTY_LIST;
            } else {
                this.values_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public C4145 clearValues() {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.values_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4169.f11300;
        }

        @Override // com.google.protobuf.InterfaceC4263
        public Value getValues(int i) {
            C4195 c4195 = this.valuesBuilder_;
            return c4195 == null ? this.values_.get(i) : (Value) c4195.m8025(i, false);
        }

        public Value.C4156 getValuesBuilder(int i) {
            return (Value.C4156) internalGetValuesFieldBuilder().m8032(i);
        }

        public List<Value.C4156> getValuesBuilderList() {
            return internalGetValuesFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4263
        public int getValuesCount() {
            C4195 c4195 = this.valuesBuilder_;
            return c4195 == null ? this.values_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4263
        public List<Value> getValuesList() {
            C4195 c4195 = this.valuesBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.values_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4263
        public InterfaceC4554 getValuesOrBuilder(int i) {
            C4195 c4195 = this.valuesBuilder_;
            return c4195 == null ? this.values_.get(i) : (InterfaceC4554) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4263
        public List<? extends InterfaceC4554> getValuesOrBuilderList() {
            C4195 c4195 = this.valuesBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.values_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4169.f11307;
            c4451.m8386(ListValue.class, C4145.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4145 mergeFrom(ListValue listValue) {
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
                boolean zIsEmpty = this.valuesBuilder_.f11357.isEmpty();
                C4195 c4195 = this.valuesBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    this.valuesBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetValuesFieldBuilder() : null;
                } else {
                    c4195.m8021(listValue.values_);
                }
            }
            mergeUnknownFields(listValue.getUnknownFields());
            onChanged();
            return this;
        }

        public C4145 removeValues(int i) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureValuesIsMutable();
            this.values_.remove(i);
            onChanged();
            return this;
        }

        public C4145 setValues(int i, Value.C4156 c4156) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4156.build());
                return this;
            }
            ensureValuesIsMutable();
            this.values_.set(i, c4156.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
        }

        public /* synthetic */ C4145(C4252 c4252) {
            this();
        }

        public /* synthetic */ C4145(InterfaceC4364 interfaceC4364, C4252 c4252) {
            this(interfaceC4364);
        }

        private C4145(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.values_ = Collections.EMPTY_LIST;
        }

        public Value.C4156 addValuesBuilder(int i) {
            return (Value.C4156) internalGetValuesFieldBuilder().m8020(i, Value.getDefaultInstance());
        }

        private void buildPartial0(ListValue listValue) {
        }

        public C4145 addValues(int i, Value value) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(i, value);
                onChanged();
                return this;
            }
            c4195.m8018(i, value);
            return this;
        }

        public C4145 setValues(int i, Value value) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.set(i, value);
                onChanged();
                return this;
            }
            c4195.m8022(i, value);
            return this;
        }

        public C4145 addValues(Value value) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(value);
                onChanged();
                return this;
            }
            c4195.m8017(value);
            return this;
        }

        public C4145 addValues(int i, Value.C4156 c4156) {
            C4195 c4195 = this.valuesBuilder_;
            if (c4195 == null) {
                ensureValuesIsMutable();
                this.values_.add(i, c4156.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4156.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4145 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof ListValue) {
                return mergeFrom((ListValue) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4145 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 != 10) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                Value value = (Value) abstractC4306.mo8274(Value.parser(), c4529);
                                C4195 c4195 = this.valuesBuilder_;
                                if (c4195 == null) {
                                    ensureValuesIsMutable();
                                    this.values_.add(value);
                                } else {
                                    c4195.m8017(value);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4145 newBuilderForType() {
        return newBuilder();
    }

    private ListValue(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4145 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public /* synthetic */ ListValue(GeneratedMessage.AbstractC4137 abstractC4137, C4252 c4252) {
        this(abstractC4137);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (ListValue) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static ListValue parseFrom(ByteString byteString) {
        return (ListValue) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static ListValue parseFrom(ByteString byteString, C4529 c4529) {
        return (ListValue) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static ListValue parseFrom(byte[] bArr) {
        return (ListValue) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static ListValue parseFrom(byte[] bArr, C4529 c4529) {
        return (ListValue) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static ListValue parseFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, C4529 c4529) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static ListValue parseFrom(AbstractC4306 abstractC4306) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static ListValue parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
