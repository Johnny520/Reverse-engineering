package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Method extends GeneratedMessage implements InterfaceC3433 {
    private static final Method DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static final InterfaceC3375 PARSER;
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
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Method");
        DEFAULT_INSTANCE = new Method();
        PARSER = new C3432();
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

    public static final C3663 getDescriptor() {
        return AbstractC3541.f11188;
    }

    public static C3314 newBuilder(Method method) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream) {
        return (Method) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) {
        return (Method) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3541.f11188;
    }

    @Override // com.google.protobuf.InterfaceC3433
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

    @Override // com.google.protobuf.InterfaceC3433
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

    @Override // com.google.protobuf.InterfaceC3433
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public Option getOptions(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3433
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.InterfaceC3433
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public InterfaceC3376 getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3433
    public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public String getRequestTypeUrl() {
        Object obj = this.requestTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.requestTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public ByteString getRequestTypeUrlBytes() {
        Object obj = this.requestTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.requestTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public String getResponseTypeUrl() {
        Object obj = this.responseTypeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.responseTypeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.InterfaceC3433
    public ByteString getResponseTypeUrlBytes() {
        Object obj = this.responseTypeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.responseTypeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
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
            iComputeStringSize += AbstractC3462.m7634(3);
        }
        if (!GeneratedMessage.isStringEmpty(this.responseTypeUrl_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(4, this.responseTypeUrl_);
        }
        if (this.responseStreaming_) {
            iComputeStringSize += AbstractC3462.m7634(5);
        }
        int size = this.options_.size();
        for (int i2 = 0; i2 < size; i2++) {
            iComputeStringSize += AbstractC3462.m7643(this.options_.get(i2));
        }
        int iComputeStringSize2 = iComputeStringSize + size;
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

    @Override // com.google.protobuf.InterfaceC3433
    @Deprecated
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.InterfaceC3433
    @Deprecated
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iM7503 = AbstractC3402.m7503(getResponseStreaming()) + ((((getResponseTypeUrl().hashCode() + ((((AbstractC3402.m7503(getRequestStreaming()) + ((((getRequestTypeUrl().hashCode() + ((((getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
        if (getOptionsCount() > 0) {
            iM7503 = getOptionsList().hashCode() + AbstractC2442.m4571(iM7503, 37, 6, 53);
        }
        int iHashCode = getUnknownFields().hashCode() + ((getEdition().hashCode() + ((((AbstractC2442.m4571(iM7503, 37, 7, 53) + this.syntax_) * 37) + 8) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3541.f11187;
        c3619.m7827(Method.class, C3314.class);
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
    public C3314 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3314(interfaceC3532, null);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3314 toBuilder() {
        C3432 c3432 = null;
        return this == DEFAULT_INSTANCE ? new C3314(c3432) : new C3314(c3432).mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(abstractC3462, 1, this.name_);
        }
        if (!GeneratedMessage.isStringEmpty(this.requestTypeUrl_)) {
            GeneratedMessage.writeString(abstractC3462, 2, this.requestTypeUrl_);
        }
        boolean z = this.requestStreaming_;
        if (z) {
            abstractC3462.mo7663(3, z);
        }
        if (!GeneratedMessage.isStringEmpty(this.responseTypeUrl_)) {
            GeneratedMessage.writeString(abstractC3462, 4, this.responseTypeUrl_);
        }
        boolean z2 = this.responseStreaming_;
        if (z2) {
            abstractC3462.mo7663(5, z2);
        }
        for (int i = 0; i < this.options_.size(); i++) {
            abstractC3462.mo7649(6, this.options_.get(i));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            abstractC3462.mo7651(7, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(abstractC3462, 8, this.edition_);
        }
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.Method$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3314 extends GeneratedMessage.AbstractC3305 implements InterfaceC3433 {
        private int bitField0_;
        private Object edition_;
        private Object name_;
        private C3363 optionsBuilder_;
        private List<Option> options_;
        private boolean requestStreaming_;
        private Object requestTypeUrl_;
        private boolean responseStreaming_;
        private Object responseTypeUrl_;
        private int syntax_;

        private C3314() {
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
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                method.options_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3541.f11188;
        }

        private C3363 internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new C3363(this.options_, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        public C3314 addAllOptions(Iterable<? extends Option> iterable) {
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

        public C3314 addOptions(Option.C3316 c3316) {
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
        public Method build() {
            Method methodBuildPartial = buildPartial();
            if (methodBuildPartial.isInitialized()) {
                return methodBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) methodBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public Method buildPartial() {
            Method method = new Method(this, null);
            buildPartialRepeatedFields(method);
            if (this.bitField0_ != 0) {
                buildPartial0(method);
            }
            onBuilt();
            return method;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3314 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            this.name_ = "";
            this.requestTypeUrl_ = "";
            this.requestStreaming_ = false;
            this.responseTypeUrl_ = "";
            this.responseStreaming_ = false;
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        @Deprecated
        public C3314 clearEdition() {
            this.edition_ = Method.getDefaultInstance().getEdition();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public C3314 clearName() {
            this.name_ = Method.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public C3314 clearOptions() {
            C3363 c3363 = this.optionsBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public C3314 clearRequestStreaming() {
            this.bitField0_ &= -5;
            this.requestStreaming_ = false;
            onChanged();
            return this;
        }

        public C3314 clearRequestTypeUrl() {
            this.requestTypeUrl_ = Method.getDefaultInstance().getRequestTypeUrl();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public C3314 clearResponseStreaming() {
            this.bitField0_ &= -17;
            this.responseStreaming_ = false;
            onChanged();
            return this;
        }

        public C3314 clearResponseTypeUrl() {
            this.responseTypeUrl_ = Method.getDefaultInstance().getResponseTypeUrl();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Deprecated
        public C3314 clearSyntax() {
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3541.f11188;
        }

        @Override // com.google.protobuf.InterfaceC3433
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

        @Override // com.google.protobuf.InterfaceC3433
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

        @Override // com.google.protobuf.InterfaceC3433
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3433
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3433
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

        @Override // com.google.protobuf.InterfaceC3433
        public int getOptionsCount() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3433
        public List<Option> getOptionsList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.options_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3433
        public InterfaceC3376 getOptionsOrBuilder(int i) {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 == null ? this.options_.get(i) : (InterfaceC3376) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3433
        public List<? extends InterfaceC3376> getOptionsOrBuilderList() {
            C3363 c3363 = this.optionsBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.InterfaceC3433
        public boolean getRequestStreaming() {
            return this.requestStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC3433
        public String getRequestTypeUrl() {
            Object obj = this.requestTypeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.requestTypeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3433
        public ByteString getRequestTypeUrlBytes() {
            Object obj = this.requestTypeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.requestTypeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3433
        public boolean getResponseStreaming() {
            return this.responseStreaming_;
        }

        @Override // com.google.protobuf.InterfaceC3433
        public String getResponseTypeUrl() {
            Object obj = this.responseTypeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.responseTypeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3433
        public ByteString getResponseTypeUrlBytes() {
            Object obj = this.responseTypeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.responseTypeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3433
        @Deprecated
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.InterfaceC3433
        @Deprecated
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3541.f11187;
            c3619.m7827(Method.class, C3314.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return true;
        }

        public C3314 mergeFrom(Method method) {
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
                boolean zIsEmpty = this.optionsBuilder_.f11012.isEmpty();
                C3363 c3363 = this.optionsBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.optionsBuilder_ = null;
                    this.options_ = method.options_;
                    this.bitField0_ &= -33;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                } else {
                    c3363.m7462(method.options_);
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

        public C3314 removeOptions(int i) {
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

        @Deprecated
        public C3314 setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        @Deprecated
        public C3314 setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public C3314 setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3314 setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public C3314 setOptions(int i, Option.C3316 c3316) {
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

        public C3314 setRequestStreaming(boolean z) {
            this.requestStreaming_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public C3314 setRequestTypeUrl(String str) {
            str.getClass();
            this.requestTypeUrl_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3314 setRequestTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.requestTypeUrl_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public C3314 setResponseStreaming(boolean z) {
            this.responseStreaming_ = z;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public C3314 setResponseTypeUrl(String str) {
            str.getClass();
            this.responseTypeUrl_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public C3314 setResponseTypeUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractC3529.checkByteStringIsUtf8(byteString);
            this.responseTypeUrl_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        @Deprecated
        public C3314 setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        @Deprecated
        public C3314 setSyntaxValue(int i) {
            this.syntax_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Method getDefaultInstanceForType() {
            return Method.getDefaultInstance();
        }

        public Option.C3316 addOptionsBuilder(int i) {
            return (Option.C3316) internalGetOptionsFieldBuilder().m7461(i, Option.getDefaultInstance());
        }

        public /* synthetic */ C3314(C3432 c3432) {
            this();
        }

        public /* synthetic */ C3314(InterfaceC3532 interfaceC3532, C3432 c3432) {
            this(interfaceC3532);
        }

        private C3314(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.name_ = "";
            this.requestTypeUrl_ = "";
            this.responseTypeUrl_ = "";
            this.options_ = Collections.EMPTY_LIST;
            this.syntax_ = 0;
            this.edition_ = "";
        }

        public C3314 addOptions(int i, Option option) {
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

        public C3314 setOptions(int i, Option option) {
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

        public C3314 addOptions(Option option) {
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

        public C3314 addOptions(int i, Option.C3316 c3316) {
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
        public C3314 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof Method) {
                return mergeFrom((Method) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3314 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
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
                                this.requestTypeUrl_ = abstractC3474.mo7706();
                                this.bitField0_ |= 2;
                            } else if (iMo7705 == 24) {
                                this.requestStreaming_ = abstractC3474.mo7720();
                                this.bitField0_ |= 4;
                            } else if (iMo7705 == 34) {
                                this.responseTypeUrl_ = abstractC3474.mo7706();
                                this.bitField0_ |= 8;
                            } else if (iMo7705 == 40) {
                                this.responseStreaming_ = abstractC3474.mo7720();
                                this.bitField0_ |= 16;
                            } else if (iMo7705 == 50) {
                                Option option = (Option) abstractC3474.mo7715(Option.parser(), c3697);
                                C3363 c3363 = this.optionsBuilder_;
                                if (c3363 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    c3363.m7458(option);
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
    public Method getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    public static Method parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (Method) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3314 newBuilderForType() {
        return newBuilder();
    }

    public static C3314 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Method parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (Method) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static Method parseFrom(ByteString byteString) {
        return (Method) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static Method parseFrom(ByteString byteString, C3697 c3697) {
        return (Method) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static Method parseFrom(byte[] bArr) {
        return (Method) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static Method parseFrom(byte[] bArr, C3697 c3697) {
        return (Method) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static Method parseFrom(InputStream inputStream) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, C3697 c3697) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static Method parseFrom(AbstractC3474 abstractC3474) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static Method parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (Method) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }

    private Method(GeneratedMessage.AbstractC3305 abstractC3305) {
        super(abstractC3305);
        this.name_ = "";
        this.requestTypeUrl_ = "";
        this.requestStreaming_ = false;
        this.responseTypeUrl_ = "";
        this.responseStreaming_ = false;
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public /* synthetic */ Method(GeneratedMessage.AbstractC3305 abstractC3305, C3432 c3432) {
        this(abstractC3305);
    }
}
