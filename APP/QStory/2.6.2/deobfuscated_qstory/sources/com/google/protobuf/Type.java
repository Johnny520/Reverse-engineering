package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.Field;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Type extends GeneratedMessage implements InterfaceC3701 {
    private static final Type DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 7;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static final InterfaceC3374 PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object edition_;
    private List<Field> fields_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private C3383 oneofs_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Type");
        DEFAULT_INSTANCE = new Type();
        PARSER = new C3702();
    }

    private Type() {
        this.name_ = "";
        C3383 c3383 = C3383.f11032;
        this.oneofs_ = c3383;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.fields_ = list;
        this.oneofs_ = c3383;
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

    public static final C3662 getDescriptor() {
        return AbstractC3700.f11505;
    }

    public static C3320 newBuilder(Type type) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream) {
        return (Type) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) {
        return (Type) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3700.f11505;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public Field getFields(int i) {
        return this.fields_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3701
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // com.google.protobuf.InterfaceC3701
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public InterfaceC3687 getFieldsOrBuilder(int i) {
        return this.fields_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3701
    public List<? extends InterfaceC3687> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public String getOneofs(int i) {
        return this.oneofs_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3701
    public ByteString getOneofsBytes(int i) {
        return this.oneofs_.m7510(i);
    }

    @Override // com.google.protobuf.InterfaceC3701
    public int getOneofsCount() {
        return this.oneofs_.f11033.size();
    }

    @Override // com.google.protobuf.InterfaceC3701
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3701
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3701
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public InterfaceC3375 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3701
    public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
        return this.options_;
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
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        int size = this.fields_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.fields_.get(i2));
        }
        int i3 = iComputeStringSize + size;
        int iComputeStringSizeNoTag = 0;
        for (int i4 = 0; i4 < this.oneofs_.f11033.size(); i4++) {
            iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.oneofs_.f11033.get(i4));
        }
        int size2 = getOneofsList().size() + i3 + iComputeStringSizeNoTag;
        int size3 = this.options_.size();
        for (int i5 = 0; i5 < size3; i5++) {
            size2 += AbstractC3461.m7656(this.options_.get(i5));
        }
        int iComputeStringSize2 = size2 + size3;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize2 += AbstractC3461.m7652(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC3461.m7645(6, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(7, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public InterfaceC3355 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC3701
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (getFieldsCount() > 0) {
            iHashCode = getFieldsList().hashCode() + AbstractC2442.m4561(iHashCode, 37, 2, 53);
        }
        if (getOneofsCount() > 0) {
            iHashCode = getOneofsList().hashCode() + AbstractC2442.m4561(iHashCode, 37, 3, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC2442.m4561(iHashCode, 37, 4, 53);
        }
        if (hasSourceContext()) {
            iHashCode = getSourceContext().hashCode() + AbstractC2442.m4561(iHashCode, 37, 5, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4561(iHashCode, 37, 6, 53) + this.syntax_) * 37) + 7) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3700.f11504;
        c3618.m7840(Type.class, C3320.class);
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
    public C3320 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3320(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3320 toBuilder() {
        C3702 c3702 = null;
        return this == DEFAULT_INSTANCE ? new C3320(c3702) : new C3320(c3702).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        for (int i = 0; i < this.fields_.size(); i++) {
            abstractC3461.mo7662(2, this.fields_.get(i));
        }
        for (int i2 = 0; i2 < this.oneofs_.f11033.size(); i2++) {
            GeneratedMessage.writeString(abstractC3461, 3, this.oneofs_.f11033.get(i2));
        }
        for (int i3 = 0; i3 < this.options_.size(); i3++) {
            abstractC3461.mo7662(4, this.options_.get(i3));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7662(5, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3461.mo7664(6, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3461, 7, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Type$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3320 extends GeneratedMessage.AbstractC3304 implements InterfaceC3701 {
        private int bitField0_;
        private Object edition_;
        private C3362 fieldsBuilder_;
        private List<Field> fields_;
        private Object name_;
        private C3383 oneofs_;
        private C3362 optionsBuilder_;
        private List<Option> options_;
        private C3341 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        private C3320() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.fields_ = list;
            this.oneofs_ = C3383.f11032;
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
                this.oneofs_.m7800();
                type.oneofs_ = this.oneofs_;
            }
            if ((i2 & 16) != 0) {
                C3341 c3341 = this.sourceContextBuilder_;
                type.sourceContext_ = c3341 == null ? this.sourceContext_ : (SourceContext) c3341.m7397();
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
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.fields_ = Collections.unmodifiableList(this.fields_);
                    this.bitField0_ &= -3;
                }
                type.fields_ = this.fields_;
            } else {
                type.fields_ = c3362.m7485();
            }
            C3362 c33622 = this.optionsBuilder_;
            if (c33622 != null) {
                type.options_ = c33622.m7485();
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
            if (!this.oneofs_.f11194) {
                this.oneofs_ = new C3383(this.oneofs_);
            }
            this.bitField0_ |= 4;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 8;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3700.f11505;
        }

        private C3362 internalGetFieldsFieldBuilder() {
            if (this.fieldsBuilder_ == null) {
                this.fieldsBuilder_ = new C3362(this.fields_, getParentForChildren(), isClean());
                this.fields_ = null;
            }
            return this.fieldsBuilder_;
        }

        private C3362 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3362(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private C3341 internalGetSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new C3341(getSourceContext(), getParentForChildren(), isClean());
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

        public C3320 addAllFields(Iterable<? extends Field> iterable) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureFieldsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.fields_);
            onChanged();
            return this;
        }

        public C3320 addAllOneofs(Iterable<String> iterable) {
            ensureOneofsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.oneofs_);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3320 addAllOptions(Iterable<? extends Option> iterable) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public C3320 addFields(Field.C3300 c3300) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3300.build());
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.add(c3300.build());
            onChanged();
            return this;
        }

        public Field.C3300 addFieldsBuilder() {
            return (Field.C3300) internalGetFieldsFieldBuilder().m7473(Field.getDefaultInstance());
        }

        public C3320 addOneofs(String str) {
            str.getClass();
            ensureOneofsIsMutable();
            this.oneofs_.m7506(str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3320 addOneofsBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            ensureOneofsIsMutable();
            this.oneofs_.mo7508(byteString);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3320 addOptions(Option.C3315 c3315) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3315.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.add(c3315.build());
            onChanged();
            return this;
        }

        public Option.C3315 addOptionsBuilder() {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7473(Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Type build() {
            Type typeBuildPartial = buildPartial();
            if (typeBuildPartial.isInitialized()) {
                return typeBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) typeBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Type buildPartial() {
            Type type = new Type(this, null);
            buildPartialRepeatedFields(type);
            if (this.bitField0_ != 0) {
                buildPartial0(type);
            }
            onBuilt();
            return type;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3320 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 == null) {
                this.fields_ = Collections.EMPTY_LIST;
            } else {
                this.fields_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -3;
            this.oneofs_ = C3383.f11032;
            C3362 c33622 = this.optionsBuilder_;
            if (c33622 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -9;
            this.sourceContext_ = null;
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.sourceContextBuilder_ = null;
            }
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        public C3320 clearEdition() {
            this.edition_ = Type.getDefaultInstance().getEdition();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public C3320 clearFields() {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.fields_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3320 clearName() {
            this.name_ = Type.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3320 clearOneofs() {
            this.oneofs_ = C3383.f11032;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3320 clearOptions() {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public C3320 clearSourceContext() {
            this.bitField0_ &= -17;
            this.sourceContext_ = null;
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3320 clearSyntax() {
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3700.f11505;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public Field getFields(int i) {
            C3362 c3362 = this.fieldsBuilder_;
            return c3362 == null ? this.fields_.get(i) : (Field) c3362.m7479(i, false);
        }

        public Field.C3300 getFieldsBuilder(int i) {
            return (Field.C3300) internalGetFieldsFieldBuilder().m7486(i);
        }

        public List<Field.C3300> getFieldsBuilderList() {
            return internalGetFieldsFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public int getFieldsCount() {
            C3362 c3362 = this.fieldsBuilder_;
            return c3362 == null ? this.fields_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public List<Field> getFieldsList() {
            C3362 c3362 = this.fieldsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.fields_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public InterfaceC3687 getFieldsOrBuilder(int i) {
            C3362 c3362 = this.fieldsBuilder_;
            return c3362 == null ? this.fields_.get(i) : (InterfaceC3687) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3701
        public List<? extends InterfaceC3687> getFieldsOrBuilderList() {
            C3362 c3362 = this.fieldsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.fields_);
        }

        @Override // com.google.protobuf.InterfaceC3701
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public String getOneofs(int i) {
            return this.oneofs_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3701
        public ByteString getOneofsBytes(int i) {
            return this.oneofs_.m7510(i);
        }

        @Override // com.google.protobuf.InterfaceC3701
        public int getOneofsCount() {
            return this.oneofs_.f11033.size();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public InterfaceC3376 getOneofsList() {
            this.oneofs_.m7800();
            return this.oneofs_;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public Option getOptions(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (Option) c3362.m7479(i, false);
        }

        public Option.C3315 getOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7486(i);
        }

        public List<Option.C3315> getOptionsBuilderList() {
            return internalGetOptionsFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public int getOptionsCount() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public List<Option> getOptionsList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.options_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public InterfaceC3375 getOptionsOrBuilder(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (InterfaceC3375) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3701
        public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3701
        public SourceContext getSourceContext() {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                return (SourceContext) c3341.m7393();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.C3316 getSourceContextBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (SourceContext.C3316) internalGetSourceContextFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3701
        public InterfaceC3355 getSourceContextOrBuilder() {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                return (InterfaceC3355) c3341.m7392();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC3701
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3700.f11504;
            c3618.m7840(Type.class, C3320.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3320 mergeFrom(Type type) {
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
                boolean zIsEmpty = this.fieldsBuilder_.f11007.isEmpty();
                C3362 c3362 = this.fieldsBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.fieldsBuilder_ = null;
                    this.fields_ = type.fields_;
                    this.bitField0_ &= -3;
                    this.fieldsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFieldsFieldBuilder() : null;
                } else {
                    c3362.m7475(type.fields_);
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
                boolean zIsEmpty2 = this.optionsBuilder_.f11007.isEmpty();
                C3362 c33622 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = type.options_;
                    this.bitField0_ &= -9;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c33622.m7475(type.options_);
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

        public C3320 mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                c3341.m7399(sourceContext);
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

        public C3320 removeFields(int i) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.remove(i);
            onChanged();
            return this;
        }

        public C3320 removeOptions(int i) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i);
            onChanged();
            return this;
        }

        public C3320 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3320 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3320 setFields(int i, Field.C3300 c3300) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3300.build());
                return this;
            }
            ensureFieldsIsMutable();
            this.fields_.set(i, c3300.build());
            onChanged();
            return this;
        }

        public C3320 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3320 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3320 setOneofs(int i, String str) {
            str.getClass();
            ensureOneofsIsMutable();
            this.oneofs_.set(i, str);
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3320 setOptions(int i, Option.C3315 c3315) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3315.build());
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.set(i, c3315.build());
            onChanged();
            return this;
        }

        public C3320 setSourceContext(SourceContext.C3316 c3316) {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 == null) {
                this.sourceContext_ = c3316.build();
            } else {
                c3341.m7400(c3316.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3320 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 32;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C3320 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Type getDefaultInstanceForType() {
            return Type.getDefaultInstance();
        }

        public Field.C3300 addFieldsBuilder(int i) {
            return (Field.C3300) internalGetFieldsFieldBuilder().m7474(i, Field.getDefaultInstance());
        }

        public Option.C3315 addOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7474(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3320(C3702 c3702) {
            this();
        }

        public /* synthetic */ C3320(InterfaceC3531 interfaceC3531, C3702 c3702) {
            this(interfaceC3531);
        }

        private C3320(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.fields_ = list;
            this.oneofs_ = C3383.f11032;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public C3320 addFields(int i, Field field) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.add(i, field);
                onChanged();
                return this;
            }
            c3362.m7472(i, field);
            return this;
        }

        public C3320 addOptions(int i, Option option) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i, option);
                onChanged();
                return this;
            }
            c3362.m7472(i, option);
            return this;
        }

        public C3320 setFields(int i, Field field) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.set(i, field);
                onChanged();
                return this;
            }
            c3362.m7476(i, field);
            return this;
        }

        public C3320 setOptions(int i, Option option) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.set(i, option);
                onChanged();
                return this;
            }
            c3362.m7476(i, option);
            return this;
        }

        public C3320 setSourceContext(SourceContext sourceContext) {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                c3341.m7400(sourceContext);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3320 addFields(Field field) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 == null) {
                field.getClass();
                ensureFieldsIsMutable();
                this.fields_.add(field);
                onChanged();
                return this;
            }
            c3362.m7471(field);
            return this;
        }

        public C3320 addOptions(Option option) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(option);
                onChanged();
                return this;
            }
            c3362.m7471(option);
            return this;
        }

        public C3320 addFields(int i, Field.C3300 c3300) {
            C3362 c3362 = this.fieldsBuilder_;
            if (c3362 == null) {
                ensureFieldsIsMutable();
                this.fields_.add(i, c3300.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3300.build());
            return this;
        }

        public C3320 addOptions(int i, Option.C3315 c3315) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                ensureOptionsIsMutable();
                this.options_.add(i, c3315.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3315.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3320 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Type) {
                return mergeFrom((Type) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3320 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 == 10) {
                                this.name_ = abstractC3473.mo7719();
                                this.bitField0_ |= 1;
                            } else if (iMo7718 == 18) {
                                Field field = (Field) abstractC3473.mo7728(Field.parser(), c3696);
                                C3362 c3362 = this.fieldsBuilder_;
                                if (c3362 == null) {
                                    ensureFieldsIsMutable();
                                    this.fields_.add(field);
                                } else {
                                    c3362.m7471(field);
                                }
                            } else if (iMo7718 == 26) {
                                ensureOneofsIsMutable();
                                this.oneofs_.m7506(abstractC3473.mo7719());
                            } else if (iMo7718 == 34) {
                                Option option = (Option) abstractC3473.mo7728(Option.parser(), c3696);
                                C3362 c33622 = this.optionsBuilder_;
                                if (c33622 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c33622.m7471(option);
                                }
                            } else if (iMo7718 == 42) {
                                abstractC3473.mo7729(internalGetSourceContextFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 16;
                            } else if (iMo7718 == 48) {
                                this.syntax_ = abstractC3473.mo7737();
                                this.bitField0_ |= 32;
                            } else if (iMo7718 != 58) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                this.edition_ = abstractC3473.mo7719();
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

    @Override // com.google.protobuf.InterfaceC3701
    public InterfaceC3376 getOneofsList() {
        return this.oneofs_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Type getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Type parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Type) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3320 newBuilderForType() {
        return newBuilder();
    }

    public static C3320 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Type parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Type) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Type parseFrom(ByteString byteString) {
        return (Type) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Type parseFrom(ByteString byteString, C3696 c3696) {
        return (Type) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Type parseFrom(byte[] bArr) {
        return (Type) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Type parseFrom(byte[] bArr, C3696 c3696) {
        return (Type) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Type parseFrom(InputStream inputStream) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, C3696 c3696) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    private Type(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.oneofs_ = C3383.f11032;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Type parseFrom(AbstractC3473 abstractC3473) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Type parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Type) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    public /* synthetic */ Type(GeneratedMessage.AbstractC3304 abstractC3304, C3702 c3702) {
        this(abstractC3304);
    }
}
