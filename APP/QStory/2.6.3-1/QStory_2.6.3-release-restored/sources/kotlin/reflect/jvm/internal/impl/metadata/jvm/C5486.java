package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5486 extends AbstractC5561 implements InterfaceC5532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f13941;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13942;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List f13943;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public JvmProtoBuf$StringTableTypes.Record.Operation f13944;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public List f13945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f13946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13947;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    public final InterfaceC5533 build() {
        JvmProtoBuf$StringTableTypes.Record recordM9828 = m9828();
        if (recordM9828.isInitialized()) {
            return recordM9828;
        }
        throw new UninitializedMessageException(recordM9828);
    }

    public final Object clone() {
        C5486 c5486 = new C5486();
        c5486.f13947 = 1;
        c5486.f13941 = "";
        c5486.f13944 = JvmProtoBuf$StringTableTypes.Record.Operation.NONE;
        List list = Collections.EMPTY_LIST;
        c5486.f13945 = list;
        c5486.f13943 = list;
        c5486.m9827(m9828());
        return c5486;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m9827(JvmProtoBuf$StringTableTypes.Record record) {
        if (record == JvmProtoBuf$StringTableTypes.Record.getDefaultInstance()) {
            return;
        }
        if (record.hasRange()) {
            int range = record.getRange();
            this.f13946 |= 1;
            this.f13947 = range;
        }
        if (record.hasPredefinedIndex()) {
            int predefinedIndex = record.getPredefinedIndex();
            this.f13946 |= 2;
            this.f13942 = predefinedIndex;
        }
        if (record.hasString()) {
            this.f13946 |= 4;
            this.f13941 = record.string_;
        }
        if (record.hasOperation()) {
            JvmProtoBuf$StringTableTypes.Record.Operation operation = record.getOperation();
            operation.getClass();
            this.f13946 |= 8;
            this.f13944 = operation;
        }
        if (!record.substringIndex_.isEmpty()) {
            if (this.f13945.isEmpty()) {
                this.f13945 = record.substringIndex_;
                this.f13946 &= -17;
            } else {
                if ((this.f13946 & 16) != 16) {
                    this.f13945 = new ArrayList(this.f13945);
                    this.f13946 |= 16;
                }
                this.f13945.addAll(record.substringIndex_);
            }
        }
        if (!record.replaceChar_.isEmpty()) {
            if (this.f13943.isEmpty()) {
                this.f13943 = record.replaceChar_;
                this.f13946 &= -33;
            } else {
                if ((this.f13946 & 32) != 32) {
                    this.f13943 = new ArrayList(this.f13943);
                    this.f13946 |= 32;
                }
                this.f13943.addAll(record.replaceChar_);
            }
        }
        this.f14153 = this.f14153.m9960(record.unknownFields);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final JvmProtoBuf$StringTableTypes.Record m9828() {
        JvmProtoBuf$StringTableTypes.Record record = new JvmProtoBuf$StringTableTypes.Record(this);
        int i = this.f13946;
        int i2 = (i & 1) != 1 ? 0 : 1;
        record.range_ = this.f13947;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        record.predefinedIndex_ = this.f13942;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        record.string_ = this.f13941;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        record.operation_ = this.f13944;
        if ((this.f13946 & 16) == 16) {
            this.f13945 = Collections.unmodifiableList(this.f13945);
            this.f13946 &= -17;
        }
        record.substringIndex_ = this.f13945;
        if ((this.f13946 & 32) == 32) {
            this.f13943 = Collections.unmodifiableList(this.f13943);
            this.f13946 &= -33;
        }
        record.replaceChar_ = this.f13943;
        record.bitField0_ = i2;
        return record;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ AbstractC5561 mo9829(GeneratedMessageLite generatedMessageLite) {
        m9827((JvmProtoBuf$StringTableTypes.Record) generatedMessageLite);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5549
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5549 mo9830(C5541 c5541, C5558 c5558) throws Throwable {
        JvmProtoBuf$StringTableTypes.Record record = null;
        try {
            try {
                m9827((JvmProtoBuf$StringTableTypes.Record) JvmProtoBuf$StringTableTypes.Record.PARSER.mo9831(c5541, c5558));
                return this;
            } catch (InvalidProtocolBufferException e) {
                JvmProtoBuf$StringTableTypes.Record record2 = (JvmProtoBuf$StringTableTypes.Record) e.getUnfinishedMessage();
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    record = record2;
                    if (record != null) {
                        m9827(record);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (record != null) {
            }
            throw th;
        }
    }
}
