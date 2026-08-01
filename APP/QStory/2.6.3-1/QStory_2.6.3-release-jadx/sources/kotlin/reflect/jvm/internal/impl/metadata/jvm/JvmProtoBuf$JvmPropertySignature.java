package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7743;
import p087.C7744;
import p087.C7745;
import p087.C7746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf$JvmPropertySignature extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(2);
    private static final JvmProtoBuf$JvmPropertySignature defaultInstance;
    private int bitField0_;
    private JvmProtoBuf$JvmMethodSignature delegateMethod_;
    private JvmProtoBuf$JvmFieldSignature field_;
    private JvmProtoBuf$JvmMethodSignature getter_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private JvmProtoBuf$JvmMethodSignature setter_;
    private JvmProtoBuf$JvmMethodSignature syntheticMethod_;
    private final AbstractC5542 unknownFields;

    static {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = new JvmProtoBuf$JvmPropertySignature(true);
        defaultInstance = jvmProtoBuf$JvmPropertySignature;
        jvmProtoBuf$JvmPropertySignature.initFields();
    }

    private JvmProtoBuf$JvmPropertySignature(C5541 c5541, C5558 c5558) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 10) {
                            C7745 builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                            JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature = (JvmProtoBuf$JvmFieldSignature) c5541.m9939(JvmProtoBuf$JvmFieldSignature.PARSER, c5558);
                            this.field_ = jvmProtoBuf$JvmFieldSignature;
                            if (builder != null) {
                                builder.m12769(jvmProtoBuf$JvmFieldSignature);
                                this.field_ = builder.m12770();
                            }
                            this.bitField0_ |= 1;
                        } else if (iM9946 == 18) {
                            C7744 builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) c5541.m9939(JvmProtoBuf$JvmMethodSignature.PARSER, c5558);
                            this.syntheticMethod_ = jvmProtoBuf$JvmMethodSignature;
                            if (builder2 != null) {
                                builder2.m12767(jvmProtoBuf$JvmMethodSignature);
                                this.syntheticMethod_ = builder2.m12768();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9946 == 26) {
                            C7744 builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature2 = (JvmProtoBuf$JvmMethodSignature) c5541.m9939(JvmProtoBuf$JvmMethodSignature.PARSER, c5558);
                            this.getter_ = jvmProtoBuf$JvmMethodSignature2;
                            if (builder3 != null) {
                                builder3.m12767(jvmProtoBuf$JvmMethodSignature2);
                                this.getter_ = builder3.m12768();
                            }
                            this.bitField0_ |= 4;
                        } else if (iM9946 == 34) {
                            C7744 builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature3 = (JvmProtoBuf$JvmMethodSignature) c5541.m9939(JvmProtoBuf$JvmMethodSignature.PARSER, c5558);
                            this.setter_ = jvmProtoBuf$JvmMethodSignature3;
                            if (builder4 != null) {
                                builder4.m12767(jvmProtoBuf$JvmMethodSignature3);
                                this.setter_ = builder4.m12768();
                            }
                            this.bitField0_ |= 8;
                        } else if (iM9946 == 42) {
                            C7744 builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature4 = (JvmProtoBuf$JvmMethodSignature) c5541.m9939(JvmProtoBuf$JvmMethodSignature.PARSER, c5558);
                            this.delegateMethod_ = jvmProtoBuf$JvmMethodSignature4;
                            if (builder5 != null) {
                                builder5.m12767(jvmProtoBuf$JvmMethodSignature4);
                                this.delegateMethod_ = builder5.m12768();
                            }
                            this.bitField0_ |= 16;
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
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

    public static JvmProtoBuf$JvmPropertySignature getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        this.field_ = JvmProtoBuf$JvmFieldSignature.getDefaultInstance();
        this.syntheticMethod_ = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        this.getter_ = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        this.setter_ = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
        this.delegateMethod_ = JvmProtoBuf$JvmMethodSignature.getDefaultInstance();
    }

    public static C7743 newBuilder(JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature) {
        C7743 c7743NewBuilder = newBuilder();
        c7743NewBuilder.m12765(jvmProtoBuf$JvmPropertySignature);
        return c7743NewBuilder;
    }

    public JvmProtoBuf$JvmMethodSignature getDelegateMethod() {
        return this.delegateMethod_;
    }

    public JvmProtoBuf$JvmFieldSignature getField() {
        return this.field_;
    }

    public JvmProtoBuf$JvmMethodSignature getGetter() {
        return this.getter_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9919 = (this.bitField0_ & 1) == 1 ? C5540.m9919(1, this.field_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9919 += C5540.m9919(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9919 += C5540.m9919(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9919 += C5540.m9919(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9919 += C5540.m9919(5, this.delegateMethod_);
        }
        int size = this.unknownFields.size() + iM9919;
        this.memoizedSerializedSize = size;
        return size;
    }

    public JvmProtoBuf$JvmMethodSignature getSetter() {
        return this.setter_;
    }

    public JvmProtoBuf$JvmMethodSignature getSyntheticMethod() {
        return this.syntheticMethod_;
    }

    public boolean hasDelegateMethod() {
        return (this.bitField0_ & 16) == 16;
    }

    public boolean hasField() {
        return (this.bitField0_ & 1) == 1;
    }

    public boolean hasGetter() {
        return (this.bitField0_ & 4) == 4;
    }

    public boolean hasSetter() {
        return (this.bitField0_ & 8) == 8;
    }

    public boolean hasSyntheticMethod() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c5540.m9929(1, this.field_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c5540.m9929(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c5540.m9929(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c5540.m9929(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c5540.m9929(5, this.delegateMethod_);
        }
        c5540.m9934(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public JvmProtoBuf$JvmPropertySignature getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7743 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C7743 toBuilder() {
        return newBuilder(this);
    }

    public static C7743 newBuilder() {
        return C7743.m12764();
    }

    private JvmProtoBuf$JvmPropertySignature(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private JvmProtoBuf$JvmPropertySignature(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}
