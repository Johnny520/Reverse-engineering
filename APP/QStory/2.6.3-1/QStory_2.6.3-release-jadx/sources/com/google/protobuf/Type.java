package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.Field;
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
public final class Type extends GeneratedMessage implements InterfaceC4534 {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static final InterfaceC4207 PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object edition_;
    private List<Field> fields_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private C4216 oneofs_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Type");
        DEFAULT_INSTANCE = new Type();
        PARSER = new C4535();
    }

    private Type() {
        this.name_ = "";
        C4216 c4216 = C4216.f11382;
        this.oneofs_ = c4216;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.fields_ = list;
        this.oneofs_ = c4216;
        this.options_ = list;
        this.syntax_ = 0;
        this.edition_ = "";
    }

    public static /* synthetic */ int access$1076(Type type, int i) {
        int i2 = i | type.bitField0_;
        type.bitField0_ = i2;
        return i2;
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4533.f11855;
    }

    public static C4153 newBuilder(Type type) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream) {
        return (Type) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) {
        return (Type) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return super.equals(obj);
        }
        Type type = (Type) obj;
        if (getName().equals(type.getName()) && getFieldsList().equals(type.getFieldsList()) && getOneofsList().equals(type.getOneofsList()) && getOptionsList().equals(type.getOptionsList()) && hasSourceContext() == type.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(type.getSourceContext())) && this.syntax_ == type.syntax_ && getEdition().equals(type.getEdition()) && getUnknownFields().equals(type.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4533.f11855;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public Field getFields(int i) {
        return this.fields_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4534
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.InterfaceC4534
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public InterfaceC4520 getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4534
    public List<? extends InterfaceC4520> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4534
    public ByteString getOneofsBytes(int i) {
        return this.oneofs_.m8056(i);
    }

    @Override // com.google.protobuf.InterfaceC4534
    public int getOneofsCount() {
        return this.oneofs_.f11383.size();
    }

    @Override // com.google.protobuf.InterfaceC4534
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4534
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC4534
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public InterfaceC4208 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4534
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
        int size = this.fields_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.fields_.get(i2));
        }
        int i3 = iComputeStringSize + size;
        int iComputeStringSizeNoTag = 0;
        for (int i4 = 0; i4 < this.oneofs_.f11383.size(); i4++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.oneofs_.f11383.get(i4));
        }
        int size2 = getOneofsList().size() + i3 + iComputeStringSizeNoTag;
        int size3 = this.options_.size();
        for (int i5 = 0; i5 < size3; i5++) {
            size2 += AbstractC4294.m8202(this.options_.get(i5));
        }
        int iComputeStringSize2 = size2 + size3;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize2 += AbstractC4294.m8198(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC4294.m8191(6, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(7, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public InterfaceC4188 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4534
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC4534
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
        if (getFieldsCount() > 0) {
            iHashCode = getFieldsList().hashCode() + AbstractC3275.m5131(iHashCode, 37, 2, 53);
        }
        if (getOneofsCount() > 0) {
            iHashCode = getOneofsList().hashCode() + AbstractC3275.m5131(iHashCode, 37, 3, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC3275.m5131(iHashCode, 37, 4, 53);
        }
        if (hasSourceContext()) {
            iHashCode = getSourceContext().hashCode() + AbstractC3275.m5131(iHashCode, 37, 5, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC3275.m5131(iHashCode, 37, 6, 53) + this.syntax_) * 37) + 7) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4533.f11854;
        c4451.m8386(Type.class, C4153.class);
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
    public C4153 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4153(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4153 toBuilder() {
        C4535 c4535 = null;
        return this == DEFAULT_INSTANCE ? new C4153(c4535) : new C4153(c4535).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        for (int i = 0; i < this.fields_.size(); i++) {
            abstractC4294.mo8208(2, this.fields_.get(i));
        }
        for (int i2 = 0; i2 < this.oneofs_.f11383.size(); i2++) {
            GeneratedMessage.writeString(abstractC4294, 3, this.oneofs_.f11383.get(i2));
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            abstractC4294.mo8208(4, this.options_.get(i3));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC4294.mo8208(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC4294.mo8210(6, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC4294, 7, this.edition_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Type$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4153 extends GeneratedMessage.AbstractC4137 implements InterfaceC4534 {
        private int bitField0_;
        private Object edition_;
        private C4195 fieldsBuilder_;
        private List<Field> fields_;
        private Object name_;
        private C4216 oneofs_;
        private C4195 optionsBuilder_;
        private List<Option> options_;
        private C4174 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        private C4153() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.fields_ = list;
            this.oneofs_ = C4216.f11382;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(Type type) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                type.name_ = this.name_;
            }
            if ((i2 & 4) != 0) {
                this.oneofs_.m8346();
                type.oneofs_ = this.oneofs_;
            }
            if ((i2 & 16) != 0) {
                C4174 c4174 = this.sourceContextBuilder_;
                type.sourceContext_ = c4174 == null ? this.sourceContext_ : (SourceContext) c4174.m7943();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 32) != 0) {
                type.syntax_ = this.syntax_;
            }
            if ((i2 & 64) != 0) {
                type.edition_ = this.edition_;
            }
            Type.access$1076(type, i);
        }

        private void buildPartialRepeatedFields(Type type) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.fields_ = Collections.unmodifiableList(this.fields_);
                    this.bitField0_ &= -3;
                }
                type.fields_ = this.fields_;
            } else {
                type.fields_ = c4195.m8031();
            }
            C4195 c41952 = this.optionsBuilder_;
            if (c41952 != null) {
                type.options_ = c41952.m8031();
                return;
            }
            if ((this.bitField0_ & 8) != 0) {
                this.options_ = Collections.unmodifiableList(this.options_);
                this.bitField0_ &= -9;
            }
            type.options_ = this.options_;
        }

        private void ensureFieldsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.fields_ = new ArrayList(this.fields_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureOneofsIsMutable() {
            if (!this.oneofs_.f11544) {
                this.oneofs_ = new C4216(this.oneofs_);
            }
            this.bitField0_ |= 4;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 8;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4533.f11855;
        }

        private C4195 internalGetFieldsFieldBuilder() {
            if (this.fieldsBuilder_ == null) {
                this.fieldsBuilder_ = new C4195(this.fields_, getParentForChildren(), isClean());
                this.fields_ = null;
            }
            return this.fieldsBuilder_;
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
                internalGetFieldsFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
            }
        }

        public C4153 addAllFields(Iterable<? extends Field> iterable) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureFieldsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.fields_);
            onChanged();
            return this;
        }

        public C4153 addAllOneofs(Iterable<String> iterable) {
            ensureOneofsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.oneofs_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4153 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C4153 addFields(Field.C4133 c4133) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4133.build());
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.add(c4133.build());
            onChanged();
            return this;
        }

        public Field.C4133 addFieldsBuilder() {
            return (Field.C4133) internalGetFieldsFieldBuilder().m8019(Field.getDefaultInstance());
        }

        public C4153 addOneofs(String str) {
            str.getClass();
            ensureOneofsIsMutable();
            this.oneofs_.m8052(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4153 addOneofsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            ensureOneofsIsMutable();
            this.oneofs_.mo8054(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4153 addOptions(Option.C4148 c4148) {
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
        public Type build() {
            Type typeBuildPartial = buildPartial();
            if (typeBuildPartial.isInitialized()) {
                return typeBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) typeBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Type buildPartial() {
            Type type = new Type(this, null);
            buildPartialRepeatedFields(type);
            if (this.bitField0_ != 0) {
                buildPartial0(type);
            }
            onBuilt();
            return type;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4153 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 == null) {
                this.fields_ = Collections.EMPTY_LIST;
            } else {
                this.fields_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -3;
            this.oneofs_ = C4216.f11382;
            C4195 c41952 = this.optionsBuilder_;
            if (c41952 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c41952.m8030();
            }
            this.bitField0_ &= -9;
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

        public C4153 clearEdition() {
            this.edition_ = Type.getDefaultInstance().getEdition();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C4153 clearFields() {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.fields_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4153 clearName() {
            this.name_ = Type.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4153 clearOneofs() {
            this.oneofs_ = C4216.f11382;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C4153 clearOptions() {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C4153 clearSourceContext() {
            this.bitField0_ &= -17;
            this.sourceContext_ = null;
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C4153 clearSyntax() {
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4533.f11855;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public Field getFields(int i) {
            C4195 c4195 = this.fieldsBuilder_;
            return c4195 == null ? this.fields_.get(i) : (Field) c4195.m8025(i, false);
        }

        public Field.C4133 getFieldsBuilder(int i) {
            return (Field.C4133) internalGetFieldsFieldBuilder().m8032(i);
        }

        public List<Field.C4133> getFieldsBuilderList() {
            return internalGetFieldsFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4534
        public int getFieldsCount() {
            C4195 c4195 = this.fieldsBuilder_;
            return c4195 == null ? this.fields_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4534
        public List<Field> getFieldsList() {
            C4195 c4195 = this.fieldsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.fields_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4534
        public InterfaceC4520 getFieldsOrBuilder(int i) {
            C4195 c4195 = this.fieldsBuilder_;
            return c4195 == null ? this.fields_.get(i) : (InterfaceC4520) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4534
        public List<? extends InterfaceC4520> getFieldsOrBuilderList() {
            C4195 c4195 = this.fieldsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.fields_);
        }

        @Override // com.google.protobuf.InterfaceC4534
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public String getOneofs(int i) {
            return this.oneofs_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC4534
        public ByteString getOneofsBytes(int i) {
            return this.oneofs_.m8056(i);
        }

        @Override // com.google.protobuf.InterfaceC4534
        public int getOneofsCount() {
            return this.oneofs_.f11383.size();
        }

        @Override // com.google.protobuf.InterfaceC4534
        public InterfaceC4209 getOneofsList() {
            this.oneofs_.m8346();
            return this.oneofs_;
        }

        @Override // com.google.protobuf.InterfaceC4534
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

        @Override // com.google.protobuf.InterfaceC4534
        public int getOptionsCount() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4534
        public List<Option> getOptionsList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.options_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4534
        public InterfaceC4208 getOptionsOrBuilder(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (InterfaceC4208) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4534
        public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC4534
        public SourceContext getSourceContext() {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                return (SourceContext) c4174.m7939();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.C4149 getSourceContextBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (SourceContext.C4149) internalGetSourceContextFieldBuilder().m7940();
        }

        @Override // com.google.protobuf.InterfaceC4534
        public InterfaceC4188 getSourceContextOrBuilder() {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                return (InterfaceC4188) c4174.m7938();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC4534
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4533.f11854;
            c4451.m8386(Type.class, C4153.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4153 mergeFrom(Type type) {
            if (type == Type.getDefaultInstance()) {
                return this;
            }
            if (!type.getName().isEmpty()) {
                this.name_ = type.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.fieldsBuilder_ == null) {
                if (!type.fields_.isEmpty()) {
                    if (this.fields_.isEmpty()) {
                        this.fields_ = type.fields_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureFieldsIsMutable();
                        this.fields_.addAll(type.fields_);
                    }
                    onChanged();
                }
            } else if (!type.fields_.isEmpty()) {
                boolean zIsEmpty = this.fieldsBuilder_.f11357.isEmpty();
                C4195 c4195 = this.fieldsBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.fieldsBuilder_ = null;
                    this.fields_ = type.fields_;
                    this.bitField0_ &= -3;
                    this.fieldsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFieldsFieldBuilder() : null;
                } else {
                    c4195.m8021(type.fields_);
                }
            }
            if (!type.oneofs_.isEmpty()) {
                if (this.oneofs_.isEmpty()) {
                    this.oneofs_ = type.oneofs_;
                    this.bitField0_ |= 4;
                } else {
                    ensureOneofsIsMutable();
                    this.oneofs_.addAll(type.oneofs_);
                }
                onChanged();
            }
            if (this.optionsBuilder_ == null) {
                if (!type.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = type.options_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(type.options_);
                    }
                    onChanged();
                }
            } else if (!type.options_.isEmpty()) {
                boolean zIsEmpty2 = this.optionsBuilder_.f11357.isEmpty();
                C4195 c41952 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = type.options_;
                    this.bitField0_ &= -9;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c41952.m8021(type.options_);
                }
            }
            if (type.hasSourceContext()) {
                mergeSourceContext(type.getSourceContext());
            }
            if (type.syntax_ != 0) {
                setSyntaxValue(type.getSyntaxValue());
            }
            if (!type.getEdition().isEmpty()) {
                this.edition_ = type.edition_;
                this.bitField0_ |= 64;
                onChanged();
            }
            mergeUnknownFields(type.getUnknownFields());
            onChanged();
            return this;
        }

        public C4153 mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                c4174.m7945(sourceContext);
            } else if ((this.bitField0_ & 16) == 0 || (sourceContext2 = this.sourceContext_) == null || sourceContext2 == SourceContext.getDefaultInstance()) {
                this.sourceContext_ = sourceContext;
            } else {
                getSourceContextBuilder().mergeFrom(sourceContext);
            }
            if (this.sourceContext_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public C4153 removeFields(int i) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.remove(i);
            onChanged();
            return this;
        }

        public C4153 removeOptions(int i) {
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

        public C4153 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4153 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4153 setFields(int i, Field.C4133 c4133) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4133.build());
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.set(i, c4133.build());
            onChanged();
            return this;
        }

        public C4153 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4153 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4153 setOneofs(int i, String str) {
            str.getClass();
            ensureOneofsIsMutable();
            this.oneofs_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4153 setOptions(int i, Option.C4148 c4148) {
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

        public C4153 setSourceContext(SourceContext.C4149 c4149) {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 == null) {
                this.sourceContext_ = c4149.build();
            } else {
                c4174.m7946(c4149.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4153 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 32;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C4153 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Type getDefaultInstanceForType() {
            return Type.getDefaultInstance();
        }

        public Field.C4133 addFieldsBuilder(int i) {
            return (Field.C4133) internalGetFieldsFieldBuilder().m8020(i, Field.getDefaultInstance());
        }

        public Option.C4148 addOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8020(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C4153(C4535 c4535) {
            this();
        }

        public /* synthetic */ C4153(InterfaceC4364 interfaceC4364, C4535 c4535) {
            this(interfaceC4364);
        }

        private C4153(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.fields_ = list;
            this.oneofs_ = C4216.f11382;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public C4153 addFields(int i, Field field) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.add(i, field);
                onChanged();
                return this;
            }
            c4195.m8018(i, field);
            return this;
        }

        public C4153 addOptions(int i, Option option) {
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

        public C4153 setFields(int i, Field field) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.set(i, field);
                onChanged();
                return this;
            }
            c4195.m8022(i, field);
            return this;
        }

        public C4153 setOptions(int i, Option option) {
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

        public C4153 setSourceContext(SourceContext sourceContext) {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                c4174.m7946(sourceContext);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4153 addFields(Field field) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.add(field);
                onChanged();
                return this;
            }
            c4195.m8017(field);
            return this;
        }

        public C4153 addOptions(Option option) {
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

        public C4153 addFields(int i, Field.C4133 c4133) {
            C4195 c4195 = this.fieldsBuilder_;
            if (c4195 == null) {
                ensureFieldsIsMutable();
                this.fields_.add(i, c4133.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4133.build());
            return this;
        }

        public C4153 addOptions(int i, Option.C4148 c4148) {
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
        public C4153 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Type) {
                return mergeFrom((Type) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4153 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                                Field field = (Field) abstractC4306.mo8274(Field.parser(), c4529);
                                C4195 c4195 = this.fieldsBuilder_;
                                if (c4195 == null) {
                                    ensureFieldsIsMutable();
                                    this.fields_.add(field);
                                } else {
                                    c4195.m8017(field);
                                }
                            } else if (iMo8264 == 26) {
                                ensureOneofsIsMutable();
                                this.oneofs_.m8052(abstractC4306.mo8265());
                            } else if (iMo8264 == 34) {
                                Option option = (Option) abstractC4306.mo8274(Option.parser(), c4529);
                                C4195 c41952 = this.optionsBuilder_;
                                if (c41952 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c41952.m8017(option);
                                }
                            } else if (iMo8264 == 42) {
                                abstractC4306.mo8275(internalGetSourceContextFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 16;
                            } else if (iMo8264 == 48) {
                                this.syntax_ = abstractC4306.mo8283();
                                this.bitField0_ |= 32;
                            } else if (iMo8264 != 58) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                this.edition_ = abstractC4306.mo8265();
                                this.bitField0_ |= 64;
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

    @Override // com.google.protobuf.InterfaceC4534
    public InterfaceC4209 getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public Type getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Type parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Type) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4153 newBuilderForType() {
        return newBuilder();
    }

    public static C4153 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Type parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Type) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Type parseFrom(ByteString byteString) {
        return (Type) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Type parseFrom(ByteString byteString, C4529 c4529) {
        return (Type) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Type parseFrom(byte[] bArr) {
        return (Type) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Type parseFrom(byte[] bArr, C4529 c4529) {
        return (Type) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Type parseFrom(InputStream inputStream) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, C4529 c4529) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    private Type(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.oneofs_ = C4216.f11382;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Type parseFrom(AbstractC4306 abstractC4306) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Type parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    public /* synthetic */ Type(GeneratedMessage.AbstractC4137 abstractC4137, C4535 c4535) {
        this(abstractC4137);
    }
}
