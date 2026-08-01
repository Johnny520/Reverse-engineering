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
import p091.C7783;
import p091.C7791;
import p091.C7792;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> {
    public static InterfaceC5531 PARSER = new C7746(14);
    private static final ProtoBuf$PackageFragment defaultInstance;
    private int bitField0_;
    private List<ProtoBuf$Class> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ProtoBuf$Package package_;
    private ProtoBuf$QualifiedNameTable qualifiedNames_;
    private ProtoBuf$StringTable strings_;
    private final AbstractC5542 unknownFields;

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(true);
        defaultInstance = protoBuf$PackageFragment;
        protoBuf$PackageFragment.initFields();
    }

    private ProtoBuf$PackageFragment(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 10) {
                            C7783 builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                            ProtoBuf$StringTable protoBuf$StringTable = (ProtoBuf$StringTable) c5541.m9939(ProtoBuf$StringTable.PARSER, c5558);
                            this.strings_ = protoBuf$StringTable;
                            if (builder != null) {
                                builder.m12811(protoBuf$StringTable);
                                this.strings_ = builder.m12812();
                            }
                            this.bitField0_ |= 1;
                        } else if (iM9946 == 18) {
                            C5504 builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) c5541.m9939(ProtoBuf$QualifiedNameTable.PARSER, c5558);
                            this.qualifiedNames_ = protoBuf$QualifiedNameTable;
                            if (builder2 != null) {
                                builder2.m9850(protoBuf$QualifiedNameTable);
                                this.qualifiedNames_ = builder2.m9851();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9946 == 26) {
                            C7791 builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                            ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) c5541.m9939(ProtoBuf$Package.PARSER, c5558);
                            this.package_ = protoBuf$Package;
                            if (builder3 != null) {
                                builder3.m12839(protoBuf$Package);
                                this.package_ = builder3.m12840();
                            }
                            this.bitField0_ |= 4;
                        } else if (iM9946 == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.class__ = new ArrayList();
                                c = '\b';
                            }
                            this.class__.add((ProtoBuf$Class) c5541.m9939(ProtoBuf$Class.PARSER, c5558));
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.class__ = Collections.unmodifiableList(this.class__);
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.class__ = Collections.unmodifiableList(this.class__);
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

    public static ProtoBuf$PackageFragment getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.strings_ = ProtoBuf$StringTable.getDefaultInstance();
        this.qualifiedNames_ = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        this.package_ = ProtoBuf$Package.getDefaultInstance();
        this.class__ = Collections.EMPTY_LIST;
    }

    public static C7792 newBuilder() {
        C7792 c7792 = new C7792();
        c7792.f18994 = ProtoBuf$StringTable.getDefaultInstance();
        c7792.f18997 = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        c7792.f18998 = ProtoBuf$Package.getDefaultInstance();
        c7792.f18996 = Collections.EMPTY_LIST;
        return c7792;
    }

    public static ProtoBuf$PackageFragment parseFrom(InputStream inputStream, C5558 c5558) throws InvalidProtocolBufferException {
        AbstractC5544 abstractC5544 = (AbstractC5544) PARSER;
        abstractC5544.getClass();
        C5541 c5541 = new C5541(inputStream);
        InterfaceC5533 interfaceC5533 = (InterfaceC5533) abstractC5544.mo9831(c5541, c5558);
        try {
            if (c5541.f14110 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC5544.m9965(interfaceC5533);
            return (ProtoBuf$PackageFragment) interfaceC5533;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC5533);
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
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$QualifiedNameTable getQualifiedNames() {
        return this.qualifiedNames_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9919 = (this.bitField0_ & 1) == 1 ? C5540.m9919(1, this.strings_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9919 += C5540.m9919(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9919 += C5540.m9919(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            iM9919 += C5540.m9919(4, this.class__.get(i2));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9919;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        C5552 c5552NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9929(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9929(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9929(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            c5540.m9929(4, this.class__.get(i));
        }
        c5552NewExtensionWriter.m9969(200, c5540);
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$PackageFragment getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7792 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7792 toBuilder() {
        return newBuilder(this);
    }

    public static C7792 newBuilder(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        C7792 c7792NewBuilder = newBuilder();
        c7792NewBuilder.m12841(protoBuf$PackageFragment);
        return c7792NewBuilder;
    }

    private ProtoBuf$PackageFragment(AbstractC5553 abstractC5553) {
        super(abstractC5553);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5553.f14153;
    }

    private ProtoBuf$PackageFragment(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}
