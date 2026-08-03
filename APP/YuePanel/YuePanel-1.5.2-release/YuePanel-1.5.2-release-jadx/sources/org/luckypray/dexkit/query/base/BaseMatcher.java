package org.luckypray.dexkit.query.base;

import Yue.C5499;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.FlatBufferBuilder;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$¨\u0006\t"}, m2699d2 = {"Lorg/luckypray/dexkit/query/base/BaseMatcher;", "Lorg/luckypray/dexkit/query/base/QueryComponent;", "()V", "build", "", "fbb", "Lcom/google/flatbuffers/FlatBufferBuilder;", "build$dexkit_android_release", "innerBuild", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public abstract class BaseMatcher implements QueryComponent {
    public final /* synthetic */ int build$dexkit_android_release(FlatBufferBuilder flatBufferBuilder) {
        C5499.m17103(flatBufferBuilder, "fbb");
        return innerBuild(flatBufferBuilder);
    }

    public abstract int innerBuild(@InterfaceC6399 FlatBufferBuilder flatBufferBuilder);
}
