package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;
import p075.C6949;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> {
    public static InterfaceC4699 PARSER = new C6917(7);
    private static final ProtoBuf$Constructor defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC4710 unknownFields;
    private List<ProtoBuf$ValueParameter> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(true);
        defaultInstance = protoBuf$Constructor;
        protoBuf$Constructor.initFields();
    }

    private ProtoBuf$Constructor(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM9387 = c4709.m9387();
                        if (iM9387 != 0) {
                            if (iM9387 == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = c4709.m9397();
                            } else if (iM9387 == 18) {
                                if ((i & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i |= 2;
                                }
                                this.valueParameter_.add((ProtoBuf$ValueParameter) c4709.m9380(ProtoBuf$ValueParameter.PARSER, c4726));
                            } else if (iM9387 == 26) {
                                if ((i & 16) != 16) {
                                    this.annotation_ = new ArrayList();
                                    i |= 16;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4709.m9380(ProtoBuf$Annotation.PARSER, c4726));
                            } else if (iM9387 == 248) {
                                if ((i & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(c4709.m9397()));
                            } else if (iM9387 == 250) {
                                int iM9383 = c4709.m9383(c4709.m9397());
                                if ((i & 4) != 4 && c4709.m9385() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                while (c4709.m9385() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(c4709.m9397()));
                                }
                                c4709.m9384(iM9383);
                            } else if (iM9387 == 258) {
                                if ((i & 8) != 8) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 8;
                                }
                                this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c4709.m9380(ProtoBuf$CompilerPluginData.PARSER, c4726));
                            } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if ((i & 16) == 16) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 8) == 8) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                try {
                    c4708M9365.m9376();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = c4711.m9403();
                    throw th2;
                }
                this.unknownFields = c4711.m9403();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 2) == 2) {
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
        }
        if ((i & 16) == 16) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
        }
        if ((i & 4) == 4) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
        }
        if ((i & 8) == 8) {
            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
        }
        try {
            c4708M9365.m9376();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4711.m9403();
            throw th3;
        }
        this.unknownFields = c4711.m9403();
        makeExtensionsImmutable();
    }

    public static ProtoBuf$Constructor getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.flags_ = 6;
        List list = Collections.EMPTY_LIST;
        this.valueParameter_ = list;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        this.annotation_ = list;
    }

    public static C6949 newBuilder() {
        C6949 c6949 = new C6949();
        c6949.f18544 = 6;
        List list = Collections.EMPTY_LIST;
        c6949.f18548 = list;
        c6949.f18549 = list;
        c6949.f18546 = list;
        c6949.f18547 = list;
        return c6949;
    }

    public ProtoBuf$Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ProtoBuf$Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public ProtoBuf$CompilerPluginData getCompilerPluginData(int i) {
        return this.compilerPluginData_.get(i);
    }

    public int getCompilerPluginDataCount() {
        return this.compilerPluginData_.size();
    }

    public int getFlags() {
        return this.flags_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            iM9362 += C4708.m9360(2, this.valueParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iM9362 += C4708.m9360(3, this.annotation_.get(i3));
        }
        int iM9361 = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            iM9361 += C4708.m9361(this.versionRequirement_.get(i4).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9362 + iM9361;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size += C4708.m9360(32, this.compilerPluginData_.get(i5));
        }
        int size2 = this.unknownFields.size() + extensionsSerializedSize() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public ProtoBuf$ValueParameter getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    public List<ProtoBuf$ValueParameter> getValueParameterList() {
        return this.valueParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < getValueParameterCount(); i++) {
            if (!getValueParameter(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getCompilerPluginDataCount(); i2++) {
            if (!getCompilerPluginData(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getAnnotationCount(); i3++) {
            if (!getAnnotation(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (extensionsAreInitialized()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        C4720 c4720NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9378(1, this.flags_);
        }
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            c4708.m9370(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            c4708.m9370(3, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            c4708.m9378(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            c4708.m9370(32, this.compilerPluginData_.get(i4));
        }
        c4720NewExtensionWriter.m9410(19000, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Constructor getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6949 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6949 toBuilder() {
        return newBuilder(this);
    }

    public static C6949 newBuilder(ProtoBuf$Constructor protoBuf$Constructor) {
        C6949 c6949NewBuilder = newBuilder();
        c6949NewBuilder.m12242(protoBuf$Constructor);
        return c6949NewBuilder;
    }

    private ProtoBuf$Constructor(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$Constructor(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}
