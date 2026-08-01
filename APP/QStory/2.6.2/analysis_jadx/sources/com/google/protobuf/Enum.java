package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.EnumValue;
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
public final class Enum extends GeneratedMessage implements InterfaceC3582 {
    private static final Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Enum");
        DEFAULT_INSTANCE = new Enum();
        PARSER = new C3586();
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

    public static final C3662 getDescriptor() {
        return AbstractC3700.f11501;
    }

    public static C3298 newBuilder(Enum r1) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(r1);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) {
        return (Enum) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3700.f11501;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public EnumValue getEnumvalue(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3582
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.InterfaceC3582
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public InterfaceC3579 getEnumvalueOrBuilder(int i) {
        return this.enumvalue_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3582
    public List<? extends InterfaceC3579> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3582
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3582
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public InterfaceC3375 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3582
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
        int size = this.enumvalue_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.enumvalue_.get(i2));
        }
        int iM7656 = iComputeStringSize + size;
        int size2 = this.options_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7656 += AbstractC3461.m7656(this.options_.get(i3));
        }
        int iComputeStringSize2 = iM7656 + size2;
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize2 += AbstractC3461.m7652(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC3461.m7645(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(6, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public InterfaceC3355 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3582
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC3582
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
        if (getEnumvalueCount() > 0) {
            iHashCode = getEnumvalueList().hashCode() + AbstractC2442.m4561(iHashCode, 37, 2, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC2442.m4561(iHashCode, 37, 3, 53);
        }
        if (hasSourceContext()) {
            iHashCode = getSourceContext().hashCode() + AbstractC2442.m4561(iHashCode, 37, 4, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4561(iHashCode, 37, 5, 53) + this.syntax_) * 37) + 6) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3700.f11500;
        c3618.m7840(Enum.class, C3298.class);
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
    public C3298 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3298(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3298 toBuilder() {
        C3586 c3586 = null;
        return this == DEFAULT_INSTANCE ? new C3298(c3586) : new C3298(c3586).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        for (int i = 0; i < this.enumvalue_.size(); i++) {
            abstractC3461.mo7662(2, this.enumvalue_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC3461.mo7662(3, this.options_.get(i2));
        }
        if ((this.bitField0_ & 1) != 0) {
            abstractC3461.mo7662(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3461.mo7664(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3461, 6, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Enum$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3298 extends GeneratedMessage.AbstractC3304 implements InterfaceC3582 {
        private int bitField0_;
        private Object edition_;
        private C3362 enumvalueBuilder_;
        private List<EnumValue> enumvalue_;
        private Object name_;
        private C3362 optionsBuilder_;
        private List<Option> options_;
        private C3341 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        private C3298() {
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
                C3341 c3341 = this.sourceContextBuilder_;
                r4.sourceContext_ = c3341 == null ? this.sourceContext_ : (SourceContext) c3341.m7397();
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
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                    this.bitField0_ &= -3;
                }
                r2.enumvalue_ = this.enumvalue_;
            } else {
                r2.enumvalue_ = c3362.m7485();
            }
            C3362 c33622 = this.optionsBuilder_;
            if (c33622 != null) {
                r2.options_ = c33622.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3700.f11501;
        }

        private C3362 internalGetEnumvalueFieldBuilder() {
            if (this.enumvalueBuilder_ == null) {
                this.enumvalueBuilder_ = new C3362(this.enumvalue_, getParentForChildren(), isClean());
                this.enumvalue_ = null;
            }
            return this.enumvalueBuilder_;
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
                internalGetEnumvalueFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
            }
        }

        public C3298 addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureEnumvalueIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.enumvalue_);
            onChanged();
            return this;
        }

        public C3298 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3298 addEnumvalue(EnumValue.C3299 c3299) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3299.build());
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.add(c3299.build());
            onChanged();
            return this;
        }

        public EnumValue.C3299 addEnumvalueBuilder() {
            return (EnumValue.C3299) internalGetEnumvalueFieldBuilder().m7473(EnumValue.getDefaultInstance());
        }

        public C3298 addOptions(Option.C3315 c3315) {
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
        public Enum build() {
            Enum enumBuildPartial = buildPartial();
            if (enumBuildPartial.isInitialized()) {
                return enumBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) enumBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Enum buildPartial() {
            Enum r0 = new Enum(this, null);
            buildPartialRepeatedFields(r0);
            if (this.bitField0_ != 0) {
                buildPartial0(r0);
            }
            onBuilt();
            return r0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3298 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 == null) {
                this.enumvalue_ = Collections.EMPTY_LIST;
            } else {
                this.enumvalue_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -3;
            C3362 c33622 = this.optionsBuilder_;
            if (c33622 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c33622.m7484();
            }
            this.bitField0_ &= -5;
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

        public C3298 clearEdition() {
            this.edition_ = Enum.getDefaultInstance().getEdition();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3298 clearEnumvalue() {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.enumvalue_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3298 clearName() {
            this.name_ = Enum.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3298 clearOptions() {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public C3298 clearSourceContext() {
            this.bitField0_ &= -9;
            this.sourceContext_ = null;
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public C3298 clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3700.f11501;
        }

        @Override // com.google.protobuf.InterfaceC3582
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3582
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3582
        public EnumValue getEnumvalue(int i) {
            C3362 c3362 = this.enumvalueBuilder_;
            return c3362 == null ? this.enumvalue_.get(i) : (EnumValue) c3362.m7479(i, false);
        }

        public EnumValue.C3299 getEnumvalueBuilder(int i) {
            return (EnumValue.C3299) internalGetEnumvalueFieldBuilder().m7486(i);
        }

        public List<EnumValue.C3299> getEnumvalueBuilderList() {
            return internalGetEnumvalueFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3582
        public int getEnumvalueCount() {
            C3362 c3362 = this.enumvalueBuilder_;
            return c3362 == null ? this.enumvalue_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3582
        public List<EnumValue> getEnumvalueList() {
            C3362 c3362 = this.enumvalueBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.enumvalue_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3582
        public InterfaceC3579 getEnumvalueOrBuilder(int i) {
            C3362 c3362 = this.enumvalueBuilder_;
            return c3362 == null ? this.enumvalue_.get(i) : (InterfaceC3579) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3582
        public List<? extends InterfaceC3579> getEnumvalueOrBuilderList() {
            C3362 c3362 = this.enumvalueBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.enumvalue_);
        }

        @Override // com.google.protobuf.InterfaceC3582
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3582
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3582
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

        @Override // com.google.protobuf.InterfaceC3582
        public int getOptionsCount() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3582
        public List<Option> getOptionsList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.options_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3582
        public InterfaceC3375 getOptionsOrBuilder(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (InterfaceC3375) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3582
        public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3582
        public SourceContext getSourceContext() {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                return (SourceContext) c3341.m7393();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.C3316 getSourceContextBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (SourceContext.C3316) internalGetSourceContextFieldBuilder().m7394();
        }

        @Override // com.google.protobuf.InterfaceC3582
        public InterfaceC3355 getSourceContextOrBuilder() {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                return (InterfaceC3355) c3341.m7392();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC3582
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3582
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC3582
        public boolean hasSourceContext() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3700.f11500;
            c3618.m7840(Enum.class, C3298.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3298 mergeFrom(Enum r4) {
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
                boolean zIsEmpty = this.enumvalueBuilder_.f11007.isEmpty();
                C3362 c3362 = this.enumvalueBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.enumvalueBuilder_ = null;
                    this.enumvalue_ = r4.enumvalue_;
                    this.bitField0_ &= -3;
                    this.enumvalueBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumvalueFieldBuilder() : null;
                } else {
                    c3362.m7475(r4.enumvalue_);
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
                boolean zIsEmpty2 = this.optionsBuilder_.f11007.isEmpty();
                C3362 c33622 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = r4.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c33622.m7475(r4.options_);
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

        public C3298 mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                c3341.m7399(sourceContext);
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

        public C3298 removeEnumvalue(int i) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.remove(i);
            onChanged();
            return this;
        }

        public C3298 removeOptions(int i) {
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

        public C3298 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3298 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public C3298 setEnumvalue(int i, EnumValue.C3299 c3299) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3299.build());
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.set(i, c3299.build());
            onChanged();
            return this;
        }

        public C3298 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3298 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3298 setOptions(int i, Option.C3315 c3315) {
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

        public C3298 setSourceContext(SourceContext.C3316 c3316) {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 == null) {
                this.sourceContext_ = c3316.build();
            } else {
                c3341.m7400(c3316.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3298 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C3298 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Enum getDefaultInstanceForType() {
            return Enum.getDefaultInstance();
        }

        public EnumValue.C3299 addEnumvalueBuilder(int i) {
            return (EnumValue.C3299) internalGetEnumvalueFieldBuilder().m7474(i, EnumValue.getDefaultInstance());
        }

        public Option.C3315 addOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7474(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3298(C3586 c3586) {
            this();
        }

        public /* synthetic */ C3298(InterfaceC3531 interfaceC3531, C3586 c3586) {
            this(interfaceC3531);
        }

        private C3298(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.enumvalue_ = list;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public C3298 addEnumvalue(int i, EnumValue enumValue) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, enumValue);
                onChanged();
                return this;
            }
            c3362.m7472(i, enumValue);
            return this;
        }

        public C3298 addOptions(int i, Option option) {
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

        public C3298 setEnumvalue(int i, EnumValue enumValue) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i, enumValue);
                onChanged();
                return this;
            }
            c3362.m7476(i, enumValue);
            return this;
        }

        public C3298 setOptions(int i, Option option) {
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

        public C3298 setSourceContext(SourceContext sourceContext) {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                c3341.m7400(sourceContext);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3298 addEnumvalue(EnumValue enumValue) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(enumValue);
                onChanged();
                return this;
            }
            c3362.m7471(enumValue);
            return this;
        }

        public C3298 addOptions(Option option) {
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

        public C3298 addEnumvalue(int i, EnumValue.C3299 c3299) {
            C3362 c3362 = this.enumvalueBuilder_;
            if (c3362 == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i, c3299.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3299.build());
            return this;
        }

        public C3298 addOptions(int i, Option.C3315 c3315) {
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
        public C3298 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Enum) {
                return mergeFrom((Enum) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3298 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                                EnumValue enumValue = (EnumValue) abstractC3473.mo7728(EnumValue.parser(), c3696);
                                C3362 c3362 = this.enumvalueBuilder_;
                                if (c3362 == null) {
                                    ensureEnumvalueIsMutable();
                                    this.enumvalue_.add(enumValue);
                                } else {
                                    c3362.m7471(enumValue);
                                }
                            } else if (iMo7718 == 26) {
                                Option option = (Option) abstractC3473.mo7728(Option.parser(), c3696);
                                C3362 c33622 = this.optionsBuilder_;
                                if (c33622 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c33622.m7471(option);
                                }
                            } else if (iMo7718 == 34) {
                                abstractC3473.mo7729(internalGetSourceContextFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 8;
                            } else if (iMo7718 == 40) {
                                this.syntax_ = abstractC3473.mo7737();
                                this.bitField0_ |= 16;
                            } else if (iMo7718 != 50) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                this.edition_ = abstractC3473.mo7719();
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Enum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3298 newBuilderForType() {
        return newBuilder();
    }

    public static C3298 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Enum) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Enum parseFrom(ByteString byteString) {
        return (Enum) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Enum parseFrom(ByteString byteString, C3696 c3696) {
        return (Enum) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Enum parseFrom(byte[] bArr) {
        return (Enum) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Enum parseFrom(byte[] bArr, C3696 c3696) {
        return (Enum) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    private Enum(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Enum parseFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, C3696 c3696) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public /* synthetic */ Enum(GeneratedMessage.AbstractC3304 abstractC3304, C3586 c3586) {
        this(abstractC3304);
    }

    public static Enum parseFrom(AbstractC3473 abstractC3473) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Enum parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
