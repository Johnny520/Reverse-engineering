package p383;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.flatbuffers.C4051;
import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9784 extends AbstractC1298 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m15118(), ((AbstractC9784) obj).m15118());
    }

    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m15118()) {
            i = (i ^ (b & DefaultClassResolver.NAME)) * 16777619;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[] m15118() {
        C4051 c4051 = new C4051();
        mo1741(c4051);
        int i = c4051.f11205;
        int iCapacity = c4051.f11206.capacity() - c4051.f11205;
        if (!c4051.f11209) {
            C6755.m11863("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
            return null;
        }
        byte[] bArr = new byte[iCapacity];
        c4051.f11206.position(i);
        c4051.f11206.get(bArr);
        return bArr;
    }
}
