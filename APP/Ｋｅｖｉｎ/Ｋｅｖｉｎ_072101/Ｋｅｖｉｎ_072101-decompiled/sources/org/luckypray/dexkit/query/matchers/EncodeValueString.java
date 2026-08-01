package org.luckypray.dexkit.query.matchers;

/* JADX INFO: compiled from: EncodeValues.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m115d2 = {"Lorg/luckypray/dexkit/query/matchers/EncodeValueString;", "Lorg/luckypray/dexkit/query/matchers/EncodeValue;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "innerBuild", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class EncodeValueString extends org.luckypray.dexkit.query.matchers.EncodeValue {
    private final java.lang.String value;

    public EncodeValueString(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.value = r2
            return
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }

    @Override // org.luckypray.dexkit.query.base.BaseQuery
    protected int innerBuild(com.google.flatbuffers.FlatBufferBuilder r3) {
            r2 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            org.luckypray.dexkit.schema.-EncodeValueString$Companion r0 = org.luckypray.dexkit.schema.EncodeValueString.Companion
            java.lang.String r1 = r2.value
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r3.createString(r1)
            int r0 = r0.createEncodeValueString(r3, r1)
            r3.finish(r0)
            return r0
    }
}
