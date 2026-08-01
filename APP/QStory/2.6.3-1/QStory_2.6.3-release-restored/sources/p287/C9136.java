package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9136 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9137 f23264 = new C9137();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9148 f23265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f23266;

    public C9136(C4085 c4085, AbstractC4083 abstractC4083, Class cls) {
        this.f23265 = new C9148(c4085, abstractC4083, cls);
        this.f23266 = cls;
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        if (obj == null) {
            c9073.m14337();
            return;
        }
        c9073.m14332();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f23265.mo7881(c9073, Array.get(obj, i));
        }
        c9073.m14340();
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c9074.m14356();
        while (c9074.m14360()) {
            arrayList.add(this.f23265.f23291.mo7882(c9074));
        }
        c9074.m14363();
        int size = arrayList.size();
        Class cls = this.f23266;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }
}
