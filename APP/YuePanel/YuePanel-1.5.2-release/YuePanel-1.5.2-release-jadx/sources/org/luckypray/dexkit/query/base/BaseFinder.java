package org.luckypray.dexkit.query.base;

import Yue.C5499;
import Yue.C7628;
import Yue.C8048;
import Yue.C8064;
import Yue.C8084;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import com.google.flatbuffers.FlatBufferBuilder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0006\u0010\t\u001a\u00020\nJ\r\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, m2699d2 = {"Lorg/luckypray/dexkit/query/base/BaseFinder;", "Lorg/luckypray/dexkit/query/base/BaseMatcher;", "()V", "equals", "", "other", "", "hashCode", "", "hashKey", "", "serializedBytes", "", "serializedBytes$dexkit_android_release", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public abstract class BaseFinder extends BaseMatcher {
    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C5499.m17094(getClass(), obj.getClass())) {
            return false;
        }
        return Arrays.equals(serializedBytes$dexkit_android_release(), ((BaseFinder) obj).serializedBytes$dexkit_android_release());
    }

    public int hashCode() {
        int i = (int) 2166136261L;
        for (byte b : serializedBytes$dexkit_android_release()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }

    @InterfaceC6399
    public final String hashKey() {
        long jM26408 = -3750763034362895579L;
        for (byte b : serializedBytes$dexkit_android_release()) {
            jM26408 = C8064.m26408(C8064.m26408(jM26408 ^ C8064.m26408(((long) C8048.m26193(b)) & 255)) * 1099511628211L);
        }
        return C7628.m24085(C8084.m4123(jM26408, 16), 16, '0');
    }

    public final /* synthetic */ byte[] serializedBytes$dexkit_android_release() {
        FlatBufferBuilder flatBufferBuilder = new FlatBufferBuilder();
        build$dexkit_android_release(flatBufferBuilder);
        byte[] bArrSizedByteArray = flatBufferBuilder.sizedByteArray();
        C5499.m17102(bArrSizedByteArray, "fbb.sizedByteArray()");
        return bArrSizedByteArray;
    }
}
