package org.luckypray.dexkit.query.base;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$¨\u0006\t"}, d2 = {"Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "()V", "build", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "build$dexkit_android_release", "innerBuild", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseMatcher implements org.luckypray.dexkit.query.base.QueryComponent {
    public BaseMatcher() {
            r0 = this;
            r0.<init>()
            return
    }

    public final /* synthetic */ int build$dexkit_android_release(com.google.flatbuffers.FlatBufferBuilder r2) {
            r1 = this;
            java.lang.String r0 = "fbb"
            Yue.C3329.m13906(r2, r0)
            int r2 = r1.innerBuild(r2)
            return r2
    }

    public abstract int innerBuild(@Yue.InterfaceC4418 com.google.flatbuffers.FlatBufferBuilder r1);
}
