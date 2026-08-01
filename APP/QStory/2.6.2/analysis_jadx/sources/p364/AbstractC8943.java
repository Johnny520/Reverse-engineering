package p364;

import com.bumptech.glide.AbstractC3055;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.flatbuffers.C3218;
import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8943 extends AbstractC3055 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(m14537(), ((AbstractC8943) obj).m14537());
    }

    public final int hashCode() {
        int i = -2128831035;
        for (byte b : m14537()) {
            i = (i ^ (b & DefaultClassResolver.NAME)) * 16777619;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final byte[] m14537() {
        C3218 c3218 = new C3218();
        mo6650(c3218);
        int i = c3218.f10855;
        int iCapacity = c3218.f10856.capacity() - c3218.f10855;
        if (!c3218.f10859) {
            C5919.m11243("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
            return null;
        }
        byte[] bArr = new byte[iCapacity];
        c3218.f10856.position(i);
        c3218.f10856.get(bArr);
        return bArr;
    }
}
