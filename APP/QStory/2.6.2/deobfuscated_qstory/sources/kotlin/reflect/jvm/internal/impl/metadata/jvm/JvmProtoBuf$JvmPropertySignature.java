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
import p071.C6913;
import p071.C6914;
import p071.C6915;
import p071.C6916;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf$JvmPropertySignature extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(2);
    private static final JvmProtoBuf$JvmPropertySignature defaultInstance;
    private int bitField0_;
    private JvmProtoBuf$JvmMethodSignature delegateMethod_;
    private JvmProtoBuf$JvmFieldSignature field_;
    private JvmProtoBuf$JvmMethodSignature getter_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private JvmProtoBuf$JvmMethodSignature setter_;
    private JvmProtoBuf$JvmMethodSignature syntheticMethod_;
    private final AbstractC4709 unknownFields;

    static {
        JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = new JvmProtoBuf$JvmPropertySignature(true);
        defaultInstance = jvmProtoBuf$JvmPropertySignature;
        jvmProtoBuf$JvmPropertySignature.initFields();
    }

    private JvmProtoBuf$JvmPropertySignature(C4708 c4708, C4725 c4725) {
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
                        if (iM9397 == 10) {
                            C6915 builder = (this.bitField0_ & 1) == 1 ? this.field_.toBuilder() : null;
                            JvmProtoBuf$JvmFieldSignature jvmProtoBuf$JvmFieldSignature = (JvmProtoBuf$JvmFieldSignature) c4708.m9390(JvmProtoBuf$JvmFieldSignature.PARSER, c4725);
                            this.field_ = jvmProtoBuf$JvmFieldSignature;
                            if (builder != null) {
                                builder.m12182(jvmProtoBuf$JvmFieldSignature);
                                this.field_ = builder.m12183();
                            }
                            this.bitField0_ |= 1;
                        } else if (iM9397 == 18) {
                            C6914 builder2 = (this.bitField0_ & 2) == 2 ? this.syntheticMethod_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature = (JvmProtoBuf$JvmMethodSignature) c4708.m9390(JvmProtoBuf$JvmMethodSignature.PARSER, c4725);
                            this.syntheticMethod_ = jvmProtoBuf$JvmMethodSignature;
                            if (builder2 != null) {
                                builder2.m12180(jvmProtoBuf$JvmMethodSignature);
                                this.syntheticMethod_ = builder2.m12181();
                            }
                            this.bitField0_ |= 2;
                        } else if (iM9397 == 26) {
                            C6914 builder3 = (this.bitField0_ & 4) == 4 ? this.getter_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature2 = (JvmProtoBuf$JvmMethodSignature) c4708.m9390(JvmProtoBuf$JvmMethodSignature.PARSER, c4725);
                            this.getter_ = jvmProtoBuf$JvmMethodSignature2;
                            if (builder3 != null) {
                                builder3.m12180(jvmProtoBuf$JvmMethodSignature2);
                                this.getter_ = builder3.m12181();
                            }
                            this.bitField0_ |= 4;
                        } else if (iM9397 == 34) {
                            C6914 builder4 = (this.bitField0_ & 8) == 8 ? this.setter_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature3 = (JvmProtoBuf$JvmMethodSignature) c4708.m9390(JvmProtoBuf$JvmMethodSignature.PARSER, c4725);
                            this.setter_ = jvmProtoBuf$JvmMethodSignature3;
                            if (builder4 != null) {
                                builder4.m12180(jvmProtoBuf$JvmMethodSignature3);
                                this.setter_ = builder4.m12181();
                            }
                            this.bitField0_ |= 8;
                        } else if (iM9397 == 42) {
                            C6914 builder5 = (this.bitField0_ & 16) == 16 ? this.delegateMethod_.toBuilder() : null;
                            JvmProtoBuf$JvmMethodSignature jvmProtoBuf$JvmMethodSignature4 = (JvmProtoBuf$JvmMethodSignature) c4708.m9390(JvmProtoBuf$JvmMethodSignature.PARSER, c4725);
                            this.delegateMethod_ = jvmProtoBuf$JvmMethodSignature4;
                            if (builder5 != null) {
                                builder5.m12180(jvmProtoBuf$JvmMethodSignature4);
                                this.delegateMethod_ = builder5.m12181();
                            }
                            this.bitField0_ |= 16;
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

    public static C6913 newBuilder(JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature) {
        C6913 c6913NewBuilder = newBuilder();
        c6913NewBuilder.m12178(jvmProtoBuf$JvmPropertySignature);
        return c6913NewBuilder;
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
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9370 = (this.bitField0_ & 1) == 1 ? C4707.m9370(1, this.field_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iM9370 += C4707.m9370(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iM9370 += C4707.m9370(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iM9370 += C4707.m9370(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iM9370 += C4707.m9370(5, this.delegateMethod_);
        }
        int size = this.unknownFields.size() + iM9370;
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
            c4707.m9380(1, this.field_);
        }
        if ((this.bitField0_ & 2) == 2) {
            c4707.m9380(2, this.syntheticMethod_);
        }
        if ((this.bitField0_ & 4) == 4) {
            c4707.m9380(3, this.getter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            c4707.m9380(4, this.setter_);
        }
        if ((this.bitField0_ & 16) == 16) {
            c4707.m9380(5, this.delegateMethod_);
        }
        c4707.m9385(this.unknownFields);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public JvmProtoBuf$JvmPropertySignature getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6913 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C6913 toBuilder() {
        return newBuilder(this);
    }

    public static C6913 newBuilder() {
        return C6913.m12177();
    }

    private JvmProtoBuf$JvmPropertySignature(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private JvmProtoBuf$JvmPropertySignature(boolean z) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}
