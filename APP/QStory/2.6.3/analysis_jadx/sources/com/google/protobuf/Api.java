package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
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
public final class Api extends GeneratedMessage implements InterfaceC3542 {
    private static final Api DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 8;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3375 PARSER;
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
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Api");
        DEFAULT_INSTANCE = new Api();
        PARSER = new C3550();
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

    public static final C3663 getDescriptor() {
        return AbstractC3541.f11190;
    }

    public static C3259 newBuilder(Api api) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return (Api) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3541.f11190;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public Method getMethods(int i) {
        return this.methods_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3542
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.InterfaceC3542
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public InterfaceC3433 getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3542
    public List<? extends InterfaceC3433> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3542
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.InterfaceC3542
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public InterfaceC3367 getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3542
    public List<? extends InterfaceC3367> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3542
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3542
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public InterfaceC3376 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3542
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
        int size = this.methods_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.methods_.get(i2));
        }
        int iM7643 = iComputeStringSize + size;
        int size2 = this.options_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7643 += AbstractC3462.m7643(this.options_.get(i3));
        }
        int iM76432 = iM7643 + size2;
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            iM76432 += GeneratedMessage.computeStringSize(4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            iM76432 += AbstractC3462.m7639(5, getSourceContext());
        }
        int size3 = this.mixins_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM76432 += AbstractC3462.m7643(this.mixins_.get(i4));
        }
        int iComputeStringSize2 = iM76432 + size3;
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC3462.m7632(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(8, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public InterfaceC3356 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3542
    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3542
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
        if (getMethodsCount() > 0) {
            iHashCode = getMethodsList().hashCode() + AbstractC2442.m4571(iHashCode, 37, 2, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC2442.m4571(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = getVersion().hashCode() + AbstractC2442.m4571(iHashCode, 37, 4, 53);
        if (hasSourceContext()) {
            iHashCode2 = getSourceContext().hashCode() + AbstractC2442.m4571(iHashCode2, 37, 5, 53);
        }
        if (getMixinsCount() > 0) {
            iHashCode2 = getMixinsList().hashCode() + AbstractC2442.m4571(iHashCode2, 37, 6, 53);
        }
        int iHashCode3 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4571(iHashCode2, 37, 7, 53) + this.syntax_) * 37) + 8) * 53)) * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3541.f11189;
        c3619.m7827(Api.class, C3259.class);
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
    public C3259 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3259(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3259 toBuilder() {
        C3550 c3550 = null;
        return this == DEFAULT_INSTANCE ? new C3259(c3550) : new C3259(c3550).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        for (int i = 0; i < this.methods_.size(); i++) {
            abstractC3462.mo7649(2, this.methods_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC3462.mo7649(3, this.options_.get(i2));
        }
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            GeneratedMessage.writeString(abstractC3462, 4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            abstractC3462.mo7649(5, getSourceContext());
        }
        for (int i3 = 0; i3 < this.mixins_.size(); i3++) {
            abstractC3462.mo7649(6, this.mixins_.get(i3));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3462.mo7651(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3462, 8, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Api$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3259 extends GeneratedMessage.AbstractC3305 implements InterfaceC3542 {
        private int bitField0_;
        private Object edition_;
        private C3363 methodsBuilder_;
        private List<Method> methods_;
        private C3363 mixinsBuilder_;
        private List<Mixin> mixins_;
        private Object name_;
        private C3363 optionsBuilder_;
        private List<Option> options_;
        private C3342 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;
        private Object version_;

        private C3259() {
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
                C3342 c3342 = this.sourceContextBuilder_;
                api.sourceContext_ = c3342 == null ? this.sourceContext_ : (SourceContext) c3342.m7384();
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
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.methods_ = Collections.unmodifiableList(this.methods_);
                    this.bitField0_ &= -3;
                }
                api.methods_ = this.methods_;
            } else {
                api.methods_ = c3363.m7472();
            }
            C3363 c33632 = this.optionsBuilder_;
            if (c33632 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                api.options_ = this.options_;
            } else {
                api.options_ = c33632.m7472();
            }
            C3363 c33633 = this.mixinsBuilder_;
            if (c33633 != null) {
                api.mixins_ = c33633.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3541.f11190;
        }

        private C3363 internalGetMethodsFieldBuilder() {
            if (this.methodsBuilder_ == null) {
                this.methodsBuilder_ = new C3363(this.methods_, getParentForChildren(), isClean());
                this.methods_ = null;
            }
            return this.methodsBuilder_;
        }

        private C3363 internalGetMixinsFieldBuilder() {
            if (this.mixinsBuilder_ == null) {
                this.mixinsBuilder_ = new C3363(this.mixins_, getParentForChildren(), isClean());
                this.mixins_ = null;
            }
            return this.mixinsBuilder_;
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
                internalGetMethodsFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
                internalGetMixinsFieldBuilder();
            }
        }

        public C3259 addAllMethods(Iterable<? extends Method> iterable) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureMethodsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.methods_);
            onChanged();
            return this;
        }

        public C3259 addAllMixins(Iterable<? extends Mixin> iterable) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureMixinsIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.mixins_);
            onChanged();
            return this;
        }

        public C3259 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3259 addMethods(Method.C3314 c3314) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3314.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.add(c3314.build());
            onChanged();
            return this;
        }

        public Method.C3314 addMethodsBuilder() {
            return (Method.C3314) internalGetMethodsFieldBuilder().m7460(Method.getDefaultInstance());
        }

        public C3259 addMixins(Mixin.C3315 c3315) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3315.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.add(c3315.build());
            onChanged();
            return this;
        }

        public Mixin.C3315 addMixinsBuilder() {
            return (Mixin.C3315) internalGetMixinsFieldBuilder().m7460(Mixin.getDefaultInstance());
        }

        public C3259 addOptions(Option.C3316 c3316) {
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
        public Api build() {
            Api apiBuildPartial = buildPartial();
            if (apiBuildPartial.isInitialized()) {
                return apiBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) apiBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Api buildPartial() {
            Api api = new Api(this, null);
            buildPartialRepeatedFields(api);
            if (this.bitField0_ != 0) {
                buildPartial0(api);
            }
            onBuilt();
            return api;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3259 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 == null) {
                this.methods_ = Collections.EMPTY_LIST;
            } else {
                this.methods_ = null;
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
            this.version_ = "";
            this.sourceContext_ = null;
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                c3342.f10971 = null;
                this.sourceContextBuilder_ = null;
            }
            C3363 c33633 = this.mixinsBuilder_;
            if (c33633 == null) {
                this.mixins_ = Collections.EMPTY_LIST;
            } else {
                this.mixins_ = null;
                c33633.m7471();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        public C3259 clearEdition() {
            this.edition_ = Api.getDefaultInstance().getEdition();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3259 clearMethods() {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.methods_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3259 clearMixins() {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.mixins_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3259 clearName() {
            this.name_ = Api.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3259 clearOptions() {
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

        public C3259 clearSourceContext() {
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

        public C3259 clearSyntax() {
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public C3259 clearVersion() {
            this.version_ = Api.getDefaultInstance().getVersion();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3541.f11190;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public Method getMethods(int i) {
            C3363 c3363 = this.methodsBuilder_;
            return c3363 == null ? this.methods_.get(i) : (Method) c3363.m7466(i, false);
        }

        public Method.C3314 getMethodsBuilder(int i) {
            return (Method.C3314) internalGetMethodsFieldBuilder().m7473(i);
        }

        public List<Method.C3314> getMethodsBuilderList() {
            return internalGetMethodsFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public int getMethodsCount() {
            C3363 c3363 = this.methodsBuilder_;
            return c3363 == null ? this.methods_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public List<Method> getMethodsList() {
            C3363 c3363 = this.methodsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.methods_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public InterfaceC3433 getMethodsOrBuilder(int i) {
            C3363 c3363 = this.methodsBuilder_;
            return c3363 == null ? this.methods_.get(i) : (InterfaceC3433) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3542
        public List<? extends InterfaceC3433> getMethodsOrBuilderList() {
            C3363 c3363 = this.methodsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.methods_);
        }

        @Override // com.google.protobuf.InterfaceC3542
        public Mixin getMixins(int i) {
            C3363 c3363 = this.mixinsBuilder_;
            return c3363 == null ? this.mixins_.get(i) : (Mixin) c3363.m7466(i, false);
        }

        public Mixin.C3315 getMixinsBuilder(int i) {
            return (Mixin.C3315) internalGetMixinsFieldBuilder().m7473(i);
        }

        public List<Mixin.C3315> getMixinsBuilderList() {
            return internalGetMixinsFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public int getMixinsCount() {
            C3363 c3363 = this.mixinsBuilder_;
            return c3363 == null ? this.mixins_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public List<Mixin> getMixinsList() {
            C3363 c3363 = this.mixinsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.mixins_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public InterfaceC3367 getMixinsOrBuilder(int i) {
            C3363 c3363 = this.mixinsBuilder_;
            return c3363 == null ? this.mixins_.get(i) : (InterfaceC3367) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3542
        public List<? extends InterfaceC3367> getMixinsOrBuilderList() {
            C3363 c3363 = this.mixinsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.mixins_);
        }

        @Override // com.google.protobuf.InterfaceC3542
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3542
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

        @Override // com.google.protobuf.InterfaceC3542
        public int getOptionsCount() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public List<Option> getOptionsList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.options_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3542
        public InterfaceC3376 getOptionsOrBuilder(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (InterfaceC3376) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3542
        public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3542
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

        @Override // com.google.protobuf.InterfaceC3542
        public InterfaceC3356 getSourceContextOrBuilder() {
            C3342 c3342 = this.sourceContextBuilder_;
            if (c3342 != null) {
                return (InterfaceC3356) c3342.m7379();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3542
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3541.f11189;
            c3619.m7827(Api.class, C3259.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3259 mergeFrom(Api api) {
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
                boolean zIsEmpty = this.methodsBuilder_.f11012.isEmpty();
                C3363 c3363 = this.methodsBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.methodsBuilder_ = null;
                    this.methods_ = api.methods_;
                    this.bitField0_ &= -3;
                    this.methodsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMethodsFieldBuilder() : null;
                } else {
                    c3363.m7462(api.methods_);
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
                boolean zIsEmpty2 = this.optionsBuilder_.f11012.isEmpty();
                C3363 c33632 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c33632.f11013 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = api.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c33632.m7462(api.options_);
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
                boolean zIsEmpty3 = this.mixinsBuilder_.f11012.isEmpty();
                C3363 c33633 = this.mixinsBuilder_;
                if (zIsEmpty3) {
                    c33633.f11013 = null;
                    this.mixinsBuilder_ = null;
                    this.mixins_ = api.mixins_;
                    this.bitField0_ &= -33;
                    this.mixinsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMixinsFieldBuilder() : null;
                } else {
                    c33633.m7462(api.mixins_);
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

        public C3259 mergeSourceContext(SourceContext sourceContext) {
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

        public C3259 removeMethods(int i) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.remove(i);
            onChanged();
            return this;
        }

        public C3259 removeMixins(int i) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.remove(i);
            onChanged();
            return this;
        }

        public C3259 removeOptions(int i) {
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

        public C3259 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3259 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3259 setMethods(int i, Method.C3314 c3314) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3314.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.set(i, c3314.build());
            onChanged();
            return this;
        }

        public C3259 setMixins(int i, Mixin.C3315 c3315) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3315.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.set(i, c3315.build());
            onChanged();
            return this;
        }

        public C3259 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3259 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3259 setOptions(int i, Option.C3316 c3316) {
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

        public C3259 setSourceContext(SourceContext.C3317 c3317) {
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

        public C3259 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C3259 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3259 setVersion(String str) {
            str.getClass();
            this.version_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3259 setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.version_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Api getDefaultInstanceForType() {
            return Api.getDefaultInstance();
        }

        public Method.C3314 addMethodsBuilder(int i) {
            return (Method.C3314) internalGetMethodsFieldBuilder().m7461(i, Method.getDefaultInstance());
        }

        public Mixin.C3315 addMixinsBuilder(int i) {
            return (Mixin.C3315) internalGetMixinsFieldBuilder().m7461(i, Mixin.getDefaultInstance());
        }

        public Option.C3316 addOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7461(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3259(C3550 c3550) {
            this();
        }

        public /* synthetic */ C3259(InterfaceC3532 interfaceC3532, C3550 c3550) {
            this(interfaceC3532);
        }

        private C3259(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
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

        public C3259 addMethods(int i, Method method) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(i, method);
                onChanged();
                return this;
            }
            c3363.m7459(i, method);
            return this;
        }

        public C3259 addMixins(int i, Mixin mixin) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(i, mixin);
                onChanged();
                return this;
            }
            c3363.m7459(i, mixin);
            return this;
        }

        public C3259 addOptions(int i, Option option) {
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

        public C3259 setMethods(int i, Method method) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.set(i, method);
                onChanged();
                return this;
            }
            c3363.m7463(i, method);
            return this;
        }

        public C3259 setMixins(int i, Mixin mixin) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.set(i, mixin);
                onChanged();
                return this;
            }
            c3363.m7463(i, mixin);
            return this;
        }

        public C3259 setOptions(int i, Option option) {
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

        public C3259 setSourceContext(SourceContext sourceContext) {
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

        public C3259 addMethods(Method method) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(method);
                onChanged();
                return this;
            }
            c3363.m7458(method);
            return this;
        }

        public C3259 addMixins(Mixin mixin) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(mixin);
                onChanged();
                return this;
            }
            c3363.m7458(mixin);
            return this;
        }

        public C3259 addOptions(Option option) {
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

        public C3259 addMethods(int i, Method.C3314 c3314) {
            C3363 c3363 = this.methodsBuilder_;
            if (c3363 == null) {
                ensureMethodsIsMutable();
                this.methods_.add(i, c3314.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3314.build());
            return this;
        }

        public C3259 addMixins(int i, Mixin.C3315 c3315) {
            C3363 c3363 = this.mixinsBuilder_;
            if (c3363 == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(i, c3315.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3315.build());
            return this;
        }

        public C3259 addOptions(int i, Option.C3316 c3316) {
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
        public C3259 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Api) {
                return mergeFrom((Api) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3259 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
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
                                Method method = (Method) abstractC3474.mo7715(Method.parser(), c3697);
                                C3363 c3363 = this.methodsBuilder_;
                                if (c3363 == null) {
                                    ensureMethodsIsMutable();
                                    this.methods_.add(method);
                                } else {
                                    c3363.m7458(method);
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
                                this.version_ = abstractC3474.mo7706();
                                this.bitField0_ |= 8;
                            } else if (iMo7705 == 42) {
                                abstractC3474.mo7716(internalGetSourceContextFieldBuilder().m7381(), c3697);
                                this.bitField0_ |= 16;
                            } else if (iMo7705 == 50) {
                                Mixin mixin = (Mixin) abstractC3474.mo7715(Mixin.parser(), c3697);
                                C3363 c33633 = this.mixinsBuilder_;
                                if (c33633 == null) {
                                    ensureMixinsIsMutable();
                                    this.mixins_.add(mixin);
                                } else {
                                    c33633.m7458(mixin);
                                }
                            } else if (iMo7705 == 56) {
                                this.syntax_ = abstractC3474.mo7724();
                                this.bitField0_ |= 64;
                            } else if (iMo7705 != 66) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                this.edition_ = abstractC3474.mo7706();
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public Api getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Api parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3259 newBuilderForType() {
        return newBuilder();
    }

    public static C3259 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Api parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Api) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Api parseFrom(ByteString byteString) {
        return (Api) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Api parseFrom(ByteString byteString, C3697 c3697) {
        return (Api) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Api parseFrom(byte[] bArr) {
        return (Api) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Api parseFrom(byte[] bArr, C3697 c3697) {
        return (Api) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, C3697 c3697) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    private Api(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Api parseFrom(AbstractC3474 abstractC3474) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Api parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    public /* synthetic */ Api(GeneratedMessage.AbstractC3305 abstractC3305, C3550 c3550) {
        this(abstractC3305);
    }
}
