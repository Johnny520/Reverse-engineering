package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6914;
import p071.C6915;
import p071.C6916;
import p071.C6917;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf$JvmPropertySignature extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(2);
    private static final JvmProtoBuf$JvmPropertySignature defaultInstance;
    private int bitField0_;
    private JvmProtoBuf$JvmMethodSignature delegateMethod_;
    private JvmProtoBuf$JvmFieldSignature field_;
    private JvmProtoBuf$JvmMethodSignature getter_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private JvmProtoBuf$JvmMethodSignature setter_;
    private JvmProtoBuf$JvmMethodSignature syntheticMethod_;
    private final AbstractC4710 unknownFields;

    static {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = new JvmProtoBuf$JvmPropertySignature(true);
        defaultInstance = jvmProtoBuf$JvmPropertySignature;
        jvmProtoBuf$JvmPropertySignature.initFields();
    }

    private JvmProtoBuf$JvmPropertySignature(C4709 c4709, C4726 c4726) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 10) {
                            C6916 builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                            JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature = (JvmProtoBuf$JvmFieldSignature) c4709.m9380(JvmProtoBuf$JvmFieldSignature.PARSER, c4726);
                            this.field_ = jvmProtoBuf$JvmFieldSignature;
                            if (builder != null) {
                                builder.m12210(jvmProtoBuf$JvmFieldSignature);
                                this.field_ = builder.m12211();
                            }
                            this.bitField0_ |= 1;
                        } else if (iM9387 == 18) {
                            C6915 builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) c4709.m9380(JvmProtoBuf$JvmMethodSignature.PARSER, c4726);
                            this.syntheticMethod_ = jvmProtoBuf$JvmMethodSignature;
                            if (builder2 != null) {
                                builder2.m12208(jvmProtoBuf$JvmMethodSignature);
                                this.syntheticMethod_ = builder2.m12209();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9387 == 26) {
                            C6915 builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature2 = (JvmProtoBuf$JvmMethodSignature) c4709.m9380(JvmProtoBuf$JvmMethodSignature.PARSER, c4726);
                            this.getter_ = jvmProtoBuf$JvmMethodSignature2;
                            if (builder3 != null) {
                                builder3.m12208(jvmProtoBuf$JvmMethodSignature2);
                                this.getter_ = builder3.m12209();
                            }
                            this.bitField0_ |= 4;
                        } else if (iM9387 == 34) {
                            C6915 builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature3 = (JvmProtoBuf$JvmMethodSignature) c4709.m9380(JvmProtoBuf$JvmMethodSignature.PARSER, c4726);
                            this.setter_ = jvmProtoBuf$JvmMethodSignature3;
                            if (builder4 != null) {
                                builder4.m12208(jvmProtoBuf$JvmMethodSignature3);
                                this.setter_ = builder4.m12209();
                            }
                            this.bitField0_ |= 8;
                        } else if (iM9387 == 42) {
                            C6915 builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature4 = (JvmProtoBuf$JvmMethodSignature) c4709.m9380(JvmProtoBuf$JvmMethodSignature.PARSER, c4726);
                            this.delegateMethod_ = jvmProtoBuf$JvmMethodSignature4;
                            if (builder5 != null) {
                                builder5.m12208(jvmProtoBuf$JvmMethodSignature4);
                                this.delegateMethod_ = builder5.m12209();
                            }
                            this.bitField0_ |= 16;
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
                        }
                    }
                    z = true;
                } catch (Throwable th) {
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

    public static C6914 newBuilder(JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature) {
        C6914 c6914NewBuilder = newBuilder();
        c6914NewBuilder.m12206(jvmProtoBuf$JvmPropertySignature);
        return c6914NewBuilder;
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
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9360 = (this.bitField0_ & 1) == 1 ? C4708.m9360(1, this.field_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9360 += C4708.m9360(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9360 += C4708.m9360(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9360 += C4708.m9360(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9360 += C4708.m9360(5, this.delegateMethod_);
        }
        int size = this.unknownFields.size() + iM9360;
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            c4708.m9370(1, this.field_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4708.m9370(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4708.m9370(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4708.m9370(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4708.m9370(5, this.delegateMethod_);
        }
        c4708.m9375(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public JvmProtoBuf$JvmPropertySignature getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6914 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C6914 toBuilder() {
        return newBuilder(this);
    }

    public static C6914 newBuilder() {
        return C6914.m12205();
    }

    private JvmProtoBuf$JvmPropertySignature(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private JvmProtoBuf$JvmPropertySignature(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}
