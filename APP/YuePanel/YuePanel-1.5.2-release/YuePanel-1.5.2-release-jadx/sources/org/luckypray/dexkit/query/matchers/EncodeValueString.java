package org.luckypray.dexkit.query.matchers;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.FlatBufferBuilder;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m2699d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueString;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class EncodeValueString extends EncodeValue {

    @InterfaceC6399
    private final String value;

    public EncodeValueString(@InterfaceC6399 String str) {
        C5499.m17103(str, "value");
        this.value = str;
    }

    @InterfaceC6399
    public final String getValue() {
        return this.value;
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder) {
        C5499.m17103(flatBufferBuilder, "fbb");
        int iCreateEncodeValueString = org.luckypray.dexkit.schema.EncodeValueString.INSTANCE.createEncodeValueString(flatBufferBuilder, flatBufferBuilder.createString(this.value));
        flatBufferBuilder.finish(iCreateEncodeValueString);
        return iCreateEncodeValueString;
    }
}
