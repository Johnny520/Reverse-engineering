package org.luckypray.dexkit.query.matchers;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "value", "", "(I)V", "getValue", "()I", "innerBuild", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EncodeValueInt extends org.luckypray.dexkit.query.matchers.EncodeValue implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.base.INumberEncodeValue {
    private final int value;

    public EncodeValueInt(int r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseMatcher
    public int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r3) {
            r2 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.schema.-EncodeValueInt$Companion r0 = org.luckypray.dexkit.schema.EncodeValueInt.Companion
            int r1 = r2.value
            int r0 = r0.createEncodeValueInt(r3, r1)
            r3.finish(r0)
            return r0
    }
}
