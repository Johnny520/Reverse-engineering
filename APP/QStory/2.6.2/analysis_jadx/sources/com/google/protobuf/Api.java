package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
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

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Api extends GeneratedMessage implements InterfaceC3541 {
    private static final Api DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 8;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final InterfaceC3374 PARSER;
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
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Api");
        DEFAULT_INSTANCE = new Api();
        PARSER = new C3549();
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

    public static final C3662 getDescriptor() {
        return AbstractC3540.f11185;
    }

    public static C3258 newBuilder(Api api) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return (Api) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3540.f11185;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public Method getMethods(int i) {
        return this.methods_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3541
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.InterfaceC3541
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public InterfaceC3432 getMethodsOrBuilder(int i) {
        return this.methods_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3541
    public List<? extends InterfaceC3432> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public Mixin getMixins(int i) {
        return this.mixins_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3541
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.InterfaceC3541
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public InterfaceC3366 getMixinsOrBuilder(int i) {
        return this.mixins_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3541
    public List<? extends InterfaceC3366> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3541
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3541
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public InterfaceC3375 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3541
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
        int size = this.methods_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.methods_.get(i2));
        }
        int iM7656 = iComputeStringSize + size;
        int size2 = this.options_.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iM7656 += AbstractC3461.m7656(this.options_.get(i3));
        }
        int iM76562 = iM7656 + size2;
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            iM76562 += GeneratedMessage.computeStringSize(4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            iM76562 += AbstractC3461.m7652(5, getSourceContext());
        }
        int size3 = this.mixins_.size();
        for (int i4 = 0; i4 < size3; i4++) {
            iM76562 += AbstractC3461.m7656(this.mixins_.get(i4));
        }
        int iComputeStringSize2 = iM76562 + size3;
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize2 += AbstractC3461.m7645(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize2 += GeneratedMessage.computeStringSize(8, this.edition_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public InterfaceC3355 getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3541
    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3541
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
        if (getMethodsCount() > 0) {
            iHashCode = getMethodsList().hashCode() + AbstractC2442.m4561(iHashCode, 37, 2, 53);
        }
        if (getOptionsCount() > 0) {
            iHashCode = getOptionsList().hashCode() + AbstractC2442.m4561(iHashCode, 37, 3, 53);
        }
        int iHashCode2 = getVersion().hashCode() + AbstractC2442.m4561(iHashCode, 37, 4, 53);
        if (hasSourceContext()) {
            iHashCode2 = getSourceContext().hashCode() + AbstractC2442.m4561(iHashCode2, 37, 5, 53);
        }
        if (getMixinsCount() > 0) {
            iHashCode2 = getMixinsList().hashCode() + AbstractC2442.m4561(iHashCode2, 37, 6, 53);
        }
        int iHashCode3 = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4561(iHashCode2, 37, 7, 53) + this.syntax_) * 37) + 8) * 53)) * 29);
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3540.f11184;
        c3618.m7840(Api.class, C3258.class);
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
    public C3258 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3258(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3258 toBuilder() {
        C3549 c3549 = null;
        return this == DEFAULT_INSTANCE ? new C3258(c3549) : new C3258(c3549).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        for (int i = 0; i < this.methods_.size(); i++) {
            abstractC3461.mo7662(2, this.methods_.get(i));
        }
        for (int i2 = 0; i2 < this.options_.size(); i2++) {
            abstractC3461.mo7662(3, this.options_.get(i2));
        }
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            GeneratedMessage.writeString(abstractC3461, 4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            abstractC3461.mo7662(5, getSourceContext());
        }
        for (int i3 = 0; i3 < this.mixins_.size(); i3++) {
            abstractC3461.mo7662(6, this.mixins_.get(i3));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3461.mo7664(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3461, 8, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Api$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3258 extends GeneratedMessage.AbstractC3304 implements InterfaceC3541 {
        private int bitField0_;
        private Object edition_;
        private C3362 methodsBuilder_;
        private List<Method> methods_;
        private C3362 mixinsBuilder_;
        private List<Mixin> mixins_;
        private Object name_;
        private C3362 optionsBuilder_;
        private List<Option> options_;
        private C3341 sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;
        private Object version_;

        private C3258() {
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
                C3341 c3341 = this.sourceContextBuilder_;
                api.sourceContext_ = c3341 == null ? this.sourceContext_ : (SourceContext) c3341.m7397();
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
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.methods_ = Collections.unmodifiableList(this.methods_);
                    this.bitField0_ &= -3;
                }
                api.methods_ = this.methods_;
            } else {
                api.methods_ = c3362.m7485();
            }
            C3362 c33622 = this.optionsBuilder_;
            if (c33622 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                api.options_ = this.options_;
            } else {
                api.options_ = c33622.m7485();
            }
            C3362 c33623 = this.mixinsBuilder_;
            if (c33623 != null) {
                api.mixins_ = c33623.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3540.f11185;
        }

        private C3362 internalGetMethodsFieldBuilder() {
            if (this.methodsBuilder_ == null) {
                this.methodsBuilder_ = new C3362(this.methods_, getParentForChildren(), isClean());
                this.methods_ = null;
            }
            return this.methodsBuilder_;
        }

        private C3362 internalGetMixinsFieldBuilder() {
            if (this.mixinsBuilder_ == null) {
                this.mixinsBuilder_ = new C3362(this.mixins_, getParentForChildren(), isClean());
                this.mixins_ = null;
            }
            return this.mixinsBuilder_;
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
                internalGetMethodsFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
                internalGetMixinsFieldBuilder();
            }
        }

        public C3258 addAllMethods(Iterable<? extends Method> iterable) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureMethodsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.methods_);
            onChanged();
            return this;
        }

        public C3258 addAllMixins(Iterable<? extends Mixin> iterable) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureMixinsIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.mixins_);
            onChanged();
            return this;
        }

        public C3258 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3258 addMethods(Method.C3313 c3313) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3313.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.add(c3313.build());
            onChanged();
            return this;
        }

        public Method.C3313 addMethodsBuilder() {
            return (Method.C3313) internalGetMethodsFieldBuilder().m7473(Method.getDefaultInstance());
        }

        public C3258 addMixins(Mixin.C3314 c3314) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3314.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.add(c3314.build());
            onChanged();
            return this;
        }

        public Mixin.C3314 addMixinsBuilder() {
            return (Mixin.C3314) internalGetMixinsFieldBuilder().m7473(Mixin.getDefaultInstance());
        }

        public C3258 addOptions(Option.C3315 c3315) {
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
        public Api build() {
            Api apiBuildPartial = buildPartial();
            if (apiBuildPartial.isInitialized()) {
                return apiBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) apiBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Api buildPartial() {
            Api api = new Api(this, null);
            buildPartialRepeatedFields(api);
            if (this.bitField0_ != 0) {
                buildPartial0(api);
            }
            onBuilt();
            return api;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3258 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 == null) {
                this.methods_ = Collections.EMPTY_LIST;
            } else {
                this.methods_ = null;
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
            this.version_ = "";
            this.sourceContext_ = null;
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                c3341.f10966 = null;
                this.sourceContextBuilder_ = null;
            }
            C3362 c33623 = this.mixinsBuilder_;
            if (c33623 == null) {
                this.mixins_ = Collections.EMPTY_LIST;
            } else {
                this.mixins_ = null;
                c33623.m7484();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        public C3258 clearEdition() {
            this.edition_ = Api.getDefaultInstance().getEdition();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3258 clearMethods() {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.methods_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3258 clearMixins() {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.mixins_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3258 clearName() {
            this.name_ = Api.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3258 clearOptions() {
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

        public C3258 clearSourceContext() {
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

        public C3258 clearSyntax() {
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public C3258 clearVersion() {
            this.version_ = Api.getDefaultInstance().getVersion();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3540.f11185;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public Method getMethods(int i) {
            C3362 c3362 = this.methodsBuilder_;
            return c3362 == null ? this.methods_.get(i) : (Method) c3362.m7479(i, false);
        }

        public Method.C3313 getMethodsBuilder(int i) {
            return (Method.C3313) internalGetMethodsFieldBuilder().m7486(i);
        }

        public List<Method.C3313> getMethodsBuilderList() {
            return internalGetMethodsFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public int getMethodsCount() {
            C3362 c3362 = this.methodsBuilder_;
            return c3362 == null ? this.methods_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public List<Method> getMethodsList() {
            C3362 c3362 = this.methodsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.methods_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public InterfaceC3432 getMethodsOrBuilder(int i) {
            C3362 c3362 = this.methodsBuilder_;
            return c3362 == null ? this.methods_.get(i) : (InterfaceC3432) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3541
        public List<? extends InterfaceC3432> getMethodsOrBuilderList() {
            C3362 c3362 = this.methodsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.methods_);
        }

        @Override // com.google.protobuf.InterfaceC3541
        public Mixin getMixins(int i) {
            C3362 c3362 = this.mixinsBuilder_;
            return c3362 == null ? this.mixins_.get(i) : (Mixin) c3362.m7479(i, false);
        }

        public Mixin.C3314 getMixinsBuilder(int i) {
            return (Mixin.C3314) internalGetMixinsFieldBuilder().m7486(i);
        }

        public List<Mixin.C3314> getMixinsBuilderList() {
            return internalGetMixinsFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public int getMixinsCount() {
            C3362 c3362 = this.mixinsBuilder_;
            return c3362 == null ? this.mixins_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public List<Mixin> getMixinsList() {
            C3362 c3362 = this.mixinsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.mixins_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public InterfaceC3366 getMixinsOrBuilder(int i) {
            C3362 c3362 = this.mixinsBuilder_;
            return c3362 == null ? this.mixins_.get(i) : (InterfaceC3366) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3541
        public List<? extends InterfaceC3366> getMixinsOrBuilderList() {
            C3362 c3362 = this.mixinsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.mixins_);
        }

        @Override // com.google.protobuf.InterfaceC3541
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3541
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

        @Override // com.google.protobuf.InterfaceC3541
        public int getOptionsCount() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public List<Option> getOptionsList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.options_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3541
        public InterfaceC3375 getOptionsOrBuilder(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (InterfaceC3375) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3541
        public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3541
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

        @Override // com.google.protobuf.InterfaceC3541
        public InterfaceC3355 getSourceContextOrBuilder() {
            C3341 c3341 = this.sourceContextBuilder_;
            if (c3341 != null) {
                return (InterfaceC3355) c3341.m7392();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3541
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3540.f11184;
            c3618.m7840(Api.class, C3258.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3258 mergeFrom(Api api) {
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
                boolean zIsEmpty = this.methodsBuilder_.f11007.isEmpty();
                C3362 c3362 = this.methodsBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.methodsBuilder_ = null;
                    this.methods_ = api.methods_;
                    this.bitField0_ &= -3;
                    this.methodsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMethodsFieldBuilder() : null;
                } else {
                    c3362.m7475(api.methods_);
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
                boolean zIsEmpty2 = this.optionsBuilder_.f11007.isEmpty();
                C3362 c33622 = this.optionsBuilder_;
                if (zIsEmpty2) {
                    c33622.f11008 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = api.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c33622.m7475(api.options_);
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
                boolean zIsEmpty3 = this.mixinsBuilder_.f11007.isEmpty();
                C3362 c33623 = this.mixinsBuilder_;
                if (zIsEmpty3) {
                    c33623.f11008 = null;
                    this.mixinsBuilder_ = null;
                    this.mixins_ = api.mixins_;
                    this.bitField0_ &= -33;
                    this.mixinsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMixinsFieldBuilder() : null;
                } else {
                    c33623.m7475(api.mixins_);
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

        public C3258 mergeSourceContext(SourceContext sourceContext) {
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

        public C3258 removeMethods(int i) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.remove(i);
            onChanged();
            return this;
        }

        public C3258 removeMixins(int i) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.remove(i);
            onChanged();
            return this;
        }

        public C3258 removeOptions(int i) {
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

        public C3258 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3258 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3258 setMethods(int i, Method.C3313 c3313) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3313.build());
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.set(i, c3313.build());
            onChanged();
            return this;
        }

        public C3258 setMixins(int i, Mixin.C3314 c3314) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3314.build());
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.set(i, c3314.build());
            onChanged();
            return this;
        }

        public C3258 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3258 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3258 setOptions(int i, Option.C3315 c3315) {
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

        public C3258 setSourceContext(SourceContext.C3316 c3316) {
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

        public C3258 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public C3258 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public C3258 setVersion(String str) {
            str.getClass();
            this.version_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3258 setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.version_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Api getDefaultInstanceForType() {
            return Api.getDefaultInstance();
        }

        public Method.C3313 addMethodsBuilder(int i) {
            return (Method.C3313) internalGetMethodsFieldBuilder().m7474(i, Method.getDefaultInstance());
        }

        public Mixin.C3314 addMixinsBuilder(int i) {
            return (Mixin.C3314) internalGetMixinsFieldBuilder().m7474(i, Mixin.getDefaultInstance());
        }

        public Option.C3315 addOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7474(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3258(C3549 c3549) {
            this();
        }

        public /* synthetic */ C3258(InterfaceC3531 interfaceC3531, C3549 c3549) {
            this(interfaceC3531);
        }

        private C3258(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
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

        public C3258 addMethods(int i, Method method) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(i, method);
                onChanged();
                return this;
            }
            c3362.m7472(i, method);
            return this;
        }

        public C3258 addMixins(int i, Mixin mixin) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(i, mixin);
                onChanged();
                return this;
            }
            c3362.m7472(i, mixin);
            return this;
        }

        public C3258 addOptions(int i, Option option) {
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

        public C3258 setMethods(int i, Method method) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.set(i, method);
                onChanged();
                return this;
            }
            c3362.m7476(i, method);
            return this;
        }

        public C3258 setMixins(int i, Mixin mixin) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.set(i, mixin);
                onChanged();
                return this;
            }
            c3362.m7476(i, mixin);
            return this;
        }

        public C3258 setOptions(int i, Option option) {
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

        public C3258 setSourceContext(SourceContext sourceContext) {
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

        public C3258 addMethods(Method method) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(method);
                onChanged();
                return this;
            }
            c3362.m7471(method);
            return this;
        }

        public C3258 addMixins(Mixin mixin) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(mixin);
                onChanged();
                return this;
            }
            c3362.m7471(mixin);
            return this;
        }

        public C3258 addOptions(Option option) {
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

        public C3258 addMethods(int i, Method.C3313 c3313) {
            C3362 c3362 = this.methodsBuilder_;
            if (c3362 == null) {
                ensureMethodsIsMutable();
                this.methods_.add(i, c3313.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3313.build());
            return this;
        }

        public C3258 addMixins(int i, Mixin.C3314 c3314) {
            C3362 c3362 = this.mixinsBuilder_;
            if (c3362 == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(i, c3314.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3314.build());
            return this;
        }

        public C3258 addOptions(int i, Option.C3315 c3315) {
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
        public C3258 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Api) {
                return mergeFrom((Api) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3258 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                                Method method = (Method) abstractC3473.mo7728(Method.parser(), c3696);
                                C3362 c3362 = this.methodsBuilder_;
                                if (c3362 == null) {
                                    ensureMethodsIsMutable();
                                    this.methods_.add(method);
                                } else {
                                    c3362.m7471(method);
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
                                this.version_ = abstractC3473.mo7719();
                                this.bitField0_ |= 8;
                            } else if (iMo7718 == 42) {
                                abstractC3473.mo7729(internalGetSourceContextFieldBuilder().m7394(), c3696);
                                this.bitField0_ |= 16;
                            } else if (iMo7718 == 50) {
                                Mixin mixin = (Mixin) abstractC3473.mo7728(Mixin.parser(), c3696);
                                C3362 c33623 = this.mixinsBuilder_;
                                if (c33623 == null) {
                                    ensureMixinsIsMutable();
                                    this.mixins_.add(mixin);
                                } else {
                                    c33623.m7471(mixin);
                                }
                            } else if (iMo7718 == 56) {
                                this.syntax_ = abstractC3473.mo7737();
                                this.bitField0_ |= 64;
                            } else if (iMo7718 != 66) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                this.edition_ = abstractC3473.mo7719();
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public Api getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Api parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3258 newBuilderForType() {
        return newBuilder();
    }

    public static C3258 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Api parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Api) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Api parseFrom(ByteString byteString) {
        return (Api) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Api parseFrom(ByteString byteString, C3696 c3696) {
        return (Api) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Api parseFrom(byte[] bArr) {
        return (Api) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Api parseFrom(byte[] bArr, C3696 c3696) {
        return (Api) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, C3696 c3696) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    private Api(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Api parseFrom(AbstractC3473 abstractC3473) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Api parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    public /* synthetic */ Api(GeneratedMessage.AbstractC3304 abstractC3304, C3549 c3549) {
        this(abstractC3304);
    }
}
