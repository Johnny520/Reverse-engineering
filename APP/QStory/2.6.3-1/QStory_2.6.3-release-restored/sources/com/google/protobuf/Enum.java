package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
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
public final class Enum extends GeneratedMessage implements InterfaceC4415 {
    private static final Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
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
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Enum");
        DEFAULT_INSTANCE = new Enum();
        PARSER = new C4419();
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

    public static final C4495 getDescriptor() {
        return AbstractC4533.f11851;
    }

    public static C4131 newBuilder(Enum r1) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(r1);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) {
        return (Enum) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4533.f11851;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4415
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.InterfaceC4415
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public InterfaceC4412 getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4415
    public List<? extends InterfaceC4412> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4415
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC4415
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public InterfaceC4208 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4415
    public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
        return this.options_;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.enumvalue_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.enumvalue_.get(i2));
        }
        int iM8202 = iComputeStringSize + size;
        int size2 = this.options_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM8202 += AbstractC4294.m8202(this.options_.get(i3));
        }
        int iComputeStringSize2 = iM8202 + size2;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize2 += AbstractC4294.m8198(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC4294.m8191(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(6, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public InterfaceC4188 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC4415
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getEnumvalueCount() > 0) {
            iHashCode = getEnumvalueList().hashCode() + AbstractC3275.m5131(iHashCode, 37, 2, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC3275.m5131(iHashCode, 37, 3, 53);
        }
        if (hasSourceContext()) {
            iHashCode = getSourceContext().hashCode() + AbstractC3275.m5131(iHashCode, 37, 4, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC3275.m5131(iHashCode, 37, 5, 53) + this.syntax_) * 37) + 6) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4533.f11850;
        c4451.m8386(Enum.class, C4131.class);
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
    public C4131 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4131(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4131 toBuilder() {
        C4419 c4419 = null;
        return this == DEFAULT_INSTANCE ? new C4131(c4419) : new C4131(c4419).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        for (int i = 0; i < this.enumvalue_.size(); i++) {
            abstractC4294.mo8208(2, this.enumvalue_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC4294.mo8208(3, this.options_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8208(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC4294.mo8210(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC4294, 6, this.edition_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Enum$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4131 extends GeneratedMessage.AbstractC4137 implements InterfaceC4415 {
        private int bitField0_;
        private Object edition_;
        private C4195 enumvalueBuilder_;
        private List<EnumValue> enumvalue_;
        private Object name_;
        private C4195 optionsBuilder_;
        private List<Option> options_;
        private C4174 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        private C4131() {
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
                C4174 c4174 = this.sourceContextBuilder_;
                r4.sourceContext_ = c4174 == null ? this.sourceContext_ : (SourceContext) c4174.m7943();
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
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                    this.bitField0_ &= -3;
                }
                r2.enumvalue_ = this.enumvalue_;
            } else {
                r2.enumvalue_ = c4195.m8031();
            }
            C4195 c41952 = this.optionsBuilder_;
            if (c41952 != null) {
                r2.options_ = c41952.m8031();
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

        public static final C4495 getDescriptor() {
            return AbstractC4533.f11851;
        }

        private C4195 internalGetEnumvalueFieldBuilder() {
            if (this.enumvalueBuilder_ == null) {
                this.enumvalueBuilder_ = new C4195(this.enumvalue_, getParentForChildren(), isClean());
                this.enumvalue_ = null;
            }
            return this.enumvalueBuilder_;
        }

        private C4195 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4195(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C4174 internalGetSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new C4174(getSourceContext(), getParentForChildren(), isClean());
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

        public C4131 addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureEnumvalueIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.enumvalue_);
            onChanged();
            return this;
        }

        public C4131 addAllOptions(Iterable<? extends Option> iterable) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public C4131 addEnumvalue(EnumValue.C4132 c4132) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4132.build());
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.add(c4132.build());
            onChanged();
            return this;
        }

        public EnumValue.C4132 addEnumvalueBuilder() {
            return (EnumValue.C4132) internalGetEnumvalueFieldBuilder().m8019(EnumValue.getDefaultInstance());
        }

        public C4131 addOptions(Option.C4148 c4148) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4148.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.add(c4148.build());
            onChanged();
            return this;
        }

        public Option.C4148 addOptionsBuilder() {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8019(Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Enum build() {
            Enum enumBuildPartial = buildPartial();
            if (enumBuildPartial.isInitialized()) {
                return enumBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) enumBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Enum buildPartial() {
            Enum r0 = new Enum(this, null);
            buildPartialRepeatedFields(r0);
            if (this.bitField0_ != 0) {
                buildPartial0(r0);
            }
            onBuilt();
            return r0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4131 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 == null) {
                this.enumvalue_ = Collections.EMPTY_LIST;
            } else {
                this.enumvalue_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -3;
            C4195 c41952 = this.optionsBuilder_;
            if (c41952 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -5;
            this.sourceContext_ = null;
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.sourceContextBuilder_ = null;
            }
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        public C4131 clearEdition() {
            this.edition_ = Enum.getDefaultInstance().getEdition();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C4131 clearEnumvalue() {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.enumvalue_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4131 clearName() {
            this.name_ = Enum.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4131 clearOptions() {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C4131 clearSourceContext() {
            this.bitField0_ &= -9;
            this.sourceContext_ = null;
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4131 clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4533.f11851;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public EnumValue getEnumvalue(int i) {
            C4195 c4195 = this.enumvalueBuilder_;
            return c4195 == null ? this.enumvalue_.get(i) : (EnumValue) c4195.m8025(i, false);
        }

        public EnumValue.C4132 getEnumvalueBuilder(int i) {
            return (EnumValue.C4132) internalGetEnumvalueFieldBuilder().m8032(i);
        }

        public List<EnumValue.C4132> getEnumvalueBuilderList() {
            return internalGetEnumvalueFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4415
        public int getEnumvalueCount() {
            C4195 c4195 = this.enumvalueBuilder_;
            return c4195 == null ? this.enumvalue_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4415
        public List<EnumValue> getEnumvalueList() {
            C4195 c4195 = this.enumvalueBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.enumvalue_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4415
        public InterfaceC4412 getEnumvalueOrBuilder(int i) {
            C4195 c4195 = this.enumvalueBuilder_;
            return c4195 == null ? this.enumvalue_.get(i) : (InterfaceC4412) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4415
        public List<? extends InterfaceC4412> getEnumvalueOrBuilderList() {
            C4195 c4195 = this.enumvalueBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.enumvalue_);
        }

        @Override // com.google.protobuf.InterfaceC4415
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public Option getOptions(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (Option) c4195.m8025(i, false);
        }

        public Option.C4148 getOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8032(i);
        }

        public List<Option.C4148> getOptionsBuilderList() {
            return internalGetOptionsFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4415
        public int getOptionsCount() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4415
        public List<Option> getOptionsList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.options_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4415
        public InterfaceC4208 getOptionsOrBuilder(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (InterfaceC4208) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4415
        public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC4415
        public SourceContext getSourceContext() {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                return (SourceContext) c4174.m7939();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.C4149 getSourceContextBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (SourceContext.C4149) internalGetSourceContextFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4415
        public InterfaceC4188 getSourceContextOrBuilder() {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                return (InterfaceC4188) c4174.m7938();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC4415
        public boolean hasSourceContext() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4533.f11850;
            c4451.m8386(Enum.class, C4131.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4131 mergeFrom(Enum r4) {
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
                boolean zIsEmpty = this.enumvalueBuilder_.f11357.isEmpty();
                C4195 c4195 = this.enumvalueBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.enumvalueBuilder_ = null;
                    this.enumvalue_ = r4.enumvalue_;
                    this.bitField0_ &= -3;
                    this.enumvalueBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumvalueFieldBuilder() : null;
                } else {
                    c4195.m8021(r4.enumvalue_);
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
                boolean zIsEmpty2 = this.optionsBuilder_.f11357.isEmpty();
                C4195 c41952 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = r4.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c41952.m8021(r4.options_);
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

        public C4131 mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                c4174.m7945(sourceContext);
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

        public C4131 removeEnumvalue(int i) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.remove(i);
            onChanged();
            return this;
        }

        public C4131 removeOptions(int i) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i);
            onChanged();
            return this;
        }

        public C4131 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4131 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C4131 setEnumvalue(int i, EnumValue.C4132 c4132) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4132.build());
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.set(i, c4132.build());
            onChanged();
            return this;
        }

        public C4131 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4131 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4131 setOptions(int i, Option.C4148 c4148) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4148.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.set(i, c4148.build());
            onChanged();
            return this;
        }

        public C4131 setSourceContext(SourceContext.C4149 c4149) {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 == null) {
                this.sourceContext_ = c4149.build();
            } else {
                c4174.m7946(c4149.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4131 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C4131 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Enum getDefaultInstanceForType() {
            return Enum.getDefaultInstance();
        }

        public EnumValue.C4132 addEnumvalueBuilder(int i) {
            return (EnumValue.C4132) internalGetEnumvalueFieldBuilder().m8020(i, EnumValue.getDefaultInstance());
        }

        public Option.C4148 addOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8020(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C4131(C4419 c4419) {
            this();
        }

        public /* synthetic */ C4131(InterfaceC4364 interfaceC4364, C4419 c4419) {
            this(interfaceC4364);
        }

        private C4131(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.enumvalue_ = list;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public C4131 addEnumvalue(int i, EnumValue enumValue) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, enumValue);
                onChanged();
                return this;
            }
            c4195.m8018(i, enumValue);
            return this;
        }

        public C4131 addOptions(int i, Option option) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
                return this;
            }
            c4195.m8018(i, option);
            return this;
        }

        public C4131 setEnumvalue(int i, EnumValue enumValue) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i, enumValue);
                onChanged();
                return this;
            }
            c4195.m8022(i, enumValue);
            return this;
        }

        public C4131 setOptions(int i, Option option) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
                return this;
            }
            c4195.m8022(i, option);
            return this;
        }

        public C4131 setSourceContext(SourceContext sourceContext) {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                c4174.m7946(sourceContext);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4131 addEnumvalue(EnumValue enumValue) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(enumValue);
                onChanged();
                return this;
            }
            c4195.m8017(enumValue);
            return this;
        }

        public C4131 addOptions(Option option) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
                return this;
            }
            c4195.m8017(option);
            return this;
        }

        public C4131 addEnumvalue(int i, EnumValue.C4132 c4132) {
            C4195 c4195 = this.enumvalueBuilder_;
            if (c4195 == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, c4132.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4132.build());
            return this;
        }

        public C4131 addOptions(int i, Option.C4148 c4148) {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, c4148.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4148.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4131 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Enum) {
                return mergeFrom((Enum) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4131 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 == 10) {
                                this.name_ = abstractC4306.mo8265();
                                this.bitField0_ |= 1;
                            } else if (iMo8264 == 18) {
                                EnumValue enumValue = (EnumValue) abstractC4306.mo8274(EnumValue.parser(), c4529);
                                C4195 c4195 = this.enumvalueBuilder_;
                                if (c4195 == null) {
                                    ensureEnumvalueIsMutable();
                                    this.enumvalue_.add(enumValue);
                                } else {
                                    c4195.m8017(enumValue);
                                }
                            } else if (iMo8264 == 26) {
                                Option option = (Option) abstractC4306.mo8274(Option.parser(), c4529);
                                C4195 c41952 = this.optionsBuilder_;
                                if (c41952 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c41952.m8017(option);
                                }
                            } else if (iMo8264 == 34) {
                                abstractC4306.mo8275(internalGetSourceContextFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 8;
                            } else if (iMo8264 == 40) {
                                this.syntax_ = abstractC4306.mo8283();
                                this.bitField0_ |= 16;
                            } else if (iMo8264 != 50) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                this.edition_ = abstractC4306.mo8265();
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Enum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4131 newBuilderForType() {
        return newBuilder();
    }

    public static C4131 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Enum) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Enum parseFrom(ByteString byteString) {
        return (Enum) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Enum parseFrom(ByteString byteString, C4529 c4529) {
        return (Enum) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Enum parseFrom(byte[] bArr) {
        return (Enum) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Enum parseFrom(byte[] bArr, C4529 c4529) {
        return (Enum) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    private Enum(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Enum parseFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, C4529 c4529) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public /* synthetic */ Enum(GeneratedMessage.AbstractC4137 abstractC4137, C4419 c4419) {
        this(abstractC4137);
    }

    public static Enum parseFrom(AbstractC4306 abstractC4306) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Enum parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
