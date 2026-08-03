package org.luckypray.dexkit.query.matchers;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.FlatBufferBuilder;
import org.luckypray.dexkit.query.base.IAnnotationEncodeValue;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class EncodeValueNull extends EncodeValue implements IAnnotationEncodeValue {
    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder) {
        C5499.m17103(flatBufferBuilder, "fbb");
        int iCreateEncodeValueNull = org.luckypray.dexkit.schema.EncodeValueNull.INSTANCE.createEncodeValueNull(flatBufferBuilder, (byte) 0);
        flatBufferBuilder.finish(iCreateEncodeValueNull);
        return iCreateEncodeValueNull;
    }
}
