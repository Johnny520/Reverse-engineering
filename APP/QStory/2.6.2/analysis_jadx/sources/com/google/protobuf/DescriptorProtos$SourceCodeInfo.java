package com.google.protobuf;

import androidx.profileinstaller.AbstractC2442;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DescriptorProtos$SourceCodeInfo extends GeneratedMessage.ExtendableMessage<DescriptorProtos$SourceCodeInfo> implements InterfaceC3649 {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static final InterfaceC3374 PARSER;
    private static final long serialVersionUID = 0;
    private List<Location> location_;
    private byte memoizedIsInitialized;

    static {
        AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "SourceCodeInfo");
        DEFAULT_INSTANCE = new DescriptorProtos$SourceCodeInfo();
        PARSER = new C3652();
    }

    private DescriptorProtos$SourceCodeInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.location_ = Collections.EMPTY_LIST;
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final C3662 getDescriptor() {
        return AbstractC3669.f11459;
    }

    public static C3292 newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
    }

    public static InterfaceC3374 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return AbstractC3669.f11459;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
        return super.getExtension(abstractC3578);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
        return super.getExtensionCount(abstractC3578);
    }

    @Override // com.google.protobuf.InterfaceC3649
    public Location getLocation(int i) {
        return this.location_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3649
    public int getLocationCount() {
        return this.location_.size();
    }

    @Override // com.google.protobuf.InterfaceC3649
    public List<Location> getLocationList() {
        return this.location_;
    }

    @Override // com.google.protobuf.InterfaceC3649
    public InterfaceC3650 getLocationOrBuilder(int i) {
        return this.location_.get(i);
    }

    @Override // com.google.protobuf.InterfaceC3649
    public List<? extends InterfaceC3650> getLocationOrBuilderList() {
        return this.location_;
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
        int size = this.location_.size();
        int iM7656 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iM7656 += AbstractC3461.m7656(this.location_.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iM7656 + size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
        return super.hasExtension(abstractC3578);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getLocationCount() > 0) {
            iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getLocationList().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC3532.hashFields(iHashCode, getExtensionFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public C3618 internalGetFieldAccessorTable() {
        C3618 c3618 = AbstractC3669.f11460;
        c3618.m7840(DescriptorProtos$SourceCodeInfo.class, C3292.class);
        return c3618;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
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

    @Override // com.google.protobuf.AbstractC3532
    public C3292 newBuilderForType(InterfaceC3531 interfaceC3531) {
        return new C3292(interfaceC3531);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3292 toBuilder() {
        return this == DEFAULT_INSTANCE ? new C3292() : new C3292().mergeFrom(this);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        InterfaceC3628 interfaceC3628NewExtensionSerializer = newExtensionSerializer();
        for (int i = 0; i < this.location_.size(); i++) {
            abstractC3461.mo7662(1, this.location_.get(i));
        }
        interfaceC3628NewExtensionSerializer.mo7841(536000001, abstractC3461);
        getUnknownFields().writeTo(abstractC3461);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Location extends GeneratedMessage implements InterfaceC3650 {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static final InterfaceC3374 PARSER;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object leadingComments_;
        private C3383 leadingDetachedComments_;
        private byte memoizedIsInitialized;
        private int pathMemoizedSerializedSize;
        private InterfaceC3394 path_;
        private int spanMemoizedSerializedSize;
        private InterfaceC3394 span_;
        private volatile Object trailingComments_;

        static {
            AbstractC3345.m7413(RuntimeVersion$RuntimeDomain.PUBLIC, "Location");
            DEFAULT_INSTANCE = new Location();
            PARSER = new C3651();
        }

        private Location() {
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.span_ = GeneratedMessage.emptyIntList();
            this.spanMemoizedSerializedSize = -1;
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            C3383 c3383 = C3383.f11032;
            this.leadingDetachedComments_ = c3383;
            this.memoizedIsInitialized = (byte) -1;
            this.path_ = GeneratedMessage.emptyIntList();
            this.span_ = GeneratedMessage.emptyIntList();
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            this.leadingDetachedComments_ = c3383;
        }

        public static /* synthetic */ int access$35576(Location location, int i) {
            int i2 = i | location.bitField0_;
            location.bitField0_ = i2;
            return i2;
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11456;
        }

        public static C3291 newBuilder(Location location) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream) {
            return (Location) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) {
            return (Location) ((AbstractC3527) PARSER).m7766(byteBuffer, AbstractC3527.f11169);
        }

        public static InterfaceC3374 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
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

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11456;
        }

        @Override // com.google.protobuf.InterfaceC3650
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

        @Override // com.google.protobuf.InterfaceC3650
        public ByteString getLeadingCommentsBytes() {
            Object obj = this.leadingComments_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.leadingComments_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3650
        public String getLeadingDetachedComments(int i) {
            return this.leadingDetachedComments_.get(i);
        }

        @Override // com.google.protobuf.InterfaceC3650
        public ByteString getLeadingDetachedCommentsBytes(int i) {
            return this.leadingDetachedComments_.m7510(i);
        }

        @Override // com.google.protobuf.InterfaceC3650
        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.f11033.size();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public InterfaceC3374 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.InterfaceC3650
        public int getPath(int i) {
            return ((C3612) this.path_).m7827(i);
        }

        @Override // com.google.protobuf.InterfaceC3650
        public int getPathCount() {
            return ((C3612) this.path_).size();
        }

        @Override // com.google.protobuf.InterfaceC3650
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int iM7651 = 0;
            while (true) {
                if (i2 >= ((C3612) this.path_).f11247) {
                    break;
                }
                iM7651 += AbstractC3461.m7651(((C3612) r3).m7827(i2));
                i2++;
            }
            int iM76512 = getPathList().isEmpty() ? iM7651 : AbstractC3461.m7651(iM7651) + iM7651 + 1;
            this.pathMemoizedSerializedSize = iM7651;
            int i3 = 0;
            int iM76513 = 0;
            while (true) {
                if (i3 >= ((C3612) this.span_).f11247) {
                    break;
                }
                iM76513 += AbstractC3461.m7651(((C3612) r4).m7827(i3));
                i3++;
            }
            int iComputeStringSize = iM76512 + iM76513;
            if (!getSpanList().isEmpty()) {
                iComputeStringSize = iComputeStringSize + 1 + AbstractC3461.m7651(iM76513);
            }
            this.spanMemoizedSerializedSize = iM76513;
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.trailingComments_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i4 = 0; i4 < this.leadingDetachedComments_.f11033.size(); i4++) {
                iComputeStringSizeNoTag += GeneratedMessage.computeStringSizeNoTag(this.leadingDetachedComments_.f11033.get(i4));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getLeadingDetachedCommentsList().size() + iComputeStringSize + iComputeStringSizeNoTag;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.InterfaceC3650
        public int getSpan(int i) {
            return ((C3612) this.span_).m7827(i);
        }

        @Override // com.google.protobuf.InterfaceC3650
        public int getSpanCount() {
            return ((C3612) this.span_).size();
        }

        @Override // com.google.protobuf.InterfaceC3650
        public List<Integer> getSpanList() {
            return this.span_;
        }

        @Override // com.google.protobuf.InterfaceC3650
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

        @Override // com.google.protobuf.InterfaceC3650
        public ByteString getTrailingCommentsBytes() {
            Object obj = this.trailingComments_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.trailingComments_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.InterfaceC3650
        public boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.InterfaceC3650
        public boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getPathCount() > 0) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 1, 53) + getPathList().hashCode();
            }
            if (getSpanCount() > 0) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 2, 53) + getSpanList().hashCode();
            }
            if (hasLeadingComments()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 3, 53) + getLeadingComments().hashCode();
            }
            if (hasTrailingComments()) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 4, 53) + getTrailingComments().hashCode();
            }
            if (getLeadingDetachedCommentsCount() > 0) {
                iHashCode = AbstractC2442.m4561(iHashCode, 37, 6, 53) + getLeadingDetachedCommentsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11455;
            c3618.m7840(Location.class, C3291.class);
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
        public C3291 newBuilderForType(InterfaceC3531 interfaceC3531) {
            return new C3291(interfaceC3531);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3291 toBuilder() {
            return this == DEFAULT_INSTANCE ? new C3291() : new C3291().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public void writeTo(AbstractC3461 abstractC3461) {
            getSerializedSize();
            if (getPathList().size() > 0) {
                abstractC3461.mo7658(10);
                abstractC3461.mo7658(this.pathMemoizedSerializedSize);
            }
            int i = 0;
            while (true) {
                C3612 c3612 = (C3612) this.path_;
                if (i >= c3612.f11247) {
                    break;
                }
                abstractC3461.mo7663(c3612.m7827(i));
                i++;
            }
            if (getSpanList().size() > 0) {
                abstractC3461.mo7658(18);
                abstractC3461.mo7658(this.spanMemoizedSerializedSize);
            }
            int i2 = 0;
            while (true) {
                C3612 c36122 = (C3612) this.span_;
                if (i2 >= c36122.f11247) {
                    break;
                }
                abstractC3461.mo7663(c36122.m7827(i2));
                i2++;
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessage.writeString(abstractC3461, 3, this.leadingComments_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessage.writeString(abstractC3461, 4, this.trailingComments_);
            }
            for (int i3 = 0; i3 < this.leadingDetachedComments_.f11033.size(); i3++) {
                GeneratedMessage.writeString(abstractC3461, 6, this.leadingDetachedComments_.f11033.get(i3));
            }
            getUnknownFields().writeTo(abstractC3461);
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$Location$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public static final class C3291 extends GeneratedMessage.AbstractC3304 implements InterfaceC3650 {
            private int bitField0_;
            private Object leadingComments_;
            private C3383 leadingDetachedComments_;
            private InterfaceC3394 path_;
            private InterfaceC3394 span_;
            private Object trailingComments_;

            private C3291() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C3383.f11032;
            }

            private void buildPartial0(Location location) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    ((AbstractC3547) this.path_).m7800();
                    location.path_ = this.path_;
                }
                if ((i2 & 2) != 0) {
                    ((AbstractC3547) this.span_).m7800();
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
                    this.leadingDetachedComments_.m7800();
                    location.leadingDetachedComments_ = this.leadingDetachedComments_;
                }
                Location.access$35576(location, i);
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                if (!this.leadingDetachedComments_.f11194) {
                    this.leadingDetachedComments_ = new C3383(this.leadingDetachedComments_);
                }
                this.bitField0_ |= 16;
            }

            private void ensurePathIsMutable() {
                InterfaceC3402 interfaceC3402 = this.path_;
                if (!((AbstractC3547) interfaceC3402).f11194) {
                    this.path_ = (InterfaceC3394) GeneratedMessage.makeMutableCopy(interfaceC3402);
                }
                this.bitField0_ |= 1;
            }

            private void ensureSpanIsMutable() {
                InterfaceC3402 interfaceC3402 = this.span_;
                if (!((AbstractC3547) interfaceC3402).f11194) {
                    this.span_ = (InterfaceC3394) GeneratedMessage.makeMutableCopy(interfaceC3402);
                }
                this.bitField0_ |= 2;
            }

            public static final C3662 getDescriptor() {
                return AbstractC3669.f11456;
            }

            public C3291 addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                AbstractC3529.addAll((Iterable) iterable, (List) this.leadingDetachedComments_);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3291 addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractC3529.addAll((Iterable) iterable, (List) this.path_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3291 addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                AbstractC3529.addAll((Iterable) iterable, (List) this.span_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3291 addLeadingDetachedComments(String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.m7506(str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3291 addLeadingDetachedCommentsBytes(ByteString byteString) {
                byteString.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.mo7508(byteString);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3291 addPath(int i) {
                ensurePathIsMutable();
                ((C3612) this.path_).m7825(i);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3291 addSpan(int i) {
                ensureSpanIsMutable();
                ((C3612) this.span_).m7825(i);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public Location build() {
                Location locationBuildPartial = buildPartial();
                if (locationBuildPartial.isInitialized()) {
                    return locationBuildPartial;
                }
                throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) locationBuildPartial);
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public Location buildPartial() {
                Location location = new Location(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(location);
                }
                onBuilt();
                return location;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            /* JADX INFO: renamed from: clear */
            public C3291 mo7355clear() {
                super.mo7355clear();
                this.bitField0_ = 0;
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C3383.f11032;
                return this;
            }

            public C3291 clearLeadingComments() {
                this.leadingComments_ = Location.getDefaultInstance().getLeadingComments();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public C3291 clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = C3383.f11032;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public C3291 clearPath() {
                this.path_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public C3291 clearSpan() {
                this.span_ = GeneratedMessage.emptyIntList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public C3291 clearTrailingComments() {
                this.trailingComments_ = Location.getDefaultInstance().getTrailingComments();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public C3662 getDescriptorForType() {
                return AbstractC3669.f11456;
            }

            @Override // com.google.protobuf.InterfaceC3650
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

            @Override // com.google.protobuf.InterfaceC3650
            public ByteString getLeadingCommentsBytes() {
                Object obj = this.leadingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.leadingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3650
            public String getLeadingDetachedComments(int i) {
                return this.leadingDetachedComments_.get(i);
            }

            @Override // com.google.protobuf.InterfaceC3650
            public ByteString getLeadingDetachedCommentsBytes(int i) {
                return this.leadingDetachedComments_.m7510(i);
            }

            @Override // com.google.protobuf.InterfaceC3650
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.f11033.size();
            }

            @Override // com.google.protobuf.InterfaceC3650
            public InterfaceC3376 getLeadingDetachedCommentsList() {
                this.leadingDetachedComments_.m7800();
                return this.leadingDetachedComments_;
            }

            @Override // com.google.protobuf.InterfaceC3650
            public int getPath(int i) {
                return ((C3612) this.path_).m7827(i);
            }

            @Override // com.google.protobuf.InterfaceC3650
            public int getPathCount() {
                return ((C3612) this.path_).size();
            }

            @Override // com.google.protobuf.InterfaceC3650
            public List<Integer> getPathList() {
                ((AbstractC3547) this.path_).m7800();
                return this.path_;
            }

            @Override // com.google.protobuf.InterfaceC3650
            public int getSpan(int i) {
                return ((C3612) this.span_).m7827(i);
            }

            @Override // com.google.protobuf.InterfaceC3650
            public int getSpanCount() {
                return ((C3612) this.span_).size();
            }

            @Override // com.google.protobuf.InterfaceC3650
            public List<Integer> getSpanList() {
                ((AbstractC3547) this.span_).m7800();
                return this.span_;
            }

            @Override // com.google.protobuf.InterfaceC3650
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

            @Override // com.google.protobuf.InterfaceC3650
            public ByteString getTrailingCommentsBytes() {
                Object obj = this.trailingComments_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.trailingComments_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.InterfaceC3650
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.InterfaceC3650
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
            public C3618 internalGetFieldAccessorTable() {
                C3618 c3618 = AbstractC3669.f11455;
                c3618.m7840(Location.class, C3291.class);
                return c3618;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
            public final boolean isInitialized() {
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C3291 mergeFrom(Location location) {
                if (location == Location.getDefaultInstance()) {
                    return this;
                }
                if (!location.path_.isEmpty()) {
                    if (this.path_.isEmpty()) {
                        InterfaceC3394 interfaceC3394 = location.path_;
                        this.path_ = interfaceC3394;
                        ((AbstractC3547) interfaceC3394).m7800();
                        this.bitField0_ |= 1;
                    } else {
                        ensurePathIsMutable();
                        ((C3612) this.path_).addAll(location.path_);
                    }
                    onChanged();
                }
                if (!location.span_.isEmpty()) {
                    if (this.span_.isEmpty()) {
                        InterfaceC3394 interfaceC33942 = location.span_;
                        this.span_ = interfaceC33942;
                        ((AbstractC3547) interfaceC33942).m7800();
                        this.bitField0_ |= 2;
                    } else {
                        ensureSpanIsMutable();
                        ((C3612) this.span_).addAll(location.span_);
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

            public C3291 setLeadingComments(String str) {
                str.getClass();
                this.leadingComments_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3291 setLeadingCommentsBytes(ByteString byteString) {
                byteString.getClass();
                this.leadingComments_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public C3291 setLeadingDetachedComments(int i, String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i, str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public C3291 setPath(int i, int i2) {
                ensurePathIsMutable();
                ((C3612) this.path_).m7828(i, i2);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public C3291 setSpan(int i, int i2) {
                ensureSpanIsMutable();
                ((C3612) this.span_).m7828(i, i2);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public C3291 setTrailingComments(String str) {
                str.getClass();
                this.trailingComments_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public C3291 setTrailingCommentsBytes(ByteString byteString) {
                byteString.getClass();
                this.trailingComments_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
            public Location getDefaultInstanceForType() {
                return Location.getDefaultInstance();
            }

            private C3291(InterfaceC3531 interfaceC3531) {
                super(interfaceC3531);
                this.path_ = GeneratedMessage.emptyIntList();
                this.span_ = GeneratedMessage.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = C3383.f11032;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
            public C3291 mergeFrom(InterfaceC3452 interfaceC3452) {
                if (interfaceC3452 instanceof Location) {
                    return mergeFrom((Location) interfaceC3452);
                }
                super.mergeFrom(interfaceC3452);
                return this;
            }

            @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
            public C3291 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
                c3696.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iMo7718 = abstractC3473.mo7718();
                            if (iMo7718 != 0) {
                                if (iMo7718 == 8) {
                                    int iMo7730 = abstractC3473.mo7730();
                                    ensurePathIsMutable();
                                    ((C3612) this.path_).m7825(iMo7730);
                                } else if (iMo7718 == 10) {
                                    int iMo7740 = abstractC3473.mo7740(abstractC3473.mo7714());
                                    ensurePathIsMutable();
                                    while (abstractC3473.mo7723() > 0) {
                                        ((C3612) this.path_).m7825(abstractC3473.mo7730());
                                    }
                                    abstractC3473.mo7739(iMo7740);
                                } else if (iMo7718 == 16) {
                                    int iMo77302 = abstractC3473.mo7730();
                                    ensureSpanIsMutable();
                                    ((C3612) this.span_).m7825(iMo77302);
                                } else if (iMo7718 == 18) {
                                    int iMo77402 = abstractC3473.mo7740(abstractC3473.mo7714());
                                    ensureSpanIsMutable();
                                    while (abstractC3473.mo7723() > 0) {
                                        ((C3612) this.span_).m7825(abstractC3473.mo7730());
                                    }
                                    abstractC3473.mo7739(iMo77402);
                                } else if (iMo7718 == 26) {
                                    this.leadingComments_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 4;
                                } else if (iMo7718 == 34) {
                                    this.trailingComments_ = abstractC3473.mo7732();
                                    this.bitField0_ |= 8;
                                } else if (iMo7718 != 50) {
                                    if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                    }
                                } else {
                                    ByteString byteStringMo7732 = abstractC3473.mo7732();
                                    ensureLeadingDetachedCommentsIsMutable();
                                    this.leadingDetachedComments_.mo7508(byteStringMo7732);
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

        @Override // com.google.protobuf.InterfaceC3650
        public InterfaceC3376 getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public Location getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Location parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
            return (Location) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public C3291 newBuilderForType() {
            return newBuilder();
        }

        public static C3291 newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Location parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
            return (Location) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
        }

        public static Location parseFrom(ByteString byteString) {
            return (Location) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
        }

        public static Location parseFrom(ByteString byteString, C3696 c3696) {
            return (Location) ((AbstractC3527) PARSER).m7767(byteString, c3696);
        }

        public static Location parseFrom(byte[] bArr) {
            return (Location) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
        }

        public static Location parseFrom(byte[] bArr, C3696 c3696) {
            return (Location) ((AbstractC3527) PARSER).m7765(bArr, c3696);
        }

        public static Location parseFrom(InputStream inputStream) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, C3696 c3696) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
        }

        public static Location parseFrom(AbstractC3473 abstractC3473) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
        }

        public static Location parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            return (Location) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
        }

        private Location(GeneratedMessage.AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.path_ = GeneratedMessage.emptyIntList();
            this.pathMemoizedSerializedSize = -1;
            this.span_ = GeneratedMessage.emptyIntList();
            this.spanMemoizedSerializedSize = -1;
            this.leadingComments_ = "";
            this.trailingComments_ = "";
            this.leadingDetachedComments_ = C3383.f11032;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$SourceCodeInfo$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class C3292 extends GeneratedMessage.AbstractC3303 implements InterfaceC3649 {
        private int bitField0_;
        private C3362 locationBuilder_;
        private List<Location> location_;

        private C3292() {
            this.location_ = Collections.EMPTY_LIST;
        }

        private void buildPartialRepeatedFields(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 != null) {
                descriptorProtos$SourceCodeInfo.location_ = c3362.m7485();
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

        public static final C3662 getDescriptor() {
            return AbstractC3669.f11459;
        }

        private C3362 internalGetLocationFieldBuilder() {
            if (this.locationBuilder_ == null) {
                this.locationBuilder_ = new C3362(this.location_, getParentForChildren(), isClean());
                this.location_ = null;
            }
            return this.locationBuilder_;
        }

        public C3292 addAllLocation(Iterable<? extends Location> iterable) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 != null) {
                c3362.m7475(iterable);
                return this;
            }
            ensureLocationIsMutable();
            AbstractC3529.addAll((Iterable) iterable, (List) this.location_);
            onChanged();
            return this;
        }

        public <Type> C3292 addExtension(C3615 c3615, Type type) {
            return (C3292) addExtension((AbstractC3578) c3615, type);
        }

        public C3292 addLocation(Location.C3291 c3291) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 != null) {
                c3362.m7471(c3291.build());
                return this;
            }
            ensureLocationIsMutable();
            this.location_.add(c3291.build());
            onChanged();
            return this;
        }

        public Location.C3291 addLocationBuilder() {
            return (Location.C3291) internalGetLocationFieldBuilder().m7473(Location.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$SourceCodeInfo build() {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfoBuildPartial = buildPartial();
            if (descriptorProtos$SourceCodeInfoBuildPartial.isInitialized()) {
                return descriptorProtos$SourceCodeInfoBuildPartial;
            }
            throw AbstractC3532.AbstractC3533.newUninitializedMessageException((InterfaceC3452) descriptorProtos$SourceCodeInfoBuildPartial);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public DescriptorProtos$SourceCodeInfo buildPartial() {
            DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo(this);
            buildPartialRepeatedFields(descriptorProtos$SourceCodeInfo);
            if (this.bitField0_ != 0) {
                buildPartial0(descriptorProtos$SourceCodeInfo);
            }
            onBuilt();
            return descriptorProtos$SourceCodeInfo;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public C3292 mo7355clear() {
            super.mo7355clear();
            this.bitField0_ = 0;
            C3362 c3362 = this.locationBuilder_;
            if (c3362 == null) {
                this.location_ = Collections.EMPTY_LIST;
            } else {
                this.location_ = null;
                c3362.m7484();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public <Type> C3292 clearExtension(C3615 c3615) {
            return (C3292) clearExtension((AbstractC3578) c3615);
        }

        public C3292 clearLocation() {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 != null) {
                c3362.m7484();
                return this;
            }
            this.location_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return AbstractC3669.f11459;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3649
        public Location getLocation(int i) {
            C3362 c3362 = this.locationBuilder_;
            return c3362 == null ? this.location_.get(i) : (Location) c3362.m7479(i, false);
        }

        public Location.C3291 getLocationBuilder(int i) {
            return (Location.C3291) internalGetLocationFieldBuilder().m7486(i);
        }

        public List<Location.C3291> getLocationBuilderList() {
            return internalGetLocationFieldBuilder().m7487();
        }

        @Override // com.google.protobuf.InterfaceC3649
        public int getLocationCount() {
            C3362 c3362 = this.locationBuilder_;
            return c3362 == null ? this.location_.size() : c3362.f11007.size();
        }

        @Override // com.google.protobuf.InterfaceC3649
        public List<Location> getLocationList() {
            C3362 c3362 = this.locationBuilder_;
            return c3362 == null ? Collections.unmodifiableList(this.location_) : c3362.m7478();
        }

        @Override // com.google.protobuf.InterfaceC3649
        public InterfaceC3650 getLocationOrBuilder(int i) {
            C3362 c3362 = this.locationBuilder_;
            return c3362 == null ? this.location_.get(i) : (InterfaceC3650) c3362.m7482(i);
        }

        @Override // com.google.protobuf.InterfaceC3649
        public List<? extends InterfaceC3650> getLocationOrBuilderList() {
            C3362 c3362 = this.locationBuilder_;
            return c3362 != null ? c3362.m7483() : Collections.unmodifiableList(this.location_);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public C3618 internalGetFieldAccessorTable() {
            C3618 c3618 = AbstractC3669.f11460;
            c3618.m7840(DescriptorProtos$SourceCodeInfo.class, C3292.class);
            return c3618;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public final boolean isInitialized() {
            return extensionsAreInitialized();
        }

        public C3292 mergeFrom(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
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
                boolean zIsEmpty = this.locationBuilder_.f11007.isEmpty();
                C3362 c3362 = this.locationBuilder_;
                if (zIsEmpty) {
                    c3362.f11008 = null;
                    this.locationBuilder_ = null;
                    this.location_ = descriptorProtos$SourceCodeInfo.location_;
                    this.bitField0_ &= -2;
                    this.locationBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetLocationFieldBuilder() : null;
                } else {
                    c3362.m7475(descriptorProtos$SourceCodeInfo.location_);
                }
            }
            mergeExtensionFields(descriptorProtos$SourceCodeInfo);
            mergeUnknownFields(descriptorProtos$SourceCodeInfo.getUnknownFields());
            onChanged();
            return this;
        }

        public C3292 removeLocation(int i) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 != null) {
                c3362.m7477(i);
                return this;
            }
            ensureLocationIsMutable();
            this.location_.remove(i);
            onChanged();
            return this;
        }

        public <Type> C3292 setExtension(C3615 c3615, Type type) {
            return (C3292) setExtension((AbstractC3578) c3615, type);
        }

        public C3292 setLocation(int i, Location.C3291 c3291) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 != null) {
                c3362.m7476(i, c3291.build());
                return this;
            }
            ensureLocationIsMutable();
            this.location_.set(i, c3291.build());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public DescriptorProtos$SourceCodeInfo getDefaultInstanceForType() {
            return DescriptorProtos$SourceCodeInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3303, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public <Type> C3292 setExtension(C3615 c3615, int i, Type type) {
            return (C3292) setExtension((AbstractC3578) c3615, i, type);
        }

        private C3292(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
            this.location_ = Collections.EMPTY_LIST;
        }

        public Location.C3291 addLocationBuilder(int i) {
            return (Location.C3291) internalGetLocationFieldBuilder().m7474(i, Location.getDefaultInstance());
        }

        private void buildPartial0(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        }

        public C3292 addLocation(int i, Location location) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.add(i, location);
                onChanged();
                return this;
            }
            c3362.m7472(i, location);
            return this;
        }

        public C3292 setLocation(int i, Location location) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.set(i, location);
                onChanged();
                return this;
            }
            c3362.m7476(i, location);
            return this;
        }

        public C3292 addLocation(Location location) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 == null) {
                location.getClass();
                ensureLocationIsMutable();
                this.location_.add(location);
                onChanged();
                return this;
            }
            c3362.m7471(location);
            return this;
        }

        public C3292 addLocation(int i, Location.C3291 c3291) {
            C3362 c3362 = this.locationBuilder_;
            if (c3362 == null) {
                ensureLocationIsMutable();
                this.location_.add(i, c3291.build());
                onChanged();
                return this;
            }
            c3362.m7472(i, c3291.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3292 mergeFrom(InterfaceC3452 interfaceC3452) {
            if (interfaceC3452 instanceof DescriptorProtos$SourceCodeInfo) {
                return mergeFrom((DescriptorProtos$SourceCodeInfo) interfaceC3452);
            }
            super.mergeFrom(interfaceC3452);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public C3292 mergeFrom(AbstractC3473 abstractC3473, C3696 c3696) {
            c3696.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iMo7718 = abstractC3473.mo7718();
                        if (iMo7718 != 0) {
                            if (iMo7718 != 10) {
                                if (!super.parseUnknownField(abstractC3473, c3696, iMo7718)) {
                                }
                            } else {
                                Location location = (Location) abstractC3473.mo7728(Location.parser(), c3696);
                                C3362 c3362 = this.locationBuilder_;
                                if (c3362 == null) {
                                    ensureLocationIsMutable();
                                    this.location_.add(location);
                                } else {
                                    c3362.m7471(location);
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

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
        return super.getExtension(abstractC3578, i);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
        return super.getExtensionCount(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
        return super.hasExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public DescriptorProtos$SourceCodeInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
        return super.getExtension(c3615);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.InterfaceC3626, com.google.protobuf.InterfaceC3557
    public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
        return super.getExtension(c3615, i);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, c3696);
    }

    @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public C3292 newBuilderForType() {
        return newBuilder();
    }

    private DescriptorProtos$SourceCodeInfo(GeneratedMessage.AbstractC3303 abstractC3303) {
        super(abstractC3303);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static C3292 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, C3696 c3696) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3527) PARSER).m7766(byteBuffer, c3696);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3527) PARSER).m7767(byteString, AbstractC3527.f11169);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString, C3696 c3696) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3527) PARSER).m7767(byteString, c3696);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3527) PARSER).m7765(bArr, AbstractC3527.f11169);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, C3696 c3696) {
        return (DescriptorProtos$SourceCodeInfo) ((AbstractC3527) PARSER).m7765(bArr, c3696);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, C3696 c3696) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, inputStream, c3696);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3473 abstractC3473) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3473);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(AbstractC3473 abstractC3473, C3696 c3696) {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessage.parseWithIOException(PARSER, abstractC3473, c3696);
    }
}
