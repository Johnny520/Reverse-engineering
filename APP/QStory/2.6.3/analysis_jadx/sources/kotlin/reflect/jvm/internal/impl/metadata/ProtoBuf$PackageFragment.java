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
import p075.C6954;
import p075.C6962;
import p075.C6963;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> {
    public static InterfaceC4699 PARSER = new C6917(14);
    private static final ProtoBuf$PackageFragment defaultInstance;
    private int bitField0_;
    private List<ProtoBuf$Class> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ProtoBuf$Package package_;
    private ProtoBuf$QualifiedNameTable qualifiedNames_;
    private ProtoBuf$StringTable strings_;
    private final AbstractC4710 unknownFields;

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(true);
        defaultInstance = protoBuf$PackageFragment;
        protoBuf$PackageFragment.initFields();
    }

    private ProtoBuf$PackageFragment(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 10) {
                            C6954 builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                            ProtoBuf$StringTable protoBuf$StringTable = (ProtoBuf$StringTable) c4709.m9380(ProtoBuf$StringTable.PARSER, c4726);
                            this.strings_ = protoBuf$StringTable;
                            if (builder != null) {
                                builder.m12252(protoBuf$StringTable);
                                this.strings_ = builder.m12253();
                            }
                            this.bitField0_ |= 1;
                        } else if (iM9387 == 18) {
                            C4672 builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) c4709.m9380(ProtoBuf$QualifiedNameTable.PARSER, c4726);
                            this.qualifiedNames_ = protoBuf$QualifiedNameTable;
                            if (builder2 != null) {
                                builder2.m9291(protoBuf$QualifiedNameTable);
                                this.qualifiedNames_ = builder2.m9292();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9387 == 26) {
                            C6962 builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                            ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) c4709.m9380(ProtoBuf$Package.PARSER, c4726);
                            this.package_ = protoBuf$Package;
                            if (builder3 != null) {
                                builder3.m12280(protoBuf$Package);
                                this.package_ = builder3.m12281();
                            }
                            this.bitField0_ |= 4;
                        } else if (iM9387 == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.class__ = new ArrayList();
                                c = '\b';
                            }
                            this.class__.add((ProtoBuf$Class) c4709.m9380(ProtoBuf$Class.PARSER, c4726));
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.class__ = Collections.unmodifiableList(this.class__);
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.class__ = Collections.unmodifiableList(this.class__);
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

    public static ProtoBuf$PackageFragment getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.strings_ = ProtoBuf$StringTable.getDefaultInstance();
        this.qualifiedNames_ = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        this.package_ = ProtoBuf$Package.getDefaultInstance();
        this.class__ = Collections.EMPTY_LIST;
    }

    public static C6963 newBuilder() {
        C6963 c6963 = new C6963();
        c6963.f18649 = ProtoBuf$StringTable.getDefaultInstance();
        c6963.f18652 = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        c6963.f18653 = ProtoBuf$Package.getDefaultInstance();
        c6963.f18651 = Collections.EMPTY_LIST;
        return c6963;
    }

    public static ProtoBuf$PackageFragment parseFrom(InputStream inputStream, C4726 c4726) throws InvalidProtocolBufferException {
        AbstractC4712 abstractC4712 = (AbstractC4712) PARSER;
        abstractC4712.getClass();
        C4709 c4709 = new C4709(inputStream);
        InterfaceC4701 interfaceC4701 = (InterfaceC4701) abstractC4712.mo9272(c4709, c4726);
        try {
            if (c4709.f13765 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC4712.m9406(interfaceC4701);
            return (ProtoBuf$PackageFragment) interfaceC4701;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4701);
        }
    }

    public ProtoBuf$Class getClass_(int i) {
        return this.class__.get(i);
    }

    public int getClass_Count() {
        return this.class__.size();
    }

    public List<ProtoBuf$Class> getClass_List() {
        return this.class__;
    }

    public ProtoBuf$Package getPackage() {
        return this.package_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$QualifiedNameTable getQualifiedNames() {
        return this.qualifiedNames_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9360 = (this.bitField0_ & 1) == 1 ? C4708.m9360(1, this.strings_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9360 += C4708.m9360(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9360 += C4708.m9360(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            iM9360 += C4708.m9360(4, this.class__.get(i2));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9360;
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$StringTable getStrings() {
        return this.strings_;
    }

    public boolean hasPackage() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasQualifiedNames() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasStrings() {
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
        if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasPackage() && !getPackage().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getClass_Count(); i++) {
            if (!getClass_(i).isInitialized()) {
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
            c4708.m9370(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9370(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9370(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            c4708.m9370(4, this.class__.get(i));
        }
        c4720NewExtensionWriter.m9410(200, c4708);
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$PackageFragment getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6963 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6963 toBuilder() {
        return newBuilder(this);
    }

    public static C6963 newBuilder(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        C6963 c6963NewBuilder = newBuilder();
        c6963NewBuilder.m12282(protoBuf$PackageFragment);
        return c6963NewBuilder;
    }

    private ProtoBuf$PackageFragment(AbstractC4721 abstractC4721) {
        super(abstractC4721);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4721.f13808;
    }

    private ProtoBuf$PackageFragment(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}
