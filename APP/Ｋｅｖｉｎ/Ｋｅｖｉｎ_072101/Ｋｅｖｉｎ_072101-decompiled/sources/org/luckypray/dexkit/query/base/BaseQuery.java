package org.luckypray.dexkit.query.base;

/* JADX INFO: compiled from: BaseQuery.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0081\b¢\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$¨\u0006\t"}, m115d2 = {"Lorg/luckypray/dexkit/query/base/BaseQuery;", "Lorg/luckypray/dexkit/query/base/IQuery;", "()V", "build", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "build$dexkit_android_release", "innerBuild", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public abstract class BaseQuery implements org.luckypray.dexkit.query.base.IQuery {
    public BaseQuery() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$innerBuild(org.luckypray.dexkit.query.base.BaseQuery r1, com.google.flatbuffers.FlatBufferBuilder r2) {
            int r0 = r1.innerBuild(r2)
            return r0
    }

    private final int build$dexkit_android_release(com.google.flatbuffers.FlatBufferBuilder r2) {
            r1 = this;
            java.lang.String r0 = "fbb"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = access$innerBuild(r1, r2)
            return r0
    }

    protected abstract int innerBuild(com.google.flatbuffers.FlatBufferBuilder r1);
}
