package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: EncodeValues.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;", "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;", "value", "", "(C)V", "getValue", "()C", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class EncodeValueChar extends org.luckypray.dexkit.query.matchers.EncodeValue implements org.luckypray.dexkit.query.base.IAnnotationEncodeValue, org.luckypray.dexkit.query.base.INumberEncodeValue {
    private final char value;

    public EncodeValueChar(char r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public final char getValue() {
            r1 = this;
            char r0 = r1.value
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r3) {
            r2 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.luckypray.dexkit.schema.-EncodeValueChar$Companion r0 = org.luckypray.dexkit.schema.EncodeValueChar.Companion
            char r1 = r2.value
            short r1 = (short) r1
            int r0 = r0.createEncodeValueChar(r3, r1)
            r3.finish(r0)
            return r0
    }
}
