package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6915;
import p071.C6916;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf$JvmFieldSignature extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(0);
    private static final JvmProtoBuf$JvmFieldSignature defaultInstance;
    private int bitField0_;
    private int desc_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final AbstractC4709 unknownFields;

    static {
        JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature = new JvmProtoBuf$JvmFieldSignature(true);
        defaultInstance = jvmProtoBuf$JvmFieldSignature;
        jvmProtoBuf$JvmFieldSignature.initFields();
    }

    private JvmProtoBuf$JvmFieldSignature(C4708 c4708, C4725 c4725) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = c4708.m9407();
                        } else if (iM9397 == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = c4708.m9407();
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
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

    public static JvmProtoBuf$JvmFieldSignature getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.name_ = 0;
        this.desc_ = 0;
    }

    public static C6915 newBuilder(JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature) {
        C6915 c6915NewBuilder = newBuilder();
        c6915NewBuilder.m12182(jvmProtoBuf$JvmFieldSignature);
        return c6915NewBuilder;
    }

    public int getDesc() {
        return this.desc_;
    }

    public int getName() {
        return this.name_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.name_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9372 += C4707.m9372(2, this.desc_);
        }
        int size = this.unknownFields.size() + iM9372;
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasDesc() {
        return (this.bitField0_ & 2) == 2;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4707.m9388(1, this.name_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9388(2, this.desc_);
        }
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public JvmProtoBuf$JvmFieldSignature getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6915 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6915 toBuilder() {
        return newBuilder(this);
    }

    public static C6915 newBuilder() {
        return new C6915();
    }

    private JvmProtoBuf$JvmFieldSignature(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private JvmProtoBuf$JvmFieldSignature(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}
