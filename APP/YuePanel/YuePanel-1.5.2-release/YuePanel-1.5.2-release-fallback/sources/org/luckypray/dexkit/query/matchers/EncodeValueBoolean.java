package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "value", "", "(Z)V", "getValue", "()Z", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EncodeValueBoolean extends org.luckypray.dexkit.query.matchers.EncodeValue implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    private final boolean value;

    public EncodeValueBoolean(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public final boolean getValue() {
            r1 = this;
            boolean r0 = r1.value
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3) {
            r2 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.schema.-EncodeValueBoolean$Companion r0 = org.luckypray.dexkit.schema.EncodeValueBoolean.Companion
            boolean r1 = r2.value
            int r0 = r0.createEncodeValueBoolean(r3, r1)
            r3.finish(r0)
            return r0
    }
}
