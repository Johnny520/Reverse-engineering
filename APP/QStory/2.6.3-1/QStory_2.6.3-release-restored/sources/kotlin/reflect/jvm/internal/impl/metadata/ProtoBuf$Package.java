package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5544;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5553;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5552;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;
import p091.C7785;
import p091.C7786;
import p091.C7791;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> {
    public static InterfaceC5531 PARSER = new C7746(13);
    private static final ProtoBuf$Package defaultInstance;
    private int bitField0_;
    private List<ProtoBuf$Function> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<ProtoBuf$Property> property_;
    private List<ProtoBuf$TypeAlias> typeAlias_;
    private ProtoBuf$TypeTable typeTable_;
    private final AbstractC5542 unknownFields;
    private ProtoBuf$VersionRequirementTable versionRequirementTable_;

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(true);
        defaultInstance = protoBuf$Package;
        protoBuf$Package.initFields();
    }

    private ProtoBuf$Package(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.function_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.function_.add((ProtoBuf$Function) c5541.m9939(ProtoBuf$Function.PARSER, c5558));
                        } else if (iM9946 == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.property_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.property_.add((ProtoBuf$Property) c5541.m9939(ProtoBuf$Property.PARSER, c5558));
                        } else if (iM9946 != 42) {
                            if (iM9946 == 242) {
                                C7785 builder = (this.bitField0_ & 1) == 1 ? this.typeTable_.toBuilder() : null;
                                ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) c5541.m9939(ProtoBuf$TypeTable.PARSER, c5558);
                                this.typeTable_ = protoBuf$TypeTable;
                                if (builder != null) {
                                    builder.m12813(protoBuf$TypeTable);
                                    this.typeTable_ = builder.m12814();
                                }
                                this.bitField0_ |= 1;
                            } else if (iM9946 == 258) {
                                C7786 builder2 = (this.bitField0_ & 2) == 2 ? this.versionRequirementTable_.toBuilder() : null;
                                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) c5541.m9939(ProtoBuf$VersionRequirementTable.PARSER, c5558);
                                this.versionRequirementTable_ = protoBuf$VersionRequirementTable;
                                if (builder2 != null) {
                                    builder2.m12815(protoBuf$VersionRequirementTable);
                                    this.versionRequirementTable_ = builder2.m12816();
                                }
                                this.bitField0_ |= 2;
                            } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.typeAlias_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.typeAlias_.add((ProtoBuf$TypeAlias) c5541.m9939(ProtoBuf$TypeAlias.PARSER, c5558));
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
                        c5540M9924.m9935();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c5543.m9962();
                        throw th2;
                    }
                    this.unknownFields = c5543.m9962();
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
            c5540M9924.m9935();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c5543.m9962();
            throw th3;
        }
        this.unknownFields = c5543.m9962();
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

    public static C7791 newBuilder() {
        C7791 c7791 = new C7791();
        List list = Collections.EMPTY_LIST;
        c7791.f18988 = list;
        c7791.f18992 = list;
        c7791.f18993 = list;
        c7791.f18990 = ProtoBuf$TypeTable.getDefaultInstance();
        c7791.f18991 = ProtoBuf$VersionRequirementTable.getDefaultInstance();
        return c7791;
    }

    public static ProtoBuf$Package parseFrom(InputStream inputStream, C5558 c5558) throws InvalidProtocolBufferException {
        AbstractC5544 abstractC5544 = (AbstractC5544) PARSER;
        abstractC5544.getClass();
        C5541 c5541 = new C5541(inputStream);
        InterfaceC5533 interfaceC5533 = (InterfaceC5533) abstractC5544.mo9831(c5541, c5558);
        try {
            if (c5541.f14110 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC5544.m9965(interfaceC5533);
            return (ProtoBuf$Package) interfaceC5533;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC5533);
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
    public InterfaceC5531 getParserForType() {
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9919 = 0;
        for (int i2 = 0; i2 < this.function_.size(); i2++) {
            iM9919 += C5540.m9919(3, this.function_.get(i2));
        }
        for (int i3 = 0; i3 < this.property_.size(); i3++) {
            iM9919 += C5540.m9919(4, this.property_.get(i3));
        }
        for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
            iM9919 += C5540.m9919(5, this.typeAlias_.get(i4));
        }
        if ((this.bitField0_ & 1) == 1) {
            iM9919 += C5540.m9919(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iM9919 += C5540.m9919(32, this.versionRequirementTable_);
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9919;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        C5552 c5552NewExtensionWriter = newExtensionWriter();
        for (int i = 0; i < this.function_.size(); i++) {
            c5540.m9929(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            c5540.m9929(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            c5540.m9929(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9929(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9929(32, this.versionRequirementTable_);
        }
        c5552NewExtensionWriter.m9969(200, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$Package getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7791 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7791 toBuilder() {
        return newBuilder(this);
    }

    public static C7791 newBuilder(ProtoBuf$Package protoBuf$Package) {
        C7791 c7791NewBuilder = newBuilder();
        c7791NewBuilder.m12839(protoBuf$Package);
        return c7791NewBuilder;
    }

    private ProtoBuf$Package(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$Package(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}
