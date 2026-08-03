package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "()V", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EncodeValueNull extends org.luckypray.dexkit.query.matchers.EncodeValue implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue {
    public EncodeValueNull() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3) {
            r2 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.schema.-EncodeValueNull$Companion r0 = org.luckypray.dexkit.schema.EncodeValueNull.Companion
            r1 = 0
            int r0 = r0.createEncodeValueNull(r3, r1)
            r3.finish(r0)
            return r0
    }
}
