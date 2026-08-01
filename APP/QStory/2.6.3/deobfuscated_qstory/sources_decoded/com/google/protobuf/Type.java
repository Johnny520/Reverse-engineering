package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
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
public final class Type extends GeneratedMessage implements InterfaceC3702 {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static final InterfaceC3375 PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object edition_;
    private List<Field> fields_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private C3384 oneofs_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Type");
        DEFAULT_INSTANCE = new Type();
        PARSER = new C3703();
    }

    private Type() {
        this.name_ = "";
        C3384 c3384 = C3384.f11037;
        this.oneofs_ = c3384;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.fields_ = list;
        this.oneofs_ = c3384;
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

    public static final C3663 getDescriptor() {
        return AbstractC3701.f11510;
    }

    public static C3321 newBuilder(Type type) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream) {
        return (Type) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) {
        return (Type) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3701.f11510;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public Field getFields(int i) {
        return this.fields_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3702
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.InterfaceC3702
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public InterfaceC3688 getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3702
    public List<? extends InterfaceC3688> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3702
    public ByteString getOneofsBytes(int i) {
        return this.oneofs_.m7497(i);
    }

    @Override // com.google.protobuf.InterfaceC3702
    public int getOneofsCount() {
        return this.oneofs_.f11038.size();
    }

    @Override // com.google.protobuf.InterfaceC3702
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3702
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3702
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public InterfaceC3376 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3702
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
        int size = this.fields_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.fields_.get(i2));
        }
        int i3 = iComputeStringSize + size;
        int iComputeStringSizeNoTag = 0;
        for (int i4 = 0; i4 < this.oneofs_.f11038.size(); i4++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.oneofs_.f11038.get(i4));
        }
        int size2 = getOneofsList().size() + i3 + iComputeStringSizeNoTag;
        int size3 = this.options_.size();
        for (int i5 = 0; i5 < size3; i5++) {
            size2 += AbstractC3462.m7643(this.options_.get(i5));
        }
        int iComputeStringSize2 = size2 + size3;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize2 += AbstractC3462.m7639(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC3462.m7632(6, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(7, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public InterfaceC3356 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3702
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC3702
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
        if (getFieldsCount() > 0) {
            iHashCode = getFieldsList().hashCode() + AbstractC2442.m4571(iHashCode, 37, 2, 53);
        }
        if (getOneofsCount() > 0) {
            iHashCode = getOneofsList().hashCode() + AbstractC2442.m4571(iHashCode, 37, 3, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC2442.m4571(iHashCode, 37, 4, 53);
        }
        if (hasSourceContext()) {
            iHashCode = getSourceContext().hashCode() + AbstractC2442.m4571(iHashCode, 37, 5, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4571(iHashCode, 37, 6, 53) + this.syntax_) * 37) + 7) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3701.f11509;
        c3619.m7827(Type.class, C3321.class);
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
    public C3321 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3321(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3321 toBuilder() {
        C3703 c3703 = null;
        return this == DEFAULT_INSTANCE ? new C3321(c3703) : new C3321(c3703).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        for (int i = 0; i < this.fields_.size(); i++) {
            abstractC3462.mo7649(2, this.fields_.get(i));
        }
        for (int i2 = 0; i2 < this.oneofs_.f11038.size(); i2++) {
            GeneratedMessage.writeString(abstractC3462, 3, this.oneofs_.f11038.get(i2));
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            abstractC3462.mo7649(4, this.options_.get(i3));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3462.mo7649(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3462.mo7651(6, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3462, 7, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Type$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3321 extends GeneratedMessage.AbstractC3305 implements InterfaceC3702 {
        private int bitField0_;
        private Object edition_;
        private C3363 fieldsBuilder_;
        private List<Field> fields_;
        private Object name_;
        private C3384 oneofs_;
        private C3363 optionsBuilder_;
        private List<Option> options_;
        private C3342 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        private C3321() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.fields_ = list;
            this.oneofs_ = C3384.f11037;
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
                this.oneofs_.m7787();
                type.oneofs_ = this.oneofs_;
            }
            if ((i2 & 16) != 0) {
                C3342 c3342 = this.sourceContextBuilder_;
                type.sourceContext_ = c3342 == null ? this.sourceContext_ : (SourceContext) c3342.m7384();
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
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.fields_ = Collections.unmodifiableList(this.fields_);
                    this.bitField0_ &= -3;
                }
                type.fields_ = this.fields_;
            } else {
                type.fields_ = c3363.m7472();
            }
            C3363 c33632 = this.optionsBuilder_;
            if (c33632 != null) {
                type.options_ = c33632.m7472();
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
            if (!this.oneofs_.f11199) {
                this.oneofs_ = new C3384(this.oneofs_);
            }
            this.bitField0_ |= 4;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 8;
            }
        }

        public static final C3663 getDescriptor() {
            return AbstractC3701.f11510;
        }

        private C3363 internalGetFieldsFieldBuilder() {
            if (this.fieldsBuilder_ == null) {
                this.fieldsBuilder_ = new C3363(this.fields_, getParentForChildren(), isClean());
                this.fields_ = null;
            }
            return this.fieldsBuilder_;
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
                internalGetFieldsFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
            }
        }

        public C3321 addAllFields(Iterable<? extends Field> iterable) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureFieldsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.fields_);
            onChanged();
            return this;
        }

        public C3321 addAllOneofs(Iterable<String> iterable) {
            ensureOneofsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.oneofs_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3321 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3321 addFields(Field.C3301 c3301) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3301.build());
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.add(c3301.build());
            onChanged();
            return this;
        }

        public Field.C3301 addFieldsBuilder() {
            return (Field.C3301) internalGetFieldsFieldBuilder().m7460(Field.getDefaultInstance());
        }

        public C3321 addOneofs(String str) {
            str.getClass();
            ensureOneofsIsMutable();
            this.oneofs_.m7493(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3321 addOneofsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            ensureOneofsIsMutable();
            this.oneofs_.mo7495(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3321 addOptions(Option.C3316 c3316) {
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
        public Type build() {
            Type typeBuildPartial = buildPartial();
            if (typeBuildPartial.isInitialized()) {
                return typeBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) typeBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Type buildPartial() {
            Type type = new Type(this, null);
            buildPartialRepeatedFields(type);
            if (this.bitField0_ != 0) {
                buildPartial0(type);
            }
            onBuilt();
            return type;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3321 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 == null) {
                this.fields_ = Collections.EMPTY_LIST;
            } else {
                this.fields_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -3;
            this.oneofs_ = C3384.f11037;
            C3363 c33632 = this.optionsBuilder_;
            if (c33632 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c33632.m7471();
            }
            this.bitField0_ &= -9;
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

        public C3321 clearEdition() {
            this.edition_ = Type.getDefaultInstance().getEdition();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C3321 clearFields() {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.fields_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3321 clearName() {
            this.name_ = Type.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3321 clearOneofs() {
            this.oneofs_ = C3384.f11037;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3321 clearOptions() {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3321 clearSourceContext() {
            this.bitField0_ &= -17;
            this.sourceContext_ = null;
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3321 clearSyntax() {
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3701.f11510;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public Field getFields(int i) {
            C3363 c3363 = this.fieldsBuilder_;
            return c3363 == null ? this.fields_.get(i) : (Field) c3363.m7466(i, false);
        }

        public Field.C3301 getFieldsBuilder(int i) {
            return (Field.C3301) internalGetFieldsFieldBuilder().m7473(i);
        }

        public List<Field.C3301> getFieldsBuilderList() {
            return internalGetFieldsFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3702
        public int getFieldsCount() {
            C3363 c3363 = this.fieldsBuilder_;
            return c3363 == null ? this.fields_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3702
        public List<Field> getFieldsList() {
            C3363 c3363 = this.fieldsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.fields_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3702
        public InterfaceC3688 getFieldsOrBuilder(int i) {
            C3363 c3363 = this.fieldsBuilder_;
            return c3363 == null ? this.fields_.get(i) : (InterfaceC3688) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3702
        public List<? extends InterfaceC3688> getFieldsOrBuilderList() {
            C3363 c3363 = this.fieldsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.fields_);
        }

        @Override // com.google.protobuf.InterfaceC3702
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public String getOneofs(int i) {
            return this.oneofs_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3702
        public ByteString getOneofsBytes(int i) {
            return this.oneofs_.m7497(i);
        }

        @Override // com.google.protobuf.InterfaceC3702
        public int getOneofsCount() {
            return this.oneofs_.f11038.size();
        }

        @Override // com.google.protobuf.InterfaceC3702
        public InterfaceC3377 getOneofsList() {
            this.oneofs_.m7787();
            return this.oneofs_;
        }

        @Override // com.google.protobuf.InterfaceC3702
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

        @Override // com.google.protobuf.InterfaceC3702
        public int getOptionsCount() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3702
        public List<Option> getOptionsList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.options_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3702
        public InterfaceC3376 getOptionsOrBuilder(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (InterfaceC3376) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3702
        public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3702
        public SourceContext getSourceContext() {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                return (SourceContext) c3342.m7380();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.C3317 getSourceContextBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (SourceContext.C3317) internalGetSourceContextFieldBuilder().m7381();
        }

        @Override // com.google.protobuf.InterfaceC3702
        public InterfaceC3356 getSourceContextOrBuilder() {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                return (InterfaceC3356) c3342.m7379();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC3702
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3701.f11509;
            c3619.m7827(Type.class, C3321.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3321 mergeFrom(Type type) {
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
                boolean zIsEmpty = this.fieldsBuilder_.f11012.isEmpty();
                C3363 c3363 = this.fieldsBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.fieldsBuilder_ = null;
                    this.fields_ = type.fields_;
                    this.bitField0_ &= -3;
                    this.fieldsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFieldsFieldBuilder() : null;
                } else {
                    c3363.m7462(type.fields_);
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
                boolean zIsEmpty2 = this.optionsBuilder_.f11012.isEmpty();
                C3363 c33632 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = type.options_;
                    this.bitField0_ &= -9;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c33632.m7462(type.options_);
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

        public C3321 mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                c3342.m7386(sourceContext);
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

        public C3321 removeFields(int i) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.remove(i);
            onChanged();
            return this;
        }

        public C3321 removeOptions(int i) {
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

        public C3321 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3321 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3321 setFields(int i, Field.C3301 c3301) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3301.build());
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.set(i, c3301.build());
            onChanged();
            return this;
        }

        public C3321 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3321 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3321 setOneofs(int i, String str) {
            str.getClass();
            ensureOneofsIsMutable();
            this.oneofs_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3321 setOptions(int i, Option.C3316 c3316) {
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

        public C3321 setSourceContext(SourceContext.C3317 c3317) {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 == null) {
                this.sourceContext_ = c3317.build();
            } else {
                c3342.m7387(c3317.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3321 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 32;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C3321 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Type getDefaultInstanceForType() {
            return Type.getDefaultInstance();
        }

        public Field.C3301 addFieldsBuilder(int i) {
            return (Field.C3301) internalGetFieldsFieldBuilder().m7461(i, Field.getDefaultInstance());
        }

        public Option.C3316 addOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7461(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3321(C3703 c3703) {
            this();
        }

        public /* synthetic */ C3321(InterfaceC3532 interfaceC3532, C3703 c3703) {
            this(interfaceC3532);
        }

        private C3321(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.fields_ = list;
            this.oneofs_ = C3384.f11037;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public C3321 addFields(int i, Field field) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.add(i, field);
                onChanged();
                return this;
            }
            c3363.m7459(i, field);
            return this;
        }

        public C3321 addOptions(int i, Option option) {
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

        public C3321 setFields(int i, Field field) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.set(i, field);
                onChanged();
                return this;
            }
            c3363.m7463(i, field);
            return this;
        }

        public C3321 setOptions(int i, Option option) {
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

        public C3321 setSourceContext(SourceContext sourceContext) {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                c3342.m7387(sourceContext);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3321 addFields(Field field) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.add(field);
                onChanged();
                return this;
            }
            c3363.m7458(field);
            return this;
        }

        public C3321 addOptions(Option option) {
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

        public C3321 addFields(int i, Field.C3301 c3301) {
            C3363 c3363 = this.fieldsBuilder_;
            if (c3363 == null) {
                ensureFieldsIsMutable();
                this.fields_.add(i, c3301.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3301.build());
            return this;
        }

        public C3321 addOptions(int i, Option.C3316 c3316) {
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
        public C3321 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Type) {
                return mergeFrom((Type) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3321 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
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
                                Field field = (Field) abstractC3474.mo7715(Field.parser(), c3697);
                                C3363 c3363 = this.fieldsBuilder_;
                                if (c3363 == null) {
                                    ensureFieldsIsMutable();
                                    this.fields_.add(field);
                                } else {
                                    c3363.m7458(field);
                                }
                            } else if (iMo7705 == 26) {
                                ensureOneofsIsMutable();
                                this.oneofs_.m7493(abstractC3474.mo7706());
                            } else if (iMo7705 == 34) {
                                Option option = (Option) abstractC3474.mo7715(Option.parser(), c3697);
                                C3363 c33632 = this.optionsBuilder_;
                                if (c33632 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c33632.m7458(option);
                                }
                            } else if (iMo7705 == 42) {
                                abstractC3474.mo7716(internalGetSourceContextFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 16;
                            } else if (iMo7705 == 48) {
                                this.syntax_ = abstractC3474.mo7724();
                                this.bitField0_ |= 32;
                            } else if (iMo7705 != 58) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                this.edition_ = abstractC3474.mo7706();
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

    @Override // com.google.protobuf.InterfaceC3702
    public InterfaceC3377 getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Type getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Type parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Type) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3321 newBuilderForType() {
        return newBuilder();
    }

    public static C3321 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Type parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Type) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Type parseFrom(ByteString byteString) {
        return (Type) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Type parseFrom(ByteString byteString, C3697 c3697) {
        return (Type) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Type parseFrom(byte[] bArr) {
        return (Type) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Type parseFrom(byte[] bArr, C3697 c3697) {
        return (Type) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Type parseFrom(InputStream inputStream) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, C3697 c3697) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    private Type(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.oneofs_ = C3384.f11037;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Type parseFrom(AbstractC3474 abstractC3474) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Type parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    public /* synthetic */ Type(GeneratedMessage.AbstractC3305 abstractC3305, C3703 c3703) {
        this(abstractC3305);
    }
}
