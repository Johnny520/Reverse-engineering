package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class Method extends GeneratedMessage implements InterfaceC3432 {
    private static final Method DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static final InterfaceC3374 PARSER;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private volatile Object edition_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Option> options_;
    private boolean requestStreaming_;
    private volatile Object requestTypeUrl_;
    private boolean responseStreaming_;
    private volatile Object responseTypeUrl_;
    private int syntax_;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Method");
        DEFAULT_INSTANCE = new Method();
        PARSER = new C3431();
    }

    private Method() {
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.requestStreaming_ = false;
        this.responseTypeUrl_ = "";
        this.responseStreaming_ = false;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.responseTypeUrl_ = "";
        this.options_ = Collections.EMPTY_LIST;
        this.syntax_ = 0;
        this.edition_ = "";
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3540.f11183;
    }

    public static C3313 newBuilder(Method method) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream) {
        return (Method) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) {
        return (Method) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Method)) {
            return super.equals(obj);
        }
        Method method = (Method) obj;
        return getName().equals(method.getName()) && getRequestTypeUrl().equals(method.getRequestTypeUrl()) && getRequestStreaming() == method.getRequestStreaming() && getResponseTypeUrl().equals(method.getResponseTypeUrl()) && getResponseStreaming() == method.getResponseStreaming() && getOptionsList().equals(method.getOptionsList()) && this.syntax_ == method.syntax_ && getEdition().equals(method.getEdition()) && getUnknownFields().equals(method.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3540.f11183;
    }

    @Override // com.google.protobuf.InterfaceC3432
    @Deprecated
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3432
    @Deprecated
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3432
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3432
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public InterfaceC3375 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3432
    public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public String getRequestTypeUrl() {
        Object obj = this.requestTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.requestTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public ByteString getRequestTypeUrlBytes() {
        Object obj = this.requestTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.requestTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public String getResponseTypeUrl() {
        Object obj = this.responseTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.responseTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3432
    public ByteString getResponseTypeUrlBytes() {
        Object obj = this.responseTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.responseTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        if (!GeneratedMessage.isStringEmpty(this.requestTypeUrl_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(2, this.requestTypeUrl_);
        }
        if (this.requestStreaming_) {
            iComputeStringSize += AbstractC3461.m7647(3);
        }
        if (!GeneratedMessage.isStringEmpty(this.responseTypeUrl_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(4, this.responseTypeUrl_);
        }
        if (this.responseStreaming_) {
            iComputeStringSize += AbstractC3461.m7647(5);
        }
        int size = this.options_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3461.m7656(this.options_.get(i2));
        }
        int iComputeStringSize2 = iComputeStringSize + size;
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

    @Override // com.google.protobuf.InterfaceC3432
    @Deprecated
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3432
    @Deprecated
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iM7516 = AbstractC3401.m7516(getResponseStreaming()) + ((((getResponseTypeUrl().hashCode() + ((((AbstractC3401.m7516(getRequestStreaming()) + ((((getRequestTypeUrl().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (getOptionsCount() > 0) {
            iM7516 = getOptionsList().hashCode() + AbstractC2442.m4561(iM7516, 37, 6, 53);
        }
        int iHashCode = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4561(iM7516, 37, 7, 53) + this.syntax_) * 37) + 8) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3540.f11182;
        c3618.m7840(Method.class, C3313.class);
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
    public C3313 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3313(interfaceC3531, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3313 toBuilder() {
        C3431 c3431 = null;
        return this == DEFAULT_INSTANCE ? new C3313(c3431) : new C3313(c3431).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3461, 1, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.requestTypeUrl_)) {
            GeneratedMessage.writeString(abstractC3461, 2, this.requestTypeUrl_);
        }
        boolean z = this.requestStreaming_;
        if (z) {
            abstractC3461.mo7676(3, z);
        }
        if (!GeneratedMessage.isStringEmpty(this.responseTypeUrl_)) {
            GeneratedMessage.writeString(abstractC3461, 4, this.responseTypeUrl_);
        }
        boolean z2 = this.responseStreaming_;
        if (z2) {
            abstractC3461.mo7676(5, z2);
        }
        for (int i = 0; i < this.options_.size(); i++) {
            abstractC3461.mo7662(6, this.options_.get(i));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3461.mo7664(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3461, 8, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Method$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3313 extends GeneratedMessage.AbstractC3304 implements InterfaceC3432 {
        private int bitField0_;
        private Object edition_;
        private Object name_;
        private C3362 optionsBuilder_;
        private List<Option> options_;
        private boolean requestStreaming_;
        private Object requestTypeUrl_;
        private boolean responseStreaming_;
        private Object responseTypeUrl_;
        private int syntax_;

        private C3313() {
            this.name_ = "";
            this.requestTypeUrl_ = "";
            this.responseTypeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.syntax_ = 0;
            this.edition_ = "";
        }

        private void buildPartial0(Method method) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                method.name_ = this.name_;
            }
            if ((i & 2) != 0) {
                method.requestTypeUrl_ = this.requestTypeUrl_;
            }
            if ((i & 4) != 0) {
                method.requestStreaming_ = this.requestStreaming_;
            }
            if ((i & 8) != 0) {
                method.responseTypeUrl_ = this.responseTypeUrl_;
            }
            if ((i & 16) != 0) {
                method.responseStreaming_ = this.responseStreaming_;
            }
            if ((i & 64) != 0) {
                method.syntax_ = this.syntax_;
            }
            if ((i & 128) != 0) {
                method.edition_ = this.edition_;
            }
        }

        private void buildPartialRepeatedFields(Method method) {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                method.options_ = c3362.m7485();
                return;
            }
            if ((this.bitField0_ & 32) != 0) {
                this.options_ = Collections.unmodifiableList(this.options_);
                this.bitField0_ &= -33;
            }
            method.options_ = this.options_;
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 32;
            }
        }

        public static final C3662 getDescriptor() {
            return AbstractC3540.f11183;
        }

        private C3362 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3362(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C3313 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3313 addOptions(Option.C3315 c3315) {
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
        public Method build() {
            Method methodBuildPartial = buildPartial();
            if (methodBuildPartial.isInitialized()) {
                return methodBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) methodBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public Method buildPartial() {
            Method method = new Method(this, null);
            buildPartialRepeatedFields(method);
            if (this.bitField0_ != 0) {
                buildPartial0(method);
            }
            onBuilt();
            return method;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3313 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.requestTypeUrl_ = "";
            this.requestStreaming_ = false;
            this.responseTypeUrl_ = "";
            this.responseStreaming_ = false;
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        @Deprecated
        public C3313 clearEdition() {
            this.edition_ = Method.getDefaultInstance().getEdition();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3313 clearName() {
            this.name_ = Method.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3313 clearOptions() {
            C3362 c3362 = this.optionsBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3313 clearRequestStreaming() {
            this.bitField0_ &= -5;
            this.requestStreaming_ = false;
            onChanged();
            return this;
        }

        public C3313 clearRequestTypeUrl() {
            this.requestTypeUrl_ = Method.getDefaultInstance().getRequestTypeUrl();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3313 clearResponseStreaming() {
            this.bitField0_ &= -17;
            this.responseStreaming_ = false;
            onChanged();
            return this;
        }

        public C3313 clearResponseTypeUrl() {
            this.responseTypeUrl_ = Method.getDefaultInstance().getResponseTypeUrl();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Deprecated
        public C3313 clearSyntax() {
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3540.f11183;
        }

        @Override // com.google.protobuf.InterfaceC3432
        @Deprecated
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
        @Deprecated
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
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

        @Override // com.google.protobuf.InterfaceC3432
        public int getOptionsCount() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3432
        public List<Option> getOptionsList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.options_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3432
        public InterfaceC3375 getOptionsOrBuilder(int i) {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 == null ? this.options_.get(i) : (InterfaceC3375) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3432
        public List<? extends InterfaceC3375> getOptionsOrBuilderList() {
            C3362 c3362 = this.optionsBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3432
        public boolean getRequestStreaming() {
            return this.requestStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC3432
        public String getRequestTypeUrl() {
            Object obj = this.requestTypeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.requestTypeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
        public ByteString getRequestTypeUrlBytes() {
            Object obj = this.requestTypeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.requestTypeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
        public boolean getResponseStreaming() {
            return this.responseStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC3432
        public String getResponseTypeUrl() {
            Object obj = this.responseTypeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.responseTypeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
        public ByteString getResponseTypeUrlBytes() {
            Object obj = this.responseTypeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.responseTypeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3432
        @Deprecated
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3432
        @Deprecated
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3540.f11182;
            c3618.m7840(Method.class, C3313.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return true;
        }

        public C3313 mergeFrom(Method method) {
            if (method == Method.getDefaultInstance()) {
                return this;
            }
            if (!method.getName().isEmpty()) {
                this.name_ = method.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!method.getRequestTypeUrl().isEmpty()) {
                this.requestTypeUrl_ = method.requestTypeUrl_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (method.getRequestStreaming()) {
                setRequestStreaming(method.getRequestStreaming());
            }
            if (!method.getResponseTypeUrl().isEmpty()) {
                this.responseTypeUrl_ = method.responseTypeUrl_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (method.getResponseStreaming()) {
                setResponseStreaming(method.getResponseStreaming());
            }
            if (this.optionsBuilder_ == null) {
                if (!method.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = method.options_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(method.options_);
                    }
                    onChanged();
                }
            } else if (!method.options_.isEmpty()) {
                boolean zIsEmpty = this.optionsBuilder_.f11007.isEmpty();
                C3362 c3362 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = method.options_;
                    this.bitField0_ &= -33;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c3362.m7475(method.options_);
                }
            }
            if (method.syntax_ != 0) {
                setSyntaxValue(method.getSyntaxValue());
            }
            if (!method.getEdition().isEmpty()) {
                this.edition_ = method.edition_;
                this.bitField0_ |= 128;
                onChanged();
            }
            mergeUnknownFields(method.getUnknownFields());
            onChanged();
            return this;
        }

        public C3313 removeOptions(int i) {
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

        @Deprecated
        public C3313 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        @Deprecated
        public C3313 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3313 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3313 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3313 setOptions(int i, Option.C3315 c3315) {
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

        public C3313 setRequestStreaming(boolean z) {
            this.requestStreaming_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3313 setRequestTypeUrl(String str) {
            str.getClass();
            this.requestTypeUrl_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3313 setRequestTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.requestTypeUrl_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3313 setResponseStreaming(boolean z) {
            this.responseStreaming_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3313 setResponseTypeUrl(String str) {
            str.getClass();
            this.responseTypeUrl_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3313 setResponseTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3528.checkByteStringIsUtf8(byteString);
            this.responseTypeUrl_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Deprecated
        public C3313 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        @Deprecated
        public C3313 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Method getDefaultInstanceForType() {
            return Method.getDefaultInstance();
        }

        public Option.C3315 addOptionsBuilder(int i) {
            return (Option.C3315) internalGetOptionsFieldBuilder().m7474(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3313(C3431 c3431) {
            this();
        }

        public /* synthetic */ C3313(InterfaceC3531 interfaceC3531, C3431 c3431) {
            this(interfaceC3531);
        }

        private C3313(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.name_ = "";
            this.requestTypeUrl_ = "";
            this.responseTypeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.syntax_ = 0;
            this.edition_ = "";
        }

        public C3313 addOptions(int i, Option option) {
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

        public C3313 setOptions(int i, Option option) {
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

        public C3313 addOptions(Option option) {
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

        public C3313 addOptions(int i, Option.C3315 c3315) {
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
        public C3313 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof Method) {
                return mergeFrom((Method) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3313 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
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
                                this.requestTypeUrl_ = abstractC3473.mo7719();
                                this.bitField0_ |= 2;
                            } else if (iMo7718 == 24) {
                                this.requestStreaming_ = abstractC3473.mo7733();
                                this.bitField0_ |= 4;
                            } else if (iMo7718 == 34) {
                                this.responseTypeUrl_ = abstractC3473.mo7719();
                                this.bitField0_ |= 8;
                            } else if (iMo7718 == 40) {
                                this.responseStreaming_ = abstractC3473.mo7733();
                                this.bitField0_ |= 16;
                            } else if (iMo7718 == 50) {
                                Option option = (Option) abstractC3473.mo7728(Option.parser(), c3696);
                                C3362 c3362 = this.optionsBuilder_;
                                if (c3362 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c3362.m7471(option);
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
    public Method getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Method parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (Method) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3313 newBuilderForType() {
        return newBuilder();
    }

    public static C3313 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Method parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (Method) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static Method parseFrom(ByteString byteString) {
        return (Method) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static Method parseFrom(ByteString byteString, C3696 c3696) {
        return (Method) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static Method parseFrom(byte[] bArr) {
        return (Method) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static Method parseFrom(byte[] bArr, C3696 c3696) {
        return (Method) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static Method parseFrom(InputStream inputStream) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, C3696 c3696) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static Method parseFrom(AbstractC3473 abstractC3473) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static Method parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }

    private Method(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.requestStreaming_ = false;
        this.responseTypeUrl_ = "";
        this.responseStreaming_ = false;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public /* synthetic */ Method(GeneratedMessage.AbstractC3304 abstractC3304, C3431 c3431) {
        this(abstractC3304);
    }
}
