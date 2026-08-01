package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$SourceCodeInfo extends GeneratedMessage.ExtendableMessage<DescriptorProtos$SourceCodeInfo> implements InterfaceC3650 {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static final InterfaceC3375 PARSER;
    private static final long serialVersionUID = 0;
    private List<Location> location_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "SourceCodeInfo");
        DEFAULT_INSTANCE = new DescriptorProtos$SourceCodeInfo();
        PARSER = new C3653();
    }

    private DescriptorProtos$SourceCodeInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.location_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3663 getDescriptor() {
        return AbstractC3670.f11464;
    }

    public static C3293 newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
    }

    public static InterfaceC3375 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return AbstractC3670.f11464;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
        return super.getExtension(abstractC3579);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
        return super.getExtensionCount(abstractC3579);
    }

    @Override // com.google.protobuf.InterfaceC3650
    public Location getLocation(int i) {
        return this.location_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3650
    public int getLocationCount() {
        return this.location_.size();
    }

    @Override // com.google.protobuf.InterfaceC3650
    public List<Location> getLocationList() {
        return this.location_;
    }

    @Override // com.google.protobuf.InterfaceC3650
    public InterfaceC3651 getLocationOrBuilder(int i) {
        return this.location_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3650
    public List<? extends InterfaceC3651> getLocationOrBuilderList() {
        return this.location_;
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
        int size = this.location_.size();
        int iM7643 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7643 += AbstractC3462.m7643(this.location_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM7643 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
        return super.hasExtension(abstractC3579);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getLocationCount() > 0) {
            iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getLocationList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3533.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3619 internalGetFieldAccessorTable() {
        C3619 c3619 = AbstractC3670.f11465;
        c3619.m7827(DescriptorProtos$SourceCodeInfo.class, C3293.class);
        return c3619;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
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

    @Override // com.google.protobuf.AbstractC3533
    public C3293 newBuilderForType(InterfaceC3532 interfaceC3532) {
        return new C3293(interfaceC3532);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3293 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3293() : new C3293().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        InterfaceC3629 interfaceC3629NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.location_.size(); i++) {
            abstractC3462.mo7649(1, this.location_.get(i));
        }
        interfaceC3629NewExtensionSerializer.mo7828(536000001, abstractC3462);
        getUnknownFields().writeTo(abstractC3462);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Location extends GeneratedMessage implements InterfaceC3651 {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static final InterfaceC3375 PARSER;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object leadingComments_;
        private C3384 leadingDetachedComments_;
        private byte memoizedIsInitialized;
        private int pathMemoizedSerializedSize;
        private InterfaceC3395 path_;
        private int spanMemoizedSerializedSize;
        private InterfaceC3395 span_;
        private volatile Object trailingComments_;

        static {
            AbstractC3346.m7400(RuntimeVersion$RuntimeDomain.PUBLIC, "Location");
            DEFAULT_INSTANCE = new Location();
            PARSER = new C3652();
        }

        private Location() {
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.span_ = GeneratedMessage.emptyIntList();
            this.spanMemoizedSerializedSize = -1;
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            C3384 c3384 = C3384.f11037;
            this.leadingDetachedComments_ = c3384;
            this.memoizedIsInitialized = (byte) -1;
            this.path_ = GeneratedMessage.emptyIntList();
            this.span_ = GeneratedMessage.emptyIntList();
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            this.leadingDetachedComments_ = c3384;
        }

        public static /* synthetic */ int access$35576(Location location, int i) {
            int i2 = i | location.bitField0_;
            location.bitField0_ = i2;
            return i2;
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11461;
        }

        public static C3292 newBuilder(Location location) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream) {
            return (Location) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) {
            return (Location) ((AbstractC3528) PARSER).m7753(byteBuffer, AbstractC3528.f11174);
        }

        public static InterfaceC3375 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11461;
        }

        @Override // com.google.protobuf.InterfaceC3651
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

        @Override // com.google.protobuf.InterfaceC3651
        public ByteString getLeadingCommentsBytes() {
            Object obj = this.leadingComments_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.leadingComments_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3651
        public String getLeadingDetachedComments(int i) {
            return this.leadingDetachedComments_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3651
        public ByteString getLeadingDetachedCommentsBytes(int i) {
            return this.leadingDetachedComments_.m7497(i);
        }

        @Override // com.google.protobuf.InterfaceC3651
        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.f11038.size();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public InterfaceC3375 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3651
        public int getPath(int i) {
            return ((C3613) this.path_).m7814(i);
        }

        @Override // com.google.protobuf.InterfaceC3651
        public int getPathCount() {
            return ((C3613) this.path_).size();
        }

        @Override // com.google.protobuf.InterfaceC3651
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int iM7638 = 0;
            while (true) {
                if (i2 >= ((C3613) this.path_).f11252) {
                    break;
                }
                iM7638 += AbstractC3462.m7638(((C3613) r3).m7814(i2));
                i2++;
            }
            int iM76382 = getPathList().isEmpty() ? iM7638 : AbstractC3462.m7638(iM7638) + iM7638 + 1;
            this.pathMemoizedSerializedSize = iM7638;
            int i3 = 0;
            int iM76383 = 0;
            while (true) {
                if (i3 >= ((C3613) this.span_).f11252) {
                    break;
                }
                iM76383 += AbstractC3462.m7638(((C3613) r4).m7814(i3));
                i3++;
            }
            int iComputeStringSize = iM76382 + iM76383;
            if (!getSpanList().isEmpty()) {
                iComputeStringSize = iComputeStringSize + 1 + AbstractC3462.m7638(iM76383);
            }
            this.spanMemoizedSerializedSize = iM76383;
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.trailingComments_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i4 = 0; i4 < this.leadingDetachedComments_.f11038.size(); i4++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.leadingDetachedComments_.f11038.get(i4));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getLeadingDetachedCommentsList().size() + iComputeStringSize + iComputeStringSizeNoTag;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3651
        public int getSpan(int i) {
            return ((C3613) this.span_).m7814(i);
        }

        @Override // com.google.protobuf.InterfaceC3651
        public int getSpanCount() {
            return ((C3613) this.span_).size();
        }

        @Override // com.google.protobuf.InterfaceC3651
        public List<Integer> getSpanList() {
            return this.span_;
        }

        @Override // com.google.protobuf.InterfaceC3651
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

        @Override // com.google.protobuf.InterfaceC3651
        public ByteString getTrailingCommentsBytes() {
            Object obj = this.trailingComments_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.trailingComments_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3651
        public boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3651
        public boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getPathCount() > 0) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 1, 53) + getPathList().hashCode();
            }
            if (getSpanCount() > 0) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 2, 53) + getSpanList().hashCode();
            }
            if (hasLeadingComments()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 3, 53) + getLeadingComments().hashCode();
            }
            if (hasTrailingComments()) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 4, 53) + getTrailingComments().hashCode();
            }
            if (getLeadingDetachedCommentsCount() > 0) {
                iHashCode = AbstractC2442.m4571(iHashCode, 37, 6, 53) + getLeadingDetachedCommentsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11460;
            c3619.m7827(Location.class, C3292.class);
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
        public C3292 newBuilderForType(InterfaceC3532 interfaceC3532) {
            return new C3292(interfaceC3532);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3292 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3292() : new C3292().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public void writeTo(AbstractC3462 abstractC3462) {
            getSerializedSize();
            if (getPathList().size() > 0) {
                abstractC3462.mo7645(10);
                abstractC3462.mo7645(this.pathMemoizedSerializedSize);
            }
            int i = 0;
            while (true) {
                C3613 c3613 = (C3613) this.path_;
                if (i >= c3613.f11252) {
                    break;
                }
                abstractC3462.mo7650(c3613.m7814(i));
                i++;
            }
            if (getSpanList().size() > 0) {
                abstractC3462.mo7645(18);
                abstractC3462.mo7645(this.spanMemoizedSerializedSize);
            }
            int i2 = 0;
            while (true) {
                C3613 c36132 = (C3613) this.span_;
                if (i2 >= c36132.f11252) {
                    break;
                }
                abstractC3462.mo7650(c36132.m7814(i2));
                i2++;
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC3462, 3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3462, 4, this.trailingComments_);
            }
            for (int i3 = 0; i3 < this.leadingDetachedComments_.f11038.size(); i3++) {
                GeneratedMessage.writeString(abstractC3462, 6, this.leadingDetachedComments_.f11038.get(i3));
            }
            getUnknownFields().writeTo(abstractC3462);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static final class C3292 extends GeneratedMessage.AbstractC3305 implements InterfaceC3651 {
            private int bitField0_;
            private Object leadingComments_;
            private C3384 leadingDetachedComments_;
            private InterfaceC3395 path_;
            private InterfaceC3395 span_;
            private Object trailingComments_;

            private C3292() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C3384.f11037;
            }

            private void buildPartial0(Location location) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    ((AbstractC3548) this.path_).m7787();
                    location.path_ = this.path_;
                }
                if ((i2 & 2) != 0) {
                    ((AbstractC3548) this.span_).m7787();
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
                    this.leadingDetachedComments_.m7787();
                    location.leadingDetachedComments_ = this.leadingDetachedComments_;
                }
                Location.access$35576(location, i);
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                if (!this.leadingDetachedComments_.f11199) {
                    this.leadingDetachedComments_ = new C3384(this.leadingDetachedComments_);
                }
                this.bitField0_ |= 16;
            }

            private void ensurePathIsMutable() {
                InterfaceC3403 interfaceC3403 = this.path_;
                if (!((AbstractC3548) interfaceC3403).f11199) {
                    this.path_ = (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3403);
                }
                this.bitField0_ |= 1;
            }

            private void ensureSpanIsMutable() {
                InterfaceC3403 interfaceC3403 = this.span_;
                if (!((AbstractC3548) interfaceC3403).f11199) {
                    this.span_ = (InterfaceC3395) GeneratedMessage.makeMutableCopy(interfaceC3403);
                }
                this.bitField0_ |= 2;
            }

            public static final C3663 getDescriptor() {
                return AbstractC3670.f11461;
            }

            public C3292 addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                AbstractC3530.addAll((Iterable) iterable, (List) this.leadingDetachedComments_);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3292 addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC3530.addAll((Iterable) iterable, (List) this.path_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3292 addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                AbstractC3530.addAll((Iterable) iterable, (List) this.span_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3292 addLeadingDetachedComments(String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.m7493(str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3292 addLeadingDetachedCommentsBytes(ByteString byteString) {
                byteString.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.mo7495(byteString);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3292 addPath(int i) {
                ensurePathIsMutable();
                ((C3613) this.path_).m7812(i);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3292 addSpan(int i) {
                ensureSpanIsMutable();
                ((C3613) this.span_).m7812(i);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public Location build() {
                Location locationBuildPartial = buildPartial();
                if (locationBuildPartial.isInitialized()) {
                    return locationBuildPartial;
                }
                throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) locationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public Location buildPartial() {
                Location location = new Location(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(location);
                }
                onBuilt();
                return location;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            /* JADX INFO: renamed from: clear */
            public C3292 mo7342clear() {
                super.mo7342clear();
                this.bitField0_ = 0;
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C3384.f11037;
                return this;
            }

            public C3292 clearLeadingComments() {
                this.leadingComments_ = Location.getDefaultInstance().getLeadingComments();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C3292 clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = C3384.f11037;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public C3292 clearPath() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public C3292 clearSpan() {
                this.span_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C3292 clearTrailingComments() {
                this.trailingComments_ = Location.getDefaultInstance().getTrailingComments();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public C3663 getDescriptorForType() {
                return AbstractC3670.f11461;
            }

            @Override // com.google.protobuf.InterfaceC3651
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

            @Override // com.google.protobuf.InterfaceC3651
            public ByteString getLeadingCommentsBytes() {
                Object obj = this.leadingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.leadingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3651
            public String getLeadingDetachedComments(int i) {
                return this.leadingDetachedComments_.get(i);
            }

            @Override // com.google.protobuf.InterfaceC3651
            public ByteString getLeadingDetachedCommentsBytes(int i) {
                return this.leadingDetachedComments_.m7497(i);
            }

            @Override // com.google.protobuf.InterfaceC3651
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.f11038.size();
            }

            @Override // com.google.protobuf.InterfaceC3651
            public InterfaceC3377 getLeadingDetachedCommentsList() {
                this.leadingDetachedComments_.m7787();
                return this.leadingDetachedComments_;
            }

            @Override // com.google.protobuf.InterfaceC3651
            public int getPath(int i) {
                return ((C3613) this.path_).m7814(i);
            }

            @Override // com.google.protobuf.InterfaceC3651
            public int getPathCount() {
                return ((C3613) this.path_).size();
            }

            @Override // com.google.protobuf.InterfaceC3651
            public List<Integer> getPathList() {
                ((AbstractC3548) this.path_).m7787();
                return this.path_;
            }

            @Override // com.google.protobuf.InterfaceC3651
            public int getSpan(int i) {
                return ((C3613) this.span_).m7814(i);
            }

            @Override // com.google.protobuf.InterfaceC3651
            public int getSpanCount() {
                return ((C3613) this.span_).size();
            }

            @Override // com.google.protobuf.InterfaceC3651
            public List<Integer> getSpanList() {
                ((AbstractC3548) this.span_).m7787();
                return this.span_;
            }

            @Override // com.google.protobuf.InterfaceC3651
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

            @Override // com.google.protobuf.InterfaceC3651
            public ByteString getTrailingCommentsBytes() {
                Object obj = this.trailingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.trailingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3651
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3651
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
            public C3619 internalGetFieldAccessorTable() {
                C3619 c3619 = AbstractC3670.f11460;
                c3619.m7827(Location.class, C3292.class);
                return c3619;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
            public final boolean isInitialized() {
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3292 mergeFrom(Location location) {
                if (location == Location.getDefaultInstance()) {
                    return this;
                }
                if (!location.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        InterfaceC3395 interfaceC3395 = location.path_;
                        this.path_ = interfaceC3395;
                        ((AbstractC3548) interfaceC3395).m7787();
                        this.bitField0_ |= 1;
                    } else {
                        ensurePathIsMutable();
                        ((C3613) this.path_).addAll(location.path_);
                    }
                    onChanged();
                }
                if (!location.span_.isEmpty()) {
                    if (this.span_.isEmpty()) {
                        InterfaceC3395 interfaceC33952 = location.span_;
                        this.span_ = interfaceC33952;
                        ((AbstractC3548) interfaceC33952).m7787();
                        this.bitField0_ |= 2;
                    } else {
                        ensureSpanIsMutable();
                        ((C3613) this.span_).addAll(location.span_);
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

            public C3292 setLeadingComments(String str) {
                str.getClass();
                this.leadingComments_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3292 setLeadingCommentsBytes(ByteString byteString) {
                byteString.getClass();
                this.leadingComments_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3292 setLeadingDetachedComments(int i, String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i, str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3292 setPath(int i, int i2) {
                ensurePathIsMutable();
                ((C3613) this.path_).m7815(i, i2);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3292 setSpan(int i, int i2) {
                ensureSpanIsMutable();
                ((C3613) this.span_).m7815(i, i2);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3292 setTrailingComments(String str) {
                str.getClass();
                this.trailingComments_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3292 setTrailingCommentsBytes(ByteString byteString) {
                byteString.getClass();
                this.trailingComments_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
            public Location getDefaultInstanceForType() {
                return Location.getDefaultInstance();
            }

            private C3292(InterfaceC3532 interfaceC3532) {
                super(interfaceC3532);
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C3384.f11037;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
            public C3292 mergeFrom(InterfaceC3453 interfaceC3453) {
                if (interfaceC3453 instanceof Location) {
                    return mergeFrom((Location) interfaceC3453);
                }
                super.mergeFrom(interfaceC3453);
                return this;
            }

            @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
            public C3292 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
                c3697.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7705 = abstractC3474.mo7705();
                            if (iMo7705 != 0) {
                                if (iMo7705 == 8) {
                                    int iMo7717 = abstractC3474.mo7717();
                                    ensurePathIsMutable();
                                    ((C3613) this.path_).m7812(iMo7717);
                                } else if (iMo7705 == 10) {
                                    int iMo7727 = abstractC3474.mo7727(abstractC3474.mo7701());
                                    ensurePathIsMutable();
                                    while (abstractC3474.mo7710() > 0) {
                                        ((C3613) this.path_).m7812(abstractC3474.mo7717());
                                    }
                                    abstractC3474.mo7726(iMo7727);
                                } else if (iMo7705 == 16) {
                                    int iMo77172 = abstractC3474.mo7717();
                                    ensureSpanIsMutable();
                                    ((C3613) this.span_).m7812(iMo77172);
                                } else if (iMo7705 == 18) {
                                    int iMo77272 = abstractC3474.mo7727(abstractC3474.mo7701());
                                    ensureSpanIsMutable();
                                    while (abstractC3474.mo7710() > 0) {
                                        ((C3613) this.span_).m7812(abstractC3474.mo7717());
                                    }
                                    abstractC3474.mo7726(iMo77272);
                                } else if (iMo7705 == 26) {
                                    this.leadingComments_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 4;
                                } else if (iMo7705 == 34) {
                                    this.trailingComments_ = abstractC3474.mo7719();
                                    this.bitField0_ |= 8;
                                } else if (iMo7705 != 50) {
                                    if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                    }
                                } else {
                                    ByteString byteStringMo7719 = abstractC3474.mo7719();
                                    ensureLeadingDetachedCommentsIsMutable();
                                    this.leadingDetachedComments_.mo7495(byteStringMo7719);
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

        @Override // com.google.protobuf.InterfaceC3651
        public InterfaceC3377 getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public Location getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Location parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
            return (Location) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public C3292 newBuilderForType() {
            return newBuilder();
        }

        public static C3292 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Location parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
            return (Location) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
        }

        public static Location parseFrom(ByteString byteString) {
            return (Location) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
        }

        public static Location parseFrom(ByteString byteString, C3697 c3697) {
            return (Location) ((AbstractC3528) PARSER).m7754(byteString, c3697);
        }

        public static Location parseFrom(byte[] bArr) {
            return (Location) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
        }

        public static Location parseFrom(byte[] bArr, C3697 c3697) {
            return (Location) ((AbstractC3528) PARSER).m7752(bArr, c3697);
        }

        public static Location parseFrom(InputStream inputStream) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, C3697 c3697) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
        }

        public static Location parseFrom(AbstractC3474 abstractC3474) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
        }

        public static Location parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
        }

        private Location(GeneratedMessage.AbstractC3305 abstractC3305) {
            super(abstractC3305);
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.span_ = GeneratedMessage.emptyIntList();
            this.spanMemoizedSerializedSize = -1;
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            this.leadingDetachedComments_ = C3384.f11037;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class C3293 extends GeneratedMessage.AbstractC3304 implements InterfaceC3650 {
        private int bitField0_;
        private C3363 locationBuilder_;
        private List<Location> location_;

        private C3293() {
            this.location_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 != null) {
                descriptorProtos$SourceCodeInfo.location_ = c3363.m7472();
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

        public static final C3663 getDescriptor() {
            return AbstractC3670.f11464;
        }

        private C3363 internalGetLocationFieldBuilder() {
            if (this.locationBuilder_ == null) {
                this.locationBuilder_ = new C3363(this.location_, getParentForChildren(), isClean());
                this.location_ = null;
            }
            return this.locationBuilder_;
        }

        public C3293 addAllLocation(Iterable<? extends Location> iterable) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 != null) {
                c3363.m7462(iterable);
                return this;
            }
            ensureLocationIsMutable();
            AbstractC3530.addAll((Iterable) iterable, (List) this.location_);
            onChanged();
            return this;
        }

        public <Type> C3293 addExtension(C3616 c3616, Type type) {
            return (C3293) addExtension((AbstractC3579) c3616, type);
        }

        public C3293 addLocation(Location.C3292 c3292) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 != null) {
                c3363.m7458(c3292.build());
                return this;
            }
            ensureLocationIsMutable();
            this.location_.add(c3292.build());
            onChanged();
            return this;
        }

        public Location.C3292 addLocationBuilder() {
            return (Location.C3292) internalGetLocationFieldBuilder().m7460(Location.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$SourceCodeInfo build() {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfoBuildPartial = buildPartial();
            if (descriptorProtos$SourceCodeInfoBuildPartial.isInitialized()) {
                return descriptorProtos$SourceCodeInfoBuildPartial;
            }
            throw AbstractC3533.AbstractC3534.newUninitializedMessageException((InterfaceC3453) descriptorProtos$SourceCodeInfoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public DescriptorProtos$SourceCodeInfo buildPartial() {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo(this);
            buildPartialRepeatedFields(descriptorProtos$SourceCodeInfo);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$SourceCodeInfo);
            }
            onBuilt();
            return descriptorProtos$SourceCodeInfo;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public C3293 mo7342clear() {
            super.mo7342clear();
            this.bitField0_ = 0;
            C3363 c3363 = this.locationBuilder_;
            if (c3363 == null) {
                this.location_ = Collections.EMPTY_LIST;
            } else {
                this.location_ = null;
                c3363.m7471();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public <Type> C3293 clearExtension(C3616 c3616) {
            return (C3293) clearExtension((AbstractC3579) c3616);
        }

        public C3293 clearLocation() {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 != null) {
                c3363.m7471();
                return this;
            }
            this.location_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return AbstractC3670.f11464;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3650
        public Location getLocation(int i) {
            C3363 c3363 = this.locationBuilder_;
            return c3363 == null ? this.location_.get(i) : (Location) c3363.m7466(i, false);
        }

        public Location.C3292 getLocationBuilder(int i) {
            return (Location.C3292) internalGetLocationFieldBuilder().m7473(i);
        }

        public List<Location.C3292> getLocationBuilderList() {
            return internalGetLocationFieldBuilder().m7474();
        }

        @Override // com.google.protobuf.InterfaceC3650
        public int getLocationCount() {
            C3363 c3363 = this.locationBuilder_;
            return c3363 == null ? this.location_.size() : c3363.f11012.size();
        }

        @Override // com.google.protobuf.InterfaceC3650
        public List<Location> getLocationList() {
            C3363 c3363 = this.locationBuilder_;
            return c3363 == null ? Collections.unmodifiableList(this.location_) : c3363.m7465();
        }

        @Override // com.google.protobuf.InterfaceC3650
        public InterfaceC3651 getLocationOrBuilder(int i) {
            C3363 c3363 = this.locationBuilder_;
            return c3363 == null ? this.location_.get(i) : (InterfaceC3651) c3363.m7469(i);
        }

        @Override // com.google.protobuf.InterfaceC3650
        public List<? extends InterfaceC3651> getLocationOrBuilderList() {
            C3363 c3363 = this.locationBuilder_;
            return c3363 != null ? c3363.m7470() : Collections.unmodifiableList(this.location_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public C3619 internalGetFieldAccessorTable() {
            C3619 c3619 = AbstractC3670.f11465;
            c3619.m7827(DescriptorProtos$SourceCodeInfo.class, C3293.class);
            return c3619;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public final boolean isInitialized() {
            return extensionsAreInitialized();
        }

        public C3293 mergeFrom(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
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
                boolean zIsEmpty = this.locationBuilder_.f11012.isEmpty();
                C3363 c3363 = this.locationBuilder_;
                if (zIsEmpty) {
                    c3363.f11013 = null;
                    this.locationBuilder_ = null;
                    this.location_ = descriptorProtos$SourceCodeInfo.location_;
                    this.bitField0_ &= -2;
                    this.locationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetLocationFieldBuilder() : null;
                } else {
                    c3363.m7462(descriptorProtos$SourceCodeInfo.location_);
                }
            }
            mergeExtensionFields(descriptorProtos$SourceCodeInfo);
            mergeUnknownFields(descriptorProtos$SourceCodeInfo.getUnknownFields());
            onChanged();
            return this;
        }

        public C3293 removeLocation(int i) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 != null) {
                c3363.m7464(i);
                return this;
            }
            ensureLocationIsMutable();
            this.location_.remove(i);
            onChanged();
            return this;
        }

        public <Type> C3293 setExtension(C3616 c3616, Type type) {
            return (C3293) setExtension((AbstractC3579) c3616, type);
        }

        public C3293 setLocation(int i, Location.C3292 c3292) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 != null) {
                c3363.m7463(i, c3292.build());
                return this;
            }
            ensureLocationIsMutable();
            this.location_.set(i, c3292.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public DescriptorProtos$SourceCodeInfo getDefaultInstanceForType() {
            return DescriptorProtos$SourceCodeInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public <Type> C3293 setExtension(C3616 c3616, int i, Type type) {
            return (C3293) setExtension((AbstractC3579) c3616, i, type);
        }

        private C3293(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
            this.location_ = Collections.EMPTY_LIST;
        }

        public Location.C3292 addLocationBuilder(int i) {
            return (Location.C3292) internalGetLocationFieldBuilder().m7461(i, Location.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        }

        public C3293 addLocation(int i, Location location) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.add(i, location);
                onChanged();
                return this;
            }
            c3363.m7459(i, location);
            return this;
        }

        public C3293 setLocation(int i, Location location) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.set(i, location);
                onChanged();
                return this;
            }
            c3363.m7463(i, location);
            return this;
        }

        public C3293 addLocation(Location location) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.add(location);
                onChanged();
                return this;
            }
            c3363.m7458(location);
            return this;
        }

        public C3293 addLocation(int i, Location.C3292 c3292) {
            C3363 c3363 = this.locationBuilder_;
            if (c3363 == null) {
                ensureLocationIsMutable();
                this.location_.add(i, c3292.build());
                onChanged();
                return this;
            }
            c3363.m7459(i, c3292.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3293 mergeFrom(InterfaceC3453 interfaceC3453) {
            if (interfaceC3453 instanceof DescriptorProtos$SourceCodeInfo) {
                return mergeFrom((DescriptorProtos$SourceCodeInfo) interfaceC3453);
            }
            super.mergeFrom(interfaceC3453);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public C3293 mergeFrom(AbstractC3474 abstractC3474, C3697 c3697) {
            c3697.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7705 = abstractC3474.mo7705();
                        if (iMo7705 != 0) {
                            if (iMo7705 != 10) {
                                if (!super.parseUnknownField(abstractC3474, c3697, iMo7705)) {
                                }
                            } else {
                                Location location = (Location) abstractC3474.mo7715(Location.parser(), c3697);
                                C3363 c3363 = this.locationBuilder_;
                                if (c3363 == null) {
                                    ensureLocationIsMutable();
                                    this.location_.add(location);
                                } else {
                                    c3363.m7458(location);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
        return super.getExtension(abstractC3579, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
        return super.getExtensionCount(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
        return super.hasExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public DescriptorProtos$SourceCodeInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
        return super.getExtension(c3616);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3627, com.google.protobuf.InterfaceC3558
    public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
        return super.getExtension(c3616, i);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3697);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public C3293 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$SourceCodeInfo(GeneratedMessage.AbstractC3304 abstractC3304) {
        super(abstractC3304);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3293 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, C3697 c3697) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3528) PARSER).m7753(byteBuffer, c3697);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3528) PARSER).m7754(byteString, AbstractC3528.f11174);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString, C3697 c3697) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3528) PARSER).m7754(byteString, c3697);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3528) PARSER).m7752(bArr, AbstractC3528.f11174);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, C3697 c3697) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3528) PARSER).m7752(bArr, c3697);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, C3697 c3697) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3697);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3474 abstractC3474) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3474);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3474 abstractC3474, C3697 c3697) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3474, c3697);
    }
}
