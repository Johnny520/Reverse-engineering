package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4719;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;
import p075.C6948;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> {
    public static InterfaceC4698 PARSER = new C6916(7);
    private static final ProtoBuf$Constructor defaultInstance;
    private List<ProtoBuf$Annotation> annotation_;
    private int bitField0_;
    private List<ProtoBuf$CompilerPluginData> compilerPluginData_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final AbstractC4709 unknownFields;
    private List<ProtoBuf$ValueParameter> valueParameter_;
    private List<Integer> versionRequirement_;

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(true);
        defaultInstance = protoBuf$Constructor;
        protoBuf$Constructor.initFields();
    }

    private ProtoBuf$Constructor(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iM9397 = c4708.m9397();
                        if (iM9397 != 0) {
                            if (iM9397 == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = c4708.m9407();
                            } else if (iM9397 == 18) {
                                if ((i & 2) != 2) {
                                    this.valueParameter_ = new ArrayList();
                                    i |= 2;
                                }
                                this.valueParameter_.add((ProtoBuf$ValueParameter) c4708.m9390(ProtoBuf$ValueParameter.PARSER, c4725));
                            } else if (iM9397 == 26) {
                                if ((i & 16) != 16) {
                                    this.annotation_ = new ArrayList();
                                    i |= 16;
                                }
                                this.annotation_.add((ProtoBuf$Annotation) c4708.m9390(ProtoBuf$Annotation.PARSER, c4725));
                            } else if (iM9397 == 248) {
                                if ((i & 4) != 4) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                this.versionRequirement_.add(Integer.valueOf(c4708.m9407()));
                            } else if (iM9397 == 250) {
                                int iM9393 = c4708.m9393(c4708.m9407());
                                if ((i & 4) != 4 && c4708.m9395() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i |= 4;
                                }
                                while (c4708.m9395() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(c4708.m9407()));
                                }
                                c4708.m9394(iM9393);
                            } else if (iM9397 == 258) {
                                if ((i & 8) != 8) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i |= 8;
                                }
                                this.compilerPluginData_.add((ProtoBuf$CompilerPluginData) c4708.m9390(ProtoBuf$CompilerPluginData.PARSER, c4725));
                            } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
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
                    c4707M9375.m9386();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = c4710.m9413();
                    throw th2;
                }
                this.unknownFields = c4710.m9413();
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
            c4707M9375.m9386();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4710.m9413();
            throw th3;
        }
        this.unknownFields = c4710.m9413();
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

    public static C6948 newBuilder() {
        C6948 c6948 = new C6948();
        c6948.f18549 = 6;
        List list = Collections.EMPTY_LIST;
        c6948.f18553 = list;
        c6948.f18554 = list;
        c6948.f18551 = list;
        c6948.f18552 = list;
        return c6948;
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            iM9372 += C4707.m9370(2, this.valueParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iM9372 += C4707.m9370(3, this.annotation_.get(i3));
        }
        int iM9371 = 0;
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            iM9371 += C4707.m9371(this.versionRequirement_.get(i4).intValue());
        }
        int size = (getVersionRequirementList().size() * 2) + iM9372 + iM9371;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size += C4707.m9370(32, this.compilerPluginData_.get(i5));
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        C4719 c4719NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.flags_);
        }
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            c4707.m9380(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            c4707.m9380(3, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            c4707.m9388(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            c4707.m9380(32, this.compilerPluginData_.get(i4));
        }
        c4719NewExtensionWriter.m9420(19000, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Constructor getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6948 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6948 toBuilder() {
        return newBuilder(this);
    }

    public static C6948 newBuilder(ProtoBuf$Constructor protoBuf$Constructor) {
        C6948 c6948NewBuilder = newBuilder();
        c6948NewBuilder.m12214(protoBuf$Constructor);
        return c6948NewBuilder;
    }

    private ProtoBuf$Constructor(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$Constructor(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}
