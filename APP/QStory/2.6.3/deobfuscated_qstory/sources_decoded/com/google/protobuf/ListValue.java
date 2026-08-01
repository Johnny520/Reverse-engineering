package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Value;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ListValue extends GeneratedMessage implements InterfaceC3431 {
    private static final ListValue DEFAULT_INSTANCE;
    private static final InterfaceC3375 PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "ListValue");
        DEFAULT_INSTANCE = new ListValue();
        PARSER = new C3420();
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.EMPTY_LIST;
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3337.f10955;
    }

    public static C3313 newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return (ListValue) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3337.f10955;
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
        int size = this.values_.size();
        int iM7643 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7643 += AbstractC3462.m7643(this.values_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM7643 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3431
    public Value getValues(int i) {
        return this.values_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3431
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.InterfaceC3431
    public List<Value> getValuesList() {
        return this.values_;
    }

    @Override // com.google.protobuf.InterfaceC3431
    public InterfaceC3722 getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3431
    public List<? extends InterfaceC3722> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getValuesCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getValuesList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3337.f10962;
        c3619.m7827(ListValue.class, C3313.class);
        return c3619;
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
    public C3313 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3313(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3313 toBuilder() {
        C3420 c3420 = null;
        return this == DEFAULT_INSTANCE ? new C3313(c3420) : new C3313(c3420).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        for (int i = 0; i < this.values_.size(); i++) {
            abstractC3462.mo7649(1, this.values_.get(i));
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.ListValue$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3313 extends GeneratedMessage.AbstractC3305 implements InterfaceC3431 {
        private int bitField0_;
        private C3363 valuesBuilder_;
        private List<Value> values_;

        private C3313() {
            this.values_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(ListValue listValue) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 != null) {
                listValue.values_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3337.f10955;
        }

        private C3363 internalGetValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                this.valuesBuilder_ = new C3363(this.values_, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        public C3313 addAllValues(Iterable<? extends Value> iterable) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureValuesIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.values_);
            onChanged();
            return this;
        }

        public C3313 addValues(Value.C3324 c3324) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3324.build());
                return this;
            }
            ensureValuesIsMutable();
            this.values_.add(c3324.build());
            onChanged();
            return this;
        }

        public Value.C3324 addValuesBuilder() {
            return (Value.C3324) internalGetValuesFieldBuilder().m7460(Value.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) listValueBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this, null);
            buildPartialRepeatedFields(listValue);
            if (this.bitField0_ != 0) {
                buildPartial0(listValue);
            }
            onBuilt();
            return listValue;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3313 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 == null) {
                this.values_ = Collections.EMPTY_LIST;
            } else {
                this.values_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public C3313 clearValues() {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.values_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3337.f10955;
        }

        @Override // com.google.protobuf.InterfaceC3431
        public Value getValues(int i) {
            C3363 c3363 = this.valuesBuilder_;
            return c3363 == null ? this.values_.get(i) : (Value) c3363.m7466(i, false);
        }

        public Value.C3324 getValuesBuilder(int i) {
            return (Value.C3324) internalGetValuesFieldBuilder().m7473(i);
        }

        public List<Value.C3324> getValuesBuilderList() {
            return internalGetValuesFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3431
        public int getValuesCount() {
            C3363 c3363 = this.valuesBuilder_;
            return c3363 == null ? this.values_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3431
        public List<Value> getValuesList() {
            C3363 c3363 = this.valuesBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.values_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3431
        public InterfaceC3722 getValuesOrBuilder(int i) {
            C3363 c3363 = this.valuesBuilder_;
            return c3363 == null ? this.values_.get(i) : (InterfaceC3722) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3431
        public List<? extends InterfaceC3722> getValuesOrBuilderList() {
            C3363 c3363 = this.valuesBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.values_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3337.f10962;
            c3619.m7827(ListValue.class, C3313.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3313 mergeFrom(ListValue listValue) {
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
                boolean zIsEmpty = this.valuesBuilder_.f11012.isEmpty();
                C3363 c3363 = this.valuesBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    this.valuesBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetValuesFieldBuilder() : null;
                } else {
                    c3363.m7462(listValue.values_);
                }
            }
            mergeUnknownFields(listValue.getUnknownFields());
            onChanged();
            return this;
        }

        public C3313 removeValues(int i) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureValuesIsMutable();
            this.values_.remove(i);
            onChanged();
            return this;
        }

        public C3313 setValues(int i, Value.C3324 c3324) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3324.build());
                return this;
            }
            ensureValuesIsMutable();
            this.values_.set(i, c3324.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
        }

        public /* synthetic */ C3313(C3420 c3420) {
            this();
        }

        public /* synthetic */ C3313(InterfaceC3532 interfaceC3532, C3420 c3420) {
            this(interfaceC3532);
        }

        private C3313(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.values_ = Collections.EMPTY_LIST;
        }

        public Value.C3324 addValuesBuilder(int i) {
            return (Value.C3324) internalGetValuesFieldBuilder().m7461(i, Value.getDefaultInstance());
        }

        private void buildPartial0(ListValue listValue) {
        }

        public C3313 addValues(int i, Value value) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(i, value);
                onChanged();
                return this;
            }
            c3363.m7459(i, value);
            return this;
        }

        public C3313 setValues(int i, Value value) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.set(i, value);
                onChanged();
                return this;
            }
            c3363.m7463(i, value);
            return this;
        }

        public C3313 addValues(Value value) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(value);
                onChanged();
                return this;
            }
            c3363.m7458(value);
            return this;
        }

        public C3313 addValues(int i, Value.C3324 c3324) {
            C3363 c3363 = this.valuesBuilder_;
            if (c3363 == null) {
                ensureValuesIsMutable();
                this.values_.add(i, c3324.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3324.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3313 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof ListValue) {
                return mergeFrom((ListValue) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3313 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 != 10) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                Value value = (Value) abstractC3474.mo7715(Value.parser(), c3697);
                                C3363 c3363 = this.valuesBuilder_;
                                if (c3363 == null) {
                                    ensureValuesIsMutable();
                                    this.values_.add(value);
                                } else {
                                    c3363.m7458(value);
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3313 newBuilderForType() {
        return newBuilder();
    }

    private ListValue(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3313 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public /* synthetic */ ListValue(GeneratedMessage.AbstractC3305 abstractC3305, C3420 c3420) {
        this(abstractC3305);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (ListValue) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static ListValue parseFrom(ByteString byteString) {
        return (ListValue) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static ListValue parseFrom(ByteString byteString, C3697 c3697) {
        return (ListValue) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static ListValue parseFrom(byte[] bArr) {
        return (ListValue) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static ListValue parseFrom(byte[] bArr, C3697 c3697) {
        return (ListValue) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static ListValue parseFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, C3697 c3697) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static ListValue parseFrom(AbstractC3474 abstractC3474) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static ListValue parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
