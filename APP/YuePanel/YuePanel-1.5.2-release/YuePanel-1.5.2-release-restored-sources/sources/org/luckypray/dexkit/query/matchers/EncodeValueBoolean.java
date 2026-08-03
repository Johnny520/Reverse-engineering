package org.luckypray.dexkit.query.matchers;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.FlatBufferBuilder;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "value", "", "(Z)V", "getValue", "()Z", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class EncodeValueBoolean extends EncodeValue implements IAnnotationEncodeValue {
    private final boolean value;

    public EncodeValueBoolean(boolean z) {
        this.value = z;
    }

    public final boolean getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder) {
        C5499.m17103(flatBufferBuilder, "fbb");
        int iCreateEncodeValueBoolean = org.luckypray.dexkit.schema.EncodeValueBoolean.INSTANCE.createEncodeValueBoolean(flatBufferBuilder, this.value);
        flatBufferBuilder.finish(iCreateEncodeValueBoolean);
        return iCreateEncodeValueBoolean;
    }
}
