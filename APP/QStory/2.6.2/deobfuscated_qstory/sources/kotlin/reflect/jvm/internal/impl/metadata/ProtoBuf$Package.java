package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4711;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4719;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;
import p075.C6955;
import p075.C6956;
import p075.C6961;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> {
    public static InterfaceC4698 PARSER = new C6916(13);
    private static final ProtoBuf$Package defaultInstance;
    private int bitField0_;
    private List<ProtoBuf$Function> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$Property> property_;
    private List<ProtoBuf$TypeAlias> typeAlias_;
    private ProtoBuf$TypeTable typeTable_;
    private final AbstractC4709 unknownFields;
    private ProtoBuf$VersionRequirementTable versionRequirementTable_;

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(true);
        defaultInstance = protoBuf$Package;
        protoBuf$Package.initFields();
    }

    private ProtoBuf$Package(C4708 c4708, C4725 c4725) {
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
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.function_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.function_.add((ProtoBuf$Function) c4708.m9390(ProtoBuf$Function.PARSER, c4725));
                        } else if (iM9397 == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.property_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.property_.add((ProtoBuf$Property) c4708.m9390(ProtoBuf$Property.PARSER, c4725));
                        } else if (iM9397 != 42) {
                            if (iM9397 == 242) {
                                C6955 builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) c4708.m9390(ProtoBuf$TypeTable.PARSER, c4725);
                                this.typeTable_ = protoBuf$TypeTable;
                                if (builder != null) {
                                    builder.m12226(protoBuf$TypeTable);
                                    this.typeTable_ = builder.m12227();
                                }
                                this.bitField0_ |= 1;
                            } else if (iM9397 == 258) {
                                C6956 builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) c4708.m9390(ProtoBuf$VersionRequirementTable.PARSER, c4725);
                                this.versionRequirementTable_ = protoBuf$VersionRequirementTable;
                                if (builder2 != null) {
                                    builder2.m12228(protoBuf$VersionRequirementTable);
                                    this.versionRequirementTable_ = builder2.m12229();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.typeAlias_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.typeAlias_.add((ProtoBuf$TypeAlias) c4708.m9390(ProtoBuf$TypeAlias.PARSER, c4725));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((i == true ? 1 : 0) & 1) == 1) {
                        this.function_ = Collections.unmodifiableList(this.function_);
                    }
                    if (((i == true ? 1 : 0) & 2) == 2) {
                        this.property_ = Collections.unmodifiableList(this.property_);
                    }
                    if (((i == true ? 1 : 0) & 4) == 4) {
                        this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            }
        }
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.function_ = Collections.unmodifiableList(this.function_);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.property_ = Collections.unmodifiableList(this.property_);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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

    public static ProtoBuf$Package getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        List list = Collections.EMPTY_LIST;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.getDefaultInstance();
    }

    public static C6961 newBuilder() {
        C6961 c6961 = new C6961();
        List list = Collections.EMPTY_LIST;
        c6961.f18648 = list;
        c6961.f18652 = list;
        c6961.f18653 = list;
        c6961.f18650 = ProtoBuf$TypeTable.getDefaultInstance();
        c6961.f18651 = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        return c6961;
    }

    public static ProtoBuf$Package parseFrom(InputStream inputStream, C4725 c4725) throws InvalidProtocolBufferException {
        AbstractC4711 abstractC4711 = (AbstractC4711) PARSER;
        abstractC4711.getClass();
        C4708 c4708 = new C4708(inputStream);
        InterfaceC4700 interfaceC4700 = (InterfaceC4700) abstractC4711.mo9282(c4708, c4725);
        try {
            if (c4708.f13761 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC4711.m9416(interfaceC4700);
            return (ProtoBuf$Package) interfaceC4700;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4700);
        }
    }

    public ProtoBuf$Function getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public List<ProtoBuf$Function> getFunctionList() {
        return this.function_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Property getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public List<ProtoBuf$Property> getPropertyList() {
        return this.property_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9370 = 0;
        for (int i2 = 0; i2 < this.function_.size(); i2++) {
            iM9370 += C4707.m9370(3, this.function_.get(i2));
        }
        for (int i3 = 0; i3 < this.property_.size(); i3++) {
            iM9370 += C4707.m9370(4, this.property_.get(i3));
        }
        for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
            iM9370 += C4707.m9370(5, this.typeAlias_.get(i4));
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9370 += C4707.m9370(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9370 += C4707.m9370(32, this.versionRequirementTable_);
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9370;
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$TypeAlias getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public List<ProtoBuf$TypeAlias> getTypeAliasList() {
        return this.typeAlias_;
    }

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
    }

    public ProtoBuf$VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasTypeTable() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasVersionRequirementTable() {
        return (this.bitField0_ & 2) == 2;
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
        for (int i = 0; i < getFunctionCount(); i++) {
            if (!getFunction(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getPropertyCount(); i2++) {
            if (!getProperty(i2).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
            if (!getTypeAlias(i3).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasTypeTable() && !getTypeTable().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
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
        for (int i = 0; i < this.function_.size(); i++) {
            c4707.m9380(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            c4707.m9380(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            c4707.m9380(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9380(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9380(32, this.versionRequirementTable_);
        }
        c4719NewExtensionWriter.m9420(200, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Package getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6961 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6961 toBuilder() {
        return newBuilder(this);
    }

    public static C6961 newBuilder(ProtoBuf$Package protoBuf$Package) {
        C6961 c6961NewBuilder = newBuilder();
        c6961NewBuilder.m12253(protoBuf$Package);
        return c6961NewBuilder;
    }

    private ProtoBuf$Package(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$Package(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}
