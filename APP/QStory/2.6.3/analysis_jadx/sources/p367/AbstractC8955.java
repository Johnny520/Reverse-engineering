package p367;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.flatbuffers.C3219;
import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子兰楪哲世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8955 extends AbstractC0455 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m14559(), ((AbstractC8955) obj).m14559());
    }

    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m14559()) {
            i = (i ^ (b & DefaultClassResolver.NAME)) * 16777619;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final byte[] m14559() {
        C3219 c3219 = new C3219();
        mo1181(c3219);
        int i = c3219.f10860;
        int iCapacity = c3219.f10861.capacity() - c3219.f10860;
        if (!c3219.f10864) {
            C5925.m11304("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
            return null;
        }
        byte[] bArr = new byte[iCapacity];
        c3219.f10861.position(i);
        c3219.f10861.get(bArr);
        return bArr;
    }
}
