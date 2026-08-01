package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5494 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f13961;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f13962;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13963;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Annotation f13964;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f13965;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f13966;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f13967;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f13968;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public double f13969;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13970;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13971;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Annotation.Argument.Value.Type f13972;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        ProtoBuf$Annotation.Argument.Value valueM9839 = m9839();
        if (valueM9839.isInitialized()) {
            return valueM9839;
        }
        throw new UninitializedMessageException(valueM9839);
    }

    public final Object clone() {
        C5494 c5494 = new C5494();
        c5494.f13972 = ProtoBuf$Annotation.Argument.Value.Type.BYTE;
        c5494.f13964 = ProtoBuf$Annotation.getDefaultInstance();
        c5494.f13963 = Collections.EMPTY_LIST;
        c5494.m9838(m9839());
        return c5494;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9838(ProtoBuf$Annotation.Argument.Value value) {
        if (value == ProtoBuf$Annotation.Argument.Value.getDefaultInstance()) {
            return;
        }
        if (value.hasType()) {
            ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
            type.getClass();
            this.f13971 |= 1;
            this.f13972 = type;
        }
        if (value.hasIntValue()) {
            long intValue = value.getIntValue();
            this.f13971 |= 2;
            this.f13966 = intValue;
        }
        if (value.hasFloatValue()) {
            float floatValue = value.getFloatValue();
            this.f13971 |= 4;
            this.f13965 = floatValue;
        }
        if (value.hasDoubleValue()) {
            double doubleValue = value.getDoubleValue();
            this.f13971 |= 8;
            this.f13969 = doubleValue;
        }
        if (value.hasStringValue()) {
            int stringValue = value.getStringValue();
            this.f13971 |= 16;
            this.f13970 = stringValue;
        }
        if (value.hasClassId()) {
            int classId = value.getClassId();
            this.f13971 |= 32;
            this.f13967 = classId;
        }
        if (value.hasEnumValueId()) {
            int enumValueId = value.getEnumValueId();
            this.f13971 |= 64;
            this.f13968 = enumValueId;
        }
        if (value.hasAnnotation()) {
            ProtoBuf$Annotation annotation = value.getAnnotation();
            if ((this.f13971 & 128) != 128 || this.f13964 == ProtoBuf$Annotation.getDefaultInstance()) {
                this.f13964 = annotation;
            } else {
                C5492 c5492NewBuilder = ProtoBuf$Annotation.newBuilder(this.f13964);
                c5492NewBuilder.m9836(annotation);
                this.f13964 = c5492NewBuilder.m9837();
            }
            this.f13971 |= 128;
        }
        if (!value.arrayElement_.isEmpty()) {
            if (this.f13963.isEmpty()) {
                this.f13963 = value.arrayElement_;
                this.f13971 &= -257;
            } else {
                if ((this.f13971 & 256) != 256) {
                    this.f13963 = new ArrayList(this.f13963);
                    this.f13971 |= 256;
                }
                this.f13963.addAll(value.arrayElement_);
            }
        }
        if (value.hasArrayDimensionCount()) {
            int arrayDimensionCount = value.getArrayDimensionCount();
            this.f13971 |= 512;
            this.f13962 = arrayDimensionCount;
        }
        if (value.hasFlags()) {
            int flags = value.getFlags();
            this.f13971 |= 1024;
            this.f13961 = flags;
        }
        this.f14153 = this.f14153.m9960(value.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Annotation.Argument.Value m9839() {
        ProtoBuf$Annotation.Argument.Value value = new ProtoBuf$Annotation.Argument.Value(this);
        int i = this.f13971;
        int i2 = (i & 1) != 1 ? 0 : 1;
        value.type_ = this.f13972;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        value.intValue_ = this.f13966;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        value.floatValue_ = this.f13965;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        value.doubleValue_ = this.f13969;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        value.stringValue_ = this.f13970;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        value.classId_ = this.f13967;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        value.enumValueId_ = this.f13968;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        value.annotation_ = this.f13964;
        if ((this.f13971 & 256) == 256) {
            this.f13963 = Collections.unmodifiableList(this.f13963);
            this.f13971 &= -257;
        }
        value.arrayElement_ = this.f13963;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        value.arrayDimensionCount_ = this.f13962;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        value.flags_ = this.f13961;
        value.bitField0_ = i2;
        return value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9838((ProtoBuf$Annotation.Argument.Value) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        ProtoBuf$Annotation.Argument.Value value = null;
        try {
            try {
                m9838((ProtoBuf$Annotation.Argument.Value) ProtoBuf$Annotation.Argument.Value.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                ProtoBuf$Annotation.Argument.Value value2 = (ProtoBuf$Annotation.Argument.Value) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    value = value2;
                    if (value != null) {
                        m9838(value);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (value != null) {
            }
            throw th;
        }
    }
}
