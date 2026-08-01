package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option;
import com.google.protobuf.SourceContext;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Api extends GeneratedMessage implements InterfaceC4374 {
    private static final Api DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 8;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC4207 PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object edition_;
    private byte memoizedIsInitialized;
    private List<Method> methods_;
    private List<Mixin> mixins_;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private volatile Object version_;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Api");
        DEFAULT_INSTANCE = new Api();
        PARSER = new C4382();
    }

    private Api() {
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.methods_ = list;
        this.options_ = list;
        this.version_ = "";
        this.mixins_ = list;
        this.syntax_ = 0;
        this.edition_ = "";
    }

    public static /* synthetic */ int access$1176(Api api, int i) {
        int i2 = i | api.bitField0_;
        api.bitField0_ = i2;
        return i2;
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4373.f11535;
    }

    public static C4091 newBuilder(Api api) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return (Api) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Api)) {
            return super.equals(obj);
        }
        Api api = (Api) obj;
        if (getName().equals(api.getName()) && getMethodsList().equals(api.getMethodsList()) && getOptionsList().equals(api.getOptionsList()) && getVersion().equals(api.getVersion()) && hasSourceContext() == api.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(api.getSourceContext())) && getMixinsList().equals(api.getMixinsList()) && this.syntax_ == api.syntax_ && getEdition().equals(api.getEdition()) && getUnknownFields().equals(api.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4373.f11535;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public Method getMethods(int i) {
        return this.methods_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4374
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.InterfaceC4374
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public InterfaceC4265 getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4374
    public List<? extends InterfaceC4265> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4374
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.InterfaceC4374
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public InterfaceC4199 getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4374
    public List<? extends InterfaceC4199> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4374
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC4374
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public InterfaceC4208 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4374
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
        int size = this.methods_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.methods_.get(i2));
        }
        int iM8202 = iComputeStringSize + size;
        int size2 = this.options_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM8202 += AbstractC4294.m8202(this.options_.get(i3));
        }
        int iM82022 = iM8202 + size2;
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            iM82022 += GeneratedMessage.computeStringSize(4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            iM82022 += AbstractC4294.m8198(5, getSourceContext());
        }
        int size3 = this.mixins_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM82022 += AbstractC4294.m8202(this.mixins_.get(i4));
        }
        int iComputeStringSize2 = iM82022 + size3;
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC4294.m8191(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(8, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public InterfaceC4188 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4374
    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4374
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
        if (getMethodsCount() > 0) {
            iHashCode = getMethodsList().hashCode() + AbstractC3275.m5131(iHashCode, 37, 2, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC3275.m5131(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = getVersion().hashCode() + AbstractC3275.m5131(iHashCode, 37, 4, 53);
        if (hasSourceContext()) {
            iHashCode2 = getSourceContext().hashCode() + AbstractC3275.m5131(iHashCode2, 37, 5, 53);
        }
        if (getMixinsCount() > 0) {
            iHashCode2 = getMixinsList().hashCode() + AbstractC3275.m5131(iHashCode2, 37, 6, 53);
        }
        int iHashCode3 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC3275.m5131(iHashCode2, 37, 7, 53) + this.syntax_) * 37) + 8) * 53)) * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4373.f11534;
        c4451.m8386(Api.class, C4091.class);
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
    public C4091 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4091(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4091 toBuilder() {
        C4382 c4382 = null;
        return this == DEFAULT_INSTANCE ? new C4091(c4382) : new C4091(c4382).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        for (int i = 0; i < this.methods_.size(); i++) {
            abstractC4294.mo8208(2, this.methods_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC4294.mo8208(3, this.options_.get(i2));
        }
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            GeneratedMessage.writeString(abstractC4294, 4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            abstractC4294.mo8208(5, getSourceContext());
        }
        for (int i3 = 0; i3 < this.mixins_.size(); i3++) {
            abstractC4294.mo8208(6, this.mixins_.get(i3));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC4294.mo8210(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC4294, 8, this.edition_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Api$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4091 extends GeneratedMessage.AbstractC4137 implements InterfaceC4374 {
        private int bitField0_;
        private Object edition_;
        private C4195 methodsBuilder_;
        private List<Method> methods_;
        private C4195 mixinsBuilder_;
        private List<Mixin> mixins_;
        private Object name_;
        private C4195 optionsBuilder_;
        private List<Option> options_;
        private C4174 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;
        private Object version_;

        private C4091() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.methods_ = list;
            this.options_ = list;
            this.version_ = "";
            this.mixins_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        private void buildPartial0(Api api) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                api.name_ = this.name_;
            }
            if ((i2 & 8) != 0) {
                api.version_ = this.version_;
            }
            if ((i2 & 16) != 0) {
                C4174 c4174 = this.sourceContextBuilder_;
                api.sourceContext_ = c4174 == null ? this.sourceContext_ : (SourceContext) c4174.m7943();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 64) != 0) {
                api.syntax_ = this.syntax_;
            }
            if ((i2 & 128) != 0) {
                api.edition_ = this.edition_;
            }
            Api.access$1176(api, i);
        }

        private void buildPartialRepeatedFields(Api api) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.methods_ = Collections.unmodifiableList(this.methods_);
                    this.bitField0_ &= -3;
                }
                api.methods_ = this.methods_;
            } else {
                api.methods_ = c4195.m8031();
            }
            C4195 c41952 = this.optionsBuilder_;
            if (c41952 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                api.options_ = this.options_;
            } else {
                api.options_ = c41952.m8031();
            }
            C4195 c41953 = this.mixinsBuilder_;
            if (c41953 != null) {
                api.mixins_ = c41953.m8031();
                return;
            }
            if ((this.bitField0_ & 32) != 0) {
                this.mixins_ = Collections.unmodifiableList(this.mixins_);
                this.bitField0_ &= -33;
            }
            api.mixins_ = this.mixins_;
        }

        private void ensureMethodsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.methods_ = new ArrayList(this.methods_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureMixinsIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.mixins_ = new ArrayList(this.mixins_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4373.f11535;
        }

        private C4195 internalGetMethodsFieldBuilder() {
            if (this.methodsBuilder_ == null) {
                this.methodsBuilder_ = new C4195(this.methods_, getParentForChildren(), isClean());
                this.methods_ = null;
            }
            return this.methodsBuilder_;
        }

        private C4195 internalGetMixinsFieldBuilder() {
            if (this.mixinsBuilder_ == null) {
                this.mixinsBuilder_ = new C4195(this.mixins_, getParentForChildren(), isClean());
                this.mixins_ = null;
            }
            return this.mixinsBuilder_;
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
                internalGetMethodsFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
                internalGetMixinsFieldBuilder();
            }
        }

        public C4091 addAllMethods(Iterable<? extends Method> iterable) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureMethodsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.methods_);
            onChanged();
            return this;
        }

        public C4091 addAllMixins(Iterable<? extends Mixin> iterable) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureMixinsIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.mixins_);
            onChanged();
            return this;
        }

        public C4091 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C4091 addMethods(Method.C4146 c4146) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4146.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.add(c4146.build());
            onChanged();
            return this;
        }

        public Method.C4146 addMethodsBuilder() {
            return (Method.C4146) internalGetMethodsFieldBuilder().m8019(Method.getDefaultInstance());
        }

        public C4091 addMixins(Mixin.C4147 c4147) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4147.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.add(c4147.build());
            onChanged();
            return this;
        }

        public Mixin.C4147 addMixinsBuilder() {
            return (Mixin.C4147) internalGetMixinsFieldBuilder().m8019(Mixin.getDefaultInstance());
        }

        public C4091 addOptions(Option.C4148 c4148) {
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
        public Api build() {
            Api apiBuildPartial = buildPartial();
            if (apiBuildPartial.isInitialized()) {
                return apiBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) apiBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Api buildPartial() {
            Api api = new Api(this, null);
            buildPartialRepeatedFields(api);
            if (this.bitField0_ != 0) {
                buildPartial0(api);
            }
            onBuilt();
            return api;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4091 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 == null) {
                this.methods_ = Collections.EMPTY_LIST;
            } else {
                this.methods_ = null;
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
            this.version_ = "";
            this.sourceContext_ = null;
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                c4174.f11316 = null;
                this.sourceContextBuilder_ = null;
            }
            C4195 c41953 = this.mixinsBuilder_;
            if (c41953 == null) {
                this.mixins_ = Collections.EMPTY_LIST;
            } else {
                this.mixins_ = null;
                c41953.m8030();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        public C4091 clearEdition() {
            this.edition_ = Api.getDefaultInstance().getEdition();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C4091 clearMethods() {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.methods_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4091 clearMixins() {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.mixins_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C4091 clearName() {
            this.name_ = Api.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4091 clearOptions() {
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

        public C4091 clearSourceContext() {
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

        public C4091 clearSyntax() {
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public C4091 clearVersion() {
            this.version_ = Api.getDefaultInstance().getVersion();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4373.f11535;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public Method getMethods(int i) {
            C4195 c4195 = this.methodsBuilder_;
            return c4195 == null ? this.methods_.get(i) : (Method) c4195.m8025(i, false);
        }

        public Method.C4146 getMethodsBuilder(int i) {
            return (Method.C4146) internalGetMethodsFieldBuilder().m8032(i);
        }

        public List<Method.C4146> getMethodsBuilderList() {
            return internalGetMethodsFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public int getMethodsCount() {
            C4195 c4195 = this.methodsBuilder_;
            return c4195 == null ? this.methods_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public List<Method> getMethodsList() {
            C4195 c4195 = this.methodsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.methods_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public InterfaceC4265 getMethodsOrBuilder(int i) {
            C4195 c4195 = this.methodsBuilder_;
            return c4195 == null ? this.methods_.get(i) : (InterfaceC4265) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4374
        public List<? extends InterfaceC4265> getMethodsOrBuilderList() {
            C4195 c4195 = this.methodsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.methods_);
        }

        @Override // com.google.protobuf.InterfaceC4374
        public Mixin getMixins(int i) {
            C4195 c4195 = this.mixinsBuilder_;
            return c4195 == null ? this.mixins_.get(i) : (Mixin) c4195.m8025(i, false);
        }

        public Mixin.C4147 getMixinsBuilder(int i) {
            return (Mixin.C4147) internalGetMixinsFieldBuilder().m8032(i);
        }

        public List<Mixin.C4147> getMixinsBuilderList() {
            return internalGetMixinsFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public int getMixinsCount() {
            C4195 c4195 = this.mixinsBuilder_;
            return c4195 == null ? this.mixins_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public List<Mixin> getMixinsList() {
            C4195 c4195 = this.mixinsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.mixins_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public InterfaceC4199 getMixinsOrBuilder(int i) {
            C4195 c4195 = this.mixinsBuilder_;
            return c4195 == null ? this.mixins_.get(i) : (InterfaceC4199) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4374
        public List<? extends InterfaceC4199> getMixinsOrBuilderList() {
            C4195 c4195 = this.mixinsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.mixins_);
        }

        @Override // com.google.protobuf.InterfaceC4374
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4374
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

        @Override // com.google.protobuf.InterfaceC4374
        public int getOptionsCount() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public List<Option> getOptionsList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.options_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4374
        public InterfaceC4208 getOptionsOrBuilder(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (InterfaceC4208) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4374
        public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC4374
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

        @Override // com.google.protobuf.InterfaceC4374
        public InterfaceC4188 getSourceContextOrBuilder() {
            C4174 c4174 = this.sourceContextBuilder_;
            if (c4174 != null) {
                return (InterfaceC4188) c4174.m7938();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4374
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4373.f11534;
            c4451.m8386(Api.class, C4091.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4091 mergeFrom(Api api) {
            if (api == Api.getDefaultInstance()) {
                return this;
            }
            if (!api.getName().isEmpty()) {
                this.name_ = api.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.methodsBuilder_ == null) {
                if (!api.methods_.isEmpty()) {
                    if (this.methods_.isEmpty()) {
                        this.methods_ = api.methods_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMethodsIsMutable();
                        this.methods_.addAll(api.methods_);
                    }
                    onChanged();
                }
            } else if (!api.methods_.isEmpty()) {
                boolean zIsEmpty = this.methodsBuilder_.f11357.isEmpty();
                C4195 c4195 = this.methodsBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.methodsBuilder_ = null;
                    this.methods_ = api.methods_;
                    this.bitField0_ &= -3;
                    this.methodsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMethodsFieldBuilder() : null;
                } else {
                    c4195.m8021(api.methods_);
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!api.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = api.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(api.options_);
                    }
                    onChanged();
                }
            } else if (!api.options_.isEmpty()) {
                boolean zIsEmpty2 = this.optionsBuilder_.f11357.isEmpty();
                C4195 c41952 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c41952.f11358 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = api.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c41952.m8021(api.options_);
                }
            }
            if (!api.getVersion().isEmpty()) {
                this.version_ = api.version_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (api.hasSourceContext()) {
                mergeSourceContext(api.getSourceContext());
            }
            if (this.mixinsBuilder_ == null) {
                if (!api.mixins_.isEmpty()) {
                    if (this.mixins_.isEmpty()) {
                        this.mixins_ = api.mixins_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureMixinsIsMutable();
                        this.mixins_.addAll(api.mixins_);
                    }
                    onChanged();
                }
            } else if (!api.mixins_.isEmpty()) {
                boolean zIsEmpty3 = this.mixinsBuilder_.f11357.isEmpty();
                C4195 c41953 = this.mixinsBuilder_;
                if (zIsEmpty3) {
                    c41953.f11358 = null;
                    this.mixinsBuilder_ = null;
                    this.mixins_ = api.mixins_;
                    this.bitField0_ &= -33;
                    this.mixinsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMixinsFieldBuilder() : null;
                } else {
                    c41953.m8021(api.mixins_);
                }
            }
            if (api.syntax_ != 0) {
                setSyntaxValue(api.getSyntaxValue());
            }
            if (!api.getEdition().isEmpty()) {
                this.edition_ = api.edition_;
                this.bitField0_ |= 128;
                onChanged();
            }
            mergeUnknownFields(api.getUnknownFields());
            onChanged();
            return this;
        }

        public C4091 mergeSourceContext(SourceContext sourceContext) {
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

        public C4091 removeMethods(int i) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.remove(i);
            onChanged();
            return this;
        }

        public C4091 removeMixins(int i) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.remove(i);
            onChanged();
            return this;
        }

        public C4091 removeOptions(int i) {
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

        public C4091 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C4091 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C4091 setMethods(int i, Method.C4146 c4146) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4146.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.set(i, c4146.build());
            onChanged();
            return this;
        }

        public C4091 setMixins(int i, Mixin.C4147 c4147) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4147.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.set(i, c4147.build());
            onChanged();
            return this;
        }

        public C4091 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4091 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4091 setOptions(int i, Option.C4148 c4148) {
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

        public C4091 setSourceContext(SourceContext.C4149 c4149) {
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

        public C4091 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C4091 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C4091 setVersion(String str) {
            str.getClass();
            this.version_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4091 setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.version_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Api getDefaultInstanceForType() {
            return Api.getDefaultInstance();
        }

        public Method.C4146 addMethodsBuilder(int i) {
            return (Method.C4146) internalGetMethodsFieldBuilder().m8020(i, Method.getDefaultInstance());
        }

        public Mixin.C4147 addMixinsBuilder(int i) {
            return (Mixin.C4147) internalGetMixinsFieldBuilder().m8020(i, Mixin.getDefaultInstance());
        }

        public Option.C4148 addOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8020(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C4091(C4382 c4382) {
            this();
        }

        public /* synthetic */ C4091(InterfaceC4364 interfaceC4364, C4382 c4382) {
            this(interfaceC4364);
        }

        private C4091(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.methods_ = list;
            this.options_ = list;
            this.version_ = "";
            this.mixins_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public C4091 addMethods(int i, Method method) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(i, method);
                onChanged();
                return this;
            }
            c4195.m8018(i, method);
            return this;
        }

        public C4091 addMixins(int i, Mixin mixin) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(i, mixin);
                onChanged();
                return this;
            }
            c4195.m8018(i, mixin);
            return this;
        }

        public C4091 addOptions(int i, Option option) {
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

        public C4091 setMethods(int i, Method method) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.set(i, method);
                onChanged();
                return this;
            }
            c4195.m8022(i, method);
            return this;
        }

        public C4091 setMixins(int i, Mixin mixin) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.set(i, mixin);
                onChanged();
                return this;
            }
            c4195.m8022(i, mixin);
            return this;
        }

        public C4091 setOptions(int i, Option option) {
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

        public C4091 setSourceContext(SourceContext sourceContext) {
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

        public C4091 addMethods(Method method) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(method);
                onChanged();
                return this;
            }
            c4195.m8017(method);
            return this;
        }

        public C4091 addMixins(Mixin mixin) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(mixin);
                onChanged();
                return this;
            }
            c4195.m8017(mixin);
            return this;
        }

        public C4091 addOptions(Option option) {
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

        public C4091 addMethods(int i, Method.C4146 c4146) {
            C4195 c4195 = this.methodsBuilder_;
            if (c4195 == null) {
                ensureMethodsIsMutable();
                this.methods_.add(i, c4146.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4146.build());
            return this;
        }

        public C4091 addMixins(int i, Mixin.C4147 c4147) {
            C4195 c4195 = this.mixinsBuilder_;
            if (c4195 == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(i, c4147.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4147.build());
            return this;
        }

        public C4091 addOptions(int i, Option.C4148 c4148) {
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
        public C4091 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Api) {
                return mergeFrom((Api) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4091 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                                Method method = (Method) abstractC4306.mo8274(Method.parser(), c4529);
                                C4195 c4195 = this.methodsBuilder_;
                                if (c4195 == null) {
                                    ensureMethodsIsMutable();
                                    this.methods_.add(method);
                                } else {
                                    c4195.m8017(method);
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
                                this.version_ = abstractC4306.mo8265();
                                this.bitField0_ |= 8;
                            } else if (iMo8264 == 42) {
                                abstractC4306.mo8275(internalGetSourceContextFieldBuilder().m7940(), c4529);
                                this.bitField0_ |= 16;
                            } else if (iMo8264 == 50) {
                                Mixin mixin = (Mixin) abstractC4306.mo8274(Mixin.parser(), c4529);
                                C4195 c41953 = this.mixinsBuilder_;
                                if (c41953 == null) {
                                    ensureMixinsIsMutable();
                                    this.mixins_.add(mixin);
                                } else {
                                    c41953.m8017(mixin);
                                }
                            } else if (iMo8264 == 56) {
                                this.syntax_ = abstractC4306.mo8283();
                                this.bitField0_ |= 64;
                            } else if (iMo8264 != 66) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                this.edition_ = abstractC4306.mo8265();
                                this.bitField0_ |= 128;
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
    public Api getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Api parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4091 newBuilderForType() {
        return newBuilder();
    }

    public static C4091 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Api parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Api) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Api parseFrom(ByteString byteString) {
        return (Api) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Api parseFrom(ByteString byteString, C4529 c4529) {
        return (Api) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Api parseFrom(byte[] bArr) {
        return (Api) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Api parseFrom(byte[] bArr, C4529 c4529) {
        return (Api) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, C4529 c4529) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    private Api(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Api parseFrom(AbstractC4306 abstractC4306) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Api parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    public /* synthetic */ Api(GeneratedMessage.AbstractC4137 abstractC4137, C4382 c4382) {
        this(abstractC4137);
    }
}
