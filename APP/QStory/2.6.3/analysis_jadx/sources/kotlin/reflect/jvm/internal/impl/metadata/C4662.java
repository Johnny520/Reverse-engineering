package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4662 extends AbstractC4729 implements InterfaceC4700 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f13616;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f13617;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13618;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Annotation f13619;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f13620;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f13621;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f13622;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f13623;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public double f13624;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13626;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Annotation.Argument.Value.Type f13627;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    public final InterfaceC4701 build() {
        ProtoBuf$Annotation.Argument.Value valueM9280 = m9280();
        if (valueM9280.isInitialized()) {
            return valueM9280;
        }
        throw new UninitializedMessageException(valueM9280);
    }

    public final Object clone() {
        C4662 c4662 = new C4662();
        c4662.f13627 = ProtoBuf$Annotation.Argument.Value.Type.BYTE;
        c4662.f13619 = ProtoBuf$Annotation.getDefaultInstance();
        c4662.f13618 = Collections.EMPTY_LIST;
        c4662.m9279(m9280());
        return c4662;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9279(ProtoBuf$Annotation.Argument.Value value) {
        if (value == ProtoBuf$Annotation.Argument.Value.getDefaultInstance()) {
            return;
        }
        if (value.hasType()) {
            ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
            type.getClass();
            this.f13626 |= 1;
            this.f13627 = type;
        }
        if (value.hasIntValue()) {
            long intValue = value.getIntValue();
            this.f13626 |= 2;
            this.f13621 = intValue;
        }
        if (value.hasFloatValue()) {
            float floatValue = value.getFloatValue();
            this.f13626 |= 4;
            this.f13620 = floatValue;
        }
        if (value.hasDoubleValue()) {
            double doubleValue = value.getDoubleValue();
            this.f13626 |= 8;
            this.f13624 = doubleValue;
        }
        if (value.hasStringValue()) {
            int stringValue = value.getStringValue();
            this.f13626 |= 16;
            this.f13625 = stringValue;
        }
        if (value.hasClassId()) {
            int classId = value.getClassId();
            this.f13626 |= 32;
            this.f13622 = classId;
        }
        if (value.hasEnumValueId()) {
            int enumValueId = value.getEnumValueId();
            this.f13626 |= 64;
            this.f13623 = enumValueId;
        }
        if (value.hasAnnotation()) {
            ProtoBuf$Annotation annotation = value.getAnnotation();
            if ((this.f13626 & 128) != 128 || this.f13619 == ProtoBuf$Annotation.getDefaultInstance()) {
                this.f13619 = annotation;
            } else {
                C4660 c4660NewBuilder = ProtoBuf$Annotation.newBuilder(this.f13619);
                c4660NewBuilder.m9277(annotation);
                this.f13619 = c4660NewBuilder.m9278();
            }
            this.f13626 |= 128;
        }
        if (!value.arrayElement_.isEmpty()) {
            if (this.f13618.isEmpty()) {
                this.f13618 = value.arrayElement_;
                this.f13626 &= -257;
            } else {
                if ((this.f13626 & 256) != 256) {
                    this.f13618 = new ArrayList(this.f13618);
                    this.f13626 |= 256;
                }
                this.f13618.addAll(value.arrayElement_);
            }
        }
        if (value.hasArrayDimensionCount()) {
            int arrayDimensionCount = value.getArrayDimensionCount();
            this.f13626 |= 512;
            this.f13617 = arrayDimensionCount;
        }
        if (value.hasFlags()) {
            int flags = value.getFlags();
            this.f13626 |= 1024;
            this.f13616 = flags;
        }
        this.f13808 = this.f13808.m9401(value.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Annotation.Argument.Value m9280() {
        ProtoBuf$Annotation.Argument.Value value = new ProtoBuf$Annotation.Argument.Value(this);
        int i = this.f13626;
        int i2 = (i & 1) != 1 ? 0 : 1;
        value.type_ = this.f13627;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        value.intValue_ = this.f13621;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        value.floatValue_ = this.f13620;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        value.doubleValue_ = this.f13624;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        value.stringValue_ = this.f13625;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        value.classId_ = this.f13622;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        value.enumValueId_ = this.f13623;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        value.annotation_ = this.f13619;
        if ((this.f13626 & 256) == 256) {
            this.f13618 = Collections.unmodifiableList(this.f13618);
            this.f13626 &= -257;
        }
        value.arrayElement_ = this.f13618;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        value.arrayDimensionCount_ = this.f13617;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        value.flags_ = this.f13616;
        value.bitField0_ = i2;
        return value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4729 mo9270(GeneratedMessageLite generatedMessageLite) {
        m9279((ProtoBuf$Annotation.Argument.Value) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4717 mo9271(kotlin.reflect.jvm.internal.impl.protobuf.C4709 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9272(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9279(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L19
        Lf:
            r3 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰 r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> Ld
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m9279(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4662.mo9271(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
