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
import p075.C6953;
import p075.C6961;
import p075.C6962;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> {
    public static InterfaceC4698 PARSER = new C6916(14);
    private static final ProtoBuf$PackageFragment defaultInstance;
    private int bitField0_;
    private List<ProtoBuf$Class> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private ProtoBuf$Package package_;
    private ProtoBuf$QualifiedNameTable qualifiedNames_;
    private ProtoBuf$StringTable strings_;
    private final AbstractC4709 unknownFields;

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(true);
        defaultInstance = protoBuf$PackageFragment;
        protoBuf$PackageFragment.initFields();
    }

    private ProtoBuf$PackageFragment(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 10) {
                            C6953 builder = (this.bitField0_ & 1) == 1 ? this.strings_.toBuilder() : null;
                            ProtoBuf$StringTable protoBuf$StringTable = (ProtoBuf$StringTable) c4708.m9390(ProtoBuf$StringTable.PARSER, c4725);
                            this.strings_ = protoBuf$StringTable;
                            if (builder != null) {
                                builder.m12224(protoBuf$StringTable);
                                this.strings_ = builder.m12225();
                            }
                            this.bitField0_ |= 1;
                        } else if (iM9397 == 18) {
                            C4671 builder2 = (this.bitField0_ & 2) == 2 ? this.qualifiedNames_.toBuilder() : null;
                            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) c4708.m9390(ProtoBuf$QualifiedNameTable.PARSER, c4725);
                            this.qualifiedNames_ = protoBuf$QualifiedNameTable;
                            if (builder2 != null) {
                                builder2.m9301(protoBuf$QualifiedNameTable);
                                this.qualifiedNames_ = builder2.m9302();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9397 == 26) {
                            C6961 builder3 = (this.bitField0_ & 4) == 4 ? this.package_.toBuilder() : null;
                            ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) c4708.m9390(ProtoBuf$Package.PARSER, c4725);
                            this.package_ = protoBuf$Package;
                            if (builder3 != null) {
                                builder3.m12253(protoBuf$Package);
                                this.package_ = builder3.m12254();
                            }
                            this.bitField0_ |= 4;
                        } else if (iM9397 == 34) {
                            int i = (c == true ? 1 : 0) & '\b';
                            c = c;
                            if (i != 8) {
                                this.class__ = new ArrayList();
                                c = '\b';
                            }
                            this.class__.add((ProtoBuf$Class) c4708.m9390(ProtoBuf$Class.PARSER, c4725));
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & '\b') == 8) {
                        this.class__ = Collections.unmodifiableList(this.class__);
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
        if (((c == true ? 1 : 0) & '\b') == 8) {
            this.class__ = Collections.unmodifiableList(this.class__);
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

    public static ProtoBuf$PackageFragment getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.strings_ = ProtoBuf$StringTable.getDefaultInstance();
        this.qualifiedNames_ = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        this.package_ = ProtoBuf$Package.getDefaultInstance();
        this.class__ = Collections.EMPTY_LIST;
    }

    public static C6962 newBuilder() {
        C6962 c6962 = new C6962();
        c6962.f18654 = ProtoBuf$StringTable.getDefaultInstance();
        c6962.f18657 = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        c6962.f18658 = ProtoBuf$Package.getDefaultInstance();
        c6962.f18656 = Collections.EMPTY_LIST;
        return c6962;
    }

    public static ProtoBuf$PackageFragment parseFrom(InputStream inputStream, C4725 c4725) throws InvalidProtocolBufferException {
        AbstractC4711 abstractC4711 = (AbstractC4711) PARSER;
        abstractC4711.getClass();
        C4708 c4708 = new C4708(inputStream);
        InterfaceC4700 interfaceC4700 = (InterfaceC4700) abstractC4711.mo9282(c4708, c4725);
        try {
            if (c4708.f13761 != 0) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            AbstractC4711.m9416(interfaceC4700);
            return (ProtoBuf$PackageFragment) interfaceC4700;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4700);
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    public ProtoBuf$QualifiedNameTable getQualifiedNames() {
        return this.qualifiedNames_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9370 = (this.bitField0_ & 1) == 1 ? C4707.m9370(1, this.strings_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9370 += C4707.m9370(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9370 += C4707.m9370(3, this.package_);
        }
        for (int i2 = 0; i2 < this.class__.size(); i2++) {
            iM9370 += C4707.m9370(4, this.class__.get(i2));
        }
        int size = this.unknownFields.size() + extensionsSerializedSize() + iM9370;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        C4719 c4719NewExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9380(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9380(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9380(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            c4707.m9380(4, this.class__.get(i));
        }
        c4719NewExtensionWriter.m9420(200, c4707);
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public ProtoBuf$PackageFragment getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6962 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6962 toBuilder() {
        return newBuilder(this);
    }

    public static C6962 newBuilder(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        C6962 c6962NewBuilder = newBuilder();
        c6962NewBuilder.m12255(protoBuf$PackageFragment);
        return c6962NewBuilder;
    }

    private ProtoBuf$PackageFragment(AbstractC4720 abstractC4720) {
        super(abstractC4720);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4720.f13804;
    }

    private ProtoBuf$PackageFragment(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}
