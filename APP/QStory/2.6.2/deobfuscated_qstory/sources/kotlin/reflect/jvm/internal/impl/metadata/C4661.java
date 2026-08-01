package kotlin.reflect.jvm.internal.impl.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4661 extends AbstractC4728 implements InterfaceC4699 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f13612;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f13613;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public List f13614;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public ProtoBuf$Annotation f13615;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f13616;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f13617;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f13618;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f13619;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public double f13620;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13621;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13622;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtoBuf$Annotation.Argument.Value.Type f13623;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    public final InterfaceC4700 build() {
        ProtoBuf$Annotation.Argument.Value valueM9290 = m9290();
        if (valueM9290.isInitialized()) {
            return valueM9290;
        }
        throw new UninitializedMessageException(valueM9290);
    }

    public final Object clone() {
        C4661 c4661 = new C4661();
        c4661.f13623 = ProtoBuf$Annotation.Argument.Value.Type.BYTE;
        c4661.f13615 = ProtoBuf$Annotation.getDefaultInstance();
        c4661.f13614 = Collections.EMPTY_LIST;
        c4661.m9289(m9290());
        return c4661;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9289(ProtoBuf$Annotation.Argument.Value value) {
        if (value == ProtoBuf$Annotation.Argument.Value.getDefaultInstance()) {
            return;
        }
        if (value.hasType()) {
            ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
            type.getClass();
            this.f13622 |= 1;
            this.f13623 = type;
        }
        if (value.hasIntValue()) {
            long intValue = value.getIntValue();
            this.f13622 |= 2;
            this.f13617 = intValue;
        }
        if (value.hasFloatValue()) {
            float floatValue = value.getFloatValue();
            this.f13622 |= 4;
            this.f13616 = floatValue;
        }
        if (value.hasDoubleValue()) {
            double doubleValue = value.getDoubleValue();
            this.f13622 |= 8;
            this.f13620 = doubleValue;
        }
        if (value.hasStringValue()) {
            int stringValue = value.getStringValue();
            this.f13622 |= 16;
            this.f13621 = stringValue;
        }
        if (value.hasClassId()) {
            int classId = value.getClassId();
            this.f13622 |= 32;
            this.f13618 = classId;
        }
        if (value.hasEnumValueId()) {
            int enumValueId = value.getEnumValueId();
            this.f13622 |= 64;
            this.f13619 = enumValueId;
        }
        if (value.hasAnnotation()) {
            ProtoBuf$Annotation annotation = value.getAnnotation();
            if ((this.f13622 & 128) != 128 || this.f13615 == ProtoBuf$Annotation.getDefaultInstance()) {
                this.f13615 = annotation;
            } else {
                C4659 c4659NewBuilder = ProtoBuf$Annotation.newBuilder(this.f13615);
                c4659NewBuilder.m9287(annotation);
                this.f13615 = c4659NewBuilder.m9288();
            }
            this.f13622 |= 128;
        }
        if (!value.arrayElement_.isEmpty()) {
            if (this.f13614.isEmpty()) {
                this.f13614 = value.arrayElement_;
                this.f13622 &= -257;
            } else {
                if ((this.f13622 & 256) != 256) {
                    this.f13614 = new ArrayList(this.f13614);
                    this.f13622 |= 256;
                }
                this.f13614.addAll(value.arrayElement_);
            }
        }
        if (value.hasArrayDimensionCount()) {
            int arrayDimensionCount = value.getArrayDimensionCount();
            this.f13622 |= 512;
            this.f13613 = arrayDimensionCount;
        }
        if (value.hasFlags()) {
            int flags = value.getFlags();
            this.f13622 |= 1024;
            this.f13612 = flags;
        }
        this.f13804 = this.f13804.m9411(value.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$Annotation.Argument.Value m9290() {
        ProtoBuf$Annotation.Argument.Value value = new ProtoBuf$Annotation.Argument.Value(this);
        int i = this.f13622;
        int i2 = (i & 1) != 1 ? 0 : 1;
        value.type_ = this.f13623;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        value.intValue_ = this.f13617;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        value.floatValue_ = this.f13616;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        value.doubleValue_ = this.f13620;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        value.stringValue_ = this.f13621;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        value.classId_ = this.f13618;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        value.enumValueId_ = this.f13619;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        value.annotation_ = this.f13615;
        if ((this.f13622 & 256) == 256) {
            this.f13614 = Collections.unmodifiableList(this.f13614);
            this.f13622 &= -257;
        }
        value.arrayElement_ = this.f13614;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        value.arrayDimensionCount_ = this.f13613;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        value.flags_ = this.f13612;
        value.bitField0_ = i2;
        return value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC4728 mo9280(GeneratedMessageLite generatedMessageLite) {
        m9289((ProtoBuf$Annotation.Argument.Value) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4716 mo9281(kotlin.reflect.jvm.internal.impl.protobuf.C4708 r3, kotlin.reflect.jvm.internal.impl.protobuf.C4725 r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪哲苏兰 r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.PARSER     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            java.lang.Object r3 = r1.mo9282(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.m9289(r3)
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
            r2.m9289(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.C4661.mo9281(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲):kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲苏世");
    }
}
