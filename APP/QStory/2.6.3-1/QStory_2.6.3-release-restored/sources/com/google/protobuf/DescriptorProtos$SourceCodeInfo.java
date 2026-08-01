package com.google.protobuf;

import androidx.profileinstaller.AbstractC3275;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$SourceCodeInfo extends GeneratedMessage.ExtendableMessage<DescriptorProtos$SourceCodeInfo> implements InterfaceC4482 {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static final InterfaceC4207 PARSER;
    private static final long serialVersionUID = 0;
    private List<Location> location_;
    private byte memoizedIsInitialized;

    static {
        AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "SourceCodeInfo");
        DEFAULT_INSTANCE = new DescriptorProtos$SourceCodeInfo();
        PARSER = new C4485();
    }

    private DescriptorProtos$SourceCodeInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.location_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C4495 getDescriptor() {
        return AbstractC4502.f11809;
    }

    public static C4125 newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
    }

    public static InterfaceC4207 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescriptorProtos$SourceCodeInfo)) {
            return super.equals(obj);
        }
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = (DescriptorProtos$SourceCodeInfo) obj;
        return getLocationList().equals(descriptorProtos$SourceCodeInfo.getLocationList()) && getUnknownFields().equals(descriptorProtos$SourceCodeInfo.getUnknownFields()) && getExtensionFields().equals(descriptorProtos$SourceCodeInfo.getExtensionFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return AbstractC4502.f11809;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
        return super.getExtension(abstractC4411);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
        return super.getExtensionCount(abstractC4411);
    }

    @Override // com.google.protobuf.InterfaceC4482
    public Location getLocation(int i) {
        return this.location_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4482
    public int getLocationCount() {
        return this.location_.size();
    }

    @Override // com.google.protobuf.InterfaceC4482
    public List<Location> getLocationList() {
        return this.location_;
    }

    @Override // com.google.protobuf.InterfaceC4482
    public InterfaceC4483 getLocationOrBuilder(int i) {
        return this.location_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC4482
    public List<? extends InterfaceC4483> getLocationOrBuilderList() {
        return this.location_;
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
        int size = this.location_.size();
        int iM8202 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM8202 += AbstractC4294.m8202(this.location_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM8202 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
        return super.hasExtension(abstractC4411);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getLocationCount() > 0) {
            iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getLocationList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC4365.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C4451 internalGetFieldAccessorTable() {
        C4451 c4451 = AbstractC4502.f11810;
        c4451.m8386(DescriptorProtos$SourceCodeInfo.class, C4125.class);
        return c4451;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.AbstractC4365
    public C4125 newBuilderForType(InterfaceC4364 interfaceC4364) {
        return new C4125(interfaceC4364);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4125 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C4125() : new C4125().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        InterfaceC4461 interfaceC4461NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.location_.size(); i++) {
            abstractC4294.mo8208(1, this.location_.get(i));
        }
        interfaceC4461NewExtensionSerializer.mo8387(536000001, abstractC4294);
        getUnknownFields().writeTo(abstractC4294);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Location extends GeneratedMessage implements InterfaceC4483 {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static final InterfaceC4207 PARSER;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object leadingComments_;
        private C4216 leadingDetachedComments_;
        private byte memoizedIsInitialized;
        private int pathMemoizedSerializedSize;
        private InterfaceC4227 path_;
        private int spanMemoizedSerializedSize;
        private InterfaceC4227 span_;
        private volatile Object trailingComments_;

        static {
            AbstractC4178.m7959(RuntimeVersion$RuntimeDomain.PUBLIC, "Location");
            DEFAULT_INSTANCE = new Location();
            PARSER = new C4484();
        }

        private Location() {
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.span_ = GeneratedMessage.emptyIntList();
            this.spanMemoizedSerializedSize = -1;
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            C4216 c4216 = C4216.f11382;
            this.leadingDetachedComments_ = c4216;
            this.memoizedIsInitialized = (byte) -1;
            this.path_ = GeneratedMessage.emptyIntList();
            this.span_ = GeneratedMessage.emptyIntList();
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            this.leadingDetachedComments_ = c4216;
        }

        public static /* synthetic */ int access$35576(Location location, int i) {
            int i2 = i | location.bitField0_;
            location.bitField0_ = i2;
            return i2;
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11806;
        }

        public static C4124 newBuilder(Location location) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream) {
            return (Location) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) {
            return (Location) ((AbstractC4360) PARSER).m8312(byteBuffer, AbstractC4360.f11519);
        }

        public static InterfaceC4207 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return super.equals(obj);
            }
            Location location = (Location) obj;
            if (!getPathList().equals(location.getPathList()) || !getSpanList().equals(location.getSpanList()) || hasLeadingComments() != location.hasLeadingComments()) {
                return false;
            }
            if ((!hasLeadingComments() || getLeadingComments().equals(location.getLeadingComments())) && hasTrailingComments() == location.hasTrailingComments()) {
                return (!hasTrailingComments() || getTrailingComments().equals(location.getTrailingComments())) && getLeadingDetachedCommentsList().equals(location.getLeadingDetachedCommentsList()) && getUnknownFields().equals(location.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11806;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public String getLeadingComments() {
            Object obj = this.leadingComments_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.leadingComments_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public ByteString getLeadingCommentsBytes() {
            Object obj = this.leadingComments_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.leadingComments_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public String getLeadingDetachedComments(int i) {
            return this.leadingDetachedComments_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC4483
        public ByteString getLeadingDetachedCommentsBytes(int i) {
            return this.leadingDetachedComments_.m8056(i);
        }

        @Override // com.google.protobuf.InterfaceC4483
        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.f11383.size();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public InterfaceC4207 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public int getPath(int i) {
            return ((C4445) this.path_).m8373(i);
        }

        @Override // com.google.protobuf.InterfaceC4483
        public int getPathCount() {
            return ((C4445) this.path_).size();
        }

        @Override // com.google.protobuf.InterfaceC4483
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int iM8197 = 0;
            while (true) {
                if (i2 >= ((C4445) this.path_).f11597) {
                    break;
                }
                iM8197 += AbstractC4294.m8197(((C4445) r3).m8373(i2));
                i2++;
            }
            int iM81972 = getPathList().isEmpty() ? iM8197 : AbstractC4294.m8197(iM8197) + iM8197 + 1;
            this.pathMemoizedSerializedSize = iM8197;
            int i3 = 0;
            int iM81973 = 0;
            while (true) {
                if (i3 >= ((C4445) this.span_).f11597) {
                    break;
                }
                iM81973 += AbstractC4294.m8197(((C4445) r4).m8373(i3));
                i3++;
            }
            int iComputeStringSize = iM81972 + iM81973;
            if (!getSpanList().isEmpty()) {
                iComputeStringSize = iComputeStringSize + 1 + AbstractC4294.m8197(iM81973);
            }
            this.spanMemoizedSerializedSize = iM81973;
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.trailingComments_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i4 = 0; i4 < this.leadingDetachedComments_.f11383.size(); i4++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.leadingDetachedComments_.f11383.get(i4));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getLeadingDetachedCommentsList().size() + iComputeStringSize + iComputeStringSizeNoTag;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public int getSpan(int i) {
            return ((C4445) this.span_).m8373(i);
        }

        @Override // com.google.protobuf.InterfaceC4483
        public int getSpanCount() {
            return ((C4445) this.span_).size();
        }

        @Override // com.google.protobuf.InterfaceC4483
        public List<Integer> getSpanList() {
            return this.span_;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public String getTrailingComments() {
            Object obj = this.trailingComments_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.trailingComments_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public ByteString getTrailingCommentsBytes() {
            Object obj = this.trailingComments_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.trailingComments_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC4483
        public boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getPathCount() > 0) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 1, 53) + getPathList().hashCode();
            }
            if (getSpanCount() > 0) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 2, 53) + getSpanList().hashCode();
            }
            if (hasLeadingComments()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 3, 53) + getLeadingComments().hashCode();
            }
            if (hasTrailingComments()) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 4, 53) + getTrailingComments().hashCode();
            }
            if (getLeadingDetachedCommentsCount() > 0) {
                iHashCode = AbstractC3275.m5131(iHashCode, 37, 6, 53) + getLeadingDetachedCommentsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11805;
            c4451.m8386(Location.class, C4124.class);
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
        public C4124 newBuilderForType(InterfaceC4364 interfaceC4364) {
            return new C4124(interfaceC4364);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4124 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C4124() : new C4124().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public void writeTo(AbstractC4294 abstractC4294) {
            getSerializedSize();
            if (getPathList().size() > 0) {
                abstractC4294.mo8204(10);
                abstractC4294.mo8204(this.pathMemoizedSerializedSize);
            }
            int i = 0;
            while (true) {
                C4445 c4445 = (C4445) this.path_;
                if (i >= c4445.f11597) {
                    break;
                }
                abstractC4294.mo8209(c4445.m8373(i));
                i++;
            }
            if (getSpanList().size() > 0) {
                abstractC4294.mo8204(18);
                abstractC4294.mo8204(this.spanMemoizedSerializedSize);
            }
            int i2 = 0;
            while (true) {
                C4445 c44452 = (C4445) this.span_;
                if (i2 >= c44452.f11597) {
                    break;
                }
                abstractC4294.mo8209(c44452.m8373(i2));
                i2++;
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC4294, 3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC4294, 4, this.trailingComments_);
            }
            for (int i3 = 0; i3 < this.leadingDetachedComments_.f11383.size(); i3++) {
                GeneratedMessage.writeString(abstractC4294, 6, this.leadingDetachedComments_.f11383.get(i3));
            }
            getUnknownFields().writeTo(abstractC4294);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C4124 extends GeneratedMessage.AbstractC4137 implements InterfaceC4483 {
            private int bitField0_;
            private Object leadingComments_;
            private C4216 leadingDetachedComments_;
            private InterfaceC4227 path_;
            private InterfaceC4227 span_;
            private Object trailingComments_;

            private C4124() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C4216.f11382;
            }

            private void buildPartial0(Location location) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    ((AbstractC4380) this.path_).m8346();
                    location.path_ = this.path_;
                }
                if ((i2 & 2) != 0) {
                    ((AbstractC4380) this.span_).m8346();
                    location.span_ = this.span_;
                }
                if ((i2 & 4) != 0) {
                    location.leadingComments_ = this.leadingComments_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 8) != 0) {
                    location.trailingComments_ = this.trailingComments_;
                    i |= 2;
                }
                if ((i2 & 16) != 0) {
                    this.leadingDetachedComments_.m8346();
                    location.leadingDetachedComments_ = this.leadingDetachedComments_;
                }
                Location.access$35576(location, i);
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                if (!this.leadingDetachedComments_.f11544) {
                    this.leadingDetachedComments_ = new C4216(this.leadingDetachedComments_);
                }
                this.bitField0_ |= 16;
            }

            private void ensurePathIsMutable() {
                InterfaceC4235 interfaceC4235 = this.path_;
                if (!((AbstractC4380) interfaceC4235).f11544) {
                    this.path_ = (InterfaceC4227) GeneratedMessage.makeMutableCopy(interfaceC4235);
                }
                this.bitField0_ |= 1;
            }

            private void ensureSpanIsMutable() {
                InterfaceC4235 interfaceC4235 = this.span_;
                if (!((AbstractC4380) interfaceC4235).f11544) {
                    this.span_ = (InterfaceC4227) GeneratedMessage.makeMutableCopy(interfaceC4235);
                }
                this.bitField0_ |= 2;
            }

            public static final C4495 getDescriptor() {
                return AbstractC4502.f11806;
            }

            public C4124 addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                AbstractC4362.addAll((Iterable) iterable, (List) this.leadingDetachedComments_);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C4124 addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC4362.addAll((Iterable) iterable, (List) this.path_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4124 addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                AbstractC4362.addAll((Iterable) iterable, (List) this.span_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4124 addLeadingDetachedComments(String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.m8052(str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C4124 addLeadingDetachedCommentsBytes(ByteString byteString) {
                byteString.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.mo8054(byteString);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C4124 addPath(int i) {
                ensurePathIsMutable();
                ((C4445) this.path_).m8371(i);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4124 addSpan(int i) {
                ensureSpanIsMutable();
                ((C4445) this.span_).m8371(i);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public Location build() {
                Location locationBuildPartial = buildPartial();
                if (locationBuildPartial.isInitialized()) {
                    return locationBuildPartial;
                }
                throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) locationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public Location buildPartial() {
                Location location = new Location(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(location);
                }
                onBuilt();
                return location;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            /* JADX INFO: renamed from: clear */
            public C4124 mo7901clear() {
                super.mo7901clear();
                this.bitField0_ = 0;
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C4216.f11382;
                return this;
            }

            public C4124 clearLeadingComments() {
                this.leadingComments_ = Location.getDefaultInstance().getLeadingComments();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C4124 clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = C4216.f11382;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public C4124 clearPath() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public C4124 clearSpan() {
                this.span_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C4124 clearTrailingComments() {
                this.trailingComments_ = Location.getDefaultInstance().getTrailingComments();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public C4495 getDescriptorForType() {
                return AbstractC4502.f11806;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public String getLeadingComments() {
                Object obj = this.leadingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.leadingComments_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public ByteString getLeadingCommentsBytes() {
                Object obj = this.leadingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.leadingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public String getLeadingDetachedComments(int i) {
                return this.leadingDetachedComments_.get(i);
            }

            @Override // com.google.protobuf.InterfaceC4483
            public ByteString getLeadingDetachedCommentsBytes(int i) {
                return this.leadingDetachedComments_.m8056(i);
            }

            @Override // com.google.protobuf.InterfaceC4483
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.f11383.size();
            }

            @Override // com.google.protobuf.InterfaceC4483
            public InterfaceC4209 getLeadingDetachedCommentsList() {
                this.leadingDetachedComments_.m8346();
                return this.leadingDetachedComments_;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public int getPath(int i) {
                return ((C4445) this.path_).m8373(i);
            }

            @Override // com.google.protobuf.InterfaceC4483
            public int getPathCount() {
                return ((C4445) this.path_).size();
            }

            @Override // com.google.protobuf.InterfaceC4483
            public List<Integer> getPathList() {
                ((AbstractC4380) this.path_).m8346();
                return this.path_;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public int getSpan(int i) {
                return ((C4445) this.span_).m8373(i);
            }

            @Override // com.google.protobuf.InterfaceC4483
            public int getSpanCount() {
                return ((C4445) this.span_).size();
            }

            @Override // com.google.protobuf.InterfaceC4483
            public List<Integer> getSpanList() {
                ((AbstractC4380) this.span_).m8346();
                return this.span_;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public String getTrailingComments() {
                Object obj = this.trailingComments_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.trailingComments_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public ByteString getTrailingCommentsBytes() {
                Object obj = this.trailingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.trailingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC4483
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
            public C4451 internalGetFieldAccessorTable() {
                C4451 c4451 = AbstractC4502.f11805;
                c4451.m8386(Location.class, C4124.class);
                return c4451;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
            public final boolean isInitialized() {
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C4124 mergeFrom(Location location) {
                if (location == Location.getDefaultInstance()) {
                    return this;
                }
                if (!location.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        InterfaceC4227 interfaceC4227 = location.path_;
                        this.path_ = interfaceC4227;
                        ((AbstractC4380) interfaceC4227).m8346();
                        this.bitField0_ |= 1;
                    } else {
                        ensurePathIsMutable();
                        ((C4445) this.path_).addAll(location.path_);
                    }
                    onChanged();
                }
                if (!location.span_.isEmpty()) {
                    if (this.span_.isEmpty()) {
                        InterfaceC4227 interfaceC42272 = location.span_;
                        this.span_ = interfaceC42272;
                        ((AbstractC4380) interfaceC42272).m8346();
                        this.bitField0_ |= 2;
                    } else {
                        ensureSpanIsMutable();
                        ((C4445) this.span_).addAll(location.span_);
                    }
                    onChanged();
                }
                if (location.hasLeadingComments()) {
                    this.leadingComments_ = location.leadingComments_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (location.hasTrailingComments()) {
                    this.trailingComments_ = location.trailingComments_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!location.leadingDetachedComments_.isEmpty()) {
                    if (this.leadingDetachedComments_.isEmpty()) {
                        this.leadingDetachedComments_ = location.leadingDetachedComments_;
                        this.bitField0_ |= 16;
                    } else {
                        ensureLeadingDetachedCommentsIsMutable();
                        this.leadingDetachedComments_.addAll(location.leadingDetachedComments_);
                    }
                    onChanged();
                }
                mergeUnknownFields(location.getUnknownFields());
                onChanged();
                return this;
            }

            public C4124 setLeadingComments(String str) {
                str.getClass();
                this.leadingComments_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4124 setLeadingCommentsBytes(ByteString byteString) {
                byteString.getClass();
                this.leadingComments_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C4124 setLeadingDetachedComments(int i, String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i, str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C4124 setPath(int i, int i2) {
                ensurePathIsMutable();
                ((C4445) this.path_).m8374(i, i2);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C4124 setSpan(int i, int i2) {
                ensureSpanIsMutable();
                ((C4445) this.span_).m8374(i, i2);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C4124 setTrailingComments(String str) {
                str.getClass();
                this.trailingComments_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C4124 setTrailingCommentsBytes(ByteString byteString) {
                byteString.getClass();
                this.trailingComments_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
            public Location getDefaultInstanceForType() {
                return Location.getDefaultInstance();
            }

            private C4124(InterfaceC4364 interfaceC4364) {
                super(interfaceC4364);
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C4216.f11382;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
            public C4124 mergeFrom(InterfaceC4285 interfaceC4285) {
                if (interfaceC4285 instanceof Location) {
                    return mergeFrom((Location) interfaceC4285);
                }
                super.mergeFrom(interfaceC4285);
                return this;
            }

            @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
            public C4124 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
                c4529.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo8264 = abstractC4306.mo8264();
                            if (iMo8264 != 0) {
                                if (iMo8264 == 8) {
                                    int iMo8276 = abstractC4306.mo8276();
                                    ensurePathIsMutable();
                                    ((C4445) this.path_).m8371(iMo8276);
                                } else if (iMo8264 == 10) {
                                    int iMo8286 = abstractC4306.mo8286(abstractC4306.mo8260());
                                    ensurePathIsMutable();
                                    while (abstractC4306.mo8269() > 0) {
                                        ((C4445) this.path_).m8371(abstractC4306.mo8276());
                                    }
                                    abstractC4306.mo8285(iMo8286);
                                } else if (iMo8264 == 16) {
                                    int iMo82762 = abstractC4306.mo8276();
                                    ensureSpanIsMutable();
                                    ((C4445) this.span_).m8371(iMo82762);
                                } else if (iMo8264 == 18) {
                                    int iMo82862 = abstractC4306.mo8286(abstractC4306.mo8260());
                                    ensureSpanIsMutable();
                                    while (abstractC4306.mo8269() > 0) {
                                        ((C4445) this.span_).m8371(abstractC4306.mo8276());
                                    }
                                    abstractC4306.mo8285(iMo82862);
                                } else if (iMo8264 == 26) {
                                    this.leadingComments_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 4;
                                } else if (iMo8264 == 34) {
                                    this.trailingComments_ = abstractC4306.mo8278();
                                    this.bitField0_ |= 8;
                                } else if (iMo8264 != 50) {
                                    if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                    }
                                } else {
                                    ByteString byteStringMo8278 = abstractC4306.mo8278();
                                    ensureLeadingDetachedCommentsIsMutable();
                                    this.leadingDetachedComments_.mo8054(byteStringMo8278);
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

        @Override // com.google.protobuf.InterfaceC4483
        public InterfaceC4209 getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public Location getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Location parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
            return (Location) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public C4124 newBuilderForType() {
            return newBuilder();
        }

        public static C4124 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Location parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
            return (Location) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
        }

        public static Location parseFrom(ByteString byteString) {
            return (Location) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
        }

        public static Location parseFrom(ByteString byteString, C4529 c4529) {
            return (Location) ((AbstractC4360) PARSER).m8313(byteString, c4529);
        }

        public static Location parseFrom(byte[] bArr) {
            return (Location) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
        }

        public static Location parseFrom(byte[] bArr, C4529 c4529) {
            return (Location) ((AbstractC4360) PARSER).m8311(bArr, c4529);
        }

        public static Location parseFrom(InputStream inputStream) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, C4529 c4529) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
        }

        public static Location parseFrom(AbstractC4306 abstractC4306) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
        }

        public static Location parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
        }

        private Location(GeneratedMessage.AbstractC4137 abstractC4137) {
            super(abstractC4137);
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.span_ = GeneratedMessage.emptyIntList();
            this.spanMemoizedSerializedSize = -1;
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            this.leadingDetachedComments_ = C4216.f11382;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C4125 extends GeneratedMessage.AbstractC4136 implements InterfaceC4482 {
        private int bitField0_;
        private C4195 locationBuilder_;
        private List<Location> location_;

        private C4125() {
            this.location_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 != null) {
                descriptorProtos$SourceCodeInfo.location_ = c4195.m8031();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.location_ = Collections.unmodifiableList(this.location_);
                this.bitField0_ &= -2;
            }
            descriptorProtos$SourceCodeInfo.location_ = this.location_;
        }

        private void ensureLocationIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.location_ = new ArrayList(this.location_);
                this.bitField0_ |= 1;
            }
        }

        public static final C4495 getDescriptor() {
            return AbstractC4502.f11809;
        }

        private C4195 internalGetLocationFieldBuilder() {
            if (this.locationBuilder_ == null) {
                this.locationBuilder_ = new C4195(this.location_, getParentForChildren(), isClean());
                this.location_ = null;
            }
            return this.locationBuilder_;
        }

        public C4125 addAllLocation(Iterable<? extends Location> iterable) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 != null) {
                c4195.m8021(iterable);
                return this;
            }
            ensureLocationIsMutable();
            AbstractC4362.addAll((Iterable) iterable, (List) this.location_);
            onChanged();
            return this;
        }

        public <Type> C4125 addExtension(C4448 c4448, Type type) {
            return (C4125) addExtension((AbstractC4411) c4448, type);
        }

        public C4125 addLocation(Location.C4124 c4124) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 != null) {
                c4195.m8017(c4124.build());
                return this;
            }
            ensureLocationIsMutable();
            this.location_.add(c4124.build());
            onChanged();
            return this;
        }

        public Location.C4124 addLocationBuilder() {
            return (Location.C4124) internalGetLocationFieldBuilder().m8019(Location.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$SourceCodeInfo build() {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfoBuildPartial = buildPartial();
            if (descriptorProtos$SourceCodeInfoBuildPartial.isInitialized()) {
                return descriptorProtos$SourceCodeInfoBuildPartial;
            }
            throw AbstractC4365.AbstractC4366.newUninitializedMessageException((InterfaceC4285) descriptorProtos$SourceCodeInfoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public DescriptorProtos$SourceCodeInfo buildPartial() {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo(this);
            buildPartialRepeatedFields(descriptorProtos$SourceCodeInfo);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$SourceCodeInfo);
            }
            onBuilt();
            return descriptorProtos$SourceCodeInfo;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public C4125 mo7901clear() {
            super.mo7901clear();
            this.bitField0_ = 0;
            C4195 c4195 = this.locationBuilder_;
            if (c4195 == null) {
                this.location_ = Collections.EMPTY_LIST;
            } else {
                this.location_ = null;
                c4195.m8030();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public <Type> C4125 clearExtension(C4448 c4448) {
            return (C4125) clearExtension((AbstractC4411) c4448);
        }

        public C4125 clearLocation() {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 != null) {
                c4195.m8030();
                return this;
            }
            this.location_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return AbstractC4502.f11809;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4482
        public Location getLocation(int i) {
            C4195 c4195 = this.locationBuilder_;
            return c4195 == null ? this.location_.get(i) : (Location) c4195.m8025(i, false);
        }

        public Location.C4124 getLocationBuilder(int i) {
            return (Location.C4124) internalGetLocationFieldBuilder().m8032(i);
        }

        public List<Location.C4124> getLocationBuilderList() {
            return internalGetLocationFieldBuilder().m8033();
        }

        @Override // com.google.protobuf.InterfaceC4482
        public int getLocationCount() {
            C4195 c4195 = this.locationBuilder_;
            return c4195 == null ? this.location_.size() : c4195.f11357.size();
        }

        @Override // com.google.protobuf.InterfaceC4482
        public List<Location> getLocationList() {
            C4195 c4195 = this.locationBuilder_;
            return c4195 == null ? Collections.unmodifiableList(this.location_) : c4195.m8024();
        }

        @Override // com.google.protobuf.InterfaceC4482
        public InterfaceC4483 getLocationOrBuilder(int i) {
            C4195 c4195 = this.locationBuilder_;
            return c4195 == null ? this.location_.get(i) : (InterfaceC4483) c4195.m8028(i);
        }

        @Override // com.google.protobuf.InterfaceC4482
        public List<? extends InterfaceC4483> getLocationOrBuilderList() {
            C4195 c4195 = this.locationBuilder_;
            return c4195 != null ? c4195.m8029() : Collections.unmodifiableList(this.location_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public C4451 internalGetFieldAccessorTable() {
            C4451 c4451 = AbstractC4502.f11810;
            c4451.m8386(DescriptorProtos$SourceCodeInfo.class, C4125.class);
            return c4451;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public final boolean isInitialized() {
            return extensionsAreInitialized();
        }

        public C4125 mergeFrom(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            if (descriptorProtos$SourceCodeInfo == DescriptorProtos$SourceCodeInfo.getDefaultInstance()) {
                return this;
            }
            if (this.locationBuilder_ == null) {
                if (!descriptorProtos$SourceCodeInfo.location_.isEmpty()) {
                    if (this.location_.isEmpty()) {
                        this.location_ = descriptorProtos$SourceCodeInfo.location_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureLocationIsMutable();
                        this.location_.addAll(descriptorProtos$SourceCodeInfo.location_);
                    }
                    onChanged();
                }
            } else if (!descriptorProtos$SourceCodeInfo.location_.isEmpty()) {
                boolean zIsEmpty = this.locationBuilder_.f11357.isEmpty();
                C4195 c4195 = this.locationBuilder_;
                if (zIsEmpty) {
                    c4195.f11358 = null;
                    this.locationBuilder_ = null;
                    this.location_ = descriptorProtos$SourceCodeInfo.location_;
                    this.bitField0_ &= -2;
                    this.locationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetLocationFieldBuilder() : null;
                } else {
                    c4195.m8021(descriptorProtos$SourceCodeInfo.location_);
                }
            }
            mergeExtensionFields(descriptorProtos$SourceCodeInfo);
            mergeUnknownFields(descriptorProtos$SourceCodeInfo.getUnknownFields());
            onChanged();
            return this;
        }

        public C4125 removeLocation(int i) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 != null) {
                c4195.m8023(i);
                return this;
            }
            ensureLocationIsMutable();
            this.location_.remove(i);
            onChanged();
            return this;
        }

        public <Type> C4125 setExtension(C4448 c4448, Type type) {
            return (C4125) setExtension((AbstractC4411) c4448, type);
        }

        public C4125 setLocation(int i, Location.C4124 c4124) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 != null) {
                c4195.m8022(i, c4124.build());
                return this;
            }
            ensureLocationIsMutable();
            this.location_.set(i, c4124.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public DescriptorProtos$SourceCodeInfo getDefaultInstanceForType() {
            return DescriptorProtos$SourceCodeInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4136, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public <Type> C4125 setExtension(C4448 c4448, int i, Type type) {
            return (C4125) setExtension((AbstractC4411) c4448, i, type);
        }

        private C4125(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
            this.location_ = Collections.EMPTY_LIST;
        }

        public Location.C4124 addLocationBuilder(int i) {
            return (Location.C4124) internalGetLocationFieldBuilder().m8020(i, Location.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        }

        public C4125 addLocation(int i, Location location) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.add(i, location);
                onChanged();
                return this;
            }
            c4195.m8018(i, location);
            return this;
        }

        public C4125 setLocation(int i, Location location) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.set(i, location);
                onChanged();
                return this;
            }
            c4195.m8022(i, location);
            return this;
        }

        public C4125 addLocation(Location location) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.add(location);
                onChanged();
                return this;
            }
            c4195.m8017(location);
            return this;
        }

        public C4125 addLocation(int i, Location.C4124 c4124) {
            C4195 c4195 = this.locationBuilder_;
            if (c4195 == null) {
                ensureLocationIsMutable();
                this.location_.add(i, c4124.build());
                onChanged();
                return this;
            }
            c4195.m8018(i, c4124.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4125 mergeFrom(InterfaceC4285 interfaceC4285) {
            if (interfaceC4285 instanceof DescriptorProtos$SourceCodeInfo) {
                return mergeFrom((DescriptorProtos$SourceCodeInfo) interfaceC4285);
            }
            super.mergeFrom(interfaceC4285);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public C4125 mergeFrom(AbstractC4306 abstractC4306, C4529 c4529) {
            c4529.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo8264 = abstractC4306.mo8264();
                        if (iMo8264 != 0) {
                            if (iMo8264 != 10) {
                                if (!super.parseUnknownField(abstractC4306, c4529, iMo8264)) {
                                }
                            } else {
                                Location location = (Location) abstractC4306.mo8274(Location.parser(), c4529);
                                C4195 c4195 = this.locationBuilder_;
                                if (c4195 == null) {
                                    ensureLocationIsMutable();
                                    this.location_.add(location);
                                } else {
                                    c4195.m8017(location);
                                }
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
        return super.getExtension(abstractC4411, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
        return super.getExtensionCount(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
        return super.hasExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public DescriptorProtos$SourceCodeInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
        return super.getExtension(c4448);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC4459, com.google.protobuf.InterfaceC4390
    public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
        return super.getExtension(c4448, i);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c4529);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public C4125 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$SourceCodeInfo(GeneratedMessage.AbstractC4136 abstractC4136) {
        super(abstractC4136);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C4125 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, C4529 c4529) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC4360) PARSER).m8312(byteBuffer, c4529);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC4360) PARSER).m8313(byteString, AbstractC4360.f11519);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString, C4529 c4529) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC4360) PARSER).m8313(byteString, c4529);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC4360) PARSER).m8311(bArr, AbstractC4360.f11519);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, C4529 c4529) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC4360) PARSER).m8311(bArr, c4529);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, C4529 c4529) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, c4529);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC4306 abstractC4306) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC4306);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC4306 abstractC4306, C4529 c4529) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC4306, c4529);
    }
}
