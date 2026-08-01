package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4712;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4720;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;
import p075.C6956;
import p075.C6957;
import p075.C6962;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> {
    public static InterfaceC4699 PARSER = new C6917(13);
    private static final ProtoBuf$Package defaultInstance;
    private int bitField0_;
    private List<ProtoBuf$Function> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$Property> property_;
    private List<ProtoBuf$TypeAlias> typeAlias_;
    private ProtoBuf$TypeTable typeTable_;
    private final AbstractC4710 unknownFields;
    private ProtoBuf$VersionRequirementTable versionRequirementTable_;

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(true);
        defaultInstance = protoBuf$Package;
        protoBuf$Package.initFields();
    }

    private ProtoBuf$Package(C4709 c4709, C4726 c4726) {
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
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.function_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.function_.add((ProtoBuf$Function) c4709.m9380(ProtoBuf$Function.PARSER, c4726));
                        } else if (iM9387 == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.property_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.property_.add((ProtoBuf$Property) c4709.m9380(ProtoBuf$Property.PARSER, c4726));
                        } else if (iM9387 != 42) {
                            if (iM9387 == 242) {
                                C6956 builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) c4709.m9380(ProtoBuf$TypeTable.PARSER, c4726);
                                this.typeTable_ = protoBuf$TypeTable;
                                if (builder != null) {
                                    builder.m12254(protoBuf$TypeTable);
                                    this.typeTable_ = builder.m12255();
                                }
                                this.bitField0_ |= 1;
                            } else if (iM9387 == 258) {
                                C6957 builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) c4709.m9380(ProtoBuf$VersionRequirementTable.PARSER, c4726);
                                this.versionRequirementTable_ = protoBuf$VersionRequirementTable;
                                if (builder2 != null) {
                                    builder2.m12256(protoBuf$VersionRequirementTable);
                                    this.versionRequirementTable_ = builder2.m12257();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.typeAlias_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.typeAlias_.add((ProtoBuf$TypeAlias) c4709.m9380(ProtoBuf$TypeAlias.PARSER, c4726));
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
            c4708M9365.m9376();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4711.m9403();
            throw th3;
        }
        this.unknownFields = c4711.m9403();
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

    public static C6962 newBuilder() {
        C6962 c6962 = new C6962();
        List list = Collections.EMPTY_LIST;
        c6962.f18643 = list;
        c6962.f18647 = list;
        c6962.f18648 = list;
        c6962.f18645 = ProtoBuf$TypeTable.getDefaultInstance();
        c6962.f18646 = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        return c6962;
    }

    public static ProtoBuf$Package parseFrom(InputStream inputStream, C4726 c4726) throws InvalidProtocolBufferException {
        AbstractC4712 abstractC4712 = (AbstractC4712) PARSER;
        abstractC4712.getClass();
        C4709 c4709 = new C4709(inputStream);
        InterfaceC4701 interfaceC4701 = (InterfaceC4701) abstractC4712.mo9272(c4709, c4726);
        try {
            if (c4709.f13765 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC4712.m9406(interfaceC4701);
            return (ProtoBuf$Package) interfaceC4701;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4701);
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
    public InterfaceC4699 getParserForType() {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9360 = 0;
        for (int i2 = 0; i2 < this.function_.size(); i2++) {
            iM9360 += C4708.m9360(3, this.function_.get(i2));
        }
        for (int i3 = 0; i3 < this.property_.size(); i3++) {
            iM9360 += C4708.m9360(4, this.property_.get(i3));
        }
        for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
            iM9360 += C4708.m9360(5, this.typeAlias_.get(i4));
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9360 += C4708.m9360(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9360 += C4708.m9360(32, this.versionRequirementTable_);
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9360;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        C4720 c4720NewExtensionWriter = newExtensionWriter();
        for (int i = 0; i < this.function_.size(); i++) {
            c4708.m9370(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            c4708.m9370(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            c4708.m9370(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9370(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9370(32, this.versionRequirementTable_);
        }
        c4720NewExtensionWriter.m9410(200, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Package getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6962 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6962 toBuilder() {
        return newBuilder(this);
    }

    public static C6962 newBuilder(ProtoBuf$Package protoBuf$Package) {
        C6962 c6962NewBuilder = newBuilder();
        c6962NewBuilder.m12280(protoBuf$Package);
        return c6962NewBuilder;
    }

    private ProtoBuf$Package(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$Package(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}
