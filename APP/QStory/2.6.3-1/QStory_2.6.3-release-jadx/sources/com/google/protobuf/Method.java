package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Method extends GeneratedMessage implements InterfaceC4265 {
    private static final Method DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static final InterfaceC4207 PARSER;
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
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Method");
        DEFAULT_INSTANCE = new Method();
        PARSER = new C4264();
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

    public static final C4495 getDescriptor() {
        return AbstractC4373.f11533;
    }

    public static C4146 newBuilder(Method method) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream) {
        return (Method) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) {
        return (Method) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4373.f11533;
    }

    @Override // com.google.protobuf.InterfaceC4265
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

    @Override // com.google.protobuf.InterfaceC4265
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

    @Override // com.google.protobuf.InterfaceC4265
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4265
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC4265
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public InterfaceC4208 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4265
    public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public String getRequestTypeUrl() {
        Object obj = this.requestTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.requestTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public ByteString getRequestTypeUrlBytes() {
        Object obj = this.requestTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.requestTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public String getResponseTypeUrl() {
        Object obj = this.responseTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.responseTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC4265
    public ByteString getResponseTypeUrlBytes() {
        Object obj = this.responseTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.responseTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
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
            iComputeStringSize += AbstractC4294.m8193(3);
        }
        if (!GeneratedMessage.isStringEmpty(this.responseTypeUrl_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(4, this.responseTypeUrl_);
        }
        if (this.responseStreaming_) {
            iComputeStringSize += AbstractC4294.m8193(5);
        }
        int size = this.options_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC4294.m8202(this.options_.get(i2));
        }
        int iComputeStringSize2 = iComputeStringSize + size;
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

    @Override // com.google.protobuf.InterfaceC4265
    @Deprecated
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC4265
    @Deprecated
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iM8062 = AbstractC4234.m8062(getResponseStreaming()) + ((((getResponseTypeUrl().hashCode() + ((((AbstractC4234.m8062(getRequestStreaming()) + ((((getRequestTypeUrl().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (getOptionsCount() > 0) {
            iM8062 = getOptionsList().hashCode() + AbstractC3275.m5131(iM8062, 37, 6, 53);
        }
        int iHashCode = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC3275.m5131(iM8062, 37, 7, 53) + this.syntax_) * 37) + 8) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4373.f11532;
        c4451.m8386(Method.class, C4146.class);
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
    public C4146 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4146(interfaceC4364, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4146 toBuilder() {
        C4264 c4264 = null;
        return this == DEFAULT_INSTANCE ? new C4146(c4264) : new C4146(c4264).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC4294, 1, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.requestTypeUrl_)) {
            GeneratedMessage.writeString(abstractC4294, 2, this.requestTypeUrl_);
        }
        boolean z = this.requestStreaming_;
        if (z) {
            abstractC4294.mo8222(3, z);
        }
        if (!GeneratedMessage.isStringEmpty(this.responseTypeUrl_)) {
            GeneratedMessage.writeString(abstractC4294, 4, this.responseTypeUrl_);
        }
        boolean z2 = this.responseStreaming_;
        if (z2) {
            abstractC4294.mo8222(5, z2);
        }
        for (int i = 0; i < this.options_.size(); i++) {
            abstractC4294.mo8208(6, this.options_.get(i));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC4294.mo8210(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC4294, 8, this.edition_);
        }
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Method$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4146 extends GeneratedMessage.AbstractC4137 implements InterfaceC4265 {
        private int bitField0_;
        private Object edition_;
        private Object name_;
        private C4195 optionsBuilder_;
        private List<Option> options_;
        private boolean requestStreaming_;
        private Object requestTypeUrl_;
        private boolean responseStreaming_;
        private Object responseTypeUrl_;
        private int syntax_;

        private C4146() {
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
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                method.options_ = c4195.m8031();
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

        public static final C4495 getDescriptor() {
            return AbstractC4373.f11533;
        }

        private C4195 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C4195(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C4146 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C4146 addOptions(Option.C4148 c4148) {
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
        public Method build() {
            Method methodBuildPartial = buildPartial();
            if (methodBuildPartial.isInitialized()) {
                return methodBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) methodBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public Method buildPartial() {
            Method method = new Method(this, null);
            buildPartialRepeatedFields(method);
            if (this.bitField0_ != 0) {
                buildPartial0(method);
            }
            onBuilt();
            return method;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4146 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.requestTypeUrl_ = "";
            this.requestStreaming_ = false;
            this.responseTypeUrl_ = "";
            this.responseStreaming_ = false;
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        @Deprecated
        public C4146 clearEdition() {
            this.edition_ = Method.getDefaultInstance().getEdition();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C4146 clearName() {
            this.name_ = Method.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C4146 clearOptions() {
            C4195 c4195 = this.optionsBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C4146 clearRequestStreaming() {
            this.bitField0_ &= -5;
            this.requestStreaming_ = false;
            onChanged();
            return this;
        }

        public C4146 clearRequestTypeUrl() {
            this.requestTypeUrl_ = Method.getDefaultInstance().getRequestTypeUrl();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C4146 clearResponseStreaming() {
            this.bitField0_ &= -17;
            this.responseStreaming_ = false;
            onChanged();
            return this;
        }

        public C4146 clearResponseTypeUrl() {
            this.responseTypeUrl_ = Method.getDefaultInstance().getResponseTypeUrl();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Deprecated
        public C4146 clearSyntax() {
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4373.f11533;
        }

        @Override // com.google.protobuf.InterfaceC4265
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

        @Override // com.google.protobuf.InterfaceC4265
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

        @Override // com.google.protobuf.InterfaceC4265
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4265
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4265
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

        @Override // com.google.protobuf.InterfaceC4265
        public int getOptionsCount() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4265
        public List<Option> getOptionsList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.options_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4265
        public InterfaceC4208 getOptionsOrBuilder(int i) {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 == null ? this.options_.get(i) : (InterfaceC4208) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4265
        public List<? extends InterfaceC4208> getOptionsOrBuilderList() {
            C4195 c4195 = this.optionsBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC4265
        public boolean getRequestStreaming() {
            return this.requestStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC4265
        public String getRequestTypeUrl() {
            Object obj = this.requestTypeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.requestTypeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4265
        public ByteString getRequestTypeUrlBytes() {
            Object obj = this.requestTypeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.requestTypeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4265
        public boolean getResponseStreaming() {
            return this.responseStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC4265
        public String getResponseTypeUrl() {
            Object obj = this.responseTypeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.responseTypeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4265
        public ByteString getResponseTypeUrlBytes() {
            Object obj = this.responseTypeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.responseTypeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4265
        @Deprecated
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC4265
        @Deprecated
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4373.f11532;
            c4451.m8386(Method.class, C4146.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return true;
        }

        public C4146 mergeFrom(Method method) {
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
                boolean zIsEmpty = this.optionsBuilder_.f11357.isEmpty();
                C4195 c4195 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = method.options_;
                    this.bitField0_ &= -33;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c4195.m8021(method.options_);
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

        public C4146 removeOptions(int i) {
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

        @Deprecated
        public C4146 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        @Deprecated
        public C4146 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C4146 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4146 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C4146 setOptions(int i, Option.C4148 c4148) {
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

        public C4146 setRequestStreaming(boolean z) {
            this.requestStreaming_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C4146 setRequestTypeUrl(String str) {
            str.getClass();
            this.requestTypeUrl_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4146 setRequestTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.requestTypeUrl_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C4146 setResponseStreaming(boolean z) {
            this.responseStreaming_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C4146 setResponseTypeUrl(String str) {
            str.getClass();
            this.responseTypeUrl_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C4146 setResponseTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC4361.checkByteStringIsUtf8(byteString);
            this.responseTypeUrl_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Deprecated
        public C4146 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        @Deprecated
        public C4146 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Method getDefaultInstanceForType() {
            return Method.getDefaultInstance();
        }

        public Option.C4148 addOptionsBuilder(int i) {
            return (Option.C4148) internalGetOptionsFieldBuilder().m8020(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C4146(C4264 c4264) {
            this();
        }

        public /* synthetic */ C4146(InterfaceC4364 interfaceC4364, C4264 c4264) {
            this(interfaceC4364);
        }

        private C4146(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.name_ = "";
            this.requestTypeUrl_ = "";
            this.responseTypeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.syntax_ = 0;
            this.edition_ = "";
        }

        public C4146 addOptions(int i, Option option) {
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

        public C4146 setOptions(int i, Option option) {
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

        public C4146 addOptions(Option option) {
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

        public C4146 addOptions(int i, Option.C4148 c4148) {
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
        public C4146 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof Method) {
                return mergeFrom((Method) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4146 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
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
                                this.requestTypeUrl_ = abstractC4306.mo8265();
                                this.bitField0_ |= 2;
                            } else if (iMo8264 == 24) {
                                this.requestStreaming_ = abstractC4306.mo8279();
                                this.bitField0_ |= 4;
                            } else if (iMo8264 == 34) {
                                this.responseTypeUrl_ = abstractC4306.mo8265();
                                this.bitField0_ |= 8;
                            } else if (iMo8264 == 40) {
                                this.responseStreaming_ = abstractC4306.mo8279();
                                this.bitField0_ |= 16;
                            } else if (iMo8264 == 50) {
                                Option option = (Option) abstractC4306.mo8274(Option.parser(), c4529);
                                C4195 c4195 = this.optionsBuilder_;
                                if (c4195 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c4195.m8017(option);
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
    public Method getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Method parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (Method) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4146 newBuilderForType() {
        return newBuilder();
    }

    public static C4146 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Method parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (Method) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static Method parseFrom(ByteString byteString) {
        return (Method) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static Method parseFrom(ByteString byteString, C4529 c4529) {
        return (Method) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static Method parseFrom(byte[] bArr) {
        return (Method) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static Method parseFrom(byte[] bArr, C4529 c4529) {
        return (Method) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static Method parseFrom(InputStream inputStream) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, C4529 c4529) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static Method parseFrom(AbstractC4306 abstractC4306) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static Method parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }

    private Method(GeneratedMessage.AbstractC4137 abstractC4137) {
        super(abstractC4137);
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.requestStreaming_ = false;
        this.responseTypeUrl_ = "";
        this.responseStreaming_ = false;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public /* synthetic */ Method(GeneratedMessage.AbstractC4137 abstractC4137, C4264 c4264) {
        this(abstractC4137);
    }
}
