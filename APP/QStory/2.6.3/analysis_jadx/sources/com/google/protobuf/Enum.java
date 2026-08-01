package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.EnumValue;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Enum extends GeneratedMessage implements InterfaceC3583 {
    private static final Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3375 PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object edition_;
    private List<EnumValue> enumvalue_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Enum");
        DEFAULT_INSTANCE = new Enum();
        PARSER = new C3587();
    }

    private Enum() {
        this.name_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.enumvalue_ = list;
        this.options_ = list;
        this.syntax_ = 0;
        this.edition_ = "";
    }

    public static /* synthetic */ int access$976(Enum r1, int i) {
        int i2 = i | r1.bitField0_;
        r1.bitField0_ = i2;
        return i2;
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3701.f11506;
    }

    public static C3299 newBuilder(Enum r1) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(r1);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) {
        return (Enum) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Enum)) {
            return super.equals(obj);
        }
        Enum r5 = (Enum) obj;
        if (getName().equals(r5.getName()) && getEnumvalueList().equals(r5.getEnumvalueList()) && getOptionsList().equals(r5.getOptionsList()) && hasSourceContext() == r5.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(r5.getSourceContext())) && this.syntax_ == r5.syntax_ && getEdition().equals(r5.getEdition()) && getUnknownFields().equals(r5.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3701.f11506;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3583
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.InterfaceC3583
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public InterfaceC3580 getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3583
    public List<? extends InterfaceC3580> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3583
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3583
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public InterfaceC3376 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3583
    public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
        return this.options_;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.enumvalue_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.enumvalue_.get(i2));
        }
        int iM7643 = iComputeStringSize + size;
        int size2 = this.options_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7643 += AbstractC3462.m7643(this.options_.get(i3));
        }
        int iComputeStringSize2 = iM7643 + size2;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize2 += AbstractC3462.m7639(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC3462.m7632(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(6, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public InterfaceC3356 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC3583
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getEnumvalueCount() > 0) {
            iHashCode = getEnumvalueList().hashCode() + AbstractC2442.m4571(iHashCode, 37, 2, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC2442.m4571(iHashCode, 37, 3, 53);
        }
        if (hasSourceContext()) {
            iHashCode = getSourceContext().hashCode() + AbstractC2442.m4571(iHashCode, 37, 4, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4571(iHashCode, 37, 5, 53) + this.syntax_) * 37) + 6) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3701.f11505;
        c3619.m7827(Enum.class, C3299.class);
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
    public C3299 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3299(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3299 toBuilder() {
        C3587 c3587 = null;
        return this == DEFAULT_INSTANCE ? new C3299(c3587) : new C3299(c3587).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        for (int i = 0; i < this.enumvalue_.size(); i++) {
            abstractC3462.mo7649(2, this.enumvalue_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC3462.mo7649(3, this.options_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7649(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3462.mo7651(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3462, 6, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Enum$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3299 extends GeneratedMessage.AbstractC3305 implements InterfaceC3583 {
        private int bitField0_;
        private Object edition_;
        private C3363 enumvalueBuilder_;
        private List<EnumValue> enumvalue_;
        private Object name_;
        private C3363 optionsBuilder_;
        private List<Option> options_;
        private C3342 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        private C3299() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.enumvalue_ = list;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(Enum r4) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                r4.name_ = this.name_;
            }
            if ((i2 & 8) != 0) {
                C3342 c3342 = this.sourceContextBuilder_;
                r4.sourceContext_ = c3342 == null ? this.sourceContext_ : (SourceContext) c3342.m7384();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 16) != 0) {
                r4.syntax_ = this.syntax_;
            }
            if ((i2 & 32) != 0) {
                r4.edition_ = this.edition_;
            }
            Enum.access$976(r4, i);
        }

        private void buildPartialRepeatedFields(Enum r2) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                    this.bitField0_ &= -3;
                }
                r2.enumvalue_ = this.enumvalue_;
            } else {
                r2.enumvalue_ = c3363.m7472();
            }
            C3363 c33632 = this.optionsBuilder_;
            if (c33632 != null) {
                r2.options_ = c33632.m7472();
                return;
            }
            if ((this.bitField0_ & 4) != 0) {
                this.options_ = Collections.unmodifiableList(this.options_);
                this.bitField0_ &= -5;
            }
            r2.options_ = this.options_;
        }

        private void ensureEnumvalueIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.enumvalue_ = new ArrayList(this.enumvalue_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3701.f11506;
        }

        private C3363 internalGetEnumvalueFieldBuilder() {
            if (this.enumvalueBuilder_ == null) {
                this.enumvalueBuilder_ = new C3363(this.enumvalue_, getParentForChildren(), isClean());
                this.enumvalue_ = null;
            }
            return this.enumvalueBuilder_;
        }

        private C3363 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3363(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3342 internalGetSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new C3342(getSourceContext(), getParentForChildren(), isClean());
                this.sourceContext_ = null;
            }
            return this.sourceContextBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetEnumvalueFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
            }
        }

        public C3299 addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureEnumvalueIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.enumvalue_);
            onChanged();
            return this;
        }

        public C3299 addAllOptions(Iterable<? extends Option> iterable) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public C3299 addEnumvalue(EnumValue.C3300 c3300) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3300.build());
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.add(c3300.build());
            onChanged();
            return this;
        }

        public EnumValue.C3300 addEnumvalueBuilder() {
            return (EnumValue.C3300) internalGetEnumvalueFieldBuilder().m7460(EnumValue.getDefaultInstance());
        }

        public C3299 addOptions(Option.C3316 c3316) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3316.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.add(c3316.build());
            onChanged();
            return this;
        }

        public Option.C3316 addOptionsBuilder() {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7460(Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Enum build() {
            Enum enumBuildPartial = buildPartial();
            if (enumBuildPartial.isInitialized()) {
                return enumBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) enumBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Enum buildPartial() {
            Enum r0 = new Enum(this, null);
            buildPartialRepeatedFields(r0);
            if (this.bitField0_ != 0) {
                buildPartial0(r0);
            }
            onBuilt();
            return r0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3299 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 == null) {
                this.enumvalue_ = Collections.EMPTY_LIST;
            } else {
                this.enumvalue_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -3;
            C3363 c33632 = this.optionsBuilder_;
            if (c33632 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -5;
            this.sourceContext_ = null;
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.sourceContextBuilder_ = null;
            }
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        public C3299 clearEdition() {
            this.edition_ = Enum.getDefaultInstance().getEdition();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3299 clearEnumvalue() {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.enumvalue_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3299 clearName() {
            this.name_ = Enum.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3299 clearOptions() {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3299 clearSourceContext() {
            this.bitField0_ &= -9;
            this.sourceContext_ = null;
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3299 clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3701.f11506;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public EnumValue getEnumvalue(int i) {
            C3363 c3363 = this.enumvalueBuilder_;
            return c3363 == null ? this.enumvalue_.get(i) : (EnumValue) c3363.m7466(i, false);
        }

        public EnumValue.C3300 getEnumvalueBuilder(int i) {
            return (EnumValue.C3300) internalGetEnumvalueFieldBuilder().m7473(i);
        }

        public List<EnumValue.C3300> getEnumvalueBuilderList() {
            return internalGetEnumvalueFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3583
        public int getEnumvalueCount() {
            C3363 c3363 = this.enumvalueBuilder_;
            return c3363 == null ? this.enumvalue_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3583
        public List<EnumValue> getEnumvalueList() {
            C3363 c3363 = this.enumvalueBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.enumvalue_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3583
        public InterfaceC3580 getEnumvalueOrBuilder(int i) {
            C3363 c3363 = this.enumvalueBuilder_;
            return c3363 == null ? this.enumvalue_.get(i) : (InterfaceC3580) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3583
        public List<? extends InterfaceC3580> getEnumvalueOrBuilderList() {
            C3363 c3363 = this.enumvalueBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.enumvalue_);
        }

        @Override // com.google.protobuf.InterfaceC3583
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public Option getOptions(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (Option) c3363.m7466(i, false);
        }

        public Option.C3316 getOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7473(i);
        }

        public List<Option.C3316> getOptionsBuilderList() {
            return internalGetOptionsFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3583
        public int getOptionsCount() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3583
        public List<Option> getOptionsList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.options_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3583
        public InterfaceC3376 getOptionsOrBuilder(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (InterfaceC3376) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3583
        public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3583
        public SourceContext getSourceContext() {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                return (SourceContext) c3342.m7380();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.C3317 getSourceContextBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (SourceContext.C3317) internalGetSourceContextFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3583
        public InterfaceC3356 getSourceContextOrBuilder() {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                return (InterfaceC3356) c3342.m7379();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC3583
        public boolean hasSourceContext() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3701.f11505;
            c3619.m7827(Enum.class, C3299.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3299 mergeFrom(Enum r4) {
            if (r4 == Enum.getDefaultInstance()) {
                return this;
            }
            if (!r4.getName().isEmpty()) {
                this.name_ = r4.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.enumvalueBuilder_ == null) {
                if (!r4.enumvalue_.isEmpty()) {
                    if (this.enumvalue_.isEmpty()) {
                        this.enumvalue_ = r4.enumvalue_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEnumvalueIsMutable();
                        this.enumvalue_.addAll(r4.enumvalue_);
                    }
                    onChanged();
                }
            } else if (!r4.enumvalue_.isEmpty()) {
                boolean zIsEmpty = this.enumvalueBuilder_.f11012.isEmpty();
                C3363 c3363 = this.enumvalueBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.enumvalueBuilder_ = null;
                    this.enumvalue_ = r4.enumvalue_;
                    this.bitField0_ &= -3;
                    this.enumvalueBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumvalueFieldBuilder() : null;
                } else {
                    c3363.m7462(r4.enumvalue_);
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!r4.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = r4.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(r4.options_);
                    }
                    onChanged();
                }
            } else if (!r4.options_.isEmpty()) {
                boolean zIsEmpty2 = this.optionsBuilder_.f11012.isEmpty();
                C3363 c33632 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = r4.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c33632.m7462(r4.options_);
                }
            }
            if (r4.hasSourceContext()) {
                mergeSourceContext(r4.getSourceContext());
            }
            if (r4.syntax_ != 0) {
                setSyntaxValue(r4.getSyntaxValue());
            }
            if (!r4.getEdition().isEmpty()) {
                this.edition_ = r4.edition_;
                this.bitField0_ |= 32;
                onChanged();
            }
            mergeUnknownFields(r4.getUnknownFields());
            onChanged();
            return this;
        }

        public C3299 mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                c3342.m7386(sourceContext);
            } else if ((this.bitField0_ & 8) == 0 || (sourceContext2 = this.sourceContext_) == null || sourceContext2 == SourceContext.getDefaultInstance()) {
                this.sourceContext_ = sourceContext;
            } else {
                getSourceContextBuilder().mergeFrom(sourceContext);
            }
            if (this.sourceContext_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public C3299 removeEnumvalue(int i) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.remove(i);
            onChanged();
            return this;
        }

        public C3299 removeOptions(int i) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i);
            onChanged();
            return this;
        }

        public C3299 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3299 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3299 setEnumvalue(int i, EnumValue.C3300 c3300) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3300.build());
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.set(i, c3300.build());
            onChanged();
            return this;
        }

        public C3299 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3299 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3299 setOptions(int i, Option.C3316 c3316) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3316.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.set(i, c3316.build());
            onChanged();
            return this;
        }

        public C3299 setSourceContext(SourceContext.C3317 c3317) {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 == null) {
                this.sourceContext_ = c3317.build();
            } else {
                c3342.m7387(c3317.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3299 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C3299 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Enum getDefaultInstanceForType() {
            return Enum.getDefaultInstance();
        }

        public EnumValue.C3300 addEnumvalueBuilder(int i) {
            return (EnumValue.C3300) internalGetEnumvalueFieldBuilder().m7461(i, EnumValue.getDefaultInstance());
        }

        public Option.C3316 addOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7461(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3299(C3587 c3587) {
            this();
        }

        public /* synthetic */ C3299(InterfaceC3532 interfaceC3532, C3587 c3587) {
            this(interfaceC3532);
        }

        private C3299(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.enumvalue_ = list;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public C3299 addEnumvalue(int i, EnumValue enumValue) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, enumValue);
                onChanged();
                return this;
            }
            c3363.m7459(i, enumValue);
            return this;
        }

        public C3299 addOptions(int i, Option option) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
                return this;
            }
            c3363.m7459(i, option);
            return this;
        }

        public C3299 setEnumvalue(int i, EnumValue enumValue) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i, enumValue);
                onChanged();
                return this;
            }
            c3363.m7463(i, enumValue);
            return this;
        }

        public C3299 setOptions(int i, Option option) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
                return this;
            }
            c3363.m7463(i, option);
            return this;
        }

        public C3299 setSourceContext(SourceContext sourceContext) {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                c3342.m7387(sourceContext);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3299 addEnumvalue(EnumValue enumValue) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(enumValue);
                onChanged();
                return this;
            }
            c3363.m7458(enumValue);
            return this;
        }

        public C3299 addOptions(Option option) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
                return this;
            }
            c3363.m7458(option);
            return this;
        }

        public C3299 addEnumvalue(int i, EnumValue.C3300 c3300) {
            C3363 c3363 = this.enumvalueBuilder_;
            if (c3363 == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, c3300.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3300.build());
            return this;
        }

        public C3299 addOptions(int i, Option.C3316 c3316) {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, c3316.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3316.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3299 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Enum) {
                return mergeFrom((Enum) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3299 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 == 10) {
                                this.name_ = abstractC3474.mo7706();
                                this.bitField0_ |= 1;
                            } else if (iMo7705 == 18) {
                                EnumValue enumValue = (EnumValue) abstractC3474.mo7715(EnumValue.parser(), c3697);
                                C3363 c3363 = this.enumvalueBuilder_;
                                if (c3363 == null) {
                                    ensureEnumvalueIsMutable();
                                    this.enumvalue_.add(enumValue);
                                } else {
                                    c3363.m7458(enumValue);
                                }
                            } else if (iMo7705 == 26) {
                                Option option = (Option) abstractC3474.mo7715(Option.parser(), c3697);
                                C3363 c33632 = this.optionsBuilder_;
                                if (c33632 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c33632.m7458(option);
                                }
                            } else if (iMo7705 == 34) {
                                abstractC3474.mo7716(internalGetSourceContextFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 8;
                            } else if (iMo7705 == 40) {
                                this.syntax_ = abstractC3474.mo7724();
                                this.bitField0_ |= 16;
                            } else if (iMo7705 != 50) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                this.edition_ = abstractC3474.mo7706();
                                this.bitField0_ |= 32;
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
    public Enum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3299 newBuilderForType() {
        return newBuilder();
    }

    public static C3299 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Enum) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Enum parseFrom(ByteString byteString) {
        return (Enum) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Enum parseFrom(ByteString byteString, C3697 c3697) {
        return (Enum) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Enum parseFrom(byte[] bArr) {
        return (Enum) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Enum parseFrom(byte[] bArr, C3697 c3697) {
        return (Enum) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    private Enum(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Enum parseFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, C3697 c3697) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public /* synthetic */ Enum(GeneratedMessage.AbstractC3305 abstractC3305, C3587 c3587) {
        this(abstractC3305);
    }

    public static Enum parseFrom(AbstractC3474 abstractC3474) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Enum parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
