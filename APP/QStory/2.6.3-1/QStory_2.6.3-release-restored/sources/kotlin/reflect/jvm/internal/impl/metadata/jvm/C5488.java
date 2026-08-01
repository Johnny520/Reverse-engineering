package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5488 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public List f13948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public List f13950;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypesM9833 = m9833();
        if (jvmProtoBuf$StringTableTypesM9833.isInitialized()) {
            return jvmProtoBuf$StringTableTypesM9833;
        }
        throw new UninitializedMessageException(jvmProtoBuf$StringTableTypesM9833);
    }

    public final Object clone() {
        C5488 c5488 = new C5488();
        List list = Collections.EMPTY_LIST;
        c5488.f13950 = list;
        c5488.f13948 = list;
        c5488.m9832(m9833());
        return c5488;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9832(JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes) {
        if (jvmProtoBuf$StringTableTypes == JvmProtoBuf$StringTableTypes.getDefaultInstance()) {
            return;
        }
        if (!jvmProtoBuf$StringTableTypes.record_.isEmpty()) {
            if (this.f13950.isEmpty()) {
                this.f13950 = jvmProtoBuf$StringTableTypes.record_;
                this.f13949 &= -2;
            } else {
                if ((this.f13949 & 1) != 1) {
                    this.f13950 = new ArrayList(this.f13950);
                    this.f13949 |= 1;
                }
                this.f13950.addAll(jvmProtoBuf$StringTableTypes.record_);
            }
        }
        if (!jvmProtoBuf$StringTableTypes.localName_.isEmpty()) {
            if (this.f13948.isEmpty()) {
                this.f13948 = jvmProtoBuf$StringTableTypes.localName_;
                this.f13949 &= -3;
            } else {
                if ((this.f13949 & 2) != 2) {
                    this.f13948 = new ArrayList(this.f13948);
                    this.f13949 |= 2;
                }
                this.f13948.addAll(jvmProtoBuf$StringTableTypes.localName_);
            }
        }
        this.f14153 = this.f14153.m9960(jvmProtoBuf$StringTableTypes.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$StringTableTypes m9833() {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes = new JvmProtoBuf$StringTableTypes(this);
        if ((this.f13949 & 1) == 1) {
            this.f13950 = Collections.unmodifiableList(this.f13950);
            this.f13949 &= -2;
        }
        jvmProtoBuf$StringTableTypes.record_ = this.f13950;
        if ((this.f13949 & 2) == 2) {
            this.f13948 = Collections.unmodifiableList(this.f13948);
            this.f13949 &= -3;
        }
        jvmProtoBuf$StringTableTypes.localName_ = this.f13948;
        return jvmProtoBuf$StringTableTypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9832((JvmProtoBuf$StringTableTypes) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes = null;
        try {
            try {
                m9832((JvmProtoBuf$StringTableTypes) JvmProtoBuf$StringTableTypes.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes2 = (JvmProtoBuf$StringTableTypes) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmProtoBuf$StringTableTypes = jvmProtoBuf$StringTableTypes2;
                    if (jvmProtoBuf$StringTableTypes != null) {
                        m9832(jvmProtoBuf$StringTableTypes);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jvmProtoBuf$StringTableTypes != null) {
            }
            throw th;
        }
    }
}
