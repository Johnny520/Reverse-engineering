package org.luckypray.dexkit.query.matchers;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.FlatBufferBuilder;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;
import org.luckypray.dexkit.query.base.INumberEncodeValue;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "value", "", "(D)V", "getValue", "()D", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class EncodeValueDouble extends EncodeValue implements IAnnotationEncodeValue, INumberEncodeValue {
    private final double value;

    public EncodeValueDouble(double d) {
        this.value = d;
    }

    public final double getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder) {
        C5499.m17103(flatBufferBuilder, "fbb");
        int iCreateEncodeValueDouble = org.luckypray.dexkit.schema.EncodeValueDouble.INSTANCE.createEncodeValueDouble(flatBufferBuilder, this.value);
        flatBufferBuilder.finish(iCreateEncodeValueDouble);
        return iCreateEncodeValueDouble;
    }
}
